/**
 */
package wikimodel.tests;

import junit.textui.TestRunner;

import wikimodel.SysOpUser;
import wikimodel.WikimodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Sys Op User</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class SysOpUserTest extends AdminUserTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(SysOpUserTest.class);
	}

	/**
	 * Constructs a new Sys Op User test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SysOpUserTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Sys Op User test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected SysOpUser getFixture() {
		return (SysOpUser)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WikimodelFactory.eINSTANCE.createSysOpUser());
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

} //SysOpUserTest
