package edu.hu.clickwatch.tests.clicksockets;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import com.google.common.base.Preconditions;

import edu.hu.clickwatch.model.Network;
import edu.hu.clickwatch.model.Node;

public class ClickSocketPlayer {
	
	private Network network = null;

	public void initialize(URI recordUri) {
		ResourceSet rs = new ResourceSetImpl();
		rs.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
		Resource resource = rs.getResource(recordUri, true);

		Preconditions.checkState(resource.getContents().size() == 1);
		Preconditions
				.checkState(resource.getContents().get(0) instanceof Network);

		network = (Network) resource.getContents().get(0);
	}

	public Node getNode(String host, String port) {
		Preconditions.checkState(network != null);
		
		for (Node node : network.getNodes()) {
			if (node.getINetAdress().equals(host) && node.getPort().equals(port)) {
				return node;
			}
		}
		return null;
	}
}
