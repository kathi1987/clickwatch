package edu.hu.clickwatch.nodeadapter;

import java.io.IOException;
import java.net.InetAddress;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;

import org.eclipse.core.runtime.IStatus;
import org.eclipse.emf.ecore.EObject;
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
import edu.hu.clickwatch.util.ILogger;

public abstract class AbstractNodeAdapter implements INodeAdapter {

	@Inject private IClickSocket cs;
	@Inject private ILogger logger;

	private boolean isConnected = false;
	private static final ClickWatchModelFactory modelFactory = ClickWatchModelFactory.eINSTANCE;
	private Node internalNodeCopy = null;

	private String host = null;
	private String port = null;

	public interface ErrorListener {
		public void handlerError(Throwable e);
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
			cs.connect(InetAddress.getByName(host.trim()), new Integer(port.trim()));
			isConnected = true;
		} catch (IOException e) {
			Throwables.propagate(e);
		}
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
	}

	private void ensureConnected() {
		Preconditions.checkState(isConnected, getClass().getName()
				+ " needs to be connected first");
	}

	protected abstract void createAndSetModelValue(Handler handler,
			String string);

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
	 * Filter is a regular expression of this type:
	 * element_regexp/handler_regexp called per node (non-Javadoc)
	 * 
	 * @see edu.hu.clickwatch.nodeadapter.INodeAdapter#retrieve(java.lang.String)
	 */
	@Override
	public Node retrieve(String elemFilters, String handFilter) {
		ensureConnected();
		internalNodeCopy = modelFactory.createNode();
		internalNodeCopy.setINetAdress(host);
		internalNodeCopy.setPort(port);
		
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
					for (String elementPathItem : elementPath) {
						elementNamePrefix = elementNamePrefix == null ? elementPathItem
								: elementNamePrefix + "/" + elementPathItem;
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

		for (String elementPath : configElementNames) {
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
			}
		}
		
		filterInternalNodeCopy(elemFilters, handFilter);

		Iterator<EObject> it = internalNodeCopy.eAllContents();
		while (it.hasNext()) {
			EObject next = it.next();
			if (next instanceof Handler) {
				Handler handler = (Handler)next;
				if (handler.isCanRead()
						&& !ignoreHandler(handler.getName())) {
					char data[] = null;
					try {
						data = cs.read(((Element)handler.eContainer()).getElementPath(),
								handler.getName());
					} catch (Throwable e) {
						Throwables.propagate(e);
					}

					try {
						createAndSetModelValue(handler, new String(data));
					} catch (Throwable e) {
						logger.log(IStatus.ERROR,
								"Exception while creating model for "
										+ handler + " from "
										+ new String(data), e);
					}
				}
			}
		}
		//return EcoreUtil.copy(internalNodeCopy); //necessary??
		return internalNodeCopy;
	}
	
	private void filterInternalNodeCopy(String elemFilters, String handFilter) {
		// filter internal node copy
		if ((elemFilters == null || elemFilters.trim().equals(""))
				&& (handFilter == null || handFilter.trim().equals(""))) {
			return;
		}

		if (elemFilters == null) {
			elemFilters = "";
		}
		if (handFilter == null) {
			handFilter = "";
		}

		String[] elemFilter = elemFilters.split("/");
		Iterator<Element> elem_it = internalNodeCopy.getElements().iterator();
		// recursive checker
		filterMatched(elem_it, elemFilter, 0, handFilter);

	}

	// recursive filter
	private void filterMatched(Iterator<Element> elem_it, String[] elemFilter,
			int idx, String handFilter) {
		while (elem_it.hasNext()) {
			Element elem = elem_it.next();
			if ((elemFilter.length > idx)
					&& !java.util.regex.Pattern.compile(elemFilter[idx])
							.matcher(elem.getName()).find()) {
				// does not match; remove it
				elem_it.remove();
				continue; // no need to check the children nodes
			}
			Iterator<Handler> hand_it = elem.getHandlers().iterator();

			while (hand_it.hasNext()) {
				Handler hand = hand_it.next();
				if (!java.util.regex.Pattern.compile(handFilter)
						.matcher(hand.getName()).find()) {
					// does not match; remove it
					hand_it.remove();
				}
			}

			// recursive call
			if (elem.getChildren().size() > 0) {
				filterMatched(elem.getChildren().iterator(), elemFilter,
						idx + 1, handFilter);
			}
		}
	}

	@Override
	public final synchronized void updateHandlerValue(Handler handler) {
		Preconditions.checkArgument(handler.isCanWrite());

		ensureConnected();
		Element element = (Element) handler.eContainer();

		try {
			cs.write(element.getElementPath(), handler.getName(),
					createPlainRealValue(handler).toCharArray());
		} catch (Throwable e) {
			Throwables.propagate(e);
		}
	}

	protected abstract String createPlainRealValue(Handler handler);

	protected IClickSocket getClickSocket() {
		return cs;
	}

}
