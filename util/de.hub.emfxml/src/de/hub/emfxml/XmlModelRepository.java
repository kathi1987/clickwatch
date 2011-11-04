package de.hub.emfxml;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EcorePackage;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.xsd.XSDComplexTypeDefinition;
import org.eclipse.xsd.XSDNamedComponent;
import org.eclipse.xsd.XSDSchema;
import org.eclipse.xsd.ecore.XSDEcoreBuilder;

import com.google.common.base.Preconditions;
import com.google.inject.Singleton;

import de.hub.emfxml.util.EmfXmlUtil;

@Singleton
public class XmlModelRepository {
	
	private ResourceSet resourceSet = EmfXmlUtil.createResourceSet();
	private Map<URI, EPackage> metaModels = new HashMap<URI, EPackage>();
	
	public XSDSchema loadXSD(URI uri, String xsd) {
		return EmfXmlUtil.load(resourceSet, uri, xsd, XSDSchema.class);
	}
	
	public synchronized EPackage loadMetaModelFromXSD(URI xsdUri, String xsdStr) {
		EPackage result = metaModels.get(xsdUri);
		if (result == null) {
			XSDSchema xsd = loadXSD(xsdUri, xsdStr);	
		
			Iterator<EObject> xsd_it = xsd.eAllContents();
			while (xsd_it.hasNext()) {
				EObject next = xsd_it.next();
				if (next instanceof XSDComplexTypeDefinition) {
					XSDComplexTypeDefinition complexTypeDefinition = (XSDComplexTypeDefinition)next;
					if (complexTypeDefinition.getName() == null) {
						EObject container = complexTypeDefinition.eContainer();
						if (container instanceof XSDNamedComponent) {
							String name = ((XSDNamedComponent)container).getName();
							if (name != null) {
								complexTypeDefinition.setName(name);
								complexTypeDefinition.getElement().setAttributeNS(EcorePackage.eNS_URI, "name", name);
							} else {
								String alias = ((XSDNamedComponent)container).getAliasName();
								if (!alias.contains("_._")) {
									complexTypeDefinition.setName(alias);
									complexTypeDefinition.getElement().setAttributeNS(EcorePackage.eNS_URI, "name", alias);
								}
							}
						}
					}
				}
			}
			
			XSDEcoreBuilder xsdEcoreBuilder = new XSDEcoreBuilder();
			xsdEcoreBuilder.generate(xsd);
			Collection<EPackage> values = xsdEcoreBuilder.getTargetNamespaceToEPackageMap().values();
			Preconditions.checkState(values.size() == 1);
			result = values.iterator().next();
			
			result.setNsURI(xsdUri.toString());
			metaModels.put(xsdUri, result);
		} 
		return result;		
	}
}
