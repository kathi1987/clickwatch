package edu.hu.clickwatch;

import java.net.URISyntaxException;

import org.eclipse.emf.common.util.URI;

import com.google.inject.AbstractModule;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.nodeadapter.ClickControlXSDNodeAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;
import edu.hu.clickwatch.tests.clicksockets.ClickSocketPlayer;
import edu.hu.clickwatch.tests.clicksockets.ClickSocketPlayerSocketImpl;

public class GuiceModule extends AbstractModule {
	
	private final XmlModelRepository xmlModelRepository = new XmlModelRepository();
	
	private ClickSocketPlayer player = null;

	@Override
	protected final void configure() {
		bind(XmlModelRepository.class).toInstance(xmlModelRepository);
		overrideConfigure();
	}
	
	protected void overrideConfigure() {
		// binds to a special implementation of the click control API that emulates a remote node and does not connect to a real node.
		// bind(IClickSocket.class).to(ClickSocketXmlTestDummy.class);
		// bind(IClickSocket.class).to(ClickSocketXSDDummy.class);
		bindToPlayer();
		
		// binds a special ClickControlNodeAdapter that reads the xml-handler of each element instead its native HandlerInfos
		bind(INodeAdapter.class).to(ClickControlXSDNodeAdapter.class);
		//bind(INodeAdapter.class).to(ClickControlNodeXmlValuesAdapter.class);
	}

	private void bindToPlayer() {
		java.net.URI uri = null;
		try {
			uri = ClickWatchPluginActivator.getInstance().getBundle().getEntry(
					"src/" + ClickSocketPlayer.class.getPackage().getName().replace(".", "/") + "/record.clickwatchmodel").toURI();
		} catch (URISyntaxException e) {
			e.printStackTrace();
		}
		
		player = new ClickSocketPlayer();
		player.initialize(URI.createURI(uri.toString()));
		bind(ClickSocketPlayer.class).toInstance(player);
		bind(IClickSocket.class).to(ClickSocketPlayerSocketImpl.class);
	}

	public XmlModelRepository getXmlModelRepository() {
		return xmlModelRepository;
	}
}
