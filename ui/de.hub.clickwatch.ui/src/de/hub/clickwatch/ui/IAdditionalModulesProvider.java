package de.hub.clickwatch.ui;

import com.google.inject.Module;

public interface IAdditionalModulesProvider {

	public Module[] getAdditionalModules();
}
