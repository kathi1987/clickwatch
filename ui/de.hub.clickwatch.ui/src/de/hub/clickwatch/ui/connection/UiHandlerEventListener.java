package de.hub.clickwatch.ui.connection;

import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.IErrorAdapter.IErrorListener;
import de.hub.clickwatch.connection.adapter.IHandlerEventListener;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.merge.Merger;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;

public class UiHandlerEventListener implements IHandlerEventListener, IErrorListener {

	private Node node;
	private Shell shell;
	
	private @Inject Merger merger;
	private @Inject ILogger logger;

	public void init(Shell shell, Node node) {
		this.shell = shell;
		this.node = node;
	}
	
	private void updateMetaData() {		
		final Node newMetaData = node.getConnection().getAdapter(IMetaDataAdapter.class).pullAllMetaData();
		getDisplay().syncExec(new Runnable() {						
			@Override
			public void run() {
				merger.merge(node, newMetaData);
			}
		});
	}

	@Override
	public void handlerReceived(final Handler handler) {	
		final Handler guiHandler = node.getHandler(handler.getQualifiedName());
		logger.log(ILogger.DEBUG, "handling received handler in GUI", null);
		if (guiHandler == null) {
			logger.log(ILogger.WARNING, "GUI received handler " + handler.getQualifiedName() + " that is not in the current node meta-data", null);
			updateMetaData();
		} else {
			getDisplay().syncExec(new Runnable() {	
				@Override
				public void run() {
					merger.merge(guiHandler, handler);
				}
			});
		}
	}

	@Override
	public void receivingStarted() {
		runInGUI(new Runnable() {			
			@Override
			public void run() {
				node.setRetrieving(true);		
			}
		});
	}

	@Override
	public void receivingStopped() {
		runInGUI(new Runnable() {			
			@Override
			public void run() {
				node.setRetrieving(false);
			}
		});		
	}
	
	@Override
	public void handlerError(String message, Throwable e) {
		openError("Error in connection", "There was an error due to an exception. "
				+ "The connection was probably terminated automatically. Error message: " 
				+ message + ". " + "Exception message: " + e.getMessage() 
				+ ". Exception type: " + e.getClass().getSimpleName() + ".");
	}

	private void runInGUI(final Runnable runnable) {
		getDisplay().asyncExec(new Runnable() {
			@Override
			public void run() {
				try {
					runnable.run();
				} catch (RuntimeException e) {
					openError("Exception", "Exception " + e.getClass().getName()
									+ " occured: " + e.getMessage()
									+ ". Node is forced to disconnect.");
				}
			}
		});
	}

	private void openError(String title, String message) {
		MessageDialog.openError(getDisplay().getActiveShell(), title, message);
	}
	
	private Display getDisplay() {
		return shell.getDisplay();
	}
}
