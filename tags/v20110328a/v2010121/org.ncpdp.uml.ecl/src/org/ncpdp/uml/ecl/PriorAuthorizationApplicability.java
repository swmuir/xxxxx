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
 * A representation of the literals of the enumeration '<em><b>Prior Authorization Applicability</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPriorAuthorizationApplicability()
 * @model
 * @generated
 */
public enum PriorAuthorizationApplicability implements Enumerator {
	/**
	 * The '<em><b>Prior Authorization Applicability A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_APPLICABILITY_A_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_APPLICABILITY_A(0, "PriorAuthorizationApplicabilityA", "PriorAuthorizationApplicabilityA"),

	/**
	 * The '<em><b>Prior Authorization Applicability C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_APPLICABILITY_C_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_APPLICABILITY_C(1, "PriorAuthorizationApplicabilityC", "PriorAuthorizationApplicabilityC");

	/**
	 * The '<em><b>Prior Authorization Applicability A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Applicability A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_APPLICABILITY_A
	 * @model name="PriorAuthorizationApplicabilityA"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_APPLICABILITY_A_VALUE = 0;

	/**
	 * The '<em><b>Prior Authorization Applicability C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Applicability C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_APPLICABILITY_C
	 * @model name="PriorAuthorizationApplicabilityC"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_APPLICABILITY_C_VALUE = 1;

	/**
	 * An array of all the '<em><b>Prior Authorization Applicability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PriorAuthorizationApplicability[] VALUES_ARRAY =
		new PriorAuthorizationApplicability[] {
			PRIOR_AUTHORIZATION_APPLICABILITY_A,
			PRIOR_AUTHORIZATION_APPLICABILITY_C,
		};

	/**
	 * A public read-only list of all the '<em><b>Prior Authorization Applicability</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PriorAuthorizationApplicability> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Prior Authorization Applicability</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationApplicability get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorAuthorizationApplicability result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prior Authorization Applicability</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationApplicability getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorAuthorizationApplicability result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prior Authorization Applicability</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationApplicability get(int value) {
		switch (value) {
			case PRIOR_AUTHORIZATION_APPLICABILITY_A_VALUE: return PRIOR_AUTHORIZATION_APPLICABILITY_A;
			case PRIOR_AUTHORIZATION_APPLICABILITY_C_VALUE: return PRIOR_AUTHORIZATION_APPLICABILITY_C;
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
	private PriorAuthorizationApplicability(int value, String name, String literal) {
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
	
} //PriorAuthorizationApplicability
