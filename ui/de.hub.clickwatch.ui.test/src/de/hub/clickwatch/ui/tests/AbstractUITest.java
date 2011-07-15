package de.hub.clickwatch.ui.tests;

import org.junit.Assert;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.tests.AbstractTest;
import de.hub.clickwatch.ui.ClickWatchUIModule;
import de.hub.clickwatch.ui.util.IUIContext;
import de.hub.clickwatch.util.ILogger;

public class AbstractUITest extends AbstractTest {
	
	private int runs = 0;

	@Override
	protected void additionalSetUp() {
		super.additionalSetUp();
		runs = 0;
	}

	protected AbstractModule createModule() {
		return new UITestModule();
	}
	
	protected class UITestModule extends ClickWatchUIModule {
		@Override
		protected ILogger getLogger() {
			return AbstractUITest.this.getLogger();
		}

		@Override
		protected void bindClickSocket() {
			bind(IClickSocket.class).to(getClickSocketClass());
		}

		@Override
		protected void bindUiContext() {
			bind(IUIContext.class).toInstance(new IUIContext() {			
				@Override
				public void runInGUI(Runnable runnable) {
					runnable.run();
					runBetweenThreads(runs++);
				}
				
				@Override
				public void runInExtraThread(Runnable runnable) {
					runnable.run();
					runBetweenThreads(runs++);
				}
				
				@Override
				public void openWarning(String title, String message) {
					Assert.assertTrue(message, false);
				}
				
				@Override
				public void openError(String title, String message) {
					Assert.assertTrue(message, false);
				}
				
				@Override
				public <T> T getAdapter(Class<T> adapterClass) {
					return null;
				}
			});
		}

		@Override
		protected void bindUpdateInterval() {
			bind(int.class).annotatedWith(Names.named(DEFAULT_UPDATE_INTERVAL)).toInstance(getDefaultUpdateInterval());
		}		
	}
	
	protected void runBetweenThreads(int run) {
		// emtpy
	}
	
	protected int getDefaultUpdateInterval() {
		return 100;
	}
}
