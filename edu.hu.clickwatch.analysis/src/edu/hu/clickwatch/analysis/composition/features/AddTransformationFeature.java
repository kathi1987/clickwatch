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

import org.eclipse.graphiti.features.IDirectEditingInfo;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import edu.hu.clickwatch.analysis.composition.Style;
import edu.hu.clickwatch.analysis.composition.model.MappedTransformation;
import edu.hu.clickwatch.analysis.composition.model.TimedTransformation;
import edu.hu.clickwatch.analysis.composition.model.Transformation;

public class AddTransformationFeature extends AbstractAddFeature {

	private static final int MAPPED_TRANSITION_DECORATOR_SIZE = 10;

	public AddTransformationFeature(IFeatureProvider fp) {
		super(fp);
	}

	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		Transformation addedTransformation = (Transformation) context.getNewObject();

		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		Connection connection = peCreateService.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPolyline(connection);
		polyline.setForeground(manageColor(Style.SHAPE_FOREGROUND));
		if (addedTransformation instanceof TimedTransformation) {
			polyline.setLineStyle(LineStyle.DASHDOT);
		}

		// create link and wire it
		link(connection, addedTransformation);

		ConnectionDecorator textDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
		Text text = gaService.createDefaultText(textDecorator);
		text.getFont().setSize(12);
		text.setForeground(manageColor(Style.TEXT_FOREGROUND));
		gaService.setLocation(text, 10, 0);
		Transformation transformation = (Transformation) context.getNewObject();
		text.setValue(transformation.getLabel());
		
		link(textDecorator, addedTransformation);		

		final IDirectEditingInfo directEditingInfo = getFeatureProvider().getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(connection);
		directEditingInfo.setPictogramElement(textDecorator);
		directEditingInfo.setGraphicsAlgorithm(text);

		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
		createArrow(cd);
		
		if (transformation instanceof MappedTransformation) {
			cd = peCreateService.createConnectionDecorator(connection, false, 0, true);
			createCircle(cd).setForeground(manageColor(Style.SHAPE_FOREGROUND));
		}
		
		return connection;
	}

	public boolean canAdd(IAddContext context) {
		if (context instanceof IAddConnectionContext && context.getNewObject() instanceof Transformation) {
			return true;
		}
		return false;
	}

	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
		return Graphiti.getGaCreateService().createPolyline(gaContainer, new int[] { -7, 4, 0, 0, -7, -4 });
	}

	private Ellipse createCircle(GraphicsAlgorithmContainer gaContainer) {
		IGaService gaService = Graphiti.getGaService();
		Ellipse ellipse = gaService.createEllipse(gaContainer);
		ellipse.setFilled(true);
		gaService.setLocationAndSize(ellipse, 0, 0, MAPPED_TRANSITION_DECORATOR_SIZE, MAPPED_TRANSITION_DECORATOR_SIZE);
		return ellipse;
	}
}
