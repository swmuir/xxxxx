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
 * A representation of the literals of the enumeration '<em><b>Billing Entity Type Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getBillingEntityTypeIndicator()
 * @model
 * @generated
 */
public enum BillingEntityTypeIndicator implements Enumerator {
	/**
	 * The '<em><b>Billing Entity Type Indicator00</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BILLING_ENTITY_TYPE_INDICATOR00_VALUE
	 * @generated
	 * @ordered
	 */
	BILLING_ENTITY_TYPE_INDICATOR00(0, "BillingEntityTypeIndicator00", "BillingEntityTypeIndicator00"),

	/**
	 * The '<em><b>Billing Entity Type Indicator01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BILLING_ENTITY_TYPE_INDICATOR01_VALUE
	 * @generated
	 * @ordered
	 */
	BILLING_ENTITY_TYPE_INDICATOR01(1, "BillingEntityTypeIndicator01", "BillingEntityTypeIndicator01"),

	/**
	 * The '<em><b>Billing Entity Type Indicator02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BILLING_ENTITY_TYPE_INDICATOR02_VALUE
	 * @generated
	 * @ordered
	 */
	BILLING_ENTITY_TYPE_INDICATOR02(2, "BillingEntityTypeIndicator02", "BillingEntityTypeIndicator02"),

	/**
	 * The '<em><b>Billing Entity Type Indicator03</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #BILLING_ENTITY_TYPE_INDICATOR03_VALUE
	 * @generated
	 * @ordered
	 */
	BILLING_ENTITY_TYPE_INDICATOR03(3, "BillingEntityTypeIndicator03", "BillingEntityTypeIndicator03");

	/**
	 * The '<em><b>Billing Entity Type Indicator00</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Billing Entity Type Indicator00</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BILLING_ENTITY_TYPE_INDICATOR00
	 * @model name="BillingEntityTypeIndicator00"
	 * @generated
	 * @ordered
	 */
	public static final int BILLING_ENTITY_TYPE_INDICATOR00_VALUE = 0;

	/**
	 * The '<em><b>Billing Entity Type Indicator01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Billing Entity Type Indicator01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BILLING_ENTITY_TYPE_INDICATOR01
	 * @model name="BillingEntityTypeIndicator01"
	 * @generated
	 * @ordered
	 */
	public static final int BILLING_ENTITY_TYPE_INDICATOR01_VALUE = 1;

	/**
	 * The '<em><b>Billing Entity Type Indicator02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Billing Entity Type Indicator02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BILLING_ENTITY_TYPE_INDICATOR02
	 * @model name="BillingEntityTypeIndicator02"
	 * @generated
	 * @ordered
	 */
	public static final int BILLING_ENTITY_TYPE_INDICATOR02_VALUE = 2;

	/**
	 * The '<em><b>Billing Entity Type Indicator03</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Billing Entity Type Indicator03</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #BILLING_ENTITY_TYPE_INDICATOR03
	 * @model name="BillingEntityTypeIndicator03"
	 * @generated
	 * @ordered
	 */
	public static final int BILLING_ENTITY_TYPE_INDICATOR03_VALUE = 3;

	/**
	 * An array of all the '<em><b>Billing Entity Type Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final BillingEntityTypeIndicator[] VALUES_ARRAY =
		new BillingEntityTypeIndicator[] {
			BILLING_ENTITY_TYPE_INDICATOR00,
			BILLING_ENTITY_TYPE_INDICATOR01,
			BILLING_ENTITY_TYPE_INDICATOR02,
			BILLING_ENTITY_TYPE_INDICATOR03,
		};

	/**
	 * A public read-only list of all the '<em><b>Billing Entity Type Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<BillingEntityTypeIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Billing Entity Type Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BillingEntityTypeIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BillingEntityTypeIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Billing Entity Type Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BillingEntityTypeIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			BillingEntityTypeIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Billing Entity Type Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static BillingEntityTypeIndicator get(int value) {
		switch (value) {
			case BILLING_ENTITY_TYPE_INDICATOR00_VALUE: return BILLING_ENTITY_TYPE_INDICATOR00;
			case BILLING_ENTITY_TYPE_INDICATOR01_VALUE: return BILLING_ENTITY_TYPE_INDICATOR01;
			case BILLING_ENTITY_TYPE_INDICATOR02_VALUE: return BILLING_ENTITY_TYPE_INDICATOR02;
			case BILLING_ENTITY_TYPE_INDICATOR03_VALUE: return BILLING_ENTITY_TYPE_INDICATOR03;
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
	private BillingEntityTypeIndicator(int value, String name, String literal) {
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
	
} //BillingEntityTypeIndicator
