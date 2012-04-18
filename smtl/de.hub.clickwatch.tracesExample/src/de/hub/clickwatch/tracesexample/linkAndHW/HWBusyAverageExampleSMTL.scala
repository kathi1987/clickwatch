package de.hub.clickwatch.tracesexample.linkAndHW

import scala.collection.JavaConversions._
import de.digitalforger.smtl.m2m.TransformationM2M
import de.digitalforger.smtl.m2m.TransformationHelperSyntax._
import de.digitalforger.smtl.m2m.Rule
import de.hub.clickwatch.analysis.results.Results
import de.hub.clickwatch.analysis.results.ResultsPackage
import de.hub.clickwatch.datamodel.ClickWatchDataModelPackage
import de.hub.clickwatch.specificdatamodels.brn.BrnPackage
import org.eclipse.emf.ecore.EObject
import de.hub.clickwatch.analysis.results.XYDataResultSet
import de.hub.clickwatch.analysis.results.DoubleDataResultValue

object HWBusyAverageExampleSMTL {

  var testAverageValue : DoubleDataResultValue = null
  private var hwBusyAverageTransformation : TransformationM2M = null

  /**
   *
   */
  private def executeTransformation(loadFromIterable : Iterable[_ <: EObject]) = {
    ResultsPackage.eINSTANCE
    BrnPackage.eINSTANCE

    val resultsMM = "http://de.hub.clickwatch.analysis.results";
    val loadFromFile = "file:outputHWBusy.xmi";

    hwBusyAverageTransformation = new TransformationM2M("Topology") from resultsMM to resultsMM

    /**
     * RULE
     */
    val testRule = new Rule[XYDataResultSet, DoubleDataResultValue]("makeAverage") using ((h, s, t) => {

      // just for testing purpose
      if (testAverageValue == null) testAverageValue = t

      var addedValues : Double = 0.0

      // add all hwbusy values
      for (value <- s.getYValues())
        addedValues += value.asInstanceOf[DoubleDataResultValue].getValue()

      // set simple average value
      t.setValue(addedValues / s.getYValues().size())
    })

    hwBusyAverageTransformation.setShowDirectTrace(true)
    hwBusyAverageTransformation.addRule(testRule)

    if (loadFromIterable != null)
      hwBusyAverageTransformation transform loadFromIterable exportToFile "outputHWAverage.xmi"
    else
      hwBusyAverageTransformation transform loadFromFile exportToFile "outputHWAverage.xmi"
  }

  /**
   *
   */
  def getTransformation(loadFromIterable : Iterable[_ <: EObject]) = {
    if (hwBusyAverageTransformation == null)
      executeTransformation(loadFromIterable)

    hwBusyAverageTransformation
  }

}