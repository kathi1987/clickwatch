package edu.hu.clickwatch.tests;

import junit.framework.Test;

public class TestSuite {
	public static Test suite() {
		junit.framework.TestSuite suite = new junit.framework.TestSuite(TestSuite.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(XmlModelRepositoryTest.class);
		suite.addTestSuite(MergeTests.class);
		suite.addTestSuite(ClickControlNodeAdapterTest.class);
		suite.addTestSuite(ClickControlNodeXmlValuesAdapterTest.class);
		suite.addTestSuite(ClickControlXSDNodeAdapterTest.class);
		suite.addTestSuite(ClickControlXSDNodeAdapterPlayerTest.class);
		suite.addTestSuite(ClickControlNodeConnectionXmlValuesTest.class);
		//$JUnit-END$
		return suite;
	}
}
