package edu.hu.clickwatch.server;

import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Node;

/**
 * This interface describes node adapters. A node adapter adapts a node model to
 * some node in reality.
 * 
 * It is not intended to reuse node adapter for multiple connections or
 * reconnects.
 * 
 * @author Markus Scheidgen
 */
public interface INodeAdapter {
	/**
	 * Establishes a connection to the target node. Must only be called once in
	 * the object life-cycle.
	 */
	public void connect();

	/**
	 * @return true, iff this node adapter is connected to the remote node.
	 */
	public boolean isConnected();

	/**
	 * Disconnects from the target node. Must only be called once in the object
	 * life-cycle.
	 */
	public void disconnect();

	/**
	 * Retrieves the node information that is described by the given filter.
	 * 
	 * @param pElememtFilter filter elements
	 * @param pHandlerFilter filter handler
	 * @return a copy of the lates model representation of the remote node
	 *         filtered by filter.
	 */
	public Node retrieve(String pElememtFilter, String pHandlerFilter);
	
	/**
	 * Updates (writes) a value to a handler on the remote node this adapter is
	 * connected to.
	 * 
	 * @param pHandler
	 *            , model representation of the handler that should be read. The
	 *            remote handler is identified by the handlers name and the name
	 *            of the container element.
	 * @param value
	 *            , the value that should be set. Attention! There is not
	 *            additional check of the value and no exception will be thrown
	 *            if the value is invalid for the handler.
	 */
	public void updateHandlerValue(Handler pHandler);
}
