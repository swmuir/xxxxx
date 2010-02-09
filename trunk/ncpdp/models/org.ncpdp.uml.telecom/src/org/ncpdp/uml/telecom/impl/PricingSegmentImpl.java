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

import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.PricingSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pricing Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getIngredientCostSubmitted <em>Ingredient Cost Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getDispensingFeeSubmitted <em>Dispensing Fee Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getProfessionalServiceFeeSubmitted <em>Professional Service Fee Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getPatientPaidAmountSubmitted <em>Patient Paid Amount Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getIncentiveAmountSubmitted <em>Incentive Amount Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getOtherAmountClaimedSubmittedCount <em>Other Amount Claimed Submitted Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getOtherAmountClaimedSubmittedQualifier <em>Other Amount Claimed Submitted Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getOtherAmountClaimedSubmitted <em>Other Amount Claimed Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getFlatSalesTaxAmountSubmitted <em>Flat Sales Tax Amount Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getPercentageSalesTaxAmountSubmitted <em>Percentage Sales Tax Amount Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getPercentageSalesTaxRateSubmitted <em>Percentage Sales Tax Rate Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getPercentageSalesTaxBasisSubmitted <em>Percentage Sales Tax Basis Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getUsualAndCustomaryCharge <em>Usual And Customary Charge</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getGrossAmountDue <em>Gross Amount Due</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getBasisOfCostDetermination <em>Basis Of Cost Determination</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl#getMedicaidPaidAmount <em>Medicaid Paid Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PricingSegmentImpl extends EObjectImpl implements PricingSegment {
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
	 * The cached value of the '{@link #getIngredientCostSubmitted() <em>Ingredient Cost Submitted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIngredientCostSubmitted()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> ingredientCostSubmitted;

	/**
	 * The cached value of the '{@link #getDispensingFeeSubmitted() <em>Dispensing Fee Submitted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispensingFeeSubmitted()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> dispensingFeeSubmitted;

	/**
	 * The cached value of the '{@link #getProfessionalServiceFeeSubmitted() <em>Professional Service Fee Submitted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessionalServiceFeeSubmitted()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> professionalServiceFeeSubmitted;

	/**
	 * The cached value of the '{@link #getPatientPaidAmountSubmitted() <em>Patient Paid Amount Submitted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPaidAmountSubmitted()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientPaidAmountSubmitted;

	/**
	 * The cached value of the '{@link #getIncentiveAmountSubmitted() <em>Incentive Amount Submitted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIncentiveAmountSubmitted()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> incentiveAmountSubmitted;

	/**
	 * The cached value of the '{@link #getOtherAmountClaimedSubmittedCount() <em>Other Amount Claimed Submitted Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAmountClaimedSubmittedCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherAmountClaimedSubmittedCount;

	/**
	 * The cached value of the '{@link #getOtherAmountClaimedSubmittedQualifier() <em>Other Amount Claimed Submitted Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAmountClaimedSubmittedQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherAmountClaimedSubmittedQualifier;

	/**
	 * The cached value of the '{@link #getOtherAmountClaimedSubmitted() <em>Other Amount Claimed Submitted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherAmountClaimedSubmitted()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherAmountClaimedSubmitted;

	/**
	 * The cached value of the '{@link #getFlatSalesTaxAmountSubmitted() <em>Flat Sales Tax Amount Submitted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFlatSalesTaxAmountSubmitted()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> flatSalesTaxAmountSubmitted;

	/**
	 * The cached value of the '{@link #getPercentageSalesTaxAmountSubmitted() <em>Percentage Sales Tax Amount Submitted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageSalesTaxAmountSubmitted()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> percentageSalesTaxAmountSubmitted;

	/**
	 * The cached value of the '{@link #getPercentageSalesTaxRateSubmitted() <em>Percentage Sales Tax Rate Submitted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageSalesTaxRateSubmitted()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> percentageSalesTaxRateSubmitted;

	/**
	 * The cached value of the '{@link #getPercentageSalesTaxBasisSubmitted() <em>Percentage Sales Tax Basis Submitted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPercentageSalesTaxBasisSubmitted()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> percentageSalesTaxBasisSubmitted;

	/**
	 * The cached value of the '{@link #getUsualAndCustomaryCharge() <em>Usual And Customary Charge</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsualAndCustomaryCharge()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> usualAndCustomaryCharge;

	/**
	 * The cached value of the '{@link #getGrossAmountDue() <em>Gross Amount Due</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGrossAmountDue()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> grossAmountDue;

	/**
	 * The cached value of the '{@link #getBasisOfCostDetermination() <em>Basis Of Cost Determination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisOfCostDetermination()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> basisOfCostDetermination;

	/**
	 * The cached value of the '{@link #getMedicaidPaidAmount() <em>Medicaid Paid Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicaidPaidAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> medicaidPaidAmount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PricingSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.PRICING_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.PRICING_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getIngredientCostSubmitted() {
		if (ingredientCostSubmitted == null) {
			ingredientCostSubmitted = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__INGREDIENT_COST_SUBMITTED);
		}
		return ingredientCostSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDispensingFeeSubmitted() {
		if (dispensingFeeSubmitted == null) {
			dispensingFeeSubmitted = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__DISPENSING_FEE_SUBMITTED);
		}
		return dispensingFeeSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getProfessionalServiceFeeSubmitted() {
		if (professionalServiceFeeSubmitted == null) {
			professionalServiceFeeSubmitted = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_SUBMITTED);
		}
		return professionalServiceFeeSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientPaidAmountSubmitted() {
		if (patientPaidAmountSubmitted == null) {
			patientPaidAmountSubmitted = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__PATIENT_PAID_AMOUNT_SUBMITTED);
		}
		return patientPaidAmountSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getIncentiveAmountSubmitted() {
		if (incentiveAmountSubmitted == null) {
			incentiveAmountSubmitted = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__INCENTIVE_AMOUNT_SUBMITTED);
		}
		return incentiveAmountSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherAmountClaimedSubmittedCount() {
		if (otherAmountClaimedSubmittedCount == null) {
			otherAmountClaimedSubmittedCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_COUNT);
		}
		return otherAmountClaimedSubmittedCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherAmountClaimedSubmittedQualifier() {
		if (otherAmountClaimedSubmittedQualifier == null) {
			otherAmountClaimedSubmittedQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_QUALIFIER);
		}
		return otherAmountClaimedSubmittedQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherAmountClaimedSubmitted() {
		if (otherAmountClaimedSubmitted == null) {
			otherAmountClaimedSubmitted = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED);
		}
		return otherAmountClaimedSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFlatSalesTaxAmountSubmitted() {
		if (flatSalesTaxAmountSubmitted == null) {
			flatSalesTaxAmountSubmitted = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_SUBMITTED);
		}
		return flatSalesTaxAmountSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPercentageSalesTaxAmountSubmitted() {
		if (percentageSalesTaxAmountSubmitted == null) {
			percentageSalesTaxAmountSubmitted = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_SUBMITTED);
		}
		return percentageSalesTaxAmountSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPercentageSalesTaxRateSubmitted() {
		if (percentageSalesTaxRateSubmitted == null) {
			percentageSalesTaxRateSubmitted = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_SUBMITTED);
		}
		return percentageSalesTaxRateSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPercentageSalesTaxBasisSubmitted() {
		if (percentageSalesTaxBasisSubmitted == null) {
			percentageSalesTaxBasisSubmitted = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_SUBMITTED);
		}
		return percentageSalesTaxBasisSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getUsualAndCustomaryCharge() {
		if (usualAndCustomaryCharge == null) {
			usualAndCustomaryCharge = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__USUAL_AND_CUSTOMARY_CHARGE);
		}
		return usualAndCustomaryCharge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getGrossAmountDue() {
		if (grossAmountDue == null) {
			grossAmountDue = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__GROSS_AMOUNT_DUE);
		}
		return grossAmountDue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getBasisOfCostDetermination() {
		if (basisOfCostDetermination == null) {
			basisOfCostDetermination = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__BASIS_OF_COST_DETERMINATION);
		}
		return basisOfCostDetermination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getMedicaidPaidAmount() {
		if (medicaidPaidAmount == null) {
			medicaidPaidAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRICING_SEGMENT__MEDICAID_PAID_AMOUNT);
		}
		return medicaidPaidAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.PRICING_SEGMENT__INGREDIENT_COST_SUBMITTED:
				return ((InternalEList<?>)getIngredientCostSubmitted()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__DISPENSING_FEE_SUBMITTED:
				return ((InternalEList<?>)getDispensingFeeSubmitted()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_SUBMITTED:
				return ((InternalEList<?>)getProfessionalServiceFeeSubmitted()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__PATIENT_PAID_AMOUNT_SUBMITTED:
				return ((InternalEList<?>)getPatientPaidAmountSubmitted()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__INCENTIVE_AMOUNT_SUBMITTED:
				return ((InternalEList<?>)getIncentiveAmountSubmitted()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_COUNT:
				return ((InternalEList<?>)getOtherAmountClaimedSubmittedCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_QUALIFIER:
				return ((InternalEList<?>)getOtherAmountClaimedSubmittedQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED:
				return ((InternalEList<?>)getOtherAmountClaimedSubmitted()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_SUBMITTED:
				return ((InternalEList<?>)getFlatSalesTaxAmountSubmitted()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_SUBMITTED:
				return ((InternalEList<?>)getPercentageSalesTaxAmountSubmitted()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_SUBMITTED:
				return ((InternalEList<?>)getPercentageSalesTaxRateSubmitted()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_SUBMITTED:
				return ((InternalEList<?>)getPercentageSalesTaxBasisSubmitted()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__USUAL_AND_CUSTOMARY_CHARGE:
				return ((InternalEList<?>)getUsualAndCustomaryCharge()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__GROSS_AMOUNT_DUE:
				return ((InternalEList<?>)getGrossAmountDue()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__BASIS_OF_COST_DETERMINATION:
				return ((InternalEList<?>)getBasisOfCostDetermination()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRICING_SEGMENT__MEDICAID_PAID_AMOUNT:
				return ((InternalEList<?>)getMedicaidPaidAmount()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.PRICING_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.PRICING_SEGMENT__INGREDIENT_COST_SUBMITTED:
				return getIngredientCostSubmitted();
			case TelecomPackage.PRICING_SEGMENT__DISPENSING_FEE_SUBMITTED:
				return getDispensingFeeSubmitted();
			case TelecomPackage.PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_SUBMITTED:
				return getProfessionalServiceFeeSubmitted();
			case TelecomPackage.PRICING_SEGMENT__PATIENT_PAID_AMOUNT_SUBMITTED:
				return getPatientPaidAmountSubmitted();
			case TelecomPackage.PRICING_SEGMENT__INCENTIVE_AMOUNT_SUBMITTED:
				return getIncentiveAmountSubmitted();
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_COUNT:
				return getOtherAmountClaimedSubmittedCount();
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_QUALIFIER:
				return getOtherAmountClaimedSubmittedQualifier();
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED:
				return getOtherAmountClaimedSubmitted();
			case TelecomPackage.PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_SUBMITTED:
				return getFlatSalesTaxAmountSubmitted();
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_SUBMITTED:
				return getPercentageSalesTaxAmountSubmitted();
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_SUBMITTED:
				return getPercentageSalesTaxRateSubmitted();
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_SUBMITTED:
				return getPercentageSalesTaxBasisSubmitted();
			case TelecomPackage.PRICING_SEGMENT__USUAL_AND_CUSTOMARY_CHARGE:
				return getUsualAndCustomaryCharge();
			case TelecomPackage.PRICING_SEGMENT__GROSS_AMOUNT_DUE:
				return getGrossAmountDue();
			case TelecomPackage.PRICING_SEGMENT__BASIS_OF_COST_DETERMINATION:
				return getBasisOfCostDetermination();
			case TelecomPackage.PRICING_SEGMENT__MEDICAID_PAID_AMOUNT:
				return getMedicaidPaidAmount();
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
			case TelecomPackage.PRICING_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__INGREDIENT_COST_SUBMITTED:
				getIngredientCostSubmitted().clear();
				getIngredientCostSubmitted().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__DISPENSING_FEE_SUBMITTED:
				getDispensingFeeSubmitted().clear();
				getDispensingFeeSubmitted().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_SUBMITTED:
				getProfessionalServiceFeeSubmitted().clear();
				getProfessionalServiceFeeSubmitted().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__PATIENT_PAID_AMOUNT_SUBMITTED:
				getPatientPaidAmountSubmitted().clear();
				getPatientPaidAmountSubmitted().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__INCENTIVE_AMOUNT_SUBMITTED:
				getIncentiveAmountSubmitted().clear();
				getIncentiveAmountSubmitted().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_COUNT:
				getOtherAmountClaimedSubmittedCount().clear();
				getOtherAmountClaimedSubmittedCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_QUALIFIER:
				getOtherAmountClaimedSubmittedQualifier().clear();
				getOtherAmountClaimedSubmittedQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED:
				getOtherAmountClaimedSubmitted().clear();
				getOtherAmountClaimedSubmitted().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_SUBMITTED:
				getFlatSalesTaxAmountSubmitted().clear();
				getFlatSalesTaxAmountSubmitted().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_SUBMITTED:
				getPercentageSalesTaxAmountSubmitted().clear();
				getPercentageSalesTaxAmountSubmitted().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_SUBMITTED:
				getPercentageSalesTaxRateSubmitted().clear();
				getPercentageSalesTaxRateSubmitted().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_SUBMITTED:
				getPercentageSalesTaxBasisSubmitted().clear();
				getPercentageSalesTaxBasisSubmitted().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__USUAL_AND_CUSTOMARY_CHARGE:
				getUsualAndCustomaryCharge().clear();
				getUsualAndCustomaryCharge().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__GROSS_AMOUNT_DUE:
				getGrossAmountDue().clear();
				getGrossAmountDue().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__BASIS_OF_COST_DETERMINATION:
				getBasisOfCostDetermination().clear();
				getBasisOfCostDetermination().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRICING_SEGMENT__MEDICAID_PAID_AMOUNT:
				getMedicaidPaidAmount().clear();
				getMedicaidPaidAmount().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.PRICING_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__INGREDIENT_COST_SUBMITTED:
				getIngredientCostSubmitted().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__DISPENSING_FEE_SUBMITTED:
				getDispensingFeeSubmitted().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_SUBMITTED:
				getProfessionalServiceFeeSubmitted().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__PATIENT_PAID_AMOUNT_SUBMITTED:
				getPatientPaidAmountSubmitted().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__INCENTIVE_AMOUNT_SUBMITTED:
				getIncentiveAmountSubmitted().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_COUNT:
				getOtherAmountClaimedSubmittedCount().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_QUALIFIER:
				getOtherAmountClaimedSubmittedQualifier().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED:
				getOtherAmountClaimedSubmitted().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_SUBMITTED:
				getFlatSalesTaxAmountSubmitted().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_SUBMITTED:
				getPercentageSalesTaxAmountSubmitted().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_SUBMITTED:
				getPercentageSalesTaxRateSubmitted().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_SUBMITTED:
				getPercentageSalesTaxBasisSubmitted().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__USUAL_AND_CUSTOMARY_CHARGE:
				getUsualAndCustomaryCharge().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__GROSS_AMOUNT_DUE:
				getGrossAmountDue().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__BASIS_OF_COST_DETERMINATION:
				getBasisOfCostDetermination().clear();
				return;
			case TelecomPackage.PRICING_SEGMENT__MEDICAID_PAID_AMOUNT:
				getMedicaidPaidAmount().clear();
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
			case TelecomPackage.PRICING_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__INGREDIENT_COST_SUBMITTED:
				return ingredientCostSubmitted != null && !ingredientCostSubmitted.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__DISPENSING_FEE_SUBMITTED:
				return dispensingFeeSubmitted != null && !dispensingFeeSubmitted.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_SUBMITTED:
				return professionalServiceFeeSubmitted != null && !professionalServiceFeeSubmitted.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__PATIENT_PAID_AMOUNT_SUBMITTED:
				return patientPaidAmountSubmitted != null && !patientPaidAmountSubmitted.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__INCENTIVE_AMOUNT_SUBMITTED:
				return incentiveAmountSubmitted != null && !incentiveAmountSubmitted.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_COUNT:
				return otherAmountClaimedSubmittedCount != null && !otherAmountClaimedSubmittedCount.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_QUALIFIER:
				return otherAmountClaimedSubmittedQualifier != null && !otherAmountClaimedSubmittedQualifier.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED:
				return otherAmountClaimedSubmitted != null && !otherAmountClaimedSubmitted.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_SUBMITTED:
				return flatSalesTaxAmountSubmitted != null && !flatSalesTaxAmountSubmitted.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_SUBMITTED:
				return percentageSalesTaxAmountSubmitted != null && !percentageSalesTaxAmountSubmitted.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_SUBMITTED:
				return percentageSalesTaxRateSubmitted != null && !percentageSalesTaxRateSubmitted.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_SUBMITTED:
				return percentageSalesTaxBasisSubmitted != null && !percentageSalesTaxBasisSubmitted.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__USUAL_AND_CUSTOMARY_CHARGE:
				return usualAndCustomaryCharge != null && !usualAndCustomaryCharge.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__GROSS_AMOUNT_DUE:
				return grossAmountDue != null && !grossAmountDue.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__BASIS_OF_COST_DETERMINATION:
				return basisOfCostDetermination != null && !basisOfCostDetermination.isEmpty();
			case TelecomPackage.PRICING_SEGMENT__MEDICAID_PAID_AMOUNT:
				return medicaidPaidAmount != null && !medicaidPaidAmount.isEmpty();
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
		result.append(')');
		return result.toString();
	}

} //PricingSegmentImpl
