package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;

import edu.hu.clickwatch.model.AbstractNodeConnection;
import edu.hu.clickwatch.model.Node;

/**
 * Reboots a node using SSH.
 * 
 * @author zubow
 */
public class Reboot extends AbstractNodeAction {

	@Override
	public void run(IAction action) {
		if (node_lst == null || node_lst.isEmpty()) {
			return;
		}
	
		String cmd = "reboot";
		
		//  create n parallel execution threads
		ExecWorkerThread[] workerThreads = new ExecWorkerThread[node_lst.size()];
		for (int idx=0; idx<node_lst.size(); idx++) {
			final Node node = node_lst.get(idx);

			// disconnect if connected
			if (node.getConnection() != null) {
				AbstractNodeConnection oldConnection = (AbstractNodeConnection)node.getConnection();
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
