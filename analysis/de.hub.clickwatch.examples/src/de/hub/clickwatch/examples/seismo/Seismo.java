package de.hub.clickwatch.examples.seismo;

import org.junit.Test;

import de.hub.clickwatch.analysis.AbstractAnalysis;

public class Seismo extends AbstractAnalysis {
	
	@Test
	public void run() {
		String path = getClass().getPackage().getName().replace(".", "::");
		evalXtend(path + "::analysis");
		executeXpand(path + "::analysis::Main", "src/" + getClass().getPackage().getName().replace(".", "/"));
	}
	
	public static void main(String[] args) {
		new Seismo().run();
	}
}
