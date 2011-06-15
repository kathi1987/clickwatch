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
package de.hub.xveg.internal.features;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;

import de.hub.xveg.internal.configuration.DefaultEdgeFeatureConfigurationProvider;
import de.hub.xveg.internal.configuration.DefaultVertexConfigurationProvider;
import de.hub.xveg.internal.diagram.XvegFeatureProvider;
import de.hub.xveg.xvegfeaturemodel.EdgeFeature;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;

public class UpdateFeature extends AbstractUpdateFeature {

	public UpdateFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canUpdate(IUpdateContext context) {
		Object dslObject = getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return (dslObject instanceof EObject)
				&& getFeature(context) != null;
	}

	private XvegFeature getFeature(IUpdateContext context) {
		EObject dslObject = (EObject) getBusinessObjectForPictogramElement(context
				.getPictogramElement());
		return ((XvegFeatureProvider) getFeatureProvider())
				.getFeatureOfElement(dslObject);
	}

	public IReason updateNeeded(IUpdateContext context) {
		XvegFeature feature = getFeature(context);
		EObject dslObject = (EObject)getBusinessObjectForPictogramElement(context.getPictogramElement());
		if (feature instanceof VertexFeature) {
			return DefaultVertexConfigurationProvider.INSTANCE.getVertixGraphicsConfiguration((VertexFeature)feature, dslObject).updateGraphicsNeeded((VertexFeature)feature, context);
		} else if (feature instanceof EdgeFeature) {
			return DefaultEdgeFeatureConfigurationProvider.INSTANCE.getEdgeGraphicConfiguration((EdgeFeature)feature, dslObject).updateGraphicsNeeded((EdgeFeature)feature, context);
		} else {
			return Reason.createFalseReason();
		}
	}

	public boolean update(IUpdateContext context) {
		XvegFeature feature = getFeature(context);
		EObject dslObject = (EObject)getBusinessObjectForPictogramElement(context.getPictogramElement());
		if (feature instanceof VertexFeature) {
			return DefaultVertexConfigurationProvider.INSTANCE.getVertixGraphicsConfiguration((VertexFeature)feature, dslObject).updateGraphics((VertexFeature)feature, context);
		} else if (feature instanceof EdgeFeature) {
			return DefaultEdgeFeatureConfigurationProvider.INSTANCE.getEdgeGraphicConfiguration((EdgeFeature)feature, dslObject).updateGraphics((EdgeFeature)feature, context);
		} else {
			return false;
		}
	}
}
