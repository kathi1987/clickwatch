package de.hub.clickwatch.tests;

import com.google.inject.AbstractModule;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.nodeadapter.AbstractNodeAdapter;
import de.hub.clickwatch.nodeadapter.ClickControlXSDNodeAdapter;
import de.hub.clickwatch.nodeadapter.INodeAdapter;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;


public class ClickControlXSDNodeAdapterPlayerTest extends AbstractTest {
	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "src/" + ClickControlXSDNodeAdapterPlayerTest.class.getPackage().getName().replace(".", "/") + "/" 
				+ ClickControlXSDNodeAdapterPlayerTest.class.getSimpleName() + ".clickwatchmodel";
		
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule(record, true) };
	}
	
	@Override
	protected Class<? extends INodeAdapter> getNodeAdapterClass() {
		return ClickControlXSDNodeAdapter.class;
	}

	@Override
	protected Class<? extends IClickSocket> getClickSocketClass() {
		return ClickSocketPlayerSocketImpl.class;
	}

	public void testWithRecord() {
		INodeAdapter nodeAdapter = injector.getInstance(INodeAdapter.class);
		((AbstractNodeAdapter)nodeAdapter).setUp("192.168.3.152", "7777");
		nodeAdapter.connect();
		nodeAdapter.retrieve("", "");
	}

}
