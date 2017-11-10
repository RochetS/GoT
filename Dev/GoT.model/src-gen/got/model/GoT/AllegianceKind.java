/**
 */
package got.model.GoT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Allegiance Kind</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see got.model.GoT.GoTPackage#getAllegianceKind()
 * @model
 * @generated
 */
public enum AllegianceKind implements Enumerator {
	/**
	 * The '<em><b>Birth</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BIRTH_VALUE
	 * @generated
	 * @ordered
	 */
	BIRTH(0, "birth", "birth"),

	/**
	 * The '<em><b>Marriage</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MARRIAGE_VALUE
	 * @generated
	 * @ordered
	 */
	MARRIAGE(1, "marriage", "marriage"),

	/**
	 * The '<em><b>Pledge</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PLEDGE_VALUE
	 * @generated
	 * @ordered
	 */
	PLEDGE(2, "pledge", "pledge"),

	/**
	 * The '<em><b>Oath</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OATH_VALUE
	 * @generated
	 * @ordered
	 */
	OATH(3, "oath", "oath");

	/**
	 * The '<em><b>Birth</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Birth</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BIRTH
	 * @model name="birth"
	 * @generated
	 * @ordered
	 */
	public static final int BIRTH_VALUE = 0;

	/**
	 * The '<em><b>Marriage</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Marriage</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MARRIAGE
	 * @model name="marriage"
	 * @generated
	 * @ordered
	 */
	public static final int MARRIAGE_VALUE = 1;

	/**
	 * The '<em><b>Pledge</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pledge</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PLEDGE
	 * @model name="pledge"
	 * @generated
	 * @ordered
	 */
	public static final int PLEDGE_VALUE = 2;

	/**
	 * The '<em><b>Oath</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Oath</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OATH
	 * @model name="oath"
	 * @generated
	 * @ordered
	 */
	public static final int OATH_VALUE = 3;

	/**
	 * An array of all the '<em><b>Allegiance Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AllegianceKind[] VALUES_ARRAY = new AllegianceKind[] { BIRTH, MARRIAGE, PLEDGE, OATH, };

	/**
	 * A public read-only list of all the '<em><b>Allegiance Kind</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AllegianceKind> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Allegiance Kind</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllegianceKind get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllegianceKind result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allegiance Kind</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllegianceKind getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AllegianceKind result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Allegiance Kind</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static AllegianceKind get(int value) {
		switch (value) {
		case BIRTH_VALUE:
			return BIRTH;
		case MARRIAGE_VALUE:
			return MARRIAGE;
		case PLEDGE_VALUE:
			return PLEDGE;
		case OATH_VALUE:
			return OATH;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private AllegianceKind(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
		return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
		return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}

} //AllegianceKind
