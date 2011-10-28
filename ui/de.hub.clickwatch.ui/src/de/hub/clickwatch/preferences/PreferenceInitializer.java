package de.hub.clickwatch.preferences;

import org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer;
import org.eclipse.jface.preference.IPreferenceStore;

import de.hub.clickwatch.ClickWatchModuleUtil.HandlerBehaviour;
import de.hub.clickwatch.main.impl.InjectorProvider.ValueType;
import de.hub.clickwatch.ui.PluginActivator;

/**
 * Class used to initialize default preference values.
 */
public class PreferenceInitializer extends AbstractPreferenceInitializer {

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.eclipse.core.runtime.preferences.AbstractPreferenceInitializer#initializeDefaultPreferences()
	 */
	public void initializeDefaultPreferences() {
		IPreferenceStore store = PluginActivator.getInstance().getPreferenceStore();
		store.setDefault(PreferenceConstants.BIND_TO_PLAYER, false);
		store.setDefault(PreferenceConstants.DEBUG_LEVEL, "2");
		store.setDefault(PreferenceConstants.HANDLER_BEHAVIOUR, HandlerBehaviour.DEFAULT.toString());
		store.setDefault(PreferenceConstants.VALUE_TYPE, ValueType.STRING.toString());
	}

}
