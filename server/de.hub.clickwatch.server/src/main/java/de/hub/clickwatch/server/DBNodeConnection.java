package de.hub.clickwatch.server;

import java.util.ArrayList;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.cdo.CDOHandler;
import de.hub.clickwatch.model.AbstractNodeConnection;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.AbstractNodeAdapter;

public class DBNodeConnection extends AbstractNodeConnection {
	
	/** CDO database handler for storing models in a database*/
	private CDOHandler mDatabaseHandler = null;
	
	private int counter = 0;
	
	private int steps = 50;
	
	private ArrayList<Node> mNodeList = new ArrayList<Node>();
	
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
		this.mNodeList.add(updatedNodeCopy);
		
		System.out.println(counter++);
		
		if(mNodeList.size() == steps){
			long start = System.currentTimeMillis();
			this.mDatabaseHandler.openTransaction(this.mNodeList);
			this.mDatabaseHandler.commitTransaction();
			this.mDatabaseHandler.closeTransaction();
			System.out.println(System.currentTimeMillis() - start);
			mNodeList.clear();
		}
	}
	
	@Override
	public void connect(Object context) {
		this.mDatabaseHandler.openSession();
		super.connect(context);
	}

	@Override
	public void cleanUp() {
		this.mDatabaseHandler.closeSession();
	}

	public CDOHandler getDatabaseHandler() {
		return mDatabaseHandler;
	}

	public void setDatabaseHandler(final CDOHandler pDatabaseHandler) {
		this.mDatabaseHandler = pDatabaseHandler;
	}
}
