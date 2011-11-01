package de.hub.clickwatch.ui.connection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IPartListener;
import org.eclipse.ui.IWorkbenchPart;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.IErrorAdapter;
import de.hub.clickwatch.connection.adapter.IHandlerEventListener;
import de.hub.clickwatch.connection.adapter.IMergeAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.merge.IMergeConfiguration;
import de.hub.clickwatch.model.ClickWatchModelPackage;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;

public class UiHandlerEventListener implements IHandlerEventListener {

    private IEditorPart editor;
    private Node node;
    private Shell shell;
    private boolean updateMetaData = false;

    private @Inject ILogger logger;

    private boolean haveReceivedInCurrentCycle = false;
    private final AdapterImpl filterAdapter = new AdapterImpl() {
        @Override
        public void notifyChanged(Notification msg) {
            if (msg.getFeature() == ClickWatchModelPackage.eINSTANCE.getNetwork_ElementFilter() ||
                    msg.getFeature() == ClickWatchModelPackage.eINSTANCE.getNetwork_HandlerFilter()) {
                scheduleUpdateMetaData();
            }
        }
    };
    private final IPartListener partListener = new IPartListener() {
        
        @Override
        public void partOpened(IWorkbenchPart part) {
        }
        
        @Override
        public void partDeactivated(IWorkbenchPart part) {
        }
        
        @Override
        public void partClosed(IWorkbenchPart part) {
            if (part == editor) {
                node.getConnection().dispose();
            }
        }
        
        @Override
        public void partBroughtToTop(IWorkbenchPart part) {
        }
        
        @Override
        public void partActivated(IWorkbenchPart part) {
        }
    };

    public void init(Shell shell, Node node, IEditorPart editor) {
        this.editor = editor;
        this.shell = shell;
        this.node = node;
        
        Network network = getNetwork();
        if (network != null) {
            EList<Adapter> eAdapters = network.eAdapters();
            if (!eAdapters.contains(filterAdapter)) {
                eAdapters.add(filterAdapter);
            }
        }
        
        Preconditions.checkState(editor != null, "No editor");
        IMergeConfiguration configuration = node.getConnection().getAdapter(IMergeAdapter.class).getMerger().getConfiguration();
        ((UiClickWatchNodeMergeConfiguration)configuration).setEditingDomain(((IEditingDomainProvider)editor).getEditingDomain());
        
        editor.getSite().getWorkbenchWindow().getPartService().addPartListener(partListener);
    }

    public void scheduleUpdateMetaData() {
        logger.log(ILogger.DEBUG, "scheduled meta data update", null);
        updateMetaData = true;
    }

    private void updateMetaData() {
        final Node newMetaData = node.getConnection().getAdapter(IMetaDataAdapter.class).pullAllMetaData();
        Network network = getNetwork();
        if (network != null) {
            newMetaData.filter(network.getElementFilter(), network.getHandlerFilter());
        }
        getDisplay().syncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    node.getConnection().getAdapter(IMergeAdapter.class).merge(newMetaData);
                } catch (Exception e) {
                    node.getConnection().getAdapter(IErrorAdapter.class)
                            .createError("Exception during update command execution", e);
                }
            }
        });
        logger.log(ILogger.DEBUG, "GUI merged meta data into node.", null);
    }

    @Override
    public void handlerReceived(final Handler handler) {
        final Handler guiHandler = node.getHandler(handler.getQualifiedName());
        if (!haveReceivedInCurrentCycle) {
            logger.log(ILogger.DEBUG, "handler received handler in GUI", null);
            haveReceivedInCurrentCycle = true;
        }

        if (guiHandler == null) {
            logger.log(ILogger.WARNING, "GUI received handler " + handler.getQualifiedName()
                    + " that is not in the current node meta-data", null);
        } else {
            getDisplay().syncExec(new Runnable() {
                @Override
                public void run() {
                    node.getConnection().getAdapter(IMergeAdapter.class).merge(handler);
                }
            });

        }
    }

    @Override
    public void receivingStarted() {
        haveReceivedInCurrentCycle = false;
        if (updateMetaData) {
            updateMetaData();
            updateMetaData = false;
        }
        getDisplay().syncExec(new Runnable() {
            @Override
            public void run() {
                node.getConnection().getAdapter(IMergeAdapter.class).clearChanges();
                node.setRetrieving(true);
            }
        });
    }

    @Override
    public void receivingStopped() {
        getDisplay().syncExec(new Runnable() {
            @Override
            public void run() {
                try {
                    node.setRetrieving(false);
                } catch (Exception e) {
                    node.getConnection().getAdapter(IErrorAdapter.class)
                            .createError("Exception during update command execution", e);
                }
            }
        });
    }
    
    private Network getNetwork() {
        if (node.eContainer() != null && node.eContainer() instanceof Network) {
            return (Network)node.eContainer();         
        } else {
            return null;
        }
    }

    private Display getDisplay() {
        return shell.getDisplay();
    }

    @Override
    public void dispose() {
        Network network = getNetwork();
        if (network != null) {
            network.eAdapters().remove(filterAdapter);
        }
        editor.getSite().getWorkbenchWindow().getPartService().removePartListener(partListener);
    }
}
