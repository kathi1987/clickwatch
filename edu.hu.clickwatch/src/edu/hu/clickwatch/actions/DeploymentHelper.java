package edu.hu.clickwatch.actions;

import java.io.File;

import org.eclipse.swt.widgets.Shell;

import com.jcraft.jsch.Session;

import edu.hu.clickwatch.util.SshConnectionFactory;

public class DeploymentHelper {

	public final static String SSH_USER = "root";

	private static DeploymentHelper instance;
	
	private DeploymentHelper() {}
	
	public static DeploymentHelper getInstance() {
		if (instance == null) {
			instance = new DeploymentHelper();
		}
		return instance;
	}
	
	/**
	 * Remote deployment: clean-up, copy and unpack router conf
	 */
	public String deployRemote(String host, String lfile, String md5cs, Shell shell, boolean showProgressbar) throws Exception {
		
		StringBuffer results = new StringBuffer();
		// init ssh
		Session session = SshConnectionFactory.getInstance().createSession(SSH_USER, host);

		String lFileUnqualified = (new File(lfile)).getName();
		String rfile = "/tmp/" + lFileUnqualified;
		
		// clean-up old
		long startTime = System.currentTimeMillis();
		String command = "rm -rf /tmp/seismo; md5sum " + rfile + " | awk '{ print $1 }'";
		StringBuffer logMsg = null;
		if (showProgressbar) {
			logMsg = SshConnectionFactory.getInstance().execRemoteGUI(session, command, "Cleanup router conf on node " + host, shell);
		} else {
			logMsg = SshConnectionFactory.getInstance().execRemote(session, command);
		}
		log2Sout(logMsg.append("\n").append("Clean-up executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));
		results.append(logMsg);
		
		// compare checksum
		if (logMsg.toString().indexOf(md5cs) > -1) {
			String msg = "There is already a file with the same MD5 checksum; skip copying ... ";
			System.out.println(msg);
			results.append("\n").append(msg).append("\n");
		} else {
			// copy resource file to remote
			startTime = System.currentTimeMillis();
			if (showProgressbar) {
				SshConnectionFactory.getInstance().scpToGUI(session, lfile, rfile, "Uploading router conf on node " + host, shell);
			} else {
				SshConnectionFactory.getInstance().scpTo(session, lfile, rfile);
			}
			String msg = "Copy file executed in " + ((System.currentTimeMillis() - startTime) / 1000) + " sec";
			System.out.println(msg);
			results.append("\n").append(msg).append("\n");
		}
		
		// unpack
		startTime = System.currentTimeMillis();
		command = "(cd /tmp/; bzcat " + lFileUnqualified + " | tar xvf - )";
		if (showProgressbar) {
			logMsg = SshConnectionFactory.getInstance().execRemoteGUI(session, command, "Unpacking router conf on node " + host, shell);
		} else {
			logMsg = SshConnectionFactory.getInstance().execRemote(session, command);
		}
		log2Sout(logMsg.append("\n").append("Unpacking executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));
		results.append("\n").append(logMsg).append("\n");
		
		// close session
		SshConnectionFactory.getInstance().closeSession(session);
		results.append("closing session.\n");
		return results.toString();
	}
	
	/**
	 * Start router configuration
	 */
	public String startRemote(String host, Shell shell, boolean showProgressbar) throws Exception {
		
		// init ssh
		Session session = SshConnectionFactory.getInstance().createSession(SSH_USER, host);

		// start
		long startTime = System.currentTimeMillis();
		String command = "(cd /tmp/seismo; ./bin/seismo.sh delaystart )";
		StringBuffer logMsg = null;
		if (showProgressbar) {
			logMsg = SshConnectionFactory.getInstance().execRemoteGUI(session, command, "Starting router conf on node " + host, shell);
		} else {
			logMsg = SshConnectionFactory.getInstance().execRemote(session, command);
		}
		log2Sout(logMsg.append("\n").append("Starting executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));
		
		// check log file after sleeping for 5 seconds
		startTime = System.currentTimeMillis();
		command = "(sleep 5; cd /tmp; cat seismo_brn.log )";
		if (showProgressbar) {
			logMsg = SshConnectionFactory.getInstance().execRemoteGUI(session, command, "Fetching log file from node " + host, shell);
		} else {
			logMsg = SshConnectionFactory.getInstance().execRemote(session, command);
		}
		String logstr = logMsg.toString();
		log2Sout(logMsg.append("\n").append("Fetching log-file executed in ").append((System.currentTimeMillis() - startTime) / 1000).append(" sec"));

		// close session
		SshConnectionFactory.getInstance().closeSession(session);
		return logstr;
	}
	
	private void log2Sout(StringBuffer sb) {
		System.out.println(sb.toString());
	}
}
