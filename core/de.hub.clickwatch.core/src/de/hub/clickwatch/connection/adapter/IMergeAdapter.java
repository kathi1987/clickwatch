package de.hub.clickwatch.connection.adapter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.connection.adapter.internal.MergeAdapter;
import de.hub.clickwatch.merge.Merger;
import de.hub.clickwatch.model.Handler;
import de.hub.clickwatch.model.Node;

@ImplementedBy(MergeAdapter.class)
public interface IMergeAdapter {

    public void merge(Node node);
    
    public void merge(Handler handler);
    
    public Merger getMerger();
    
    public boolean hasChanged(EObject object, EStructuralFeature feature);
    
    public boolean hasChanges();
    
    public void addChange(EObject object, EStructuralFeature feature);
    
    public void clearChanges();
}
