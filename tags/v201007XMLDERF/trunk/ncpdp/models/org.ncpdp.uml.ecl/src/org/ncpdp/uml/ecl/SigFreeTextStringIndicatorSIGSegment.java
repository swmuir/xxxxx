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
 * A representation of the literals of the enumeration '<em><b>Sig Free Text String Indicator SIG Segment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getSigFreeTextStringIndicatorSIGSegment()
 * @model
 * @generated
 */
public enum SigFreeTextStringIndicatorSIGSegment implements Enumerator {
	/**
	 * The '<em><b>Sig Free Text String Indicator SIG Segment1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT1_VALUE
	 * @generated
	 * @ordered
	 */
	SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT1(0, "SigFreeTextStringIndicatorSIGSegment1", "SigFreeTextStringIndicatorSIGSegment1"),

	/**
	 * The '<em><b>Sig Free Text String Indicator SIG Segment2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT2_VALUE
	 * @generated
	 * @ordered
	 */
	SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT2(1, "SigFreeTextStringIndicatorSIGSegment2", "SigFreeTextStringIndicatorSIGSegment2"),

	/**
	 * The '<em><b>Sig Free Text String Indicator SIG Segment3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT3_VALUE
	 * @generated
	 * @ordered
	 */
	SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT3(2, "SigFreeTextStringIndicatorSIGSegment3", "SigFreeTextStringIndicatorSIGSegment3");

	/**
	 * The '<em><b>Sig Free Text String Indicator SIG Segment1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sig Free Text String Indicator SIG Segment1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT1
	 * @model name="SigFreeTextStringIndicatorSIGSegment1"
	 * @generated
	 * @ordered
	 */
	public static final int SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT1_VALUE = 0;

	/**
	 * The '<em><b>Sig Free Text String Indicator SIG Segment2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sig Free Text String Indicator SIG Segment2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT2
	 * @model name="SigFreeTextStringIndicatorSIGSegment2"
	 * @generated
	 * @ordered
	 */
	public static final int SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT2_VALUE = 1;

	/**
	 * The '<em><b>Sig Free Text String Indicator SIG Segment3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sig Free Text String Indicator SIG Segment3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT3
	 * @model name="SigFreeTextStringIndicatorSIGSegment3"
	 * @generated
	 * @ordered
	 */
	public static final int SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT3_VALUE = 2;

	/**
	 * An array of all the '<em><b>Sig Free Text String Indicator SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SigFreeTextStringIndicatorSIGSegment[] VALUES_ARRAY =
		new SigFreeTextStringIndicatorSIGSegment[] {
			SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT1,
			SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT2,
			SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT3,
		};

	/**
	 * A public read-only list of all the '<em><b>Sig Free Text String Indicator SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SigFreeTextStringIndicatorSIGSegment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sig Free Text String Indicator SIG Segment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SigFreeTextStringIndicatorSIGSegment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SigFreeTextStringIndicatorSIGSegment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sig Free Text String Indicator SIG Segment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SigFreeTextStringIndicatorSIGSegment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SigFreeTextStringIndicatorSIGSegment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sig Free Text String Indicator SIG Segment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SigFreeTextStringIndicatorSIGSegment get(int value) {
		switch (value) {
			case SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT1_VALUE: return SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT1;
			case SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT2_VALUE: return SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT2;
			case SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT3_VALUE: return SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT3;
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
	private SigFreeTextStringIndicatorSIGSegment(int value, String name, String literal) {
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
	
} //SigFreeTextStringIndicatorSIGSegment
