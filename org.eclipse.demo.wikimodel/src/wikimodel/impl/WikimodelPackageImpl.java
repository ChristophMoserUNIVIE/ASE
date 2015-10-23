/**
 */
package wikimodel.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

import wikimodel.AdminUser;
import wikimodel.AutoConfirmedUser;
import wikimodel.Content;
import wikimodel.DiscussionPage;
import wikimodel.EncyclopediaEntry;
import wikimodel.HistoryPage;
import wikimodel.InterestGroup;
import wikimodel.Media;
import wikimodel.Privilege;
import wikimodel.ProjectGroup;
import wikimodel.ProjectOrInterestGroup;
import wikimodel.ProjectPage;
import wikimodel.RegisteredUser;
import wikimodel.SimpleRegisteredUser;
import wikimodel.SysOpUser;
import wikimodel.UnregisteredUser;
import wikimodel.User;
import wikimodel.UserPageProfile;
import wikimodel.UserTalkPage;
import wikimodel.WikimodelFactory;
import wikimodel.WikimodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class WikimodelPackageImpl extends EPackageImpl implements WikimodelPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass contentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass historyPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass encyclopediaEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mediaEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass simpleRegisteredUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unregisteredUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass discussionPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass autoConfirmedUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass adminUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sysOpUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userPageProfileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass userTalkPageEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass registeredUserEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass privilegeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass interestGroupEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass projectOrInterestGroupEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see wikimodel.WikimodelPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private WikimodelPackageImpl() {
		super(eNS_URI, WikimodelFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link WikimodelPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static WikimodelPackage init() {
		if (isInited) return (WikimodelPackage)EPackage.Registry.INSTANCE.getEPackage(WikimodelPackage.eNS_URI);

		// Obtain or create and register package
		WikimodelPackageImpl theWikimodelPackage = (WikimodelPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof WikimodelPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new WikimodelPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theWikimodelPackage.createPackageContents();

		// Initialize created meta-data
		theWikimodelPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theWikimodelPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(WikimodelPackage.eNS_URI, theWikimodelPackage);
		return theWikimodelPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getContent() {
		return contentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_Name() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getContent_PublicContent() {
		return (EAttribute)contentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Historypage() {
		return (EReference)contentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Discussionpage() {
		return (EReference)contentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getContent_Belongsto() {
		return (EReference)contentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getHistoryPage() {
		return historyPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUser() {
		return userEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getUser__ReadPage() {
		return userEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getEncyclopediaEntry() {
		return encyclopediaEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMedia() {
		return mediaEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectPage() {
		return projectPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSimpleRegisteredUser() {
		return simpleRegisteredUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUnregisteredUser() {
		return unregisteredUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getUnregisteredUser_IpAddress() {
		return (EAttribute)unregisteredUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getUnregisteredUser_Simpleregistereduser() {
		return (EReference)unregisteredUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDiscussionPage() {
		return discussionPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAutoConfirmedUser() {
		return autoConfirmedUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutoConfirmedUser__MovePage() {
		return autoConfirmedUserEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EOperation getAutoConfirmedUser__CreatePage() {
		return autoConfirmedUserEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdminUser() {
		return adminUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSysOpUser() {
		return sysOpUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSysOpUser_Registereduser() {
		return (EReference)sysOpUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserPageProfile() {
		return userPageProfileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUserTalkPage() {
		return userTalkPageEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getRegisteredUser() {
		return registeredUserEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredUser_UniqueUserName() {
		return (EAttribute)registeredUserEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisteredUser_Privilege() {
		return (EReference)registeredUserEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getRegisteredUser_Blocked() {
		return (EAttribute)registeredUserEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisteredUser_Userpageprofile() {
		return (EReference)registeredUserEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisteredUser_Usertalkpage() {
		return (EReference)registeredUserEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getRegisteredUser_Memberof() {
		return (EReference)registeredUserEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrivilege() {
		return privilegeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectGroup() {
		return projectGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInterestGroup() {
		return interestGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getProjectOrInterestGroup() {
		return projectOrInterestGroupEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikimodelFactory getWikimodelFactory() {
		return (WikimodelFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		contentEClass = createEClass(CONTENT);
		createEAttribute(contentEClass, CONTENT__NAME);
		createEAttribute(contentEClass, CONTENT__PUBLIC_CONTENT);
		createEReference(contentEClass, CONTENT__HISTORYPAGE);
		createEReference(contentEClass, CONTENT__DISCUSSIONPAGE);
		createEReference(contentEClass, CONTENT__BELONGSTO);

		historyPageEClass = createEClass(HISTORY_PAGE);

		userEClass = createEClass(USER);
		createEOperation(userEClass, USER___READ_PAGE);

		encyclopediaEntryEClass = createEClass(ENCYCLOPEDIA_ENTRY);

		mediaEClass = createEClass(MEDIA);

		projectPageEClass = createEClass(PROJECT_PAGE);

		simpleRegisteredUserEClass = createEClass(SIMPLE_REGISTERED_USER);

		unregisteredUserEClass = createEClass(UNREGISTERED_USER);
		createEAttribute(unregisteredUserEClass, UNREGISTERED_USER__IP_ADDRESS);
		createEReference(unregisteredUserEClass, UNREGISTERED_USER__SIMPLEREGISTEREDUSER);

		discussionPageEClass = createEClass(DISCUSSION_PAGE);

		autoConfirmedUserEClass = createEClass(AUTO_CONFIRMED_USER);
		createEOperation(autoConfirmedUserEClass, AUTO_CONFIRMED_USER___MOVE_PAGE);
		createEOperation(autoConfirmedUserEClass, AUTO_CONFIRMED_USER___CREATE_PAGE);

		adminUserEClass = createEClass(ADMIN_USER);

		sysOpUserEClass = createEClass(SYS_OP_USER);
		createEReference(sysOpUserEClass, SYS_OP_USER__REGISTEREDUSER);

		userPageProfileEClass = createEClass(USER_PAGE_PROFILE);

		userTalkPageEClass = createEClass(USER_TALK_PAGE);

		registeredUserEClass = createEClass(REGISTERED_USER);
		createEAttribute(registeredUserEClass, REGISTERED_USER__UNIQUE_USER_NAME);
		createEReference(registeredUserEClass, REGISTERED_USER__PRIVILEGE);
		createEAttribute(registeredUserEClass, REGISTERED_USER__BLOCKED);
		createEReference(registeredUserEClass, REGISTERED_USER__USERPAGEPROFILE);
		createEReference(registeredUserEClass, REGISTERED_USER__USERTALKPAGE);
		createEReference(registeredUserEClass, REGISTERED_USER__MEMBEROF);

		privilegeEClass = createEClass(PRIVILEGE);

		projectGroupEClass = createEClass(PROJECT_GROUP);

		interestGroupEClass = createEClass(INTEREST_GROUP);

		projectOrInterestGroupEClass = createEClass(PROJECT_OR_INTEREST_GROUP);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		encyclopediaEntryEClass.getESuperTypes().add(this.getContent());
		mediaEClass.getESuperTypes().add(this.getContent());
		projectPageEClass.getESuperTypes().add(this.getContent());
		simpleRegisteredUserEClass.getESuperTypes().add(this.getPrivilege());
		unregisteredUserEClass.getESuperTypes().add(this.getUser());
		autoConfirmedUserEClass.getESuperTypes().add(this.getSimpleRegisteredUser());
		autoConfirmedUserEClass.getESuperTypes().add(this.getPrivilege());
		adminUserEClass.getESuperTypes().add(this.getAutoConfirmedUser());
		adminUserEClass.getESuperTypes().add(this.getPrivilege());
		sysOpUserEClass.getESuperTypes().add(this.getAdminUser());
		sysOpUserEClass.getESuperTypes().add(this.getPrivilege());
		userPageProfileEClass.getESuperTypes().add(this.getContent());
		userTalkPageEClass.getESuperTypes().add(this.getContent());
		registeredUserEClass.getESuperTypes().add(this.getUser());
		projectGroupEClass.getESuperTypes().add(this.getProjectOrInterestGroup());
		interestGroupEClass.getESuperTypes().add(this.getProjectOrInterestGroup());

		// Initialize classes, features, and operations; add parameters
		initEClass(contentEClass, Content.class, "Content", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getContent_Name(), ecorePackage.getEString(), "name", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getContent_PublicContent(), ecorePackage.getEBoolean(), "publicContent", null, 0, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Historypage(), this.getHistoryPage(), null, "historypage", null, 1, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Discussionpage(), this.getDiscussionPage(), null, "discussionpage", null, 1, 1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getContent_Belongsto(), this.getProjectOrInterestGroup(), null, "belongsto", null, 0, -1, Content.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(historyPageEClass, HistoryPage.class, "HistoryPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userEClass, User.class, "User", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getUser__ReadPage(), null, "readPage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(encyclopediaEntryEClass, EncyclopediaEntry.class, "EncyclopediaEntry", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(mediaEClass, Media.class, "Media", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(projectPageEClass, ProjectPage.class, "ProjectPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(simpleRegisteredUserEClass, SimpleRegisteredUser.class, "SimpleRegisteredUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(unregisteredUserEClass, UnregisteredUser.class, "UnregisteredUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getUnregisteredUser_IpAddress(), ecorePackage.getEChar(), "ipAddress", null, 0, 1, UnregisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getUnregisteredUser_Simpleregistereduser(), this.getSimpleRegisteredUser(), null, "simpleregistereduser", null, 0, 1, UnregisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(discussionPageEClass, DiscussionPage.class, "DiscussionPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(autoConfirmedUserEClass, AutoConfirmedUser.class, "AutoConfirmedUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEOperation(getAutoConfirmedUser__MovePage(), null, "movePage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEOperation(getAutoConfirmedUser__CreatePage(), null, "createPage", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(adminUserEClass, AdminUser.class, "AdminUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sysOpUserEClass, SysOpUser.class, "SysOpUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSysOpUser_Registereduser(), this.getRegisteredUser(), null, "registereduser", null, 0, 1, SysOpUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(userPageProfileEClass, UserPageProfile.class, "UserPageProfile", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(userTalkPageEClass, UserTalkPage.class, "UserTalkPage", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(registeredUserEClass, RegisteredUser.class, "RegisteredUser", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getRegisteredUser_UniqueUserName(), theXMLTypePackage.getID(), "uniqueUserName", null, 0, 1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisteredUser_Privilege(), this.getPrivilege(), null, "privilege", null, 1, 1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getRegisteredUser_Blocked(), theXMLTypePackage.getBoolean(), "blocked", null, 0, 1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisteredUser_Userpageprofile(), this.getUserPageProfile(), null, "userpageprofile", null, 1, 1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisteredUser_Usertalkpage(), this.getUserTalkPage(), null, "usertalkpage", null, 1, 1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getRegisteredUser_Memberof(), this.getProjectOrInterestGroup(), null, "memberof", null, 0, -1, RegisteredUser.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(privilegeEClass, Privilege.class, "Privilege", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(projectGroupEClass, ProjectGroup.class, "ProjectGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(interestGroupEClass, InterestGroup.class, "InterestGroup", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(projectOrInterestGroupEClass, ProjectOrInterestGroup.class, "ProjectOrInterestGroup", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //WikimodelPackageImpl
