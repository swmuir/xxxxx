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
 * A representation of the literals of the enumeration '<em><b>Stop Indicator SIG Segment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getStopIndicatorSIGSegment()
 * @model
 * @generated
 */
public enum StopIndicatorSIGSegment implements Enumerator {
	/**
	 * The '<em><b>Stop Indicator SIG Segment Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_INDICATOR_SIG_SEGMENT_Y_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_INDICATOR_SIG_SEGMENT_Y(0, "StopIndicatorSIGSegmentY", "StopIndicatorSIGSegmentY"),

	/**
	 * The '<em><b>Stop Indicator SIG Segment N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #STOP_INDICATOR_SIG_SEGMENT_N_VALUE
	 * @generated
	 * @ordered
	 */
	STOP_INDICATOR_SIG_SEGMENT_N(1, "StopIndicatorSIGSegmentN", "StopIndicatorSIGSegmentN");

	/**
	 * The '<em><b>Stop Indicator SIG Segment Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stop Indicator SIG Segment Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOP_INDICATOR_SIG_SEGMENT_Y
	 * @model name="StopIndicatorSIGSegmentY"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_INDICATOR_SIG_SEGMENT_Y_VALUE = 0;

	/**
	 * The '<em><b>Stop Indicator SIG Segment N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Stop Indicator SIG Segment N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #STOP_INDICATOR_SIG_SEGMENT_N
	 * @model name="StopIndicatorSIGSegmentN"
	 * @generated
	 * @ordered
	 */
	public static final int STOP_INDICATOR_SIG_SEGMENT_N_VALUE = 1;

	/**
	 * An array of all the '<em><b>Stop Indicator SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final StopIndicatorSIGSegment[] VALUES_ARRAY =
		new StopIndicatorSIGSegment[] {
			STOP_INDICATOR_SIG_SEGMENT_Y,
			STOP_INDICATOR_SIG_SEGMENT_N,
		};

	/**
	 * A public read-only list of all the '<em><b>Stop Indicator SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<StopIndicatorSIGSegment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Stop Indicator SIG Segment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StopIndicatorSIGSegment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StopIndicatorSIGSegment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stop Indicator SIG Segment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StopIndicatorSIGSegment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			StopIndicatorSIGSegment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Stop Indicator SIG Segment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static StopIndicatorSIGSegment get(int value) {
		switch (value) {
			case STOP_INDICATOR_SIG_SEGMENT_Y_VALUE: return STOP_INDICATOR_SIG_SEGMENT_Y;
			case STOP_INDICATOR_SIG_SEGMENT_N_VALUE: return STOP_INDICATOR_SIG_SEGMENT_N;
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
	private StopIndicatorSIGSegment(int value, String name, String literal) {
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
	
} //StopIndicatorSIGSegment
