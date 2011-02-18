package edu.hu.clickwatch.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.OutputStream;
import java.util.Iterator;

import org.eclipse.core.resources.IFile;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import com.google.inject.Guice;
import com.jcraft.jsch.*;

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

	private IEditorPart editor = null;
	private Iterator<Node> node_it;

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
		}
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		if (node_it == null) {
			return;
		}

		//AbstractNodeConnection nodeConnection = null;
		while (node_it.hasNext()) {
			Node node = node_it.next();

			// disconnect if connected
			if (node.getConnection() != null) {
				AbstractNodeConnection oldConnection = (AbstractNodeConnection)node.getConnection();
				node.setConnection(null);
				oldConnection.disconnect();
			}
			
			// remote deploy
			System.out.println("deploy for node " + node.getINetAdress() + " called.");
			try {
				deployRemote(node.getINetAdress());
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
			node_it = sec.iterator();
		} catch (Exception e) {
			MessageDialog.openError(editor.getSite().getShell(), "Clickwatch Error", "ErrorMsg:" + e.getMessage());
		}
	}

	private void deployRemote(String host) throws JSchException, IOException {
		// init ssh
		String user = "root"; //"testbed";
		//String host = "192.168.4.117";
		Session session = initSsh(user, host);
		
		// copy resource file to remote
		String lfile = "/tmp/resource.tar.gz";
		String rfile = lfile;
		
		// copy file
		scpTo(session, lfile, rfile);
		// execute remote commands
		String command = "set|grep SSH";
		execRemote(session, command);
		
		// close session
		session.disconnect();
	}
	
	private byte[] readPrivateKeyFromFile(String path) throws IOException {
		File file = new File(path);
	    InputStream is = new FileInputStream(file);

	    // Get the size of the file
	    long length = file.length();

	    // You cannot create an array using a long type.
	    // It needs to be an int type.
	    // Before converting to an int type, check
	    // to ensure that file is not larger than Integer.MAX_VALUE.
	    if (length > Integer.MAX_VALUE) {
	        // File is too large
	    }

	    // Create the byte array to hold the data
	    byte[] bytes = new byte[(int)length];

	    // Read in the bytes
	    int offset = 0;
	    int numRead = 0;
	    while (offset < bytes.length
	           && (numRead=is.read(bytes, offset, bytes.length-offset)) >= 0) {
	        offset += numRead;
	    }

	    // Ensure all the bytes have been read in
	    if (offset < bytes.length) {
	        throw new IOException("Could not completely read file "+file.getName());
	    }

	    // Close the input stream and return bytes
	    is.close();
	    return bytes;
	}

	///////////////////
	// SSH handling - init ssh
	private Session initSsh(String user, String host) throws JSchException {
		JSch jsch = new JSch();
		byte[] prvkey = new byte[0];
		
		try {
			prvkey = readPrivateKeyFromFile("id_dsa");
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
		jsch.setKnownHosts("known_hosts");
		session.connect();
		
		return session;
	}
	
	///////////////////
	// SSH handling - copy file to remote host
	private void scpTo(Session session, String lfile, String rfile) {

		FileInputStream fis = null;
		try {
			boolean ptimestamp = true;
			// exec 'scp -t rfile' remotely
			String command = "scp " + (ptimestamp ? "-p" :"") + " -t " + rfile;
			Channel channel = session.openChannel("exec");
			((ChannelExec)channel).setCommand(command);

			// get I/O streams for remote scp
			OutputStream out = channel.getOutputStream();
			InputStream in = channel.getInputStream();

			channel.connect();

			if(checkAck(in)!=0){
				System.exit(0);
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
					System.exit(0);
				}
			}

			// send "C0644 filesize filename", where filename should not include '/'
			long filesize = _lfile.length();
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
				System.exit(0);
			}

			// send a content of lfile
			fis = new FileInputStream(lfile);
			byte[] buf = new byte[1024];
			while (true) {
				int len = fis.read(buf, 0, buf.length);
				if(len <= 0) break;
				out.write(buf, 0, len); //out.flush();
			}
			fis.close();
			fis = null;
			// send '\0'
			buf[0] = 0; 
			out.write(buf, 0, 1); 
			out.flush();
			if(checkAck(in) != 0){
				System.exit(0);
			}
			out.close();

			channel.disconnect();
			//session.disconnect();

		} catch(Exception e){
			System.out.println(e);
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
	private void execRemote(Session session, String command) throws JSchException, IOException {

        Channel channel = session.openChannel("exec");
        ((ChannelExec)channel).setCommand(command);

        // X Forwarding
        // channel.setXForwarding(true);

        //channel.setInputStream(System.in);
        channel.setInputStream(null);

        //channel.setOutputStream(System.out);

        //FileOutputStream fos=new FileOutputStream("/tmp/stderr");
        //((ChannelExec)channel).setErrStream(fos);
        ((ChannelExec)channel).setErrStream(System.err);

        InputStream in = channel.getInputStream();

        channel.connect();

        byte[] tmp = new byte[1024];
        while (true) {
          while(in.available() > 0) {
            int i = in.read(tmp, 0, 1024);
            if(i < 0) break;
            System.out.print(new String(tmp, 0, i));
          }
          if (channel.isClosed()) {
            System.out.println("exit-status: " + channel.getExitStatus());
            break;
          }
          try {
        	  Thread.sleep(1000);
          } catch (Exception ee) {}
        }
        channel.disconnect();
        //session.disconnect();
      }
}
