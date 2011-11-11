package de.hub.clickwatch.connection.adapter.internal;

import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import de.hub.clickwatch.connection.adapter.IEditingDomainAdapter;

public class EditingDomainAdapter extends AbstractAdapter implements IEditingDomainAdapter {

    private EditingDomain editingDomain = null;

    public void setEditingDomain(EditingDomain editingDomain) {
        this.editingDomain = editingDomain;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void add(EObject object, EStructuralFeature feature, Object value) {
        if (editingDomain != null) {
            editingDomain.getCommandStack().execute(
                    AddCommand.create(editingDomain, object, feature, value));
        } else {
            ((List)object.eGet(feature)).add(value);
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void add(EObject object, EStructuralFeature feature, Object value, int index) {
        if (editingDomain != null) {
            editingDomain.getCommandStack().execute(
                    AddCommand.create(editingDomain, object, feature, value, index));
        } else {
            ((List)object.eGet(feature)).add(index, value);
        }
    }

    @Override
    public void set(EObject object, EStructuralFeature feature, Object value) {
        if (editingDomain != null) {
            editingDomain.getCommandStack().execute(
                    SetCommand.create(editingDomain, object, feature, value));
        } else {
            object.eSet(feature, value);
        }
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    @Override
    public void set(EObject object, EStructuralFeature feature, Object value, int index) {
        if (editingDomain != null) {
            editingDomain.getCommandStack().execute(
                    SetCommand.create(editingDomain, object, feature, value, index));
        } else {
            ((List)object.eGet(feature)).set(index, value);
        }
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void remove(EObject object, EStructuralFeature feature, Object value) {
        if (editingDomain != null) {
            editingDomain.getCommandStack().execute(
                    RemoveCommand.create(editingDomain, object, feature, value));
        } else {
            ((List)object.eGet(feature)).remove(value);
        }
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void remove(EObject object, EStructuralFeature feature, int index) {
        if (editingDomain != null) {
            Object value = ((List)object.eGet(feature)).get(index);
            editingDomain.getCommandStack().execute(
                    RemoveCommand.create(editingDomain, object, feature, value));
        } else {
            ((List)object.eGet(feature)).remove(index);
        }
    }

    @Override
    public void remove(EObject object, EStructuralFeature feature) {        
        if (editingDomain != null) {
            editingDomain.getCommandStack().execute(
                    SetCommand.create(editingDomain, object, feature, null));
        } else {
            object.eUnset(feature);
        }
    }
}
