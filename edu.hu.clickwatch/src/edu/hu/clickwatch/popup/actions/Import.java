package edu.hu.clickwatch.popup.actions;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionDelegate;
import org.eclipse.ui.IFileEditorInput;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.PlatformUI;

import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;

public class Import implements IObjectActionDelegate {
	
	public final static String PORT = "7777";

	private Shell shell;
	private Network network;

	/**
	 * Constructor for Action1.
	 */
	public Import() {
		super();
	}

	/**
	 * @see IObjectActionDelegate#setActivePart(IAction, IWorkbenchPart)
	 */
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}

	/**
	 * @see IActionDelegate#run(IAction)
	 */
	public void run(IAction action) {
		if (network == null) {
			return;
		}

		// clear old node entries
		network.getNodes().clear();
		
		// import new nodes from file
		List<String> node_lst = new ArrayList<String>();

		try {
			IFileEditorInput ctx = (IFileEditorInput) PlatformUI.getWorkbench()
					.getActiveWorkbenchWindow().getActivePage()
					.getActiveEditor().getEditorInput();
			IFile aFile = ctx.getFile().getProject().getFile("nodes.import");

			BufferedReader input = new BufferedReader(new InputStreamReader(
					aFile.getContents()));
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

		for (Iterator iterator = node_lst.iterator(); iterator.hasNext();) {
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
