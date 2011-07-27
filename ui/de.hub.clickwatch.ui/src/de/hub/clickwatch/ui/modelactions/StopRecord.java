package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;

import de.hub.clickwatch.model.Node;


public class StopRecord extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (selectedObjectsIterator == null) {
			return;
		}

		while (selectedObjectsIterator.hasNext()) {
			Node node = selectedObjectsIterator.next();
			if (!node.isRecording()) {
//				MessageDialog.openError(editor.getSite().getShell(),
//						"Not recording", "You can only stop an recording node");
			} else {
				node.setRecording(false);
			}
		}
	}
}