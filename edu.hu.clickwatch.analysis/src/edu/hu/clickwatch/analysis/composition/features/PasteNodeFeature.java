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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.AbstractPasteFeature;

import edu.hu.clickwatch.analysis.composition.model.Node;

public class PasteNodeFeature extends AbstractPasteFeature {

	public PasteNodeFeature(IFeatureProvider fp) {
		super(fp);
	}

	public boolean canPaste(IPasteContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		if (pes.length != 1 || !(pes[0] instanceof Diagram)) {
			return false;
		}

		Object[] fromClipboard = getFromClipboard();
		if (fromClipboard == null || fromClipboard.length == 0) {
			return false;
		}
		for (Object object : fromClipboard) {
			if (!(object instanceof Node)) {
				return false;
			}
		}
		return true;
	}

	public void paste(IPasteContext context) {
		PictogramElement[] pes = context.getPictogramElements();
		Diagram diagram = (Diagram) pes[0];
		Object[] objects = getFromClipboard();
		for (Object object : objects) {
			AddContext ac = new AddContext();
			ac.setLocation(100, 100);
			ac.setTargetContainer(diagram);
			if (object instanceof EObject) {
				addGraphicalRepresentation(ac, EcoreUtil.copy((EObject)object));
			}
		}
	}
}
