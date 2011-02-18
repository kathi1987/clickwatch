package edu.hu.clickwatch.nodeadapter;

import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.emf.ecore.util.EcoreUtil;

import click.ControlSocket;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.inject.Inject;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.Element;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Node;

public abstract class AbstractNodeAdapter implements INodeAdapter {
	
	@Inject
	private IClickSocket cs;

	private boolean isConnected = false;
	private static final ClickWatchModelFactory modelFactory = ClickWatchModelFactory.eINSTANCE;
	private Node internalNodeCopy = null;

	private String host = null;
	private String port = null;
	
	public interface IExtendedValueRepresentation extends IValueRepresentation {
		
		public Object createModelValue(String plainRealValue);
		
		public String createPlainRealValue(Object modelValue);
		
	}

	public synchronized void setUp(String host, String port) {
		this.host = host;
		this.port = port;
	}

	@Override
	public synchronized void connect() {
		Preconditions.checkState(!isConnected);
		Preconditions.checkNotNull(host);

		try {
			cs.connect(InetAddress.getByName(host), new Integer(port));
			isConnected = true;
		} catch (IOException e) {
			Throwables.propagate(e);
		}

		System.out.println("Connected to " + host);
	}

	@Override
	public synchronized boolean isConnected() {
		return isConnected;
	}

	@Override
	public synchronized void disconnect() {
		if (cs == null || !isConnected) {
			return;
		}
		cs.close();
		isConnected = false;
		if (internalNodeCopy != null) {
			EcoreUtil.delete(internalNodeCopy, true);
		}
		internalNodeCopy = null;
		System.out.println("Disconnected from " + host);
	}

	private void ensureConnected() {
		Preconditions.checkState(isConnected, getClass().getName()
				+ " needs to be connected first");
	}

	/**
	 * Retrieves element and handler information from the remote node and
	 * populates a given empty {@link Node} model with it.
	 * 
	 * @param internalNodeCopy
	 *            , the empty node.
	 * @param cs
	 *            , the {@link IClickSocket} that should be used to retrieve the
	 *            node information.
	 */
	protected void retrieveAndPopulateInternalNodeCopy(Node internalNodeCopy,
			IClickSocket cs) {
		Map<String, Element> elementMap = new HashMap<String, Element>();
		List<String> configElementNames = null;
		try {
			configElementNames = cs.getConfigElementNames();
			for (Object elementNameObject : configElementNames) {
				String elementName = elementNameObject.toString();
				if (!ignoreElement(elementName)) {					
					String[] elementPath = elementName.split("/");
					String elementNamePrefix = null;
					Element parent = null;
					for (String elementPathItem: elementPath) {
						elementNamePrefix = elementNamePrefix == null ? elementPathItem : elementNamePrefix + "/" + elementPathItem;
						Element element = elementMap.get(elementNamePrefix);
						if (element == null) {
							element = modelFactory.createElement();
							element.setName(elementPathItem);
							if (parent == null) {
								internalNodeCopy.getElements().add(element);
							} else {
								parent.getChildren().add(element);
							}
							elementMap.put(elementNamePrefix, element);
						}
						parent = element;
					}
				}
			}
		} catch (Throwable e) {
			Throwables.propagate(e);
		}

		for (String elementPath: configElementNames) {
			if (!ignoreElement(elementPath)) {
				List<ControlSocket.HandlerInfo> handlerInfos = null;
				Element element = elementMap.get(elementPath);
				Preconditions.checkState(element != null);
				try {				
					handlerInfos = cs.getElementHandlers(elementPath);
				} catch (Throwable e) {
					Throwables.propagate(e);
				}
	
				for (ControlSocket.HandlerInfo handlerInfo : handlerInfos) {
					Handler newHandler = ClickWatchModelFactory.eINSTANCE
							.createHandler();
					newHandler.setName(handlerInfo.getHandlerName());
					newHandler.setCanRead(handlerInfo.isCanRead());
					newHandler.setCanWrite(handlerInfo.isCanWrite());
					if (newHandler.isCanRead()) {
						element.getHandlers().add(newHandler);
					}
				}
	
				for (Handler handler : element.getHandlers()) {
					if (handler.isCanRead() && !ignoreHandler(handler.getName())) {
						char data[] = null;
						try {							
							data = cs.read(element.getElementPath(), handler.getName());
						} catch (Throwable e) {
							Throwables.propagate(e);
						}
						
						IExtendedValueRepresentation valueRep = getExtendedValueRepresentation(handler);
						valueRep.set(handler, valueRep.createModelValue(new String(data)));				
					}
				}
			}
		}
	}
	
	private void retrieveInternalNodeCopy() {
		ensureConnected();
		internalNodeCopy = modelFactory.createNode();
		internalNodeCopy.setINetAdress(host);
		internalNodeCopy.setPort(port);
		retrieveAndPopulateInternalNodeCopy(internalNodeCopy, cs);
	}

	/**
	 * Allows extending classes to ignore elements. Currently elements with "@"
	 * in their names are ignored.
	 * 
	 * @param name
	 *            , name of the element.
	 * @return true, iff the element should be ignored.
	 */
	protected boolean ignoreElement(String name) {
		return name.contains("@");
	}
	
	protected boolean ignoreHandler(String name) {
		return false;
	}

	/**
	 * Filter is a regular expression of this type: element_regexp/handler_regexp 
	 * called per node
	 * (non-Javadoc)
	 * @see edu.hu.clickwatch.nodeadapter.INodeAdapter#retrieve(java.lang.String)
	 */
	@Override
	public Node retrieve(String elemFilters, String handFilter) {
		retrieveInternalNodeCopy();
		// filter internal node copy
		if ( (elemFilters == null || elemFilters.trim().equals("")) && (handFilter == null || handFilter.trim().equals("")) ) {
			return EcoreUtil.copy(internalNodeCopy);	
		}
		
		String[] elemFilter = elemFilters.split("/");
		Iterator<Element> elem_it = internalNodeCopy.getElements().iterator();
		// recusrive checker
		filterMatched(elem_it, elemFilter, 0, handFilter);
		return EcoreUtil.copy(internalNodeCopy);
	}
	
	// recursive filter
	private void filterMatched(Iterator<Element> elem_it, String[] elemFilter, int idx, String handFilter) {
		while (elem_it.hasNext()) {
			Element elem = elem_it.next();
			if ( (elemFilter.length > idx) && !java.util.regex.Pattern.compile(elemFilter[idx]).matcher(elem.getName()).find()) {
				// does not match; remove it
				elem_it.remove();
				continue; // no need to check the children nodes
			}
			Iterator<Handler> hand_it = elem.getHandlers().iterator();
			
			if (handFilter != null) {
				while (hand_it.hasNext()) {
					Handler hand = hand_it.next();
					if (!java.util.regex.Pattern.compile(handFilter).matcher(hand.getName()).find()) {
						// does not match; remove it
						hand_it.remove();
					}
				}
			}

			// recursive call
			if (elem.getChildren().size() > 0) {
				filterMatched(elem.getChildren().iterator(), elemFilter, idx+1, handFilter);
			}
		}
	}

	@Override
	public final synchronized void updateHandlerValue(Handler handler, Object value) {
		Preconditions.checkArgument(handler.isCanWrite());
		
		ensureConnected();
		Element element = (Element)handler.eContainer();
		
		try {
			IExtendedValueRepresentation valueRep = getExtendedValueRepresentation(handler);
			cs.write(element.getElementPath(), handler.getName(), valueRep.createPlainRealValue(value).toCharArray());
		} catch (Throwable e) {
			Throwables.propagate(e);
		}
	}
	
	@Override
	public IValueRepresentation getValueRepresentation(Handler handler) {
		return getExtendedValueRepresentation(handler);
	}
	
	protected IClickSocket getClickSocket() {
		return cs;
	}

	protected abstract IExtendedValueRepresentation getExtendedValueRepresentation(Handler handler);
}
