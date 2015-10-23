/**
 */
package wikimodel;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Unregistered User</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wikimodel.UnregisteredUser#getIpAddress <em>Ip Address</em>}</li>
 *   <li>{@link wikimodel.UnregisteredUser#getSimpleregistereduser <em>Simpleregistereduser</em>}</li>
 * </ul>
 *
 * @see wikimodel.WikimodelPackage#getUnregisteredUser()
 * @model
 * @generated
 */
public interface UnregisteredUser extends User {
	/**
	 * Returns the value of the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ip Address</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ip Address</em>' attribute.
	 * @see #setIpAddress(char)
	 * @see wikimodel.WikimodelPackage#getUnregisteredUser_IpAddress()
	 * @model
	 * @generated
	 */
	char getIpAddress();

	/**
	 * Sets the value of the '{@link wikimodel.UnregisteredUser#getIpAddress <em>Ip Address</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Ip Address</em>' attribute.
	 * @see #getIpAddress()
	 * @generated
	 */
	void setIpAddress(char value);

	/**
	 * Returns the value of the '<em><b>Simpleregistereduser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Simpleregistereduser</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Simpleregistereduser</em>' reference.
	 * @see #setSimpleregistereduser(SimpleRegisteredUser)
	 * @see wikimodel.WikimodelPackage#getUnregisteredUser_Simpleregistereduser()
	 * @model
	 * @generated
	 */
	SimpleRegisteredUser getSimpleregistereduser();

	/**
	 * Sets the value of the '{@link wikimodel.UnregisteredUser#getSimpleregistereduser <em>Simpleregistereduser</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Simpleregistereduser</em>' reference.
	 * @see #getSimpleregistereduser()
	 * @generated
	 */
	void setSimpleregistereduser(SimpleRegisteredUser value);

} // UnregisteredUser
