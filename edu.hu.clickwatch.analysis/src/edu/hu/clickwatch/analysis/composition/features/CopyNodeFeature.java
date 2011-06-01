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
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.AbstractCopyFeature;

import edu.hu.clickwatch.analysis.composition.model.Node;

public class CopyNodeFeature extends AbstractCopyFeature {

	public CopyNodeFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canCopy(ICopyContext context) {
		final PictogramElement[] pes = context.getPictogramElements();
		if (pes == null || pes.length == 0) { // nothing selected
			return false;
		}

		for (PictogramElement pe : pes) {
			final Object bo = getBusinessObjectForPictogramElement(pe);
			if (!(bo instanceof Node)) {
				return false;
			}
		}
		return true;
	}

	public void copy(ICopyContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		Object[] bos = new Object[pes.length];
		for (int i = 0; i < pes.length; i++) {
			PictogramElement pe = pes[i];
			bos[i] = getBusinessObjectForPictogramElement(pe);
		}

		putToClipboard(bos);
	}
}
