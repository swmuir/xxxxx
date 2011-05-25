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
 * A representation of the literals of the enumeration '<em><b>Client Formulary Flag</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getClientFormularyFlag()
 * @model
 * @generated
 */
public enum ClientFormularyFlag implements Enumerator {
	/**
	 * The '<em><b>Client Formulary Flag Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_FORMULARY_FLAG_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT_FORMULARY_FLAG_BLANK(0, "ClientFormularyFlagBlank", "ClientFormularyFlagBlank"),

	/**
	 * The '<em><b>Client Formulary Flag Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_FORMULARY_FLAG_Y_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT_FORMULARY_FLAG_Y(1, "ClientFormularyFlagY", "ClientFormularyFlagY"),

	/**
	 * The '<em><b>Client Formulary Flag N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLIENT_FORMULARY_FLAG_N_VALUE
	 * @generated
	 * @ordered
	 */
	CLIENT_FORMULARY_FLAG_N(2, "ClientFormularyFlagN", "ClientFormularyFlagN");

	/**
	 * The '<em><b>Client Formulary Flag Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Client Formulary Flag Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIENT_FORMULARY_FLAG_BLANK
	 * @model name="ClientFormularyFlagBlank"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_FORMULARY_FLAG_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Client Formulary Flag Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Client Formulary Flag Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIENT_FORMULARY_FLAG_Y
	 * @model name="ClientFormularyFlagY"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_FORMULARY_FLAG_Y_VALUE = 1;

	/**
	 * The '<em><b>Client Formulary Flag N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Client Formulary Flag N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLIENT_FORMULARY_FLAG_N
	 * @model name="ClientFormularyFlagN"
	 * @generated
	 * @ordered
	 */
	public static final int CLIENT_FORMULARY_FLAG_N_VALUE = 2;

	/**
	 * An array of all the '<em><b>Client Formulary Flag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClientFormularyFlag[] VALUES_ARRAY =
		new ClientFormularyFlag[] {
			CLIENT_FORMULARY_FLAG_BLANK,
			CLIENT_FORMULARY_FLAG_Y,
			CLIENT_FORMULARY_FLAG_N,
		};

	/**
	 * A public read-only list of all the '<em><b>Client Formulary Flag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClientFormularyFlag> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Client Formulary Flag</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClientFormularyFlag get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClientFormularyFlag result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Client Formulary Flag</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClientFormularyFlag getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClientFormularyFlag result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Client Formulary Flag</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClientFormularyFlag get(int value) {
		switch (value) {
			case CLIENT_FORMULARY_FLAG_BLANK_VALUE: return CLIENT_FORMULARY_FLAG_BLANK;
			case CLIENT_FORMULARY_FLAG_Y_VALUE: return CLIENT_FORMULARY_FLAG_Y;
			case CLIENT_FORMULARY_FLAG_N_VALUE: return CLIENT_FORMULARY_FLAG_N;
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
	private ClientFormularyFlag(int value, String name, String literal) {
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
	
} //ClientFormularyFlag
