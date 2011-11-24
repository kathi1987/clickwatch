package de.hub.clickwatch.ui.modelactions;

import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.jface.action.IAction;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IEditingDomainAdapter;
import de.hub.clickwatch.connection.adapter.IMergeAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.merge.IMergeConfiguration;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.ui.connection.UiClickWatchNodeMergeConfiguration;
import de.hub.clickwatch.util.Tasks;

/**
 * Establish a connection to the remote node via the click control element.
 */
public class AquireMetaData extends AbstractNodeAction {

    @Inject INodeConnectionProvider ncp;
    @Inject private Tasks tasks;

    @Override
    public void run(IAction action) {
        if (selectedObjectsIterator == null) {
            return;
        }

        while (selectedObjectsIterator.hasNext()) {
            final Node node = selectedObjectsIterator.next();
            tasks.dispatchTask(null, new Runnable() {
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
                    
                    final INodeConnection fConnection = connection;
                    tasks.dispatchTask(connection, new Runnable() {                        
                        @Override
                        public void run() {                            
                            final IMergeAdapter mergeAdapter = fConnection.getAdapter(IMergeAdapter.class);
                            IMergeConfiguration configuration = mergeAdapter.getMerger().getConfiguration();
                            fConnection.getAdapter(IEditingDomainAdapter.class).setEditingDomain(((IEditingDomainProvider)editor).getEditingDomain());
                            ((UiClickWatchNodeMergeConfiguration)configuration).setEditingDomainAdapter(fConnection.getAdapter(IEditingDomainAdapter.class));
                            IMetaDataAdapter mda = fConnection.getAdapter(IMetaDataAdapter.class);
                            final Node metaData = mda.pullAllMetaData();
                            shell.getDisplay().syncExec(new Runnable() {                                
                                @Override
                                public void run() {
                                    mergeAdapter.merge(metaData);
                                    EcoreUtil.delete(metaData);
                                }
                            });
                        }
                    });
                    connection.waitForOpenTasks();
                    connection.close();
                }
            });
        }
    }
}
