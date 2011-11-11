package de.hub.clickwatch.ui.modelactions;

import java.sql.Connection;

import org.eclipse.jface.action.IAction;

import com.google.inject.Inject;
import com.google.inject.Provider;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.ui.connection.UiHandlerEventListener;
import de.hub.clickwatch.util.Tasks;

/**
 * Establish a connection to the remote node via the click control element.
 */
public class Connect extends AbstractNodeAction {
	
	@Inject INodeConnectionProvider ncp;
	@Inject Provider<UiHandlerEventListener> handlerProvider;
    @Inject private Tasks taskDispatcher;

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
			        // dispose existing connection if necessary
		            INodeConnection connection = node.getConnection();
		            if (connection != null) {
	                    connection.waitForOpenTasks();
		            }
		            if (connection != null) {
		                if (!node.getErrors().isEmpty()) {
		                    connection.dispose();                            
		                }
		            }		            
		            
			        // connect or reconnect
			        connection = ncp.createConnection(node);
			        connection.waitForOpenTasks();
                    IHandlerEventAdapter hea = connection.getAdapter(IHandlerEventAdapter.class);                        
                    UiHandlerEventListener handler = (UiHandlerEventListener)hea.getEventListener(node);
                    if (handler == null) {
                        handler = handlerProvider.get();
                        handler.init(shell, node, editor);
                        hea.addEventListener(Connection.class, handler);
                    }                                                                                                                                        
                                        
                    connection.getAdapter(IHandlerEventAdapter.class).start();
			    }
			});
		}
	}
}
