/**
 */
package got.model.GoT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Go T</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link got.model.GoT.GoT#getCharacter <em>Character</em>}</li>
 *   <li>{@link got.model.GoT.GoT#getHouse <em>House</em>}</li>
 *   <li>{@link got.model.GoT.GoT#getSeason <em>Season</em>}</li>
 *   <li>{@link got.model.GoT.GoT#getPlace <em>Place</em>}</li>
 *   <li>{@link got.model.GoT.GoT#getUnion <em>Union</em>}</li>
 * </ul>
 *
 * @see got.model.GoT.GoTPackage#getGoT()
 * @model
 * @generated
 */
public interface GoT extends EObject {
	/**
	 * Returns the value of the '<em><b>Character</b></em>' containment reference list.
	 * The list contents are of type {@link got.model.GoT.Character}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Character</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Character</em>' containment reference list.
	 * @see got.model.GoT.GoTPackage#getGoT_Character()
	 * @model containment="true"
	 * @generated
	 */
	EList<got.model.GoT.Character> getCharacter();

	/**
	 * Returns the value of the '<em><b>House</b></em>' containment reference list.
	 * The list contents are of type {@link got.model.GoT.House}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>House</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>House</em>' containment reference list.
	 * @see got.model.GoT.GoTPackage#getGoT_House()
	 * @model containment="true"
	 * @generated
	 */
	EList<House> getHouse();

	/**
	 * Returns the value of the '<em><b>Season</b></em>' containment reference list.
	 * The list contents are of type {@link got.model.GoT.Season}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Season</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Season</em>' containment reference list.
	 * @see got.model.GoT.GoTPackage#getGoT_Season()
	 * @model containment="true"
	 * @generated
	 */
	EList<Season> getSeason();

	/**
	 * Returns the value of the '<em><b>Place</b></em>' containment reference list.
	 * The list contents are of type {@link got.model.GoT.Place}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place</em>' containment reference list.
	 * @see got.model.GoT.GoTPackage#getGoT_Place()
	 * @model containment="true"
	 * @generated
	 */
	EList<Place> getPlace();

	/**
	 * Returns the value of the '<em><b>Union</b></em>' containment reference list.
	 * The list contents are of type {@link got.model.GoT.Union}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Union</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Union</em>' containment reference list.
	 * @see got.model.GoT.GoTPackage#getGoT_Union()
	 * @model containment="true"
	 * @generated
	 */
	EList<Union> getUnion();

} // GoT
