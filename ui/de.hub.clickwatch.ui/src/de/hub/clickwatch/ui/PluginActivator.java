package de.hub.clickwatch.ui;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.util.URI;
import org.eclipse.jface.preference.IPreferenceStore;
import org.eclipse.ui.plugin.AbstractUIPlugin;
import org.osgi.framework.BundleContext;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.Module;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.ClickWatchModuleUtil.ClickWatchModuleBuilder;
import de.hub.clickwatch.ClickWatchModuleUtil.HandlerBehaviour;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.connection.adapter.values.XmlValueAdapter;
import de.hub.clickwatch.main.impl.InjectorProvider.ValueType;
import de.hub.clickwatch.preferences.PreferenceConstants;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.util.Throwables;

public class PluginActivator extends AbstractUIPlugin {

	private static PluginActivator INSTANCE;
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
		final boolean bindToPlayer = store
				.getBoolean(PreferenceConstants.BIND_TO_PLAYER);
		final Integer debugLvl = Integer.parseInt(store
				.getString(PreferenceConstants.DEBUG_LEVEL));
		final HandlerBehaviour handlerBehav = HandlerBehaviour.valueOf(store
				.getString(PreferenceConstants.HANDLER_BEHAVIOUR));
		final ValueType valType = ValueType.valueOf(store
				.getString(PreferenceConstants.VALUE_TYPE));

		if (bindToPlayerCache != bindToPlayer || injectorCache == null) {
			bindToPlayerCache = bindToPlayer;
			
			ClickWatchModuleBuilder builder = ClickWatchModuleUtil.newBuilder()
					.wDebugLvl(debugLvl)
					.wHandlerBhvr(handlerBehav, 1000, 2000);
			if (valType == ValueType.XML) {
				builder.wValueAdapterClass(XmlValueAdapter.class);
			} else if (valType == ValueType.STRING) {
				builder.wValueAdapterClass(StringValueAdapter.class);
			} else if (valType == ValueType.SPECIFIC) {
				builder.wValueAdapterClass(BrnValueAdapter.class);
			} else {
				builder.wValueAdapterClass(XmlValueAdapter.class);
			}
			if (bindToPlayer) {
				try {
					URI uri = URI.createURI(de.hub.clickwatch.ui.PluginActivator.getInstance()
							.getBundle().getEntry("resources/records/record_11-06-23.clickwatchmodel")
							.toURI().toString());
					builder.wRecord(uri);
				} catch (Exception e) {
					Throwables.propagate(e);
				}
			}
			ClickWatchModule clickWatchModule = builder.build();
			
			List<Module> modules = new ArrayList<Module>();
			modules.add(clickWatchModule);
			modules.addAll(getAdditionalModules());
			injectorCache = Guice.createInjector(modules
					.toArray(new Module[] {}));
		}
		return injectorCache;
	}

	private List<Module> getAdditionalModules() {
		List<Module> result = new ArrayList<Module>();
		IConfigurationElement[] config = Platform.getExtensionRegistry()
				.getConfigurationElementsFor(
						"de.hub.clickwatch.ui.AdditionalModules");
		try {
			for (IConfigurationElement e : config) {
				final Object o = e.createExecutableExtension("class");
				if (o instanceof IAdditionalModulesProvider) {
					IAdditionalModulesProvider additionalModulesProvider = (IAdditionalModulesProvider) o;
					result.addAll(Arrays.asList(additionalModulesProvider
							.getAdditionalModules()));
				}
			}
		} catch (CoreException e) {
			Throwables.propagate(e);
		}
		return result;
	}
}
