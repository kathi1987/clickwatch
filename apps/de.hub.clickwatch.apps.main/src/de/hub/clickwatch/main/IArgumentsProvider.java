package de.hub.clickwatch.main;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.main.impl.ArgumentsProvider;

@ImplementedBy(ArgumentsProvider.class)
public interface IArgumentsProvider {

	public String[] getArguments();
}
