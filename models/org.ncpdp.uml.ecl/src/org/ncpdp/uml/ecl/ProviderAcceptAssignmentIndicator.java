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
 * A representation of the literals of the enumeration '<em><b>Provider Accept Assignment Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getProviderAcceptAssignmentIndicator()
 * @model
 * @generated
 */
public enum ProviderAcceptAssignmentIndicator implements Enumerator {
	/**
	 * The '<em><b>Provider Accept Assignment Indicator Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_Y_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_Y(0, "ProviderAcceptAssignmentIndicatorY", "ProviderAcceptAssignmentIndicatorY"),

	/**
	 * The '<em><b>Provider Accept Assignment Indicator N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_N_VALUE
	 * @generated
	 * @ordered
	 */
	PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_N(1, "ProviderAcceptAssignmentIndicatorN", "ProviderAcceptAssignmentIndicatorN");

	/**
	 * The '<em><b>Provider Accept Assignment Indicator Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Provider Accept Assignment Indicator Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_Y
	 * @model name="ProviderAcceptAssignmentIndicatorY"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_Y_VALUE = 0;

	/**
	 * The '<em><b>Provider Accept Assignment Indicator N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Provider Accept Assignment Indicator N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_N
	 * @model name="ProviderAcceptAssignmentIndicatorN"
	 * @generated
	 * @ordered
	 */
	public static final int PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_N_VALUE = 1;

	/**
	 * An array of all the '<em><b>Provider Accept Assignment Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ProviderAcceptAssignmentIndicator[] VALUES_ARRAY =
		new ProviderAcceptAssignmentIndicator[] {
			PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_Y,
			PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_N,
		};

	/**
	 * A public read-only list of all the '<em><b>Provider Accept Assignment Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ProviderAcceptAssignmentIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Provider Accept Assignment Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProviderAcceptAssignmentIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProviderAcceptAssignmentIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provider Accept Assignment Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProviderAcceptAssignmentIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ProviderAcceptAssignmentIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Provider Accept Assignment Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ProviderAcceptAssignmentIndicator get(int value) {
		switch (value) {
			case PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_Y_VALUE: return PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_Y;
			case PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_N_VALUE: return PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR_N;
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
	private ProviderAcceptAssignmentIndicator(int value, String name, String literal) {
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
	
} //ProviderAcceptAssignmentIndicator
