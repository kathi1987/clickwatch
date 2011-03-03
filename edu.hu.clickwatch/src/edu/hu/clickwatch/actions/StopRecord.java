package edu.hu.clickwatch.actions;

import org.eclipse.jface.action.IAction;

import edu.hu.clickwatch.model.Node;

public class StopRecord extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (node_it == null) {
			return;
		}

		while (node_it.hasNext()) {
			Node node = node_it.next();
			if (!node.isRecording()) {
//				MessageDialog.openError(editor.getSite().getShell(),
//						"Not recording", "You can only stop an recording node");
			} else {
				node.setRecording(false);
			}
		}
	}
}