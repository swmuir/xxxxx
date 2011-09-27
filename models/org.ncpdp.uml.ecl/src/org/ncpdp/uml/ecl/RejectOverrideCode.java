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
 * A representation of the literals of the enumeration '<em><b>Reject Override Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getRejectOverrideCode()
 * @model
 * @generated
 */
public enum RejectOverrideCode implements Enumerator {
	/**
	 * The '<em><b>Reject Override Code Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_OVERRIDE_CODE_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT_OVERRIDE_CODE_BLANK(0, "RejectOverrideCodeBlank", "RejectOverrideCodeBlank"),

	/**
	 * The '<em><b>Reject Override Code0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_OVERRIDE_CODE0_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT_OVERRIDE_CODE0(1, "RejectOverrideCode0", "RejectOverrideCode0"),

	/**
	 * The '<em><b>Reject Override Code1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_OVERRIDE_CODE1_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT_OVERRIDE_CODE1(2, "RejectOverrideCode1", "RejectOverrideCode1"),

	/**
	 * The '<em><b>Reject Override Code2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_OVERRIDE_CODE2_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT_OVERRIDE_CODE2(3, "RejectOverrideCode2", "RejectOverrideCode2"),

	/**
	 * The '<em><b>Reject Override Code3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #REJECT_OVERRIDE_CODE3_VALUE
	 * @generated
	 * @ordered
	 */
	REJECT_OVERRIDE_CODE3(4, "RejectOverrideCode3", "RejectOverrideCode3");

	/**
	 * The '<em><b>Reject Override Code Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reject Override Code Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECT_OVERRIDE_CODE_BLANK
	 * @model name="RejectOverrideCodeBlank"
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_OVERRIDE_CODE_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Reject Override Code0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reject Override Code0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECT_OVERRIDE_CODE0
	 * @model name="RejectOverrideCode0"
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_OVERRIDE_CODE0_VALUE = 1;

	/**
	 * The '<em><b>Reject Override Code1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reject Override Code1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECT_OVERRIDE_CODE1
	 * @model name="RejectOverrideCode1"
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_OVERRIDE_CODE1_VALUE = 2;

	/**
	 * The '<em><b>Reject Override Code2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reject Override Code2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECT_OVERRIDE_CODE2
	 * @model name="RejectOverrideCode2"
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_OVERRIDE_CODE2_VALUE = 3;

	/**
	 * The '<em><b>Reject Override Code3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Reject Override Code3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #REJECT_OVERRIDE_CODE3
	 * @model name="RejectOverrideCode3"
	 * @generated
	 * @ordered
	 */
	public static final int REJECT_OVERRIDE_CODE3_VALUE = 4;

	/**
	 * An array of all the '<em><b>Reject Override Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final RejectOverrideCode[] VALUES_ARRAY =
		new RejectOverrideCode[] {
			REJECT_OVERRIDE_CODE_BLANK,
			REJECT_OVERRIDE_CODE0,
			REJECT_OVERRIDE_CODE1,
			REJECT_OVERRIDE_CODE2,
			REJECT_OVERRIDE_CODE3,
		};

	/**
	 * A public read-only list of all the '<em><b>Reject Override Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<RejectOverrideCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Reject Override Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RejectOverrideCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RejectOverrideCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reject Override Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RejectOverrideCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			RejectOverrideCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Reject Override Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static RejectOverrideCode get(int value) {
		switch (value) {
			case REJECT_OVERRIDE_CODE_BLANK_VALUE: return REJECT_OVERRIDE_CODE_BLANK;
			case REJECT_OVERRIDE_CODE0_VALUE: return REJECT_OVERRIDE_CODE0;
			case REJECT_OVERRIDE_CODE1_VALUE: return REJECT_OVERRIDE_CODE1;
			case REJECT_OVERRIDE_CODE2_VALUE: return REJECT_OVERRIDE_CODE2;
			case REJECT_OVERRIDE_CODE3_VALUE: return REJECT_OVERRIDE_CODE3;
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
	private RejectOverrideCode(int value, String name, String literal) {
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
	
} //RejectOverrideCode
