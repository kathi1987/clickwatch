package de.hub.clickwatch.recorder.examples;

import java.io.PrintWriter;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;

import com.google.inject.Inject;

import de.hub.clickwatch.ClickWatchStandaloneSetup;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.connection.adapter.XmlValueAdapter;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.provider.TimeStampLabelProvider;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.CWRecorderStandaloneSetup;
import de.hub.clickwatch.recorder.database.hbase.HBaseDataBaseAdapter;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class PdrPlotAnalysis implements IClickWatchMain {
	
	private static final long TIME_PRECISION_PER_SECOND = 1000000000;
	private static final int SAMPLES = 2000;
	
	@Inject private HBaseDataBaseAdapter dbAdatper;
	@Inject private ILogger logger;
	@Inject private XmlValueAdapter xmlValueAdapter;
	@Inject private StringValueAdapter stringValueAdapter;
	
	private FeatureMapParserConfig fmpc = null;
	private FeatureMapParser parser = null;
	
	private Map<String, MovingAverage> averages = new HashMap<String, PdrPlotAnalysis.MovingAverage>();
	private PrintWriter out;
	
	private long mavrSize;
	
	public void initialize(PrintWriter out) {
		this.out = out;
	}

	class Item {
		long time;
		int value;
		Item(long time, int value) {
			super();
			this.time = time;
			this.value = value;
		}			
	}
	
	private static int unique = 0;
	private static Map<String, Integer> macMap = new HashMap<String, Integer>();
	
	private class MovingAverage extends ConcurrentLinkedQueue<Item> {
		private static final long serialVersionUID = 1L;
		String id;
		long takeNextSampleAt = 0;
		
		int getMacId(String mac) {
			Integer id = macMap.get(mac);
			if (id == null) {
				id = unique++;
				macMap.put(mac, id);
			}
			return id;
		}
		
		MovingAverage(String from, String to) {
			super();
			id = getMacId(from) + " " + getMacId(to);
		}

		void add(long time, int value) {
			if (size() > 0 && time - peek().time > mavrSize) {
				poll();
			}
			add(new Item(time, value));
			if (takeNextSampleAt == 0) {
				takeNextSampleAt = time;
			}
			if (time > takeNextSampleAt) {	
				out.printf(id + " " + takeNextSampleAt/TIME_PRECISION_PER_SECOND + " " +getAvr() + "\n");
				takeNextSampleAt += mavrSize;
			}
		}
		
		double getAvr() {
			int result = 0;
			for(Item item: this) {
				result+= item.value;
			}
			return result / size();
		}
	}

	public void perform(ExperimentDescr experiment) {
		dbAdatper.initialize(experiment);
		fmpc = new FeatureMapParserConfig();
		parser = new FeatureMapParser(fmpc);
		
		this.mavrSize = (experiment.getEnd() - experiment.getStart()) / SAMPLES;
		
		for (Node nodeConfig: experiment.getNetwork().getNodes()) {
			Iterator<Handler> dbIterator = dbAdatper.retrieve(nodeConfig.getINetAddress(), "device_wifi/link_stat/bcast_stats", experiment.getStart(), experiment.getEnd());
			int i = 0;
			while(dbIterator.hasNext()) {
				Handler dbHandler = dbIterator.next();
				Handler handler = ClickWatchModelFactory.eINSTANCE.createHandler();
				xmlValueAdapter.setModelValue(handler, stringValueAdapter.getPlainRealValue(dbHandler));
				long time = dbHandler.getTimestamp();
				fmpc.time = time;
				parser.parse(handler.getAny());
				
				if (++i % 1000 == 0) {
					logger.log(ILogger.INFO, "perform at time " + new TimeStampLabelProvider().getText(time) 
							+ " on node " + nodeConfig.getINetAddress() + ", this is the " + i + "th sample.", null);
				}
				
				EcoreUtil.delete(dbHandler, true);
				EcoreUtil.delete(handler, true);
			}
		}
		out.close();
	}
	
	private void addSample(String from, String to, long time, int pdr) {
		String linkId = from+to;
		MovingAverage mavr = averages.get(linkId);
		if (mavr == null) {
			mavr = new MovingAverage(from, to);
			averages.put(linkId, mavr);
		}
		mavr.add(time, pdr);
	}
	
	public class FeatureMapParserConfig implements IFeatureMapParserConfig {
		private long time;

		private int rate = 0;
		private int fwd = 0;
		private int rev = 0;
		private String to = null;
		private String from = null;
		
		private int r2_fwd = -1;
		private int r2_rev = -1;
		
		class Link {			
			public Link(int fwd, int rev, String to) {
				super();
				this.fwd = fwd;
				this.rev = rev;
				this.to = to;
			}
			int fwd = 0;
			int rev = 0;
			String to = null;
		}
		
		private List<Link> entryLinks = new ArrayList<PdrPlotAnalysis.FeatureMapParserConfig.Link>();
		
		public void entry(Object value) {
			for (Link link: entryLinks) {
				addSample(from, link.to, time, rev);
			}
			entryLinks.clear();
		}
		
		public void link(Object value) {
			if (r2_fwd != -1 && r2_rev != -1) {
				entryLinks.add(new Link(r2_fwd, r2_rev, to));
			}
			r2_fwd = -1;
			r2_rev = -1;
		}
		
		public void link_info(Object value) {
			if (rate == 2) {
				r2_fwd = fwd;
				r2_rev = rev;
			}
		}
		
		public void rate(Object value) {
			rate = new Integer((String)value);
		}
		
		public void to(Object value) {
			to = (String)value;
		}
		
		public void from(Object value) {
			from = (String)value;
		}
		
		public void fwd(Object value) {
			fwd = new Integer((String)value);
		}
		
		public void rev(Object value) {
			rev = new Integer((String)value);
		}
	} 
	
	public interface IFeatureMapParserConfig {

	}
	
	public class FeatureMapParser {
		IFeatureMapParserConfig config;
		Map<String, Method> methods = new HashMap<String, Method>();
		
		public FeatureMapParser(IFeatureMapParserConfig config) {
			super();
			this.config = config;
			
			for (Method method: config.getClass().getMethods()) {
				methods.put(method.getName(), method);
			}
		}
	
		public void parse(FeatureMap map) {	
			for (FeatureMap.Entry fme: map) {
				String name = fme.getEStructuralFeature().getName();
				Method method = methods.get(name);
				Object value = fme.getValue();
				
				if (value instanceof AnyType) {
					parse(((AnyType) value).getAny());
					parse(((AnyType) value).getAnyAttribute());
				}
				
				if (method != null) {
					try {						
						method.invoke(config, new Object[] { value });
					} catch (Exception e) {
						logger.log(ILogger.WARNING, "Exception during bcast_stats parsing", e);
					}
				}
			}
		}
	}

	@Override
	public void main(IClickWatchContext ctx) {
		logger.log(ILogger.INFO, "Start analysis on experiment " , null);
		
		try {
			initialize(new PrintWriter("out.txt", "utf8"));
		} catch (Exception e) {
			Throwables.propagate(e);
		}
		perform(ctx.getAdapter(IExperimentProvider.class).getExperiment());
	}

	public static final void main(String args[]) {
		ClickWatchStandaloneSetup.doSetup();
		CWRecorderStandaloneSetup.doSetup();
		ClickWatchExternalLauncher.launch(args, PdrPlotAnalysis.class);
	}
}
