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
 * A representation of the literals of the enumeration '<em><b>Dispense As Written DAW Difference</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getDispenseAsWrittenDAWDifference()
 * @model
 * @generated
 */
public enum DispenseAsWrittenDAWDifference implements Enumerator {
	/**
	 * The '<em><b>Dispense As Written DAW Difference1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPENSE_AS_WRITTEN_DAW_DIFFERENCE1_VALUE
	 * @generated
	 * @ordered
	 */
	DISPENSE_AS_WRITTEN_DAW_DIFFERENCE1(0, "DispenseAsWrittenDAWDifference1", "DispenseAsWrittenDAWDifference1"),

	/**
	 * The '<em><b>Dispense As Written DAW Difference2</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPENSE_AS_WRITTEN_DAW_DIFFERENCE2_VALUE
	 * @generated
	 * @ordered
	 */
	DISPENSE_AS_WRITTEN_DAW_DIFFERENCE2(1, "DispenseAsWrittenDAWDifference2", "DispenseAsWrittenDAWDifference2"),

	/**
	 * The '<em><b>Dispense As Written DAW Difference3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #DISPENSE_AS_WRITTEN_DAW_DIFFERENCE3_VALUE
	 * @generated
	 * @ordered
	 */
	DISPENSE_AS_WRITTEN_DAW_DIFFERENCE3(2, "DispenseAsWrittenDAWDifference3", "DispenseAsWrittenDAWDifference3");

	/**
	 * The '<em><b>Dispense As Written DAW Difference1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dispense As Written DAW Difference1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPENSE_AS_WRITTEN_DAW_DIFFERENCE1
	 * @model name="DispenseAsWrittenDAWDifference1"
	 * @generated
	 * @ordered
	 */
	public static final int DISPENSE_AS_WRITTEN_DAW_DIFFERENCE1_VALUE = 0;

	/**
	 * The '<em><b>Dispense As Written DAW Difference2</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dispense As Written DAW Difference2</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPENSE_AS_WRITTEN_DAW_DIFFERENCE2
	 * @model name="DispenseAsWrittenDAWDifference2"
	 * @generated
	 * @ordered
	 */
	public static final int DISPENSE_AS_WRITTEN_DAW_DIFFERENCE2_VALUE = 1;

	/**
	 * The '<em><b>Dispense As Written DAW Difference3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Dispense As Written DAW Difference3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #DISPENSE_AS_WRITTEN_DAW_DIFFERENCE3
	 * @model name="DispenseAsWrittenDAWDifference3"
	 * @generated
	 * @ordered
	 */
	public static final int DISPENSE_AS_WRITTEN_DAW_DIFFERENCE3_VALUE = 2;

	/**
	 * An array of all the '<em><b>Dispense As Written DAW Difference</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final DispenseAsWrittenDAWDifference[] VALUES_ARRAY =
		new DispenseAsWrittenDAWDifference[] {
			DISPENSE_AS_WRITTEN_DAW_DIFFERENCE1,
			DISPENSE_AS_WRITTEN_DAW_DIFFERENCE2,
			DISPENSE_AS_WRITTEN_DAW_DIFFERENCE3,
		};

	/**
	 * A public read-only list of all the '<em><b>Dispense As Written DAW Difference</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<DispenseAsWrittenDAWDifference> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Dispense As Written DAW Difference</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DispenseAsWrittenDAWDifference get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DispenseAsWrittenDAWDifference result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dispense As Written DAW Difference</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DispenseAsWrittenDAWDifference getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			DispenseAsWrittenDAWDifference result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Dispense As Written DAW Difference</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static DispenseAsWrittenDAWDifference get(int value) {
		switch (value) {
			case DISPENSE_AS_WRITTEN_DAW_DIFFERENCE1_VALUE: return DISPENSE_AS_WRITTEN_DAW_DIFFERENCE1;
			case DISPENSE_AS_WRITTEN_DAW_DIFFERENCE2_VALUE: return DISPENSE_AS_WRITTEN_DAW_DIFFERENCE2;
			case DISPENSE_AS_WRITTEN_DAW_DIFFERENCE3_VALUE: return DISPENSE_AS_WRITTEN_DAW_DIFFERENCE3;
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
	private DispenseAsWrittenDAWDifference(int value, String name, String literal) {
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
	
} //DispenseAsWrittenDAWDifference
