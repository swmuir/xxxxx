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
 * A representation of the literals of the enumeration '<em><b>Eligibility COB Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getEligibilityCOBIndicator()
 * @model
 * @generated
 */
public enum EligibilityCOBIndicator implements Enumerator {
	/**
	 * The '<em><b>Eligibility COB Indicator Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIGIBILITY_COB_INDICATOR_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBILITY_COB_INDICATOR_BLANK(0, "EligibilityCOBIndicatorBlank", "EligibilityCOBIndicatorBlank"),

	/**
	 * The '<em><b>Eligibility COB Indicator1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIGIBILITY_COB_INDICATOR1_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBILITY_COB_INDICATOR1(1, "EligibilityCOBIndicator1", "EligibilityCOBIndicator1"),

	/**
	 * The '<em><b>Eligibility COB Indicator2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIGIBILITY_COB_INDICATOR2_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBILITY_COB_INDICATOR2(2, "EligibilityCOBIndicator2", "EligibilityCOBIndicator2"),

	/**
	 * The '<em><b>Eligibility COB Indicator3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIGIBILITY_COB_INDICATOR3_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBILITY_COB_INDICATOR3(3, "EligibilityCOBIndicator3", "EligibilityCOBIndicator3");

	/**
	 * The '<em><b>Eligibility COB Indicator Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eligibility COB Indicator Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELIGIBILITY_COB_INDICATOR_BLANK
	 * @model name="EligibilityCOBIndicatorBlank"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBILITY_COB_INDICATOR_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Eligibility COB Indicator1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eligibility COB Indicator1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELIGIBILITY_COB_INDICATOR1
	 * @model name="EligibilityCOBIndicator1"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBILITY_COB_INDICATOR1_VALUE = 1;

	/**
	 * The '<em><b>Eligibility COB Indicator2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eligibility COB Indicator2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELIGIBILITY_COB_INDICATOR2
	 * @model name="EligibilityCOBIndicator2"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBILITY_COB_INDICATOR2_VALUE = 2;

	/**
	 * The '<em><b>Eligibility COB Indicator3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eligibility COB Indicator3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELIGIBILITY_COB_INDICATOR3
	 * @model name="EligibilityCOBIndicator3"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBILITY_COB_INDICATOR3_VALUE = 3;

	/**
	 * An array of all the '<em><b>Eligibility COB Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EligibilityCOBIndicator[] VALUES_ARRAY =
		new EligibilityCOBIndicator[] {
			ELIGIBILITY_COB_INDICATOR_BLANK,
			ELIGIBILITY_COB_INDICATOR1,
			ELIGIBILITY_COB_INDICATOR2,
			ELIGIBILITY_COB_INDICATOR3,
		};

	/**
	 * A public read-only list of all the '<em><b>Eligibility COB Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EligibilityCOBIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eligibility COB Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EligibilityCOBIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EligibilityCOBIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eligibility COB Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EligibilityCOBIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EligibilityCOBIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eligibility COB Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EligibilityCOBIndicator get(int value) {
		switch (value) {
			case ELIGIBILITY_COB_INDICATOR_BLANK_VALUE: return ELIGIBILITY_COB_INDICATOR_BLANK;
			case ELIGIBILITY_COB_INDICATOR1_VALUE: return ELIGIBILITY_COB_INDICATOR1;
			case ELIGIBILITY_COB_INDICATOR2_VALUE: return ELIGIBILITY_COB_INDICATOR2;
			case ELIGIBILITY_COB_INDICATOR3_VALUE: return ELIGIBILITY_COB_INDICATOR3;
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
	private EligibilityCOBIndicator(int value, String name, String literal) {
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
	
} //EligibilityCOBIndicator
