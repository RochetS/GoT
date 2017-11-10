/**
 */
package got.model.GoT;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Method Category</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see got.model.GoT.GoTPackage#getMethodCategory()
 * @model
 * @generated
 */
public enum MethodCategory implements Enumerator {
	/**
	 * The '<em><b>Blade</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BLADE_VALUE
	 * @generated
	 * @ordered
	 */
	BLADE(0, "Blade", "Blade"),

	/**
	 * The '<em><b>Fire Burning</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRE_BURNING_VALUE
	 * @generated
	 * @ordered
	 */
	FIRE_BURNING(1, "Fire_Burning", "Fire_Burning"),

	/**
	 * The '<em><b>Animal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ANIMAL_VALUE
	 * @generated
	 * @ordered
	 */
	ANIMAL(2, "Animal", "Animal"),

	/**
	 * The '<em><b>Household Item</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HOUSEHOLD_ITEM_VALUE
	 * @generated
	 * @ordered
	 */
	HOUSEHOLD_ITEM(3, "Household_Item", "Household_Item"),

	/**
	 * The '<em><b>Unknown</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN_VALUE
	 * @generated
	 * @ordered
	 */
	UNKNOWN(4, "Unknown", "Unknown"),

	/**
	 * The '<em><b>Magic</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAGIC_VALUE
	 * @generated
	 * @ordered
	 */
	MAGIC(5, "Magic", "Magic"),

	/**
	 * The '<em><b>Other</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER(6, "Other", "Other"),

	/**
	 * The '<em><b>Arrow</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ARROW_VALUE
	 * @generated
	 * @ordered
	 */
	ARROW(7, "Arrow", "Arrow"),
	/**
	 * The '<em><b>Poison</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #POISON_VALUE
	 * @generated
	 * @ordered
	 */
	POISON(8, "Poison", "Poison"),
	/**
	 * The '<em><b>Spear</b></em>' literal object.
	 * <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	 * @see #SPEAR_VALUE
	 * @generated
	 * @ordered
	 */
	SPEAR(9, "Spear", "Spear"),
	/**
	* The '<em><b>Hands</b></em>' literal object.
	* <!-- begin-user-doc -->
	* <!-- end-user-doc -->
	* @see #HANDS_VALUE
	* @generated
	* @ordered
	*/
	HANDS(10, "Hands", "Hands");

	/**
	 * The '<em><b>Blade</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Blade</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BLADE
	 * @model name="Blade"
	 * @generated
	 * @ordered
	 */
	public static final int BLADE_VALUE = 0;

	/**
	 * The '<em><b>Fire Burning</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fire Burning</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRE_BURNING
	 * @model name="Fire_Burning"
	 * @generated
	 * @ordered
	 */
	public static final int FIRE_BURNING_VALUE = 1;

	/**
	 * The '<em><b>Animal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Animal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ANIMAL
	 * @model name="Animal"
	 * @generated
	 * @ordered
	 */
	public static final int ANIMAL_VALUE = 2;

	/**
	 * The '<em><b>Household Item</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Household Item</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HOUSEHOLD_ITEM
	 * @model name="Household_Item"
	 * @generated
	 * @ordered
	 */
	public static final int HOUSEHOLD_ITEM_VALUE = 3;

	/**
	 * The '<em><b>Unknown</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unknown</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNKNOWN
	 * @model name="Unknown"
	 * @generated
	 * @ordered
	 */
	public static final int UNKNOWN_VALUE = 4;

	/**
	 * The '<em><b>Magic</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Magic</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAGIC
	 * @model name="Magic"
	 * @generated
	 * @ordered
	 */
	public static final int MAGIC_VALUE = 5;

	/**
	 * The '<em><b>Other</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER
	 * @model name="Other"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_VALUE = 6;

	/**
	 * The '<em><b>Arrow</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Arrow</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ARROW
	 * @model name="Arrow"
	 * @generated
	 * @ordered
	 */
	public static final int ARROW_VALUE = 7;

	/**
	 * The '<em><b>Poison</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Poison</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #POISON
	 * @model name="Poison"
	 * @generated
	 * @ordered
	 */
	public static final int POISON_VALUE = 8;

	/**
	 * The '<em><b>Spear</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Spear</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SPEAR
	 * @model name="Spear"
	 * @generated
	 * @ordered
	 */
	public static final int SPEAR_VALUE = 9;

	/**
	 * The '<em><b>Hands</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Hands</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HANDS
	 * @model name="Hands"
	 * @generated
	 * @ordered
	 */
	public static final int HANDS_VALUE = 10;

	/**
	 * An array of all the '<em><b>Method Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MethodCategory[] VALUES_ARRAY = new MethodCategory[] { BLADE, FIRE_BURNING, ANIMAL,
			HOUSEHOLD_ITEM, UNKNOWN, MAGIC, OTHER, ARROW, POISON, SPEAR, HANDS, };

	/**
	 * A public read-only list of all the '<em><b>Method Category</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MethodCategory> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Method Category</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MethodCategory get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MethodCategory result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Method Category</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MethodCategory getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MethodCategory result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Method Category</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MethodCategory get(int value) {
		switch (value) {
		case BLADE_VALUE:
			return BLADE;
		case FIRE_BURNING_VALUE:
			return FIRE_BURNING;
		case ANIMAL_VALUE:
			return ANIMAL;
		case HOUSEHOLD_ITEM_VALUE:
			return HOUSEHOLD_ITEM;
		case UNKNOWN_VALUE:
			return UNKNOWN;
		case MAGIC_VALUE:
			return MAGIC;
		case OTHER_VALUE:
			return OTHER;
		case ARROW_VALUE:
			return ARROW;
		case POISON_VALUE:
			return POISON;
		case SPEAR_VALUE:
			return SPEAR;
		case HANDS_VALUE:
			return HANDS;
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
	private MethodCategory(int value, String name, String literal) {
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

} //MethodCategory
