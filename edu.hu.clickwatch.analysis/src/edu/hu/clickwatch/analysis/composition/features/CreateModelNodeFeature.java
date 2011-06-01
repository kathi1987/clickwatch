/*******************************************************************************
 * <copyright>
 *
 * Copyright (c) 2005, 2010 SAP AG.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 *
 * Contributors:
 *    SAP AG - initial API, implementation and documentation
 *
 * </copyright>
 *
 *******************************************************************************/
package edu.hu.clickwatch.analysis.composition.features;

import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICreateContext;

import edu.hu.clickwatch.analysis.composition.model.CompositionFactory;
import edu.hu.clickwatch.analysis.composition.model.Node;

public class CreateModelNodeFeature extends AbstractCreateNodeFeature {

	public CreateModelNodeFeature(IFeatureProvider fp) {
		// set name and description of the creation feature
		super(fp, "Model", "Create Model"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	@Override
	protected Node createNode(ICreateContext context) {
		Node result =  CompositionFactory.eINSTANCE.createModelNode();
		result.setLabel("Model");
		return result;
	}
}
