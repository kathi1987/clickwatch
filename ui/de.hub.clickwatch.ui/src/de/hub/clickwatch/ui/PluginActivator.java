package de.hub.clickwatch.ui;

import java.net.URISyntaxException;

import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.preferences.PreferenceConstants;
import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.ClickWatchModule;
import edu.hu.clickwatch.model.IConnectionConfiguration;
import edu.hu.clickwatch.recorder.ClickSocketPlayer;
import edu.hu.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import edu.hu.clickwatch.util.ILogger;

public class PluginActivator extends AbstractUIPlugin {
	
	private static PluginActivator INSTANCE;
	private ClickSocketPlayer player = null;
	private Injector injectorCache = null;
	private boolean bindToPlayerCache = false;
	
	@Override
	public void start(BundleContext context) throws Exception {
		super.start(context);
		INSTANCE = this;
	}
	
	public static PluginActivator getInstance() {
		return INSTANCE;
	}	
	
	public Injector getInjector() {
		IPreferenceStore store = getPreferenceStore();
		final boolean bindToPlayer = store.getBoolean(PreferenceConstants.BIND_TO_PLAYER);
		
		if (bindToPlayerCache != bindToPlayer || injectorCache == null) {
			bindToPlayerCache = bindToPlayer;
			ClickWatchModule clickWatchModule = new ClickWatchModule();
			clickWatchModule.setLogger(new ILogger() {				
				@Override
				public void log(int status, String message, Throwable exception) {
					getLog().log(new Status(status, "de.hub.clickwatch.ui", message, exception));
					if (exception == null) {
						System.out.println(message);
					} else {
						System.out.println(message + ": " + exception.getLocalizedMessage());
						exception.printStackTrace();
					}
				}
			});
			injectorCache = Guice.createInjector(clickWatchModule, new AbstractModule() {				
				@Override
				protected void configure() {
					bind(IConnectionConfiguration.class).to(ConnectionConfiguration.class);
					
					if (bindToPlayer) {
						bindToPlayer();
					}
				}
				
				protected void bindToPlayer() {
					if (player == null) {
						java.net.URI uri = null;
						try {
							uri = getBundle().getEntry("resources/records/record_11-06-23.clickwatchmodel").toURI();
						} catch (URISyntaxException e) {
							e.printStackTrace();
						}
						
						player = new ClickSocketPlayer();
						player.initialize(URI.createURI(uri.toString()));
					}
					
					bind(ClickSocketPlayer.class).toInstance(player);
					bind(IClickSocket.class).to(ClickSocketPlayerSocketImpl.class);
				}
			});
		}
		return injectorCache;
	}
}
