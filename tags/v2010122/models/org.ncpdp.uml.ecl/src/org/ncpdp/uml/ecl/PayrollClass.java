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
 * A representation of the literals of the enumeration '<em><b>Payroll Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getPayrollClass()
 * @model
 * @generated
 */
public enum PayrollClass implements Enumerator {
	/**
	 * The '<em><b>Payroll Class Blank</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYROLL_CLASS_BLANK_VALUE
	 * @generated
	 * @ordered
	 */
	PAYROLL_CLASS_BLANK(0, "PayrollClassBlank", "PayrollClassBlank"),

	/**
	 * The '<em><b>Payroll Class1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYROLL_CLASS1_VALUE
	 * @generated
	 * @ordered
	 */
	PAYROLL_CLASS1(1, "PayrollClass1", "PayrollClass1"),

	/**
	 * The '<em><b>Payroll Class2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #PAYROLL_CLASS2_VALUE
	 * @generated
	 * @ordered
	 */
	PAYROLL_CLASS2(2, "PayrollClass2", "PayrollClass2");

	/**
	 * The '<em><b>Payroll Class Blank</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Payroll Class Blank</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYROLL_CLASS_BLANK
	 * @model name="PayrollClassBlank"
	 * @generated
	 * @ordered
	 */
	public static final int PAYROLL_CLASS_BLANK_VALUE = 0;

	/**
	 * The '<em><b>Payroll Class1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Payroll Class1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYROLL_CLASS1
	 * @model name="PayrollClass1"
	 * @generated
	 * @ordered
	 */
	public static final int PAYROLL_CLASS1_VALUE = 1;

	/**
	 * The '<em><b>Payroll Class2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Payroll Class2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #PAYROLL_CLASS2
	 * @model name="PayrollClass2"
	 * @generated
	 * @ordered
	 */
	public static final int PAYROLL_CLASS2_VALUE = 2;

	/**
	 * An array of all the '<em><b>Payroll Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PayrollClass[] VALUES_ARRAY =
		new PayrollClass[] {
			PAYROLL_CLASS_BLANK,
			PAYROLL_CLASS1,
			PAYROLL_CLASS2,
		};

	/**
	 * A public read-only list of all the '<em><b>Payroll Class</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PayrollClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Payroll Class</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PayrollClass get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PayrollClass result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payroll Class</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PayrollClass getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PayrollClass result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Payroll Class</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PayrollClass get(int value) {
		switch (value) {
			case PAYROLL_CLASS_BLANK_VALUE: return PAYROLL_CLASS_BLANK;
			case PAYROLL_CLASS1_VALUE: return PAYROLL_CLASS1;
			case PAYROLL_CLASS2_VALUE: return PAYROLL_CLASS2;
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
	private PayrollClass(int value, String name, String literal) {
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
	
} //PayrollClass
