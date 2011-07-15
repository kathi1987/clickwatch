package de.hub.clickwatch.tests;

import org.junit.Assert;
import org.junit.Test;

import com.google.inject.AbstractModule;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.StringValueAdapter;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;

public class NodeAdapterWithRecordTest extends AbstractTest {
	
	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "resources/" + NodeAdapterWithRecordTest.class.getSimpleName() + ".clickwatchmodel";
		
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record, false) };
	}

	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return StringValueAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}

	@Test
	public void testWithRecord() {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection("192.168.3.152", "7777");
		connection.connect();
		INodeAdapter nodeAdapter = connection.getAdapter(INodeAdapter.class);
		
		Node node = nodeAdapter.pullNode();
		Assert.assertNotNull(TestUtil.query(node, "192.168.3.152:n#device_wifi:e"));
	}
	
//	public void testMerge() {
//		INodeAdapter nodeAdapter = injector.getInstance(INodeAdapter.class);
//		((AbstractNodeAdapter)nodeAdapter).setUp("192.168.3.152", "7777");
//		nodeAdapter.connect();
//		
//		Merger merger = injector.getInstance(Merger.class);
//		
//		Node latest = nodeAdapter.retrieve("", "");
//		int totalChanges = 0;
//		int merges = 0;
//	    while (merges != 5) {
//			Node newNode = nodeAdapter.retrieve("", "");
//		
//			((ClickWatchNodeMergeConfiguration)merger.getConfiguration()).reset();
//			merger.merge(latest, newNode);
//			Collection<ChangeMark> changes = ((ClickWatchNodeMergeConfiguration)merger.getConfiguration()).getChanges();
//			
//			System.out.println("Changes: " + changes.size());
//			for (ChangeMark change: changes) {
//				Handler handler = (Handler)change.getObject();
//				System.out.println(((Element)handler.eContainer()).getElementPath() + "/" + handler.getName() + "=" + handler.getValue());
//			}
//			
//			latest = newNode;
//			totalChanges += changes.size();
//			merges++;
//		};
//		
//		System.out.println("Avarages changes: " + totalChanges / merges + "(for " + merges + " merges).");
//	}
//	
//	public void testMergePerformance() {
//		INodeAdapter nodeAdapter = injector.getInstance(INodeAdapter.class);
//		((AbstractNodeAdapter)nodeAdapter).setUp("192.168.3.152", "7777");
//		nodeAdapter.connect();
//		
//		Merger merger = injector.getInstance(Merger.class);
//		Node one = nodeAdapter.retrieve("", "");
//		Node two = nodeAdapter.retrieve("", "");
//		long start = System.currentTimeMillis();
//		int merges = 10000;
//		for (int i = 0; i < merges; i++) {
//			((ClickWatchNodeMergeConfiguration)merger.getConfiguration()).reset();
//			merger.merge(one, two);	
//		}
//				
//		System.out.println("Merges per second: " + merges * 1000 / (System.currentTimeMillis() - start));
//	}
}
