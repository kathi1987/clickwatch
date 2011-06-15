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
import org.eclipse.graphiti.features.IDirectEditingInfo;
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

import de.hub.xveg.internal.configuration.DefaultEdgeFeatureConfigurationProvider;
import de.hub.xveg.internal.diagram.XvegFeatureProvider;
import de.hub.xveg.xvegfeaturemodel.EdgeFeature;
import de.hub.xveg.xvegfeaturemodel.StyleInfo;

public class AddEdgeFeature extends AbstractAddFeature {

	public AddEdgeFeature(IFeatureProvider fp) {
		super(fp);
	}

	public PictogramElement add(IAddContext context) {
		IAddConnectionContext addConContext = (IAddConnectionContext) context;
		EObject addedTransformation = (EObject) context.getNewObject();
		EdgeFeature feature = (EdgeFeature)((XvegFeatureProvider)getFeatureProvider()).getFeatureOfElement(addedTransformation);

		StyleInfo styleInfo = feature.getStyle();
		if (styleInfo == null) {
			styleInfo = DefaultStyle.INSTANCE;
		}
		
		IPeCreateService peCreateService = Graphiti.getPeCreateService();

		Connection connection = peCreateService
				.createFreeFormConnection(getDiagram());
		connection.setStart(addConContext.getSourceAnchor());
		connection.setEnd(addConContext.getTargetAnchor());

		IGaService gaService = Graphiti.getGaService();
		Polyline polyline = gaService.createPolyline(connection);
		
		polyline.setForeground(manageColor(DefaultStyle.createColorConstant(
				styleInfo.getLineColor(), DefaultStyle.SHAPE_FOREGROUND)));

		link(connection, addedTransformation);

		ConnectionDecorator textDecorator = peCreateService
				.createConnectionDecorator(connection, true, 0.5, true);
		Text text = gaService.createDefaultText(textDecorator);
		text.getFont().setSize(styleInfo.getFontSize());
		text.getFont().setBold(styleInfo.isBoldFont());
		text.setForeground(manageColor(DefaultStyle.createColorConstant(styleInfo.getTextColor(), DefaultStyle.TEXT_FOREGROUND)));
		gaService.setLocation(text, 10, 0);

		text.setValue(DefaultEdgeFeatureConfigurationProvider.INSTANCE
				.getLabelConfiguration(feature, addedTransformation).getLabel(
						feature, addedTransformation));

		link(textDecorator, addedTransformation);

		final IDirectEditingInfo directEditingInfo = getFeatureProvider()
				.getDirectEditingInfo();
		directEditingInfo.setMainPictogramElement(connection);
		directEditingInfo.setPictogramElement(textDecorator);
		directEditingInfo.setGraphicsAlgorithm(text);

		ConnectionDecorator cd;
		cd = peCreateService.createConnectionDecorator(connection, false, 1.0,
				true);
		createArrow(cd);

		return connection;
	}

	public boolean canAdd(IAddContext context) {
		return context instanceof IAddConnectionContext &&
				context.getNewObject() instanceof EObject &&
				((XvegFeatureProvider)getFeatureProvider()).getFeatureOfElement((EObject)context.getNewObject()) != null;
	}

	private Polyline createArrow(GraphicsAlgorithmContainer gaContainer) {
		return Graphiti.getGaCreateService().createPolyline(gaContainer,
				new int[] { -7, 4, 0, 0, -7, -4 });
	}
}
