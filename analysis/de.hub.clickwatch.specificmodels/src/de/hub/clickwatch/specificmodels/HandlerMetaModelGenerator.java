package de.hub.clickwatch.specificmodels;

import java.io.IOException;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EAnnotation;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcoreFactory;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IHandlerAdapter;
import de.hub.clickwatch.main.ClickWatchExternalLauncher;
import de.hub.clickwatch.main.IArgumentsProvider;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.util.HandlerUtil;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.XmlModelRepository;
import de.hub.emfxml.util.EmfXmlUtil;
import de.hub.specificmodels.common.ITargetIdProvider;
import de.hub.specificmodels.common.targetidprovider.TargetIdProviderFactoryProvider;
import de.hub.specificmodels.metamodelgenerator.DefaultTargetObjectCreator;
import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;

public class HandlerMetaModelGenerator implements IClickWatchMain {

	@Inject INodeConnectionProvider ncp;
	
	@Override
	public void main(IClickWatchContext ctx) {
		String[] args = ctx.getAdapter(IArgumentsProvider.class).getArguments();
		String nodeId = args[0];
		
		INodeConnection nc = ncp.createConnection(nodeId, "7777");
		
		ResourceSet resourseSet = new ResourceSetImpl();
		resourseSet.getLoadOptions().putAll(EmfXmlUtil.defaultLoadSaveOptions());
		Resource resource = resourseSet.getResource(
				URI.createFileURI("src/" + getClass().getPackage().getName().replace(".", "/") 
						+ "/brn/BrnHandlers.ecore"), true);
		EPackage brnHandlersPackage = (EPackage)resource.getContents().get(0);
		EClass handlerSuperClass = ((EClass)brnHandlersPackage.getEClassifier("HandlerSubClass")).getESuperTypes().get(0);
		
		for(int i = 1; i < args.length; i++) {
			String handlerId = args[i];

			Handler handler = nc.getAdapter(IHandlerAdapter.class).getHandler(handlerId);
			String handlerName = HandlerUtil.getSplitQualifiedName(handlerId)[1];
			final String handlerClassName = handlerName.substring(0,1).toUpperCase() + handlerName.substring(1);
			
			Injector mmgInjector = Guice.createInjector(new ClickWatchSpecificModelsModule() {
				@Override
				protected void configureTargetIdProvider() {
					bind(ITargetIdProvider.class).toInstance(
							new TargetIdProviderFactoryProvider(
									new HandlerTargetIdProviderFactory(handlerClassName)));
				}			
			});
			MetaModelGenerator metaModelGenerator = mmgInjector.getInstance(MetaModelGenerator.class);
			EPackage metaModel = metaModelGenerator.generate(handler);
			metaModel.setName(handlerId.replace("/", "_"));
			metaModel.setNsPrefix(metaModel.getName());
			metaModel.setNsURI("http://de.hub.clickwatch.specificmodels.brn/" + handlerId);
			EClass handlerClass = (EClass)metaModel.getEClassifier(handlerClassName);	
			handlerClass.getESuperTypes().add(handlerSuperClass);
			EAnnotation annotation = EcoreFactory.eINSTANCE.createEAnnotation();
			annotation.setSource(DefaultTargetObjectCreator.ANNOTATION_SOURCE);
			annotation.getDetails().put(BrnValueAdapter.HANDLER_CLASS, handlerClassName);
			annotation.getDetails().put(BrnValueAdapter.HANDLER_QUALIFIED_NAME, handlerId);
			metaModel.getEAnnotations().add(annotation);
		
			EPackage oldPackage = null;
			EList<EPackage> brnHandlerPackages = brnHandlersPackage.getESubpackages();
			for(EPackage handlerPackage: brnHandlerPackages) {
				if (handlerPackage.getName().equals(metaModel.getName())) {
					oldPackage = handlerPackage;
				}
			}
			if (oldPackage != null) {
				brnHandlerPackages.remove(oldPackage);
			}
			brnHandlerPackages.add(metaModel);
		}
				
		try {
			resource.save(EmfXmlUtil.defaultLoadSaveOptions());
		} catch (IOException e) {
			Throwables.propagate(e);
		}

	}
	
	public static final void main(String args[]) {
		ClickWatchExternalLauncher.launch(args, HandlerMetaModelGenerator.class);
	}
}
