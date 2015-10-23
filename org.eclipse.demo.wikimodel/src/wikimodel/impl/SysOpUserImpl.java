/**
 */
package wikimodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wikimodel.RegisteredUser;
import wikimodel.SysOpUser;
import wikimodel.WikimodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Sys Op User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wikimodel.impl.SysOpUserImpl#getRegistereduser <em>Registereduser</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SysOpUserImpl extends AdminUserImpl implements SysOpUser {
	/**
	 * The cached value of the '{@link #getRegistereduser() <em>Registereduser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegistereduser()
	 * @generated
	 * @ordered
	 */
	protected RegisteredUser registereduser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SysOpUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikimodelPackage.Literals.SYS_OP_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredUser getRegistereduser() {
		if (registereduser != null && registereduser.eIsProxy()) {
			InternalEObject oldRegistereduser = (InternalEObject)registereduser;
			registereduser = (RegisteredUser)eResolveProxy(oldRegistereduser);
			if (registereduser != oldRegistereduser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WikimodelPackage.SYS_OP_USER__REGISTEREDUSER, oldRegistereduser, registereduser));
			}
		}
		return registereduser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredUser basicGetRegistereduser() {
		return registereduser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegistereduser(RegisteredUser newRegistereduser) {
		RegisteredUser oldRegistereduser = registereduser;
		registereduser = newRegistereduser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.SYS_OP_USER__REGISTEREDUSER, oldRegistereduser, registereduser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WikimodelPackage.SYS_OP_USER__REGISTEREDUSER:
				if (resolve) return getRegistereduser();
				return basicGetRegistereduser();
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
			case WikimodelPackage.SYS_OP_USER__REGISTEREDUSER:
				setRegistereduser((RegisteredUser)newValue);
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
			case WikimodelPackage.SYS_OP_USER__REGISTEREDUSER:
				setRegistereduser((RegisteredUser)null);
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
			case WikimodelPackage.SYS_OP_USER__REGISTEREDUSER:
				return registereduser != null;
		}
		return super.eIsSet(featureID);
	}

} //SysOpUserImpl
