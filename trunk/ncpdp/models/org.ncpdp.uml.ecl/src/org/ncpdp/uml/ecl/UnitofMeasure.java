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
 * A representation of the literals of the enumeration '<em><b>Unitof Measure</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getUnitofMeasure()
 * @model
 * @generated
 */
public enum UnitofMeasure implements Enumerator {
	/**
	 * The '<em><b>Unitof Measure EA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNITOF_MEASURE_EA_VALUE
	 * @generated
	 * @ordered
	 */
	UNITOF_MEASURE_EA(0, "UnitofMeasureEA", "UnitofMeasureEA"),

	/**
	 * The '<em><b>Unitof Measure GM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNITOF_MEASURE_GM_VALUE
	 * @generated
	 * @ordered
	 */
	UNITOF_MEASURE_GM(1, "UnitofMeasureGM", "UnitofMeasureGM"),

	/**
	 * The '<em><b>Unitof Measure ML</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #UNITOF_MEASURE_ML_VALUE
	 * @generated
	 * @ordered
	 */
	UNITOF_MEASURE_ML(2, "UnitofMeasureML", "UnitofMeasureML");

	/**
	 * The '<em><b>Unitof Measure EA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unitof Measure EA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNITOF_MEASURE_EA
	 * @model name="UnitofMeasureEA"
	 * @generated
	 * @ordered
	 */
	public static final int UNITOF_MEASURE_EA_VALUE = 0;

	/**
	 * The '<em><b>Unitof Measure GM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unitof Measure GM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNITOF_MEASURE_GM
	 * @model name="UnitofMeasureGM"
	 * @generated
	 * @ordered
	 */
	public static final int UNITOF_MEASURE_GM_VALUE = 1;

	/**
	 * The '<em><b>Unitof Measure ML</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Unitof Measure ML</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #UNITOF_MEASURE_ML
	 * @model name="UnitofMeasureML"
	 * @generated
	 * @ordered
	 */
	public static final int UNITOF_MEASURE_ML_VALUE = 2;

	/**
	 * An array of all the '<em><b>Unitof Measure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final UnitofMeasure[] VALUES_ARRAY =
		new UnitofMeasure[] {
			UNITOF_MEASURE_EA,
			UNITOF_MEASURE_GM,
			UNITOF_MEASURE_ML,
		};

	/**
	 * A public read-only list of all the '<em><b>Unitof Measure</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<UnitofMeasure> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Unitof Measure</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitofMeasure get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitofMeasure result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unitof Measure</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitofMeasure getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			UnitofMeasure result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Unitof Measure</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static UnitofMeasure get(int value) {
		switch (value) {
			case UNITOF_MEASURE_EA_VALUE: return UNITOF_MEASURE_EA;
			case UNITOF_MEASURE_GM_VALUE: return UNITOF_MEASURE_GM;
			case UNITOF_MEASURE_ML_VALUE: return UNITOF_MEASURE_ML;
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
	private UnitofMeasure(int value, String name, String literal) {
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
	
} //UnitofMeasure
