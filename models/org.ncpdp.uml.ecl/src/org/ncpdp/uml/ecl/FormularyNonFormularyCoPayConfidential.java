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
 * A representation of the literals of the enumeration '<em><b>Formulary Non Formulary Co Pay Confidential</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getFormularyNonFormularyCoPayConfidential()
 * @model
 * @generated
 */
public enum FormularyNonFormularyCoPayConfidential implements Enumerator {
	/**
	 * The '<em><b>Formulary Non Formulary Co Pay Confidential N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_N_VALUE
	 * @generated
	 * @ordered
	 */
	FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_N(0, "FormularyNonFormularyCoPayConfidentialN", "FormularyNonFormularyCoPayConfidentialN"),

	/**
	 * The '<em><b>Formulary Non Formulary Co Pay Confidential Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_Y_VALUE
	 * @generated
	 * @ordered
	 */
	FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_Y(1, "FormularyNonFormularyCoPayConfidentialY", "FormularyNonFormularyCoPayConfidentialY");

	/**
	 * The '<em><b>Formulary Non Formulary Co Pay Confidential N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Formulary Non Formulary Co Pay Confidential N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_N
	 * @model name="FormularyNonFormularyCoPayConfidentialN"
	 * @generated
	 * @ordered
	 */
	public static final int FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_N_VALUE = 0;

	/**
	 * The '<em><b>Formulary Non Formulary Co Pay Confidential Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Formulary Non Formulary Co Pay Confidential Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_Y
	 * @model name="FormularyNonFormularyCoPayConfidentialY"
	 * @generated
	 * @ordered
	 */
	public static final int FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_Y_VALUE = 1;

	/**
	 * An array of all the '<em><b>Formulary Non Formulary Co Pay Confidential</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FormularyNonFormularyCoPayConfidential[] VALUES_ARRAY =
		new FormularyNonFormularyCoPayConfidential[] {
			FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_N,
			FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_Y,
		};

	/**
	 * A public read-only list of all the '<em><b>Formulary Non Formulary Co Pay Confidential</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FormularyNonFormularyCoPayConfidential> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Formulary Non Formulary Co Pay Confidential</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormularyNonFormularyCoPayConfidential get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormularyNonFormularyCoPayConfidential result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Formulary Non Formulary Co Pay Confidential</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormularyNonFormularyCoPayConfidential getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FormularyNonFormularyCoPayConfidential result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Formulary Non Formulary Co Pay Confidential</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FormularyNonFormularyCoPayConfidential get(int value) {
		switch (value) {
			case FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_N_VALUE: return FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_N;
			case FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_Y_VALUE: return FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL_Y;
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
	private FormularyNonFormularyCoPayConfidential(int value, String name, String literal) {
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
	
} //FormularyNonFormularyCoPayConfidential
