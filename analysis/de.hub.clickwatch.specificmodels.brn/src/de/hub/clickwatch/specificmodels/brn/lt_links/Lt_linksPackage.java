/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.lt_links;

import de.hub.clickwatch.model.ClickWatchModelPackage;

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
 * @see de.hub.clickwatch.specificmodels.brn.lt_links.Lt_linksFactory
 * @model kind="package"
 *        annotation="http://de.hub.clickwatch.specificmodels handler_class='Links' handler_name='lt/links'"
 * @generated
 */
public interface Lt_linksPackage extends EPackage {
    /**
     * The package name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNAME = "lt_links";

    /**
     * The package namespace URI.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_URI = "http://de.hub.clickwatch.specificmodels.brn/lt/links";

    /**
     * The package namespace name.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    String eNS_PREFIX = "lt_links";

    /**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    Lt_linksPackage eINSTANCE = de.hub.clickwatch.specificmodels.brn.lt_links.impl.Lt_linksPackageImpl.init();

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinkImpl <em>Link</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinkImpl
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.Lt_linksPackageImpl#getLink()
     * @generated
     */
    int LINK = 0;

    /**
     * The feature id for the '<em><b>EContainer link</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__ECONTAINER_LINK = 0;

    /**
     * The feature id for the '<em><b>From</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__FROM = 1;

    /**
     * The feature id for the '<em><b>To</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__TO = 2;

    /**
     * The feature id for the '<em><b>Metric</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__METRIC = 3;

    /**
     * The feature id for the '<em><b>Seq</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__SEQ = 4;

    /**
     * The feature id for the '<em><b>Age</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK__AGE = 5;

    /**
     * The number of structural features of the '<em>Link</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINK_FEATURE_COUNT = 6;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinksImpl <em>Links</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinksImpl
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.Lt_linksPackageImpl#getLinks()
     * @generated
     */
    int LINKS = 1;

    /**
     * The feature id for the '<em><b>Name</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS__NAME = ClickWatchModelPackage.HANDLER__NAME;

    /**
     * The feature id for the '<em><b>Can Read</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS__CAN_READ = ClickWatchModelPackage.HANDLER__CAN_READ;

    /**
     * The feature id for the '<em><b>Can Write</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS__CAN_WRITE = ClickWatchModelPackage.HANDLER__CAN_WRITE;

    /**
     * The feature id for the '<em><b>Changed</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS__CHANGED = ClickWatchModelPackage.HANDLER__CHANGED;

    /**
     * The feature id for the '<em><b>Mixed</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS__MIXED = ClickWatchModelPackage.HANDLER__MIXED;

    /**
     * The feature id for the '<em><b>Any</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS__ANY = ClickWatchModelPackage.HANDLER__ANY;

    /**
     * The feature id for the '<em><b>Value</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS__VALUE = ClickWatchModelPackage.HANDLER__VALUE;

    /**
     * The feature id for the '<em><b>Timestamp</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS__TIMESTAMP = ClickWatchModelPackage.HANDLER__TIMESTAMP;

    /**
     * The feature id for the '<em><b>Linktable</b></em>' containment reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS__LINKTABLE = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 0;

    /**
     * The number of structural features of the '<em>Links</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKS_FEATURE_COUNT = ClickWatchModelPackage.HANDLER_FEATURE_COUNT + 1;

    /**
     * The meta object id for the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinktableImpl <em>Linktable</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinktableImpl
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.Lt_linksPackageImpl#getLinktable()
     * @generated
     */
    int LINKTABLE = 2;

    /**
     * The feature id for the '<em><b>EContainer linktable</b></em>' container reference.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKTABLE__ECONTAINER_LINKTABLE = 0;

    /**
     * The feature id for the '<em><b>Text</b></em>' attribute list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKTABLE__TEXT = 1;

    /**
     * The feature id for the '<em><b>Link</b></em>' containment reference list.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKTABLE__LINK = 2;

    /**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKTABLE__ID = 3;

    /**
     * The number of structural features of the '<em>Linktable</em>' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
    int LINKTABLE_FEATURE_COUNT = 4;


    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link <em>Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Link</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Link
     * @generated
     */
    EClass getLink();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getEContainer_link <em>EContainer link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer link</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Link#getEContainer_link()
     * @see #getLink()
     * @generated
     */
    EReference getLink_EContainer_link();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getFrom <em>From</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>From</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Link#getFrom()
     * @see #getLink()
     * @generated
     */
    EAttribute getLink_From();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getTo <em>To</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>To</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Link#getTo()
     * @see #getLink()
     * @generated
     */
    EAttribute getLink_To();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getMetric <em>Metric</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Metric</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Link#getMetric()
     * @see #getLink()
     * @generated
     */
    EAttribute getLink_Metric();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getSeq <em>Seq</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Seq</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Link#getSeq()
     * @see #getLink()
     * @generated
     */
    EAttribute getLink_Seq();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Link#getAge <em>Age</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Age</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Link#getAge()
     * @see #getLink()
     * @generated
     */
    EAttribute getLink_Age();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Links <em>Links</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Links</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Links
     * @generated
     */
    EClass getLinks();

    /**
     * Returns the meta object for the containment reference '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Links#getLinktable <em>Linktable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference '<em>Linktable</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Links#getLinktable()
     * @see #getLinks()
     * @generated
     */
    EReference getLinks_Linktable();

    /**
     * Returns the meta object for class '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable <em>Linktable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for class '<em>Linktable</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Linktable
     * @generated
     */
    EClass getLinktable();

    /**
     * Returns the meta object for the container reference '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getEContainer_linktable <em>EContainer linktable</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the container reference '<em>EContainer linktable</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getEContainer_linktable()
     * @see #getLinktable()
     * @generated
     */
    EReference getLinktable_EContainer_linktable();

    /**
     * Returns the meta object for the attribute list '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getText <em>Text</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute list '<em>Text</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getText()
     * @see #getLinktable()
     * @generated
     */
    EAttribute getLinktable_Text();

    /**
     * Returns the meta object for the containment reference list '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getLink <em>Link</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Link</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getLink()
     * @see #getLinktable()
     * @generated
     */
    EReference getLinktable_Link();

    /**
     * Returns the meta object for the attribute '{@link de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see de.hub.clickwatch.specificmodels.brn.lt_links.Linktable#getId()
     * @see #getLinktable()
     * @generated
     */
    EAttribute getLinktable_Id();

    /**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
    Lt_linksFactory getLt_linksFactory();

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
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinkImpl <em>Link</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinkImpl
         * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.Lt_linksPackageImpl#getLink()
         * @generated
         */
        EClass LINK = eINSTANCE.getLink();

        /**
         * The meta object literal for the '<em><b>EContainer link</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINK__ECONTAINER_LINK = eINSTANCE.getLink_EContainer_link();

        /**
         * The meta object literal for the '<em><b>From</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINK__FROM = eINSTANCE.getLink_From();

        /**
         * The meta object literal for the '<em><b>To</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINK__TO = eINSTANCE.getLink_To();

        /**
         * The meta object literal for the '<em><b>Metric</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINK__METRIC = eINSTANCE.getLink_Metric();

        /**
         * The meta object literal for the '<em><b>Seq</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINK__SEQ = eINSTANCE.getLink_Seq();

        /**
         * The meta object literal for the '<em><b>Age</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINK__AGE = eINSTANCE.getLink_Age();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinksImpl <em>Links</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinksImpl
         * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.Lt_linksPackageImpl#getLinks()
         * @generated
         */
        EClass LINKS = eINSTANCE.getLinks();

        /**
         * The meta object literal for the '<em><b>Linktable</b></em>' containment reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKS__LINKTABLE = eINSTANCE.getLinks_Linktable();

        /**
         * The meta object literal for the '{@link de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinktableImpl <em>Linktable</em>}' class.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.LinktableImpl
         * @see de.hub.clickwatch.specificmodels.brn.lt_links.impl.Lt_linksPackageImpl#getLinktable()
         * @generated
         */
        EClass LINKTABLE = eINSTANCE.getLinktable();

        /**
         * The meta object literal for the '<em><b>EContainer linktable</b></em>' container reference feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKTABLE__ECONTAINER_LINKTABLE = eINSTANCE.getLinktable_EContainer_linktable();

        /**
         * The meta object literal for the '<em><b>Text</b></em>' attribute list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINKTABLE__TEXT = eINSTANCE.getLinktable_Text();

        /**
         * The meta object literal for the '<em><b>Link</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EReference LINKTABLE__LINK = eINSTANCE.getLinktable_Link();

        /**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
         * <!-- end-user-doc -->
         * @generated
         */
        EAttribute LINKTABLE__ID = eINSTANCE.getLinktable_Id();

    }

} //Lt_linksPackage
