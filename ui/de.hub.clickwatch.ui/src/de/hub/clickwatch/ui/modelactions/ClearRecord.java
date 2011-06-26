package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;

import edu.hu.clickwatch.actions.AbstractNodeAction;
import edu.hu.clickwatch.model.Node;

public class ClearRecord extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (node_it == null) {
			return;
		}
		
		while (node_it.hasNext()) {
			Node node = node_it.next();
			if (node.isRecording()) {
				continue;
			}
			node.setHasRecord(false);
		}
	}
}