package de.hub.clickwatch.tracesexample

import org.apache.log4j.BasicConfigurator
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import de.hub.clickwatch.analysis.results.GraphNode
import de.hub.clickwatch.analysis.results.XYDataResultSet
import de.hub.clickwatch.analysis.results.ResultsPackage
import de.hub.clickwatch.datamodel.Node
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage
import de.hub.clickwatch.specificdatamodels.brn.BrnPackage
import de.hub.clickwatch.tracesexample.hwbusy.HWBusyExampleSMTL
import de.hub.clickwatch.tracesexample.linkAndHW.HWBusyAverageExampleSMTL
import de.hub.clickwatch.tracesexample.topology.TopologyExampleSMTL
import linkStats.LinkStatExampleSMTL
import de.hub.clickwatch.analysis.traceable.analyzer.TraceAnalyzer
import de.hub.clickwatch.analysis.results.GraphResult
import de.hub.clickwatch.analysis.results.DoubleDataResultValue

object CombineTransformationsTest {

  def main(args : Array[String]) {
    BasicConfigurator.resetConfiguration()
    BasicConfigurator.configure()

    ResultsPackage.eINSTANCE
    ClickWatchDataModelPackage.eINSTANCE
    BrnPackage.eINSTANCE

    // do all the transformation work
    var hwBusyTrans = HWBusyExampleSMTL.getTransformation(null)
    //hwBusyTrans export "outputHWBusy.xmi"

    var topologyTrans = TopologyExampleSMTL.getTransformation(null)
    //topologyTrans export "outputTopology.xmi"

    var linkStatsTrans = LinkStatExampleSMTL.getTransformation(null)
    //linkStatsTrans export "outputLinkStat.xmi"

    var hwBusyAverageTrans = HWBusyAverageExampleSMTL.getTransformation(null)
    //hwBusyAverageTrans export "outputHWAverage.xmi"

    // get the analyzer and needed models
    val traceAnalyzer = new TraceAnalyzer()
    val allResources = new ResourceSetImpl()

    allResources.getResources().add(getModel("dump/dump.xmi"))
    allResources.getResources().add(getModel("outputLinkStat.xmi"))
    allResources.getResources().add(getModel("outputHWBusy.xmi"))
    allResources.getResources().add(getModel("outputTopology.xmi"))
    allResources.getResources().add(getModel("outputHWAverage.xmi"))

    val exampleNode = allResources.getResource(URI.createFileURI("outputTopology.xmi"), true).getContents().get(0).asInstanceOf[GraphResult].getNodes().get(0)
    // which classOf[XYDataResultSet] forIn GraphNode
    var result = traceAnalyzer.which(classOf[XYDataResultSet], exampleNode, allResources)
    println("The Graphnode: " + exampleNode + "\nis based on data that connects to the following XYDataResultSet: " + result)

    val exampleAverageValue = allResources.getResource(URI.createFileURI("outputHWAverage.xmi"), true).getContents().get(0).asInstanceOf[DoubleDataResultValue]
    // which GraphNode was used to get the average hwbusy value?
    // which classOf[GraphNode] forIn DoubleDataResultValue
    result = traceAnalyzer.which(classOf[GraphNode], exampleAverageValue, allResources)
    println("The Average Value: " + exampleAverageValue + "\nis based on data that connects to the following GraphNode: " + result)

    // which Node was used to get the average hwbusy?
    result = traceAnalyzer.which(classOf[Node], exampleAverageValue, allResources)
    println("The Average Value: " + exampleAverageValue + "\nis based on data that connects to the following Node: " + result)

  }

  /**
   *
   */
  def getModel(path : String) : Resource = {
    ResultsPackage.eINSTANCE
    ClickWatchDataModelPackage.eINSTANCE
    BrnPackage.eINSTANCE

    var reg = Resource.Factory.Registry.INSTANCE
    reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())

    var resSet = new ResourceSetImpl();
    var res : Resource = null

    try {
      res = resSet.getResource(URI.createFileURI(path), true);

    } catch {
      case e : Throwable => throw new Exception("Loading error: [" + e.getMessage + "]")
    }

    return res
  }
}