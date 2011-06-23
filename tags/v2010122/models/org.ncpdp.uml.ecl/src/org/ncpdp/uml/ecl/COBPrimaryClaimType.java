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
 * A representation of the literals of the enumeration '<em><b>COB Primary Claim Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getCOBPrimaryClaimType()
 * @model
 * @generated
 */
public enum COBPrimaryClaimType implements Enumerator {
	/**
	 * The '<em><b>COB Primary Claim Type Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COB_PRIMARY_CLAIM_TYPE_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	COB_PRIMARY_CLAIM_TYPE_BLANK(0, "COBPrimaryClaimTypeBlank", "COBPrimaryClaimTypeBlank"),

	/**
	 * The '<em><b>COB Primary Claim Type1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COB_PRIMARY_CLAIM_TYPE1_VALUE
	 * @generated
	 * @ordered
	 */
	COB_PRIMARY_CLAIM_TYPE1(1, "COBPrimaryClaimType1", "COBPrimaryClaimType1"),

	/**
	 * The '<em><b>COB Primary Claim Type J</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COB_PRIMARY_CLAIM_TYPE_J_VALUE
	 * @generated
	 * @ordered
	 */
	COB_PRIMARY_CLAIM_TYPE_J(2, "COBPrimaryClaimTypeJ", "COBPrimaryClaimTypeJ"),

	/**
	 * The '<em><b>COB Primary Claim Type M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COB_PRIMARY_CLAIM_TYPE_M_VALUE
	 * @generated
	 * @ordered
	 */
	COB_PRIMARY_CLAIM_TYPE_M(3, "COBPrimaryClaimTypeM", "COBPrimaryClaimTypeM"),

	/**
	 * The '<em><b>COB Primary Claim Type R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COB_PRIMARY_CLAIM_TYPE_R_VALUE
	 * @generated
	 * @ordered
	 */
	COB_PRIMARY_CLAIM_TYPE_R(4, "COBPrimaryClaimTypeR", "COBPrimaryClaimTypeR");

	/**
	 * The '<em><b>COB Primary Claim Type Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COB Primary Claim Type Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COB_PRIMARY_CLAIM_TYPE_BLANK
	 * @model name="COBPrimaryClaimTypeBlank"
	 * @generated
	 * @ordered
	 */
	public static final int COB_PRIMARY_CLAIM_TYPE_BLANK_VALUE = 0;

	/**
	 * The '<em><b>COB Primary Claim Type1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COB Primary Claim Type1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COB_PRIMARY_CLAIM_TYPE1
	 * @model name="COBPrimaryClaimType1"
	 * @generated
	 * @ordered
	 */
	public static final int COB_PRIMARY_CLAIM_TYPE1_VALUE = 1;

	/**
	 * The '<em><b>COB Primary Claim Type J</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COB Primary Claim Type J</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COB_PRIMARY_CLAIM_TYPE_J
	 * @model name="COBPrimaryClaimTypeJ"
	 * @generated
	 * @ordered
	 */
	public static final int COB_PRIMARY_CLAIM_TYPE_J_VALUE = 2;

	/**
	 * The '<em><b>COB Primary Claim Type M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COB Primary Claim Type M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COB_PRIMARY_CLAIM_TYPE_M
	 * @model name="COBPrimaryClaimTypeM"
	 * @generated
	 * @ordered
	 */
	public static final int COB_PRIMARY_CLAIM_TYPE_M_VALUE = 3;

	/**
	 * The '<em><b>COB Primary Claim Type R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>COB Primary Claim Type R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COB_PRIMARY_CLAIM_TYPE_R
	 * @model name="COBPrimaryClaimTypeR"
	 * @generated
	 * @ordered
	 */
	public static final int COB_PRIMARY_CLAIM_TYPE_R_VALUE = 4;

	/**
	 * An array of all the '<em><b>COB Primary Claim Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final COBPrimaryClaimType[] VALUES_ARRAY =
		new COBPrimaryClaimType[] {
			COB_PRIMARY_CLAIM_TYPE_BLANK,
			COB_PRIMARY_CLAIM_TYPE1,
			COB_PRIMARY_CLAIM_TYPE_J,
			COB_PRIMARY_CLAIM_TYPE_M,
			COB_PRIMARY_CLAIM_TYPE_R,
		};

	/**
	 * A public read-only list of all the '<em><b>COB Primary Claim Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<COBPrimaryClaimType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>COB Primary Claim Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static COBPrimaryClaimType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COBPrimaryClaimType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COB Primary Claim Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static COBPrimaryClaimType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			COBPrimaryClaimType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>COB Primary Claim Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static COBPrimaryClaimType get(int value) {
		switch (value) {
			case COB_PRIMARY_CLAIM_TYPE_BLANK_VALUE: return COB_PRIMARY_CLAIM_TYPE_BLANK;
			case COB_PRIMARY_CLAIM_TYPE1_VALUE: return COB_PRIMARY_CLAIM_TYPE1;
			case COB_PRIMARY_CLAIM_TYPE_J_VALUE: return COB_PRIMARY_CLAIM_TYPE_J;
			case COB_PRIMARY_CLAIM_TYPE_M_VALUE: return COB_PRIMARY_CLAIM_TYPE_M;
			case COB_PRIMARY_CLAIM_TYPE_R_VALUE: return COB_PRIMARY_CLAIM_TYPE_R;
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
	private COBPrimaryClaimType(int value, String name, String literal) {
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
	
} //COBPrimaryClaimType
