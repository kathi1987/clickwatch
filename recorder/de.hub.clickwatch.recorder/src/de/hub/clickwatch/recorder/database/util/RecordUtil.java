package de.hub.clickwatch.recorder.database.util;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.builder.NetworkBuilder;
import de.hub.clickwatch.model.util.builder.NodeBuilder;
import de.hub.clickwatch.recorder.database.DataBase;
import de.hub.clickwatch.recorder.database.Record;
import de.hub.clickwatch.recorder.database.util.builder.DataBaseBuilder;
import de.hub.clickwatch.recorder.database.util.builder.RecordBuilder;

public class RecordUtil {
	
	public static Record buildRecord(String recordName, String... nodeIds) {
		return buildDataBase(recordName, nodeIds).getRecords().get(0);
	}
	
	public static DataBase buildDataBase(String recordName, String... nodeIds) {
		Collection<Node> nodes = new ArrayList<Node>();
		for (String nodeId: nodeIds) {
			nodes.add(NodeBuilder.newNodeBuilder()
					.withINetAddress(nodeId)
					.withPort("7777").build());
		}
		
		DataBase db = DataBaseBuilder.newDataBaseBuilder()
				.withRecords(RecordBuilder.newRecordBuilder()
						.withName(recordName)
						.withConfiguration(NetworkBuilder.newNetworkBuilder()
								.withName("test_network")
								.withElementFilter("")
								.withHandlerFilter("")
								.withNodes(nodes)
						)
				).build();
		
		ResourceSet rs = new ResourceSetImpl();
		Resource dataBaseResource = rs.createResource(URI.createURI("test_db.cwdatabase"));
		dataBaseResource.getContents().add(db);
		return db;
	}
}
