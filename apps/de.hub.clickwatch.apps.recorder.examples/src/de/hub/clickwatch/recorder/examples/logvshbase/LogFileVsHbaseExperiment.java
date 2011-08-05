package de.hub.clickwatch.recorder.examples.logvshbase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import org.apache.commons.math.stat.descriptive.SummaryStatistics;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.data.Plot;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.provider.TimeStampLabelProvider;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class LogFileVsHbaseExperiment implements IClickWatchMain {
	
	private static final TimeStampLabelProvider timeStampLabelProvider = new TimeStampLabelProvider();
	@Inject private ILogger logger;
	@Inject private DataBaseUtil dbUtil;
	@Inject private XmlValueAdapter xmlValueAdapter;
	@Inject private StringValueAdapter stringValueAdapter;
	
	private PrintStream  out = null;
	private SummaryStatistics logSize = new SummaryStatistics();
	private SummaryStatistics hbaseSize = new SummaryStatistics();

	@Override
	public void main(IClickWatchContext ctx) {
		ExperimentDescr experiment = ctx.getAdapter(IExperimentProvider.class).getExperiment();
		int numberOfDataPoints = 10;
		Plot plot = new Plot();
		for (int run = 1; run <= 10; run++) {
			long duration = run * ((experiment.getEnd() - experiment.getStart()) / numberOfDataPoints);
			
			// step 1 generate log file, obtain sizes of xml and logfiles
			logSize.clear();
			hbaseSize.clear();
			generateLogFile(duration, "out.log", experiment);
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
			
			logger.log(ILogger.INFO, "Run " + run + " completed with " + new long[]{(long)(duration/1e6), (long)logSize.getSum(), (long)hbaseSize.getSum(), logtime, hbaseTime}, null);
			plot.addEntry(duration / 1e6, logSize.getSum(), hbaseSize.getSum(), logtime, hbaseTime);
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
	
	private void generateLogFile(long durationInNanos, String fileName, ExperimentDescr experiment) {
		try {
			out = new PrintStream(new File(fileName));
		} catch (FileNotFoundException e) {
			Throwables.propagate(e);
		}
		
		logger.log(ILogger.INFO, "Start logfile generation on experiment " + experiment.getName(), null);
		
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
		Map<CurrentIterator, String> nodeIds = new HashMap<LogFileVsHbaseExperiment.CurrentIterator, String>();
		
		logger.log(ILogger.INFO, "Creating database scanners for all handers for all nodes", null);
		for (Node node: experiment.getMetaData()) {
			for(Handler handler: node.getAllHandlers()) {
				CurrentIterator iterator = new CurrentIterator(dbUtil.getHandlerIterator(experiment, 
						node.getINetAddress(), handler.getQualifiedName(), 
						experiment.getStart(), experiment.getStart() + durationInNanos));
				insert(iterator, handlers);
				nodeIds.put(iterator, node.getINetAddress());
			}
		}
		
		logger.log(ILogger.INFO, "Starting to go through all handlers and to create log entries", null);
		int i = 0;
		long expStart = experiment.getStart();
		NumberFormat percentFormat = new DecimalFormat("0.000");
		while(!handlers.isEmpty()) {
			CurrentIterator current = handlers.poll();
			Handler stringHandler = current.getCurrent();
			long timestamp = stringHandler.getTimestamp();
			hbaseSize.addValue(stringHandler.getValue().length());
			Handler xmlHandler = xmlValueAdapter.create(stringHandler, stringValueAdapter);
			printLogEntries(xmlHandler, nodeIds.get(current));
			EcoreUtil.delete(stringHandler);
			EcoreUtil.delete(xmlHandler);
			insert(current, handlers);
			if (i++ == 1000) {
				i = 0;				
				double percent = ((double)(timestamp - expStart)*100)/(double)durationInNanos;
				logger.log(ILogger.DEBUG, "Creating log entries at " 
						+ percentFormat.format(percent) + "%, "
						, null);
			}
		}
		out.close();
	}
	
	private void insert(CurrentIterator iterator, PriorityQueue<CurrentIterator> handlers) {
		if (iterator.hasNext()) {
			iterator.next();
			handlers.add(iterator);			
		}
	}
	
	private void printLogEntries(Handler xmlHandler, String nodeId) {
		List<AnyType> leafs = new ArrayList<AnyType>();
		String text = "";
		for (FeatureMap.Entry fme: xmlHandler.getMixed()) {
			text = fme.getValue().toString().replace("\n", " ").trim();
		}
		for (FeatureMap.Entry fme: xmlHandler.getAny()) {
			if (fme.getValue() instanceof AnyType) {
				getLeafs((AnyType)fme.getValue(), leafs);
			}
		}
		
		String qualifiedName = xmlHandler.getQualifiedName();
		if (leafs.size() == 0) {
			String logEntry = timeStampLabelProvider.getText(xmlHandler.getTimestamp()) + " " + nodeId + "/"					
					+ qualifiedName + " "
					+ text.trim();
			out.println(logEntry);
			logSize.addValue(logEntry.length());
		}
		for (AnyType leaf: leafs) {
			String logEntry = timeStampLabelProvider.getText(xmlHandler.getTimestamp())  + " "	+ nodeId + "/"
					+ qualifiedName + " "
					+ text + (text.equals("")?"":" ")
					+ getLogEntry(leaf).trim();
			out.println(logEntry);
			logSize.addValue(logEntry.length());
		}
	}

	private String getLogEntry(AnyType leaf) {
		StringBuffer result = new StringBuffer();
		for(FeatureMap.Entry fme: leaf.getAnyAttribute()) {
			result.append(fme.getEStructuralFeature().getName() + "=" + fme.getValue().toString().replace("\n", " ").trim() + " ");
		}
		for(FeatureMap.Entry fme: leaf.getMixed()) {
			if (fme.getEStructuralFeature().getName().equals("text")) {
				String text = fme.getValue().toString().replace("\n", " ").trim();
				result.append(text);
				if (!text.equals("")) {
					result.append(" ");
				}
			}
		}
		if (leaf.eContainer() instanceof AnyType) {
			return getLogEntry((AnyType)leaf.eContainer()) + result.toString();
		} else {
			return result.toString();
		}
	}

	private void getLeafs(AnyType any, List<AnyType> result) {
		boolean hasChild = false;
		for (FeatureMap.Entry fme: any.getAny()) {
			Object child = fme.getValue();
			if (child instanceof AnyType) {
				hasChild = true;
				getLeafs((AnyType)child, result);
			}
		}
		if (!hasChild) {
			result.add(any);
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
