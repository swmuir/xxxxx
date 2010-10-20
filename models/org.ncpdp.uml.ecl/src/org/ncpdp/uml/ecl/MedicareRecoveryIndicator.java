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
 * A representation of the literals of the enumeration '<em><b>Medicare Recovery Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getMedicareRecoveryIndicator()
 * @model
 * @generated
 */
public enum MedicareRecoveryIndicator implements Enumerator {
	/**
	 * The '<em><b>Medicare Recovery Indicator Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICARE_RECOVERY_INDICATOR_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICARE_RECOVERY_INDICATOR_BLANK(0, "MedicareRecoveryIndicatorBlank", "MedicareRecoveryIndicatorBlank"),

	/**
	 * The '<em><b>Medicare Recovery Indicator0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICARE_RECOVERY_INDICATOR0_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICARE_RECOVERY_INDICATOR0(1, "MedicareRecoveryIndicator0", "MedicareRecoveryIndicator0"),

	/**
	 * The '<em><b>Medicare Recovery Indicator1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICARE_RECOVERY_INDICATOR1_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICARE_RECOVERY_INDICATOR1(2, "MedicareRecoveryIndicator1", "MedicareRecoveryIndicator1"),

	/**
	 * The '<em><b>Medicare Recovery Indicator2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MEDICARE_RECOVERY_INDICATOR2_VALUE
	 * @generated
	 * @ordered
	 */
	MEDICARE_RECOVERY_INDICATOR2(3, "MedicareRecoveryIndicator2", "MedicareRecoveryIndicator2");

	/**
	 * The '<em><b>Medicare Recovery Indicator Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicare Recovery Indicator Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICARE_RECOVERY_INDICATOR_BLANK
	 * @model name="MedicareRecoveryIndicatorBlank"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICARE_RECOVERY_INDICATOR_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Medicare Recovery Indicator0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicare Recovery Indicator0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICARE_RECOVERY_INDICATOR0
	 * @model name="MedicareRecoveryIndicator0"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICARE_RECOVERY_INDICATOR0_VALUE = 1;

	/**
	 * The '<em><b>Medicare Recovery Indicator1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicare Recovery Indicator1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICARE_RECOVERY_INDICATOR1
	 * @model name="MedicareRecoveryIndicator1"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICARE_RECOVERY_INDICATOR1_VALUE = 2;

	/**
	 * The '<em><b>Medicare Recovery Indicator2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Medicare Recovery Indicator2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MEDICARE_RECOVERY_INDICATOR2
	 * @model name="MedicareRecoveryIndicator2"
	 * @generated
	 * @ordered
	 */
	public static final int MEDICARE_RECOVERY_INDICATOR2_VALUE = 3;

	/**
	 * An array of all the '<em><b>Medicare Recovery Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MedicareRecoveryIndicator[] VALUES_ARRAY =
		new MedicareRecoveryIndicator[] {
			MEDICARE_RECOVERY_INDICATOR_BLANK,
			MEDICARE_RECOVERY_INDICATOR0,
			MEDICARE_RECOVERY_INDICATOR1,
			MEDICARE_RECOVERY_INDICATOR2,
		};

	/**
	 * A public read-only list of all the '<em><b>Medicare Recovery Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MedicareRecoveryIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Medicare Recovery Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MedicareRecoveryIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicareRecoveryIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medicare Recovery Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MedicareRecoveryIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MedicareRecoveryIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Medicare Recovery Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MedicareRecoveryIndicator get(int value) {
		switch (value) {
			case MEDICARE_RECOVERY_INDICATOR_BLANK_VALUE: return MEDICARE_RECOVERY_INDICATOR_BLANK;
			case MEDICARE_RECOVERY_INDICATOR0_VALUE: return MEDICARE_RECOVERY_INDICATOR0;
			case MEDICARE_RECOVERY_INDICATOR1_VALUE: return MEDICARE_RECOVERY_INDICATOR1;
			case MEDICARE_RECOVERY_INDICATOR2_VALUE: return MEDICARE_RECOVERY_INDICATOR2;
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
	private MedicareRecoveryIndicator(int value, String name, String literal) {
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
	
} //MedicareRecoveryIndicator
