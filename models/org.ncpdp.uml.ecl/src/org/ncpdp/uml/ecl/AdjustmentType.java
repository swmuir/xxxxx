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
 * A representation of the literals of the enumeration '<em><b>Adjustment Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getAdjustmentType()
 * @model
 * @generated
 */
public enum AdjustmentType implements Enumerator {
	/**
	 * The '<em><b>Adjustment Type1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJUSTMENT_TYPE1_VALUE
	 * @generated
	 * @ordered
	 */
	ADJUSTMENT_TYPE1(0, "AdjustmentType1", "AdjustmentType1"),

	/**
	 * The '<em><b>Adjustment Type2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADJUSTMENT_TYPE2_VALUE
	 * @generated
	 * @ordered
	 */
	ADJUSTMENT_TYPE2(1, "AdjustmentType2", "AdjustmentType2");

	/**
	 * The '<em><b>Adjustment Type1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adjustment Type1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADJUSTMENT_TYPE1
	 * @model name="AdjustmentType1"
	 * @generated
	 * @ordered
	 */
	public static final int ADJUSTMENT_TYPE1_VALUE = 0;

	/**
	 * The '<em><b>Adjustment Type2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Adjustment Type2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADJUSTMENT_TYPE2
	 * @model name="AdjustmentType2"
	 * @generated
	 * @ordered
	 */
	public static final int ADJUSTMENT_TYPE2_VALUE = 1;

	/**
	 * An array of all the '<em><b>Adjustment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdjustmentType[] VALUES_ARRAY =
		new AdjustmentType[] {
			ADJUSTMENT_TYPE1,
			ADJUSTMENT_TYPE2,
		};

	/**
	 * A public read-only list of all the '<em><b>Adjustment Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdjustmentType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Adjustment Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdjustmentType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdjustmentType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adjustment Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdjustmentType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdjustmentType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Adjustment Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdjustmentType get(int value) {
		switch (value) {
			case ADJUSTMENT_TYPE1_VALUE: return ADJUSTMENT_TYPE1;
			case ADJUSTMENT_TYPE2_VALUE: return ADJUSTMENT_TYPE2;
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
	private AdjustmentType(int value, String name, String literal) {
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
	
} //AdjustmentType
