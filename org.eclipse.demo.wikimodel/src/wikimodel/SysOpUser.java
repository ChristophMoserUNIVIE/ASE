/**
 */
package wikimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sys Op User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wikimodel.SysOpUser#getRegistereduser <em>Registereduser</em>}</li>
 * </ul>
 *
 * @see wikimodel.WikimodelPackage#getSysOpUser()
 * @model
 * @generated
 */
public interface SysOpUser extends AdminUser, Privilege {
	/**
	 * Returns the value of the '<em><b>Registereduser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Registereduser</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Registereduser</em>' reference.
	 * @see #setRegistereduser(RegisteredUser)
	 * @see wikimodel.WikimodelPackage#getSysOpUser_Registereduser()
	 * @model
	 * @generated
	 */
	RegisteredUser getRegistereduser();

	/**
	 * Sets the value of the '{@link wikimodel.SysOpUser#getRegistereduser <em>Registereduser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Registereduser</em>' reference.
	 * @see #getRegistereduser()
	 * @generated
	 */
	void setRegistereduser(RegisteredUser value);

} // SysOpUser
