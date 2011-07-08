package de.hub.specificmodels.metamodelgenerator;

import java.lang.reflect.InvocationTargetException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.common.base.Preconditions;

import de.hub.specificmodels.metamodelgenerator.targetproperties.ITargetProperty;

/**
 * Represents a unique identifier in the target meta-model. The idea is that
 * each source model element (represented as {@link SourceObjectKey} is mapped
 * to such an identifier.
 * 
 * {@link TargetId}s are mapped to {@link ITargetMetaId}. {@link ITargetMetaId}s
 * represent elements in the target meta-model. If for two different
 * {@link TargetId} the same {@link ITargetMetaId}s are generated, there is an
 * collision.
 * 
 * Resolving this collisions will only affect {@link ITargetMetaId}s and not the
 * original {@link TargetId}s.
 */
public class TargetId {

	private final TargetId parent;

	private final EStructuralFeature sourceFeature;
	private final EClass sourceClass;

	private final String targetFeatureName;
	private final String targetClassName;
	
	private final Map<Class<? extends ITargetProperty>, ITargetProperty> properties = new HashMap<Class<? extends ITargetProperty>, ITargetProperty>();

	private Object hashId = null;

	public TargetId(TargetId parent, EStructuralFeature sourceFeature,
			EClass sourceClass, String targetFeatureName, String targetClassName) {
		super();
		this.parent = parent;
		this.sourceFeature = sourceFeature;
		this.sourceClass = sourceClass;
		this.targetFeatureName = targetFeatureName;
		this.targetClassName = targetClassName;
	}

	public TargetId(TargetId parent, EStructuralFeature sourceFeature,
			EClass sourceClass) {
		this(parent, sourceFeature, sourceClass, "", "");
	}

	public boolean hasFeature() {
		return sourceFeature != null;
	}

	public boolean hasClass() {
		return sourceClass != null;
	}

	public TargetId getParent() {
		return parent;
	}

	public EStructuralFeature getSourceFeature() {
		return sourceFeature;
	}

	public EClass getSourceClass() {
		return sourceClass;
	}

	public String getTargetFeatureName() {
		return targetFeatureName;
	}

	public String getTargetClassName() {
		return targetClassName;
	}

	@Override
	public int hashCode() {
		return getHashableId().hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		return ((TargetId) obj).getHashableId().equals(getHashableId());
	}

	private Object getHashableId() {
		if (hashId == null) {
			StringBuffer thisHashValue = new StringBuffer();
			if (!targetFeatureName.equals("")) {
				thisHashValue.append(targetFeatureName + "|");
			}
			if (sourceFeature != null) {
				thisHashValue.append(sourceFeature.getName());
				thisHashValue.append(":");
			}
			if (sourceClass != null) {
				if (!targetClassName.equals("")) {
					thisHashValue.append(targetClassName + "|");
				}
				thisHashValue.append(sourceClass.getName());
			}

			hashId = (parent == null) ? thisHashValue : parent.getHashableId()
					+ "/" + thisHashValue;
		}
		return hashId;
	}

	public String getTargetReferenceString() {
		return getHashableId().toString();
	}

	@Override
	public String toString() {
		return getHashableId().toString();
	}
	
	@SuppressWarnings("unchecked")
	public <T extends ITargetProperty> T getProperty(Class<T> propertyClass) {
		ITargetProperty result = properties.get(propertyClass);
		if (result == null) {
			try {
				result = propertyClass.getConstructor(new Class[]{}).newInstance(new Object[]{});
			} catch (Exception e) {
				Preconditions.checkState(false);
			}
			properties.put(propertyClass, result);
		}
		return (T)result;
	}

}
