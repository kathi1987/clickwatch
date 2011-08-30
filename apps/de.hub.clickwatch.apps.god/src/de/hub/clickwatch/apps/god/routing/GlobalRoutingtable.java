package de.hub.clickwatch.apps.god.routing;

import java.io.Serializable;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import de.hub.clickwatch.apps.god.Server;

public class GlobalRoutingtable implements Serializable {
	private static final long serialVersionUID = -6046518405036658052L;
	private Set<String> nodes = new HashSet<String>();
	private Map<String, DijkstraContainer> routingtable = new HashMap<String, DijkstraContainer>();
	private Server parent = null;
	
	public GlobalRoutingtable(Server parent) {
		this.parent = parent;
	}
	
	public Map<String, DijkstraContainer> getRoutingtable() {
		return routingtable;
	}
	
	public Set<String> getNodes() {
		return new HashSet<String>(nodes);
	}
	
	public void removeUsedLink(String from, String to) {
		for (String s : routingtable.keySet()) {
			routingtable.get(s).removeLink(from, to);
		}
	}
	
	public void upgradeUsedLink(String from, String to, int metricDiff) {
		for (String s : routingtable.keySet()) {
			routingtable.get(s).upgradeLink(from, to, metricDiff);
		}
	}
	
	public void degradeUsedLink(String from, String to) {
		for (String s : routingtable.keySet()) {
			routingtable.get(s).degradeLink(from, to);
		}
	}
	
	public void addLink(String from, String to) {
		nodes.add(from);
		nodes.add(to);
		
		if (!routingtable.containsKey(from)) {
			routingtable.put(from, new DijkstraContainer(parent, from));
		}
		if (!routingtable.containsKey(to)) {
			routingtable.put(to, new DijkstraContainer(parent, to));
		}
		
		for (String s : routingtable.keySet()) {
			routingtable.get(s).runDijkstra();
		}
	}
}
