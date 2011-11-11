package de.hub.clickwatch.recorder.examples.logvshbase;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;
import org.eclipse.equinox.app.IApplication;
import org.eclipse.equinox.app.IApplicationContext;

import com.google.inject.Inject;

import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IArgumentsProvider;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.TimeStampLabelProvider;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class LogFileGenerator implements IClickWatchMain, IApplication {
	
	private static final TimeStampLabelProvider timeStampLabelProvider = new TimeStampLabelProvider();
	@Inject private ILogger logger;
	@Inject private DataBaseUtil dbUtil;
	
	private PrintStream out;

	@Override
	public void main(IClickWatchContext ctx) {
		try {
			out = new PrintStream(new File(ctx.getAdapter(IArgumentsProvider.class).getArguments()[0]));
		} catch (FileNotFoundException e) {
			Throwables.propagate(e);
		}
		
		Record record = ctx.getAdapter(IRecordProvider.class).getRecord();
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
		Map<CurrentIterator, String> nodeIds = new HashMap<LogFileGenerator.CurrentIterator, String>();
		
		logger.log(ILogger.INFO, "Creating database scanners for all handers for all nodes", null);
		for (Node node: record.getConfiguration().getNodes()) {
			for(Handler handler: node.getAllHandlers()) {
				CurrentIterator iterator = new CurrentIterator(dbUtil.getHandlerIterator(DataBaseUtil.createHandle(record, node, handler)));
				insert(iterator, handlers);
				nodeIds.put(iterator, node.getINetAddress());
			}
		}
		
		logger.log(ILogger.INFO, "Starting to go through all handlers and to create log entries", null);
		int i = 0;
		long duration = record.getEnd() - record.getStart();
		long expStart = record.getStart();
		NumberFormat percentFormat = new DecimalFormat("0.000");
		while(!handlers.isEmpty()) {
			CurrentIterator current = handlers.poll();
			long timestamp = current.getCurrent().getTimestamp();
			printLogEntries(current.getCurrent(), nodeIds.get(current));
			EcoreUtil.delete(current.getCurrent());
			insert(current, handlers);
			if (i++ == 1000) {
				i = 0;				
				double percent = ((double)(timestamp - expStart)*100)/(double)duration;
				logger.log(ILogger.DEBUG, "Creating log entries at " 
						+ percentFormat.format(percent) + "%, "
						, null);
			}
		}
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
		}
		for (AnyType leaf: leafs) {
			String logEntry = timeStampLabelProvider.getText(xmlHandler.getTimestamp())  + " "	+ nodeId + "/"
					+ qualifiedName + " "
					+ text + (text.equals("")?"":" ")
					+ getLogEntry(leaf).trim();
			out.println(logEntry);
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
	
	@Override
	public Object start(IApplicationContext context) throws Exception {
		String[] args = (String[]) context.getArguments().get("application.args");
	    ClickWatchExternalLauncher.launch(args, LogFileGenerator.class);
	    return EXIT_OK;
	}

	@Override
	public void stop() {
		System.out.println("forced to stop ... rude by OSGI!");
	}
	
	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, LogFileGenerator.class);
	}
}
