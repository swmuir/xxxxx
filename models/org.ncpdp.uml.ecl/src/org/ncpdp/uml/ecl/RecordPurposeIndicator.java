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
 * A representation of the literals of the enumeration '<em><b>Record Purpose Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getRecordPurposeIndicator()
 * @model
 * @generated
 */
public enum RecordPurposeIndicator implements Enumerator {
	/**
	 * The '<em><b>Record Purpose Indicator M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_PURPOSE_INDICATOR_M_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD_PURPOSE_INDICATOR_M(0, "RecordPurposeIndicatorM", "RecordPurposeIndicatorM"),

	/**
	 * The '<em><b>Record Purpose Indicator O</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_PURPOSE_INDICATOR_O_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD_PURPOSE_INDICATOR_O(1, "RecordPurposeIndicatorO", "RecordPurposeIndicatorO"),

	/**
	 * The '<em><b>Record Purpose Indicator R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECORD_PURPOSE_INDICATOR_R_VALUE
	 * @generated
	 * @ordered
	 */
	RECORD_PURPOSE_INDICATOR_R(2, "RecordPurposeIndicatorR", "RecordPurposeIndicatorR");

	/**
	 * The '<em><b>Record Purpose Indicator M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Record Purpose Indicator M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORD_PURPOSE_INDICATOR_M
	 * @model name="RecordPurposeIndicatorM"
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_PURPOSE_INDICATOR_M_VALUE = 0;

	/**
	 * The '<em><b>Record Purpose Indicator O</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Record Purpose Indicator O</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORD_PURPOSE_INDICATOR_O
	 * @model name="RecordPurposeIndicatorO"
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_PURPOSE_INDICATOR_O_VALUE = 1;

	/**
	 * The '<em><b>Record Purpose Indicator R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Record Purpose Indicator R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECORD_PURPOSE_INDICATOR_R
	 * @model name="RecordPurposeIndicatorR"
	 * @generated
	 * @ordered
	 */
	public static final int RECORD_PURPOSE_INDICATOR_R_VALUE = 2;

	/**
	 * An array of all the '<em><b>Record Purpose Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RecordPurposeIndicator[] VALUES_ARRAY =
		new RecordPurposeIndicator[] {
			RECORD_PURPOSE_INDICATOR_M,
			RECORD_PURPOSE_INDICATOR_O,
			RECORD_PURPOSE_INDICATOR_R,
		};

	/**
	 * A public read-only list of all the '<em><b>Record Purpose Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RecordPurposeIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Record Purpose Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecordPurposeIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecordPurposeIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Record Purpose Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecordPurposeIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RecordPurposeIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Record Purpose Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RecordPurposeIndicator get(int value) {
		switch (value) {
			case RECORD_PURPOSE_INDICATOR_M_VALUE: return RECORD_PURPOSE_INDICATOR_M;
			case RECORD_PURPOSE_INDICATOR_O_VALUE: return RECORD_PURPOSE_INDICATOR_O;
			case RECORD_PURPOSE_INDICATOR_R_VALUE: return RECORD_PURPOSE_INDICATOR_R;
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
	private RecordPurposeIndicator(int value, String name, String literal) {
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
	
} //RecordPurposeIndicator
