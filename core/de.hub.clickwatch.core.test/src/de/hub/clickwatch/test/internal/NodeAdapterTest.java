package de.hub.clickwatch.test.internal;

import junit.framework.Assert;

import org.junit.Ignore;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.connection.adapter.values.StringValueAdapter;
import de.hub.clickwatch.connection.adapter.values.XSDValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.test.AbstractClickwatchTest;
import de.hub.clickwatch.test.TestUtil;

public class NodeAdapterTest extends AbstractClickwatchTest {
	
	@Override
	protected HandlerDescr[] handlers() {
		return new HandlerDescr[] {
			createHander("e", "empty", ""),
			createHander("e", "notempty", "text"),
			createHander("e/e", "notempty", "text")
		};
	}

	@Test
	public void test() {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wDebugLvl(4)
				.wClickSocketImpl(getTestClickSocket())
				.wValueAdapterClass(StringValueAdapter.class).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection nodeConnection = ncp.createConnection(null, "0");
		INodeAdapter nodeAdapter = nodeConnection.getAdapter(INodeAdapter.class);
		
		Node node = nodeAdapter.pullNode();
		
		Assert.assertEquals(handlers().length, node.getAllHandlers().size());
		for (Handler handler: node.getAllHandlers()) {
			String value = nodeConnection.getAdapter(IValueAdapter.class).getPlainValue(handler);			
			if (handler.getQualifiedName().equals("e/empty")) {
				Assert.assertEquals("", value);
			} else if (handler.getQualifiedName().equals("e/notempty")) {
				Assert.assertEquals("text", value);
			} else if (handler.getQualifiedName().equals("e/e/notempty")) {
				Assert.assertEquals("text", value);
			} else {
				Assert.assertTrue(false);
			}
		}
		Assert.assertNotNull(node.getElement("e"));
		Assert.assertNotNull(node.getHandler("e/empty"));
		Assert.assertNotNull(node.getHandler("e/notempty"));
		Assert.assertNotNull(node.getHandler("e/e/notempty"));
		Assert.assertNotNull(node.getElement("e").getChild("e"));
		Assert.assertNotNull(node.getElement("e").getChild("e").getHandler("notempty"));
	}
	
	@Test
	public void testWithRecord() {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wRecord(getTestRecordURI())
				.wDebugLvl(4)
				.wValueAdapterClass(StringValueAdapter.class).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection("192.168.3.152", "7777");
		INodeAdapter nodeAdapter = connection.getAdapter(INodeAdapter.class);
		
		Node node = nodeAdapter.pullNode();
		Assert.assertNotNull(TestUtil.query(node, "192.168.3.152:n#device_wifi:e"));
	}
	
	@Test
	public void testWithRecordAndXSDValues() {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wRecord(getTestRecordURI())
				.wDebugLvl(4)
				.wValueAdapterClass(XSDValueAdapter.class).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection("192.168.3.152", "7777");
		INodeAdapter nodeAdapter = connection.getAdapter(INodeAdapter.class);
		
		Node node = nodeAdapter.pullNode();
		Assert.assertNotNull(TestUtil.query(node, "192.168.3.152:n#device_wifi:e"));
	}
	
	@Ignore("memoryleak test, only perform when indicated")
	@Test
	public void testWithRecordForMemoryLeak() {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wRecord(getTestRecordURI())
				.wDebugLvl(4)
				.wValueAdapterClass(StringValueAdapter.class).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection connection = ncp.createConnection("192.168.3.152", "7777");
		INodeAdapter nodeAdapter = connection.getAdapter(INodeAdapter.class);

		for (int i = 0; i < 200000; i++) {
			nodeAdapter.pullNode();
			TestUtil.report("MEM-LEAK?", i, 100);			
		}
	}
}
