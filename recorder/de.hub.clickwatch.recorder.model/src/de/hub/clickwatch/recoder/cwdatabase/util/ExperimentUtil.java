package de.hub.clickwatch.recoder.cwdatabase.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.builder.NetworkBuilder;
import de.hub.clickwatch.model.util.builder.NodeBuilder;
import de.hub.clickwatch.recoder.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.recoder.cwdatabase.DataBase;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recoder.cwdatabase.util.builder.DataBaseBuilder;
import de.hub.clickwatch.recoder.cwdatabase.util.builder.ExperimentDescrBuilder;

public class ExperimentUtil {

	public static ExperimentDescr buildDataBase(String experiment, boolean inMemory, long duration, int updateInterval, String... nodeIds) {
		Collection<Node> nodes = new ArrayList<Node>();
		for (String nodeId: nodeIds) {
			nodes.add(NodeBuilder.newNodeBuilder()
					.withINetAddress(nodeId)
					.withPort("7777").build());
		}
		
		DataBase db = DataBaseBuilder.newDataBaseBuilder()
				.withInMemory(inMemory)
				.withExperiments(ExperimentDescrBuilder.newExperimentDescrBuilder()
						.withName(experiment)
						.withDescription("this is onyl for testing")
						.withDuration(duration)
						.withStatistics(CWDataBaseFactory.eINSTANCE.createExperimentStatistics())
						.withNetwork(NetworkBuilder.newNetworkBuilder()
								.withName("test_network")
								.withElementFilter("")
								.withHandlerFilter("")
								.withUpdateIntervall(updateInterval)
								.withNodes(nodes)
						)
				).build();
		
		ResourceSet rs = new ResourceSetImpl();
		Resource dataBaseResource = rs.createResource(URI.createURI("test_db.cwdatabase"));
		dataBaseResource.getContents().add(db);
		
		return db.getExperiments().get(0);
	}
}
