package de.hub.clickwatch.recorder;

import com.google.inject.AbstractModule;
import com.google.inject.name.Names;

import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.recorder.recorder.HBaseDataBaseAdapter;
import de.hub.clickwatch.recorder.recorder.IDataBaseAdapter;

public class ClickWatchRecorderModule extends AbstractModule {

    public static final String I_PUTS_BUFFER_SIZE = "CWRecorderModule.handlerPerRecord";
    public static final String DB_VALUE_ADAPTER_PROPERTY = "CWRecorderModule.dbValueAdapter";
    public static final String B_SAVE_RECORD_FILE = "CWRecorderModule.saveRecordFile";
	
	@Override
	protected void configure() {
		configureDataBaseAdapter();
		configurePutsBufferSize();
		configureDBValueAdapter();		
		configureAdditionalBindings();	
		configureSaveRecordFileDuringRecord();
	}
	
	
	protected void configureSaveRecordFileDuringRecord() {
		bind(boolean.class).annotatedWith(Names.named(B_SAVE_RECORD_FILE)).toInstance(Boolean.TRUE);
	}

	protected void configureAdditionalBindings() {
		// empty
	}

	protected void configureDataBaseAdapter() {
		bind(IDataBaseAdapter.class).to(HBaseDataBaseAdapter.class);
	}
	
	protected void configureDBValueAdapter() {
		bind(IValueAdapter.class).annotatedWith(Names.named(DB_VALUE_ADAPTER_PROPERTY)).to(StringValueAdapter.class);
	}

	protected void configurePutsBufferSize() {
		bind(int.class).annotatedWith(Names.named(I_PUTS_BUFFER_SIZE)).toInstance(2000);
	}
		
}
