package edu.hu.clickwatch.actions;

import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import com.jcraft.jsch.Session;

import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.util.SshConnectionFactory;

/**
 * Reboot a network node via ssh.
 * @author zubow
 */
public class Reboot implements IObjectActionDelegate {

	public final static String SSH_USER = "root";
	
	private Shell shell;
	private IEditorPart editor = null;
	private List<Node> node_lst;

	/**
	 * Constructor for Action1.
	 */
	public Reboot() {
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
		
        Iterator<Node> node_it = node_lst.iterator();
		//
        // disconnect if connected & reboot node
		while (node_it.hasNext()) {
			Node node = node_it.next();

			// disconnect if connected
			if (node.getConnection() != null) {
				AbstractNodeConnection oldConnection = (AbstractNodeConnection)node.getConnection();
				node.setConnection(null);
				oldConnection.disconnect();
			}
			
			// remote deploy
			System.out.println("reboot on node " + node.getINetAdress() + " called.");
			try {
				rebootRemote(node.getINetAdress());
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

	private void rebootRemote(String host) throws Exception {
		
		// init ssh
		Session session = SshConnectionFactory.getInstance().createSession(SSH_USER, host);

		// clean-up old
		String command = "reboot";
		StringBuffer logMsg = SshConnectionFactory.getInstance().execRemote(session, command, "Rebooting node " + host, shell);
		log2Sout(logMsg);
		
		// close session
		SshConnectionFactory.getInstance().closeSession(session);
	}
	
	private void log2Sout(StringBuffer sb) {
		System.out.println(sb.toString());
	}
}
