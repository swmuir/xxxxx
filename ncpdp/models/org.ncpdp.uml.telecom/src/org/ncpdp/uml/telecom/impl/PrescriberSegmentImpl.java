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
import org.ncpdp.uml.telecom.PrescriberSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prescriber Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrescriberIdQualifier <em>Prescriber Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrescriberId <em>Prescriber Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrescriberLastName <em>Prescriber Last Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrescriberPhoneNumber <em>Prescriber Phone Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrimaryCareProviderIdQualifier <em>Primary Care Provider Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrimaryCareProviderId <em>Primary Care Provider Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrimaryCareProviderLastName <em>Primary Care Provider Last Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrescriberFirstName <em>Prescriber First Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrescriberStreetAddress <em>Prescriber Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrescriberCityAddress <em>Prescriber City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrescriberStateprovinceAddress <em>Prescriber Stateprovince Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl#getPrescriberZippostalZone <em>Prescriber Zippostal Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PrescriberSegmentImpl extends EObjectImpl implements PrescriberSegment {
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
	 * The cached value of the '{@link #getPrescriberIdQualifier() <em>Prescriber Id Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriberIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriberIdQualifier;

	/**
	 * The cached value of the '{@link #getPrescriberId() <em>Prescriber Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriberId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriberId;

	/**
	 * The cached value of the '{@link #getPrescriberLastName() <em>Prescriber Last Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriberLastName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriberLastName;

	/**
	 * The cached value of the '{@link #getPrescriberPhoneNumber() <em>Prescriber Phone Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriberPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriberPhoneNumber;

	/**
	 * The cached value of the '{@link #getPrimaryCareProviderIdQualifier() <em>Primary Care Provider Id Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryCareProviderIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> primaryCareProviderIdQualifier;

	/**
	 * The cached value of the '{@link #getPrimaryCareProviderId() <em>Primary Care Provider Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryCareProviderId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> primaryCareProviderId;

	/**
	 * The cached value of the '{@link #getPrimaryCareProviderLastName() <em>Primary Care Provider Last Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrimaryCareProviderLastName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> primaryCareProviderLastName;

	/**
	 * The cached value of the '{@link #getPrescriberFirstName() <em>Prescriber First Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriberFirstName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriberFirstName;

	/**
	 * The cached value of the '{@link #getPrescriberStreetAddress() <em>Prescriber Street Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriberStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriberStreetAddress;

	/**
	 * The cached value of the '{@link #getPrescriberCityAddress() <em>Prescriber City Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriberCityAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriberCityAddress;

	/**
	 * The cached value of the '{@link #getPrescriberStateprovinceAddress() <em>Prescriber Stateprovince Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriberStateprovinceAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriberStateprovinceAddress;

	/**
	 * The cached value of the '{@link #getPrescriberZippostalZone() <em>Prescriber Zippostal Zone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriberZippostalZone()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriberZippostalZone;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PrescriberSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.PRESCRIBER_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.PRESCRIBER_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriberIdQualifier() {
		if (prescriberIdQualifier == null) {
			prescriberIdQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID_QUALIFIER);
		}
		return prescriberIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriberId() {
		if (prescriberId == null) {
			prescriberId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID);
		}
		return prescriberId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriberLastName() {
		if (prescriberLastName == null) {
			prescriberLastName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_LAST_NAME);
		}
		return prescriberLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriberPhoneNumber() {
		if (prescriberPhoneNumber == null) {
			prescriberPhoneNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_PHONE_NUMBER);
		}
		return prescriberPhoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrimaryCareProviderIdQualifier() {
		if (primaryCareProviderIdQualifier == null) {
			primaryCareProviderIdQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID_QUALIFIER);
		}
		return primaryCareProviderIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrimaryCareProviderId() {
		if (primaryCareProviderId == null) {
			primaryCareProviderId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID);
		}
		return primaryCareProviderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrimaryCareProviderLastName() {
		if (primaryCareProviderLastName == null) {
			primaryCareProviderLastName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_LAST_NAME);
		}
		return primaryCareProviderLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriberFirstName() {
		if (prescriberFirstName == null) {
			prescriberFirstName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_FIRST_NAME);
		}
		return prescriberFirstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriberStreetAddress() {
		if (prescriberStreetAddress == null) {
			prescriberStreetAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STREET_ADDRESS);
		}
		return prescriberStreetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriberCityAddress() {
		if (prescriberCityAddress == null) {
			prescriberCityAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_CITY_ADDRESS);
		}
		return prescriberCityAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriberStateprovinceAddress() {
		if (prescriberStateprovinceAddress == null) {
			prescriberStateprovinceAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STATEPROVINCE_ADDRESS);
		}
		return prescriberStateprovinceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriberZippostalZone() {
		if (prescriberZippostalZone == null) {
			prescriberZippostalZone = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ZIPPOSTAL_ZONE);
		}
		return prescriberZippostalZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID_QUALIFIER:
				return ((InternalEList<?>)getPrescriberIdQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID:
				return ((InternalEList<?>)getPrescriberId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_LAST_NAME:
				return ((InternalEList<?>)getPrescriberLastName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_PHONE_NUMBER:
				return ((InternalEList<?>)getPrescriberPhoneNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID_QUALIFIER:
				return ((InternalEList<?>)getPrimaryCareProviderIdQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID:
				return ((InternalEList<?>)getPrimaryCareProviderId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_LAST_NAME:
				return ((InternalEList<?>)getPrimaryCareProviderLastName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_FIRST_NAME:
				return ((InternalEList<?>)getPrescriberFirstName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STREET_ADDRESS:
				return ((InternalEList<?>)getPrescriberStreetAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_CITY_ADDRESS:
				return ((InternalEList<?>)getPrescriberCityAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STATEPROVINCE_ADDRESS:
				return ((InternalEList<?>)getPrescriberStateprovinceAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ZIPPOSTAL_ZONE:
				return ((InternalEList<?>)getPrescriberZippostalZone()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.PRESCRIBER_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID_QUALIFIER:
				return getPrescriberIdQualifier();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID:
				return getPrescriberId();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_LAST_NAME:
				return getPrescriberLastName();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_PHONE_NUMBER:
				return getPrescriberPhoneNumber();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID_QUALIFIER:
				return getPrimaryCareProviderIdQualifier();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID:
				return getPrimaryCareProviderId();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_LAST_NAME:
				return getPrimaryCareProviderLastName();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_FIRST_NAME:
				return getPrescriberFirstName();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STREET_ADDRESS:
				return getPrescriberStreetAddress();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_CITY_ADDRESS:
				return getPrescriberCityAddress();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STATEPROVINCE_ADDRESS:
				return getPrescriberStateprovinceAddress();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ZIPPOSTAL_ZONE:
				return getPrescriberZippostalZone();
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
			case TelecomPackage.PRESCRIBER_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID_QUALIFIER:
				getPrescriberIdQualifier().clear();
				getPrescriberIdQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID:
				getPrescriberId().clear();
				getPrescriberId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_LAST_NAME:
				getPrescriberLastName().clear();
				getPrescriberLastName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_PHONE_NUMBER:
				getPrescriberPhoneNumber().clear();
				getPrescriberPhoneNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID_QUALIFIER:
				getPrimaryCareProviderIdQualifier().clear();
				getPrimaryCareProviderIdQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID:
				getPrimaryCareProviderId().clear();
				getPrimaryCareProviderId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_LAST_NAME:
				getPrimaryCareProviderLastName().clear();
				getPrimaryCareProviderLastName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_FIRST_NAME:
				getPrescriberFirstName().clear();
				getPrescriberFirstName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STREET_ADDRESS:
				getPrescriberStreetAddress().clear();
				getPrescriberStreetAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_CITY_ADDRESS:
				getPrescriberCityAddress().clear();
				getPrescriberCityAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STATEPROVINCE_ADDRESS:
				getPrescriberStateprovinceAddress().clear();
				getPrescriberStateprovinceAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ZIPPOSTAL_ZONE:
				getPrescriberZippostalZone().clear();
				getPrescriberZippostalZone().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.PRESCRIBER_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID_QUALIFIER:
				getPrescriberIdQualifier().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID:
				getPrescriberId().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_LAST_NAME:
				getPrescriberLastName().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_PHONE_NUMBER:
				getPrescriberPhoneNumber().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID_QUALIFIER:
				getPrimaryCareProviderIdQualifier().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID:
				getPrimaryCareProviderId().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_LAST_NAME:
				getPrimaryCareProviderLastName().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_FIRST_NAME:
				getPrescriberFirstName().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STREET_ADDRESS:
				getPrescriberStreetAddress().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_CITY_ADDRESS:
				getPrescriberCityAddress().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STATEPROVINCE_ADDRESS:
				getPrescriberStateprovinceAddress().clear();
				return;
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ZIPPOSTAL_ZONE:
				getPrescriberZippostalZone().clear();
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
			case TelecomPackage.PRESCRIBER_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID_QUALIFIER:
				return prescriberIdQualifier != null && !prescriberIdQualifier.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ID:
				return prescriberId != null && !prescriberId.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_LAST_NAME:
				return prescriberLastName != null && !prescriberLastName.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_PHONE_NUMBER:
				return prescriberPhoneNumber != null && !prescriberPhoneNumber.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID_QUALIFIER:
				return primaryCareProviderIdQualifier != null && !primaryCareProviderIdQualifier.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID:
				return primaryCareProviderId != null && !primaryCareProviderId.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_LAST_NAME:
				return primaryCareProviderLastName != null && !primaryCareProviderLastName.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_FIRST_NAME:
				return prescriberFirstName != null && !prescriberFirstName.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STREET_ADDRESS:
				return prescriberStreetAddress != null && !prescriberStreetAddress.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_CITY_ADDRESS:
				return prescriberCityAddress != null && !prescriberCityAddress.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_STATEPROVINCE_ADDRESS:
				return prescriberStateprovinceAddress != null && !prescriberStateprovinceAddress.isEmpty();
			case TelecomPackage.PRESCRIBER_SEGMENT__PRESCRIBER_ZIPPOSTAL_ZONE:
				return prescriberZippostalZone != null && !prescriberZippostalZone.isEmpty();
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

} //PrescriberSegmentImpl
