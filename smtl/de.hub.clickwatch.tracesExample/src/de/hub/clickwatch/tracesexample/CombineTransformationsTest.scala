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

object CombineTransformationsTest {

  def main(args : Array[String]) {
    BasicConfigurator.resetConfiguration()
    BasicConfigurator.configure()

    var hwBusyTrans = HWBusyExampleSMTL.getTransformation(null)   
    var topologyTrans = TopologyExampleSMTL.getTransformation(null)
    var linkStatsTrans = LinkStatExampleSMTL.getTransformation(null)
    var hwBusyAverageTrans = HWBusyAverageExampleSMTL.getTransformation(null)

    val traceAnalyzer = new TraceAnalyzer()
    
    val allResources = new ResourceSetImpl()
    
    var res = getModel("dump/dump.xmi")    
    // res.setURI(URI.createFileURI("dump/dump.xmi"))    
    allResources.getResources().add(res)
    
    res = getModel("outputLinkStat.xmi")    
//    res.setURI(URI.createFileURI("new-model3"))  
    allResources.getResources().add(res)
    
    res = getModel("outputHWBusy.xmi")    
//    res.setURI(URI.createFileURI("new-model3"))  
    allResources.getResources().add(res)
    
    res = getModel("outputTopology.xmi")    
//    res.setURI(URI.createFileURI("new-model3"))  
    allResources.getResources().add(res)
        
    res = getModel("outputHWAverage.xmi")    
//    res.setURI(URI.createFileURI("new-model3"))  
    allResources.getResources().add(res)

    // which classOf[XYDataResultSet] forIn GraphNode
    var result = traceAnalyzer.which(classOf[XYDataResultSet], TopologyExampleSMTL.getExampleNode(), allResources)
    println("The Graphnode: " + TopologyExampleSMTL.getExampleNode() + "\nis based on data that connects to the following XYDataResultSet: " + result)

    // wihch classOf[XYDataResultSet] forIn GraphEdge    
    result = traceAnalyzer.which(classOf[XYDataResultSet], TopologyExampleSMTL.getExampleLink(), allResources)
    println("The Graphlink: " + TopologyExampleSMTL.getExampleLink() + "\nis based on data that connects to the following XYDataResultSet: " + result)

    // which GraphNode was used to get the average hwbusy value?
    // which classOf[GraphNode] forIn DoubleDataResultValue
    result = traceAnalyzer.which(classOf[GraphNode], HWBusyAverageExampleSMTL.testAverageValue, allResources)
    println("The Average Value: " + HWBusyAverageExampleSMTL.testAverageValue + "\nis based on data that connects to the following GraphNode: " + result)

    // which Node was used to get the average hwbusy?
    result = traceAnalyzer.which(classOf[Node], HWBusyAverageExampleSMTL.testAverageValue, allResources)
    println("The Average Value: " + HWBusyAverageExampleSMTL.testAverageValue + "\nis based on data that connects to the following Node: " + result)

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