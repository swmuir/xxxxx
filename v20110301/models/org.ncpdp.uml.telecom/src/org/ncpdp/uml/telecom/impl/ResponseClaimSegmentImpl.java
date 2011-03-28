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
import org.ncpdp.uml.telecom.ResponseClaimSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Claim Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl#getPrescriptionserviceReferenceNumberQualifier <em>Prescriptionservice Reference Number Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl#getPrescriptionserviceReferenceNumber <em>Prescriptionservice Reference Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl#getPreferredProductCount <em>Preferred Product Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl#getPreferredProductIdQualifier <em>Preferred Product Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl#getPreferredProductId <em>Preferred Product Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl#getPreferredProductIncentive <em>Preferred Product Incentive</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl#getPreferredProductCostShareIncentive <em>Preferred Product Cost Share Incentive</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl#getPreferredProductDescription <em>Preferred Product Description</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl#getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn <em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseClaimSegmentImpl extends EObjectImpl implements ResponseClaimSegment {
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
	 * The cached value of the '{@link #getPrescriptionserviceReferenceNumberQualifier() <em>Prescriptionservice Reference Number Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionserviceReferenceNumberQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriptionserviceReferenceNumberQualifier;

	/**
	 * The cached value of the '{@link #getPrescriptionserviceReferenceNumber() <em>Prescriptionservice Reference Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionserviceReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriptionserviceReferenceNumber;

	/**
	 * The cached value of the '{@link #getPreferredProductCount() <em>Preferred Product Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredProductCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> preferredProductCount;

	/**
	 * The cached value of the '{@link #getPreferredProductIdQualifier() <em>Preferred Product Id Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredProductIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> preferredProductIdQualifier;

	/**
	 * The cached value of the '{@link #getPreferredProductId() <em>Preferred Product Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredProductId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> preferredProductId;

	/**
	 * The cached value of the '{@link #getPreferredProductIncentive() <em>Preferred Product Incentive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredProductIncentive()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> preferredProductIncentive;

	/**
	 * The cached value of the '{@link #getPreferredProductCostShareIncentive() <em>Preferred Product Cost Share Incentive</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredProductCostShareIncentive()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> preferredProductCostShareIncentive;

	/**
	 * The cached value of the '{@link #getPreferredProductDescription() <em>Preferred Product Description</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreferredProductDescription()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> preferredProductDescription;

	/**
	 * The cached value of the '{@link #getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn() <em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseClaimSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.RESPONSE_CLAIM_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.RESPONSE_CLAIM_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriptionserviceReferenceNumberQualifier() {
		if (prescriptionserviceReferenceNumberQualifier == null) {
			prescriptionserviceReferenceNumberQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER);
		}
		return prescriptionserviceReferenceNumberQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriptionserviceReferenceNumber() {
		if (prescriptionserviceReferenceNumber == null) {
			prescriptionserviceReferenceNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER);
		}
		return prescriptionserviceReferenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPreferredProductCount() {
		if (preferredProductCount == null) {
			preferredProductCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COUNT);
		}
		return preferredProductCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPreferredProductIdQualifier() {
		if (preferredProductIdQualifier == null) {
			preferredProductIdQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID_QUALIFIER);
		}
		return preferredProductIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPreferredProductId() {
		if (preferredProductId == null) {
			preferredProductId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID);
		}
		return preferredProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPreferredProductIncentive() {
		if (preferredProductIncentive == null) {
			preferredProductIncentive = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_INCENTIVE);
		}
		return preferredProductIncentive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPreferredProductCostShareIncentive() {
		if (preferredProductCostShareIncentive == null) {
			preferredProductCostShareIncentive = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COST_SHARE_INCENTIVE);
		}
		return preferredProductCostShareIncentive;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPreferredProductDescription() {
		if (preferredProductDescription == null) {
			preferredProductDescription = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_DESCRIPTION);
		}
		return preferredProductDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn() {
		if (medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn == null) {
			medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN);
		}
		return medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER:
				return ((InternalEList<?>)getPrescriptionserviceReferenceNumberQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				return ((InternalEList<?>)getPrescriptionserviceReferenceNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COUNT:
				return ((InternalEList<?>)getPreferredProductCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID_QUALIFIER:
				return ((InternalEList<?>)getPreferredProductIdQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID:
				return ((InternalEList<?>)getPreferredProductId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_INCENTIVE:
				return ((InternalEList<?>)getPreferredProductIncentive()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COST_SHARE_INCENTIVE:
				return ((InternalEList<?>)getPreferredProductCostShareIncentive()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_DESCRIPTION:
				return ((InternalEList<?>)getPreferredProductDescription()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN:
				return ((InternalEList<?>)getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER:
				return getPrescriptionserviceReferenceNumberQualifier();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				return getPrescriptionserviceReferenceNumber();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COUNT:
				return getPreferredProductCount();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID_QUALIFIER:
				return getPreferredProductIdQualifier();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID:
				return getPreferredProductId();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_INCENTIVE:
				return getPreferredProductIncentive();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COST_SHARE_INCENTIVE:
				return getPreferredProductCostShareIncentive();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_DESCRIPTION:
				return getPreferredProductDescription();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN:
				return getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn();
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
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER:
				getPrescriptionserviceReferenceNumberQualifier().clear();
				getPrescriptionserviceReferenceNumberQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				getPrescriptionserviceReferenceNumber().clear();
				getPrescriptionserviceReferenceNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COUNT:
				getPreferredProductCount().clear();
				getPreferredProductCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID_QUALIFIER:
				getPreferredProductIdQualifier().clear();
				getPreferredProductIdQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID:
				getPreferredProductId().clear();
				getPreferredProductId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_INCENTIVE:
				getPreferredProductIncentive().clear();
				getPreferredProductIncentive().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COST_SHARE_INCENTIVE:
				getPreferredProductCostShareIncentive().clear();
				getPreferredProductCostShareIncentive().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_DESCRIPTION:
				getPreferredProductDescription().clear();
				getPreferredProductDescription().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN:
				getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn().clear();
				getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER:
				getPrescriptionserviceReferenceNumberQualifier().clear();
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				getPrescriptionserviceReferenceNumber().clear();
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COUNT:
				getPreferredProductCount().clear();
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID_QUALIFIER:
				getPreferredProductIdQualifier().clear();
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID:
				getPreferredProductId().clear();
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_INCENTIVE:
				getPreferredProductIncentive().clear();
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COST_SHARE_INCENTIVE:
				getPreferredProductCostShareIncentive().clear();
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_DESCRIPTION:
				getPreferredProductDescription().clear();
				return;
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN:
				getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn().clear();
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
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER:
				return prescriptionserviceReferenceNumberQualifier != null && !prescriptionserviceReferenceNumberQualifier.isEmpty();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				return prescriptionserviceReferenceNumber != null && !prescriptionserviceReferenceNumber.isEmpty();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COUNT:
				return preferredProductCount != null && !preferredProductCount.isEmpty();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID_QUALIFIER:
				return preferredProductIdQualifier != null && !preferredProductIdQualifier.isEmpty();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID:
				return preferredProductId != null && !preferredProductId.isEmpty();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_INCENTIVE:
				return preferredProductIncentive != null && !preferredProductIncentive.isEmpty();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COST_SHARE_INCENTIVE:
				return preferredProductCostShareIncentive != null && !preferredProductCostShareIncentive.isEmpty();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_DESCRIPTION:
				return preferredProductDescription != null && !preferredProductDescription.isEmpty();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN:
				return medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn != null && !medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn.isEmpty();
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

} //ResponseClaimSegmentImpl
