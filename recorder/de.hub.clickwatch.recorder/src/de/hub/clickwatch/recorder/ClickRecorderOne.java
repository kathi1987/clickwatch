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

import de.hub.clickwatch.connection.adapter.CompoundHandlerAdapter;
import de.hub.clickwatch.connection.adapter.HandlerAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.recoder.cwdatabase.DataBase;
import de.hub.clickwatch.tests.AbstractTest;
import de.hub.clickwatch.util.ILogger;
import de.hub.emfxml.XmlModelRepository;

public class ClickRecorderOne extends AbstractTest implements IApplication {

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
	
	public ClickRecorderOne(String experimentFile, int handlerPerRecord, boolean useCompoundHandler, boolean debug) {
		super();
		this.experimentFile = experimentFile;
		this.handlerPerRecord = handlerPerRecord;
		this.useCompoundHandler = useCompoundHandler;
		this.debug = debug;
	}
	
	public ClickRecorderOne() {
		experimentFile = null;
		handlerPerRecord = -1;
		useCompoundHandler = false;
		debug = false;
	}

	public void run() throws Exception {
		setUp();
		injector.getInstance(ILogger.class).log(ILogger.INFO, "Start recording on database: " + experimentFile, null);
		
		ResourceSet rs = new ResourceSetImpl();
		rs.getLoadOptions().putAll(XmlModelRepository.defaultLoadSaveOptions());
		Resource resource = rs.getResource(URI.createFileURI(experimentFile), true);
		DataBase database = (DataBase)resource.getContents().get(0);
		ExperimentRecorder recorder = injector.getInstance(ExperimentRecorder.class);
		
		recorder.record(database.getExperiments().get(0));		
		resource.save(XmlModelRepository.defaultLoadSaveOptions());
		
		injector.getInstance(ILogger.class).log(ILogger.INFO, database.getExperiments().get(0).getStatistics().toString(), null);
	}

	public static final void main(String[] args) throws Exception {
		Options options = new Options();
		options.addOption("h", "handler-per-record", true, "determines the estimated record size in handler count per record");
		options.addOption("c", "compound-handler", false, "recorder uses the compound handler of nodes instead of reading each handler seperated");
		options.addOption("d", "debug", false, "recorder logs extensive");
		
		String experimentFile = null;
		int handlerPerRecord = 2000;
		boolean useCompoundHandler = false;
		boolean debug = false;
		
		try {
			CommandLine commandLine = new PosixParser().parse(options, args);
			experimentFile = commandLine.getArgs()[0];
			if (commandLine.getArgs().length > 1) {
				throw new Exception();
			}
			useCompoundHandler = commandLine.hasOption("c");
			debug = commandLine.hasOption("d");
			if (commandLine.hasOption("u")) {
				handlerPerRecord = new Integer(commandLine.getOptionValue("u"));
			}
		} catch (Exception e) {
			System.out.println("Illegal usage.");
			new HelpFormatter().printHelp("eclipse -application de.hub.clickwatch.core.examples.recorder.RecorderOne -consolelog -nosplash [options...] database-file", options);
			System.exit(1);
		}
		
		ClickRecorderOne instance = new ClickRecorderOne(experimentFile, handlerPerRecord, useCompoundHandler, debug);
		instance.run();
	}

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get("application.args");
	    ClickRecorderOne.main(args);	    
	    return EXIT_OK;
	}

	@Override
	public void stop() {
		System.out.println("forced to stop ... rude by OSGI!");
	}
	
}
