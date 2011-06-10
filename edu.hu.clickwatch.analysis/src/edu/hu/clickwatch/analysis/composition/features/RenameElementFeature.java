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

import org.eclipse.graphiti.examples.common.ExampleUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.custom.AbstractCustomFeature;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;

import edu.hu.clickwatch.analysis.composition.model.Element;

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
		boolean ret = false;
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			if (bo instanceof Element) {
				ret = true;
			}
		}
		return ret;
	}

	public void execute(ICustomContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes != null && pes.length == 1) {
			Object bo = getBusinessObjectForPictogramElement(pes[0]);
			if (bo instanceof Element) {
				Element element = (Element) bo;
				String currentLabel = element.getLabel();
				// ask user for a new class name
				String newLabel = ExampleUtil.askString(getName(), getDescription(), currentLabel);
				if (newLabel != null) {
					element.setLabel(newLabel);
				}
			}
		}
	}
}
