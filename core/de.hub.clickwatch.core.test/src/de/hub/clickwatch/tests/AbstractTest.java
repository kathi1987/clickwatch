package de.hub.clickwatch.tests;

import org.junit.Before;

import de.hub.clickwatch.AbstractMain;

public class AbstractTest extends AbstractMain {
	
	@Before
	public void setUp() {
		super.setUp();
	}

	@Override
	protected int getLogLevel() {
		return 4;
	}
	
}
