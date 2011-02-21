package edu.hu.clickwatch.util;

import java.io.BufferedInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.URL;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.swt.widgets.Shell;

import com.jcraft.jsch.Channel;
import com.jcraft.jsch.ChannelExec;
import com.jcraft.jsch.JSch;
import com.jcraft.jsch.JSchException;
import com.jcraft.jsch.Session;

import edu.hu.clickwatch.ClickWatchPluginActivator;
import sun.security.jca.GetInstance.Instance;

/**
 * Handling of SSH related communication
 *
 * @author zubow
 */
public class SshConnectionFactory {

	private static SshConnectionFactory instance;
	public final static String END_TOKEN = "__ACK__"; 
	
	private SshConnectionFactory() {}
	
	public static SshConnectionFactory getInstance() {
		if (instance == null) {
			instance = new SshConnectionFactory();
		}
		return instance;
	}
	
	/**
	 * First step: create SSH session
	 * @param user
	 * @param host IP address
	 * @return
	 * @throws JSchException
	 * @throws IOException
	 */
	public Session createSession(String user, String host) throws JSchException, IOException {
		JSch jsch = new JSch();
		byte[] prvkey = new byte[0];
		
		URL url = ClickWatchPluginActivator.getInstance().getBundle().getEntry("res/ssh/id_dsa");
		prvkey = readPrivateKeyFromFile(url);
        
		final byte[] emptyPassPhrase = new byte[0]; // Empty passphrase for now, get real passphrase from MyUserInfo

        jsch.addIdentity(
            user,    // String userName
            prvkey,          // byte[] privateKey 
            null,            // byte[] publicKey
            emptyPassPhrase  // byte[] passPhrase
        );

        Session session = jsch.getSession(user, host, 22);

		// username and password will be given via UserInfo interface.
		// dirty hack
		// session.setPassword("testbed");
        url = ClickWatchPluginActivator.getInstance().getBundle().getEntry("res/ssh/known_hosts");
        InputStream is = url.openStream();
		jsch.setKnownHosts(is);
		is.close();
		
		session.connect();
		
		return session;
	}
	
	public void closeSession(Session session) {
		session.disconnect();		
	}
	
	/**
	 * Helper method read key content from file
	 * @param url
	 * @return
	 * @throws IOException
	 */
	private byte[] readPrivateKeyFromFile(URL url) throws IOException {
	    InputStream is = url.openStream();
	    
	    BufferedInputStream bis = new BufferedInputStream(is);
	    ByteArrayOutputStream buf = new ByteArrayOutputStream();
	    int result = bis.read();
	    while(result != -1) {
	      byte b = (byte)result;
	      buf.write(b);
	      result = bis.read();
	    }        

	    byte[] bytes = buf.toByteArray();
	    
	    // Close the input stream and return bytes
	    is.close();
	    return bytes;
	}
	
	/**
	 * SSH handling - copy file to remote host 
	 * @param session SSH session to be used
	 * @param lfile local file name
	 * @param rfile remote file name
	 * @param progressBarMsg String for GUI progress bar
	 * @param shell
	 */
	public void scpTo(Session session, String lfile, String rfile, final String progressBarMsg, final Shell shell) {

		FileInputStream fis = null;
		try {
			fis = new FileInputStream(lfile);
			
			boolean ptimestamp = true;
			// exec 'scp -t rfile' remotely
			String command = "scp " + (ptimestamp ? "-p" :"") + " -t " + rfile;
			Channel channel = session.openChannel("exec");
			((ChannelExec)channel).setCommand(command);

			// get I/O streams for remote scp
			final OutputStream out = channel.getOutputStream();
			InputStream in = channel.getInputStream();

			channel.connect();

			if(checkAck(in) != 0){
				throw new Exception("Copying to remote host failed.");
			}

			File _lfile = new File(lfile);

			if (ptimestamp) {
				command = "T " + (_lfile.lastModified()/1000) + " 0";
				// The access time should be sent here,
				// but it is not accessible with JavaAPI ;-<
				command += (" "+(_lfile.lastModified()/1000)+" 0\n"); 
				out.write(command.getBytes()); 
				out.flush();
				if(checkAck(in) != 0){
					throw new Exception("Copying to remote host failed.");
				}
			}

			// send "C0644 filesize filename", where filename should not include '/'
			final long filesize = _lfile.length();
			command = "C0644 " + filesize + " ";
			if (lfile.lastIndexOf('/') > 0) {
				command += lfile.substring(lfile.lastIndexOf('/')+1);
			} else {
				command += lfile;
			}
			command += "\n";
			out.write(command.getBytes()); 
			out.flush();
			if(checkAck(in) != 0) {
				throw new Exception("Copying to remote host failed.");
			}

			// send a content of lfile

			final FileInputStream ffis = fis;
			ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
			dialog.run(true, true, new IRunnableWithProgress(){
			    public void run(IProgressMonitor monitor) {
			    	try {
						final int totalWork = (int)filesize;
						
						monitor.beginTask(progressBarMsg, totalWork);
						int tx_bytes = 0;
						byte[] buf = new byte[1024];
						while (true) {
							int len = ffis.read(buf, 0, buf.length);
							if(len <= 0) break;
							out.write(buf, 0, len); //out.flush();
							tx_bytes += len;
							monitor.worked(tx_bytes);
						}
				        monitor.done();
			    	} catch(Exception e) {
			    		MessageDialog.openError(shell, "Clickwatch Error", "Exception: " + e.getMessage());	
			    	}
			    }
			});			
			
			fis.close();
			//fis = null;
			// send '\0'
			byte[] buf2 = new byte[10];
			buf2[0] = 0; 
			out.write(buf2, 0, 1); 
			out.flush();
			if(checkAck(in) != 0){
				throw new Exception("Copying to remote host failed.");
			}
			out.close();

			channel.disconnect();
		} catch(Exception e){
			System.out.println(e);
			MessageDialog.openError(shell, "Clickwatch Error", "Exception: " + e.getMessage());
			try {
				if(fis != null) {
					fis.close();
				}
			} catch(Exception ee) {}
		}		
	}

	private static int checkAck(InputStream in) throws IOException{
		int b = in.read();
		// b may be 0 for success,
		//          1 for error,
		//          2 for fatal error,
		//          -1
		if(b == 0) return b;
		if(b == -1) return b;

		if(b == 1 || b == 2) {
			StringBuffer sb = new StringBuffer();
			int c;
			do {
				c = in.read();
				sb.append((char)c);
			}
			while (c != '\n');
			if(b == 1){ // error
				System.out.print(sb.toString());
			}
			if(b == 2){ // fatal error
				System.out.print(sb.toString());
			}
		}
		return b;
	}
	
	/**
	 * SSH handling - execute command on remote host
	 * e.g. command = "set|grep SSH"
	 * @param session
	 * @param command
	 * @param progressBarMsg
	 * @throws Exception
	 * @return remote log messages from STDIN
	 */
	public StringBuffer execRemote(Session session, String command, final String progressBarMsg, final Shell shell) throws Exception {

		final StringBuffer sb = new StringBuffer();
		
		// handling ssh bug on old WGT routers
		command += " ; echo \"" + END_TOKEN + "\"";
		
        final Channel channel = session.openChannel("exec");
        ((ChannelExec)channel).setCommand(command);

        // X Forwarding
        // channel.setXForwarding(true);

        //channel.setInputStream(System.in);
        channel.setInputStream(null);

        //channel.setOutputStream(System.out);

        //FileOutputStream fos=new FileOutputStream("/tmp/stderr");
        //((ChannelExec)channel).setErrStream(fos);
        ((ChannelExec)channel).setErrStream(System.err);

        final InputStream in = channel.getInputStream();
        channel.connect();

		ProgressMonitorDialog dialog = new ProgressMonitorDialog(shell);
		dialog.run(true, true, new IRunnableWithProgress(){
		    public void run(IProgressMonitor monitor) {
		    	try {
	    			monitor.beginTask(progressBarMsg, 10);

			        byte[] tmp = new byte[1024];
			        String oldChunk = "";
			        while (true) {
			          while (in.available() > 0) {
			            int i = in.read(tmp, 0, 1024);
			            if(i < 0) break;
			            String ret = new String(tmp, 0, i);
			            sb.append(ret);
			            if ((oldChunk + ret).indexOf(END_TOKEN) > -1) {
			            	channel.disconnect();
			            	break;
			            }
			            oldChunk = ret;
			          }
			          if (channel.isClosed()) {
					    monitor.done();
					    System.out.println("Exit-status: " + channel.getExitStatus());
			            break;
			          }
			          try {
			            Thread.sleep(1000);
			          } catch (Exception ee) {}
			        }
					//monitor.worked(++chunks);
		    	} catch(Exception e) {
		    		MessageDialog.openError(shell, "Clickwatch Error", "Exception: " + e.getMessage());	
		    	}
		    }
		});
		
		in.close();
        channel.disconnect();

	    // remove TOKEN
        String res = sb.toString();
        res = res.replaceAll(END_TOKEN, "");
        return new StringBuffer(res);
      }
	
	/**
	 * No progressbar ...
	 */
	public StringBuffer execSilentRemote(Session session, String command) throws Exception {

		final StringBuffer sb = new StringBuffer();
		
		// handling ssh bug on old WGT routers
		command += " ; echo \"" + END_TOKEN + "\"";
		
        final Channel channel = session.openChannel("exec");
        ((ChannelExec)channel).setCommand(command);

        // X Forwarding
        // channel.setXForwarding(true);

        //channel.setInputStream(System.in);
        channel.setInputStream(null);

        //channel.setOutputStream(System.out);

        //FileOutputStream fos=new FileOutputStream("/tmp/stderr");
        //((ChannelExec)channel).setErrStream(fos);
        ((ChannelExec)channel).setErrStream(System.err);

        final InputStream in = channel.getInputStream();
        channel.connect();

    	try {
	        byte[] tmp = new byte[1024];
	        String oldChunk = "";
	        while (true) {
	          while (in.available() > 0) {
	            int i = in.read(tmp, 0, 1024);
	            if(i < 0) break;
	            String ret = new String(tmp, 0, i);
	            sb.append(ret);
	            if ((oldChunk + ret).indexOf(END_TOKEN) > -1) {
	            	channel.disconnect();
	            	break;
	            }
	            oldChunk = ret;
	          }
	          if (channel.isClosed()) {
			    System.out.println("Exit-status: " + channel.getExitStatus());
	            break;
	          }
	          try {
	            Thread.sleep(1000);
	          } catch (Exception ee) {}
	        }
			//monitor.worked(++chunks);
    	} catch(Exception e) {
    		System.err.println("Exception: " + e.getMessage());
    		//MessageDialog.openError(shell, "Clickwatch Error", "Exception: " + e.getMessage());	
    	}
		
		in.close();
        channel.disconnect();

	    // remove TOKEN
        String res = sb.toString();
        res = res.replaceAll(END_TOKEN, "");
        return new StringBuffer(res);
      }	
}
