/**
 */
package wikimodel;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Content</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link wikimodel.Content#getName <em>Name</em>}</li>
 *   <li>{@link wikimodel.Content#isPublicContent <em>Public Content</em>}</li>
 *   <li>{@link wikimodel.Content#getHistorypage <em>Historypage</em>}</li>
 *   <li>{@link wikimodel.Content#getDiscussionpage <em>Discussionpage</em>}</li>
 *   <li>{@link wikimodel.Content#getBelongsto <em>Belongsto</em>}</li>
 * </ul>
 *
 * @see wikimodel.WikimodelPackage#getContent()
 * @model abstract="true"
 * @generated
 */
public interface Content extends EObject {
	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see wikimodel.WikimodelPackage#getContent_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link wikimodel.Content#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Public Content</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Public Content</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Public Content</em>' attribute.
	 * @see #setPublicContent(boolean)
	 * @see wikimodel.WikimodelPackage#getContent_PublicContent()
	 * @model
	 * @generated
	 */
	boolean isPublicContent();

	/**
	 * Sets the value of the '{@link wikimodel.Content#isPublicContent <em>Public Content</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Public Content</em>' attribute.
	 * @see #isPublicContent()
	 * @generated
	 */
	void setPublicContent(boolean value);

	/**
	 * Returns the value of the '<em><b>Historypage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Historypage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Historypage</em>' containment reference.
	 * @see #setHistorypage(HistoryPage)
	 * @see wikimodel.WikimodelPackage#getContent_Historypage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	HistoryPage getHistorypage();

	/**
	 * Sets the value of the '{@link wikimodel.Content#getHistorypage <em>Historypage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Historypage</em>' containment reference.
	 * @see #getHistorypage()
	 * @generated
	 */
	void setHistorypage(HistoryPage value);

	/**
	 * Returns the value of the '<em><b>Discussionpage</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Discussionpage</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Discussionpage</em>' containment reference.
	 * @see #setDiscussionpage(DiscussionPage)
	 * @see wikimodel.WikimodelPackage#getContent_Discussionpage()
	 * @model containment="true" required="true"
	 * @generated
	 */
	DiscussionPage getDiscussionpage();

	/**
	 * Sets the value of the '{@link wikimodel.Content#getDiscussionpage <em>Discussionpage</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Discussionpage</em>' containment reference.
	 * @see #getDiscussionpage()
	 * @generated
	 */
	void setDiscussionpage(DiscussionPage value);

	/**
	 * Returns the value of the '<em><b>Belongsto</b></em>' containment reference list.
	 * The list contents are of type {@link wikimodel.ProjectOrInterestGroup}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Belongsto</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Belongsto</em>' containment reference list.
	 * @see wikimodel.WikimodelPackage#getContent_Belongsto()
	 * @model containment="true"
	 * @generated
	 */
	EList<ProjectOrInterestGroup> getBelongsto();

} // Content
