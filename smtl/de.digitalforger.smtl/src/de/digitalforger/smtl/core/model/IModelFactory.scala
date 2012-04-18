package de.digitalforger.smtl.core.model

/**
 * The interface for a model factory
 */
trait IModelFactory {
	
  /**
   * 
   */
  def newModel(referenceModel: IReferenceModel): IModel
  
  /**
   * 
   */
  def getBuiltInResource(name : String) : IReferenceModel
  
  /**
   * 
   */
  def getMetametamodel() : IReferenceModel
  
  /**
   * 
   */
  def newReferenceModel() : IReferenceModel
}