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
 * A representation of the literals of the enumeration '<em><b>Prescription Over The Counter Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPrescriptionOverTheCounterIndicator()
 * @model
 * @generated
 */
public enum PrescriptionOverTheCounterIndicator implements Enumerator {
	/**
	 * The '<em><b>Prescription Over The Counter Indicator Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_BLANK(0, "PrescriptionOverTheCounterIndicatorBlank", "PrescriptionOverTheCounterIndicatorBlank"),

	/**
	 * The '<em><b>Prescription Over The Counter Indicator O</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_O_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_O(1, "PrescriptionOverTheCounterIndicatorO", "PrescriptionOverTheCounterIndicatorO"),

	/**
	 * The '<em><b>Prescription Over The Counter Indicator F</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_F_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_F(2, "PrescriptionOverTheCounterIndicatorF", "PrescriptionOverTheCounterIndicatorF"),

	/**
	 * The '<em><b>Prescription Over The Counter Indicator S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_S_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_S(3, "PrescriptionOverTheCounterIndicatorS", "PrescriptionOverTheCounterIndicatorS");

	/**
	 * The '<em><b>Prescription Over The Counter Indicator Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescription Over The Counter Indicator Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_BLANK
	 * @model name="PrescriptionOverTheCounterIndicatorBlank"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Prescription Over The Counter Indicator O</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescription Over The Counter Indicator O</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_O
	 * @model name="PrescriptionOverTheCounterIndicatorO"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_O_VALUE = 1;

	/**
	 * The '<em><b>Prescription Over The Counter Indicator F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescription Over The Counter Indicator F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_F
	 * @model name="PrescriptionOverTheCounterIndicatorF"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_F_VALUE = 2;

	/**
	 * The '<em><b>Prescription Over The Counter Indicator S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescription Over The Counter Indicator S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_S
	 * @model name="PrescriptionOverTheCounterIndicatorS"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_S_VALUE = 3;

	/**
	 * An array of all the '<em><b>Prescription Over The Counter Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrescriptionOverTheCounterIndicator[] VALUES_ARRAY =
		new PrescriptionOverTheCounterIndicator[] {
			PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_BLANK,
			PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_O,
			PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_F,
			PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_S,
		};

	/**
	 * A public read-only list of all the '<em><b>Prescription Over The Counter Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrescriptionOverTheCounterIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Prescription Over The Counter Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriptionOverTheCounterIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrescriptionOverTheCounterIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prescription Over The Counter Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriptionOverTheCounterIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrescriptionOverTheCounterIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prescription Over The Counter Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriptionOverTheCounterIndicator get(int value) {
		switch (value) {
			case PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_BLANK_VALUE: return PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_BLANK;
			case PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_O_VALUE: return PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_O;
			case PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_F_VALUE: return PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_F;
			case PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_S_VALUE: return PRESCRIPTION_OVER_THE_COUNTER_INDICATOR_S;
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
	private PrescriptionOverTheCounterIndicator(int value, String name, String literal) {
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
	
} //PrescriptionOverTheCounterIndicator
