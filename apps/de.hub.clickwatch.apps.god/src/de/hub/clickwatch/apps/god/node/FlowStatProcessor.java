package de.hub.clickwatch.apps.god.node;

import java.util.ArrayList;
import java.util.List;

import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.FlowRoute;
import de.hub.clickwatch.apps.god.information.FlowRouteChildren;
import de.hub.clickwatch.apps.god.information.FlowStatInformation;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Route_info;
import de.hub.clickwatch.specificmodels.brn.routing_dsr_stats_stats.Stats;

public class FlowStatProcessor implements NodeInformationProcessor {
	@Override
	public List<ClientInformations> handleInformations(Handler data) {
		if (data != null) {
			List<ClientInformations> flowStats = new ArrayList<ClientInformations>();
			Stats flowInfo = (Stats)data;
			
			FlowStatInformation flowStat = new FlowStatInformation();
			flowStat.setClientMac(flowInfo.getDsr_route_stats().getId());
			flowStat.setTime(System.currentTimeMillis());
			
			for (Route_info routeInf : flowInfo.getDsr_route_stats().getRoute_info()) {
				FlowRoute fr = new FlowRoute();
				fr.setSrc(routeInf.getSrc());
				fr.setDst(routeInf.getDst());
				
				List<FlowRouteChildren> children = new ArrayList<FlowRouteChildren>();
				for (Route r : routeInf.getRoute()) {
					FlowRouteChildren child = new FlowRouteChildren();
					child.setHop_count(r.getHop_count());
					child.setHops(r.getHops());
					child.setId(r.getId());
					child.setLast_usage(r.getLast_usage());
					child.setMetric(r.getMetric());
					child.setUsage(r.getUsage());
					
					children.add(child);
				}
				
				fr.setChildren(children);
				flowStat.getFlowRoutes().add(fr);
			}
        	
			flowStats.add(flowStat);
        	return flowStats;
        }
        
		return null;
	}

	@Override
	public List<ClientInformations> handleGenuineInformations(String xmlData) {
		System.err.println("<" + this.getClass().getName() + "> handleGenuineInformations is not supported in FlowStatProcessor");
		return null;
	}
}
