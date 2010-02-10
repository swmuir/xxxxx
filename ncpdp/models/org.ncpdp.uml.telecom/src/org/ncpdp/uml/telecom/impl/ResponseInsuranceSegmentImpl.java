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
import org.ncpdp.uml.ecl.PayerIDQualifier;
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.ResponseInsuranceSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Insurance Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl#getGroupId <em>Group Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl#getPlanId <em>Plan Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl#getNetworkReimbursementId <em>Network Reimbursement Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl#getPayerIdQualifier <em>Payer Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl#getPayerId <em>Payer Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl#getMedicaidIdNumber <em>Medicaid Id Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl#getMedicaidAgencyNumber <em>Medicaid Agency Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl#getCardholderId <em>Cardholder Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseInsuranceSegmentImpl extends EObjectImpl implements ResponseInsuranceSegment {
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
	 * The cached value of the '{@link #getGroupId() <em>Group Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGroupId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> groupId;

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
	 * The cached value of the '{@link #getNetworkReimbursementId() <em>Network Reimbursement Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNetworkReimbursementId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> networkReimbursementId;

	/**
	 * The cached value of the '{@link #getPayerIdQualifier() <em>Payer Id Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<PayerIDQualifier> payerIdQualifier;

	/**
	 * The cached value of the '{@link #getPayerId() <em>Payer Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayerId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> payerId;

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
	 * The cached value of the '{@link #getCardholderId() <em>Cardholder Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCardholderId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> cardholderId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseInsuranceSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.RESPONSE_INSURANCE_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.RESPONSE_INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getGroupId() {
		if (groupId == null) {
			groupId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_INSURANCE_SEGMENT__GROUP_ID);
		}
		return groupId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPlanId() {
		if (planId == null) {
			planId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PLAN_ID);
		}
		return planId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getNetworkReimbursementId() {
		if (networkReimbursementId == null) {
			networkReimbursementId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_INSURANCE_SEGMENT__NETWORK_REIMBURSEMENT_ID);
		}
		return networkReimbursementId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PayerIDQualifier> getPayerIdQualifier() {
		if (payerIdQualifier == null) {
			payerIdQualifier = new EDataTypeUniqueEList<PayerIDQualifier>(PayerIDQualifier.class, this, TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PAYER_ID_QUALIFIER);
		}
		return payerIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPayerId() {
		if (payerId == null) {
			payerId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PAYER_ID);
		}
		return payerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getMedicaidIdNumber() {
		if (medicaidIdNumber == null) {
			medicaidIdNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_ID_NUMBER);
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
			medicaidAgencyNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER);
		}
		return medicaidAgencyNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCardholderId() {
		if (cardholderId == null) {
			cardholderId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_INSURANCE_SEGMENT__CARDHOLDER_ID);
		}
		return cardholderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__GROUP_ID:
				return ((InternalEList<?>)getGroupId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PLAN_ID:
				return ((InternalEList<?>)getPlanId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__NETWORK_REIMBURSEMENT_ID:
				return ((InternalEList<?>)getNetworkReimbursementId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PAYER_ID:
				return ((InternalEList<?>)getPayerId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_ID_NUMBER:
				return ((InternalEList<?>)getMedicaidIdNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER:
				return ((InternalEList<?>)getMedicaidAgencyNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__CARDHOLDER_ID:
				return ((InternalEList<?>)getCardholderId()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__GROUP_ID:
				return getGroupId();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PLAN_ID:
				return getPlanId();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__NETWORK_REIMBURSEMENT_ID:
				return getNetworkReimbursementId();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PAYER_ID_QUALIFIER:
				return getPayerIdQualifier();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PAYER_ID:
				return getPayerId();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_ID_NUMBER:
				return getMedicaidIdNumber();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER:
				return getMedicaidAgencyNumber();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__CARDHOLDER_ID:
				return getCardholderId();
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
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__GROUP_ID:
				getGroupId().clear();
				getGroupId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PLAN_ID:
				getPlanId().clear();
				getPlanId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__NETWORK_REIMBURSEMENT_ID:
				getNetworkReimbursementId().clear();
				getNetworkReimbursementId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PAYER_ID_QUALIFIER:
				getPayerIdQualifier().clear();
				getPayerIdQualifier().addAll((Collection<? extends PayerIDQualifier>)newValue);
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PAYER_ID:
				getPayerId().clear();
				getPayerId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_ID_NUMBER:
				getMedicaidIdNumber().clear();
				getMedicaidIdNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER:
				getMedicaidAgencyNumber().clear();
				getMedicaidAgencyNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__CARDHOLDER_ID:
				getCardholderId().clear();
				getCardholderId().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__GROUP_ID:
				getGroupId().clear();
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PLAN_ID:
				getPlanId().clear();
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__NETWORK_REIMBURSEMENT_ID:
				getNetworkReimbursementId().clear();
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PAYER_ID_QUALIFIER:
				getPayerIdQualifier().clear();
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PAYER_ID:
				getPayerId().clear();
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_ID_NUMBER:
				getMedicaidIdNumber().clear();
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER:
				getMedicaidAgencyNumber().clear();
				return;
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__CARDHOLDER_ID:
				getCardholderId().clear();
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
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__GROUP_ID:
				return groupId != null && !groupId.isEmpty();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PLAN_ID:
				return planId != null && !planId.isEmpty();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__NETWORK_REIMBURSEMENT_ID:
				return networkReimbursementId != null && !networkReimbursementId.isEmpty();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PAYER_ID_QUALIFIER:
				return payerIdQualifier != null && !payerIdQualifier.isEmpty();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__PAYER_ID:
				return payerId != null && !payerId.isEmpty();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_ID_NUMBER:
				return medicaidIdNumber != null && !medicaidIdNumber.isEmpty();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER:
				return medicaidAgencyNumber != null && !medicaidAgencyNumber.isEmpty();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT__CARDHOLDER_ID:
				return cardholderId != null && !cardholderId.isEmpty();
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
		result.append(", payerIdQualifier: ");
		result.append(payerIdQualifier);
		result.append(')');
		return result.toString();
	}

} //ResponseInsuranceSegmentImpl
