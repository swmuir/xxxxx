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
 * A representation of the literals of the enumeration '<em><b>Transmission File Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getTransmissionFileType()
 * @model
 * @generated
 */
public enum TransmissionFileType implements Enumerator {
	/**
	 * The '<em><b>Transmission File Type FRE</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_FILE_TYPE_FRE_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMISSION_FILE_TYPE_FRE(0, "TransmissionFileTypeFRE", "TransmissionFileTypeFRE"),

	/**
	 * The '<em><b>Transmission File Type FRM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_FILE_TYPE_FRM_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSMISSION_FILE_TYPE_FRM(1, "TransmissionFileTypeFRM", "TransmissionFileTypeFRM");

	/**
	 * The '<em><b>Transmission File Type FRE</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmission File Type FRE</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_FILE_TYPE_FRE
	 * @model name="TransmissionFileTypeFRE"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMISSION_FILE_TYPE_FRE_VALUE = 0;

	/**
	 * The '<em><b>Transmission File Type FRM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transmission File Type FRM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSMISSION_FILE_TYPE_FRM
	 * @model name="TransmissionFileTypeFRM"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSMISSION_FILE_TYPE_FRM_VALUE = 1;

	/**
	 * An array of all the '<em><b>Transmission File Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransmissionFileType[] VALUES_ARRAY =
		new TransmissionFileType[] {
			TRANSMISSION_FILE_TYPE_FRE,
			TRANSMISSION_FILE_TYPE_FRM,
		};

	/**
	 * A public read-only list of all the '<em><b>Transmission File Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransmissionFileType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transmission File Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransmissionFileType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransmissionFileType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transmission File Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransmissionFileType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransmissionFileType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transmission File Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransmissionFileType get(int value) {
		switch (value) {
			case TRANSMISSION_FILE_TYPE_FRE_VALUE: return TRANSMISSION_FILE_TYPE_FRE;
			case TRANSMISSION_FILE_TYPE_FRM_VALUE: return TRANSMISSION_FILE_TYPE_FRM;
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
	private TransmissionFileType(int value, String name, String literal) {
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
	
} //TransmissionFileType
