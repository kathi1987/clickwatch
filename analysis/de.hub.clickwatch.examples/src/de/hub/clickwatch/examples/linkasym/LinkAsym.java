package de.hub.clickwatch.examples.linkasym;

import org.junit.Test;

import de.hub.clickwatch.analysis.AbstractAnalysis;

public class LinkAsym extends AbstractAnalysis {
	
	@Test
	public void run() {
		String path = getClass().getPackage().getName().replace(".", "::");
		executeXpand(path + "::analysis::Main", "src/" + getClass().getPackage().getName().replace(".", "/"));
	}
	
	public static void main(String[] args) {
		new LinkAsym().run();
	}
}
