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
 * A representation of the literals of the enumeration '<em><b>Numberof Refills Authorized</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getNumberofRefillsAuthorized()
 * @model
 * @generated
 */
public enum NumberofRefillsAuthorized implements Enumerator {
	/**
	 * The '<em><b>Numberof Refills Authorized0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBEROF_REFILLS_AUTHORIZED0_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBEROF_REFILLS_AUTHORIZED0(0, "NumberofRefillsAuthorized0", "NumberofRefillsAuthorized0"),

	/**
	 * The '<em><b>Numberof Refills Authorized199</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMBEROF_REFILLS_AUTHORIZED199_VALUE
	 * @generated
	 * @ordered
	 */
	NUMBEROF_REFILLS_AUTHORIZED199(1, "NumberofRefillsAuthorized199", "NumberofRefillsAuthorized199");

	/**
	 * The '<em><b>Numberof Refills Authorized0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numberof Refills Authorized0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBEROF_REFILLS_AUTHORIZED0
	 * @model name="NumberofRefillsAuthorized0"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBEROF_REFILLS_AUTHORIZED0_VALUE = 0;

	/**
	 * The '<em><b>Numberof Refills Authorized199</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numberof Refills Authorized199</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMBEROF_REFILLS_AUTHORIZED199
	 * @model name="NumberofRefillsAuthorized199"
	 * @generated
	 * @ordered
	 */
	public static final int NUMBEROF_REFILLS_AUTHORIZED199_VALUE = 1;

	/**
	 * An array of all the '<em><b>Numberof Refills Authorized</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NumberofRefillsAuthorized[] VALUES_ARRAY =
		new NumberofRefillsAuthorized[] {
			NUMBEROF_REFILLS_AUTHORIZED0,
			NUMBEROF_REFILLS_AUTHORIZED199,
		};

	/**
	 * A public read-only list of all the '<em><b>Numberof Refills Authorized</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NumberofRefillsAuthorized> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Numberof Refills Authorized</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NumberofRefillsAuthorized get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumberofRefillsAuthorized result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Numberof Refills Authorized</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NumberofRefillsAuthorized getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumberofRefillsAuthorized result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Numberof Refills Authorized</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NumberofRefillsAuthorized get(int value) {
		switch (value) {
			case NUMBEROF_REFILLS_AUTHORIZED0_VALUE: return NUMBEROF_REFILLS_AUTHORIZED0;
			case NUMBEROF_REFILLS_AUTHORIZED199_VALUE: return NUMBEROF_REFILLS_AUTHORIZED199;
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
	private NumberofRefillsAuthorized(int value, String name, String literal) {
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
	
} //NumberofRefillsAuthorized
