package de.hub.clickwatch.tracesexample.linkStats
import scala.collection.JavaConversions._
import de.hub.clickwatch.analysis.results.Results
import de.hub.clickwatch.analysis.results.ResultsPackage
import de.digitalforger.smtl.m2m.TransformationM2M
import de.digitalforger.smtl.m2m.Rule
import de.hub.clickwatch.datamodel.Node
import de.hub.clickwatch.analysis.results.GraphNode
import de.hub.clickwatch.analysis.results.ui.ResultsChartVisualization
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage
import de.hub.clickwatch.specificdatamodels.brn.BrnPackage
import de.hub.clickwatch.analysis.results.GraphResult
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage
import de.hub.clickwatch.specificdatamodels.brn.BrnPackage
import org.apache.log4j.BasicConfigurator
import de.hub.clickwatch.datamodel.Network
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Stats
import de.hub.clickwatch.analysis.results.NumericalResult
import javax.swing.JFrame
import java.util.LinkedList
import de.hub.clickwatch.analysis.results.Chart
import de.hub.clickwatch.analysis.results.util.ChartUtil
import de.hub.clickwatch.analysis.results.Axis
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats

object LinkStatExampleSMTL {

  def main(args : Array[String]) : Unit = {
    BasicConfigurator.resetConfiguration()
    BasicConfigurator.configure();

    ResultsPackage.eINSTANCE
    ClickWatchDataModelPackage.eINSTANCE
    BrnPackage.eINSTANCE

    val resultsMM = "http://de.hub.clickwatch.analysis.results";
    val cwMM = "http://de.hub.clickwatch.datamodel";
    val inputFile = "file:dump/dump.xmi"

    val linkStatsTransformation = new TransformationM2M("Topology") from cwMM in inputFile to resultsMM

    //
    // RULE: networkRule
    val networkRule = new Rule[Network, NumericalResult]("Network") using ((helper, network, result) => {
      for (node <- network.getNodes()) {
        var bcast_statsHandler = node.getHandler("device_wifi/link_stat/bcast_stats").getValues().get(0).asInstanceOf[Bcast_stats];
       
        for(link <- bcast_statsHandler.getEntry().getLink()) {
        	helper.transform(link, classOf[Axis])  
        }
      }
    })

    //
    // RULE: linkRule
    val linkRule = new Rule[Link, Axis] using ((helper, link, axis) => {
    	var linkInfo = link.getLink_info().get(0);

        println("rate=" + linkInfo.getRate() + " size=" + linkInfo.getSize() + " fwd=" + linkInfo.getFwd() + " rev=" + linkInfo.getRev() + "")
    })

    linkStatsTransformation.setShowDirectTrace(false)
    linkStatsTransformation.addRule(networkRule, linkRule)
    linkStatsTransformation transform "dump/dump.xmi" exportToFile "outputLinkStat.xmi"

  }

}