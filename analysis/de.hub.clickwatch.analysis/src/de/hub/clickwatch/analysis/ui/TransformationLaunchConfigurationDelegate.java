package de.hub.clickwatch.analysis.ui;

import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.IProgressMonitor;
import org.eclipse.debug.core.ILaunch;
import org.eclipse.debug.core.ILaunchConfiguration;
import org.eclipse.debug.core.ILaunchManager;
import org.eclipse.debug.core.model.ILaunchConfigurationDelegate;

import de.hub.clickwatch.analysis.composition.model.CompositionFactory;
import de.hub.clickwatch.analysis.composition.model.ModelNode;
import de.hub.clickwatch.analysis.composition.model.ParameterSpec;
import de.hub.clickwatch.analysis.composition.model.ParameterSpecKind;
import de.hub.clickwatch.analysis.composition.model.TargetSpec;
import de.hub.clickwatch.analysis.composition.model.Transformation;
import de.hub.clickwatch.analysis.composition.model.TransformationKind;
import de.hub.clickwatch.analysis.composition.transformations.TransformationEngine;

/**
 * The delgate that is called upon the run of a transformation launch
 * configuration
 * 
 * @author Lars George
 * 
 */
public class TransformationLaunchConfigurationDelegate implements
		ILaunchConfigurationDelegate {

	@Override
	public void launch(ILaunchConfiguration configuration, String mode,
			ILaunch launch, IProgressMonitor monitor) throws CoreException {

		// RUN MODE
		if (mode.equals(ILaunchManager.RUN_MODE)) {
			String transformationFile = configuration.getAttribute(TransformationParametersTab.ATTR_TRANSFORMATION_FILE, "nix gefunden");
			
			Transformation transformation = CompositionFactory.eINSTANCE.createTransformation();
			transformation.setLabel("Transformation");
			transformation.setTransformationFunction("executeTransformation");
			transformation.setTransformationUri(transformationFile);
			transformation.setTargetSpec(TargetSpec.EXISTING);
			
			ModelNode sourceNode = CompositionFactory.eINSTANCE.createModelNode();
			sourceNode.setInferedType(true);
			sourceNode.setLabel("Source");			
			//sourceNode.setHasData(true);
			sourceNode.setModelResource("platform:/resource/de.hub.clickwatch.analysis.examples.composition/src/SeismoOutdoor.clickwatchmodel");
			sourceNode.setPersistent(true);
			
			ModelNode targetNode = CompositionFactory.eINSTANCE.createModelNode();
			
			transformation.setSource(sourceNode);
			transformation.setTarget(targetNode);
			
			ParameterSpec input = CompositionFactory.eINSTANCE.createParameterSpec();
			input.setKind(ParameterSpecKind.MAP);
			ParameterSpec output = CompositionFactory.eINSTANCE.createParameterSpec();
			output.setKind(ParameterSpecKind.MAP);
			transformation.setInput(input);
			transformation.setOutput(output);			
			
			
			if(transformationFile.endsWith(".xtend"))
				transformation.setKind(TransformationKind.XTEND2);
			else if(transformationFile.endsWith(".java"))
				transformation.setKind(TransformationKind.JAVA);						
			
			(new TransformationEngine(transformation)).executeTransformation();
			

		} else if (mode.equals(ILaunchManager.DEBUG_MODE)) {
			// TODO: implement debug mode handling

		}
	}

}
