package de.hub.specificmodels.metamodelgenerator2;

import com.google.common.base.Preconditions;

public class TargetFeatureId implements ITargetMetaId<TargetFeatureId> {

	private final TargetClassId classId;
	private final String featureName;
	
	public static TargetFeatureId create(TargetClassId parentClassId, TargetId targetId) {
		Preconditions.checkArgument(parentClassId != null);
		if (targetId.getTargetFeatureName().equals("")) {
			return new TargetFeatureId(parentClassId, targetId.getSourceFeature().getName());
		} else {
			return new TargetFeatureId(parentClassId, targetId.getTargetFeatureName());			
		}
	}
	
	private TargetFeatureId(TargetClassId classId, String featureName) {
		super();
		this.classId = classId;
		this.featureName = featureName;
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
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resolveCollisions() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Object hashableRep() {
		return toString();
	}

}
