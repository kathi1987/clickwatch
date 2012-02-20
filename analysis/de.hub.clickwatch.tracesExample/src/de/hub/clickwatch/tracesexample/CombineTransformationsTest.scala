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

object CombineTransformationsTest {

  private var hwBusyTrans : TransformationM2M = null
  private var topologyTrans : TransformationM2M = null
  private var sourceModel : Resource = getModel()

  def main(args : Array[String]) {
    BasicConfigurator.resetConfiguration()
    BasicConfigurator.configure()

    hwBusyTrans = HWBusyExampleSMTL.getTransformation(sourceModel.getContents())
    sourceModel = hwBusyTrans.getFromModel().getResource()
    topologyTrans = TopologyExampleSMTL.getTransformation(sourceModel.getContents())
    sourceModel = topologyTrans.getFromModel().getResource()

    // which classOf[xyDataSet] forIn GraphNode

    // find the DataResultSet for a GraphNode
    which(classOf[XYDataResultSet], TopologyExampleSMTL.getExampleNode(), hwBusyTrans.getTracer(), topologyTrans.getTracer())
  }

  /**
   *
   */
  def which(srcClass : Class[_], graphNode : AnyRef, hwBusyTracer : Tracer, topologyTracer : Tracer) = {

    val candidates = getPossibleCandidates(srcClass)
    val bestCandiate : EObject = null
    val bestPathLength = -1

    // generate the paths to the root element so we can define the shortest route to our target element
    var candidatePaths = new HashMap[EObject, java.util.LinkedList[EObject]]
    for (c <- candidates) {
      candidatePaths.put(c, createPathToRootOfCandidate(hwBusyTracer.getSourceElementForCreatedElement(c).asInstanceOf[EObject]))
    }           
    
    // retrieve the source model element for the graphnode 
    val mm1ElementOfTargetObject = topologyTracer.getSourceElementForCreatedElement(graphNode)

    // look where on the path of the candidates this object is
    
    
  }

  /**
   *
   */
  def getPossibleCandidates(targetObject : Class[_]) : java.util.LinkedList[EObject] = {
    var retList = new java.util.LinkedList[EObject]
    for (el <- hwBusyTrans.getCreatedElements()) {
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
  def generateCandidatePaths() = {

  }

  /**
   *
   */
  def getModel() : Resource = {
    ResultsPackage.eINSTANCE
    ClickWatchDataModelPackage.eINSTANCE
    BrnPackage.eINSTANCE

    var reg = Resource.Factory.Registry.INSTANCE
    reg.getExtensionToFactoryMap().put("xmi", new XMIResourceFactoryImpl())

    var resSet = new ResourceSetImpl();
    var res : Resource = null

    try {
      res = resSet.getResource(URI.createFileURI("dump/dump.xmi"), true);

    } catch {
      case e : Throwable => throw new Exception("Loading error: [" + e.getMessage + "]")
    }

    return res
  }
}