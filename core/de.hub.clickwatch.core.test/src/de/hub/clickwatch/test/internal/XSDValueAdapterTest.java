package de.hub.clickwatch.test.internal;

import java.io.IOException;
import java.util.Collection;

import junit.framework.Assert;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import com.google.inject.Guice;
import com.google.inject.Injector;

import de.hub.clickwatch.ClickWatchModuleUtil;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.INodeAdapter;
import de.hub.clickwatch.connection.adapter.values.XSDValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.test.ClickSocketXSDDummy;
import de.hub.clickwatch.test.ClickwatchTest;
import de.hub.clickwatch.test.TestUtil;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.util.EmfXmlUtil;

public class XSDValueAdapterTest extends ClickwatchTest {
	
	private static class ClickSocketXSDImpl extends ClickSocketXSDDummy {
		@Override
		protected String getDummyXmlEntry() {
			return XmlModelRepositoryTest.LINK_STAT_XML;
		}

		@Override
		protected String readEntry(String entry) {
			try {
				return TestUtil.readFileAsString(entry);
			} catch (IOException e) {
				Throwables.propagate(e);
				return null;
			}
		}

		@Override
		protected URI getSchemaURI() {
			return URI.createFileURI(XmlModelRepositoryTest.LINK_STAT_XSD);
		}
	};
	
	@Test
	public void test() {
		Injector injector = Guice.createInjector(ClickWatchModuleUtil.newBuilder()
				.wClickSocketImpl(new ClickSocketXSDImpl())
				.wDebugLvl(4)
				.wValueAdapterClass(XSDValueAdapter.class).build());
		
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection nodeConnection = ncp.createConnection(null, "0");
		INodeAdapter nodeAdapter = nodeConnection.getAdapter(INodeAdapter.class);
		Collection<Handler> handlers = nodeAdapter.pullNode("link_stat", "bad_version").getAllHandlers();
		
		Assert.assertEquals(1, handlers.size());
		Handler handler = handlers.iterator().next();
		Assert.assertNotNull(TestUtil.query(handler, "bad_version:h#badnodes:x#badnode:x"));
		Assert.assertNotNull(TestUtil.query(handler, "bad_version:h#badnodes:x#badnode[version=101]:x"));
		
		String xml = EmfXmlUtil.serializeXml(handler);	
		handler = (Handler)EmfXmlUtil.deserializeXml(xml);
		
		Assert.assertNotNull(TestUtil.query(handler, "bad_version:h#badnodes:x#badnode:x"));
		Assert.assertNotNull(TestUtil.query(handler, "bad_version:h#badnodes:x#badnode[version=101]:x"));
	}
}
