package de.hub.clickwatch.examples.linkdist;

import org.junit.Test;

import de.hub.clickwatch.analysis.AbstractAnalysis;
import de.hub.clickwatch.examples.linkdist.ldp.LinkDistPlotPackage;

public class Main extends AbstractAnalysis {
	
	@Test
	public void run() {
		String path = getClass().getPackage().getName().replace(".", "::");
		registerPackage(LinkDistPlotPackage.eINSTANCE);
		executeXpand(path + "::analysis::Main", "src/" + getClass().getPackage().getName().replace(".", "/"));
		executeXpand(path + "::html_gmaps::Main", "src/" + getClass().getPackage().getName().replace(".", "/"));
	}
	
	public static void main(String[] args) {
		new Main().run();
		
	}
}
