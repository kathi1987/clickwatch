package de.hub.clickwatch.analysis.functions;

import java.util.Iterator;

public abstract class IteratableFunction<DomainType, ValueType> implements Function<DomainType, ValueType> {

	private class DomainIterator implements Iterator<DomainType> {
		private ValuePairIteratorContainer valuePairs = new ValuePairIteratorContainer(valuePairs());
		private DomainType currentX = null;
		private ValueType currentY = null;
		
		@Override
		public boolean hasNext() {
			return valuePairs.hasNext();
		}

		@Override
		public DomainType next() {
			valuePairs.next();
			currentX = valuePairs.getDomainValue();
			currentY = valuePairs.getValue();
			return currentX;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}		
	}
	
	protected abstract ValuePairIterator<DomainType, ValueType> valuePairs();
	
	public interface ValuePairIterator<DomainType, ValueType> {
		public boolean hasNext();
		public Pair<DomainType, ValueType> next();
	}
	
	public static class Pair<DomainType, ValueType> {
		private final DomainType x;
		private final ValueType y;
		public Pair(DomainType x, ValueType y) {
			this.x = x;
			this.y = y;
		}
	}
	
	private class ValuePairIteratorContainer {
		private final ValuePairIterator<DomainType, ValueType> it;
		private Pair<DomainType, ValueType> current = null;
		
		public ValuePairIteratorContainer(
				ValuePairIterator<DomainType, ValueType> it) {
			this.it = it;
		}
		
		public boolean hasNext() {
			return it.hasNext();
		}
		
		public void next() {
			current = it.next();
		}
	
		public DomainType getDomainValue() {
			return current.x;
		}
		public ValueType getValue() {
			return current.y;
		}
	}
	
	private DomainIterator currentIterator = null;
 	
	@Override
	public ValueType value(DomainType x) {
		if (currentIterator != null) {
			if (currentIterator.currentX == x) {
				return currentIterator.currentY;
			}
		}
		
		// TODO through a warning about the probably unwanted iteration
		DomainIterator it = new DomainIterator();
		while(it.hasNext() && it.next() != x) {
			
		}
		return it.currentY;
	}

	@Override
	public Iterable<DomainType> domain() {
		return new Iterable<DomainType>() {
			@Override
			public Iterator<DomainType> iterator() {
				currentIterator = new DomainIterator();
				return currentIterator;
			}
		};
	}
}
