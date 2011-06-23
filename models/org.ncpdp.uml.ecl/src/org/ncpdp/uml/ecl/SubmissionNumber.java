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
 * A representation of the literals of the enumeration '<em><b>Submission Number</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getSubmissionNumber()
 * @model
 * @generated
 */
public enum SubmissionNumber implements Enumerator {
	/**
	 * The '<em><b>Submission Number Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMISSION_NUMBER_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMISSION_NUMBER_BLANK(0, "SubmissionNumberBlank", "SubmissionNumberBlank"),

	/**
	 * The '<em><b>Submission Number00</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMISSION_NUMBER00_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMISSION_NUMBER00(1, "SubmissionNumber00", "SubmissionNumber00"),

	/**
	 * The '<em><b>Submission Number01</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMISSION_NUMBER01_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMISSION_NUMBER01(2, "SubmissionNumber01", "SubmissionNumber01"),

	/**
	 * The '<em><b>Submission Number02</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMISSION_NUMBER02_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMISSION_NUMBER02(3, "SubmissionNumber02", "SubmissionNumber02"),

	/**
	 * The '<em><b>Submission Number0399</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SUBMISSION_NUMBER0399_VALUE
	 * @generated
	 * @ordered
	 */
	SUBMISSION_NUMBER0399(4, "SubmissionNumber0399", "SubmissionNumber0399");

	/**
	 * The '<em><b>Submission Number Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Submission Number Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMISSION_NUMBER_BLANK
	 * @model name="SubmissionNumberBlank"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMISSION_NUMBER_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Submission Number00</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Submission Number00</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMISSION_NUMBER00
	 * @model name="SubmissionNumber00"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMISSION_NUMBER00_VALUE = 1;

	/**
	 * The '<em><b>Submission Number01</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Submission Number01</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMISSION_NUMBER01
	 * @model name="SubmissionNumber01"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMISSION_NUMBER01_VALUE = 2;

	/**
	 * The '<em><b>Submission Number02</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Submission Number02</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMISSION_NUMBER02
	 * @model name="SubmissionNumber02"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMISSION_NUMBER02_VALUE = 3;

	/**
	 * The '<em><b>Submission Number0399</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Submission Number0399</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SUBMISSION_NUMBER0399
	 * @model name="SubmissionNumber0399"
	 * @generated
	 * @ordered
	 */
	public static final int SUBMISSION_NUMBER0399_VALUE = 4;

	/**
	 * An array of all the '<em><b>Submission Number</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SubmissionNumber[] VALUES_ARRAY =
		new SubmissionNumber[] {
			SUBMISSION_NUMBER_BLANK,
			SUBMISSION_NUMBER00,
			SUBMISSION_NUMBER01,
			SUBMISSION_NUMBER02,
			SUBMISSION_NUMBER0399,
		};

	/**
	 * A public read-only list of all the '<em><b>Submission Number</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SubmissionNumber> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Submission Number</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubmissionNumber get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubmissionNumber result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Submission Number</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubmissionNumber getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SubmissionNumber result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Submission Number</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SubmissionNumber get(int value) {
		switch (value) {
			case SUBMISSION_NUMBER_BLANK_VALUE: return SUBMISSION_NUMBER_BLANK;
			case SUBMISSION_NUMBER00_VALUE: return SUBMISSION_NUMBER00;
			case SUBMISSION_NUMBER01_VALUE: return SUBMISSION_NUMBER01;
			case SUBMISSION_NUMBER02_VALUE: return SUBMISSION_NUMBER02;
			case SUBMISSION_NUMBER0399_VALUE: return SUBMISSION_NUMBER0399;
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
	private SubmissionNumber(int value, String name, String literal) {
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
	
} //SubmissionNumber
