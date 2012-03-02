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

    println("\nMIT INTERNEN TRACES\n")
    // which classOf[XYDataResultSet] forIn GraphNode
    var result = traceAnalyzer.which(classOf[XYDataResultSet], TopologyExampleSMTL.getExampleNode(), sourceModel.getResourceSet(), getModel("outputHWBusy.xmi"), getModel("outputTopology.xmi"))
    println("The Graphnode: " + TopologyExampleSMTL.getExampleNode() + "\nis based on data that connects to the following XYDataResultSet: " + result)

    // wihch classOf[XYDataResultSet] forIn GraphEdge    
    result = traceAnalyzer.which(classOf[XYDataResultSet], TopologyExampleSMTL.getExampleLink(), sourceModel.getResourceSet(), getModel("outputLinkStat.xmi"), getModel("outputTopology.xmi"))
    println("The Graphlink: " + TopologyExampleSMTL.getExampleLink() + "\nis based on data that connects to the following XYDataResultSet: " + result)

    // which node was used to get the average hwbusy value?
    // which classOf[Node] forIn DoubleDataResultValue
    result = traceAnalyzer.which(classOf[Node], HWBusyAverageExampleSMTL.testAverageValue, sourceModel.getResourceSet(), getModel("outputTopology.xmi"), getModel("outputHWAverage.xmi"))
    println("The Average Value: " + HWBusyAverageExampleSMTL.testAverageValue + "\nis based on data that connects to the following Node: " + result)

    //    println("\n\nMIT SMTL TRACES\n")    
    //    // which classOf[XYDataResultSet] forIn GraphNode
    //    result = which(classOf[XYDataResultSet], TopologyExampleSMTL.getExampleNode(), hwBusyTrans, topologyTrans)    
    //    println("The Graphnode: "+ TopologyExampleSMTL.getExampleNode() +"\nis based on data that connects to the following XYDataResultSet: "+ result)
    //
    //    // wihch classOf[XYDataResultSet] forIn GraphEdge    
    //    result = which(classOf[XYDataResultSet], TopologyExampleSMTL.getExampleLink(), linkStatsTrans, topologyTrans)  
    //    println("The Graphlink: "+ TopologyExampleSMTL.getExampleLink() +"\nis based on data that connects to the following XYDataResultSet: "+ result)

  }

  // ******************************************************************************
  //
  // VERSION 2
  //

  /**
   *
   */
  def which(targetClass : Class[_], srcObject : AnyRef, mm1Transformation : TransformationM2M, mm2Transformation : TransformationM2M) : EObject = {

    val candidates_XYDATASET = getPossibleTargetCandidates(targetClass, mm1Transformation)
    var bestCandiate : EObject = null
    var bestPathLength = -1
    var curPathLength = -1

    // retrieve the source model element for the graphnode 
    val mm1ElementOfTargetObject = mm2Transformation.getTracer().getSourceElementForCreatedElement(srcObject)

    // generate the paths to the root element so we can define the shortest route to our target element
    var candidatePaths = new HashMap[EObject, java.util.LinkedList[EObject]]
    for (c <- candidates_XYDATASET) {
      candidatePaths.put(c, createPathToRootOfCandidate(mm1Transformation.getTracer().getSourceElementForCreatedElement(c).asInstanceOf[EObject]))
    }

    var curTargetObject = mm1ElementOfTargetObject

    while (bestPathLength < 0) {
      // look where on the path of the candidates this object is    
      for (c <- candidatePaths) {
        if (c._2.contains(curTargetObject)) {
          // the target object is on the path of this candidate        
          curPathLength = c._2.size() - c._2.indexOf(curTargetObject)

          // is this a better candidate (shorter path to the target)
          if (bestPathLength == -1 || curPathLength < bestPathLength) {
            bestCandiate = c._1
            bestPathLength = curPathLength
          }
        }
      }

      // did not find a match? move the examined object of the target one step up
      if (bestPathLength < 0) {
        curTargetObject = curTargetObject.asInstanceOf[EObject].eContainer()

        // does a parent object exist? if not no match at all can be found
        if (curTargetObject == null) {
          println("THERE COULD NOT BE FOUND ANY CONNECTION!!")
          return null
        }
      }
    }

    return bestCandiate
  }

  /**
   *
   */
  def getPossibleTargetCandidates(targetObject : Class[_], targetTransformation : TransformationM2M) : java.util.LinkedList[EObject] = {
    var retList = new java.util.LinkedList[EObject]
    for (el <- targetTransformation.getCreatedElements()) {
      if (targetObject.isAssignableFrom(el.getClass())) {
        retList.push(el)
      }
    }

    return retList
  }

  /**
   *
   */
  def createPathToRootOfCandidate(candidate : EObject) : java.util.LinkedList[EObject] = {
    var path = new java.util.LinkedList[EObject]

    path.push(candidate)

    var currentEl = candidate.eContainer()

    // go up till the root is reached
    while (currentEl != null) {
      path.push(currentEl)
      currentEl = currentEl.eContainer()
    }

    path
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