package de.hub.clickwatch.main.internal;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;

import de.hub.clickcontrol.ClickSocketImpl;
import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.connection.adapter.CompoundHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IPullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.PullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.main.IInjectorProvider;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.recorder.database.DummyDataBaseAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRetrieveAdapter;
import de.hub.clickwatch.recorder.database.emf.DataBaseAdapter;
import de.hub.clickwatch.recorder.database.hbase.HBaseDataBaseAdapter;
import de.hub.clickwatch.recorder.database.logfile.LogFileDataBaseAdapter;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.util.ILogger;


public class InjectorProvider implements IClickWatchContextAdapter, IInjectorProvider {
	
	private int handlerPerRecord = 2000;
	private boolean useCompoundHandler = false;
	private boolean withRecord = true;
	private boolean withChangedOnly = true;
	private boolean withCompression = false;
	private boolean debug = false;
	private boolean useXml = false;
	private boolean useSpecificValues = false;
	private boolean useRecord = false;
	private String db = null;
	private String recordFile = null;
	
	private Injector injector = null;

	@Override
	public List<Option> getCommandLineOptions() {
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("d", "debug", false, "recorder logs extensive"));
		
		options.add(new Option("c", "compound-handler", false, "use the compound handler of nodes instead of reading each handler seperated"));
		options.add(new Option("cr", "compound-handler-records", false, "use compound handler, compound handler records values"));
		options.add(new Option("crc", "compound-handler-records-changes-only", false, "use compound handler compound handler records values and delivers only changes"));
		
		options.add(new Option("h", "handler-per-record", true, "determines the estimated record size in handler count per record"));
		options.add(new Option("db", true, "choose the database: hbase for hbase, log for log-file, emf for emf"));
		
		options.add(new Option("x", "xml-values", false, "use xml values instead of string values"));
		options.add(new Option("s", "brn-specific-values", false, "use brn-specific values when possible, xml-values are used otherwise."));
		
		options.add(new Option("r", "use-record", true, "uses the given clickwatch model to emulate an actual network"));
		return options;
	}

	@Override
	public void initalize(CommandLine commandLine) throws ParseException {
		try {
			useCompoundHandler = commandLine.hasOption("c") | commandLine.hasOption("cr") || commandLine.hasOption("cru");
			withRecord = commandLine.hasOption("cr") || commandLine.hasOption("cru");
			withChangedOnly = commandLine.hasOption("cru");
			debug = commandLine.hasOption("d");
			useXml = commandLine.hasOption("x");
			useSpecificValues = commandLine.hasOption("s");
			
			if (commandLine.hasOption("db")) {
				db = commandLine.getOptionValue("db");
			} else {
				db = "hbase";
			}
			if (commandLine.hasOption("h")) {
				handlerPerRecord = new Integer(commandLine.getOptionValue("h"));
			}
			if (commandLine.hasOption("r")) {
				useRecord = true;
				recordFile = commandLine.getOptionValue("r");
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
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(withRecord);
					bind(Integer.class).annotatedWith(Names.named(ClickWatchModule.I_COMPOUND_HANDLER_SAMPLE_TIME)).toInstance(200);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(withChangedOnly);
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_COMPRESSION)).toInstance(withCompression);
				} else { 
					bind(IPullHandlerAdapter.class).to(PullHandlerAdapter.class);
				}
			}

			@Override
			protected void bindValueAdapter() {
				if (useSpecificValues) {
					bind(IValueAdapter.class).to(BrnValueAdapter.class);
				} else if (useXml) {
					bind(IValueAdapter.class).to(XmlValueAdapter.class);
				} else {
					super.bindValueAdapter();
				}
			}
			
			@Override
			protected void bindClickSocket() {
				if (useRecord) {
					bindToPlayer();
				} else {
					bind(IClickSocket.class).to(ClickSocketImpl.class);
				}
			}
			
			private ClickSocketPlayer player = null;
			
			private void bindToPlayer() {
				if (player == null) {					
					player = new ClickSocketPlayer();
					player.initialize(URI.createFileURI(recordFile));
				}
				
				bind(ClickSocketPlayer.class).toInstance(player);
				bind(IClickSocket.class).to(ClickSocketPlayerSocketImpl.class);
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
				} else if (db.equals("dummy")) {
					bind(IDataBaseRecordAdapter.class).to(DummyDataBaseAdapter.class);
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
