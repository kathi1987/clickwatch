package de.hub.clickwatch.connection.adapter.internal;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.IMergeAdapter;
import de.hub.clickwatch.merge.Merger;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

public class MergeAdapter extends AbstractAdapter implements IMergeAdapter {

    @Inject private Merger merger;

    @Override
    public void merge(Node node) {
        merger.merge(connection.getNode(), node);
    }

    @Override
    public void merge(Handler handler) {
        Handler oldHandler = connection.getNode().getHandler(handler.getQualifiedName());
        if (oldHandler != null) {
            merger.merge(oldHandler, handler);
        } else {
            // TODO
        }
    }
    
}
