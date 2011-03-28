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
 * A representation of the literals of the enumeration '<em><b>Submit Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getSubmitCode()
 * @model
 * @generated
 */
public enum SubmitCode implements Enumerator {
	/**
	 * The '<em><b>Submit Code00</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMIT_CODE00_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMIT_CODE00(0, "SubmitCode00", "SubmitCode00"),

	/**
	 * The '<em><b>Submit Code02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMIT_CODE02_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMIT_CODE02(1, "SubmitCode02", "SubmitCode02"),

	/**
	 * The '<em><b>Submit Code03</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMIT_CODE03_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMIT_CODE03(2, "SubmitCode03", "SubmitCode03"),

	/**
	 * The '<em><b>Submit Code05</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMIT_CODE05_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMIT_CODE05(3, "SubmitCode05", "SubmitCode05");

	/**
	 * The '<em><b>Submit Code00</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Submit Code00</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMIT_CODE00
	 * @model name="SubmitCode00"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMIT_CODE00_VALUE = 0;

	/**
	 * The '<em><b>Submit Code02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Submit Code02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMIT_CODE02
	 * @model name="SubmitCode02"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMIT_CODE02_VALUE = 1;

	/**
	 * The '<em><b>Submit Code03</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Submit Code03</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMIT_CODE03
	 * @model name="SubmitCode03"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMIT_CODE03_VALUE = 2;

	/**
	 * The '<em><b>Submit Code05</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Submit Code05</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMIT_CODE05
	 * @model name="SubmitCode05"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMIT_CODE05_VALUE = 3;

	/**
	 * An array of all the '<em><b>Submit Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubmitCode[] VALUES_ARRAY =
		new SubmitCode[] {
			SUBMIT_CODE00,
			SUBMIT_CODE02,
			SUBMIT_CODE03,
			SUBMIT_CODE05,
		};

	/**
	 * A public read-only list of all the '<em><b>Submit Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubmitCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Submit Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubmitCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubmitCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Submit Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubmitCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubmitCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Submit Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubmitCode get(int value) {
		switch (value) {
			case SUBMIT_CODE00_VALUE: return SUBMIT_CODE00;
			case SUBMIT_CODE02_VALUE: return SUBMIT_CODE02;
			case SUBMIT_CODE03_VALUE: return SUBMIT_CODE03;
			case SUBMIT_CODE05_VALUE: return SUBMIT_CODE05;
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
	private SubmitCode(int value, String name, String literal) {
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
	
} //SubmitCode
