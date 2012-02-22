package de.hub.clickwatch.tracesexample.linkStats
import scala.collection.JavaConversions._
import de.hub.clickwatch.analysis.results.Results
import de.hub.clickwatch.analysis.results.ResultsPackage
import de.digitalforger.smtl.m2m.TransformationM2M
import de.digitalforger.smtl.m2m.TransformationHelperSyntax._
import de.digitalforger.smtl.m2m.Rule
import de.hub.clickwatch.datamodel.Node
import de.hub.clickwatch.analysis.results.GraphNode
import de.hub.clickwatch.analysis.results.ui.ResultsChartVisualization
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage
import de.hub.clickwatch.datamodel.Node
import de.hub.clickwatch.analysis.results.GraphResult
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage
import org.apache.log4j.BasicConfigurator
import de.hub.clickwatch.datamodel.Network
import de.hub.clickwatch.analysis.results.NumericalResult
import javax.swing.JFrame
import java.util.LinkedList
import de.hub.clickwatch.analysis.results.Chart
import de.hub.clickwatch.analysis.results.util.ChartUtil
import de.hub.clickwatch.analysis.results.Series
import de.hub.clickwatch.analysis.results.DoubleDataResultValue
import de.hub.clickwatch.specificdatamodels.brn.BrnPackage
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Bcast_stats
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_link_stat_bcast_stats.Link_info
import java.lang.Integer
import java.lang.Double
import org.eclipse.emf.ecore.EObject
import de.hub.clickwatch.analysis.results.XYDataResultSet

object LinkStatExampleSMTL {
  private var SHOW_GRAPH = true
  private val resultList = new LinkedList[NumericalResult]
  private var linkStatsTransformation : TransformationM2M = null

  def main(args : Array[String]) : Unit = {
    BasicConfigurator.resetConfiguration()
    BasicConfigurator.configure();

    executeTransformation(null);
  }

  private def executeTransformation(loadFromIterable : Iterable[_ <: EObject]) = {
    ResultsPackage.eINSTANCE
    ClickWatchDataModelPackage.eINSTANCE
    BrnPackage.eINSTANCE

    val resultsMM = "http://de.hub.clickwatch.analysis.results";
    val cwMM = "http://de.hub.clickwatch.datamodel";
    val inputFile = "file:dump/dump.xmi"

    linkStatsTransformation = new TransformationM2M("Topology") from cwMM to resultsMM

    //
    // RULE: networkRule
    val networkRule = new Rule[Network, NumericalResult]("Network") using ((helper, network, result) => {
      result.getCharts().add(ChartUtil.createXYChart("Link attributes", "links", "attribute", "value"));
      resultList.add(result)

      val node = network.getNodes().get(0)
      //for (node <- network.getNodes()) {
      var bcast_statsHandler = node.getHandler("device_wifi/link_stat/bcast_stats").getValues().get(0).asInstanceOf[Bcast_stats];

      for (link <- bcast_statsHandler.getEntry().getLink()) {
        helper.transform(link, classOf[XYDataResultSet])
      }
      //}
    })

    //
    // RULE: linkRule
    val linkRule = new Rule[Link, XYDataResultSet]("linkRule") isLazy () using ((helper, link, resultSet) => {

      resultSet.setName(link.getEContainer_link().getFrom() + " - " + link.getTo())
      
      var linkInfo = link.getLink_info().get(0);
      helper.transform(linkInfo, classOf[DoubleDataResultValue])

      // is still here for the visual representation
      val result = resultList.get(0)
      val linkName = link.hashCode().toString()
      result.getData().add(
        linkName,
        new Integer(0),
        new Double(linkInfo.getRate()));

      result.getData().add(
        linkName,
        new Integer(1),
        new Double(linkInfo.getSize()));

      result.getData().add(
        linkName,
        new Integer(2),
        new Double(linkInfo.getFwd()));

      result.getData().add(
        linkName,
        new Integer(3),
        new Double(linkInfo.getRev()));
      //println("rate=" + linkInfo.getRate() + " size=" + linkInfo.getSize() + " fwd=" + linkInfo.getFwd() + " rev=" + linkInfo.getRev() + "")
    })

    //
    // RULE: linkInfoRule
    val linkInfoRule = new Rule[Link_info, DoubleDataResultValue]("linkInfoRule") isLazy () using ((h, linkInfo, rateValue) => {
      rateValue.setValue(linkInfo.getRate())

      val sizeValue = create[DoubleDataResultValue]
      sizeValue.setValue(linkInfo.getSize())

      val pdrFwd = create[DoubleDataResultValue]
      pdrFwd.setValue(linkInfo.getFwd())

      val pdwRev = create[DoubleDataResultValue]
      pdwRev.setValue(linkInfo.getRev())
    })

    linkStatsTransformation.setShowDirectTrace(false)
    linkStatsTransformation.addRule(networkRule, linkRule, linkInfoRule)

    if (loadFromIterable == null)
      linkStatsTransformation transform inputFile exportToFile "outputLinkStat.xmi"
    else
      linkStatsTransformation transform loadFromIterable exportToFile "outputLinkStat.xmi"

    if (SHOW_GRAPH) {
      showGraph()
    }
  }

  /**
   *
   */
  def getTransformation(loadFromIterable : Iterable[_ <: EObject]) = {
    if (linkStatsTransformation == null)
      executeTransformation(loadFromIterable)

    linkStatsTransformation
  }

  private def showGraph() = {
    var jframe = new JFrame("Visualization")
    jframe.setSize(800, 600);
    var visual = new ResultsChartVisualization();
    var c = visual.createVisualization(resultList)
    if (c != null) {
      jframe.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE)
      jframe.getContentPane().add(c)
      jframe.setVisible(true)
    }
  }

}