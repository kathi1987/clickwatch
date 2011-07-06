package de.hub.clickwatch.server.tests;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.inject.AbstractModule;

import de.hub.clickcontrol.IClickSocket;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.nodeadapter.AbstractNodeAdapter;
import de.hub.clickwatch.nodeadapter.ClickControlNodeAdapter;
import de.hub.clickwatch.nodeadapter.INodeAdapter;
import de.hub.clickwatch.recorder.ClickSocketPlayer;
import de.hub.clickwatch.recorder.ClickSocketPlayerSocketImpl;
import de.hub.clickwatch.tests.AbstractTest;

public class DBNodeAdapterTest extends AbstractTest {
	@Override
	protected AbstractModule[] getAdditionalModules() {
		String record = "src/test/resources/" + DBNodeConnectionTest.class.getPackage().getName().replace(".", "/") + "/" 
				+ DBNodeConnectionTest.class.getSimpleName() + ".clickwatchmodel";
		
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

	public void testWithRecord() {
		INodeAdapter nodeAdapter = injector.getInstance(INodeAdapter.class);
		((AbstractNodeAdapter)nodeAdapter).setUp("192.168.3.152", "7777");
		nodeAdapter.connect();
		Node master = nodeAdapter.retrieve("", "");
		Collection<Node> nodes = new ArrayList<Node>();
		int nodeCount = 50;
		for (int i = 0; i < nodeCount; i++) {
			nodes.add(EcoreUtil.copy(master));
			System.out.print(".");
		}
		
		//CDOHandler databaseHandler = new CDOHandler("127.0.0.1",  BigInteger.valueOf(2036) , "clicktest");
		
		//databaseHandler.openSession();
		long start = System.currentTimeMillis();
		
		//databaseHandler.openTransaction(nodes);
		//databaseHandler.commitTransaction();
		//databaseHandler.closeTransaction();
		
		
		System.out.println("Nodes per second: " + nodeCount * 1000 / (System.currentTimeMillis() - start));
		//databaseHandler.closeSession();
	}
	
}