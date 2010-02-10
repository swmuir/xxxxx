/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ncpdp.uml.ECL.PayerIDQualifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Insurance Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getPlanId <em>Plan Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getNetworkReimbursementId <em>Network Reimbursement Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getPayerIdQualifier <em>Payer Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getPayerId <em>Payer Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getMedicaidIdNumber <em>Medicaid Id Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getMedicaidAgencyNumber <em>Medicaid Agency Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getCardholderId <em>Cardholder Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseInsuranceSegment()
 * @model
 * @generated
 */
public interface ResponseInsuranceSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseInsuranceSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Group Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Group Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Group Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseInsuranceSegment_GroupId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getGroupId();

	/**
	 * Returns the value of the '<em><b>Plan Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseInsuranceSegment_PlanId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPlanId();

	/**
	 * Returns the value of the '<em><b>Network Reimbursement Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Network Reimbursement Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Network Reimbursement Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseInsuranceSegment_NetworkReimbursementId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getNetworkReimbursementId();

	/**
	 * Returns the value of the '<em><b>Payer Id Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.PayerIDQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.PayerIDQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payer Id Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payer Id Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.PayerIDQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseInsuranceSegment_PayerIdQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PayerIDQualifier> getPayerIdQualifier();

	/**
	 * Returns the value of the '<em><b>Payer Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Payer Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Payer Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseInsuranceSegment_PayerId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPayerId();

	/**
	 * Returns the value of the '<em><b>Medicaid Id Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicaid Id Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicaid Id Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseInsuranceSegment_MedicaidIdNumber()
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
	 * If the meaning of the '<em>Medicaid Agency Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicaid Agency Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseInsuranceSegment_MedicaidAgencyNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getMedicaidAgencyNumber();

	/**
	 * Returns the value of the '<em><b>Cardholder Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Cardholder Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Cardholder Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseInsuranceSegment_CardholderId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCardholderId();

} // ResponseInsuranceSegment
