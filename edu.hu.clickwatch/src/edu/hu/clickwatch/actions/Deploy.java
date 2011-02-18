package edu.hu.clickwatch.actions;

import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.lang.reflect.InvocationTargetException;
import java.net.URL;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Guice;
import com.jcraft.jsch.*;

import edu.hu.clickwatch.ClickWatchPluginActivator;
import edu.hu.clickwatch.GuiceModule;
import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.ClickControlNodeConnection;
import edu.hu.clickwatch.model.MultiNode;
import edu.hu.clickwatch.model.MultiNodeNodeConnection;
import edu.hu.clickwatch.model.Node;

/**
 * Deploy a new Click configuration to remote nodes via ssh.
 * @author zubow
 */
public class Deploy implements IObjectActionDelegate {

	private Shell shell;
	private IEditorPart editor = null;
	private List<Node> node_lst;

	/**
	 * Constructor for Action1.
	 */
	public Deploy() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		if (targetPart instanceof IEditorPart) {
			editor = (IEditorPart)targetPart;
			shell = targetPart.getSite().getShell();
		}
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		if (node_lst == null || node_lst.isEmpty()) {
			return;
		}
		
		// select resource for deployment
		FileDialog fd = new FileDialog(shell, SWT.OPEN);
        fd.setText("Open");
        String[] filterExt = { "*.bz2", "*.tar", "*.gz", "*.zip", "*.dat", "*.*" };
        fd.setFilterExtensions(filterExt);
        String lfile = fd.open();
        
        if (lfile == null) {
        	return;
        }

        Iterator<Node> node_it = node_lst.iterator();
		//
        // Step 1: prepare, copy and unpack router conf
		while (node_it.hasNext()) {
			Node node = node_it.next();

			// disconnect if connected
			if (node.getConnection() != null) {
				AbstractNodeConnection oldConnection = (AbstractNodeConnection)node.getConnection();
				node.setConnection(null);
				oldConnection.disconnect();
			}
			
			// remote deploy
			System.out.println("deploying on node " + node.getINetAdress() + " called.");
			try {
				deployRemote(node.getINetAdress(), lfile);
			} catch (Exception e) {
				System.err.println("ErrorMsg:" + e.getMessage());
				MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e.getMessage());			}
		}

        node_it = node_lst.iterator();
		//
        // Step 2: start router conf
		while (node_it.hasNext()) {
			Node node = node_it.next();

			// remote deploy
			System.out.println("starting on node " + node.getINetAdress() + " called.");
			try {
				startRemote(node.getINetAdress());
			} catch (Exception e) {
				System.err.println("ErrorMsg:" + e.getMessage());
				MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e.getMessage());			}
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@Override
	@SuppressWarnings("unchecked")
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			IStructuredSelection sec = ((IStructuredSelection)selection);
			node_lst = sec.toList();
		} catch (Exception e) {
			MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e.getMessage());
		}
	}

	private void deployRemote(String host, String lfile) throws JSchException, IOException, InvocationTargetException, InterruptedException {
		
		// init ssh
		String user = "root";
		Session session = initSsh(user, host);

		// clean-up old
		String command = "rm -rf /tmp/seismo";
		execRemote("Cleanup router conf on node " + host, session, command);

		// copy resource file to remote
		//String lfile = "/tmp/resource.tar.gz";
		String rfile = "/tmp/" + (new File(lfile)).getName();
		
		// copy file
		scpTo("Uploading router conf on node " + host, session, lfile, rfile);
		
		// unpack
		command = "(cd /tmp/; bzcat seismo.tar.bz2 | tar xvf - )";
		execRemote("Unpacking router conf on node " + host, session, command);
		
		// close session
		session.disconnect();
	}
	
	private void startRemote(String host) throws JSchException, IOException, InvocationTargetException, InterruptedException {
		
		// init ssh
		String user = "root";
		Session session = initSsh(user, host);

		// start
		String command = "(cd /tmp/seismo; ./bin/seismo.sh delaystart )";
		execRemote("Starting router conf on node " + host, session, command);

		// close session
		session.disconnect();
	}	
	
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

	///////////////////
	// SSH handling - init ssh
	private Session initSsh(String user, String host) throws JSchException, IOException {
		JSch jsch = new JSch();
		byte[] prvkey = new byte[0];
		
		try {
			URL url = ClickWatchPluginActivator.getInstance().getBundle().getEntry("res/ssh/id_dsa");
			prvkey = readPrivateKeyFromFile(url);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} // Private key must be byte array
        
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
        URL url = ClickWatchPluginActivator.getInstance().getBundle().getEntry("res/ssh/known_hosts");
        InputStream is = url.openStream();
		jsch.setKnownHosts(is);
		is.close();
		
		session.connect();
		
		return session;
	}
	
	///////////////////
	// SSH handling - copy file to remote host
	private void scpTo(final String progressBarMsg, Session session, String lfile, String rfile) {

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
			    		MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "Exception: " + e.getMessage());	
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
			
			//session.disconnect();

		} catch(Exception e){
			System.out.println(e);
			MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "Exception: " + e.getMessage());
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
	
	///////////////////
	// SSH handling - execute command on remote host
	// e.g. command = "set|grep SSH"
	private void execRemote(final String progressBarMsg, Session session, String command) throws JSchException, IOException, InvocationTargetException, InterruptedException {

		// hack: ssh bug
		final String END_TOKEN = "ACKNOWLEDGEMENT4711"; 
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
			            System.out.print(ret);
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
		    		MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "Exception: " + e.getMessage());	
		    	}
		    }
		});
			
		
		in.close();
        channel.disconnect();
        //session.disconnect();
      }
}
