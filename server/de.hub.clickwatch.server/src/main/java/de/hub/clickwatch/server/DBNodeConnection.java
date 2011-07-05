package de.hub.clickwatch.server;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.cdo.CDOHandler;
import de.hub.clickwatch.model.AbstractNodeConnection;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.AbstractNodeAdapter;

public class DBNodeConnection extends AbstractNodeConnection {
	
	/** CDO database handler for storing models in a database*/
	private CDOHandler mDatabaseHandler = null;
	
	@Override
	public void setUp(Node node) {
		super.setUp(node);
		
		EObject eContainer = node.eContainer();
		int timeout = 6000;
		if (eContainer != null && eContainer instanceof Network) {
			timeout = ((Network)eContainer).getTimeout();
		}
		((AbstractNodeAdapter)getNodeAdapter()).setUp(node.getINetAddress(), node.getPort(), timeout);
	}

	@Override
	protected void updateNode(Node updatedNodeCopy) {
		// Write the model data to the database
		if(this.mDatabaseHandler != null){
			this.mDatabaseHandler.openSession();
			this.mDatabaseHandler.openTransaction(updatedNodeCopy);
			this.mDatabaseHandler.commitTransaction();
			this.mDatabaseHandler.closeTransaction();
			this.mDatabaseHandler.closeSession();
		}	
	}

	public CDOHandler getDatabaseHandler() {
		return mDatabaseHandler;
	}

	public void setDatabaseHandler(final CDOHandler pDatabaseHandler) {
		this.mDatabaseHandler = pDatabaseHandler;
	}
}
