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
 * A representation of the literals of the enumeration '<em><b>Basis Of Request</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getBasisOfRequest()
 * @model
 * @generated
 */
public enum BasisOfRequest implements Enumerator {
	/**
	 * The '<em><b>Basis Of Request ME</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_REQUEST_ME_VALUE
	 * @generated
	 * @ordered
	 */
	BASIS_OF_REQUEST_ME(0, "BasisOfRequestME", "BasisOfRequestME"),

	/**
	 * The '<em><b>Basis Of Request PR</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_REQUEST_PR_VALUE
	 * @generated
	 * @ordered
	 */
	BASIS_OF_REQUEST_PR(1, "BasisOfRequestPR", "BasisOfRequestPR"),

	/**
	 * The '<em><b>Basis Of Request PL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_REQUEST_PL_VALUE
	 * @generated
	 * @ordered
	 */
	BASIS_OF_REQUEST_PL(2, "BasisOfRequestPL", "BasisOfRequestPL");

	/**
	 * The '<em><b>Basis Of Request ME</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basis Of Request ME</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_REQUEST_ME
	 * @model name="BasisOfRequestME"
	 * @generated
	 * @ordered
	 */
	public static final int BASIS_OF_REQUEST_ME_VALUE = 0;

	/**
	 * The '<em><b>Basis Of Request PR</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basis Of Request PR</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_REQUEST_PR
	 * @model name="BasisOfRequestPR"
	 * @generated
	 * @ordered
	 */
	public static final int BASIS_OF_REQUEST_PR_VALUE = 1;

	/**
	 * The '<em><b>Basis Of Request PL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Basis Of Request PL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BASIS_OF_REQUEST_PL
	 * @model name="BasisOfRequestPL"
	 * @generated
	 * @ordered
	 */
	public static final int BASIS_OF_REQUEST_PL_VALUE = 2;

	/**
	 * An array of all the '<em><b>Basis Of Request</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BasisOfRequest[] VALUES_ARRAY =
		new BasisOfRequest[] {
			BASIS_OF_REQUEST_ME,
			BASIS_OF_REQUEST_PR,
			BASIS_OF_REQUEST_PL,
		};

	/**
	 * A public read-only list of all the '<em><b>Basis Of Request</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BasisOfRequest> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Basis Of Request</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisOfRequest get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasisOfRequest result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basis Of Request</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisOfRequest getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BasisOfRequest result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Basis Of Request</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BasisOfRequest get(int value) {
		switch (value) {
			case BASIS_OF_REQUEST_ME_VALUE: return BASIS_OF_REQUEST_ME;
			case BASIS_OF_REQUEST_PR_VALUE: return BASIS_OF_REQUEST_PR;
			case BASIS_OF_REQUEST_PL_VALUE: return BASIS_OF_REQUEST_PL;
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
	private BasisOfRequest(int value, String name, String literal) {
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
	
} //BasisOfRequest
