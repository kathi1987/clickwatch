package de.hub.clickwatch.recorder.test;

import java.util.Map.Entry;

import junit.framework.Assert;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentRecord;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecord;
import de.hub.clickwatch.recoder.cwdatabase.NodeRecordDescr;

public class AbstractDataBaseAdapterTest extends AbstractDBTest {

	protected void assertRecord(ExperimentDescr experiment, String nodeId) {
		ExperimentRecord experimentRecord = experiment.getRecord();
		long latestEnd = 0;
		for (Entry<Long, NodeRecordDescr> record: experimentRecord.getNodeMap().get(nodeId).getNodeMap()) {
			NodeRecord nodeRecord = record.getValue().getRecord();
			Assert.assertTrue(nodeRecord.getStart() >= 0);
			Assert.assertTrue(nodeRecord.getStart() >= latestEnd);
			Assert.assertTrue(nodeRecord.getStart() < nodeRecord.getEnd());
			Assert.assertTrue(experiment.getStart() <= nodeRecord.getStart());
			Assert.assertTrue(experiment.getEnd() >= nodeRecord.getEnd());
			for (Handler handler: nodeRecord.getRecords()) {
				Assert.assertTrue(handler.getTimestamp() > 0);
				Assert.assertTrue(handler.getTimestamp() <= nodeRecord.getEnd());
			}
			latestEnd = nodeRecord.getEnd();
		}
	}
}
