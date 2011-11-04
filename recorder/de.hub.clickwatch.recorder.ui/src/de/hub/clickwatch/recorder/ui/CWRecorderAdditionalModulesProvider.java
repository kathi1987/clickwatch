package de.hub.clickwatch.recorder.ui;

import com.google.inject.Module;

import de.hub.clickwatch.recorder.ClickWatchRecorderModule;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRetrieveAdapter;
import de.hub.clickwatch.recorder.database.hbase.HBaseDataBaseAdapter;
import de.hub.clickwatch.ui.IAdditionalModulesProvider;

public class CWRecorderAdditionalModulesProvider implements
		IAdditionalModulesProvider {

	@Override
	public Module[] getAdditionalModules() {
		return new Module[] { new ClickWatchRecorderModule() {
			@Override
			protected void configureDataBaseAdapter() {
				bind(IDataBaseRecordAdapter.class).to(HBaseDataBaseAdapter.class);
			}

			@Override
			protected void configureDataBaseRetrieveAdapter() {
				bind(IDataBaseRetrieveAdapter.class).to(HBaseDataBaseAdapter.class);
			}
		}};
	}

}
