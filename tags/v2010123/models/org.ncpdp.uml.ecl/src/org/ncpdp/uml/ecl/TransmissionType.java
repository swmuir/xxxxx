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
 * A representation of the literals of the enumeration '<em><b>Transmission Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getTransmissionType()
 * @model
 * @generated
 */
public enum TransmissionType implements Enumerator {
	/**
	 * The '<em><b>Transmission Type T</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_TYPE_T_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMISSION_TYPE_T(0, "TransmissionTypeT", "TransmissionTypeT"),

	/**
	 * The '<em><b>Transmission Type R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_TYPE_R_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMISSION_TYPE_R(1, "TransmissionTypeR", "TransmissionTypeR"),

	/**
	 * The '<em><b>Transmission Type E</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_TYPE_E_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMISSION_TYPE_E(2, "TransmissionTypeE", "TransmissionTypeE");

	/**
	 * The '<em><b>Transmission Type T</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmission Type T</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_TYPE_T
	 * @model name="TransmissionTypeT"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMISSION_TYPE_T_VALUE = 0;

	/**
	 * The '<em><b>Transmission Type R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmission Type R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_TYPE_R
	 * @model name="TransmissionTypeR"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMISSION_TYPE_R_VALUE = 1;

	/**
	 * The '<em><b>Transmission Type E</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmission Type E</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_TYPE_E
	 * @model name="TransmissionTypeE"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMISSION_TYPE_E_VALUE = 2;

	/**
	 * An array of all the '<em><b>Transmission Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransmissionType[] VALUES_ARRAY =
		new TransmissionType[] {
			TRANSMISSION_TYPE_T,
			TRANSMISSION_TYPE_R,
			TRANSMISSION_TYPE_E,
		};

	/**
	 * A public read-only list of all the '<em><b>Transmission Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransmissionType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transmission Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransmissionType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransmissionType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transmission Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransmissionType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransmissionType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transmission Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransmissionType get(int value) {
		switch (value) {
			case TRANSMISSION_TYPE_T_VALUE: return TRANSMISSION_TYPE_T;
			case TRANSMISSION_TYPE_R_VALUE: return TRANSMISSION_TYPE_R;
			case TRANSMISSION_TYPE_E_VALUE: return TRANSMISSION_TYPE_E;
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
	private TransmissionType(int value, String name, String literal) {
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
	
} //TransmissionType
