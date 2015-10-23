/**
 */
package wikimodel.tests;

import junit.textui.TestRunner;

import wikimodel.SimpleRegisteredUser;
import wikimodel.WikimodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Simple Registered User</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimpleRegisteredUserTest extends PrivilegeTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SimpleRegisteredUserTest.class);
	}

	/**
	 * Constructs a new Simple Registered User test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimpleRegisteredUserTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Simple Registered User test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SimpleRegisteredUser getFixture() {
		return (SimpleRegisteredUser)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WikimodelFactory.eINSTANCE.createSimpleRegisteredUser());
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

} //SimpleRegisteredUserTest
