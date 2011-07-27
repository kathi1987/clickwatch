package de.hub.clickwatch.analysis.ui;

import com.google.inject.Module;

import de.hub.clickwatch.specificmodels.ClickWatchSpecificModelsModule;
import de.hub.clickwatch.ui.IAdditionalModulesProvider;

public class CWAnalysisAdditionalModulesProvider implements
		IAdditionalModulesProvider {

	@Override
	public Module[] getAdditionalModules() {
		return new Module[] { new ClickWatchSpecificModelsModule() };
	}

}
