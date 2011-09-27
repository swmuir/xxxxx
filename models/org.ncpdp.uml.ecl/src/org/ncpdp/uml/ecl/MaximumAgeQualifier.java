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
 * A representation of the literals of the enumeration '<em><b>Maximum Age Qualifier</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getMaximumAgeQualifier()
 * @model
 * @generated
 */
public enum MaximumAgeQualifier implements Enumerator {
	/**
	 * The '<em><b>Maximum Age Qualifier D</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AGE_QUALIFIER_D_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM_AGE_QUALIFIER_D(0, "MaximumAgeQualifierD", "MaximumAgeQualifierD"),

	/**
	 * The '<em><b>Maximum Age Qualifier Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AGE_QUALIFIER_Y_VALUE
	 * @generated
	 * @ordered
	 */
	MAXIMUM_AGE_QUALIFIER_Y(1, "MaximumAgeQualifierY", "MaximumAgeQualifierY");

	/**
	 * The '<em><b>Maximum Age Qualifier D</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maximum Age Qualifier D</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AGE_QUALIFIER_D
	 * @model name="MaximumAgeQualifierD"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_AGE_QUALIFIER_D_VALUE = 0;

	/**
	 * The '<em><b>Maximum Age Qualifier Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Maximum Age Qualifier Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #MAXIMUM_AGE_QUALIFIER_Y
	 * @model name="MaximumAgeQualifierY"
	 * @generated
	 * @ordered
	 */
	public static final int MAXIMUM_AGE_QUALIFIER_Y_VALUE = 1;

	/**
	 * An array of all the '<em><b>Maximum Age Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MaximumAgeQualifier[] VALUES_ARRAY =
		new MaximumAgeQualifier[] {
			MAXIMUM_AGE_QUALIFIER_D,
			MAXIMUM_AGE_QUALIFIER_Y,
		};

	/**
	 * A public read-only list of all the '<em><b>Maximum Age Qualifier</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MaximumAgeQualifier> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Maximum Age Qualifier</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaximumAgeQualifier get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MaximumAgeQualifier result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Maximum Age Qualifier</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaximumAgeQualifier getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MaximumAgeQualifier result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Maximum Age Qualifier</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MaximumAgeQualifier get(int value) {
		switch (value) {
			case MAXIMUM_AGE_QUALIFIER_D_VALUE: return MAXIMUM_AGE_QUALIFIER_D;
			case MAXIMUM_AGE_QUALIFIER_Y_VALUE: return MAXIMUM_AGE_QUALIFIER_Y;
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
	private MaximumAgeQualifier(int value, String name, String literal) {
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
	
} //MaximumAgeQualifier
