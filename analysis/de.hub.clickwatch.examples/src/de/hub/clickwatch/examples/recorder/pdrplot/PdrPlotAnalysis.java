package de.hub.clickwatch.examples.recorder.pdrplot;

import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.FeatureMap;
import org.eclipse.emf.ecore.xml.type.AnyType;

import com.google.inject.Inject;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.provider.TimeStampLabelProvider;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.tests.TestUtil;
import de.hub.clickwatch.util.ILogger;

public class PdrPlotAnalysis {
	
	@Inject private DataBaseUtil dbUtil;
	@Inject private ILogger logger;
	
	private FeatureMapParserConfig fmpc = null;
	private FeatureMapParser parser = null;

	public void perform(ExperimentDescr experiment) {
		fmpc = new FeatureMapParserConfig();
		parser = new FeatureMapParser(fmpc);
		
		long duration = experiment.getEnd() - experiment.getStart();
		long durationInSeconds = duration / 1000000;
		for (Node nodeConfig: experiment.getNetwork().getNodes()) {
			for (long i = 0; i < durationInSeconds; i++) {
				logger.log(ILogger.INFO, "perform at time " + new TimeStampLabelProvider().getText(i*1000000 + experiment.getStart()) 
						+ " on node " + nodeConfig.getINetAddress(), null);
				
				Handler bcastStats = dbUtil.getHandler(experiment, nodeConfig.getINetAddress(), "device_wifi/link_stat/bcast_stats", i*1000000 + experiment.getStart());
				fmpc.time = bcastStats.getTimestamp() / 1000000;
				parser.parse(bcastStats.getAny());
				
				EcoreUtil.delete(bcastStats, true);
				TestUtil.report("mem-leak?", i, 10);
			}
		}
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
				//System.out.println(from+"x"+link.to+" "+time+" "+link.fwd+" "+link.rev);
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

	
}
