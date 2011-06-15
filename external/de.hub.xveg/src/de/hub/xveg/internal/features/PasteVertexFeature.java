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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.graphiti.features.IFeatureProvider;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.impl.AddContext;
import org.eclipse.graphiti.mm.pictograms.Diagram;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.ui.features.AbstractPasteFeature;

import de.hub.xveg.internal.diagram.XvegFeatureProvider;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;

public class PasteVertexFeature extends AbstractPasteFeature {

	public PasteVertexFeature(IFeatureProvider fp) {
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
		boolean possible = true;
		for (Object object : fromClipboard) {
			if (object instanceof EObject) {
				XvegFeature feature = ((XvegFeatureProvider)getFeatureProvider()).getFeatureOfElement((EObject)object);
				possible &= feature != null && feature instanceof VertexFeature;
			} else {
				possible = false;
			}
		}
		return possible;
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
