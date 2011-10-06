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
import org.eclipse.emf.ecore.resource.impl.ResourceImpl;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.hub.clickwatch.main.IClickWatchContextAdapter;
import de.hub.clickwatch.main.IRecordProvider;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recorder.database.cwdatabase.DataBase;
import de.hub.clickwatch.recorder.database.cwdatabase.Record;
import de.hub.emfxml.XmlModelRepository;

public class RecordProvider implements IClickWatchContextAdapter, IRecordProvider {
	
	private String recordId = null;
	private URI dataBaseURI = null;
	
	private DataBase dataBase = null;
	private Record record = null;
	private Node[] selectedNodes = null;

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
	public Record getRecord() {
		DataBase database = getDataBase();
		if (record == null) {
			if (recordId == null || recordId.equals("")) {
				if (database.getRecords().size() > 0) {
					record = database.getRecords().get(0);
				}
			} else {			
				if (recordId.startsWith("//@")) {
					record = (Record)getDataBase().eResource().getEObject(recordId);
				} else {
					for (Record recordInDB: database.getRecords()) {
						if (recordId.equals(recordInDB.getName())) {
							record = recordInDB;
						}
					}
				}
			}
		} 
		return record;
	}

	@Override
	public List<Option> getCommandLineOptions() {
		List<Option> options = new ArrayList<Option>();
		options.add(new Option("e", "record", true, "name of the record to be recorded, otherwise recorder uses the first record in db"));
		options.add(new Option("f", "db-file", true, "path to the .cwdatabase-file"));
		return options;
	}

	@Override
	public void initialize(CommandLine commandLine) throws ParseException {
		recordId = commandLine.getOptionValue("e");
		if (commandLine.hasOption("f")) {
			dataBaseURI = URI.createFileURI(commandLine.getOptionValue("f"));
		}
	}
	
	public void initialize(URI dataBaseURI, String recordId) {
		this.dataBaseURI = dataBaseURI;
		this.recordId = recordId;
	}

	@Override
	public void initialize(IConfigurationElement configurationElement, EObject selection) {
		while(selection != null) {
			if (selection instanceof DataBase) {
				this.dataBase = (DataBase)selection;
			} else if (selection instanceof Record) {
				this.record = (Record)selection;
			} else if (selection instanceof Node) {
				this.selectedNodes = new Node[]{(Node)selection};
			}
			selection = selection.eContainer();
		}
	}

	@Override
	public Class<?> getAdpaterClass() {
		return IRecordProvider.class;
	}

	public Node[] getSelectedNodes() {
		if (selectedNodes == null) {
			return getRecord().getConfiguration().getNodes().toArray(new Node[]{});
		}
		return selectedNodes;
	}
	
	
}
