/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;
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
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.ResponsePricingSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Pricing Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getPatientPayAmount <em>Patient Pay Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getIngredientCostPaid <em>Ingredient Cost Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getDispensingFeePaid <em>Dispensing Fee Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getTaxExemptIndicator <em>Tax Exempt Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getFlatSalesTaxAmountPaid <em>Flat Sales Tax Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getPercentageSalesTaxAmountPaid <em>Percentage Sales Tax Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getPercentageSalesTaxRatePaid <em>Percentage Sales Tax Rate Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getPercentageSalesTaxBasisPaid <em>Percentage Sales Tax Basis Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getIncentiveAmountPaid <em>Incentive Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getProfessionalServiceFeePaid <em>Professional Service Fee Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getOtherAmountPaidCount <em>Other Amount Paid Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getOtherAmountPaidQualifier <em>Other Amount Paid Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getOtherAmountPaid <em>Other Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getOtherPayerAmountRecognized <em>Other Payer Amount Recognized</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getTotalAmountPaid <em>Total Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getBasisOfReimbursementDetermination <em>Basis Of Reimbursement Determination</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAmountAttributedToSalesTax <em>Amount Attributed To Sales Tax</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAccumulatedDeductibleAmount <em>Accumulated Deductible Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getRemainingDeductibleAmount <em>Remaining Deductible Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getRemainingBenefitAmount <em>Remaining Benefit Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAmountAppliedToPeriodicDeductible <em>Amount Applied To Periodic Deductible</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAmountOfCopay <em>Amount Of Copay</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAmountExceedingPeriodicBenefitMaximum <em>Amount Exceeding Periodic Benefit Maximum</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getBasisOfCalculationdispensingFee <em>Basis Of Calculationdispensing Fee</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getBasisOfCalculationcopay <em>Basis Of Calculationcopay</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getBasisOfCalculationflatSalesTax <em>Basis Of Calculationflat Sales Tax</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getBasisOfCalculationpercentageSalesTax <em>Basis Of Calculationpercentage Sales Tax</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAmountAttributedToProcessorFee <em>Amount Attributed To Processor Fee</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getPatientSalesTaxAmount <em>Patient Sales Tax Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getPlanSalesTaxAmount <em>Plan Sales Tax Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAmountOfCoinsurance <em>Amount Of Coinsurance</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getBasisOfCalculationcoinsurance <em>Basis Of Calculationcoinsurance</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getBenefitStageCount <em>Benefit Stage Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getBenefitStageQualifier <em>Benefit Stage Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getBenefitStageAmount <em>Benefit Stage Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getEstimatedGenericSavings <em>Estimated Generic Savings</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getSpendingAccountAmountRemaining <em>Spending Account Amount Remaining</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getHealthPlanfundedAssistanceAmount <em>Health Planfunded Assistance Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAmountAttributedToProviderNetworkSelection <em>Amount Attributed To Provider Network Selection</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAmountAttributedToProductSelectionbrandDrug <em>Amount Attributed To Product Selectionbrand Drug</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAmountAttributedToProductSelectionnonpreferredFormularySelection <em>Amount Attributed To Product Selectionnonpreferred Formulary Selection</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection <em>Amount Attributed To Product Selectionbrand Nonpreferred Formulary Selection</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getAmountAttributedToCoverageGap <em>Amount Attributed To Coverage Gap</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getIngredientCostContractedreimbursableAmount <em>Ingredient Cost Contractedreimbursable Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl#getDispensingFeeContractedreimbursableAmount <em>Dispensing Fee Contractedreimbursable Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponsePricingSegmentImpl extends EObjectImpl implements ResponsePricingSegment {
	/**
	 * The cached value of the '{@link #getSegmentIdentification() <em>Segment Identification</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<String> segmentIdentification;

	/**
	 * The cached value of the '{@link #getPatientPayAmount() <em>Patient Pay Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPayAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientPayAmount;

	/**
	 * The cached value of the '{@link #getIngredientCostPaid() <em>Ingredient Cost Paid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredientCostPaid()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> ingredientCostPaid;

	/**
	 * The cached value of the '{@link #getDispensingFeePaid() <em>Dispensing Fee Paid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispensingFeePaid()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> dispensingFeePaid;

	/**
	 * The cached value of the '{@link #getTaxExemptIndicator() <em>Tax Exempt Indicator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTaxExemptIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<TaxExemptIndicator> taxExemptIndicator;

	/**
	 * The cached value of the '{@link #getFlatSalesTaxAmountPaid() <em>Flat Sales Tax Amount Paid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatSalesTaxAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> flatSalesTaxAmountPaid;

	/**
	 * The cached value of the '{@link #getPercentageSalesTaxAmountPaid() <em>Percentage Sales Tax Amount Paid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageSalesTaxAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> percentageSalesTaxAmountPaid;

	/**
	 * The cached value of the '{@link #getPercentageSalesTaxRatePaid() <em>Percentage Sales Tax Rate Paid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageSalesTaxRatePaid()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> percentageSalesTaxRatePaid;

	/**
	 * The cached value of the '{@link #getPercentageSalesTaxBasisPaid() <em>Percentage Sales Tax Basis Paid</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageSalesTaxBasisPaid()
	 * @generated
	 * @ordered
	 */
	protected EList<PercentageSalesTaxBasisPaid> percentageSalesTaxBasisPaid;

	/**
	 * The cached value of the '{@link #getIncentiveAmountPaid() <em>Incentive Amount Paid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncentiveAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> incentiveAmountPaid;

	/**
	 * The cached value of the '{@link #getProfessionalServiceFeePaid() <em>Professional Service Fee Paid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessionalServiceFeePaid()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> professionalServiceFeePaid;

	/**
	 * The cached value of the '{@link #getOtherAmountPaidCount() <em>Other Amount Paid Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAmountPaidCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherAmountPaidCount;

	/**
	 * The cached value of the '{@link #getOtherAmountPaidQualifier() <em>Other Amount Paid Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAmountPaidQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherAmountPaidQualifier> otherAmountPaidQualifier;

	/**
	 * The cached value of the '{@link #getOtherAmountPaid() <em>Other Amount Paid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherAmountPaid;

	/**
	 * The cached value of the '{@link #getOtherPayerAmountRecognized() <em>Other Payer Amount Recognized</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerAmountRecognized()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerAmountRecognized;

	/**
	 * The cached value of the '{@link #getTotalAmountPaid() <em>Total Amount Paid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTotalAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> totalAmountPaid;

	/**
	 * The cached value of the '{@link #getBasisOfReimbursementDetermination() <em>Basis Of Reimbursement Determination</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisOfReimbursementDetermination()
	 * @generated
	 * @ordered
	 */
	protected EList<BasisOfReimbursementDetermination> basisOfReimbursementDetermination;

	/**
	 * The cached value of the '{@link #getAmountAttributedToSalesTax() <em>Amount Attributed To Sales Tax</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAttributedToSalesTax()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> amountAttributedToSalesTax;

	/**
	 * The cached value of the '{@link #getAccumulatedDeductibleAmount() <em>Accumulated Deductible Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAccumulatedDeductibleAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> accumulatedDeductibleAmount;

	/**
	 * The cached value of the '{@link #getRemainingDeductibleAmount() <em>Remaining Deductible Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingDeductibleAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> remainingDeductibleAmount;

	/**
	 * The cached value of the '{@link #getRemainingBenefitAmount() <em>Remaining Benefit Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRemainingBenefitAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> remainingBenefitAmount;

	/**
	 * The cached value of the '{@link #getAmountAppliedToPeriodicDeductible() <em>Amount Applied To Periodic Deductible</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAppliedToPeriodicDeductible()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> amountAppliedToPeriodicDeductible;

	/**
	 * The cached value of the '{@link #getAmountOfCopay() <em>Amount Of Copay</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfCopay()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> amountOfCopay;

	/**
	 * The cached value of the '{@link #getAmountExceedingPeriodicBenefitMaximum() <em>Amount Exceeding Periodic Benefit Maximum</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountExceedingPeriodicBenefitMaximum()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> amountExceedingPeriodicBenefitMaximum;

	/**
	 * The cached value of the '{@link #getBasisOfCalculationdispensingFee() <em>Basis Of Calculationdispensing Fee</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisOfCalculationdispensingFee()
	 * @generated
	 * @ordered
	 */
	protected EList<BasisOfCalculationDispensingFee> basisOfCalculationdispensingFee;

	/**
	 * The cached value of the '{@link #getBasisOfCalculationcopay() <em>Basis Of Calculationcopay</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisOfCalculationcopay()
	 * @generated
	 * @ordered
	 */
	protected EList<BasisOfCalculationCopay> basisOfCalculationcopay;

	/**
	 * The cached value of the '{@link #getBasisOfCalculationflatSalesTax() <em>Basis Of Calculationflat Sales Tax</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisOfCalculationflatSalesTax()
	 * @generated
	 * @ordered
	 */
	protected EList<BasisOfCalculationFlatSalesTax> basisOfCalculationflatSalesTax;

	/**
	 * The cached value of the '{@link #getBasisOfCalculationpercentageSalesTax() <em>Basis Of Calculationpercentage Sales Tax</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisOfCalculationpercentageSalesTax()
	 * @generated
	 * @ordered
	 */
	protected EList<BasisOfCalculationPercentageSalesTax> basisOfCalculationpercentageSalesTax;

	/**
	 * The cached value of the '{@link #getAmountAttributedToProcessorFee() <em>Amount Attributed To Processor Fee</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAttributedToProcessorFee()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> amountAttributedToProcessorFee;

	/**
	 * The cached value of the '{@link #getPatientSalesTaxAmount() <em>Patient Sales Tax Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientSalesTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientSalesTaxAmount;

	/**
	 * The cached value of the '{@link #getPlanSalesTaxAmount() <em>Plan Sales Tax Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanSalesTaxAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> planSalesTaxAmount;

	/**
	 * The cached value of the '{@link #getAmountOfCoinsurance() <em>Amount Of Coinsurance</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountOfCoinsurance()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> amountOfCoinsurance;

	/**
	 * The cached value of the '{@link #getBasisOfCalculationcoinsurance() <em>Basis Of Calculationcoinsurance</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisOfCalculationcoinsurance()
	 * @generated
	 * @ordered
	 */
	protected EList<BasisOfCalculationCoinsurance> basisOfCalculationcoinsurance;

	/**
	 * The cached value of the '{@link #getBenefitStageCount() <em>Benefit Stage Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitStageCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> benefitStageCount;

	/**
	 * The cached value of the '{@link #getBenefitStageQualifier() <em>Benefit Stage Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitStageQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<BenefitStageQualifier> benefitStageQualifier;

	/**
	 * The cached value of the '{@link #getBenefitStageAmount() <em>Benefit Stage Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBenefitStageAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> benefitStageAmount;

	/**
	 * The cached value of the '{@link #getEstimatedGenericSavings() <em>Estimated Generic Savings</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEstimatedGenericSavings()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> estimatedGenericSavings;

	/**
	 * The cached value of the '{@link #getSpendingAccountAmountRemaining() <em>Spending Account Amount Remaining</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpendingAccountAmountRemaining()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> spendingAccountAmountRemaining;

	/**
	 * The cached value of the '{@link #getHealthPlanfundedAssistanceAmount() <em>Health Planfunded Assistance Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHealthPlanfundedAssistanceAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> healthPlanfundedAssistanceAmount;

	/**
	 * The cached value of the '{@link #getAmountAttributedToProviderNetworkSelection() <em>Amount Attributed To Provider Network Selection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAttributedToProviderNetworkSelection()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> amountAttributedToProviderNetworkSelection;

	/**
	 * The cached value of the '{@link #getAmountAttributedToProductSelectionbrandDrug() <em>Amount Attributed To Product Selectionbrand Drug</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAttributedToProductSelectionbrandDrug()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> amountAttributedToProductSelectionbrandDrug;

	/**
	 * The cached value of the '{@link #getAmountAttributedToProductSelectionnonpreferredFormularySelection() <em>Amount Attributed To Product Selectionnonpreferred Formulary Selection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAttributedToProductSelectionnonpreferredFormularySelection()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> amountAttributedToProductSelectionnonpreferredFormularySelection;

	/**
	 * The cached value of the '{@link #getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection() <em>Amount Attributed To Product Selectionbrand Nonpreferred Formulary Selection</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> amountAttributedToProductSelectionbrandNonpreferredFormularySelection;

	/**
	 * The cached value of the '{@link #getAmountAttributedToCoverageGap() <em>Amount Attributed To Coverage Gap</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAmountAttributedToCoverageGap()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> amountAttributedToCoverageGap;

	/**
	 * The cached value of the '{@link #getIngredientCostContractedreimbursableAmount() <em>Ingredient Cost Contractedreimbursable Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredientCostContractedreimbursableAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> ingredientCostContractedreimbursableAmount;

	/**
	 * The cached value of the '{@link #getDispensingFeeContractedreimbursableAmount() <em>Dispensing Fee Contractedreimbursable Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispensingFeeContractedreimbursableAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> dispensingFeeContractedreimbursableAmount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsePricingSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.RESPONSE_PRICING_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientPayAmount() {
		if (patientPayAmount == null) {
			patientPayAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_PAY_AMOUNT);
		}
		return patientPayAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getIngredientCostPaid() {
		if (ingredientCostPaid == null) {
			ingredientCostPaid = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_PAID);
		}
		return ingredientCostPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDispensingFeePaid() {
		if (dispensingFeePaid == null) {
			dispensingFeePaid = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_PAID);
		}
		return dispensingFeePaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<TaxExemptIndicator> getTaxExemptIndicator() {
		if (taxExemptIndicator == null) {
			taxExemptIndicator = new EDataTypeUniqueEList<TaxExemptIndicator>(TaxExemptIndicator.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__TAX_EXEMPT_INDICATOR);
		}
		return taxExemptIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFlatSalesTaxAmountPaid() {
		if (flatSalesTaxAmountPaid == null) {
			flatSalesTaxAmountPaid = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_PAID);
		}
		return flatSalesTaxAmountPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPercentageSalesTaxAmountPaid() {
		if (percentageSalesTaxAmountPaid == null) {
			percentageSalesTaxAmountPaid = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_PAID);
		}
		return percentageSalesTaxAmountPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPercentageSalesTaxRatePaid() {
		if (percentageSalesTaxRatePaid == null) {
			percentageSalesTaxRatePaid = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_PAID);
		}
		return percentageSalesTaxRatePaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PercentageSalesTaxBasisPaid> getPercentageSalesTaxBasisPaid() {
		if (percentageSalesTaxBasisPaid == null) {
			percentageSalesTaxBasisPaid = new EDataTypeUniqueEList<PercentageSalesTaxBasisPaid>(PercentageSalesTaxBasisPaid.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_PAID);
		}
		return percentageSalesTaxBasisPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getIncentiveAmountPaid() {
		if (incentiveAmountPaid == null) {
			incentiveAmountPaid = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__INCENTIVE_AMOUNT_PAID);
		}
		return incentiveAmountPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getProfessionalServiceFeePaid() {
		if (professionalServiceFeePaid == null) {
			professionalServiceFeePaid = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_PAID);
		}
		return professionalServiceFeePaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherAmountPaidCount() {
		if (otherAmountPaidCount == null) {
			otherAmountPaidCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_COUNT);
		}
		return otherAmountPaidCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherAmountPaidQualifier> getOtherAmountPaidQualifier() {
		if (otherAmountPaidQualifier == null) {
			otherAmountPaidQualifier = new EDataTypeUniqueEList<OtherAmountPaidQualifier>(OtherAmountPaidQualifier.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_QUALIFIER);
		}
		return otherAmountPaidQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherAmountPaid() {
		if (otherAmountPaid == null) {
			otherAmountPaid = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID);
		}
		return otherAmountPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerAmountRecognized() {
		if (otherPayerAmountRecognized == null) {
			otherPayerAmountRecognized = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_PAYER_AMOUNT_RECOGNIZED);
		}
		return otherPayerAmountRecognized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getTotalAmountPaid() {
		if (totalAmountPaid == null) {
			totalAmountPaid = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__TOTAL_AMOUNT_PAID);
		}
		return totalAmountPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasisOfReimbursementDetermination> getBasisOfReimbursementDetermination() {
		if (basisOfReimbursementDetermination == null) {
			basisOfReimbursementDetermination = new EDataTypeUniqueEList<BasisOfReimbursementDetermination>(BasisOfReimbursementDetermination.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_REIMBURSEMENT_DETERMINATION);
		}
		return basisOfReimbursementDetermination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAmountAttributedToSalesTax() {
		if (amountAttributedToSalesTax == null) {
			amountAttributedToSalesTax = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_SALES_TAX);
		}
		return amountAttributedToSalesTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAccumulatedDeductibleAmount() {
		if (accumulatedDeductibleAmount == null) {
			accumulatedDeductibleAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__ACCUMULATED_DEDUCTIBLE_AMOUNT);
		}
		return accumulatedDeductibleAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRemainingDeductibleAmount() {
		if (remainingDeductibleAmount == null) {
			remainingDeductibleAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_DEDUCTIBLE_AMOUNT);
		}
		return remainingDeductibleAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRemainingBenefitAmount() {
		if (remainingBenefitAmount == null) {
			remainingBenefitAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_BENEFIT_AMOUNT);
		}
		return remainingBenefitAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAmountAppliedToPeriodicDeductible() {
		if (amountAppliedToPeriodicDeductible == null) {
			amountAppliedToPeriodicDeductible = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_APPLIED_TO_PERIODIC_DEDUCTIBLE);
		}
		return amountAppliedToPeriodicDeductible;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAmountOfCopay() {
		if (amountOfCopay == null) {
			amountOfCopay = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COPAY);
		}
		return amountOfCopay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAmountExceedingPeriodicBenefitMaximum() {
		if (amountExceedingPeriodicBenefitMaximum == null) {
			amountExceedingPeriodicBenefitMaximum = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_EXCEEDING_PERIODIC_BENEFIT_MAXIMUM);
		}
		return amountExceedingPeriodicBenefitMaximum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasisOfCalculationDispensingFee> getBasisOfCalculationdispensingFee() {
		if (basisOfCalculationdispensingFee == null) {
			basisOfCalculationdispensingFee = new EDataTypeUniqueEList<BasisOfCalculationDispensingFee>(BasisOfCalculationDispensingFee.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONDISPENSING_FEE);
		}
		return basisOfCalculationdispensingFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasisOfCalculationCopay> getBasisOfCalculationcopay() {
		if (basisOfCalculationcopay == null) {
			basisOfCalculationcopay = new EDataTypeUniqueEList<BasisOfCalculationCopay>(BasisOfCalculationCopay.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOPAY);
		}
		return basisOfCalculationcopay;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasisOfCalculationFlatSalesTax> getBasisOfCalculationflatSalesTax() {
		if (basisOfCalculationflatSalesTax == null) {
			basisOfCalculationflatSalesTax = new EDataTypeUniqueEList<BasisOfCalculationFlatSalesTax>(BasisOfCalculationFlatSalesTax.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONFLAT_SALES_TAX);
		}
		return basisOfCalculationflatSalesTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasisOfCalculationPercentageSalesTax> getBasisOfCalculationpercentageSalesTax() {
		if (basisOfCalculationpercentageSalesTax == null) {
			basisOfCalculationpercentageSalesTax = new EDataTypeUniqueEList<BasisOfCalculationPercentageSalesTax>(BasisOfCalculationPercentageSalesTax.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONPERCENTAGE_SALES_TAX);
		}
		return basisOfCalculationpercentageSalesTax;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAmountAttributedToProcessorFee() {
		if (amountAttributedToProcessorFee == null) {
			amountAttributedToProcessorFee = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROCESSOR_FEE);
		}
		return amountAttributedToProcessorFee;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientSalesTaxAmount() {
		if (patientSalesTaxAmount == null) {
			patientSalesTaxAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_SALES_TAX_AMOUNT);
		}
		return patientSalesTaxAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPlanSalesTaxAmount() {
		if (planSalesTaxAmount == null) {
			planSalesTaxAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__PLAN_SALES_TAX_AMOUNT);
		}
		return planSalesTaxAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAmountOfCoinsurance() {
		if (amountOfCoinsurance == null) {
			amountOfCoinsurance = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COINSURANCE);
		}
		return amountOfCoinsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BasisOfCalculationCoinsurance> getBasisOfCalculationcoinsurance() {
		if (basisOfCalculationcoinsurance == null) {
			basisOfCalculationcoinsurance = new EDataTypeUniqueEList<BasisOfCalculationCoinsurance>(BasisOfCalculationCoinsurance.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOINSURANCE);
		}
		return basisOfCalculationcoinsurance;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getBenefitStageCount() {
		if (benefitStageCount == null) {
			benefitStageCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_COUNT);
		}
		return benefitStageCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<BenefitStageQualifier> getBenefitStageQualifier() {
		if (benefitStageQualifier == null) {
			benefitStageQualifier = new EDataTypeUniqueEList<BenefitStageQualifier>(BenefitStageQualifier.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_QUALIFIER);
		}
		return benefitStageQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getBenefitStageAmount() {
		if (benefitStageAmount == null) {
			benefitStageAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_AMOUNT);
		}
		return benefitStageAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getEstimatedGenericSavings() {
		if (estimatedGenericSavings == null) {
			estimatedGenericSavings = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__ESTIMATED_GENERIC_SAVINGS);
		}
		return estimatedGenericSavings;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getSpendingAccountAmountRemaining() {
		if (spendingAccountAmountRemaining == null) {
			spendingAccountAmountRemaining = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__SPENDING_ACCOUNT_AMOUNT_REMAINING);
		}
		return spendingAccountAmountRemaining;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getHealthPlanfundedAssistanceAmount() {
		if (healthPlanfundedAssistanceAmount == null) {
			healthPlanfundedAssistanceAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__HEALTH_PLANFUNDED_ASSISTANCE_AMOUNT);
		}
		return healthPlanfundedAssistanceAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAmountAttributedToProviderNetworkSelection() {
		if (amountAttributedToProviderNetworkSelection == null) {
			amountAttributedToProviderNetworkSelection = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROVIDER_NETWORK_SELECTION);
		}
		return amountAttributedToProviderNetworkSelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAmountAttributedToProductSelectionbrandDrug() {
		if (amountAttributedToProductSelectionbrandDrug == null) {
			amountAttributedToProductSelectionbrandDrug = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_DRUG);
		}
		return amountAttributedToProductSelectionbrandDrug;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAmountAttributedToProductSelectionnonpreferredFormularySelection() {
		if (amountAttributedToProductSelectionnonpreferredFormularySelection == null) {
			amountAttributedToProductSelectionnonpreferredFormularySelection = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONNONPREFERRED_FORMULARY_SELECTION);
		}
		return amountAttributedToProductSelectionnonpreferredFormularySelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection() {
		if (amountAttributedToProductSelectionbrandNonpreferredFormularySelection == null) {
			amountAttributedToProductSelectionbrandNonpreferredFormularySelection = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_NONPREFERRED_FORMULARY_SELECTION);
		}
		return amountAttributedToProductSelectionbrandNonpreferredFormularySelection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAmountAttributedToCoverageGap() {
		if (amountAttributedToCoverageGap == null) {
			amountAttributedToCoverageGap = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_COVERAGE_GAP);
		}
		return amountAttributedToCoverageGap;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getIngredientCostContractedreimbursableAmount() {
		if (ingredientCostContractedreimbursableAmount == null) {
			ingredientCostContractedreimbursableAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_CONTRACTEDREIMBURSABLE_AMOUNT);
		}
		return ingredientCostContractedreimbursableAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDispensingFeeContractedreimbursableAmount() {
		if (dispensingFeeContractedreimbursableAmount == null) {
			dispensingFeeContractedreimbursableAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_CONTRACTEDREIMBURSABLE_AMOUNT);
		}
		return dispensingFeeContractedreimbursableAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_PAY_AMOUNT:
				return ((InternalEList<?>)getPatientPayAmount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_PAID:
				return ((InternalEList<?>)getIngredientCostPaid()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_PAID:
				return ((InternalEList<?>)getDispensingFeePaid()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_PAID:
				return ((InternalEList<?>)getFlatSalesTaxAmountPaid()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_PAID:
				return ((InternalEList<?>)getPercentageSalesTaxAmountPaid()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_PAID:
				return ((InternalEList<?>)getPercentageSalesTaxRatePaid()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INCENTIVE_AMOUNT_PAID:
				return ((InternalEList<?>)getIncentiveAmountPaid()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_PAID:
				return ((InternalEList<?>)getProfessionalServiceFeePaid()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_COUNT:
				return ((InternalEList<?>)getOtherAmountPaidCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID:
				return ((InternalEList<?>)getOtherAmountPaid()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_PAYER_AMOUNT_RECOGNIZED:
				return ((InternalEList<?>)getOtherPayerAmountRecognized()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__TOTAL_AMOUNT_PAID:
				return ((InternalEList<?>)getTotalAmountPaid()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_SALES_TAX:
				return ((InternalEList<?>)getAmountAttributedToSalesTax()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__ACCUMULATED_DEDUCTIBLE_AMOUNT:
				return ((InternalEList<?>)getAccumulatedDeductibleAmount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_DEDUCTIBLE_AMOUNT:
				return ((InternalEList<?>)getRemainingDeductibleAmount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_BENEFIT_AMOUNT:
				return ((InternalEList<?>)getRemainingBenefitAmount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_APPLIED_TO_PERIODIC_DEDUCTIBLE:
				return ((InternalEList<?>)getAmountAppliedToPeriodicDeductible()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COPAY:
				return ((InternalEList<?>)getAmountOfCopay()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_EXCEEDING_PERIODIC_BENEFIT_MAXIMUM:
				return ((InternalEList<?>)getAmountExceedingPeriodicBenefitMaximum()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROCESSOR_FEE:
				return ((InternalEList<?>)getAmountAttributedToProcessorFee()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_SALES_TAX_AMOUNT:
				return ((InternalEList<?>)getPatientSalesTaxAmount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PLAN_SALES_TAX_AMOUNT:
				return ((InternalEList<?>)getPlanSalesTaxAmount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COINSURANCE:
				return ((InternalEList<?>)getAmountOfCoinsurance()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_COUNT:
				return ((InternalEList<?>)getBenefitStageCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_AMOUNT:
				return ((InternalEList<?>)getBenefitStageAmount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__ESTIMATED_GENERIC_SAVINGS:
				return ((InternalEList<?>)getEstimatedGenericSavings()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__SPENDING_ACCOUNT_AMOUNT_REMAINING:
				return ((InternalEList<?>)getSpendingAccountAmountRemaining()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__HEALTH_PLANFUNDED_ASSISTANCE_AMOUNT:
				return ((InternalEList<?>)getHealthPlanfundedAssistanceAmount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROVIDER_NETWORK_SELECTION:
				return ((InternalEList<?>)getAmountAttributedToProviderNetworkSelection()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_DRUG:
				return ((InternalEList<?>)getAmountAttributedToProductSelectionbrandDrug()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONNONPREFERRED_FORMULARY_SELECTION:
				return ((InternalEList<?>)getAmountAttributedToProductSelectionnonpreferredFormularySelection()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_NONPREFERRED_FORMULARY_SELECTION:
				return ((InternalEList<?>)getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_COVERAGE_GAP:
				return ((InternalEList<?>)getAmountAttributedToCoverageGap()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_CONTRACTEDREIMBURSABLE_AMOUNT:
				return ((InternalEList<?>)getIngredientCostContractedreimbursableAmount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_CONTRACTEDREIMBURSABLE_AMOUNT:
				return ((InternalEList<?>)getDispensingFeeContractedreimbursableAmount()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_PAY_AMOUNT:
				return getPatientPayAmount();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_PAID:
				return getIngredientCostPaid();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_PAID:
				return getDispensingFeePaid();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__TAX_EXEMPT_INDICATOR:
				return getTaxExemptIndicator();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_PAID:
				return getFlatSalesTaxAmountPaid();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_PAID:
				return getPercentageSalesTaxAmountPaid();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_PAID:
				return getPercentageSalesTaxRatePaid();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_PAID:
				return getPercentageSalesTaxBasisPaid();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INCENTIVE_AMOUNT_PAID:
				return getIncentiveAmountPaid();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_PAID:
				return getProfessionalServiceFeePaid();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_COUNT:
				return getOtherAmountPaidCount();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_QUALIFIER:
				return getOtherAmountPaidQualifier();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID:
				return getOtherAmountPaid();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_PAYER_AMOUNT_RECOGNIZED:
				return getOtherPayerAmountRecognized();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__TOTAL_AMOUNT_PAID:
				return getTotalAmountPaid();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_REIMBURSEMENT_DETERMINATION:
				return getBasisOfReimbursementDetermination();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_SALES_TAX:
				return getAmountAttributedToSalesTax();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__ACCUMULATED_DEDUCTIBLE_AMOUNT:
				return getAccumulatedDeductibleAmount();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_DEDUCTIBLE_AMOUNT:
				return getRemainingDeductibleAmount();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_BENEFIT_AMOUNT:
				return getRemainingBenefitAmount();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_APPLIED_TO_PERIODIC_DEDUCTIBLE:
				return getAmountAppliedToPeriodicDeductible();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COPAY:
				return getAmountOfCopay();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_EXCEEDING_PERIODIC_BENEFIT_MAXIMUM:
				return getAmountExceedingPeriodicBenefitMaximum();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONDISPENSING_FEE:
				return getBasisOfCalculationdispensingFee();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOPAY:
				return getBasisOfCalculationcopay();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONFLAT_SALES_TAX:
				return getBasisOfCalculationflatSalesTax();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONPERCENTAGE_SALES_TAX:
				return getBasisOfCalculationpercentageSalesTax();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROCESSOR_FEE:
				return getAmountAttributedToProcessorFee();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_SALES_TAX_AMOUNT:
				return getPatientSalesTaxAmount();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PLAN_SALES_TAX_AMOUNT:
				return getPlanSalesTaxAmount();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COINSURANCE:
				return getAmountOfCoinsurance();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOINSURANCE:
				return getBasisOfCalculationcoinsurance();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_COUNT:
				return getBenefitStageCount();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_QUALIFIER:
				return getBenefitStageQualifier();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_AMOUNT:
				return getBenefitStageAmount();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__ESTIMATED_GENERIC_SAVINGS:
				return getEstimatedGenericSavings();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__SPENDING_ACCOUNT_AMOUNT_REMAINING:
				return getSpendingAccountAmountRemaining();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__HEALTH_PLANFUNDED_ASSISTANCE_AMOUNT:
				return getHealthPlanfundedAssistanceAmount();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROVIDER_NETWORK_SELECTION:
				return getAmountAttributedToProviderNetworkSelection();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_DRUG:
				return getAmountAttributedToProductSelectionbrandDrug();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONNONPREFERRED_FORMULARY_SELECTION:
				return getAmountAttributedToProductSelectionnonpreferredFormularySelection();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_NONPREFERRED_FORMULARY_SELECTION:
				return getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_COVERAGE_GAP:
				return getAmountAttributedToCoverageGap();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_CONTRACTEDREIMBURSABLE_AMOUNT:
				return getIngredientCostContractedreimbursableAmount();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_CONTRACTEDREIMBURSABLE_AMOUNT:
				return getDispensingFeeContractedreimbursableAmount();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_PAY_AMOUNT:
				getPatientPayAmount().clear();
				getPatientPayAmount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_PAID:
				getIngredientCostPaid().clear();
				getIngredientCostPaid().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_PAID:
				getDispensingFeePaid().clear();
				getDispensingFeePaid().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__TAX_EXEMPT_INDICATOR:
				getTaxExemptIndicator().clear();
				getTaxExemptIndicator().addAll((Collection<? extends TaxExemptIndicator>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_PAID:
				getFlatSalesTaxAmountPaid().clear();
				getFlatSalesTaxAmountPaid().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_PAID:
				getPercentageSalesTaxAmountPaid().clear();
				getPercentageSalesTaxAmountPaid().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_PAID:
				getPercentageSalesTaxRatePaid().clear();
				getPercentageSalesTaxRatePaid().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_PAID:
				getPercentageSalesTaxBasisPaid().clear();
				getPercentageSalesTaxBasisPaid().addAll((Collection<? extends PercentageSalesTaxBasisPaid>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INCENTIVE_AMOUNT_PAID:
				getIncentiveAmountPaid().clear();
				getIncentiveAmountPaid().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_PAID:
				getProfessionalServiceFeePaid().clear();
				getProfessionalServiceFeePaid().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_COUNT:
				getOtherAmountPaidCount().clear();
				getOtherAmountPaidCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_QUALIFIER:
				getOtherAmountPaidQualifier().clear();
				getOtherAmountPaidQualifier().addAll((Collection<? extends OtherAmountPaidQualifier>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID:
				getOtherAmountPaid().clear();
				getOtherAmountPaid().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_PAYER_AMOUNT_RECOGNIZED:
				getOtherPayerAmountRecognized().clear();
				getOtherPayerAmountRecognized().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__TOTAL_AMOUNT_PAID:
				getTotalAmountPaid().clear();
				getTotalAmountPaid().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_REIMBURSEMENT_DETERMINATION:
				getBasisOfReimbursementDetermination().clear();
				getBasisOfReimbursementDetermination().addAll((Collection<? extends BasisOfReimbursementDetermination>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_SALES_TAX:
				getAmountAttributedToSalesTax().clear();
				getAmountAttributedToSalesTax().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__ACCUMULATED_DEDUCTIBLE_AMOUNT:
				getAccumulatedDeductibleAmount().clear();
				getAccumulatedDeductibleAmount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_DEDUCTIBLE_AMOUNT:
				getRemainingDeductibleAmount().clear();
				getRemainingDeductibleAmount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_BENEFIT_AMOUNT:
				getRemainingBenefitAmount().clear();
				getRemainingBenefitAmount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_APPLIED_TO_PERIODIC_DEDUCTIBLE:
				getAmountAppliedToPeriodicDeductible().clear();
				getAmountAppliedToPeriodicDeductible().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COPAY:
				getAmountOfCopay().clear();
				getAmountOfCopay().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_EXCEEDING_PERIODIC_BENEFIT_MAXIMUM:
				getAmountExceedingPeriodicBenefitMaximum().clear();
				getAmountExceedingPeriodicBenefitMaximum().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONDISPENSING_FEE:
				getBasisOfCalculationdispensingFee().clear();
				getBasisOfCalculationdispensingFee().addAll((Collection<? extends BasisOfCalculationDispensingFee>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOPAY:
				getBasisOfCalculationcopay().clear();
				getBasisOfCalculationcopay().addAll((Collection<? extends BasisOfCalculationCopay>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONFLAT_SALES_TAX:
				getBasisOfCalculationflatSalesTax().clear();
				getBasisOfCalculationflatSalesTax().addAll((Collection<? extends BasisOfCalculationFlatSalesTax>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONPERCENTAGE_SALES_TAX:
				getBasisOfCalculationpercentageSalesTax().clear();
				getBasisOfCalculationpercentageSalesTax().addAll((Collection<? extends BasisOfCalculationPercentageSalesTax>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROCESSOR_FEE:
				getAmountAttributedToProcessorFee().clear();
				getAmountAttributedToProcessorFee().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_SALES_TAX_AMOUNT:
				getPatientSalesTaxAmount().clear();
				getPatientSalesTaxAmount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PLAN_SALES_TAX_AMOUNT:
				getPlanSalesTaxAmount().clear();
				getPlanSalesTaxAmount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COINSURANCE:
				getAmountOfCoinsurance().clear();
				getAmountOfCoinsurance().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOINSURANCE:
				getBasisOfCalculationcoinsurance().clear();
				getBasisOfCalculationcoinsurance().addAll((Collection<? extends BasisOfCalculationCoinsurance>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_COUNT:
				getBenefitStageCount().clear();
				getBenefitStageCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_QUALIFIER:
				getBenefitStageQualifier().clear();
				getBenefitStageQualifier().addAll((Collection<? extends BenefitStageQualifier>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_AMOUNT:
				getBenefitStageAmount().clear();
				getBenefitStageAmount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__ESTIMATED_GENERIC_SAVINGS:
				getEstimatedGenericSavings().clear();
				getEstimatedGenericSavings().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__SPENDING_ACCOUNT_AMOUNT_REMAINING:
				getSpendingAccountAmountRemaining().clear();
				getSpendingAccountAmountRemaining().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__HEALTH_PLANFUNDED_ASSISTANCE_AMOUNT:
				getHealthPlanfundedAssistanceAmount().clear();
				getHealthPlanfundedAssistanceAmount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROVIDER_NETWORK_SELECTION:
				getAmountAttributedToProviderNetworkSelection().clear();
				getAmountAttributedToProviderNetworkSelection().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_DRUG:
				getAmountAttributedToProductSelectionbrandDrug().clear();
				getAmountAttributedToProductSelectionbrandDrug().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONNONPREFERRED_FORMULARY_SELECTION:
				getAmountAttributedToProductSelectionnonpreferredFormularySelection().clear();
				getAmountAttributedToProductSelectionnonpreferredFormularySelection().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_NONPREFERRED_FORMULARY_SELECTION:
				getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection().clear();
				getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_COVERAGE_GAP:
				getAmountAttributedToCoverageGap().clear();
				getAmountAttributedToCoverageGap().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_CONTRACTEDREIMBURSABLE_AMOUNT:
				getIngredientCostContractedreimbursableAmount().clear();
				getIngredientCostContractedreimbursableAmount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_CONTRACTEDREIMBURSABLE_AMOUNT:
				getDispensingFeeContractedreimbursableAmount().clear();
				getDispensingFeeContractedreimbursableAmount().addAll((Collection<? extends Field>)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_PAY_AMOUNT:
				getPatientPayAmount().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_PAID:
				getIngredientCostPaid().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_PAID:
				getDispensingFeePaid().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__TAX_EXEMPT_INDICATOR:
				getTaxExemptIndicator().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_PAID:
				getFlatSalesTaxAmountPaid().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_PAID:
				getPercentageSalesTaxAmountPaid().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_PAID:
				getPercentageSalesTaxRatePaid().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_PAID:
				getPercentageSalesTaxBasisPaid().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INCENTIVE_AMOUNT_PAID:
				getIncentiveAmountPaid().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_PAID:
				getProfessionalServiceFeePaid().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_COUNT:
				getOtherAmountPaidCount().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_QUALIFIER:
				getOtherAmountPaidQualifier().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID:
				getOtherAmountPaid().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_PAYER_AMOUNT_RECOGNIZED:
				getOtherPayerAmountRecognized().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__TOTAL_AMOUNT_PAID:
				getTotalAmountPaid().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_REIMBURSEMENT_DETERMINATION:
				getBasisOfReimbursementDetermination().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_SALES_TAX:
				getAmountAttributedToSalesTax().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__ACCUMULATED_DEDUCTIBLE_AMOUNT:
				getAccumulatedDeductibleAmount().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_DEDUCTIBLE_AMOUNT:
				getRemainingDeductibleAmount().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_BENEFIT_AMOUNT:
				getRemainingBenefitAmount().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_APPLIED_TO_PERIODIC_DEDUCTIBLE:
				getAmountAppliedToPeriodicDeductible().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COPAY:
				getAmountOfCopay().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_EXCEEDING_PERIODIC_BENEFIT_MAXIMUM:
				getAmountExceedingPeriodicBenefitMaximum().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONDISPENSING_FEE:
				getBasisOfCalculationdispensingFee().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOPAY:
				getBasisOfCalculationcopay().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONFLAT_SALES_TAX:
				getBasisOfCalculationflatSalesTax().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONPERCENTAGE_SALES_TAX:
				getBasisOfCalculationpercentageSalesTax().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROCESSOR_FEE:
				getAmountAttributedToProcessorFee().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_SALES_TAX_AMOUNT:
				getPatientSalesTaxAmount().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PLAN_SALES_TAX_AMOUNT:
				getPlanSalesTaxAmount().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COINSURANCE:
				getAmountOfCoinsurance().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOINSURANCE:
				getBasisOfCalculationcoinsurance().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_COUNT:
				getBenefitStageCount().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_QUALIFIER:
				getBenefitStageQualifier().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_AMOUNT:
				getBenefitStageAmount().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__ESTIMATED_GENERIC_SAVINGS:
				getEstimatedGenericSavings().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__SPENDING_ACCOUNT_AMOUNT_REMAINING:
				getSpendingAccountAmountRemaining().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__HEALTH_PLANFUNDED_ASSISTANCE_AMOUNT:
				getHealthPlanfundedAssistanceAmount().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROVIDER_NETWORK_SELECTION:
				getAmountAttributedToProviderNetworkSelection().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_DRUG:
				getAmountAttributedToProductSelectionbrandDrug().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONNONPREFERRED_FORMULARY_SELECTION:
				getAmountAttributedToProductSelectionnonpreferredFormularySelection().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_NONPREFERRED_FORMULARY_SELECTION:
				getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_COVERAGE_GAP:
				getAmountAttributedToCoverageGap().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_CONTRACTEDREIMBURSABLE_AMOUNT:
				getIngredientCostContractedreimbursableAmount().clear();
				return;
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_CONTRACTEDREIMBURSABLE_AMOUNT:
				getDispensingFeeContractedreimbursableAmount().clear();
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_PAY_AMOUNT:
				return patientPayAmount != null && !patientPayAmount.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_PAID:
				return ingredientCostPaid != null && !ingredientCostPaid.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_PAID:
				return dispensingFeePaid != null && !dispensingFeePaid.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__TAX_EXEMPT_INDICATOR:
				return taxExemptIndicator != null && !taxExemptIndicator.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_PAID:
				return flatSalesTaxAmountPaid != null && !flatSalesTaxAmountPaid.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_PAID:
				return percentageSalesTaxAmountPaid != null && !percentageSalesTaxAmountPaid.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_PAID:
				return percentageSalesTaxRatePaid != null && !percentageSalesTaxRatePaid.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_PAID:
				return percentageSalesTaxBasisPaid != null && !percentageSalesTaxBasisPaid.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INCENTIVE_AMOUNT_PAID:
				return incentiveAmountPaid != null && !incentiveAmountPaid.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_PAID:
				return professionalServiceFeePaid != null && !professionalServiceFeePaid.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_COUNT:
				return otherAmountPaidCount != null && !otherAmountPaidCount.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_QUALIFIER:
				return otherAmountPaidQualifier != null && !otherAmountPaidQualifier.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID:
				return otherAmountPaid != null && !otherAmountPaid.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__OTHER_PAYER_AMOUNT_RECOGNIZED:
				return otherPayerAmountRecognized != null && !otherPayerAmountRecognized.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__TOTAL_AMOUNT_PAID:
				return totalAmountPaid != null && !totalAmountPaid.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_REIMBURSEMENT_DETERMINATION:
				return basisOfReimbursementDetermination != null && !basisOfReimbursementDetermination.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_SALES_TAX:
				return amountAttributedToSalesTax != null && !amountAttributedToSalesTax.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__ACCUMULATED_DEDUCTIBLE_AMOUNT:
				return accumulatedDeductibleAmount != null && !accumulatedDeductibleAmount.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_DEDUCTIBLE_AMOUNT:
				return remainingDeductibleAmount != null && !remainingDeductibleAmount.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__REMAINING_BENEFIT_AMOUNT:
				return remainingBenefitAmount != null && !remainingBenefitAmount.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_APPLIED_TO_PERIODIC_DEDUCTIBLE:
				return amountAppliedToPeriodicDeductible != null && !amountAppliedToPeriodicDeductible.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COPAY:
				return amountOfCopay != null && !amountOfCopay.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_EXCEEDING_PERIODIC_BENEFIT_MAXIMUM:
				return amountExceedingPeriodicBenefitMaximum != null && !amountExceedingPeriodicBenefitMaximum.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONDISPENSING_FEE:
				return basisOfCalculationdispensingFee != null && !basisOfCalculationdispensingFee.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOPAY:
				return basisOfCalculationcopay != null && !basisOfCalculationcopay.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONFLAT_SALES_TAX:
				return basisOfCalculationflatSalesTax != null && !basisOfCalculationflatSalesTax.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONPERCENTAGE_SALES_TAX:
				return basisOfCalculationpercentageSalesTax != null && !basisOfCalculationpercentageSalesTax.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROCESSOR_FEE:
				return amountAttributedToProcessorFee != null && !amountAttributedToProcessorFee.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PATIENT_SALES_TAX_AMOUNT:
				return patientSalesTaxAmount != null && !patientSalesTaxAmount.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__PLAN_SALES_TAX_AMOUNT:
				return planSalesTaxAmount != null && !planSalesTaxAmount.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COINSURANCE:
				return amountOfCoinsurance != null && !amountOfCoinsurance.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOINSURANCE:
				return basisOfCalculationcoinsurance != null && !basisOfCalculationcoinsurance.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_COUNT:
				return benefitStageCount != null && !benefitStageCount.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_QUALIFIER:
				return benefitStageQualifier != null && !benefitStageQualifier.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_AMOUNT:
				return benefitStageAmount != null && !benefitStageAmount.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__ESTIMATED_GENERIC_SAVINGS:
				return estimatedGenericSavings != null && !estimatedGenericSavings.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__SPENDING_ACCOUNT_AMOUNT_REMAINING:
				return spendingAccountAmountRemaining != null && !spendingAccountAmountRemaining.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__HEALTH_PLANFUNDED_ASSISTANCE_AMOUNT:
				return healthPlanfundedAssistanceAmount != null && !healthPlanfundedAssistanceAmount.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROVIDER_NETWORK_SELECTION:
				return amountAttributedToProviderNetworkSelection != null && !amountAttributedToProviderNetworkSelection.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_DRUG:
				return amountAttributedToProductSelectionbrandDrug != null && !amountAttributedToProductSelectionbrandDrug.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONNONPREFERRED_FORMULARY_SELECTION:
				return amountAttributedToProductSelectionnonpreferredFormularySelection != null && !amountAttributedToProductSelectionnonpreferredFormularySelection.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_NONPREFERRED_FORMULARY_SELECTION:
				return amountAttributedToProductSelectionbrandNonpreferredFormularySelection != null && !amountAttributedToProductSelectionbrandNonpreferredFormularySelection.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_COVERAGE_GAP:
				return amountAttributedToCoverageGap != null && !amountAttributedToCoverageGap.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_CONTRACTEDREIMBURSABLE_AMOUNT:
				return ingredientCostContractedreimbursableAmount != null && !ingredientCostContractedreimbursableAmount.isEmpty();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_CONTRACTEDREIMBURSABLE_AMOUNT:
				return dispensingFeeContractedreimbursableAmount != null && !dispensingFeeContractedreimbursableAmount.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (segmentIdentification: ");
		result.append(segmentIdentification);
		result.append(", taxExemptIndicator: ");
		result.append(taxExemptIndicator);
		result.append(", percentageSalesTaxBasisPaid: ");
		result.append(percentageSalesTaxBasisPaid);
		result.append(", otherAmountPaidQualifier: ");
		result.append(otherAmountPaidQualifier);
		result.append(", basisOfReimbursementDetermination: ");
		result.append(basisOfReimbursementDetermination);
		result.append(", basisOfCalculationdispensingFee: ");
		result.append(basisOfCalculationdispensingFee);
		result.append(", basisOfCalculationcopay: ");
		result.append(basisOfCalculationcopay);
		result.append(", basisOfCalculationflatSalesTax: ");
		result.append(basisOfCalculationflatSalesTax);
		result.append(", basisOfCalculationpercentageSalesTax: ");
		result.append(basisOfCalculationpercentageSalesTax);
		result.append(", basisOfCalculationcoinsurance: ");
		result.append(basisOfCalculationcoinsurance);
		result.append(", benefitStageQualifier: ");
		result.append(benefitStageQualifier);
		result.append(')');
		return result.toString();
	}

} //ResponsePricingSegmentImpl
