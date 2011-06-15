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
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.impl.AbstractDirectEditingFeature;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Text;
import org.eclipse.graphiti.mm.pictograms.ConnectionDecorator;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;

import de.hub.xveg.configuration.ILabelConfiguration;
import de.hub.xveg.internal.configuration.DefaultFeatureConfigurationProvider;
import de.hub.xveg.internal.diagram.XvegFeatureProvider;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;

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
		if (bo instanceof EObject && ga instanceof Text) {
			return ((XvegFeatureProvider)getFeatureProvider()).getFeatureOfElement((EObject)bo) != null;
		}
		return false;
	}

	public String getInitialValue(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		EObject node = (EObject) getBusinessObjectForPictogramElement(pe);

		return getLabelConfiguration(node).getLabel(getFeature(node), node);
	}
	
	private XvegFeature getFeature(EObject object) {
		return ((XvegFeatureProvider) getFeatureProvider())
				.getFeatureOfElement(object);
	}
	
	private ILabelConfiguration<EObject> getLabelConfiguration(EObject object) {
		return DefaultFeatureConfigurationProvider.INSTANCE.getLabelConfiguration(getFeature(object), object);
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
		EObject node = (EObject) getBusinessObjectForPictogramElement(pe);
		getLabelConfiguration(node).setLabel(getFeature(node), node, value);
		if (pe instanceof Shape) {
			updatePictogramElement(((Shape) pe).getContainer());
		} else if (pe instanceof ConnectionDecorator) {
			updatePictogramElement(((ConnectionDecorator) pe).getConnection());
		}
	}
}
