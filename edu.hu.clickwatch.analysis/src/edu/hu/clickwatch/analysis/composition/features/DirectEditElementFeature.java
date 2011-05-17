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
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import edu.hu.clickwatch.analysis.composition.model.Element;
import edu.hu.clickwatch.analysis.composition.model.Node;

public class DirectEditElementFeature extends AbstractDirectEditingFeature {

	public DirectEditElementFeature(IFeatureProvider fp) {
		super(fp);
	}

	public int getEditingType() {
		return TYPE_TEXT;
	}

	@Override
	public boolean canDirectEdit(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		GraphicsAlgorithm ga = context.getGraphicsAlgorithm();
		if (bo instanceof Element && ga instanceof Text) {
			return true;
		}
		return false;
	}

	public String getInitialValue(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Node node = (Node) getBusinessObjectForPictogramElement(pe);
		return node.getLabel();
	}

	@Override
	public String checkValueValid(String value, IDirectEditingContext context) {
		if (value.length() < 1)
			return "Please enter any text as element name."; //$NON-NLS-1$
		if (value.contains(" ")) //$NON-NLS-1$
			return "Spaces are not allowed in element names."; //$NON-NLS-1$
		if (value.contains("\n")) //$NON-NLS-1$
			return "Line breakes are not allowed in element names."; //$NON-NLS-1$

		return null;
	}

	public void setValue(String value, IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Node node = (Node) getBusinessObjectForPictogramElement(pe);
		node.setLabel(value);
		if (pe instanceof Shape) {
			updatePictogramElement(((Shape)pe).getContainer());
		} else if (pe instanceof ConnectionDecorator) {
			updatePictogramElement(((ConnectionDecorator)pe).getConnection());
		}
	}
}
