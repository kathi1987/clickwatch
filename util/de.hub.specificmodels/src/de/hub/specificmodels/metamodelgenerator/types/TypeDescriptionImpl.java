package de.hub.specificmodels.metamodelgenerator.types;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.EcoreUtil;

import com.google.common.base.Preconditions;

public class TypeDescriptionImpl implements ITypeDescription {
	
	private final EDataType type;
	private final Collection<TypeDescriptionImpl> children = new ArrayList<TypeDescriptionImpl>();
	
	public TypeDescriptionImpl(EDataType type) {
		this.type = type;
	}
	
	protected void addChild(TypeDescriptionImpl child) {
		children.add(child);
	}

	@Override
	public boolean isOfType(String sample) {
		Preconditions.checkArgument(sample != null);
		Object value = null;
		try {
			value = EcoreUtil.createFromString(type, sample);
		} catch (Exception e) {
			return false;
		}
		
		return value != null;
	}

	@Override
	public EDataType getEType() {
		return type;
	}
	
	@Override
	public ITypeDescription smallestFittingChild(String sample, EClassifier restriction) {
		Set<ITypeDescription> result = new HashSet<ITypeDescription>();
		for (ITypeDescription child: children) {
			ITypeDescription smallestOfChild = child.smallestFittingChild(sample, restriction);
			if (smallestOfChild != null) {
				result.add(smallestOfChild);
			}
		}
		if (result.size() == 1) {
			if (this.type == restriction) {
				return this; 
			} else {
				return result.iterator().next();
			}
		} else if (result.size() > 1) {
			return this;
		} else {
			if (isOfType(sample)) {
				return this;
			} else {
				return null;
			}
		}
	}

}
