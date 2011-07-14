package de.hub.clickwatch.examples.seismo;

import de.hub.clickwatch.analysis.AbstractAnalysis;

public class Seismo extends AbstractAnalysis {
	
	public static void main(String[] args) {
		Seismo instance = new Seismo();
		String path = instance.getClass().getPackage().getName().replace(".", "::");
		instance.evalXtend(path + "::analysis");
		instance.executeXpand(path + "::analysis::Main", "src/" + instance.getClass().getPackage().getName().replace(".", "/"));
	}
}
