/**
 */
package wikimodel.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import wikimodel.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WikimodelFactoryImpl extends EFactoryImpl implements WikimodelFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WikimodelFactory init() {
		try {
			WikimodelFactory theWikimodelFactory = (WikimodelFactory)EPackage.Registry.INSTANCE.getEFactory(WikimodelPackage.eNS_URI);
			if (theWikimodelFactory != null) {
				return theWikimodelFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new WikimodelFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikimodelFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case WikimodelPackage.HISTORY_PAGE: return createHistoryPage();
			case WikimodelPackage.ENCYCLOPEDIA_ENTRY: return createEncyclopediaEntry();
			case WikimodelPackage.MEDIA: return createMedia();
			case WikimodelPackage.PROJECT_PAGE: return createProjectPage();
			case WikimodelPackage.SIMPLE_REGISTERED_USER: return createSimpleRegisteredUser();
			case WikimodelPackage.UNREGISTERED_USER: return createUnregisteredUser();
			case WikimodelPackage.DISCUSSION_PAGE: return createDiscussionPage();
			case WikimodelPackage.AUTO_CONFIRMED_USER: return createAutoConfirmedUser();
			case WikimodelPackage.ADMIN_USER: return createAdminUser();
			case WikimodelPackage.SYS_OP_USER: return createSysOpUser();
			case WikimodelPackage.USER_PAGE_PROFILE: return createUserPageProfile();
			case WikimodelPackage.USER_TALK_PAGE: return createUserTalkPage();
			case WikimodelPackage.REGISTERED_USER: return createRegisteredUser();
			case WikimodelPackage.PROJECT_GROUP: return createProjectGroup();
			case WikimodelPackage.INTEREST_GROUP: return createInterestGroup();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryPage createHistoryPage() {
		HistoryPageImpl historyPage = new HistoryPageImpl();
		return historyPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncyclopediaEntry createEncyclopediaEntry() {
		EncyclopediaEntryImpl encyclopediaEntry = new EncyclopediaEntryImpl();
		return encyclopediaEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Media createMedia() {
		MediaImpl media = new MediaImpl();
		return media;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectPage createProjectPage() {
		ProjectPageImpl projectPage = new ProjectPageImpl();
		return projectPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRegisteredUser createSimpleRegisteredUser() {
		SimpleRegisteredUserImpl simpleRegisteredUser = new SimpleRegisteredUserImpl();
		return simpleRegisteredUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnregisteredUser createUnregisteredUser() {
		UnregisteredUserImpl unregisteredUser = new UnregisteredUserImpl();
		return unregisteredUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscussionPage createDiscussionPage() {
		DiscussionPageImpl discussionPage = new DiscussionPageImpl();
		return discussionPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AutoConfirmedUser createAutoConfirmedUser() {
		AutoConfirmedUserImpl autoConfirmedUser = new AutoConfirmedUserImpl();
		return autoConfirmedUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdminUser createAdminUser() {
		AdminUserImpl adminUser = new AdminUserImpl();
		return adminUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysOpUser createSysOpUser() {
		SysOpUserImpl sysOpUser = new SysOpUserImpl();
		return sysOpUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserPageProfile createUserPageProfile() {
		UserPageProfileImpl userPageProfile = new UserPageProfileImpl();
		return userPageProfile;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTalkPage createUserTalkPage() {
		UserTalkPageImpl userTalkPage = new UserTalkPageImpl();
		return userTalkPage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RegisteredUser createRegisteredUser() {
		RegisteredUserImpl registeredUser = new RegisteredUserImpl();
		return registeredUser;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProjectGroup createProjectGroup() {
		ProjectGroupImpl projectGroup = new ProjectGroupImpl();
		return projectGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InterestGroup createInterestGroup() {
		InterestGroupImpl interestGroup = new InterestGroupImpl();
		return interestGroup;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikimodelPackage getWikimodelPackage() {
		return (WikimodelPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static WikimodelPackage getPackage() {
		return WikimodelPackage.eINSTANCE;
	}

} //WikimodelFactoryImpl
