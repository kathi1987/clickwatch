package de.hub.clickwatch.recorder.examples.logvshbase;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

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
	private static int numberOfDataPoints = 20;
	
	long getDuration(int dataPoint, long durationAll) {
		return (durationAll / numberOfDataPoints) * dataPoint;
	}
	
	long[] getDurations(ExperimentDescr experiment) {	
		long durationAll = experiment.getEnd() - experiment.getStart();
		long[] durations = new long[numberOfDataPoints];
		for (int i = 0; i < numberOfDataPoints; i++) {
			durations[i] = getDuration(i+1, durationAll);
		}
		return durations;
	}

	@Override
	public void main(IClickWatchContext ctx) {		
		ExperimentDescr experiment = ctx.getAdapter(IExperimentProvider.class).getExperiment();
		File sourceLogFile = new File(ctx.getAdapter(IArgumentsProvider.class).getArguments()[0]);
	
		Plot plot = new Plot();
		long durations[] = getDurations(experiment);
		long hbaseSizes[] = getHBaseSizes(experiment, durations);
  		
		for (int run = 0; run < durations.length; run++) {
			long duration = durations[run];
			long logSize = 0;
			
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
			
			logger.log(ILogger.INFO, "Run " + run + " completed with " + new long[]{(long)(duration/1e6), (long)logSize, (long)hbaseSizes[run], logtime, hbaseTime}, null);
			plot.addEntry(duration / 1e6, logSize, hbaseSizes[run], logtime, hbaseTime);
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
	
	public long[] getHBaseSizes(ExperimentDescr experiment, long[] durations) { 
		long[] result = new long[durations.length];
		long size = 0;
		int durationsIndex = 0;
		
		logger.log(ILogger.INFO, "Start analysis on experiment " + experiment.getName(), null);
		
		PriorityQueue<CurrentIterator> handlers = new PriorityQueue<CurrentIterator>(1000, new Comparator<CurrentIterator>() {
			@Override
			public int compare(CurrentIterator one,
					CurrentIterator two) {
				if (one.getCurrent().getTimestamp() < two.getCurrent().getTimestamp()) {
					return -1;
				} else if (one.getCurrent().getTimestamp() == two.getCurrent().getTimestamp()) {
					return 0;
				} else {
					return 1;
				}
			}			
		});
		Map<CurrentIterator, String> nodeIds = new HashMap<CurrentIterator, String>();
		
		logger.log(ILogger.INFO, "Creating database scanners for all handers for all nodes", null);
		for (Node node: experiment.getMetaData()) {
			for(Handler handler: node.getAllHandlers()) {
				CurrentIterator iterator = new CurrentIterator(dbUtil.getHandlerIterator(experiment, 
						node.getINetAddress(), handler.getQualifiedName(), 
						experiment.getStart(), experiment.getEnd()));
				insert(iterator, handlers);
				nodeIds.put(iterator, node.getINetAddress());
			}
		}
		
		logger.log(ILogger.INFO, "Starting to go through all handlers and measure hbase size", null);
		int logCounter = 0;
		long duration = experiment.getEnd() - experiment.getStart();
		long expStart = experiment.getStart();
		NumberFormat percentFormat = new DecimalFormat("0.000");
		while(!handlers.isEmpty()) {
			CurrentIterator current = handlers.poll();
			long timestamp = current.getCurrent().getTimestamp();
			size += current.getCurrent().getValue().length();
			if (timestamp >= durations[durationsIndex]) {
				result[durationsIndex] = size;
				durationsIndex++;
			}
			
			EcoreUtil.delete(current.getCurrent());
			insert(current, handlers);
			if (logCounter++ == 10000) {
				logCounter = 0;				
				double percent = ((double)(timestamp - expStart)*100)/(double)duration;
				logger.log(ILogger.DEBUG, "Measuing sizes at " 
						+ percentFormat.format(percent) + "%, "
						, null);
			}
		}
		return result;
	}
	
	private void insert(CurrentIterator iterator, PriorityQueue<CurrentIterator> handlers) {
		if (iterator.hasNext()) {
			iterator.next();
			handlers.add(iterator);			
		}
	}
	
	class CurrentIterator implements Iterator<Handler> {
		private final Iterator<Handler> base;
		private Handler current = null;
		
		public CurrentIterator(Iterator<Handler> base) {
			super();
			this.base = base;
		}

		@Override
		public boolean hasNext() {
			return base.hasNext();
		}

		@Override
		public Handler next() {
			current = base.next();
			return current;
		}

		@Override
		public void remove() {
			base.remove();
		}
		
		public Handler getCurrent() {
			return current;
		}
	}
	
	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, LogFileVsHbaseExperiment.class);
	}
}
