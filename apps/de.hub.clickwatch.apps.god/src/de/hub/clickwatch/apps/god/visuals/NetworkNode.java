package de.hub.clickwatch.apps.god.visuals;

import de.hub.clickwatch.apps.god.Server;

public class NetworkNode {
	private final float mousePressDiff = 7f;
	private float x,y,z;
	private String mac;
	private GodNetwork parent = null;
	private boolean selected = false;
	private boolean preselectedRoute = false;
	
	public NetworkNode(GodNetwork parent, String mac) {
		this.parent = parent;
		this.mac = mac;
		
		float[] pos = Server.getSzenario().get_AP_METRIC_POSITION(mac);
		if (pos[0] == -1f) {
			this.x = parent.random(-800, 800);
			this.y = parent.random(-700, 700);
			this.z = parent.random(-700, 700);
		} else {
			this.x = pos[0]*8f;
			this.y = pos[1]*8f;
			this.z = pos[2]*8f;
		}
	}
	
	public void display(float angleX, float angleY, float angleZ) {
		parent.fill(255);
		if (preselectedRoute) {
			parent.stroke(parent.color(160,30,20));
		} else {
			parent.stroke(180,180,180,100);
		}
		parent.ellipseMode(GodNetwork.CENTER);
		
		if (selected) {
			x = parent.mouseX;
			y = parent.mouseY;
		}
		
		parent.pushMatrix();
		parent.translate(x, y, z);
		parent.strokeWeight(1);
		parent.noFill();
		parent.sphereDetail(20);
		parent.sphere(20);
		parent.fill(90);
		parent.textAlign(GodNetwork.CENTER);
		parent.textFont(parent.getTheFont());
		
		parent.rotateX(angleX);
		parent.rotateY(angleY);
		parent.rotateZ(angleZ);
		parent.text(mac, 0, 20, 0);
		parent.popMatrix();
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
	
	public float getZ() {
		return this.z;
	}
}
