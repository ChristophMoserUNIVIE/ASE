/**
 */
package wikimodel.tests;

import junit.framework.Test;
import junit.framework.TestSuite;

import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>wikimodel</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class WikimodelTests extends TestSuite {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new WikimodelTests("wikimodel Tests");
		suite.addTestSuite(UnregisteredUserTest.class);
		suite.addTestSuite(AutoConfirmedUserTest.class);
		suite.addTestSuite(AdminUserTest.class);
		suite.addTestSuite(SysOpUserTest.class);
		suite.addTestSuite(RegisteredUserTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WikimodelTests(String name) {
		super(name);
	}

} //WikimodelTests
