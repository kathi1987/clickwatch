package edu.hu.clickwatch;

import com.google.inject.AbstractModule;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.nodeadapter.ClickControlXSDNodeAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;
import edu.hu.clickwatch.tests.ClickSocketXSDDummy;

public class GuiceModule extends AbstractModule {
	
	private final XmlModelRepository xmlModelRepository = new XmlModelRepository();

	@Override
	protected final void configure() {
		bind(XmlModelRepository.class).toInstance(xmlModelRepository);
		overrideConfigure();
	}
	
	protected void overrideConfigure() {
		// binds to a special implementation of the click control API that emulates a remote node and does not connect to a real node.
		//bind(IClickSocket.class).to(ClickSocketXmlTestDummy.class);
		bind(IClickSocket.class).to(ClickSocketXSDDummy.class);
		
		// binds a special ClickControlNodeAdapter that reads the xml-handler of each element instead its native HandlerInfos
		bind(INodeAdapter.class).to(ClickControlXSDNodeAdapter.class);
	}

	public XmlModelRepository getXmlModelRepository() {
		return xmlModelRepository;
	}
}
