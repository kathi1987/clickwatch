package de.hub.clickwatch.ui.connection;

import java.util.List;

import de.hub.clickwatch.connection.adapter.IEditingDomainAdapter;
import de.hub.clickwatch.merge.ClickWatchNodeMergeConfiguration;

public class UiClickWatchNodeMergeConfiguration extends ClickWatchNodeMergeConfiguration {

    private IEditingDomainAdapter eda;
    
    public void setEditingDomainAdapter(IEditingDomainAdapter eda) {
        this.eda = eda;
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void add(IContext context, List list, Object value) {
        eda.add(context.getContainer(), context.getFeature(), value);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void add(IContext context, List list, int index, Object value) {
        eda.add(context.getContainer(), context.getFeature(), value, index);
    }

    @Override
    public void remove(IContext context, List<?> list, int index) {
        eda.remove(context.getContainer(), context.getFeature(), index);
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void set(IContext context, List list, int index, Object value) {
        eda.set(context.getContainer(), context.getFeature(), value, index);
    }

    @Override
    public void set(IContext context, Object value) {
        eda.set(context.getContainer(), context.getFeature(), value);
    }       
}
