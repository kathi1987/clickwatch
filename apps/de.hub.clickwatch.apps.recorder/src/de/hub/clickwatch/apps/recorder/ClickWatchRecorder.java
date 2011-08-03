package de.hub.clickwatch.apps.recorder;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.main.IInjectorProvider;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.ExperimentRecorder;
import de.hub.clickwatch.recorder.database.CWRecorderStandaloneSetup;
import de.hub.clickwatch.util.ILogger;

public class ClickWatchRecorder implements IClickWatchMain, IApplication {

	@Override
	public void main(IClickWatchContext ctx) {
		Injector injector = ctx.getAdapter(IInjectorProvider.class).getInjector();
		ILogger logger = injector.getInstance(ILogger.class);
		ExperimentRecorder recorder = injector.getInstance(ExperimentRecorder.class);
		ExperimentDescr experiment = ctx.getAdapter(IExperimentProvider.class).getExperiment();
		
		logger.log(ILogger.INFO, "Start recording for experiment " + experiment.getName(), null);
		recorder.record(experiment);
		logger.log(ILogger.INFO, "Stopped recording for experiment " + experiment.getName() + "\nStatistics\n: " + experiment.getStatistics().toString(), null);
	}

	public static final void main(String[] args) throws Exception {
		ClickWatchStandaloneSetup.doSetup();
		CWRecorderStandaloneSetup.doSetup();
		ClickWatchExternalLauncher.launch(args, ClickWatchRecorder.class);
	}

	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get("application.args");
	    ClickWatchExternalLauncher.launch(args, ClickWatchRecorder.class);
	    return EXIT_OK;
	}

	@Override
	public void stop() {
		System.out.println("forced to stop ... rude by OSGI!");
	}
	
}
