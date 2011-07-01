package de.hub.clickwatch.examples.lifd;

import de.hub.clickwatch.examples.AbstractAnalysis;
import de.hub.clickwatch.examples.lifd.topology.Topology;
import de.hub.clickwatch.examples.lifd.topology.TopologyPackage;

public class LocalInterfererDetectionSingle extends AbstractAnalysis {

	public void run() {
		initialize();	
		registerPackage(TopologyPackage.eINSTANCE);
		Topology topology = (Topology)evalXtend(getQualifiedName("createTopology"));
		evalXtend(getQualifiedName("analysis"), new Object[] {topology, ""+ System.currentTimeMillis()});
		//executeXpand(getQualifiedName("analysis::Main"), "src/" + getClass().getPackage().getName().replace(".", "/"), topology);
	}

	public static void main(String args[]) {
		new LocalInterfererDetectionSingle().run();
	}
}
