/**
 */
package got.model.GoT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Season</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link got.model.GoT.Season#getEpisode <em>Episode</em>}</li>
 *   <li>{@link got.model.GoT.Season#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see got.model.GoT.GoTPackage#getSeason()
 * @model
 * @generated
 */
public interface Season extends EObject {
	/**
	 * Returns the value of the '<em><b>Episode</b></em>' containment reference list.
	 * The list contents are of type {@link got.model.GoT.Episode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Episode</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episode</em>' containment reference list.
	 * @see got.model.GoT.GoTPackage#getSeason_Episode()
	 * @model containment="true"
	 * @generated
	 */
	EList<Episode> getEpisode();

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
	 * @see got.model.GoT.GoTPackage#getSeason_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link got.model.GoT.Season#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // Season
