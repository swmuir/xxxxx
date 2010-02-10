/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ncpdp.uml.ECL.BasisOfCostDetermination;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Pricing Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getIngredientCostSubmitted <em>Ingredient Cost Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getDispensingFeeSubmitted <em>Dispensing Fee Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getProfessionalServiceFeeSubmitted <em>Professional Service Fee Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getPatientPaidAmountSubmitted <em>Patient Paid Amount Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getIncentiveAmountSubmitted <em>Incentive Amount Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getOtherAmountClaimedSubmittedCount <em>Other Amount Claimed Submitted Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getOtherAmountClaimedSubmittedQualifier <em>Other Amount Claimed Submitted Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getOtherAmountClaimedSubmitted <em>Other Amount Claimed Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getFlatSalesTaxAmountSubmitted <em>Flat Sales Tax Amount Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getPercentageSalesTaxAmountSubmitted <em>Percentage Sales Tax Amount Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getPercentageSalesTaxRateSubmitted <em>Percentage Sales Tax Rate Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getPercentageSalesTaxBasisSubmitted <em>Percentage Sales Tax Basis Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getUsualAndCustomaryCharge <em>Usual And Customary Charge</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getGrossAmountDue <em>Gross Amount Due</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getBasisOfCostDetermination <em>Basis Of Cost Determination</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PricingSegment#getMedicaidPaidAmount <em>Medicaid Paid Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment()
 * @model
 * @generated
 */
public interface PricingSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Ingredient Cost Submitted</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredient Cost Submitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient Cost Submitted</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_IngredientCostSubmitted()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getIngredientCostSubmitted();

	/**
	 * Returns the value of the '<em><b>Dispensing Fee Submitted</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispensing Fee Submitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispensing Fee Submitted</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_DispensingFeeSubmitted()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDispensingFeeSubmitted();

	/**
	 * Returns the value of the '<em><b>Professional Service Fee Submitted</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Professional Service Fee Submitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professional Service Fee Submitted</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_ProfessionalServiceFeeSubmitted()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getProfessionalServiceFeeSubmitted();

	/**
	 * Returns the value of the '<em><b>Patient Paid Amount Submitted</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Paid Amount Submitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Paid Amount Submitted</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_PatientPaidAmountSubmitted()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientPaidAmountSubmitted();

	/**
	 * Returns the value of the '<em><b>Incentive Amount Submitted</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incentive Amount Submitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incentive Amount Submitted</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_IncentiveAmountSubmitted()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getIncentiveAmountSubmitted();

	/**
	 * Returns the value of the '<em><b>Other Amount Claimed Submitted Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Amount Claimed Submitted Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Amount Claimed Submitted Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_OtherAmountClaimedSubmittedCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherAmountClaimedSubmittedCount();

	/**
	 * Returns the value of the '<em><b>Other Amount Claimed Submitted Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Amount Claimed Submitted Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Amount Claimed Submitted Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_OtherAmountClaimedSubmittedQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherAmountClaimedSubmittedQualifier();

	/**
	 * Returns the value of the '<em><b>Other Amount Claimed Submitted</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Amount Claimed Submitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Amount Claimed Submitted</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_OtherAmountClaimedSubmitted()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherAmountClaimedSubmitted();

	/**
	 * Returns the value of the '<em><b>Flat Sales Tax Amount Submitted</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flat Sales Tax Amount Submitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flat Sales Tax Amount Submitted</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_FlatSalesTaxAmountSubmitted()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getFlatSalesTaxAmountSubmitted();

	/**
	 * Returns the value of the '<em><b>Percentage Sales Tax Amount Submitted</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Sales Tax Amount Submitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Sales Tax Amount Submitted</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_PercentageSalesTaxAmountSubmitted()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPercentageSalesTaxAmountSubmitted();

	/**
	 * Returns the value of the '<em><b>Percentage Sales Tax Rate Submitted</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Sales Tax Rate Submitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Sales Tax Rate Submitted</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_PercentageSalesTaxRateSubmitted()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPercentageSalesTaxRateSubmitted();

	/**
	 * Returns the value of the '<em><b>Percentage Sales Tax Basis Submitted</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Sales Tax Basis Submitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Sales Tax Basis Submitted</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_PercentageSalesTaxBasisSubmitted()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPercentageSalesTaxBasisSubmitted();

	/**
	 * Returns the value of the '<em><b>Usual And Customary Charge</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Usual And Customary Charge</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Usual And Customary Charge</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_UsualAndCustomaryCharge()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getUsualAndCustomaryCharge();

	/**
	 * Returns the value of the '<em><b>Gross Amount Due</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Gross Amount Due</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Gross Amount Due</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_GrossAmountDue()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getGrossAmountDue();

	/**
	 * Returns the value of the '<em><b>Basis Of Cost Determination</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.BasisOfCostDetermination}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.BasisOfCostDetermination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Of Cost Determination</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Of Cost Determination</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.BasisOfCostDetermination
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_BasisOfCostDetermination()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BasisOfCostDetermination> getBasisOfCostDetermination();

	/**
	 * Returns the value of the '<em><b>Medicaid Paid Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicaid Paid Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicaid Paid Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPricingSegment_MedicaidPaidAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getMedicaidPaidAmount();

} // PricingSegment
