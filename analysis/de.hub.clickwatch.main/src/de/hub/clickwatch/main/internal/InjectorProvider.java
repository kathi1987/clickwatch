package de.hub.clickwatch.main.internal;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.CompoundHandlerAdapter;
import de.hub.clickwatch.connection.adapter.PullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IPullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.main.IClickWatchContextAdapter;
import de.hub.clickwatch.main.IInjectorProvider;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRetrieveAdapter;
import de.hub.clickwatch.recorder.database.emf.DataBaseAdapter;
import de.hub.clickwatch.recorder.database.hbase.HBaseDataBaseAdapter;
import de.hub.clickwatch.recorder.database.logfile.LogFileDataBaseAdapter;
import de.hub.clickwatch.util.ILogger;


public class InjectorProvider implements IClickWatchContextAdapter, IInjectorProvider {
	
	private int handlerPerRecord = 2000;
	private boolean useCompoundHandler = false;
	private boolean debug = false;
	private boolean useXml = false;
	private String db = null;
	
	private Injector injector = null;

	@Override
	public List<Option> getCommandLineOptions() {
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("d", "debug", false, "recorder logs extensive"));
		options.add(new Option("c", "compound-handler", false, "recorder uses the compound handler of nodes instead of reading each handler seperated"));
		options.add(new Option("h", "handler-per-record", true, "determines the estimated record size in handler count per record"));
		options.add(new Option("db", true, "choose the database: hbase for hbase, log for log-file, emf for emf"));		
		options.add(new Option("x", "use-xml-vaues", false, "use xml values instead of string values"));
		return options;
	}

	@Override
	public void initalize(CommandLine commandLine) throws ParseException {
		try {
			useCompoundHandler = commandLine.hasOption("c");
			debug = commandLine.hasOption("d");
			useXml = commandLine.hasOption("x");
			
			if (commandLine.hasOption("db")) {
				db = commandLine.getOptionValue("db");
			} else {
				db = "hbase";
			}
			if (commandLine.hasOption("h")) {
				handlerPerRecord = new Integer(commandLine.getOptionValue("h"));
			}
		} catch (Exception e) {
			throw new ParseException(e.getMessage());
		}
	}
	
	public Injector getInjector() {
		if (injector == null) {
			injector = createInjector();
		}
		return injector;
	}

	private Injector createInjector() {
		ClickWatchModule clickWatchModule = new ClickWatchModule() {
			@Override
			protected ILogger getLogger() {
				return new ILogger() {				
					@Override
					public synchronized void log(int status, String message, Throwable exception) {
						if ((debug?4:2) >= status) {				
							System.out.print(DateFormat.getDateTimeInstance().format(new Date()) + " ");
							
							if (status == ILogger.DEBUG) {
								System.out.print("[DEBUG] ");
							} else if (status == ILogger.INFO) {
								System.out.print("[INFO] ");
							} else if (status == ILogger.WARNING) {
								System.out.print("[WARNING] ");
							} else if (status == ILogger.ERROR) {
								System.out.print("[ERROR] ");
							}
							
							System.out.print(message);
							if (exception != null) {
								System.out.println(": " + exception.getMessage());
								exception.printStackTrace();
							}
							System.out.println("");
						}
					}
				};
			}

			@Override
			protected void bindHandlerAdapter() {
				if (useCompoundHandler) {
					bind(IPullHandlerAdapter.class).to(CompoundHandlerAdapter.class);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(true);
					bind(Integer.class).annotatedWith(Names.named(ClickWatchModule.I_COMPOUND_HANDLER_SAMPLE_TIME)).toInstance(200);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(true);
				} else { 
					bind(IPullHandlerAdapter.class).to(PullHandlerAdapter.class);
				}
			}

			@Override
			protected void bindValueAdapter() {
				if (useXml) {
					bind(IValueAdapter.class).to(XmlValueAdapter.class);
				} else {
					super.bindValueAdapter();
				}
			}
		
		};
		CWRecorderModule cwRecorderModule = new CWRecorderModule() {

			@Override
			protected void configureDataBaseRecordAdapter() {
				if (db == null || db.equals("") || db.equals("hbase")) {
					bind(IDataBaseRecordAdapter.class).to(HBaseDataBaseAdapter.class);
				} else if (db.equals("emf")) {
					bind(IDataBaseRecordAdapter.class).to(DataBaseAdapter.class);
				} else if (db.equals("logfile")) {
					bind(IDataBaseRecordAdapter.class).to(LogFileDataBaseAdapter.class);
				} else {
					throw new IllegalArgumentException("unknown database-adatper");
				}
			}

			@Override
			protected void configureDataBaseRetrieveAdapter() {
				if (db == null || db.equals("") || db.equals("hbase")) {
					bind(IDataBaseRetrieveAdapter.class).to(HBaseDataBaseAdapter.class);
				} else if (db.equals("emf")) {
					bind(IDataBaseRetrieveAdapter.class).to(DataBaseAdapter.class);
				} else if (db.equals("logfile")) {
					bind(IDataBaseRetrieveAdapter.class).to(HBaseDataBaseAdapter.class);
				} else {
					throw new IllegalArgumentException("unknown database-adatper");
				}
			}

			@Override
			protected void configureHandlerPerRecord() {
				bind(int.class).annotatedWith(Names.named(I_HANDLER_PER_RECORD_PROPERTY)).toInstance(handlerPerRecord);
			}
			
		};
		return Guice.createInjector(clickWatchModule, cwRecorderModule);
	}
}
