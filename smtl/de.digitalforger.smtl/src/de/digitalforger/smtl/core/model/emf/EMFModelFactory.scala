package de.digitalforger.smtl.core.model.emf

import java.io.IOException
import java.lang.Boolean
import java.util.Collections
import org.eclipse.emf.common.util.URI
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl
import org.eclipse.emf.ecore.resource.Resource
import org.eclipse.emf.ecore.resource.ResourceSet
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl
import org.eclipse.emf.ecore.xmi.impl.XMLParserPoolImpl
import org.eclipse.emf.ecore.xmi.XMLResource
import org.eclipse.emf.ecore.EcorePackage
import de.digitalforger.smtl.core.model.IModel
import de.digitalforger.smtl.core.model.IModelFactory
import de.digitalforger.smtl.core.model.IReferenceModel
import org.eclipse.emf.ecore.resource.impl.URIHandlerImpl
import org.eclipse.emf.ecore.resource.impl.ExtensibleURIConverterImpl

/**
 * The EMF implementation of the model factory
 */
class EMFModelFactory extends IModelFactory {

  private var resSet: ResourceSet = null
  private var metametaModel: EMFReferenceModel = null

  /**
   * the initial part (constructor)
   */
  val etfm = Resource.Factory.Registry.INSTANCE.getExtensionToFactoryMap()
  if (!etfm.containsKey("*")) {
    etfm.put("*", new XMIResourceFactoryImpl())
  }
  this.resSet = new ResourceSetImpl()
  var loadOptions = resSet.getLoadOptions()
  loadOptions.put(XMLResource.OPTION_DEFER_IDREF_RESOLUTION, Boolean.TRUE);
  loadOptions.put(XMLResource.OPTION_USE_PARSER_POOL, new XMLParserPoolImpl());

  /**
   * getter of the resource set
   *
   * @return
   * 	the resource set
   */
  def getResourceSet(): ResourceSet = { resSet }

  /**
   * @inheritDoc
   */
  override def newModel(referenceModel: IReferenceModel): IModel = {
    new EMFModel(referenceModel.asInstanceOf[EMFReferenceModel], this)
  }

  /**
   * @inheritDoc
   */
  override def getBuiltInResource(name: String): IReferenceModel = {
    val model = new EMFReferenceModel(getMetametamodel(), this)
    val url = classOf[EMFReferenceModel].getResource("resources/" + name)
    if (url == null) {
      throw new Exception("EMFModelFactory.BUILT_IN_NOT_FOUND")
    }
    var builtin = resSet.createResource(URI.createURI(name))
    try {
      builtin.load(url.openStream(), Collections.EMPTY_MAP)
    } catch {
      case e: IOException => throw new Exception("EMFModelFactory.BUILT_IN_NOT_FOUND")
    }

    model.setResource(builtin)
    model.register()
    model
  }

  override def newReferenceModel(): IReferenceModel = {
    new EMFReferenceModel(getMetametamodel(), this)
  }

  /**
   * @inheritDoc
   */
  override def getMetametamodel(): EMFReferenceModel = {
    if (metametaModel == null) {

      metametaModel = new EMFReferenceModel(null, this)
      metametaModel.setResource(EcorePackage.eINSTANCE.eResource())
      metametaModel.setReferenceModel(metametaModel)
      metametaModel.register();
    }

    metametaModel
  }
}