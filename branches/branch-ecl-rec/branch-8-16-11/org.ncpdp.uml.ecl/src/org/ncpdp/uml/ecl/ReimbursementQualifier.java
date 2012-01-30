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
 * A representation of the literals of the enumeration '<em><b>Reimbursement Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getReimbursementQualifier()
 * @model
 * @generated
 */
public enum ReimbursementQualifier implements Enumerator {
	/**
	 * The '<em><b>Reimbursement Qualifier1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENT_QUALIFIER1_VALUE
	 * @generated
	 * @ordered
	 */
	REIMBURSEMENT_QUALIFIER1(0, "ReimbursementQualifier1", "ReimbursementQualifier1"),

	/**
	 * The '<em><b>Reimbursement Qualifier2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENT_QUALIFIER2_VALUE
	 * @generated
	 * @ordered
	 */
	REIMBURSEMENT_QUALIFIER2(1, "ReimbursementQualifier2", "ReimbursementQualifier2");

	/**
	 * The '<em><b>Reimbursement Qualifier1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reimbursement Qualifier1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENT_QUALIFIER1
	 * @model name="ReimbursementQualifier1"
	 * @generated
	 * @ordered
	 */
	public static final int REIMBURSEMENT_QUALIFIER1_VALUE = 0;

	/**
	 * The '<em><b>Reimbursement Qualifier2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reimbursement Qualifier2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REIMBURSEMENT_QUALIFIER2
	 * @model name="ReimbursementQualifier2"
	 * @generated
	 * @ordered
	 */
	public static final int REIMBURSEMENT_QUALIFIER2_VALUE = 1;

	/**
	 * An array of all the '<em><b>Reimbursement Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ReimbursementQualifier[] VALUES_ARRAY =
		new ReimbursementQualifier[] {
			REIMBURSEMENT_QUALIFIER1,
			REIMBURSEMENT_QUALIFIER2,
		};

	/**
	 * A public read-only list of all the '<em><b>Reimbursement Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ReimbursementQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reimbursement Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReimbursementQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReimbursementQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reimbursement Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReimbursementQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ReimbursementQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reimbursement Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ReimbursementQualifier get(int value) {
		switch (value) {
			case REIMBURSEMENT_QUALIFIER1_VALUE: return REIMBURSEMENT_QUALIFIER1;
			case REIMBURSEMENT_QUALIFIER2_VALUE: return REIMBURSEMENT_QUALIFIER2;
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
	private ReimbursementQualifier(int value, String name, String literal) {
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
	
} //ReimbursementQualifier
