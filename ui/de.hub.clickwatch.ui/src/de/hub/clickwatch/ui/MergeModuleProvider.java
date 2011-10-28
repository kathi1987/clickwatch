package de.hub.clickwatch.ui;

import com.google.inject.Module;

import de.hub.clickwatch.merge.IMergeConfiguration;
import de.hub.clickwatch.merge.MergeModule;
import de.hub.clickwatch.ui.connection.MergingNodeAdapterMergeConfiguration;

public class MergeModuleProvider implements IAdditionalModulesProvider {

	@Override
	public Module[] getAdditionalModules() {
		return new Module[] {
				new MergeModule() {
					@Override
					protected void configure() {
						bind(IMergeConfiguration.class).to(MergingNodeAdapterMergeConfiguration.class);
					}					
				}
		};
	}
}
