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
 * A representation of the literals of the enumeration '<em><b>Drug Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getDrugType()
 * @model
 * @generated
 */
public enum DrugType implements Enumerator {
	/**
	 * The '<em><b>Drug Type0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE0_VALUE
	 * @generated
	 * @ordered
	 */
	DRUG_TYPE0(0, "DrugType0", "DrugType0"),

	/**
	 * The '<em><b>Drug Type1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE1_VALUE
	 * @generated
	 * @ordered
	 */
	DRUG_TYPE1(1, "DrugType1", "DrugType1"),

	/**
	 * The '<em><b>Drug Type2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE2_VALUE
	 * @generated
	 * @ordered
	 */
	DRUG_TYPE2(2, "DrugType2", "DrugType2"),

	/**
	 * The '<em><b>Drug Type3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE3_VALUE
	 * @generated
	 * @ordered
	 */
	DRUG_TYPE3(3, "DrugType3", "DrugType3"),

	/**
	 * The '<em><b>Drug Type4</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE4_VALUE
	 * @generated
	 * @ordered
	 */
	DRUG_TYPE4(4, "DrugType4", "DrugType4"),

	/**
	 * The '<em><b>Drug Type5</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE5_VALUE
	 * @generated
	 * @ordered
	 */
	DRUG_TYPE5(5, "DrugType5", "DrugType5");

	/**
	 * The '<em><b>Drug Type0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drug Type0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE0
	 * @model name="DrugType0"
	 * @generated
	 * @ordered
	 */
	public static final int DRUG_TYPE0_VALUE = 0;

	/**
	 * The '<em><b>Drug Type1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drug Type1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE1
	 * @model name="DrugType1"
	 * @generated
	 * @ordered
	 */
	public static final int DRUG_TYPE1_VALUE = 1;

	/**
	 * The '<em><b>Drug Type2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drug Type2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE2
	 * @model name="DrugType2"
	 * @generated
	 * @ordered
	 */
	public static final int DRUG_TYPE2_VALUE = 2;

	/**
	 * The '<em><b>Drug Type3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drug Type3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE3
	 * @model name="DrugType3"
	 * @generated
	 * @ordered
	 */
	public static final int DRUG_TYPE3_VALUE = 3;

	/**
	 * The '<em><b>Drug Type4</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drug Type4</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE4
	 * @model name="DrugType4"
	 * @generated
	 * @ordered
	 */
	public static final int DRUG_TYPE4_VALUE = 4;

	/**
	 * The '<em><b>Drug Type5</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drug Type5</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRUG_TYPE5
	 * @model name="DrugType5"
	 * @generated
	 * @ordered
	 */
	public static final int DRUG_TYPE5_VALUE = 5;

	/**
	 * An array of all the '<em><b>Drug Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DrugType[] VALUES_ARRAY =
		new DrugType[] {
			DRUG_TYPE0,
			DRUG_TYPE1,
			DRUG_TYPE2,
			DRUG_TYPE3,
			DRUG_TYPE4,
			DRUG_TYPE5,
		};

	/**
	 * A public read-only list of all the '<em><b>Drug Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DrugType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Drug Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DrugType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DrugType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Drug Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DrugType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DrugType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Drug Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DrugType get(int value) {
		switch (value) {
			case DRUG_TYPE0_VALUE: return DRUG_TYPE0;
			case DRUG_TYPE1_VALUE: return DRUG_TYPE1;
			case DRUG_TYPE2_VALUE: return DRUG_TYPE2;
			case DRUG_TYPE3_VALUE: return DRUG_TYPE3;
			case DRUG_TYPE4_VALUE: return DRUG_TYPE4;
			case DRUG_TYPE5_VALUE: return DRUG_TYPE5;
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
	private DrugType(int value, String name, String literal) {
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
	
} //DrugType
