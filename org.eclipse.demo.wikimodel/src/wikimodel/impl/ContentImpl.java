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
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import wikimodel.Content;
import wikimodel.DiscussionPage;
import wikimodel.HistoryPage;
import wikimodel.ProjectOrInterestGroup;
import wikimodel.WikimodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link wikimodel.impl.ContentImpl#getName <em>Name</em>}</li>
 *   <li>{@link wikimodel.impl.ContentImpl#isPublicContent <em>Public Content</em>}</li>
 *   <li>{@link wikimodel.impl.ContentImpl#getHistorypage <em>Historypage</em>}</li>
 *   <li>{@link wikimodel.impl.ContentImpl#getDiscussionpage <em>Discussionpage</em>}</li>
 *   <li>{@link wikimodel.impl.ContentImpl#getBelongsto <em>Belongsto</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class ContentImpl extends MinimalEObjectImpl.Container implements Content {
	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #isPublicContent() <em>Public Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicContent()
	 * @generated
	 * @ordered
	 */
	protected static final boolean PUBLIC_CONTENT_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isPublicContent() <em>Public Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isPublicContent()
	 * @generated
	 * @ordered
	 */
	protected boolean publicContent = PUBLIC_CONTENT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHistorypage() <em>Historypage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHistorypage()
	 * @generated
	 * @ordered
	 */
	protected HistoryPage historypage;

	/**
	 * The cached value of the '{@link #getDiscussionpage() <em>Discussionpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiscussionpage()
	 * @generated
	 * @ordered
	 */
	protected DiscussionPage discussionpage;

	/**
	 * The cached value of the '{@link #getBelongsto() <em>Belongsto</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBelongsto()
	 * @generated
	 * @ordered
	 */
	protected EList<ProjectOrInterestGroup> belongsto;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ContentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikimodelPackage.Literals.CONTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.CONTENT__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isPublicContent() {
		return publicContent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPublicContent(boolean newPublicContent) {
		boolean oldPublicContent = publicContent;
		publicContent = newPublicContent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.CONTENT__PUBLIC_CONTENT, oldPublicContent, publicContent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryPage getHistorypage() {
		return historypage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHistorypage(HistoryPage newHistorypage, NotificationChain msgs) {
		HistoryPage oldHistorypage = historypage;
		historypage = newHistorypage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikimodelPackage.CONTENT__HISTORYPAGE, oldHistorypage, newHistorypage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHistorypage(HistoryPage newHistorypage) {
		if (newHistorypage != historypage) {
			NotificationChain msgs = null;
			if (historypage != null)
				msgs = ((InternalEObject)historypage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikimodelPackage.CONTENT__HISTORYPAGE, null, msgs);
			if (newHistorypage != null)
				msgs = ((InternalEObject)newHistorypage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikimodelPackage.CONTENT__HISTORYPAGE, null, msgs);
			msgs = basicSetHistorypage(newHistorypage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.CONTENT__HISTORYPAGE, newHistorypage, newHistorypage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionPage getDiscussionpage() {
		return discussionpage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDiscussionpage(DiscussionPage newDiscussionpage, NotificationChain msgs) {
		DiscussionPage oldDiscussionpage = discussionpage;
		discussionpage = newDiscussionpage;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, WikimodelPackage.CONTENT__DISCUSSIONPAGE, oldDiscussionpage, newDiscussionpage);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDiscussionpage(DiscussionPage newDiscussionpage) {
		if (newDiscussionpage != discussionpage) {
			NotificationChain msgs = null;
			if (discussionpage != null)
				msgs = ((InternalEObject)discussionpage).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - WikimodelPackage.CONTENT__DISCUSSIONPAGE, null, msgs);
			if (newDiscussionpage != null)
				msgs = ((InternalEObject)newDiscussionpage).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - WikimodelPackage.CONTENT__DISCUSSIONPAGE, null, msgs);
			msgs = basicSetDiscussionpage(newDiscussionpage, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, WikimodelPackage.CONTENT__DISCUSSIONPAGE, newDiscussionpage, newDiscussionpage));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProjectOrInterestGroup> getBelongsto() {
		if (belongsto == null) {
			belongsto = new EObjectContainmentEList<ProjectOrInterestGroup>(ProjectOrInterestGroup.class, this, WikimodelPackage.CONTENT__BELONGSTO);
		}
		return belongsto;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case WikimodelPackage.CONTENT__HISTORYPAGE:
				return basicSetHistorypage(null, msgs);
			case WikimodelPackage.CONTENT__DISCUSSIONPAGE:
				return basicSetDiscussionpage(null, msgs);
			case WikimodelPackage.CONTENT__BELONGSTO:
				return ((InternalEList<?>)getBelongsto()).basicRemove(otherEnd, msgs);
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
			case WikimodelPackage.CONTENT__NAME:
				return getName();
			case WikimodelPackage.CONTENT__PUBLIC_CONTENT:
				return isPublicContent();
			case WikimodelPackage.CONTENT__HISTORYPAGE:
				return getHistorypage();
			case WikimodelPackage.CONTENT__DISCUSSIONPAGE:
				return getDiscussionpage();
			case WikimodelPackage.CONTENT__BELONGSTO:
				return getBelongsto();
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
			case WikimodelPackage.CONTENT__NAME:
				setName((String)newValue);
				return;
			case WikimodelPackage.CONTENT__PUBLIC_CONTENT:
				setPublicContent((Boolean)newValue);
				return;
			case WikimodelPackage.CONTENT__HISTORYPAGE:
				setHistorypage((HistoryPage)newValue);
				return;
			case WikimodelPackage.CONTENT__DISCUSSIONPAGE:
				setDiscussionpage((DiscussionPage)newValue);
				return;
			case WikimodelPackage.CONTENT__BELONGSTO:
				getBelongsto().clear();
				getBelongsto().addAll((Collection<? extends ProjectOrInterestGroup>)newValue);
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
			case WikimodelPackage.CONTENT__NAME:
				setName(NAME_EDEFAULT);
				return;
			case WikimodelPackage.CONTENT__PUBLIC_CONTENT:
				setPublicContent(PUBLIC_CONTENT_EDEFAULT);
				return;
			case WikimodelPackage.CONTENT__HISTORYPAGE:
				setHistorypage((HistoryPage)null);
				return;
			case WikimodelPackage.CONTENT__DISCUSSIONPAGE:
				setDiscussionpage((DiscussionPage)null);
				return;
			case WikimodelPackage.CONTENT__BELONGSTO:
				getBelongsto().clear();
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
			case WikimodelPackage.CONTENT__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case WikimodelPackage.CONTENT__PUBLIC_CONTENT:
				return publicContent != PUBLIC_CONTENT_EDEFAULT;
			case WikimodelPackage.CONTENT__HISTORYPAGE:
				return historypage != null;
			case WikimodelPackage.CONTENT__DISCUSSIONPAGE:
				return discussionpage != null;
			case WikimodelPackage.CONTENT__BELONGSTO:
				return belongsto != null && !belongsto.isEmpty();
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
		result.append(" (name: ");
		result.append(name);
		result.append(", publicContent: ");
		result.append(publicContent);
		result.append(')');
		return result.toString();
	}

} //ContentImpl
