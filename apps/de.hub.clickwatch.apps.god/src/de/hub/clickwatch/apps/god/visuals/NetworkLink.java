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
	
	public void display() {
		LinktableLinkInformation inf = GlobalLinktable.getLinkInfos(from, to);
		if (inf != null) {
			parent.stroke(40);
			parent.strokeWeight(1.5f);
			parent.line(parent.getX(from), parent.getY(from), parent.getX(to), parent.getY(to));
			
			parent.fill(parent.color(20,170,40));
			parent.textFont(parent.getTheFont());
			parent.text(inf.getMetric(),
					parent.getX(from) + 0.5f * (parent.getX(to) - parent.getX(from)),
					parent.getY(from) + 0.5f * (parent.getY(to) - parent.getY(from)));
		}
	}
}
