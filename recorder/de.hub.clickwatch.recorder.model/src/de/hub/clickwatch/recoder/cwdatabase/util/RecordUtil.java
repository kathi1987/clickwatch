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
import de.hub.clickwatch.recoder.cwdatabase.Record;
import de.hub.clickwatch.recoder.cwdatabase.util.builder.DataBaseBuilder;
import de.hub.clickwatch.recoder.cwdatabase.util.builder.RecordBuilder;

public class RecordUtil {

	public static Record buildDataBase(String recordName, long duration, int updateInterval, String... nodeIds) {
		Collection<Node> nodes = new ArrayList<Node>();
		for (String nodeId: nodeIds) {
			nodes.add(NodeBuilder.newNodeBuilder()
					.withINetAddress(nodeId)
					.withPort("7777").build());
		}
		
		DataBase db = DataBaseBuilder.newDataBaseBuilder()
				.withRecords(RecordBuilder.newRecordBuilder()
						.withName(recordName)
						.withDuration(duration)
						.withStatistics(CWDataBaseFactory.eINSTANCE.createRecordStatistics())
						.withConfiguration(NetworkBuilder.newNetworkBuilder()
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
		
		return db.getRecords().get(0);
	}
}
