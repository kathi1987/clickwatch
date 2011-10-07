package de.hub.clickwatch.analysis.functions2;

import static de.hub.clickwatch.recorder.database.DataBaseUtil.createHandle;

import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Queue;
import java.util.concurrent.ConcurrentLinkedQueue;

import org.eclipse.core.runtime.NullProgressMonitor;

import com.google.inject.Inject;

import de.hub.clickwatch.analysis.functions2.Function.FunctionIterator;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;

public class BasicTransformations {
	
	@Inject private DataBaseUtil dbUtil;
	
	private abstract class AbstractMapFunction<FROM, TO> implements MapFunction<FROM, TO> {
		@Override
		public FunctionIterator<FROM, TO> iterator() {
			final Iterator<FROM> domainIterator = domain().iterator();
			return new AbstractFunctionIterator<FROM, TO>() {
				@Override
				public boolean hasNext() {
					return domainIterator.hasNext();
				}

				@Override
				protected Pair<FROM, TO> computeNext() {
					FROM x = domainIterator.next();
					return new PairImpl<FROM, TO>(x, get(x));
				}
			};
		}
	}
	
	public <Type> Id<Type> filter(final String key, final MapFunction<String, Type> function) {
		return new Id<Type>() {
			@Override
			public Type get() {
				return function.get(key);
			}
		};
	}
	
	public MapFunction<Node, MapFunction<String, Function<Long, Handler>>> cwdb(final Record record) {
		return new AbstractMapFunction<Node, MapFunction<String,Function<Long,Handler>>>() {

			@Override
			public Collection<Node> domain() {
				return record.getConfiguration().getNodes();
			}

			@Override
			public MapFunction<String, Function<Long, Handler>> get(final Node node) {
				return new AbstractMapFunction<String, Function<Long,Handler>>() {
					@Override
					public Collection<String> domain() {
						// TODO
						return Collections.EMPTY_LIST;
					}

					@Override
					public Function<Long, Handler> get(final String handlerName) {
						final Iterator<Handler> iterator = dbUtil.getHandlerIterator(
								createHandle(record, node.getINetAddress(), handlerName),
								new NullProgressMonitor());
						return new Function<Long, Handler>() {
							@Override
							public FunctionIterator<Long, Handler> iterator() {
								return new AbstractFunctionIterator<Long, Handler>() {

									@Override
									public boolean hasNext() {
										return iterator.hasNext();
									}

									@Override
									protected Pair<Long, Handler> computeNext() {
										Handler nextHandler = iterator.next();
										return new PairImpl<Long, Handler>(nextHandler.getTimestamp(), nextHandler);
									}
								};
							}
						};
					}
				};
			}
		};
	}
	
	private class PairImpl<FROM, TO> implements Pair<FROM, TO> {
		private final FROM from;
		private final TO to;
		public PairImpl(FROM from, TO to) {
			super();
			this.from = from;
			this.to = to;
		}
		public FROM getX() {
			return from;
		}
		public TO getY() {
			return to;
		}
	}
	
	private abstract class AbstractFunctionIterator<FROM, TO> implements FunctionIterator<FROM, TO> {
		private Pair<FROM, TO> current = null;
		
		@Override
		public final Pair<FROM, TO> next() {
			current = computeNext();
			return current;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

		@Override
		public final Pair<FROM, TO> current() {
			return current;
		}
		
		protected abstract Pair<FROM, TO> computeNext();
	}
	
	private abstract class FunctionBasedFunction<FROM1, TO1, FROM2, TO2> implements Function<FROM2, TO2> {
		private final Function<FROM1, TO1> baseFunction;

		public FunctionBasedFunction(Function<FROM1, TO1> baseFunction) {
			super();
			this.baseFunction = baseFunction;
		}

		@Override
		public FunctionIterator<FROM2, TO2> iterator() {
			final FunctionIterator<FROM1, TO1> baseIterator = baseFunction.iterator();
			return new AbstractFunctionIterator<FROM2, TO2>() {
				@Override
				public boolean hasNext() {
					return baseIterator.hasNext();
				}

				@Override
				protected Pair<FROM2, TO2> computeNext() {
					return FunctionBasedFunction.this.computeNext(baseIterator.next());
				}
			};
		}
		
		protected abstract Pair<FROM2, TO2> computeNext(Pair<FROM1, TO1> next);
	}

	public Id<Double> avg(final Function<?,Double> function) {
		return new Id<Double>() {
			@Override
			public Double get() {
				double sum = 0;
				int size = 0;
				for(Pair<?,Double> pair: function) {
					sum += pair.getY();
					size++;
				}
				if (size == 0) {
					return 0.0;
				} else {
					return sum / size;
				}
			}
		};
	}
	
	// def (double:double:double) window[int](double:double)
	public Function<Double, Function<Double, Double>> window(final int size, final Function<Double, Double> function) {
		return new FunctionBasedFunction<Double, Double, Double, Function<Double,Double>>(function) {
			private Queue<Pair<Double, Double>> values = new ConcurrentLinkedQueue<Pair<Double, Double>>();
			@Override
			protected Pair<Double, Function<Double, Double>> computeNext(
					Pair<Double, Double> next) {
				values.add(next);
				while (values.size() > size) {
					values.poll();
				}

				return new PairImpl<Double, Function<Double, Double>>(next.getX(), new Function<Double, Double>() {
					@Override
					public FunctionIterator<Double, Double> iterator() {
						final Iterator<Pair<Double, Double>> valuesIterator = values.iterator();
						return new AbstractFunctionIterator<Double, Double>() {
							@Override
							public boolean hasNext() {
								return valuesIterator.hasNext();
							}

							@Override
							protected Pair<Double, Double> computeNext() {
								return valuesIterator.next();
							}
						};
					}
				});
			}
		};
	}
	
	public Id<Double> sub(final Id<Double> one, final Id<Double> two) {
		return new Id<Double>() {
			@Override
			public Double get() {
				return one.get() - two.get();
			}
		};
	}
	
	private class FunctionImpl<FROM, TO> implements Function<FROM, TO> {
		private final FunctionIterator<FROM, TO> it;

		public FunctionImpl(
				de.hub.clickwatch.analysis.functions2.Function.FunctionIterator<FROM, TO> it) {
			super();
			this.it = it;
		}

		@Override
		public FunctionIterator<FROM, TO> iterator() {
			return it;
		}
	}
	
	public <FROM, TO1, TO2> Function<FROM, TO2> forFunction(Function<FROM, TO1> function, final Transformation<TO1, TO2> trans) {
		return new FunctionBasedFunction<FROM, TO1, FROM, TO2>(function) {
			@Override
			protected Pair<FROM, TO2> computeNext(Pair<FROM, TO1> next) {
				return new PairImpl<FROM, TO2>(next.getX(), trans.apply(next.getY()));
			}	
		};
	}
}
