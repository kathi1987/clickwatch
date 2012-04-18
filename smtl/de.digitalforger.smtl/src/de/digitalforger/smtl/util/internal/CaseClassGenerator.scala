package de.digitalforger.smtl.util.internal

import java.util.LinkedList
import scala.collection.JavaConversions.asScalaBuffer
import scala.collection.mutable.HashMap
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.EAttribute
import org.eclipse.emf.ecore.EClassifier
import org.eclipse.emf.ecore.EDataType
import org.eclipse.emf.ecore.EPackage
import org.eclipse.emf.ecore.EReference
import org.eclipse.emf.ecore.EStructuralFeature
import de.digitalforger.smtl.logging.LogHelper
import de.digitalforger.smtl.m2t.IM2TGenerator
import org.eclipse.emf.ecore.impl.EEnumImpl

/**
 * A model to text generator that generates case classes with implicits (model -> case class and clase class -> model).
 * Input is an ecore resource.
 * The Output will be written to a file with the given destination path
 */
class CaseClassGenerator(destination: String, pkgName: String, objName: String, referenceBasePackage: String) extends IM2TGenerator {
  /**
   * an enumeration of the parameter types for a case class parameter
   */
  object ParameterType extends Enumeration with LogHelper {
    type ParameterType = Value
    val SingleValue, SingleBooleanValue, ListValue = Value
  }
  import ParameterType._

  /**
   * this map is for checking that imports are not generated multiple times
   */
  private val importedClasses = new HashMap[String, Boolean]

  /**
   * the ePackageName of the given model will be saved here
   */
  private var ePackageName = "";

  /**
   *  paramList maps EClassifiers to a list of parameters (the tuple values are parameter names and the parameter type)
   */
  private var paramList = new HashMap[EClassifier, LinkedList[(String, ParameterType)]]

  /**
   * This map will be filled at the beginning to let the transformation know which Classifiers exist.
   * It helps to decide at certain points during the transformation process.
   */
  private var existingClassifiers = new HashMap[EClassifier, Boolean]

  /**
   * start point of the M2T transformation
   */
  override def generate(resource: Resource): Unit = {
    // lookup the package name
    ePackageName = resource.getContents().get(0).asInstanceOf[EPackage].getName()

    // check for all classifiers that will be transformed to case classes
    resource.foreach(classOf[EClassifier], lookupAllClassifiers)

    // exclude certain types for the import statements
    excludeSpecialTypesFromImport()

    // do the text generation
    this createFile destination withContent START +
      "package " + pkgName + << +
      << +
      "import de.digitalforger.smtl.core._" + << +
      resource.foreach(classOf[EAttribute], getImports) +
      resource.foreach(classOf[EReference], getImportsOfReferences) +
      resource.foreach(classOf[EClassifier], getImportsOfClassifier) +
      getFactoryImport() +
      << +
      resource.foreach(classOf[EClassifier], caseClassForClassifier) +
      << +
      "object " + objName + "{" + << +
      "\tdef let(obj: IGeneratedCC) = obj" + << +
      << +
      resource.foreach(classOf[EClassifier], createImplicit) +
      "}" + <<
  }

  /**
   * fills the 'existingClassifiers' map with the available data
   */
  def lookupAllClassifiers(obj: EClassifier): String = {
    existingClassifiers.get(obj) match {
      case Some(x) => ""
      case None => existingClassifiers += obj -> true
    }

    ""
  }

  /**
   * returns the needed import for the factory methods of the model objects
   */
  def getFactoryImport(): String = {
    val importFactoryName = referenceBasePackage + "." + ePackageName + ".impl." + firstToUpper(ePackageName) + "FactoryImpl";
    // check if we already imported that type
    importedClasses.get(importFactoryName) match {
      case Some(x) => ""
      case None =>
        importedClasses += importFactoryName -> true
        START + "import " + importFactoryName + <<
    }
  }

  /**
   * returns the needed import for an attribute
   */
  def getImports(attr: EAttribute): String = {

    // check if we already imported that type
    importedClasses.get(attr.getEAttributeType().getInstanceClassName()) match {
      case Some(x) => ""
      case None =>
        if (attr.getEAttributeType().getInstanceClassName() == null) ""
        else {
          importedClasses += attr.getEAttributeType().getInstanceClassName() -> true
          START + "import " + attr.getEAttributeType().getInstanceClassName() + <<
        }
    }
  }

  /**
   * returns the needed imports for reference objects
   */
  def getImportsOfReferences(ref: EReference): String = {

    // check if we already imported that type
    importedClasses.get(ref.getEType().getName()) match {
      case Some(x) => ""
      case None =>
        if (ref.getEType().getName() == null) ""
        else {
          importedClasses += ref.getEType().getName() -> true
          START + "import " + referenceBasePackage + "." + ePackageName + "." + ref.getEType().getName() + <<
        }

    }
  }

  /**
   * returns the needed imports for classifier objects
   */
  def getImportsOfClassifier(obj: EClassifier): String = {
    // check if we already imported that type
    importedClasses.get(obj.getName()) match {
      case Some(x) => ""
      case None =>
        importedClasses += obj.getName() -> true
        START + "import " + referenceBasePackage + "." + ePackageName + "." + obj.getName() + <<
    }
  }

  /**
   * Generates a case class for an EClassifier
   */
  def caseClassForClassifier(obj: EClassifier): String = {

    // enums will not be converted
    if (obj.isInstanceOf[EEnumImpl])
      return ""

    var attributes = obj.foreach(classOf[EAttribute], getAttribute, ", ", true)
    val referenceAttributes = obj.foreach(classOf[EReference], getReferenceAttribute, ", ")

    if (referenceAttributes.length() > 0 && attributes.length > 0) attributes += ", "

    START + "case class " + obj.getName() + "CC (" + attributes +
      referenceAttributes + ") extends IGeneratedCC" + <<
  }

  /**
   * helper method that returns the string version of an EAttribute for a parameter list
   */
  private def getAttribute(param: EAttribute): String = {
    var paramTypeName: String = convertStandardValueTypes(param.getEAttributeType())
    var isCollection = false;

    if (paramTypeName == null)
      logger.error("Attribute type is null: " + param)

    // is it a collection of?
    if (param.getUpperBound() == -1 || (param.getUpperBound() - param.getLowerBound() > 1)) {
      paramTypeName = "org.eclipse.emf.common.util.EList[" + paramTypeName + "]"
      var isCollection = false;
    }

    // what kind of a parameter do we have?
    var paramType: ParameterType = ParameterType.SingleValue
    if (isCollection) paramType = ParameterType.ListValue
    if (paramTypeName != null && paramTypeName.equals("Boolean")) paramType = ParameterType.SingleBooleanValue

    // write the param type to list of params of the containing EClassifier    
    saveToParameterList(param.getEContainingClass().asInstanceOf[EClassifier], firstToUpper(param.getName()), paramType)

    START + this.getSafeName(param.getName()) + " : " + paramTypeName
  }

  /**
   * helper method that returns returns the string version of an EReference for a parameter list
   */
  private def getReferenceAttribute(ref: EReference): String = {

    var isCollection = (ref.getUpperBound() == -1 || (ref.getUpperBound() - ref.getLowerBound() > 1));
    var paramTypeName: String = null;

    // is it a collection of?
    if (isCollection) {
      paramTypeName = "org.eclipse.emf.common.util.EList[" + ref.getEType().getName() + "]"
    } else {
      // if the paramType belongs to a classifier a case class is generated for, use the CC type           
      if (ref.getEType().getName() != null) {
        paramTypeName = this.existingClassifiers.get(ref.getEContainingClass().asInstanceOf[EClassifier]) match {
          case Some(x) => ref.getEType().getName() + "CC"
          case None => ref.getEType().getName()
        }
      } else {
        // if the eType is null try it with the reference name as type
        logger.error("Reference type is null: " + ref)
      }

    }

    // what kind of a parameter do we have?
    var paramType: ParameterType = ParameterType.SingleValue
    if (isCollection) paramType = ParameterType.ListValue
    if (paramTypeName.equals("Boolean")) paramType = ParameterType.SingleBooleanValue

    // write the param type to list of params of the containing EClassifier    
    saveToParameterList(ref.getEContainingClass().asInstanceOf[EClassifier], firstToUpper(ref.getName()), paramType)

    START + getSafeName(ref.getName()) + " : " + paramTypeName
  }

  /**
   * helper method to save the generated parameters for each classifier
   */
  private def saveToParameterList(classifier: EClassifier, getterName: String, paramType: ParameterType): Unit = {
    paramList.get(classifier) match {
      case Some(classifierParameters) =>
        classifierParameters.push((getterName, paramType))

      case None =>
        val newList = new LinkedList[(String, ParameterType)]
        newList.push((getterName, paramType))
        paramList += classifier -> newList
    }
  }

  /**
   * creates two implicits for each classifier. one to and one from the newly created case class
   * @param obj
   * 	the classifier the implicits should belong to
   */
  def createImplicit(obj: EClassifier): String = {
    if (!obj.isInstanceOf[EEnumImpl])
      START + createImplicitA2B(obj) + createImplicitB2A(obj)
    else
      ""
  }

  /**
   * helper method to create the implicit from the model object to the case class
   */
  private def createImplicitA2B(obj: EClassifier): String = {
    var paramterList: String = this.paramList.get(obj) match {
      case Some(x) => createParameterList(x)
      case None => ""
    }

    START + "\timplicit def " + obj.getName() + "2" + obj.getName() + "CC(obj : " + obj.getName() + ") : " + obj.getName() + "CC = " + obj.getName() + "CC(" +
      paramterList +
      ")" + <<
  }

  /**
   * helper method to create the implicit from the case class to the model object
   */
  private def createImplicitB2A(obj: EClassifier): String = {

    // var fam = FamiliesFactoryImpl.init().createFamily()

    START + "\timplicit def " + obj.getName() + "CC" + "2" + obj.getName() + "(obj : " + obj.getName() + "CC): " + obj.getName() + " = { " + << +
      "\t\tval ret : " + obj.getName() + " = " + firstToUpper(this.ePackageName) + "FactoryImpl.init().create" + obj.getName() + "()" + << +
      setValueForEachParameter(obj) +
      "\t\tret" + << +
      "\t}" + <<
  }

  /**
   * helper method to generate the getter and setter calls for each parameter
   */
  private def setValueForEachParameter(obj: EClassifier): String = {
    val retBuff: StringBuffer = new StringBuffer()

    // do we have some parameters?
    paramList.get(obj) match {
      case None => ""
      case Some(classifierParameters) =>
        for (param <- classifierParameters) {

          // is it a collection datatype?
          if (param._2 == ParameterType.ListValue) {
            retBuff.append("\t\tret.get" + param._1 + "().addAll(0, obj." + getSafeName(firstToLower(param._1)) + ")\n")
          } else {
            retBuff.append("\t\tret.set" + param._1 + "(obj." + getSafeName(firstToLower(param._1)) + ")\n")
          }
        }
    }

    retBuff.toString()
  }

  /**
   * helper method to generate the string of the parameter list definition of an case class constructor
   */
  private def createParameterList(parameterList: LinkedList[(String, ParameterType)]): String = {

    val retBuff = new StringBuffer()

    for (value <- parameterList.reverseIterator) {
      if (value._2 == ParameterType.SingleBooleanValue)
        retBuff.append("obj.is" + value._1 + "(), ")
      else
        retBuff.append("if(obj != null) obj.get" + value._1 + "() else null, ")
    }

    if (retBuff.length() > 2)
      retBuff.deleteCharAt(retBuff.length() - 2)

    retBuff.toString()
  }

  /**
   * convert standard e-datatypes to normal scala/java types
   */
  private def convertStandardValueTypes(typeName: EDataType): String = {
    typeName.getName() match {
      case "EString" => "String"
      case "EDouble" => "Double"
      case "EBigDecimal" => "BigDecimal"
      case "EBoolean" => "Boolean"
      case _ => typeName.getName()
    }
  }

  /**
   * helper method to avoid having valuenames that can not be used in scala
   */
  private def getSafeName(str: String): String = {
    str match {
      case "type" => "typeValue"
      case "return" => "returnValue"
      case "case" => "caseValue"
      case "class" => "classValue"
      case _ => str
    }
  }

  /**
   * helper method that adds some entries to the map of already generated imports, so that they actually not be generated
   * needs to be done due to the fact that emf offers some other data types than we have in scala
   */
  private def excludeSpecialTypesFromImport(): Unit = {
    this.importedClasses += "boolean" -> true
    this.importedClasses += "double" -> true
    this.importedClasses += "null" -> true
  }

  /**
   * helper string method (first character will be in upper case)
   */
  private def firstToUpper(str: String): String = {
    str.substring(0, 1).toUpperCase() + str.substring(1)
  }

  /**
   * helper string method (first character will be in upper case)
   */
  private def firstToLower(str: String): String = {
    str.substring(0, 1).toLowerCase() + str.substring(1)
  }
}