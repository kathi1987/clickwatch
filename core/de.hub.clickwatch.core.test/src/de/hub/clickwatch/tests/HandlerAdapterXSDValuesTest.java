package de.hub.clickwatch.tests;

import java.io.IOException;
import java.util.Collection;

import junit.framework.Assert;

import org.eclipse.emf.common.util.URI;
import org.junit.Test;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.connection.INodeConnection;
import de.hub.clickwatch.connection.INodeConnectionProvider;
import de.hub.clickwatch.connection.adapter.IPullHandlerAdapter;
import de.hub.clickwatch.connection.adapter.IMetaDataAdapter;
import de.hub.clickwatch.connection.adapter.IValueAdapter;
import de.hub.clickwatch.connection.adapter.XSDValueAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.tests.clicksockets.ClickSocketXSDDummy;
import de.hub.clickwatch.util.Throwables;
import de.hub.emfxml.XmlModelRepository;

public class HandlerAdapterXSDValuesTest extends AbstractTest {
	
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

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketXSDImpl.class;
	}
	
	
	@Override
	protected Class<? extends IValueAdapter> getValueAdapterClass() {
		return XSDValueAdapter.class;
	}
	
	@Test
	public void test() {
		INodeConnectionProvider ncp = injector.getInstance(INodeConnectionProvider.class);
		INodeConnection nodeConnection = ncp.createConnection(null, "0");
		IMetaDataAdapter metaDataAdapter = nodeConnection.getAdapter(IMetaDataAdapter.class);
		IPullHandlerAdapter handlerAdapter = nodeConnection.getAdapter(IPullHandlerAdapter.class);
		nodeConnection.connect();
		Node metaData = metaDataAdapter.pullAllMetaData();
		metaData.filter("link_stat", "bad_version");
		handlerAdapter.configure(metaData.getAllHandlers());
		Collection<Handler> handlers = handlerAdapter.pullHandler();
		

		Assert.assertEquals(1, handlers.size());
		Handler handler = handlers.iterator().next();
		Assert.assertNotNull(TestUtil.query(handler, "link_stat/bad_version:h#badnodes:x#badnode:x"));
		Assert.assertNotNull(TestUtil.query(handler, "link_stat/bad_version:h#badnodes:x#badnode[version=101]:x"));
		
		XmlModelRepository xmlModelRepository = injector.getInstance(XmlModelRepository.class);
		String xml = xmlModelRepository.serializeXml(handler);	
		handler = (Handler)xmlModelRepository.deserializeXml(xml);
		
		Assert.assertNotNull(TestUtil.query(handler, "link_stat/bad_version:h#badnodes:x#badnode:x"));
		Assert.assertNotNull(TestUtil.query(handler, "link_stat/bad_version:h#badnodes:x#badnode[version=101]:x"));
	}
}
