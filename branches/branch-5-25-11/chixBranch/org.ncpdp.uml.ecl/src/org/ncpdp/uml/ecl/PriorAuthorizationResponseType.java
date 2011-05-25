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
 * A representation of the literals of the enumeration '<em><b>Prior Authorization Response Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPriorAuthorizationResponseType()
 * @model
 * @generated
 */
public enum PriorAuthorizationResponseType implements Enumerator {
	/**
	 * The '<em><b>Prior Authorization Response Type Yes No</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_YES_NO_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_RESPONSE_TYPE_YES_NO(0, "PriorAuthorizationResponseTypeYesNo", "PriorAuthorizationResponseTypeYesNo"),

	/**
	 * The '<em><b>Prior Authorization Response Type Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_RESPONSE_TYPE_TEXT(1, "PriorAuthorizationResponseTypeText", "PriorAuthorizationResponseTypeText"),

	/**
	 * The '<em><b>Prior Authorization Response Type Date</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_DATE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_RESPONSE_TYPE_DATE(2, "PriorAuthorizationResponseTypeDate", "PriorAuthorizationResponseTypeDate"),

	/**
	 * The '<em><b>Prior Authorization Response Type Statement</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_STATEMENT_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_RESPONSE_TYPE_STATEMENT(3, "PriorAuthorizationResponseTypeStatement", "PriorAuthorizationResponseTypeStatement"),

	/**
	 * The '<em><b>Prior Authorization Response Type Select One</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_ONE_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_ONE(4, "PriorAuthorizationResponseTypeSelectOne", "PriorAuthorizationResponseTypeSelectOne"),

	/**
	 * The '<em><b>Prior Authorization Response Type Select Many</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_MANY_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_MANY(5, "PriorAuthorizationResponseTypeSelectMany", "PriorAuthorizationResponseTypeSelectMany");

	/**
	 * The '<em><b>Prior Authorization Response Type Yes No</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Response Type Yes No</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_YES_NO
	 * @model name="PriorAuthorizationResponseTypeYesNo"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_RESPONSE_TYPE_YES_NO_VALUE = 0;

	/**
	 * The '<em><b>Prior Authorization Response Type Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Response Type Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_TEXT
	 * @model name="PriorAuthorizationResponseTypeText"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_RESPONSE_TYPE_TEXT_VALUE = 1;

	/**
	 * The '<em><b>Prior Authorization Response Type Date</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Response Type Date</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_DATE
	 * @model name="PriorAuthorizationResponseTypeDate"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_RESPONSE_TYPE_DATE_VALUE = 2;

	/**
	 * The '<em><b>Prior Authorization Response Type Statement</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Response Type Statement</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_STATEMENT
	 * @model name="PriorAuthorizationResponseTypeStatement"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_RESPONSE_TYPE_STATEMENT_VALUE = 3;

	/**
	 * The '<em><b>Prior Authorization Response Type Select One</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Response Type Select One</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_ONE
	 * @model name="PriorAuthorizationResponseTypeSelectOne"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_ONE_VALUE = 4;

	/**
	 * The '<em><b>Prior Authorization Response Type Select Many</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Response Type Select Many</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_MANY
	 * @model name="PriorAuthorizationResponseTypeSelectMany"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_MANY_VALUE = 5;

	/**
	 * An array of all the '<em><b>Prior Authorization Response Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PriorAuthorizationResponseType[] VALUES_ARRAY =
		new PriorAuthorizationResponseType[] {
			PRIOR_AUTHORIZATION_RESPONSE_TYPE_YES_NO,
			PRIOR_AUTHORIZATION_RESPONSE_TYPE_TEXT,
			PRIOR_AUTHORIZATION_RESPONSE_TYPE_DATE,
			PRIOR_AUTHORIZATION_RESPONSE_TYPE_STATEMENT,
			PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_ONE,
			PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_MANY,
		};

	/**
	 * A public read-only list of all the '<em><b>Prior Authorization Response Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PriorAuthorizationResponseType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Prior Authorization Response Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationResponseType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorAuthorizationResponseType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prior Authorization Response Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationResponseType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorAuthorizationResponseType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prior Authorization Response Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationResponseType get(int value) {
		switch (value) {
			case PRIOR_AUTHORIZATION_RESPONSE_TYPE_YES_NO_VALUE: return PRIOR_AUTHORIZATION_RESPONSE_TYPE_YES_NO;
			case PRIOR_AUTHORIZATION_RESPONSE_TYPE_TEXT_VALUE: return PRIOR_AUTHORIZATION_RESPONSE_TYPE_TEXT;
			case PRIOR_AUTHORIZATION_RESPONSE_TYPE_DATE_VALUE: return PRIOR_AUTHORIZATION_RESPONSE_TYPE_DATE;
			case PRIOR_AUTHORIZATION_RESPONSE_TYPE_STATEMENT_VALUE: return PRIOR_AUTHORIZATION_RESPONSE_TYPE_STATEMENT;
			case PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_ONE_VALUE: return PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_ONE;
			case PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_MANY_VALUE: return PRIOR_AUTHORIZATION_RESPONSE_TYPE_SELECT_MANY;
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
	private PriorAuthorizationResponseType(int value, String name, String literal) {
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
	
} //PriorAuthorizationResponseType
