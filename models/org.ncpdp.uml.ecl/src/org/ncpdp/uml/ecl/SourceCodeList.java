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
 * A representation of the literals of the enumeration '<em><b>Source Code List</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getSourceCodeList()
 * @model
 * @generated
 */
public enum SourceCodeList implements Enumerator {
	/**
	 * The '<em><b>Source Code List AA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_CODE_LIST_AA_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_CODE_LIST_AA(0, "SourceCodeListAA", "SourceCodeListAA"),

	/**
	 * The '<em><b>Source Code List AB</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_CODE_LIST_AB_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_CODE_LIST_AB(1, "SourceCodeListAB", "SourceCodeListAB"),

	/**
	 * The '<em><b>Source Code List AC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCE_CODE_LIST_AC_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCE_CODE_LIST_AC(2, "SourceCodeListAC", "SourceCodeListAC");

	/**
	 * The '<em><b>Source Code List AA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Source Code List AA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCE_CODE_LIST_AA
	 * @model name="SourceCodeListAA"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_CODE_LIST_AA_VALUE = 0;

	/**
	 * The '<em><b>Source Code List AB</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Source Code List AB</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCE_CODE_LIST_AB
	 * @model name="SourceCodeListAB"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_CODE_LIST_AB_VALUE = 1;

	/**
	 * The '<em><b>Source Code List AC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Source Code List AC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCE_CODE_LIST_AC
	 * @model name="SourceCodeListAC"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCE_CODE_LIST_AC_VALUE = 2;

	/**
	 * An array of all the '<em><b>Source Code List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SourceCodeList[] VALUES_ARRAY =
		new SourceCodeList[] {
			SOURCE_CODE_LIST_AA,
			SOURCE_CODE_LIST_AB,
			SOURCE_CODE_LIST_AC,
		};

	/**
	 * A public read-only list of all the '<em><b>Source Code List</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SourceCodeList> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Source Code List</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceCodeList get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceCodeList result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Code List</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceCodeList getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceCodeList result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Source Code List</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceCodeList get(int value) {
		switch (value) {
			case SOURCE_CODE_LIST_AA_VALUE: return SOURCE_CODE_LIST_AA;
			case SOURCE_CODE_LIST_AB_VALUE: return SOURCE_CODE_LIST_AB;
			case SOURCE_CODE_LIST_AC_VALUE: return SOURCE_CODE_LIST_AC;
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
	private SourceCodeList(int value, String name, String literal) {
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
	
} //SourceCodeList
