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
 * A representation of the literals of the enumeration '<em><b>Body Metric Qualifier SIG Segment</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getBodyMetricQualifierSIGSegment()
 * @model
 * @generated
 */
public enum BodyMetricQualifierSIGSegment implements Enumerator {
	/**
	 * The '<em><b>Body Metric Qualifier SIG Segment1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY_METRIC_QUALIFIER_SIG_SEGMENT1_VALUE
	 * @generated
	 * @ordered
	 */
	BODY_METRIC_QUALIFIER_SIG_SEGMENT1(0, "BodyMetricQualifierSIGSegment1", "BodyMetricQualifierSIGSegment1"),

	/**
	 * The '<em><b>Body Metric Qualifier SIG Segment2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BODY_METRIC_QUALIFIER_SIG_SEGMENT2_VALUE
	 * @generated
	 * @ordered
	 */
	BODY_METRIC_QUALIFIER_SIG_SEGMENT2(1, "BodyMetricQualifierSIGSegment2", "BodyMetricQualifierSIGSegment2");

	/**
	 * The '<em><b>Body Metric Qualifier SIG Segment1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Body Metric Qualifier SIG Segment1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BODY_METRIC_QUALIFIER_SIG_SEGMENT1
	 * @model name="BodyMetricQualifierSIGSegment1"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_METRIC_QUALIFIER_SIG_SEGMENT1_VALUE = 0;

	/**
	 * The '<em><b>Body Metric Qualifier SIG Segment2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Body Metric Qualifier SIG Segment2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BODY_METRIC_QUALIFIER_SIG_SEGMENT2
	 * @model name="BodyMetricQualifierSIGSegment2"
	 * @generated
	 * @ordered
	 */
	public static final int BODY_METRIC_QUALIFIER_SIG_SEGMENT2_VALUE = 1;

	/**
	 * An array of all the '<em><b>Body Metric Qualifier SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BodyMetricQualifierSIGSegment[] VALUES_ARRAY =
		new BodyMetricQualifierSIGSegment[] {
			BODY_METRIC_QUALIFIER_SIG_SEGMENT1,
			BODY_METRIC_QUALIFIER_SIG_SEGMENT2,
		};

	/**
	 * A public read-only list of all the '<em><b>Body Metric Qualifier SIG Segment</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BodyMetricQualifierSIGSegment> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Body Metric Qualifier SIG Segment</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BodyMetricQualifierSIGSegment get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BodyMetricQualifierSIGSegment result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Body Metric Qualifier SIG Segment</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BodyMetricQualifierSIGSegment getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BodyMetricQualifierSIGSegment result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Body Metric Qualifier SIG Segment</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BodyMetricQualifierSIGSegment get(int value) {
		switch (value) {
			case BODY_METRIC_QUALIFIER_SIG_SEGMENT1_VALUE: return BODY_METRIC_QUALIFIER_SIG_SEGMENT1;
			case BODY_METRIC_QUALIFIER_SIG_SEGMENT2_VALUE: return BODY_METRIC_QUALIFIER_SIG_SEGMENT2;
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
	private BodyMetricQualifierSIGSegment(int value, String name, String literal) {
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
	
} //BodyMetricQualifierSIGSegment
