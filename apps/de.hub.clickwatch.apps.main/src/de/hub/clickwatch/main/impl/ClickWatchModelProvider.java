package de.hub.clickwatch.main.impl;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.core.runtime.IConfigurationElement;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.hub.clickwatch.main.IClickWatchContextAdapter;
import de.hub.clickwatch.main.IClickWatchModelProvider;
import de.hub.clickwatch.model.Network;
import de.hub.emfxml.util.EmfXmlUtil;

public class ClickWatchModelProvider implements IClickWatchContextAdapter,
		IClickWatchModelProvider {

	private EObject clickWatchObject = null;
	private Network network = null;

	@Override
	public List<Option> getCommandLineOptions() {
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("uri", "model-file", true,
				"path to the .clickwatchmodel-file"));

		options.add(new Option("obj", "use-object", true,
				"the object in the clickwatchmodel that should be used"));
		return options;
	}

	@Override
	public void initialize(CommandLine commandLine) throws ParseException {
		String objectURIFragment = null;
		URI clickWatchModel = null;
		if (commandLine.hasOption("uri")) {
			clickWatchModel = URI.createFileURI(commandLine.getOptionValue("uri"));
		}
		if (commandLine.hasOption("obj")) {
			objectURIFragment = commandLine.getOptionValue("obj");
		}
		
		if (clickWatchModel != null) {
			ResourceSet resourceSet = new ResourceSetImpl();
			resourceSet.getLoadOptions().putAll(EmfXmlUtil.defaultLoadSaveOptions());
			Resource modelResource = resourceSet.getResource(clickWatchModel, true);
			
			if (objectURIFragment != null) {
				clickWatchObject = modelResource.getEObject(objectURIFragment);
				EObject container = clickWatchObject;
				while (container != null && (!(container instanceof Network))) {
					container = container.eContainer();
				}
				if (container != null) {
					network = (Network)container;
				}
			} else {
				clickWatchObject = modelResource.getContents().get(0);
				network = (Network)modelResource.getContents().get(0);
			}
		}
	}
	
	public void initialize(URI clickWatchModel, EObject clickWatchObject) {
		this.clickWatchObject = clickWatchObject;
		loop: while (clickWatchObject != null) {
			if (clickWatchObject instanceof Network) {
				this.network = (Network)clickWatchObject;
				break loop;
			}
			clickWatchObject = clickWatchObject.eContainer();
		}
	}

	@Override
	public EObject getInputObject() {
		return clickWatchObject;
	}

	@Override
	public void initialize(IConfigurationElement configurationElement, EObject selection) {	    
		this.clickWatchObject = selection;
		if (selection instanceof Network) {
		    this.network = (Network)selection;
		}
	}

	@Override
	public Class<?> getAdpaterClass() {
		return IClickWatchModelProvider.class;
	}

	@Override
	public Network getNetwork() {
		return network;
	}
}
