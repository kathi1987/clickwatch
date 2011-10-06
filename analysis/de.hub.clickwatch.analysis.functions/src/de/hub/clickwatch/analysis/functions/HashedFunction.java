package de.hub.clickwatch.analysis.functions;

import java.util.HashMap;
import java.util.Map;

public abstract class HashedFunction<DomainType, ValueType> implements Function<DomainType, ValueType> {

	private Map<DomainType, ValueType> values = null;
	
	@Override
	public ValueType value(DomainType x) {
		initialize();
		ValueType result = values.get(x);
		if (result == null) {
			result = computeValue(x);
			put(x, result);
		}
		return result;
	}

	@Override
	public Iterable<DomainType> domain() {
		initialize();
		return values.keySet();
	}
	
	protected void put(DomainType x, ValueType y) {
		values.put(x, y);
	}
	
	private void initialize() {
		if (values == null) {
			values = new HashMap<DomainType, ValueType>();
			fill();
		}
	}
	
	protected void fill() {
		
	}
	
	protected abstract ValueType computeValue(DomainType x);

}
