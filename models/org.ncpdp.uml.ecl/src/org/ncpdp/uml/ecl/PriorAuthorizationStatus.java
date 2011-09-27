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
 * A representation of the literals of the enumeration '<em><b>Prior Authorization Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPriorAuthorizationStatus()
 * @model
 * @generated
 */
public enum PriorAuthorizationStatus implements Enumerator {
	/**
	 * The '<em><b>Prior Authorization Status A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_STATUS_A_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_STATUS_A(0, "PriorAuthorizationStatusA", "PriorAuthorizationStatusA"),

	/**
	 * The '<em><b>Prior Authorization Status D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_STATUS_D_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_STATUS_D(1, "PriorAuthorizationStatusD", "PriorAuthorizationStatusD"),

	/**
	 * The '<em><b>Prior Authorization Status F</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_STATUS_F_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_STATUS_F(2, "PriorAuthorizationStatusF", "PriorAuthorizationStatusF"),

	/**
	 * The '<em><b>Prior Authorization Status N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_STATUS_N_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_STATUS_N(3, "PriorAuthorizationStatusN", "PriorAuthorizationStatusN"),

	/**
	 * The '<em><b>Prior Authorization Status R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_STATUS_R_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_STATUS_R(4, "PriorAuthorizationStatusR", "PriorAuthorizationStatusR");

	/**
	 * The '<em><b>Prior Authorization Status A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Status A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_STATUS_A
	 * @model name="PriorAuthorizationStatusA"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_STATUS_A_VALUE = 0;

	/**
	 * The '<em><b>Prior Authorization Status D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Status D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_STATUS_D
	 * @model name="PriorAuthorizationStatusD"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_STATUS_D_VALUE = 1;

	/**
	 * The '<em><b>Prior Authorization Status F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Status F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_STATUS_F
	 * @model name="PriorAuthorizationStatusF"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_STATUS_F_VALUE = 2;

	/**
	 * The '<em><b>Prior Authorization Status N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Status N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_STATUS_N
	 * @model name="PriorAuthorizationStatusN"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_STATUS_N_VALUE = 3;

	/**
	 * The '<em><b>Prior Authorization Status R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Status R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_STATUS_R
	 * @model name="PriorAuthorizationStatusR"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_STATUS_R_VALUE = 4;

	/**
	 * An array of all the '<em><b>Prior Authorization Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PriorAuthorizationStatus[] VALUES_ARRAY =
		new PriorAuthorizationStatus[] {
			PRIOR_AUTHORIZATION_STATUS_A,
			PRIOR_AUTHORIZATION_STATUS_D,
			PRIOR_AUTHORIZATION_STATUS_F,
			PRIOR_AUTHORIZATION_STATUS_N,
			PRIOR_AUTHORIZATION_STATUS_R,
		};

	/**
	 * A public read-only list of all the '<em><b>Prior Authorization Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PriorAuthorizationStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Prior Authorization Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorAuthorizationStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prior Authorization Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorAuthorizationStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prior Authorization Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationStatus get(int value) {
		switch (value) {
			case PRIOR_AUTHORIZATION_STATUS_A_VALUE: return PRIOR_AUTHORIZATION_STATUS_A;
			case PRIOR_AUTHORIZATION_STATUS_D_VALUE: return PRIOR_AUTHORIZATION_STATUS_D;
			case PRIOR_AUTHORIZATION_STATUS_F_VALUE: return PRIOR_AUTHORIZATION_STATUS_F;
			case PRIOR_AUTHORIZATION_STATUS_N_VALUE: return PRIOR_AUTHORIZATION_STATUS_N;
			case PRIOR_AUTHORIZATION_STATUS_R_VALUE: return PRIOR_AUTHORIZATION_STATUS_R;
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
	private PriorAuthorizationStatus(int value, String name, String literal) {
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
	
} //PriorAuthorizationStatus
