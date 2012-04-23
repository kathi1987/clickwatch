package de.hub.clickwatch.analysis.traceable.analyzer

import scala.collection.JavaConversions._
import org.eclipse.emf.ecore.EObject
import de.hub.clickwatch.analysis.traceable.Traceable
import scala.collection.mutable.HashMap
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.util.EcoreUtil
import org.eclipse.emf.ecore.resource.ResourceSet

/**
 * Class to query models that have traces between them
 */
class TraceAnalyzer {

  /**
   * analyzes the given resource set and searches for objects of a given type, that is connected to a given object
   *
   * @param targetClass
   * 	The class for the objects that should be found
   * @param srcObject
   * 	The source object for the analysis
   * @setOfSourceModels
   * 	Te ResourceSet of models where the objects are located in
   */
  def which(targetClass : Class[_], srcObject : Traceable, setOfSourceModels : ResourceSet) : EObject = {
    var bestCandiate : EObject = null
    var bestPathLength = -1
    var curPathLength = -1

    // possible candidates of the target class
    val candidates = getPossibleTargetCandidates(targetClass, setOfSourceModels)

    // generate the paths to the root element of each candidate
    // so we can define the shortest route to our target element
    var candidatePaths = new HashMap[EObject, java.util.LinkedList[EObject]]
    for (c <- candidates) {
      var candidate : EObject = c
      if (candidate.isInstanceOf[Traceable] && candidate.asInstanceOf[Traceable].getTracesFrom().size() > 0) {
        candidate = c.asInstanceOf[Traceable].getTracesFrom().get(0)
      }

      // resolve proxy elements
      if (candidate.eIsProxy()) {
        candidate = EcoreUtil.resolve(candidate, setOfSourceModels)
      }

      var allPaths = createAllPathToRootOfCandidate(candidate, setOfSourceModels)
      for (p <- allPaths)
        candidatePaths.put(c, p)
    }

    var curTargetObject : EObject = srcObject

    while (bestPathLength < 0) {
      // look where on the path of the candidates this object is    
      for (c <- candidatePaths) {
        for (t <- c._2) {
          try {      
            // check equality. cannot use contains of list, because eObjects need to be compared in a specific way
            if (t.eClass().getEPackage().getNsURI().equals(curTargetObject.eClass().getEPackage().getNsURI()) && 
                EcoreUtil.equals(t, curTargetObject)) {
              
              // the target object is on the path of this candidate        
              curPathLength = c._2.size() - c._2.indexOf(curTargetObject)

              // is this a better candidate (shorter path to the target)
              if (bestPathLength == -1 || curPathLength < bestPathLength) {
                bestCandiate = c._1
                bestPathLength = curPathLength
              }
            }
          } catch {
            case e : ClassCastException => ""
          }

        }
      }

      // did not find a match? move the examined object of the target one step up
      if (bestPathLength < 0) {

        if (curTargetObject.isInstanceOf[Traceable] && curTargetObject.asInstanceOf[Traceable].getTracesFrom().size() > 0) {
          curTargetObject = curTargetObject.asInstanceOf[Traceable].getTracesFrom().get(0)

          // if its a proxy resolve it
          if (curTargetObject.eIsProxy())
            curTargetObject = EcoreUtil.resolve(curTargetObject, setOfSourceModels)

        } else {
          curTargetObject = curTargetObject.asInstanceOf[EObject].eContainer()
        }

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
  private def getPossibleTargetCandidates(targetObject : Class[_], resSet : ResourceSet) : java.util.LinkedList[EObject] = {
    var retList = new java.util.LinkedList[EObject]

    for (modelData <- resSet.getResources()) {
      for (el <- modelData.getAllContents()) {
        if (targetObject.isAssignableFrom(el.getClass())) {
          retList.push(el)
        }
      }
    }

    return retList
  }

  /**
   *
   */
  private def createAllPathToRootOfCandidate(candidate : EObject, setOfSourceModels : ResourceSet) : java.util.LinkedList[java.util.LinkedList[EObject]] = {

    var allPath = new java.util.LinkedList[java.util.LinkedList[EObject]]

    // add the path to the root of the candidate
    allPath.push(createPathToRootOfCandidate(candidate))

    // now check for references to other models, and add their path too
    var currentEl = candidate

    // go up till the root is reached
    while (currentEl != null) {
      currentEl match {
        case c : Traceable =>
          // check all traces
          for (trace <- c.getTracesFrom()) {
            var t = trace;
            if (t.eIsProxy())
              t = EcoreUtil.resolve(t, setOfSourceModels).asInstanceOf[Traceable]

            allPath.push(createPathToRootOfCandidate(t))
          }
        case c : EObject =>
          allPath.push(createPathToRootOfCandidate(c))
      }
      currentEl = currentEl.eContainer()
    }

    allPath
  }

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