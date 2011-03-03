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
 * A representation of the literals of the enumeration '<em><b>Brand Generic Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getBrandGenericIndicator()
 * @model
 * @generated
 */
public enum BrandGenericIndicator implements Enumerator {
	/**
	 * The '<em><b>Brand Generic Indicator B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRAND_GENERIC_INDICATOR_B_VALUE
	 * @generated
	 * @ordered
	 */
	BRAND_GENERIC_INDICATOR_B(0, "BrandGenericIndicatorB", "BrandGenericIndicatorB"),

	/**
	 * The '<em><b>Brand Generic Indicator G</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BRAND_GENERIC_INDICATOR_G_VALUE
	 * @generated
	 * @ordered
	 */
	BRAND_GENERIC_INDICATOR_G(1, "BrandGenericIndicatorG", "BrandGenericIndicatorG");

	/**
	 * The '<em><b>Brand Generic Indicator B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Brand Generic Indicator B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRAND_GENERIC_INDICATOR_B
	 * @model name="BrandGenericIndicatorB"
	 * @generated
	 * @ordered
	 */
	public static final int BRAND_GENERIC_INDICATOR_B_VALUE = 0;

	/**
	 * The '<em><b>Brand Generic Indicator G</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Brand Generic Indicator G</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BRAND_GENERIC_INDICATOR_G
	 * @model name="BrandGenericIndicatorG"
	 * @generated
	 * @ordered
	 */
	public static final int BRAND_GENERIC_INDICATOR_G_VALUE = 1;

	/**
	 * An array of all the '<em><b>Brand Generic Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BrandGenericIndicator[] VALUES_ARRAY =
		new BrandGenericIndicator[] {
			BRAND_GENERIC_INDICATOR_B,
			BRAND_GENERIC_INDICATOR_G,
		};

	/**
	 * A public read-only list of all the '<em><b>Brand Generic Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BrandGenericIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Brand Generic Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BrandGenericIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BrandGenericIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Brand Generic Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BrandGenericIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BrandGenericIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Brand Generic Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BrandGenericIndicator get(int value) {
		switch (value) {
			case BRAND_GENERIC_INDICATOR_B_VALUE: return BRAND_GENERIC_INDICATOR_B;
			case BRAND_GENERIC_INDICATOR_G_VALUE: return BRAND_GENERIC_INDICATOR_G;
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
	private BrandGenericIndicator(int value, String name, String literal) {
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
	
} //BrandGenericIndicator
