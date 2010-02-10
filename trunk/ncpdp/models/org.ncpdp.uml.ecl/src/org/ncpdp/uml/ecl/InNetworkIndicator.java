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
 * A representation of the literals of the enumeration '<em><b>In Network Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getInNetworkIndicator()
 * @model
 * @generated
 */
public enum InNetworkIndicator implements Enumerator {
	/**
	 * The '<em><b>In Network Indicator Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_NETWORK_INDICATOR_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	IN_NETWORK_INDICATOR_BLANK(0, "InNetworkIndicatorBlank", "InNetworkIndicatorBlank"),

	/**
	 * The '<em><b>In Network Indicator Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_NETWORK_INDICATOR_Y_VALUE
	 * @generated
	 * @ordered
	 */
	IN_NETWORK_INDICATOR_Y(1, "InNetworkIndicatorY", "InNetworkIndicatorY"),

	/**
	 * The '<em><b>In Network Indicator N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #IN_NETWORK_INDICATOR_N_VALUE
	 * @generated
	 * @ordered
	 */
	IN_NETWORK_INDICATOR_N(2, "InNetworkIndicatorN", "InNetworkIndicatorN");

	/**
	 * The '<em><b>In Network Indicator Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Network Indicator Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_NETWORK_INDICATOR_BLANK
	 * @model name="InNetworkIndicatorBlank"
	 * @generated
	 * @ordered
	 */
	public static final int IN_NETWORK_INDICATOR_BLANK_VALUE = 0;

	/**
	 * The '<em><b>In Network Indicator Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Network Indicator Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_NETWORK_INDICATOR_Y
	 * @model name="InNetworkIndicatorY"
	 * @generated
	 * @ordered
	 */
	public static final int IN_NETWORK_INDICATOR_Y_VALUE = 1;

	/**
	 * The '<em><b>In Network Indicator N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>In Network Indicator N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #IN_NETWORK_INDICATOR_N
	 * @model name="InNetworkIndicatorN"
	 * @generated
	 * @ordered
	 */
	public static final int IN_NETWORK_INDICATOR_N_VALUE = 2;

	/**
	 * An array of all the '<em><b>In Network Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final InNetworkIndicator[] VALUES_ARRAY =
		new InNetworkIndicator[] {
			IN_NETWORK_INDICATOR_BLANK,
			IN_NETWORK_INDICATOR_Y,
			IN_NETWORK_INDICATOR_N,
		};

	/**
	 * A public read-only list of all the '<em><b>In Network Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<InNetworkIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>In Network Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InNetworkIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InNetworkIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>In Network Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InNetworkIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			InNetworkIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>In Network Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static InNetworkIndicator get(int value) {
		switch (value) {
			case IN_NETWORK_INDICATOR_BLANK_VALUE: return IN_NETWORK_INDICATOR_BLANK;
			case IN_NETWORK_INDICATOR_Y_VALUE: return IN_NETWORK_INDICATOR_Y;
			case IN_NETWORK_INDICATOR_N_VALUE: return IN_NETWORK_INDICATOR_N;
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
	private InNetworkIndicator(int value, String name, String literal) {
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
	
} //InNetworkIndicator
