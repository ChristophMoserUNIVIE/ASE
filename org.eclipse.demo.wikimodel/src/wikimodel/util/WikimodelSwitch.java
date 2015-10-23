/**
 */
package wikimodel.util;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import wikimodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see wikimodel.WikimodelPackage
 * @generated
 */
public class WikimodelSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WikimodelPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikimodelSwitch() {
		if (modelPackage == null) {
			modelPackage = WikimodelPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case WikimodelPackage.CONTENT: {
				Content content = (Content)theEObject;
				T result = caseContent(content);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.HISTORY_PAGE: {
				HistoryPage historyPage = (HistoryPage)theEObject;
				T result = caseHistoryPage(historyPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.USER: {
				User user = (User)theEObject;
				T result = caseUser(user);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.ENCYCLOPEDIA_ENTRY: {
				EncyclopediaEntry encyclopediaEntry = (EncyclopediaEntry)theEObject;
				T result = caseEncyclopediaEntry(encyclopediaEntry);
				if (result == null) result = caseContent(encyclopediaEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.MEDIA: {
				Media media = (Media)theEObject;
				T result = caseMedia(media);
				if (result == null) result = caseContent(media);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.PROJECT_PAGE: {
				ProjectPage projectPage = (ProjectPage)theEObject;
				T result = caseProjectPage(projectPage);
				if (result == null) result = caseContent(projectPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.SIMPLE_REGISTERED_USER: {
				SimpleRegisteredUser simpleRegisteredUser = (SimpleRegisteredUser)theEObject;
				T result = caseSimpleRegisteredUser(simpleRegisteredUser);
				if (result == null) result = casePrivilege(simpleRegisteredUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.UNREGISTERED_USER: {
				UnregisteredUser unregisteredUser = (UnregisteredUser)theEObject;
				T result = caseUnregisteredUser(unregisteredUser);
				if (result == null) result = caseUser(unregisteredUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.DISCUSSION_PAGE: {
				DiscussionPage discussionPage = (DiscussionPage)theEObject;
				T result = caseDiscussionPage(discussionPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.AUTO_CONFIRMED_USER: {
				AutoConfirmedUser autoConfirmedUser = (AutoConfirmedUser)theEObject;
				T result = caseAutoConfirmedUser(autoConfirmedUser);
				if (result == null) result = caseSimpleRegisteredUser(autoConfirmedUser);
				if (result == null) result = casePrivilege(autoConfirmedUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.ADMIN_USER: {
				AdminUser adminUser = (AdminUser)theEObject;
				T result = caseAdminUser(adminUser);
				if (result == null) result = caseAutoConfirmedUser(adminUser);
				if (result == null) result = caseSimpleRegisteredUser(adminUser);
				if (result == null) result = casePrivilege(adminUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.SYS_OP_USER: {
				SysOpUser sysOpUser = (SysOpUser)theEObject;
				T result = caseSysOpUser(sysOpUser);
				if (result == null) result = caseAdminUser(sysOpUser);
				if (result == null) result = caseAutoConfirmedUser(sysOpUser);
				if (result == null) result = caseSimpleRegisteredUser(sysOpUser);
				if (result == null) result = casePrivilege(sysOpUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.USER_PAGE_PROFILE: {
				UserPageProfile userPageProfile = (UserPageProfile)theEObject;
				T result = caseUserPageProfile(userPageProfile);
				if (result == null) result = caseContent(userPageProfile);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.USER_TALK_PAGE: {
				UserTalkPage userTalkPage = (UserTalkPage)theEObject;
				T result = caseUserTalkPage(userTalkPage);
				if (result == null) result = caseContent(userTalkPage);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.REGISTERED_USER: {
				RegisteredUser registeredUser = (RegisteredUser)theEObject;
				T result = caseRegisteredUser(registeredUser);
				if (result == null) result = caseUser(registeredUser);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.PRIVILEGE: {
				Privilege privilege = (Privilege)theEObject;
				T result = casePrivilege(privilege);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.PROJECT_GROUP: {
				ProjectGroup projectGroup = (ProjectGroup)theEObject;
				T result = caseProjectGroup(projectGroup);
				if (result == null) result = caseProjectOrInterestGroup(projectGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.INTEREST_GROUP: {
				InterestGroup interestGroup = (InterestGroup)theEObject;
				T result = caseInterestGroup(interestGroup);
				if (result == null) result = caseProjectOrInterestGroup(interestGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case WikimodelPackage.PROJECT_OR_INTEREST_GROUP: {
				ProjectOrInterestGroup projectOrInterestGroup = (ProjectOrInterestGroup)theEObject;
				T result = caseProjectOrInterestGroup(projectOrInterestGroup);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Content</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Content</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContent(Content object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>History Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>History Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseHistoryPage(HistoryPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUser(User object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Encyclopedia Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Encyclopedia Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseEncyclopediaEntry(EncyclopediaEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Media</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Media</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseMedia(Media object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectPage(ProjectPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Simple Registered User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Simple Registered User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimpleRegisteredUser(SimpleRegisteredUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Unregistered User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Unregistered User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUnregisteredUser(UnregisteredUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Discussion Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Discussion Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDiscussionPage(DiscussionPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Auto Confirmed User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Auto Confirmed User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAutoConfirmedUser(AutoConfirmedUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Admin User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Admin User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdminUser(AdminUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sys Op User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sys Op User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSysOpUser(SysOpUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Page Profile</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Page Profile</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserPageProfile(UserPageProfile object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>User Talk Page</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>User Talk Page</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseUserTalkPage(UserTalkPage object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Registered User</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Registered User</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseRegisteredUser(RegisteredUser object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Privilege</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Privilege</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrivilege(Privilege object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectGroup(ProjectGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Interest Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Interest Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInterestGroup(InterestGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Project Or Interest Group</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Project Or Interest Group</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseProjectOrInterestGroup(ProjectOrInterestGroup object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //WikimodelSwitch
