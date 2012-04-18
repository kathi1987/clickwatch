/**
 *
 */
package de.hub.clickwatch.tracesexample.hwbusy

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
import de.hub.clickwatch.datamodel.Handler
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
import de.hub.clickwatch.analysis.results.Series
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Phy
import de.hub.clickwatch.analysis.results.DoubleDataResultValue
import de.hub.clickwatch.specificdatamodels.brn.device_wifi_wifidevice_cst_stats.Channelstats
import java.util.ArrayList
import de.hub.clickwatch.analysis.results.DataResultSet
import de.hub.clickwatch.analysis.results.XYDataResultSet
import de.hub.clickwatch.analysis.results.util.ResultsSwitch
import org.eclipse.emf.ecore.EObject

/**
 * @author Lars George
 *
 */
object HWBusyExampleSMTL {
  private val resultList = new LinkedList[NumericalResult]
  private var hwbusyTransformation : TransformationM2M = null

  var SHOW_GRAPH = true
  var onlyNodes = new ArrayList[Node]

  def main(args : Array[String]) {
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

    hwbusyTransformation = new TransformationM2M("Topology") from cwMM to resultsMM

    /**
     * RULE
     */
    val networkRule = new Rule[Network, NumericalResult]("NunmericalResult") using (
      (helper, network, result) => {
        result.getCharts().add(ChartUtil.createXYChart("Plot over time", "nodes", "time", "HW_busy"));
        resultList.add(result)

        // just to get some "selected" nodes for the transformation
        for (i <- 0 to 2) {
          //helper.transform(node, classOf[Series])
          var node = network.getNodes().get(i)
          onlyNodes.add(node)
        }
      })

    /**
     * RULE
     */
    val nodeToDataResultRule = new Rule[Node, XYDataResultSet]("xyDataSet") when (
      (node) => { onlyNodes.contains(node) }) using (
        (helper, node, resultSet) => {          

          // for all time values
          for (value <- node.getHandler("device_wifi/wifidevice/cst/stats").getValues()) {
        	  if(resultSet.getName() == null)
        		  resultSet.setName(node.getINetAddress() + " / " + value.asInstanceOf[Stats].getChannelstats().getNode())
            
            
            // transform every statsHandler to a "hwBusyResult" (DoubleDataResultValue)
            val hwBusyResult = as[DoubleDataResultValue](value)

            val timeValue = create[DoubleDataResultValue]
            timeValue.setValue(value.asInstanceOf[Stats].getTimestamp())

            resultSet.getXValues.add(timeValue)
            resultSet.getYValues.add(hwBusyResult)
          }
        })

    /**
     * RULE
     */
    val statsToHWBusyResultValueRule = new Rule[Stats, DoubleDataResultValue]("HWBusy") isLazy () using (
      (helper, statsHandler, resultValue) => {

        var time : java.lang.Long = statsHandler.getTimestamp()
        var hwBusy : Integer = statsHandler.getChannelstats().getPhy().getHwbusy()

        resultValue.setValue(hwBusy.toDouble)

        // wont be needed if visualisation can read new output data model
        // to be able to display the result
        val result = resultList.get(0)
        result.getData().add(
          statsHandler.getChannelstats().getNode(),
          time,
          hwBusy);
      })

    /*
     * 
     * 
     * VERSION 2
     * 
     * 
     */

    val statsHandlerToDataResultSet = new Rule[Handler, XYDataResultSet]("") when (
      (h) => {
        // check for the correct handler and that it is from a node we want to use
        (h.getQualifiedName().equals("device_wifi/wifidevice/cst/stats") && onlyNodes.contains(h.eContainer().eContainer().eContainer().eContainer().asInstanceOf[Node]))
      }) using (
        (helper, handler, resultSet) => {
                    
          for (value <- handler.getValues()) {
        	// set the name of the data resultset
            if(resultSet.getName() == null)  
        		resultSet.setName(value.asInstanceOf[Stats].getChannelstats().getNode())  
              
            
            // transform the hwBusy to a resultValue            
            val hwBusyResult = as[DoubleDataResultValue](value)

            val timeValue = create[DoubleDataResultValue]
            timeValue.setValue(value.asInstanceOf[Stats].getTimestamp())

            resultSet.getXValues.add(timeValue)
            resultSet.getYValues.add(hwBusyResult)
          }

        })

    hwbusyTransformation.setShowDirectTrace(false)
    //hwbusyTransformation.addRule(networkRule, nodeToDataResultRule, statsToHWBusyResultValueRule)
    hwbusyTransformation.addRule(networkRule, statsHandlerToDataResultSet, statsToHWBusyResultValueRule)

    if (loadFromIterable == null)
      hwbusyTransformation transform inputFile exportToFile "outputHWBusy.xmi"
    else
      hwbusyTransformation transform loadFromIterable exportToFile "outputHWBusy.xmi"

    if (SHOW_GRAPH) {
      showGraph()
    }
  }

  /**
   *
   */
  def getTransformation(loadFromIterable : Iterable[_ <: EObject]) = {
    if (hwbusyTransformation == null)
      executeTransformation(loadFromIterable)

    hwbusyTransformation
  }

  /**
   *
   */
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