package de.hub.clickcontrol;

import java.io.IOException;
import java.net.InetAddress;
import java.util.List;

import click.ClickException;
import click.ControlSocket;
import click.ControlSocket.HandlerInfo;

import com.google.common.base.Preconditions;

public class ClickSocketImpl implements IClickSocket {
	
	private ControlSocket cs = null;
	private ClickSocketStatistics statistics = null;

	@Override
	public void connect(String host, int port, int socketTimeOut) throws IOException {
		Preconditions.checkState(cs == null, "can only connect once");
		cs = new ControlSocket(InetAddress.getByName(host), port, socketTimeOut);
	}

	@Override
	public void close() {
		if (cs != null) {
			cs.close();
		}
	}

	@Override
	public boolean isConnected() {
		if (cs != null) {
			return cs.isConnected();
		} else {
			return false;
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getConfigElementNames() throws ClickException, IOException {
		if (statistics != null) {
			long start = System.nanoTime();
			List<String> result = cs.getConfigElementNames();
			statistics.addRequest(System.nanoTime() - start);
			return result;
		} else {
			return cs.getConfigElementNames();
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HandlerInfo> getElementHandlers(String name) throws ClickException, IOException {
		if (statistics != null) {
			long start = System.nanoTime();
			List<HandlerInfo> result = cs.getElementHandlers(name);
			statistics.addRequest(System.nanoTime() - start);
			return result;
		} else {
			return cs.getElementHandlers(name);
		}		
	}

	@Override
	public char[] read(String elementName, String handlerName) throws ClickException, IOException {
		if (statistics != null) {
			long start = System.nanoTime();
			char[] result = cs.read(elementName, handlerName);
			statistics.addRead(System.nanoTime() - start);
			return result;
		} else {
			return cs.read(elementName, handlerName);
		}		
	}

	@Override
	public void write(String elementName, String handlerName, char[] data) throws ClickException, IOException {		
		if (statistics != null) {
			long start = System.nanoTime();
			cs.write(elementName, handlerName, data);
			statistics.addRequest(System.nanoTime() - start);
		} else {
			cs.write(elementName, handlerName, data);
		}		
	}

	@SuppressWarnings("unchecked")
	@Override
	public <T> T getAdapter(Class<T> theClass) {
		if (theClass == ClickSocketStatistics.class) {
			if (statistics == null) {
				statistics = new ClickSocketStatistics(cs);
			}
			return (T)statistics;
		} else {
			return null;
		}
	}

}
