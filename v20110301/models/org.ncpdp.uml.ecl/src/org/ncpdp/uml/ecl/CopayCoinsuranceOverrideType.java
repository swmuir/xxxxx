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
 * A representation of the literals of the enumeration '<em><b>Copay Coinsurance Override Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getCopayCoinsuranceOverrideType()
 * @model
 * @generated
 */
public enum CopayCoinsuranceOverrideType implements Enumerator {
	/**
	 * The '<em><b>Copay Coinsurance Override Type1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPAY_COINSURANCE_OVERRIDE_TYPE1_VALUE
	 * @generated
	 * @ordered
	 */
	COPAY_COINSURANCE_OVERRIDE_TYPE1(0, "CopayCoinsuranceOverrideType1", "CopayCoinsuranceOverrideType1"),

	/**
	 * The '<em><b>Copay Coinsurance Override Type2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COPAY_COINSURANCE_OVERRIDE_TYPE2_VALUE
	 * @generated
	 * @ordered
	 */
	COPAY_COINSURANCE_OVERRIDE_TYPE2(1, "CopayCoinsuranceOverrideType2", "CopayCoinsuranceOverrideType2");

	/**
	 * The '<em><b>Copay Coinsurance Override Type1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Copay Coinsurance Override Type1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPAY_COINSURANCE_OVERRIDE_TYPE1
	 * @model name="CopayCoinsuranceOverrideType1"
	 * @generated
	 * @ordered
	 */
	public static final int COPAY_COINSURANCE_OVERRIDE_TYPE1_VALUE = 0;

	/**
	 * The '<em><b>Copay Coinsurance Override Type2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Copay Coinsurance Override Type2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COPAY_COINSURANCE_OVERRIDE_TYPE2
	 * @model name="CopayCoinsuranceOverrideType2"
	 * @generated
	 * @ordered
	 */
	public static final int COPAY_COINSURANCE_OVERRIDE_TYPE2_VALUE = 1;

	/**
	 * An array of all the '<em><b>Copay Coinsurance Override Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CopayCoinsuranceOverrideType[] VALUES_ARRAY =
		new CopayCoinsuranceOverrideType[] {
			COPAY_COINSURANCE_OVERRIDE_TYPE1,
			COPAY_COINSURANCE_OVERRIDE_TYPE2,
		};

	/**
	 * A public read-only list of all the '<em><b>Copay Coinsurance Override Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CopayCoinsuranceOverrideType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Copay Coinsurance Override Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CopayCoinsuranceOverrideType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CopayCoinsuranceOverrideType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Copay Coinsurance Override Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CopayCoinsuranceOverrideType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CopayCoinsuranceOverrideType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Copay Coinsurance Override Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CopayCoinsuranceOverrideType get(int value) {
		switch (value) {
			case COPAY_COINSURANCE_OVERRIDE_TYPE1_VALUE: return COPAY_COINSURANCE_OVERRIDE_TYPE1;
			case COPAY_COINSURANCE_OVERRIDE_TYPE2_VALUE: return COPAY_COINSURANCE_OVERRIDE_TYPE2;
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
	private CopayCoinsuranceOverrideType(int value, String name, String literal) {
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
	
} //CopayCoinsuranceOverrideType
