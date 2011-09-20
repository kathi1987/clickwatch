package de.hub.clickwatch.apps.god.information;

import java.util.ArrayList;
import java.util.List;

public class RouteInformation {
	private String from, to;
	private List<RoutingtableLinkInformation> route = new ArrayList<RoutingtableLinkInformation>();
	
	public String getFrom() {
		return from;
	}
	public void setFrom(String from) {
		this.from = from;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public List<RoutingtableLinkInformation> getRoute() {
		return route;
	}
	public void setRoute(List<RoutingtableLinkInformation> route) {
		this.route = route;
	}
	
	
}
