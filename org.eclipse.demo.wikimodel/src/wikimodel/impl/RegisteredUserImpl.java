/**
 */
package wikimodel.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectResolvingEList;

import wikimodel.Privilege;
import wikimodel.ProjectOrInterestGroup;
import wikimodel.RegisteredUser;
import wikimodel.UserPageProfile;
import wikimodel.UserTalkPage;
import wikimodel.WikimodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Registered User</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wikimodel.impl.RegisteredUserImpl#getUniqueUserName <em>Unique User Name</em>}</li>
 *   <li>{@link wikimodel.impl.RegisteredUserImpl#getPrivilege <em>Privilege</em>}</li>
 *   <li>{@link wikimodel.impl.RegisteredUserImpl#isBlocked <em>Blocked</em>}</li>
 *   <li>{@link wikimodel.impl.RegisteredUserImpl#getUserpageprofile <em>Userpageprofile</em>}</li>
 *   <li>{@link wikimodel.impl.RegisteredUserImpl#getUsertalkpage <em>Usertalkpage</em>}</li>
 *   <li>{@link wikimodel.impl.RegisteredUserImpl#getMemberof <em>Memberof</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RegisteredUserImpl extends UserImpl implements RegisteredUser {
	/**
	 * The default value of the '{@link #getUniqueUserName() <em>Unique User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueUserName()
	 * @generated
	 * @ordered
	 */
	protected static final String UNIQUE_USER_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUniqueUserName() <em>Unique User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUniqueUserName()
	 * @generated
	 * @ordered
	 */
	protected String uniqueUserName = UNIQUE_USER_NAME_EDEFAULT;

	/**
	 * The cached value of the '{@link #getPrivilege() <em>Privilege</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrivilege()
	 * @generated
	 * @ordered
	 */
	protected Privilege privilege;

	/**
	 * The default value of the '{@link #isBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlocked()
	 * @generated
	 * @ordered
	 */
	protected static final boolean BLOCKED_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isBlocked() <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isBlocked()
	 * @generated
	 * @ordered
	 */
	protected boolean blocked = BLOCKED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getUserpageprofile() <em>Userpageprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUserpageprofile()
	 * @generated
	 * @ordered
	 */
	protected UserPageProfile userpageprofile;

	/**
	 * The cached value of the '{@link #getUsertalkpage() <em>Usertalkpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsertalkpage()
	 * @generated
	 * @ordered
	 */
	protected UserTalkPage usertalkpage;

	/**
	 * The cached value of the '{@link #getMemberof() <em>Memberof</em>}' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMemberof()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectOrInterestGroup> memberof;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RegisteredUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikimodelPackage.Literals.REGISTERED_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getUniqueUserName() {
		return uniqueUserName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUniqueUserName(String newUniqueUserName) {
		String oldUniqueUserName = uniqueUserName;
		uniqueUserName = newUniqueUserName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.REGISTERED_USER__UNIQUE_USER_NAME, oldUniqueUserName, uniqueUserName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Privilege getPrivilege() {
		if (privilege != null && privilege.eIsProxy()) {
			InternalEObject oldPrivilege = (InternalEObject)privilege;
			privilege = (Privilege)eResolveProxy(oldPrivilege);
			if (privilege != oldPrivilege) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, WikimodelPackage.REGISTERED_USER__PRIVILEGE, oldPrivilege, privilege));
			}
		}
		return privilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Privilege basicGetPrivilege() {
		return privilege;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrivilege(Privilege newPrivilege) {
		Privilege oldPrivilege = privilege;
		privilege = newPrivilege;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.REGISTERED_USER__PRIVILEGE, oldPrivilege, privilege));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isBlocked() {
		return blocked;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlocked(boolean newBlocked) {
		boolean oldBlocked = blocked;
		blocked = newBlocked;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.REGISTERED_USER__BLOCKED, oldBlocked, blocked));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPageProfile getUserpageprofile() {
		return userpageprofile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUserpageprofile(UserPageProfile newUserpageprofile, NotificationChain msgs) {
		UserPageProfile oldUserpageprofile = userpageprofile;
		userpageprofile = newUserpageprofile;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikimodelPackage.REGISTERED_USER__USERPAGEPROFILE, oldUserpageprofile, newUserpageprofile);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUserpageprofile(UserPageProfile newUserpageprofile) {
		if (newUserpageprofile != userpageprofile) {
			NotificationChain msgs = null;
			if (userpageprofile != null)
				msgs = ((InternalEObject)userpageprofile).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikimodelPackage.REGISTERED_USER__USERPAGEPROFILE, null, msgs);
			if (newUserpageprofile != null)
				msgs = ((InternalEObject)newUserpageprofile).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikimodelPackage.REGISTERED_USER__USERPAGEPROFILE, null, msgs);
			msgs = basicSetUserpageprofile(newUserpageprofile, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.REGISTERED_USER__USERPAGEPROFILE, newUserpageprofile, newUserpageprofile));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTalkPage getUsertalkpage() {
		return usertalkpage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUsertalkpage(UserTalkPage newUsertalkpage, NotificationChain msgs) {
		UserTalkPage oldUsertalkpage = usertalkpage;
		usertalkpage = newUsertalkpage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikimodelPackage.REGISTERED_USER__USERTALKPAGE, oldUsertalkpage, newUsertalkpage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUsertalkpage(UserTalkPage newUsertalkpage) {
		if (newUsertalkpage != usertalkpage) {
			NotificationChain msgs = null;
			if (usertalkpage != null)
				msgs = ((InternalEObject)usertalkpage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikimodelPackage.REGISTERED_USER__USERTALKPAGE, null, msgs);
			if (newUsertalkpage != null)
				msgs = ((InternalEObject)newUsertalkpage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikimodelPackage.REGISTERED_USER__USERTALKPAGE, null, msgs);
			msgs = basicSetUsertalkpage(newUsertalkpage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.REGISTERED_USER__USERTALKPAGE, newUsertalkpage, newUsertalkpage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectOrInterestGroup> getMemberof() {
		if (memberof == null) {
			memberof = new EObjectResolvingEList<ProjectOrInterestGroup>(ProjectOrInterestGroup.class, this, WikimodelPackage.REGISTERED_USER__MEMBEROF);
		}
		return memberof;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WikimodelPackage.REGISTERED_USER__USERPAGEPROFILE:
				return basicSetUserpageprofile(null, msgs);
			case WikimodelPackage.REGISTERED_USER__USERTALKPAGE:
				return basicSetUsertalkpage(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case WikimodelPackage.REGISTERED_USER__UNIQUE_USER_NAME:
				return getUniqueUserName();
			case WikimodelPackage.REGISTERED_USER__PRIVILEGE:
				if (resolve) return getPrivilege();
				return basicGetPrivilege();
			case WikimodelPackage.REGISTERED_USER__BLOCKED:
				return isBlocked();
			case WikimodelPackage.REGISTERED_USER__USERPAGEPROFILE:
				return getUserpageprofile();
			case WikimodelPackage.REGISTERED_USER__USERTALKPAGE:
				return getUsertalkpage();
			case WikimodelPackage.REGISTERED_USER__MEMBEROF:
				return getMemberof();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case WikimodelPackage.REGISTERED_USER__UNIQUE_USER_NAME:
				setUniqueUserName((String)newValue);
				return;
			case WikimodelPackage.REGISTERED_USER__PRIVILEGE:
				setPrivilege((Privilege)newValue);
				return;
			case WikimodelPackage.REGISTERED_USER__BLOCKED:
				setBlocked((Boolean)newValue);
				return;
			case WikimodelPackage.REGISTERED_USER__USERPAGEPROFILE:
				setUserpageprofile((UserPageProfile)newValue);
				return;
			case WikimodelPackage.REGISTERED_USER__USERTALKPAGE:
				setUsertalkpage((UserTalkPage)newValue);
				return;
			case WikimodelPackage.REGISTERED_USER__MEMBEROF:
				getMemberof().clear();
				getMemberof().addAll((Collection<? extends ProjectOrInterestGroup>)newValue);
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
			case WikimodelPackage.REGISTERED_USER__UNIQUE_USER_NAME:
				setUniqueUserName(UNIQUE_USER_NAME_EDEFAULT);
				return;
			case WikimodelPackage.REGISTERED_USER__PRIVILEGE:
				setPrivilege((Privilege)null);
				return;
			case WikimodelPackage.REGISTERED_USER__BLOCKED:
				setBlocked(BLOCKED_EDEFAULT);
				return;
			case WikimodelPackage.REGISTERED_USER__USERPAGEPROFILE:
				setUserpageprofile((UserPageProfile)null);
				return;
			case WikimodelPackage.REGISTERED_USER__USERTALKPAGE:
				setUsertalkpage((UserTalkPage)null);
				return;
			case WikimodelPackage.REGISTERED_USER__MEMBEROF:
				getMemberof().clear();
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
			case WikimodelPackage.REGISTERED_USER__UNIQUE_USER_NAME:
				return UNIQUE_USER_NAME_EDEFAULT == null ? uniqueUserName != null : !UNIQUE_USER_NAME_EDEFAULT.equals(uniqueUserName);
			case WikimodelPackage.REGISTERED_USER__PRIVILEGE:
				return privilege != null;
			case WikimodelPackage.REGISTERED_USER__BLOCKED:
				return blocked != BLOCKED_EDEFAULT;
			case WikimodelPackage.REGISTERED_USER__USERPAGEPROFILE:
				return userpageprofile != null;
			case WikimodelPackage.REGISTERED_USER__USERTALKPAGE:
				return usertalkpage != null;
			case WikimodelPackage.REGISTERED_USER__MEMBEROF:
				return memberof != null && !memberof.isEmpty();
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
		result.append(" (uniqueUserName: ");
		result.append(uniqueUserName);
		result.append(", blocked: ");
		result.append(blocked);
		result.append(')');
		return result.toString();
	}

} //RegisteredUserImpl
