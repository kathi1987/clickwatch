package de.hub.clickwatch.apps.examples;

import java.text.DateFormat;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.emf.common.util.EList;

import com.google.common.base.Preconditions;
import com.google.inject.Inject;

import de.hub.clickwatch.analysis.results.GraphLink;
import de.hub.clickwatch.analysis.results.GraphNode;
import de.hub.clickwatch.analysis.results.GraphResult;
import de.hub.clickwatch.analysis.results.Result;
import de.hub.clickwatch.analysis.results.Results;
import de.hub.clickwatch.analysis.results.util.builder.GraphLinkBuilder;
import de.hub.clickwatch.analysis.results.util.builder.GraphNodeBuilder;
import de.hub.clickwatch.connection.adapter.values.IValueAdapter;
import de.hub.clickwatch.main.IClickWatchContext;
import de.hub.clickwatch.main.IClickWatchMain;
import de.hub.clickwatch.main.IClickWatchModelProvider;
import de.hub.clickwatch.main.IProgressMonitorProvider;
import de.hub.clickwatch.main.IResultsProvider;
import de.hub.clickwatch.model.Network;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.specificmodels.brn.BrnValueAdapter;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats;
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link;
import de.hub.clickwatch.util.ILogger;

public class TopologyAnalysis implements IClickWatchMain {
	
	@Inject private ILogger logger;
	@Inject private IValueAdapter valueAdapter;
	@Inject private BrnValueAdapter brnValueAdapter;
	
	@Override
	public void main(IClickWatchContext ctx) {
		logger.log(ILogger.INFO, "Start analysis on record " , null);
		Network network = ctx.getAdapter(IClickWatchModelProvider.class).getNetwork();
		Results results = ctx.getAdapter(IResultsProvider.class).getResults();
        String resultName = "topology " + DateFormat.getDateTimeInstance().format(network.getTimestamp() / 1000000);
        Result genResult = results.getResult(resultName);
        if (genResult == null) {
            genResult = results.createNewGraphResult(resultName);
        } else {
            Preconditions.checkArgument(genResult instanceof GraphResult);
        }
        GraphResult result = (GraphResult)genResult;
		
		IProgressMonitor monitor = ctx.getAdapter(IProgressMonitorProvider.class).getProgressMonitor();		
		EList<Node> nodes = network.getNodes();
        monitor.beginTask("Performing analysis on all nodes", nodes.size()*2);
        Map<String, GraphNode> macMap = new HashMap<String, GraphNode>();              
		for (Node node: nodes) {						
		    Bcast_stats stats = (Bcast_stats)brnValueAdapter.create(node.getHandler("device_wifi/link_stat/bcast_stats"), valueAdapter);
		    String name = node.getINetAddress();
		    if (name.startsWith("192.168.3.")) {
		        name = name.substring(10);
		    }
            GraphNode graphNode = GraphNodeBuilder.newGraphNodeBuilder().withName(name).build();
            macMap.put(stats.getEntry().getFrom(), graphNode);
            result.getNodes().add(graphNode);
		    monitor.worked(1);
		}
		for (Node node: nodes) {
		    Bcast_stats stats = (Bcast_stats)brnValueAdapter.create(node.getHandler("device_wifi/link_stat/bcast_stats"), valueAdapter);
		    GraphNode from = macMap.get(stats.getEntry().getFrom());
		    for (Link link: stats.getEntry().getLink()) {
		        String toMac = link.getTo();
                GraphNode to = macMap.get(toMac);
                if (to != null) {
                    GraphLink graphLink = GraphLinkBuilder.newGraphLinkBuilder().withName("").withSource(from).withTarget(to).build();
                    result.getLinks().add(graphLink);
                } else {
                    logger.log(ILogger.INFO, "topology contains link to nodes outside the network", null);
                }
		    }
		    
		    monitor.worked(1);
		}
		
		ctx.getAdapter(IResultsProvider.class).saveResults();
		monitor.done();
	}	
}
