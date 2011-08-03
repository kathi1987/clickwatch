package de.hub.clickwatch.main.internal;

import java.util.ArrayList;
import java.util.List;

import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.ParseException;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import de.hub.clickwatch.main.IExperimentProvider;
import de.hub.clickwatch.recoder.cwdatabase.DataBase;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;
import de.hub.emfxml.XmlModelRepository;

public class ExperimentProvider implements IClickWatchContextAdapter, IExperimentProvider {
	
	private String experimentId = null;
	private URI dataBaseURI = null;
	
	private DataBase dataBase = null;
	private ExperimentDescr experiment = null;

	@Override
	public DataBase getDataBase() {
		if (dataBase == null) {
			if (dataBaseURI == null) {
				throw new IllegalArgumentException("no database given");
			}
			
			ResourceSet rs = new ResourceSetImpl();
			rs.getLoadOptions().putAll(XmlModelRepository.defaultLoadSaveOptions());
			Resource resource = rs.getResource(dataBaseURI, true);
			dataBase = (DataBase)resource.getContents().get(0);
		}
		
		return dataBase;
	}

	@Override
	public ExperimentDescr getExperiment() {
		DataBase database = getDataBase();
		if (experiment == null) {
			if (experimentId == null || experimentId.equals("")) {
				if (database.getExperiments().size() > 0) {
					experiment = database.getExperiments().get(0);
				}
			} else {			
				for (ExperimentDescr experimentInDB: database.getExperiments()) {
					if (experimentId.equals(experimentInDB.getName())) {
						experiment = experimentInDB;
					}
				}
			}
		} 
		return experiment;
	}

	@Override
	public List<Option> getCommandLineOptions() {
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("e", "experiment", true, "name of the experiment to be recorded, otherwise recorder uses the first experiment in db"));
		options.add(new Option("f", "db-file", true, "path to the .cwdatabase-file"));
		return options;
	}

	@Override
	public void initialize(CommandLine commandLine) throws ParseException {
		experimentId = commandLine.getOptionValue("e");
		if (commandLine.hasOption("f")) {
			dataBaseURI = URI.createFileURI(commandLine.getOptionValue("f"));
		}
	}
	
	public void initialize(URI dataBaseURI, String experimentId) {
		this.dataBaseURI = dataBaseURI;
		this.experimentId = experimentId;
	}

}
