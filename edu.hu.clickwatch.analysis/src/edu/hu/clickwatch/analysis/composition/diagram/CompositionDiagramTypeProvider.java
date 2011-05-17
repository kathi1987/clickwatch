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
package edu.hu.clickwatch.analysis.composition.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

public class CompositionDiagramTypeProvider extends AbstractDiagramTypeProvider {

    private IToolBehaviorProvider[] toolBehaviorProviders;

    public CompositionDiagramTypeProvider() {
        super();
        setFeatureProvider(new CompositionFeatureProvider(this));
    }

    @Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (toolBehaviorProviders == null) {
            toolBehaviorProviders =
                new IToolBehaviorProvider[] { new CompositionToolBehaviorProvider(
                    this) };
        }
        return toolBehaviorProviders;
    }

	@Override
	public boolean isAutoUpdateAtStartup() {
		return true;
	}
    
    
}
