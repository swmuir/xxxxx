/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ncpdp.uml.ecl.BenefitStageQualifier;
import org.ncpdp.uml.ecl.OtherPayerAmountPaidQualifier;
import org.ncpdp.uml.ecl.OtherPayerCoverageType;
import org.ncpdp.uml.ecl.OtherPayerIDQualifier;
import org.ncpdp.uml.ecl.OtherPayerPatientResponsibilityAmountQualifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coordinationof Benefits Other Payments Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getCoordinationOfBenefitsotherPaymentsCount <em>Coordination Of Benefitsother Payments Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerCoverageType <em>Other Payer Coverage Type</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerIdQualifier <em>Other Payer Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerId <em>Other Payer Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerDate <em>Other Payer Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getInternalControlNumber <em>Internal Control Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerAmountPaidCount <em>Other Payer Amount Paid Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerAmountPaidQualifier <em>Other Payer Amount Paid Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerAmountPaid <em>Other Payer Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerRejectCount <em>Other Payer Reject Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerRejectCode <em>Other Payer Reject Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerpatientResponsibilityAmountCount <em>Other Payerpatient Responsibility Amount Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerpatientResponsibilityAmountQualifier <em>Other Payerpatient Responsibility Amount Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerpatientResponsibilityAmount <em>Other Payerpatient Responsibility Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getBenefitStageCount <em>Benefit Stage Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getBenefitStageQualifier <em>Benefit Stage Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getBenefitStageAmount <em>Benefit Stage Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment()
 * @model
 * @generated
 */
public interface CoordinationofBenefitsOtherPaymentsSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Coordination Of Benefitsother Payments Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordination Of Benefitsother Payments Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordination Of Benefitsother Payments Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_CoordinationOfBenefitsotherPaymentsCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCoordinationOfBenefitsotherPaymentsCount();

	/**
	 * Returns the value of the '<em><b>Other Payer Coverage Type</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.OtherPayerCoverageType}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.OtherPayerCoverageType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Coverage Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Coverage Type</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.OtherPayerCoverageType
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerCoverageType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OtherPayerCoverageType> getOtherPayerCoverageType();

	/**
	 * Returns the value of the '<em><b>Other Payer Id Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.OtherPayerIDQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.OtherPayerIDQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Id Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Id Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.OtherPayerIDQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerIdQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OtherPayerIDQualifier> getOtherPayerIdQualifier();

	/**
	 * Returns the value of the '<em><b>Other Payer Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerId();

	/**
	 * Returns the value of the '<em><b>Other Payer Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Date</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerDate();

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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_InternalControlNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getInternalControlNumber();

	/**
	 * Returns the value of the '<em><b>Other Payer Amount Paid Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Amount Paid Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Amount Paid Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerAmountPaidCount();

	/**
	 * Returns the value of the '<em><b>Other Payer Amount Paid Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.OtherPayerAmountPaidQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.OtherPayerAmountPaidQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Amount Paid Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Amount Paid Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.OtherPayerAmountPaidQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OtherPayerAmountPaidQualifier> getOtherPayerAmountPaidQualifier();

	/**
	 * Returns the value of the '<em><b>Other Payer Amount Paid</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Amount Paid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Amount Paid</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaid()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerAmountPaid();

	/**
	 * Returns the value of the '<em><b>Other Payer Reject Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Reject Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Reject Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerRejectCount();

	/**
	 * Returns the value of the '<em><b>Other Payer Reject Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Reject Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Reject Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerRejectCode();

	/**
	 * Returns the value of the '<em><b>Other Payerpatient Responsibility Amount Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payerpatient Responsibility Amount Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payerpatient Responsibility Amount Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerpatientResponsibilityAmountCount();

	/**
	 * Returns the value of the '<em><b>Other Payerpatient Responsibility Amount Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.OtherPayerPatientResponsibilityAmountQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.OtherPayerPatientResponsibilityAmountQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payerpatient Responsibility Amount Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payerpatient Responsibility Amount Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.OtherPayerPatientResponsibilityAmountQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OtherPayerPatientResponsibilityAmountQualifier> getOtherPayerpatientResponsibilityAmountQualifier();

	/**
	 * Returns the value of the '<em><b>Other Payerpatient Responsibility Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payerpatient Responsibility Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payerpatient Responsibility Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerpatientResponsibilityAmount();

	/**
	 * Returns the value of the '<em><b>Benefit Stage Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Stage Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Stage Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getBenefitStageCount();

	/**
	 * Returns the value of the '<em><b>Benefit Stage Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.BenefitStageQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.BenefitStageQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Stage Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Stage Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.BenefitStageQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BenefitStageQualifier> getBenefitStageQualifier();

	/**
	 * Returns the value of the '<em><b>Benefit Stage Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Benefit Stage Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Benefit Stage Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getBenefitStageAmount();

} // CoordinationofBenefitsOtherPaymentsSegment
