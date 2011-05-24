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
package edu.hu.clickwatch.analysis.composition.diagram;

import org.eclipse.emf.ecore.EClass;
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

import edu.hu.clickwatch.analysis.composition.features.AddDataSetNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.AddMeasureNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.AddModelNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.AddTransformationFeature;
import edu.hu.clickwatch.analysis.composition.features.CopyNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.CreateDataSetNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.CreateMeasureNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.CreateModelNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.CreateTimedTransformationFeature;
import edu.hu.clickwatch.analysis.composition.features.CreateTransformationFeature;
import edu.hu.clickwatch.analysis.composition.features.DirectEditElementFeature;
import edu.hu.clickwatch.analysis.composition.features.LayoutDataSetNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.LayoutMeasureNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.LayoutModelNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.MoveNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.PasteNodeFeature;
import edu.hu.clickwatch.analysis.composition.features.RenameElementFeature;
import edu.hu.clickwatch.analysis.composition.features.UpdateElementFeature;
import edu.hu.clickwatch.analysis.composition.model.DataSetNode;
import edu.hu.clickwatch.analysis.composition.model.Element;
import edu.hu.clickwatch.analysis.composition.model.MeasureNode;
import edu.hu.clickwatch.analysis.composition.model.ModelNode;
import edu.hu.clickwatch.analysis.composition.model.Node;
import edu.hu.clickwatch.analysis.composition.model.Transformation;


public class CompositionFeatureProvider extends DefaultFeatureProvider {

	public CompositionFeatureProvider(IDiagramTypeProvider dtp) {
		super(dtp);
	}

	@Override
	public IAddFeature getAddFeature(IAddContext context) {
		// is object for add request a EClass or EReference?
		if (context.getNewObject() instanceof ModelNode) {
			return new AddModelNodeFeature(this);
		} else if (context.getNewObject() instanceof MeasureNode) {
			return new AddMeasureNodeFeature(this);
		} else if (context.getNewObject() instanceof DataSetNode) {
			return new AddDataSetNodeFeature(this);
		} else if (context.getNewObject() instanceof Transformation) {
			return new AddTransformationFeature(this);
		}
		return super.getAddFeature(context);
	}

	@Override
	public ICreateFeature[] getCreateFeatures() {
		return new ICreateFeature[] { 
				new CreateModelNodeFeature(this), 
				new CreateMeasureNodeFeature(this), 
				new CreateDataSetNodeFeature(this) };
	}

	@Override
	public IUpdateFeature getUpdateFeature(IUpdateContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		if (pictogramElement instanceof ContainerShape || pictogramElement instanceof Connection) {
			Object bo = getBusinessObjectForPictogramElement(pictogramElement);
			if (bo instanceof Element) {
				return new UpdateElementFeature(this);
			}
		} 
		return super.getUpdateFeature(context);
	}

	@Override
	public IMoveShapeFeature getMoveShapeFeature(IMoveShapeContext context) {
		Shape shape = context.getShape();
		Object bo = getBusinessObjectForPictogramElement(shape);
		if (bo instanceof EClass) {
			return new MoveNodeFeature(this);
		}
		return super.getMoveShapeFeature(context);
	}

	@Override
	public IResizeShapeFeature getResizeShapeFeature(IResizeShapeContext context) {
		Shape shape = context.getShape();
		Object bo = getBusinessObjectForPictogramElement(shape);
		if (bo instanceof Node) {
			return new DefaultResizeShapeFeature(this);
		}
		return super.getResizeShapeFeature(context);
	}

	@Override
	public ILayoutFeature getLayoutFeature(ILayoutContext context) {
		PictogramElement pictogramElement = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pictogramElement);
		if (bo instanceof MeasureNode) {
			return new LayoutMeasureNodeFeature(this);
		} else if (bo instanceof DataSetNode) {
			return new LayoutDataSetNodeFeature(this);
		} else if (bo instanceof ModelNode) {
			return new LayoutModelNodeFeature(this);
		}
		return super.getLayoutFeature(context);
	}

	@Override
	public ICustomFeature[] getCustomFeatures(ICustomContext context) {
		return new ICustomFeature[] { new RenameElementFeature(this) };
	}

	@Override
	public ICreateConnectionFeature[] getCreateConnectionFeatures() {
		return new ICreateConnectionFeature[] { 
				new CreateTransformationFeature(this),
				new CreateTimedTransformationFeature(this)
		};
	}

	@Override
	public IFeature[] getDragAndDropFeatures(IPictogramElementContext context) {
		// simply return all create connection features
		return getCreateConnectionFeatures();
	}

	@Override
	public IDirectEditingFeature getDirectEditingFeature(IDirectEditingContext context) {
		PictogramElement pe = context.getPictogramElement();
		Object bo = getBusinessObjectForPictogramElement(pe);
		if (bo instanceof Element) {
			return new DirectEditElementFeature(this);
		} 
		return super.getDirectEditingFeature(context);
	}

	@Override
	public ICopyFeature getCopyFeature(ICopyContext context) {
		return new CopyNodeFeature(this);
	}

	@Override
	public IPasteFeature getPasteFeature(IPasteContext context) {
		return new PasteNodeFeature(this);
	}
}
