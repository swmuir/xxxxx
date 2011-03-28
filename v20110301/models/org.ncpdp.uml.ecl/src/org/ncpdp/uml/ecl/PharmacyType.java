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
 * A representation of the literals of the enumeration '<em><b>Pharmacy Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPharmacyType()
 * @model
 * @generated
 */
public enum PharmacyType implements Enumerator {
	/**
	 * The '<em><b>Pharmacy Type R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_TYPE_R_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACY_TYPE_R(0, "PharmacyTypeR", "PharmacyTypeR"),

	/**
	 * The '<em><b>Pharmacy Type M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_TYPE_M_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACY_TYPE_M(1, "PharmacyTypeM", "PharmacyTypeM"),

	/**
	 * The '<em><b>Pharmacy Type S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_TYPE_S_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACY_TYPE_S(2, "PharmacyTypeS", "PharmacyTypeS"),

	/**
	 * The '<em><b>Pharmacy Type L</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_TYPE_L_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACY_TYPE_L(3, "PharmacyTypeL", "PharmacyTypeL"),

	/**
	 * The '<em><b>Pharmacy Type A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_TYPE_A_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACY_TYPE_A(4, "PharmacyTypeA", "PharmacyTypeA");

	/**
	 * The '<em><b>Pharmacy Type R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacy Type R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_TYPE_R
	 * @model name="PharmacyTypeR"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACY_TYPE_R_VALUE = 0;

	/**
	 * The '<em><b>Pharmacy Type M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacy Type M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_TYPE_M
	 * @model name="PharmacyTypeM"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACY_TYPE_M_VALUE = 1;

	/**
	 * The '<em><b>Pharmacy Type S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacy Type S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_TYPE_S
	 * @model name="PharmacyTypeS"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACY_TYPE_S_VALUE = 2;

	/**
	 * The '<em><b>Pharmacy Type L</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacy Type L</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_TYPE_L
	 * @model name="PharmacyTypeL"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACY_TYPE_L_VALUE = 3;

	/**
	 * The '<em><b>Pharmacy Type A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacy Type A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_TYPE_A
	 * @model name="PharmacyTypeA"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACY_TYPE_A_VALUE = 4;

	/**
	 * An array of all the '<em><b>Pharmacy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PharmacyType[] VALUES_ARRAY =
		new PharmacyType[] {
			PHARMACY_TYPE_R,
			PHARMACY_TYPE_M,
			PHARMACY_TYPE_S,
			PHARMACY_TYPE_L,
			PHARMACY_TYPE_A,
		};

	/**
	 * A public read-only list of all the '<em><b>Pharmacy Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PharmacyType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pharmacy Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PharmacyType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PharmacyType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pharmacy Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PharmacyType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PharmacyType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pharmacy Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PharmacyType get(int value) {
		switch (value) {
			case PHARMACY_TYPE_R_VALUE: return PHARMACY_TYPE_R;
			case PHARMACY_TYPE_M_VALUE: return PHARMACY_TYPE_M;
			case PHARMACY_TYPE_S_VALUE: return PHARMACY_TYPE_S;
			case PHARMACY_TYPE_L_VALUE: return PHARMACY_TYPE_L;
			case PHARMACY_TYPE_A_VALUE: return PHARMACY_TYPE_A;
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
	private PharmacyType(int value, String name, String literal) {
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
	
} //PharmacyType
