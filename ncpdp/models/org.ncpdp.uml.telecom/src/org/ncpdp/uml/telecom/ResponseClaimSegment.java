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
 * A representation of the model object '<em><b>Response Claim Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPrescriptionserviceReferenceNumberQualifier <em>Prescriptionservice Reference Number Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPrescriptionserviceReferenceNumber <em>Prescriptionservice Reference Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductCount <em>Preferred Product Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductIdQualifier <em>Preferred Product Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductId <em>Preferred Product Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductIncentive <em>Preferred Product Incentive</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductCostShareIncentive <em>Preferred Product Cost Share Incentive</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductDescription <em>Preferred Product Description</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn <em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseClaimSegment()
 * @model annotation="http://www.ncpdp.org/uml/telecom/annotation segmentIdentification='111-AM' prescriptionserviceReferenceNumberQualifier.field='455-EM' prescriptionserviceReferenceNumber.field='402-D2' preferredProductCount.field='551-9F' preferredProductIDQualifier.field='552-AP' preferredProductID.field='553-AR' preferredProductIncentive.field='554-AS' preferredProductCostShareIncentive.field='555-AT' preferredProductDescription.field='551-9F' medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn.field='114-N4'"
 * @generated
 */
public interface ResponseClaimSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseClaimSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Prescriptionservice Reference Number Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptionservice Reference Number Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptionservice Reference Number Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseClaimSegment_PrescriptionserviceReferenceNumberQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescriptionserviceReferenceNumberQualifier();

	/**
	 * Returns the value of the '<em><b>Prescriptionservice Reference Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptionservice Reference Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptionservice Reference Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseClaimSegment_PrescriptionserviceReferenceNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescriptionserviceReferenceNumber();

	/**
	 * Returns the value of the '<em><b>Preferred Product Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Product Count</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Product Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseClaimSegment_PreferredProductCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPreferredProductCount();

	/**
	 * Returns the value of the '<em><b>Preferred Product Id Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Product Id Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Product Id Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseClaimSegment_PreferredProductIdQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPreferredProductIdQualifier();

	/**
	 * Returns the value of the '<em><b>Preferred Product Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Product Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Product Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseClaimSegment_PreferredProductId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPreferredProductId();

	/**
	 * Returns the value of the '<em><b>Preferred Product Incentive</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Product Incentive</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Product Incentive</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseClaimSegment_PreferredProductIncentive()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPreferredProductIncentive();

	/**
	 * Returns the value of the '<em><b>Preferred Product Cost Share Incentive</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Product Cost Share Incentive</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Product Cost Share Incentive</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseClaimSegment_PreferredProductCostShareIncentive()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPreferredProductCostShareIncentive();

	/**
	 * Returns the value of the '<em><b>Preferred Product Description</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Preferred Product Description</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Preferred Product Description</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseClaimSegment_PreferredProductDescription()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPreferredProductDescription();

	/**
	 * Returns the value of the '<em><b>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn();

} // ResponseClaimSegment
