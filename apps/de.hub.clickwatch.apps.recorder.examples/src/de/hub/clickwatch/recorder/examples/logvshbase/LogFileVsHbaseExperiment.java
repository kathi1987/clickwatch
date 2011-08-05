package de.hub.clickwatch.recorder.examples.logvshbase;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Date;
import java.util.Iterator;

import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.data.Plot;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IArgumentsProvider;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.TimeStampLabelProvider;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class LogFileVsHbaseExperiment implements IClickWatchMain {
	
	private static final TimeStampLabelProvider timeStampLabelProvider = new TimeStampLabelProvider();
	@Inject private ILogger logger;
	@Inject private DataBaseUtil dbUtil;
	
	private SummaryStatistics hbaseSize = new SummaryStatistics();

	@Override
	public void main(IClickWatchContext ctx) {		
		ExperimentDescr experiment = ctx.getAdapter(IExperimentProvider.class).getExperiment();
		File sourceLogFile = new File(ctx.getAdapter(IArgumentsProvider.class).getArguments()[0]);
		
		int numberOfDataPoints = 10;
		Plot plot = new Plot();
		for (int run = 1; run <= 10; run++) {
			long duration = run * ((experiment.getEnd() - experiment.getStart()) / numberOfDataPoints);
			long logSize = 0;
			hbaseSize.clear();
			
			
			// step 1 create a subset log file from existing log file
			Handler handler = dbUtil.getHandler(experiment, "192.168.3.118", "device_wifi/link_stat/bcast_stats", experiment.getStart() + duration);
			String timestampStr = timeStampLabelProvider.getText(handler.getTimestamp());
			try {
				File targetLogFile = new File("out.log");
				PrintStream out = new PrintStream(targetLogFile);
				FileInputStream fstream = new FileInputStream(sourceLogFile);
				DataInputStream in = new DataInputStream(fstream);
				BufferedReader br = new BufferedReader(new InputStreamReader(in));
				String strLine;
				loop: while ((strLine = br.readLine()) != null) {
					out.println(strLine);
					if (strLine.startsWith(timestampStr)) {
						break loop;
					}
				}
				in.close();
				out.close();
				logSize = targetLogFile.length();
			} catch (Exception e) {
				Throwables.propagate(e);
			}
			logger.log(ILogger.DEBUG, "created logfile for run " + run, null);
			
			// step 2 get log file time
			long start = System.currentTimeMillis();
			int exit = 1;
			String command = "sh src/" + getClass().getPackage().getName().replaceAll("\\.", "/") + "/grep.sh";
			try {				
				Process process = Runtime.getRuntime().exec(command);
				exit = process.waitFor();
			} catch (Exception e) {
				logger.log(ILogger.ERROR, "abnormal grep termination", e);
			}	
			if (exit != 0) {
				logger.log(ILogger.ERROR, "abnormal grep termination for command " + command, null);
			}
			long stop = System.currentTimeMillis();
			long logtime = stop - start;
			logger.log(ILogger.DEBUG, "performed grep analysis for " + run, null);
			
			// step 3 get hbase time
			start = System.currentTimeMillis();
			performHbaseWithStrings(duration, experiment);
			stop = System.currentTimeMillis();
			long hbaseTime = stop - start;
			logger.log(ILogger.DEBUG, "performed hbase analysis for " + run, null);
			
			logger.log(ILogger.INFO, "Run " + run + " completed with " + new long[]{(long)(duration/1e6), (long)logSize, (long)hbaseSize.getSum(), logtime, hbaseTime}, null);
			plot.addEntry(duration / 1e6, logSize, hbaseSize.getSum(), logtime, hbaseTime);
		}
		
		try {
			plot.printCSV(new PrintStream(new File("out.txt")));
		} catch (FileNotFoundException e) {
			Throwables.propagate(e);
		}
	}
	
	@SuppressWarnings("deprecation")
	private void performHbaseWithStrings(long durationInNanos, ExperimentDescr experiment) {
		PrintStream out = null;
		try {
			out = new PrintStream(new File("hbase.out"));
		} catch (FileNotFoundException e) {
			Throwables.propagate(e);
		}
		for (Node nodeConfig: experiment.getNetwork().getNodes()) {						
			String nodeId = nodeConfig.getINetAddress();
			Iterator<Handler> iterator = dbUtil.getHandlerIterator(experiment, nodeId, "device_wifi/wifidevice/cst/stats", 
					experiment.getStart(), experiment.getStart() + durationInNanos);
			
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
	}
	
	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, LogFileVsHbaseExperiment.class);
	}
}
