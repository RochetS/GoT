/**
 */
package got.model.GoT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Union</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link got.model.GoT.Union#getChild <em>Child</em>}</li>
 *   <li>{@link got.model.GoT.Union#getKind <em>Kind</em>}</li>
 *   <li>{@link got.model.GoT.Union#getFirstCharacter <em>First Character</em>}</li>
 *   <li>{@link got.model.GoT.Union#getSecondCharacter <em>Second Character</em>}</li>
 * </ul>
 *
 * @see got.model.GoT.GoTPackage#getUnion()
 * @model
 * @generated
 */
public interface Union extends EObject {
	/**
	 * Returns the value of the '<em><b>Child</b></em>' reference list.
	 * The list contents are of type {@link got.model.GoT.Character}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Child</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Child</em>' reference list.
	 * @see got.model.GoT.GoTPackage#getUnion_Child()
	 * @model
	 * @generated
	 */
	EList<got.model.GoT.Character> getChild();

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link got.model.GoT.UnionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see got.model.GoT.UnionKind
	 * @see #setKind(UnionKind)
	 * @see got.model.GoT.GoTPackage#getUnion_Kind()
	 * @model
	 * @generated
	 */
	UnionKind getKind();

	/**
	 * Sets the value of the '{@link got.model.GoT.Union#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see got.model.GoT.UnionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(UnionKind value);

	/**
	 * Returns the value of the '<em><b>First Character</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>First Character</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>First Character</em>' reference.
	 * @see #setFirstCharacter(got.model.GoT.Character)
	 * @see got.model.GoT.GoTPackage#getUnion_FirstCharacter()
	 * @model required="true"
	 * @generated
	 */
	got.model.GoT.Character getFirstCharacter();

	/**
	 * Sets the value of the '{@link got.model.GoT.Union#getFirstCharacter <em>First Character</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>First Character</em>' reference.
	 * @see #getFirstCharacter()
	 * @generated
	 */
	void setFirstCharacter(got.model.GoT.Character value);

	/**
	 * Returns the value of the '<em><b>Second Character</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Second Character</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Second Character</em>' reference.
	 * @see #setSecondCharacter(got.model.GoT.Character)
	 * @see got.model.GoT.GoTPackage#getUnion_SecondCharacter()
	 * @model required="true"
	 * @generated
	 */
	got.model.GoT.Character getSecondCharacter();

	/**
	 * Sets the value of the '{@link got.model.GoT.Union#getSecondCharacter <em>Second Character</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Second Character</em>' reference.
	 * @see #getSecondCharacter()
	 * @generated
	 */
	void setSecondCharacter(got.model.GoT.Character value);

} // Union
