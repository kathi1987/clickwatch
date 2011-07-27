package de.hub.clickwatch;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.adapter.HandlerAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.util.ILogger;

public class AbstractMain {
    protected Injector injector;
	
	public void setUp() {
		ClickWatchStandaloneSetup.doSetup();
		List<Module> modules = new ArrayList<Module>();
		modules.addAll(Arrays.asList(getAdditionalModules()));
		modules.add(createModule());
		injector = Guice.createInjector(modules);
		additionalSetUp();
	}
	
	protected AbstractModule createModule() {
		return new TestModule();
	}
	
	protected class TestModule extends ClickWatchModule {
		@Override
		protected ILogger getLogger() {
			return AbstractMain.this.getLogger();
		}

		@Override
		protected void bindValueAdapter() {
			bind(IValueAdapter.class).to(getValueAdapterClass());
		}

		@Override
		protected void bindClickSocket() {
			bind(IClickSocket.class).to(getClickSocketClass());
		}

		@Override
		protected void bindHandlerAdapter() {
			bind(IHandlerAdapter.class).to(getHandlerAdapterClass());
		}
		
	}
	
	protected ILogger getLogger() {
		return new ILogger() {				
			@Override
			public synchronized void log(int status, String message, Throwable exception) {
				if (getLogLevel() >= status) {				
					System.out.print(DateFormat.getDateTimeInstance().format(new Date()) + " ");
					
					if (status == ILogger.DEBUG) {
						System.out.print("[DEBUG] ");
					} else if (status == ILogger.INFO) {
						System.out.print("[INFO] ");
					} else if (status == ILogger.WARNING) {
						System.out.print("[WARNING] ");
					} else if (status == ILogger.ERROR) {
						System.out.print("[ERROR] ");
					}
					
					System.out.print(message);
					if (exception != null) {
						System.out.println(": " + exception.getMessage());
						exception.printStackTrace();
					}
					System.out.println("");
				}
			}
		};
	}
	
	protected Module[] getAdditionalModules() {
		return new Module[] { new Module() {		
			@Override
			public void configure(Binder binder) {
				AbstractMain.this.configureAnAdditionalModule(binder);
			}
		}};
	}

	protected void configureAnAdditionalModule(Binder binder) {
		
	}
	
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
	}

	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketImpl.class;
	}
	
	protected Class<? extends IHandlerAdapter> getHandlerAdapterClass() {
		return HandlerAdapter.class;
	}

	protected void additionalSetUp() {
		
	}
	
	protected int getLogLevel() {
		return 2;
	}
	
}
