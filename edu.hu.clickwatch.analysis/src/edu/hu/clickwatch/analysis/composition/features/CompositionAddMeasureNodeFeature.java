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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;

import edu.hu.clickwatch.analysis.composition.StyleUtil;
import edu.hu.clickwatch.analysis.composition.model.CompositionPackage;

public class CompositionAddMeasureNodeFeature extends AbstractAddNodeFeature {

	public static final int CIRCLE_SIZE = 30;

	public CompositionAddMeasureNodeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected EClass objectClassThatCanBeAdded() {
		return CompositionPackage.eINSTANCE.getMeasureNode();
	}

	@Override
	protected GraphicsAlgorithm addSpecifics(IAddContext context,
			ContainerShape containerShape) {
		final IGaService gaService = Graphiti.getGaService();
		
		// create invisible outer rectangle expanded by
		// the width needed for the anchor
		final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
		gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), 
				CIRCLE_SIZE + INVISIBLE_RECT_RIGHT, CIRCLE_SIZE);

		// create and set visible rectangle inside invisible rectangle
		Ellipse ellipse = gaService.createEllipse(invisibleRectangle);
		ellipse.setFilled(true);
		ellipse.setParentGraphicsAlgorithm(invisibleRectangle);
		ellipse.setStyle(StyleUtil.getStyleForEClass(getDiagram()));
		gaService.setLocationAndSize(ellipse, 0, 0, CIRCLE_SIZE, CIRCLE_SIZE);
		
		return ellipse;
	}
}
