package edu.hu.clickwatch.cdo;

import org.eclipse.emf.ecore.EObject;

/**
 * 
 * @author Michael Frey
 */
public interface ICDOHandler {
	public void openSession();
	
	public void openTransaction(final String pResource);

	public void commitTransaction();
	
	public void rollbackTransaction();

	public EObject getModel();

	public void setModel(EObject pModel);

	void closeSession();
}
