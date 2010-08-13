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
 * A representation of the literals of the enumeration '<em><b>Fill Number Calculated</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getFillNumberCalculated()
 * @model
 * @generated
 */
public enum FillNumberCalculated implements Enumerator {
	/**
	 * The '<em><b>Fill Number Calculated00</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_NUMBER_CALCULATED00_VALUE
	 * @generated
	 * @ordered
	 */
	FILL_NUMBER_CALCULATED00(0, "FillNumberCalculated00", "FillNumberCalculated00"),

	/**
	 * The '<em><b>Fill Number Calculated0199</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #FILL_NUMBER_CALCULATED0199_VALUE
	 * @generated
	 * @ordered
	 */
	FILL_NUMBER_CALCULATED0199(1, "FillNumberCalculated0199", "FillNumberCalculated0199");

	/**
	 * The '<em><b>Fill Number Calculated00</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fill Number Calculated00</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL_NUMBER_CALCULATED00
	 * @model name="FillNumberCalculated00"
	 * @generated
	 * @ordered
	 */
	public static final int FILL_NUMBER_CALCULATED00_VALUE = 0;

	/**
	 * The '<em><b>Fill Number Calculated0199</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Fill Number Calculated0199</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #FILL_NUMBER_CALCULATED0199
	 * @model name="FillNumberCalculated0199"
	 * @generated
	 * @ordered
	 */
	public static final int FILL_NUMBER_CALCULATED0199_VALUE = 1;

	/**
	 * An array of all the '<em><b>Fill Number Calculated</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FillNumberCalculated[] VALUES_ARRAY =
		new FillNumberCalculated[] {
			FILL_NUMBER_CALCULATED00,
			FILL_NUMBER_CALCULATED0199,
		};

	/**
	 * A public read-only list of all the '<em><b>Fill Number Calculated</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FillNumberCalculated> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fill Number Calculated</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FillNumberCalculated get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FillNumberCalculated result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fill Number Calculated</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FillNumberCalculated getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FillNumberCalculated result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fill Number Calculated</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FillNumberCalculated get(int value) {
		switch (value) {
			case FILL_NUMBER_CALCULATED00_VALUE: return FILL_NUMBER_CALCULATED00;
			case FILL_NUMBER_CALCULATED0199_VALUE: return FILL_NUMBER_CALCULATED0199;
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
	private FillNumberCalculated(int value, String name, String literal) {
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
	
} //FillNumberCalculated
