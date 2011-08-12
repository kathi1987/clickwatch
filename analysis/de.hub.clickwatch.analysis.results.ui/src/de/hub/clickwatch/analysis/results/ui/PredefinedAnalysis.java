package de.hub.clickwatch.analysis.results.ui;

import java.util.HashMap;

import org.eclipse.swt.SWT;
import org.eclipse.ui.menus.CommandContributionItem;
import org.eclipse.ui.menus.CommandContributionItemParameter;
import org.eclipse.ui.menus.ExtensionContributionFactory;
import org.eclipse.ui.menus.IContributionRoot;
import org.eclipse.ui.services.IServiceLocator;

import com.google.inject.Inject;

import de.hub.clickwatch.main.ClickWatchExtensionPointLauncher;

public class PredefinedAnalysis extends ExtensionContributionFactory {
	
	private static final String CommandId = "de.hub.clickwatch.analysis.results.ui.ExecuteMain";
	@Inject ClickWatchExtensionPointLauncher extensionPointLauncher;

	@Override
	public void createContributionItems(IServiceLocator serviceLocator,
			IContributionRoot additions) {
		for (String name: extensionPointLauncher.getExtensions().keySet()) {
			addCommand(serviceLocator, additions, name);
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
