package edu.hu.clickwatch.cdo;

import org.eclipse.emf.cdo.eresource.CDOResource;
import org.eclipse.emf.cdo.net4j.CDONet4jUtil;
import org.eclipse.emf.cdo.net4j.CDOSessionConfiguration;
import org.eclipse.emf.cdo.transaction.CDOTransaction;
import org.eclipse.emf.cdo.util.CommitException;
import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.net4j.Net4jUtil;
import org.eclipse.net4j.tcp.TCPUtil;
import org.eclipse.net4j.util.container.ContainerUtil;

public class Server {
	/**
	 * 
	 */
	private Handler mHandler = null;
	/**
	 * 
	 */
	private CDOTransaction mTransaction = null;
	/**
	 * 
	 */
	private EObject mModel;
	
	/**
	 * 
	 */
	public Server(){
				
	}
	
	/**
	 *
	 * 
	 */
	public void openSession(final String pAddress, final String pRepositoryName){
		if(this.mHandler == null){
			this.mHandler = new Handler();
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
			this.mTransaction = this.mHandler.getSession().openTransaction();
			//
			CDOResource resource = this.mTransaction.getOrCreateResource(pResource);
			//
			System.out.println("First");
			
			for(EObject obj : resource.getContents()){
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
		/*
		try {
		this.mTransaction.commit();
		} catch (CommitException commitException) {
			commitException.printStackTrace();
		}*/
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
