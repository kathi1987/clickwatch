package de.hub.clickwatch.connection.adapter;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.connection.adapter.internal.EditingDomainAdapter;

@ImplementedBy(EditingDomainAdapter.class)
public interface IEditingDomainAdapter {
    
    public void setEditingDomain(EditingDomain editingDomain);

    public void add(EObject object, EStructuralFeature feature, Object value);
    
    public void add(EObject object, EStructuralFeature feature, Object value, int index);
    
    public void set(EObject object, EStructuralFeature feature, Object value);
    
    public void set(EObject object, EStructuralFeature feature, Object value, int index);
    
    public void remove(EObject object, EStructuralFeature feature, Object value);
    
    public void remove(EObject object, EStructuralFeature feature, int index);
    
    public void remove(EObject object, EStructuralFeature feature);
    
}
