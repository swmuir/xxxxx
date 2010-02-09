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
 * A representation of the model object '<em><b>Response Status Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getTransactionResponseStatus <em>Transaction Response Status</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getAuthorizationNumber <em>Authorization Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getRejectCount <em>Reject Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getRejectCode <em>Reject Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getRejectFieldOccurrenceIndicator <em>Reject Field Occurrence Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getApprovedMessageCodeCount <em>Approved Message Code Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getApprovedMessageCode <em>Approved Message Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformationCount <em>Additional Message Information Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformationQualifier <em>Additional Message Information Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformation <em>Additional Message Information</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformationContinuity <em>Additional Message Information Continuity</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getHelpDeskPhoneNumberQualifier <em>Help Desk Phone Number Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getHelpDeskPhoneNumber <em>Help Desk Phone Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getTransactionReferenceNumber <em>Transaction Reference Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getInternalControlNumber <em>Internal Control Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment()
 * @model annotation="http://www.ncpdp.org/uml/telecom/annotation segmentIdentification='111-AM' transactionResponseStatus.field='112-AN' authorizationNumber.field='503-F3' rejectCount.field='510-FA' rejectCode.field='511-FB' rejectFieldOccurrenceIndicator.field='546-4F' approvedMessageCodeCount.field='547-5F' approvedMessageCode.field='548-6F' additionalMessageInformationCount.field='130-UF' additionalMessageInformationQualifier.field='132-UH' additionalMessageInformation.field='526-FQ' additionalMessageInformationContinuity.field='131-UG' helpDeskPhoneNumberQualifier.field='549-7F' helpDeskPhoneNumber.field='550-8F' transactionReferenceNumber.field='880-K5' internalControlNumber.field='993-A7' url.field='987-MA'"
 * @generated
 */
public interface ResponseStatusSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Transaction Response Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Response Status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Response Status</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_TransactionResponseStatus()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getTransactionResponseStatus();

	/**
	 * Returns the value of the '<em><b>Authorization Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_AuthorizationNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAuthorizationNumber();

	/**
	 * Returns the value of the '<em><b>Reject Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reject Count</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reject Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_RejectCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getRejectCount();

	/**
	 * Returns the value of the '<em><b>Reject Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reject Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reject Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_RejectCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getRejectCode();

	/**
	 * Returns the value of the '<em><b>Reject Field Occurrence Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reject Field Occurrence Indicator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reject Field Occurrence Indicator</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_RejectFieldOccurrenceIndicator()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getRejectFieldOccurrenceIndicator();

	/**
	 * Returns the value of the '<em><b>Approved Message Code Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approved Message Code Count</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved Message Code Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_ApprovedMessageCodeCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getApprovedMessageCodeCount();

	/**
	 * Returns the value of the '<em><b>Approved Message Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Approved Message Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Approved Message Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_ApprovedMessageCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getApprovedMessageCode();

	/**
	 * Returns the value of the '<em><b>Additional Message Information Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Message Information Count</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Message Information Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_AdditionalMessageInformationCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAdditionalMessageInformationCount();

	/**
	 * Returns the value of the '<em><b>Additional Message Information Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Message Information Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Message Information Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_AdditionalMessageInformationQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAdditionalMessageInformationQualifier();

	/**
	 * Returns the value of the '<em><b>Additional Message Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Message Information</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Message Information</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_AdditionalMessageInformation()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAdditionalMessageInformation();

	/**
	 * Returns the value of the '<em><b>Additional Message Information Continuity</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Message Information Continuity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Message Information Continuity</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_AdditionalMessageInformationContinuity()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAdditionalMessageInformationContinuity();

	/**
	 * Returns the value of the '<em><b>Help Desk Phone Number Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Desk Phone Number Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help Desk Phone Number Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_HelpDeskPhoneNumberQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getHelpDeskPhoneNumberQualifier();

	/**
	 * Returns the value of the '<em><b>Help Desk Phone Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Desk Phone Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help Desk Phone Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_HelpDeskPhoneNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getHelpDeskPhoneNumber();

	/**
	 * Returns the value of the '<em><b>Transaction Reference Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Reference Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Reference Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_TransactionReferenceNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getTransactionReferenceNumber();

	/**
	 * Returns the value of the '<em><b>Internal Control Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Internal Control Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Internal Control Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_InternalControlNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getInternalControlNumber();

	/**
	 * Returns the value of the '<em><b>Url</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Url</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Url</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_Url()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getUrl();

} // ResponseStatusSegment
