package de.hub.specificmodels.metamodelgenerator;

import java.util.ArrayList;
import java.util.Collection;


public class TargetClassId implements ITargetMetaId<TargetClassId> {

	private final TargetId targetId;
	private final String className;
	private String collisionResolvedClassName;
	private Collection<TargetClassId> collisions = new ArrayList<TargetClassId>();
	
	public static TargetClassId create(TargetId targetId) {
		return new TargetClassId(targetId);
	}

	private TargetClassId(TargetId targetId) {
		super();
		this.targetId = targetId;
		if (targetId.getTargetClassName().equals("")) {
			className = targetId.getSourceClass().getName();
		} else {
			className = targetId.getTargetClassName();
		}
		collisionResolvedClassName = className;
	}

	public String getClassName() {
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
	public void addCollision(TargetClassId collidee) {
		collisions.add(collidee);
	}

	@Override
	public void resolveCollisions() {
		if (!collisions.isEmpty()) {
			boolean stillColliding = false;
			collisionResolvedClassName = getFullQualifiedName();
			loop: for (TargetClassId collidee: collisions) {
				if (collidee.getFullQualifiedName().equals(collisionResolvedClassName)) {
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
	
	private String getFullyQualifiedName() {
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

	@Override
	public Object hashableRep() {
		return toString();
	}
	
}
