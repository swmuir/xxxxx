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
 * A representation of the literals of the enumeration '<em><b>Associated Prescription Service Reference Number Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getAssociatedPrescriptionServiceReferenceNumberQualifier()
 * @model
 * @generated
 */
public enum AssociatedPrescriptionServiceReferenceNumberQualifier implements Enumerator {
	/**
	 * The '<em><b>Associated Prescription Service Reference Number Qualifier01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER01_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER01(0, "AssociatedPrescriptionServiceReferenceNumberQualifier01", "AssociatedPrescriptionServiceReferenceNumberQualifier01"),

	/**
	 * The '<em><b>Associated Prescription Service Reference Number Qualifier02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER02_VALUE
	 * @generated
	 * @ordered
	 */
	ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER02(1, "AssociatedPrescriptionServiceReferenceNumberQualifier02", "AssociatedPrescriptionServiceReferenceNumberQualifier02");

	/**
	 * The '<em><b>Associated Prescription Service Reference Number Qualifier01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Associated Prescription Service Reference Number Qualifier01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER01
	 * @model name="AssociatedPrescriptionServiceReferenceNumberQualifier01"
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER01_VALUE = 0;

	/**
	 * The '<em><b>Associated Prescription Service Reference Number Qualifier02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Associated Prescription Service Reference Number Qualifier02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER02
	 * @model name="AssociatedPrescriptionServiceReferenceNumberQualifier02"
	 * @generated
	 * @ordered
	 */
	public static final int ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER02_VALUE = 1;

	/**
	 * An array of all the '<em><b>Associated Prescription Service Reference Number Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AssociatedPrescriptionServiceReferenceNumberQualifier[] VALUES_ARRAY =
		new AssociatedPrescriptionServiceReferenceNumberQualifier[] {
			ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER01,
			ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER02,
		};

	/**
	 * A public read-only list of all the '<em><b>Associated Prescription Service Reference Number Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AssociatedPrescriptionServiceReferenceNumberQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Associated Prescription Service Reference Number Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssociatedPrescriptionServiceReferenceNumberQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssociatedPrescriptionServiceReferenceNumberQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Associated Prescription Service Reference Number Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssociatedPrescriptionServiceReferenceNumberQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AssociatedPrescriptionServiceReferenceNumberQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Associated Prescription Service Reference Number Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AssociatedPrescriptionServiceReferenceNumberQualifier get(int value) {
		switch (value) {
			case ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER01_VALUE: return ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER01;
			case ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER02_VALUE: return ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER02;
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
	private AssociatedPrescriptionServiceReferenceNumberQualifier(int value, String name, String literal) {
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
	
} //AssociatedPrescriptionServiceReferenceNumberQualifier
