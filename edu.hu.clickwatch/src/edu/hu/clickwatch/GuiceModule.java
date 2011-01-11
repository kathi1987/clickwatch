package edu.hu.clickwatch;

import com.google.inject.AbstractModule;

import edu.hu.clickcontrol.ClickSocketTestImpl;
import edu.hu.clickcontrol.IClickSocket;

public class GuiceModule extends AbstractModule {

	@Override
	protected void configure() {
		// binds to a special implementation of the click control API that emulates a remote node and does not connect to a real node.
		bind(IClickSocket.class).to(ClickSocketTestImpl.class); 
	}
}
