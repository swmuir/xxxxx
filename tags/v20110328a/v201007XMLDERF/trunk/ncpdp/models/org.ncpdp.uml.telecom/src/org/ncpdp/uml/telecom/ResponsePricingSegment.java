/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ncpdp.uml.ecl.BasisOfCalculationCoinsurance;
import org.ncpdp.uml.ecl.BasisOfCalculationCopay;
import org.ncpdp.uml.ecl.BasisOfCalculationDispensingFee;
import org.ncpdp.uml.ecl.BasisOfCalculationFlatSalesTax;
import org.ncpdp.uml.ecl.BasisOfCalculationPercentageSalesTax;
import org.ncpdp.uml.ecl.BasisOfReimbursementDetermination;
import org.ncpdp.uml.ecl.BenefitStageQualifier;
import org.ncpdp.uml.ecl.OtherAmountPaidQualifier;
import org.ncpdp.uml.ecl.PercentageSalesTaxBasisPaid;
import org.ncpdp.uml.ecl.TaxExemptIndicator;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response Pricing Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPatientPayAmount <em>Patient Pay Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getIngredientCostPaid <em>Ingredient Cost Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getDispensingFeePaid <em>Dispensing Fee Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getTaxExemptIndicator <em>Tax Exempt Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getFlatSalesTaxAmountPaid <em>Flat Sales Tax Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPercentageSalesTaxAmountPaid <em>Percentage Sales Tax Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPercentageSalesTaxRatePaid <em>Percentage Sales Tax Rate Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPercentageSalesTaxBasisPaid <em>Percentage Sales Tax Basis Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getIncentiveAmountPaid <em>Incentive Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getProfessionalServiceFeePaid <em>Professional Service Fee Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherAmountPaidCount <em>Other Amount Paid Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherAmountPaidQualifier <em>Other Amount Paid Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherAmountPaid <em>Other Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherPayerAmountRecognized <em>Other Payer Amount Recognized</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getTotalAmountPaid <em>Total Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfReimbursementDetermination <em>Basis Of Reimbursement Determination</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToSalesTax <em>Amount Attributed To Sales Tax</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAccumulatedDeductibleAmount <em>Accumulated Deductible Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getRemainingDeductibleAmount <em>Remaining Deductible Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getRemainingBenefitAmount <em>Remaining Benefit Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAppliedToPeriodicDeductible <em>Amount Applied To Periodic Deductible</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountOfCopay <em>Amount Of Copay</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountExceedingPeriodicBenefitMaximum <em>Amount Exceeding Periodic Benefit Maximum</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationdispensingFee <em>Basis Of Calculationdispensing Fee</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationcopay <em>Basis Of Calculationcopay</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationflatSalesTax <em>Basis Of Calculationflat Sales Tax</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationpercentageSalesTax <em>Basis Of Calculationpercentage Sales Tax</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProcessorFee <em>Amount Attributed To Processor Fee</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPatientSalesTaxAmount <em>Patient Sales Tax Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPlanSalesTaxAmount <em>Plan Sales Tax Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountOfCoinsurance <em>Amount Of Coinsurance</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationcoinsurance <em>Basis Of Calculationcoinsurance</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBenefitStageCount <em>Benefit Stage Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBenefitStageQualifier <em>Benefit Stage Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBenefitStageAmount <em>Benefit Stage Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getEstimatedGenericSavings <em>Estimated Generic Savings</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getSpendingAccountAmountRemaining <em>Spending Account Amount Remaining</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getHealthPlanfundedAssistanceAmount <em>Health Planfunded Assistance Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProviderNetworkSelection <em>Amount Attributed To Provider Network Selection</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProductSelectionbrandDrug <em>Amount Attributed To Product Selectionbrand Drug</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProductSelectionnonpreferredFormularySelection <em>Amount Attributed To Product Selectionnonpreferred Formulary Selection</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection <em>Amount Attributed To Product Selectionbrand Nonpreferred Formulary Selection</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToCoverageGap <em>Amount Attributed To Coverage Gap</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getIngredientCostContractedreimbursableAmount <em>Ingredient Cost Contractedreimbursable Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getDispensingFeeContractedreimbursableAmount <em>Dispensing Fee Contractedreimbursable Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment()
 * @model
 * @generated
 */
public interface ResponsePricingSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Patient Pay Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Pay Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Pay Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_PatientPayAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientPayAmount();

	/**
	 * Returns the value of the '<em><b>Ingredient Cost Paid</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredient Cost Paid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient Cost Paid</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_IngredientCostPaid()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getIngredientCostPaid();

	/**
	 * Returns the value of the '<em><b>Dispensing Fee Paid</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispensing Fee Paid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispensing Fee Paid</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_DispensingFeePaid()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDispensingFeePaid();

	/**
	 * Returns the value of the '<em><b>Tax Exempt Indicator</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.TaxExemptIndicator}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.TaxExemptIndicator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Tax Exempt Indicator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Tax Exempt Indicator</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.TaxExemptIndicator
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_TaxExemptIndicator()
	 * @model ordered="false"
	 * @generated
	 */
	EList<TaxExemptIndicator> getTaxExemptIndicator();

	/**
	 * Returns the value of the '<em><b>Flat Sales Tax Amount Paid</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Flat Sales Tax Amount Paid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Flat Sales Tax Amount Paid</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_FlatSalesTaxAmountPaid()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getFlatSalesTaxAmountPaid();

	/**
	 * Returns the value of the '<em><b>Percentage Sales Tax Amount Paid</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Sales Tax Amount Paid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Sales Tax Amount Paid</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_PercentageSalesTaxAmountPaid()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPercentageSalesTaxAmountPaid();

	/**
	 * Returns the value of the '<em><b>Percentage Sales Tax Rate Paid</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Sales Tax Rate Paid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Sales Tax Rate Paid</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_PercentageSalesTaxRatePaid()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPercentageSalesTaxRatePaid();

	/**
	 * Returns the value of the '<em><b>Percentage Sales Tax Basis Paid</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.PercentageSalesTaxBasisPaid}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.PercentageSalesTaxBasisPaid}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Percentage Sales Tax Basis Paid</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Percentage Sales Tax Basis Paid</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.PercentageSalesTaxBasisPaid
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_PercentageSalesTaxBasisPaid()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PercentageSalesTaxBasisPaid> getPercentageSalesTaxBasisPaid();

	/**
	 * Returns the value of the '<em><b>Incentive Amount Paid</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incentive Amount Paid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incentive Amount Paid</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_IncentiveAmountPaid()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getIncentiveAmountPaid();

	/**
	 * Returns the value of the '<em><b>Professional Service Fee Paid</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Professional Service Fee Paid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professional Service Fee Paid</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_ProfessionalServiceFeePaid()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getProfessionalServiceFeePaid();

	/**
	 * Returns the value of the '<em><b>Other Amount Paid Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Amount Paid Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Amount Paid Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_OtherAmountPaidCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherAmountPaidCount();

	/**
	 * Returns the value of the '<em><b>Other Amount Paid Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.OtherAmountPaidQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.OtherAmountPaidQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Amount Paid Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Amount Paid Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.OtherAmountPaidQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_OtherAmountPaidQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OtherAmountPaidQualifier> getOtherAmountPaidQualifier();

	/**
	 * Returns the value of the '<em><b>Other Amount Paid</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Amount Paid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Amount Paid</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_OtherAmountPaid()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherAmountPaid();

	/**
	 * Returns the value of the '<em><b>Other Payer Amount Recognized</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Payer Amount Recognized</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Payer Amount Recognized</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_OtherPayerAmountRecognized()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getOtherPayerAmountRecognized();

	/**
	 * Returns the value of the '<em><b>Total Amount Paid</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Total Amount Paid</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Total Amount Paid</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_TotalAmountPaid()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getTotalAmountPaid();

	/**
	 * Returns the value of the '<em><b>Basis Of Reimbursement Determination</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.BasisOfReimbursementDetermination}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.BasisOfReimbursementDetermination}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Of Reimbursement Determination</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Of Reimbursement Determination</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.BasisOfReimbursementDetermination
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_BasisOfReimbursementDetermination()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BasisOfReimbursementDetermination> getBasisOfReimbursementDetermination();

	/**
	 * Returns the value of the '<em><b>Amount Attributed To Sales Tax</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Attributed To Sales Tax</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Attributed To Sales Tax</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AmountAttributedToSalesTax()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAmountAttributedToSalesTax();

	/**
	 * Returns the value of the '<em><b>Accumulated Deductible Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Accumulated Deductible Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Accumulated Deductible Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AccumulatedDeductibleAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAccumulatedDeductibleAmount();

	/**
	 * Returns the value of the '<em><b>Remaining Deductible Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Deductible Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Deductible Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_RemainingDeductibleAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getRemainingDeductibleAmount();

	/**
	 * Returns the value of the '<em><b>Remaining Benefit Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Remaining Benefit Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Remaining Benefit Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_RemainingBenefitAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getRemainingBenefitAmount();

	/**
	 * Returns the value of the '<em><b>Amount Applied To Periodic Deductible</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Applied To Periodic Deductible</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Applied To Periodic Deductible</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AmountAppliedToPeriodicDeductible()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAmountAppliedToPeriodicDeductible();

	/**
	 * Returns the value of the '<em><b>Amount Of Copay</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Copay</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Copay</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AmountOfCopay()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAmountOfCopay();

	/**
	 * Returns the value of the '<em><b>Amount Exceeding Periodic Benefit Maximum</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Exceeding Periodic Benefit Maximum</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Exceeding Periodic Benefit Maximum</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AmountExceedingPeriodicBenefitMaximum()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAmountExceedingPeriodicBenefitMaximum();

	/**
	 * Returns the value of the '<em><b>Basis Of Calculationdispensing Fee</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.BasisOfCalculationDispensingFee}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.BasisOfCalculationDispensingFee}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Of Calculationdispensing Fee</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Of Calculationdispensing Fee</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.BasisOfCalculationDispensingFee
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_BasisOfCalculationdispensingFee()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BasisOfCalculationDispensingFee> getBasisOfCalculationdispensingFee();

	/**
	 * Returns the value of the '<em><b>Basis Of Calculationcopay</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.BasisOfCalculationCopay}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.BasisOfCalculationCopay}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Of Calculationcopay</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Of Calculationcopay</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.BasisOfCalculationCopay
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_BasisOfCalculationcopay()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BasisOfCalculationCopay> getBasisOfCalculationcopay();

	/**
	 * Returns the value of the '<em><b>Basis Of Calculationflat Sales Tax</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.BasisOfCalculationFlatSalesTax}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.BasisOfCalculationFlatSalesTax}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Of Calculationflat Sales Tax</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Of Calculationflat Sales Tax</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.BasisOfCalculationFlatSalesTax
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_BasisOfCalculationflatSalesTax()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BasisOfCalculationFlatSalesTax> getBasisOfCalculationflatSalesTax();

	/**
	 * Returns the value of the '<em><b>Basis Of Calculationpercentage Sales Tax</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.BasisOfCalculationPercentageSalesTax}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.BasisOfCalculationPercentageSalesTax}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Of Calculationpercentage Sales Tax</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Of Calculationpercentage Sales Tax</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.BasisOfCalculationPercentageSalesTax
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_BasisOfCalculationpercentageSalesTax()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BasisOfCalculationPercentageSalesTax> getBasisOfCalculationpercentageSalesTax();

	/**
	 * Returns the value of the '<em><b>Amount Attributed To Processor Fee</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Attributed To Processor Fee</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Attributed To Processor Fee</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AmountAttributedToProcessorFee()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAmountAttributedToProcessorFee();

	/**
	 * Returns the value of the '<em><b>Patient Sales Tax Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Sales Tax Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Sales Tax Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_PatientSalesTaxAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPatientSalesTaxAmount();

	/**
	 * Returns the value of the '<em><b>Plan Sales Tax Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Plan Sales Tax Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Plan Sales Tax Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_PlanSalesTaxAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPlanSalesTaxAmount();

	/**
	 * Returns the value of the '<em><b>Amount Of Coinsurance</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Of Coinsurance</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Of Coinsurance</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AmountOfCoinsurance()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAmountOfCoinsurance();

	/**
	 * Returns the value of the '<em><b>Basis Of Calculationcoinsurance</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.BasisOfCalculationCoinsurance}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.BasisOfCalculationCoinsurance}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Of Calculationcoinsurance</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Of Calculationcoinsurance</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.BasisOfCalculationCoinsurance
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_BasisOfCalculationcoinsurance()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BasisOfCalculationCoinsurance> getBasisOfCalculationcoinsurance();

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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_BenefitStageCount()
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_BenefitStageQualifier()
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_BenefitStageAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getBenefitStageAmount();

	/**
	 * Returns the value of the '<em><b>Estimated Generic Savings</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Estimated Generic Savings</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Estimated Generic Savings</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_EstimatedGenericSavings()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getEstimatedGenericSavings();

	/**
	 * Returns the value of the '<em><b>Spending Account Amount Remaining</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Spending Account Amount Remaining</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Spending Account Amount Remaining</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_SpendingAccountAmountRemaining()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getSpendingAccountAmountRemaining();

	/**
	 * Returns the value of the '<em><b>Health Planfunded Assistance Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Health Planfunded Assistance Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Health Planfunded Assistance Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_HealthPlanfundedAssistanceAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getHealthPlanfundedAssistanceAmount();

	/**
	 * Returns the value of the '<em><b>Amount Attributed To Provider Network Selection</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Attributed To Provider Network Selection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Attributed To Provider Network Selection</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AmountAttributedToProviderNetworkSelection()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAmountAttributedToProviderNetworkSelection();

	/**
	 * Returns the value of the '<em><b>Amount Attributed To Product Selectionbrand Drug</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Attributed To Product Selectionbrand Drug</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Attributed To Product Selectionbrand Drug</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AmountAttributedToProductSelectionbrandDrug()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAmountAttributedToProductSelectionbrandDrug();

	/**
	 * Returns the value of the '<em><b>Amount Attributed To Product Selectionnonpreferred Formulary Selection</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Attributed To Product Selectionnonpreferred Formulary Selection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Attributed To Product Selectionnonpreferred Formulary Selection</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AmountAttributedToProductSelectionnonpreferredFormularySelection()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAmountAttributedToProductSelectionnonpreferredFormularySelection();

	/**
	 * Returns the value of the '<em><b>Amount Attributed To Product Selectionbrand Nonpreferred Formulary Selection</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Attributed To Product Selectionbrand Nonpreferred Formulary Selection</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Attributed To Product Selectionbrand Nonpreferred Formulary Selection</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AmountAttributedToProductSelectionbrandNonpreferredFormularySelection()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection();

	/**
	 * Returns the value of the '<em><b>Amount Attributed To Coverage Gap</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Amount Attributed To Coverage Gap</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Amount Attributed To Coverage Gap</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_AmountAttributedToCoverageGap()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAmountAttributedToCoverageGap();

	/**
	 * Returns the value of the '<em><b>Ingredient Cost Contractedreimbursable Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Ingredient Cost Contractedreimbursable Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Ingredient Cost Contractedreimbursable Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_IngredientCostContractedreimbursableAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getIngredientCostContractedreimbursableAmount();

	/**
	 * Returns the value of the '<em><b>Dispensing Fee Contractedreimbursable Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispensing Fee Contractedreimbursable Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispensing Fee Contractedreimbursable Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePricingSegment_DispensingFeeContractedreimbursableAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDispensingFeeContractedreimbursableAmount();

} // ResponsePricingSegment
