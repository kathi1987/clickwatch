package de.hub.clickwatch.tests;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

import org.junit.Before;

import com.google.inject.AbstractModule;
import com.google.inject.Binder;
import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;
import com.google.inject.name.Names;

import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.connection.adapter.IPullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.PullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.util.ILogger;

public class AbstractTest {

	protected Injector injector;

	@Before
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
			return AbstractTest.this.getLogger();
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
			configureHandlerAdapter(binder());
		}

	}

	protected ILogger getLogger() {
		return new ILogger() {
			@Override
			public synchronized void log(int status, String message,
					Throwable exception) {
				if (getLogLevel() >= status) {
					System.out.print(DateFormat.getDateTimeInstance().format(
							new Date())
							+ " ");

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
				AbstractTest.this.configureAnAdditionalModule(binder);
			}
		} };
	}

	protected void configureAnAdditionalModule(Binder binder) {

	}

	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
	}

	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketImpl.class;
	}

	protected void configureHandlerAdapter(Binder binder) {
		binder.bind(IPullHandlerAdapter.class).to(getHandlerAdapterClass());
		binder.bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(false);
		binder.bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(false);
		binder.bind(Integer.class).annotatedWith(Names.named(ClickWatchModule.I_COMPOUND_HANDLER_SAMPLE_TIME)).toInstance(1000);
		binder.bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_COMPRESSION)).toInstance(false);
	}

	protected Class<? extends IPullHandlerAdapter> getHandlerAdapterClass() {
		return PullHandlerAdapter.class;
	}

	protected void additionalSetUp() {

	}

	protected int getLogLevel() {
		return 2;
	}

}
