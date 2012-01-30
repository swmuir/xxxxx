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
 * A representation of the literals of the enumeration '<em><b>Pharmacy Class Code Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPharmacyClassCodeQualifier()
 * @model
 * @generated
 */
public enum PharmacyClassCodeQualifier implements Enumerator {
	/**
	 * The '<em><b>Pharmacy Class Code Qualifier Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_CLASS_CODE_QUALIFIER_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACY_CLASS_CODE_QUALIFIER_BLANK(0, "PharmacyClassCodeQualifierBlank", "PharmacyClassCodeQualifierBlank"),

	/**
	 * The '<em><b>Pharmacy Class Code Qualifier1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_CLASS_CODE_QUALIFIER1_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACY_CLASS_CODE_QUALIFIER1(1, "PharmacyClassCodeQualifier1", "PharmacyClassCodeQualifier1"),

	/**
	 * The '<em><b>Pharmacy Class Code Qualifier2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_CLASS_CODE_QUALIFIER2_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACY_CLASS_CODE_QUALIFIER2(2, "PharmacyClassCodeQualifier2", "PharmacyClassCodeQualifier2"),

	/**
	 * The '<em><b>Pharmacy Class Code Qualifier3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_CLASS_CODE_QUALIFIER3_VALUE
	 * @generated
	 * @ordered
	 */
	PHARMACY_CLASS_CODE_QUALIFIER3(3, "PharmacyClassCodeQualifier3", "PharmacyClassCodeQualifier3");

	/**
	 * The '<em><b>Pharmacy Class Code Qualifier Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacy Class Code Qualifier Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_CLASS_CODE_QUALIFIER_BLANK
	 * @model name="PharmacyClassCodeQualifierBlank"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACY_CLASS_CODE_QUALIFIER_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Pharmacy Class Code Qualifier1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacy Class Code Qualifier1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_CLASS_CODE_QUALIFIER1
	 * @model name="PharmacyClassCodeQualifier1"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACY_CLASS_CODE_QUALIFIER1_VALUE = 1;

	/**
	 * The '<em><b>Pharmacy Class Code Qualifier2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacy Class Code Qualifier2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_CLASS_CODE_QUALIFIER2
	 * @model name="PharmacyClassCodeQualifier2"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACY_CLASS_CODE_QUALIFIER2_VALUE = 2;

	/**
	 * The '<em><b>Pharmacy Class Code Qualifier3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pharmacy Class Code Qualifier3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PHARMACY_CLASS_CODE_QUALIFIER3
	 * @model name="PharmacyClassCodeQualifier3"
	 * @generated
	 * @ordered
	 */
	public static final int PHARMACY_CLASS_CODE_QUALIFIER3_VALUE = 3;

	/**
	 * An array of all the '<em><b>Pharmacy Class Code Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PharmacyClassCodeQualifier[] VALUES_ARRAY =
		new PharmacyClassCodeQualifier[] {
			PHARMACY_CLASS_CODE_QUALIFIER_BLANK,
			PHARMACY_CLASS_CODE_QUALIFIER1,
			PHARMACY_CLASS_CODE_QUALIFIER2,
			PHARMACY_CLASS_CODE_QUALIFIER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Pharmacy Class Code Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PharmacyClassCodeQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pharmacy Class Code Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PharmacyClassCodeQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PharmacyClassCodeQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pharmacy Class Code Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PharmacyClassCodeQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PharmacyClassCodeQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pharmacy Class Code Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PharmacyClassCodeQualifier get(int value) {
		switch (value) {
			case PHARMACY_CLASS_CODE_QUALIFIER_BLANK_VALUE: return PHARMACY_CLASS_CODE_QUALIFIER_BLANK;
			case PHARMACY_CLASS_CODE_QUALIFIER1_VALUE: return PHARMACY_CLASS_CODE_QUALIFIER1;
			case PHARMACY_CLASS_CODE_QUALIFIER2_VALUE: return PHARMACY_CLASS_CODE_QUALIFIER2;
			case PHARMACY_CLASS_CODE_QUALIFIER3_VALUE: return PHARMACY_CLASS_CODE_QUALIFIER3;
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
	private PharmacyClassCodeQualifier(int value, String name, String literal) {
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
	
} //PharmacyClassCodeQualifier
