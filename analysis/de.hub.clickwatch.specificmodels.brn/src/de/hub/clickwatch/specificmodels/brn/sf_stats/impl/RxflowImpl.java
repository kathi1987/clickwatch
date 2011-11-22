/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package de.hub.clickwatch.specificmodels.brn.sf_stats.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import de.hub.clickwatch.specificmodels.brn.sf_stats.Flowstats;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Rxflow;
import de.hub.clickwatch.specificmodels.brn.sf_stats.Sf_statsPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rxflow</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl#getEContainer_rxflow <em>EContainer rxflow</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl#getSrc <em>Src</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl#getDst <em>Dst</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl#getFlowid <em>Flowid</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl#getPacket_count <em>Packet count</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl#getPacket_size <em>Packet size</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl#getCrc_err <em>Crc err</em>}</li>
 *   <li>{@link de.hub.clickwatch.specificmodels.brn.sf_stats.impl.RxflowImpl#getAvg_hops <em>Avg hops</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class RxflowImpl extends EObjectImpl implements Rxflow {
    /**
     * The default value of the '{@link #getSrc() <em>Src</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrc()
     * @generated
     * @ordered
     */
    protected static final String SRC_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getSrc() <em>Src</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getSrc()
     * @generated
     * @ordered
     */
    protected String src = SRC_EDEFAULT;

    /**
     * The default value of the '{@link #getDst() <em>Dst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDst()
     * @generated
     * @ordered
     */
    protected static final String DST_EDEFAULT = null;

    /**
     * The cached value of the '{@link #getDst() <em>Dst</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getDst()
     * @generated
     * @ordered
     */
    protected String dst = DST_EDEFAULT;

    /**
     * The default value of the '{@link #getFlowid() <em>Flowid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowid()
     * @generated
     * @ordered
     */
    protected static final int FLOWID_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getFlowid() <em>Flowid</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getFlowid()
     * @generated
     * @ordered
     */
    protected int flowid = FLOWID_EDEFAULT;

    /**
     * The default value of the '{@link #getPacket_count() <em>Packet count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPacket_count()
     * @generated
     * @ordered
     */
    protected static final int PACKET_COUNT_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPacket_count() <em>Packet count</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPacket_count()
     * @generated
     * @ordered
     */
    protected int packet_count = PACKET_COUNT_EDEFAULT;

    /**
     * The default value of the '{@link #getPacket_size() <em>Packet size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPacket_size()
     * @generated
     * @ordered
     */
    protected static final int PACKET_SIZE_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getPacket_size() <em>Packet size</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getPacket_size()
     * @generated
     * @ordered
     */
    protected int packet_size = PACKET_SIZE_EDEFAULT;

    /**
     * The default value of the '{@link #getCrc_err() <em>Crc err</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrc_err()
     * @generated
     * @ordered
     */
    protected static final int CRC_ERR_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getCrc_err() <em>Crc err</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getCrc_err()
     * @generated
     * @ordered
     */
    protected int crc_err = CRC_ERR_EDEFAULT;

    /**
     * The default value of the '{@link #getAvg_hops() <em>Avg hops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAvg_hops()
     * @generated
     * @ordered
     */
    protected static final int AVG_HOPS_EDEFAULT = 0;

    /**
     * The cached value of the '{@link #getAvg_hops() <em>Avg hops</em>}' attribute.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see #getAvg_hops()
     * @generated
     * @ordered
     */
    protected int avg_hops = AVG_HOPS_EDEFAULT;

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    protected RxflowImpl() {
        super();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    protected EClass eStaticClass() {
        return Sf_statsPackage.Literals.RXFLOW;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public Flowstats getEContainer_rxflow() {
        if (eContainerFeatureID() != Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW) return null;
        return (Flowstats)eContainer();
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public NotificationChain basicSetEContainer_rxflow(Flowstats newEContainer_rxflow, NotificationChain msgs) {
        msgs = eBasicSetContainer((InternalEObject)newEContainer_rxflow, Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW, msgs);
        return msgs;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setEContainer_rxflow(Flowstats newEContainer_rxflow) {
        if (newEContainer_rxflow != eInternalContainer() || (eContainerFeatureID() != Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW && newEContainer_rxflow != null)) {
            if (EcoreUtil.isAncestor(this, newEContainer_rxflow))
                throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
            NotificationChain msgs = null;
            if (eInternalContainer() != null)
                msgs = eBasicRemoveFromContainer(msgs);
            if (newEContainer_rxflow != null)
                msgs = ((InternalEObject)newEContainer_rxflow).eInverseAdd(this, Sf_statsPackage.FLOWSTATS__RXFLOW, Flowstats.class, msgs);
            msgs = basicSetEContainer_rxflow(newEContainer_rxflow, msgs);
            if (msgs != null) msgs.dispatch();
        }
        else if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW, newEContainer_rxflow, newEContainer_rxflow));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getSrc() {
        return src;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setSrc(String newSrc) {
        String oldSrc = src;
        src = newSrc;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sf_statsPackage.RXFLOW__SRC, oldSrc, src));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public String getDst() {
        return dst;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setDst(String newDst) {
        String oldDst = dst;
        dst = newDst;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sf_statsPackage.RXFLOW__DST, oldDst, dst));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getFlowid() {
        return flowid;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setFlowid(int newFlowid) {
        int oldFlowid = flowid;
        flowid = newFlowid;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sf_statsPackage.RXFLOW__FLOWID, oldFlowid, flowid));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPacket_count() {
        return packet_count;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPacket_count(int newPacket_count) {
        int oldPacket_count = packet_count;
        packet_count = newPacket_count;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sf_statsPackage.RXFLOW__PACKET_COUNT, oldPacket_count, packet_count));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getPacket_size() {
        return packet_size;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setPacket_size(int newPacket_size) {
        int oldPacket_size = packet_size;
        packet_size = newPacket_size;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sf_statsPackage.RXFLOW__PACKET_SIZE, oldPacket_size, packet_size));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getCrc_err() {
        return crc_err;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setCrc_err(int newCrc_err) {
        int oldCrc_err = crc_err;
        crc_err = newCrc_err;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sf_statsPackage.RXFLOW__CRC_ERR, oldCrc_err, crc_err));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public int getAvg_hops() {
        return avg_hops;
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    public void setAvg_hops(int newAvg_hops) {
        int oldAvg_hops = avg_hops;
        avg_hops = newAvg_hops;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, Sf_statsPackage.RXFLOW__AVG_HOPS, oldAvg_hops, avg_hops));
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW:
                if (eInternalContainer() != null)
                    msgs = eBasicRemoveFromContainer(msgs);
                return basicSetEContainer_rxflow((Flowstats)otherEnd, msgs);
        }
        return super.eInverseAdd(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW:
                return basicSetEContainer_rxflow(null, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
        switch (eContainerFeatureID()) {
            case Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW:
                return eInternalContainer().eInverseRemove(this, Sf_statsPackage.FLOWSTATS__RXFLOW, Flowstats.class, msgs);
        }
        return super.eBasicRemoveFromContainerFeature(msgs);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW:
                return getEContainer_rxflow();
            case Sf_statsPackage.RXFLOW__SRC:
                return getSrc();
            case Sf_statsPackage.RXFLOW__DST:
                return getDst();
            case Sf_statsPackage.RXFLOW__FLOWID:
                return getFlowid();
            case Sf_statsPackage.RXFLOW__PACKET_COUNT:
                return getPacket_count();
            case Sf_statsPackage.RXFLOW__PACKET_SIZE:
                return getPacket_size();
            case Sf_statsPackage.RXFLOW__CRC_ERR:
                return getCrc_err();
            case Sf_statsPackage.RXFLOW__AVG_HOPS:
                return getAvg_hops();
        }
        return super.eGet(featureID, resolve, coreType);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW:
                setEContainer_rxflow((Flowstats)newValue);
                return;
            case Sf_statsPackage.RXFLOW__SRC:
                setSrc((String)newValue);
                return;
            case Sf_statsPackage.RXFLOW__DST:
                setDst((String)newValue);
                return;
            case Sf_statsPackage.RXFLOW__FLOWID:
                setFlowid((Integer)newValue);
                return;
            case Sf_statsPackage.RXFLOW__PACKET_COUNT:
                setPacket_count((Integer)newValue);
                return;
            case Sf_statsPackage.RXFLOW__PACKET_SIZE:
                setPacket_size((Integer)newValue);
                return;
            case Sf_statsPackage.RXFLOW__CRC_ERR:
                setCrc_err((Integer)newValue);
                return;
            case Sf_statsPackage.RXFLOW__AVG_HOPS:
                setAvg_hops((Integer)newValue);
                return;
        }
        super.eSet(featureID, newValue);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public void eUnset(int featureID) {
        switch (featureID) {
            case Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW:
                setEContainer_rxflow((Flowstats)null);
                return;
            case Sf_statsPackage.RXFLOW__SRC:
                setSrc(SRC_EDEFAULT);
                return;
            case Sf_statsPackage.RXFLOW__DST:
                setDst(DST_EDEFAULT);
                return;
            case Sf_statsPackage.RXFLOW__FLOWID:
                setFlowid(FLOWID_EDEFAULT);
                return;
            case Sf_statsPackage.RXFLOW__PACKET_COUNT:
                setPacket_count(PACKET_COUNT_EDEFAULT);
                return;
            case Sf_statsPackage.RXFLOW__PACKET_SIZE:
                setPacket_size(PACKET_SIZE_EDEFAULT);
                return;
            case Sf_statsPackage.RXFLOW__CRC_ERR:
                setCrc_err(CRC_ERR_EDEFAULT);
                return;
            case Sf_statsPackage.RXFLOW__AVG_HOPS:
                setAvg_hops(AVG_HOPS_EDEFAULT);
                return;
        }
        super.eUnset(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public boolean eIsSet(int featureID) {
        switch (featureID) {
            case Sf_statsPackage.RXFLOW__ECONTAINER_RXFLOW:
                return getEContainer_rxflow() != null;
            case Sf_statsPackage.RXFLOW__SRC:
                return SRC_EDEFAULT == null ? src != null : !SRC_EDEFAULT.equals(src);
            case Sf_statsPackage.RXFLOW__DST:
                return DST_EDEFAULT == null ? dst != null : !DST_EDEFAULT.equals(dst);
            case Sf_statsPackage.RXFLOW__FLOWID:
                return flowid != FLOWID_EDEFAULT;
            case Sf_statsPackage.RXFLOW__PACKET_COUNT:
                return packet_count != PACKET_COUNT_EDEFAULT;
            case Sf_statsPackage.RXFLOW__PACKET_SIZE:
                return packet_size != PACKET_SIZE_EDEFAULT;
            case Sf_statsPackage.RXFLOW__CRC_ERR:
                return crc_err != CRC_ERR_EDEFAULT;
            case Sf_statsPackage.RXFLOW__AVG_HOPS:
                return avg_hops != AVG_HOPS_EDEFAULT;
        }
        return super.eIsSet(featureID);
    }

    /**
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @generated
     */
    @Override
    public String toString() {
        if (eIsProxy()) return super.toString();

        StringBuffer result = new StringBuffer(super.toString());
        result.append(" (src: ");
        result.append(src);
        result.append(", dst: ");
        result.append(dst);
        result.append(", flowid: ");
        result.append(flowid);
        result.append(", packet_count: ");
        result.append(packet_count);
        result.append(", packet_size: ");
        result.append(packet_size);
        result.append(", crc_err: ");
        result.append(crc_err);
        result.append(", avg_hops: ");
        result.append(avg_hops);
        result.append(')');
        return result.toString();
    }

} //RxflowImpl
