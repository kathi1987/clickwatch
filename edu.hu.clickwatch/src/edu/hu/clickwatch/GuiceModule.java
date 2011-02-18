package edu.hu.clickwatch;

import com.google.inject.AbstractModule;

import edu.hu.clickwatch.nodeadapter.ClickControlNodeXmlValuesAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;

public class GuiceModule extends AbstractModule {

	@Override
	protected void configure() {
<<<<<<< HEAD:edu.hu.clickwatch/src/edu/hu/clickwatch/GuiceModule.java
		//binds to a special implementation of the click control API that emulates a remote node and does not connect to a real node.
		//bind(IClickSocket.class).to(ClickSocketXmlTestDummy.class); 
=======
		// binds to a special implementation of the click control API that emulates a remote node and does not connect to a real node.
		// bind(IClickSocket.class).to(ClickSocketXmlTestDummy.class); 

>>>>>>> 0e8eafb7d1ebd322831f525c3f9236705a8ed5ba:edu.hu.clickwatch/src/edu/hu/clickwatch/GuiceModule.java
		
		// binds a special ClickControlNodeAdapter that reads the xml-handler of each element instead its native HandlerInfos
		bind(INodeAdapter.class).to(ClickControlNodeXmlValuesAdapter.class);
	}
}
