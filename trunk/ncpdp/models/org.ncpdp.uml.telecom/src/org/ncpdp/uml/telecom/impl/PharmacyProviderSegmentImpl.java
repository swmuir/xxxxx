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
import org.ncpdp.uml.telecom.PharmacyProviderSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Pharmacy Provider Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PharmacyProviderSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PharmacyProviderSegmentImpl#getProviderIdQualifier <em>Provider Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PharmacyProviderSegmentImpl#getProviderId <em>Provider Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PharmacyProviderSegmentImpl extends EObjectImpl implements PharmacyProviderSegment {
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
	 * The cached value of the '{@link #getProviderIdQualifier() <em>Provider Id Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> providerIdQualifier;

	/**
	 * The cached value of the '{@link #getProviderId() <em>Provider Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProviderId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> providerId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PharmacyProviderSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.PHARMACY_PROVIDER_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.PHARMACY_PROVIDER_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getProviderIdQualifier() {
		if (providerIdQualifier == null) {
			providerIdQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID_QUALIFIER);
		}
		return providerIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getProviderId() {
		if (providerId == null) {
			providerId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID);
		}
		return providerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID_QUALIFIER:
				return ((InternalEList<?>)getProviderIdQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID:
				return ((InternalEList<?>)getProviderId()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID_QUALIFIER:
				return getProviderIdQualifier();
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID:
				return getProviderId();
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
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID_QUALIFIER:
				getProviderIdQualifier().clear();
				getProviderIdQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID:
				getProviderId().clear();
				getProviderId().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID_QUALIFIER:
				getProviderIdQualifier().clear();
				return;
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID:
				getProviderId().clear();
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
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID_QUALIFIER:
				return providerIdQualifier != null && !providerIdQualifier.isEmpty();
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID:
				return providerId != null && !providerId.isEmpty();
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

} //PharmacyProviderSegmentImpl
