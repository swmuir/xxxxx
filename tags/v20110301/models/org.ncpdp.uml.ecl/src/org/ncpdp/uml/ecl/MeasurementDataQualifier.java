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
 * A representation of the literals of the enumeration '<em><b>Measurement Data Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getMeasurementDataQualifier()
 * @model
 * @generated
 */
public enum MeasurementDataQualifier implements Enumerator {
	/**
	 * The '<em><b>Measurement Data Qualifier1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_DATA_QUALIFIER1_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREMENT_DATA_QUALIFIER1(0, "MeasurementDataQualifier1", "MeasurementDataQualifier1"),

	/**
	 * The '<em><b>Measurement Data Qualifier2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_DATA_QUALIFIER2_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREMENT_DATA_QUALIFIER2(1, "MeasurementDataQualifier2", "MeasurementDataQualifier2"),

	/**
	 * The '<em><b>Measurement Data Qualifier3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_DATA_QUALIFIER3_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREMENT_DATA_QUALIFIER3(2, "MeasurementDataQualifier3", "MeasurementDataQualifier3"),

	/**
	 * The '<em><b>Measurement Data Qualifier4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_DATA_QUALIFIER4_VALUE
	 * @generated
	 * @ordered
	 */
	MEASUREMENT_DATA_QUALIFIER4(3, "MeasurementDataQualifier4", "MeasurementDataQualifier4");

	/**
	 * The '<em><b>Measurement Data Qualifier1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measurement Data Qualifier1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_DATA_QUALIFIER1
	 * @model name="MeasurementDataQualifier1"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_DATA_QUALIFIER1_VALUE = 0;

	/**
	 * The '<em><b>Measurement Data Qualifier2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measurement Data Qualifier2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_DATA_QUALIFIER2
	 * @model name="MeasurementDataQualifier2"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_DATA_QUALIFIER2_VALUE = 1;

	/**
	 * The '<em><b>Measurement Data Qualifier3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measurement Data Qualifier3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_DATA_QUALIFIER3
	 * @model name="MeasurementDataQualifier3"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_DATA_QUALIFIER3_VALUE = 2;

	/**
	 * The '<em><b>Measurement Data Qualifier4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Measurement Data Qualifier4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEASUREMENT_DATA_QUALIFIER4
	 * @model name="MeasurementDataQualifier4"
	 * @generated
	 * @ordered
	 */
	public static final int MEASUREMENT_DATA_QUALIFIER4_VALUE = 3;

	/**
	 * An array of all the '<em><b>Measurement Data Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MeasurementDataQualifier[] VALUES_ARRAY =
		new MeasurementDataQualifier[] {
			MEASUREMENT_DATA_QUALIFIER1,
			MEASUREMENT_DATA_QUALIFIER2,
			MEASUREMENT_DATA_QUALIFIER3,
			MEASUREMENT_DATA_QUALIFIER4,
		};

	/**
	 * A public read-only list of all the '<em><b>Measurement Data Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MeasurementDataQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Measurement Data Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasurementDataQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurementDataQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurement Data Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasurementDataQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MeasurementDataQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Measurement Data Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MeasurementDataQualifier get(int value) {
		switch (value) {
			case MEASUREMENT_DATA_QUALIFIER1_VALUE: return MEASUREMENT_DATA_QUALIFIER1;
			case MEASUREMENT_DATA_QUALIFIER2_VALUE: return MEASUREMENT_DATA_QUALIFIER2;
			case MEASUREMENT_DATA_QUALIFIER3_VALUE: return MEASUREMENT_DATA_QUALIFIER3;
			case MEASUREMENT_DATA_QUALIFIER4_VALUE: return MEASUREMENT_DATA_QUALIFIER4;
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
	private MeasurementDataQualifier(int value, String name, String literal) {
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
	
} //MeasurementDataQualifier
