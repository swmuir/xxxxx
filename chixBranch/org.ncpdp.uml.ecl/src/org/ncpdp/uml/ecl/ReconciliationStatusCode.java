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
 * A representation of the literals of the enumeration '<em><b>Reconciliation Status Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getReconciliationStatusCode()
 * @model
 * @generated
 */
public enum ReconciliationStatusCode implements Enumerator {
	/**
	 * The '<em><b>Reconciliation Status Code P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECONCILIATION_STATUS_CODE_P_VALUE
	 * @generated
	 * @ordered
	 */
	RECONCILIATION_STATUS_CODE_P(0, "ReconciliationStatusCodeP", "ReconciliationStatusCodeP"),

	/**
	 * The '<em><b>Reconciliation Status Code A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECONCILIATION_STATUS_CODE_A_VALUE
	 * @generated
	 * @ordered
	 */
	RECONCILIATION_STATUS_CODE_A(1, "ReconciliationStatusCodeA", "ReconciliationStatusCodeA"),

	/**
	 * The '<em><b>Reconciliation Status Code R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #RECONCILIATION_STATUS_CODE_R_VALUE
	 * @generated
	 * @ordered
	 */
	RECONCILIATION_STATUS_CODE_R(2, "ReconciliationStatusCodeR", "ReconciliationStatusCodeR");

	/**
	 * The '<em><b>Reconciliation Status Code P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reconciliation Status Code P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECONCILIATION_STATUS_CODE_P
	 * @model name="ReconciliationStatusCodeP"
	 * @generated
	 * @ordered
	 */
	public static final int RECONCILIATION_STATUS_CODE_P_VALUE = 0;

	/**
	 * The '<em><b>Reconciliation Status Code A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reconciliation Status Code A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECONCILIATION_STATUS_CODE_A
	 * @model name="ReconciliationStatusCodeA"
	 * @generated
	 * @ordered
	 */
	public static final int RECONCILIATION_STATUS_CODE_A_VALUE = 1;

	/**
	 * The '<em><b>Reconciliation Status Code R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reconciliation Status Code R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #RECONCILIATION_STATUS_CODE_R
	 * @model name="ReconciliationStatusCodeR"
	 * @generated
	 * @ordered
	 */
	public static final int RECONCILIATION_STATUS_CODE_R_VALUE = 2;

	/**
	 * An array of all the '<em><b>Reconciliation Status Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReconciliationStatusCode[] VALUES_ARRAY =
		new ReconciliationStatusCode[] {
			RECONCILIATION_STATUS_CODE_P,
			RECONCILIATION_STATUS_CODE_A,
			RECONCILIATION_STATUS_CODE_R,
		};

	/**
	 * A public read-only list of all the '<em><b>Reconciliation Status Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReconciliationStatusCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reconciliation Status Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReconciliationStatusCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReconciliationStatusCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reconciliation Status Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReconciliationStatusCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReconciliationStatusCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reconciliation Status Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReconciliationStatusCode get(int value) {
		switch (value) {
			case RECONCILIATION_STATUS_CODE_P_VALUE: return RECONCILIATION_STATUS_CODE_P;
			case RECONCILIATION_STATUS_CODE_A_VALUE: return RECONCILIATION_STATUS_CODE_A;
			case RECONCILIATION_STATUS_CODE_R_VALUE: return RECONCILIATION_STATUS_CODE_R;
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
	private ReconciliationStatusCode(int value, String name, String literal) {
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
	
} //ReconciliationStatusCode
