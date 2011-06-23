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
 * A representation of the literals of the enumeration '<em><b>Workers Compensation Property And Casualty Indicator</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getWorkersCompensationPropertyAndCasualtyIndicator()
 * @model
 * @generated
 */
public enum WorkersCompensationPropertyAndCasualtyIndicator implements Enumerator {
	/**
	 * The '<em><b>Workers Compensation Property And Casualty Indicator WC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_WC_VALUE
	 * @generated
	 * @ordered
	 */
	WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_WC(0, "WorkersCompensationPropertyAndCasualtyIndicatorWC", "WorkersCompensationPropertyAndCasualtyIndicatorWC"),

	/**
	 * The '<em><b>Workers Compensation Property And Casualty Indicator PC</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_PC_VALUE
	 * @generated
	 * @ordered
	 */
	WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_PC(1, "WorkersCompensationPropertyAndCasualtyIndicatorPC", "WorkersCompensationPropertyAndCasualtyIndicatorPC");

	/**
	 * The '<em><b>Workers Compensation Property And Casualty Indicator WC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Workers Compensation Property And Casualty Indicator WC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_WC
	 * @model name="WorkersCompensationPropertyAndCasualtyIndicatorWC"
	 * @generated
	 * @ordered
	 */
	public static final int WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_WC_VALUE = 0;

	/**
	 * The '<em><b>Workers Compensation Property And Casualty Indicator PC</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Workers Compensation Property And Casualty Indicator PC</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_PC
	 * @model name="WorkersCompensationPropertyAndCasualtyIndicatorPC"
	 * @generated
	 * @ordered
	 */
	public static final int WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_PC_VALUE = 1;

	/**
	 * An array of all the '<em><b>Workers Compensation Property And Casualty Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final WorkersCompensationPropertyAndCasualtyIndicator[] VALUES_ARRAY =
		new WorkersCompensationPropertyAndCasualtyIndicator[] {
			WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_WC,
			WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_PC,
		};

	/**
	 * A public read-only list of all the '<em><b>Workers Compensation Property And Casualty Indicator</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<WorkersCompensationPropertyAndCasualtyIndicator> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Workers Compensation Property And Casualty Indicator</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkersCompensationPropertyAndCasualtyIndicator get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkersCompensationPropertyAndCasualtyIndicator result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Workers Compensation Property And Casualty Indicator</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkersCompensationPropertyAndCasualtyIndicator getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			WorkersCompensationPropertyAndCasualtyIndicator result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Workers Compensation Property And Casualty Indicator</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static WorkersCompensationPropertyAndCasualtyIndicator get(int value) {
		switch (value) {
			case WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_WC_VALUE: return WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_WC;
			case WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_PC_VALUE: return WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR_PC;
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
	private WorkersCompensationPropertyAndCasualtyIndicator(int value, String name, String literal) {
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
	
} //WorkersCompensationPropertyAndCasualtyIndicator
