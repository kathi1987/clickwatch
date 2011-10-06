package de.hub.clickwatch.recorder.test;

import java.util.Arrays;
import java.util.Collection;

import junit.framework.Assert;

import com.google.inject.Binder;
import com.google.inject.Module;
import com.google.inject.name.Names;

import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.PullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.CWRecorderModule;
import de.hub.clickwatch.recorder.NetworkRecorder;
import de.hub.clickwatch.recorder.database.CWRecorderStandaloneSetup;
import de.hub.clickwatch.recorder.database.DataBaseUtil;
import de.hub.clickwatch.recorder.database.IDataBaseRecordAdapter;
import de.hub.clickwatch.recorder.database.IDataBaseRetrieveAdapter;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.clickwatch.recorder.database.cwdatabase.util.RecordUtil;
import de.hub.clickwatch.recorder.database.hbase.HBaseDataBaseAdapter;
import de.hub.clickwatch.tests.AbstractAdapterTest;

public class AbstractDBTest extends AbstractAdapterTest {
	
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
		return HBaseDataBaseAdapter.class;
	}
	
	protected Class<? extends IDataBaseRetrieveAdapter> getDataBaseRetrieveAdapterClass() {
		return HBaseDataBaseAdapter.class;
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
	
	protected Record performTest(String[] nodeIds) {
		return performTest(nodeIds, true);
	}
	
	protected Record performTest(String[] nodeIds, boolean assertTest) {
		NetworkRecorder recorder = injector.getInstance(NetworkRecorder.class);
		Record record = buildDataBase(nodeIds);
		recorder.record(record);	
		if (assertTest) {
			assertRecord(record, nodeIds);
		}
		return record;
	}
	
	protected Record buildDataBase(String[] nodeIds) {
		return RecordUtil.buildRecord(
				getRecordName(),  
				getRecordDuration(), 
				getUpdateInterval(), 
				nodeIds);
	}
	
	protected Integer getUpdateInterval() {
		return 0;
	}

	protected boolean getInMemory() {
		return true;
	}
	
	protected String getRecordName() {
		return "test_record";
	}

	protected int getRecordDuration() {
		return 2000;
	}
	
	private void assertRecord(Record record, String[] nodeIds) {		
		Assert.assertTrue(record.getStart() > 0);
		Assert.assertTrue(record.getEnd() > record.getStart());
		for (String nodeId: nodeIds) {
			assertNode(record, nodeId);
		}
	}
	
	private void assertNode(Record record, String nodeId) {
		assertRecord(record, nodeId);
		
		long endTime = record.getEnd();
		long startTime = record.getStart();
		
		assertNodeAtTime(record, nodeId, startTime, true);
		assertNodeAtTime(record, nodeId, endTime, false);
		assertNodeAtTime(record, nodeId, startTime + endTime / 2, false);
	}
	
	protected void assertRecord(Record record, String nodeId) {
		
	}
	
	private void assertNodeAtTime(Record record, String nodeId, long time, boolean emptyHandlerAllowed) {
		Node node = dbUtil.getNode(DataBaseUtil.createHandle(record, nodeId, time));
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
		if (!PullHandlerAdapter.commonHandler.contains(handler.substring(handler.lastIndexOf("/")+1))) {
			if (nodeHandler.getTimestamp() == 0) {
				Assert.assertTrue(emptyHandlerAllowed);
				Assert.assertTrue(nodeHandler.getValue() == null || nodeHandler.getValue().equals(""));
			} else {
				Assert.assertTrue(nodeHandler.getTimestamp() <= time);
				assertValue(nodeHandler);
			}
		}
	}
}