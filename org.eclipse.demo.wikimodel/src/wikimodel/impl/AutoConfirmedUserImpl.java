/**
 */
package wikimodel.impl;

import java.lang.reflect.InvocationTargetException;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import wikimodel.AutoConfirmedUser;
import wikimodel.WikimodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Auto Confirmed User</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public class AutoConfirmedUserImpl extends SimpleRegisteredUserImpl implements AutoConfirmedUser {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AutoConfirmedUserImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikimodelPackage.Literals.AUTO_CONFIRMED_USER;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void movePage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPage() {
		// TODO: implement this method
		// Ensure that you remove @generated or mark it @generated NOT
		throw new UnsupportedOperationException();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case WikimodelPackage.AUTO_CONFIRMED_USER___MOVE_PAGE:
				movePage();
				return null;
			case WikimodelPackage.AUTO_CONFIRMED_USER___CREATE_PAGE:
				createPage();
				return null;
		}
		return super.eInvoke(operationID, arguments);
	}

} //AutoConfirmedUserImpl
