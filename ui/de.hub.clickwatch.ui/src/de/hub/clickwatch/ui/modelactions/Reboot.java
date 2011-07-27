package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.model.Node;


/**
 * Reboots a node using SSH.
 * 
 * @author zubow
 */
public class Reboot extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (selectedObjects == null || selectedObjects.isEmpty()) {
			return;
		}
	
		String cmd = "reboot";
		
		//  create n parallel execution threads
		ExecWorkerThread[] workerThreads = new ExecWorkerThread[selectedObjects.size()];
		for (int idx=0; idx<selectedObjects.size(); idx++) {
			final Node node = selectedObjects.get(idx);

			// disconnect if connected
			if (node.getConnection() != null) {
				INodeConnection oldConnection = (INodeConnection)node.getConnection();
				node.setConnection(null);
				oldConnection.disconnect();
			}

			workerThreads[idx] = new ExecWorkerThread(node.getINetAddress(), cmd);
			workerThreads[idx].start();
		}
		
		// sync point: wait until all worker threads are finished
		for (int i=0; i<workerThreads.length; i++) {
			try {
				workerThreads[i].join();
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
}
