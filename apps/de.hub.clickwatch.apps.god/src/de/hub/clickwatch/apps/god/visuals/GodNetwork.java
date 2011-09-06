package de.hub.clickwatch.apps.god.visuals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import de.hub.clickwatch.apps.god.routing.GlobalRoutingtable;

import processing.core.PApplet;
import processing.core.PFont;

public class GodNetwork extends PApplet {
	private static final long serialVersionUID = 1256103591115689424L;
	private Map<String, NetworkNode> nodes = new HashMap<String, NetworkNode>();
	private Map<String, String> selectedRoute = new HashMap<String, String>();
	private NodeRefresher nodeRefresher = null;
	private PFont font = null;
	
	@Override
	public void setup() {
		size(950, 700, JAVA2D);
		frameRate(15);
		smooth();
		
		font = createFont("Helvetica", 14, true);
		
		nodeRefresher = new NodeRefresher(this);
		nodeRefresher.start();
	}
	
	@Override
	public void draw() {
		background(255);
		synchronized (nodes) {
			Iterator<String> nodeIter = nodes.keySet().iterator();
			while (nodeIter.hasNext()) {
				NetworkNode node = nodes.get(nodeIter.next());
				
				Iterator<String> nodeIter2 = nodes.keySet().iterator();
				boolean startDisplay = false;
				while (nodeIter2.hasNext()) {
					NetworkNode node2 = nodes.get(nodeIter2.next());
					
					if (startDisplay) {
						new NetworkLink(this, node.getMac(), node2.getMac()).display();
					} else if (node2.equals(node)) {
						startDisplay = true;
					}
				}
				
				node.display();
			}
		}
		
		for (String r : selectedRoute.keySet()) {
			stroke(160,20,20);
			strokeWeight(2);
			line(getX(r), getY(r), getX(selectedRoute.get(r)), getY(selectedRoute.get(r)));
			
			fill(160,20,20);
			textFont(font);
			text(GlobalRoutingtable.getShortestLength(r, selectedRoute.get(r)) + "\n" + GlobalRoutingtable.getShortestPath(r, selectedRoute.get(r)),
					getX(r) + 0.5f * (getX(selectedRoute.get(r)) - getX(r)), 
					getY(r) + 0.5f * (getY(selectedRoute.get(r)) - getY(r)) + 17);
		}
	}
	
	@Override
	public void mousePressed() {
		synchronized (nodes) {
			for (String n : nodes.keySet()) {
				if (nodes.get(n).selectItem(mouseX, mouseY)) {
					if (mouseButton == RIGHT) {
						nodes.get(n).setPreselection(true);
						checkRoutePreselectionsAndAddRoute(n);
					}
					break;
				}
			}
		}
	}
	
	@Override
	public void keyPressed() {
		if (key == 'r') {
			synchronized (selectedRoute) {
				selectedRoute = new HashMap<String, String>();
			}
		}
	}
	
	@Override
	public void mouseReleased() {
		synchronized (nodes) {
			for (String n : nodes.keySet()) {
				nodes.get(n).deselectItem();
			}
		}
	}
	
	private void checkRoutePreselectionsAndAddRoute(String n2) {
		boolean added = false;
		for (String n : nodes.keySet()) {
			if ((!n.equals(n2)) && (nodes.get(n).getPreselection())) {
				selectedRoute.put(n, n2);
				added = true;
				break;
			}
		}
		
		if (added) {
			for (String n : nodes.keySet()) {
				nodes.get(n).setPreselection(false);
			}
		}
	}
	
	public PFont getTheFont() {
		return this.font;
	}
	
	public void addNode(String mac) {
		synchronized (nodes) {
			nodes.put(mac, new NetworkNode(this, mac));
		}
	}
	
	public void removeNodes(Set<String> removeNodes) {
		synchronized (nodes) {
			for (String remove : removeNodes) {
				nodes.remove(remove);
			}
		}
	} 
	
	public Set<String> getNodeNames() {
		return nodes.keySet();
	}
	
	public float getX(String mac) {
		if (nodes.containsKey(mac)) {
			return nodes.get(mac).getX();
		} else {
			return -1f;
		}
	}
	
	public float getY(String mac) {
		if (nodes.containsKey(mac)) {
			return nodes.get(mac).getY();
		} else {
			return -1f;
		}
	}
}
