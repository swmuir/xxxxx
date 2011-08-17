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
 * A representation of the literals of the enumeration '<em><b>Percentage Sales Tax Basis Submitted</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPercentageSalesTaxBasisSubmitted()
 * @model
 * @generated
 */
public enum PercentageSalesTaxBasisSubmitted implements Enumerator {
	/**
	 * The '<em><b>Percentage Sales Tax Basis Submitted Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_SUBMITTED_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTAGE_SALES_TAX_BASIS_SUBMITTED_BLANK(0, "PercentageSalesTaxBasisSubmittedBlank", "PercentageSalesTaxBasisSubmittedBlank"),

	/**
	 * The '<em><b>Percentage Sales Tax Basis Submitted02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_SUBMITTED02_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTAGE_SALES_TAX_BASIS_SUBMITTED02(1, "PercentageSalesTaxBasisSubmitted02", "PercentageSalesTaxBasisSubmitted02"),

	/**
	 * The '<em><b>Percentage Sales Tax Basis Submitted03</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_SUBMITTED03_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTAGE_SALES_TAX_BASIS_SUBMITTED03(2, "PercentageSalesTaxBasisSubmitted03", "PercentageSalesTaxBasisSubmitted03");

	/**
	 * The '<em><b>Percentage Sales Tax Basis Submitted Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Percentage Sales Tax Basis Submitted Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_SUBMITTED_BLANK
	 * @model name="PercentageSalesTaxBasisSubmittedBlank"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTAGE_SALES_TAX_BASIS_SUBMITTED_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Percentage Sales Tax Basis Submitted02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Percentage Sales Tax Basis Submitted02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_SUBMITTED02
	 * @model name="PercentageSalesTaxBasisSubmitted02"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTAGE_SALES_TAX_BASIS_SUBMITTED02_VALUE = 1;

	/**
	 * The '<em><b>Percentage Sales Tax Basis Submitted03</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Percentage Sales Tax Basis Submitted03</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_SUBMITTED03
	 * @model name="PercentageSalesTaxBasisSubmitted03"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTAGE_SALES_TAX_BASIS_SUBMITTED03_VALUE = 2;

	/**
	 * An array of all the '<em><b>Percentage Sales Tax Basis Submitted</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PercentageSalesTaxBasisSubmitted[] VALUES_ARRAY =
		new PercentageSalesTaxBasisSubmitted[] {
			PERCENTAGE_SALES_TAX_BASIS_SUBMITTED_BLANK,
			PERCENTAGE_SALES_TAX_BASIS_SUBMITTED02,
			PERCENTAGE_SALES_TAX_BASIS_SUBMITTED03,
		};

	/**
	 * A public read-only list of all the '<em><b>Percentage Sales Tax Basis Submitted</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PercentageSalesTaxBasisSubmitted> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Percentage Sales Tax Basis Submitted</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PercentageSalesTaxBasisSubmitted get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PercentageSalesTaxBasisSubmitted result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Percentage Sales Tax Basis Submitted</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PercentageSalesTaxBasisSubmitted getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PercentageSalesTaxBasisSubmitted result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Percentage Sales Tax Basis Submitted</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PercentageSalesTaxBasisSubmitted get(int value) {
		switch (value) {
			case PERCENTAGE_SALES_TAX_BASIS_SUBMITTED_BLANK_VALUE: return PERCENTAGE_SALES_TAX_BASIS_SUBMITTED_BLANK;
			case PERCENTAGE_SALES_TAX_BASIS_SUBMITTED02_VALUE: return PERCENTAGE_SALES_TAX_BASIS_SUBMITTED02;
			case PERCENTAGE_SALES_TAX_BASIS_SUBMITTED03_VALUE: return PERCENTAGE_SALES_TAX_BASIS_SUBMITTED03;
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
	private PercentageSalesTaxBasisSubmitted(int value, String name, String literal) {
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
	
} //PercentageSalesTaxBasisSubmitted
