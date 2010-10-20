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
 * A representation of the literals of the enumeration '<em><b>Membership Period Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getMembershipPeriodQualifier()
 * @model
 * @generated
 */
public enum MembershipPeriodQualifier implements Enumerator {
	/**
	 * The '<em><b>Membership Period Qualifier A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_PERIOD_QUALIFIER_A_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP_PERIOD_QUALIFIER_A(0, "MembershipPeriodQualifierA", "MembershipPeriodQualifierA"),

	/**
	 * The '<em><b>Membership Period Qualifier M</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_PERIOD_QUALIFIER_M_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP_PERIOD_QUALIFIER_M(1, "MembershipPeriodQualifierM", "MembershipPeriodQualifierM"),

	/**
	 * The '<em><b>Membership Period Qualifier Q</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_PERIOD_QUALIFIER_Q_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP_PERIOD_QUALIFIER_Q(2, "MembershipPeriodQualifierQ", "MembershipPeriodQualifierQ"),

	/**
	 * The '<em><b>Membership Period Qualifier S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_PERIOD_QUALIFIER_S_VALUE
	 * @generated
	 * @ordered
	 */
	MEMBERSHIP_PERIOD_QUALIFIER_S(3, "MembershipPeriodQualifierS", "MembershipPeriodQualifierS");

	/**
	 * The '<em><b>Membership Period Qualifier A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Membership Period Qualifier A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_PERIOD_QUALIFIER_A
	 * @model name="MembershipPeriodQualifierA"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_PERIOD_QUALIFIER_A_VALUE = 0;

	/**
	 * The '<em><b>Membership Period Qualifier M</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Membership Period Qualifier M</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_PERIOD_QUALIFIER_M
	 * @model name="MembershipPeriodQualifierM"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_PERIOD_QUALIFIER_M_VALUE = 1;

	/**
	 * The '<em><b>Membership Period Qualifier Q</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Membership Period Qualifier Q</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_PERIOD_QUALIFIER_Q
	 * @model name="MembershipPeriodQualifierQ"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_PERIOD_QUALIFIER_Q_VALUE = 2;

	/**
	 * The '<em><b>Membership Period Qualifier S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Membership Period Qualifier S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEMBERSHIP_PERIOD_QUALIFIER_S
	 * @model name="MembershipPeriodQualifierS"
	 * @generated
	 * @ordered
	 */
	public static final int MEMBERSHIP_PERIOD_QUALIFIER_S_VALUE = 3;

	/**
	 * An array of all the '<em><b>Membership Period Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MembershipPeriodQualifier[] VALUES_ARRAY =
		new MembershipPeriodQualifier[] {
			MEMBERSHIP_PERIOD_QUALIFIER_A,
			MEMBERSHIP_PERIOD_QUALIFIER_M,
			MEMBERSHIP_PERIOD_QUALIFIER_Q,
			MEMBERSHIP_PERIOD_QUALIFIER_S,
		};

	/**
	 * A public read-only list of all the '<em><b>Membership Period Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MembershipPeriodQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Membership Period Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MembershipPeriodQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MembershipPeriodQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Membership Period Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MembershipPeriodQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MembershipPeriodQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Membership Period Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MembershipPeriodQualifier get(int value) {
		switch (value) {
			case MEMBERSHIP_PERIOD_QUALIFIER_A_VALUE: return MEMBERSHIP_PERIOD_QUALIFIER_A;
			case MEMBERSHIP_PERIOD_QUALIFIER_M_VALUE: return MEMBERSHIP_PERIOD_QUALIFIER_M;
			case MEMBERSHIP_PERIOD_QUALIFIER_Q_VALUE: return MEMBERSHIP_PERIOD_QUALIFIER_Q;
			case MEMBERSHIP_PERIOD_QUALIFIER_S_VALUE: return MEMBERSHIP_PERIOD_QUALIFIER_S;
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
	private MembershipPeriodQualifier(int value, String name, String literal) {
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
	
} //MembershipPeriodQualifier
