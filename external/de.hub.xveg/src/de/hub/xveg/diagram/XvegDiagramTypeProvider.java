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
package de.hub.xveg.diagram;

import org.eclipse.graphiti.dt.AbstractDiagramTypeProvider;
import org.eclipse.graphiti.tb.IToolBehaviorProvider;

import de.hub.xveg.internal.diagram.XvegFeatureProvider;
import de.hub.xveg.internal.diagram.XvegtToolBehaviorProvider;
import de.hub.xveg.xvegfeaturemodel.XvegDiagramType;

public abstract class XvegDiagramTypeProvider extends AbstractDiagramTypeProvider {

    private IToolBehaviorProvider[] toolBehaviorProviders;
    private final XvegDiagramType diagramType;

    public XvegDiagramTypeProvider() {
        super();
        this.diagramType = getDiagramType();
        setFeatureProvider(new XvegFeatureProvider(this, diagramType));
    }
    
    protected abstract XvegDiagramType getDiagramType();

    @Override
    public IToolBehaviorProvider[] getAvailableToolBehaviorProviders() {
        if (toolBehaviorProviders == null) {
            toolBehaviorProviders =
                new IToolBehaviorProvider[] { new XvegtToolBehaviorProvider(this, diagramType) };
        }
        return toolBehaviorProviders;
    }

	@Override
	public boolean isAutoUpdateAtStartup() {
		return true;
	}
    
}
