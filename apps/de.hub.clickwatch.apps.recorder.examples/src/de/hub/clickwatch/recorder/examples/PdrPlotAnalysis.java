package de.hub.clickwatch.recorder.examples;

import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Inject;

import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.provider.TimeStampLabelProvider;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class PdrPlotAnalysis implements IClickWatchMain {
	
	private static final long TIME_PRECISION_PER_SECOND = 1000000000;
	private static final int SAMPLES = 2000;
	
	@Inject private DataBaseUtil dbUtil;
	@Inject private ILogger logger;
	
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
		this.mavrSize = (experiment.getEnd() - experiment.getStart()) / SAMPLES;
		
		for (Node nodeConfig: experiment.getNetwork().getNodes()) {
			Iterator<Handler> iterator = dbUtil.getHandlerIterator(experiment, 
					nodeConfig.getINetAddress(), 
					"device_wifi/link_stat/bcast_stats", 
					experiment.getStart(), experiment.getEnd());
			int i = 0;
			while(iterator.hasNext()) {
				Bcast_stats bcastStats = (Bcast_stats)iterator.next();
				long time = bcastStats.getTimestamp();
				String from = bcastStats.getEntry().getFrom();
				for(Link link: bcastStats.getEntry().getLink()) {
					String to = link.getTo();
					for(Link_info linkInfo: link.getLink_info()) {
						if (linkInfo.getRate() == 2) {
							addSample(from, to, time, linkInfo.getRev());
						}
					}
				}
				
				if (++i % 1000 == 0) {
					logger.log(ILogger.INFO, "perform at time " + new TimeStampLabelProvider().getText(time) 
							+ " on node " + nodeConfig.getINetAddress() + ", this is the " + i + "th sample.", null);
				}
				
				EcoreUtil.delete(bcastStats, true);
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
		ClickWatchExternalLauncher.launch(args, PdrPlotAnalysis.class);
	}
}
