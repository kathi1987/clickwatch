package edu.hu.clickwatch.nodeadapter;

import java.util.List;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.ecore.EObject;

import com.google.inject.Inject;

import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.ClickWatchModelFactory;
import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Element;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.MultiNode;
import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;

/**
 * This implementation of {@link INodeAdapter} adapts a multi-node to the rest
 * of the network model. A multi-node is a virtual network node that represents
 * multiple nodes in the network. The intend is to modify multiple nodes at once
 * using such a multi-node.
 * 
 * @author Markus Scheidgen
 * 
 */
public class MultiNodeAdapter implements INodeAdapter {
	
	@Inject
	private XmlModelRepository xmlRepo;

	private MultiNode node = null;
	private static final ClickWatchModelFactory modelFactory = ClickWatchModelFactory.eINSTANCE;

	public void setUp(MultiNode node) {
		this.node = node;
	}
	
	private List<Node> getNodes() {
		if (node.getNodes().size() > 0) {
			return node.getNodes();
		} else {
			return ((Network)node.eContainer()).getNodes();
		}
	}

	/**
	 * Multi-nodes are always connected.
	 */
	@Override
	public void connect() {

	}

	/**
	 * Multi-nodes are always connected.
	 */
	@Override
	public boolean isConnected() {
		return true;
	}

	/**
	 * Multi-nodes are always connected.
	 */
	@Override
	public void disconnect() {

	}

	@Override
	public Node retrieve(String eFilter, String hFilter) {
		Node internalNodeCopy = modelFactory.createNode();

		for (Node node : getNodes()) {
			if (!(node instanceof MultiNode)) {
				for (Element element : node.getElements()) {
					Element multiNodeElement = null;
					if (!internalNodeCopy.getElements().contains(element)) {
						multiNodeElement = modelFactory.createElement();
						multiNodeElement.setName(element.getName());
						internalNodeCopy.getElements().add(multiNodeElement);
					} else {
						for (Element internalElement : internalNodeCopy
								.getElements()) {
							if (internalElement.getName().equals(element.getName())) {
								multiNodeElement = internalElement;
							}
						}
					}
	
					for (Handler handler : element.getHandlers()) {
						boolean exists = false;
						for (Handler multiNodeHandler: multiNodeElement.getHandlers()) {							
							if (multiNodeHandler.getName().equals(handler.getName())) {
								exists = true;
							}
						}
						if (!exists) {
							Handler multiNodeHandler = modelFactory.createHandler();
							multiNodeHandler.setName(handler.getName());
							multiNodeElement.getHandlers().add(multiNodeHandler);
							// TODO initialize value (any, mixed)
						}
					}
				}
			}
		}

		return internalNodeCopy;
	}

	/**
	 * Updates the given handler on all nodes that have this handler. It
	 * facilitates the {@link AbstractNodeConnection} of the node models.
	 */
	@Override
	public void updateHandlerValue(Handler handler, Object value) {
		for (Node node: getNodes()) {
			if (!(node instanceof MultiNode)) {
				String elementName = ((Element)handler.eContainer()).getName();
				for (Element element: node.getElements()) {
					if (element.getName().equals(elementName)) {
						for (Handler nodeHander: element.getHandlers()) {
							if (nodeHander.getName().equals(handler.getName())) {
								if (node.isConnected()) {
									((AbstractNodeConnection)node.getConnection()).propagateHandlerValueChangeToReality(handler, value);
								}
							}	
						}
					}
				}
			}
		}
	}

	@Override
	public IValueRepresentation getValueRepresentation(Handler handler) {
		return new IValueRepresentation() {			
			@Override
			public void set(Handler handler, Object value) {
				// TODO
			}
			
			@Override
			public boolean isNotificationChangingValue(Notification notification) {
				if (notification.getNotifier() instanceof Handler) {
					return notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getHandler_Any() ||
							notification.getFeature() == ClickWatchModelPackage.eINSTANCE.getHandler_Mixed();
				} else {
					return true;
				}
			}
			
			@Override
			public Object get(Handler handler) {
				return null; // TODO
			}
			
			@Override
			public boolean equalsModelValueRealityValue(Object modelValue,
					Object realValue) {
				return true;
			}
		};
	}
}
