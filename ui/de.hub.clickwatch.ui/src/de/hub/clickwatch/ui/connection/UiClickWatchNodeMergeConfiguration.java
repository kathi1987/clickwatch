package de.hub.clickwatch.ui.connection;

import java.util.List;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.google.common.base.Preconditions;

import de.hub.clickwatch.merge.ClickWatchNodeMergeConfiguration;

public class UiClickWatchNodeMergeConfiguration extends ClickWatchNodeMergeConfiguration {

    private EditingDomain editingDomain;
    
    public void setEditingDomain(EditingDomain editingDomain) {
        this.editingDomain = editingDomain;
    }
    
    private void execute(Command command) {
        Preconditions.checkState(command.canExecute(), "clickwatch created a non executable command!");
        editingDomain.getCommandStack().execute(command);       
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void add(IContext context, List list, Object value) {
        execute(AddCommand.create(editingDomain, context.getContainer(), context.getFeature(), value));
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void add(IContext context, List list, int index, Object value) {
        execute(AddCommand.create(editingDomain, context.getContainer(), context.getFeature(), value, index));
    }

    @Override
    public void remove(IContext context, List<?> list, int index) {
        Object value = ((List<?>)context.getContainer().eGet(context.getFeature())).get(index);
        execute(RemoveCommand.create(editingDomain, context.getContainer(), context.getFeature(), value));
    }

    @SuppressWarnings("rawtypes")
    @Override
    public void set(IContext context, List list, int index, Object value) {
        execute(SetCommand.create(editingDomain, context.getContainer(), context.getFeature(), value, index));
    }

    @Override
    public void set(IContext context, Object value) {
        execute(SetCommand.create(editingDomain, context.getContainer(), context.getFeature(), value));
    }
    
        
}
