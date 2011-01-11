package edu.hu.clickcontrol;

import java.io.IOException;
import java.net.InetAddress;
import java.util.List;

import com.google.common.base.Preconditions;

import click.ClickException;
import click.ControlSocket;
import click.ControlSocket.HandlerInfo;

public class ClickSocketImpl implements IClickSocket {
	
	private ControlSocket cs = null;

	@Override
	public void connect(InetAddress host, int port) throws IOException {
		Preconditions.checkState(cs == null, "can only connect once");
		cs = new ControlSocket(host, port);
	}

	@Override
	public void close() {
		cs.close();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<String> getConfigElementNames() throws ClickException, IOException {
		return cs.getConfigElementNames();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<HandlerInfo> getElementHandlers(String name) throws ClickException, IOException {
		return cs.getElementHandlers(name);
	}

	@Override
	public char[] read(String elementName, String handlerName) throws ClickException, IOException {
		return cs.read(elementName, handlerName);
	}

	@Override
	public void write(String elementName, String handlerName, char[] data) throws ClickException, IOException {
		cs.write(elementName, handlerName, data);
		
	}
}
