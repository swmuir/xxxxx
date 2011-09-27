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
 * A representation of the literals of the enumeration '<em><b>Prescription Delivery Method</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPrescriptionDeliveryMethod()
 * @model
 * @generated
 */
public enum PrescriptionDeliveryMethod implements Enumerator {
	/**
	 * The '<em><b>Prescription Delivery Method1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_DELIVERY_METHOD1_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION_DELIVERY_METHOD1(0, "PrescriptionDeliveryMethod1", "PrescriptionDeliveryMethod1"),

	/**
	 * The '<em><b>Prescription Delivery Method2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_DELIVERY_METHOD2_VALUE
	 * @generated
	 * @ordered
	 */
	PRESCRIPTION_DELIVERY_METHOD2(1, "PrescriptionDeliveryMethod2", "PrescriptionDeliveryMethod2");

	/**
	 * The '<em><b>Prescription Delivery Method1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescription Delivery Method1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_DELIVERY_METHOD1
	 * @model name="PrescriptionDeliveryMethod1"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_DELIVERY_METHOD1_VALUE = 0;

	/**
	 * The '<em><b>Prescription Delivery Method2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prescription Delivery Method2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRESCRIPTION_DELIVERY_METHOD2
	 * @model name="PrescriptionDeliveryMethod2"
	 * @generated
	 * @ordered
	 */
	public static final int PRESCRIPTION_DELIVERY_METHOD2_VALUE = 1;

	/**
	 * An array of all the '<em><b>Prescription Delivery Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PrescriptionDeliveryMethod[] VALUES_ARRAY =
		new PrescriptionDeliveryMethod[] {
			PRESCRIPTION_DELIVERY_METHOD1,
			PRESCRIPTION_DELIVERY_METHOD2,
		};

	/**
	 * A public read-only list of all the '<em><b>Prescription Delivery Method</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PrescriptionDeliveryMethod> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Prescription Delivery Method</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriptionDeliveryMethod get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrescriptionDeliveryMethod result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prescription Delivery Method</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriptionDeliveryMethod getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PrescriptionDeliveryMethod result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prescription Delivery Method</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PrescriptionDeliveryMethod get(int value) {
		switch (value) {
			case PRESCRIPTION_DELIVERY_METHOD1_VALUE: return PRESCRIPTION_DELIVERY_METHOD1;
			case PRESCRIPTION_DELIVERY_METHOD2_VALUE: return PRESCRIPTION_DELIVERY_METHOD2;
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
	private PrescriptionDeliveryMethod(int value, String name, String literal) {
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
	
} //PrescriptionDeliveryMethod
