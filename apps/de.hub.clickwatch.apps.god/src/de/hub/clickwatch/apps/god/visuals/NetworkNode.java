package de.hub.clickwatch.apps.god.visuals;

public class NetworkNode {
	private float x,y;
	private String mac;
	private GodNetwork parent = null;
	
	public NetworkNode(GodNetwork parent, String mac) {
		this.parent = parent;
		this.mac = mac;
		this.x = parent.random(1, parent.width-1);
		this.y = parent.random(1, parent.height-1);
	}
	
	public void display() {
		parent.noStroke();
		parent.fill(90);
		parent.ellipseMode(GodNetwork.CENTER);
		parent.ellipse(x, y, 10, 10);
		
	}
	
	public String getMac() {
		return this.mac;
	}
	
	public float getX() {
		return this.x;
	}
	
	public float getY() {
		return this.y;
	}
}
