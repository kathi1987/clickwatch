package de.hub.clickwatch.apps.god.node;

import java.util.ArrayList;
import java.util.List;

import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.apps.god.information.RouteInformation;
import de.hub.clickwatch.apps.god.information.RoutingtableInformation;
import de.hub.clickwatch.apps.god.information.RoutingtableLinkInformation;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Link;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Route;
import de.hub.clickwatch.specificmodels.brn.lt_routes.Routes;

public class RoutingtableProcessor implements NodeInformationProcessor {

	@Override
	public List<ClientInformations> handleInformations(Handler data) {
		if (data != null) {
			List<ClientInformations> routingInfos = new ArrayList<ClientInformations>();
			Routes routes = (Routes)data;
			
			RoutingtableInformation routingtable = new RoutingtableInformation();
			routingtable.setClientMac(routes.getRoutetable().getId());
			routingtable.setTime(System.currentTimeMillis());
        	for (Route r : routes.getRoutetable().getRoute()) {
        		RouteInformation routeInf = new RouteInformation();
        		routeInf.setFrom(r.getFrom());
        		routeInf.setTo(r.getTo());
        		List<RoutingtableLinkInformation> exactRoute = new ArrayList<RoutingtableLinkInformation>();
        		for (Link l: r.getLink()) {
        			RoutingtableLinkInformation rlink = new RoutingtableLinkInformation();
        			rlink.setAge(l.getAge());
        			rlink.setSeq(l.getSeq());
        			rlink.setMetric(l.getMetric());
        			rlink.setFrom(l.getFrom());
        			rlink.setTo(l.getTo());
        			exactRoute.add(rlink);
        		}
        		routeInf.setRoute(exactRoute);
        		
        		routingtable.getRoutingtable().put(r.getFrom() + r.getTo(), routeInf);
        	}
        	
        	routingInfos.add(routingtable);
        	return routingInfos;
        }
		
		return null;
	}

	@Override
	public List<ClientInformations> handleGenuineInformations(String xmlData) {
		System.err.println("<" + this.getClass().getName() + "> handleGenuineInformations is not supported in RoutingtableProcessor");
		return null;
	}
	
}
