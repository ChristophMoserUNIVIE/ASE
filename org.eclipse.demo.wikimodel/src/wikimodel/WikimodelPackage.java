/**
 */
package wikimodel;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see wikimodel.WikimodelFactory
 * @model kind="package"
 * @generated
 */
public interface WikimodelPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "wikimodel";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://org/demo/wikimodel";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "org.demo.wikimodel";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	WikimodelPackage eINSTANCE = wikimodel.impl.WikimodelPackageImpl.init();

	/**
	 * The meta object id for the '{@link wikimodel.impl.ContentImpl <em>Content</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.ContentImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getContent()
	 * @generated
	 */
	int CONTENT = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Public Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__PUBLIC_CONTENT = 1;

	/**
	 * The feature id for the '<em><b>Historypage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__HISTORYPAGE = 2;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__DISCUSSIONPAGE = 3;

	/**
	 * The feature id for the '<em><b>Belongsto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT__BELONGSTO = 4;

	/**
	 * The number of structural features of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Content</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.HistoryPageImpl <em>History Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.HistoryPageImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getHistoryPage()
	 * @generated
	 */
	int HISTORY_PAGE = 1;

	/**
	 * The number of structural features of the '<em>History Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_PAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>History Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int HISTORY_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.UserImpl <em>User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.UserImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getUser()
	 * @generated
	 */
	int USER = 2;

	/**
	 * The number of structural features of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Read Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER___READ_PAGE = 0;

	/**
	 * The number of operations of the '<em>User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link wikimodel.impl.EncyclopediaEntryImpl <em>Encyclopedia Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.EncyclopediaEntryImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getEncyclopediaEntry()
	 * @generated
	 */
	int ENCYCLOPEDIA_ENTRY = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCYCLOPEDIA_ENTRY__NAME = CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Public Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCYCLOPEDIA_ENTRY__PUBLIC_CONTENT = CONTENT__PUBLIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Historypage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCYCLOPEDIA_ENTRY__HISTORYPAGE = CONTENT__HISTORYPAGE;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCYCLOPEDIA_ENTRY__DISCUSSIONPAGE = CONTENT__DISCUSSIONPAGE;

	/**
	 * The feature id for the '<em><b>Belongsto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCYCLOPEDIA_ENTRY__BELONGSTO = CONTENT__BELONGSTO;

	/**
	 * The number of structural features of the '<em>Encyclopedia Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCYCLOPEDIA_ENTRY_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Encyclopedia Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ENCYCLOPEDIA_ENTRY_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.MediaImpl <em>Media</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.MediaImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getMedia()
	 * @generated
	 */
	int MEDIA = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__NAME = CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Public Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__PUBLIC_CONTENT = CONTENT__PUBLIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Historypage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__HISTORYPAGE = CONTENT__HISTORYPAGE;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__DISCUSSIONPAGE = CONTENT__DISCUSSIONPAGE;

	/**
	 * The feature id for the '<em><b>Belongsto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA__BELONGSTO = CONTENT__BELONGSTO;

	/**
	 * The number of structural features of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Media</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MEDIA_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.ProjectPageImpl <em>Project Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.ProjectPageImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getProjectPage()
	 * @generated
	 */
	int PROJECT_PAGE = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE__NAME = CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Public Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE__PUBLIC_CONTENT = CONTENT__PUBLIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Historypage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE__HISTORYPAGE = CONTENT__HISTORYPAGE;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE__DISCUSSIONPAGE = CONTENT__DISCUSSIONPAGE;

	/**
	 * The feature id for the '<em><b>Belongsto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE__BELONGSTO = CONTENT__BELONGSTO;

	/**
	 * The number of structural features of the '<em>Project Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_PAGE_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.PrivilegeImpl <em>Privilege</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.PrivilegeImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getPrivilege()
	 * @generated
	 */
	int PRIVILEGE = 15;

	/**
	 * The number of structural features of the '<em>Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Privilege</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIVILEGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.SimpleRegisteredUserImpl <em>Simple Registered User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.SimpleRegisteredUserImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getSimpleRegisteredUser()
	 * @generated
	 */
	int SIMPLE_REGISTERED_USER = 6;

	/**
	 * The number of structural features of the '<em>Simple Registered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REGISTERED_USER_FEATURE_COUNT = PRIVILEGE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Simple Registered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMPLE_REGISTERED_USER_OPERATION_COUNT = PRIVILEGE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.UnregisteredUserImpl <em>Unregistered User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.UnregisteredUserImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getUnregisteredUser()
	 * @generated
	 */
	int UNREGISTERED_USER = 7;

	/**
	 * The feature id for the '<em><b>Ip Address</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__IP_ADDRESS = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Simpleregistereduser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER__SIMPLEREGISTEREDUSER = USER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Unregistered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Read Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER___READ_PAGE = USER___READ_PAGE;

	/**
	 * The number of operations of the '<em>Unregistered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int UNREGISTERED_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.DiscussionPageImpl <em>Discussion Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.DiscussionPageImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getDiscussionPage()
	 * @generated
	 */
	int DISCUSSION_PAGE = 8;

	/**
	 * The number of structural features of the '<em>Discussion Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_PAGE_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Discussion Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DISCUSSION_PAGE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.AutoConfirmedUserImpl <em>Auto Confirmed User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.AutoConfirmedUserImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getAutoConfirmedUser()
	 * @generated
	 */
	int AUTO_CONFIRMED_USER = 9;

	/**
	 * The number of structural features of the '<em>Auto Confirmed User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER_FEATURE_COUNT = SIMPLE_REGISTERED_USER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Move Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER___MOVE_PAGE = SIMPLE_REGISTERED_USER_OPERATION_COUNT + 0;

	/**
	 * The operation id for the '<em>Create Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER___CREATE_PAGE = SIMPLE_REGISTERED_USER_OPERATION_COUNT + 1;

	/**
	 * The number of operations of the '<em>Auto Confirmed User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int AUTO_CONFIRMED_USER_OPERATION_COUNT = SIMPLE_REGISTERED_USER_OPERATION_COUNT + 2;

	/**
	 * The meta object id for the '{@link wikimodel.impl.AdminUserImpl <em>Admin User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.AdminUserImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getAdminUser()
	 * @generated
	 */
	int ADMIN_USER = 10;

	/**
	 * The number of structural features of the '<em>Admin User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_USER_FEATURE_COUNT = AUTO_CONFIRMED_USER_FEATURE_COUNT + 0;

	/**
	 * The operation id for the '<em>Move Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_USER___MOVE_PAGE = AUTO_CONFIRMED_USER___MOVE_PAGE;

	/**
	 * The operation id for the '<em>Create Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_USER___CREATE_PAGE = AUTO_CONFIRMED_USER___CREATE_PAGE;

	/**
	 * The number of operations of the '<em>Admin User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADMIN_USER_OPERATION_COUNT = AUTO_CONFIRMED_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.SysOpUserImpl <em>Sys Op User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.SysOpUserImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getSysOpUser()
	 * @generated
	 */
	int SYS_OP_USER = 11;

	/**
	 * The feature id for the '<em><b>Registereduser</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP_USER__REGISTEREDUSER = ADMIN_USER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Sys Op User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP_USER_FEATURE_COUNT = ADMIN_USER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Move Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP_USER___MOVE_PAGE = ADMIN_USER___MOVE_PAGE;

	/**
	 * The operation id for the '<em>Create Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP_USER___CREATE_PAGE = ADMIN_USER___CREATE_PAGE;

	/**
	 * The number of operations of the '<em>Sys Op User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYS_OP_USER_OPERATION_COUNT = ADMIN_USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.UserPageProfileImpl <em>User Page Profile</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.UserPageProfileImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getUserPageProfile()
	 * @generated
	 */
	int USER_PAGE_PROFILE = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PAGE_PROFILE__NAME = CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Public Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PAGE_PROFILE__PUBLIC_CONTENT = CONTENT__PUBLIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Historypage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PAGE_PROFILE__HISTORYPAGE = CONTENT__HISTORYPAGE;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PAGE_PROFILE__DISCUSSIONPAGE = CONTENT__DISCUSSIONPAGE;

	/**
	 * The feature id for the '<em><b>Belongsto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PAGE_PROFILE__BELONGSTO = CONTENT__BELONGSTO;

	/**
	 * The number of structural features of the '<em>User Page Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PAGE_PROFILE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Page Profile</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_PAGE_PROFILE_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.UserTalkPageImpl <em>User Talk Page</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.UserTalkPageImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getUserTalkPage()
	 * @generated
	 */
	int USER_TALK_PAGE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TALK_PAGE__NAME = CONTENT__NAME;

	/**
	 * The feature id for the '<em><b>Public Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TALK_PAGE__PUBLIC_CONTENT = CONTENT__PUBLIC_CONTENT;

	/**
	 * The feature id for the '<em><b>Historypage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TALK_PAGE__HISTORYPAGE = CONTENT__HISTORYPAGE;

	/**
	 * The feature id for the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TALK_PAGE__DISCUSSIONPAGE = CONTENT__DISCUSSIONPAGE;

	/**
	 * The feature id for the '<em><b>Belongsto</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TALK_PAGE__BELONGSTO = CONTENT__BELONGSTO;

	/**
	 * The number of structural features of the '<em>User Talk Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TALK_PAGE_FEATURE_COUNT = CONTENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>User Talk Page</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int USER_TALK_PAGE_OPERATION_COUNT = CONTENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.RegisteredUserImpl <em>Registered User</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.RegisteredUserImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getRegisteredUser()
	 * @generated
	 */
	int REGISTERED_USER = 14;

	/**
	 * The feature id for the '<em><b>Unique User Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__UNIQUE_USER_NAME = USER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Privilege</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__PRIVILEGE = USER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Blocked</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__BLOCKED = USER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Userpageprofile</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__USERPAGEPROFILE = USER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Usertalkpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__USERTALKPAGE = USER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Memberof</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER__MEMBEROF = USER_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Registered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER_FEATURE_COUNT = USER_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Read Page</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER___READ_PAGE = USER___READ_PAGE;

	/**
	 * The number of operations of the '<em>Registered User</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REGISTERED_USER_OPERATION_COUNT = USER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.ProjectOrInterestGroupImpl <em>Project Or Interest Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.ProjectOrInterestGroupImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getProjectOrInterestGroup()
	 * @generated
	 */
	int PROJECT_OR_INTEREST_GROUP = 18;

	/**
	 * The number of structural features of the '<em>Project Or Interest Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OR_INTEREST_GROUP_FEATURE_COUNT = 0;

	/**
	 * The number of operations of the '<em>Project Or Interest Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_OR_INTEREST_GROUP_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.ProjectGroupImpl <em>Project Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.ProjectGroupImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getProjectGroup()
	 * @generated
	 */
	int PROJECT_GROUP = 16;

	/**
	 * The number of structural features of the '<em>Project Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_GROUP_FEATURE_COUNT = PROJECT_OR_INTEREST_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Project Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PROJECT_GROUP_OPERATION_COUNT = PROJECT_OR_INTEREST_GROUP_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link wikimodel.impl.InterestGroupImpl <em>Interest Group</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see wikimodel.impl.InterestGroupImpl
	 * @see wikimodel.impl.WikimodelPackageImpl#getInterestGroup()
	 * @generated
	 */
	int INTEREST_GROUP = 17;

	/**
	 * The number of structural features of the '<em>Interest Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_GROUP_FEATURE_COUNT = PROJECT_OR_INTEREST_GROUP_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Interest Group</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INTEREST_GROUP_OPERATION_COUNT = PROJECT_OR_INTEREST_GROUP_OPERATION_COUNT + 0;


	/**
	 * Returns the meta object for class '{@link wikimodel.Content <em>Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Content</em>'.
	 * @see wikimodel.Content
	 * @generated
	 */
	EClass getContent();

	/**
	 * Returns the meta object for the attribute '{@link wikimodel.Content#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see wikimodel.Content#getName()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_Name();

	/**
	 * Returns the meta object for the attribute '{@link wikimodel.Content#isPublicContent <em>Public Content</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Public Content</em>'.
	 * @see wikimodel.Content#isPublicContent()
	 * @see #getContent()
	 * @generated
	 */
	EAttribute getContent_PublicContent();

	/**
	 * Returns the meta object for the containment reference '{@link wikimodel.Content#getHistorypage <em>Historypage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Historypage</em>'.
	 * @see wikimodel.Content#getHistorypage()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Historypage();

	/**
	 * Returns the meta object for the containment reference '{@link wikimodel.Content#getDiscussionpage <em>Discussionpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Discussionpage</em>'.
	 * @see wikimodel.Content#getDiscussionpage()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Discussionpage();

	/**
	 * Returns the meta object for the containment reference list '{@link wikimodel.Content#getBelongsto <em>Belongsto</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Belongsto</em>'.
	 * @see wikimodel.Content#getBelongsto()
	 * @see #getContent()
	 * @generated
	 */
	EReference getContent_Belongsto();

	/**
	 * Returns the meta object for class '{@link wikimodel.HistoryPage <em>History Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>History Page</em>'.
	 * @see wikimodel.HistoryPage
	 * @generated
	 */
	EClass getHistoryPage();

	/**
	 * Returns the meta object for class '{@link wikimodel.User <em>User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User</em>'.
	 * @see wikimodel.User
	 * @generated
	 */
	EClass getUser();

	/**
	 * Returns the meta object for the '{@link wikimodel.User#readPage() <em>Read Page</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Read Page</em>' operation.
	 * @see wikimodel.User#readPage()
	 * @generated
	 */
	EOperation getUser__ReadPage();

	/**
	 * Returns the meta object for class '{@link wikimodel.EncyclopediaEntry <em>Encyclopedia Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Encyclopedia Entry</em>'.
	 * @see wikimodel.EncyclopediaEntry
	 * @generated
	 */
	EClass getEncyclopediaEntry();

	/**
	 * Returns the meta object for class '{@link wikimodel.Media <em>Media</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Media</em>'.
	 * @see wikimodel.Media
	 * @generated
	 */
	EClass getMedia();

	/**
	 * Returns the meta object for class '{@link wikimodel.ProjectPage <em>Project Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Page</em>'.
	 * @see wikimodel.ProjectPage
	 * @generated
	 */
	EClass getProjectPage();

	/**
	 * Returns the meta object for class '{@link wikimodel.SimpleRegisteredUser <em>Simple Registered User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Simple Registered User</em>'.
	 * @see wikimodel.SimpleRegisteredUser
	 * @generated
	 */
	EClass getSimpleRegisteredUser();

	/**
	 * Returns the meta object for class '{@link wikimodel.UnregisteredUser <em>Unregistered User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Unregistered User</em>'.
	 * @see wikimodel.UnregisteredUser
	 * @generated
	 */
	EClass getUnregisteredUser();

	/**
	 * Returns the meta object for the attribute '{@link wikimodel.UnregisteredUser#getIpAddress <em>Ip Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Ip Address</em>'.
	 * @see wikimodel.UnregisteredUser#getIpAddress()
	 * @see #getUnregisteredUser()
	 * @generated
	 */
	EAttribute getUnregisteredUser_IpAddress();

	/**
	 * Returns the meta object for the reference '{@link wikimodel.UnregisteredUser#getSimpleregistereduser <em>Simpleregistereduser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Simpleregistereduser</em>'.
	 * @see wikimodel.UnregisteredUser#getSimpleregistereduser()
	 * @see #getUnregisteredUser()
	 * @generated
	 */
	EReference getUnregisteredUser_Simpleregistereduser();

	/**
	 * Returns the meta object for class '{@link wikimodel.DiscussionPage <em>Discussion Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Discussion Page</em>'.
	 * @see wikimodel.DiscussionPage
	 * @generated
	 */
	EClass getDiscussionPage();

	/**
	 * Returns the meta object for class '{@link wikimodel.AutoConfirmedUser <em>Auto Confirmed User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Auto Confirmed User</em>'.
	 * @see wikimodel.AutoConfirmedUser
	 * @generated
	 */
	EClass getAutoConfirmedUser();

	/**
	 * Returns the meta object for the '{@link wikimodel.AutoConfirmedUser#movePage() <em>Move Page</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Move Page</em>' operation.
	 * @see wikimodel.AutoConfirmedUser#movePage()
	 * @generated
	 */
	EOperation getAutoConfirmedUser__MovePage();

	/**
	 * Returns the meta object for the '{@link wikimodel.AutoConfirmedUser#createPage() <em>Create Page</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Create Page</em>' operation.
	 * @see wikimodel.AutoConfirmedUser#createPage()
	 * @generated
	 */
	EOperation getAutoConfirmedUser__CreatePage();

	/**
	 * Returns the meta object for class '{@link wikimodel.AdminUser <em>Admin User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Admin User</em>'.
	 * @see wikimodel.AdminUser
	 * @generated
	 */
	EClass getAdminUser();

	/**
	 * Returns the meta object for class '{@link wikimodel.SysOpUser <em>Sys Op User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sys Op User</em>'.
	 * @see wikimodel.SysOpUser
	 * @generated
	 */
	EClass getSysOpUser();

	/**
	 * Returns the meta object for the reference '{@link wikimodel.SysOpUser#getRegistereduser <em>Registereduser</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Registereduser</em>'.
	 * @see wikimodel.SysOpUser#getRegistereduser()
	 * @see #getSysOpUser()
	 * @generated
	 */
	EReference getSysOpUser_Registereduser();

	/**
	 * Returns the meta object for class '{@link wikimodel.UserPageProfile <em>User Page Profile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Page Profile</em>'.
	 * @see wikimodel.UserPageProfile
	 * @generated
	 */
	EClass getUserPageProfile();

	/**
	 * Returns the meta object for class '{@link wikimodel.UserTalkPage <em>User Talk Page</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>User Talk Page</em>'.
	 * @see wikimodel.UserTalkPage
	 * @generated
	 */
	EClass getUserTalkPage();

	/**
	 * Returns the meta object for class '{@link wikimodel.RegisteredUser <em>Registered User</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Registered User</em>'.
	 * @see wikimodel.RegisteredUser
	 * @generated
	 */
	EClass getRegisteredUser();

	/**
	 * Returns the meta object for the attribute '{@link wikimodel.RegisteredUser#getUniqueUserName <em>Unique User Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Unique User Name</em>'.
	 * @see wikimodel.RegisteredUser#getUniqueUserName()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EAttribute getRegisteredUser_UniqueUserName();

	/**
	 * Returns the meta object for the reference '{@link wikimodel.RegisteredUser#getPrivilege <em>Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Privilege</em>'.
	 * @see wikimodel.RegisteredUser#getPrivilege()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EReference getRegisteredUser_Privilege();

	/**
	 * Returns the meta object for the attribute '{@link wikimodel.RegisteredUser#isBlocked <em>Blocked</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Blocked</em>'.
	 * @see wikimodel.RegisteredUser#isBlocked()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EAttribute getRegisteredUser_Blocked();

	/**
	 * Returns the meta object for the containment reference '{@link wikimodel.RegisteredUser#getUserpageprofile <em>Userpageprofile</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Userpageprofile</em>'.
	 * @see wikimodel.RegisteredUser#getUserpageprofile()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EReference getRegisteredUser_Userpageprofile();

	/**
	 * Returns the meta object for the containment reference '{@link wikimodel.RegisteredUser#getUsertalkpage <em>Usertalkpage</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Usertalkpage</em>'.
	 * @see wikimodel.RegisteredUser#getUsertalkpage()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EReference getRegisteredUser_Usertalkpage();

	/**
	 * Returns the meta object for the reference list '{@link wikimodel.RegisteredUser#getMemberof <em>Memberof</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Memberof</em>'.
	 * @see wikimodel.RegisteredUser#getMemberof()
	 * @see #getRegisteredUser()
	 * @generated
	 */
	EReference getRegisteredUser_Memberof();

	/**
	 * Returns the meta object for class '{@link wikimodel.Privilege <em>Privilege</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Privilege</em>'.
	 * @see wikimodel.Privilege
	 * @generated
	 */
	EClass getPrivilege();

	/**
	 * Returns the meta object for class '{@link wikimodel.ProjectGroup <em>Project Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Group</em>'.
	 * @see wikimodel.ProjectGroup
	 * @generated
	 */
	EClass getProjectGroup();

	/**
	 * Returns the meta object for class '{@link wikimodel.InterestGroup <em>Interest Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Interest Group</em>'.
	 * @see wikimodel.InterestGroup
	 * @generated
	 */
	EClass getInterestGroup();

	/**
	 * Returns the meta object for class '{@link wikimodel.ProjectOrInterestGroup <em>Project Or Interest Group</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Project Or Interest Group</em>'.
	 * @see wikimodel.ProjectOrInterestGroup
	 * @generated
	 */
	EClass getProjectOrInterestGroup();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	WikimodelFactory getWikimodelFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link wikimodel.impl.ContentImpl <em>Content</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.ContentImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getContent()
		 * @generated
		 */
		EClass CONTENT = eINSTANCE.getContent();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__NAME = eINSTANCE.getContent_Name();

		/**
		 * The meta object literal for the '<em><b>Public Content</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONTENT__PUBLIC_CONTENT = eINSTANCE.getContent_PublicContent();

		/**
		 * The meta object literal for the '<em><b>Historypage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__HISTORYPAGE = eINSTANCE.getContent_Historypage();

		/**
		 * The meta object literal for the '<em><b>Discussionpage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__DISCUSSIONPAGE = eINSTANCE.getContent_Discussionpage();

		/**
		 * The meta object literal for the '<em><b>Belongsto</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTENT__BELONGSTO = eINSTANCE.getContent_Belongsto();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.HistoryPageImpl <em>History Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.HistoryPageImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getHistoryPage()
		 * @generated
		 */
		EClass HISTORY_PAGE = eINSTANCE.getHistoryPage();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.UserImpl <em>User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.UserImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getUser()
		 * @generated
		 */
		EClass USER = eINSTANCE.getUser();

		/**
		 * The meta object literal for the '<em><b>Read Page</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation USER___READ_PAGE = eINSTANCE.getUser__ReadPage();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.EncyclopediaEntryImpl <em>Encyclopedia Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.EncyclopediaEntryImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getEncyclopediaEntry()
		 * @generated
		 */
		EClass ENCYCLOPEDIA_ENTRY = eINSTANCE.getEncyclopediaEntry();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.MediaImpl <em>Media</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.MediaImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getMedia()
		 * @generated
		 */
		EClass MEDIA = eINSTANCE.getMedia();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.ProjectPageImpl <em>Project Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.ProjectPageImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getProjectPage()
		 * @generated
		 */
		EClass PROJECT_PAGE = eINSTANCE.getProjectPage();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.SimpleRegisteredUserImpl <em>Simple Registered User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.SimpleRegisteredUserImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getSimpleRegisteredUser()
		 * @generated
		 */
		EClass SIMPLE_REGISTERED_USER = eINSTANCE.getSimpleRegisteredUser();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.UnregisteredUserImpl <em>Unregistered User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.UnregisteredUserImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getUnregisteredUser()
		 * @generated
		 */
		EClass UNREGISTERED_USER = eINSTANCE.getUnregisteredUser();

		/**
		 * The meta object literal for the '<em><b>Ip Address</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute UNREGISTERED_USER__IP_ADDRESS = eINSTANCE.getUnregisteredUser_IpAddress();

		/**
		 * The meta object literal for the '<em><b>Simpleregistereduser</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference UNREGISTERED_USER__SIMPLEREGISTEREDUSER = eINSTANCE.getUnregisteredUser_Simpleregistereduser();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.DiscussionPageImpl <em>Discussion Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.DiscussionPageImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getDiscussionPage()
		 * @generated
		 */
		EClass DISCUSSION_PAGE = eINSTANCE.getDiscussionPage();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.AutoConfirmedUserImpl <em>Auto Confirmed User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.AutoConfirmedUserImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getAutoConfirmedUser()
		 * @generated
		 */
		EClass AUTO_CONFIRMED_USER = eINSTANCE.getAutoConfirmedUser();

		/**
		 * The meta object literal for the '<em><b>Move Page</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTO_CONFIRMED_USER___MOVE_PAGE = eINSTANCE.getAutoConfirmedUser__MovePage();

		/**
		 * The meta object literal for the '<em><b>Create Page</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation AUTO_CONFIRMED_USER___CREATE_PAGE = eINSTANCE.getAutoConfirmedUser__CreatePage();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.AdminUserImpl <em>Admin User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.AdminUserImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getAdminUser()
		 * @generated
		 */
		EClass ADMIN_USER = eINSTANCE.getAdminUser();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.SysOpUserImpl <em>Sys Op User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.SysOpUserImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getSysOpUser()
		 * @generated
		 */
		EClass SYS_OP_USER = eINSTANCE.getSysOpUser();

		/**
		 * The meta object literal for the '<em><b>Registereduser</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYS_OP_USER__REGISTEREDUSER = eINSTANCE.getSysOpUser_Registereduser();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.UserPageProfileImpl <em>User Page Profile</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.UserPageProfileImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getUserPageProfile()
		 * @generated
		 */
		EClass USER_PAGE_PROFILE = eINSTANCE.getUserPageProfile();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.UserTalkPageImpl <em>User Talk Page</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.UserTalkPageImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getUserTalkPage()
		 * @generated
		 */
		EClass USER_TALK_PAGE = eINSTANCE.getUserTalkPage();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.RegisteredUserImpl <em>Registered User</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.RegisteredUserImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getRegisteredUser()
		 * @generated
		 */
		EClass REGISTERED_USER = eINSTANCE.getRegisteredUser();

		/**
		 * The meta object literal for the '<em><b>Unique User Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_USER__UNIQUE_USER_NAME = eINSTANCE.getRegisteredUser_UniqueUserName();

		/**
		 * The meta object literal for the '<em><b>Privilege</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_USER__PRIVILEGE = eINSTANCE.getRegisteredUser_Privilege();

		/**
		 * The meta object literal for the '<em><b>Blocked</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute REGISTERED_USER__BLOCKED = eINSTANCE.getRegisteredUser_Blocked();

		/**
		 * The meta object literal for the '<em><b>Userpageprofile</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_USER__USERPAGEPROFILE = eINSTANCE.getRegisteredUser_Userpageprofile();

		/**
		 * The meta object literal for the '<em><b>Usertalkpage</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_USER__USERTALKPAGE = eINSTANCE.getRegisteredUser_Usertalkpage();

		/**
		 * The meta object literal for the '<em><b>Memberof</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REGISTERED_USER__MEMBEROF = eINSTANCE.getRegisteredUser_Memberof();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.PrivilegeImpl <em>Privilege</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.PrivilegeImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getPrivilege()
		 * @generated
		 */
		EClass PRIVILEGE = eINSTANCE.getPrivilege();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.ProjectGroupImpl <em>Project Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.ProjectGroupImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getProjectGroup()
		 * @generated
		 */
		EClass PROJECT_GROUP = eINSTANCE.getProjectGroup();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.InterestGroupImpl <em>Interest Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.InterestGroupImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getInterestGroup()
		 * @generated
		 */
		EClass INTEREST_GROUP = eINSTANCE.getInterestGroup();

		/**
		 * The meta object literal for the '{@link wikimodel.impl.ProjectOrInterestGroupImpl <em>Project Or Interest Group</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see wikimodel.impl.ProjectOrInterestGroupImpl
		 * @see wikimodel.impl.WikimodelPackageImpl#getProjectOrInterestGroup()
		 * @generated
		 */
		EClass PROJECT_OR_INTEREST_GROUP = eINSTANCE.getProjectOrInterestGroup();

	}

} //WikimodelPackage
