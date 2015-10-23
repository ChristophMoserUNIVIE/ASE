/**
 */
package wikimodel.tests;

import junit.framework.TestCase;

import junit.textui.TestRunner;

import wikimodel.HistoryPage;
import wikimodel.WikimodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>History Page</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class HistoryPageTest extends TestCase {

	/**
	 * The fixture for this History Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryPage fixture = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(HistoryPageTest.class);
	}

	/**
	 * Constructs a new History Page test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HistoryPageTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this History Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(HistoryPage fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this History Page test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected HistoryPage getFixture() {
		return fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WikimodelFactory.eINSTANCE.createHistoryPage());
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

} //HistoryPageTest
