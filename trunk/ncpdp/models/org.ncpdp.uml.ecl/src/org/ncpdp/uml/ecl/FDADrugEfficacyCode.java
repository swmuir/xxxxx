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
 * A representation of the literals of the enumeration '<em><b>FDA Drug Efficacy Code</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getFDADrugEfficacyCode()
 * @model
 * @generated
 */
public enum FDADrugEfficacyCode implements Enumerator {
	/**
	 * The '<em><b>FDA Drug Efficacy Code Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FDA_DRUG_EFFICACY_CODE_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	FDA_DRUG_EFFICACY_CODE_BLANK(0, "FDADrugEfficacyCodeBlank", "FDADrugEfficacyCodeBlank"),

	/**
	 * The '<em><b>FDA Drug Efficacy Code0</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FDA_DRUG_EFFICACY_CODE0_VALUE
	 * @generated
	 * @ordered
	 */
	FDA_DRUG_EFFICACY_CODE0(1, "FDADrugEfficacyCode0", "FDADrugEfficacyCode0"),

	/**
	 * The '<em><b>FDA Drug Efficacy Code1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FDA_DRUG_EFFICACY_CODE1_VALUE
	 * @generated
	 * @ordered
	 */
	FDA_DRUG_EFFICACY_CODE1(2, "FDADrugEfficacyCode1", "FDADrugEfficacyCode1");

	/**
	 * The '<em><b>FDA Drug Efficacy Code Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FDA Drug Efficacy Code Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FDA_DRUG_EFFICACY_CODE_BLANK
	 * @model name="FDADrugEfficacyCodeBlank"
	 * @generated
	 * @ordered
	 */
	public static final int FDA_DRUG_EFFICACY_CODE_BLANK_VALUE = 0;

	/**
	 * The '<em><b>FDA Drug Efficacy Code0</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FDA Drug Efficacy Code0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FDA_DRUG_EFFICACY_CODE0
	 * @model name="FDADrugEfficacyCode0"
	 * @generated
	 * @ordered
	 */
	public static final int FDA_DRUG_EFFICACY_CODE0_VALUE = 1;

	/**
	 * The '<em><b>FDA Drug Efficacy Code1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>FDA Drug Efficacy Code1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FDA_DRUG_EFFICACY_CODE1
	 * @model name="FDADrugEfficacyCode1"
	 * @generated
	 * @ordered
	 */
	public static final int FDA_DRUG_EFFICACY_CODE1_VALUE = 2;

	/**
	 * An array of all the '<em><b>FDA Drug Efficacy Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FDADrugEfficacyCode[] VALUES_ARRAY =
		new FDADrugEfficacyCode[] {
			FDA_DRUG_EFFICACY_CODE_BLANK,
			FDA_DRUG_EFFICACY_CODE0,
			FDA_DRUG_EFFICACY_CODE1,
		};

	/**
	 * A public read-only list of all the '<em><b>FDA Drug Efficacy Code</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FDADrugEfficacyCode> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FDA Drug Efficacy Code</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FDADrugEfficacyCode get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FDADrugEfficacyCode result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FDA Drug Efficacy Code</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FDADrugEfficacyCode getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FDADrugEfficacyCode result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FDA Drug Efficacy Code</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FDADrugEfficacyCode get(int value) {
		switch (value) {
			case FDA_DRUG_EFFICACY_CODE_BLANK_VALUE: return FDA_DRUG_EFFICACY_CODE_BLANK;
			case FDA_DRUG_EFFICACY_CODE0_VALUE: return FDA_DRUG_EFFICACY_CODE0;
			case FDA_DRUG_EFFICACY_CODE1_VALUE: return FDA_DRUG_EFFICACY_CODE1;
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
	private FDADrugEfficacyCode(int value, String name, String literal) {
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
	
} //FDADrugEfficacyCode
