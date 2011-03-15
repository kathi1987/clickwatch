package edu.hu.clickwatch.examples;

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
	private EPackage metaModel = null;
	private EObject model = null;
	
	private void initialize() {
		if (metaModel == null || model == null) {
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("scwm", new XMIResourceFactoryImpl());
			Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap().put("ecore", new XMIResourceFactoryImpl());
			
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
			Resource metaModelResource = resourceSet.getResource(URI.createFileURI("src/edu/hu/clickwatch/examples/SpecificMetaModel.ecore"), true);		
			metaModel = (EPackage)metaModelResource.getContents().get(0);
			EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
			
			Resource modelResource = resourceSet.getResource(URI.createFileURI("src/edu/hu/clickwatch/examples/SpecificModel.scwm"), true);
			model = modelResource.getContents().get(0);
		}
	}
	
	public void evalXtend(String xtend) {	
		initialize();
		XtendFacade f = XtendFacade.create(xtend);
		f.registerMetaModel(new EmfMetaModel(metaModel));
		
		System.out.println(f.call("performAnalysis", new Object[]{model}));
	}
	
	public void executeXpand(String xpand, String outputDir) {
		initialize();
		OutputImpl output = new OutputImpl();
		output.addOutlet(new Outlet(false, "iso-8859-1", null, true, outputDir));

		XpandExecutionContextImpl execCtx = new XpandExecutionContextImpl(output, null);
		execCtx.getResourceManager().setFileEncoding("iso-8859-1"); //$NON-NLS-1$
		execCtx.registerMetaModel(new EmfMetaModel(metaModel));

		XpandFacade facade = XpandFacade.create(execCtx);
		
		long startTime = System.currentTimeMillis();
		facade.evaluate(xpand, model);
		long stopTime = System.currentTimeMillis();
		System.out.println("Xpand execution took " + (stopTime - startTime) + " ms");
	}
}
