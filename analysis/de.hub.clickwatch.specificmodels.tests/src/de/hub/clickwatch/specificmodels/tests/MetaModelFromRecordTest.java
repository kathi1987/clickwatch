package de.hub.clickwatch.specificmodels.tests;

import java.io.IOException;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.Test;

import com.google.inject.AbstractModule;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.model.ClickWatchModelFactory;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.AbstractNodeAdapter;
import de.hub.clickwatch.nodeadapter.ClickControlNodeAdapter;
import de.hub.clickwatch.nodeadapter.INodeAdapter;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.specificmodels.SpecificMetaModelGenerator;
import de.hub.clickwatch.tests.AbstractTest;

public class MetaModelFromRecordTest extends AbstractTest {
	
	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "src/" + MetaModelFromRecordTest.class.getPackage().getName().replace(".", "/") + "/" 
				+ MetaModelFromRecordTest.class.getSimpleName() + ".clickwatchmodel";
		
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record, false) };
	}
	
	@Override
	protected Class<? extends INodeAdapter> getNodeAdapterClass() {
		return ClickControlNodeAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}

	@Test
	public void testWithOneNodeFromRecord() throws IOException {
		INodeAdapter nodeAdapter = injector.getInstance(INodeAdapter.class);
		((AbstractNodeAdapter)nodeAdapter).setUp("192.168.3.152", "7777");
		nodeAdapter.connect();
		
		Node node = nodeAdapter.retrieve("", "");
		Network network = ClickWatchModelFactory.eINSTANCE.createNetwork();
		network.getNodes().add(node);
		
		EPackage result = SpecificMetaModelGenerator.generate(network);
		save(result);
	}
	
	private void save(EPackage result) throws IOException {
		ResourceSet rs = new ResourceSetImpl();
		Resource resource = rs.createResource(URI.createFileURI("test_out.ecore"));
		resource.getContents().add(result);
		resource.save(null);
	}
}
