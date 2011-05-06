package edu.hu.clickwatch.analysis.automated;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.core.runtime.IStatus;
import org.eclipse.core.runtime.Platform;
import org.eclipse.core.runtime.Status;
import org.eclipse.jface.action.IAction;
import org.eclipse.jface.dialogs.IDialogSettings;
import org.eclipse.jface.dialogs.MessageDialog;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.window.Window;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Control;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IObjectActionDelegate;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.dialogs.FilteredItemsSelectionDialog;

import edu.hu.clickwatch.analysis.ui.Activator;
import edu.hu.clickwatch.model.Network;

public class StartAutomatedAnalysis implements IObjectActionDelegate {
	
	private Shell shell = null;
	private Network selection = null;
	
	private class SelectAnalysisDialog extends FilteredItemsSelectionDialog {
		private static final String DIALOG_SETTINGS = "edu.hu.clickwatch.analysis.automated.StartAutomatedAnalysis.SelectAnalysisDialog";	

		public SelectAnalysisDialog() {
			super(shell, false);
		}

		@Override
		protected Control createExtendedContentArea(Composite parent) {
			return null;
		}

		@Override
		protected IDialogSettings getDialogSettings() {
			IDialogSettings settings = Activator.getDefault()
					.getDialogSettings().getSection(DIALOG_SETTINGS);
			if (settings == null) {
				settings = Activator.getDefault().getDialogSettings()
						.addNewSection(DIALOG_SETTINGS);
			}
			return settings;
		}

		@Override
		protected IStatus validateItem(Object item) {
			return Status.OK_STATUS;
		}

		@Override
		protected ItemsFilter createFilter() {
			return new ItemsFilter() {				
				@Override
				public boolean matchItem(Object item) {
					return matches(((AutoAnalysisExtension)item).getName());
				}
				
				@Override
				public boolean isConsistentItem(Object item) {
					return true;
				}
			};
		}

		@Override
		protected Comparator<?> getItemsComparator() {
			return new Comparator<Object>() {
				@Override
				public int compare(Object arg0, Object arg1) {
					try {
						return ((AutoAnalysisExtension)arg0).getName().compareTo(((AutoAnalysisExtension)arg1).getName());
					} catch (Exception e) {
						e.printStackTrace();
						return 0;
					}
				}
			};
		}

		@Override
		protected void fillContentProvider(
				AbstractContentProvider contentProvider,
				ItemsFilter itemsFilter, IProgressMonitor progressMonitor)
				throws CoreException {			
			for (Object item: getAutomatedAnalysises()) {
				contentProvider.add(item, itemsFilter);
			}
		}

		@Override
		public String getElementName(Object item) {
			return ((AutoAnalysisExtension)item).getName();
		}
		
	}

	@Override
	public void run(IAction action) {
		AutomatedAnalysisContainer aac = AutomatedAnalysisContainer.getInstance();
		if (aac.isRunning()) {
			MessageDialog.openError(shell, "Clickwatch Error",
					"You can only run one automated analysis at a time");
		} else {
			SelectAnalysisDialog selectAnalysisDialog = new SelectAnalysisDialog();
			selectAnalysisDialog.setInitialPattern("?");
			selectAnalysisDialog.open();
			if (selectAnalysisDialog.getReturnCode() == Window.OK) {
				AutoAnalysisExtension autoAnalysis = (AutoAnalysisExtension)selectAnalysisDialog.getResult()[0];
				IAutomatedAnalysis instance = autoAnalysis.instantiate();
				if (instance != null) {
					aac.startAnalysis(instance, autoAnalysis.getInterval(), selection);
				}
			}
		}
	}

	@Override
	public void selectionChanged(IAction action, ISelection selection) {
		try {
			this.selection = (Network) ((IStructuredSelection)selection).getFirstElement();
		} catch (Exception e) {
			MessageDialog.openError(shell, "Clickwatch Error",
					"You can only call this action on a Network");
		}
	}

	@Override
	public void setActivePart(IAction action, IWorkbenchPart targetPart) {
		shell = targetPart.getSite().getShell();
	}
	
	private class AutoAnalysisExtension {
		final IConfigurationElement configurationElement;
		AutoAnalysisExtension(IConfigurationElement configurationElement) {
			this.configurationElement = configurationElement;
		}
		
		public String toString() {
			return getName();
		}
		
		public long getInterval() {
			String interval = configurationElement.getAttribute("interval");
			if (interval == null) {
				return 5000;
			} else {
				return new Long(interval);
			}
		}
		
		public String getName() {
			return configurationElement.getAttribute("name");
		}
		
		public IAutomatedAnalysis instantiate() {
			try {
				final Object o = configurationElement.createExecutableExtension("class");
				if (o instanceof IAutomatedAnalysis) {
					return (IAutomatedAnalysis)o;
				} else {
					MessageDialog.openError(shell, "Clickwatch Error",
							o.getClass() + " does not implements IAutomatedAnalysis");
				}
			} catch (CoreException e) {
				MessageDialog.openError(shell, "Clickwatch Error",
							e.getMessage());
			}
			return null;
		}
	}

	private List<AutoAnalysisExtension> getAutomatedAnalysises() {
		List<AutoAnalysisExtension> result = new ArrayList<StartAutomatedAnalysis.AutoAnalysisExtension>();
		for (IConfigurationElement configurationElement: Platform.getExtensionRegistry()
				.getConfigurationElementsFor("edu.hu.clickwatch.analysis.AutoAnalysis")) {
			result.add(new AutoAnalysisExtension(configurationElement));
		}
		return result;
	}
}
