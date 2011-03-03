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
 * A representation of the literals of the enumeration '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getMultipleSiteofAdministrationTimingModifierSIGSegment()
 * @model
 * @generated
 */
public enum MultipleSiteofAdministrationTimingModifierSIGSegment implements Enumerator {
	/**
	 * The '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_AND_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_AND(0, "MultipleSiteofAdministrationTimingModifierSIGSegmentAND", "MultipleSiteofAdministrationTimingModifierSIGSegmentAND"),

	/**
	 * The '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_OR_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_OR(1, "MultipleSiteofAdministrationTimingModifierSIGSegmentOR", "MultipleSiteofAdministrationTimingModifierSIGSegmentOR"),

	/**
	 * The '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment NOT</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_NOT_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_NOT(2, "MultipleSiteofAdministrationTimingModifierSIGSegmentNOT", "MultipleSiteofAdministrationTimingModifierSIGSegmentNOT");

	/**
	 * The '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment AND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_AND
	 * @model name="MultipleSiteofAdministrationTimingModifierSIGSegmentAND"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_AND_VALUE = 0;

	/**
	 * The '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment OR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_OR
	 * @model name="MultipleSiteofAdministrationTimingModifierSIGSegmentOR"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_OR_VALUE = 1;

	/**
	 * The '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment NOT</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment NOT</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_NOT
	 * @model name="MultipleSiteofAdministrationTimingModifierSIGSegmentNOT"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_NOT_VALUE = 2;

	/**
	 * An array of all the '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultipleSiteofAdministrationTimingModifierSIGSegment[] VALUES_ARRAY =
		new MultipleSiteofAdministrationTimingModifierSIGSegment[] {
			MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_AND,
			MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_OR,
			MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_NOT,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MultipleSiteofAdministrationTimingModifierSIGSegment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleSiteofAdministrationTimingModifierSIGSegment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultipleSiteofAdministrationTimingModifierSIGSegment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleSiteofAdministrationTimingModifierSIGSegment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultipleSiteofAdministrationTimingModifierSIGSegment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiple Siteof Administration Timing Modifier SIG Segment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleSiteofAdministrationTimingModifierSIGSegment get(int value) {
		switch (value) {
			case MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_AND_VALUE: return MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_AND;
			case MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_OR_VALUE: return MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_OR;
			case MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_NOT_VALUE: return MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT_NOT;
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
	private MultipleSiteofAdministrationTimingModifierSIGSegment(int value, String name, String literal) {
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
	
} //MultipleSiteofAdministrationTimingModifierSIGSegment
