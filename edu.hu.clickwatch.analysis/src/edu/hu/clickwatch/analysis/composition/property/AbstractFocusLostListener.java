package edu.hu.clickwatch.analysis.composition.property;

import org.eclipse.swt.events.FocusEvent;
import org.eclipse.swt.events.FocusListener;

public abstract class AbstractFocusLostListener implements FocusListener {

	@Override
	public void focusGained(FocusEvent e) {
		// empty;
	}

	@Override
	public void focusLost(FocusEvent e) {
		handleFocusLost();
	}
	
	protected abstract void handleFocusLost();

}
