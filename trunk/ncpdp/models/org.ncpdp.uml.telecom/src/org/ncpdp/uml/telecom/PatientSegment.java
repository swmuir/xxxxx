/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ncpdp.uml.ECL.PatientGenderCode;
import org.ncpdp.uml.ECL.PatientIDQualifier;
import org.ncpdp.uml.ECL.PatientLocation;
import org.ncpdp.uml.ECL.PatientResidence;
import org.ncpdp.uml.ECL.PregnancyIndicator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Patient Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientIdQualifier <em>Patient Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientGenderCode <em>Patient Gender Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientFirstName <em>Patient First Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientLastName <em>Patient Last Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientStreetAddress <em>Patient Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientCityAddress <em>Patient City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientStateProvinceAddress <em>Patient State Province Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientZippostalZone <em>Patient Zippostal Zone</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientPhoneNumber <em>Patient Phone Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPlaceOfService <em>Place Of Service</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getEmployerId <em>Employer Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getSmokerNonsmokerCode <em>Smoker Nonsmoker Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPregnancyIndicator <em>Pregnancy Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientEmailAddress <em>Patient Email Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PatientSegment#getPatientResidence <em>Patient Residence</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment()
 * @model
 * @generated
 */
public interface PatientSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Patient Id Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.PatientIDQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.PatientIDQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Id Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Id Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.PatientIDQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientIdQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PatientIDQualifier> getPatientIdQualifier();

	/**
	 * Returns the value of the '<em><b>Patient Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientId();

	/**
	 * Returns the value of the '<em><b>Date Of Birth</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Birth</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Birth</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_DateOfBirth()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDateOfBirth();

	/**
	 * Returns the value of the '<em><b>Patient Gender Code</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.PatientGenderCode}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.PatientGenderCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Gender Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Gender Code</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.PatientGenderCode
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientGenderCode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PatientGenderCode> getPatientGenderCode();

	/**
	 * Returns the value of the '<em><b>Patient First Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient First Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient First Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientFirstName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientFirstName();

	/**
	 * Returns the value of the '<em><b>Patient Last Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Last Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Last Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientLastName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientLastName();

	/**
	 * Returns the value of the '<em><b>Patient Street Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Street Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Street Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientStreetAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientStreetAddress();

	/**
	 * Returns the value of the '<em><b>Patient City Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient City Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient City Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientCityAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientCityAddress();

	/**
	 * Returns the value of the '<em><b>Patient State Province Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient State Province Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient State Province Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientStateProvinceAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientStateProvinceAddress();

	/**
	 * Returns the value of the '<em><b>Patient Zippostal Zone</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Zippostal Zone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Zippostal Zone</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientZippostalZone()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientZippostalZone();

	/**
	 * Returns the value of the '<em><b>Patient Phone Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Phone Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Phone Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientPhoneNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientPhoneNumber();

	/**
	 * Returns the value of the '<em><b>Place Of Service</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.PatientLocation}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.PatientLocation}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Place Of Service</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Place Of Service</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.PatientLocation
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PlaceOfService()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PatientLocation> getPlaceOfService();

	/**
	 * Returns the value of the '<em><b>Employer Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employer Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_EmployerId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getEmployerId();

	/**
	 * Returns the value of the '<em><b>Smoker Nonsmoker Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Smoker Nonsmoker Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Smoker Nonsmoker Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_SmokerNonsmokerCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getSmokerNonsmokerCode();

	/**
	 * Returns the value of the '<em><b>Pregnancy Indicator</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.PregnancyIndicator}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.PregnancyIndicator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pregnancy Indicator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pregnancy Indicator</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.PregnancyIndicator
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PregnancyIndicator()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PregnancyIndicator> getPregnancyIndicator();

	/**
	 * Returns the value of the '<em><b>Patient Email Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Email Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Email Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientEmailAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientEmailAddress();

	/**
	 * Returns the value of the '<em><b>Patient Residence</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.PatientResidence}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.PatientResidence}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Residence</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Residence</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.PatientResidence
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPatientSegment_PatientResidence()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PatientResidence> getPatientResidence();

} // PatientSegment
