package edu.hu.clickwatch.examples.linkdist;

import edu.hu.clickwatch.examples.AbstractAnalysis;
import edu.hu.clickwatch.examples.linkdist.ldp.LinkDistPlotPackage;

public class Main extends AbstractAnalysis {
	
	public static void main(String[] args) {
		Main instance = new Main();
		String path = instance.getClass().getPackage().getName().replace(".", "::");
		instance.registerPackage(LinkDistPlotPackage.eINSTANCE);
		instance.executeXpand(path + "::analysis::Main", "src/" + instance.getClass().getPackage().getName().replace(".", "/"));
	}
}
