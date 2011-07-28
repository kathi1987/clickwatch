package de.hub.clickwatch.recorder;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.PosixParser;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.google.inject.Module;
import com.google.inject.name.Names;

import de.hub.clickwatch.AbstractMain;
import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.connection.adapter.CompoundHandlerAdapter;
import de.hub.clickwatch.connection.adapter.HandlerAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.recoder.cwdatabase.DataBase;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.CWRecorderStandaloneSetup;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.hbase.HBaseDataBaseAdapter;
import de.hub.clickwatch.recorder.database.logfile.LogFileDataBaseAdapter;
import de.hub.clickwatch.util.ILogger;
import de.hub.emfxml.XmlModelRepository;

public class ClickWatchRecorder extends AbstractMain implements IApplication {

	@Override
	protected int getLogLevel() {
		if (debug) {
			return 4;
		} else {
			return 2;
		}
	}

	@Override
	protected Module[] getAdditionalModules() {
		return new Module[] { new CWRecorderModule() {
			@Override
			protected void configureHandlerPerRecord() {
				bind(int.class).annotatedWith(Names.named(I_HANDLER_PER_RECORD_PROPERTY)).toInstance(handlerPerRecord);
			}

			@Override
			protected void configureDataBaseRecordAdapter() {
				if (db.equals("hbase")) {
					bind(IDataBaseRecordAdapter.class).to(HBaseDataBaseAdapter.class);
				} else if (db.equals("emf")){
					super.configureDataBaseRecordAdapter();
				} else if (db.equals("log")) {
					bind(IDataBaseRecordAdapter.class).to(LogFileDataBaseAdapter.class);
				} else {
					throw new IllegalArgumentException("unknown db adapter " + db);
				}
			}
		}};
	}
	
	@Override
	protected Class<? extends IHandlerAdapter> getHandlerAdapterClass() {
		if (useCompoundHandler) {
			return CompoundHandlerAdapter.class;
		} else {
			return HandlerAdapter.class;
		}
	}

	private final String experimentFile;
	private final int handlerPerRecord;
	private final boolean useCompoundHandler;
	private final boolean debug;
	private final String db;
	private final String experimentId;
	
	public ClickWatchRecorder(String experimentFile, String experiment, int handlerPerRecord, boolean useCompoundHandler, boolean debug, String db) {
		super();
		this.experimentFile = experimentFile;
		this.handlerPerRecord = handlerPerRecord;
		this.useCompoundHandler = useCompoundHandler;
		this.debug = debug;
		this.db = db;
		this.experimentId = experiment;
	}
	
	public ClickWatchRecorder() {
		experimentFile = null;
		handlerPerRecord = 0;
		useCompoundHandler = false;
		debug = false;
		db = "";
		experimentId = null;
	}

	public void run() throws Exception {
		setUp();
		
		ResourceSet rs = new ResourceSetImpl();
		rs.getLoadOptions().putAll(XmlModelRepository.defaultLoadSaveOptions());
		Resource resource = rs.getResource(URI.createFileURI(experimentFile), true);
		DataBase database = (DataBase)resource.getContents().get(0);
		ExperimentRecorder recorder = injector.getInstance(ExperimentRecorder.class);
		
		ExperimentDescr experiment = null;
		if (experimentId == null || experimentId.equals("")) {
			if (database.getExperiments().size() > 0) {
				experiment = database.getExperiments().get(0);
			}
		} else {			
			for (ExperimentDescr experimentInDB: database.getExperiments()) {
				if (experimentId.equals(experimentInDB.getName())) {
					experiment = experimentInDB;
				}
			}
		}
		if (experiment == null) {
			injector.getInstance(ILogger.class).log(ILogger.ERROR, "Experiment does not exist", null);
		}
		
		injector.getInstance(ILogger.class).log(ILogger.INFO, "Start recording on database: " + experimentFile + " for experiment " + experiment.getName(), null);
		
		recorder.record(experiment);		
		resource.save(XmlModelRepository.defaultLoadSaveOptions());
		
		injector.getInstance(ILogger.class).log(ILogger.INFO, database.getExperiments().get(0).getStatistics().toString(), null);
	}

	public static final void main(String[] args) throws Exception {
		Options options = new Options();
		options.addOption("db", true, "choose the database: hbase for hbase, log for log-file, emf for emf");
		options.addOption("h", "handler-per-record", true, "determines the estimated record size in handler count per record");
		options.addOption("c", "compound-handler", false, "recorder uses the compound handler of nodes instead of reading each handler seperated");
		options.addOption("d", "debug", false, "recorder logs extensive");
		options.addOption("e", "experiment", true, "name of the experiment to be recorded, otherwise recorder uses the first experiment in db");
		
		String experimentFile = null;
		String experiment = null;
		int handlerPerRecord = 2000;
		boolean useCompoundHandler = false;
		boolean debug = false;
		String db = null;
		
		try {
			CommandLine commandLine = new PosixParser().parse(options, args);
			experimentFile = commandLine.getArgs()[0];
			if (commandLine.getArgs().length > 1) {
				throw new Exception();
			}
			useCompoundHandler = commandLine.hasOption("c");
			debug = commandLine.hasOption("d");
			if (commandLine.hasOption("db")) {
				db = commandLine.getOptionValue("db");
			} else {
				db = "hbase";
			}
			if (commandLine.hasOption("u")) {
				handlerPerRecord = new Integer(commandLine.getOptionValue("u"));
			}
			if (commandLine.hasOption("e")) {
				experiment = commandLine.getOptionValue("e");
			}
		} catch (Exception e) {
			System.out.println("Illegal usage.");
			new HelpFormatter().printHelp("eclipse -application de.hub.clickwatch.core.recorder.ClickWatchRecorder -consolelog -nosplash [options...] database-file", options);
			System.exit(1);
		}
		
		ClickWatchStandaloneSetup.doSetup();
		CWRecorderStandaloneSetup.doSetup();
		ClickWatchRecorder instance = new ClickWatchRecorder(experimentFile, experiment, handlerPerRecord, useCompoundHandler, debug, db);
		instance.run();
	}

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get("application.args");
	    ClickWatchRecorder.main(args);	    
	    return EXIT_OK;
	}

	@Override
	public void stop() {
		System.out.println("forced to stop ... rude by OSGI!");
	}
	
}
