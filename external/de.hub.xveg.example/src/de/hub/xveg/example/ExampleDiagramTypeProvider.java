package de.hub.xveg.example;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.graphiti.features.context.IAddContext;
import org.eclipse.graphiti.features.context.ILayoutContext;
import org.eclipse.graphiti.mm.algorithms.Ellipse;
import org.eclipse.graphiti.mm.algorithms.GraphicsAlgorithm;
import org.eclipse.graphiti.mm.algorithms.Polyline;
import org.eclipse.graphiti.mm.algorithms.Rectangle;
import org.eclipse.graphiti.mm.algorithms.styles.LineStyle;
import org.eclipse.graphiti.mm.pictograms.ContainerShape;
import org.eclipse.graphiti.services.Graphiti;
import org.eclipse.graphiti.services.IGaService;
import org.eclipse.graphiti.util.ColorConstant;

import de.hub.xveg.configuration.AbstractEdgeFeatureConfigurationProvider;
import de.hub.xveg.configuration.AbstractVertexFeatureConfigurationProvider;
import de.hub.xveg.configuration.DefaultVertexGraphicsConfiguration;
import de.hub.xveg.configuration.ILabelConfiguration;
import de.hub.xveg.configuration.IVertexGraphicConfiguration;
import de.hub.xveg.diagram.XvegDiagramTypeProvider;
import de.hub.xveg.example.examplemodel.CompositionElement;
import de.hub.xveg.example.examplemodel.Data;
import de.hub.xveg.example.examplemodel.DataSet;
import de.hub.xveg.example.examplemodel.ExampleModelFactory;
import de.hub.xveg.example.examplemodel.ExampleModelPackage;
import de.hub.xveg.example.examplemodel.Measure;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;
import de.hub.xveg.xvegfeaturemodel.XvegDiagramType;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;
import de.hub.xveg.xvegfeaturemodel.builder.ColorBuilder;
import de.hub.xveg.xvegfeaturemodel.builder.EdgeFeatureBuilder;
import de.hub.xveg.xvegfeaturemodel.builder.StyleInfoBuilder;
import de.hub.xveg.xvegfeaturemodel.builder.VertexFeatureBuilder;
import de.hub.xveg.xvegfeaturemodel.builder.XvegDiagramTypeBuilder;

public class ExampleDiagramTypeProvider extends XvegDiagramTypeProvider {
	
	private static final ColorConstant DELIMITER_COLOR = new ColorConstant(30,30,30);

	private int[] getRectangularPolylinePoints(int width, int height) {
		return new int[] { 
				0,0, 
				width,0, 
				width,height, 
				0,height, 
				0,0
		};
	}
	
	private final ILabelConfiguration<CompositionElement> labelConfiguration = new ILabelConfiguration<CompositionElement>() {
		@Override
		public String getLabel(XvegFeature feature, CompositionElement object) {
			String result = object.getName();
			return result == null ? "default" : result;
		}

		@Override
		public void setLabel(XvegFeature feature, CompositionElement object, String label) {
			object.setName(label);
		}
	};
	
	private class MyDefaultVertexConfigurationProvider<T extends CompositionElement> extends AbstractVertexFeatureConfigurationProvider<T> {
		@SuppressWarnings("unchecked")
		@Override
		public ILabelConfiguration<T> getLabelConfiguration(
				XvegFeature feature, T object) {
			return (ILabelConfiguration<T>) labelConfiguration;
		}
	}
	
	public XvegDiagramType getDiagramType() {		
		ExampleModelPackage emPackage = ExampleModelPackage.eINSTANCE;
		
		// @formatter:off
		StyleInfoBuilder styleInfoBuilder = StyleInfoBuilder
			.newStyleInfoBuilder()
				.withBackgroundColor(ColorBuilder.newColorBuilder()
						.withR(255).withG(255).withB(255))
				.withLineColor(ColorBuilder.newColorBuilder()
						.withR(108).withG(55).withB(0))
				.withTextColor(ColorBuilder.newColorBuilder()
						.withR(108).withG(55).withB(0))
				.withFontSize(12)
				.withBoldFont(true);
						
		VertexFeatureBuilder elementWithNameFeatBuilder = VertexFeatureBuilder
			.newVertexFeatureBuilder()
				.withConfiguration(new MyDefaultVertexConfigurationProvider<Data>())
				.withStyle(styleInfoBuilder);
		
		VertexFeature modelFeature = elementWithNameFeatBuilder
			.but()
				.withName("Model")
				.withElementClass(emPackage.getModel())
			.build();
		
		VertexFeature dataSetFeature = elementWithNameFeatBuilder
			.but()
				.withName("DataSet")
				.withElementClass(emPackage.getDataSet())
				.withConfiguration(new MyDefaultVertexConfigurationProvider<DataSet>() {
					@Override
					public IVertexGraphicConfiguration getVertixGraphicsConfiguration (
							VertexFeature feature, DataSet object) {
						return new DefaultVertexGraphicsConfiguration() {
							int ellipse_i = 0;
							
							@Override
							public boolean layoutGraphics(
									VertexFeature feature,
									ILayoutContext context) {
								ellipse_i = 0;
								return super.layoutGraphics(feature, context);
							}

							@Override
							protected void layoutContent(EObject next) {
								IGaService gaService = Graphiti.getGaService();
				
								if (next instanceof Ellipse) {
									Ellipse ellipse = (Ellipse)next;
								    gaService.setLocationAndSize(ellipse, (width-24-8+ellipse_i*4), 4+ellipse_i*2, 20, 20);
								    ellipse_i++;
								} else if (next instanceof Polyline) {
									Polyline polyline = (Polyline)next;
									int[] polylinePoints = getRectangularPolylinePoints(width, height);
									for (int ii = 0; ii < 5; ii++) {
										polyline.getPoints().set(ii, gaService.createPoint(polylinePoints[ii*2], polylinePoints[ii*2+1]));
									}
								} else {
									super.layoutContent(next);
								}
							}

							@Override
							protected GraphicsAlgorithm addSpecificShape(
									IAddContext context,
									ContainerShape containerShape) {
								IGaService gaService = Graphiti.getGaService();
						    	
						    	Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);
						    	
						    	Polyline polyline = gaService.createPolyline(invisibleRectangle,
						    			getRectangularPolylinePoints(width, height));
						    	polyline.setForeground(manageColor(DELIMITER_COLOR));
						    	polyline.setLineWidth(1);
						    	polyline.setLineStyle(LineStyle.DASHDOT);
						    	
						    	Ellipse ellipse = gaService.createEllipse(invisibleRectangle);
						    	stylize(ellipse);
						    	gaService.setLocationAndSize(ellipse, (width-24-8), 4, 20, 20);
						    	ellipse = gaService.createEllipse(invisibleRectangle);
						    	stylize(ellipse);
						    	gaService.setLocationAndSize(ellipse, (width-20-8), 6, 20, 20);
						    	ellipse = gaService.createEllipse(invisibleRectangle);
						    	stylize(ellipse);
						    	gaService.setLocationAndSize(ellipse, (width-16-8), 8, 20, 20);

						        return invisibleRectangle;
							}
							
						};
					}					
				})
			.build();
		VertexFeature measureFeature = elementWithNameFeatBuilder
			.but()
				.withName("Measure")
				.withElementClass(emPackage.getMeasure())			
				.withConfiguration(new MyDefaultVertexConfigurationProvider<Measure>(){
					@Override
					public IVertexGraphicConfiguration getVertixGraphicsConfiguration(
							VertexFeature feature, Measure object) {
						return new DefaultVertexGraphicsConfiguration() {

							@Override
							protected void layoutContent(EObject next) {
								IGaService gaService = Graphiti.getGaService();
								if (next instanceof Ellipse) {
									Ellipse ellipse = (Ellipse)next;
									gaService.setLocationAndSize(ellipse, (width-24-4), 4, 24, 24);
								} else if (next instanceof Polyline) {
									Polyline polyline = (Polyline)next;
									int[] polylinePoints = getRectangularPolylinePoints(width, height);
									for (int ii = 0; ii < 5; ii++) {
										polyline.getPoints().set(ii, gaService.createPoint(polylinePoints[ii*2], polylinePoints[ii*2+1]));
									}
								} else {
									super.layoutContent(next);
								}
							}

							@Override
							protected GraphicsAlgorithm addSpecificShape(
									IAddContext context,
									ContainerShape containerShape) {
						    	IGaService gaService = Graphiti.getGaService();
						    	
						    	Rectangle invisibleRectangle = gaService.createInvisibleRectangle(containerShape);

						    	Polyline polyline = gaService.createPolyline(invisibleRectangle, getRectangularPolylinePoints(width, height));
						    	polyline.setForeground(manageColor(DELIMITER_COLOR));
						    	polyline.setLineWidth(1);
						    	polyline.setLineStyle(LineStyle.DASHDOT);
						    	
						    	Ellipse ellipse = gaService.createEllipse(invisibleRectangle);
						    	stylize(ellipse);
						    	gaService.setLocationAndSize(ellipse, (width-24-4), (height-24)/2, 24, 24);
						    	
						        return invisibleRectangle;
							}
							
						};
					}					
				})
			.build();
		
		return XvegDiagramTypeBuilder
			.newXvegDiagramTypeBuilder()
				.withDslFactory(ExampleModelFactory.eINSTANCE)
				.withFeatures(modelFeature)
				.withFeatures(dataSetFeature)
				.withFeatures(measureFeature)
				.withFeatures(EdgeFeatureBuilder
				    .newEdgeFeatureBuilder()
						.withConfiguration(new AbstractEdgeFeatureConfigurationProvider<CompositionElement>() {
							@Override
							public ILabelConfiguration<CompositionElement> getLabelConfiguration(
									XvegFeature feature, CompositionElement object) {
								return labelConfiguration;
							}
						})
						.withName("Transformation")
						.withElementClass(emPackage.getTransformation())
						.withPossibleSourceFeatures(modelFeature)
						.withPossibleSourceFeatures(dataSetFeature)
						.withPossibleSourceFeatures(measureFeature)
						.withPossibleTargetFeatures(modelFeature)
						.withPossibleTargetFeatures(dataSetFeature)
						.withPossibleTargetFeatures(measureFeature)
						.withSourceReference(emPackage.getTransformation_Source())
						.withTargetReference(emPackage.getTransformation_Target())
						.withStyle(
						    styleInfoBuilder
						        .but()
						            .withBoldFont(false)
						 )
				    .build()
				)
			.build();
		 // @formatter:on
	}

}
