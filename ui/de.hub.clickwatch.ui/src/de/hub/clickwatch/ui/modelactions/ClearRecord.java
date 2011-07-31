package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;

import de.hub.clickwatch.model.Node;


public class ClearRecord extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (selectedObjectsIterator == null) {
			return;
		}
		
		while (selectedObjectsIterator.hasNext()) {
			Node node = selectedObjectsIterator.next();
			if (node.isRecording()) {
				continue;
			}
			node.setHasRecord(false);
		}
	}
}