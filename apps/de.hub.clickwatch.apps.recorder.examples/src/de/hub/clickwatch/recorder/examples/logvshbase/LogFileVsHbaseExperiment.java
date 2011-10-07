package de.hub.clickwatch.recorder.examples.logvshbase;

import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.InputStreamReader;
import java.io.PrintStream;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.PriorityQueue;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IArgumentsProvider;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.TimeStampLabelProvider;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
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
	
	long[] getDurations(Record record) {	
		long durationAll = (record.getEnd() - record.getStart());
		long[] durations = new long[numberOfDataPoints];
		for (int i = 0; i < numberOfDataPoints; i++) {
			durations[i] = getDuration(i+1, durationAll);
		}
		return durations;
	}

	@Override
	public void main(IClickWatchContext ctx) {				
		String prefix = ctx.getAdapter(IArgumentsProvider.class).getArguments()[3];
		
		Result logResult = measureLog(ctx);
		logResult.exportCSV(prefix + "_log_results.txt");
		
		Result hbaseResult = measureHBase(ctx);
		hbaseResult.exportCSV(prefix + "_hbase_results.txt");
	}
	
	private Result measureHBase(IClickWatchContext ctx) {
		Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		numberOfDataPoints = Integer.parseInt(ctx.getAdapter(IArgumentsProvider.class).getArguments()[1]);
		Result result = ctx.getAdapter(IResultsProvider.class).getResults().createNewResult("hbaseresults");
	
		long durations[] = getDurations(record);
		long hbaseSizes[] = getHBaseSizes(record, durations);
		logger.log(ILogger.DEBUG, "determined all hbase sizes", null);
  		
		for (int run = 0; run < durations.length; run++) {
			long duration = durations[run];
			
			long start = System.currentTimeMillis();
			performHbaseWithStrings(duration, record);
			long stop = System.currentTimeMillis();
			long hbaseTime = stop - start;
			logger.log(ILogger.DEBUG, "performed hbase analysis for " + run, null);
			result.getDataSet().add(duration / 1e6, hbaseSizes[run], hbaseTime);
		}
		logger.log(ILogger.DEBUG, "finished hbase analysis", null);
		return result;
	}
	
	private Result measureLog(IClickWatchContext ctx) {
		Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
		File sourceLogFile = new File(ctx.getAdapter(IArgumentsProvider.class).getArguments()[0]);
		String grepCommand = ctx.getAdapter(IArgumentsProvider.class).getArguments()[2];
		numberOfDataPoints = Integer.parseInt(ctx.getAdapter(IArgumentsProvider.class).getArguments()[1]);
		Result result = ctx.getAdapter(IResultsProvider.class).getResults().createNewResult("logresults");
		
		long durations[] = getDurations(record);
  		
		for (int run = 0; run < durations.length; run++) {
			long duration = durations[run];
			long logSize = 0;
			
			// step 1 create a subset log file from existing log file
			Handler handler = dbUtil.getHandler(DataBaseUtil.createHandle(record, "192.168.3.118", "device_wifi/link_stat/bcast_stats", record.getStart() + duration, 0));
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
			
			// step 1.5 reread the source log file to clear fs virtualization caches
//			try {
//				FileInputStream fstream = new FileInputStream(sourceLogFile);
//				DataInputStream in = new DataInputStream(fstream);
//				BufferedReader br = new BufferedReader(new InputStreamReader(in));
//				while (br.readLine() != null);
//				in.close();
//			} catch (IOException e) {
//				Throwables.propagate(e);
//			}
			logger.log(ILogger.DEBUG, "reread source log file for run " + run, null);
			
			// step 2 get log file time
			long start = System.currentTimeMillis();
			int exit = 1;
			try {				
				Process process = Runtime.getRuntime().exec(grepCommand);
				exit = process.waitFor();
			} catch (Exception e) {
				logger.log(ILogger.ERROR, "abnormal grep termination", e);
			}	
			if (exit != 0) {
				logger.log(ILogger.ERROR, "abnormal grep termination for command " + grepCommand, null);
			}
			long stop = System.currentTimeMillis();
			long logtime = stop - start;
			logger.log(ILogger.DEBUG, "performed grep analysis for " + run, null);
			
			result.getDataSet().add(duration / 1e6, logSize, logtime);			
		}
		logger.log(ILogger.DEBUG, "finished log analysis", null);
		return result;
	}
	
	@SuppressWarnings("deprecation")
	private void performHbaseWithStrings(long durationInNanos, Record record) {
		PrintStream out = null;
		try {
			out = new PrintStream(new File("hbase.out"));
		} catch (FileNotFoundException e) {
			Throwables.propagate(e);
		}
		for (Node nodeConfig: record.getConfiguration().getNodes()) {						
			String nodeId = nodeConfig.getINetAddress();
			Iterator<Handler> iterator = dbUtil.getHandlerIterator(DataBaseUtil.createHandle(record, nodeId, "device_wifi/wifidevice/cst/stats", 
					record.getStart(), record.getStart() + durationInNanos));
			
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
	
	private long[] getHBaseSizes(Record record, long[] durations) { 
		long[] result = new long[durations.length];
		long size = 0;
		int durationsIndex = 0;
		
		logger.log(ILogger.INFO, "Start analysis on record " + record.getName(), null);
		
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
		for (Node node: record.getMetaData()) {
			for(Handler handler: node.getAllHandlers()) {
				CurrentIterator iterator = new CurrentIterator(dbUtil.getHandlerIterator(DataBaseUtil.createHandle(record, node, handler)));
				insert(iterator, handlers);
				nodeIds.put(iterator, node.getINetAddress());
			}
		}
		
		logger.log(ILogger.INFO, "Starting to go through all handlers and measure hbase size", null);

		while(!handlers.isEmpty()) {
			CurrentIterator current = handlers.poll();
			long timestamp = current.getCurrent().getTimestamp();
			size += current.getCurrent().getValue().length();
			if (timestamp >= (durations[durationsIndex] + record.getStart())) {
				result[durationsIndex] = size;
				durationsIndex++;
				logger.log(ILogger.DEBUG, "data base size for duration number " + durationsIndex + " is " + size, null);
				if (durationsIndex >= durations.length) {
					return result;
				}
			}
			
			EcoreUtil.delete(current.getCurrent());
			insert(current, handlers);
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
