package edu.hu.clickwatch.model;

import java.util.List;

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
	public Node retrieveAll() {
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
							if (internalElement.equals(element)) {
								multiNodeElement = internalElement;
							}
						}
					}
	
					for (Handler handler : element.getHandlers()) {
						if (!multiNodeElement.getHandlers().contains(handler)) {
							Handler multiNodeHandler = modelFactory.createHandler();
							multiNodeHandler.setName(handler.getName());
							multiNodeElement.getHandlers().add(multiNodeHandler);
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
								((AbstractNodeConnection)node.getConnection()).propagateRemoteHandlerChangeToModel(handler, value);
							}	
						}
					}
				}
			}
		}
	}

}
