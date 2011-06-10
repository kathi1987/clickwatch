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

import java.util.Iterator;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.impl.AbstractLayoutFeature;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import edu.hu.clickwatch.analysis.composition.model.ModelNode;

public class LayoutModelNodeFeature extends AbstractLayoutFeature {

	public LayoutModelNodeFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canLayout(ILayoutContext context) {
		PictogramElement pe = context.getPictogramElement();
		if (!(pe instanceof ContainerShape))
			return false;
		EList<EObject> businessObjects = pe.getLink().getBusinessObjects();
		return businessObjects.size() == 1 && businessObjects.get(0) instanceof ModelNode;
	}

	public boolean layout(ILayoutContext context) {
		IGaService gaService = Graphiti.getGaService();
		
		ContainerShape containerShape = (ContainerShape) context.getPictogramElement();
		GraphicsAlgorithm containerGa = containerShape.getGraphicsAlgorithm();
		
		int width = LayoutNodeHelper.getWidth(containerGa.getWidth());
		int height = LayoutNodeHelper.getHeight(containerGa.getHeight());
		
		Iterator<EObject> i = containerShape.eAllContents();
		while (i.hasNext()) {
			EObject next = i.next();
			if (next instanceof Ellipse) {				
				EList<EObject> businessObjects = context.getPictogramElement().getLink().getBusinessObjects();
				((Ellipse)next).setTransparency(((ModelNode)businessObjects.get(0)).isHasData() ? 0.0 : 1.0);
			} else if (next instanceof GraphicsAlgorithm) {
				GraphicsAlgorithm ga = (GraphicsAlgorithm)next;
				gaService.setWidth(ga, width);
				gaService.setHeight(ga, height);
			}
		}

		return LayoutNodeHelper.sizeHasChanges(width, height);
	}
}
