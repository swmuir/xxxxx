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
 * A representation of the literals of the enumeration '<em><b>Transaction Count</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getTransactionCount()
 * @model
 * @generated
 */
public enum TransactionCount implements Enumerator {
	/**
	 * The '<em><b>Transaction Count Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_COUNT_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_COUNT_BLANK(0, "TransactionCountBlank", "TransactionCountBlank"),

	/**
	 * The '<em><b>Transaction Count1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_COUNT1_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_COUNT1(1, "TransactionCount1", "TransactionCount1"),

	/**
	 * The '<em><b>Transaction Count2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_COUNT2_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_COUNT2(2, "TransactionCount2", "TransactionCount2"),

	/**
	 * The '<em><b>Transaction Count3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_COUNT3_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_COUNT3(3, "TransactionCount3", "TransactionCount3"),

	/**
	 * The '<em><b>Transaction Count4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_COUNT4_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSACTION_COUNT4(4, "TransactionCount4", "TransactionCount4");

	/**
	 * The '<em><b>Transaction Count Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transaction Count Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_COUNT_BLANK
	 * @model name="TransactionCountBlank"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_COUNT_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Transaction Count1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transaction Count1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_COUNT1
	 * @model name="TransactionCount1"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_COUNT1_VALUE = 1;

	/**
	 * The '<em><b>Transaction Count2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transaction Count2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_COUNT2
	 * @model name="TransactionCount2"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_COUNT2_VALUE = 2;

	/**
	 * The '<em><b>Transaction Count3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transaction Count3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_COUNT3
	 * @model name="TransactionCount3"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_COUNT3_VALUE = 3;

	/**
	 * The '<em><b>Transaction Count4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transaction Count4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSACTION_COUNT4
	 * @model name="TransactionCount4"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSACTION_COUNT4_VALUE = 4;

	/**
	 * An array of all the '<em><b>Transaction Count</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransactionCount[] VALUES_ARRAY =
		new TransactionCount[] {
			TRANSACTION_COUNT_BLANK,
			TRANSACTION_COUNT1,
			TRANSACTION_COUNT2,
			TRANSACTION_COUNT3,
			TRANSACTION_COUNT4,
		};

	/**
	 * A public read-only list of all the '<em><b>Transaction Count</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransactionCount> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transaction Count</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransactionCount get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransactionCount result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transaction Count</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransactionCount getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransactionCount result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transaction Count</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransactionCount get(int value) {
		switch (value) {
			case TRANSACTION_COUNT_BLANK_VALUE: return TRANSACTION_COUNT_BLANK;
			case TRANSACTION_COUNT1_VALUE: return TRANSACTION_COUNT1;
			case TRANSACTION_COUNT2_VALUE: return TRANSACTION_COUNT2;
			case TRANSACTION_COUNT3_VALUE: return TRANSACTION_COUNT3;
			case TRANSACTION_COUNT4_VALUE: return TRANSACTION_COUNT4;
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
	private TransactionCount(int value, String name, String literal) {
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
	
} //TransactionCount
