package edu.hu.clickwatch.analysis.composition.property;

import java.util.Collections;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.transaction.RecordingCommand;
import org.eclipse.emf.transaction.RollbackException;
import org.eclipse.emf.transaction.TransactionalCommandStack;
import org.eclipse.emf.transaction.TransactionalEditingDomain;

public class TransactionUtil {

    public static void runSafely(final Runnable runnable, final EObject eObject) {
        runSafely(runnable, org.eclipse.emf.transaction.util.TransactionUtil.getEditingDomain(eObject));
    }
    
    public static void runSafely(final Runnable runnable, final Resource resource) {
        runSafely(runnable, org.eclipse.emf.transaction.util.TransactionUtil.getEditingDomain(resource));
    }
    
    private static Object monitor = new Object();
    
    /**
     * Runs the given runnable in a transaction if the given EditingDomain is a transactional one.
     * 
     * @param runnable
     * @param editingDomain
     */
    public static void runSafely(final Runnable runnable, final EditingDomain editingDomain) {
        if (editingDomain != null && editingDomain instanceof TransactionalEditingDomain) {
        	TransactionalEditingDomain transEditingDomain = (TransactionalEditingDomain) editingDomain;
            // for the moment this should prevent concurrent transaction problems
        	synchronized (monitor) {
                try {
                    ((TransactionalCommandStack) editingDomain.getCommandStack()).execute(new RecordingCommand(transEditingDomain) {
                        @Override
                        protected void doExecute() {
                            runnable.run();
                        }
                    }, Collections.EMPTY_MAP);
                }
                catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                catch (RollbackException e) {
                    throw new RuntimeException(e);
                }
            }
        }
        else {
            runnable.run();
        }
    }

}
