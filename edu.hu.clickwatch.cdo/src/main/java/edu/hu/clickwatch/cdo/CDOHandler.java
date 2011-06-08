package edu.hu.clickwatch.cdo;

import java.math.BigInteger;
import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;

import edu.hu.clickwatch.model.ClickWatchModelPackage;
import edu.hu.clickwatch.model.Node;

public class CDOHandler implements ICDOHandler {
	/** The handler which holds the cdo connection */
	private Connection mHandler = null;
	/** The current model which will be stored in a database */
	private EObject mModel;
	/** The address of the cdo server */
	private String mAddress;
	/** The name of */
	private String mRepository;
	
	@Override
	public String getRepository() {
		return mRepository;
	}
	
	@Override
	public void setRepository(final String pRepository) {
		this.mRepository = pRepository;
	}

	/** TODO: Nachpruefen ob der port auf was anderes gesetzt werden kann */
	private BigInteger mPort;

	/**
	 * @param pRepository
	 * @param pPort
	 * @param pAddress
	 * 
	 */
	public CDOHandler(final String pAddress, final BigInteger pPort,
			final String pRepository) {
		this.mAddress = pAddress;
		this.mPort = pPort;
		this.mRepository = pRepository;
		// Initialize a new connection
		this.mHandler = new Connection();
	}

	/**
	 * 
	 */
	private class Connection {
		/** */
		private CDOSession mSession;
		/** */
		private CDOTransaction mTransaction;
		/** */
		private IConnector mConnector;
		/** */
		private IManagedContainer mContainer;

		public CDOSession getSession() {
			return mSession;
		}

		public void setSession(final CDOSession pSession) {
			this.mSession = pSession;
		}

		public CDOTransaction getTransaction() {
			return mTransaction;
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

	/**
	 *
	 * 
	 */
	@Override
	public void openSession() {
		// Create a container
		this.mHandler.setContainer(ContainerUtil.createContainer());
		// Register net4j factories
		Net4jUtil.prepareContainer(this.mHandler.getContainer());
		// Register tcp factories
		TCPUtil.prepareContainer(this.mHandler.getContainer());
		// Register cdo factories
		CDONet4jUtil.prepareContainer(this.mHandler.getContainer());
		// Activate the container
		this.mHandler.getContainer().activate();
		// Set the connector to the connection and the corresponding ip address
		this.mHandler.setConnector(TCPUtil.getConnector(
				this.mHandler.getContainer(), this.mAddress));
		// Create configuration
		CDOSessionConfiguration configuration = CDONet4jUtil
				.createSessionConfiguration();
		// Set the connector
		configuration.setConnector(this.mHandler.getConnector());
		// Set the repository
		configuration.setRepositoryName(this.mRepository);
		// Open and set the sseion
		this.mHandler.setSession(configuration.openSession());
		// Register ClickWatchModel package registry
		this.mHandler.getSession().getPackageRegistry()
				.putEPackage(ClickWatchModelPackage.eINSTANCE);
		// Register the resource factory
		Resource.Factory.Registry registry = Resource.Factory.Registry.INSTANCE;
		// Get the extension factory as a map
		Map<String, Object> map = registry.getExtensionToFactoryMap();
		// Register extension
		map.put("clickwatchmodel", new XMIResourceFactoryImpl());
	}

	@Override
	public void openTransaction(final EObject pResource) {
		// Open a transaction session
		CDOTransaction transaction = this.mHandler.getSession()
				.openTransaction();
		// Get the repository
		CDOResource resource = transaction.getOrCreateResource(this.mRepository);
		// Add new content to the repository
		resource.getContents().add(pResource);
	}
	
	@Override
	public void openTransaction(final Collection<? extends EObject> pResourceCollection) {
		// Open a transaction session
		CDOTransaction transaction = this.mHandler.getSession()
				.openTransaction();
		// Get the repository
		CDOResource resource = transaction.getOrCreateResource(this.mRepository);
		// Add new content to the repository
		resource.getContents().addAll(pResourceCollection);
	}

	public void setHandler(Connection pHandler) {
		this.mHandler = pHandler;
	}

	@Override
	public void commitTransaction() {
		try {
			this.mHandler.getTransaction().commit();
		} catch (CommitException commitException) {
			commitException.printStackTrace();
		}
	}

	@Override
	public void rollbackTransaction() {
		this.mHandler.getTransaction().rollback();
	}

	@Override
	public void closeSession() {
		if (!this.mHandler.getSession().isClosed()) {
			this.mHandler.getSession().close();
		}
	

		if (!this.mHandler.getConnector().isClosed()) {
			this.mHandler.getConnector().close();
		}

		if (!this.mHandler.getContainer().isActive()) {
			this.mHandler.getContainer().deactivate();
		}
	}

	@Override
	public EObject getModel() {
		return mModel;
	}

	@Override
	public void setModel(EObject pModel) {
		this.mModel = pModel;
	}

	/**
	 * 
	 */
	@Deprecated
	public boolean sessionIsClosed() {
		return this.mHandler.getSession().isClosed();
	}
	
	/**
	 * 
	 */
	@Deprecated
	public boolean connectorIsClosed(){
		return this.mHandler.getConnector().isClosed();
	}
	
	/**
	 * 
	 */
	@Deprecated
	public boolean containerIsActive(){
		return this.mHandler.getContainer().isActive();
	}
}
