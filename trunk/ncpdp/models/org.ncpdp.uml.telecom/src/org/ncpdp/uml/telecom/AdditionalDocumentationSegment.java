/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ncpdp.uml.ECL.AdditionalDocumentationTypeID;
import org.ncpdp.uml.ECL.LengthofNeedQualifier;
import org.ncpdp.uml.ECL.RequestStatus;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Additional Documentation Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getAdditionalDocumentationTypeId <em>Additional Documentation Type Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getRequestPeriodBeginDate <em>Request Period Begin Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getRequestPeriodRecertrevisedDate <em>Request Period Recertrevised Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getRequestStatus <em>Request Status</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getLengthOfNeedQualifier <em>Length Of Need Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getLengthOfNeed <em>Length Of Need</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getPrescribersupplierDateSigned <em>Prescribersupplier Date Signed</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getSupportingDocumentation <em>Supporting Documentation</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionNumberletterCount <em>Question Numberletter Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionNumberletter <em>Question Numberletter</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionPercentResponse <em>Question Percent Response</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionDateResponse <em>Question Date Response</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionDollarAmountResponse <em>Question Dollar Amount Response</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionNumericResponse <em>Question Numeric Response</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionAlphanumericResponse <em>Question Alphanumeric Response</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment()
 * @model
 * @generated
 */
public interface AdditionalDocumentationSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Additional Documentation Type Id</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.AdditionalDocumentationTypeID}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.AdditionalDocumentationTypeID}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Documentation Type Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Documentation Type Id</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.AdditionalDocumentationTypeID
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_AdditionalDocumentationTypeId()
	 * @model ordered="false"
	 * @generated
	 */
	EList<AdditionalDocumentationTypeID> getAdditionalDocumentationTypeId();

	/**
	 * Returns the value of the '<em><b>Request Period Begin Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Period Begin Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Period Begin Date</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_RequestPeriodBeginDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getRequestPeriodBeginDate();

	/**
	 * Returns the value of the '<em><b>Request Period Recertrevised Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Period Recertrevised Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Period Recertrevised Date</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_RequestPeriodRecertrevisedDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getRequestPeriodRecertrevisedDate();

	/**
	 * Returns the value of the '<em><b>Request Status</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.RequestStatus}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.RequestStatus}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Status</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.RequestStatus
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_RequestStatus()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RequestStatus> getRequestStatus();

	/**
	 * Returns the value of the '<em><b>Length Of Need Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.LengthofNeedQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.LengthofNeedQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Of Need Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Of Need Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.LengthofNeedQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_LengthOfNeedQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<LengthofNeedQualifier> getLengthOfNeedQualifier();

	/**
	 * Returns the value of the '<em><b>Length Of Need</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Of Need</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Of Need</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_LengthOfNeed()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getLengthOfNeed();

	/**
	 * Returns the value of the '<em><b>Prescribersupplier Date Signed</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescribersupplier Date Signed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescribersupplier Date Signed</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_PrescribersupplierDateSigned()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescribersupplierDateSigned();

	/**
	 * Returns the value of the '<em><b>Supporting Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Supporting Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Supporting Documentation</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_SupportingDocumentation()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getSupportingDocumentation();

	/**
	 * Returns the value of the '<em><b>Question Numberletter Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Numberletter Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Numberletter Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_QuestionNumberletterCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getQuestionNumberletterCount();

	/**
	 * Returns the value of the '<em><b>Question Numberletter</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Numberletter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Numberletter</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_QuestionNumberletter()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getQuestionNumberletter();

	/**
	 * Returns the value of the '<em><b>Question Percent Response</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Percent Response</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Percent Response</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_QuestionPercentResponse()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getQuestionPercentResponse();

	/**
	 * Returns the value of the '<em><b>Question Date Response</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Date Response</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Date Response</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_QuestionDateResponse()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getQuestionDateResponse();

	/**
	 * Returns the value of the '<em><b>Question Dollar Amount Response</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Dollar Amount Response</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Dollar Amount Response</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_QuestionDollarAmountResponse()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getQuestionDollarAmountResponse();

	/**
	 * Returns the value of the '<em><b>Question Numeric Response</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Numeric Response</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Numeric Response</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_QuestionNumericResponse()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getQuestionNumericResponse();

	/**
	 * Returns the value of the '<em><b>Question Alphanumeric Response</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Question Alphanumeric Response</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Question Alphanumeric Response</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_QuestionAlphanumericResponse()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getQuestionAlphanumericResponse();

} // AdditionalDocumentationSegment
