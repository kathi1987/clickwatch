package edu.hu.clickwatch.server.database;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
import org.eclipse.emf.cdo.session.CDOSession;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.connector.IConnector;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;
import org.eclipse.net4j.util.container.IManagedContainer;

import edu.hu.clickwatch.model.Node;



public class Database {
	/** */
	private Connection mHandler = null;
	/** */
	private EObject mModel;
	
	/**
	 * 
	 */
	public Database(){
				
	}
	
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
	
	/**
	 *
	 * 
	 */
	public void openSession(final String pAddress, final String pRepositoryName){
		if(this.mHandler == null){
			this.mHandler = new Connection();
			//
			this.mHandler.setContainer(ContainerUtil.createContainer());
			// Register net4j factories
			Net4jUtil.prepareContainer(this.mHandler.getContainer());
			// Register tcp factories
			TCPUtil.prepareContainer(this.mHandler.getContainer());
			// Register cdo factories
			CDONet4jUtil.prepareContainer(this.mHandler.getContainer());
			// Activate
			this.mHandler.getContainer().activate();
			//
			this.mHandler.setConnector(TCPUtil.getConnector(this.mHandler.getContainer(), pAddress));
			// Create configuration
			CDOSessionConfiguration configuration = CDONet4jUtil.createSessionConfiguration();
			//
			configuration.setConnector(this.mHandler.getConnector());
			//
			configuration.setRepositoryName(pRepositoryName); 
			//
			this.mHandler.setSession(configuration.openSession());
			// Test
//			this.mHandler.getSession().getPackageRegistry().putEPackage(LibraryPackage.eINSTANCE);
			// cdoSession.getPackageRegistry().putEPackage(CompanyPackage.eINSTANCE);
		}	
	}
	
	public void openTransaction(final String pResource){
		if(this.mHandler != null){
			//
			CDOTransaction transaction = this.mHandler.getSession().openTransaction();
			//
			CDOResource resource = transaction.getOrCreateResource(pResource);
			//
			System.out.println("First");
			
			for(EObject obj : resource.getContents()){
				if(obj instanceof Node){
					
				}
//				if(obj instanceof Library){
//					System.out.println(((Library)obj).getName());
//				}
				System.out.println(obj.toString());
			}
			//
			resource.getContents().clear();
			// Example
//			final Library library = LibraryFactory.eINSTANCE.createLibrary();
//			library.setName("Johann von Neumann");
//			resource.getContents().add(library);
			System.out.println("Second");
			for(EObject obj : resource.getContents()){
				System.out.println(obj.toString());
			}
			
		}
	}
	
	public void commitTransaction(){
		try {
			this.mHandler.getTransaction().commit();
		} catch (CommitException commitException) {
			commitException.printStackTrace();
		}
	}
	
	public void rollbackTransaction(){
		this.mTransaction.rollback();
	}
		
	public void closeSession(){
		if(!this.mHandler.getSession().isClosed()){
			this.mHandler.getSession().close();
		}
		
		if(!this.mHandler.getConnector().isClosed()){
			this.mHandler.getConnector().close();
		}
		
		if(!this.mHandler.getContainer().isActive()){
			this.mHandler.getContainer().deactivate();
		}
	}

	public EObject getModel() {
		return mModel;
	}

	public void setModel(EObject pModel) {
		this.mModel = pModel;
	}
}
