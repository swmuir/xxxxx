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
 * A representation of the literals of the enumeration '<em><b>Smoker Non Smoker Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getSmokerNonSmokerCode()
 * @model
 * @generated
 */
public enum SmokerNonSmokerCode implements Enumerator {
	/**
	 * The '<em><b>Smoker Non Smoker Code Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMOKER_NON_SMOKER_CODE_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	SMOKER_NON_SMOKER_CODE_BLANK(0, "SmokerNonSmokerCodeBlank", "SmokerNonSmokerCodeBlank"),

	/**
	 * The '<em><b>Smoker Non Smoker Code1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMOKER_NON_SMOKER_CODE1_VALUE
	 * @generated
	 * @ordered
	 */
	SMOKER_NON_SMOKER_CODE1(1, "SmokerNonSmokerCode1", "SmokerNonSmokerCode1"),

	/**
	 * The '<em><b>Smoker Non Smoker Code2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SMOKER_NON_SMOKER_CODE2_VALUE
	 * @generated
	 * @ordered
	 */
	SMOKER_NON_SMOKER_CODE2(2, "SmokerNonSmokerCode2", "SmokerNonSmokerCode2");

	/**
	 * The '<em><b>Smoker Non Smoker Code Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smoker Non Smoker Code Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMOKER_NON_SMOKER_CODE_BLANK
	 * @model name="SmokerNonSmokerCodeBlank"
	 * @generated
	 * @ordered
	 */
	public static final int SMOKER_NON_SMOKER_CODE_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Smoker Non Smoker Code1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smoker Non Smoker Code1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMOKER_NON_SMOKER_CODE1
	 * @model name="SmokerNonSmokerCode1"
	 * @generated
	 * @ordered
	 */
	public static final int SMOKER_NON_SMOKER_CODE1_VALUE = 1;

	/**
	 * The '<em><b>Smoker Non Smoker Code2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Smoker Non Smoker Code2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SMOKER_NON_SMOKER_CODE2
	 * @model name="SmokerNonSmokerCode2"
	 * @generated
	 * @ordered
	 */
	public static final int SMOKER_NON_SMOKER_CODE2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Smoker Non Smoker Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SmokerNonSmokerCode[] VALUES_ARRAY =
		new SmokerNonSmokerCode[] {
			SMOKER_NON_SMOKER_CODE_BLANK,
			SMOKER_NON_SMOKER_CODE1,
			SMOKER_NON_SMOKER_CODE2,
		};

	/**
	 * A public read-only list of all the '<em><b>Smoker Non Smoker Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SmokerNonSmokerCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Smoker Non Smoker Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmokerNonSmokerCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SmokerNonSmokerCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Smoker Non Smoker Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmokerNonSmokerCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SmokerNonSmokerCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Smoker Non Smoker Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SmokerNonSmokerCode get(int value) {
		switch (value) {
			case SMOKER_NON_SMOKER_CODE_BLANK_VALUE: return SMOKER_NON_SMOKER_CODE_BLANK;
			case SMOKER_NON_SMOKER_CODE1_VALUE: return SMOKER_NON_SMOKER_CODE1;
			case SMOKER_NON_SMOKER_CODE2_VALUE: return SMOKER_NON_SMOKER_CODE2;
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
	private SmokerNonSmokerCode(int value, String name, String literal) {
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
	
} //SmokerNonSmokerCode
