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
import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.RoundedRectangle;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.Orientation;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import edu.hu.clickwatch.analysis.composition.StyleUtil;
import edu.hu.clickwatch.analysis.composition.model.CompositionPackage;
import edu.hu.clickwatch.analysis.composition.model.ModelNode;

public class CompositionAddModelNodeFeature extends AbstractAddNodeFeature {

	public CompositionAddModelNodeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	protected EClass objectClassThatCanBeAdded() {
		return CompositionPackage.eINSTANCE.getModelNode();
	}

	@Override
	protected GraphicsAlgorithm addSpecifics(final IAddContext context, final ContainerShape containerShape) {
		final ModelNode addedModelNode = (ModelNode) context.getNewObject();
		final IGaService gaService = Graphiti.getGaService();
		final IPeCreateService peCreateService = Graphiti.getPeCreateService();

		int width = context.getWidth() <= 0 ? 100 : context.getWidth();
		int height = context.getWidth() <= 0 ? 50 : context.getHeight();

		// create invisible outer rectangle expanded by
		// the width needed for the anchor
		final Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
		gaService.setLocationAndSize(invisibleRectangle, context.getX(), context.getY(), 
				width + INVISIBLE_RECT_RIGHT, height);

		// create and set visible rectangle inside invisible rectangle
		RoundedRectangle roundedRectangle = gaService.createRoundedRectangle(invisibleRectangle, 5, 5);
		roundedRectangle.setParentGraphicsAlgorithm(invisibleRectangle);
		roundedRectangle.setStyle(StyleUtil.getStyleForEClass(getDiagram()));
		gaService.setLocationAndSize(roundedRectangle, 0, 0, width, height);
		
		// SHAPE with text
		// create shape for text
		final Shape shape = peCreateService.createShape(containerShape, false);

		// create and set text graphics algorithm
		final Text text = gaService.createDefaultText(shape, addedModelNode.getLabel());
		text.setStyle(StyleUtil.getStyleForEClassText(getDiagram()));
		text.setHorizontalAlignment(Orientation.ALIGNMENT_CENTER);
		text.setVerticalAlignment(Orientation.ALIGNMENT_CENTER);
		text.getFont().setBold(true);
		gaService.setLocationAndSize(text, 0, 0, width, height);

		// provide information to support direct-editing directly
		// after object creation (must be activated additionally)
		final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		// set container shape for direct editing after object creation
		directEditingInfo.setMainPictogramElement(containerShape);
		// set shape and graphics algorithm where the editor for
		// direct editing shall be opened after object creation
		directEditingInfo.setPictogramElement(shape);
		directEditingInfo.setGraphicsAlgorithm(text);
		
		return roundedRectangle;
	}
}
