package de.hub.clickwatch.recorder.ui.actions;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Names;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.IPullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.internal.CompoundHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.ui.modelactions.AbstractAction;
import de.hub.clickwatch.util.ILogger;

public abstract class AbstractRecordAction extends AbstractAction<Record> {
	
	@Inject ILogger logger; 
	
	protected Injector createInjector() {
		ClickWatchModule cwModule = new ClickWatchModule() {

			@Override
			protected void bindValueAdapter() {
				bind(IValueAdapter.class).to(StringValueAdapter.class);
			}

			@Override
			protected void bindHandlerEventAdapter() {
				bind(IPullHandlerAdapter.class).to(CompoundHandlerEventAdapter.class);
				bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(true);
				bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(true);
				bind(Integer.class).annotatedWith(Names.named(ClickWatchModule.I_COMPOUND_HANDLER_SAMPLE_TIME)).toInstance(200);
				bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_COMPRESSION)).toInstance(false);
			}
			
		};
		cwModule.setLogger(logger);
		CWRecorderModule cwRecoderModule = new CWRecorderModule() {

			@Override
			protected void configureSaveRecordFile() {
				bind(boolean.class).annotatedWith(Names.named(B_SAVE_RECORD_FILE)).toInstance(Boolean.FALSE);	
			}
			
		};
		return Guice.createInjector(cwModule, cwRecoderModule);
	}
	
	
}
