package de.hub.clickwatch.tracesexample.topology

import scala.collection.JavaConversions._
import de.hub.clickwatch.analysis.results.Results
import de.hub.clickwatch.analysis.results.ResultsPackage
import de.hub.clickwatch.model.ClickWatchModelPackage
import de.digitalforger.smtl.m2m.TransformationM2M
import de.digitalforger.smtl.m2m.Rule
import de.hub.clickwatch.datamodel.Node
import de.hub.clickwatch.analysis.results.GraphNode
import de.hub.clickwatch.analysis.results.ui.GraphVisualization
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage
import de.hub.clickwatch.specificdatamodels.brn.BrnPackage
import de.hub.clickwatch.analysis.results.GraphResult
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Stats
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats
import de.hub.clickwatch.datamodel.Network
import de.hub.clickwatch.analysis.results.GraphResult
import de.hub.clickwatch.analysis.results.GraphLink
import org.apache.log4j.BasicConfigurator
import javax.swing.JFrame

object TopologyExampleSMTL {

  private var graphResult : GraphResult = null
  private var SHOW_GRAPH = true
  
  def main(args : Array[String]) {
    BasicConfigurator.resetConfiguration()
    BasicConfigurator.configure();

    ResultsPackage.eINSTANCE
    ClickWatchDataModelPackage.eINSTANCE
    BrnPackage.eINSTANCE

    val resultsMM = "http://de.hub.clickwatch.analysis.results";
    val cwMM = "http://de.hub.clickwatch.datamodel";
    val inputFile = "file:dump/dump.xmi"

    val topologyTransformation = new TransformationM2M("Topology") from cwMM in inputFile to resultsMM

    //
    // RULE: netWorkRule
    val netWorkRule = new Rule[Network, GraphResult]("Network") using ((helper, network, result) => {

      for (node <- network.getNodes()) {
        val graphNode = helper.transform(node, classOf[GraphNode])
        result.getNodes().add(graphNode)

        // check the links of the node
        var bcastHandler = node.getHandler("device_wifi/link_stat/bcast_stats").getValues().get(0).asInstanceOf[Bcast_stats]

        for (link <- bcastHandler.getEntry().getLink()) {

          // look at all nodes, if the target of this link exists in there
          val res = helper.getAllElementsOfInputType(classOf[Node]).filter(n => {
            var bcastHandler = n.asInstanceOf[Node].getHandler("device_wifi/link_stat/bcast_stats").getValues().get(0).asInstanceOf[Bcast_stats]
            bcastHandler.getEntry().getFrom().equals(link.getTo())
          })

          // if we found a target node
          if (!res.isEmpty) {
            val lnk = helper.transform(link, classOf[GraphLink])

            // the link is contained in the result
            result.getLinks().add(lnk)

            // the link is outoing from the resulting graphNode
            graphNode.getOutgoing().add(lnk)

            val targetGraphNode = helper.transform(res.first, classOf[GraphNode])
            result.getNodes().add(targetGraphNode)
            lnk.setTarget(targetGraphNode)
          }
        }
      }
      
      graphResult = result
    })

    //
    // RULE: node2GraphNode
    val node2GraphNode = new Rule[Node, GraphNode]("Node") isLazy () using ((helper, node, graphNode) => {
      var statsHandler = node.getHandler("device_wifi/wifidevice/cst/stats").getValues().get(0).asInstanceOf[Stats]
      graphNode.setName(statsHandler.getChannelstats().getNode())
    })

    //
    // RULE: link2GraphLink
    val link2GraphLink = new Rule[Link, GraphLink]("Link") isLazy () using ((helper, link, graphLink) => {
    })

    topologyTransformation.setShowDirectTrace(true)
    topologyTransformation.addRule(netWorkRule, node2GraphNode, link2GraphLink)
    topologyTransformation transform "dump/dump.xmi" exportToFile "outputTopology.xmi"

    if (SHOW_GRAPH) {
      showGraph()
    }
  }

  private def showGraph() = {

    var jframe = new JFrame("Visualization")
    jframe.setSize(800, 600);

    var visual = new GraphVisualization();
    var c = visual.createVisualization(graphResult)
    jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
    jframe.getContentPane().add(c)
    jframe.setVisible(true)

  }

}