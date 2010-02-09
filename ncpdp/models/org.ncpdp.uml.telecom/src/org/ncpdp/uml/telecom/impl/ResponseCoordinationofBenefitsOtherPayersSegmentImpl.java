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
import org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Coordinationof Benefits Other Payers Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerIdCount <em>Other Payer Id Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerCoverageType <em>Other Payer Coverage Type</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerIdQualifier <em>Other Payer Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerId <em>Other Payer Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerProcessorControlNumber <em>Other Payer Processor Control Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerCardholderId <em>Other Payer Cardholder Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerGroupId <em>Other Payer Group Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerPersonCode <em>Other Payer Person Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerHelpDeskPhoneNumber <em>Other Payer Help Desk Phone Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerPatientRelationshipCode <em>Other Payer Patient Relationship Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerBenefitEffectiveDate <em>Other Payer Benefit Effective Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl#getOtherPayerBenefitTerminationDate <em>Other Payer Benefit Termination Date</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseCoordinationofBenefitsOtherPayersSegmentImpl extends EObjectImpl implements ResponseCoordinationofBenefitsOtherPayersSegment {
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
	 * The cached value of the '{@link #getOtherPayerIdCount() <em>Other Payer Id Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerIdCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerIdCount;

	/**
	 * The cached value of the '{@link #getOtherPayerCoverageType() <em>Other Payer Coverage Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerCoverageType()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerCoverageType;

	/**
	 * The cached value of the '{@link #getOtherPayerIdQualifier() <em>Other Payer Id Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerIdQualifier;

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
	 * The cached value of the '{@link #getOtherPayerPersonCode() <em>Other Payer Person Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerPersonCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerPersonCode;

	/**
	 * The cached value of the '{@link #getOtherPayerHelpDeskPhoneNumber() <em>Other Payer Help Desk Phone Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerHelpDeskPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerHelpDeskPhoneNumber;

	/**
	 * The cached value of the '{@link #getOtherPayerPatientRelationshipCode() <em>Other Payer Patient Relationship Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerPatientRelationshipCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerPatientRelationshipCode;

	/**
	 * The cached value of the '{@link #getOtherPayerBenefitEffectiveDate() <em>Other Payer Benefit Effective Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerBenefitEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerBenefitEffectiveDate;

	/**
	 * The cached value of the '{@link #getOtherPayerBenefitTerminationDate() <em>Other Payer Benefit Termination Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPayerBenefitTerminationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherPayerBenefitTerminationDate;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseCoordinationofBenefitsOtherPayersSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerIdCount() {
		if (otherPayerIdCount == null) {
			otherPayerIdCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_COUNT);
		}
		return otherPayerIdCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerCoverageType() {
		if (otherPayerCoverageType == null) {
			otherPayerCoverageType = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE);
		}
		return otherPayerCoverageType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerIdQualifier() {
		if (otherPayerIdQualifier == null) {
			otherPayerIdQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_QUALIFIER);
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
			otherPayerId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID);
		}
		return otherPayerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerProcessorControlNumber() {
		if (otherPayerProcessorControlNumber == null) {
			otherPayerProcessorControlNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER);
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
			otherPayerCardholderId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_CARDHOLDER_ID);
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
			otherPayerGroupId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_GROUP_ID);
		}
		return otherPayerGroupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerPersonCode() {
		if (otherPayerPersonCode == null) {
			otherPayerPersonCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PERSON_CODE);
		}
		return otherPayerPersonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerHelpDeskPhoneNumber() {
		if (otherPayerHelpDeskPhoneNumber == null) {
			otherPayerHelpDeskPhoneNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_HELP_DESK_PHONE_NUMBER);
		}
		return otherPayerHelpDeskPhoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerPatientRelationshipCode() {
		if (otherPayerPatientRelationshipCode == null) {
			otherPayerPatientRelationshipCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PATIENT_RELATIONSHIP_CODE);
		}
		return otherPayerPatientRelationshipCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerBenefitEffectiveDate() {
		if (otherPayerBenefitEffectiveDate == null) {
			otherPayerBenefitEffectiveDate = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_EFFECTIVE_DATE);
		}
		return otherPayerBenefitEffectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherPayerBenefitTerminationDate() {
		if (otherPayerBenefitTerminationDate == null) {
			otherPayerBenefitTerminationDate = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_TERMINATION_DATE);
		}
		return otherPayerBenefitTerminationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_COUNT:
				return ((InternalEList<?>)getOtherPayerIdCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE:
				return ((InternalEList<?>)getOtherPayerCoverageType()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_QUALIFIER:
				return ((InternalEList<?>)getOtherPayerIdQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID:
				return ((InternalEList<?>)getOtherPayerId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER:
				return ((InternalEList<?>)getOtherPayerProcessorControlNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_CARDHOLDER_ID:
				return ((InternalEList<?>)getOtherPayerCardholderId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_GROUP_ID:
				return ((InternalEList<?>)getOtherPayerGroupId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PERSON_CODE:
				return ((InternalEList<?>)getOtherPayerPersonCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_HELP_DESK_PHONE_NUMBER:
				return ((InternalEList<?>)getOtherPayerHelpDeskPhoneNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PATIENT_RELATIONSHIP_CODE:
				return ((InternalEList<?>)getOtherPayerPatientRelationshipCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_EFFECTIVE_DATE:
				return ((InternalEList<?>)getOtherPayerBenefitEffectiveDate()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_TERMINATION_DATE:
				return ((InternalEList<?>)getOtherPayerBenefitTerminationDate()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_COUNT:
				return getOtherPayerIdCount();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE:
				return getOtherPayerCoverageType();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_QUALIFIER:
				return getOtherPayerIdQualifier();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID:
				return getOtherPayerId();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER:
				return getOtherPayerProcessorControlNumber();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_CARDHOLDER_ID:
				return getOtherPayerCardholderId();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_GROUP_ID:
				return getOtherPayerGroupId();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PERSON_CODE:
				return getOtherPayerPersonCode();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_HELP_DESK_PHONE_NUMBER:
				return getOtherPayerHelpDeskPhoneNumber();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PATIENT_RELATIONSHIP_CODE:
				return getOtherPayerPatientRelationshipCode();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_EFFECTIVE_DATE:
				return getOtherPayerBenefitEffectiveDate();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_TERMINATION_DATE:
				return getOtherPayerBenefitTerminationDate();
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
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_COUNT:
				getOtherPayerIdCount().clear();
				getOtherPayerIdCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE:
				getOtherPayerCoverageType().clear();
				getOtherPayerCoverageType().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_QUALIFIER:
				getOtherPayerIdQualifier().clear();
				getOtherPayerIdQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID:
				getOtherPayerId().clear();
				getOtherPayerId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER:
				getOtherPayerProcessorControlNumber().clear();
				getOtherPayerProcessorControlNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_CARDHOLDER_ID:
				getOtherPayerCardholderId().clear();
				getOtherPayerCardholderId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_GROUP_ID:
				getOtherPayerGroupId().clear();
				getOtherPayerGroupId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PERSON_CODE:
				getOtherPayerPersonCode().clear();
				getOtherPayerPersonCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_HELP_DESK_PHONE_NUMBER:
				getOtherPayerHelpDeskPhoneNumber().clear();
				getOtherPayerHelpDeskPhoneNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PATIENT_RELATIONSHIP_CODE:
				getOtherPayerPatientRelationshipCode().clear();
				getOtherPayerPatientRelationshipCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_EFFECTIVE_DATE:
				getOtherPayerBenefitEffectiveDate().clear();
				getOtherPayerBenefitEffectiveDate().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_TERMINATION_DATE:
				getOtherPayerBenefitTerminationDate().clear();
				getOtherPayerBenefitTerminationDate().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_COUNT:
				getOtherPayerIdCount().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE:
				getOtherPayerCoverageType().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_QUALIFIER:
				getOtherPayerIdQualifier().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID:
				getOtherPayerId().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER:
				getOtherPayerProcessorControlNumber().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_CARDHOLDER_ID:
				getOtherPayerCardholderId().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_GROUP_ID:
				getOtherPayerGroupId().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PERSON_CODE:
				getOtherPayerPersonCode().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_HELP_DESK_PHONE_NUMBER:
				getOtherPayerHelpDeskPhoneNumber().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PATIENT_RELATIONSHIP_CODE:
				getOtherPayerPatientRelationshipCode().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_EFFECTIVE_DATE:
				getOtherPayerBenefitEffectiveDate().clear();
				return;
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_TERMINATION_DATE:
				getOtherPayerBenefitTerminationDate().clear();
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
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_COUNT:
				return otherPayerIdCount != null && !otherPayerIdCount.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE:
				return otherPayerCoverageType != null && !otherPayerCoverageType.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_QUALIFIER:
				return otherPayerIdQualifier != null && !otherPayerIdQualifier.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID:
				return otherPayerId != null && !otherPayerId.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER:
				return otherPayerProcessorControlNumber != null && !otherPayerProcessorControlNumber.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_CARDHOLDER_ID:
				return otherPayerCardholderId != null && !otherPayerCardholderId.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_GROUP_ID:
				return otherPayerGroupId != null && !otherPayerGroupId.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PERSON_CODE:
				return otherPayerPersonCode != null && !otherPayerPersonCode.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_HELP_DESK_PHONE_NUMBER:
				return otherPayerHelpDeskPhoneNumber != null && !otherPayerHelpDeskPhoneNumber.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PATIENT_RELATIONSHIP_CODE:
				return otherPayerPatientRelationshipCode != null && !otherPayerPatientRelationshipCode.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_EFFECTIVE_DATE:
				return otherPayerBenefitEffectiveDate != null && !otherPayerBenefitEffectiveDate.isEmpty();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_TERMINATION_DATE:
				return otherPayerBenefitTerminationDate != null && !otherPayerBenefitTerminationDate.isEmpty();
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

} //ResponseCoordinationofBenefitsOtherPayersSegmentImpl
