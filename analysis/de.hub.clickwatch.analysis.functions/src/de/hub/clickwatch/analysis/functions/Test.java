package de.hub.clickwatch.analysis.functions;

import java.util.Iterator;

import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Channel_info;
import de.hub.clickwatch.specificmodels.brn.seismo_latestchannelinfos.Latestchannelinfos;

public class Test {
	
	public interface MyIterator<Type> {
		public boolean hasNext();
		public Type next();
		public Type peek();
	}
	
	@SuppressWarnings("rawtypes")
	public interface Transformation<Input extends Function, Output extends Function> {
		public Output perform(Input input);
	}
	
	public class Filter implements Transformation<Function<String, ? extends Object>, Function<Object, Object>> {
		@Override
		public Function<Object, Object> perform(final Function<String, ? extends Object> input) {
			return new Function<Object, Object>() {
				@Override
				public Object value(Object x) {
					return input.value("seismo/latestchannelinfos");
				}

				@Override
				public Iterable<Object> domain() {
					return null;
				}
			};
		}
	}
	
	public class SeismoInfo implements Transformation<Function<Object, Handler>, Function<Long, Function<Integer, Integer>>> {
		@Override
		public Function<Long, Function<Integer, Integer>> perform(
				final Function<Object, Handler> input) {
			return new IteratableFunction<Long, Function<Integer,Integer>>() {
				@Override
				protected ValuePairIterator<Long, Function<Integer, Integer>> valuePairs() {	
					return new ValuePairIterator<Long, Function<Integer,Integer>>() {
						Iterator<Channel_info> current_it = null;
						Iterator<Object> handler_it = input.domain().iterator();
						@Override
						public boolean hasNext() {
							if (current_it == null) {
								while (handler_it.hasNext()) {
									Handler handler = input.value(handler_it.next());
									Latestchannelinfos latestchannelinfos = (Latestchannelinfos)handler;
									current_it = latestchannelinfos.getChannel_infos().getChannel_info().iterator();
									if (current_it.hasNext()) {
										return true;
									}
								}
								return false;
							} else {
								if (current_it.hasNext()) {
									return true;
								} else {
									current_it = null;
									return this.hasNext();
								}
							}
						}

						@SuppressWarnings({ "unchecked", "rawtypes" })
						@Override
						public Pair<Long, Function<Integer, Integer>> next() {
							final Channel_info next = current_it.next();
							return new Pair(next.getTime(), new HashedFunction<Integer, Integer>() {
								@Override
								protected Integer computeValue(Integer x) {
									if (x == 0) {
										return next.getChannel_0();
									} else if (x == 1) {
										return next.getChannel_0();
									} else if (x == 2) {
										return next.getChannel_0();
									} else if (x == 3) {
										return next.getChannel_0();
									} else {
										throw new IllegalArgumentException();
									}
								}
							});
						}
					};
				}
			};
		}
	}
	
	class SimpleSeismoPlot implements Transformation<Function<Node, Function<String, Function<Long, Handler>>>, 
			Function<Node, Function<Long, Function<Integer, Integer>>>> {
		@Override
		public Function<Node, Function<Long, Function<Integer, Integer>>> perform(
				final Function<Node, Function<String, Function<Long, Handler>>> input) {
			return new Function<Node, Function<Long, Function<Integer, Integer>>>() {
				@Override
				public Function<Long, Function<Integer, Integer>> value(Node x) {
					Function<Object, Object> filtered = new Filter().perform(input.value(x));
					Function<Object, Handler> handlers = (Function<Object,Handler>)filtered.value(null);
					return new SeismoInfo().perform(handlers);
				}

				@Override
				public Iterable<Node> domain() {
					return input.domain();
				}
			};
		}		
	}
}
