package de.hub.clickwatch.analysis.results.ui;

import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

import de.hub.clickwatch.analysis.results.GraphLink;
import de.hub.clickwatch.analysis.results.GraphNode;
import de.hub.clickwatch.analysis.results.GraphResult;
import de.hub.clickwatch.analysis.visualization.IVisualization;
import edu.uci.ics.jung.graph.ArchetypeVertex;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.Vertex;
import edu.uci.ics.jung.graph.decorators.DefaultToolTipFunction;
import edu.uci.ics.jung.graph.decorators.EdgeShape;
import edu.uci.ics.jung.graph.decorators.VertexStringer;
import edu.uci.ics.jung.graph.impl.DirectedSparseEdge;
import edu.uci.ics.jung.graph.impl.SparseGraph;
import edu.uci.ics.jung.graph.impl.SparseVertex;
import edu.uci.ics.jung.utils.UserData;
import edu.uci.ics.jung.utils.UserDataContainer;
import edu.uci.ics.jung.visualization.Layout;
import edu.uci.ics.jung.visualization.PluggableRenderer;
import edu.uci.ics.jung.visualization.ShapePickSupport;
import edu.uci.ics.jung.visualization.VisualizationViewer;
import edu.uci.ics.jung.visualization.contrib.KKLayout;

public class GraphVisualization implements IVisualization {

	public static final String VisualizationName = "Topology";
	
	@Override
	public boolean isEnabledForInput(Object input) {
	    if (input instanceof Collection<?>) {
	        for (Object inputItem: (Collection<?>)input) {
	            if (!(inputItem instanceof GraphResult)) {
	                return false;
	            }
	        }
	        return true;
	    } else {
	        return input instanceof GraphResult;
	    }
	}

	@Override
	public Component createVisualization(Object input) {
	    GraphResult graphResult = null;
	    if (input instanceof Collection<?>) {
	        graphResult = (GraphResult)((Collection<?>)input).iterator().next();
	    } else {
	        graphResult = (GraphResult)input;
	    }
		
		Graph graph = new SparseGraph();
		Map<GraphNode, Vertex> vertexMap = new HashMap<GraphNode, Vertex>();
		for (GraphNode node: graphResult.getNodes()) {
			SparseVertex v = new SparseVertex();
			v.setUserDatum(VisualizationName, node, UserData.SHARED);
            graph.addVertex(v);
            vertexMap.put(node, v);
		}
		for (GraphLink link: graphResult.getLinks()) {
		    DirectedSparseEdge edge = new DirectedSparseEdge(vertexMap.get(link.getSource()), vertexMap.get(link.getTarget()));
			graph.addEdge(edge);
		}
		
        PluggableRenderer pr = new PluggableRenderer();	
		Layout layout = new KKLayout(graph);
		layout.initialize(new Dimension(300, 300));
		
		final VisualizationViewer vv = new VisualizationViewer(layout, pr);
		vv.setBackground(Color.white);
        vv.setPickSupport(new ShapePickSupport());
        vv.setDoubleBuffered(true);
        pr.setEdgeShapeFunction(new EdgeShape.QuadCurve());
        pr.setVertexStringer(new VertexStringer() {
            public String getLabel(ArchetypeVertex v) {
                return ((GraphNode)v.getUserDatum(VisualizationName)).getName();
            }});

        vv.setToolTipFunction(new DefaultToolTipFunction());
		        
		return vv;
	}

	@Override
	public void updateVisualization(Object input) {
		// empty	
	}

}
