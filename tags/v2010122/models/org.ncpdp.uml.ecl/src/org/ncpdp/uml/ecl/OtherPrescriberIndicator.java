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
 * A representation of the literals of the enumeration '<em><b>Other Prescriber Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getOtherPrescriberIndicator()
 * @model
 * @generated
 */
public enum OtherPrescriberIndicator implements Enumerator {
	/**
	 * The '<em><b>Other Prescriber Indicator0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_PRESCRIBER_INDICATOR0_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_PRESCRIBER_INDICATOR0(0, "OtherPrescriberIndicator0", "OtherPrescriberIndicator0"),

	/**
	 * The '<em><b>Other Prescriber Indicator1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_PRESCRIBER_INDICATOR1_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_PRESCRIBER_INDICATOR1(1, "OtherPrescriberIndicator1", "OtherPrescriberIndicator1"),

	/**
	 * The '<em><b>Other Prescriber Indicator2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #OTHER_PRESCRIBER_INDICATOR2_VALUE
	 * @generated
	 * @ordered
	 */
	OTHER_PRESCRIBER_INDICATOR2(2, "OtherPrescriberIndicator2", "OtherPrescriberIndicator2");

	/**
	 * The '<em><b>Other Prescriber Indicator0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Prescriber Indicator0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_PRESCRIBER_INDICATOR0
	 * @model name="OtherPrescriberIndicator0"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_PRESCRIBER_INDICATOR0_VALUE = 0;

	/**
	 * The '<em><b>Other Prescriber Indicator1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Prescriber Indicator1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_PRESCRIBER_INDICATOR1
	 * @model name="OtherPrescriberIndicator1"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_PRESCRIBER_INDICATOR1_VALUE = 1;

	/**
	 * The '<em><b>Other Prescriber Indicator2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Other Prescriber Indicator2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #OTHER_PRESCRIBER_INDICATOR2
	 * @model name="OtherPrescriberIndicator2"
	 * @generated
	 * @ordered
	 */
	public static final int OTHER_PRESCRIBER_INDICATOR2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Other Prescriber Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OtherPrescriberIndicator[] VALUES_ARRAY =
		new OtherPrescriberIndicator[] {
			OTHER_PRESCRIBER_INDICATOR0,
			OTHER_PRESCRIBER_INDICATOR1,
			OTHER_PRESCRIBER_INDICATOR2,
		};

	/**
	 * A public read-only list of all the '<em><b>Other Prescriber Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OtherPrescriberIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Other Prescriber Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OtherPrescriberIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OtherPrescriberIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Other Prescriber Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OtherPrescriberIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OtherPrescriberIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Other Prescriber Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static OtherPrescriberIndicator get(int value) {
		switch (value) {
			case OTHER_PRESCRIBER_INDICATOR0_VALUE: return OTHER_PRESCRIBER_INDICATOR0;
			case OTHER_PRESCRIBER_INDICATOR1_VALUE: return OTHER_PRESCRIBER_INDICATOR1;
			case OTHER_PRESCRIBER_INDICATOR2_VALUE: return OTHER_PRESCRIBER_INDICATOR2;
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
	private OtherPrescriberIndicator(int value, String name, String literal) {
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
	
} //OtherPrescriberIndicator
