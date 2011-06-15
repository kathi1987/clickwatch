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
package de.hub.xveg.internal.diagram;

import java.util.ArrayList;
import java.util.List;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.dt.IDiagramTypeProvider;
import org.eclipse.graphiti.features.IAddFeature;
import org.eclipse.graphiti.features.ICopyFeature;
import org.eclipse.graphiti.features.ICreateConnectionFeature;
import org.eclipse.graphiti.features.ICreateFeature;
import org.eclipse.graphiti.features.IDirectEditingFeature;
import org.eclipse.graphiti.features.IFeature;
import org.eclipse.graphiti.features.ILayoutFeature;
import org.eclipse.graphiti.features.IMoveShapeFeature;
import org.eclipse.graphiti.features.IPasteFeature;
import org.eclipse.graphiti.features.IResizeShapeFeature;
import org.eclipse.graphiti.features.IUpdateFeature;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ICopyContext;
import org.eclipse.graphiti.features.context.ICustomContext;
import org.eclipse.graphiti.features.context.IDirectEditingContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.features.context.IMoveShapeContext;
import org.eclipse.graphiti.features.context.IPasteContext;
import org.eclipse.graphiti.features.context.IPictogramElementContext;
import org.eclipse.graphiti.features.context.IResizeShapeContext;
import org.eclipse.graphiti.features.context.IUpdateContext;
import org.eclipse.graphiti.features.custom.ICustomFeature;
import org.eclipse.graphiti.features.impl.DefaultResizeShapeFeature;
import org.eclipse.graphiti.mm.pictograms.Connection;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.mm.pictograms.PictogramElement;
import org.eclipse.graphiti.mm.pictograms.Shape;
import org.eclipse.graphiti.ui.features.DefaultFeatureProvider;

import de.hub.xveg.internal.features.AddEdgeFeature;
import de.hub.xveg.internal.features.AddVertexFeature;
import de.hub.xveg.internal.features.CopyVertexFeature;
import de.hub.xveg.internal.features.CreateEdgeFeature;
import de.hub.xveg.internal.features.CreateVertexFeature;
import de.hub.xveg.internal.features.DirectEditElementFeature;
import de.hub.xveg.internal.features.LayoutVertexFeature;
import de.hub.xveg.internal.features.MoveVertexFeature;
import de.hub.xveg.internal.features.PasteVertexFeature;
import de.hub.xveg.internal.features.RenameElementFeature;
import de.hub.xveg.internal.features.UpdateFeature;
import de.hub.xveg.xvegfeaturemodel.EdgeFeature;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;
import de.hub.xveg.xvegfeaturemodel.XvegDiagramType;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;

public class XvegFeatureProvider extends DefaultFeatureProvider {
	
	private final XvegDiagramType diagramType;

	public XvegFeatureProvider(IDiagramTypeProvider dtp, XvegDiagramType diagramType) {
		super(dtp);
		this.diagramType = diagramType;
	}
	
	public XvegFeature getFeatureOfElement(EObject element) {
		return diagramType.getFeatureForObject(element);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		if (context.getNewObject() instanceof EObject) {
			EObject addedElement = (EObject)context.getNewObject();
			XvegFeature feature = getFeatureOfElement(addedElement);
			if (feature != null) {
				if (feature instanceof VertexFeature) {
					return new AddVertexFeature(this);
				} else if (feature instanceof EdgeFeature) {
					return new AddEdgeFeature(this);
				}
			}
		}
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		List<ICreateFeature> result = new ArrayList<ICreateFeature>();
		for (XvegFeature feature: diagramType.getFeatures()) {
			if (feature instanceof VertexFeature) {
				result.add(new CreateVertexFeature(this, (VertexFeature)feature));
			}
		}
		return result.toArray(new ICreateFeature[] {});
	}

	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape || pictogramElement instanceof Connection) {
			Object bo = getBusinessObjectForPictogramElement(context.getPictogramElement());
			if (bo != null) {
				return new UpdateFeature(this);
			}
		} 
		return super.getUpdateFeature(context);
	}

	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		return new MoveVertexFeature(this);
	}

	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		Shape shape = context.getShape();
		Object bo = getBusinessObjectForPictogramElement(shape);
		if (bo instanceof EObject) {
			XvegFeature feature = getFeatureOfElement((EObject)bo);
			if (feature != null && feature instanceof VertexFeature) {
				return new DefaultResizeShapeFeature(this); 
			}
		}
		return super.getResizeShapeFeature(context);
	}

	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		return new LayoutVertexFeature(this);
	}

	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		return new ICustomFeature[] { 
				new RenameElementFeature(this) 
		};
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		List<ICreateConnectionFeature> result = new ArrayList<ICreateConnectionFeature>();
		for (XvegFeature feature: diagramType.getFeatures()) {
			if (feature instanceof EdgeFeature) {
				result.add(new CreateEdgeFeature(this, (EdgeFeature)feature));
			}
		}
		return result.toArray(new ICreateConnectionFeature[] {});
	}

	@Override
	public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
		// simply return all create connection features
		return getCreateConnectionFeatures();
	}

	@Override
	public IDirectEditingFeature getDirectEditingFeature(IDirectEditingContext context) {
		return new DirectEditElementFeature(this);
	}

	@Override
	public ICopyFeature getCopyFeature(ICopyContext context) {
		return new CopyVertexFeature(this);
	}

	@Override
	public IPasteFeature getPasteFeature(IPasteContext context) {
		return new PasteVertexFeature(this);
	}
}
