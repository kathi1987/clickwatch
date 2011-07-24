package de.hub.clickwatch.recorder.ui;

import com.google.inject.Module;

import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.ui.IAdditionalModulesProvider;

public class CWRecorderAdditionalModulesProvider implements
		IAdditionalModulesProvider {

	@Override
	public Module[] getAdditionalModules() {
		return new Module[] { new CWRecorderModule() };
	}

}
