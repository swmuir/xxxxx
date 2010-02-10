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
 * A representation of the literals of the enumeration '<em><b>Prescription Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPrescriptionType()
 * @model
 * @generated
 */
public enum PrescriptionType implements Enumerator {
	/**
	 * The '<em><b>Prescription Type1b</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_TYPE1B_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION_TYPE1B(0, "PrescriptionType1b", "PrescriptionType1b"),

	/**
	 * The '<em><b>Prescription Type0b</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_TYPE0B_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION_TYPE0B(1, "PrescriptionType0b", "PrescriptionType0b"),

	/**
	 * The '<em><b>Prescription Type1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_TYPE1_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION_TYPE1(2, "PrescriptionType1", "PrescriptionType1");

	/**
	 * The '<em><b>Prescription Type1b</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescription Type1b</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_TYPE1B
	 * @model name="PrescriptionType1b"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_TYPE1B_VALUE = 0;

	/**
	 * The '<em><b>Prescription Type0b</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescription Type0b</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_TYPE0B
	 * @model name="PrescriptionType0b"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_TYPE0B_VALUE = 1;

	/**
	 * The '<em><b>Prescription Type1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescription Type1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_TYPE1
	 * @model name="PrescriptionType1"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_TYPE1_VALUE = 2;

	/**
	 * An array of all the '<em><b>Prescription Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrescriptionType[] VALUES_ARRAY =
		new PrescriptionType[] {
			PRESCRIPTION_TYPE1B,
			PRESCRIPTION_TYPE0B,
			PRESCRIPTION_TYPE1,
		};

	/**
	 * A public read-only list of all the '<em><b>Prescription Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrescriptionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Prescription Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriptionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrescriptionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prescription Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriptionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrescriptionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prescription Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriptionType get(int value) {
		switch (value) {
			case PRESCRIPTION_TYPE1B_VALUE: return PRESCRIPTION_TYPE1B;
			case PRESCRIPTION_TYPE0B_VALUE: return PRESCRIPTION_TYPE0B;
			case PRESCRIPTION_TYPE1_VALUE: return PRESCRIPTION_TYPE1;
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
	private PrescriptionType(int value, String name, String literal) {
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
	
} //PrescriptionType
