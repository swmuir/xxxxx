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
 * A representation of the literals of the enumeration '<em><b>Benefit Amount Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getBenefitAmountType()
 * @model
 * @generated
 */
public enum BenefitAmountType implements Enumerator {
	/**
	 * The '<em><b>Benefit Amount Type1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BENEFIT_AMOUNT_TYPE1_VALUE
	 * @generated
	 * @ordered
	 */
	BENEFIT_AMOUNT_TYPE1(0, "BenefitAmountType1", "BenefitAmountType1"),

	/**
	 * The '<em><b>Benefit Amount Type2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BENEFIT_AMOUNT_TYPE2_VALUE
	 * @generated
	 * @ordered
	 */
	BENEFIT_AMOUNT_TYPE2(1, "BenefitAmountType2", "BenefitAmountType2"),

	/**
	 * The '<em><b>Benefit Amount Type3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BENEFIT_AMOUNT_TYPE3_VALUE
	 * @generated
	 * @ordered
	 */
	BENEFIT_AMOUNT_TYPE3(2, "BenefitAmountType3", "BenefitAmountType3");

	/**
	 * The '<em><b>Benefit Amount Type1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Benefit Amount Type1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BENEFIT_AMOUNT_TYPE1
	 * @model name="BenefitAmountType1"
	 * @generated
	 * @ordered
	 */
	public static final int BENEFIT_AMOUNT_TYPE1_VALUE = 0;

	/**
	 * The '<em><b>Benefit Amount Type2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Benefit Amount Type2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BENEFIT_AMOUNT_TYPE2
	 * @model name="BenefitAmountType2"
	 * @generated
	 * @ordered
	 */
	public static final int BENEFIT_AMOUNT_TYPE2_VALUE = 1;

	/**
	 * The '<em><b>Benefit Amount Type3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Benefit Amount Type3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BENEFIT_AMOUNT_TYPE3
	 * @model name="BenefitAmountType3"
	 * @generated
	 * @ordered
	 */
	public static final int BENEFIT_AMOUNT_TYPE3_VALUE = 2;

	/**
	 * An array of all the '<em><b>Benefit Amount Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BenefitAmountType[] VALUES_ARRAY =
		new BenefitAmountType[] {
			BENEFIT_AMOUNT_TYPE1,
			BENEFIT_AMOUNT_TYPE2,
			BENEFIT_AMOUNT_TYPE3,
		};

	/**
	 * A public read-only list of all the '<em><b>Benefit Amount Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BenefitAmountType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Benefit Amount Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BenefitAmountType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BenefitAmountType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Benefit Amount Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BenefitAmountType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BenefitAmountType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Benefit Amount Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BenefitAmountType get(int value) {
		switch (value) {
			case BENEFIT_AMOUNT_TYPE1_VALUE: return BENEFIT_AMOUNT_TYPE1;
			case BENEFIT_AMOUNT_TYPE2_VALUE: return BENEFIT_AMOUNT_TYPE2;
			case BENEFIT_AMOUNT_TYPE3_VALUE: return BENEFIT_AMOUNT_TYPE3;
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
	private BenefitAmountType(int value, String name, String literal) {
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
	
} //BenefitAmountType
