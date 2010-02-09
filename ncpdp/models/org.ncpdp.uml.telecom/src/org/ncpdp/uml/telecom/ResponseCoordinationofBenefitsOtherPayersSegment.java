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
 * A representation of the model object '<em><b>Response Coordinationof Benefits Other Payers Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerIdCount <em>Other Payer Id Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerCoverageType <em>Other Payer Coverage Type</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerIdQualifier <em>Other Payer Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerId <em>Other Payer Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerProcessorControlNumber <em>Other Payer Processor Control Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerCardholderId <em>Other Payer Cardholder Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerGroupId <em>Other Payer Group Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerPersonCode <em>Other Payer Person Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerHelpDeskPhoneNumber <em>Other Payer Help Desk Phone Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerPatientRelationshipCode <em>Other Payer Patient Relationship Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerBenefitEffectiveDate <em>Other Payer Benefit Effective Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerBenefitTerminationDate <em>Other Payer Benefit Termination Date</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment()
 * @model annotation="http://www.ncpdp.org/uml/telecom/annotation segmentIdentification='111-AM' otherPayerIDCount.field='355-NT' otherPayerCoverageType.field='338-5C' otherPayerIDQualifier.field='339-6C' otherPayerID.field='340-7C' otherPayerProcessorControlNumber.field='991-MH' otherPayerCardholderID.field='356-NU' otherPayerGroupID.field='992-MJ' otherPayerPersonCode.field='142-UV' otherPayerHelpDeskPhoneNumber.field='127-UB' otherPayerPatientRelationshipCode.field='143-UW' otherPayerBenefitEffectiveDate.field='144-UX' otherPayerBenefitTerminationDate.field='145-UY'"
 * @generated
 */
public interface ResponseCoordinationofBenefitsOtherPayersSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Other Payer Id Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Id Count</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Id Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerIdCount();

	/**
	 * Returns the value of the '<em><b>Other Payer Coverage Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Coverage Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Coverage Type</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCoverageType()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerCoverageType();

	/**
	 * Returns the value of the '<em><b>Other Payer Id Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Id Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Id Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerIdQualifier();

	/**
	 * Returns the value of the '<em><b>Other Payer Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerId();

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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerProcessorControlNumber()
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCardholderId()
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerGroupId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerGroupId();

	/**
	 * Returns the value of the '<em><b>Other Payer Person Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Person Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Person Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPersonCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerPersonCode();

	/**
	 * Returns the value of the '<em><b>Other Payer Help Desk Phone Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Help Desk Phone Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Help Desk Phone Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerHelpDeskPhoneNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerHelpDeskPhoneNumber();

	/**
	 * Returns the value of the '<em><b>Other Payer Patient Relationship Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Patient Relationship Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Patient Relationship Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPatientRelationshipCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerPatientRelationshipCode();

	/**
	 * Returns the value of the '<em><b>Other Payer Benefit Effective Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Benefit Effective Date</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Benefit Effective Date</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitEffectiveDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerBenefitEffectiveDate();

	/**
	 * Returns the value of the '<em><b>Other Payer Benefit Termination Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Benefit Termination Date</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Benefit Termination Date</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitTerminationDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerBenefitTerminationDate();

} // ResponseCoordinationofBenefitsOtherPayersSegment
