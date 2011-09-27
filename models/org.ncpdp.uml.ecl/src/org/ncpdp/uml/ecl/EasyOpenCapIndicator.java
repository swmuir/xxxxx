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
 * A representation of the literals of the enumeration '<em><b>Easy Open Cap Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getEasyOpenCapIndicator()
 * @model
 * @generated
 */
public enum EasyOpenCapIndicator implements Enumerator {
	/**
	 * The '<em><b>Easy Open Cap Indicator Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EASY_OPEN_CAP_INDICATOR_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	EASY_OPEN_CAP_INDICATOR_BLANK(0, "EasyOpenCapIndicatorBlank", "EasyOpenCapIndicatorBlank"),

	/**
	 * The '<em><b>Easy Open Cap Indicator1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EASY_OPEN_CAP_INDICATOR1_VALUE
	 * @generated
	 * @ordered
	 */
	EASY_OPEN_CAP_INDICATOR1(1, "EasyOpenCapIndicator1", "EasyOpenCapIndicator1"),

	/**
	 * The '<em><b>Easy Open Cap Indicator2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #EASY_OPEN_CAP_INDICATOR2_VALUE
	 * @generated
	 * @ordered
	 */
	EASY_OPEN_CAP_INDICATOR2(2, "EasyOpenCapIndicator2", "EasyOpenCapIndicator2");

	/**
	 * The '<em><b>Easy Open Cap Indicator Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Easy Open Cap Indicator Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EASY_OPEN_CAP_INDICATOR_BLANK
	 * @model name="EasyOpenCapIndicatorBlank"
	 * @generated
	 * @ordered
	 */
	public static final int EASY_OPEN_CAP_INDICATOR_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Easy Open Cap Indicator1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Easy Open Cap Indicator1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EASY_OPEN_CAP_INDICATOR1
	 * @model name="EasyOpenCapIndicator1"
	 * @generated
	 * @ordered
	 */
	public static final int EASY_OPEN_CAP_INDICATOR1_VALUE = 1;

	/**
	 * The '<em><b>Easy Open Cap Indicator2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Easy Open Cap Indicator2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #EASY_OPEN_CAP_INDICATOR2
	 * @model name="EasyOpenCapIndicator2"
	 * @generated
	 * @ordered
	 */
	public static final int EASY_OPEN_CAP_INDICATOR2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Easy Open Cap Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EasyOpenCapIndicator[] VALUES_ARRAY =
		new EasyOpenCapIndicator[] {
			EASY_OPEN_CAP_INDICATOR_BLANK,
			EASY_OPEN_CAP_INDICATOR1,
			EASY_OPEN_CAP_INDICATOR2,
		};

	/**
	 * A public read-only list of all the '<em><b>Easy Open Cap Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EasyOpenCapIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Easy Open Cap Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EasyOpenCapIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EasyOpenCapIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Easy Open Cap Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EasyOpenCapIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EasyOpenCapIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Easy Open Cap Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EasyOpenCapIndicator get(int value) {
		switch (value) {
			case EASY_OPEN_CAP_INDICATOR_BLANK_VALUE: return EASY_OPEN_CAP_INDICATOR_BLANK;
			case EASY_OPEN_CAP_INDICATOR1_VALUE: return EASY_OPEN_CAP_INDICATOR1;
			case EASY_OPEN_CAP_INDICATOR2_VALUE: return EASY_OPEN_CAP_INDICATOR2;
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
	private EasyOpenCapIndicator(int value, String name, String literal) {
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
	
} //EasyOpenCapIndicator
