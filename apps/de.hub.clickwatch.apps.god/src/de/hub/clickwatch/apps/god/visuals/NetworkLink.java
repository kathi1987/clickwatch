package de.hub.clickwatch.apps.god.visuals;

import java.util.StringTokenizer;

import de.hub.clickwatch.apps.god.SzenarioHWL;
import de.hub.clickwatch.apps.god.information.LinktableLinkInformation;
import de.hub.clickwatch.apps.god.routing.GlobalLinktable;
import de.hub.clickwatch.apps.god.routing.GlobalRoutingtable;

public class NetworkLink {
	private String from, to;
	private GodNetwork parent = null;
	private boolean isRoute = false;
	
	public NetworkLink(GodNetwork parent, String from, String to) {
		this(parent, from, to, false);
	}
	
	public NetworkLink(GodNetwork parent, String from, String to, boolean isAroute) {
		this.parent = parent;
		this.from = from;
		this.to = to;
		this.isRoute = isAroute;
	} 
	
	public void display(float angleX, float angleY, float angleZ) {
		LinktableLinkInformation inf = GlobalLinktable.getLinkInfos(from, to);
		if ((inf != null) || (isRoute)) {
			parent.pushMatrix();
			parent.strokeWeight(1.5f);
			parent.textFont(parent.getTheFont());
			
			float x_from = parent.getX(from);
			float y_from = parent.getY(from);
			float z_from = parent.getZ(from);
			float x_to = parent.getX(to);
			float y_to = parent.getY(to);
			float z_to = parent.getZ(to);
			
			if (isRoute) {
				parent.stroke(parent.color(170,10,10));
				parent.fill(parent.color(170,10,10));
				
				String route = GlobalRoutingtable.getShortestPath(from, to);
				if (route == null) {
					return;
				}
				StringTokenizer strTok = new StringTokenizer(route, "" + SzenarioHWL.LINKTABLE_SEPARATOR);
				
				String n1 = from;
				String n2 = from;
				while (strTok.hasMoreTokens()) {
					n1 = n2;
					n2 = strTok.nextToken();
					
					float xN1 = parent.getX(n1);
					float yN1 = parent.getY(n1);
					float zN1 = parent.getZ(n1);
					float xN2 = parent.getX(n2);
					float yN2 = parent.getY(n2);
					float zN2 = parent.getZ(n2);
					
					parent.pushMatrix();
					parent.translate(
							xN1 + 0.5f * (xN2 - xN1),
							yN1 + 0.5f * (yN2 - yN1),
							zN1 + 0.5f * (zN2 - zN1));
					
					parent.rotateX(angleX);
					parent.rotateY(angleY);
					parent.rotateZ(angleZ);
					parent.text(GlobalRoutingtable.getShortestLength(from, to), 0, 20, 0);
					parent.popMatrix();
					
					parent.line(xN1, yN1, zN1, xN2, yN2, zN2);
				}
				
			} else {
				parent.stroke(40);
				parent.fill(parent.color(20,170,40));
				parent.line(parent.getX(from), parent.getY(from), parent.getZ(from), parent.getX(to), parent.getY(to), parent.getZ(to));
				
				parent.translate(
						x_from + 0.5f * (x_to - x_from),
						y_from + 0.5f * (y_to - y_from),
						z_from + 0.5f * (z_to - z_from));
				
				parent.rotateX(angleX);
				parent.rotateY(angleY);
				parent.rotateZ(angleZ);
				
				parent.text(inf.getMetric(), 0, 0, 0);
			}
			
			parent.popMatrix();
		}
	}
}
