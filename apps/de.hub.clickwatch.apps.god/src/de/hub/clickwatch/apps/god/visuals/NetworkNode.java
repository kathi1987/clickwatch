package de.hub.clickwatch.apps.god.visuals;

public class NetworkNode {
	private final float mousePressDiff = 7f;
	private float x,y;
	private String mac;
	private GodNetwork parent = null;
	private boolean selected = false;
	
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
		
		if (selected) {
			x = parent.mouseX;
			y = parent.mouseY;
		}
		parent.ellipse(x, y, 10, 10);
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
