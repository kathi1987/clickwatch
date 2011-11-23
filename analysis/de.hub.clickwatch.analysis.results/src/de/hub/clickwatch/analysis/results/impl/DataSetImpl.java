package de.hub.clickwatch.analysis.results.impl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.DataSet;

public class DataSetImpl implements DataSet {

    private final List<DataEntry> entries = new ArrayList<DataEntry>();
    
    private final class DataEntryImpl implements DataEntry {
        final Object[] values;
        
        public DataEntryImpl(Object[] values) {
            super();
            this.values = values;
        }

        @Override
        public Object[] getValues() {
            return values;
        }
        
    }
    
    @Override
    public List<DataEntry> getEntries() {
        return Collections.unmodifiableList(entries);
    }

    @Override
    public void add(Object... values) {
        entries.add(new DataEntryImpl(values));
    }

}
