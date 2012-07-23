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
 * A representation of the literals of the enumeration '<em><b>CMS Part DDefined Qualified Facility</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#getCMSPartDDefinedQualifiedFacility()
 * @model
 * @generated
 */
public enum CMSPartDDefinedQualifiedFacility implements Enumerator {
	/**
	 * The '<em><b>CMS Part DDefined Qualified Facility Y</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMS_PART_DDEFINED_QUALIFIED_FACILITY_Y_VALUE
	 * @generated
	 * @ordered
	 */
	CMS_PART_DDEFINED_QUALIFIED_FACILITY_Y(0, "CMSPartDDefinedQualifiedFacilityY", "CMSPartDDefinedQualifiedFacilityY"),

	/**
	 * The '<em><b>CMS Part DDefined Qualified Facility N</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CMS_PART_DDEFINED_QUALIFIED_FACILITY_N_VALUE
	 * @generated
	 * @ordered
	 */
	CMS_PART_DDEFINED_QUALIFIED_FACILITY_N(1, "CMSPartDDefinedQualifiedFacilityN", "CMSPartDDefinedQualifiedFacilityN");

	/**
	 * The '<em><b>CMS Part DDefined Qualified Facility Y</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CMS Part DDefined Qualified Facility Y</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CMS_PART_DDEFINED_QUALIFIED_FACILITY_Y
	 * @model name="CMSPartDDefinedQualifiedFacilityY"
	 * @generated
	 * @ordered
	 */
	public static final int CMS_PART_DDEFINED_QUALIFIED_FACILITY_Y_VALUE = 0;

	/**
	 * The '<em><b>CMS Part DDefined Qualified Facility N</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>CMS Part DDefined Qualified Facility N</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CMS_PART_DDEFINED_QUALIFIED_FACILITY_N
	 * @model name="CMSPartDDefinedQualifiedFacilityN"
	 * @generated
	 * @ordered
	 */
	public static final int CMS_PART_DDEFINED_QUALIFIED_FACILITY_N_VALUE = 1;

	/**
	 * An array of all the '<em><b>CMS Part DDefined Qualified Facility</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final CMSPartDDefinedQualifiedFacility[] VALUES_ARRAY =
		new CMSPartDDefinedQualifiedFacility[] {
			CMS_PART_DDEFINED_QUALIFIED_FACILITY_Y,
			CMS_PART_DDEFINED_QUALIFIED_FACILITY_N,
		};

	/**
	 * A public read-only list of all the '<em><b>CMS Part DDefined Qualified Facility</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<CMSPartDDefinedQualifiedFacility> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>CMS Part DDefined Qualified Facility</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMSPartDDefinedQualifiedFacility get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CMSPartDDefinedQualifiedFacility result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CMS Part DDefined Qualified Facility</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMSPartDDefinedQualifiedFacility getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			CMSPartDDefinedQualifiedFacility result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>CMS Part DDefined Qualified Facility</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static CMSPartDDefinedQualifiedFacility get(int value) {
		switch (value) {
			case CMS_PART_DDEFINED_QUALIFIED_FACILITY_Y_VALUE: return CMS_PART_DDEFINED_QUALIFIED_FACILITY_Y;
			case CMS_PART_DDEFINED_QUALIFIED_FACILITY_N_VALUE: return CMS_PART_DDEFINED_QUALIFIED_FACILITY_N;
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
	private CMSPartDDefinedQualifiedFacility(int value, String name, String literal) {
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
	
} //CMSPartDDefinedQualifiedFacility