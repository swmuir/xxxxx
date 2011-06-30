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
 * A representation of the literals of the enumeration '<em><b>Basis Of Calculation Flat Sales Tax</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getBasisOfCalculationFlatSalesTax()
 * @model
 * @generated
 */
public enum BasisOfCalculationFlatSalesTax implements Enumerator {
	/**
	 * The '<em><b>Basis Of Calculation Flat Sales Tax Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_CALCULATION_FLAT_SALES_TAX_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	BASIS_OF_CALCULATION_FLAT_SALES_TAX_BLANK(0, "BasisOfCalculationFlatSalesTaxBlank", "BasisOfCalculationFlatSalesTaxBlank"),

	/**
	 * The '<em><b>Basis Of Calculation Flat Sales Tax00</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_CALCULATION_FLAT_SALES_TAX00_VALUE
	 * @generated
	 * @ordered
	 */
	BASIS_OF_CALCULATION_FLAT_SALES_TAX00(1, "BasisOfCalculationFlatSalesTax00", "BasisOfCalculationFlatSalesTax00"),

	/**
	 * The '<em><b>Basis Of Calculation Flat Sales Tax01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_CALCULATION_FLAT_SALES_TAX01_VALUE
	 * @generated
	 * @ordered
	 */
	BASIS_OF_CALCULATION_FLAT_SALES_TAX01(2, "BasisOfCalculationFlatSalesTax01", "BasisOfCalculationFlatSalesTax01"),

	/**
	 * The '<em><b>Basis Of Calculation Flat Sales Tax02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_CALCULATION_FLAT_SALES_TAX02_VALUE
	 * @generated
	 * @ordered
	 */
	BASIS_OF_CALCULATION_FLAT_SALES_TAX02(3, "BasisOfCalculationFlatSalesTax02", "BasisOfCalculationFlatSalesTax02");

	/**
	 * The '<em><b>Basis Of Calculation Flat Sales Tax Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basis Of Calculation Flat Sales Tax Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_CALCULATION_FLAT_SALES_TAX_BLANK
	 * @model name="BasisOfCalculationFlatSalesTaxBlank"
	 * @generated
	 * @ordered
	 */
	public static final int BASIS_OF_CALCULATION_FLAT_SALES_TAX_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Basis Of Calculation Flat Sales Tax00</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basis Of Calculation Flat Sales Tax00</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_CALCULATION_FLAT_SALES_TAX00
	 * @model name="BasisOfCalculationFlatSalesTax00"
	 * @generated
	 * @ordered
	 */
	public static final int BASIS_OF_CALCULATION_FLAT_SALES_TAX00_VALUE = 1;

	/**
	 * The '<em><b>Basis Of Calculation Flat Sales Tax01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basis Of Calculation Flat Sales Tax01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_CALCULATION_FLAT_SALES_TAX01
	 * @model name="BasisOfCalculationFlatSalesTax01"
	 * @generated
	 * @ordered
	 */
	public static final int BASIS_OF_CALCULATION_FLAT_SALES_TAX01_VALUE = 2;

	/**
	 * The '<em><b>Basis Of Calculation Flat Sales Tax02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basis Of Calculation Flat Sales Tax02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_CALCULATION_FLAT_SALES_TAX02
	 * @model name="BasisOfCalculationFlatSalesTax02"
	 * @generated
	 * @ordered
	 */
	public static final int BASIS_OF_CALCULATION_FLAT_SALES_TAX02_VALUE = 3;

	/**
	 * An array of all the '<em><b>Basis Of Calculation Flat Sales Tax</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BasisOfCalculationFlatSalesTax[] VALUES_ARRAY =
		new BasisOfCalculationFlatSalesTax[] {
			BASIS_OF_CALCULATION_FLAT_SALES_TAX_BLANK,
			BASIS_OF_CALCULATION_FLAT_SALES_TAX00,
			BASIS_OF_CALCULATION_FLAT_SALES_TAX01,
			BASIS_OF_CALCULATION_FLAT_SALES_TAX02,
		};

	/**
	 * A public read-only list of all the '<em><b>Basis Of Calculation Flat Sales Tax</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BasisOfCalculationFlatSalesTax> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Basis Of Calculation Flat Sales Tax</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisOfCalculationFlatSalesTax get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasisOfCalculationFlatSalesTax result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basis Of Calculation Flat Sales Tax</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisOfCalculationFlatSalesTax getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasisOfCalculationFlatSalesTax result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basis Of Calculation Flat Sales Tax</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisOfCalculationFlatSalesTax get(int value) {
		switch (value) {
			case BASIS_OF_CALCULATION_FLAT_SALES_TAX_BLANK_VALUE: return BASIS_OF_CALCULATION_FLAT_SALES_TAX_BLANK;
			case BASIS_OF_CALCULATION_FLAT_SALES_TAX00_VALUE: return BASIS_OF_CALCULATION_FLAT_SALES_TAX00;
			case BASIS_OF_CALCULATION_FLAT_SALES_TAX01_VALUE: return BASIS_OF_CALCULATION_FLAT_SALES_TAX01;
			case BASIS_OF_CALCULATION_FLAT_SALES_TAX02_VALUE: return BASIS_OF_CALCULATION_FLAT_SALES_TAX02;
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
	private BasisOfCalculationFlatSalesTax(int value, String name, String literal) {
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
	
} //BasisOfCalculationFlatSalesTax