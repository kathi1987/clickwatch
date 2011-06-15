package edu.hu.clickwatch.examples.lifd;

import edu.hu.clickwatch.examples.AbstractAnalysis;
import edu.hu.clickwatch.examples.lifd.topology.Topology;
import edu.hu.clickwatch.examples.lifd.topology.TopologyPackage;

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
