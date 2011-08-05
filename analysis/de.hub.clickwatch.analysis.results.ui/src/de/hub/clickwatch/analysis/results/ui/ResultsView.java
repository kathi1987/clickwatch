package de.hub.clickwatch.analysis.results.ui;

import java.util.Collection;
import java.util.EventObject;
import java.util.HashMap;
import java.util.List;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CommandStack;
import org.eclipse.emf.common.command.CommandStackListener;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.domain.IEditingDomainProvider;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.resource.ResourceItemProviderAdapterFactory;
import org.eclipse.emf.edit.ui.celleditor.AdapterFactoryTreeEditor;
import org.eclipse.emf.edit.ui.dnd.EditingDomainViewerDropAdapter;
import org.eclipse.emf.edit.ui.dnd.LocalTransfer;
import org.eclipse.emf.edit.ui.dnd.ViewerDragAdapter;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryContentProvider;
import org.eclipse.emf.edit.ui.provider.AdapterFactoryLabelProvider;
import org.eclipse.emf.edit.ui.provider.UnwrappingSelectionProvider;
import org.eclipse.emf.edit.ui.view.ExtendedPropertySheetPage;
import org.eclipse.jface.action.IMenuListener;
import org.eclipse.jface.action.IMenuManager;
import org.eclipse.jface.action.MenuManager;
import org.eclipse.jface.action.Separator;
import org.eclipse.jface.viewers.ISelectionChangedListener;
import org.eclipse.jface.viewers.ISelectionProvider;
import org.eclipse.jface.viewers.SelectionChangedEvent;
import org.eclipse.jface.viewers.StructuredSelection;
import org.eclipse.jface.viewers.StructuredViewer;
import org.eclipse.jface.viewers.TreeViewer;
import org.eclipse.swt.dnd.DND;
import org.eclipse.swt.dnd.Transfer;
import org.eclipse.swt.graphics.Image;
import org.eclipse.swt.widgets.Composite;
import org.eclipse.swt.widgets.Menu;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.ui.IActionBars;
import org.eclipse.ui.IEditorActionBarContributor;
import org.eclipse.ui.IEditorInput;
import org.eclipse.ui.IEditorPart;
import org.eclipse.ui.IEditorSite;
import org.eclipse.ui.IKeyBindingService;
import org.eclipse.ui.IPropertyListener;
import org.eclipse.ui.IViewPart;
import org.eclipse.ui.IViewSite;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.IWorkbenchPart;
import org.eclipse.ui.IWorkbenchPartSite;
import org.eclipse.ui.IWorkbenchWindow;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.PlatformUI;
import org.eclipse.ui.part.ViewPart;
import org.eclipse.ui.views.properties.IPropertySheetPage;

import de.hub.clickwatch.analysis.results.Results;
import de.hub.clickwatch.analysis.results.ResultsPlugin;
import de.hub.clickwatch.analysis.results.provider.ResultsItemProviderAdapterFactory;

@SuppressWarnings("deprecation")
public class ResultsView extends ViewPart implements IMenuListener {

	public static final String ID = "edu.hu.clickwatch.analysis.composition.ModelView.ModelView";

	private TreeViewer treeViewer;
	protected AdapterFactoryEditingDomain editingDomain;
	private ComposedAdapterFactory adapterFactory;
	private ResultsActionBarContributor actionsContributer;
	private ExtendedPropertySheetPage propertySheetPage;
	
	private void initializeEditingDomain() {
		actionsContributer = new ResultsActionBarContributor();
		adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
		adapterFactory.addAdapterFactory(new ResourceItemProviderAdapterFactory());
		adapterFactory.addAdapterFactory(new ResultsItemProviderAdapterFactory());
		
		BasicCommandStack commandStack = new BasicCommandStack();

		commandStack.addCommandStackListener(new CommandStackListener() {
			public void commandStackChanged(final EventObject event) {
				PlatformUI.getWorkbench().getDisplay()
						.asyncExec(new Runnable() {
							public void run() {
								firePropertyChange(IEditorPart.PROP_DIRTY);

								// Try to select the affected objects.
								//
								Command mostRecentCommand = ((CommandStack) event
										.getSource()).getMostRecentCommand();
								if (mostRecentCommand != null) {
									setSelectionToViewer(mostRecentCommand
											.getAffectedObjects());
								}
							}
						});
			}
		});
		
		editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());		
	}
	

	@Override
	public void init(IViewSite site) throws PartInitException {
		super.init(site);
		initializeEditingDomain();
	}

	public void createPartControl(Composite parent) {
		
		treeViewer = new TreeViewer(parent);
		treeViewer.setContentProvider(new AdapterFactoryContentProvider(adapterFactory));
		treeViewer.setLabelProvider(new AdapterFactoryLabelProvider(adapterFactory));

		new AdapterFactoryTreeEditor(treeViewer.getTree(), adapterFactory);
		
		treeViewer.addSelectionChangedListener(new ISelectionChangedListener() {
			
			@Override
			public void selectionChanged(SelectionChangedEvent event) {
				actionsContributer.selectionChanged(event);
			}
		});	
		
		Resource resource = editingDomain.getResourceSet().createResource(URI.createURI("inmemory.xml"));
		Results results = ResultsPlugin.getInstance().getResults();
		resource.getContents().add(results);
		treeViewer.setInput(results);
		
		actionsContributer.init(((IViewSite)getSite()).getActionBars(), PlatformUI.getWorkbench().getActiveWorkbenchWindow().getActivePage());
		actionsContributer.setActiveEditor(new FakeEditorPart(editingDomain, actionsContributer, treeViewer, this));		
		createContextMenuFor(treeViewer);
		
		getSite().setSelectionProvider(treeViewer);
	}

	public void setFocus() {
		treeViewer.getControl().setFocus();
	}
	
	public void setSelectionToViewer(Collection<?> collection) {
		final Collection<?> theSelection = collection;

		if (theSelection != null && !theSelection.isEmpty()) {
			Runnable runnable =
				new Runnable() {
					public void run() {
						if (treeViewer != null) {
							treeViewer.setSelection(new StructuredSelection(theSelection.toArray()), true);
						}
					}
				};
			getSite().getShell().getDisplay().asyncExec(runnable);
		}
	}
	
	protected void createContextMenuFor(StructuredViewer viewer) {
		MenuManager contextMenu = new MenuManager("#PopUp");
		contextMenu.add(new Separator("additions"));
		contextMenu.setRemoveAllWhenShown(true);
		contextMenu.addMenuListener(this);
		Menu menu= contextMenu.createContextMenu(viewer.getControl());
		viewer.getControl().setMenu(menu);
		getSite().registerContextMenu(contextMenu, new UnwrappingSelectionProvider(viewer));

		int dndOperations = DND.DROP_COPY | DND.DROP_MOVE | DND.DROP_LINK;
		Transfer[] transfers = new Transfer[] { LocalTransfer.getInstance() };
		viewer.addDragSupport(dndOperations, transfers, new ViewerDragAdapter(viewer));
		viewer.addDropSupport(dndOperations, transfers, new EditingDomainViewerDropAdapter(editingDomain, viewer));
	}

	@Override
	public void menuAboutToShow(IMenuManager manager) {
		actionsContributer.menuAboutToShow(manager);
	}
	
	public IPropertySheetPage getPropertySheetPage() {
		if (propertySheetPage == null) {
			propertySheetPage =
				new ExtendedPropertySheetPage(editingDomain) {
					@Override
					public void setSelectionToViewer(List<?> selection) {
						ResultsView.this.setSelectionToViewer(selection);
						ResultsView.this.setFocus();
					}

					@Override
					public void setActionBars(IActionBars actionBars) {
						super.setActionBars(actionBars);
						actionsContributer.shareGlobalActions(this, actionBars);
					}
				};
			propertySheetPage.setPropertySourceProvider(new AdapterFactoryContentProvider(adapterFactory));
		}

		return propertySheetPage;
	}

	@SuppressWarnings("rawtypes")
	@Override
	public Object getAdapter(Class key) {
		if (key.equals(IPropertySheetPage.class)) {
			return getPropertySheetPage();
		} else {
			return super.getAdapter(key);
		}
	}
	
	@SuppressWarnings("all")
	private static class FakeEditorPart implements IEditorPart, IEditingDomainProvider {
		
		private final EditingDomain domain;
		private final ISelectionProvider selectionProvider;
		private final IViewPart part;
		private final IEditorActionBarContributor actionContributor;
		
		public FakeEditorPart(EditingDomain domain, IEditorActionBarContributor actionContributor,
				ISelectionProvider selectionProvider, IViewPart site) {
			super();
			this.domain = domain;
			this.actionContributor = actionContributor;
			this.selectionProvider = selectionProvider;
			this.part = site;
		}

		@Override
		public IEditorSite getEditorSite() {
			return new IEditorSite() {
				
				@Override
				public boolean hasService(Class api) {
					return part.getSite().hasService(api);
				}
				
				@Override
				public Object getService(Class api) {
					return part.getSite().getService(api);
				}
				
				@Override
				public Object getAdapter(Class adapter) {
					return part.getSite().getAdapter(adapter);
				}
				
				@Override
				public void setSelectionProvider(ISelectionProvider provider) {
				
				}
				
				@Override
				public IWorkbenchWindow getWorkbenchWindow() {
					return part.getSite().getWorkbenchWindow();
				}
				
				@Override
				public Shell getShell() {
					return part.getSite().getShell();
				}
				
				@Override
				public ISelectionProvider getSelectionProvider() {
					return selectionProvider;
				}
				
				@Override
				public IWorkbenchPage getPage() {
					return part.getSite().getPage();
				}
				
				@Override
				public void registerContextMenu(String menuId, MenuManager menuManager,
						ISelectionProvider selectionProvider) {
					part.getSite().registerContextMenu(menuId, menuManager, selectionProvider);
				}
				
				@Override
				public void registerContextMenu(MenuManager menuManager,
						ISelectionProvider selectionProvider) {
					part.getSite().registerContextMenu(menuManager, selectionProvider);
				}
				
				@Override
				public String getRegisteredName() {
					return part.getSite().getRegisteredName();
				}
				
				@Override
				public String getPluginId() {
					return part.getSite().getPluginId();
				}
				
				@Override
				public IWorkbenchPart getPart() {
					return part.getSite().getPart();
				}
				
				@Override
				public IKeyBindingService getKeyBindingService() {
					return part.getSite().getKeyBindingService();
				}
				
				@Override
				public String getId() {
					return part.getSite().getId();
				}
				
				@Override
				public void registerContextMenu(String menuId, MenuManager menuManager,
						ISelectionProvider selectionProvider, boolean includeEditorInput) {
					part.getSite().registerContextMenu(menuId, menuManager, selectionProvider);
				}
				
				@Override
				public void registerContextMenu(MenuManager menuManager,
						ISelectionProvider selectionProvider, boolean includeEditorInput) {
					part.getSite().registerContextMenu(menuManager, selectionProvider);
				}
				
				@Override
				public IActionBars getActionBars() {
					return ((IViewSite)part.getSite()).getActionBars();
				}
				
				@Override
				public IEditorActionBarContributor getActionBarContributor() {
					return actionContributor;
				}
			};
		}

		@Override
		public EditingDomain getEditingDomain() {
			return domain;
		}

		@Override
		public void addPropertyListener(IPropertyListener listener) {
			part.addPropertyListener(listener);
		}

		@Override
		public void createPartControl(Composite parent) {
			part.createPartControl(parent);
		}

		@Override
		public void dispose() {
			part.dispose();
		}

		@Override
		public IWorkbenchPartSite getSite() {
			return getEditorSite();
		}

		@Override
		public String getTitle() {
			return part.getTitle();
		}

		@Override
		public Image getTitleImage() {
			return part.getTitleImage();
		}

		@Override
		public String getTitleToolTip() {
			return part.getTitleToolTip();
		}

		@Override
		public void removePropertyListener(IPropertyListener listener) {
			part.removePropertyListener(listener);
		}

		@Override
		public void setFocus() {
			part.setFocus();
		}

		@Override
		public Object getAdapter(Class adapter) {
			return part.getAdapter(adapter);
		}

		@Override
		public void doSave(IProgressMonitor monitor) {
			
		}

		@Override
		public void doSaveAs() {
			
		}

		@Override
		public boolean isDirty() {
			return true;
		}

		@Override
		public boolean isSaveAsAllowed() {
			return false;
		}

		@Override
		public boolean isSaveOnCloseNeeded() {
			return false;
		}

		@Override
		public IEditorInput getEditorInput() {
			return null;
		}


		@Override
		public void init(IEditorSite site, IEditorInput input)
				throws PartInitException {
			
		}

	}

}