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
 * A representation of the literals of the enumeration '<em><b>Dose Composite Indicator SIG Segment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getDoseCompositeIndicatorSIGSegment()
 * @model
 * @generated
 */
public enum DoseCompositeIndicatorSIGSegment implements Enumerator {
	/**
	 * The '<em><b>Dose Composite Indicator SIG Segment1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT1_VALUE
	 * @generated
	 * @ordered
	 */
	DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT1(0, "DoseCompositeIndicatorSIGSegment1", "DoseCompositeIndicatorSIGSegment1"),

	/**
	 * The '<em><b>Dose Composite Indicator SIG Segment2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT2_VALUE
	 * @generated
	 * @ordered
	 */
	DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT2(1, "DoseCompositeIndicatorSIGSegment2", "DoseCompositeIndicatorSIGSegment2"),

	/**
	 * The '<em><b>Dose Composite Indicator SIG Segment3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT3_VALUE
	 * @generated
	 * @ordered
	 */
	DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT3(2, "DoseCompositeIndicatorSIGSegment3", "DoseCompositeIndicatorSIGSegment3"),

	/**
	 * The '<em><b>Dose Composite Indicator SIG Segment4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT4_VALUE
	 * @generated
	 * @ordered
	 */
	DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT4(3, "DoseCompositeIndicatorSIGSegment4", "DoseCompositeIndicatorSIGSegment4");

	/**
	 * The '<em><b>Dose Composite Indicator SIG Segment1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dose Composite Indicator SIG Segment1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT1
	 * @model name="DoseCompositeIndicatorSIGSegment1"
	 * @generated
	 * @ordered
	 */
	public static final int DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT1_VALUE = 0;

	/**
	 * The '<em><b>Dose Composite Indicator SIG Segment2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dose Composite Indicator SIG Segment2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT2
	 * @model name="DoseCompositeIndicatorSIGSegment2"
	 * @generated
	 * @ordered
	 */
	public static final int DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT2_VALUE = 1;

	/**
	 * The '<em><b>Dose Composite Indicator SIG Segment3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dose Composite Indicator SIG Segment3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT3
	 * @model name="DoseCompositeIndicatorSIGSegment3"
	 * @generated
	 * @ordered
	 */
	public static final int DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT3_VALUE = 2;

	/**
	 * The '<em><b>Dose Composite Indicator SIG Segment4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dose Composite Indicator SIG Segment4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT4
	 * @model name="DoseCompositeIndicatorSIGSegment4"
	 * @generated
	 * @ordered
	 */
	public static final int DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT4_VALUE = 3;

	/**
	 * An array of all the '<em><b>Dose Composite Indicator SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DoseCompositeIndicatorSIGSegment[] VALUES_ARRAY =
		new DoseCompositeIndicatorSIGSegment[] {
			DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT1,
			DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT2,
			DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT3,
			DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT4,
		};

	/**
	 * A public read-only list of all the '<em><b>Dose Composite Indicator SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DoseCompositeIndicatorSIGSegment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dose Composite Indicator SIG Segment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DoseCompositeIndicatorSIGSegment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoseCompositeIndicatorSIGSegment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dose Composite Indicator SIG Segment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DoseCompositeIndicatorSIGSegment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoseCompositeIndicatorSIGSegment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dose Composite Indicator SIG Segment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DoseCompositeIndicatorSIGSegment get(int value) {
		switch (value) {
			case DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT1_VALUE: return DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT1;
			case DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT2_VALUE: return DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT2;
			case DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT3_VALUE: return DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT3;
			case DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT4_VALUE: return DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT4;
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
	private DoseCompositeIndicatorSIGSegment(int value, String name, String literal) {
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
	
} //DoseCompositeIndicatorSIGSegment
