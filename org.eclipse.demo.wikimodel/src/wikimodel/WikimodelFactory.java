/**
 */
package wikimodel;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see wikimodel.WikimodelPackage
 * @generated
 */
public interface WikimodelFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WikimodelFactory eINSTANCE = wikimodel.impl.WikimodelFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>History Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>History Page</em>'.
	 * @generated
	 */
	HistoryPage createHistoryPage();

	/**
	 * Returns a new object of class '<em>Encyclopedia Entry</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Encyclopedia Entry</em>'.
	 * @generated
	 */
	EncyclopediaEntry createEncyclopediaEntry();

	/**
	 * Returns a new object of class '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Media</em>'.
	 * @generated
	 */
	Media createMedia();

	/**
	 * Returns a new object of class '<em>Project Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Page</em>'.
	 * @generated
	 */
	ProjectPage createProjectPage();

	/**
	 * Returns a new object of class '<em>Simple Registered User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Simple Registered User</em>'.
	 * @generated
	 */
	SimpleRegisteredUser createSimpleRegisteredUser();

	/**
	 * Returns a new object of class '<em>Unregistered User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Unregistered User</em>'.
	 * @generated
	 */
	UnregisteredUser createUnregisteredUser();

	/**
	 * Returns a new object of class '<em>Discussion Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Discussion Page</em>'.
	 * @generated
	 */
	DiscussionPage createDiscussionPage();

	/**
	 * Returns a new object of class '<em>Auto Confirmed User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Auto Confirmed User</em>'.
	 * @generated
	 */
	AutoConfirmedUser createAutoConfirmedUser();

	/**
	 * Returns a new object of class '<em>Admin User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Admin User</em>'.
	 * @generated
	 */
	AdminUser createAdminUser();

	/**
	 * Returns a new object of class '<em>Sys Op User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Sys Op User</em>'.
	 * @generated
	 */
	SysOpUser createSysOpUser();

	/**
	 * Returns a new object of class '<em>User Page Profile</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Page Profile</em>'.
	 * @generated
	 */
	UserPageProfile createUserPageProfile();

	/**
	 * Returns a new object of class '<em>User Talk Page</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>User Talk Page</em>'.
	 * @generated
	 */
	UserTalkPage createUserTalkPage();

	/**
	 * Returns a new object of class '<em>Registered User</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Registered User</em>'.
	 * @generated
	 */
	RegisteredUser createRegisteredUser();

	/**
	 * Returns a new object of class '<em>Project Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Project Group</em>'.
	 * @generated
	 */
	ProjectGroup createProjectGroup();

	/**
	 * Returns a new object of class '<em>Interest Group</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Interest Group</em>'.
	 * @generated
	 */
	InterestGroup createInterestGroup();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	WikimodelPackage getWikimodelPackage();

} //WikimodelFactory
