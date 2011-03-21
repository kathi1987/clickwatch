package edu.hu.clickwatch;

import java.net.URISyntaxException;

import org.eclipse.emf.common.util.URI;

import com.google.inject.AbstractModule;
import com.google.inject.Provides;

import edu.hu.clickcontrol.IClickSocket;
import edu.hu.clickwatch.merge.IMergeConfiguration;
import edu.hu.clickwatch.merge.MergeModule;
import edu.hu.clickwatch.model.ClickWatchNodeMergeConfiguration;
import edu.hu.clickwatch.nodeadapter.ClickControlXSDNodeAdapter;
import edu.hu.clickwatch.nodeadapter.INodeAdapter;
import edu.hu.clickwatch.tests.clicksockets.ClickSocketPlayer;
import edu.hu.clickwatch.tests.clicksockets.ClickSocketPlayerSocketImpl;
import edu.hu.clickwatch.util.ILogger;

public class ClickWatchModule extends AbstractModule {
	
	private ClickSocketPlayer player = null;
	private ILogger logger = null;
	
	@Provides ILogger getLogger() {
		return logger;
	}
	
	public void setLogger(ILogger logger) {
		this.logger = logger;
	}

	@Override
	protected final void configure() {
		install(new MergeModule());
		bind(IMergeConfiguration.class).to(ClickWatchNodeMergeConfiguration.class);
		overrideConfigure();
	}
	
	protected void overrideConfigure() {
		// binds to a special implementation of the click control API that emulates a remote node and does not connect to a real node.
		// bind(IClickSocket.class).to(ClickSocketXmlTestDummy.class);
		// bind(IClickSocket.class).to(ClickSocketXSDDummy.class);
		// bindToPlayer();
		
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

}
