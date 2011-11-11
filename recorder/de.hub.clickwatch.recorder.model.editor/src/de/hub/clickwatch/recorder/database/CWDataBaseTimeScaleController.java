package de.hub.clickwatch.recorder.database;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.dialogs.ProgressMonitorDialog;
import org.eclipse.jface.operation.IRunnableWithProgress;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.jface.viewers.Viewer;
import org.eclipse.swt.events.MouseEvent;
import org.eclipse.swt.events.MouseListener;
import org.eclipse.swt.events.SelectionEvent;
import org.eclipse.swt.events.SelectionListener;
import org.eclipse.swt.widgets.Scale;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IEditingDomainAdapter;
import de.hub.clickwatch.connection.adapter.IMergeAdapter;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.TimeStampLabelProvider;
import de.hub.clickwatch.recorder.database.presentation.CWDataBaseEditor;
import de.hub.clickwatch.ui.connection.UiClickWatchNodeMergeConfiguration;

public class CWDataBaseTimeScaleController {

    @Inject private DataBaseUtil dataBaseUtil;
    @Inject private INodeConnectionProvider ncp;

    private Viewer viewer;
    private CWDataBaseEditor editor;
    private Scale scale;

    private ISelectionChangedListener viewerListener;

    private Record currentRecord = null;
    private Node selectedNode = null;
    private Handler selectedHandler = null;

    public void init(Scale scale, CWDataBaseEditor editor, TreeViewer viewer) {
        this.scale = scale;
        this.viewer = viewer;
        this.editor = editor;

        installListeners();
        selectionChanged(viewer.getSelection());
    }

    private void installListeners() {
        viewerListener = new ISelectionChangedListener() {
            @Override
            public void selectionChanged(SelectionChangedEvent event) {
                CWDataBaseTimeScaleController.this.selectionChanged(event.getSelection());
            }
        };
        viewer.addSelectionChangedListener(viewerListener);

        scale.addMouseListener(new MouseListener() {

            @Override
            public void mouseUp(MouseEvent e) {
                if (selectedHandler == null) {
                    jump();
                }
            }

            @Override
            public void mouseDown(MouseEvent e) {
                // empty
            }

            @Override
            public void mouseDoubleClick(MouseEvent e) {
                // empty
            }
        });
        scale.addSelectionListener(new SelectionListener() {

            @Override
            public void widgetSelected(SelectionEvent e) {
                sliding();
                if (selectedHandler != null) {
                    jump();
                }
            }

            @Override
            public void widgetDefaultSelected(SelectionEvent e) {
                // empty
            }
        });
    }

    public void dispose() {
        uninstallListeners();
        scale.dispose();
    }

    private void uninstallListeners() {
        viewer.removeSelectionChangedListener(viewerListener);
    }

    private void selectionChanged(ISelection newSelection) {
        this.selectedNode = null;
        this.selectedHandler = null;
        long time = 0;
        if (newSelection instanceof IStructuredSelection) {
            IStructuredSelection structuredSelection = (IStructuredSelection)newSelection;
            Object object = structuredSelection.getFirstElement();
            if (object instanceof EObject) {
                EObject eObject = (EObject)object;
                while (!(eObject instanceof Record) && eObject != null) {
                    if (eObject instanceof Node) {
                        this.selectedNode = (Node)eObject;                        
                    } else if (eObject instanceof Handler) {
                        this.selectedHandler = (Handler)eObject;
                        time = ((Handler)eObject).getTimestamp();
                    } else if (eObject instanceof Network && time == 0) {
                        time = ((Network)eObject).getTimestamp();
                    }
                    eObject = eObject.eContainer();
                }
                if (eObject != null && eObject instanceof Record) {
                    if (currentRecord != eObject) {
                        setCurrentRecord((Record)eObject);
                    }
                    setTime(time);
                    return;
                }
            }
        }
        unsetCurrentRecord();
    }

    private void unsetCurrentRecord() {
        this.currentRecord = null;
        scale.setEnabled(false);
    }

    private void setTime(long time) {
        Preconditions.checkArgument(currentRecord != null);
        long duration = currentRecord.getEnd() - currentRecord.getStart();
        long relativeTime = time - currentRecord.getStart();
        scale.setSelection((int)(relativeTime * scale.getMaximum() / duration));
    }

    private void sliding() {
        Preconditions.checkArgument(currentRecord != null);
        long duration = currentRecord.getEnd() - currentRecord.getStart();
        long relativeTime = scale.getSelection() * duration / scale.getMaximum();
        final long time = currentRecord.getStart() + relativeTime;

        scale.setToolTipText(new TimeStampLabelProvider().getText(time));
    }

    private void setCurrentRecord(Record currentRecord) {
        this.currentRecord = currentRecord;
        scale.setEnabled(true);
        Network ntc = currentRecord.getConfiguration();
        if (ntc != null && ntc.getTimestamp() > 0) {
            setTime(ntc.getTimestamp());
            sliding();
        } else {
            scale.setSelection(0);
        }
    }

    private void runJump(long time, IProgressMonitor monitor) {
        Network networkTimeCopy = currentRecord.getConfiguration();

        monitor.beginTask("resetting nodes to new time", networkTimeCopy.getNodes().size() + 1);
        monitor.worked(1);

        if (selectedHandler != null) {
            IMergeAdapter mergeAdapter = getAdapter(selectedNode, IMergeAdapter.class);

            Handler dbHandler = dataBaseUtil.getHandler(DataBaseUtil.createHandle(currentRecord, selectedNode, selectedHandler,
                    time));
            if (dbHandler == null) {
                dbHandler = ClickWatchModelFactory.eINSTANCE.createHandler();
                dbHandler.setName(selectedHandler.getName());
            }
            
            mergeAdapter.merge(dbHandler);
            getAdapter(selectedNode, IEditingDomainAdapter.class).set(selectedHandler, ClickWatchModelPackage.eINSTANCE.getHandler_Timestamp(), time);
            getAdapter(selectedNode, IEditingDomainAdapter.class).set(selectedHandler, ClickWatchModelPackage.eINSTANCE.getHandler_CanRead(), false);
            EcoreUtil.delete(dbHandler);

            monitor.worked(1);
        } else {
            networkTimeCopy.setTimestamp(time);
            List<Node> nodes = new ArrayList<Node>();
            if (selectedNode != null) {
                nodes.add(selectedNode);
            } else {
                nodes.addAll(networkTimeCopy.getNodes());
            }
            for (Node currentNode : nodes) {
                IMergeAdapter mergeAdapter = getAdapter(currentNode, IMergeAdapter.class);

                // get node from data base
                Node nodeTimeCopy = dataBaseUtil.getNode(DataBaseUtil.createHandle(currentRecord, currentNode, time));

                if (nodeTimeCopy != null) {
                    // merge node into gui
                    mergeAdapter.merge(nodeTimeCopy);
                    EcoreUtil.delete(nodeTimeCopy);
                }

                monitor.worked(1);
            }
        }
        monitor.done();
    }

    private void jump() {
        Preconditions.checkArgument(currentRecord != null);
        long duration = currentRecord.getEnd() - currentRecord.getStart();
        long relativeTime = scale.getSelection() * duration / scale.getMaximum();
        final long time = currentRecord.getStart() + relativeTime;

        try {
            if (selectedHandler == null) {
                // run with progress monitor
                ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(scale.getShell());
                progressMonitorDialog.run(false, false, new IRunnableWithProgress() {
                    @Override
                    public void run(IProgressMonitor monitor) {
                        runJump(time, monitor);
                    }
                });
            } else {
                runJump(time, new NullProgressMonitor());
            }
        } catch (Exception e) {
            MessageDialog.openError(scale.getShell(), "Exception", "Exception (" + e.getClass().getSimpleName()
                    + ") during jumping in time: " + e.getMessage());
        }
    }   

    private <T> T getAdapter(Node node, Class<T> adapterClass) {
        INodeConnection connection = node.getConnection();
        if (connection == null) {
            connection = ncp.createConnection(node);
            IMergeAdapter mergeAdapter = connection.getAdapter(IMergeAdapter.class);
            IEditingDomainAdapter eda = connection.getAdapter(IEditingDomainAdapter.class);
            eda.setEditingDomain(editor.getEditingDomain());
            ((UiClickWatchNodeMergeConfiguration)mergeAdapter.getMerger().getConfiguration()).setEditingDomainAdapter(eda);         
        }
        return connection.getAdapter(adapterClass);
    }
}
