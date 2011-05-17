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
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.impl.DefaultMoveShapeFeature;
import org.eclipse.graphiti.mm.pictograms.Shape;

import edu.hu.clickwatch.analysis.composition.model.Node;

public class MoveNodeFeature extends DefaultMoveShapeFeature {

	public MoveNodeFeature(IFeatureProvider fp) {
		super(fp);
	}

	@Override
	public boolean canMoveShape(IMoveShapeContext context) {
		boolean canMove = super.canMoveShape(context);

		if (canMove) {
			Shape shape = context.getShape();
			Object bo = getBusinessObjectForPictogramElement(shape);
			if (bo instanceof Node) {
				return true;
			}
		}
		return canMove;
	}
}
