/**
 */
package wikimodel.tests;

import junit.textui.TestRunner;

import wikimodel.UserTalkPage;
import wikimodel.WikimodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>User Talk Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class UserTalkPageTest extends ContentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(UserTalkPageTest.class);
	}

	/**
	 * Constructs a new User Talk Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UserTalkPageTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this User Talk Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected UserTalkPage getFixture() {
		return (UserTalkPage)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WikimodelFactory.eINSTANCE.createUserTalkPage());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

} //UserTalkPageTest
