package de.hub.clickwatch.tracesexample

import scala.collection.JavaConversions._
import de.digitalforger.smtl.m2m.TransformationM2M
import de.hub.clickwatch.tracesexample.hwbusy.HWBusyExampleSMTL
import de.hub.clickwatch.tracesexample.topology.TopologyExampleSMTL
import de.digitalforger.smtl.trace.Tracer
import de.hub.clickwatch.analysis.results.XYDataResultSet
import de.hub.clickwatch.analysis.results.GraphNode
import org.eclipse.emf.ecore.EObject
import de.hub.clickwatch.datamodel.Node
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import de.hub.clickwatch.analysis.results.ResultsPackage
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage
import de.hub.clickwatch.specificdatamodels.brn.BrnPackage
import scala.collection.mutable.LinkedList
import org.apache.log4j.BasicConfigurator
import scala.collection.mutable.HashMap
import linkStats.LinkStatExampleSMTL
import de.hub.clickwatch.analysis.traceable.Traceable
import org.eclipse.emf.ecore.util.EcoreUtil
import de.hub.clickwatch.traceanalyzer.TraceAnalyzer
import de.hub.clickwatch.tracesexample.linkAndHW.HWBusyAverageExampleSMTL

object CombineTransformationsTest {

  def main(args : Array[String]) {
    BasicConfigurator.resetConfiguration()
    BasicConfigurator.configure()

    var sourceModel : Resource = getModel("dump/dump.xmi")
    var hwBusyTrans = HWBusyExampleSMTL.getTransformation(sourceModel.getContents())
    sourceModel = hwBusyTrans.getFromModel().getResource()
    var topologyTrans = TopologyExampleSMTL.getTransformation(sourceModel.getContents())
    sourceModel = topologyTrans.getFromModel().getResource()
    var linkStatsTrans = LinkStatExampleSMTL.getTransformation(sourceModel.getContents())
    sourceModel = linkStatsTrans.getFromModel().getResource()
    var hwBusyAverageTrans = HWBusyAverageExampleSMTL.getTransformation(getModel("outputHWBusy.xmi").getContents())
    //sourceModel = hwBusyAverageTrans.getFromModel().getResource()

    val traceAnalyzer = new TraceAnalyzer()

    // which classOf[XYDataResultSet] forIn GraphNode
    var result = traceAnalyzer.which(classOf[XYDataResultSet], TopologyExampleSMTL.getExampleNode(), sourceModel.getResourceSet(), getModel("outputHWBusy.xmi"))
    println("The Graphnode: " + TopologyExampleSMTL.getExampleNode() + "\nis based on data that connects to the following XYDataResultSet: " + result)

    // wihch classOf[XYDataResultSet] forIn GraphEdge    
    result = traceAnalyzer.which(classOf[XYDataResultSet], TopologyExampleSMTL.getExampleLink(), sourceModel.getResourceSet(), getModel("outputLinkStat.xmi"))
    println("The Graphlink: " + TopologyExampleSMTL.getExampleLink() + "\nis based on data that connects to the following XYDataResultSet: " + result)

    // which GraphNode was used to get the average hwbusy value?
    // which classOf[GraphNode] forIn DoubleDataResultValue
    result = traceAnalyzer.which(classOf[GraphNode], HWBusyAverageExampleSMTL.testAverageValue, sourceModel.getResourceSet(), getModel("outputTopology.xmi"))
    println("The Average Value: " + HWBusyAverageExampleSMTL.testAverageValue + "\nis based on data that connects to the following GraphNode: " + result)

    // which Node was used to get the average hwbusy?
    result = traceAnalyzer.which(classOf[Node], HWBusyAverageExampleSMTL.testAverageValue, sourceModel.getResourceSet(), sourceModel)
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