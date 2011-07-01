package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;

import de.hub.clickwatch.model.Node;


public class StartRecord extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (node_it == null) {
			return;
		}
		
		while (node_it.hasNext()) {
			Node node = node_it.next();
			if (node.getConnection() == null || !node.isConnected()) {
				MessageDialog.openError(editor.getSite().getShell(), "Not connected", "You can only record an connected node");
			} else {
				node.setRecording(true);
			}
		}
	}
}