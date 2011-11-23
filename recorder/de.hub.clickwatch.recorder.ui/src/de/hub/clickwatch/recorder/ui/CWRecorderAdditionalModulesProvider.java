package de.hub.clickwatch.recorder.ui;

import com.google.inject.Module;
import com.google.inject.name.Names;

import de.hub.clickwatch.recorder.ClickWatchRecorderModule;
import de.hub.clickwatch.recorder.recorder.HBaseDataBaseAdapter;
import de.hub.clickwatch.recorder.recorder.IDataBaseAdapter;
import de.hub.clickwatch.ui.IAdditionalModulesProvider;

public class CWRecorderAdditionalModulesProvider implements
		IAdditionalModulesProvider {

	@Override
	public Module[] getAdditionalModules() {
		return new Module[] { new ClickWatchRecorderModule() {
			@Override
			protected void configureDataBaseAdapter() {
				bind(IDataBaseAdapter.class).to(HBaseDataBaseAdapter.class);
			}

            @Override
            protected void configureSaveRecordFileDuringRecord() {
                bind(boolean.class).annotatedWith(Names.named(B_SAVE_RECORD_FILE)).toInstance(Boolean.FALSE);
            }
		
		}};
	}

}
