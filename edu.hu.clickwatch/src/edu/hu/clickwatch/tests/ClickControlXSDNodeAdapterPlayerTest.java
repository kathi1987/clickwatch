package edu.hu.clickwatch.tests;

import com.google.inject.AbstractModule;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.nodeadapter.AbstractNodeAdapter;
import edu.hu.clickwatch.nodeadapter.ClickControlXSDNodeAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;
import edu.hu.clickwatch.tests.clicksockets.ClickSocketPlayer;
import edu.hu.clickwatch.tests.clicksockets.ClickSocketPlayerSocketImpl;

public class ClickControlXSDNodeAdapterPlayerTest extends AbstractTest {
	@Override
	protected AbstractModule[] getAdditionalModules() {
		return new AbstractModule[] { new ClickSocketPlayer.PlayerModule() };
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
