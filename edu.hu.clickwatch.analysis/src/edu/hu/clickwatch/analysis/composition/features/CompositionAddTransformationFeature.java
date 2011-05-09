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
import org.eclipse.graphiti.features.context.IAddConnectionContext;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.impl.AbstractAddFeature;
import org.eclipse.graphiti.mm.GraphicsAlgorithmContainer;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.services.IPeCreateService;

import edu.hu.clickwatch.analysis.composition.StyleUtil;
import edu.hu.clickwatch.analysis.composition.model.Transformation;

public class CompositionAddTransformationFeature extends AbstractAddFeature {

	public CompositionAddTransformationFeature(IFeatureProvider fp) {
		super(fp);
	}

	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		Transformation addedTransformation = (Transformation) context.getNewObject();

		IPeCreateService peCreateService = Graphiti.getPeCreateService();
		// CONNECTION WITH POLYLINE
		Connection connection = peCreateService.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPolyline(connection);
		polyline.setStyle(StyleUtil.getStyleForEClass(getDiagram()));

		// create link and wire it
		link(connection, addedTransformation);

		// add dynamic text decorator for the reference name
		ConnectionDecorator textDecorator = peCreateService.createConnectionDecorator(connection, true, 0.5, true);
		Text text = gaService.createDefaultText(textDecorator);
		text.setStyle(StyleUtil.getStyleForEClassText((getDiagram())));
		gaService.setLocation(text, 10, 0);
		// set reference name in the text decorator
		Transformation transformation = (Transformation) context.getNewObject();
		text.setValue(transformation.getLabel());

		// add static graphical decorators (composition and navigable)
		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 1.0, true);
		createArrow(cd);
		//		cd = PeUtil.createConnectionDecorator(connection, false, 1.0, true);
		//		createRhombus(cd);

		return connection;
	}

	public boolean canAdd(IAddContext context) {
		// return true if given business object is an EReference
		// note, that the context must be an instance of IAddConnectionContext
		if (context instanceof IAddConnectionContext && context.getNewObject() instanceof Transformation) {
			return true;
		}
		return false;
	}

	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
		Polyline polyline = Graphiti.getGaCreateService().createPolyline(gaContainer, new int[] { -7, 4, 0, 0, -7, -4 });
		polyline.setStyle(StyleUtil.getStyleForEClass(getDiagram()));
		return polyline;
	}

	//	private Polygon createRhombus(GraphicsAlgorithmContainer gaContainer) {
	//		Polygon polygon = GaUtil.createPolygon(gaContainer, new int[] { 0, 0, -10, 10, -20, 0, -10, -10 });
	//		polygon.setForeground(manageColor(IColorConstant.BLACK));
	//		polygon.setBackground(manageColor(IColorConstant.BLACK));
	//		polygon.setLineWidth(2);
	//		return polygon;
	//	}
}
