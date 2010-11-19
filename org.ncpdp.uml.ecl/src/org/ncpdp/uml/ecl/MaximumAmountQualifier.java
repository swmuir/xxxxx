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
 * A representation of the literals of the enumeration '<em><b>Maximum Amount Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getMaximumAmountQualifier()
 * @model
 * @generated
 */
public enum MaximumAmountQualifier implements Enumerator {
	/**
	 * The '<em><b>Maximum Amount Qualifier DL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AMOUNT_QUALIFIER_DL_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM_AMOUNT_QUALIFIER_DL(0, "MaximumAmountQualifierDL", "MaximumAmountQualifierDL"),

	/**
	 * The '<em><b>Maximum Amount Qualifier DS</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AMOUNT_QUALIFIER_DS_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM_AMOUNT_QUALIFIER_DS(1, "MaximumAmountQualifierDS", "MaximumAmountQualifierDS"),

	/**
	 * The '<em><b>Maximum Amount Qualifier FL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AMOUNT_QUALIFIER_FL_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM_AMOUNT_QUALIFIER_FL(2, "MaximumAmountQualifierFL", "MaximumAmountQualifierFL"),

	/**
	 * The '<em><b>Maximum Amount Qualifier QY</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AMOUNT_QUALIFIER_QY_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM_AMOUNT_QUALIFIER_QY(3, "MaximumAmountQualifierQY", "MaximumAmountQualifierQY");

	/**
	 * The '<em><b>Maximum Amount Qualifier DL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maximum Amount Qualifier DL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AMOUNT_QUALIFIER_DL
	 * @model name="MaximumAmountQualifierDL"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_AMOUNT_QUALIFIER_DL_VALUE = 0;

	/**
	 * The '<em><b>Maximum Amount Qualifier DS</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maximum Amount Qualifier DS</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AMOUNT_QUALIFIER_DS
	 * @model name="MaximumAmountQualifierDS"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_AMOUNT_QUALIFIER_DS_VALUE = 1;

	/**
	 * The '<em><b>Maximum Amount Qualifier FL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maximum Amount Qualifier FL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AMOUNT_QUALIFIER_FL
	 * @model name="MaximumAmountQualifierFL"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_AMOUNT_QUALIFIER_FL_VALUE = 2;

	/**
	 * The '<em><b>Maximum Amount Qualifier QY</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maximum Amount Qualifier QY</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AMOUNT_QUALIFIER_QY
	 * @model name="MaximumAmountQualifierQY"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_AMOUNT_QUALIFIER_QY_VALUE = 3;

	/**
	 * An array of all the '<em><b>Maximum Amount Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MaximumAmountQualifier[] VALUES_ARRAY =
		new MaximumAmountQualifier[] {
			MAXIMUM_AMOUNT_QUALIFIER_DL,
			MAXIMUM_AMOUNT_QUALIFIER_DS,
			MAXIMUM_AMOUNT_QUALIFIER_FL,
			MAXIMUM_AMOUNT_QUALIFIER_QY,
		};

	/**
	 * A public read-only list of all the '<em><b>Maximum Amount Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MaximumAmountQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Maximum Amount Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaximumAmountQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MaximumAmountQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Maximum Amount Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaximumAmountQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MaximumAmountQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Maximum Amount Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaximumAmountQualifier get(int value) {
		switch (value) {
			case MAXIMUM_AMOUNT_QUALIFIER_DL_VALUE: return MAXIMUM_AMOUNT_QUALIFIER_DL;
			case MAXIMUM_AMOUNT_QUALIFIER_DS_VALUE: return MAXIMUM_AMOUNT_QUALIFIER_DS;
			case MAXIMUM_AMOUNT_QUALIFIER_FL_VALUE: return MAXIMUM_AMOUNT_QUALIFIER_FL;
			case MAXIMUM_AMOUNT_QUALIFIER_QY_VALUE: return MAXIMUM_AMOUNT_QUALIFIER_QY;
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
	private MaximumAmountQualifier(int value, String name, String literal) {
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
	
} //MaximumAmountQualifier
