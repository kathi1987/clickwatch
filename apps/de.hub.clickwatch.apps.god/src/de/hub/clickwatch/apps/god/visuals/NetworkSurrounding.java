package de.hub.clickwatch.apps.god.visuals;

import de.hub.clickwatch.apps.god.SzenarioHWL;

public class NetworkSurrounding {
	private GodNetwork parent = null;
	private final float house_size_x = 60f * SzenarioHWL.MODEL_SIZE_FACTOR;
	private final float house_size_y = 16f * SzenarioHWL.MODEL_SIZE_FACTOR;
	private final float house_size_z = 3f * SzenarioHWL.MODEL_SIZE_FACTOR;
	private final float house_diff_y = 30f * SzenarioHWL.MODEL_SIZE_FACTOR;
	private final int num_floors = 5;
	private final int num_houses = 4;
	private final float house_offset_x = -40f * SzenarioHWL.MODEL_SIZE_FACTOR;
	private final float house_offset_y = -38.5f * SzenarioHWL.MODEL_SIZE_FACTOR;
	private final  float house_offset_z = -13f * SzenarioHWL.MODEL_SIZE_FACTOR;
	
	public NetworkSurrounding(GodNetwork parent) {
		this.parent = parent;
	}
	
	public void display() {
		parent.stroke(parent.color(230, 20, 20));
		parent.fill(parent.color(230, 20, 20));
		parent.box(8);	//tolja's room at (0,0,0)
		
		parent.fill(parent.color(190, 100));
		parent.noStroke();
		for (int house = 0; house < num_houses; house++) {
			parent.pushMatrix();
			parent.translate(house_offset_x, house_offset_y + house * house_diff_y, house_offset_z);
			for (int floor = 0; floor < num_floors; floor++) {
				parent.translate(0, 0, house_size_z);
				parent.rect(0, 0, house_size_x, house_size_y);
			}
			parent.popMatrix();
		}
	}
}
