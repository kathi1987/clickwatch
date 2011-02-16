package edu.hu.clickwatch.tests;

import junit.framework.Test;

public class TestSuite {
	public static Test suite() {
		junit.framework.TestSuite suite = new junit.framework.TestSuite(TestSuite.class.getName());
		//$JUnit-BEGIN$
		suite.addTestSuite(ClickControlNodeAdapterTest.class);
		suite.addTestSuite(ClickControlNodeXmlValuesAdapterTest.class);
		suite.addTestSuite(XmlUtilTest.class);
		//$JUnit-END$
		return suite;
	}
}
