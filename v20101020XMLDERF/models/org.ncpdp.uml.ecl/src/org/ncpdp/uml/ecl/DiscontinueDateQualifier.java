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
 * A representation of the literals of the enumeration '<em><b>Discontinue Date Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getDiscontinueDateQualifier()
 * @model
 * @generated
 */
public enum DiscontinueDateQualifier implements Enumerator {
	/**
	 * The '<em><b>Discontinue Date Qualifier Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCONTINUE_DATE_QUALIFIER_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	DISCONTINUE_DATE_QUALIFIER_BLANK(0, "DiscontinueDateQualifierBlank", "DiscontinueDateQualifierBlank"),

	/**
	 * The '<em><b>Discontinue Date Qualifier A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCONTINUE_DATE_QUALIFIER_A_VALUE
	 * @generated
	 * @ordered
	 */
	DISCONTINUE_DATE_QUALIFIER_A(1, "DiscontinueDateQualifierA", "DiscontinueDateQualifierA"),

	/**
	 * The '<em><b>Discontinue Date Qualifier B</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISCONTINUE_DATE_QUALIFIER_B_VALUE
	 * @generated
	 * @ordered
	 */
	DISCONTINUE_DATE_QUALIFIER_B(2, "DiscontinueDateQualifierB", "DiscontinueDateQualifierB");

	/**
	 * The '<em><b>Discontinue Date Qualifier Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Discontinue Date Qualifier Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCONTINUE_DATE_QUALIFIER_BLANK
	 * @model name="DiscontinueDateQualifierBlank"
	 * @generated
	 * @ordered
	 */
	public static final int DISCONTINUE_DATE_QUALIFIER_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Discontinue Date Qualifier A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Discontinue Date Qualifier A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCONTINUE_DATE_QUALIFIER_A
	 * @model name="DiscontinueDateQualifierA"
	 * @generated
	 * @ordered
	 */
	public static final int DISCONTINUE_DATE_QUALIFIER_A_VALUE = 1;

	/**
	 * The '<em><b>Discontinue Date Qualifier B</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Discontinue Date Qualifier B</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISCONTINUE_DATE_QUALIFIER_B
	 * @model name="DiscontinueDateQualifierB"
	 * @generated
	 * @ordered
	 */
	public static final int DISCONTINUE_DATE_QUALIFIER_B_VALUE = 2;

	/**
	 * An array of all the '<em><b>Discontinue Date Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DiscontinueDateQualifier[] VALUES_ARRAY =
		new DiscontinueDateQualifier[] {
			DISCONTINUE_DATE_QUALIFIER_BLANK,
			DISCONTINUE_DATE_QUALIFIER_A,
			DISCONTINUE_DATE_QUALIFIER_B,
		};

	/**
	 * A public read-only list of all the '<em><b>Discontinue Date Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DiscontinueDateQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Discontinue Date Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiscontinueDateQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiscontinueDateQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Discontinue Date Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiscontinueDateQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DiscontinueDateQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Discontinue Date Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DiscontinueDateQualifier get(int value) {
		switch (value) {
			case DISCONTINUE_DATE_QUALIFIER_BLANK_VALUE: return DISCONTINUE_DATE_QUALIFIER_BLANK;
			case DISCONTINUE_DATE_QUALIFIER_A_VALUE: return DISCONTINUE_DATE_QUALIFIER_A;
			case DISCONTINUE_DATE_QUALIFIER_B_VALUE: return DISCONTINUE_DATE_QUALIFIER_B;
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
	private DiscontinueDateQualifier(int value, String name, String literal) {
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
	
} //DiscontinueDateQualifier
