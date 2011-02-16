package edu.hu.clickwatch.tests;

import org.eclipse.ui.IPartListener;

import edu.hu.clickwatch.model.ClickControlNodeConnection;

public class ClickControlNodeConnectionTestImpl extends ClickControlNodeConnection {

	@Override
	protected void runInGUI(Runnable runnable) {
		runnable.run();
	}

	@Override
	protected void runInExtraThread(Runnable runnable) {
		runnable.run();
	}

	@Override
	protected void showMessage(String title, String message) {
		System.out.println("Show Message Called: Title - " + title + "; " + message);
	}

	@Override
	protected void installPartListener(IPartListener listener) {
		// empty
	}

	@Override
	protected void unInstallPartListener(IPartListener listener) {
		// empty
	}

	@Override
	protected void runContinuousUpdate() {
		// empty
	}

	@Override
	protected void sleepUntilNextUpdate() {
		// empty
	}
	
	

}
