package de.hub.clickwatch.apps.examples;

import com.google.inject.Inject;

import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IClickWatchModelProvider;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link_info;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Nb;
import de.hub.clickwatch.specificmodels.brn.device_wifi_wifidevice_cst_stats.Stats;
import de.hub.clickwatch.specificmodels.brn.util.NetworkUtil;

public class LinkLevelMeassurement implements IClickWatchMain {
	@Inject NetworkUtil networkUtil;
	
	@Override
	public void main(IClickWatchContext ctx) {
		Network network = ctx.getAdapter(IClickWatchModelProvider.class).getNetwork();		
		for (Node node: network.getNodes()) {
			Bcast_stats bcastStats = networkUtil.getSpecificHandler(node, Bcast_stats.class);			
			for (Link link: bcastStats.getEntry().getLink()) {				
				for (Link_info linkInfo: link.getLink_info()) {
					Node to = networkUtil.navigateMacAddr(network, link.getTo());
					if (to != null) {
						Stats stats = networkUtil.getSpecificHandler(to, Stats.class);
						for (Nb nb: stats.getChannelstats().getNeighbourstats().getNb()) {
							if (nb.getAddr().equals(bcastStats.getEntry().getFrom())) {
								System.out.println(
										nb.getRssi() + ", " + 
										linkInfo.getRev() + ", " + 
										stats.getChannelstats().getPhy().getHwbusy());
							}											
						}
					}
				}
			}
		}		
	}
	
	public static void main(String[] args) {
		ClickWatchExternalLauncher.launch(args, LinkLevelMeassurement.class);
	}
}
