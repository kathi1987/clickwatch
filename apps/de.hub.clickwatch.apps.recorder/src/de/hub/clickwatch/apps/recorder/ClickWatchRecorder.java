package de.hub.clickwatch.apps.recorder;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.main.IInjectorProvider;
import de.hub.clickwatch.recorder.NetworkRecorder;
import de.hub.clickwatch.recorder.database.CWRecorderStandaloneSetup;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.util.ILogger;

public class ClickWatchRecorder implements IClickWatchMain, IApplication {

	@Override
	public void main(IClickWatchContext ctx) {
		Injector injector = ctx.getAdapter(IInjectorProvider.class).getInjector();
		ILogger logger = injector.getInstance(ILogger.class);
		NetworkRecorder recorder = injector.getInstance(NetworkRecorder.class);
		Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		
		logger.log(ILogger.INFO, "Start recording for record " + record.getName(), null);
		recorder.record(record);
		logger.log(ILogger.INFO, "Stopped recording for record " + record.getName() + "\nStatistics\n: " + record.getStatistics().toString(), null);
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
