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

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.hub.xveg.configuration.IVertexGraphicConfiguration;
import de.hub.xveg.internal.configuration.DefaultVertexConfigurationProvider;
import de.hub.xveg.internal.diagram.XvegFeatureProvider;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;

public class LayoutVertexFeature extends AbstractLayoutFeature {

	public LayoutVertexFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canLayout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1
				&& businessObjects.get(0) instanceof EObject
				&& ((XvegFeatureProvider) getFeatureProvider())
						.getFeatureOfElement((EObject) businessObjects.get(0)) != null
				&& ((XvegFeatureProvider) getFeatureProvider())
						.getFeatureOfElement((EObject) businessObjects.get(0)) instanceof VertexFeature;
	}

	public boolean layout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		EObject bo = (EObject) businessObjects.get(0);
		VertexFeature feature = (VertexFeature) ((XvegFeatureProvider) getFeatureProvider())
				.getFeatureOfElement(bo);

		IVertexGraphicConfiguration configuration = DefaultVertexConfigurationProvider.INSTANCE
				.getVertixGraphicsConfiguration(feature, bo);
		return configuration.layoutGraphics(feature, context);
	}
}
