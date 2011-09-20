package de.hub.clickwatch.apps.god.visuals;

import de.hub.clickwatch.apps.god.Server;

public class NetworkNode {
	private float x,y,z;
	private String mac;
	private GodNetwork parent = null;
	
	public NetworkNode(GodNetwork parent, String mac) {
		this.parent = parent;
		this.mac = mac;
		
		float[] pos = Server.getSzenario().get_AP_METRIC_POSITION(mac);
		if (pos[0] == -1f) {
			this.x = 100f;//parent.random(-800, 800);
			this.y = 100f;//parent.random(-700, 700);
			this.z = 0f;//parent.random(-700, 700);
		} else {
			this.x = pos[0];
			this.y = pos[1];
			this.z = pos[2];
		}
	}
	
	public void display(float angleX, float angleY, float angleZ) {
		parent.fill(255);
		parent.stroke(180,180,180,100);
		parent.ellipseMode(GodNetwork.CENTER);
		
		parent.pushMatrix();
		parent.translate(x, y, z);
		parent.strokeWeight(1);
		parent.noFill();
		parent.sphereDetail(20);
		parent.sphere(14);
		parent.fill(90);
		parent.textAlign(GodNetwork.CENTER);
		parent.textFont(parent.getTheFont());
		
		parent.rotateX(angleX);
		parent.rotateY(angleY);
		parent.rotateZ(angleZ);
		parent.text(mac, 0, 20, 0);
		parent.popMatrix();
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
