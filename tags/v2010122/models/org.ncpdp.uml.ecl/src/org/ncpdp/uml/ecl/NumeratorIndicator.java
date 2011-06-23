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
 * A representation of the literals of the enumeration '<em><b>Numerator Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getNumeratorIndicator()
 * @model
 * @generated
 */
public enum NumeratorIndicator implements Enumerator {
	/**
	 * The '<em><b>Numerator Indicator N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERATOR_INDICATOR_N_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERATOR_INDICATOR_N(0, "NumeratorIndicatorN", "NumeratorIndicatorN"),

	/**
	 * The '<em><b>Numerator Indicator Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #NUMERATOR_INDICATOR_Y_VALUE
	 * @generated
	 * @ordered
	 */
	NUMERATOR_INDICATOR_Y(1, "NumeratorIndicatorY", "NumeratorIndicatorY");

	/**
	 * The '<em><b>Numerator Indicator N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numerator Indicator N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERATOR_INDICATOR_N
	 * @model name="NumeratorIndicatorN"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERATOR_INDICATOR_N_VALUE = 0;

	/**
	 * The '<em><b>Numerator Indicator Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Numerator Indicator Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #NUMERATOR_INDICATOR_Y
	 * @model name="NumeratorIndicatorY"
	 * @generated
	 * @ordered
	 */
	public static final int NUMERATOR_INDICATOR_Y_VALUE = 1;

	/**
	 * An array of all the '<em><b>Numerator Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final NumeratorIndicator[] VALUES_ARRAY =
		new NumeratorIndicator[] {
			NUMERATOR_INDICATOR_N,
			NUMERATOR_INDICATOR_Y,
		};

	/**
	 * A public read-only list of all the '<em><b>Numerator Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<NumeratorIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Numerator Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NumeratorIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumeratorIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Numerator Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NumeratorIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			NumeratorIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Numerator Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static NumeratorIndicator get(int value) {
		switch (value) {
			case NUMERATOR_INDICATOR_N_VALUE: return NUMERATOR_INDICATOR_N;
			case NUMERATOR_INDICATOR_Y_VALUE: return NUMERATOR_INDICATOR_Y;
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
	private NumeratorIndicator(int value, String name, String literal) {
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
	
} //NumeratorIndicator
