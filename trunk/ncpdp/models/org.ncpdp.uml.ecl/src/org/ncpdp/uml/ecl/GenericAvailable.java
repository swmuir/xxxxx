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
 * A representation of the literals of the enumeration '<em><b>Generic Available</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getGenericAvailable()
 * @model
 * @generated
 */
public enum GenericAvailable implements Enumerator {
	/**
	 * The '<em><b>Generic Available Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_AVAILABLE_Y_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC_AVAILABLE_Y(0, "GenericAvailableY", "GenericAvailableY"),

	/**
	 * The '<em><b>Generic Available N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_AVAILABLE_N_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC_AVAILABLE_N(1, "GenericAvailableN", "GenericAvailableN"),

	/**
	 * The '<em><b>Generic Available U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #GENERIC_AVAILABLE_U_VALUE
	 * @generated
	 * @ordered
	 */
	GENERIC_AVAILABLE_U(2, "GenericAvailableU", "GenericAvailableU");

	/**
	 * The '<em><b>Generic Available Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generic Available Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERIC_AVAILABLE_Y
	 * @model name="GenericAvailableY"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_AVAILABLE_Y_VALUE = 0;

	/**
	 * The '<em><b>Generic Available N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generic Available N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERIC_AVAILABLE_N
	 * @model name="GenericAvailableN"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_AVAILABLE_N_VALUE = 1;

	/**
	 * The '<em><b>Generic Available U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Generic Available U</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #GENERIC_AVAILABLE_U
	 * @model name="GenericAvailableU"
	 * @generated
	 * @ordered
	 */
	public static final int GENERIC_AVAILABLE_U_VALUE = 2;

	/**
	 * An array of all the '<em><b>Generic Available</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GenericAvailable[] VALUES_ARRAY =
		new GenericAvailable[] {
			GENERIC_AVAILABLE_Y,
			GENERIC_AVAILABLE_N,
			GENERIC_AVAILABLE_U,
		};

	/**
	 * A public read-only list of all the '<em><b>Generic Available</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GenericAvailable> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Generic Available</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericAvailable get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenericAvailable result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generic Available</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericAvailable getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GenericAvailable result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Generic Available</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static GenericAvailable get(int value) {
		switch (value) {
			case GENERIC_AVAILABLE_Y_VALUE: return GENERIC_AVAILABLE_Y;
			case GENERIC_AVAILABLE_N_VALUE: return GENERIC_AVAILABLE_N;
			case GENERIC_AVAILABLE_U_VALUE: return GENERIC_AVAILABLE_U;
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
	private GenericAvailable(int value, String name, String literal) {
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
	
} //GenericAvailable
