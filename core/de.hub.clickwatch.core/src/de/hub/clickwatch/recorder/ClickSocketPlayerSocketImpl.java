package de.hub.clickwatch.recorder;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

import click.ControlSocket.HandlerInfo;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ClickSocketTestImpl;


public class ClickSocketPlayerSocketImpl extends ClickSocketTestImpl {

	@Inject private ClickSocketPlayer player;
	
	private Node node = null;
	private InetAddress host;
	private int port;
	
	private static int count = 0;

	@Override
	public void connect(InetAddress host, int port, int timeout) throws IOException {
		super.connect(host, port, timeout);
		this.host = host;
		this.port = port;
	}

	private synchronized void initialize() {

		String host = this.host.getHostName();
		String port = "" + this.port;
		
		if (node == null) {
			node = player.getNode(host, port);
		} else if (count++ % 700 == 0) {
			node = player.getNode(host, port);
		}
		Preconditions.checkState(node != null, "Node with iNetAddress " + host + " does not exist in record.");
	
	}
	
	@Override
	public String[] getElements() {
		initialize();
		List<String> elements = new ArrayList<String>();
		Iterator<EObject> it = node.eAllContents();
		while (it.hasNext()) {
			EObject eObject = it.next();
			if (eObject instanceof Element) {
				elements.add(((Element)eObject).getQualifiedName());
			}
		}
		return elements.toArray(new String[] {});
	}

	@Override
	public HandlerInfo[] getHandler(String elementPath) {
		initialize();
		String[] elementPathItems = elementPath.split("/");
		Element element = null;
		for (int i = 0; i < elementPathItems.length; i++) {
			if (element == null) {
				element = node.getElement(elementPathItems[i]);
			} else {
				element = element.getChild(elementPathItems[i]);
			}
			if (element == null) {
				return new HandlerInfo[]{};
			}
		}
		EList<Handler> handlers = element.getHandlers();
		HandlerInfo[] result = new HandlerInfo[handlers.size()];
		int i = 0;
		for (Handler handler: handlers) {
 			result[i++] = new HandlerInfo(elementPath, handler.getName(), handler.isCanRead(), handler.isCanRead());
		}
		return result;
	}

	@Override
	public String getValue(String element, String handlerName) {
		initialize();
		Handler handler = node.getHandler(element + "/" + handlerName);
		if (!handler.getMixed().isEmpty()) {
			return ((String)handler.getMixed().getValue(0)).trim();	
		} else {
			return "";
		}
	}

	@Override
	public void handleWrite(String element, String handler, String value) {
		// empty
	}

}
