package de.hub.specificmodels.metamodelgenerator;

import com.google.inject.Inject;
import com.google.inject.name.Named;

import de.hub.specificmodels.common.TargetId;


public class TargetClassId extends Namespace<TargetFeatureId> {
	
	public static class TargetClassIdProvider {
		@Inject
		@Named(MetaModelGenerator.COMMON_CLASS_PREFIX_NAME)
		private String commonClassPrefix = "";
		
		public TargetClassId create(TargetId targetId) {
			return new TargetClassId(targetId, commonClassPrefix);
		}
	}

	private final TargetId targetId;
	private final String className;
	
	private String collisionResolvedClassName;
	
	private String commonClassPrefix;

	private TargetClassId(TargetId targetId, String commonClassPrefix) {
		super();
		this.targetId = targetId;
		if (targetId.getTargetClassName().equals("")) {
			className = targetId.getSourceClass().getName();
		} else {
			className = targetId.getTargetClassName();
		}
		collisionResolvedClassName = className;
		this.commonClassPrefix = commonClassPrefix;
	}

	public String getName() {
		return collisionResolvedClassName;
	}

	@Override
	public String toString() {
		return collisionResolvedClassName;
	}
	
	public Object getHashableObject() {
		return toString();
	}

	@Override
	public void resolveCollisions() {
		if (!collidingElements.isEmpty()) {
			boolean stillColliding = false;
			collisionResolvedClassName = getFullQualifiedName();
			loop: for (NamedElement collidee: collidingElements) {
				if (((TargetClassId)collidee).getFullQualifiedName().equals(collisionResolvedClassName)) {
					stillColliding = true;
					break loop;
				}
			}

			if (stillColliding) {
				collisionResolvedClassName = getFullyQualifiedName();
			}
		}
	}
	
	private String getFullQualifiedName() {
		String result = getFullQualifiedName_rec();	
		if (result.startsWith(commonClassPrefix)) {
			return result.substring(commonClassPrefix.length());
		} else {
			return result;
		}
	}
	
	private String getFullyQualifiedName() {
		String result = getFullyQualifiedName_rec();	
		if (result.startsWith(commonClassPrefix)) {
			return result.substring(commonClassPrefix.length());
		} else {
			return result;
		}
	}
	
	private String getFullQualifiedName_rec() {
		String result = "";
		if (!targetId.getTargetClassName().equals("")) {
			TargetId iterator = targetId;
			while(iterator != null) {
				String parentName = iterator.getTargetClassName();
				if (parentName.equals("")) {
					parentName = iterator.getSourceClass().getName();
				}
				result = parentName + result;
				iterator = iterator.getParent();
			}
			return result;
		} else {
			return className;
		}
	}
	
	private String getFullyQualifiedName_rec() {
		String result = "";
		if (!targetId.getTargetClassName().equals("")) {
			TargetId iterator = targetId;
			while(iterator != null) {
				String parentName = iterator.getTargetClassName();
				parentName = iterator.getSourceClass().getName();
				result = parentName + result;
				iterator = iterator.getParent();
			}
			return result;
		} else {
			return className;
		}
	}

	public TargetId getTargetId() {
		return targetId;
	}
	
}
