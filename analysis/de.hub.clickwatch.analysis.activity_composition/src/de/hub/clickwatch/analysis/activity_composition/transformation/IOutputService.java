package de.hub.clickwatch.analysis.activity_composition.transformation;

import com.google.inject.ImplementedBy;

import de.hub.clickwatch.analysis.activity_composition.transformation.impl.DefaultOutputService;

@ImplementedBy(DefaultOutputService.class)
public interface IOutputService {

}
