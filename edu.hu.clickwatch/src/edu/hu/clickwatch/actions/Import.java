package edu.hu.clickwatch.actions;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.FileDialog;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;

import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;

/**
 * Import a list of nodes from external file
 * 
 * @author zubow
 */
public class Import implements IObjectActionDelegate {
	
	public final static String PORT = "7777";

	private Shell shell;
	private Network network;

	public Import() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	@Override
	public void run(IAction action) {
		if (network == null) {
			return;
		}
		
		FileDialog fd = new FileDialog(shell, SWT.OPEN);
        fd.setText("Open");
        String[] filterExt = { "*.txt", "*.*" };
        fd.setFilterExtensions(filterExt);
        String fileName = fd.open();
        
        if (fileName == null) {
        	return;
        }
        
		// clear old node entries
		network.getNodes().clear();
		
		// import new nodes from file
		List<String> node_lst = new ArrayList<String>();

		try {
			File file = new File(fileName);
			BufferedReader input = new BufferedReader(new FileReader(file));
			
			try {
				String line = null;
				while ((line = input.readLine()) != null) {
					node_lst.add(line);
				}
			} finally {
				input.close();
			}
		} catch (Exception ex) {
			ex.printStackTrace();
		}

		for (Iterator<String> iterator = node_lst.iterator(); iterator.hasNext();) {
			String string = (String) iterator.next();
			Node node = ClickWatchModelFactory.eINSTANCE.createNode();
			node.setINetAdress(string);
			node.setPort(PORT);
			network.getNodes().add(node);
		}
	}

	/**
	 * @see IActionDelegate#selectionChanged(IAction, ISelection)
	 */
	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			network = (Network) ((IStructuredSelection) selection)
					.getFirstElement();
		} catch (Exception e) {
			MessageDialog.openError(shell, "Clickwatch Error",
					"You can only call this action on a single Node");
			// TODO
		}
	}

}
