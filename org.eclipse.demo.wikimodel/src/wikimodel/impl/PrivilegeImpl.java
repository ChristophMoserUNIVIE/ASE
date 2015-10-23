/**
 */
package wikimodel.impl;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import wikimodel.Privilege;
import wikimodel.WikimodelPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Privilege</b></em>'.
 * <!-- end-user-doc -->
 *
 * @generated
 */
public abstract class PrivilegeImpl extends MinimalEObjectImpl.Container implements Privilege {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrivilegeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return WikimodelPackage.Literals.PRIVILEGE;
	}

} //PrivilegeImpl
