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
 * A representation of the literals of the enumeration '<em><b>Intermediary Authorization Type ID</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getIntermediaryAuthorizationTypeID()
 * @model
 * @generated
 */
public enum IntermediaryAuthorizationTypeID implements Enumerator {
	/**
	 * The '<em><b>Intermediary Authorization Type ID0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_INTERMEDIARY_AUTHORIZATION_TYPE_ID0_VALUE
	 * @generated
	 * @ordered
	 */
	_INTERMEDIARY_AUTHORIZATION_TYPE_ID0(0, "_IntermediaryAuthorizationTypeID0", "_IntermediaryAuthorizationTypeID0"),

	/**
	 * The '<em><b>Intermediary Authorization Type ID1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_INTERMEDIARY_AUTHORIZATION_TYPE_ID1_VALUE
	 * @generated
	 * @ordered
	 */
	_INTERMEDIARY_AUTHORIZATION_TYPE_ID1(1, "_IntermediaryAuthorizationTypeID1", "_IntermediaryAuthorizationTypeID1"),

	/**
	 * The '<em><b>Intermediary Authorization Type ID99</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #_INTERMEDIARY_AUTHORIZATION_TYPE_ID99_VALUE
	 * @generated
	 * @ordered
	 */
	_INTERMEDIARY_AUTHORIZATION_TYPE_ID99(2, "_IntermediaryAuthorizationTypeID99", "_IntermediaryAuthorizationTypeID99");

	/**
	 * The '<em><b>Intermediary Authorization Type ID0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intermediary Authorization Type ID0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_INTERMEDIARY_AUTHORIZATION_TYPE_ID0
	 * @model name="_IntermediaryAuthorizationTypeID0"
	 * @generated
	 * @ordered
	 */
	public static final int _INTERMEDIARY_AUTHORIZATION_TYPE_ID0_VALUE = 0;

	/**
	 * The '<em><b>Intermediary Authorization Type ID1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intermediary Authorization Type ID1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_INTERMEDIARY_AUTHORIZATION_TYPE_ID1
	 * @model name="_IntermediaryAuthorizationTypeID1"
	 * @generated
	 * @ordered
	 */
	public static final int _INTERMEDIARY_AUTHORIZATION_TYPE_ID1_VALUE = 1;

	/**
	 * The '<em><b>Intermediary Authorization Type ID99</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Intermediary Authorization Type ID99</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #_INTERMEDIARY_AUTHORIZATION_TYPE_ID99
	 * @model name="_IntermediaryAuthorizationTypeID99"
	 * @generated
	 * @ordered
	 */
	public static final int _INTERMEDIARY_AUTHORIZATION_TYPE_ID99_VALUE = 2;

	/**
	 * An array of all the '<em><b>Intermediary Authorization Type ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IntermediaryAuthorizationTypeID[] VALUES_ARRAY =
		new IntermediaryAuthorizationTypeID[] {
			_INTERMEDIARY_AUTHORIZATION_TYPE_ID0,
			_INTERMEDIARY_AUTHORIZATION_TYPE_ID1,
			_INTERMEDIARY_AUTHORIZATION_TYPE_ID99,
		};

	/**
	 * A public read-only list of all the '<em><b>Intermediary Authorization Type ID</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IntermediaryAuthorizationTypeID> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Intermediary Authorization Type ID</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediaryAuthorizationTypeID get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntermediaryAuthorizationTypeID result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Intermediary Authorization Type ID</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediaryAuthorizationTypeID getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IntermediaryAuthorizationTypeID result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Intermediary Authorization Type ID</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IntermediaryAuthorizationTypeID get(int value) {
		switch (value) {
			case _INTERMEDIARY_AUTHORIZATION_TYPE_ID0_VALUE: return _INTERMEDIARY_AUTHORIZATION_TYPE_ID0;
			case _INTERMEDIARY_AUTHORIZATION_TYPE_ID1_VALUE: return _INTERMEDIARY_AUTHORIZATION_TYPE_ID1;
			case _INTERMEDIARY_AUTHORIZATION_TYPE_ID99_VALUE: return _INTERMEDIARY_AUTHORIZATION_TYPE_ID99;
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
	private IntermediaryAuthorizationTypeID(int value, String name, String literal) {
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
	
} //IntermediaryAuthorizationTypeID
