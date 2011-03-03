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
 * A representation of the literals of the enumeration '<em><b>Claim Origination</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getClaimOrigination()
 * @model
 * @generated
 */
public enum ClaimOrigination implements Enumerator {
	/**
	 * The '<em><b>Claim Origination1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAIM_ORIGINATION1_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM_ORIGINATION1(0, "ClaimOrigination1", "ClaimOrigination1"),

	/**
	 * The '<em><b>Claim Origination2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAIM_ORIGINATION2_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM_ORIGINATION2(1, "ClaimOrigination2", "ClaimOrigination2"),

	/**
	 * The '<em><b>Claim Origination3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAIM_ORIGINATION3_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM_ORIGINATION3(2, "ClaimOrigination3", "ClaimOrigination3"),

	/**
	 * The '<em><b>Claim Origination9</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CLAIM_ORIGINATION9_VALUE
	 * @generated
	 * @ordered
	 */
	CLAIM_ORIGINATION9(3, "ClaimOrigination9", "ClaimOrigination9");

	/**
	 * The '<em><b>Claim Origination1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Claim Origination1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLAIM_ORIGINATION1
	 * @model name="ClaimOrigination1"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_ORIGINATION1_VALUE = 0;

	/**
	 * The '<em><b>Claim Origination2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Claim Origination2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLAIM_ORIGINATION2
	 * @model name="ClaimOrigination2"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_ORIGINATION2_VALUE = 1;

	/**
	 * The '<em><b>Claim Origination3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Claim Origination3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLAIM_ORIGINATION3
	 * @model name="ClaimOrigination3"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_ORIGINATION3_VALUE = 2;

	/**
	 * The '<em><b>Claim Origination9</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Claim Origination9</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CLAIM_ORIGINATION9
	 * @model name="ClaimOrigination9"
	 * @generated
	 * @ordered
	 */
	public static final int CLAIM_ORIGINATION9_VALUE = 3;

	/**
	 * An array of all the '<em><b>Claim Origination</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ClaimOrigination[] VALUES_ARRAY =
		new ClaimOrigination[] {
			CLAIM_ORIGINATION1,
			CLAIM_ORIGINATION2,
			CLAIM_ORIGINATION3,
			CLAIM_ORIGINATION9,
		};

	/**
	 * A public read-only list of all the '<em><b>Claim Origination</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ClaimOrigination> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Claim Origination</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClaimOrigination get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClaimOrigination result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Claim Origination</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClaimOrigination getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ClaimOrigination result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Claim Origination</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ClaimOrigination get(int value) {
		switch (value) {
			case CLAIM_ORIGINATION1_VALUE: return CLAIM_ORIGINATION1;
			case CLAIM_ORIGINATION2_VALUE: return CLAIM_ORIGINATION2;
			case CLAIM_ORIGINATION3_VALUE: return CLAIM_ORIGINATION3;
			case CLAIM_ORIGINATION9_VALUE: return CLAIM_ORIGINATION9;
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
	private ClaimOrigination(int value, String name, String literal) {
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
	
} //ClaimOrigination
