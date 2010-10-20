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
 * A representation of the literals of the enumeration '<em><b>First Copay Term</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getFirstCopayTerm()
 * @model
 * @generated
 */
public enum FirstCopayTerm implements Enumerator {
	/**
	 * The '<em><b>First Copay Term F</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_COPAY_TERM_F_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_COPAY_TERM_F(0, "FirstCopayTermF", "FirstCopayTermF"),

	/**
	 * The '<em><b>First Copay Term P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FIRST_COPAY_TERM_P_VALUE
	 * @generated
	 * @ordered
	 */
	FIRST_COPAY_TERM_P(1, "FirstCopayTermP", "FirstCopayTermP");

	/**
	 * The '<em><b>First Copay Term F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>First Copay Term F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRST_COPAY_TERM_F
	 * @model name="FirstCopayTermF"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_COPAY_TERM_F_VALUE = 0;

	/**
	 * The '<em><b>First Copay Term P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>First Copay Term P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FIRST_COPAY_TERM_P
	 * @model name="FirstCopayTermP"
	 * @generated
	 * @ordered
	 */
	public static final int FIRST_COPAY_TERM_P_VALUE = 1;

	/**
	 * An array of all the '<em><b>First Copay Term</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FirstCopayTerm[] VALUES_ARRAY =
		new FirstCopayTerm[] {
			FIRST_COPAY_TERM_F,
			FIRST_COPAY_TERM_P,
		};

	/**
	 * A public read-only list of all the '<em><b>First Copay Term</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FirstCopayTerm> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>First Copay Term</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FirstCopayTerm get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FirstCopayTerm result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>First Copay Term</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FirstCopayTerm getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FirstCopayTerm result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>First Copay Term</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FirstCopayTerm get(int value) {
		switch (value) {
			case FIRST_COPAY_TERM_F_VALUE: return FIRST_COPAY_TERM_F;
			case FIRST_COPAY_TERM_P_VALUE: return FIRST_COPAY_TERM_P;
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
	private FirstCopayTerm(int value, String name, String literal) {
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
	
} //FirstCopayTerm
