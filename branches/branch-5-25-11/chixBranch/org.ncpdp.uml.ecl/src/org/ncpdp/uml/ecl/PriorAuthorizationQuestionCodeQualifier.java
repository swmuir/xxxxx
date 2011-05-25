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
 * A representation of the literals of the enumeration '<em><b>Prior Authorization Question Code Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPriorAuthorizationQuestionCodeQualifier()
 * @model
 * @generated
 */
public enum PriorAuthorizationQuestionCodeQualifier implements Enumerator {
	/**
	 * The '<em><b>Prior Authorization Question Code Qualifier LOINC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_LOINC_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_LOINC(0, "PriorAuthorizationQuestionCodeQualifierLOINC", "PriorAuthorizationQuestionCodeQualifierLOINC"),

	/**
	 * The '<em><b>Prior Authorization Question Code Qualifier Payer</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_PAYER_VALUE
	 * @generated
	 * @ordered
	 */
	PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_PAYER(1, "PriorAuthorizationQuestionCodeQualifierPayer", "PriorAuthorizationQuestionCodeQualifierPayer");

	/**
	 * The '<em><b>Prior Authorization Question Code Qualifier LOINC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Question Code Qualifier LOINC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_LOINC
	 * @model name="PriorAuthorizationQuestionCodeQualifierLOINC"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_LOINC_VALUE = 0;

	/**
	 * The '<em><b>Prior Authorization Question Code Qualifier Payer</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Prior Authorization Question Code Qualifier Payer</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_PAYER
	 * @model name="PriorAuthorizationQuestionCodeQualifierPayer"
	 * @generated
	 * @ordered
	 */
	public static final int PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_PAYER_VALUE = 1;

	/**
	 * An array of all the '<em><b>Prior Authorization Question Code Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PriorAuthorizationQuestionCodeQualifier[] VALUES_ARRAY =
		new PriorAuthorizationQuestionCodeQualifier[] {
			PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_LOINC,
			PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_PAYER,
		};

	/**
	 * A public read-only list of all the '<em><b>Prior Authorization Question Code Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PriorAuthorizationQuestionCodeQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Prior Authorization Question Code Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationQuestionCodeQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorAuthorizationQuestionCodeQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prior Authorization Question Code Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationQuestionCodeQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PriorAuthorizationQuestionCodeQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Prior Authorization Question Code Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PriorAuthorizationQuestionCodeQualifier get(int value) {
		switch (value) {
			case PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_LOINC_VALUE: return PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_LOINC;
			case PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_PAYER_VALUE: return PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER_PAYER;
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
	private PriorAuthorizationQuestionCodeQualifier(int value, String name, String literal) {
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
	
} //PriorAuthorizationQuestionCodeQualifier
