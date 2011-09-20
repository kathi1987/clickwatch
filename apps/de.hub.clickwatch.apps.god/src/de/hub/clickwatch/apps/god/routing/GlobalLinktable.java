package de.hub.clickwatch.apps.god.routing;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.StringTokenizer;

import de.hub.clickwatch.apps.god.SzenarioHWL;
import de.hub.clickwatch.apps.god.information.LinktableLinkInformation;

public class GlobalLinktable implements Serializable {
	private static final long serialVersionUID = 6406600578300311068L;
	private static Map<String, LinktableLinkInformation> linktable = new HashMap<String, LinktableLinkInformation>();
	
	public static LinktableLinkInformation getLinkInfos(String from, String to) {
		if (linktable.containsKey(from + SzenarioHWL.LINKTABLE_SEPARATOR + to)) {
			return linktable.get(from + SzenarioHWL.LINKTABLE_SEPARATOR + to);
		}
		
		if (linktable.containsKey(to + SzenarioHWL.LINKTABLE_SEPARATOR + from)) {
			return linktable.get(to + SzenarioHWL.LINKTABLE_SEPARATOR + from);
		}
		
		return null;
	}
	
	public static Set<String> getNeighbors(String node) {
		Set<String> neighbors = new HashSet<String>();
		for (String link : linktable.keySet()) {
			if (linktable.get(link).getMetric() < SzenarioHWL.LINK_USE_IN_DIJKSTRA_MAX_VALUE) {
				if (link.startsWith(node)) {
					StringTokenizer strTok = new StringTokenizer(link, "" + SzenarioHWL.LINKTABLE_SEPARATOR);
					strTok.nextToken();
					neighbors.add(strTok.nextToken());
				} else if (link.endsWith(node)){
					StringTokenizer strTok = new StringTokenizer(link, "" + SzenarioHWL.LINKTABLE_SEPARATOR);
					neighbors.add(strTok.nextToken());
				}
			}
		}
		return neighbors;
	}
	
	public static void removeFromGlobalLinktableIfExistent(String fromTo) {
		if ((fromTo != null) && (linktable.containsKey(fromTo))) {
			StringTokenizer strTok = new StringTokenizer(fromTo, "" + SzenarioHWL.LINKTABLE_SEPARATOR);
			if (strTok.countTokens() == 2) {
				String from = strTok.nextToken();
				String to = strTok.nextToken();
				
				if (linktable.containsKey(fromTo)) {
					linktable.remove(fromTo);
					GlobalRoutingtable.removeUsedLink(from, to);
				}
			} else {
				System.err.println("WARNING: someone tries to remove a link, but does not provide exactly 2 node mac-addresses, but: " + strTok.countTokens());
			}
		}
	}
	
	public static void updateOrAddToGlobalLinktable(String fromTo, LinktableLinkInformation infos) {
		if ((fromTo != null) && (infos != null)) {
			StringTokenizer strTok = new StringTokenizer(fromTo, "" + SzenarioHWL.LINKTABLE_SEPARATOR);
			if (strTok.countTokens() == 2) {
				String from = strTok.nextToken();
				String to = strTok.nextToken();
				
				if (linktable.containsKey(fromTo)) {
					updateLinktable(from, to, infos);
				} else {
					addToLinktable(from, to, infos);
				}
			} else {
				System.err.println("WARNING: someone tries to update a link, but does not provide exactly 2 node mac-addresses, but: " + strTok.countTokens());
			}
		}
	}
	
	private static void updateLinktable(String from, String to, LinktableLinkInformation infos) {
		if (linktable.containsKey(from + SzenarioHWL.LINKTABLE_SEPARATOR + to)) {
			
			int metricDiff = linktable.get(from + SzenarioHWL.LINKTABLE_SEPARATOR + to).getMetric() - infos.getMetric();
			linktable.put(from + SzenarioHWL.LINKTABLE_SEPARATOR + to, infos);
			
			if (metricDiff >= 0) {
				GlobalRoutingtable.upgradeUsedLink(from, to, metricDiff);	//new link is better (smaller value)
			} else {
				GlobalRoutingtable.degradeUsedLink(from, to);	//new link is worse (bigger value)
			}
		}
	}
	
	private static void addToLinktable(String from, String to, LinktableLinkInformation infos) {
		if (infos.getMetric() < SzenarioHWL.LINK_ADD_MIN_THRESHOLD) {
			linktable.put(from + SzenarioHWL.LINKTABLE_SEPARATOR + to, infos);
			
			GlobalRoutingtable.addLink(from, to);
		}
	}
}
