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
 * A representation of the literals of the enumeration '<em><b>Membership Type Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getMembershipTypeQualifier()
 * @model
 * @generated
 */
public enum MembershipTypeQualifier implements Enumerator {
	/**
	 * The '<em><b>Membership Type Qualifier1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_TYPE_QUALIFIER1_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP_TYPE_QUALIFIER1(0, "MembershipTypeQualifier1", "MembershipTypeQualifier1"),

	/**
	 * The '<em><b>Membership Type Qualifier2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_TYPE_QUALIFIER2_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP_TYPE_QUALIFIER2(1, "MembershipTypeQualifier2", "MembershipTypeQualifier2"),

	/**
	 * The '<em><b>Membership Type Qualifier3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_TYPE_QUALIFIER3_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP_TYPE_QUALIFIER3(2, "MembershipTypeQualifier3", "MembershipTypeQualifier3");

	/**
	 * The '<em><b>Membership Type Qualifier1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Membership Type Qualifier1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_TYPE_QUALIFIER1
	 * @model name="MembershipTypeQualifier1"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_TYPE_QUALIFIER1_VALUE = 0;

	/**
	 * The '<em><b>Membership Type Qualifier2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Membership Type Qualifier2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_TYPE_QUALIFIER2
	 * @model name="MembershipTypeQualifier2"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_TYPE_QUALIFIER2_VALUE = 1;

	/**
	 * The '<em><b>Membership Type Qualifier3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Membership Type Qualifier3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_TYPE_QUALIFIER3
	 * @model name="MembershipTypeQualifier3"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_TYPE_QUALIFIER3_VALUE = 2;

	/**
	 * An array of all the '<em><b>Membership Type Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MembershipTypeQualifier[] VALUES_ARRAY =
		new MembershipTypeQualifier[] {
			MEMBERSHIP_TYPE_QUALIFIER1,
			MEMBERSHIP_TYPE_QUALIFIER2,
			MEMBERSHIP_TYPE_QUALIFIER3,
		};

	/**
	 * A public read-only list of all the '<em><b>Membership Type Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MembershipTypeQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Membership Type Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MembershipTypeQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MembershipTypeQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Membership Type Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MembershipTypeQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MembershipTypeQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Membership Type Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MembershipTypeQualifier get(int value) {
		switch (value) {
			case MEMBERSHIP_TYPE_QUALIFIER1_VALUE: return MEMBERSHIP_TYPE_QUALIFIER1;
			case MEMBERSHIP_TYPE_QUALIFIER2_VALUE: return MEMBERSHIP_TYPE_QUALIFIER2;
			case MEMBERSHIP_TYPE_QUALIFIER3_VALUE: return MEMBERSHIP_TYPE_QUALIFIER3;
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
	private MembershipTypeQualifier(int value, String name, String literal) {
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
	
} //MembershipTypeQualifier
