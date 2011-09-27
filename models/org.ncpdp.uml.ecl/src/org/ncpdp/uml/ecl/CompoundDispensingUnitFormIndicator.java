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
 * A representation of the literals of the enumeration '<em><b>Compound Dispensing Unit Form Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getCompoundDispensingUnitFormIndicator()
 * @model
 * @generated
 */
public enum CompoundDispensingUnitFormIndicator implements Enumerator {
	/**
	 * The '<em><b>Compound Dispensing Unit Form Indicator1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOUND_DISPENSING_UNIT_FORM_INDICATOR1_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOUND_DISPENSING_UNIT_FORM_INDICATOR1(0, "CompoundDispensingUnitFormIndicator1", "CompoundDispensingUnitFormIndicator1"),

	/**
	 * The '<em><b>Compound Dispensing Unit Form Indicator2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOUND_DISPENSING_UNIT_FORM_INDICATOR2_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOUND_DISPENSING_UNIT_FORM_INDICATOR2(1, "CompoundDispensingUnitFormIndicator2", "CompoundDispensingUnitFormIndicator2"),

	/**
	 * The '<em><b>Compound Dispensing Unit Form Indicator3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #COMPOUND_DISPENSING_UNIT_FORM_INDICATOR3_VALUE
	 * @generated
	 * @ordered
	 */
	COMPOUND_DISPENSING_UNIT_FORM_INDICATOR3(2, "CompoundDispensingUnitFormIndicator3", "CompoundDispensingUnitFormIndicator3");

	/**
	 * The '<em><b>Compound Dispensing Unit Form Indicator1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compound Dispensing Unit Form Indicator1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOUND_DISPENSING_UNIT_FORM_INDICATOR1
	 * @model name="CompoundDispensingUnitFormIndicator1"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOUND_DISPENSING_UNIT_FORM_INDICATOR1_VALUE = 0;

	/**
	 * The '<em><b>Compound Dispensing Unit Form Indicator2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compound Dispensing Unit Form Indicator2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOUND_DISPENSING_UNIT_FORM_INDICATOR2
	 * @model name="CompoundDispensingUnitFormIndicator2"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOUND_DISPENSING_UNIT_FORM_INDICATOR2_VALUE = 1;

	/**
	 * The '<em><b>Compound Dispensing Unit Form Indicator3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Compound Dispensing Unit Form Indicator3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #COMPOUND_DISPENSING_UNIT_FORM_INDICATOR3
	 * @model name="CompoundDispensingUnitFormIndicator3"
	 * @generated
	 * @ordered
	 */
	public static final int COMPOUND_DISPENSING_UNIT_FORM_INDICATOR3_VALUE = 2;

	/**
	 * An array of all the '<em><b>Compound Dispensing Unit Form Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CompoundDispensingUnitFormIndicator[] VALUES_ARRAY =
		new CompoundDispensingUnitFormIndicator[] {
			COMPOUND_DISPENSING_UNIT_FORM_INDICATOR1,
			COMPOUND_DISPENSING_UNIT_FORM_INDICATOR2,
			COMPOUND_DISPENSING_UNIT_FORM_INDICATOR3,
		};

	/**
	 * A public read-only list of all the '<em><b>Compound Dispensing Unit Form Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CompoundDispensingUnitFormIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Compound Dispensing Unit Form Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompoundDispensingUnitFormIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompoundDispensingUnitFormIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compound Dispensing Unit Form Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompoundDispensingUnitFormIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CompoundDispensingUnitFormIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Compound Dispensing Unit Form Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CompoundDispensingUnitFormIndicator get(int value) {
		switch (value) {
			case COMPOUND_DISPENSING_UNIT_FORM_INDICATOR1_VALUE: return COMPOUND_DISPENSING_UNIT_FORM_INDICATOR1;
			case COMPOUND_DISPENSING_UNIT_FORM_INDICATOR2_VALUE: return COMPOUND_DISPENSING_UNIT_FORM_INDICATOR2;
			case COMPOUND_DISPENSING_UNIT_FORM_INDICATOR3_VALUE: return COMPOUND_DISPENSING_UNIT_FORM_INDICATOR3;
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
	private CompoundDispensingUnitFormIndicator(int value, String name, String literal) {
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
	
} //CompoundDispensingUnitFormIndicator
