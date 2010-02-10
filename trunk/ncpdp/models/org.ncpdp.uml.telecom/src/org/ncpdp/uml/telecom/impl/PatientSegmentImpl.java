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

import org.ncpdp.uml.ECL.PatientGenderCode;
import org.ncpdp.uml.ECL.PatientIDQualifier;
import org.ncpdp.uml.ECL.PatientLocation;
import org.ncpdp.uml.ECL.PatientResidence;
import org.ncpdp.uml.ECL.PregnancyIndicator;

import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.PatientSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Patient Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientIdQualifier <em>Patient Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientId <em>Patient Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientGenderCode <em>Patient Gender Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientFirstName <em>Patient First Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientLastName <em>Patient Last Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientStreetAddress <em>Patient Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientCityAddress <em>Patient City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientStateProvinceAddress <em>Patient State Province Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientZippostalZone <em>Patient Zippostal Zone</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientPhoneNumber <em>Patient Phone Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPlaceOfService <em>Place Of Service</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getEmployerId <em>Employer Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getSmokerNonsmokerCode <em>Smoker Nonsmoker Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPregnancyIndicator <em>Pregnancy Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientEmailAddress <em>Patient Email Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl#getPatientResidence <em>Patient Residence</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PatientSegmentImpl extends EObjectImpl implements PatientSegment {
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
	 * The cached value of the '{@link #getPatientIdQualifier() <em>Patient Id Qualifier</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientIDQualifier> patientIdQualifier;

	/**
	 * The cached value of the '{@link #getPatientId() <em>Patient Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientId;

	/**
	 * The cached value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> dateOfBirth;

	/**
	 * The cached value of the '{@link #getPatientGenderCode() <em>Patient Gender Code</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientGenderCode()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientGenderCode> patientGenderCode;

	/**
	 * The cached value of the '{@link #getPatientFirstName() <em>Patient First Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientFirstName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientFirstName;

	/**
	 * The cached value of the '{@link #getPatientLastName() <em>Patient Last Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientLastName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientLastName;

	/**
	 * The cached value of the '{@link #getPatientStreetAddress() <em>Patient Street Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientStreetAddress;

	/**
	 * The cached value of the '{@link #getPatientCityAddress() <em>Patient City Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientCityAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientCityAddress;

	/**
	 * The cached value of the '{@link #getPatientStateProvinceAddress() <em>Patient State Province Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientStateProvinceAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientStateProvinceAddress;

	/**
	 * The cached value of the '{@link #getPatientZippostalZone() <em>Patient Zippostal Zone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientZippostalZone()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientZippostalZone;

	/**
	 * The cached value of the '{@link #getPatientPhoneNumber() <em>Patient Phone Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientPhoneNumber;

	/**
	 * The cached value of the '{@link #getPlaceOfService() <em>Place Of Service</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPlaceOfService()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientLocation> placeOfService;

	/**
	 * The cached value of the '{@link #getEmployerId() <em>Employer Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployerId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> employerId;

	/**
	 * The cached value of the '{@link #getSmokerNonsmokerCode() <em>Smoker Nonsmoker Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSmokerNonsmokerCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> smokerNonsmokerCode;

	/**
	 * The cached value of the '{@link #getPregnancyIndicator() <em>Pregnancy Indicator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPregnancyIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<PregnancyIndicator> pregnancyIndicator;

	/**
	 * The cached value of the '{@link #getPatientEmailAddress() <em>Patient Email Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientEmailAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientEmailAddress;

	/**
	 * The cached value of the '{@link #getPatientResidence() <em>Patient Residence</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientResidence()
	 * @generated
	 * @ordered
	 */
	protected EList<PatientResidence> patientResidence;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PatientSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.PATIENT_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.PATIENT_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientIDQualifier> getPatientIdQualifier() {
		if (patientIdQualifier == null) {
			patientIdQualifier = new EDataTypeUniqueEList<PatientIDQualifier>(PatientIDQualifier.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_ID_QUALIFIER);
		}
		return patientIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientId() {
		if (patientId == null) {
			patientId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_ID);
		}
		return patientId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDateOfBirth() {
		if (dateOfBirth == null) {
			dateOfBirth = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__DATE_OF_BIRTH);
		}
		return dateOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientGenderCode> getPatientGenderCode() {
		if (patientGenderCode == null) {
			patientGenderCode = new EDataTypeUniqueEList<PatientGenderCode>(PatientGenderCode.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_GENDER_CODE);
		}
		return patientGenderCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientFirstName() {
		if (patientFirstName == null) {
			patientFirstName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_FIRST_NAME);
		}
		return patientFirstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientLastName() {
		if (patientLastName == null) {
			patientLastName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_LAST_NAME);
		}
		return patientLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientStreetAddress() {
		if (patientStreetAddress == null) {
			patientStreetAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_STREET_ADDRESS);
		}
		return patientStreetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientCityAddress() {
		if (patientCityAddress == null) {
			patientCityAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_CITY_ADDRESS);
		}
		return patientCityAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientStateProvinceAddress() {
		if (patientStateProvinceAddress == null) {
			patientStateProvinceAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_STATE_PROVINCE_ADDRESS);
		}
		return patientStateProvinceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientZippostalZone() {
		if (patientZippostalZone == null) {
			patientZippostalZone = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_ZIPPOSTAL_ZONE);
		}
		return patientZippostalZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientPhoneNumber() {
		if (patientPhoneNumber == null) {
			patientPhoneNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_PHONE_NUMBER);
		}
		return patientPhoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientLocation> getPlaceOfService() {
		if (placeOfService == null) {
			placeOfService = new EDataTypeUniqueEList<PatientLocation>(PatientLocation.class, this, TelecomPackage.PATIENT_SEGMENT__PLACE_OF_SERVICE);
		}
		return placeOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getEmployerId() {
		if (employerId == null) {
			employerId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__EMPLOYER_ID);
		}
		return employerId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getSmokerNonsmokerCode() {
		if (smokerNonsmokerCode == null) {
			smokerNonsmokerCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__SMOKER_NONSMOKER_CODE);
		}
		return smokerNonsmokerCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PregnancyIndicator> getPregnancyIndicator() {
		if (pregnancyIndicator == null) {
			pregnancyIndicator = new EDataTypeUniqueEList<PregnancyIndicator>(PregnancyIndicator.class, this, TelecomPackage.PATIENT_SEGMENT__PREGNANCY_INDICATOR);
		}
		return pregnancyIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientEmailAddress() {
		if (patientEmailAddress == null) {
			patientEmailAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_EMAIL_ADDRESS);
		}
		return patientEmailAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<PatientResidence> getPatientResidence() {
		if (patientResidence == null) {
			patientResidence = new EDataTypeUniqueEList<PatientResidence>(PatientResidence.class, this, TelecomPackage.PATIENT_SEGMENT__PATIENT_RESIDENCE);
		}
		return patientResidence;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ID:
				return ((InternalEList<?>)getPatientId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PATIENT_SEGMENT__DATE_OF_BIRTH:
				return ((InternalEList<?>)getDateOfBirth()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_FIRST_NAME:
				return ((InternalEList<?>)getPatientFirstName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_LAST_NAME:
				return ((InternalEList<?>)getPatientLastName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_STREET_ADDRESS:
				return ((InternalEList<?>)getPatientStreetAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_CITY_ADDRESS:
				return ((InternalEList<?>)getPatientCityAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_STATE_PROVINCE_ADDRESS:
				return ((InternalEList<?>)getPatientStateProvinceAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ZIPPOSTAL_ZONE:
				return ((InternalEList<?>)getPatientZippostalZone()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_PHONE_NUMBER:
				return ((InternalEList<?>)getPatientPhoneNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PATIENT_SEGMENT__EMPLOYER_ID:
				return ((InternalEList<?>)getEmployerId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PATIENT_SEGMENT__SMOKER_NONSMOKER_CODE:
				return ((InternalEList<?>)getSmokerNonsmokerCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_EMAIL_ADDRESS:
				return ((InternalEList<?>)getPatientEmailAddress()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.PATIENT_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ID_QUALIFIER:
				return getPatientIdQualifier();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ID:
				return getPatientId();
			case TelecomPackage.PATIENT_SEGMENT__DATE_OF_BIRTH:
				return getDateOfBirth();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_GENDER_CODE:
				return getPatientGenderCode();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_FIRST_NAME:
				return getPatientFirstName();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_LAST_NAME:
				return getPatientLastName();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_STREET_ADDRESS:
				return getPatientStreetAddress();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_CITY_ADDRESS:
				return getPatientCityAddress();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_STATE_PROVINCE_ADDRESS:
				return getPatientStateProvinceAddress();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ZIPPOSTAL_ZONE:
				return getPatientZippostalZone();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_PHONE_NUMBER:
				return getPatientPhoneNumber();
			case TelecomPackage.PATIENT_SEGMENT__PLACE_OF_SERVICE:
				return getPlaceOfService();
			case TelecomPackage.PATIENT_SEGMENT__EMPLOYER_ID:
				return getEmployerId();
			case TelecomPackage.PATIENT_SEGMENT__SMOKER_NONSMOKER_CODE:
				return getSmokerNonsmokerCode();
			case TelecomPackage.PATIENT_SEGMENT__PREGNANCY_INDICATOR:
				return getPregnancyIndicator();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_EMAIL_ADDRESS:
				return getPatientEmailAddress();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_RESIDENCE:
				return getPatientResidence();
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
			case TelecomPackage.PATIENT_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ID_QUALIFIER:
				getPatientIdQualifier().clear();
				getPatientIdQualifier().addAll((Collection<? extends PatientIDQualifier>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ID:
				getPatientId().clear();
				getPatientId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__DATE_OF_BIRTH:
				getDateOfBirth().clear();
				getDateOfBirth().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_GENDER_CODE:
				getPatientGenderCode().clear();
				getPatientGenderCode().addAll((Collection<? extends PatientGenderCode>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_FIRST_NAME:
				getPatientFirstName().clear();
				getPatientFirstName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_LAST_NAME:
				getPatientLastName().clear();
				getPatientLastName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_STREET_ADDRESS:
				getPatientStreetAddress().clear();
				getPatientStreetAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_CITY_ADDRESS:
				getPatientCityAddress().clear();
				getPatientCityAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_STATE_PROVINCE_ADDRESS:
				getPatientStateProvinceAddress().clear();
				getPatientStateProvinceAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ZIPPOSTAL_ZONE:
				getPatientZippostalZone().clear();
				getPatientZippostalZone().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_PHONE_NUMBER:
				getPatientPhoneNumber().clear();
				getPatientPhoneNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PLACE_OF_SERVICE:
				getPlaceOfService().clear();
				getPlaceOfService().addAll((Collection<? extends PatientLocation>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__EMPLOYER_ID:
				getEmployerId().clear();
				getEmployerId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__SMOKER_NONSMOKER_CODE:
				getSmokerNonsmokerCode().clear();
				getSmokerNonsmokerCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PREGNANCY_INDICATOR:
				getPregnancyIndicator().clear();
				getPregnancyIndicator().addAll((Collection<? extends PregnancyIndicator>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_EMAIL_ADDRESS:
				getPatientEmailAddress().clear();
				getPatientEmailAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_RESIDENCE:
				getPatientResidence().clear();
				getPatientResidence().addAll((Collection<? extends PatientResidence>)newValue);
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
			case TelecomPackage.PATIENT_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ID_QUALIFIER:
				getPatientIdQualifier().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ID:
				getPatientId().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__DATE_OF_BIRTH:
				getDateOfBirth().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_GENDER_CODE:
				getPatientGenderCode().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_FIRST_NAME:
				getPatientFirstName().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_LAST_NAME:
				getPatientLastName().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_STREET_ADDRESS:
				getPatientStreetAddress().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_CITY_ADDRESS:
				getPatientCityAddress().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_STATE_PROVINCE_ADDRESS:
				getPatientStateProvinceAddress().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ZIPPOSTAL_ZONE:
				getPatientZippostalZone().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_PHONE_NUMBER:
				getPatientPhoneNumber().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PLACE_OF_SERVICE:
				getPlaceOfService().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__EMPLOYER_ID:
				getEmployerId().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__SMOKER_NONSMOKER_CODE:
				getSmokerNonsmokerCode().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PREGNANCY_INDICATOR:
				getPregnancyIndicator().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_EMAIL_ADDRESS:
				getPatientEmailAddress().clear();
				return;
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_RESIDENCE:
				getPatientResidence().clear();
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
			case TelecomPackage.PATIENT_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ID_QUALIFIER:
				return patientIdQualifier != null && !patientIdQualifier.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ID:
				return patientId != null && !patientId.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__DATE_OF_BIRTH:
				return dateOfBirth != null && !dateOfBirth.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_GENDER_CODE:
				return patientGenderCode != null && !patientGenderCode.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_FIRST_NAME:
				return patientFirstName != null && !patientFirstName.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_LAST_NAME:
				return patientLastName != null && !patientLastName.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_STREET_ADDRESS:
				return patientStreetAddress != null && !patientStreetAddress.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_CITY_ADDRESS:
				return patientCityAddress != null && !patientCityAddress.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_STATE_PROVINCE_ADDRESS:
				return patientStateProvinceAddress != null && !patientStateProvinceAddress.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_ZIPPOSTAL_ZONE:
				return patientZippostalZone != null && !patientZippostalZone.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_PHONE_NUMBER:
				return patientPhoneNumber != null && !patientPhoneNumber.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PLACE_OF_SERVICE:
				return placeOfService != null && !placeOfService.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__EMPLOYER_ID:
				return employerId != null && !employerId.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__SMOKER_NONSMOKER_CODE:
				return smokerNonsmokerCode != null && !smokerNonsmokerCode.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PREGNANCY_INDICATOR:
				return pregnancyIndicator != null && !pregnancyIndicator.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_EMAIL_ADDRESS:
				return patientEmailAddress != null && !patientEmailAddress.isEmpty();
			case TelecomPackage.PATIENT_SEGMENT__PATIENT_RESIDENCE:
				return patientResidence != null && !patientResidence.isEmpty();
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
		result.append(", patientIdQualifier: ");
		result.append(patientIdQualifier);
		result.append(", patientGenderCode: ");
		result.append(patientGenderCode);
		result.append(", placeOfService: ");
		result.append(placeOfService);
		result.append(", pregnancyIndicator: ");
		result.append(pregnancyIndicator);
		result.append(", patientResidence: ");
		result.append(patientResidence);
		result.append(')');
		return result.toString();
	}

} //PatientSegmentImpl
