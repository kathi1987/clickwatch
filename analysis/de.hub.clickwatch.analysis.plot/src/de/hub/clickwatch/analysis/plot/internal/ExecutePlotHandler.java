package de.hub.clickwatch.analysis.plot.internal;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.PlatformUI;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.analysis.plot.IPlot;
import de.hub.clickwatch.analysis.plot.IPlotAlgorithm;
import de.hub.clickwatch.analysis.plot.internal.PlotContributionFactory.PlotSpec;
import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.NumericalResult;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerEventAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerEventListener;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.util.ILogger;
import de.hub.clickwatch.util.Throwables;

public class ExecutePlotHandler extends AbstractHandler {
    
    @Inject DataBaseUtil dataBaseUtil;
    @Inject INodeConnectionProvider ncp;
    @Inject ILogger logger;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        final String plotName = event.getParameter("name");
        final String handlerName = event.getParameter("handler");
        final Handler handler = getSelection();
        final Record record = getRecord(handler);
        final Node node = getNode(handler);    
                
        if (record == null || node == null) {
            return null;
        }
        
        Collection<PlotSpec> plotSpecs = PlotContributionFactory.getPlots().get(handlerName);
        PlotSpec plotSpec = null;
        for (PlotSpec plotSpecIt: plotSpecs) {
            if (plotSpecIt.getName().equals(plotName)) {
                plotSpec = plotSpecIt;
            }
        }
        final PlotSpec fPlotSpec = plotSpec;
        Preconditions.checkArgument(fPlotSpec != null);
        
        String resultName = plotSpec.getName() + "(" + node.getINetAddress() + ") at "
                + DateFormat.getDateTimeInstance().format(new Date());
        Result genResult = record.getResults().getResult(resultName);
        if (genResult == null) {
            genResult = record.getResults().createNewNumericalResult(resultName);
        } else {
            Preconditions.checkArgument(genResult instanceof NumericalResult);
        }
        final NumericalResult result = (NumericalResult)genResult;
       
        result.getCharts().add(plotSpec.getChart());
        final IPlot plot = new IPlot() {
            @Override
            public void addResultEntry(Object... values) {
                result.getData().add(values);
            }
        };
        
        IPlotAlgorithm nfAlgorithm = null;
        try {
            nfAlgorithm = plotSpec.createPlotAlgorithm();
        } catch (CoreException e) {
            Throwables.propagate(e);
        }
        final IPlotAlgorithm algorithm = nfAlgorithm;
        
        if (node.isListening()) {
            // run as runtime analysis
            record.getResults().eAdapters().add(new AdapterImpl() {
                @Override
                public void notifyChanged(Notification msg) {
                    if (msg.getEventType() == Notification.REMOVE || msg.getEventType() == Notification.REMOVE_MANY) {
                        Object value = msg.getOldValue();
                        if (((value instanceof List) && ((List<?>)value).contains(result)) || value == result) {
                            INodeConnection connection = node.getConnection();
                            if (connection != null) {
                                connection.getAdapter(IHandlerEventAdapter.class).removeEventListener(fPlotSpec);
                            }
                        }
                    }
                }            
            });
            
            INodeConnection connection = ncp.createConnection(node);
            IHandlerEventAdapter hea = connection.getAdapter(IHandlerEventAdapter.class);
            hea.addEventListener(fPlotSpec, new IHandlerEventListener() {                
                @Override
                public void receivingStopped() {
                    
                }
                
                @Override
                public void receivingStarted() {
                    
                }
                
                @Override
                public void listeningStopped() {
                    
                }
                
                @Override
                public void listeningStarted() {
                    
                }
                
                @Override
                public void handlerReceived(Handler handler) {
                    if (handler.getQualifiedName().equals(handlerName)) {
                        algorithm.add(plot, handler);
                    }
                    // TODO remove with respect to the time axis
                    int ws = fPlotSpec.getWindowSize();
                    List<DataEntry> entries = result.getData().getEntries();
                    while (entries.size() > ws) {
                        entries.remove(0);
                    }
                    result.setTimestamp(new Date());
                    logger.log(ILogger.DEBUG, "performed runtime analysis", null);
                }
                
                @Override
                public void dispose() {
                    
                }
            });          
        } else { 
            ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
            try {
                progressDialog.run(true, false, new IRunnableWithProgress() {
                    @Override
                    public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                        Iterator<Handler> handlerIterator = dataBaseUtil.getHandlerIterator(
                                DataBaseUtil.createHandle(record, node, handler.getQualifiedName()), monitor);
                        while (handlerIterator.hasNext()) {
                            algorithm.add(plot, handlerIterator.next());
                            monitor.worked(1);
                        }
                        monitor.done();
                    }
                });
            } catch (Exception e) {
                Throwables.propagate(e);
            }
        }
        return null;
    }

    @Override
    public boolean isHandled() {
        return getSelection() != null;
    }

    private Record getRecord(Handler selectedHandler) {
        if (selectedHandler != null) {
            EObject container = selectedHandler.eContainer();
            while (container != null && !(container instanceof Record)) {
                container = container.eContainer();
            }
            if (container != null) {
                return (Record)container;
            }
        }
        return null;
    }
    
    private Node getNode(Handler selectedHandler) {
        if (selectedHandler != null) {
            EObject container = selectedHandler.eContainer();
            while (container != null && !(container instanceof Node)) {
                container = container.eContainer();
            }
            if (container != null) {
                return (Node)container;
            }
        }
        return null;
    }

    private Handler getSelection() {
        ISelection selection = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage().getActivePart().getSite()
                .getSelectionProvider().getSelection();
        if (selection instanceof IStructuredSelection) {
            Object firstElement = ((IStructuredSelection)selection).getFirstElement();
            if (firstElement != null && firstElement instanceof Handler) {
                Handler selectedHandler = (Handler)firstElement;
                return selectedHandler;
            }
        }
        return null;
    }
}
