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
import org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Prior Authorization Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl#getPriorAuthorizationProcessedDate <em>Prior Authorization Processed Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl#getPriorAuthorizationEffectiveDate <em>Prior Authorization Effective Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl#getPriorAuthorizationExpirationDate <em>Prior Authorization Expiration Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl#getPriorAuthorizationQuantity <em>Prior Authorization Quantity</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl#getPriorAuthorizationDollarsAuthorized <em>Prior Authorization Dollars Authorized</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl#getPriorAuthorizationNumberOfRefillsAuthorized <em>Prior Authorization Number Of Refills Authorized</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl#getPriorAuthorizationQuantityAccumulated <em>Prior Authorization Quantity Accumulated</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl#getPriorAuthorizationNumberassigned <em>Prior Authorization Numberassigned</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponsePriorAuthorizationSegmentImpl extends EObjectImpl implements ResponsePriorAuthorizationSegment {
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
	 * The cached value of the '{@link #getPriorAuthorizationProcessedDate() <em>Prior Authorization Processed Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationProcessedDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> priorAuthorizationProcessedDate;

	/**
	 * The cached value of the '{@link #getPriorAuthorizationEffectiveDate() <em>Prior Authorization Effective Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationEffectiveDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> priorAuthorizationEffectiveDate;

	/**
	 * The cached value of the '{@link #getPriorAuthorizationExpirationDate() <em>Prior Authorization Expiration Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationExpirationDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> priorAuthorizationExpirationDate;

	/**
	 * The cached value of the '{@link #getPriorAuthorizationQuantity() <em>Prior Authorization Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> priorAuthorizationQuantity;

	/**
	 * The cached value of the '{@link #getPriorAuthorizationDollarsAuthorized() <em>Prior Authorization Dollars Authorized</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationDollarsAuthorized()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> priorAuthorizationDollarsAuthorized;

	/**
	 * The cached value of the '{@link #getPriorAuthorizationNumberOfRefillsAuthorized() <em>Prior Authorization Number Of Refills Authorized</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationNumberOfRefillsAuthorized()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> priorAuthorizationNumberOfRefillsAuthorized;

	/**
	 * The cached value of the '{@link #getPriorAuthorizationQuantityAccumulated() <em>Prior Authorization Quantity Accumulated</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationQuantityAccumulated()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> priorAuthorizationQuantityAccumulated;

	/**
	 * The cached value of the '{@link #getPriorAuthorizationNumberassigned() <em>Prior Authorization Numberassigned</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationNumberassigned()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> priorAuthorizationNumberassigned;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsePriorAuthorizationSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationProcessedDate() {
		if (priorAuthorizationProcessedDate == null) {
			priorAuthorizationProcessedDate = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_PROCESSED_DATE);
		}
		return priorAuthorizationProcessedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationEffectiveDate() {
		if (priorAuthorizationEffectiveDate == null) {
			priorAuthorizationEffectiveDate = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EFFECTIVE_DATE);
		}
		return priorAuthorizationEffectiveDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationExpirationDate() {
		if (priorAuthorizationExpirationDate == null) {
			priorAuthorizationExpirationDate = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EXPIRATION_DATE);
		}
		return priorAuthorizationExpirationDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationQuantity() {
		if (priorAuthorizationQuantity == null) {
			priorAuthorizationQuantity = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY);
		}
		return priorAuthorizationQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationDollarsAuthorized() {
		if (priorAuthorizationDollarsAuthorized == null) {
			priorAuthorizationDollarsAuthorized = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_DOLLARS_AUTHORIZED);
		}
		return priorAuthorizationDollarsAuthorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationNumberOfRefillsAuthorized() {
		if (priorAuthorizationNumberOfRefillsAuthorized == null) {
			priorAuthorizationNumberOfRefillsAuthorized = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_OF_REFILLS_AUTHORIZED);
		}
		return priorAuthorizationNumberOfRefillsAuthorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationQuantityAccumulated() {
		if (priorAuthorizationQuantityAccumulated == null) {
			priorAuthorizationQuantityAccumulated = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY_ACCUMULATED);
		}
		return priorAuthorizationQuantityAccumulated;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationNumberassigned() {
		if (priorAuthorizationNumberassigned == null) {
			priorAuthorizationNumberassigned = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED);
		}
		return priorAuthorizationNumberassigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_PROCESSED_DATE:
				return ((InternalEList<?>)getPriorAuthorizationProcessedDate()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EFFECTIVE_DATE:
				return ((InternalEList<?>)getPriorAuthorizationEffectiveDate()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EXPIRATION_DATE:
				return ((InternalEList<?>)getPriorAuthorizationExpirationDate()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY:
				return ((InternalEList<?>)getPriorAuthorizationQuantity()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_DOLLARS_AUTHORIZED:
				return ((InternalEList<?>)getPriorAuthorizationDollarsAuthorized()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_OF_REFILLS_AUTHORIZED:
				return ((InternalEList<?>)getPriorAuthorizationNumberOfRefillsAuthorized()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY_ACCUMULATED:
				return ((InternalEList<?>)getPriorAuthorizationQuantityAccumulated()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED:
				return ((InternalEList<?>)getPriorAuthorizationNumberassigned()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_PROCESSED_DATE:
				return getPriorAuthorizationProcessedDate();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EFFECTIVE_DATE:
				return getPriorAuthorizationEffectiveDate();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EXPIRATION_DATE:
				return getPriorAuthorizationExpirationDate();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY:
				return getPriorAuthorizationQuantity();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_DOLLARS_AUTHORIZED:
				return getPriorAuthorizationDollarsAuthorized();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_OF_REFILLS_AUTHORIZED:
				return getPriorAuthorizationNumberOfRefillsAuthorized();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY_ACCUMULATED:
				return getPriorAuthorizationQuantityAccumulated();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED:
				return getPriorAuthorizationNumberassigned();
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
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_PROCESSED_DATE:
				getPriorAuthorizationProcessedDate().clear();
				getPriorAuthorizationProcessedDate().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EFFECTIVE_DATE:
				getPriorAuthorizationEffectiveDate().clear();
				getPriorAuthorizationEffectiveDate().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EXPIRATION_DATE:
				getPriorAuthorizationExpirationDate().clear();
				getPriorAuthorizationExpirationDate().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY:
				getPriorAuthorizationQuantity().clear();
				getPriorAuthorizationQuantity().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_DOLLARS_AUTHORIZED:
				getPriorAuthorizationDollarsAuthorized().clear();
				getPriorAuthorizationDollarsAuthorized().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_OF_REFILLS_AUTHORIZED:
				getPriorAuthorizationNumberOfRefillsAuthorized().clear();
				getPriorAuthorizationNumberOfRefillsAuthorized().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY_ACCUMULATED:
				getPriorAuthorizationQuantityAccumulated().clear();
				getPriorAuthorizationQuantityAccumulated().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED:
				getPriorAuthorizationNumberassigned().clear();
				getPriorAuthorizationNumberassigned().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_PROCESSED_DATE:
				getPriorAuthorizationProcessedDate().clear();
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EFFECTIVE_DATE:
				getPriorAuthorizationEffectiveDate().clear();
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EXPIRATION_DATE:
				getPriorAuthorizationExpirationDate().clear();
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY:
				getPriorAuthorizationQuantity().clear();
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_DOLLARS_AUTHORIZED:
				getPriorAuthorizationDollarsAuthorized().clear();
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_OF_REFILLS_AUTHORIZED:
				getPriorAuthorizationNumberOfRefillsAuthorized().clear();
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY_ACCUMULATED:
				getPriorAuthorizationQuantityAccumulated().clear();
				return;
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED:
				getPriorAuthorizationNumberassigned().clear();
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
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_PROCESSED_DATE:
				return priorAuthorizationProcessedDate != null && !priorAuthorizationProcessedDate.isEmpty();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EFFECTIVE_DATE:
				return priorAuthorizationEffectiveDate != null && !priorAuthorizationEffectiveDate.isEmpty();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EXPIRATION_DATE:
				return priorAuthorizationExpirationDate != null && !priorAuthorizationExpirationDate.isEmpty();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY:
				return priorAuthorizationQuantity != null && !priorAuthorizationQuantity.isEmpty();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_DOLLARS_AUTHORIZED:
				return priorAuthorizationDollarsAuthorized != null && !priorAuthorizationDollarsAuthorized.isEmpty();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_OF_REFILLS_AUTHORIZED:
				return priorAuthorizationNumberOfRefillsAuthorized != null && !priorAuthorizationNumberOfRefillsAuthorized.isEmpty();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY_ACCUMULATED:
				return priorAuthorizationQuantityAccumulated != null && !priorAuthorizationQuantityAccumulated.isEmpty();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED:
				return priorAuthorizationNumberassigned != null && !priorAuthorizationNumberassigned.isEmpty();
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

} //ResponsePriorAuthorizationSegmentImpl
