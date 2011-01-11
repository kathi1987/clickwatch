package edu.hu.clickcontrol;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import click.ClickException;
import click.ControlSocket.HandlerInfo;

/**
 * Test implementation for {@link IClickSocket }. This implementation models an
 * example node with two elements (e1, e2). Each element has three handlers (h1,
 * h2, h3). Handler can be read and written. The initial value of all handlers is
 * "value". Changed values are stored and can also be read. Each value change
 * automatically changes e2.h1. This can be used to test watch points.
 * 
 * @author Markus Scheidgen
 */
public class ClickSocketTestImpl implements IClickSocket {

	private static final String value = "value";
	private int valueChange = 0;

	private static class Tuple<T1, T2> {
		public static <T1, T2> Tuple<T1, T2> create(T1 v1, T2 v2) {
			return new Tuple<T1, T2>(v1, v2);
		}

		private final T1 v1;
		private final T2 v2;

		public Tuple(T1 v1, T2 v2) {
			super();
			this.v1 = v1;
			this.v2 = v2;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + ((v1 == null) ? 0 : v1.hashCode());
			result = prime * result + ((v2 == null) ? 0 : v2.hashCode());
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			@SuppressWarnings("rawtypes")
			Tuple other = (Tuple) obj;
			if (v1 == null) {
				if (other.v1 != null)
					return false;
			} else if (!v1.equals(other.v1))
				return false;
			if (v2 == null) {
				if (other.v2 != null)
					return false;
			} else if (!v2.equals(other.v2))
				return false;
			return true;
		}
	}

	private Map<Tuple<String, String>, String> values = new HashMap<ClickSocketTestImpl.Tuple<String, String>, String>();

	@Override
	public void connect(InetAddress host, int port) throws IOException {
		// TODO Auto-generated method stub
		System.out.println("connect to " + host.toString() + ":" + port);
	}

	@Override
	public void close() {
		System.out.println("close connection");
	}

	@Override
	public List<String> getConfigElementNames() throws ClickException,
			IOException {
		return Arrays.asList(new String[] { "e1", "e2" });
	}

	@Override
	public List<HandlerInfo> getElementHandlers(String name)
			throws ClickException, IOException {
		return Arrays.asList(new HandlerInfo[] {
				new HandlerInfo("name", name + ".h1", true, true),
				new HandlerInfo("name", name + ".h2", true, true),
				new HandlerInfo("name", name + ".h3", false, true), });
	}

	@Override
	public char[] read(String elementName, String handlerName)
			throws ClickException, IOException {
		String result = values.get(Tuple.create(elementName, handlerName));
		if (result == null) {
			return value.toCharArray();
		} else {
			return result.toCharArray();
		}
	}

	@Override
	public void write(String elementName, String handlerName, char[] charArray)
			throws ClickException, IOException {
		values.put(Tuple.create(elementName, handlerName),
				new String(charArray));
		values.put(Tuple.create("e2", "e2.h1"), value + valueChange++);
		System.out.println("set handler value " + new String(charArray)
				+ " to handler [" + elementName + ", " + handlerName + "]");
	}

}
