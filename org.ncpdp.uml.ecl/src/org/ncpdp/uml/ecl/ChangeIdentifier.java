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
 * A representation of the literals of the enumeration '<em><b>Change Identifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getChangeIdentifier()
 * @model
 * @generated
 */
public enum ChangeIdentifier implements Enumerator {
	/**
	 * The '<em><b>Change Identifier A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_IDENTIFIER_A_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_IDENTIFIER_A(0, "ChangeIdentifierA", "ChangeIdentifierA"),

	/**
	 * The '<em><b>Change Identifier C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_IDENTIFIER_C_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_IDENTIFIER_C(1, "ChangeIdentifierC", "ChangeIdentifierC"),

	/**
	 * The '<em><b>Change Identifier D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_IDENTIFIER_D_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_IDENTIFIER_D(2, "ChangeIdentifierD", "ChangeIdentifierD"),

	/**
	 * The '<em><b>Change Identifier R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CHANGE_IDENTIFIER_R_VALUE
	 * @generated
	 * @ordered
	 */
	CHANGE_IDENTIFIER_R(3, "ChangeIdentifierR", "ChangeIdentifierR");

	/**
	 * The '<em><b>Change Identifier A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Change Identifier A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGE_IDENTIFIER_A
	 * @model name="ChangeIdentifierA"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_IDENTIFIER_A_VALUE = 0;

	/**
	 * The '<em><b>Change Identifier C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Change Identifier C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGE_IDENTIFIER_C
	 * @model name="ChangeIdentifierC"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_IDENTIFIER_C_VALUE = 1;

	/**
	 * The '<em><b>Change Identifier D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Change Identifier D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGE_IDENTIFIER_D
	 * @model name="ChangeIdentifierD"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_IDENTIFIER_D_VALUE = 2;

	/**
	 * The '<em><b>Change Identifier R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Change Identifier R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CHANGE_IDENTIFIER_R
	 * @model name="ChangeIdentifierR"
	 * @generated
	 * @ordered
	 */
	public static final int CHANGE_IDENTIFIER_R_VALUE = 3;

	/**
	 * An array of all the '<em><b>Change Identifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ChangeIdentifier[] VALUES_ARRAY =
		new ChangeIdentifier[] {
			CHANGE_IDENTIFIER_A,
			CHANGE_IDENTIFIER_C,
			CHANGE_IDENTIFIER_D,
			CHANGE_IDENTIFIER_R,
		};

	/**
	 * A public read-only list of all the '<em><b>Change Identifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ChangeIdentifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Change Identifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeIdentifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeIdentifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Identifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeIdentifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ChangeIdentifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Change Identifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ChangeIdentifier get(int value) {
		switch (value) {
			case CHANGE_IDENTIFIER_A_VALUE: return CHANGE_IDENTIFIER_A;
			case CHANGE_IDENTIFIER_C_VALUE: return CHANGE_IDENTIFIER_C;
			case CHANGE_IDENTIFIER_D_VALUE: return CHANGE_IDENTIFIER_D;
			case CHANGE_IDENTIFIER_R_VALUE: return CHANGE_IDENTIFIER_R;
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
	private ChangeIdentifier(int value, String name, String literal) {
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
	
} //ChangeIdentifier
