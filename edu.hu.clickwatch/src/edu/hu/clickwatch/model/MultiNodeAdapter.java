package edu.hu.clickwatch.model;

import java.util.List;

import org.eclipse.emf.ecore.util.FeatureMapUtil;

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
							
							multiNodeHandler.getValue().add(
									FeatureMapUtil.createTextEntry("enter a value"));
						}
					}
				}
			}
		}

		return internalNodeCopy;
	}

	/**
	 * return always an empty String.
	 */
	@Override
	public String retrieveHandlerValue(Handler handler) {
		return "";
	}

	/**
	 * Updates the given handler on all nodes that have this handler. It
	 * facilitates the {@link AbstractNodeConnection} of the node models.
	 */
	@Override
	public void updateHandlerValue(Handler handler, String value) {
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

}
