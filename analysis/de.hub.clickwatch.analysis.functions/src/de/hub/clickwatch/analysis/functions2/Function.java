package de.hub.clickwatch.analysis.functions2;

import java.util.Iterator;

public interface Function<FROM, TO> extends Iterable<Pair<FROM,TO>> {
	
	public interface FunctionIterator<FROM, TO> extends Iterator<Pair<FROM,TO>> {
		public Pair<FROM,TO> current();	
	}
	
	public FunctionIterator<FROM, TO> iterator();

}
