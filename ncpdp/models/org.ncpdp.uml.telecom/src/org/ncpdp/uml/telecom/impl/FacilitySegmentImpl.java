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

import org.ncpdp.uml.telecom.FacilitySegment;
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Facility Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.FacilitySegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.FacilitySegmentImpl#getFacilityId <em>Facility Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.FacilitySegmentImpl#getFacilityName <em>Facility Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.FacilitySegmentImpl#getFacilityStreetAddress <em>Facility Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.FacilitySegmentImpl#getFacilityCityAddress <em>Facility City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.FacilitySegmentImpl#getFacilityStateprovinceAddress <em>Facility Stateprovince Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.FacilitySegmentImpl#getFacilityZippostalZone <em>Facility Zippostal Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FacilitySegmentImpl extends EObjectImpl implements FacilitySegment {
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
	 * The cached value of the '{@link #getFacilityId() <em>Facility Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> facilityId;

	/**
	 * The cached value of the '{@link #getFacilityName() <em>Facility Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> facilityName;

	/**
	 * The cached value of the '{@link #getFacilityStreetAddress() <em>Facility Street Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> facilityStreetAddress;

	/**
	 * The cached value of the '{@link #getFacilityCityAddress() <em>Facility City Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityCityAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> facilityCityAddress;

	/**
	 * The cached value of the '{@link #getFacilityStateprovinceAddress() <em>Facility Stateprovince Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityStateprovinceAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> facilityStateprovinceAddress;

	/**
	 * The cached value of the '{@link #getFacilityZippostalZone() <em>Facility Zippostal Zone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilityZippostalZone()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> facilityZippostalZone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FacilitySegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.FACILITY_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.FACILITY_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFacilityId() {
		if (facilityId == null) {
			facilityId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.FACILITY_SEGMENT__FACILITY_ID);
		}
		return facilityId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFacilityName() {
		if (facilityName == null) {
			facilityName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.FACILITY_SEGMENT__FACILITY_NAME);
		}
		return facilityName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFacilityStreetAddress() {
		if (facilityStreetAddress == null) {
			facilityStreetAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.FACILITY_SEGMENT__FACILITY_STREET_ADDRESS);
		}
		return facilityStreetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFacilityCityAddress() {
		if (facilityCityAddress == null) {
			facilityCityAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.FACILITY_SEGMENT__FACILITY_CITY_ADDRESS);
		}
		return facilityCityAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFacilityStateprovinceAddress() {
		if (facilityStateprovinceAddress == null) {
			facilityStateprovinceAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.FACILITY_SEGMENT__FACILITY_STATEPROVINCE_ADDRESS);
		}
		return facilityStateprovinceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFacilityZippostalZone() {
		if (facilityZippostalZone == null) {
			facilityZippostalZone = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.FACILITY_SEGMENT__FACILITY_ZIPPOSTAL_ZONE);
		}
		return facilityZippostalZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_ID:
				return ((InternalEList<?>)getFacilityId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_NAME:
				return ((InternalEList<?>)getFacilityName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_STREET_ADDRESS:
				return ((InternalEList<?>)getFacilityStreetAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_CITY_ADDRESS:
				return ((InternalEList<?>)getFacilityCityAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_STATEPROVINCE_ADDRESS:
				return ((InternalEList<?>)getFacilityStateprovinceAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_ZIPPOSTAL_ZONE:
				return ((InternalEList<?>)getFacilityZippostalZone()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.FACILITY_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_ID:
				return getFacilityId();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_NAME:
				return getFacilityName();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_STREET_ADDRESS:
				return getFacilityStreetAddress();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_CITY_ADDRESS:
				return getFacilityCityAddress();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_STATEPROVINCE_ADDRESS:
				return getFacilityStateprovinceAddress();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_ZIPPOSTAL_ZONE:
				return getFacilityZippostalZone();
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
			case TelecomPackage.FACILITY_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_ID:
				getFacilityId().clear();
				getFacilityId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_NAME:
				getFacilityName().clear();
				getFacilityName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_STREET_ADDRESS:
				getFacilityStreetAddress().clear();
				getFacilityStreetAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_CITY_ADDRESS:
				getFacilityCityAddress().clear();
				getFacilityCityAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_STATEPROVINCE_ADDRESS:
				getFacilityStateprovinceAddress().clear();
				getFacilityStateprovinceAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_ZIPPOSTAL_ZONE:
				getFacilityZippostalZone().clear();
				getFacilityZippostalZone().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.FACILITY_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_ID:
				getFacilityId().clear();
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_NAME:
				getFacilityName().clear();
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_STREET_ADDRESS:
				getFacilityStreetAddress().clear();
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_CITY_ADDRESS:
				getFacilityCityAddress().clear();
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_STATEPROVINCE_ADDRESS:
				getFacilityStateprovinceAddress().clear();
				return;
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_ZIPPOSTAL_ZONE:
				getFacilityZippostalZone().clear();
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
			case TelecomPackage.FACILITY_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_ID:
				return facilityId != null && !facilityId.isEmpty();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_NAME:
				return facilityName != null && !facilityName.isEmpty();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_STREET_ADDRESS:
				return facilityStreetAddress != null && !facilityStreetAddress.isEmpty();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_CITY_ADDRESS:
				return facilityCityAddress != null && !facilityCityAddress.isEmpty();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_STATEPROVINCE_ADDRESS:
				return facilityStateprovinceAddress != null && !facilityStateprovinceAddress.isEmpty();
			case TelecomPackage.FACILITY_SEGMENT__FACILITY_ZIPPOSTAL_ZONE:
				return facilityZippostalZone != null && !facilityZippostalZone.isEmpty();
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

} //FacilitySegmentImpl
