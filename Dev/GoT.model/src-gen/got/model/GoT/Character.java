/**
 */
package got.model.GoT;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Character</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link got.model.GoT.Character#getName <em>Name</em>}</li>
 *   <li>{@link got.model.GoT.Character#getStatus <em>Status</em>}</li>
 *   <li>{@link got.model.GoT.Character#getReason <em>Reason</em>}</li>
 *   <li>{@link got.model.GoT.Character#getMethod <em>Method</em>}</li>
 *   <li>{@link got.model.GoT.Character#getMethodCategory <em>Method Category</em>}</li>
 *   <li>{@link got.model.GoT.Character#getDeathPlace <em>Death Place</em>}</li>
 *   <li>{@link got.model.GoT.Character#getEpisode <em>Episode</em>}</li>
 *   <li>{@link got.model.GoT.Character#getKilledBy <em>Killed By</em>}</li>
 *   <li>{@link got.model.GoT.Character#getKilled <em>Killed</em>}</li>
 *   <li>{@link got.model.GoT.Character#getAlliegance <em>Alliegance</em>}</li>
 * </ul>
 *
 * @see got.model.GoT.GoTPackage#getCharacter()
 * @model
 * @generated
 */
public interface Character extends EObject {
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
	 * @see got.model.GoT.GoTPackage#getCharacter_Name()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String" required="true"
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link got.model.GoT.Character#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

	/**
	 * Returns the value of the '<em><b>Status</b></em>' attribute.
	 * The literals are from the enumeration {@link got.model.GoT.Status}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Status</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Status</em>' attribute.
	 * @see got.model.GoT.Status
	 * @see #setStatus(Status)
	 * @see got.model.GoT.GoTPackage#getCharacter_Status()
	 * @model
	 * @generated
	 */
	Status getStatus();

	/**
	 * Sets the value of the '{@link got.model.GoT.Character#getStatus <em>Status</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Status</em>' attribute.
	 * @see got.model.GoT.Status
	 * @see #getStatus()
	 * @generated
	 */
	void setStatus(Status value);

	/**
	 * Returns the value of the '<em><b>Reason</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason</em>' attribute.
	 * @see #setReason(String)
	 * @see got.model.GoT.GoTPackage#getCharacter_Reason()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getReason();

	/**
	 * Sets the value of the '{@link got.model.GoT.Character#getReason <em>Reason</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reason</em>' attribute.
	 * @see #getReason()
	 * @generated
	 */
	void setReason(String value);

	/**
	 * Returns the value of the '<em><b>Method</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method</em>' attribute.
	 * @see #setMethod(String)
	 * @see got.model.GoT.GoTPackage#getCharacter_Method()
	 * @model dataType="org.eclipse.emf.ecore.xml.type.String"
	 * @generated
	 */
	String getMethod();

	/**
	 * Sets the value of the '{@link got.model.GoT.Character#getMethod <em>Method</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method</em>' attribute.
	 * @see #getMethod()
	 * @generated
	 */
	void setMethod(String value);

	/**
	 * Returns the value of the '<em><b>Method Category</b></em>' attribute.
	 * The literals are from the enumeration {@link got.model.GoT.MethodCategory}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Method Category</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Method Category</em>' attribute.
	 * @see got.model.GoT.MethodCategory
	 * @see #setMethodCategory(MethodCategory)
	 * @see got.model.GoT.GoTPackage#getCharacter_MethodCategory()
	 * @model
	 * @generated
	 */
	MethodCategory getMethodCategory();

	/**
	 * Sets the value of the '{@link got.model.GoT.Character#getMethodCategory <em>Method Category</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Method Category</em>' attribute.
	 * @see got.model.GoT.MethodCategory
	 * @see #getMethodCategory()
	 * @generated
	 */
	void setMethodCategory(MethodCategory value);

	/**
	 * Returns the value of the '<em><b>Death Place</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Death Place</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Death Place</em>' reference.
	 * @see #setDeathPlace(Place)
	 * @see got.model.GoT.GoTPackage#getCharacter_DeathPlace()
	 * @model
	 * @generated
	 */
	Place getDeathPlace();

	/**
	 * Sets the value of the '{@link got.model.GoT.Character#getDeathPlace <em>Death Place</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Death Place</em>' reference.
	 * @see #getDeathPlace()
	 * @generated
	 */
	void setDeathPlace(Place value);

	/**
	 * Returns the value of the '<em><b>Episode</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Episode</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Episode</em>' reference.
	 * @see #setEpisode(Episode)
	 * @see got.model.GoT.GoTPackage#getCharacter_Episode()
	 * @model required="true"
	 * @generated
	 */
	Episode getEpisode();

	/**
	 * Sets the value of the '{@link got.model.GoT.Character#getEpisode <em>Episode</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Episode</em>' reference.
	 * @see #getEpisode()
	 * @generated
	 */
	void setEpisode(Episode value);

	/**
	 * Returns the value of the '<em><b>Killed By</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link got.model.GoT.Character#getKilled <em>Killed</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killed By</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killed By</em>' reference.
	 * @see #setKilledBy(Character)
	 * @see got.model.GoT.GoTPackage#getCharacter_KilledBy()
	 * @see got.model.GoT.Character#getKilled
	 * @model opposite="killed"
	 * @generated
	 */
	Character getKilledBy();

	/**
	 * Sets the value of the '{@link got.model.GoT.Character#getKilledBy <em>Killed By</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Killed By</em>' reference.
	 * @see #getKilledBy()
	 * @generated
	 */
	void setKilledBy(Character value);

	/**
	 * Returns the value of the '<em><b>Killed</b></em>' reference list.
	 * The list contents are of type {@link got.model.GoT.Character}.
	 * It is bidirectional and its opposite is '{@link got.model.GoT.Character#getKilledBy <em>Killed By</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Killed</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Killed</em>' reference list.
	 * @see got.model.GoT.GoTPackage#getCharacter_Killed()
	 * @see got.model.GoT.Character#getKilledBy
	 * @model opposite="killedBy"
	 * @generated
	 */
	EList<Character> getKilled();

	/**
	 * Returns the value of the '<em><b>Alliegance</b></em>' reference list.
	 * The list contents are of type {@link got.model.GoT.House}.
	 * It is bidirectional and its opposite is '{@link got.model.GoT.House#getFellow <em>Fellow</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alliegance</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alliegance</em>' reference list.
	 * @see got.model.GoT.GoTPackage#getCharacter_Alliegance()
	 * @see got.model.GoT.House#getFellow
	 * @model opposite="fellow"
	 * @generated
	 */
	EList<House> getAlliegance();

} // Character
