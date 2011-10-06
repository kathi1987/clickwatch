package de.hub.clickwatch.analysis.functions;

public interface Function<DomainType, ValueType> {

	public ValueType value(DomainType x);
	public Iterable<DomainType> domain();
}