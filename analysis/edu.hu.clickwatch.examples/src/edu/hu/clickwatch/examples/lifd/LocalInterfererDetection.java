package edu.hu.clickwatch.examples.lifd;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.hub.clickwatch.ui.util.UiThreadder;
import edu.hu.clickwatch.analysis.automated.IAutomatedAnalysis;
import edu.hu.clickwatch.analysis.specificmodels.SpecificMetaModelGenerator;
import edu.hu.clickwatch.analysis.specificmodels.SpecificModelGenerator;
import edu.hu.clickwatch.examples.AbstractAnalysis;
import edu.hu.clickwatch.examples.ClickWatchExamplesPluginActivator;
import edu.hu.clickwatch.examples.lifd.topology.Topology;
import edu.hu.clickwatch.examples.lifd.topology.TopologyPackage;
import edu.hu.clickwatch.model.Network;

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
	public void analyseNextSample(final Network nw, final UiThreadder uiThreadder) {
//		initialize();
		uiThreadder.runInGUI(new Runnable() {
			@Override
			public void run() {
				model = EcoreUtil.copy(nw);
				SpecificMetaModelGenerator smmg = new SpecificMetaModelGenerator();
				metaModel = smmg.generateMetaModel(model);
				EPackage.Registry.INSTANCE.put(metaModel.getNsURI(), metaModel);
				SpecificModelGenerator smg = new SpecificModelGenerator();
				model = smg.generateModel(metaModel, model);
				Topology topology = (Topology)evalXtend(getQualifiedName("createTopology"));
				evalXtend(getQualifiedName("analysis"), new Object[] {topology, ""+ System.currentTimeMillis()});	
			}
		});
		

	}

}
