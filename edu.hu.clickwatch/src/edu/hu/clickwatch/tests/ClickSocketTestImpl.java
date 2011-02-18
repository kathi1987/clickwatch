package edu.hu.clickwatch.tests;

import java.io.IOException;
import java.net.InetAddress;
import java.util.Arrays;
import java.util.List;

import click.ClickException;
import click.ControlSocket.HandlerInfo;

import com.google.common.base.Preconditions;

import edu.hu.clickcontrol.IClickSocket;

public abstract class ClickSocketTestImpl implements IClickSocket {
	
	private boolean isConnected = false;

	@Override
	public void connect(InetAddress host, int port) throws IOException {
		delay();
		isConnected = true;
	}

	@Override
	public void close() {
		delay();
		isConnected = false;
	}
	
	public boolean isConnected() {
		return isConnected;
	}
	
	@Override
	public List<String> getConfigElementNames() throws ClickException,
			IOException {
		delay();
		String[] elements = getElements();
		Preconditions.checkState(elements != null);
		return Arrays.asList(elements);
	}
	
	public abstract String[] getElements();

	@Override
	public List<HandlerInfo> getElementHandlers(String name)
			throws ClickException, IOException {
		delay();
		HandlerInfo[] handler = getHandler(name);
		Preconditions.checkState(handler != null);
		return Arrays.asList(handler);
	}
	
	public abstract HandlerInfo[] getHandler(String element);

	@Override
	public char[] read(String elementName, String handlerName)
			throws ClickException, IOException {
		delay();
		return getValue(elementName, handlerName).toCharArray();
	}
	
	public abstract String getValue(String element, String handler);

	@Override
	public final void write(String elementName, String handlerName, char[] charArray)
			throws ClickException, IOException {
		delay();
		handleWrite(elementName, handlerName, new String(charArray));
	}
	
	private void delay() {
//		int randomMillisecs = new Random().nextInt(5);
//		try {
//			Thread.sleep(randomMillisecs);
//		} catch (InterruptedException e) {
//			Throwables.propagate(e);
//		}
	}

	public abstract void handleWrite(String element, String handler, String value);
}
