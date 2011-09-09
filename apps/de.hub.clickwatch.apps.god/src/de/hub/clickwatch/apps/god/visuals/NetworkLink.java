package de.hub.clickwatch.apps.god.visuals;

import de.hub.clickwatch.apps.god.information.LinktableLinkInformation;
import de.hub.clickwatch.apps.god.routing.GlobalLinktable;

public class NetworkLink {
	private String from, to;
	private GodNetwork parent = null;
	
	public NetworkLink(GodNetwork parent, String from, String to) {
		this.parent = parent;
		this.from = from;
		this.to = to;
	}
	
	public void display(float angleX, float angleY, float angleZ) {
		LinktableLinkInformation inf = GlobalLinktable.getLinkInfos(from, to);
		if (inf != null) {
			parent.pushMatrix();
			parent.stroke(40);
			parent.strokeWeight(1.5f);
			parent.line(parent.getX(from), parent.getY(from), parent.getZ(from), parent.getX(to), parent.getY(to), parent.getZ(to));
			
			parent.fill(parent.color(20,170,40));
			parent.textFont(parent.getTheFont());
			
			float x_from = parent.getX(from);
			float y_from = parent.getY(from);
			float z_from = parent.getZ(from);
			float x_to = parent.getX(to);
			float y_to = parent.getY(to);
			float z_to = parent.getZ(to);
			
			parent.translate(
					x_from + 0.5f * (x_to - x_from),
					y_from + 0.5f * (y_to - y_from),
					z_from + 0.5f * (z_to - z_from));
			
			parent.rotateX(angleX);
			parent.rotateY(angleY);
			parent.rotateZ(angleZ);
			
			parent.text(inf.getMetric(), 0, 0, 0);
			
			parent.popMatrix();
		}
	}
}
