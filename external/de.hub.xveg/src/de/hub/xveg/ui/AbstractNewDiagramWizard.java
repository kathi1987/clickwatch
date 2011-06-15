package de.hub.xveg.ui;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.HashMap;

import org.eclipse.core.resources.IFile;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.graphiti.mm.algorithms.AlgorithmsFactory;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.styles.Color;
import org.eclipse.graphiti.mm.algorithms.styles.StylesFactory;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramsFactory;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.jface.wizard.Wizard;
import org.eclipse.ui.INewWizard;
import org.eclipse.ui.IWorkbench;
import org.eclipse.ui.IWorkbenchPage;
import org.eclipse.ui.PartInitException;
import org.eclipse.ui.dialogs.WizardNewFileCreationPage;
import org.eclipse.ui.ide.IDE;


public abstract class AbstractNewDiagramWizard extends Wizard implements INewWizard {
	private IStructuredSelection selection;
	private NewDiagramWizardPage newFileWizardPage;
	private IWorkbench workbench;

	public AbstractNewDiagramWizard() {
		setWindowTitle("New Diagram");
	}

	@Override
	public void addPages() {
		newFileWizardPage = new NewDiagramWizardPage(selection);
		addPage(newFileWizardPage);
	}

	@Override
	public boolean performFinish() {

		final IFile file = newFileWizardPage.createNewFile();
		if (file != null) {
			getShell().getDisplay().asyncExec(new Runnable() {
				public void run() {
					IWorkbenchPage page =
						workbench.getActiveWorkbenchWindow().getActivePage();
					try {
						IDE.openEditor(page, file, true);
					} catch (PartInitException e) {
					}
				}
			});
			return true;
		} else {
			return false;
		}
	}

	public void init(IWorkbench workbench, IStructuredSelection selection) {
		this.workbench = workbench;
		this.selection = selection;
	}
	
	private class NewDiagramWizardPage extends WizardNewFileCreationPage {

	    public NewDiagramWizardPage(IStructuredSelection selection) {
	        super("NewConfigFileWizardPage", selection);
	        setTitle("Diagram File");
	        setDescription("Creates a new Diagram");
	        setFileExtension("diagram");
	    }

	    @Override
	    protected InputStream getInitialContents() {
	    	String fileName = getFileName();
	    	
	    	Diagram sample = PictogramsFactory.eINSTANCE.createDiagram();
			sample.setDiagramTypeId(getDiagramTypeId());
			sample.setVisible(true);
			sample.setGridUnit(10);
			sample.setShowGuides(true);
			sample.setSnapToGrid(true);
			sample.setName(fileName);
			
			Rectangle rectangle = AlgorithmsFactory.eINSTANCE.createRectangle();
			rectangle.setWidth(1000);
			rectangle.setHeight(1000);
			Color bgColor = StylesFactory.eINSTANCE.createColor();
			bgColor.setBlue(255); bgColor.setGreen(255); bgColor.setRed(255);
			Color fgColor = StylesFactory.eINSTANCE.createColor();
			fgColor.setBlue(249); fgColor.setGreen(238); fgColor.setRed(227);
			rectangle.setBackground(bgColor);
			rectangle.setForeground(fgColor);
			sample.setGraphicsAlgorithm(rectangle);
			sample.getColors().add(fgColor);
			sample.getColors().add(bgColor);
			
			ResourceSet rs = new ResourceSetImpl();
			Resource resource = rs.createResource(URI.createURI("fake.xml"));
			resource.getContents().add(sample);
			ByteArrayOutputStream baos = new ByteArrayOutputStream();
			try {
				resource.save(baos, new HashMap<Object, Object>());
			} catch (IOException e) {
				e.printStackTrace();
			}
			String contents = baos.toString();
			return new ByteArrayInputStream(contents.getBytes());
	    }
	}
	
	protected abstract String getDiagramTypeId();
}
