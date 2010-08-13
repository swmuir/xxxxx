/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ncpdp.uml.ecl.AdditionalMessageInformationContinuity;
import org.ncpdp.uml.ecl.AdditionalMessageInformationQualifier;
import org.ncpdp.uml.ecl.HelpDeskPhoneNumberQualifier;
import org.ncpdp.uml.ecl.RejectCode;
import org.ncpdp.uml.ecl.TransactionResponseStatus;

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
 * @model
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
	 * Returns the value of the '<em><b>Transaction Response Status</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.TransactionResponseStatus}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.TransactionResponseStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Response Status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Response Status</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.TransactionResponseStatus
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_TransactionResponseStatus()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TransactionResponseStatus> getTransactionResponseStatus();

	/**
	 * Returns the value of the '<em><b>Authorization Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Number</em>' containment reference list isn't clear,
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
	 * If the meaning of the '<em>Reject Count</em>' containment reference list isn't clear,
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
	 * Returns the value of the '<em><b>Reject Code</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.RejectCode}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.RejectCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reject Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reject Code</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.RejectCode
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_RejectCode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RejectCode> getRejectCode();

	/**
	 * Returns the value of the '<em><b>Reject Field Occurrence Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reject Field Occurrence Indicator</em>' containment reference list isn't clear,
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
	 * If the meaning of the '<em>Approved Message Code Count</em>' containment reference list isn't clear,
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
	 * If the meaning of the '<em>Approved Message Code</em>' containment reference list isn't clear,
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
	 * If the meaning of the '<em>Additional Message Information Count</em>' containment reference list isn't clear,
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
	 * Returns the value of the '<em><b>Additional Message Information Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.AdditionalMessageInformationQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.AdditionalMessageInformationQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Message Information Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Message Information Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.AdditionalMessageInformationQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_AdditionalMessageInformationQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AdditionalMessageInformationQualifier> getAdditionalMessageInformationQualifier();

	/**
	 * Returns the value of the '<em><b>Additional Message Information</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Message Information</em>' containment reference list isn't clear,
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
	 * Returns the value of the '<em><b>Additional Message Information Continuity</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.AdditionalMessageInformationContinuity}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.AdditionalMessageInformationContinuity}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Message Information Continuity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Message Information Continuity</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.AdditionalMessageInformationContinuity
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_AdditionalMessageInformationContinuity()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AdditionalMessageInformationContinuity> getAdditionalMessageInformationContinuity();

	/**
	 * Returns the value of the '<em><b>Help Desk Phone Number Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.HelpDeskPhoneNumberQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.HelpDeskPhoneNumberQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Desk Phone Number Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Help Desk Phone Number Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.HelpDeskPhoneNumberQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseStatusSegment_HelpDeskPhoneNumberQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<HelpDeskPhoneNumberQualifier> getHelpDeskPhoneNumberQualifier();

	/**
	 * Returns the value of the '<em><b>Help Desk Phone Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Help Desk Phone Number</em>' containment reference list isn't clear,
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
	 * If the meaning of the '<em>Transaction Reference Number</em>' containment reference list isn't clear,
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
	 * If the meaning of the '<em>Internal Control Number</em>' containment reference list isn't clear,
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
	 * If the meaning of the '<em>Url</em>' containment reference list isn't clear,
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
