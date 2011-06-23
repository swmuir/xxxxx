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
 * A representation of the literals of the enumeration '<em><b>Amount Attributed To Product Selection Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getAmountAttributedToProductSelectionQualifier()
 * @model
 * @generated
 */
public enum AmountAttributedToProductSelectionQualifier implements Enumerator {
	/**
	 * The '<em><b>Amount Attributed To Product Selection Qualifier01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER01_VALUE
	 * @generated
	 * @ordered
	 */
	AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER01(0, "AmountAttributedToProductSelectionQualifier01", "AmountAttributedToProductSelectionQualifier01"),

	/**
	 * The '<em><b>Amount Attributed To Product Selection Qualifier02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER02_VALUE
	 * @generated
	 * @ordered
	 */
	AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER02(1, "AmountAttributedToProductSelectionQualifier02", "AmountAttributedToProductSelectionQualifier02"),

	/**
	 * The '<em><b>Amount Attributed To Product Selection Qualifier03</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER03_VALUE
	 * @generated
	 * @ordered
	 */
	AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER03(2, "AmountAttributedToProductSelectionQualifier03", "AmountAttributedToProductSelectionQualifier03");

	/**
	 * The '<em><b>Amount Attributed To Product Selection Qualifier01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amount Attributed To Product Selection Qualifier01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER01
	 * @model name="AmountAttributedToProductSelectionQualifier01"
	 * @generated
	 * @ordered
	 */
	public static final int AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER01_VALUE = 0;

	/**
	 * The '<em><b>Amount Attributed To Product Selection Qualifier02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amount Attributed To Product Selection Qualifier02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER02
	 * @model name="AmountAttributedToProductSelectionQualifier02"
	 * @generated
	 * @ordered
	 */
	public static final int AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER02_VALUE = 1;

	/**
	 * The '<em><b>Amount Attributed To Product Selection Qualifier03</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Amount Attributed To Product Selection Qualifier03</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER03
	 * @model name="AmountAttributedToProductSelectionQualifier03"
	 * @generated
	 * @ordered
	 */
	public static final int AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER03_VALUE = 2;

	/**
	 * An array of all the '<em><b>Amount Attributed To Product Selection Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AmountAttributedToProductSelectionQualifier[] VALUES_ARRAY =
		new AmountAttributedToProductSelectionQualifier[] {
			AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER01,
			AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER02,
			AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER03,
		};

	/**
	 * A public read-only list of all the '<em><b>Amount Attributed To Product Selection Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AmountAttributedToProductSelectionQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Amount Attributed To Product Selection Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmountAttributedToProductSelectionQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmountAttributedToProductSelectionQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amount Attributed To Product Selection Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmountAttributedToProductSelectionQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AmountAttributedToProductSelectionQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Amount Attributed To Product Selection Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AmountAttributedToProductSelectionQualifier get(int value) {
		switch (value) {
			case AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER01_VALUE: return AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER01;
			case AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER02_VALUE: return AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER02;
			case AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER03_VALUE: return AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER03;
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
	private AmountAttributedToProductSelectionQualifier(int value, String name, String literal) {
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
	
} //AmountAttributedToProductSelectionQualifier
