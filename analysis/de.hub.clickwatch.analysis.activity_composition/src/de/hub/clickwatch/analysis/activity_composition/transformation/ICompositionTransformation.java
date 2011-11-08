package de.hub.clickwatch.analysis.activity_composition.transformation;

/**
 * This interface is for transformations that should be used in an activity
 * composition diagram
 * 
 * @author Lars George
 * 
 */
public interface ICompositionTransformation {

	/**
	 * The main entrance for the transformation
	 * 
	 * @param inService 
	 * @param outService
	 */
	public void main(IInputService inService, IOutputService outService);

}
