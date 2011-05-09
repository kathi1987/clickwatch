package edu.hu.clickwatch.server.database;

import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.util.container.IManagedContainer;

public class Handler {
	/** */
	private CDOSession mSession;
	/** */
	private CDOTransaction mTransaction = null;
	/** */
	private IConnector mConnector;
	/** */
	private IManagedContainer mContainer;
	/** */
	private EObject mModel;
	
	
	public CDOSession getSession() {
		return mSession;
	}
	
	public void setSession(final CDOSession pSession) {
		this.mSession = pSession;
	}
	
	public CDOTransaction getTransaction() {
		return mTransaction;
	}
	
	public void setTransaction(final CDOTransaction pTransaction) {
		this.mTransaction = pTransaction;
	}

	public IConnector getConnector() {
		return mConnector;
	}

	public void setConnector(final IConnector pConnector) {
		this.mConnector = pConnector;
	}

	public IManagedContainer getContainer() {
		return mContainer;
	}

	public void setContainer(final IManagedContainer pContainer) {
		this.mContainer = pContainer;
	}

}

