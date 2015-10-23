/**
 */
package wikimodel.tests;

import junit.textui.TestRunner;

import wikimodel.EncyclopediaEntry;
import wikimodel.WikimodelFactory;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Encyclopedia Entry</b></em>'.
 * <!-- end-user-doc -->
 * @generated
 */
public class EncyclopediaEntryTest extends ContentTest {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static void main(String[] args) {
		TestRunner.run(EncyclopediaEntryTest.class);
	}

	/**
	 * Constructs a new Encyclopedia Entry test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EncyclopediaEntryTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Encyclopedia Entry test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EncyclopediaEntry getFixture() {
		return (EncyclopediaEntry)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(WikimodelFactory.eINSTANCE.createEncyclopediaEntry());
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

} //EncyclopediaEntryTest
