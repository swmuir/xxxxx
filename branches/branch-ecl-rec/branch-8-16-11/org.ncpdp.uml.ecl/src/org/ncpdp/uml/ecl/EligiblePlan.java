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
 * A representation of the literals of the enumeration '<em><b>Eligible Plan</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getEligiblePlan()
 * @model
 * @generated
 */
public enum EligiblePlan implements Enumerator {
	/**
	 * The '<em><b>Eligible Plan N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIGIBLE_PLAN_N_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBLE_PLAN_N(0, "EligiblePlanN", "EligiblePlanN"),

	/**
	 * The '<em><b>Eligible Plan Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ELIGIBLE_PLAN_Y_VALUE
	 * @generated
	 * @ordered
	 */
	ELIGIBLE_PLAN_Y(1, "EligiblePlanY", "EligiblePlanY");

	/**
	 * The '<em><b>Eligible Plan N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eligible Plan N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELIGIBLE_PLAN_N
	 * @model name="EligiblePlanN"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBLE_PLAN_N_VALUE = 0;

	/**
	 * The '<em><b>Eligible Plan Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Eligible Plan Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ELIGIBLE_PLAN_Y
	 * @model name="EligiblePlanY"
	 * @generated
	 * @ordered
	 */
	public static final int ELIGIBLE_PLAN_Y_VALUE = 1;

	/**
	 * An array of all the '<em><b>Eligible Plan</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final EligiblePlan[] VALUES_ARRAY =
		new EligiblePlan[] {
			ELIGIBLE_PLAN_N,
			ELIGIBLE_PLAN_Y,
		};

	/**
	 * A public read-only list of all the '<em><b>Eligible Plan</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<EligiblePlan> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Eligible Plan</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EligiblePlan get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EligiblePlan result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eligible Plan</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EligiblePlan getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			EligiblePlan result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Eligible Plan</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static EligiblePlan get(int value) {
		switch (value) {
			case ELIGIBLE_PLAN_N_VALUE: return ELIGIBLE_PLAN_N;
			case ELIGIBLE_PLAN_Y_VALUE: return ELIGIBLE_PLAN_Y;
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
	private EligiblePlan(int value, String name, String literal) {
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
	
} //EligiblePlan
