package edu.hu.clickwatch.model;

import java.io.IOException;
import java.net.InetAddress;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import click.ControlSocket;

import com.google.common.base.Preconditions;
import com.google.common.base.Throwables;
import com.google.inject.Inject;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.GuiceModule;

/**
 * This implementation of {@link INodeAdapter} adapts a node model to a click
 * node. It translates remote click data into {@link ClickWatchModelPackage} and
 * vice versa. Each adapter instance represents a connections to a click node.
 * 
 * The click control API is accessed through a {@link IClickSocket}
 * implementation. The implementation can be bind via DI and {@link GuiceModule}
 * .
 * 
 * @author Markus Scheidgen
 */
public class ClickControlNodeAdapter implements INodeAdapter {

	@Inject
	private IClickSocket cs;

	private boolean isConnected = false;
	private static final ClickWatchModelFactory modelFactory = ClickWatchModelFactory.eINSTANCE;
	private Node internalNodeCopy = null;

	private String host = null;
	private String port = null;

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
		try {
			for (Object elementNameObject : cs.getConfigElementNames()) {
				String elementName = elementNameObject.toString();
				if (!ignoreElement(elementName)) {
					Element element = modelFactory.createElement();
					element.setName(elementName.toString());
					internalNodeCopy.getElements().add(element);
				}
			}
		} catch (Throwable e) {
			Throwables.propagate(e);
		}

		for (Element element : internalNodeCopy.getElements()) {
			List<ControlSocket.HandlerInfo> handlerInfos = null;
			try {
				handlerInfos = cs.getElementHandlers(element.getName());
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
				if (handler.isCanRead()) {
					char data[] = null;
					try {
						data = cs.read(element.getName(), handler.getName());
					} catch (Throwable e) {
						Throwables.propagate(e);
					}
					
					populateHandlerValueOfInternalNodeCopy(handler, new String(data));					
				}
			}
		}
	}
	
	protected void populateHandlerValueOfInternalNodeCopy(Handler internalHandlerCopy, String plainHandlerValue) {
		Collection<String> value = new ArrayList<String>();
		value.add(plainHandlerValue.trim());
		internalHandlerCopy.getValue().set(XMLTypePackage.eINSTANCE.getXMLTypeDocumentRoot_Text(), value);
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

	/**
	 * Filter is a regular expression of this type: element_regexp/handler_regexp 
	 * called per node
	 * (non-Javadoc)
	 * @see edu.hu.clickwatch.model.INodeAdapter#retrieve(java.lang.String)
	 */
	@Override
	public synchronized Node retrieve(String elemFilter, String handFilter) {
		retrieveInternalNodeCopy();
		// filter internal node copy
		if ( (elemFilter == null || elemFilter.trim().equals("")) && (handFilter == null || handFilter.trim().equals("")) ) {
			return EcoreUtil.copy(internalNodeCopy);	
		}
		
		//MessageDialog.openError(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell(),
		// "Malformed Filter", "The filter is malformed. A valid filter is as follows: element_regexp/handler_regexp. Ignoring filter.");
		//return EcoreUtil.copy(internalNodeCopy);
		
		//String nodeName = internalNodeCopy.getINetAdress();

		Iterator<Element> elem_it = internalNodeCopy.getElements().iterator();
		while (elem_it.hasNext()) {
			Element elem = elem_it.next();
			if (elemFilter.trim().equals("")) {
				continue;
			}
			if (!java.util.regex.Pattern.compile(elemFilter).matcher(elem.getName()).find()) {
				// does not match; remove it
				elem_it.remove();
				continue;
			}
			if (handFilter.trim().equals("")) {
				continue;
			}
			Iterator<Handler> hand_it = elem.getHandlers().iterator();
			
			while (hand_it.hasNext()) {
				Handler hand = hand_it.next();
				if (!java.util.regex.Pattern.compile(handFilter).matcher(hand.getName()).find()) {
					// does not match; remove it
					hand_it.remove();
				}
			}
		}
		return EcoreUtil.copy(internalNodeCopy);
	}

	@Override
	public synchronized String retrieveHandlerValue(Handler handler) {
		ensureConnected();
		return retriveHandlerValue(new String[] {
				((Element) handler.eContainer()).getName(), handler.getName() });
	}

	@Override
	public final synchronized void updateHandlerValue(Handler handler, Object value) {
		ensureConnected();
		doUpdateHandlerValue(handler, value);
	}
	
	protected void doUpdateHandlerValue(Handler handler, Object value) {
		updateHandlerValue(new String[] { ((Element) handler.eContainer()).getName(), handler.getName() }, value.toString());
	}

	private String retriveHandlerValue(String[] path) {
		Preconditions.checkState(isConnected);
		Preconditions.checkArgument(path.length == 2, "path to handler must have length 2");

		String value = null;
		try {
			value = new String(cs.read(path[0], path[1]));
		} catch (Throwable e) {
			Throwables.propagate(e);
		}
		return value;
	}

	private void updateHandlerValue(String[] path, String value) {
		Preconditions.checkState(isConnected);
		Preconditions.checkArgument(path.length == 2, "path to handler must have length 2");

		try {
			cs.write(path[0], path[1], value.toCharArray());
		} catch (Throwable e) {
			Throwables.propagate(e);
		}
	}
	
	@Override
	public boolean determineHandlerHasChangedInModel(Notification notification) {
		return ClickWatchModelPackage.eINSTANCE.getHandler_Value().equals(
				notification.getFeature());
	}

	@Override
	public boolean determineHandlerHasChangedInReality(Handler modelCopy,
			Handler realityCopy) {
		return modelCopy.getValue() == null ? false :
			modelCopy.getValue().equals(realityCopy.getValue());
	}

}
