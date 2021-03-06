/**
 */
package org.earthsystemcurator.cupid.esmf.impl;

import org.earthsystemcurator.cupid.esmf.ESMFActionCplCompInitialize;
import org.earthsystemcurator.cupid.esmf.ESMFClock;
import org.earthsystemcurator.cupid.esmf.ESMFCouplerComponent;
import org.earthsystemcurator.cupid.esmf.ESMFPackage;
import org.earthsystemcurator.cupid.esmf.ESMFState;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Cpl Comp Initialize</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompInitializeImpl#getCplcomp <em>Cplcomp</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompInitializeImpl#getImportState <em>Import State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompInitializeImpl#getExportState <em>Export State</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompInitializeImpl#getClock <em>Clock</em>}</li>
 *   <li>{@link org.earthsystemcurator.cupid.esmf.impl.ESMFActionCplCompInitializeImpl#getPhase <em>Phase</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ESMFActionCplCompInitializeImpl extends ESMFActionAPIImpl implements ESMFActionCplCompInitialize {
	/**
	 * The cached value of the '{@link #getCplcomp() <em>Cplcomp</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCplcomp()
	 * @generated
	 * @ordered
	 */
	protected ESMFCouplerComponent cplcomp;

	/**
	 * The cached value of the '{@link #getImportState() <em>Import State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportState()
	 * @generated
	 * @ordered
	 */
	protected ESMFState importState;

	/**
	 * The cached value of the '{@link #getExportState() <em>Export State</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExportState()
	 * @generated
	 * @ordered
	 */
	protected ESMFState exportState;

	/**
	 * The cached value of the '{@link #getClock() <em>Clock</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClock()
	 * @generated
	 * @ordered
	 */
	protected ESMFClock clock;

	/**
	 * The default value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected static final String PHASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPhase() <em>Phase</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPhase()
	 * @generated
	 * @ordered
	 */
	protected String phase = PHASE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ESMFActionCplCompInitializeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ESMFPackage.Literals.ESMF_ACTION_CPL_COMP_INITIALIZE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCouplerComponent getCplcomp() {
		if (cplcomp != null && cplcomp.eIsProxy()) {
			InternalEObject oldCplcomp = (InternalEObject)cplcomp;
			cplcomp = (ESMFCouplerComponent)eResolveProxy(oldCplcomp);
			if (cplcomp != oldCplcomp) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CPLCOMP, oldCplcomp, cplcomp));
			}
		}
		return cplcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFCouplerComponent basicGetCplcomp() {
		return cplcomp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCplcomp(ESMFCouplerComponent newCplcomp) {
		ESMFCouplerComponent oldCplcomp = cplcomp;
		cplcomp = newCplcomp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CPLCOMP, oldCplcomp, cplcomp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState getImportState() {
		if (importState != null && importState.eIsProxy()) {
			InternalEObject oldImportState = (InternalEObject)importState;
			importState = (ESMFState)eResolveProxy(oldImportState);
			if (importState != oldImportState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__IMPORT_STATE, oldImportState, importState));
			}
		}
		return importState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState basicGetImportState() {
		return importState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportState(ESMFState newImportState) {
		ESMFState oldImportState = importState;
		importState = newImportState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__IMPORT_STATE, oldImportState, importState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState getExportState() {
		if (exportState != null && exportState.eIsProxy()) {
			InternalEObject oldExportState = (InternalEObject)exportState;
			exportState = (ESMFState)eResolveProxy(oldExportState);
			if (exportState != oldExportState) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__EXPORT_STATE, oldExportState, exportState));
			}
		}
		return exportState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFState basicGetExportState() {
		return exportState;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExportState(ESMFState newExportState) {
		ESMFState oldExportState = exportState;
		exportState = newExportState;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__EXPORT_STATE, oldExportState, exportState));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFClock getClock() {
		if (clock != null && clock.eIsProxy()) {
			InternalEObject oldClock = (InternalEObject)clock;
			clock = (ESMFClock)eResolveProxy(oldClock);
			if (clock != oldClock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CLOCK, oldClock, clock));
			}
		}
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ESMFClock basicGetClock() {
		return clock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClock(ESMFClock newClock) {
		ESMFClock oldClock = clock;
		clock = newClock;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CLOCK, oldClock, clock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPhase() {
		return phase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPhase(String newPhase) {
		String oldPhase = phase;
		phase = newPhase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__PHASE, oldPhase, phase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CPLCOMP:
				if (resolve) return getCplcomp();
				return basicGetCplcomp();
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__IMPORT_STATE:
				if (resolve) return getImportState();
				return basicGetImportState();
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__EXPORT_STATE:
				if (resolve) return getExportState();
				return basicGetExportState();
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CLOCK:
				if (resolve) return getClock();
				return basicGetClock();
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__PHASE:
				return getPhase();
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
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CPLCOMP:
				setCplcomp((ESMFCouplerComponent)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__IMPORT_STATE:
				setImportState((ESMFState)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__EXPORT_STATE:
				setExportState((ESMFState)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CLOCK:
				setClock((ESMFClock)newValue);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__PHASE:
				setPhase((String)newValue);
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
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CPLCOMP:
				setCplcomp((ESMFCouplerComponent)null);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__IMPORT_STATE:
				setImportState((ESMFState)null);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__EXPORT_STATE:
				setExportState((ESMFState)null);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CLOCK:
				setClock((ESMFClock)null);
				return;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__PHASE:
				setPhase(PHASE_EDEFAULT);
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
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CPLCOMP:
				return cplcomp != null;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__IMPORT_STATE:
				return importState != null;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__EXPORT_STATE:
				return exportState != null;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__CLOCK:
				return clock != null;
			case ESMFPackage.ESMF_ACTION_CPL_COMP_INITIALIZE__PHASE:
				return PHASE_EDEFAULT == null ? phase != null : !PHASE_EDEFAULT.equals(phase);
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
		result.append(" (phase: ");
		result.append(phase);
		result.append(')');
		return result.toString();
	}

} //ESMFActionCplCompInitializeImpl
