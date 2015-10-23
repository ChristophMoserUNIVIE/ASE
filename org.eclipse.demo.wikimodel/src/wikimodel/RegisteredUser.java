/**
 */
package wikimodel;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Registered User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wikimodel.RegisteredUser#getUniqueUserName <em>Unique User Name</em>}</li>
 *   <li>{@link wikimodel.RegisteredUser#getPrivilege <em>Privilege</em>}</li>
 *   <li>{@link wikimodel.RegisteredUser#isBlocked <em>Blocked</em>}</li>
 *   <li>{@link wikimodel.RegisteredUser#getUserpageprofile <em>Userpageprofile</em>}</li>
 *   <li>{@link wikimodel.RegisteredUser#getUsertalkpage <em>Usertalkpage</em>}</li>
 *   <li>{@link wikimodel.RegisteredUser#getMemberof <em>Memberof</em>}</li>
 * </ul>
 *
 * @see wikimodel.WikimodelPackage#getRegisteredUser()
 * @model
 * @generated
 */
public interface RegisteredUser extends User {
	/**
	 * Returns the value of the '<em><b>Unique User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unique User Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unique User Name</em>' attribute.
	 * @see #setUniqueUserName(String)
	 * @see wikimodel.WikimodelPackage#getRegisteredUser_UniqueUserName()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.ID"
	 * @generated
	 */
	String getUniqueUserName();

	/**
	 * Sets the value of the '{@link wikimodel.RegisteredUser#getUniqueUserName <em>Unique User Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Unique User Name</em>' attribute.
	 * @see #getUniqueUserName()
	 * @generated
	 */
	void setUniqueUserName(String value);

	/**
	 * Returns the value of the '<em><b>Privilege</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Privilege</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Privilege</em>' reference.
	 * @see #setPrivilege(Privilege)
	 * @see wikimodel.WikimodelPackage#getRegisteredUser_Privilege()
	 * @model required="true"
	 * @generated
	 */
	Privilege getPrivilege();

	/**
	 * Sets the value of the '{@link wikimodel.RegisteredUser#getPrivilege <em>Privilege</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Privilege</em>' reference.
	 * @see #getPrivilege()
	 * @generated
	 */
	void setPrivilege(Privilege value);

	/**
	 * Returns the value of the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Blocked</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Blocked</em>' attribute.
	 * @see #setBlocked(boolean)
	 * @see wikimodel.WikimodelPackage#getRegisteredUser_Blocked()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.Boolean"
	 * @generated
	 */
	boolean isBlocked();

	/**
	 * Sets the value of the '{@link wikimodel.RegisteredUser#isBlocked <em>Blocked</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Blocked</em>' attribute.
	 * @see #isBlocked()
	 * @generated
	 */
	void setBlocked(boolean value);

	/**
	 * Returns the value of the '<em><b>Userpageprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Userpageprofile</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Userpageprofile</em>' containment reference.
	 * @see #setUserpageprofile(UserPageProfile)
	 * @see wikimodel.WikimodelPackage#getRegisteredUser_Userpageprofile()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UserPageProfile getUserpageprofile();

	/**
	 * Sets the value of the '{@link wikimodel.RegisteredUser#getUserpageprofile <em>Userpageprofile</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Userpageprofile</em>' containment reference.
	 * @see #getUserpageprofile()
	 * @generated
	 */
	void setUserpageprofile(UserPageProfile value);

	/**
	 * Returns the value of the '<em><b>Usertalkpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usertalkpage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usertalkpage</em>' containment reference.
	 * @see #setUsertalkpage(UserTalkPage)
	 * @see wikimodel.WikimodelPackage#getRegisteredUser_Usertalkpage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	UserTalkPage getUsertalkpage();

	/**
	 * Sets the value of the '{@link wikimodel.RegisteredUser#getUsertalkpage <em>Usertalkpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Usertalkpage</em>' containment reference.
	 * @see #getUsertalkpage()
	 * @generated
	 */
	void setUsertalkpage(UserTalkPage value);

	/**
	 * Returns the value of the '<em><b>Memberof</b></em>' reference list.
	 * The list contents are of type {@link wikimodel.ProjectOrInterestGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Memberof</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Memberof</em>' reference list.
	 * @see wikimodel.WikimodelPackage#getRegisteredUser_Memberof()
	 * @model
	 * @generated
	 */
	EList<ProjectOrInterestGroup> getMemberof();

} // RegisteredUser
