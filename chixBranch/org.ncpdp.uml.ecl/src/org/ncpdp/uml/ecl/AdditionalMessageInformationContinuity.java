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
 * A representation of the literals of the enumeration '<em><b>Additional Message Information Continuity</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getAdditionalMessageInformationContinuity()
 * @model
 * @generated
 */
public enum AdditionalMessageInformationContinuity implements Enumerator {
	/**
	 * The '<em><b>Additional Message Information Continuity</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY_VALUE
	 * @generated
	 * @ordered
	 */
	ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY(0, "AdditionalMessageInformationContinuity", "AdditionalMessageInformationContinuity");

	/**
	 * The '<em><b>Additional Message Information Continuity</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Additional Message Information Continuity</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY
	 * @model name="AdditionalMessageInformationContinuity"
	 * @generated
	 * @ordered
	 */
	public static final int ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY_VALUE = 0;

	/**
	 * An array of all the '<em><b>Additional Message Information Continuity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final AdditionalMessageInformationContinuity[] VALUES_ARRAY =
		new AdditionalMessageInformationContinuity[] {
			ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY,
		};

	/**
	 * A public read-only list of all the '<em><b>Additional Message Information Continuity</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<AdditionalMessageInformationContinuity> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Additional Message Information Continuity</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdditionalMessageInformationContinuity get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdditionalMessageInformationContinuity result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Additional Message Information Continuity</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdditionalMessageInformationContinuity getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			AdditionalMessageInformationContinuity result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Additional Message Information Continuity</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static AdditionalMessageInformationContinuity get(int value) {
		switch (value) {
			case ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY_VALUE: return ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY;
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
	private AdditionalMessageInformationContinuity(int value, String name, String literal) {
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
	
} //AdditionalMessageInformationContinuity
