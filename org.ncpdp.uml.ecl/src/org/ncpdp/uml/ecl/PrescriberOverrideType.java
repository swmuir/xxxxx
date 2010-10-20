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
 * A representation of the literals of the enumeration '<em><b>Prescriber Override Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPrescriberOverrideType()
 * @model
 * @generated
 */
public enum PrescriberOverrideType implements Enumerator {
	/**
	 * The '<em><b>Prescriber Override Type1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIBER_OVERRIDE_TYPE1_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIBER_OVERRIDE_TYPE1(0, "PrescriberOverrideType1", "PrescriberOverrideType1"),

	/**
	 * The '<em><b>Prescriber Override Type2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIBER_OVERRIDE_TYPE2_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIBER_OVERRIDE_TYPE2(1, "PrescriberOverrideType2", "PrescriberOverrideType2"),

	/**
	 * The '<em><b>Prescriber Override Type3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIBER_OVERRIDE_TYPE3_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIBER_OVERRIDE_TYPE3(2, "PrescriberOverrideType3", "PrescriberOverrideType3");

	/**
	 * The '<em><b>Prescriber Override Type1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescriber Override Type1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIBER_OVERRIDE_TYPE1
	 * @model name="PrescriberOverrideType1"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIBER_OVERRIDE_TYPE1_VALUE = 0;

	/**
	 * The '<em><b>Prescriber Override Type2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescriber Override Type2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIBER_OVERRIDE_TYPE2
	 * @model name="PrescriberOverrideType2"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIBER_OVERRIDE_TYPE2_VALUE = 1;

	/**
	 * The '<em><b>Prescriber Override Type3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescriber Override Type3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIBER_OVERRIDE_TYPE3
	 * @model name="PrescriberOverrideType3"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIBER_OVERRIDE_TYPE3_VALUE = 2;

	/**
	 * An array of all the '<em><b>Prescriber Override Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrescriberOverrideType[] VALUES_ARRAY =
		new PrescriberOverrideType[] {
			PRESCRIBER_OVERRIDE_TYPE1,
			PRESCRIBER_OVERRIDE_TYPE2,
			PRESCRIBER_OVERRIDE_TYPE3,
		};

	/**
	 * A public read-only list of all the '<em><b>Prescriber Override Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrescriberOverrideType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Prescriber Override Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriberOverrideType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrescriberOverrideType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prescriber Override Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriberOverrideType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrescriberOverrideType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prescriber Override Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriberOverrideType get(int value) {
		switch (value) {
			case PRESCRIBER_OVERRIDE_TYPE1_VALUE: return PRESCRIBER_OVERRIDE_TYPE1;
			case PRESCRIBER_OVERRIDE_TYPE2_VALUE: return PRESCRIBER_OVERRIDE_TYPE2;
			case PRESCRIBER_OVERRIDE_TYPE3_VALUE: return PRESCRIBER_OVERRIDE_TYPE3;
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
	private PrescriberOverrideType(int value, String name, String literal) {
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
	
} //PrescriberOverrideType
