package de.hub.clickwatch.main.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.google.inject.name.Names;

import de.hub.clickwatch.ClickWatchModule;
import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.ClickWatchModuleUtil.ClickWatchModuleBuilder;
import de.hub.clickwatch.ClickWatchModuleUtil.HandlerBehaviour;
import de.hub.clickwatch.ClickWatchModuleUtil.ValueType;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.connection.adapter.values.XmlValueAdapter;
import de.hub.clickwatch.main.IClickWatchContextAdapter;
import de.hub.clickwatch.main.IInjectorProvider;
import de.hub.clickwatch.recorder.ClickWatchRecorderModule;
import de.hub.clickwatch.recorder.recorder.HBaseDataBaseAdapter;
import de.hub.clickwatch.recorder.recorder.IDataBaseAdapter;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class InjectorProvider implements IClickWatchContextAdapter,
		IInjectorProvider {

	public enum DataBaseType {
		HBASE
	};

	private HandlerBehaviour handlerBehaviour;
	private int remoteUpdateInterval;
	private int localUpdateInterval;
	private ValueType valueType;
	private int debugLevel; // 1,2,3,4
	private String logFile = null;

	private DataBaseType dataBaseType;
	private int handlerPerRecord;

	private URI recordURI;

	private Injector injector = null;
	private boolean useSpecificDataValues;

	@Override
	public List<Option> getCommandLineOptions() {
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("d", "debug", false, "recorder logs extensive"));
		options.add(new Option("lf", "log-file", true, "name of a logfile"));

		options.add(new Option("c", "compound-handler", false,
				"use the compound handler of nodes instead of reading each handler seperated"));
		options.add(new Option("cr", "compound-handler-records", false,
				"use compound handler, compound handler records values"));
		options.add(new Option(
				"crc",
				"compound-handler-records-changes-only",
				false,
				"use compound handler compound handler records values and delivers only changes"));
		options.add(new Option("ru", "remote-update-interval", true,
				"interval used on node by compound handler."));
		options.add(new Option("lu", "local-update-interval", true,
				"default interval used between requests, if not given otherwise"));

		options.add(new Option("h", "handler-per-record", true,
				"determines the estimated record size in handler count per record"));
		options.add(new Option("db", true,
				"choose the database: hbase for hbase, log for log-file, emf for emf"));

		options.add(new Option("x", "xml-values", false,
				"use xml values instead of string values"));
		options.add(new Option("s", "brn-specific-values", false,
				"use brn-specific values when possible, xml-values are used otherwise."));
		options.add(new Option("ds", "brn-specific-data-values", false,
				"use brn-specific data values when possible, xml-values are used otherwise."));

		options.add(new Option("r", "use-record", true,
				"uses the given clickwatch model to emulate an actual network"));
		return options;
	}

	@Override
	public void initialize(CommandLine commandLine) throws ParseException {
		try {
			boolean useCompoundHandler = commandLine.hasOption("c")
					| commandLine.hasOption("cr")
					|| commandLine.hasOption("crc");
			boolean withRecord = commandLine.hasOption("cr")
					|| commandLine.hasOption("crc");
			boolean withChangesOnly = commandLine.hasOption("crc");
			remoteUpdateInterval = 500;
			if (commandLine.hasOption("ru")) {
				remoteUpdateInterval = Integer.parseInt(commandLine
						.getOptionValue("ru"));
			}
			localUpdateInterval = 2000;
			if (commandLine.hasOption("lu")) {
				localUpdateInterval = Integer.parseInt(commandLine
						.getOptionValue("lu"));
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
			if (commandLine.hasOption("log-file")) {
				logFile = commandLine.getOptionValue("log-file");
			}

			boolean useXml = commandLine.hasOption("x");
			boolean useSpecificValues = commandLine.hasOption("s");
			useSpecificDataValues = commandLine.hasOption("ds");
			if (useXml) {
				valueType = ValueType.XML;
			} else if (useSpecificValues || useSpecificDataValues) {
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

	public void initialize(HandlerBehaviour handlerBehaviour,
			ValueType valueType, int debugLevel, DataBaseType dataBaseType,
			int handlerPerRecord, URI recordURI, Integer localUpdateInterval,
			Integer remoteUpdateInterval) {
		this.handlerBehaviour = handlerBehaviour;
		this.valueType = valueType;
		this.debugLevel = debugLevel;
		this.dataBaseType = dataBaseType;
		this.handlerPerRecord = handlerPerRecord;
		this.recordURI = recordURI;
		this.localUpdateInterval = localUpdateInterval;
		this.remoteUpdateInterval = remoteUpdateInterval;
	}

	public void initialize(HandlerBehaviour handlerBehaviour,
			ValueType valueType, int debugLevel, DataBaseType dataBaseType,
			int handlerPerRecord, URI recordURI) {
		this.handlerBehaviour = handlerBehaviour;
		this.valueType = valueType;
		this.debugLevel = debugLevel;
		this.dataBaseType = dataBaseType;
		this.handlerPerRecord = handlerPerRecord;
		this.recordURI = recordURI;
	}

	@Override
	public void initialize(IConfigurationElement configurationElement,
			EObject selection) {
		String debugStr = configurationElement.getAttribute("debug");
		String compoundStr = configurationElement.getAttribute("compound");
		String withRecordStr = configurationElement.getAttribute("with_record");
		String withChangesOnlyStr = configurationElement
				.getAttribute("with_changes_only");
		String xmlValuesStr = configurationElement.getAttribute("xml_values");
		String specificModelsStr = configurationElement
				.getAttribute("specific_models");

		int debug = "true".equals(debugStr) ? 4 : 2;
		HandlerBehaviour handlerBehaviour = HandlerBehaviour.DEFAULT;
		if ("true".equals(compoundStr)) {
			handlerBehaviour = HandlerBehaviour.COMPOUND;
			if ("true".equals(withRecordStr)) {
				handlerBehaviour = HandlerBehaviour.COMPOUND_RECORDING;
				if ("true".equals(withChangesOnlyStr)) {
					handlerBehaviour = HandlerBehaviour.COMPOUND_RECORDING_DIFFERENCES;
				}
			}
		}
		ValueType valueType = ValueType.STRING;
		if ("true".equals(xmlValuesStr)) {
			valueType = ValueType.XML;
		}
		if ("true".equals(specificModelsStr)) {
			valueType = ValueType.SPECIFIC;
		}

		initialize(handlerBehaviour, valueType, debug, DataBaseType.HBASE,
				2000, null /* TODO */);
	}

	public Injector getInjector() {
		if (injector == null) {
			injector = createInjector();
		}
		return injector;
	}

	private Injector createInjector() {

		ClickWatchModuleBuilder builder = ClickWatchModuleUtil
				.newBuilder()
				.wDebug(debugLevel, logFile)
				.wHandlerBhvr(handlerBehaviour, localUpdateInterval,
						remoteUpdateInterval);
		if (valueType == ValueType.XML) {
			builder.wValueAdapterClass(XmlValueAdapter.class);
		} else if (valueType == ValueType.STRING) {
			builder.wValueAdapterClass(StringValueAdapter.class);
		} else if (valueType == ValueType.SPECIFIC) {
			if (!useSpecificDataValues) {
				builder.wValueAdapterClass(BrnValueAdapter.class);
			} else {
				builder.wValueAdapterClass(de.hub.clickwatch.specificmodels.brn.BrnValueAdapter.class);
			}
		} else {
			builder.wValueAdapterClass(XmlValueAdapter.class);
		}
		builder.wRecord(recordURI);

		ClickWatchModule clickWatchModule = builder.build();
		ClickWatchRecorderModule cwRecorderModule = new ClickWatchRecorderModule() {

			@Override
			protected void configureDataBaseAdapter() {
				if (dataBaseType == DataBaseType.HBASE) {
					bind(IDataBaseAdapter.class).to(HBaseDataBaseAdapter.class);
				} else {
					throw new IllegalArgumentException(
							"unknown database-adatper");
				}
			}

			@Override
			protected void configurePutsBufferSize() {
				bind(int.class).annotatedWith(Names.named(I_PUTS_BUFFER_SIZE))
						.toInstance(handlerPerRecord);
			}
		};
		Injector result = Guice.createInjector(clickWatchModule,
				cwRecorderModule);
		Throwables.logger = result.getInstance(ILogger.class);
		return result;
	}

	@Override
	public Class<?> getAdpaterClass() {
		return IInjectorProvider.class;
	}
}
