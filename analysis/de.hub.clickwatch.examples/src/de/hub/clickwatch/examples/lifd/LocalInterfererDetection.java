package de.hub.clickwatch.examples.lifd;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.analysis.automated.IAutomatedAnalysis;
import de.hub.clickwatch.examples.AbstractAnalysis;
import de.hub.clickwatch.examples.ClickWatchExamplesPluginActivator;
import de.hub.clickwatch.examples.lifd.topology.Topology;
import de.hub.clickwatch.examples.lifd.topology.TopologyPackage;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.specificmodels.ClickWatchSpecificModelsModule;
import de.hub.clickwatch.ui.util.UIContext;
import de.hub.specificmodels.metamodelgenerator.MetaModelGenerator;
import de.hub.specificmodels.modelgenerator.ModelGenerator;

public class LocalInterfererDetection extends AbstractAnalysis implements
		IAutomatedAnalysis {

	@Override
	protected void initialize() {
		registerPackage(TopologyPackage.eINSTANCE);
	}

	@Override
	protected URI getMetaModelURI() {
		return URI.createPlatformPluginURI("/edu.hu.clickwatch.examples/src/"
				+ ClickWatchExamplesPluginActivator.class.getPackage()
						.getName().replace(".", "/")
				+ "/SpecificMetaModel.ecore", false);
	}

	@Override
	public void analyseNextSample(final Network nw, final UIContext uiThreadder) {
//		initialize();
		uiThreadder.runInGUI(new Runnable() {
			@Override
			public void run() {
				model = EcoreUtil.copy(nw);
				Injector injector = Guice.createInjector(new ClickWatchSpecificModelsModule());
				MetaModelGenerator smmg = injector.getInstance(MetaModelGenerator.class);
				metaModel = smmg.generate(model);
				EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
				ModelGenerator smg = injector.getInstance(ModelGenerator.class);
				model = smg.generate(metaModel, model);
				Topology topology = (Topology)evalXtend(getQualifiedName("createTopology"));
				evalXtend(getQualifiedName("analysis"), new Object[] {topology, ""+ System.currentTimeMillis()});	
			}
		});
		

	}

}
