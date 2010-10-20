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
 * A representation of the literals of the enumeration '<em><b>Load Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getLoadStatus()
 * @model
 * @generated
 */
public enum LoadStatus implements Enumerator {
	/**
	 * The '<em><b>Load Status01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_STATUS01_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD_STATUS01(0, "LoadStatus01", "LoadStatus01"),

	/**
	 * The '<em><b>Load Status02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_STATUS02_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD_STATUS02(1, "LoadStatus02", "LoadStatus02"),

	/**
	 * The '<em><b>Load Status03</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_STATUS03_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD_STATUS03(2, "LoadStatus03", "LoadStatus03"),

	/**
	 * The '<em><b>Load Status04</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #LOAD_STATUS04_VALUE
	 * @generated
	 * @ordered
	 */
	LOAD_STATUS04(3, "LoadStatus04", "LoadStatus04");

	/**
	 * The '<em><b>Load Status01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load Status01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD_STATUS01
	 * @model name="LoadStatus01"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_STATUS01_VALUE = 0;

	/**
	 * The '<em><b>Load Status02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load Status02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD_STATUS02
	 * @model name="LoadStatus02"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_STATUS02_VALUE = 1;

	/**
	 * The '<em><b>Load Status03</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load Status03</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD_STATUS03
	 * @model name="LoadStatus03"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_STATUS03_VALUE = 2;

	/**
	 * The '<em><b>Load Status04</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Load Status04</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #LOAD_STATUS04
	 * @model name="LoadStatus04"
	 * @generated
	 * @ordered
	 */
	public static final int LOAD_STATUS04_VALUE = 3;

	/**
	 * An array of all the '<em><b>Load Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final LoadStatus[] VALUES_ARRAY =
		new LoadStatus[] {
			LOAD_STATUS01,
			LOAD_STATUS02,
			LOAD_STATUS03,
			LOAD_STATUS04,
		};

	/**
	 * A public read-only list of all the '<em><b>Load Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<LoadStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Load Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoadStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoadStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Load Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoadStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			LoadStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Load Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static LoadStatus get(int value) {
		switch (value) {
			case LOAD_STATUS01_VALUE: return LOAD_STATUS01;
			case LOAD_STATUS02_VALUE: return LOAD_STATUS02;
			case LOAD_STATUS03_VALUE: return LOAD_STATUS03;
			case LOAD_STATUS04_VALUE: return LOAD_STATUS04;
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
	private LoadStatus(int value, String name, String literal) {
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
	
} //LoadStatus
