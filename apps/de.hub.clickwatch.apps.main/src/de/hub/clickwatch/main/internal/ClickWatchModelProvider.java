package de.hub.clickwatch.main.internal;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMLResource;

import de.hub.clickwatch.main.IClickWatchModelProvider;

public class ClickWatchModelProvider implements IClickWatchContextAdapter,
		IClickWatchModelProvider {

	private URI clickWatchModel = null;
	private EObject clickWatchObject = null;

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
		clickWatchModel = URI.createPlatformResourceURI(commandLine.getOptionValue("uri"), true);
		
		ResourceSet resourceSet = new ResourceSetImpl();
		resourceSet.getLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA,
				Boolean.TRUE);
		Resource modelResource = resourceSet.getResource(
				URI.createFileURI(commandLine.getOptionValue("obj")), true);
		clickWatchObject = modelResource.getContents().get(0);
	}
	
	public void initialize(URI clickWatchModel, EObject clickWatchObject)
	{
		this.clickWatchModel = clickWatchModel;
		this.clickWatchObject = clickWatchObject;
	}

	@Override
	public EObject getInputObject() {

		return clickWatchObject;
	}

}
