package de.hub.clickwatch.main;

import com.google.inject.ImplementedBy;
import com.google.inject.Injector;

import de.hub.clickwatch.main.internal.InjectorProvider;

@ImplementedBy(InjectorProvider.class)
public interface IInjectorProvider {
	
	public Injector getInjector();
}
