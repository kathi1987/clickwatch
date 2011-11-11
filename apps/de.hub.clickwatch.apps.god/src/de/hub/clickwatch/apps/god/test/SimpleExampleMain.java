package de.hub.clickwatch.apps.god.test;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;
import de.hub.clickwatch.util.ILogger;

public class SimpleExampleMain implements IClickWatchMain {
	
	@Inject private ILogger logger;
	@Inject private INodeConnectionProvider nodeConnectionProvider;
	
	@Override
	public void main(IClickWatchContext ctx) {
		INodeConnection nodeConnection = nodeConnectionProvider.createConnection("localhost", "7777");
		
		IHandlerAdapter handlerAdapter = nodeConnection.getAdapter(IHandlerAdapter.class);
		Bcast_stats bcastStats = (Bcast_stats)handlerAdapter.getHandler("device_wifi/link_stat/bcast_stats");
		String from = bcastStats.getEntry().getFrom();
		for(Link link: bcastStats.getEntry().getLink()) {
			String to = link.getTo();
			for(Link_info linkInfo: link.getLink_info()) {
				if (linkInfo.getRate() == 2) {
					logger.log(ILogger.INFO, "LINK: " + from + "->" + to + ": " + "pdr=" + linkInfo.getRev(), null);
				}
			}
		}
		
		nodeConnection.close();
	}

	public static final void main(String args[]) {
		args = new String[] { "-d", "-s", "-r../../ui/de.hub.clickwatch.ui/resources/records/record_11-06-23.clickwatchmodel" };
		//args = new String[] { "-d", "-s"};
		ClickWatchExternalLauncher.launch(args, SimpleExampleMain.class);
	}
}
