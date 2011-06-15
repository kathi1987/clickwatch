/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package edu.hu.clickwatch.examples.lifd.topology;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see edu.hu.clickwatch.examples.lifd.topology.TopologyFactory
 * @model kind="package"
 * @generated
 */
public interface TopologyPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "topology";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://topology/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "topology";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TopologyPackage eINSTANCE = edu.hu.clickwatch.examples.lifd.topology.impl.TopologyPackageImpl.init();

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.examples.lifd.topology.impl.NodeImpl <em>Node</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.examples.lifd.topology.impl.NodeImpl
	 * @see edu.hu.clickwatch.examples.lifd.topology.impl.TopologyPackageImpl#getNode()
	 * @generated
	 */
	int NODE = 0;

	/**
	 * The feature id for the '<em><b>Ip</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__IP = 0;

	/**
	 * The feature id for the '<em><b>Mac</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__MAC = 1;

	/**
	 * The feature id for the '<em><b>Outgoing</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__OUTGOING = 2;

	/**
	 * The feature id for the '<em><b>Incomming</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__INCOMMING = 3;

	/**
	 * The feature id for the '<em><b>Gps</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE__GPS = 4;

	/**
	 * The number of structural features of the '<em>Node</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NODE_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.examples.lifd.topology.impl.LinkImpl <em>Link</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.examples.lifd.topology.impl.LinkImpl
	 * @see edu.hu.clickwatch.examples.lifd.topology.impl.TopologyPackageImpl#getLink()
	 * @generated
	 */
	int LINK = 1;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__SOURCE = 0;

	/**
	 * The feature id for the '<em><b>Target</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__TARGET = 1;

	/**
	 * The feature id for the '<em><b>Pdr</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__PDR = 2;

	/**
	 * The feature id for the '<em><b>Reverse</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK__REVERSE = 3;

	/**
	 * The number of structural features of the '<em>Link</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LINK_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.examples.lifd.topology.impl.TopologyImpl <em>Topology</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.examples.lifd.topology.impl.TopologyImpl
	 * @see edu.hu.clickwatch.examples.lifd.topology.impl.TopologyPackageImpl#getTopology()
	 * @generated
	 */
	int TOPOLOGY = 2;

	/**
	 * The feature id for the '<em><b>Nodes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY__NODES = 0;

	/**
	 * The feature id for the '<em><b>Links</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY__LINKS = 1;

	/**
	 * The number of structural features of the '<em>Topology</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TOPOLOGY_FEATURE_COUNT = 2;


	/**
	 * The meta object id for the '{@link edu.hu.clickwatch.examples.lifd.topology.impl.GpsImpl <em>Gps</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see edu.hu.clickwatch.examples.lifd.topology.impl.GpsImpl
	 * @see edu.hu.clickwatch.examples.lifd.topology.impl.TopologyPackageImpl#getGps()
	 * @generated
	 */
	int GPS = 3;

	/**
	 * The feature id for the '<em><b>Long</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__LONG = 0;

	/**
	 * The feature id for the '<em><b>Lat</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS__LAT = 1;

	/**
	 * The number of structural features of the '<em>Gps</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GPS_FEATURE_COUNT = 2;


	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.examples.lifd.topology.Node <em>Node</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Node</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Node
	 * @generated
	 */
	EClass getNode();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.examples.lifd.topology.Node#getIp <em>Ip</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Node#getIp()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Ip();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.examples.lifd.topology.Node#getMac <em>Mac</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Mac</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Node#getMac()
	 * @see #getNode()
	 * @generated
	 */
	EAttribute getNode_Mac();

	/**
	 * Returns the meta object for the reference list '{@link edu.hu.clickwatch.examples.lifd.topology.Node#getOutgoing <em>Outgoing</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Node#getOutgoing()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Outgoing();

	/**
	 * Returns the meta object for the reference list '{@link edu.hu.clickwatch.examples.lifd.topology.Node#getIncomming <em>Incomming</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incomming</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Node#getIncomming()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Incomming();

	/**
	 * Returns the meta object for the containment reference '{@link edu.hu.clickwatch.examples.lifd.topology.Node#getGps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Gps</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Node#getGps()
	 * @see #getNode()
	 * @generated
	 */
	EReference getNode_Gps();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.examples.lifd.topology.Link <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Link</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Link
	 * @generated
	 */
	EClass getLink();

	/**
	 * Returns the meta object for the reference '{@link edu.hu.clickwatch.examples.lifd.topology.Link#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Link#getSource()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Source();

	/**
	 * Returns the meta object for the reference '{@link edu.hu.clickwatch.examples.lifd.topology.Link#getTarget <em>Target</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Target</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Link#getTarget()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Target();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.examples.lifd.topology.Link#getPdr <em>Pdr</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Pdr</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Link#getPdr()
	 * @see #getLink()
	 * @generated
	 */
	EAttribute getLink_Pdr();

	/**
	 * Returns the meta object for the reference '{@link edu.hu.clickwatch.examples.lifd.topology.Link#getReverse <em>Reverse</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reverse</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Link#getReverse()
	 * @see #getLink()
	 * @generated
	 */
	EReference getLink_Reverse();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.examples.lifd.topology.Topology <em>Topology</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Topology</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Topology
	 * @generated
	 */
	EClass getTopology();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.hu.clickwatch.examples.lifd.topology.Topology#getNodes <em>Nodes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Nodes</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Topology#getNodes()
	 * @see #getTopology()
	 * @generated
	 */
	EReference getTopology_Nodes();

	/**
	 * Returns the meta object for the containment reference list '{@link edu.hu.clickwatch.examples.lifd.topology.Topology#getLinks <em>Links</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Links</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Topology#getLinks()
	 * @see #getTopology()
	 * @generated
	 */
	EReference getTopology_Links();

	/**
	 * Returns the meta object for class '{@link edu.hu.clickwatch.examples.lifd.topology.Gps <em>Gps</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Gps</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Gps
	 * @generated
	 */
	EClass getGps();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.examples.lifd.topology.Gps#getLong <em>Long</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Long</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Gps#getLong()
	 * @see #getGps()
	 * @generated
	 */
	EAttribute getGps_Long();

	/**
	 * Returns the meta object for the attribute '{@link edu.hu.clickwatch.examples.lifd.topology.Gps#getLat <em>Lat</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lat</em>'.
	 * @see edu.hu.clickwatch.examples.lifd.topology.Gps#getLat()
	 * @see #getGps()
	 * @generated
	 */
	EAttribute getGps_Lat();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TopologyFactory getTopologyFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.examples.lifd.topology.impl.NodeImpl <em>Node</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.examples.lifd.topology.impl.NodeImpl
		 * @see edu.hu.clickwatch.examples.lifd.topology.impl.TopologyPackageImpl#getNode()
		 * @generated
		 */
		EClass NODE = eINSTANCE.getNode();

		/**
		 * The meta object literal for the '<em><b>Ip</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__IP = eINSTANCE.getNode_Ip();

		/**
		 * The meta object literal for the '<em><b>Mac</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NODE__MAC = eINSTANCE.getNode_Mac();

		/**
		 * The meta object literal for the '<em><b>Outgoing</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__OUTGOING = eINSTANCE.getNode_Outgoing();

		/**
		 * The meta object literal for the '<em><b>Incomming</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__INCOMMING = eINSTANCE.getNode_Incomming();

		/**
		 * The meta object literal for the '<em><b>Gps</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NODE__GPS = eINSTANCE.getNode_Gps();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.examples.lifd.topology.impl.LinkImpl <em>Link</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.examples.lifd.topology.impl.LinkImpl
		 * @see edu.hu.clickwatch.examples.lifd.topology.impl.TopologyPackageImpl#getLink()
		 * @generated
		 */
		EClass LINK = eINSTANCE.getLink();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__SOURCE = eINSTANCE.getLink_Source();

		/**
		 * The meta object literal for the '<em><b>Target</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__TARGET = eINSTANCE.getLink_Target();

		/**
		 * The meta object literal for the '<em><b>Pdr</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LINK__PDR = eINSTANCE.getLink_Pdr();

		/**
		 * The meta object literal for the '<em><b>Reverse</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference LINK__REVERSE = eINSTANCE.getLink_Reverse();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.examples.lifd.topology.impl.TopologyImpl <em>Topology</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.examples.lifd.topology.impl.TopologyImpl
		 * @see edu.hu.clickwatch.examples.lifd.topology.impl.TopologyPackageImpl#getTopology()
		 * @generated
		 */
		EClass TOPOLOGY = eINSTANCE.getTopology();

		/**
		 * The meta object literal for the '<em><b>Nodes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY__NODES = eINSTANCE.getTopology_Nodes();

		/**
		 * The meta object literal for the '<em><b>Links</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TOPOLOGY__LINKS = eINSTANCE.getTopology_Links();

		/**
		 * The meta object literal for the '{@link edu.hu.clickwatch.examples.lifd.topology.impl.GpsImpl <em>Gps</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see edu.hu.clickwatch.examples.lifd.topology.impl.GpsImpl
		 * @see edu.hu.clickwatch.examples.lifd.topology.impl.TopologyPackageImpl#getGps()
		 * @generated
		 */
		EClass GPS = eINSTANCE.getGps();

		/**
		 * The meta object literal for the '<em><b>Long</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__LONG = eINSTANCE.getGps_Long();

		/**
		 * The meta object literal for the '<em><b>Lat</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute GPS__LAT = eINSTANCE.getGps_Lat();

	}

} //TopologyPackage
