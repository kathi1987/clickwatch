package edu.hu.clickwatch.examples.linkasym;

import edu.hu.clickwatch.examples.AbstractAnalysis;

public class LinkAsym extends AbstractAnalysis {
	
	public static void main(String[] args) {
		LinkAsym instance = new LinkAsym();
		String path = instance.getClass().getPackage().getName().replace(".", "::");
		instance.executeXpand(path + "::analysis::Main", "src/" + instance.getClass().getPackage().getName().replace(".", "/"));
	}
}
