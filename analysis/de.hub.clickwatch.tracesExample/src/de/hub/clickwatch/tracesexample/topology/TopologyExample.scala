package de.hub.clickwatch.tracesexample.topology

import scala.collection.JavaConversions._
import de.hub.clickwatch.recorder.database.Record
import de.hub.clickwatch.recorder.database.DataBaseUtil
import de.hub.clickwatch.model.util.builder.HandlerBuilder
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Link
import scala.collection.mutable.HashMap
import de.hub.clickwatch.analysis.results.ResultsFactory
import de.hub.clickwatch.analysis.results.Results
import de.hub.clickwatch.analysis.results.GraphNode
import de.hub.clickwatch.analysis.results.util.builder.GraphNodeBuilder
import java.text.DateFormat
import com.google.common.base.Preconditions
import de.hub.clickwatch.analysis.results.GraphResult
import de.hub.clickwatch.specificmodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats
import de.hub.clickwatch.analysis.results.GraphLink
import de.hub.clickwatch.analysis.results.util.builder.GraphLinkBuilder
import java.util.LinkedList
import de.hub.clickwatch.model.Node
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Stats

case class TopologyNode(macAddr : String)

/**
 *
 */
class TopologyExample() {

  private var topology = new HashMap[GraphNode, LinkedList[String]];
  private var macMap = new HashMap[String, GraphNode]

  /**
   * transforming with rules
   */
  def transformCwToResultGraph(record : Record, dbUtil : DataBaseUtil, result : GraphResult) = {

    /**
     * "parse" the incoming model
     */
     for (node <- record.getConfiguration().getNodes()) {
       var bcast_statsHandler = dbUtil.getHandler(dbUtil.createHandle(record, node, HandlerBuilder.newHandlerBuilder().withName("device_wifi/link_stat/bcast_stats").build(), record.getEnd())).asInstanceOf[Bcast_stats];
     }
  }

  def ruleNodeToGraphNode(node : Node) : GraphNode = {
    null.asInstanceOf[GraphNode]
  }

  def ruleLinkToGraphLink(lnk : Link) : GraphLink = {
    null.asInstanceOf[GraphLink]
  }

  /**
   *
   */
  def createTopology(record : Record, dbUtil : DataBaseUtil, result : GraphResult) = {

    var results = ResultsFactory.eINSTANCE.createResults()
    var resultName = "topology ";
    var genResult = results.getResult(resultName);
    if (genResult == null) {
      genResult = results.createNewGraphResult(resultName);
    } else {
      Preconditions.checkArgument(genResult.isInstanceOf[GraphResult]);
    }
    
    // first check all existing nodes
    for (node <- record.getConfiguration().getNodes()) {
      //Handler handler = dbUtil.getHandlerIterator(dbUtil.createHandle(record, node, HandlerBuilder.newHandlerBuilder().withName("device_wifi/wifidevice/cst/stats").build())).next();
      var statsHandler = dbUtil.getHandler(dbUtil.createHandle(record, node, HandlerBuilder.newHandlerBuilder().withName("device_wifi/wifidevice/cst/stats").build(), record.getEnd())).asInstanceOf[Stats];
      var bcast_statsHandler = dbUtil.getHandler(dbUtil.createHandle(record, node, HandlerBuilder.newHandlerBuilder().withName("device_wifi/link_stat/bcast_stats").build(), record.getEnd())).asInstanceOf[Bcast_stats];
      if ((statsHandler).getChannelstats() != null) {
        var macAdress = (statsHandler).getChannelstats().getNode();

        // new target model elemment
        var graphNode = GraphNodeBuilder.newGraphNodeBuilder().withName(macAdress).build();
        macMap.put(macAdress, graphNode);

        // save it to the results list
        result.getNodes().add(graphNode)
        topology += graphNode -> new LinkedList[String]
      }
    }

    // now check all links of the nodes
    for (node <- record.getConfiguration().getNodes()) {
      var bcast_statsHandler = dbUtil.getHandler(dbUtil.createHandle(record, node, HandlerBuilder.newHandlerBuilder().withName("device_wifi/link_stat/bcast_stats").build(), record.getEnd())).asInstanceOf[Bcast_stats];

      // get the current source graph node (for the mac address we are looking at)
      val fromGraphNode = macMap.get(bcast_statsHandler.getEntry().getFrom()) match {
        case Some(x) => x
        case None    => println("Graph node was not found in the network"); null;
      }

      // check all links
      for (link <- bcast_statsHandler.getEntry().getLink()) {
        macMap.get(link.getTo()) match {
          case Some(toGraphNode) =>
            var graphLink = GraphLinkBuilder.newGraphLinkBuilder().withName("").withSource(fromGraphNode).withTarget(toGraphNode).build();
            result.getLinks().add(graphLink);

          case None => println("Link to a Graphnode that was not registered in the network"); null;
        }

        topology.get(fromGraphNode) match {
          case Some(x) => x.add(link.getTo())
          case None    => null
        }
      }
    }

    for (el <- topology)
      println(el)
  }

}