/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Facility Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.FacilitySegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityName <em>Facility Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityStreetAddress <em>Facility Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityCityAddress <em>Facility City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityStateprovinceAddress <em>Facility Stateprovince Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityZippostalZone <em>Facility Zippostal Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getFacilitySegment()
 * @model
 * @generated
 */
public interface FacilitySegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Segment Identification</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Identification</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Identification</em>' attribute list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getFacilitySegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Facility Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getFacilitySegment_FacilityId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getFacilityId();

	/**
	 * Returns the value of the '<em><b>Facility Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getFacilitySegment_FacilityName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getFacilityName();

	/**
	 * Returns the value of the '<em><b>Facility Street Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Street Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Street Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getFacilitySegment_FacilityStreetAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getFacilityStreetAddress();

	/**
	 * Returns the value of the '<em><b>Facility City Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility City Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility City Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getFacilitySegment_FacilityCityAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getFacilityCityAddress();

	/**
	 * Returns the value of the '<em><b>Facility Stateprovince Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Stateprovince Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Stateprovince Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getFacilitySegment_FacilityStateprovinceAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getFacilityStateprovinceAddress();

	/**
	 * Returns the value of the '<em><b>Facility Zippostal Zone</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Zippostal Zone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Zippostal Zone</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getFacilitySegment_FacilityZippostalZone()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getFacilityZippostalZone();

} // FacilitySegment
