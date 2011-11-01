package de.hub.clickwatch.analysis.activity_composition.contextmenu;

import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.tb.ContextMenuEntry;
import org.eclipse.graphiti.tb.DefaultToolBehaviorProvider;
import org.eclipse.graphiti.tb.IContextMenuEntry;

import de.hub.clickwatch.analysis.activity_composition.features.StartTransformationFeature;

public class ClickwatchToolBehaviourProvider extends
		DefaultToolBehaviorProvider {

	public ClickwatchToolBehaviourProvider(
			IDiagramTypeProvider diagramTypeProvider) {
		super(diagramTypeProvider);
		// TODO Auto-generated constructor stub
	}
	
	@Override
    public IContextMenuEntry[] getContextMenu(ICustomContext context) {
        // create a sub-menu for all custom features
        ContextMenuEntry subMenu = new ContextMenuEntry(null, context);
        subMenu.setText("Clickwatch");
        subMenu.setDescription("Clickwatch control menu");
        // display sub-menu hierarchical or flat
        subMenu.setSubmenu(true);
 
        // create a menu-entry in the sub-menu for each custom feature
        if (context instanceof ICustomContext) {
            ICustomContext customContext = (ICustomContext) context;
            ICustomFeature[] customFeatures = getClickwatchCustomFeatures(customContext);
            for (int i = 0; i < customFeatures.length; i++) {
                ICustomFeature customFeature = customFeatures[i];
                if (customFeature.isAvailable(customContext)) {
                    ContextMenuEntry menuEntry =
                        new ContextMenuEntry(customFeature, context);
                    subMenu.add(menuEntry);
                }
            }
        }
 
        IContextMenuEntry ret[] = new IContextMenuEntry[] { subMenu };
        return ret;
    }
	
	private ICustomFeature[] getClickwatchCustomFeatures(ICustomContext context) {
		return new ICustomFeature[] { new StartTransformationFeature(getFeatureProvider()) };
	}

}
