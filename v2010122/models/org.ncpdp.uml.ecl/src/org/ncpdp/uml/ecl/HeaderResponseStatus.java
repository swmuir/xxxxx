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
 * A representation of the literals of the enumeration '<em><b>Header Response Status</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getHeaderResponseStatus()
 * @model
 * @generated
 */
public enum HeaderResponseStatus implements Enumerator {
	/**
	 * The '<em><b>Header Response Status A</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER_RESPONSE_STATUS_A_VALUE
	 * @generated
	 * @ordered
	 */
	HEADER_RESPONSE_STATUS_A(0, "HeaderResponseStatusA", "HeaderResponseStatusA"),

	/**
	 * The '<em><b>Header Response Status R</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #HEADER_RESPONSE_STATUS_R_VALUE
	 * @generated
	 * @ordered
	 */
	HEADER_RESPONSE_STATUS_R(1, "HeaderResponseStatusR", "HeaderResponseStatusR");

	/**
	 * The '<em><b>Header Response Status A</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Header Response Status A</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADER_RESPONSE_STATUS_A
	 * @model name="HeaderResponseStatusA"
	 * @generated
	 * @ordered
	 */
	public static final int HEADER_RESPONSE_STATUS_A_VALUE = 0;

	/**
	 * The '<em><b>Header Response Status R</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Header Response Status R</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #HEADER_RESPONSE_STATUS_R
	 * @model name="HeaderResponseStatusR"
	 * @generated
	 * @ordered
	 */
	public static final int HEADER_RESPONSE_STATUS_R_VALUE = 1;

	/**
	 * An array of all the '<em><b>Header Response Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final HeaderResponseStatus[] VALUES_ARRAY =
		new HeaderResponseStatus[] {
			HEADER_RESPONSE_STATUS_A,
			HEADER_RESPONSE_STATUS_R,
		};

	/**
	 * A public read-only list of all the '<em><b>Header Response Status</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<HeaderResponseStatus> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Header Response Status</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HeaderResponseStatus get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HeaderResponseStatus result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Header Response Status</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HeaderResponseStatus getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			HeaderResponseStatus result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Header Response Status</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static HeaderResponseStatus get(int value) {
		switch (value) {
			case HEADER_RESPONSE_STATUS_A_VALUE: return HEADER_RESPONSE_STATUS_A;
			case HEADER_RESPONSE_STATUS_R_VALUE: return HEADER_RESPONSE_STATUS_R;
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
	private HeaderResponseStatus(int value, String name, String literal) {
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
	
} //HeaderResponseStatus
