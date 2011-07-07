package de.hub.specificmodels.metamodelgenerator2;

import java.util.ArrayList;
import java.util.Collection;

public class TargetClassId implements ITargetMetaId<TargetClassId> {

	private final String className;
	private final Collection<TargetClassId> collisions = new ArrayList<TargetClassId>();
	
	public static TargetClassId create(TargetId targetId) {
		if (targetId.getTargetClassName().equals("")) {
			return new TargetClassId(targetId.getSourceClass().getName());
		} else {
			return new TargetClassId(targetId.getTargetClassName());
		}
	}

	private TargetClassId(String className) {
		super();
		this.className = className;
	}

	
	public String getClassName() {
		return className;
	}

	@Override
	public String toString() {
		return className;
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
			
		}
	}

	@Override
	public Object hashableRep() {
		return toString();
	}
	
}
