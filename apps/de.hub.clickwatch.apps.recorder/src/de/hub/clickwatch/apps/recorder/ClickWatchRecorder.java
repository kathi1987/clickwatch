package de.hub.clickwatch.apps.recorder;

import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IArgumentsProvider;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IInjectorProvider;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.CWRecorderStandaloneSetup;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.recorder.recorder.Recorder;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Tasks;

public class ClickWatchRecorder implements IClickWatchMain, IApplication {

	@Override
	public void main(IClickWatchContext ctx) {
        String[] args = ctx.getAdapter(IArgumentsProvider.class).getArguments();
        long time = 0;
        if (args.length != 1) {
            System.err.println("wrong arguments, e.g. missing time");
            System.exit(1);
        } else {
            try {
                time = Long.parseLong(args[0]);
            } catch (Exception e) {
                System.err.println("wrong arguments, e.g. wrong time");
                System.exit(1);
            }
        }    
	    
	    Injector injector = ctx.getAdapter(IInjectorProvider.class).getInjector();
		final INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		Tasks tasks = injector.getInstance(Tasks.class);
		ILogger logger = injector.getInstance(ILogger.class);
		Recorder recorder = injector.getInstance(Recorder.class);				
		final Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		
		logger.log(ILogger.INFO, "Start recording for record " + record.getName(), null);
		recorder.record(record);
		tasks.dispatchTask(Recorder.class, new Runnable() {            
            @Override
            public void run() {
                for (Node node: record.getConfiguration().getNodes()) {
                    INodeConnection connection = ncp.createConnection(node);
                    connection.getAdapter(IHandlerEventAdapter.class).start();
                }        
            }
        });
		
				
		try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
            System.exit(1);
        }
		
		recorder.stop();
		tasks.dispatchTask(Recorder.class, new Runnable() {            
            @Override
            public void run() {
                for (Node node: record.getConfiguration().getNodes()) {
                    INodeConnection connection = ncp.createConnection(node);
                    connection.getAdapter(IHandlerEventAdapter.class).stop();
                    connection.dispose();
                }        
            }
        });
		
		tasks.waitForCompletionAll();
		tasks.shutdown();
		
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
