package de.hub.clickwatch.traceanalyzer

import scala.collection.JavaConversions._
import org.eclipse.emf.ecore.EObject
import de.hub.clickwatch.analysis.traceable.Traceable
import scala.collection.mutable.HashMap
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.resource.ResourceSet

class TraceAnalyzer {
	/**
   *
   */
  def which(targetClass : Class[_], srcObject : Traceable, setOfSourceModels : ResourceSet, analysisModel1 : Resource, analysisModel2 : Resource) : EObject = {
    var bestCandiate : EObject = null
    var bestPathLength = -1
    var curPathLength = -1

    // possible candidates of the target class
    val candidates_XYDATASET = getPossibleTargetCandidates(targetClass, analysisModel1)

    // retrieve the source model element for the given object 
    //val mm1ElementOfTargetObject = mm2Transformation.getTracer().getSourceElementForCreatedElement(srcObject)
    val mm1ElementOfTargetObject = srcObject.getTracesFrom().get(0)

    // generate the paths to the root element so we can define the shortest route to our target element
    var candidatePaths = new HashMap[EObject, java.util.LinkedList[EObject]]
    for (c <- candidates_XYDATASET) {
      var candidate : EObject = c.asInstanceOf[Traceable].getTracesFrom().get(0)
      if(candidate.eIsProxy())
    	  candidate = EcoreUtil.resolve(candidate, setOfSourceModels)
      
      candidatePaths.put(c, createPathToRootOfCandidate(candidate))
    }

      
    var curTargetObject : EObject = mm1ElementOfTargetObject

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
  private def getPossibleTargetCandidates(targetObject : Class[_], modelData : Resource) : java.util.LinkedList[EObject] = {
    var retList = new java.util.LinkedList[EObject]
    for (el <- modelData.getAllContents()) {
      if (targetObject.isAssignableFrom(el.getClass())) {
        retList.push(el)
      }
    }

    return retList
  }
  
    /**
   *
   */
  private def createPathToRootOfCandidate(candidate : EObject) : java.util.LinkedList[EObject] = {
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
}