package edu.hu.clickwatch.cdo;

import java.util.Collection;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author Michael Frey
 */
public interface ICDOHandler {
	public void openSession();
	
	public void openTransaction(final EObject pResource);
	
	void openTransaction(Collection<? extends EObject> pResourceCollection);

	public void commitTransaction();
	
	public void rollbackTransaction();

	public EObject getModel();

	public void setModel(EObject pModel);

	void closeSession();
	
	public String getRepository();
	
	public void setRepository(final String pRepository);

}
