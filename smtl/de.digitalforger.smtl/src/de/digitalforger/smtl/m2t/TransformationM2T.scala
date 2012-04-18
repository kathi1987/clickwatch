package de.digitalforger.smtl.m2t

import scala.collection.JavaConversions.asScalaBuffer
import java.util.ArrayList
import scala.collection.mutable.HashSet
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.EObject
import de.digitalforger.smtl.core.ITransformation
import org.eclipse.emf.ecore.resource.Resource
import scala.collection.mutable.HashMap

class TransformationM2T extends ITransformation {

  private var generator: IM2TGenerator = null
 
  /**
   * @inheritDoc
   */
  override def from(fromMetaModelURI: String) = {
    super.from(fromMetaModelURI)
    this
  }
  
  /**
   * @inheritDoc
   */
  override def from(fromMetaModel: Resource) = {
    super.from(fromMetaModel)
    this
  }

  /**
   * @inheritDoc
   */
  override def in(loadFromFile: String) = {
    super.in(loadFromFile)
    this
  }

  /**
   * @inheritDoc
   */
  override def in(loadFromIterable: Iterable[_ <: EObject]) = {
    super.in(loadFromIterable)
    this
  }

  /**
   * sets the generator for this model to text transformation
   */
  def using(generator: IM2TGenerator) = {
    this.generator = generator
    this
  }

  /**
   * Performs this transformation
   */
  def execute(): Unit = {
    if (this.fromModel == null) {
      logger.error("No model to transform from is set")
      return
    }

    this.generator.generate(this.fromModel.getResource())
  }

}