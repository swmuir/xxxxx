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
 * A representation of the literals of the enumeration '<em><b>Dispensing Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getDispensingStatus()
 * @model
 * @generated
 */
public enum DispensingStatus implements Enumerator {
	/**
	 * The '<em><b>Dispensing Status Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPENSING_STATUS_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	DISPENSING_STATUS_BLANK(0, "DispensingStatusBlank", "DispensingStatusBlank"),

	/**
	 * The '<em><b>Dispensing Status P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPENSING_STATUS_P_VALUE
	 * @generated
	 * @ordered
	 */
	DISPENSING_STATUS_P(1, "DispensingStatusP", "DispensingStatusP"),

	/**
	 * The '<em><b>Dispensing Status C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPENSING_STATUS_C_VALUE
	 * @generated
	 * @ordered
	 */
	DISPENSING_STATUS_C(2, "DispensingStatusC", "DispensingStatusC");

	/**
	 * The '<em><b>Dispensing Status Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dispensing Status Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPENSING_STATUS_BLANK
	 * @model name="DispensingStatusBlank"
	 * @generated
	 * @ordered
	 */
	public static final int DISPENSING_STATUS_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Dispensing Status P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dispensing Status P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPENSING_STATUS_P
	 * @model name="DispensingStatusP"
	 * @generated
	 * @ordered
	 */
	public static final int DISPENSING_STATUS_P_VALUE = 1;

	/**
	 * The '<em><b>Dispensing Status C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dispensing Status C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPENSING_STATUS_C
	 * @model name="DispensingStatusC"
	 * @generated
	 * @ordered
	 */
	public static final int DISPENSING_STATUS_C_VALUE = 2;

	/**
	 * An array of all the '<em><b>Dispensing Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DispensingStatus[] VALUES_ARRAY =
		new DispensingStatus[] {
			DISPENSING_STATUS_BLANK,
			DISPENSING_STATUS_P,
			DISPENSING_STATUS_C,
		};

	/**
	 * A public read-only list of all the '<em><b>Dispensing Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DispensingStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dispensing Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DispensingStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DispensingStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dispensing Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DispensingStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DispensingStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dispensing Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DispensingStatus get(int value) {
		switch (value) {
			case DISPENSING_STATUS_BLANK_VALUE: return DISPENSING_STATUS_BLANK;
			case DISPENSING_STATUS_P_VALUE: return DISPENSING_STATUS_P;
			case DISPENSING_STATUS_C_VALUE: return DISPENSING_STATUS_C;
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
	private DispensingStatus(int value, String name, String literal) {
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
	
} //DispensingStatus
