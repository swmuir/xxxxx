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
 * A representation of the literals of the enumeration '<em><b>Transfer Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getTransferType()
 * @model
 * @generated
 */
public enum TransferType implements Enumerator {
	/**
	 * The '<em><b>Transfer Type0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_TYPE0_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFER_TYPE0(0, "TransferType0", "TransferType0"),

	/**
	 * The '<em><b>Transfer Type1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_TYPE1_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFER_TYPE1(1, "TransferType1", "TransferType1"),

	/**
	 * The '<em><b>Transfer Type2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_TYPE2_VALUE
	 * @generated
	 * @ordered
	 */
	TRANSFER_TYPE2(2, "TransferType2", "TransferType2");

	/**
	 * The '<em><b>Transfer Type0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transfer Type0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_TYPE0
	 * @model name="TransferType0"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFER_TYPE0_VALUE = 0;

	/**
	 * The '<em><b>Transfer Type1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transfer Type1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_TYPE1
	 * @model name="TransferType1"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFER_TYPE1_VALUE = 1;

	/**
	 * The '<em><b>Transfer Type2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Transfer Type2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #TRANSFER_TYPE2
	 * @model name="TransferType2"
	 * @generated
	 * @ordered
	 */
	public static final int TRANSFER_TYPE2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Transfer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final TransferType[] VALUES_ARRAY =
		new TransferType[] {
			TRANSFER_TYPE0,
			TRANSFER_TYPE1,
			TRANSFER_TYPE2,
		};

	/**
	 * A public read-only list of all the '<em><b>Transfer Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<TransferType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Transfer Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransferType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransferType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transfer Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransferType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			TransferType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Transfer Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TransferType get(int value) {
		switch (value) {
			case TRANSFER_TYPE0_VALUE: return TRANSFER_TYPE0;
			case TRANSFER_TYPE1_VALUE: return TRANSFER_TYPE1;
			case TRANSFER_TYPE2_VALUE: return TRANSFER_TYPE2;
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
	private TransferType(int value, String name, String literal) {
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
	
} //TransferType
