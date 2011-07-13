package de.hub.specificmodels.metamodelgenerator;

import com.google.common.base.Preconditions;

public class TargetFeatureId implements ITargetMetaId<TargetFeatureId> {

	private final TargetClassId classId;	
	private final TargetId targetId;
	private String featureName;
	
	private boolean hasCollision = false;
	
	public static TargetFeatureId create(TargetClassId parentClassId, TargetId targetId) {
		Preconditions.checkArgument(parentClassId != null);
		return new TargetFeatureId(parentClassId, targetId);
	}
	
	private TargetFeatureId(TargetClassId classId, TargetId targetId) {
		super();
		this.classId = classId;
		if (targetId.getTargetFeatureName().equals("")) {
			featureName = targetId.getSourceFeature().getName();
		} else {
			featureName = targetId.getTargetFeatureName();			
		}
		this.targetId = targetId;
	}

	public TargetClassId getClassId() {
		return classId;
	}

	public String getFeatureName() {
		return featureName;
	}

	@Override
	public String toString() {
		return classId.toString() + ":" + featureName;
	}

	@Override
	public void addCollision(TargetFeatureId collidee) {
		hasCollision = true;
	}

	@Override
	public void resolveCollisions() {
		if (hasCollision) {
			if (!targetId.getTargetFeatureName().equals("")) {
				featureName = targetId.getSourceFeature().getName() + featureName.substring(0, 1).toUpperCase() + featureName.substring(1);
			}
		}
	}

	@Override
	public Object hashableRep() {
		return toString();
	}

}
