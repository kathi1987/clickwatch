package de.hub.clickwatch.recorder.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;

import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.model.util.builder.NetworkBuilder;
import de.hub.clickwatch.model.util.builder.NodeBuilder;
import de.hub.clickwatch.recoder.cwdatabase.CWDataBaseFactory;
import de.hub.clickwatch.recoder.cwdatabase.DataBase;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recoder.cwdatabase.util.builder.DataBaseBuilder;
import de.hub.clickwatch.recoder.cwdatabase.util.builder.ExperimentDescrBuilder;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.ExperimentRecorder;
import de.hub.clickwatch.recorder.database.CWRecorderStandaloneSetup;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRetrieveAdapter;
import de.hub.clickwatch.recorder.database.emf.DataBaseAdapter;
import de.hub.clickwatch.tests.AbstractAdapterTest;

public class AbstractDBTest  extends AbstractAdapterTest {
	
	private DataBaseUtil dbUtil = null;	

	@Override
	protected Module[] getAdditionalModules() {
		return new Module[] { new CWRecorderModule() {

			@Override
			protected void configureRecordChangesOnly() {
				bind(boolean.class).annotatedWith(Names.named(B_RECORD_CHANGES_ONLY_PROPERTY)).toInstance(getRecordChangesOnly());
			}

			@Override
			protected void configureDBValueAdapter() {
				bind(IValueAdapter.class).annotatedWith(Names.named(DB_VALUE_ADAPTER_PROPERTY)).to(getDBValueAdapterClass());
			}

			@Override
			protected void configureDataBaseRecordAdapter() {
				bind(IDataBaseRecordAdapter.class).to(getDataBaseRecordAdapterClass());
			}

			@Override
			protected void configureDataBaseRetrieveAdapter() {
				bind(IDataBaseRetrieveAdapter.class).to(getDataBaseRetrieveAdapterClass());
			}

			@Override
			protected void configureHBaseWithExtraQueue() {
				bind(boolean.class).annotatedWith(Names.named(B_HBASE_WITH_EXTRA_QUUE)).toInstance(getHBaseWithExtraQueue());
			}

			@Override
			protected void configureAdditionalBindings() {
				AbstractDBTest.this.configureAdditionalBindings(binder());
			}
		}};
	}
	
	protected void configureAdditionalBindings(Binder binder) {
		// empty
	}

	protected Boolean getHBaseWithExtraQueue() {
		return true;
	}

	protected Class<? extends IDataBaseRecordAdapter> getDataBaseRecordAdapterClass() {
		return DataBaseAdapter.class;
	}
	
	protected Class<? extends IDataBaseRetrieveAdapter> getDataBaseRetrieveAdapterClass() {
		return DataBaseAdapter.class;
	}


	protected boolean getRecordChangesOnly() {
		return false;
	}

	protected Class<? extends IValueAdapter> getDBValueAdapterClass() {
		return StringValueAdapter.class;
	}

	@Override
	protected void additionalSetUp() {
		super.additionalSetUp();
		CWRecorderStandaloneSetup.doSetup();
		dbUtil = injector.getInstance(DataBaseUtil.class);
	}
	
	protected ExperimentDescr performTest(String[] nodeIds) {
		return performTest(nodeIds, true);
	}
	
	protected ExperimentDescr performTest(String[] nodeIds, boolean assertTest) {
		ExperimentRecorder recorder = injector.getInstance(ExperimentRecorder.class);
		ExperimentDescr experiment = buildDataBase(nodeIds);
		recorder.record(experiment);	
		if (assertTest) {
			assertExperiment(experiment, nodeIds);
		}
		return experiment;
	}
	
	protected ExperimentDescr buildDataBase(String[] nodeIds) {
		Collection<Node> nodes = new ArrayList<Node>();
		for (String nodeId: nodeIds) {
			nodes.add(NodeBuilder.newNodeBuilder()
					.withINetAddress(nodeId)
					.withPort("7777").build());
		}
		
		DataBase db = DataBaseBuilder.newDataBaseBuilder()
				.withInMemory(getInMemory())
				.withExperiments(ExperimentDescrBuilder.newExperimentDescrBuilder()
						.withName(getExperimentName())
						.withDescription("this is onyl for testing")
						.withDuration(getExperimentDuration())
						.withStatistics(CWDataBaseFactory.eINSTANCE.createExperimentStatistics())
						.withNetwork(NetworkBuilder.newNetworkBuilder()
								.withName("test_network")
								.withElementFilter("")
								.withHandlerFilter("")
								.withUpdateIntervall(getUpdateInterval())
								.withNodes(nodes)
						)
				).build();
		
		ResourceSet rs = new ResourceSetImpl();
		Resource dataBaseResource = rs.createResource(URI.createURI("test_db.cwdatabase"));
		dataBaseResource.getContents().add(db);
		
		return db.getExperiments().get(0);
	}
	
	protected Integer getUpdateInterval() {
		return 0;
	}

	protected boolean getInMemory() {
		return true;
	}
	
	protected String getExperimentName() {
		return "test_experiment";
	}

	protected int getExperimentDuration() {
		return 2000;
	}
	
	private void assertExperiment(ExperimentDescr experiment, String[] nodeIds) {		
		Assert.assertTrue(experiment.getStart() > 0);
		Assert.assertTrue(experiment.getEnd() > experiment.getStart());
		for (String nodeId: nodeIds) {
			assertNode(experiment, nodeId);
		}
	}
	
	private void assertNode(ExperimentDescr experiment, String nodeId) {
		assertRecord(experiment, nodeId);
		
		long endTime = experiment.getEnd();
		long startTime = experiment.getStart();
		
		assertNodeAtTime(experiment, nodeId, startTime, true);
		assertNodeAtTime(experiment, nodeId, endTime, false);
		assertNodeAtTime(experiment, nodeId, startTime + endTime / 2, false);
	}
	
	protected void assertRecord(ExperimentDescr experiment, String nodeId) {
		
	}
	
	private void assertNodeAtTime(ExperimentDescr experiment, String nodeId, long time, boolean emptyHandlerAllowed) {
		Node node = dbUtil.getNode(experiment, nodeId, time);
		Assert.assertNotNull(node);
		for (String handlerName: handlerNamesOfNode(node)) {
			assertHandler(node, handlerName, time, emptyHandlerAllowed);
		}
	}
	
	protected Collection<String> handlerNamesOfNode(Node node) {
		return Arrays.asList(new String[] {"e1_1/e_2_1/h1", "e1_1/e_2_1/h2", "e1_1/e_2_2/h1"});
	}
	
	protected void assertValue(Handler handler) {
		Assert.assertEquals("value of " + handler.getQualifiedName(), handler.getValue());
	}

	private void assertHandler(Node node, String handler, long time, boolean emptyHandlerAllowed) {
		Handler nodeHandler = node.getHandler(handler);
		if (nodeHandler.getTimestamp() == 0) {
			Assert.assertTrue(emptyHandlerAllowed);
			Assert.assertTrue(nodeHandler.getValue() == null || nodeHandler.getValue().equals(""));
		} else {
			Assert.assertTrue(nodeHandler.getTimestamp() <= time);
			assertValue(nodeHandler);
		}
	}
}