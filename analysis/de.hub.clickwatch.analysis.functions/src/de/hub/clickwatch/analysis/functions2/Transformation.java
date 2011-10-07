package de.hub.clickwatch.analysis.functions2;

public interface Transformation<FROM, TO> {
	
	public TO apply(FROM from);

}
