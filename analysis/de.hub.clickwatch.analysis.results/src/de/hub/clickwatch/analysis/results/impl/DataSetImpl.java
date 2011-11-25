package de.hub.clickwatch.analysis.results.impl;

import java.util.ArrayList;
import java.util.List;

import de.hub.clickwatch.analysis.results.DataEntry;
import de.hub.clickwatch.analysis.results.DataSet;

public class DataSetImpl implements DataSet {

    private static final long serialVersionUID = 6444428264710252967L;
    private final List<DataEntry> entries = new ArrayList<DataEntry>();
    
    private final class DataEntryImpl implements DataEntry {
        private static final long serialVersionUID = -2353682881786480090L;
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
        return entries;
    }

    @Override
    public void add(Object... values) {
        entries.add(new DataEntryImpl(values));
    }

}
