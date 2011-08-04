package de.hub.clickwatch.apps.god.node;

import java.io.Serializable;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

import de.hub.clickwatch.apps.god.information.ClientInformations;
import de.hub.clickwatch.model.Handler;

public class NodeInformations implements Serializable {
	private static final long serialVersionUID = -7093809031993436880L;
	
	private ConcurrentHashMap<String[], Class<? extends NodeInformationProcessor>> filter = null;
	private InetAddress host = null;
	private int port = 0;
	
	public NodeInformations(String hostname, int i_port) throws UnknownHostException {
		host = InetAddress.getByName(hostname);
		port = i_port;
		filter = new ConcurrentHashMap<String[], Class<? extends NodeInformationProcessor>>();
	}
	
	public int getPort() {
		return port;
	}
	
	public void setPort(int port) {
		this.port = port;
	}
	
	public InetAddress getHost() {
		return host;
	}
	
	public void setHost(InetAddress host) {
		this.host = host;
	}

	public ConcurrentHashMap<String[], Class<? extends NodeInformationProcessor>> getElementFilter() {
		return filter;
	}

	public void addFilter(String element, String handler, Class<? extends NodeInformationProcessor> i_class) {
		filter.put(new String[] {element, handler}, i_class);
	}
	
	public void addFilter(String element, String handler, String value) {
		String[] strArr = new String[] {element, handler, value};
		filter.put(strArr, new DummyClass().getClass());
	}
	
	public boolean removeFilter(String element, String handler) {
		for (String[] key : filter.keySet()) {
			if ((key[0].equals(element)) && (key[1].equals(handler))) {
				filter.remove(key);
				return true;
			}
		}
		return false;
	}
	
	private class DummyClass implements NodeInformationProcessor {
		@Override
		public List<ClientInformations> handleInformations(Handler data) {
			return null;
		}

		@Override
		public List<ClientInformations> handleGenuineInformations(String xmlData) {
			return null;
		}
		
	}
}