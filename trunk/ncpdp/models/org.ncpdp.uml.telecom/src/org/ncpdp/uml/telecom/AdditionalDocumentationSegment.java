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
 * @model annotation="http://www.ncpdp.org/uml/telecom/annotation segmentIdentification='111-AM' additionalDocumentationTypeId.field='369-2Q' requestPeriodBeginDate.field='374-2V' requestPeriodRecertrevisedDate.field='375-2W' requestStatus.field='373-2U' lengthOfNeedQualifier.field='371-2S' lengthOfNeed.field='370-2R' prescribersupplierDateSigned.field='372-2T' supportingDocumentation.field='376-2X' questionNumberletterCount.field='377-2Z' questionNumberletter.field='378-4B' questionPercentResponse.field='379-4D' questionDateResponse.field='380-4G' questionDollarAmountResponse.field='381-4H' questionNumericResponse.field='382-4J' questionAlphanumericResponse.field='383-4K'"
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
	 * Returns the value of the '<em><b>Additional Documentation Type Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Documentation Type Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Documentation Type Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_AdditionalDocumentationTypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAdditionalDocumentationTypeId();

	/**
	 * Returns the value of the '<em><b>Request Period Begin Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Period Begin Date</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>Request Period Recertrevised Date</em>' attribute list isn't clear,
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
	 * Returns the value of the '<em><b>Request Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Status</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_RequestStatus()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getRequestStatus();

	/**
	 * Returns the value of the '<em><b>Length Of Need Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Of Need Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Length Of Need Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getAdditionalDocumentationSegment_LengthOfNeedQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getLengthOfNeedQualifier();

	/**
	 * Returns the value of the '<em><b>Length Of Need</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Length Of Need</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>Prescribersupplier Date Signed</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>Supporting Documentation</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>Question Numberletter Count</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>Question Numberletter</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>Question Percent Response</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>Question Date Response</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>Question Dollar Amount Response</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>Question Numeric Response</em>' attribute list isn't clear,
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
	 * If the meaning of the '<em>Question Alphanumeric Response</em>' attribute list isn't clear,
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
