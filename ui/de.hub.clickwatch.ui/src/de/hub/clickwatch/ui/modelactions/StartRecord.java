package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.MessageDialog;

import de.hub.clickwatch.model.Node;


public class StartRecord extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (selectedObjectsIterator == null) {
			return;
		}
		
		while (selectedObjectsIterator.hasNext()) {
			Node node = selectedObjectsIterator.next();
			if (node.getConnection() == null || !node.isListening()) {
				MessageDialog.openError(editor.getSite().getShell(), "Not connected", "You can only record an connected node");
			} else {
				node.setRecording(true);
			}
		}
	}
}