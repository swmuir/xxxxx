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
 * A representation of the literals of the enumeration '<em><b>Tax Exempt Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getTaxExemptIndicator()
 * @model
 * @generated
 */
public enum TaxExemptIndicator implements Enumerator {
	/**
	 * The '<em><b>Tax Exempt Indicator Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT_INDICATOR_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	TAX_EXEMPT_INDICATOR_BLANK(0, "TaxExemptIndicatorBlank", "TaxExemptIndicatorBlank"),

	/**
	 * The '<em><b>Tax Exempt Indicator1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT_INDICATOR1_VALUE
	 * @generated
	 * @ordered
	 */
	TAX_EXEMPT_INDICATOR1(1, "TaxExemptIndicator1", "TaxExemptIndicator1"),

	/**
	 * The '<em><b>Tax Exempt Indicator2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT_INDICATOR2_VALUE
	 * @generated
	 * @ordered
	 */
	TAX_EXEMPT_INDICATOR2(2, "TaxExemptIndicator2", "TaxExemptIndicator2"),

	/**
	 * The '<em><b>Tax Exempt Indicator3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT_INDICATOR3_VALUE
	 * @generated
	 * @ordered
	 */
	TAX_EXEMPT_INDICATOR3(3, "TaxExemptIndicator3", "TaxExemptIndicator3"),

	/**
	 * The '<em><b>Tax Exempt Indicator4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT_INDICATOR4_VALUE
	 * @generated
	 * @ordered
	 */
	TAX_EXEMPT_INDICATOR4(4, "TaxExemptIndicator4", "TaxExemptIndicator4");

	/**
	 * The '<em><b>Tax Exempt Indicator Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tax Exempt Indicator Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT_INDICATOR_BLANK
	 * @model name="TaxExemptIndicatorBlank"
	 * @generated
	 * @ordered
	 */
	public static final int TAX_EXEMPT_INDICATOR_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Tax Exempt Indicator1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tax Exempt Indicator1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT_INDICATOR1
	 * @model name="TaxExemptIndicator1"
	 * @generated
	 * @ordered
	 */
	public static final int TAX_EXEMPT_INDICATOR1_VALUE = 1;

	/**
	 * The '<em><b>Tax Exempt Indicator2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tax Exempt Indicator2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT_INDICATOR2
	 * @model name="TaxExemptIndicator2"
	 * @generated
	 * @ordered
	 */
	public static final int TAX_EXEMPT_INDICATOR2_VALUE = 2;

	/**
	 * The '<em><b>Tax Exempt Indicator3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tax Exempt Indicator3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT_INDICATOR3
	 * @model name="TaxExemptIndicator3"
	 * @generated
	 * @ordered
	 */
	public static final int TAX_EXEMPT_INDICATOR3_VALUE = 3;

	/**
	 * The '<em><b>Tax Exempt Indicator4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Tax Exempt Indicator4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TAX_EXEMPT_INDICATOR4
	 * @model name="TaxExemptIndicator4"
	 * @generated
	 * @ordered
	 */
	public static final int TAX_EXEMPT_INDICATOR4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Tax Exempt Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TaxExemptIndicator[] VALUES_ARRAY =
		new TaxExemptIndicator[] {
			TAX_EXEMPT_INDICATOR_BLANK,
			TAX_EXEMPT_INDICATOR1,
			TAX_EXEMPT_INDICATOR2,
			TAX_EXEMPT_INDICATOR3,
			TAX_EXEMPT_INDICATOR4,
		};

	/**
	 * A public read-only list of all the '<em><b>Tax Exempt Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TaxExemptIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Tax Exempt Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaxExemptIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaxExemptIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tax Exempt Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaxExemptIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TaxExemptIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Tax Exempt Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TaxExemptIndicator get(int value) {
		switch (value) {
			case TAX_EXEMPT_INDICATOR_BLANK_VALUE: return TAX_EXEMPT_INDICATOR_BLANK;
			case TAX_EXEMPT_INDICATOR1_VALUE: return TAX_EXEMPT_INDICATOR1;
			case TAX_EXEMPT_INDICATOR2_VALUE: return TAX_EXEMPT_INDICATOR2;
			case TAX_EXEMPT_INDICATOR3_VALUE: return TAX_EXEMPT_INDICATOR3;
			case TAX_EXEMPT_INDICATOR4_VALUE: return TAX_EXEMPT_INDICATOR4;
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
	private TaxExemptIndicator(int value, String name, String literal) {
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
	
} //TaxExemptIndicator
