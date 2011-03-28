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
 * A representation of the literals of the enumeration '<em><b>List Action</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getListAction()
 * @model
 * @generated
 */
public enum ListAction implements Enumerator {
	/**
	 * The '<em><b>List Action F</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_ACTION_F_VALUE
	 * @generated
	 * @ordered
	 */
	LIST_ACTION_F(0, "ListActionF", "ListActionF"),

	/**
	 * The '<em><b>List Action D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_ACTION_D_VALUE
	 * @generated
	 * @ordered
	 */
	LIST_ACTION_D(1, "ListActionD", "ListActionD"),

	/**
	 * The '<em><b>List Action U</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LIST_ACTION_U_VALUE
	 * @generated
	 * @ordered
	 */
	LIST_ACTION_U(2, "ListActionU", "ListActionU");

	/**
	 * The '<em><b>List Action F</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>List Action F</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST_ACTION_F
	 * @model name="ListActionF"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_ACTION_F_VALUE = 0;

	/**
	 * The '<em><b>List Action D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>List Action D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST_ACTION_D
	 * @model name="ListActionD"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_ACTION_D_VALUE = 1;

	/**
	 * The '<em><b>List Action U</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>List Action U</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LIST_ACTION_U
	 * @model name="ListActionU"
	 * @generated
	 * @ordered
	 */
	public static final int LIST_ACTION_U_VALUE = 2;

	/**
	 * An array of all the '<em><b>List Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ListAction[] VALUES_ARRAY =
		new ListAction[] {
			LIST_ACTION_F,
			LIST_ACTION_D,
			LIST_ACTION_U,
		};

	/**
	 * A public read-only list of all the '<em><b>List Action</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ListAction> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>List Action</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListAction get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListAction result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>List Action</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListAction getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ListAction result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>List Action</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ListAction get(int value) {
		switch (value) {
			case LIST_ACTION_F_VALUE: return LIST_ACTION_F;
			case LIST_ACTION_D_VALUE: return LIST_ACTION_D;
			case LIST_ACTION_U_VALUE: return LIST_ACTION_U;
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
	private ListAction(int value, String name, String literal) {
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
	
} //ListAction
