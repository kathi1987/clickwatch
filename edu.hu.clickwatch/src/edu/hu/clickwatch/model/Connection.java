package edu.hu.clickwatch.model;

import java.net.InetAddress;
import java.util.Iterator;
import java.util.List;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.swt.widgets.Display;

import click.ControlSocket;

public abstract class Connection {

	private final Node node;
	private final Display display;
	
	private boolean runningUpdate = false;
	private final Thread updator = new Thread() {
		@Override
		public void run() {
			while (true) {
				try {
					sleep(3000);
				} catch (InterruptedException e) {
					e.printStackTrace();
				}

				display.syncExec(new Runnable() {					
					@Override
					public void run() {
						if (!runningUpdate) {
							updateNode(true);
							System.out.println("update");
						}	
					}
				});
			}
		}
	};

	public Connection(Node node, Display display) {
		super();
		this.node = node;
		this.display = display;
	}
	
	private boolean ignoreElement(String name) {
		return name.contains("@");
	}
	
	public void connect() {
		if (!node.isConnected()) {
			updator.start();
		}
		updateNode(false);
	}
	
	@SuppressWarnings("deprecation")
	public void disconnect() {
		node.setConnected(false);
		updator.stop();
		Iterator<EObject> allContents = node.eAllContents();
		while (allContents.hasNext()) {
			allContents.next().eAdapters().remove(handlerAdapter);
		}
	}
	
	public void reset() {
		Iterator<EObject> allContents = node.eAllContents();
		while(allContents.hasNext()) {
			EObject object = allContents.next();
			if (object instanceof Handler) {
				((Handler)object).setChanged(false);
			}
		}
	}

	private <E> boolean contains(List<E> list, E object) {
		for (E o: list) {
			if (o.equals(object)) {
				return true;
			}
		}
		return false;
	}
	
	private <E> E getItem(List<E> list, E object) {
		int i = 0;
		for (E o: list) {			
			if (o.equals(object)) {
				return o;
			}
			i++;
		}
		return null;
	}
	
	@SuppressWarnings("unchecked")
	private void updateNode(boolean watchedOnly) {
		runningUpdate = true;
		boolean hasErrors = false;
		StringBuffer errors = new StringBuffer("");
		node.setConnected(false);
		ControlSocket cs = null;
		try {	
			InetAddress iNetAddress = InetAddress.getByName(node.getINetAdress());
			int port = new Integer(node.getPort());

			cs = new ControlSocket(iNetAddress, port);
			for (Object elementNameObject: cs.getConfigElementNames()) {
				String elementName = elementNameObject.toString();
				if (!ignoreElement(elementName)) {
					Element element = ClickWatchModelFactory.eINSTANCE.createElement();
					element.setName(elementName.toString());
					if (!contains(node.getElements(), element)) {
						node.getElements().add(element);
					}
				}
			}
			
			for (edu.hu.clickwatch.model.Element element: node.getElements()) {
				if (!watchedOnly || element.isWatch()) {
					List<ControlSocket.HandlerInfo> v = cs.getElementHandlers(element.getName());
					for (ControlSocket.HandlerInfo hi: v) {
						Handler newHandler = ClickWatchModelFactory.eINSTANCE.createHandler();
						newHandler.setName(hi.getHandlerName());
						if (contains(element.getHandlers(), newHandler)) {
							newHandler = getItem(element.getHandlers(), newHandler);
						} else {
							element.getHandlers().add(newHandler);	
							newHandler.eAdapters().add(handlerAdapter);
						}
						newHandler.setCanRead(hi.isCanRead());
						newHandler.setCanWrite(hi.isCanWrite());					
						
						for (Handler handler: element.getHandlers()) {
							if (handler.isCanRead() && (!watchedOnly || handler.isWatch())) {
								try {
									char data[] = cs.read(element.getName(), handler.getName());
									updateValue(handler, new String(data), true, watchedOnly);
								} catch (Exception e) {
									hasErrors = true;
									errors.append(e.getMessage() + "\n");
								}
							}
						}
					}
				}	
			}	
		} catch (Exception e) {
			handleError("An exception occured", e);
			return;
		} finally {
			cs.close();
			runningUpdate = false;
		}
		node.setConnected(true);
		if (hasErrors) {
			handleError("connected, but there were errors: \n" + errors.toString(), null);
		}
	}
	
	private synchronized void updateValue(Handler handler, String newValue, boolean isRemoteChange, boolean watchedOnly) {
		if (isRemoteChange) {
			handler.eAdapters().remove(handlerAdapter);
			if (!newValue.equals(handler.getValue())) {
				handler.setValue(newValue);
				handler.setChanged(watchedOnly);
			}
			handler.eAdapters().add(handlerAdapter);
		} else {
			if (!handler.isCanWrite()) {
				handleError("This handler is not writable", null);
				return;
			}
			EObject container = handler.eContainer();
			while (!(container instanceof Node)) {
				container = container.eContainer();
			}
			Node node = (Node)container;
			ControlSocket cs = null;
			try {	
				InetAddress iNetAddress = InetAddress.getByName(node.getINetAdress());
				int port = new Integer(node.getPort());
	
				cs = new ControlSocket(iNetAddress, port);
				cs.write(((Element)handler.eContainer()).getName(), handler.getName(), newValue.toCharArray());
			} catch (Exception e) {
				handleError("An exception occured", e);
				return;
			} finally {
				if (cs != null) {
					cs.close();
				}
			}
		}
	}
	
	private void valueChanged(Handler handler, String newValue) {
		updateValue(handler, newValue, false, false);
	}
	
	private final Adapter handlerAdapter = new AdapterImpl() {
		@Override
		public void notifyChanged(Notification msg) {
			Handler handler = (Handler)msg.getNotifier();
			if (ClickWatchModelPackage.eINSTANCE.getHandler_Value().equals(msg.getFeature())) {				
				valueChanged(handler, msg.getNewStringValue());
			}
			if (ClickWatchModelPackage.eINSTANCE.getHandler_Watch().equals(msg.getFeature())) {
				if (msg.getNewBooleanValue()) {
					((Element)handler.eContainer()).setWatch(true);
				}
			}
		}			
	};
	
	protected abstract void handleError(String message, Exception e);
}
