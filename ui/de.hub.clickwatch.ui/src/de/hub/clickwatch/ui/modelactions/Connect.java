package de.hub.clickwatch.ui.modelactions;

import org.eclipse.jface.action.IAction;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.IMergeAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.ui.connection.UiHandlerEventListener;
import de.hub.clickwatch.util.TaskQueues;

/**
 * Establish a connection to the remote node via the click control element.
 */
public class Connect extends AbstractNodeAction {
	
	@Inject INodeConnectionProvider ncp;
	@Inject Provider<UiHandlerEventListener> handlerProvider;
    @Inject private TaskQueues taskDispatcher;

	@Override
	public void run(IAction action) {
		if (selectedObjectsIterator == null) {
			return;
		}
		
		while (selectedObjectsIterator.hasNext()) {
		    final Node node = selectedObjectsIterator.next();
			taskDispatcher.dispatchTask(null, new Runnable() {                
                @Override
                public void run() {                    
                    ncp.createConnection(node);
                    INodeConnection nodeConnection = node.getConnection();        
                    
                    IHandlerEventAdapter hea = nodeConnection.getAdapter(IHandlerEventAdapter.class);
                    UiHandlerEventListener handler = handlerProvider.get();
                    handler.init(shell, node);
                    hea.addEventListener(handler);
                    
                    final Node metaData = nodeConnection.getAdapter(IMetaDataAdapter.class).pullAllMetaData();
                    shell.getDisplay().syncExec(new Runnable() {                        
                        @Override
                        public void run() {
                            try {
                                node.getConnection().getAdapter(IMergeAdapter.class).merge(metaData);
                                node.filter();
                            } catch (Exception e) {
                                // TODO   
                                System.out.println("EXXXXX");
                            }
                        }
                    });
                    hea.start();
                }                
            });
		}
	}
}
