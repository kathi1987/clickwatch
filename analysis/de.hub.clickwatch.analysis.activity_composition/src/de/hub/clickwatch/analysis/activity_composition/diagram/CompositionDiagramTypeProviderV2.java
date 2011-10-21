package de.hub.clickwatch.analysis.activity_composition.diagram;

import org.eclipse.emf.ecore.EObject;

import de.hub.clickwatch.analysis.activity_composition.diagram.graphicsConfigurations.StartNodeGraphicsConfiguration;
import de.hub.clickwatch.analysis.activity_composition.model.ActionNode;
import de.hub.clickwatch.analysis.activity_composition.model.Element;
import de.hub.clickwatch.analysis.activity_composition.model.ModelFactory;
import de.hub.clickwatch.analysis.activity_composition.model.ModelPackage;
import de.hub.clickwatch.analysis.activity_composition.model.ProgressEdge;
import de.hub.clickwatch.analysis.activity_composition.model.StartNode;
import de.hub.clickwatch.analysis.activity_composition.model.Transformation;
import de.hub.xveg.configuration.AbstractVertexFeatureConfigurationProvider;
import de.hub.xveg.configuration.DefaultVertexGraphicsConfiguration;
import de.hub.xveg.configuration.ILabelConfiguration;
import de.hub.xveg.configuration.IVertexGraphicConfiguration;
import de.hub.xveg.diagram.XvegDiagramTypeProvider;
import de.hub.xveg.xvegfeaturemodel.VertexFeature;
import de.hub.xveg.xvegfeaturemodel.XvegDiagramType;
import de.hub.xveg.xvegfeaturemodel.XvegFeature;
import de.hub.xveg.xvegfeaturemodel.builder.ColorBuilder;
import de.hub.xveg.xvegfeaturemodel.builder.EdgeFeatureBuilder;
import de.hub.xveg.xvegfeaturemodel.builder.StyleInfoBuilder;
import de.hub.xveg.xvegfeaturemodel.builder.VertexFeatureBuilder;
import de.hub.xveg.xvegfeaturemodel.builder.XvegDiagramTypeBuilder;

public class CompositionDiagramTypeProviderV2 extends XvegDiagramTypeProvider {

	private final ILabelConfiguration<Element> labelConfiguration = new ILabelConfiguration<Element>() {
		@Override
		public String getLabel(XvegFeature feature, Element object) {
			String result = object.getLabel();
			return result == null ? "default" : result;
		}

		@Override
		public void setLabel(XvegFeature feature, Element object, String label) {
			object.setLabel(label);
		}
	};

	private class MyDefaultVertexConfigurationProvider<T extends Element>
			extends AbstractVertexFeatureConfigurationProvider<T> {
		@SuppressWarnings("unchecked")
		@Override
		public ILabelConfiguration<T> getLabelConfiguration(
				XvegFeature feature, T object) {
			return (ILabelConfiguration<T>) labelConfiguration;
		}

		@Override
		public IVertexGraphicConfiguration getVertixGraphicsConfiguration(
				VertexFeature feature, T object) {
			return new DefaultVertexGraphicsConfiguration();
		}
	}

	@Override
	protected XvegDiagramType getDiagramType() {
		ModelPackage modelPackage = ModelPackage.eINSTANCE;

		// @formatter:off
		StyleInfoBuilder styleInfoBuilder = StyleInfoBuilder
				.newStyleInfoBuilder()
				.withBackgroundColor(
						ColorBuilder.newColorBuilder().withR(255).withG(255)
								.withB(255))
				.withLineColor(
						ColorBuilder.newColorBuilder().withR(0).withG(55)
								.withB(108))
				.withTextColor(
						ColorBuilder.newColorBuilder().withR(0).withG(55)
								.withB(108)).withFontSize(12)
				.withBoldFont(true);

		// Start node
		VertexFeatureBuilder startNodeFeatBuilder = VertexFeatureBuilder
				.newVertexFeatureBuilder()
				.withConfiguration(
						new MyDefaultVertexConfigurationProvider<StartNode>() {
							@Override
							public IVertexGraphicConfiguration getVertixGraphicsConfiguration(
									VertexFeature feature, StartNode object) {
								return new StartNodeGraphicsConfiguration();
							}
						}).withStyle(styleInfoBuilder);

		VertexFeature startNodeFeature = startNodeFeatBuilder.but()
				.withName("Start")
				.withElementClass(modelPackage.getStartNode())
				// .withConfiguration(
				// new MyDefaultVertexConfigurationProvider<StartNode>() {
				// public IVertexGraphicConfiguration
				// getVertixGraphicsConfiguration(
				// VertexFeature feature, StartNode object) {
				// return new DefaultVertexGraphicsConfiguration() {
				// protected void layoutContent(EObject next) {
				// super.layoutContent(next);
				// };
				// };
				// };
				// })
				.build();

		// transformation node
		VertexFeatureBuilder transformationNodeFeatBuilder = VertexFeatureBuilder
				.newVertexFeatureBuilder()
				.withConfiguration(
						new MyDefaultVertexConfigurationProvider<Transformation>() {
							@Override
							public IVertexGraphicConfiguration getVertixGraphicsConfiguration(
									VertexFeature feature, Transformation object) {
								return new DefaultVertexGraphicsConfiguration();
							}
						}).withStyle(styleInfoBuilder);

		VertexFeature transformationNodeFeature = transformationNodeFeatBuilder
				.but().withName("Transformation")
				.withElementClass(modelPackage.getTransformation()).build();

		// @formatter:on
		return XvegDiagramTypeBuilder
				.newXvegDiagramTypeBuilder()
				.withDslFactory(ModelFactory.eINSTANCE)
				.withFeatures(startNodeFeature)
				.withFeatures(transformationNodeFeature)
				.withFeatures(
						EdgeFeatureBuilder
								.newEdgeFeatureBuilder()
								.withConfiguration(
										new ProgressEdgeConfigurationProvider() {
											@Override
											public ILabelConfiguration<ProgressEdge> getLabelConfiguration(
													XvegFeature feature,
													ProgressEdge object) {
												return (ILabelConfiguration) labelConfiguration;
											}
										})
								.withName("Progress")
								.withElementClass(
										modelPackage.getProgressEdge())
								.withPossibleSourceFeatures(startNodeFeature)
								.withPossibleTargetFeatures(
										transformationNodeFeature)
								.withSourceReference(
										modelPackage.getProgressEdge_Source())
								.withTargetReference(
										modelPackage.getProgressEdge_Target())
								.build()).build();
	}
}
