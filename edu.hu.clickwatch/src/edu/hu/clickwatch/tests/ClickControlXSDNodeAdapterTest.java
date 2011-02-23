package edu.hu.clickwatch.tests;

import java.io.IOException;
import java.util.Iterator;

import junit.framework.TestCase;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.xml.type.AnyType;

import com.google.common.base.Throwables;
import com.google.inject.Guice;
import com.google.inject.Injector;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.ClickWatchStandaloneSetup;
import edu.hu.clickwatch.GuiceModule;
import edu.hu.clickwatch.XmlModelRepository;
import edu.hu.clickwatch.model.Handler;
import edu.hu.clickwatch.model.Node;
import edu.hu.clickwatch.nodeadapter.AbstractNodeAdapter;
import edu.hu.clickwatch.nodeadapter.ClickControlXSDNodeAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;
import edu.hu.clickwatch.tests.clicksockets.ClickSocketPlayer;
import edu.hu.clickwatch.tests.clicksockets.ClickSocketXSDDummy;

public class ClickControlXSDNodeAdapterTest extends TestCase {

	private INodeAdapter nodeAdapter;
	private XmlModelRepository xmlModelRepository;
	
	@Override
	public void setUp() throws IOException {
		ClickWatchStandaloneSetup.doSetup();

		final IClickSocket clickSocket = new ClickSocketXSDDummy() {

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
		GuiceModule guiceModule = new GuiceModule() {
			@Override
			protected void overrideConfigure() {
				bind(IClickSocket.class).toInstance(clickSocket);
				bind(INodeAdapter.class).to(ClickControlXSDNodeAdapter.class);
			}			
		};
		Injector injector = Guice.createInjector(guiceModule);
		nodeAdapter = injector.getInstance(INodeAdapter.class);
		xmlModelRepository = injector.getInstance(XmlModelRepository.class);
		((AbstractNodeAdapter)nodeAdapter).setUp("localhost", "7777");
	}
	
	public void testSimple() {
		nodeAdapter.connect();
		Node node = nodeAdapter.retrieve(null, null);
		
		assertEquals(2, node.getElements().size());
		assertEquals(6, node.getElements().get(0).getHandlers().size());
		
		assertNotNull(TestUtil.query(node, ":n/link_stat:e/bad_version:h/badnodes:x/badnode:x"));

		for (Handler handler: node.getElements().get(0).getHandlers()) {
			if (!handler.getName().equals(ClickControlXSDNodeAdapter.XSD_HANDLER_NAME)) {
				Iterator<EObject> it = handler.eAllContents();
				while (it.hasNext()) {
					assertTrue(!(it.next() instanceof AnyType));
				}	
			}
		}
		
		String xml = xmlModelRepository.serializeXml(node);
		
		EObject reReadModel = xmlModelRepository.deserializeXml(xml);
		assertNotNull(TestUtil.query(reReadModel, ":n/foo:e/bar:h/foo:x/bar[=TEXT]:x"));
		assertNotNull(TestUtil.query(reReadModel, ":n/link_stat:e/bad_version:h/badnodes:x/badnode[version=101]:x"));
	}
	
	public void testWithRecord() {
		Injector injector = Guice.createInjector(ClickSocketPlayer.getJUnitTestModule());
		nodeAdapter = injector.getInstance(INodeAdapter.class);
		xmlModelRepository = injector.getInstance(XmlModelRepository.class);
		((AbstractNodeAdapter)nodeAdapter).setUp("192.168.3.152", "7777");
		
		nodeAdapter.connect();
		nodeAdapter.retrieve("", "");
	}
}
