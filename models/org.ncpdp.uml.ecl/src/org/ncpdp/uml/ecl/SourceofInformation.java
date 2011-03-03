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
 * A representation of the literals of the enumeration '<em><b>Sourceof Information</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getSourceofInformation()
 * @model
 * @generated
 */
public enum SourceofInformation implements Enumerator {
	/**
	 * The '<em><b>Sourceof Information P</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCEOF_INFORMATION_P_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCEOF_INFORMATION_P(0, "SourceofInformationP", "SourceofInformationP"),

	/**
	 * The '<em><b>Sourceof Information C</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #SOURCEOF_INFORMATION_C_VALUE
	 * @generated
	 * @ordered
	 */
	SOURCEOF_INFORMATION_C(1, "SourceofInformationC", "SourceofInformationC");

	/**
	 * The '<em><b>Sourceof Information P</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sourceof Information P</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCEOF_INFORMATION_P
	 * @model name="SourceofInformationP"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCEOF_INFORMATION_P_VALUE = 0;

	/**
	 * The '<em><b>Sourceof Information C</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Sourceof Information C</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #SOURCEOF_INFORMATION_C
	 * @model name="SourceofInformationC"
	 * @generated
	 * @ordered
	 */
	public static final int SOURCEOF_INFORMATION_C_VALUE = 1;

	/**
	 * An array of all the '<em><b>Sourceof Information</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SourceofInformation[] VALUES_ARRAY =
		new SourceofInformation[] {
			SOURCEOF_INFORMATION_P,
			SOURCEOF_INFORMATION_C,
		};

	/**
	 * A public read-only list of all the '<em><b>Sourceof Information</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SourceofInformation> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Sourceof Information</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceofInformation get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceofInformation result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sourceof Information</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceofInformation getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SourceofInformation result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Sourceof Information</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SourceofInformation get(int value) {
		switch (value) {
			case SOURCEOF_INFORMATION_P_VALUE: return SOURCEOF_INFORMATION_P;
			case SOURCEOF_INFORMATION_C_VALUE: return SOURCEOF_INFORMATION_C;
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
	private SourceofInformation(int value, String name, String literal) {
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
	
} //SourceofInformation
