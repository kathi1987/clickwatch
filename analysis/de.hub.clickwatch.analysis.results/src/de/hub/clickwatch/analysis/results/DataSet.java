package de.hub.clickwatch.analysis.results;

import java.io.Serializable;
import java.util.List;

public interface DataSet extends Serializable {

	List<DataEntry> getEntries();
	
	void add(Object... values);

} 
