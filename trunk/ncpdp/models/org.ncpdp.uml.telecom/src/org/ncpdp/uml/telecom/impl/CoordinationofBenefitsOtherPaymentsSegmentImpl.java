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

import org.ncpdp.uml.ECL.BenefitStageQualifier;
import org.ncpdp.uml.ECL.OtherPayerAmountPaidQualifier;
import org.ncpdp.uml.ECL.OtherPayerCoverageType;
import org.ncpdp.uml.ECL.OtherPayerIDQualifier;
import org.ncpdp.uml.ECL.OtherPayerPatientResponsibilityAmountQualifier;

import org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment;
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coordinationof Benefits Other Payments Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getCoordinationOfBenefitsotherPaymentsCount <em>Coordination Of Benefitsother Payments Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerCoverageType <em>Other Payer Coverage Type</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerIdQualifier <em>Other Payer Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerId <em>Other Payer Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerDate <em>Other Payer Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getInternalControlNumber <em>Internal Control Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerAmountPaidCount <em>Other Payer Amount Paid Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerAmountPaidQualifier <em>Other Payer Amount Paid Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerAmountPaid <em>Other Payer Amount Paid</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerRejectCount <em>Other Payer Reject Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerRejectCode <em>Other Payer Reject Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerpatientResponsibilityAmountCount <em>Other Payerpatient Responsibility Amount Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerpatientResponsibilityAmountQualifier <em>Other Payerpatient Responsibility Amount Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getOtherPayerpatientResponsibilityAmount <em>Other Payerpatient Responsibility Amount</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getBenefitStageCount <em>Benefit Stage Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getBenefitStageQualifier <em>Benefit Stage Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl#getBenefitStageAmount <em>Benefit Stage Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CoordinationofBenefitsOtherPaymentsSegmentImpl extends EObjectImpl implements CoordinationofBenefitsOtherPaymentsSegment {
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
	 * The cached value of the '{@link #getCoordinationOfBenefitsotherPaymentsCount() <em>Coordination Of Benefitsother Payments Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationOfBenefitsotherPaymentsCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> coordinationOfBenefitsotherPaymentsCount;

	/**
	 * The cached value of the '{@link #getOtherPayerCoverageType() <em>Other Payer Coverage Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerCoverageType()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherPayerCoverageType> otherPayerCoverageType;

	/**
	 * The cached value of the '{@link #getOtherPayerIdQualifier() <em>Other Payer Id Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherPayerIDQualifier> otherPayerIdQualifier;

	/**
	 * The cached value of the '{@link #getOtherPayerId() <em>Other Payer Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerId;

	/**
	 * The cached value of the '{@link #getOtherPayerDate() <em>Other Payer Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerDate;

	/**
	 * The cached value of the '{@link #getInternalControlNumber() <em>Internal Control Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalControlNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> internalControlNumber;

	/**
	 * The cached value of the '{@link #getOtherPayerAmountPaidCount() <em>Other Payer Amount Paid Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerAmountPaidCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerAmountPaidCount;

	/**
	 * The cached value of the '{@link #getOtherPayerAmountPaidQualifier() <em>Other Payer Amount Paid Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerAmountPaidQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherPayerAmountPaidQualifier> otherPayerAmountPaidQualifier;

	/**
	 * The cached value of the '{@link #getOtherPayerAmountPaid() <em>Other Payer Amount Paid</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerAmountPaid()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerAmountPaid;

	/**
	 * The cached value of the '{@link #getOtherPayerRejectCount() <em>Other Payer Reject Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerRejectCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerRejectCount;

	/**
	 * The cached value of the '{@link #getOtherPayerRejectCode() <em>Other Payer Reject Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerRejectCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerRejectCode;

	/**
	 * The cached value of the '{@link #getOtherPayerpatientResponsibilityAmountCount() <em>Other Payerpatient Responsibility Amount Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerpatientResponsibilityAmountCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerpatientResponsibilityAmountCount;

	/**
	 * The cached value of the '{@link #getOtherPayerpatientResponsibilityAmountQualifier() <em>Other Payerpatient Responsibility Amount Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerpatientResponsibilityAmountQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherPayerPatientResponsibilityAmountQualifier> otherPayerpatientResponsibilityAmountQualifier;

	/**
	 * The cached value of the '{@link #getOtherPayerpatientResponsibilityAmount() <em>Other Payerpatient Responsibility Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerpatientResponsibilityAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerpatientResponsibilityAmount;

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
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CoordinationofBenefitsOtherPaymentsSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCoordinationOfBenefitsotherPaymentsCount() {
		if (coordinationOfBenefitsotherPaymentsCount == null) {
			coordinationOfBenefitsotherPaymentsCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__COORDINATION_OF_BENEFITSOTHER_PAYMENTS_COUNT);
		}
		return coordinationOfBenefitsotherPaymentsCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherPayerCoverageType> getOtherPayerCoverageType() {
		if (otherPayerCoverageType == null) {
			otherPayerCoverageType = new EDataTypeUniqueEList<OtherPayerCoverageType>(OtherPayerCoverageType.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE);
		}
		return otherPayerCoverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherPayerIDQualifier> getOtherPayerIdQualifier() {
		if (otherPayerIdQualifier == null) {
			otherPayerIdQualifier = new EDataTypeUniqueEList<OtherPayerIDQualifier>(OtherPayerIDQualifier.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID_QUALIFIER);
		}
		return otherPayerIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerId() {
		if (otherPayerId == null) {
			otherPayerId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID);
		}
		return otherPayerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerDate() {
		if (otherPayerDate == null) {
			otherPayerDate = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_DATE);
		}
		return otherPayerDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getInternalControlNumber() {
		if (internalControlNumber == null) {
			internalControlNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__INTERNAL_CONTROL_NUMBER);
		}
		return internalControlNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerAmountPaidCount() {
		if (otherPayerAmountPaidCount == null) {
			otherPayerAmountPaidCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_COUNT);
		}
		return otherPayerAmountPaidCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherPayerAmountPaidQualifier> getOtherPayerAmountPaidQualifier() {
		if (otherPayerAmountPaidQualifier == null) {
			otherPayerAmountPaidQualifier = new EDataTypeUniqueEList<OtherPayerAmountPaidQualifier>(OtherPayerAmountPaidQualifier.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_QUALIFIER);
		}
		return otherPayerAmountPaidQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerAmountPaid() {
		if (otherPayerAmountPaid == null) {
			otherPayerAmountPaid = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID);
		}
		return otherPayerAmountPaid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerRejectCount() {
		if (otherPayerRejectCount == null) {
			otherPayerRejectCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_COUNT);
		}
		return otherPayerRejectCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerRejectCode() {
		if (otherPayerRejectCode == null) {
			otherPayerRejectCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_CODE);
		}
		return otherPayerRejectCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerpatientResponsibilityAmountCount() {
		if (otherPayerpatientResponsibilityAmountCount == null) {
			otherPayerpatientResponsibilityAmountCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_COUNT);
		}
		return otherPayerpatientResponsibilityAmountCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherPayerPatientResponsibilityAmountQualifier> getOtherPayerpatientResponsibilityAmountQualifier() {
		if (otherPayerpatientResponsibilityAmountQualifier == null) {
			otherPayerpatientResponsibilityAmountQualifier = new EDataTypeUniqueEList<OtherPayerPatientResponsibilityAmountQualifier>(OtherPayerPatientResponsibilityAmountQualifier.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_QUALIFIER);
		}
		return otherPayerpatientResponsibilityAmountQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerpatientResponsibilityAmount() {
		if (otherPayerpatientResponsibilityAmount == null) {
			otherPayerpatientResponsibilityAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT);
		}
		return otherPayerpatientResponsibilityAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getBenefitStageCount() {
		if (benefitStageCount == null) {
			benefitStageCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_COUNT);
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
			benefitStageQualifier = new EDataTypeUniqueEList<BenefitStageQualifier>(BenefitStageQualifier.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_QUALIFIER);
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
			benefitStageAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_AMOUNT);
		}
		return benefitStageAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__COORDINATION_OF_BENEFITSOTHER_PAYMENTS_COUNT:
				return ((InternalEList<?>)getCoordinationOfBenefitsotherPaymentsCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID:
				return ((InternalEList<?>)getOtherPayerId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_DATE:
				return ((InternalEList<?>)getOtherPayerDate()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__INTERNAL_CONTROL_NUMBER:
				return ((InternalEList<?>)getInternalControlNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_COUNT:
				return ((InternalEList<?>)getOtherPayerAmountPaidCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID:
				return ((InternalEList<?>)getOtherPayerAmountPaid()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_COUNT:
				return ((InternalEList<?>)getOtherPayerRejectCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_CODE:
				return ((InternalEList<?>)getOtherPayerRejectCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_COUNT:
				return ((InternalEList<?>)getOtherPayerpatientResponsibilityAmountCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT:
				return ((InternalEList<?>)getOtherPayerpatientResponsibilityAmount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_COUNT:
				return ((InternalEList<?>)getBenefitStageCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_AMOUNT:
				return ((InternalEList<?>)getBenefitStageAmount()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__COORDINATION_OF_BENEFITSOTHER_PAYMENTS_COUNT:
				return getCoordinationOfBenefitsotherPaymentsCount();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE:
				return getOtherPayerCoverageType();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID_QUALIFIER:
				return getOtherPayerIdQualifier();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID:
				return getOtherPayerId();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_DATE:
				return getOtherPayerDate();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__INTERNAL_CONTROL_NUMBER:
				return getInternalControlNumber();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_COUNT:
				return getOtherPayerAmountPaidCount();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_QUALIFIER:
				return getOtherPayerAmountPaidQualifier();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID:
				return getOtherPayerAmountPaid();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_COUNT:
				return getOtherPayerRejectCount();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_CODE:
				return getOtherPayerRejectCode();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_COUNT:
				return getOtherPayerpatientResponsibilityAmountCount();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_QUALIFIER:
				return getOtherPayerpatientResponsibilityAmountQualifier();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT:
				return getOtherPayerpatientResponsibilityAmount();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_COUNT:
				return getBenefitStageCount();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_QUALIFIER:
				return getBenefitStageQualifier();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_AMOUNT:
				return getBenefitStageAmount();
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
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__COORDINATION_OF_BENEFITSOTHER_PAYMENTS_COUNT:
				getCoordinationOfBenefitsotherPaymentsCount().clear();
				getCoordinationOfBenefitsotherPaymentsCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE:
				getOtherPayerCoverageType().clear();
				getOtherPayerCoverageType().addAll((Collection<? extends OtherPayerCoverageType>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID_QUALIFIER:
				getOtherPayerIdQualifier().clear();
				getOtherPayerIdQualifier().addAll((Collection<? extends OtherPayerIDQualifier>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID:
				getOtherPayerId().clear();
				getOtherPayerId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_DATE:
				getOtherPayerDate().clear();
				getOtherPayerDate().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__INTERNAL_CONTROL_NUMBER:
				getInternalControlNumber().clear();
				getInternalControlNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_COUNT:
				getOtherPayerAmountPaidCount().clear();
				getOtherPayerAmountPaidCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_QUALIFIER:
				getOtherPayerAmountPaidQualifier().clear();
				getOtherPayerAmountPaidQualifier().addAll((Collection<? extends OtherPayerAmountPaidQualifier>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID:
				getOtherPayerAmountPaid().clear();
				getOtherPayerAmountPaid().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_COUNT:
				getOtherPayerRejectCount().clear();
				getOtherPayerRejectCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_CODE:
				getOtherPayerRejectCode().clear();
				getOtherPayerRejectCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_COUNT:
				getOtherPayerpatientResponsibilityAmountCount().clear();
				getOtherPayerpatientResponsibilityAmountCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_QUALIFIER:
				getOtherPayerpatientResponsibilityAmountQualifier().clear();
				getOtherPayerpatientResponsibilityAmountQualifier().addAll((Collection<? extends OtherPayerPatientResponsibilityAmountQualifier>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT:
				getOtherPayerpatientResponsibilityAmount().clear();
				getOtherPayerpatientResponsibilityAmount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_COUNT:
				getBenefitStageCount().clear();
				getBenefitStageCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_QUALIFIER:
				getBenefitStageQualifier().clear();
				getBenefitStageQualifier().addAll((Collection<? extends BenefitStageQualifier>)newValue);
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_AMOUNT:
				getBenefitStageAmount().clear();
				getBenefitStageAmount().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__COORDINATION_OF_BENEFITSOTHER_PAYMENTS_COUNT:
				getCoordinationOfBenefitsotherPaymentsCount().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE:
				getOtherPayerCoverageType().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID_QUALIFIER:
				getOtherPayerIdQualifier().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID:
				getOtherPayerId().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_DATE:
				getOtherPayerDate().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__INTERNAL_CONTROL_NUMBER:
				getInternalControlNumber().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_COUNT:
				getOtherPayerAmountPaidCount().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_QUALIFIER:
				getOtherPayerAmountPaidQualifier().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID:
				getOtherPayerAmountPaid().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_COUNT:
				getOtherPayerRejectCount().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_CODE:
				getOtherPayerRejectCode().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_COUNT:
				getOtherPayerpatientResponsibilityAmountCount().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_QUALIFIER:
				getOtherPayerpatientResponsibilityAmountQualifier().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT:
				getOtherPayerpatientResponsibilityAmount().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_COUNT:
				getBenefitStageCount().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_QUALIFIER:
				getBenefitStageQualifier().clear();
				return;
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_AMOUNT:
				getBenefitStageAmount().clear();
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
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__COORDINATION_OF_BENEFITSOTHER_PAYMENTS_COUNT:
				return coordinationOfBenefitsotherPaymentsCount != null && !coordinationOfBenefitsotherPaymentsCount.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE:
				return otherPayerCoverageType != null && !otherPayerCoverageType.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID_QUALIFIER:
				return otherPayerIdQualifier != null && !otherPayerIdQualifier.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID:
				return otherPayerId != null && !otherPayerId.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_DATE:
				return otherPayerDate != null && !otherPayerDate.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__INTERNAL_CONTROL_NUMBER:
				return internalControlNumber != null && !internalControlNumber.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_COUNT:
				return otherPayerAmountPaidCount != null && !otherPayerAmountPaidCount.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_QUALIFIER:
				return otherPayerAmountPaidQualifier != null && !otherPayerAmountPaidQualifier.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID:
				return otherPayerAmountPaid != null && !otherPayerAmountPaid.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_COUNT:
				return otherPayerRejectCount != null && !otherPayerRejectCount.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_CODE:
				return otherPayerRejectCode != null && !otherPayerRejectCode.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_COUNT:
				return otherPayerpatientResponsibilityAmountCount != null && !otherPayerpatientResponsibilityAmountCount.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_QUALIFIER:
				return otherPayerpatientResponsibilityAmountQualifier != null && !otherPayerpatientResponsibilityAmountQualifier.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT:
				return otherPayerpatientResponsibilityAmount != null && !otherPayerpatientResponsibilityAmount.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_COUNT:
				return benefitStageCount != null && !benefitStageCount.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_QUALIFIER:
				return benefitStageQualifier != null && !benefitStageQualifier.isEmpty();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_AMOUNT:
				return benefitStageAmount != null && !benefitStageAmount.isEmpty();
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
		result.append(", otherPayerCoverageType: ");
		result.append(otherPayerCoverageType);
		result.append(", otherPayerIdQualifier: ");
		result.append(otherPayerIdQualifier);
		result.append(", otherPayerAmountPaidQualifier: ");
		result.append(otherPayerAmountPaidQualifier);
		result.append(", otherPayerpatientResponsibilityAmountQualifier: ");
		result.append(otherPayerpatientResponsibilityAmountQualifier);
		result.append(", benefitStageQualifier: ");
		result.append(benefitStageQualifier);
		result.append(')');
		return result.toString();
	}

} //CoordinationofBenefitsOtherPaymentsSegmentImpl
