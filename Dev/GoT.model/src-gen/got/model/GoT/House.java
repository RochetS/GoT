/**
 */
package got.model.GoT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>House</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link got.model.GoT.House#getName <em>Name</em>}</li>
 *   <li>{@link got.model.GoT.House#getFellow <em>Fellow</em>}</li>
 * </ul>
 *
 * @see got.model.GoT.GoTPackage#getHouse()
 * @model
 * @generated
 */
public interface House extends EObject {
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
	 * @see got.model.GoT.GoTPackage#getHouse_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link got.model.GoT.House#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Fellow</b></em>' reference list.
	 * The list contents are of type {@link got.model.GoT.Character}.
	 * It is bidirectional and its opposite is '{@link got.model.GoT.Character#getAlliegance <em>Alliegance</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fellow</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fellow</em>' reference list.
	 * @see got.model.GoT.GoTPackage#getHouse_Fellow()
	 * @see got.model.GoT.Character#getAlliegance
	 * @model opposite="alliegance"
	 * @generated
	 */
	EList<got.model.GoT.Character> getFellow();

} // House
