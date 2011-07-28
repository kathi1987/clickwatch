package de.hub.clickwatch.analysis;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;
import org.eclipse.xpand2.XpandExecutionContextImpl;
import org.eclipse.xpand2.XpandFacade;
import org.eclipse.xpand2.output.Outlet;
import org.eclipse.xpand2.output.OutputImpl;
import org.eclipse.xtend.XtendFacade;
import org.eclipse.xtend.typesystem.emf.EmfMetaModel;

public class AbstractAnalysis {
	protected EPackage metaModel = null;
	protected EObject model = null;
	
	private List<EPackage> additionalMetaModels = new ArrayList<EPackage>();
	
	protected void initialize() {
		initializeModel();
	}
	
	protected void initializeMetaModel() {
		if (metaModel == null) {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
			
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			Resource metaModelResource = resourceSet.getResource(getMetaModelURI(), true);		
			metaModel = (EPackage)metaModelResource.getContents().get(0);
			EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
		}
	}
	
	protected URI getMetaModelURI() {
		return URI.createFileURI("src/de/hub/clickwatch/examples/SpecificMetaModel.ecore");
	}
	
	protected URI getModelURI() {
		return URI.createFileURI("src/de/hub/clickwatch/examples/SpecificModel.scwm");
	}
	
	protected void initializeModel() {
		initializeMetaModel();
		if (model == null) {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("scwm", new XMIResourceFactoryImpl());
			
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);	
			Resource modelResource = resourceSet.getResource(URI.createFileURI("src/de/hub/clickwatch/examples/SpecificModel.scwm"), true);
			model = modelResource.getContents().get(0);
		}
	}
	
	public void registerPackage(EPackage thePackage) {
		EPackage.Registry.INSTANCE.put(thePackage.getNsURI(), thePackage);
		additionalMetaModels.add(thePackage);
	}
	
	public Object evalXtend(String xtend) {	
		return evalXtend(xtend, model);
	}
	
	public Object evalXtend(String xtend, Object[] objects) {
		initialize();
		XtendFacade f = XtendFacade.create(xtend);
		f.registerMetaModel(new EmfMetaModel(metaModel));
		for (EPackage additionalMetaModel: additionalMetaModels) {
			f.registerMetaModel(new EmfMetaModel(additionalMetaModel));
		}
		
		return f.call("performAnalysis", objects);
	}
	
	public Object evalXtend(String xtend, Object object) {
		return evalXtend(xtend, new Object[] {object});
	}
	
	public void executeXpand(String xpand, String outputDir) {
		initialize();
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, "iso-8859-1", null, true, outputDir));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("iso-8859-1"); //$NON-NLS-1$
		execCtx.registerMetaModel(new EmfMetaModel(metaModel));
		for (EPackage additionalMetaModel: additionalMetaModels) {
			execCtx.registerMetaModel(new EmfMetaModel(additionalMetaModel));
		}

		XpandFacade facade = XpandFacade.create(execCtx);
		
		long startTime = System.currentTimeMillis();
		facade.evaluate(xpand, model);
		long stopTime = System.currentTimeMillis();
		System.out.println("Xpand execution took " + (stopTime - startTime) + " ms");
	}
	
	public void executeXpand(String xpand, String outputDir, Object model) {
		initialize();
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, "iso-8859-1", null, true, outputDir));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("iso-8859-1"); //$NON-NLS-1$
		execCtx.registerMetaModel(new EmfMetaModel(metaModel));
		for (EPackage additionalMetaModel: additionalMetaModels) {
			execCtx.registerMetaModel(new EmfMetaModel(additionalMetaModel));
		}
		
		XpandFacade facade = XpandFacade.create(execCtx);
		
		long startTime = System.currentTimeMillis();
		facade.evaluate(xpand, model);
		long stopTime = System.currentTimeMillis();
		System.out.println("Xpand execution took " + (stopTime - startTime) + " ms");
	}
	
	public String getQualifiedName(String name) {
		return getClass().getPackage().getName().replace(".", "::") + "::" + name;
	}
}