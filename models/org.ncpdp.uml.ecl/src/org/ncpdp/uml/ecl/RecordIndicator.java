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
 * A representation of the literals of the enumeration '<em><b>Record Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getRecordIndicator()
 * @model
 * @generated
 */
public enum RecordIndicator implements Enumerator {
	/**
	 * The '<em><b>Record Indicator Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_INDICATOR_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD_INDICATOR_BLANK(0, "RecordIndicatorBlank", "RecordIndicatorBlank"),

	/**
	 * The '<em><b>Record Indicator0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_INDICATOR0_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD_INDICATOR0(1, "RecordIndicator0", "RecordIndicator0"),

	/**
	 * The '<em><b>Record Indicator1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_INDICATOR1_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD_INDICATOR1(2, "RecordIndicator1", "RecordIndicator1"),

	/**
	 * The '<em><b>Record Indicator2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_INDICATOR2_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD_INDICATOR2(3, "RecordIndicator2", "RecordIndicator2");

	/**
	 * The '<em><b>Record Indicator Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Record Indicator Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORD_INDICATOR_BLANK
	 * @model name="RecordIndicatorBlank"
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_INDICATOR_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Record Indicator0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Record Indicator0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORD_INDICATOR0
	 * @model name="RecordIndicator0"
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_INDICATOR0_VALUE = 1;

	/**
	 * The '<em><b>Record Indicator1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Record Indicator1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORD_INDICATOR1
	 * @model name="RecordIndicator1"
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_INDICATOR1_VALUE = 2;

	/**
	 * The '<em><b>Record Indicator2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Record Indicator2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORD_INDICATOR2
	 * @model name="RecordIndicator2"
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_INDICATOR2_VALUE = 3;

	/**
	 * An array of all the '<em><b>Record Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RecordIndicator[] VALUES_ARRAY =
		new RecordIndicator[] {
			RECORD_INDICATOR_BLANK,
			RECORD_INDICATOR0,
			RECORD_INDICATOR1,
			RECORD_INDICATOR2,
		};

	/**
	 * A public read-only list of all the '<em><b>Record Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RecordIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Record Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecordIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecordIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Record Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecordIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecordIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Record Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecordIndicator get(int value) {
		switch (value) {
			case RECORD_INDICATOR_BLANK_VALUE: return RECORD_INDICATOR_BLANK;
			case RECORD_INDICATOR0_VALUE: return RECORD_INDICATOR0;
			case RECORD_INDICATOR1_VALUE: return RECORD_INDICATOR1;
			case RECORD_INDICATOR2_VALUE: return RECORD_INDICATOR2;
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
	private RecordIndicator(int value, String name, String literal) {
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
	
} //RecordIndicator
