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
 * A representation of the literals of the enumeration '<em><b>Pregnancy Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPregnancyIndicator()
 * @model
 * @generated
 */
public enum PregnancyIndicator implements Enumerator {
	/**
	 * The '<em><b>Pregnancy Indicator Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREGNANCY_INDICATOR_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	PREGNANCY_INDICATOR_BLANK(0, "PregnancyIndicatorBlank", "PregnancyIndicatorBlank"),

	/**
	 * The '<em><b>Pregnancy Indicator1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREGNANCY_INDICATOR1_VALUE
	 * @generated
	 * @ordered
	 */
	PREGNANCY_INDICATOR1(1, "PregnancyIndicator1", "PregnancyIndicator1"),

	/**
	 * The '<em><b>Pregnancy Indicator2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PREGNANCY_INDICATOR2_VALUE
	 * @generated
	 * @ordered
	 */
	PREGNANCY_INDICATOR2(2, "PregnancyIndicator2", "PregnancyIndicator2");

	/**
	 * The '<em><b>Pregnancy Indicator Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pregnancy Indicator Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREGNANCY_INDICATOR_BLANK
	 * @model name="PregnancyIndicatorBlank"
	 * @generated
	 * @ordered
	 */
	public static final int PREGNANCY_INDICATOR_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Pregnancy Indicator1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pregnancy Indicator1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREGNANCY_INDICATOR1
	 * @model name="PregnancyIndicator1"
	 * @generated
	 * @ordered
	 */
	public static final int PREGNANCY_INDICATOR1_VALUE = 1;

	/**
	 * The '<em><b>Pregnancy Indicator2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Pregnancy Indicator2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PREGNANCY_INDICATOR2
	 * @model name="PregnancyIndicator2"
	 * @generated
	 * @ordered
	 */
	public static final int PREGNANCY_INDICATOR2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Pregnancy Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PregnancyIndicator[] VALUES_ARRAY =
		new PregnancyIndicator[] {
			PREGNANCY_INDICATOR_BLANK,
			PREGNANCY_INDICATOR1,
			PREGNANCY_INDICATOR2,
		};

	/**
	 * A public read-only list of all the '<em><b>Pregnancy Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PregnancyIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Pregnancy Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PregnancyIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PregnancyIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pregnancy Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PregnancyIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PregnancyIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Pregnancy Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PregnancyIndicator get(int value) {
		switch (value) {
			case PREGNANCY_INDICATOR_BLANK_VALUE: return PREGNANCY_INDICATOR_BLANK;
			case PREGNANCY_INDICATOR1_VALUE: return PREGNANCY_INDICATOR1;
			case PREGNANCY_INDICATOR2_VALUE: return PREGNANCY_INDICATOR2;
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
	private PregnancyIndicator(int value, String name, String literal) {
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
	
} //PregnancyIndicator
