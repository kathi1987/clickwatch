package de.hub.clickwatch.analysis.results.ui;

import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.analysis.results.ResultsPlugin;
import de.hub.clickwatch.main.impl.ResultsProvider;

public class ResultsUIResultsProvider extends ResultsProvider {

	@Override
	public void initialize(IConfigurationElement configurationElement,
			EObject selection) {
		super.initialize(ResultsPlugin.getInstance().getResults());
	}

}
