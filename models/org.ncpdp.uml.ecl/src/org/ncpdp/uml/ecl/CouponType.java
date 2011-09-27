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
 * A representation of the literals of the enumeration '<em><b>Coupon Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getCouponType()
 * @model
 * @generated
 */
public enum CouponType implements Enumerator {
	/**
	 * The '<em><b>Coupon Type01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUPON_TYPE01_VALUE
	 * @generated
	 * @ordered
	 */
	COUPON_TYPE01(0, "CouponType01", "CouponType01"),

	/**
	 * The '<em><b>Coupon Type02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUPON_TYPE02_VALUE
	 * @generated
	 * @ordered
	 */
	COUPON_TYPE02(1, "CouponType02", "CouponType02"),

	/**
	 * The '<em><b>Coupon Type99</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COUPON_TYPE99_VALUE
	 * @generated
	 * @ordered
	 */
	COUPON_TYPE99(2, "CouponType99", "CouponType99");

	/**
	 * The '<em><b>Coupon Type01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coupon Type01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUPON_TYPE01
	 * @model name="CouponType01"
	 * @generated
	 * @ordered
	 */
	public static final int COUPON_TYPE01_VALUE = 0;

	/**
	 * The '<em><b>Coupon Type02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coupon Type02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUPON_TYPE02
	 * @model name="CouponType02"
	 * @generated
	 * @ordered
	 */
	public static final int COUPON_TYPE02_VALUE = 1;

	/**
	 * The '<em><b>Coupon Type99</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Coupon Type99</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COUPON_TYPE99
	 * @model name="CouponType99"
	 * @generated
	 * @ordered
	 */
	public static final int COUPON_TYPE99_VALUE = 2;

	/**
	 * An array of all the '<em><b>Coupon Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CouponType[] VALUES_ARRAY =
		new CouponType[] {
			COUPON_TYPE01,
			COUPON_TYPE02,
			COUPON_TYPE99,
		};

	/**
	 * A public read-only list of all the '<em><b>Coupon Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CouponType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Coupon Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CouponType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CouponType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coupon Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CouponType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CouponType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Coupon Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CouponType get(int value) {
		switch (value) {
			case COUPON_TYPE01_VALUE: return COUPON_TYPE01;
			case COUPON_TYPE02_VALUE: return COUPON_TYPE02;
			case COUPON_TYPE99_VALUE: return COUPON_TYPE99;
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
	private CouponType(int value, String name, String literal) {
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
	
} //CouponType
