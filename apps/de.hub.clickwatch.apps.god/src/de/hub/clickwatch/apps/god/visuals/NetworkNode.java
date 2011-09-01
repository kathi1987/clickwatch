package de.hub.clickwatch.apps.god.visuals;

public class NetworkNode {
	private final float mousePressDiff = 7f;
	private float x,y;
	private String mac;
	private GodNetwork parent = null;
	private boolean selected = false;
	private boolean preselectedRoute = false;
	
	public NetworkNode(GodNetwork parent, String mac) {
		this.parent = parent;
		this.mac = mac;
		this.x = parent.random(10, parent.width-20);
		this.y = parent.random(10, parent.height-20);
	}
	
	public void display() {
		parent.fill(255);
		if (preselectedRoute) {
			parent.stroke(parent.color(160,30,20));
		} else {
			parent.stroke(90);
		}
		parent.strokeWeight(3);
		parent.ellipseMode(GodNetwork.CENTER);
		
		if (selected) {
			x = parent.mouseX;
			y = parent.mouseY;
		}
		parent.ellipse(x, y, 12, 12);
		
		parent.fill(90);
		parent.textAlign(GodNetwork.CENTER);
		parent.textFont(parent.getTheFont());
		parent.text(mac, x, y+19);
	}
	
	public boolean selectItem(int posX, int posY) {
		if ((GodNetwork.abs(posX - x) < mousePressDiff) 
			&& (GodNetwork.abs(posY - y) < mousePressDiff)) {
			selected = true;
			return true;
		}
		return false;
	}
	
	public void deselectItem() {
		selected = false;
	}
	
	public void setPreselection(boolean val) {
		preselectedRoute = val;
	}
	
	public boolean getPreselection() {
		return preselectedRoute;
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
