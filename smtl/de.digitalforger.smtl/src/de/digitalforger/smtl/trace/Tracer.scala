package de.digitalforger.smtl.trace

import de.digitalforger.smtl.logging.LogHelper
import ETraceConnectionType._
import scala.collection.mutable.HashMap
import java.util.LinkedList
import de.digitalforger.smtl.m2m.IRule
import de.hub.clickwatch.analysis.traceable.Traceable

/**
 * The Tracer is used to save and read the connections between source and target model elements
 * in a transformation process.
 *
 * @author Lars George
 */
class Tracer extends LogHelper {

  var showDirectTrace = false

  /**
   * logs a backtrack -> which source element was used to create the target element?
   */
  private var reverseTraceLog = new HashMap[AnyRef, AnyRef]

  /**
   * Every element has a list of elements it is connected to with a certain type
   */
  private var traceLogBySourceElement = new HashMap[AnyRef, LinkedList[(AnyRef, ETraceConnectionType)]]

  /**
   * This log keeps additionally track of which rule created which target element from a source element
   */
  private var traceLogByRuleAndSourceElement = new HashMap[(IRule, AnyRef), LinkedList[(AnyRef, ETraceConnectionType)]]

  /**
   * add a new entry to the trace
   */
  def trace(from : AnyRef, to : AnyRef, byRule : IRule, connectionType : ETraceConnectionType) = {
    // first the traceLogBySourceElement

    // is there an entry for this from element?
    traceLogBySourceElement.get(from) match {
      // yes, just push the new connection in the list  
      case Some(x) => x.push((to, connectionType))

      // no, create a new list and then add the first element
      case None =>
        var newList = new LinkedList[(AnyRef, ETraceConnectionType)]()
        newList.push((to, connectionType))
        traceLogBySourceElement += from -> newList
    }

    // now the traceLogByRuleAndSourceElement
    traceLogByRuleAndSourceElement.get((byRule, from)) match {
      case Some(x) => x.push((to, connectionType))

      case None =>
        var newList = new LinkedList[(AnyRef, ETraceConnectionType)]()
        newList.push((to, connectionType))
        traceLogByRuleAndSourceElement += (byRule, from) -> newList
    }

    // finally the reverse trace log
    reverseTraceLog.get(to) match {
      case Some(x) => logger.warn("Reverse log overwrites an element: Two traces for the same target element?")
      case None    =>
    }
    reverseTraceLog += to -> from

    // clickwatch addition. Trace logs in the models if possible
    if(to.isInstanceOf[Traceable] && from.isInstanceOf[Traceable]) {
      to.asInstanceOf[Traceable].getTracesFrom().add(from.asInstanceOf[Traceable])
      from.asInstanceOf[Traceable].getTracesTo().add(to.asInstanceOf[Traceable])
    }
    
    if (showDirectTrace)
      logger.info("Rule [" + byRule + "] made new connection from [" + from + "] to [" + to + "] of type [" + connectionType + "]")
  }

  /**
   * Getter for the source element that was used to create the given object. If no object could be found, null is returned
   */
  def getSourceElementForCreatedElement(targetEl : AnyRef) : AnyRef = {

    reverseTraceLog.get(targetEl) match {
      case Some(x) => x
      case None    => null
    }
  }
  
  /**
   * Getter for trace log entries for a certain object
   */
  def getElementsCreatedBy(from : AnyRef) : LinkedList[(AnyRef, ETraceConnectionType)] = {
    traceLogBySourceElement.get(from) match {
      case Some(x) => x;
      case None    => new LinkedList[(AnyRef, ETraceConnectionType)]()
    }
  }

  /**
   * Getter for the trace log entries for a certain object created by a certain rule
   */
  def getElementsCreatedBy(from : AnyRef, byRule : IRule) : LinkedList[((AnyRef, ETraceConnectionType))] = {
    traceLogByRuleAndSourceElement.get((byRule, from)) match {
      case Some(x) => x
      case None    => new LinkedList[(AnyRef, ETraceConnectionType)]()
    }
  }

}