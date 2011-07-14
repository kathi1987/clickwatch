package de.hub.clickwatch.analysis.ui;

import java.io.IOException;
import java.util.Map;

import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;

import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;

public class ClickWatchProjectCreator extends AnalysisProjectCreator {

	@Override
	protected Network createLoadGenericModel(ResourceSet rs,
			Map<Object, Object> options) throws IOException {
		Resource resource = rs.createResource(info.getClickWatchModel());
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		network.setName("a network");
		Node node = ClickWatchModelFactory.eINSTANCE.createNode();
		node.setINetAddress("192.168.3.157");
		network.getNodes().add(node);
		resource.getContents().add(network);
		resource.save(options);
		
		return network;
	}
}
