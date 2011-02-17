package edu.hu.clickwatch;

import com.google.inject.AbstractModule;

import edu.hu.clickcontrol.ClickSocketXmlTestDummy;
import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;

public class GuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		// binds to a special implementation of the click control API that emulates a remote node and does not connect to a real node.
		bind(IClickSocket.class).to(ClickSocketXmlTestDummy.class); 
		
		// binds a special ClickControlNodeAdapter that reads the xml-handler of each element instead its native HandlerInfos
		bind(INodeAdapter.class).to(ClickControlNodeXmlValuesAdapter.class);
	}
}
