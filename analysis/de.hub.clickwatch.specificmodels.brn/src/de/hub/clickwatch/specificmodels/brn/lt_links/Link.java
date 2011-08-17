/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_links;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Link</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getEContainer_link <em>EContainer link</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getFrom <em>From</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getTo <em>To</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getMetric <em>Metric</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getSeq <em>Seq</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getAge <em>Age</em>}</li>
 * </ul>
 * </p>
 *
 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLink()
 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler/linktable|linktable:Linktable|EObject/link|link:Link|EObject'"
 * @generated
 */
public interface Link extends EObject {
	/**
	 * Returns the value of the '<em><b>EContainer link</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getLink <em>Link</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>EContainer link</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>EContainer link</em>' container reference.
	 * @see #setEContainer_link(Linktable)
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLink_EContainer_link()
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getLink
	 * @model opposite="link" transient="false"
	 * @generated
	 */
	Linktable getEContainer_link();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getEContainer_link <em>EContainer link</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>EContainer link</em>' container reference.
	 * @see #getEContainer_link()
	 * @generated
	 */
	void setEContainer_link(Linktable value);

	/**
	 * Returns the value of the '<em><b>From</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' attribute.
	 * @see #setFrom(String)
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLink_From()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler/linktable|linktable:Linktable|EObject/link|link:Link|EObject/from|from:'"
	 * @generated
	 */
	String getFrom();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getFrom <em>From</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' attribute.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(String value);

	/**
	 * Returns the value of the '<em><b>To</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' attribute.
	 * @see #setTo(String)
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLink_To()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler/linktable|linktable:Linktable|EObject/link|link:Link|EObject/to|to:'"
	 * @generated
	 */
	String getTo();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getTo <em>To</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' attribute.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(String value);

	/**
	 * Returns the value of the '<em><b>Metric</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Metric</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Metric</em>' attribute.
	 * @see #setMetric(int)
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLink_Metric()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler/linktable|linktable:Linktable|EObject/link|link:Link|EObject/metric|metric:'"
	 * @generated
	 */
	int getMetric();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getMetric <em>Metric</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Metric</em>' attribute.
	 * @see #getMetric()
	 * @generated
	 */
	void setMetric(int value);

	/**
	 * Returns the value of the '<em><b>Seq</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Seq</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Seq</em>' attribute.
	 * @see #setSeq(int)
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLink_Seq()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler/linktable|linktable:Linktable|EObject/link|link:Link|EObject/seq|seq:'"
	 * @generated
	 */
	int getSeq();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getSeq <em>Seq</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq</em>' attribute.
	 * @see #getSeq()
	 * @generated
	 */
	void setSeq(int value);

	/**
	 * Returns the value of the '<em><b>Age</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Age</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Age</em>' attribute.
	 * @see #setAge(int)
	 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksPackage#getLink_Age()
	 * @model annotation="http://de.hub.clickwatch.specificmodels target_id='Links|Handler/linktable|linktable:Linktable|EObject/link|link:Link|EObject/age|age:'"
	 * @generated
	 */
	int getAge();

	/**
	 * Sets the value of the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getAge <em>Age</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Age</em>' attribute.
	 * @see #getAge()
	 * @generated
	 */
	void setAge(int value);

} // Link
