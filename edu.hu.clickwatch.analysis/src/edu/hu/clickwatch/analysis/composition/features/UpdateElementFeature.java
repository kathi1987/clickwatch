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
import org.eclipse.graphiti.features.IReason;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.impl.AbstractUpdateFeature;
import org.eclipse.graphiti.features.impl.Reason;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import edu.hu.clickwatch.analysis.composition.model.DataNode;
import edu.hu.clickwatch.analysis.composition.model.Element;

public class UpdateElementFeature extends AbstractUpdateFeature {

	public UpdateElementFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canUpdate(IUpdateContext context) {
		Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
		return (bo instanceof Element);
	}

	public IReason updateNeeded(IUpdateContext context) {
		String pictogramName = null;
		boolean isDataNode = false;
		boolean hasModel = false;
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			for (Shape shape : cs.getChildren()) {
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					pictogramName = text.getValue();
				} 
				if (shape.getGraphicsAlgorithm() instanceof Ellipse) {
					isDataNode = true;
					hasModel = ((Ellipse)shape.getGraphicsAlgorithm()).getTransparency() == 0;
				}
			}
		} else if (pictogramElement instanceof Connection) {
			Connection c = (Connection) pictogramElement;
			for (ConnectionDecorator decorator : c.getConnectionDecorators()) {
				if (decorator.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) decorator.getGraphicsAlgorithm();
					pictogramName = text.getValue();
				}
			}
		}

		String businessName = null;
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof Element) {
			Element element = (Element) bo;
			businessName = element.getLabel();
		}

		boolean updateNameNeeded = ((pictogramName == null && businessName != null) || (pictogramName != null && !pictogramName
				.equals(businessName)));
		if (updateNameNeeded) {
			return Reason.createTrueReason("Name is out of date"); //$NON-NLS-1$
		} else if (isDataNode && ((DataNode)bo).isHasData() != hasModel) {
			return Reason.createTrueReason("Model status is out of date"); //$NON-NLS-1$
		} else {
			return Reason.createFalseReason();
		}
	}

	public boolean update(IUpdateContext context) {
		String businessName = null;
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof Element) {
			Element element = (Element) bo;
			businessName = element.getLabel();
		}

		if (pictogramElement instanceof ContainerShape) {
			ContainerShape cs = (ContainerShape) pictogramElement;
			boolean hasChanged = false;
			for (Shape shape : cs.getChildren()) {				
				if (shape.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) shape.getGraphicsAlgorithm();
					text.setValue(businessName);
					hasChanged = true;
				}
				if (shape.getGraphicsAlgorithm() instanceof Ellipse) {
					Ellipse ellipse = (Ellipse) shape.getGraphicsAlgorithm();
					ellipse.setTransparency(((DataNode)bo).isHasData() ? 0.0: 1.0);
					hasChanged = true;
				}				
			}
			return hasChanged;
		} else if (pictogramElement instanceof Connection) {
			Connection c = (Connection)pictogramElement;
			for (ConnectionDecorator decorator: c.getConnectionDecorators()) {
				if (decorator.getGraphicsAlgorithm() instanceof Text) {
					Text text = (Text) decorator.getGraphicsAlgorithm();
					text.setValue(businessName);
					return true;
				}
			}
		}

		return false;
	}
}
