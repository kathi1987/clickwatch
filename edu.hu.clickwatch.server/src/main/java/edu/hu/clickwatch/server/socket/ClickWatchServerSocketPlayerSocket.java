package edu.hu.clickwatch.server.socket;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import click.ClickException;
import click.ControlSocket.HandlerInfo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.inject.Inject;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.model.Element;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.server.ClickWatchServerPlayer;

/**
 *
 * @author Markus Scheidgen, Michael Frey
 */
public class ClickWatchServerSocketPlayerSocket implements IClickSocket {
	private boolean isConnected = false;
	
	protected InetAddress host;
	protected int port;
	
	@Inject private ClickWatchServerPlayer player;
	
	private Node node = null;
	private long lastUpdate = 0;
	
	private String[] elements = null;
	private ListMultimap<String, HandlerInfo> handlers = null;
	private Map<String, String> values = null;
	
	@Override
	public void connect(InetAddress host, int port) throws IOException {
		this.host = host;
		this.port = port;
		
		delay();
		isConnected = true;
	}

	@Override
	public void close() {
		delay();
		isConnected = false;	
	}

	@Override
	public List<String> getConfigElementNames() throws ClickException,
			IOException {
		delay();
		String[] elements = getElements();
		Preconditions.checkState(elements != null);
		return Arrays.asList(elements);	}

	@Override
	public List<HandlerInfo> getElementHandlers(String name)
			throws ClickException, IOException {
		delay();
		HandlerInfo[] handler = getHandler(name);
		Preconditions.checkState(handler != null);
		return Arrays.asList(handler);	}

	@Override
	public char[] read(String elementName, String handlerName)
			throws ClickException, IOException {
		delay();
		return getValue(elementName, handlerName).toCharArray();	}

	@Override
	public void write(String elementName, String handlerName, char[] charArray)
			throws ClickException, IOException {
		delay();
		handleWrite(elementName, handlerName, new String(charArray));
	}
	
	public boolean isConnected() {
		return isConnected;
	}
	
	private void delay() {
//		int randomMillisecs = new Random().nextInt(5);
//		try {
//			Thread.sleep(randomMillisecs);
//		} catch (InterruptedException e) {
//			Throwables.propagate(e);
//		}
	}
	
	public String getValue(String element, String handler) {
		initialize();
		return values.get(element + "/" + handler);
	}
	
	private void initialize() {
		if (node == null || lastUpdate != player.getCurrentUpdate()) {
			String host = this.host.toString().substring(1);
			String port = "" + this.port;
			
			node = player.getNode(host, port, player.getCurrentUpdate());
			
			Preconditions.checkState(node != null);
			
			List<String> elements = new ArrayList<String>();
			handlers = ArrayListMultimap.create();
			values = new HashMap<String, String>();
			
			Iterator<EObject> it = node.eAllContents();
			while (it.hasNext()) {
				EObject eObject = it.next();
				if (eObject instanceof Element) {
					elements.add(((Element)eObject).getElementPath());
				} else if (eObject instanceof Handler) {
					Handler handler = (Handler)eObject;
					String elementPath = ((Element)handler.eContainer()).getElementPath();
					String handlerName = handler.getName();
					HandlerInfo handlerInfo = new HandlerInfo(
							elementPath, handlerName, handler.isCanRead(), handler.isCanWrite());
					handlers.put(elementPath, handlerInfo);
					String value = ((String)handler.getMixed().getValue(0)).trim();
					values.put(elementPath + "/" + handlerName, value);
				}
			}
			
			this.elements = elements.toArray(new String[] {});
			lastUpdate = player.getCurrentUpdate();
		}
	}
	
	public String[] getElements() {
		initialize();
		return elements;
	}
	
	public void handleWrite(String element, String handler, String value) {
		// empty
	}
	
	public HandlerInfo[] getHandler(String element) {
		initialize();
		return handlers.get(element).toArray(new HandlerInfo[] {});
	}
}
