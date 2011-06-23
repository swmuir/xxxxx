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
 * A representation of the literals of the enumeration '<em><b>Percentage Sales Tax Basis Paid</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPercentageSalesTaxBasisPaid()
 * @model
 * @generated
 */
public enum PercentageSalesTaxBasisPaid implements Enumerator {
	/**
	 * The '<em><b>Percentage Sales Tax Basis Paid01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_PAID01_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTAGE_SALES_TAX_BASIS_PAID01(0, "PercentageSalesTaxBasisPaid01", "PercentageSalesTaxBasisPaid01"),

	/**
	 * The '<em><b>Percentage Sales Tax Basis Paid02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_PAID02_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTAGE_SALES_TAX_BASIS_PAID02(1, "PercentageSalesTaxBasisPaid02", "PercentageSalesTaxBasisPaid02"),

	/**
	 * The '<em><b>Percentage Sales Tax Basis Paid03</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_PAID03_VALUE
	 * @generated
	 * @ordered
	 */
	PERCENTAGE_SALES_TAX_BASIS_PAID03(2, "PercentageSalesTaxBasisPaid03", "PercentageSalesTaxBasisPaid03");

	/**
	 * The '<em><b>Percentage Sales Tax Basis Paid01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Percentage Sales Tax Basis Paid01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_PAID01
	 * @model name="PercentageSalesTaxBasisPaid01"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTAGE_SALES_TAX_BASIS_PAID01_VALUE = 0;

	/**
	 * The '<em><b>Percentage Sales Tax Basis Paid02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Percentage Sales Tax Basis Paid02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_PAID02
	 * @model name="PercentageSalesTaxBasisPaid02"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTAGE_SALES_TAX_BASIS_PAID02_VALUE = 1;

	/**
	 * The '<em><b>Percentage Sales Tax Basis Paid03</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Percentage Sales Tax Basis Paid03</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PERCENTAGE_SALES_TAX_BASIS_PAID03
	 * @model name="PercentageSalesTaxBasisPaid03"
	 * @generated
	 * @ordered
	 */
	public static final int PERCENTAGE_SALES_TAX_BASIS_PAID03_VALUE = 2;

	/**
	 * An array of all the '<em><b>Percentage Sales Tax Basis Paid</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PercentageSalesTaxBasisPaid[] VALUES_ARRAY =
		new PercentageSalesTaxBasisPaid[] {
			PERCENTAGE_SALES_TAX_BASIS_PAID01,
			PERCENTAGE_SALES_TAX_BASIS_PAID02,
			PERCENTAGE_SALES_TAX_BASIS_PAID03,
		};

	/**
	 * A public read-only list of all the '<em><b>Percentage Sales Tax Basis Paid</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PercentageSalesTaxBasisPaid> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Percentage Sales Tax Basis Paid</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PercentageSalesTaxBasisPaid get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PercentageSalesTaxBasisPaid result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Percentage Sales Tax Basis Paid</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PercentageSalesTaxBasisPaid getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PercentageSalesTaxBasisPaid result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Percentage Sales Tax Basis Paid</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PercentageSalesTaxBasisPaid get(int value) {
		switch (value) {
			case PERCENTAGE_SALES_TAX_BASIS_PAID01_VALUE: return PERCENTAGE_SALES_TAX_BASIS_PAID01;
			case PERCENTAGE_SALES_TAX_BASIS_PAID02_VALUE: return PERCENTAGE_SALES_TAX_BASIS_PAID02;
			case PERCENTAGE_SALES_TAX_BASIS_PAID03_VALUE: return PERCENTAGE_SALES_TAX_BASIS_PAID03;
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
	private PercentageSalesTaxBasisPaid(int value, String name, String literal) {
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
	
} //PercentageSalesTaxBasisPaid
