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
 * A representation of the literals of the enumeration '<em><b>Federal Upper Limit Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getFederalUpperLimitIndicator()
 * @model
 * @generated
 */
public enum FederalUpperLimitIndicator implements Enumerator {
	/**
	 * The '<em><b>Federal Upper Limit Indicator Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEDERAL_UPPER_LIMIT_INDICATOR_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	FEDERAL_UPPER_LIMIT_INDICATOR_BLANK(0, "FederalUpperLimitIndicatorBlank", "FederalUpperLimitIndicatorBlank"),

	/**
	 * The '<em><b>Federal Upper Limit Indicator1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEDERAL_UPPER_LIMIT_INDICATOR1_VALUE
	 * @generated
	 * @ordered
	 */
	FEDERAL_UPPER_LIMIT_INDICATOR1(1, "FederalUpperLimitIndicator1", "FederalUpperLimitIndicator1"),

	/**
	 * The '<em><b>Federal Upper Limit Indicator2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FEDERAL_UPPER_LIMIT_INDICATOR2_VALUE
	 * @generated
	 * @ordered
	 */
	FEDERAL_UPPER_LIMIT_INDICATOR2(2, "FederalUpperLimitIndicator2", "FederalUpperLimitIndicator2");

	/**
	 * The '<em><b>Federal Upper Limit Indicator Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Federal Upper Limit Indicator Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEDERAL_UPPER_LIMIT_INDICATOR_BLANK
	 * @model name="FederalUpperLimitIndicatorBlank"
	 * @generated
	 * @ordered
	 */
	public static final int FEDERAL_UPPER_LIMIT_INDICATOR_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Federal Upper Limit Indicator1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Federal Upper Limit Indicator1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEDERAL_UPPER_LIMIT_INDICATOR1
	 * @model name="FederalUpperLimitIndicator1"
	 * @generated
	 * @ordered
	 */
	public static final int FEDERAL_UPPER_LIMIT_INDICATOR1_VALUE = 1;

	/**
	 * The '<em><b>Federal Upper Limit Indicator2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Federal Upper Limit Indicator2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FEDERAL_UPPER_LIMIT_INDICATOR2
	 * @model name="FederalUpperLimitIndicator2"
	 * @generated
	 * @ordered
	 */
	public static final int FEDERAL_UPPER_LIMIT_INDICATOR2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Federal Upper Limit Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FederalUpperLimitIndicator[] VALUES_ARRAY =
		new FederalUpperLimitIndicator[] {
			FEDERAL_UPPER_LIMIT_INDICATOR_BLANK,
			FEDERAL_UPPER_LIMIT_INDICATOR1,
			FEDERAL_UPPER_LIMIT_INDICATOR2,
		};

	/**
	 * A public read-only list of all the '<em><b>Federal Upper Limit Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FederalUpperLimitIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Federal Upper Limit Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FederalUpperLimitIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FederalUpperLimitIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Federal Upper Limit Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FederalUpperLimitIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FederalUpperLimitIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Federal Upper Limit Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FederalUpperLimitIndicator get(int value) {
		switch (value) {
			case FEDERAL_UPPER_LIMIT_INDICATOR_BLANK_VALUE: return FEDERAL_UPPER_LIMIT_INDICATOR_BLANK;
			case FEDERAL_UPPER_LIMIT_INDICATOR1_VALUE: return FEDERAL_UPPER_LIMIT_INDICATOR1;
			case FEDERAL_UPPER_LIMIT_INDICATOR2_VALUE: return FEDERAL_UPPER_LIMIT_INDICATOR2;
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
	private FederalUpperLimitIndicator(int value, String name, String literal) {
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
	
} //FederalUpperLimitIndicator
