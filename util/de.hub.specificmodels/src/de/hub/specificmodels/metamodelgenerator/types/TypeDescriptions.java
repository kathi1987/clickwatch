package de.hub.specificmodels.metamodelgenerator.types;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EDataType;

public class TypeDescriptions {
	
	private Map<EDataType, TypeDescriptionImpl> typeDescriptions = new HashMap<EDataType, TypeDescriptionImpl>();
	private TypeDescriptionImpl root = null;

	public void addType(EDataType parent, EDataType type) {
		TypeDescriptionImpl parentTypeDescription = null;
		if (parent != null) {
			parentTypeDescription = typeDescriptions.get(parent);
		}
		TypeDescriptionImpl typeDescription = typeDescriptions.get(type);
		if (typeDescription == null) {	
			typeDescription = new TypeDescriptionImpl(type);
			typeDescriptions.put(type, typeDescription);	
		}
		if (parentTypeDescription != null) {
			parentTypeDescription.addChild(typeDescription);
		}
		
		if (parent == null) {
			this.root = typeDescription;
		}
	}
	
	public ITypeDescription getRoot() {
		return root;
	}
}
