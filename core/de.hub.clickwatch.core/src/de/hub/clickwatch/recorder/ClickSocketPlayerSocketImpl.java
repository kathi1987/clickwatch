package de.hub.clickwatch.recorder;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.EObject;

import click.ControlSocket.HandlerInfo;

import com.google.common.base.Preconditions;
import com.google.common.collect.ArrayListMultimap;
import com.google.common.collect.ListMultimap;
import com.google.inject.Inject;

import de.hub.clickwatch.model.Element;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ClickSocketTestImpl;


public class ClickSocketPlayerSocketImpl extends ClickSocketTestImpl {

	@Inject private ClickSocketPlayer player;
	
	private Node node = null;
	private String[] elements = null;
	private ListMultimap<String, HandlerInfo> handlers = null;
	private Map<String, String> values = null;
	
	private void initialize() {
		String host = this.host.getHostName();
		String port = "" + this.port;
		
		Node newNode = player.getNode(host, port);
		Preconditions.checkState(newNode != null);
		
		if (newNode == node) {
			return;
		}
		node = newNode;
		
		
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
				String value = "";
				if (!handler.getMixed().isEmpty()) {
					value = ((String)handler.getMixed().getValue(0)).trim();	
				}
				values.put(elementPath + "/" + handlerName, value);
			}
		}
		
		this.elements = elements.toArray(new String[] {});
	}
	
	@Override
	public String[] getElements() {
		initialize();
		return elements;
	}

	@Override
	public HandlerInfo[] getHandler(String element) {
		initialize();
		return handlers.get(element).toArray(new HandlerInfo[] {});
	}

	@Override
	public String getValue(String element, String handler) {
		initialize();
		return values.get(element + "/" + handler);
	}

	@Override
	public void handleWrite(String element, String handler, String value) {
		// empty
	}

}
