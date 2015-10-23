/**
 */
package wikimodel.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import wikimodel.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see wikimodel.WikimodelPackage
 * @generated
 */
public class WikimodelAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static WikimodelPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikimodelAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = WikimodelPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WikimodelSwitch<Adapter> modelSwitch =
		new WikimodelSwitch<Adapter>() {
			@Override
			public Adapter caseContent(Content object) {
				return createContentAdapter();
			}
			@Override
			public Adapter caseHistoryPage(HistoryPage object) {
				return createHistoryPageAdapter();
			}
			@Override
			public Adapter caseUser(User object) {
				return createUserAdapter();
			}
			@Override
			public Adapter caseEncyclopediaEntry(EncyclopediaEntry object) {
				return createEncyclopediaEntryAdapter();
			}
			@Override
			public Adapter caseMedia(Media object) {
				return createMediaAdapter();
			}
			@Override
			public Adapter caseProjectPage(ProjectPage object) {
				return createProjectPageAdapter();
			}
			@Override
			public Adapter caseSimpleRegisteredUser(SimpleRegisteredUser object) {
				return createSimpleRegisteredUserAdapter();
			}
			@Override
			public Adapter caseUnregisteredUser(UnregisteredUser object) {
				return createUnregisteredUserAdapter();
			}
			@Override
			public Adapter caseDiscussionPage(DiscussionPage object) {
				return createDiscussionPageAdapter();
			}
			@Override
			public Adapter caseAutoConfirmedUser(AutoConfirmedUser object) {
				return createAutoConfirmedUserAdapter();
			}
			@Override
			public Adapter caseAdminUser(AdminUser object) {
				return createAdminUserAdapter();
			}
			@Override
			public Adapter caseSysOpUser(SysOpUser object) {
				return createSysOpUserAdapter();
			}
			@Override
			public Adapter caseUserPageProfile(UserPageProfile object) {
				return createUserPageProfileAdapter();
			}
			@Override
			public Adapter caseUserTalkPage(UserTalkPage object) {
				return createUserTalkPageAdapter();
			}
			@Override
			public Adapter caseRegisteredUser(RegisteredUser object) {
				return createRegisteredUserAdapter();
			}
			@Override
			public Adapter casePrivilege(Privilege object) {
				return createPrivilegeAdapter();
			}
			@Override
			public Adapter caseProjectGroup(ProjectGroup object) {
				return createProjectGroupAdapter();
			}
			@Override
			public Adapter caseInterestGroup(InterestGroup object) {
				return createInterestGroupAdapter();
			}
			@Override
			public Adapter caseProjectOrInterestGroup(ProjectOrInterestGroup object) {
				return createProjectOrInterestGroupAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.Content
	 * @generated
	 */
	public Adapter createContentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.HistoryPage <em>History Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.HistoryPage
	 * @generated
	 */
	public Adapter createHistoryPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.User
	 * @generated
	 */
	public Adapter createUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.EncyclopediaEntry <em>Encyclopedia Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.EncyclopediaEntry
	 * @generated
	 */
	public Adapter createEncyclopediaEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.Media
	 * @generated
	 */
	public Adapter createMediaAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.ProjectPage <em>Project Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.ProjectPage
	 * @generated
	 */
	public Adapter createProjectPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.SimpleRegisteredUser <em>Simple Registered User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.SimpleRegisteredUser
	 * @generated
	 */
	public Adapter createSimpleRegisteredUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.UnregisteredUser <em>Unregistered User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.UnregisteredUser
	 * @generated
	 */
	public Adapter createUnregisteredUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.DiscussionPage <em>Discussion Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.DiscussionPage
	 * @generated
	 */
	public Adapter createDiscussionPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.AutoConfirmedUser <em>Auto Confirmed User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.AutoConfirmedUser
	 * @generated
	 */
	public Adapter createAutoConfirmedUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.AdminUser <em>Admin User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.AdminUser
	 * @generated
	 */
	public Adapter createAdminUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.SysOpUser <em>Sys Op User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.SysOpUser
	 * @generated
	 */
	public Adapter createSysOpUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.UserPageProfile <em>User Page Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.UserPageProfile
	 * @generated
	 */
	public Adapter createUserPageProfileAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.UserTalkPage <em>User Talk Page</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.UserTalkPage
	 * @generated
	 */
	public Adapter createUserTalkPageAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.RegisteredUser <em>Registered User</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.RegisteredUser
	 * @generated
	 */
	public Adapter createRegisteredUserAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.Privilege <em>Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.Privilege
	 * @generated
	 */
	public Adapter createPrivilegeAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.ProjectGroup <em>Project Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.ProjectGroup
	 * @generated
	 */
	public Adapter createProjectGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.InterestGroup <em>Interest Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.InterestGroup
	 * @generated
	 */
	public Adapter createInterestGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link wikimodel.ProjectOrInterestGroup <em>Project Or Interest Group</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see wikimodel.ProjectOrInterestGroup
	 * @generated
	 */
	public Adapter createProjectOrInterestGroupAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //WikimodelAdapterFactory
