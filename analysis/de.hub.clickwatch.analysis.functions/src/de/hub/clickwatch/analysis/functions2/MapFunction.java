package de.hub.clickwatch.analysis.functions2;

import java.util.Collection;

public interface MapFunction<FROM, TO> extends Function<FROM, TO> {

	public Collection<FROM> domain();
	public TO get(FROM x);
	
}
