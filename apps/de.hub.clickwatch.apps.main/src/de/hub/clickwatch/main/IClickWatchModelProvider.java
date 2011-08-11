package de.hub.clickwatch.main;

import org.eclipse.emf.ecore.EObject;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.main.impl.ClickWatchModelProvider;

@ImplementedBy(ClickWatchModelProvider.class)
public interface IClickWatchModelProvider {
	public EObject getInputObject();

}
