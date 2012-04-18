package de.digitalforger.smtl.m2m
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EObject


/**
 * This object is just a helper to offer a better syntax.
 * It enables the user to concentrate more on the transformation code
 */
object SmtlTransformation {
  private val transformation = new TransformationM2M("Transformation")

  /**
   * adding a new rule to the transformation
   */
  def rule(newRule: IRule) = {
    transformation.addRule(newRule)
    this
  }

  //def transform(fromMetaModelURI: String) = { transformation.transform(fromMetaModelURI); SmtlTransformation }
  //def transform(resource: Resource) = { transformation.transform(resource); SmtlTransformation }
  def in(loadFromFile: String) = { transformation.in(loadFromFile); SmtlTransformation }
  def to(toMetaModelURI: String) = { transformation.to(toMetaModelURI); SmtlTransformation }

}

object Calculator {
  
  def calculate (fnc: (List[Int]) => Int) = { this }
  
  def geometricMean(lst: List[Int]): Int = { 0 }
  def arithmeticMean(lst: List[Int]): Int = { 0 }

  def of(lst: List[Int]) = {}
  
   def main(args: Array[String]) {
	  Calculator calculate arithmeticMean of List(1,2,3)
   }
}

object Test {
   import  de.digitalforger.smtl.m2m.Calculator.arithmeticMean
   
  def main(args: Array[String]) {

	  Calculator calculate arithmeticMean of List(1,2,3)
	  
    //new Calculate geometricMean of List(1,2,3)

    val inputFile = "file:../de.digitalforger.smtl.examples.model/resources/FamiliesToPersons/sample-Families.xmi"
    val familiesMetaModel = "http://www.digital-forger.de/examples/model/families"
    val personsMetaModel = "http://www.digital-forger.de/examples/model/persons"

    // first rule transforms member objects to male persons
    val rule1 = new Rule[EObject, EObject]("MemberToMale") when ((n) => {
      true
    }) using ((trans, n, t) => {
      println(t)
    })

    //SmtlTransformation from familiesMetaModel in inputFile to personsMetaModel rule rule1

  }
  def using(fnc: (List[Int]) => Int) = {}

  def median(lst: List[Int]): Int = { 0 }

  def arithmeticMean(lst: List[Int]): Int = { 0 }
}