package de.hub.clickwatch.apps.god.visuals;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

import peasy.PeasyCam;
import processing.core.PApplet;
import processing.core.PFont;
import controlP5.Button;
import controlP5.ControlFont;
import controlP5.ControlP5;
import controlP5.ControlWindow;
import controlP5.ListBox;
import controlP5.Textarea;

public class GodNetwork extends PApplet {
	private static final long serialVersionUID = 1256103591115689424L;
	private Map<String, NetworkNode> nodes = new HashMap<String, NetworkNode>();
	private Map<String, String> selectedRoute = new HashMap<String, String>();
	private NetworkSurrounding surrounding = null;
	private NodeRefresher nodeRefresher = null;
	private PFont font = null;
	private ControlFont ctrlFont = null;
	private PeasyCam camera = null;
	private ControlP5 controlp5 = null;
	private ListBox lbFirst, lbSecond = null;
	
	@Override
	public void setup() {
		size(950, 700, P3D);
		frameRate(15);
		smooth();
		
		camera = new PeasyCam(this, 0, 0, 0, 1100);
		surrounding = new NetworkSurrounding(this);
		font = createFont("Helvetica", 15, true);
		ctrlFont = new ControlFont(createFont("Helvetica", 12, true));
		nodeRefresher = new NodeRefresher(this);
		nodeRefresher.start();
		
		init_controlP5();
	}
	
	private void init_controlP5() {
		controlp5 = new ControlP5(this);
		controlp5.setAutoDraw(false);
		
		ControlWindow controlWindow = controlp5.addControlWindow("controlWindow", 20, 20, 380, 230, 10);
		controlWindow.hideCoordinates();
		controlWindow.setBackground(color(240));
		
		Button btn = controlp5.addButton("add", 0f, 170, 80, 40, 24);
		btn.setTab(controlWindow, "default");
		btn.captionLabel().setControlFont(ctrlFont);
		
		Textarea tl = controlp5.addTextarea("label1", "first node", 20, 20, 100, 24);
		tl.setTab(controlWindow, "default");
		tl.setColor(0xff000000);
		
		lbFirst = controlp5.addListBox("firstNode", 20, 50, 160, 170);
		lbFirst.captionLabel().set("choose...");
		lbFirst.setTab(controlWindow, "default");
		lbFirst.setItemHeight(16);
		lbFirst.setBarHeight(16);
		lbFirst.captionLabel().style().marginTop = 3;
		lbFirst.actAsPulldownMenu(true);
		
		tl = controlp5.addTextarea("label2", "second node", 200, 20, 170, 24);
		tl.setTab(controlWindow, "default");
		tl.setColor(0xff000000);
		
		lbSecond = controlp5.addListBox("secondNode", 200, 50, 160, 170);
		lbSecond.captionLabel().set("choose...");
		lbSecond.setTab(controlWindow, "default");
		lbSecond.setItemHeight(16);
		lbSecond.setBarHeight(16);
		lbSecond.captionLabel().style().marginTop = 3;
		lbSecond.actAsPulldownMenu(true);
	}
	
	public void add(int value) {
		if ((!lbFirst.captionLabel().getText().equals("choose...")) &&
			(!lbSecond.captionLabel().getText().equals("choose..."))){
			
			selectedRoute.put(lbFirst.captionLabel().getText(), lbSecond.captionLabel().getText());
		}
	}
	
	@Override
	public void draw() {
		controlp5.draw();
		
		background(255);
		pushMatrix();
		translate(width/2f, height/2f);
		lights();
		popMatrix();
		
		rotate(QUARTER_PI);
		surrounding.display();
		rotate(-QUARTER_PI);
		
		synchronized (nodes) {
			Iterator<String> nodeIter = nodes.keySet().iterator();
			while (nodeIter.hasNext()) {
				NetworkNode node = nodes.get(nodeIter.next());
				
				Iterator<String> nodeIter2 = nodes.keySet().iterator();
				boolean startDisplay = false;
				while (nodeIter2.hasNext()) {
					NetworkNode node2 = nodes.get(nodeIter2.next());
					
					if (startDisplay) {
						new NetworkLink(this, node.getMac(), node2.getMac()).display(camera.getRotations()[0], camera.getRotations()[1], camera.getRotations()[2]);
					} else if (node2.equals(node)) {
						startDisplay = true;
					}
				}
				
				node.display(camera.getRotations()[0], camera.getRotations()[1], camera.getRotations()[2]);
			}
		}
		
		for (String r : selectedRoute.keySet()) {
			new NetworkLink(this, r, selectedRoute.get(r), true).display(camera.getRotations()[0], camera.getRotations()[1], camera.getRotations()[2]);
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
	
	public PFont getTheFont() {
		return this.font;
	}
	
	public void addNode(String mac) {
		synchronized (nodes) {
			nodes.put(mac, new NetworkNode(this, mac));
			lbFirst.addItem(mac, 0);
			lbSecond.addItem(mac, 0);
		}
	}
	
	public void removeNodes(Set<String> removeNodes) {
		synchronized (nodes) {
			for (String remove : removeNodes) {
				nodes.remove(remove);
				lbFirst.removeItem(remove);
				lbSecond.removeItem(remove);
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
	
	public float getZ(String mac) {
		if (nodes.containsKey(mac)) {
			return nodes.get(mac).getZ();
		} else {
			return -1f;
		}
	}
}
