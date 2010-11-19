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
 * A representation of the literals of the enumeration '<em><b>Drug Qualifier Step Drug</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getDrugQualifierStepDrug()
 * @model
 * @generated
 */
public enum DrugQualifierStepDrug implements Enumerator {
	/**
	 * The '<em><b>Drug Qualifier Step Drug SM</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUG_QUALIFIER_STEP_DRUG_SM_VALUE
	 * @generated
	 * @ordered
	 */
	DRUG_QUALIFIER_STEP_DRUG_SM(0, "DrugQualifierStepDrugSM", "DrugQualifierStepDrugSM"),

	/**
	 * The '<em><b>Drug Qualifier Step Drug PC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DRUG_QUALIFIER_STEP_DRUG_PC_VALUE
	 * @generated
	 * @ordered
	 */
	DRUG_QUALIFIER_STEP_DRUG_PC(1, "DrugQualifierStepDrugPC", "DrugQualifierStepDrugPC");

	/**
	 * The '<em><b>Drug Qualifier Step Drug SM</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drug Qualifier Step Drug SM</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRUG_QUALIFIER_STEP_DRUG_SM
	 * @model name="DrugQualifierStepDrugSM"
	 * @generated
	 * @ordered
	 */
	public static final int DRUG_QUALIFIER_STEP_DRUG_SM_VALUE = 0;

	/**
	 * The '<em><b>Drug Qualifier Step Drug PC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Drug Qualifier Step Drug PC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DRUG_QUALIFIER_STEP_DRUG_PC
	 * @model name="DrugQualifierStepDrugPC"
	 * @generated
	 * @ordered
	 */
	public static final int DRUG_QUALIFIER_STEP_DRUG_PC_VALUE = 1;

	/**
	 * An array of all the '<em><b>Drug Qualifier Step Drug</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DrugQualifierStepDrug[] VALUES_ARRAY =
		new DrugQualifierStepDrug[] {
			DRUG_QUALIFIER_STEP_DRUG_SM,
			DRUG_QUALIFIER_STEP_DRUG_PC,
		};

	/**
	 * A public read-only list of all the '<em><b>Drug Qualifier Step Drug</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DrugQualifierStepDrug> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Drug Qualifier Step Drug</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DrugQualifierStepDrug get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DrugQualifierStepDrug result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Drug Qualifier Step Drug</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DrugQualifierStepDrug getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DrugQualifierStepDrug result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Drug Qualifier Step Drug</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DrugQualifierStepDrug get(int value) {
		switch (value) {
			case DRUG_QUALIFIER_STEP_DRUG_SM_VALUE: return DRUG_QUALIFIER_STEP_DRUG_SM;
			case DRUG_QUALIFIER_STEP_DRUG_PC_VALUE: return DRUG_QUALIFIER_STEP_DRUG_PC;
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
	private DrugQualifierStepDrug(int value, String name, String literal) {
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
	
} //DrugQualifierStepDrug
