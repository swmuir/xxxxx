/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.ecl;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Preference Level</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPreferenceLevel()
 * @model
 * @generated
 */
public enum PreferenceLevel implements Enumerator {
	/**
	 * The '<em><b>Preference Level99</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREFERENCE_LEVEL99_VALUE
	 * @generated
	 * @ordered
	 */
	PREFERENCE_LEVEL99(0, "PreferenceLevel99", "PreferenceLevel99"),

	/**
	 * The '<em><b>Preference Level982</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREFERENCE_LEVEL982_VALUE
	 * @generated
	 * @ordered
	 */
	PREFERENCE_LEVEL982(1, "PreferenceLevel982", "PreferenceLevel982"),

	/**
	 * The '<em><b>Preference Level1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREFERENCE_LEVEL1_VALUE
	 * @generated
	 * @ordered
	 */
	PREFERENCE_LEVEL1(2, "PreferenceLevel1", "PreferenceLevel1");

	/**
	 * The '<em><b>Preference Level99</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preference Level99</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREFERENCE_LEVEL99
	 * @model name="PreferenceLevel99"
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCE_LEVEL99_VALUE = 0;

	/**
	 * The '<em><b>Preference Level982</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preference Level982</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREFERENCE_LEVEL982
	 * @model name="PreferenceLevel982"
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCE_LEVEL982_VALUE = 1;

	/**
	 * The '<em><b>Preference Level1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preference Level1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREFERENCE_LEVEL1
	 * @model name="PreferenceLevel1"
	 * @generated
	 * @ordered
	 */
	public static final int PREFERENCE_LEVEL1_VALUE = 2;

	/**
	 * An array of all the '<em><b>Preference Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PreferenceLevel[] VALUES_ARRAY =
		new PreferenceLevel[] {
			PREFERENCE_LEVEL99,
			PREFERENCE_LEVEL982,
			PREFERENCE_LEVEL1,
		};

	/**
	 * A public read-only list of all the '<em><b>Preference Level</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PreferenceLevel> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Preference Level</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PreferenceLevel get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PreferenceLevel result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Preference Level</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PreferenceLevel getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PreferenceLevel result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Preference Level</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PreferenceLevel get(int value) {
		switch (value) {
			case PREFERENCE_LEVEL99_VALUE: return PREFERENCE_LEVEL99;
			case PREFERENCE_LEVEL982_VALUE: return PREFERENCE_LEVEL982;
			case PREFERENCE_LEVEL1_VALUE: return PREFERENCE_LEVEL1;
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
	private PreferenceLevel(int value, String name, String literal) {
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
	
} //PreferenceLevel
