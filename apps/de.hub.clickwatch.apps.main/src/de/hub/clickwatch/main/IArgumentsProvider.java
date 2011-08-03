package de.hub.clickwatch.main;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.main.internal.ArgumentsProvider;

@ImplementedBy(ArgumentsProvider.class)
public interface IArgumentsProvider {

	public String[] getArguments();
}
