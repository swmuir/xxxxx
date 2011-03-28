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
 * A representation of the literals of the enumeration '<em><b>Do Not Fill Profile Flag</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getDoNotFillProfileFlag()
 * @model
 * @generated
 */
public enum DoNotFillProfileFlag implements Enumerator {
	/**
	 * The '<em><b>Do Not Fill Profile Flag Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DO_NOT_FILL_PROFILE_FLAG_Y_VALUE
	 * @generated
	 * @ordered
	 */
	DO_NOT_FILL_PROFILE_FLAG_Y(0, "DoNotFillProfileFlagY", "DoNotFillProfileFlagY");

	/**
	 * The '<em><b>Do Not Fill Profile Flag Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Do Not Fill Profile Flag Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DO_NOT_FILL_PROFILE_FLAG_Y
	 * @model name="DoNotFillProfileFlagY"
	 * @generated
	 * @ordered
	 */
	public static final int DO_NOT_FILL_PROFILE_FLAG_Y_VALUE = 0;

	/**
	 * An array of all the '<em><b>Do Not Fill Profile Flag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DoNotFillProfileFlag[] VALUES_ARRAY =
		new DoNotFillProfileFlag[] {
			DO_NOT_FILL_PROFILE_FLAG_Y,
		};

	/**
	 * A public read-only list of all the '<em><b>Do Not Fill Profile Flag</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DoNotFillProfileFlag> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Do Not Fill Profile Flag</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DoNotFillProfileFlag get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoNotFillProfileFlag result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Do Not Fill Profile Flag</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DoNotFillProfileFlag getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DoNotFillProfileFlag result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Do Not Fill Profile Flag</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DoNotFillProfileFlag get(int value) {
		switch (value) {
			case DO_NOT_FILL_PROFILE_FLAG_Y_VALUE: return DO_NOT_FILL_PROFILE_FLAG_Y;
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
	private DoNotFillProfileFlag(int value, String name, String literal) {
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
	
} //DoNotFillProfileFlag
