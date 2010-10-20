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
 * A representation of the literals of the enumeration '<em><b>Request Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getRequestStatus()
 * @model
 * @generated
 */
public enum RequestStatus implements Enumerator {
	/**
	 * The '<em><b>Request Status0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_STATUS0_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_STATUS0(0, "RequestStatus0", "RequestStatus0"),

	/**
	 * The '<em><b>Request Status1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_STATUS1_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_STATUS1(1, "RequestStatus1", "RequestStatus1"),

	/**
	 * The '<em><b>Request Status2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_STATUS2_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_STATUS2(2, "RequestStatus2", "RequestStatus2"),

	/**
	 * The '<em><b>Request Status3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_STATUS3_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_STATUS3(3, "RequestStatus3", "RequestStatus3");

	/**
	 * The '<em><b>Request Status0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request Status0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_STATUS0
	 * @model name="RequestStatus0"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_STATUS0_VALUE = 0;

	/**
	 * The '<em><b>Request Status1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request Status1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_STATUS1
	 * @model name="RequestStatus1"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_STATUS1_VALUE = 1;

	/**
	 * The '<em><b>Request Status2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request Status2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_STATUS2
	 * @model name="RequestStatus2"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_STATUS2_VALUE = 2;

	/**
	 * The '<em><b>Request Status3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request Status3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_STATUS3
	 * @model name="RequestStatus3"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_STATUS3_VALUE = 3;

	/**
	 * An array of all the '<em><b>Request Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequestStatus[] VALUES_ARRAY =
		new RequestStatus[] {
			REQUEST_STATUS0,
			REQUEST_STATUS1,
			REQUEST_STATUS2,
			REQUEST_STATUS3,
		};

	/**
	 * A public read-only list of all the '<em><b>Request Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequestStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Request Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequestStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequestStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequestStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequestStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequestStatus get(int value) {
		switch (value) {
			case REQUEST_STATUS0_VALUE: return REQUEST_STATUS0;
			case REQUEST_STATUS1_VALUE: return REQUEST_STATUS1;
			case REQUEST_STATUS2_VALUE: return REQUEST_STATUS2;
			case REQUEST_STATUS3_VALUE: return REQUEST_STATUS3;
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
	private RequestStatus(int value, String name, String literal) {
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
	
} //RequestStatus
