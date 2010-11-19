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
 * A representation of the literals of the enumeration '<em><b>No Known Allergies</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getNoKnownAllergies()
 * @model
 * @generated
 */
public enum NoKnownAllergies implements Enumerator {
	/**
	 * The '<em><b>No Known Allergies Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_KNOWN_ALLERGIES_Y_VALUE
	 * @generated
	 * @ordered
	 */
	NO_KNOWN_ALLERGIES_Y(0, "NoKnownAllergiesY", "NoKnownAllergiesY"),

	/**
	 * The '<em><b>No Known Allergies N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NO_KNOWN_ALLERGIES_N_VALUE
	 * @generated
	 * @ordered
	 */
	NO_KNOWN_ALLERGIES_N(1, "NoKnownAllergiesN", "NoKnownAllergiesN");

	/**
	 * The '<em><b>No Known Allergies Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Known Allergies Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_KNOWN_ALLERGIES_Y
	 * @model name="NoKnownAllergiesY"
	 * @generated
	 * @ordered
	 */
	public static final int NO_KNOWN_ALLERGIES_Y_VALUE = 0;

	/**
	 * The '<em><b>No Known Allergies N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>No Known Allergies N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NO_KNOWN_ALLERGIES_N
	 * @model name="NoKnownAllergiesN"
	 * @generated
	 * @ordered
	 */
	public static final int NO_KNOWN_ALLERGIES_N_VALUE = 1;

	/**
	 * An array of all the '<em><b>No Known Allergies</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NoKnownAllergies[] VALUES_ARRAY =
		new NoKnownAllergies[] {
			NO_KNOWN_ALLERGIES_Y,
			NO_KNOWN_ALLERGIES_N,
		};

	/**
	 * A public read-only list of all the '<em><b>No Known Allergies</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NoKnownAllergies> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>No Known Allergies</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoKnownAllergies get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoKnownAllergies result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>No Known Allergies</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoKnownAllergies getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NoKnownAllergies result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>No Known Allergies</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NoKnownAllergies get(int value) {
		switch (value) {
			case NO_KNOWN_ALLERGIES_Y_VALUE: return NO_KNOWN_ALLERGIES_Y;
			case NO_KNOWN_ALLERGIES_N_VALUE: return NO_KNOWN_ALLERGIES_N;
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
	private NoKnownAllergies(int value, String name, String literal) {
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
	
} //NoKnownAllergies
