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
import org.eclipse.graphiti.examples.common.ExampleUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import de.hub.xveg.configuration.ILabelConfiguration;
import de.hub.xveg.internal.configuration.DefaultFeatureConfigurationProvider;
import de.hub.xveg.internal.diagram.XvegFeatureProvider;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;

public class RenameElementFeature extends AbstractCustomFeature {

	public RenameElementFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public String getName() {
		return "Re-label element"; //$NON-NLS-1$
	}

	@Override
	public String getDescription() {
		return "Change the label of the element"; //$NON-NLS-1$
	}

	@Override
	public boolean canExecute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			return bo instanceof EObject && getFeature(bo) != null;
		}
		return false;
	}

	private XvegFeature getFeature(Object object) {
		return ((XvegFeatureProvider)getFeatureProvider()).getFeatureOfElement((EObject)object);
	}

	public void execute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			EObject bo = (EObject)getBusinessObjectForPictogramElement(pes[0]);
			XvegFeature feature = getFeature(bo);
			ILabelConfiguration<EObject> configuration = DefaultFeatureConfigurationProvider.INSTANCE.getLabelConfiguration(feature, bo); 
			
			String currentLabel = configuration.getLabel(feature, bo); 
			String newName = ExampleUtil.askString(getName(), getDescription(), currentLabel);
			if (newName != null) {
				configuration.setLabel(feature, bo, newName);
			}			
		}
	}
}
