package de.hub.clickwatch.ui;

import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.preferences.PreferenceConstants;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

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
			ClickWatchModule clickWatchModule = new ClickWatchUIModule() {
				@Override
				protected void bindClickSocket() {
					if (bindToPlayer) {
						bindToPlayer();
					} else {
						bind(IClickSocket.class).to(ClickSocketImpl.class);
					}
				}
				
				private void bindToPlayer() {
					if (player == null) {
						java.net.URI uri = null;
						try {
							uri = de.hub.clickwatch.ui.PluginActivator.getInstance().getBundle().getEntry("resources/records/record_11-06-23.clickwatchmodel").toURI();
						} catch (URISyntaxException e) {
							e.printStackTrace();
						}
						
						player = new ClickSocketPlayer();
						player.initialize(URI.createURI(uri.toString()));
					}
					
					bind(ClickSocketPlayer.class).toInstance(player);
					bind(IClickSocket.class).to(ClickSocketPlayerSocketImpl.class);
				}
				
			};
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
			
			List<Module> modules = new ArrayList<Module>();
			modules.add(clickWatchModule);
			modules.addAll(getAdditionalModules());			
			injectorCache = Guice.createInjector(modules.toArray(new Module[]{}));
		}
		return injectorCache;
	}
	
	private List<Module> getAdditionalModules() {
		List<Module> result = new ArrayList<Module>();
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor("de.hub.clickwatch.ui.AdditionalModules");
		try {
			for (IConfigurationElement e : config) {
				final Object o = e.createExecutableExtension("class");
				if (o instanceof IAdditionalModulesProvider) {
					IAdditionalModulesProvider additionalModulesProvider = (IAdditionalModulesProvider)o;
					result.addAll(Arrays.asList(additionalModulesProvider.getAdditionalModules()));
				}
			}
		} catch (CoreException e) {
			Throwables.propagate(e);
		}
		return result;
	}
}
