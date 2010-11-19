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
 * A representation of the literals of the enumeration '<em><b>Clinical Information Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getClinicalInformationQualifier()
 * @model
 * @generated
 */
public enum ClinicalInformationQualifier implements Enumerator {
	/**
	 * The '<em><b>Clinical Information Qualifier1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICAL_INFORMATION_QUALIFIER1_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL_INFORMATION_QUALIFIER1(0, "ClinicalInformationQualifier1", "ClinicalInformationQualifier1"),

	/**
	 * The '<em><b>Clinical Information Qualifier2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLINICAL_INFORMATION_QUALIFIER2_VALUE
	 * @generated
	 * @ordered
	 */
	CLINICAL_INFORMATION_QUALIFIER2(1, "ClinicalInformationQualifier2", "ClinicalInformationQualifier2");

	/**
	 * The '<em><b>Clinical Information Qualifier1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clinical Information Qualifier1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLINICAL_INFORMATION_QUALIFIER1
	 * @model name="ClinicalInformationQualifier1"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_INFORMATION_QUALIFIER1_VALUE = 0;

	/**
	 * The '<em><b>Clinical Information Qualifier2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Clinical Information Qualifier2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLINICAL_INFORMATION_QUALIFIER2
	 * @model name="ClinicalInformationQualifier2"
	 * @generated
	 * @ordered
	 */
	public static final int CLINICAL_INFORMATION_QUALIFIER2_VALUE = 1;

	/**
	 * An array of all the '<em><b>Clinical Information Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClinicalInformationQualifier[] VALUES_ARRAY =
		new ClinicalInformationQualifier[] {
			CLINICAL_INFORMATION_QUALIFIER1,
			CLINICAL_INFORMATION_QUALIFIER2,
		};

	/**
	 * A public read-only list of all the '<em><b>Clinical Information Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClinicalInformationQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Clinical Information Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClinicalInformationQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClinicalInformationQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Clinical Information Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClinicalInformationQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClinicalInformationQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Clinical Information Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClinicalInformationQualifier get(int value) {
		switch (value) {
			case CLINICAL_INFORMATION_QUALIFIER1_VALUE: return CLINICAL_INFORMATION_QUALIFIER1;
			case CLINICAL_INFORMATION_QUALIFIER2_VALUE: return CLINICAL_INFORMATION_QUALIFIER2;
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
	private ClinicalInformationQualifier(int value, String name, String literal) {
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
	
} //ClinicalInformationQualifier
