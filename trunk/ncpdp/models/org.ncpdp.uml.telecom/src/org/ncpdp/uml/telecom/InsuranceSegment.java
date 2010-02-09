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
 * A representation of the model object '<em><b>Insurance Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getCardholderId <em>Cardholder Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getCardholderFirstName <em>Cardholder First Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getCardholderLastName <em>Cardholder Last Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getHomePlan <em>Home Plan</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getPlanId <em>Plan Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getEligibilityClarificationCode <em>Eligibility Clarification Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getPersonCode <em>Person Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getPatientRelationshipCode <em>Patient Relationship Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerBinNumber <em>Other Payer Bin Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerProcessorControlNumber <em>Other Payer Processor Control Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerCardholderId <em>Other Payer Cardholder Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerGroupId <em>Other Payer Group Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getMedigapId <em>Medigap Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getMedicaidIndicator <em>Medicaid Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getProviderAcceptAssignmentIndicator <em>Provider Accept Assignment Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getCmsPartDDefinedQualifiedFacility <em>Cms Part DDefined Qualified Facility</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getMedicaidIdNumber <em>Medicaid Id Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.InsuranceSegment#getMedicaidAgencyNumber <em>Medicaid Agency Number</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment()
 * @model annotation="http://www.ncpdp.org/uml/telecom/annotation segmentIdentification='111-AM' cardholderId.field='302-C2' cardholderFirstName.field='312-CC' cardholderLastName.field='313-CD' homePlan.field='314-CE' planId.field='524-FO' eligibilityClarificationCode.field='309-C9' groupId.field='301-C1' personCode.field='303-C3' patientRelationshipCode.field='306-C6' otherPayerBinNumber.field='990-MG ' otherPayerProcessorControlNumber.field='991-MH ' otherPayerCardholderId.field='356-NU' otherPayerGroupId.field='992-MJ ' medigapId.field='359-2A' medicaidIndicator.field='360-2B' providerAcceptAssignmentIndicator.field='361-2D' cmsPartDDefinedQualifiedFacility.field='997-G2' medicaidIdNumber.field='115-N5' medicaidAgencyNumber.field='116-N6'"
 * @generated
 */
public interface InsuranceSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Cardholder Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardholder Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardholder Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_CardholderId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCardholderId();

	/**
	 * Returns the value of the '<em><b>Cardholder First Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardholder First Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardholder First Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_CardholderFirstName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCardholderFirstName();

	/**
	 * Returns the value of the '<em><b>Cardholder Last Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardholder Last Name</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardholder Last Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_CardholderLastName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCardholderLastName();

	/**
	 * Returns the value of the '<em><b>Home Plan</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Home Plan</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Home Plan</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_HomePlan()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getHomePlan();

	/**
	 * Returns the value of the '<em><b>Plan Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_PlanId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPlanId();

	/**
	 * Returns the value of the '<em><b>Eligibility Clarification Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Eligibility Clarification Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Eligibility Clarification Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_EligibilityClarificationCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getEligibilityClarificationCode();

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_GroupId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getGroupId();

	/**
	 * Returns the value of the '<em><b>Person Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Person Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Person Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_PersonCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPersonCode();

	/**
	 * Returns the value of the '<em><b>Patient Relationship Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Relationship Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Relationship Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_PatientRelationshipCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientRelationshipCode();

	/**
	 * Returns the value of the '<em><b>Other Payer Bin Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Bin Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Bin Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_OtherPayerBinNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerBinNumber();

	/**
	 * Returns the value of the '<em><b>Other Payer Processor Control Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Processor Control Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Processor Control Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_OtherPayerProcessorControlNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerProcessorControlNumber();

	/**
	 * Returns the value of the '<em><b>Other Payer Cardholder Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Cardholder Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Cardholder Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_OtherPayerCardholderId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerCardholderId();

	/**
	 * Returns the value of the '<em><b>Other Payer Group Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Group Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Group Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_OtherPayerGroupId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerGroupId();

	/**
	 * Returns the value of the '<em><b>Medigap Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medigap Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medigap Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_MedigapId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getMedigapId();

	/**
	 * Returns the value of the '<em><b>Medicaid Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicaid Indicator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicaid Indicator</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_MedicaidIndicator()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getMedicaidIndicator();

	/**
	 * Returns the value of the '<em><b>Provider Accept Assignment Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Provider Accept Assignment Indicator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Provider Accept Assignment Indicator</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_ProviderAcceptAssignmentIndicator()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getProviderAcceptAssignmentIndicator();

	/**
	 * Returns the value of the '<em><b>Cms Part DDefined Qualified Facility</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cms Part DDefined Qualified Facility</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cms Part DDefined Qualified Facility</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_CmsPartDDefinedQualifiedFacility()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCmsPartDDefinedQualifiedFacility();

	/**
	 * Returns the value of the '<em><b>Medicaid Id Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicaid Id Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicaid Id Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_MedicaidIdNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getMedicaidIdNumber();

	/**
	 * Returns the value of the '<em><b>Medicaid Agency Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicaid Agency Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicaid Agency Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getInsuranceSegment_MedicaidAgencyNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getMedicaidAgencyNumber();

} // InsuranceSegment
