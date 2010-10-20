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
 * A representation of the literals of the enumeration '<em><b>Changeof Prescription Status Flag</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getChangeofPrescriptionStatusFlag()
 * @model
 * @generated
 */
public enum ChangeofPrescriptionStatusFlag implements Enumerator {
	/**
	 * The '<em><b>Changeof Prescription Status Flag C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGEOF_PRESCRIPTION_STATUS_FLAG_C_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGEOF_PRESCRIPTION_STATUS_FLAG_C(0, "ChangeofPrescriptionStatusFlagC", "ChangeofPrescriptionStatusFlagC"),

	/**
	 * The '<em><b>Changeof Prescription Status Flag D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGEOF_PRESCRIPTION_STATUS_FLAG_D_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGEOF_PRESCRIPTION_STATUS_FLAG_D(1, "ChangeofPrescriptionStatusFlagD", "ChangeofPrescriptionStatusFlagD");

	/**
	 * The '<em><b>Changeof Prescription Status Flag C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Changeof Prescription Status Flag C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGEOF_PRESCRIPTION_STATUS_FLAG_C
	 * @model name="ChangeofPrescriptionStatusFlagC"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGEOF_PRESCRIPTION_STATUS_FLAG_C_VALUE = 0;

	/**
	 * The '<em><b>Changeof Prescription Status Flag D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Changeof Prescription Status Flag D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGEOF_PRESCRIPTION_STATUS_FLAG_D
	 * @model name="ChangeofPrescriptionStatusFlagD"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGEOF_PRESCRIPTION_STATUS_FLAG_D_VALUE = 1;

	/**
	 * An array of all the '<em><b>Changeof Prescription Status Flag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChangeofPrescriptionStatusFlag[] VALUES_ARRAY =
		new ChangeofPrescriptionStatusFlag[] {
			CHANGEOF_PRESCRIPTION_STATUS_FLAG_C,
			CHANGEOF_PRESCRIPTION_STATUS_FLAG_D,
		};

	/**
	 * A public read-only list of all the '<em><b>Changeof Prescription Status Flag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChangeofPrescriptionStatusFlag> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Changeof Prescription Status Flag</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeofPrescriptionStatusFlag get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeofPrescriptionStatusFlag result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Changeof Prescription Status Flag</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeofPrescriptionStatusFlag getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeofPrescriptionStatusFlag result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Changeof Prescription Status Flag</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeofPrescriptionStatusFlag get(int value) {
		switch (value) {
			case CHANGEOF_PRESCRIPTION_STATUS_FLAG_C_VALUE: return CHANGEOF_PRESCRIPTION_STATUS_FLAG_C;
			case CHANGEOF_PRESCRIPTION_STATUS_FLAG_D_VALUE: return CHANGEOF_PRESCRIPTION_STATUS_FLAG_D;
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
	private ChangeofPrescriptionStatusFlag(int value, String name, String literal) {
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
	
} //ChangeofPrescriptionStatusFlag
