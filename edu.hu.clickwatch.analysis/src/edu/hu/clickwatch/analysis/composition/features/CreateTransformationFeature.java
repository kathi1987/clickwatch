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
import org.eclipse.graphiti.features.context.ICreateConnectionContext;
import org.eclipse.graphiti.features.context.impl.AddConnectionContext;
import org.eclipse.graphiti.features.impl.AbstractCreateConnectionFeature;
import org.eclipse.graphiti.mm.pictograms.Anchor;
import org.eclipse.graphiti.mm.pictograms.Connection;

import edu.hu.clickwatch.analysis.composition.model.CompositionFactory;
import edu.hu.clickwatch.analysis.composition.model.Node;
import edu.hu.clickwatch.analysis.composition.model.Transformation;

public class CreateTransformationFeature extends AbstractCreateConnectionFeature {

	public CreateTransformationFeature(IFeatureProvider fp) {
		super(fp, "Transformation", "Create Transformation"); //$NON-NLS-1$ //$NON-NLS-2$
	}

	protected CreateTransformationFeature(IFeatureProvider fp,
			String name, String description) {
		super(fp, name, description);
	}

	public boolean canCreate(ICreateConnectionContext context) {
		Node source = getNode(context.getSourceAnchor());
		Node target = getNode(context.getTargetAnchor());
		if (source != null && target != null && source != target) {
			return true;
		}
		return false;
	}

	public boolean canStartConnection(ICreateConnectionContext context) {
		if (getNode(context.getSourceAnchor()) != null) {
			return true;
		}
		return false;
	}

	public Connection create(ICreateConnectionContext context) {
		Connection newConnection = null;

		Node source = getNode(context.getSourceAnchor());
		Node target = getNode(context.getTargetAnchor());

		if (source != null && target != null) {
			Transformation transformation = createTransformation(source, target);

			AddConnectionContext addContext = new AddConnectionContext(context.getSourceAnchor(), context.getTargetAnchor());
			addContext.setNewObject(transformation);
			newConnection = (Connection) getFeatureProvider().addIfPossible(addContext);
		}
		
		getFeatureProvider().getDirectEditingInfo().setActive(true);

		return newConnection;
	}

	private Node getNode(Anchor anchor) {
		if (anchor != null) {
			Object obj = getBusinessObjectForPictogramElement(anchor.getParent());
			if (obj instanceof Node) {
				return (Node) obj;
			}
		}
		return null;
	}

	private Transformation createTransformation(Node source, Node target) {
		Transformation transformation = createTransformation();
		transformation.setSource(source);
		transformation.setTarget(target);
		getDiagram().eResource().getContents().add(transformation);
		return transformation;
	}
	
	protected Transformation createTransformation() {
		Transformation transformation = CompositionFactory.eINSTANCE.createTransformation();
		transformation.setLabel("Transformation"); //$NON-NLS-1$
		return transformation;
	}

}
