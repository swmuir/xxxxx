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
 * A representation of the literals of the enumeration '<em><b>Multiple Sig Modifier SIG Segment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getMultipleSigModifierSIGSegment()
 * @model
 * @generated
 */
public enum MultipleSigModifierSIGSegment implements Enumerator {
	/**
	 * The '<em><b>Multiple Sig Modifier SIG Segment AND</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_AND_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_AND(0, "MultipleSigModifierSIGSegmentAND", "MultipleSigModifierSIGSegmentAND"),

	/**
	 * The '<em><b>Multiple Sig Modifier SIG Segment OR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_OR_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_OR(1, "MultipleSigModifierSIGSegmentOR", "MultipleSigModifierSIGSegmentOR"),

	/**
	 * The '<em><b>Multiple Sig Modifier SIG Segment THEN</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_THEN_VALUE
	 * @generated
	 * @ordered
	 */
	MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_THEN(2, "MultipleSigModifierSIGSegmentTHEN", "MultipleSigModifierSIGSegmentTHEN");

	/**
	 * The '<em><b>Multiple Sig Modifier SIG Segment AND</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Sig Modifier SIG Segment AND</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_AND
	 * @model name="MultipleSigModifierSIGSegmentAND"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_AND_VALUE = 0;

	/**
	 * The '<em><b>Multiple Sig Modifier SIG Segment OR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Sig Modifier SIG Segment OR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_OR
	 * @model name="MultipleSigModifierSIGSegmentOR"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_OR_VALUE = 1;

	/**
	 * The '<em><b>Multiple Sig Modifier SIG Segment THEN</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Multiple Sig Modifier SIG Segment THEN</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_THEN
	 * @model name="MultipleSigModifierSIGSegmentTHEN"
	 * @generated
	 * @ordered
	 */
	public static final int MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_THEN_VALUE = 2;

	/**
	 * An array of all the '<em><b>Multiple Sig Modifier SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MultipleSigModifierSIGSegment[] VALUES_ARRAY =
		new MultipleSigModifierSIGSegment[] {
			MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_AND,
			MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_OR,
			MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_THEN,
		};

	/**
	 * A public read-only list of all the '<em><b>Multiple Sig Modifier SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MultipleSigModifierSIGSegment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Multiple Sig Modifier SIG Segment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleSigModifierSIGSegment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultipleSigModifierSIGSegment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiple Sig Modifier SIG Segment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleSigModifierSIGSegment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MultipleSigModifierSIGSegment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Multiple Sig Modifier SIG Segment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MultipleSigModifierSIGSegment get(int value) {
		switch (value) {
			case MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_AND_VALUE: return MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_AND;
			case MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_OR_VALUE: return MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_OR;
			case MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_THEN_VALUE: return MULTIPLE_SIG_MODIFIER_SIG_SEGMENT_THEN;
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
	private MultipleSigModifierSIGSegment(int value, String name, String literal) {
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
	
} //MultipleSigModifierSIGSegment
