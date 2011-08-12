package de.hub.clickwatch.main;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.main.impl.ExperimentProvider;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.recoder.cwdatabase.DataBase;
import de.hub.clickwatch.recoder.cwdatabase.ExperimentDescr;

@ImplementedBy(ExperimentProvider.class)
public interface IExperimentProvider {

	public DataBase getDataBase();
	
	public ExperimentDescr getExperiment();
	
	public Node[] getSelectedNodes();
	
}
