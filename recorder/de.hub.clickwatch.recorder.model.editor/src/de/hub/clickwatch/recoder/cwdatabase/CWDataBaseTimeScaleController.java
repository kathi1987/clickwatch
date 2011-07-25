package de.hub.clickwatch.recoder.cwdatabase;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
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

import de.hub.clickwatch.merge.Merger;
import de.hub.clickwatch.model.ChangeMark;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.provider.TimeStampLabelProvider;
import de.hub.clickwatch.recoder.cwdatabase.presentation.CWDataBaseEditor;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.ui.connection.MergingNodeAdapterMergeConfiguration;

public class CWDataBaseTimeScaleController {
	
	@Inject private Merger merger;
	@Inject private DataBaseUtil dataBaseUtil;

	private Viewer viewer;
	private CWDataBaseEditor editor;
	private Scale scale; 
	
	private ISelectionChangedListener viewerListener;

	private ExperimentDescr currentExperiment = null;
	private Node selectedNode = null;
	
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
				jump();
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
		if (newSelection instanceof IStructuredSelection) {
			IStructuredSelection structuredSelection = (IStructuredSelection)newSelection;
			Object object = structuredSelection.getFirstElement();
			if (object instanceof EObject) {
				EObject eObject = (EObject)object;
				while (!(eObject instanceof ExperimentDescr) && eObject != null) {
					if (eObject instanceof Node) {
						this.selectedNode = (Node)eObject;
					}
					eObject = eObject.eContainer();
				}
				if (eObject != null && eObject instanceof ExperimentDescr) {
					if (currentExperiment != eObject) {
						setCurrentExperiment((ExperimentDescr)eObject);
						return;
					}
				}
			}
		}
		unsetCurrentExperiment();
	}
	
	private void unsetCurrentExperiment() {
		this.currentExperiment = null;
		this.selectedNode = null;
		scale.setEnabled(false);
	}
	
	private void setTime(long time) {
		Preconditions.checkArgument(currentExperiment != null);
		long duration = currentExperiment.getEnd() - currentExperiment.getStart();
		long relativeTime = time - currentExperiment.getStart();
		scale.setSelection((int)(relativeTime * scale.getMaximum() / duration));
	}
	

	private void sliding() {
		Preconditions.checkArgument(currentExperiment != null);
		long duration = currentExperiment.getEnd() - currentExperiment.getStart();
		long relativeTime = scale.getSelection() * duration / scale.getMaximum();
		final long time = currentExperiment.getStart() + relativeTime;
		
		scale.setToolTipText(new TimeStampLabelProvider().getText(time));
	}

	private void setCurrentExperiment(ExperimentDescr currentExperiment) {
		this.currentExperiment = currentExperiment;
		scale.setEnabled(true);
		Network ntc = currentExperiment.getNetworkTimeCopy();
		if (ntc != null && ntc.getTime() > 0) {
			setTime(ntc.getTime());
			sliding();
		} else {
			scale.setSelection(0);
		}
	}
	
	private void jump() {
		Preconditions.checkArgument(currentExperiment != null);
		long duration = currentExperiment.getEnd() - currentExperiment.getStart();
		long relativeTime = scale.getSelection() * duration / scale.getMaximum();
		final long time = currentExperiment.getStart() + relativeTime;
		
		ProgressMonitorDialog progressMonitorDialog = new ProgressMonitorDialog(scale.getShell());
		try {
			progressMonitorDialog.run(false, false, new IRunnableWithProgress() {
				
				@Override
				public void run(IProgressMonitor monitor) {					
					Network networkTimeCopy = currentExperiment.getNetworkTimeCopy();
					if (networkTimeCopy == null) {
						networkTimeCopy = EcoreUtil.copy(currentExperiment.getNetwork());
						currentExperiment.setNetworkTimeCopy(networkTimeCopy);
					}
					
					monitor.beginTask("resetting nodes to new time", networkTimeCopy.getNodes().size() + 1);
					monitor.worked(1);
					
					networkTimeCopy.setName("NTC at " + new TimeStampLabelProvider().getText(time));
										
					Collection<ChangeMark> changes = getMergeConfiguration().getChanges();
					changes.clear();
					getMergeConfiguration().getNewHandlerMap().clear();
					List<Node> nodes = new ArrayList<Node>();
					if (selectedNode != null) {
						nodes.add(selectedNode);
					} else {
						nodes.addAll(networkTimeCopy.getNodes());
					}
					for (Node currentNode: nodes) {						
						// get node from data base
						long start = System.nanoTime();
						Node nodeTimeCopy = dataBaseUtil.getNode(currentExperiment, currentNode.getINetAddress(), time);
						System.out.println("getNode: " + (System.nanoTime() - start));
						
						// merge node into gui
						start = System.nanoTime();
						merger.merge(currentNode, nodeTimeCopy);
						EcoreUtil.delete(nodeTimeCopy);						
						System.out.println("merge: " + (System.nanoTime() - start));
						
						monitor.worked(1);
					}
					if (editor != null) {
						((CWDataBaseEditor)editor).markChanges(networkTimeCopy, changes);
					}
					monitor.done();
				}
			});
		} catch (Exception e) {
			MessageDialog.openError(scale.getShell(), "Exception", "Exception during jumping in time: " + e.getMessage());
		} 
	}
	
	private MergingNodeAdapterMergeConfiguration getMergeConfiguration() {
		return (MergingNodeAdapterMergeConfiguration)merger.getConfiguration();
	}
}
