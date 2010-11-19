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
 * A representation of the literals of the enumeration '<em><b>Copay List Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getCopayListType()
 * @model
 * @generated
 */
public enum CopayListType implements Enumerator {
	/**
	 * The '<em><b>Copay List Type SL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPAY_LIST_TYPE_SL_VALUE
	 * @generated
	 * @ordered
	 */
	COPAY_LIST_TYPE_SL(0, "CopayListTypeSL", "CopayListTypeSL"),

	/**
	 * The '<em><b>Copay List Type DS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPAY_LIST_TYPE_DS_VALUE
	 * @generated
	 * @ordered
	 */
	COPAY_LIST_TYPE_DS(1, "CopayListTypeDS", "CopayListTypeDS");

	/**
	 * The '<em><b>Copay List Type SL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Copay List Type SL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPAY_LIST_TYPE_SL
	 * @model name="CopayListTypeSL"
	 * @generated
	 * @ordered
	 */
	public static final int COPAY_LIST_TYPE_SL_VALUE = 0;

	/**
	 * The '<em><b>Copay List Type DS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Copay List Type DS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPAY_LIST_TYPE_DS
	 * @model name="CopayListTypeDS"
	 * @generated
	 * @ordered
	 */
	public static final int COPAY_LIST_TYPE_DS_VALUE = 1;

	/**
	 * An array of all the '<em><b>Copay List Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CopayListType[] VALUES_ARRAY =
		new CopayListType[] {
			COPAY_LIST_TYPE_SL,
			COPAY_LIST_TYPE_DS,
		};

	/**
	 * A public read-only list of all the '<em><b>Copay List Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CopayListType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Copay List Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CopayListType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CopayListType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Copay List Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CopayListType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CopayListType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Copay List Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CopayListType get(int value) {
		switch (value) {
			case COPAY_LIST_TYPE_SL_VALUE: return COPAY_LIST_TYPE_SL;
			case COPAY_LIST_TYPE_DS_VALUE: return COPAY_LIST_TYPE_DS;
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
	private CopayListType(int value, String name, String literal) {
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
	
} //CopayListType
