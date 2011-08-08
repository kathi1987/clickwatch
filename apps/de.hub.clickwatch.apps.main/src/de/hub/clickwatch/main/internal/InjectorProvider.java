package de.hub.clickwatch.main.internal;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.IConfigurationElement;
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
	
	public enum HandlerBehaviour { DEFAULT, COMPOUND, COMPOUND_RECORDING, COMPOUND_RECORDING_DIFFERENCES };
	public enum ValueType { STRING, XML, SPECIFIC };
	public enum DataBaseType { HBASE, EMF, LOGFILE, DUMMY };
	
	private HandlerBehaviour handlerBehaviour;
	private int remoteUpdateInterval;
	private long localUpdateInterval;
	private ValueType valueType;
	private int debugLevel; // 1,2,3,4
	
	private DataBaseType dataBaseType;
	private int handlerPerRecord;
	
	private URI recordURI;
	
	private Injector injector = null;

	@Override
	public List<Option> getCommandLineOptions() {
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("d", "debug", false, "recorder logs extensive"));
		
		options.add(new Option("c", "compound-handler", false, "use the compound handler of nodes instead of reading each handler seperated"));
		options.add(new Option("cr", "compound-handler-records", false, "use compound handler, compound handler records values"));
		options.add(new Option("crc", "compound-handler-records-changes-only", false, "use compound handler compound handler records values and delivers only changes"));
		options.add(new Option("ru", "remote-update-interval", true, "interval used on node by compound handler."));
		options.add(new Option("lu", "local-update-interval", true, "default interval used between requests, if not given otherwise"));
		
		options.add(new Option("h", "handler-per-record", true, "determines the estimated record size in handler count per record"));
		options.add(new Option("db", true, "choose the database: hbase for hbase, log for log-file, emf for emf"));
		
		options.add(new Option("x", "xml-values", false, "use xml values instead of string values"));
		options.add(new Option("s", "brn-specific-values", false, "use brn-specific values when possible, xml-values are used otherwise."));
		
		options.add(new Option("r", "use-record", true, "uses the given clickwatch model to emulate an actual network"));
		return options;
	}

	@Override
	public void initialize(CommandLine commandLine) throws ParseException {
		try {
			boolean useCompoundHandler = commandLine.hasOption("c") | commandLine.hasOption("cr") || commandLine.hasOption("crc");
			boolean withRecord = commandLine.hasOption("cr") || commandLine.hasOption("crc");
			boolean withChangesOnly = commandLine.hasOption("crc");
			remoteUpdateInterval = 500;
			if (commandLine.hasOption("ru")) {
				remoteUpdateInterval = Integer.parseInt(commandLine.getOptionValue("ru"));
			}
			localUpdateInterval = 2000;
			if (commandLine.hasOption("lu")) {
				localUpdateInterval = Integer.parseInt(commandLine.getOptionValue("lu"));
			}
			
			if (useCompoundHandler && withRecord && withChangesOnly) {
				handlerBehaviour = HandlerBehaviour.COMPOUND_RECORDING_DIFFERENCES;
			} else if (useCompoundHandler && withRecord && !withChangesOnly) {
				handlerBehaviour = HandlerBehaviour.COMPOUND_RECORDING;
			} else if (useCompoundHandler && !withRecord) {
				handlerBehaviour = HandlerBehaviour.COMPOUND;
			} else if (!useCompoundHandler) {
				handlerBehaviour = HandlerBehaviour.DEFAULT;
			}
			
			debugLevel = commandLine.hasOption("d") ? 4 : 2;
			
			boolean useXml = commandLine.hasOption("x");
			boolean useSpecificValues = commandLine.hasOption("s");			
			if (useXml) {
				valueType = ValueType.XML;
			} else if (useSpecificValues) {
				valueType = ValueType.SPECIFIC;
			} else {
				valueType = ValueType.STRING;
			}
			
			String db = null;
			if (commandLine.hasOption("db")) {
				db = commandLine.getOptionValue("db");
			} else {
				db = "hbase";
			}
			if (db.equals("hbase")) {
				dataBaseType = DataBaseType.HBASE;
			} else if (db.equals("emf")) {
				dataBaseType = DataBaseType.EMF;
			} else if (db.equals("logfile")) {
				dataBaseType = DataBaseType.LOGFILE;
			} else if (db.equals("dummy")) {
				dataBaseType = DataBaseType.DUMMY;
			} else {
				throw new IllegalArgumentException();
			}
			
			if (commandLine.hasOption("h")) {
				handlerPerRecord = new Integer(commandLine.getOptionValue("h"));
			} else {
				handlerPerRecord = 2000;
			}
			
			if (commandLine.hasOption("r")) {
				recordURI = URI.createFileURI(commandLine.getOptionValue("r"));
			}
		} catch (Exception e) {
			throw new ParseException(e.getMessage());
		}
	}
	
	public void initialize(ValueType valueType, int debugLevel) {
		this.handlerBehaviour = HandlerBehaviour.DEFAULT;
		this.valueType = valueType;
		this.debugLevel = debugLevel;
		this.dataBaseType = DataBaseType.HBASE;
		this.handlerPerRecord = 2000;
		this.recordURI = null;
	}
	
	public void initialize(HandlerBehaviour handlerBehaviour, ValueType valueType, int debugLevel, DataBaseType dataBaseType,
			int handlerPerRecord, URI recordURI) {
		this.handlerBehaviour = handlerBehaviour;
		this.valueType = valueType;
		this.debugLevel = debugLevel;
		this.dataBaseType = dataBaseType;
		this.handlerPerRecord = handlerPerRecord;
		this.recordURI = recordURI;
	}

	@Override
	public void initialize(IConfigurationElement configurationElement) {
		String debugStr = configurationElement.getAttribute("debug");
		String compoundStr = configurationElement.getAttribute("compound");
		String withRecordStr = configurationElement.getAttribute("with_record");
		String withChangesOnlyStr = configurationElement.getAttribute("with_changes_only");
		String xmlValuesStr = configurationElement.getAttribute("xml_values");
		String specificModelsStr = configurationElement.getAttribute("specific_models");
		
		int debug = debugStr.equals("true") ? 4 : 2;
		HandlerBehaviour handlerBehaviour = HandlerBehaviour.DEFAULT;
		if (compoundStr.equals("true")) {
			handlerBehaviour = HandlerBehaviour.COMPOUND;
			if (withRecordStr.equals("true")) {
				handlerBehaviour = HandlerBehaviour.COMPOUND_RECORDING;
				if (withChangesOnlyStr.equals("true")) {
					handlerBehaviour = HandlerBehaviour.COMPOUND_RECORDING_DIFFERENCES;	
				}
			}
		}
		ValueType valueType = ValueType.STRING;
		if (xmlValuesStr.equals("true")) {
			valueType = ValueType.XML;
		} 
		if (specificModelsStr.equals("true")) {
			valueType = ValueType.SPECIFIC;
		}
		
		initialize(handlerBehaviour, valueType, debug, DataBaseType.HBASE, 2000, null /* TODO */);
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
						if ((debugLevel) >= status) {				
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
				if (handlerBehaviour.ordinal() >= HandlerBehaviour.COMPOUND.ordinal()) {
					bind(IPullHandlerAdapter.class).to(CompoundHandlerAdapter.class);
				} else {
					bind(IPullHandlerAdapter.class).to(PullHandlerAdapter.class);
				}
				if (handlerBehaviour.ordinal() >= HandlerBehaviour.COMPOUND_RECORDING.ordinal()) {
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(true);
				} else {
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_RECORDS)).toInstance(false);
				}
				if (handlerBehaviour == HandlerBehaviour.COMPOUND_RECORDING_DIFFERENCES) {
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(true);
				} else {
					bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_CHANGES_ONLY)).toInstance(false);
				}
					
				bind(Integer.class).annotatedWith(Names.named(ClickWatchModule.I_COMPOUND_HANDLER_SAMPLE_TIME)).toInstance(remoteUpdateInterval);
				bind(Boolean.class).annotatedWith(Names.named(ClickWatchModule.B_COMPOUND_HANDLER_COMPRESSION)).toInstance(false);
			}

			@Override
			protected void bindValueAdapter() {
				if (valueType == ValueType.SPECIFIC) {
					bind(IValueAdapter.class).to(BrnValueAdapter.class);
				} else if (valueType == ValueType.XML) {
					bind(IValueAdapter.class).to(XmlValueAdapter.class);
				} else {
					super.bindValueAdapter();
				}
			}
			
			@Override
			protected void bindClickSocket() {
				if (recordURI != null) {
					bindToPlayer();
				} else {
					bind(IClickSocket.class).to(ClickSocketImpl.class);
				}
			}
			
			private ClickSocketPlayer player = null;
			
			private void bindToPlayer() {
				if (player == null) {					
					player = new ClickSocketPlayer();
					player.initialize(recordURI);
				}
				
				bind(ClickSocketPlayer.class).toInstance(player);
				bind(IClickSocket.class).to(ClickSocketPlayerSocketImpl.class);
			}	
		
		};
		CWRecorderModule cwRecorderModule = new CWRecorderModule() {

			@Override
			protected void configureDataBaseRecordAdapter() {
				if (dataBaseType == DataBaseType.HBASE) {
					bind(IDataBaseRecordAdapter.class).to(HBaseDataBaseAdapter.class);
				} else if (dataBaseType == DataBaseType.EMF) {
					bind(IDataBaseRecordAdapter.class).to(DataBaseAdapter.class);
				} else if (dataBaseType == DataBaseType.LOGFILE) {
					bind(IDataBaseRecordAdapter.class).to(LogFileDataBaseAdapter.class);
				} else if (dataBaseType == DataBaseType.DUMMY) {
					bind(IDataBaseRecordAdapter.class).to(DummyDataBaseAdapter.class);
				} else {
					throw new IllegalArgumentException("unknown database-adatper");
				}
			}

			@Override
			protected void configureDataBaseRetrieveAdapter() {
				if (dataBaseType == DataBaseType.HBASE) {
					bind(IDataBaseRetrieveAdapter.class).to(HBaseDataBaseAdapter.class);
				} else if (dataBaseType == DataBaseType.EMF) {
					bind(IDataBaseRetrieveAdapter.class).to(DataBaseAdapter.class);
				} else {
					bind(IDataBaseRetrieveAdapter.class).to(HBaseDataBaseAdapter.class);
				}
			}

			@Override
			protected void configureHandlerPerRecord() {
				bind(int.class).annotatedWith(Names.named(I_HANDLER_PER_RECORD_PROPERTY)).toInstance(handlerPerRecord);
			}

			@Override
			protected void configureDefaultUpdateInterval() {
				bind(long.class).annotatedWith(Names.named(L_DEFAULT_UPDATE_INTERVAL_PROPERTY)).toInstance(localUpdateInterval);
			}
			
		};
		return Guice.createInjector(clickWatchModule, cwRecorderModule);
	}
}
