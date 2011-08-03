package de.hub.clickwatch.recorder.examples;

import java.io.PrintStream;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class PdrPlotAnalysis implements IClickWatchMain {
	
	@Inject private DataBaseUtil dbUtil;
	@Inject private ILogger logger;
	
	private PrintStream out;
	
	public void initialize(PrintStream out) {
		this.out = out;
	}
	
	@SuppressWarnings("deprecation")
	public void performWithStrings(ExperimentDescr experiment) {
		long start = System.currentTimeMillis();
		for (Node nodeConfig: experiment.getNetwork().getNodes()) {						
			String nodeId = nodeConfig.getINetAddress();
			Iterator<Handler> iterator = dbUtil.getHandlerIterator(experiment, nodeId, "device_wifi/wifidevice/cst/stats", 
					experiment.getStart(), experiment.getEnd());
			
			while(iterator.hasNext()) {
				Handler handler = iterator.next();
				String value = handler.getValue();
				value = value.substring(value.indexOf("hwbusy=\"")+8);
				value = value.substring(0, value.indexOf("\""));
				int hwbusy = Integer.parseInt(value);
				long time = handler.getTimestamp() / 1000000;
				Date date = new Date(time);

				out.println(date.getHours() + " " + date.getMinutes() + " " + (date.getSeconds() * 1e9 + time % 1e9) + " " + nodeId.replace(".", "") + " " + hwbusy);
				
				EcoreUtil.delete(handler);
			}

			logger.log(ILogger.INFO, "created plot for " + nodeId, null);
		}
		out.close();
		System.out.println("time in millies: " + (System.currentTimeMillis() - start));
	}
	
	@SuppressWarnings("deprecation")
	public void perform(ExperimentDescr experiment) {
		for (Node nodeConfig: experiment.getNetwork().getNodes()) {						
			String nodeId = nodeConfig.getINetAddress();
			Iterator<Handler> iterator = dbUtil.getHandlerIterator(experiment, nodeId, "device_wifi/wifidevice/cst/stats", 
					experiment.getStart(), experiment.getEnd());
			
			while(iterator.hasNext()) {
				Stats handler = (Stats)iterator.next();
				long time = handler.getTimestamp() / 1000000;
				Date date = new Date(time);
				out.println(date.getHours() + " " + date.getMinutes() + " " + (date.getSeconds() * 1e9 + time % 1e9) + " "
						+ handler.getChannelstats().getNode().replace("-", "") + " " + handler.getChannelstats().getPhy().getHwbusy());
				
				EcoreUtil.delete(handler);
			}

			logger.log(ILogger.INFO, "created plot for " + nodeId, null);
		}
		out.close();
	}
	
	@Override
	public void main(IClickWatchContext ctx) {
		logger.log(ILogger.INFO, "Start analysis on experiment " , null);
		
		try {
			initialize(new PrintStream("out.txt", "utf8"));
		} catch (Exception e) {
			Throwables.propagate(e);
		}
		perform(ctx.getAdapter(IExperimentProvider.class).getExperiment());
	}

	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, PdrPlotAnalysis.class);
	}
}
