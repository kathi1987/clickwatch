package de.hub.clickwatch.connection.adapter.internal;

import java.util.Collection;
import java.util.HashSet;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.inject.Inject;

import de.hub.clickwatch.connection.adapter.IMergeAdapter;
import de.hub.clickwatch.merge.Merger;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;
import de.hub.clickwatch.util.ILogger;

public class MergeAdapter extends AbstractAdapter implements IMergeAdapter {

    @Inject private ILogger logger;
    @Inject private Merger merger;
    private Collection<Change> changes = new HashSet<MergeAdapter.Change>();

    @Override
    public void merge(Node node) {
        logger.log(ILogger.DEBUG, "Merge a node into the node.", null);
        merger.merge(connection.getNode(), node);
    }

    @Override
    public void merge(Handler handler) {
        Handler oldHandler = connection.getNode().getHandler(handler.getQualifiedName());
        if (oldHandler != null) {
            merger.merge(oldHandler, handler);
        }
    }
    
    @Override
    public Merger getMerger() {
        return merger;
    }

    private static class Change {
        private final EObject object;
        private final String featureName;
        public Change(EObject object, EStructuralFeature feature) {
            super();
            this.object = object;
            this.featureName = feature.getName();
        }
        @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + ((featureName == null) ? 0 : featureName.hashCode());
            result = prime * result + ((object == null) ? 0 : object.hashCode());
            return result;
        }
        @Override
        public boolean equals(Object obj) {
            if (this == obj)
                return true;
            if (obj == null)
                return false;
            if (getClass() != obj.getClass())
                return false;
            Change other = (Change)obj;
            if (featureName == null) {
                if (other.featureName != null)
                    return false;
            } else if (!featureName.equals(other.featureName))
                return false;
            if (object == null) {
                if (other.object != null)
                    return false;
            } else if (!object.equals(other.object))
                return false;
            return true;
        }
    }

    @Override
    public boolean hasChanged(EObject object, EStructuralFeature feature) {
        return changes.contains(new Change(object, feature));
    }

    @Override
    public void addChange(EObject object, EStructuralFeature feature) {
        changes.add(new Change(object, feature));
    }

    @Override
    public void clearChanges() {
        changes.clear();
    }

    @Override
    public boolean hasChanges() {
        return changes.isEmpty();
    }
    
    
}
