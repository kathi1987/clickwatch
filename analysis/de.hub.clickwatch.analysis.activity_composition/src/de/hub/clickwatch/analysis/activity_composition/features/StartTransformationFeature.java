package de.hub.clickwatch.analysis.activity_composition.features;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.examples.common.ExampleUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

public class StartTransformationFeature extends AbstractCustomFeature {

	private boolean hasDoneChanges = false;
	
	public StartTransformationFeature(IFeatureProvider fp) {
		super(fp);
		// TODO Auto-generated constructor stub
	}

    @Override
    public String getName() {
        return "Start transformation";
    }
 
    @Override
    public String getDescription() {
        return "Starts the transformation process";
    }
 
    @Override
    public boolean canExecute(ICustomContext context) {
        return true;
    }
 
    @Override
    public void execute(ICustomContext context) {
        System.out.println("starting the transformaiton now");
    }
 
    @Override
    public boolean hasDoneChanges() {
           return this.hasDoneChanges;
    }

}
