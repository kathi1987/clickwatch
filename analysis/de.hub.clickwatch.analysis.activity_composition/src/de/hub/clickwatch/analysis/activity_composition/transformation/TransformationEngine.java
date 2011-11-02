package de.hub.clickwatch.analysis.activity_composition.transformation;

import de.hub.clickwatch.analysis.activity_composition.model.Transformation;

/**
 * This class handles all actions needed to execute a given transformation
 * object
 * 
 * @author Lars George
 * 
 */
public class TransformationEngine {

	private Transformation transformation;

	/**
	 * ctor with needed transformation
	 * 
	 * @param transformation
	 *            the transfromation that is handled by this tansformation
	 *            engine
	 */
	public TransformationEngine(Transformation transformation) {
		this.transformation = transformation;
	}

	/**
	 * performs all actions to execute the transformation that is handled by
	 * this transformation engine
	 */
	public void executeTransformation() {

	}
}
