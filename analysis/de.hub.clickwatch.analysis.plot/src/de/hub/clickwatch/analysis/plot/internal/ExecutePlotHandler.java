package de.hub.clickwatch.analysis.plot.internal;

import java.lang.reflect.InvocationTargetException;
import java.text.DateFormat;
import java.util.Collection;
import java.util.Date;
import java.util.Iterator;

import org.eclipse.core.commands.AbstractHandler;
import org.eclipse.core.commands.ExecutionEvent;
import org.eclipse.core.commands.ExecutionException;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
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
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.util.Throwables;

public class ExecutePlotHandler extends AbstractHandler {
    
    @Inject DataBaseUtil dataBaseUtil;

    @Override
    public Object execute(ExecutionEvent event) throws ExecutionException {
        final Shell shell = PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell();
        final String plotName = event.getParameter("name");
        final String handlerName = event.getParameter("handler");
        final Handler handler = getSelection();
        final Record record = getRecord(handler);
        final Node node = getNode(handler);                    
          
        ProgressMonitorDialog progressDialog = new ProgressMonitorDialog(shell);
        try {
            progressDialog.run(true, false, new IRunnableWithProgress() {
                @Override
                public void run(IProgressMonitor monitor) throws InvocationTargetException, InterruptedException {
                    Collection<PlotSpec> plotSpecs = PlotContributionFactory.getPlots().get(handlerName);
                    PlotSpec plotSpec = null;
                    for (PlotSpec plotSpecIt: plotSpecs) {
                        if (plotSpecIt.getName().equals(plotName)) {
                            plotSpec = plotSpecIt;
                        }
                    }
                    Preconditions.checkArgument(plotSpec != null);
                                                          
                    if (record == null || node == null) {
                        monitor.done();
                        return;                        
                    }
                    
                    Iterator<Handler> handlerIterator = dataBaseUtil.getHandlerIterator(
                            DataBaseUtil.createHandle(record, node, handler.getQualifiedName()), monitor);
                    String resultName = plotSpec.getName() + "(" + node.getINetAddress() + ") at "
                            + DateFormat.getDateTimeInstance().format(new Date());
                    final Result result = record.getResults().getResult(resultName);

                    result.getCharts().add(plotSpec.getChart());
                    IPlot plot = new IPlot() {
                        @Override
                        public void addResultEntry(Object... values) {
                            result.getData().add(values);
                        }
                    };
                    
                    IPlotAlgorithm algorithm = null;
                    try {
                        algorithm = plotSpec.createPlotAlgorithm();
                    } catch (CoreException e) {
                        Throwables.propagate(e);
                    }
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
