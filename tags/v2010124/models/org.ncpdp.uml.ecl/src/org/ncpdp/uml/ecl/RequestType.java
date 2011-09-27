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
 * A representation of the literals of the enumeration '<em><b>Request Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getRequestType()
 * @model
 * @generated
 */
public enum RequestType implements Enumerator {
	/**
	 * The '<em><b>Request Type1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TYPE1_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_TYPE1(0, "RequestType1", "RequestType1"),

	/**
	 * The '<em><b>Request Type2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TYPE2_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_TYPE2(1, "RequestType2", "RequestType2"),

	/**
	 * The '<em><b>Request Type3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TYPE3_VALUE
	 * @generated
	 * @ordered
	 */
	REQUEST_TYPE3(2, "RequestType3", "RequestType3");

	/**
	 * The '<em><b>Request Type1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request Type1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TYPE1
	 * @model name="RequestType1"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_TYPE1_VALUE = 0;

	/**
	 * The '<em><b>Request Type2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request Type2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TYPE2
	 * @model name="RequestType2"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_TYPE2_VALUE = 1;

	/**
	 * The '<em><b>Request Type3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Request Type3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REQUEST_TYPE3
	 * @model name="RequestType3"
	 * @generated
	 * @ordered
	 */
	public static final int REQUEST_TYPE3_VALUE = 2;

	/**
	 * An array of all the '<em><b>Request Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RequestType[] VALUES_ARRAY =
		new RequestType[] {
			REQUEST_TYPE1,
			REQUEST_TYPE2,
			REQUEST_TYPE3,
		};

	/**
	 * A public read-only list of all the '<em><b>Request Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RequestType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Request Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequestType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequestType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequestType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RequestType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Request Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RequestType get(int value) {
		switch (value) {
			case REQUEST_TYPE1_VALUE: return REQUEST_TYPE1;
			case REQUEST_TYPE2_VALUE: return REQUEST_TYPE2;
			case REQUEST_TYPE3_VALUE: return REQUEST_TYPE3;
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
	private RequestType(int value, String name, String literal) {
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
	
} //RequestType
