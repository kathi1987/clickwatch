package de.hub.clickwatch.apps.god.information;

public class FlowRouteChildren {
	private long id, metric, usage, hop_count;
	private double last_usage;
	private String hops;
	
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public long getMetric() {
		return metric;
	}
	public void setMetric(long metric) {
		this.metric = metric;
	}
	public long getUsage() {
		return usage;
	}
	public void setUsage(long usage) {
		this.usage = usage;
	}
	public long getHop_count() {
		return hop_count;
	}
	public void setHop_count(long hop_count) {
		this.hop_count = hop_count;
	}
	public double getLast_usage() {
		return last_usage;
	}
	public void setLast_usage(double last_usage) {
		this.last_usage = last_usage;
	}
	public String getHops() {
		return hops;
	}
	public void setHops(String hops) {
		this.hops = hops;
	}
}
