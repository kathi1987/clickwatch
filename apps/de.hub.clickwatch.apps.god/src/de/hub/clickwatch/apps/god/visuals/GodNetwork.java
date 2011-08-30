package de.hub.clickwatch.apps.god.visuals;

import java.util.ArrayList;
import java.util.List;

import de.hub.clickwatch.apps.god.Server;

import processing.core.PApplet;

public class GodNetwork extends PApplet {
	private static final long serialVersionUID = 1256103591115689424L;
	private List<NetworkNode> nodes = new ArrayList<NetworkNode>();
	private NodeRefresher nodeRefresher = null;
	private static Server server = null;
	
	public Server getServer() {
		return server;
	}
	
	public static void myMain(String[] args, Server i_server) {
		server = i_server;
		main(args);
	}
	
	@Override
	public void setup() {
		size(800, 600, JAVA2D);
		smooth();
		
		nodeRefresher = new NodeRefresher(this);
		nodeRefresher.start();
	}
	
	@Override
	public void draw() {
		background(255);
		synchronized (nodes) {
			for (NetworkNode n : nodes) {
				n.display();
			}
		}
	}
	
	public void addNode(String mac) {
		synchronized (nodes) {
			nodes.add(new NetworkNode(this, mac));
		}
	}
	
	public List<String> getNodeNames() {
		List<String> names = new ArrayList<String>();
		synchronized (nodes) {
			for (NetworkNode node : nodes) {
				names.add(node.getMac());
			}
		}
		return names;
	}
}
