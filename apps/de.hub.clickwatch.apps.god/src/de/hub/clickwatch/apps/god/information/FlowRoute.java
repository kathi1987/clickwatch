package de.hub.clickwatch.apps.god.information;

import java.util.ArrayList;
import java.util.List;

public class FlowRoute {
	private String src, dst;
	private List<FlowRouteChildren> children = new ArrayList<FlowRouteChildren>();
	
	public String getSrc() {
		return src;
	}
	public void setSrc(String src) {
		this.src = src;
	}
	public String getDst() {
		return dst;
	}
	public void setDst(String dst) {
		this.dst = dst;
	}
	public List<FlowRouteChildren> getChildren() {
		return children;
	}
	public void setChildren(List<FlowRouteChildren> children) {
		this.children = children;
	}
}
