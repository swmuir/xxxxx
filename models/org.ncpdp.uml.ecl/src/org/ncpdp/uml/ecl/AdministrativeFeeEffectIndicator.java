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
 * A representation of the literals of the enumeration '<em><b>Administrative Fee Effect Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getAdministrativeFeeEffectIndicator()
 * @model
 * @generated
 */
public enum AdministrativeFeeEffectIndicator implements Enumerator {
	/**
	 * The '<em><b>Administrative Fee Effect Indicator Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATIVE_FEE_EFFECT_INDICATOR_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRATIVE_FEE_EFFECT_INDICATOR_BLANK(0, "AdministrativeFeeEffectIndicatorBlank", "AdministrativeFeeEffectIndicatorBlank"),

	/**
	 * The '<em><b>Administrative Fee Effect Indicator A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATIVE_FEE_EFFECT_INDICATOR_A_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRATIVE_FEE_EFFECT_INDICATOR_A(1, "AdministrativeFeeEffectIndicatorA", "AdministrativeFeeEffectIndicatorA"),

	/**
	 * The '<em><b>Administrative Fee Effect Indicator S</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATIVE_FEE_EFFECT_INDICATOR_S_VALUE
	 * @generated
	 * @ordered
	 */
	ADMINISTRATIVE_FEE_EFFECT_INDICATOR_S(2, "AdministrativeFeeEffectIndicatorS", "AdministrativeFeeEffectIndicatorS");

	/**
	 * The '<em><b>Administrative Fee Effect Indicator Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Administrative Fee Effect Indicator Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATIVE_FEE_EFFECT_INDICATOR_BLANK
	 * @model name="AdministrativeFeeEffectIndicatorBlank"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRATIVE_FEE_EFFECT_INDICATOR_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Administrative Fee Effect Indicator A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Administrative Fee Effect Indicator A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATIVE_FEE_EFFECT_INDICATOR_A
	 * @model name="AdministrativeFeeEffectIndicatorA"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRATIVE_FEE_EFFECT_INDICATOR_A_VALUE = 1;

	/**
	 * The '<em><b>Administrative Fee Effect Indicator S</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Administrative Fee Effect Indicator S</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADMINISTRATIVE_FEE_EFFECT_INDICATOR_S
	 * @model name="AdministrativeFeeEffectIndicatorS"
	 * @generated
	 * @ordered
	 */
	public static final int ADMINISTRATIVE_FEE_EFFECT_INDICATOR_S_VALUE = 2;

	/**
	 * An array of all the '<em><b>Administrative Fee Effect Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdministrativeFeeEffectIndicator[] VALUES_ARRAY =
		new AdministrativeFeeEffectIndicator[] {
			ADMINISTRATIVE_FEE_EFFECT_INDICATOR_BLANK,
			ADMINISTRATIVE_FEE_EFFECT_INDICATOR_A,
			ADMINISTRATIVE_FEE_EFFECT_INDICATOR_S,
		};

	/**
	 * A public read-only list of all the '<em><b>Administrative Fee Effect Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdministrativeFeeEffectIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Administrative Fee Effect Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdministrativeFeeEffectIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdministrativeFeeEffectIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Administrative Fee Effect Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdministrativeFeeEffectIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdministrativeFeeEffectIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Administrative Fee Effect Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdministrativeFeeEffectIndicator get(int value) {
		switch (value) {
			case ADMINISTRATIVE_FEE_EFFECT_INDICATOR_BLANK_VALUE: return ADMINISTRATIVE_FEE_EFFECT_INDICATOR_BLANK;
			case ADMINISTRATIVE_FEE_EFFECT_INDICATOR_A_VALUE: return ADMINISTRATIVE_FEE_EFFECT_INDICATOR_A;
			case ADMINISTRATIVE_FEE_EFFECT_INDICATOR_S_VALUE: return ADMINISTRATIVE_FEE_EFFECT_INDICATOR_S;
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
	private AdministrativeFeeEffectIndicator(int value, String name, String literal) {
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
	
} //AdministrativeFeeEffectIndicator
