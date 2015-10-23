/**
 */
package wikimodel.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import wikimodel.SimpleRegisteredUser;
import wikimodel.UnregisteredUser;
import wikimodel.WikimodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Unregistered User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wikimodel.impl.UnregisteredUserImpl#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link wikimodel.impl.UnregisteredUserImpl#getSimpleregistereduser <em>Simpleregistereduser</em>}</li>
 * </ul>
 *
 * @generated
 */
public class UnregisteredUserImpl extends UserImpl implements UnregisteredUser {
	/**
	 * The default value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected static final char IP_ADDRESS_EDEFAULT = '\u0000';

	/**
	 * The cached value of the '{@link #getIpAddress() <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIpAddress()
	 * @generated
	 * @ordered
	 */
	protected char ipAddress = IP_ADDRESS_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSimpleregistereduser() <em>Simpleregistereduser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSimpleregistereduser()
	 * @generated
	 * @ordered
	 */
	protected SimpleRegisteredUser simpleregistereduser;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected UnregisteredUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikimodelPackage.Literals.UNREGISTERED_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public char getIpAddress() {
		return ipAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIpAddress(char newIpAddress) {
		char oldIpAddress = ipAddress;
		ipAddress = newIpAddress;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.UNREGISTERED_USER__IP_ADDRESS, oldIpAddress, ipAddress));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRegisteredUser getSimpleregistereduser() {
		if (simpleregistereduser != null && simpleregistereduser.eIsProxy()) {
			InternalEObject oldSimpleregistereduser = (InternalEObject)simpleregistereduser;
			simpleregistereduser = (SimpleRegisteredUser)eResolveProxy(oldSimpleregistereduser);
			if (simpleregistereduser != oldSimpleregistereduser) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WikimodelPackage.UNREGISTERED_USER__SIMPLEREGISTEREDUSER, oldSimpleregistereduser, simpleregistereduser));
			}
		}
		return simpleregistereduser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRegisteredUser basicGetSimpleregistereduser() {
		return simpleregistereduser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSimpleregistereduser(SimpleRegisteredUser newSimpleregistereduser) {
		SimpleRegisteredUser oldSimpleregistereduser = simpleregistereduser;
		simpleregistereduser = newSimpleregistereduser;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.UNREGISTERED_USER__SIMPLEREGISTEREDUSER, oldSimpleregistereduser, simpleregistereduser));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WikimodelPackage.UNREGISTERED_USER__IP_ADDRESS:
				return getIpAddress();
			case WikimodelPackage.UNREGISTERED_USER__SIMPLEREGISTEREDUSER:
				if (resolve) return getSimpleregistereduser();
				return basicGetSimpleregistereduser();
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
			case WikimodelPackage.UNREGISTERED_USER__IP_ADDRESS:
				setIpAddress((Character)newValue);
				return;
			case WikimodelPackage.UNREGISTERED_USER__SIMPLEREGISTEREDUSER:
				setSimpleregistereduser((SimpleRegisteredUser)newValue);
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
			case WikimodelPackage.UNREGISTERED_USER__IP_ADDRESS:
				setIpAddress(IP_ADDRESS_EDEFAULT);
				return;
			case WikimodelPackage.UNREGISTERED_USER__SIMPLEREGISTEREDUSER:
				setSimpleregistereduser((SimpleRegisteredUser)null);
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
			case WikimodelPackage.UNREGISTERED_USER__IP_ADDRESS:
				return ipAddress != IP_ADDRESS_EDEFAULT;
			case WikimodelPackage.UNREGISTERED_USER__SIMPLEREGISTEREDUSER:
				return simpleregistereduser != null;
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
		result.append(" (ipAddress: ");
		result.append(ipAddress);
		result.append(')');
		return result.toString();
	}

} //UnregisteredUserImpl
