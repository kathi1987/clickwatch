package de.hub.clickwatch.analysis.results.ui;

import java.util.HashMap;
import java.util.Map;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.jface.viewers.ISelection;
import org.eclipse.jface.viewers.IStructuredSelection;
import org.eclipse.swt.SWT;
import org.eclipse.ui.ISelectionService;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;

import com.google.inject.Inject;

import de.hub.clickwatch.main.ClickWatchExtensionPointLauncher;
import de.hub.clickwatch.util.ILogger;

public class PredefinedAnalysis extends ExtensionContributionFactory {
	
	private static final String CommandId = "de.hub.clickwatch.analysis.results.ui.ExecuteMain";
	@Inject ClickWatchExtensionPointLauncher extensionPointLauncher;
	@Inject ILogger logger;

	@Override
	public void createContributionItems(IServiceLocator serviceLocator,
			IContributionRoot additions) {
	    
	    ISelectionService service = (ISelectionService)serviceLocator.getService(ISelectionService.class);
        ISelection selection = service.getSelection();
        if (selection instanceof IStructuredSelection) {
            // TODO check for all elements in the selection
            Object selectedObject = ((IStructuredSelection)selection).getFirstElement();            
    		Map<String, IConfigurationElement> extensions = extensionPointLauncher.getExtensions();
            for (String name: extensions.keySet()) {
    		    IConfigurationElement extension = extensions.get(name);
    		    String enableFor = extension.getAttribute("enableFor");
                if (enableFor != null) {
                    try {
                        Class<?> enableForClass = Thread.currentThread().getContextClassLoader().loadClass(enableFor);
                        if (enableForClass.isAssignableFrom(selectedObject.getClass())) {
                            addCommand(serviceLocator, additions, name);    
                        }
                    } catch (ClassNotFoundException e) {
                        logger.log(ILogger.WARNING, "enablefor class " + enableFor + " could not found.", e);
                    }
                } else {                    
                    addCommand(serviceLocator, additions, name);
                }
    		}		
        }
	}

	@SuppressWarnings({ "unchecked" })
	private void addCommand(IServiceLocator serviceLocator, IContributionRoot additions, String id) {
		CommandContributionItemParameter p = new CommandContributionItemParameter(
				serviceLocator, id, CommandId, SWT.PUSH);
		p.label = id;
		if (p.parameters == null) {
			p.parameters = new HashMap<Object, Object>();
		}
		p.parameters.put("id", id);

		CommandContributionItem item = new CommandContributionItem(p);
		item.setVisible(true);
		additions.addContributionItem(item, null);
	}
}
