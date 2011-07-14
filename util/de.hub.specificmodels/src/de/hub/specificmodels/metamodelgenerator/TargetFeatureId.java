package de.hub.specificmodels.metamodelgenerator;

import com.google.common.base.Preconditions;

import de.hub.specificmodels.common.TargetId;

public class TargetFeatureId extends NamedElement {

	private final TargetClassId classId;	
	private final TargetId targetId;
	private String featureName;
	
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
		classId.addName(this);
	}

	public TargetClassId getClassId() {
		return classId;
	}

	public String getName() {
		return featureName;
	}

	@Override
	public String toString() {
		return classId.toString() + ":" + featureName;
	}

	@Override
	public void resolveCollisions() {
		if (!collidingElements.isEmpty()) {
			if (!targetId.getTargetFeatureName().equals("")) {
				featureName = targetId.getSourceFeature().getName() + featureName.substring(0, 1).toUpperCase() + featureName.substring(1);
			}
		}
	}

}
