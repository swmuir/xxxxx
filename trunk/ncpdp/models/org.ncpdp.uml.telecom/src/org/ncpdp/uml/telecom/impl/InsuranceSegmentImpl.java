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

import org.ncpdp.uml.ECL.CMSPartDDefinedQualifiedFacility;
import org.ncpdp.uml.ECL.EligibilityClarificationCode;
import org.ncpdp.uml.ECL.PatientRelationshipCode;
import org.ncpdp.uml.ECL.ProviderAcceptAssignmentIndicator;

import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.InsuranceSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Insurance Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getCardholderId <em>Cardholder Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getCardholderFirstName <em>Cardholder First Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getCardholderLastName <em>Cardholder Last Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getHomePlan <em>Home Plan</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getPlanId <em>Plan Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getEligibilityClarificationCode <em>Eligibility Clarification Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getPersonCode <em>Person Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getPatientRelationshipCode <em>Patient Relationship Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getOtherPayerBinNumber <em>Other Payer Bin Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getOtherPayerProcessorControlNumber <em>Other Payer Processor Control Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getOtherPayerCardholderId <em>Other Payer Cardholder Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getOtherPayerGroupId <em>Other Payer Group Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getMedigapId <em>Medigap Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getMedicaidIndicator <em>Medicaid Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getProviderAcceptAssignmentIndicator <em>Provider Accept Assignment Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getCmsPartDDefinedQualifiedFacility <em>Cms Part DDefined Qualified Facility</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getMedicaidIdNumber <em>Medicaid Id Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl#getMedicaidAgencyNumber <em>Medicaid Agency Number</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class InsuranceSegmentImpl extends EObjectImpl implements InsuranceSegment {
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
	 * The cached value of the '{@link #getCardholderId() <em>Cardholder Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardholderId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> cardholderId;

	/**
	 * The cached value of the '{@link #getCardholderFirstName() <em>Cardholder First Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardholderFirstName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> cardholderFirstName;

	/**
	 * The cached value of the '{@link #getCardholderLastName() <em>Cardholder Last Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardholderLastName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> cardholderLastName;

	/**
	 * The cached value of the '{@link #getHomePlan() <em>Home Plan</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHomePlan()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> homePlan;

	/**
	 * The cached value of the '{@link #getPlanId() <em>Plan Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlanId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> planId;

	/**
	 * The cached value of the '{@link #getEligibilityClarificationCode() <em>Eligibility Clarification Code</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEligibilityClarificationCode()
	 * @generated
	 * @ordered
	 */
	protected EList<EligibilityClarificationCode> eligibilityClarificationCode;

	/**
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> groupId;

	/**
	 * The cached value of the '{@link #getPersonCode() <em>Person Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPersonCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> personCode;

	/**
	 * The cached value of the '{@link #getPatientRelationshipCode() <em>Patient Relationship Code</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientRelationshipCode()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientRelationshipCode> patientRelationshipCode;

	/**
	 * The cached value of the '{@link #getOtherPayerBinNumber() <em>Other Payer Bin Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerBinNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerBinNumber;

	/**
	 * The cached value of the '{@link #getOtherPayerProcessorControlNumber() <em>Other Payer Processor Control Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerProcessorControlNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerProcessorControlNumber;

	/**
	 * The cached value of the '{@link #getOtherPayerCardholderId() <em>Other Payer Cardholder Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerCardholderId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerCardholderId;

	/**
	 * The cached value of the '{@link #getOtherPayerGroupId() <em>Other Payer Group Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerGroupId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerGroupId;

	/**
	 * The cached value of the '{@link #getMedigapId() <em>Medigap Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedigapId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> medigapId;

	/**
	 * The cached value of the '{@link #getMedicaidIndicator() <em>Medicaid Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicaidIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> medicaidIndicator;

	/**
	 * The cached value of the '{@link #getProviderAcceptAssignmentIndicator() <em>Provider Accept Assignment Indicator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderAcceptAssignmentIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<ProviderAcceptAssignmentIndicator> providerAcceptAssignmentIndicator;

	/**
	 * The cached value of the '{@link #getCmsPartDDefinedQualifiedFacility() <em>Cms Part DDefined Qualified Facility</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCmsPartDDefinedQualifiedFacility()
	 * @generated
	 * @ordered
	 */
	protected EList<CMSPartDDefinedQualifiedFacility> cmsPartDDefinedQualifiedFacility;

	/**
	 * The cached value of the '{@link #getMedicaidIdNumber() <em>Medicaid Id Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicaidIdNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> medicaidIdNumber;

	/**
	 * The cached value of the '{@link #getMedicaidAgencyNumber() <em>Medicaid Agency Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicaidAgencyNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> medicaidAgencyNumber;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InsuranceSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.INSURANCE_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCardholderId() {
		if (cardholderId == null) {
			cardholderId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_ID);
		}
		return cardholderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCardholderFirstName() {
		if (cardholderFirstName == null) {
			cardholderFirstName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_FIRST_NAME);
		}
		return cardholderFirstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCardholderLastName() {
		if (cardholderLastName == null) {
			cardholderLastName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_LAST_NAME);
		}
		return cardholderLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getHomePlan() {
		if (homePlan == null) {
			homePlan = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__HOME_PLAN);
		}
		return homePlan;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPlanId() {
		if (planId == null) {
			planId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__PLAN_ID);
		}
		return planId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<EligibilityClarificationCode> getEligibilityClarificationCode() {
		if (eligibilityClarificationCode == null) {
			eligibilityClarificationCode = new EDataTypeUniqueEList<EligibilityClarificationCode>(EligibilityClarificationCode.class, this, TelecomPackage.INSURANCE_SEGMENT__ELIGIBILITY_CLARIFICATION_CODE);
		}
		return eligibilityClarificationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getGroupId() {
		if (groupId == null) {
			groupId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__GROUP_ID);
		}
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPersonCode() {
		if (personCode == null) {
			personCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__PERSON_CODE);
		}
		return personCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientRelationshipCode> getPatientRelationshipCode() {
		if (patientRelationshipCode == null) {
			patientRelationshipCode = new EDataTypeUniqueEList<PatientRelationshipCode>(PatientRelationshipCode.class, this, TelecomPackage.INSURANCE_SEGMENT__PATIENT_RELATIONSHIP_CODE);
		}
		return patientRelationshipCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerBinNumber() {
		if (otherPayerBinNumber == null) {
			otherPayerBinNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_BIN_NUMBER);
		}
		return otherPayerBinNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerProcessorControlNumber() {
		if (otherPayerProcessorControlNumber == null) {
			otherPayerProcessorControlNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER);
		}
		return otherPayerProcessorControlNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerCardholderId() {
		if (otherPayerCardholderId == null) {
			otherPayerCardholderId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_CARDHOLDER_ID);
		}
		return otherPayerCardholderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerGroupId() {
		if (otherPayerGroupId == null) {
			otherPayerGroupId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_GROUP_ID);
		}
		return otherPayerGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getMedigapId() {
		if (medigapId == null) {
			medigapId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__MEDIGAP_ID);
		}
		return medigapId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getMedicaidIndicator() {
		if (medicaidIndicator == null) {
			medicaidIndicator = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__MEDICAID_INDICATOR);
		}
		return medicaidIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ProviderAcceptAssignmentIndicator> getProviderAcceptAssignmentIndicator() {
		if (providerAcceptAssignmentIndicator == null) {
			providerAcceptAssignmentIndicator = new EDataTypeUniqueEList<ProviderAcceptAssignmentIndicator>(ProviderAcceptAssignmentIndicator.class, this, TelecomPackage.INSURANCE_SEGMENT__PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR);
		}
		return providerAcceptAssignmentIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<CMSPartDDefinedQualifiedFacility> getCmsPartDDefinedQualifiedFacility() {
		if (cmsPartDDefinedQualifiedFacility == null) {
			cmsPartDDefinedQualifiedFacility = new EDataTypeUniqueEList<CMSPartDDefinedQualifiedFacility>(CMSPartDDefinedQualifiedFacility.class, this, TelecomPackage.INSURANCE_SEGMENT__CMS_PART_DDEFINED_QUALIFIED_FACILITY);
		}
		return cmsPartDDefinedQualifiedFacility;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getMedicaidIdNumber() {
		if (medicaidIdNumber == null) {
			medicaidIdNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__MEDICAID_ID_NUMBER);
		}
		return medicaidIdNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getMedicaidAgencyNumber() {
		if (medicaidAgencyNumber == null) {
			medicaidAgencyNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER);
		}
		return medicaidAgencyNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_ID:
				return ((InternalEList<?>)getCardholderId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_FIRST_NAME:
				return ((InternalEList<?>)getCardholderFirstName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_LAST_NAME:
				return ((InternalEList<?>)getCardholderLastName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__HOME_PLAN:
				return ((InternalEList<?>)getHomePlan()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__PLAN_ID:
				return ((InternalEList<?>)getPlanId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__GROUP_ID:
				return ((InternalEList<?>)getGroupId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__PERSON_CODE:
				return ((InternalEList<?>)getPersonCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_BIN_NUMBER:
				return ((InternalEList<?>)getOtherPayerBinNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER:
				return ((InternalEList<?>)getOtherPayerProcessorControlNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_CARDHOLDER_ID:
				return ((InternalEList<?>)getOtherPayerCardholderId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_GROUP_ID:
				return ((InternalEList<?>)getOtherPayerGroupId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__MEDIGAP_ID:
				return ((InternalEList<?>)getMedigapId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_INDICATOR:
				return ((InternalEList<?>)getMedicaidIndicator()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_ID_NUMBER:
				return ((InternalEList<?>)getMedicaidIdNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER:
				return ((InternalEList<?>)getMedicaidAgencyNumber()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_ID:
				return getCardholderId();
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_FIRST_NAME:
				return getCardholderFirstName();
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_LAST_NAME:
				return getCardholderLastName();
			case TelecomPackage.INSURANCE_SEGMENT__HOME_PLAN:
				return getHomePlan();
			case TelecomPackage.INSURANCE_SEGMENT__PLAN_ID:
				return getPlanId();
			case TelecomPackage.INSURANCE_SEGMENT__ELIGIBILITY_CLARIFICATION_CODE:
				return getEligibilityClarificationCode();
			case TelecomPackage.INSURANCE_SEGMENT__GROUP_ID:
				return getGroupId();
			case TelecomPackage.INSURANCE_SEGMENT__PERSON_CODE:
				return getPersonCode();
			case TelecomPackage.INSURANCE_SEGMENT__PATIENT_RELATIONSHIP_CODE:
				return getPatientRelationshipCode();
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_BIN_NUMBER:
				return getOtherPayerBinNumber();
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER:
				return getOtherPayerProcessorControlNumber();
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_CARDHOLDER_ID:
				return getOtherPayerCardholderId();
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_GROUP_ID:
				return getOtherPayerGroupId();
			case TelecomPackage.INSURANCE_SEGMENT__MEDIGAP_ID:
				return getMedigapId();
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_INDICATOR:
				return getMedicaidIndicator();
			case TelecomPackage.INSURANCE_SEGMENT__PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR:
				return getProviderAcceptAssignmentIndicator();
			case TelecomPackage.INSURANCE_SEGMENT__CMS_PART_DDEFINED_QUALIFIED_FACILITY:
				return getCmsPartDDefinedQualifiedFacility();
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_ID_NUMBER:
				return getMedicaidIdNumber();
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER:
				return getMedicaidAgencyNumber();
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
			case TelecomPackage.INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_ID:
				getCardholderId().clear();
				getCardholderId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_FIRST_NAME:
				getCardholderFirstName().clear();
				getCardholderFirstName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_LAST_NAME:
				getCardholderLastName().clear();
				getCardholderLastName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__HOME_PLAN:
				getHomePlan().clear();
				getHomePlan().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__PLAN_ID:
				getPlanId().clear();
				getPlanId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__ELIGIBILITY_CLARIFICATION_CODE:
				getEligibilityClarificationCode().clear();
				getEligibilityClarificationCode().addAll((Collection<? extends EligibilityClarificationCode>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__GROUP_ID:
				getGroupId().clear();
				getGroupId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__PERSON_CODE:
				getPersonCode().clear();
				getPersonCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__PATIENT_RELATIONSHIP_CODE:
				getPatientRelationshipCode().clear();
				getPatientRelationshipCode().addAll((Collection<? extends PatientRelationshipCode>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_BIN_NUMBER:
				getOtherPayerBinNumber().clear();
				getOtherPayerBinNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER:
				getOtherPayerProcessorControlNumber().clear();
				getOtherPayerProcessorControlNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_CARDHOLDER_ID:
				getOtherPayerCardholderId().clear();
				getOtherPayerCardholderId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_GROUP_ID:
				getOtherPayerGroupId().clear();
				getOtherPayerGroupId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__MEDIGAP_ID:
				getMedigapId().clear();
				getMedigapId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_INDICATOR:
				getMedicaidIndicator().clear();
				getMedicaidIndicator().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR:
				getProviderAcceptAssignmentIndicator().clear();
				getProviderAcceptAssignmentIndicator().addAll((Collection<? extends ProviderAcceptAssignmentIndicator>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__CMS_PART_DDEFINED_QUALIFIED_FACILITY:
				getCmsPartDDefinedQualifiedFacility().clear();
				getCmsPartDDefinedQualifiedFacility().addAll((Collection<? extends CMSPartDDefinedQualifiedFacility>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_ID_NUMBER:
				getMedicaidIdNumber().clear();
				getMedicaidIdNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER:
				getMedicaidAgencyNumber().clear();
				getMedicaidAgencyNumber().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_ID:
				getCardholderId().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_FIRST_NAME:
				getCardholderFirstName().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_LAST_NAME:
				getCardholderLastName().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__HOME_PLAN:
				getHomePlan().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__PLAN_ID:
				getPlanId().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__ELIGIBILITY_CLARIFICATION_CODE:
				getEligibilityClarificationCode().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__GROUP_ID:
				getGroupId().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__PERSON_CODE:
				getPersonCode().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__PATIENT_RELATIONSHIP_CODE:
				getPatientRelationshipCode().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_BIN_NUMBER:
				getOtherPayerBinNumber().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER:
				getOtherPayerProcessorControlNumber().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_CARDHOLDER_ID:
				getOtherPayerCardholderId().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_GROUP_ID:
				getOtherPayerGroupId().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__MEDIGAP_ID:
				getMedigapId().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_INDICATOR:
				getMedicaidIndicator().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR:
				getProviderAcceptAssignmentIndicator().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__CMS_PART_DDEFINED_QUALIFIED_FACILITY:
				getCmsPartDDefinedQualifiedFacility().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_ID_NUMBER:
				getMedicaidIdNumber().clear();
				return;
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER:
				getMedicaidAgencyNumber().clear();
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
			case TelecomPackage.INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_ID:
				return cardholderId != null && !cardholderId.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_FIRST_NAME:
				return cardholderFirstName != null && !cardholderFirstName.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__CARDHOLDER_LAST_NAME:
				return cardholderLastName != null && !cardholderLastName.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__HOME_PLAN:
				return homePlan != null && !homePlan.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__PLAN_ID:
				return planId != null && !planId.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__ELIGIBILITY_CLARIFICATION_CODE:
				return eligibilityClarificationCode != null && !eligibilityClarificationCode.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__GROUP_ID:
				return groupId != null && !groupId.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__PERSON_CODE:
				return personCode != null && !personCode.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__PATIENT_RELATIONSHIP_CODE:
				return patientRelationshipCode != null && !patientRelationshipCode.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_BIN_NUMBER:
				return otherPayerBinNumber != null && !otherPayerBinNumber.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER:
				return otherPayerProcessorControlNumber != null && !otherPayerProcessorControlNumber.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_CARDHOLDER_ID:
				return otherPayerCardholderId != null && !otherPayerCardholderId.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__OTHER_PAYER_GROUP_ID:
				return otherPayerGroupId != null && !otherPayerGroupId.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__MEDIGAP_ID:
				return medigapId != null && !medigapId.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_INDICATOR:
				return medicaidIndicator != null && !medicaidIndicator.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR:
				return providerAcceptAssignmentIndicator != null && !providerAcceptAssignmentIndicator.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__CMS_PART_DDEFINED_QUALIFIED_FACILITY:
				return cmsPartDDefinedQualifiedFacility != null && !cmsPartDDefinedQualifiedFacility.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_ID_NUMBER:
				return medicaidIdNumber != null && !medicaidIdNumber.isEmpty();
			case TelecomPackage.INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER:
				return medicaidAgencyNumber != null && !medicaidAgencyNumber.isEmpty();
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
		result.append(", eligibilityClarificationCode: ");
		result.append(eligibilityClarificationCode);
		result.append(", patientRelationshipCode: ");
		result.append(patientRelationshipCode);
		result.append(", providerAcceptAssignmentIndicator: ");
		result.append(providerAcceptAssignmentIndicator);
		result.append(", cmsPartDDefinedQualifiedFacility: ");
		result.append(cmsPartDDefinedQualifiedFacility);
		result.append(')');
		return result.toString();
	}

} //InsuranceSegmentImpl
