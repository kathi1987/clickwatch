package de.hu.examples;

import java.awt.Dimension;
import java.awt.HeadlessException;

import javax.swing.JFrame;

import edu.uci.ics.jung.algorithms.layout.CircleLayout;
import edu.uci.ics.jung.algorithms.layout.Layout;
import edu.uci.ics.jung.graph.Graph;
import edu.uci.ics.jung.graph.SparseMultigraph;
import edu.uci.ics.jung.graph.util.EdgeType;
import edu.uci.ics.jung.visualization.BasicVisualizationServer;

public class JungExample1 extends JFrame {

	private Graph<Integer, String> g;

	public JungExample1(String title) throws HeadlessException {
		super(title);
	}

	private void createGraph() {
		// Graph<V, E> where V is the type of the vertices
		// and E is the type of the edges
		g = new SparseMultigraph<Integer, String>();
		// Add some vertices. From above we defined these to be type Integer.
		g.addVertex((Integer) 1);
		g.addVertex((Integer) 2);
		g.addVertex((Integer) 3);
		// Add some edges. From above we defined these to be of type String
		// Note that the default is for undirected edges.
		g.addEdge("Edge-A", 1, 2); // Note that Java 1.5 auto-boxes primitives
		g.addEdge("Edge-B", 2, 3);
		// Let's see what we have. Note the nice output from the
		// SparseMultigraph<V,E> toString() method
		System.out.println("The graph g = " + g.toString());
		// Note that we can use the same nodes and edges in two different
		// graphs.
		Graph<Integer, String> g2 = new SparseMultigraph<Integer, String>();
		g2.addVertex((Integer) 1);
		g2.addVertex((Integer) 2);
		g2.addVertex((Integer) 3);
		g2.addEdge("Edge-A", 1, 3);
		g2.addEdge("Edge-B", 2, 3, EdgeType.DIRECTED);
		g2.addEdge("Edge-C", 3, 2, EdgeType.DIRECTED);
		g2.addEdge("Edge-P", 2, 3); // A parallel edge
		System.out.println("The graph g2 = " + g2.toString());
	}

	private void visualizeGraph() {
		// The Layout<V, E> is parameterized by the vertex and edge types
		Layout<Integer, String> layout = new CircleLayout<Integer, String>(g);
		layout.setSize(new Dimension(300, 300)); // sets the initial size of the
													// space
		// The BasicVisualizationServer<V,E> is parameterized by the edge types
		final BasicVisualizationServer<Integer, String> vv = new BasicVisualizationServer<Integer, String>(
				layout);
		vv.setPreferredSize(new Dimension(350, 350)); // Sets the viewing area
												// size
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().add(vv);
		pack();
		setVisible(true);
	}

	public static void main(String[] args) {
		JungExample1 example = new JungExample1("Simple Graph Example");
		example.createGraph();
		example.visualizeGraph();
	}
}
