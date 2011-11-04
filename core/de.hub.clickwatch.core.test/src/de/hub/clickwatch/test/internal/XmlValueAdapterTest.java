package de.hub.clickwatch.test.internal;

import java.util.Collection;

import junit.framework.Assert;

import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.values.XmlValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.test.ClickwatchTest;
import de.hub.clickwatch.test.TestUtil;

public class XmlValueAdapterTest extends ClickwatchTest {
		
	@Override
	protected HandlerDescr[] handlers() {
		return new HandlerDescr[] {
			createHander("e", "empty", true, true, ""),
			createHander("e", "notempty", true, true, "TEST"),
			createHander("e", "xml", true, true, "<foo><bar>TEST</bar></foo>")
		};
	}

	@Test
	public void test() {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wClickSocketImpl(getTestClickSocket())
				.wDebugLvl(4)
				.wValueAdapterClass(XmlValueAdapter.class).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection nodeConnection = ncp.createConnection(null, "0");
		INodeAdapter nodeAdapter = nodeConnection.getAdapter(INodeAdapter.class);
		Collection<Handler> handlers = nodeAdapter.pullNode().getAllHandlers();
		
		Assert.assertEquals(3, handlers.size());
		for (Handler handler: handlers) {
			if (handler.getQualifiedName().equals("e/empty")) {
				Assert.assertEquals(0, handler.getMixed().size());
				Assert.assertEquals(0, handler.getAny().size());
			} else if (handler.getQualifiedName().equals("e/xml")){
				Assert.assertNotNull(TestUtil.query(handler, "xml:h#foo:x#bar[=TEST]:x"));
			} else {
				Assert.assertNotNull(TestUtil.query(handler, "notempty[=TEST]:x"));
			}
		}
	}
}
