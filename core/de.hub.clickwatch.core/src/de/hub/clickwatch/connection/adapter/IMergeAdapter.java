package de.hub.clickwatch.connection.adapter;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.connection.adapter.internal.MergeAdapter;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

@ImplementedBy(MergeAdapter.class)
public interface IMergeAdapter {

    public void merge(Node node);
    
    public void merge(Handler handler);
}
