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
import org.ncpdp.uml.telecom.TelecomPackage;
import org.ncpdp.uml.telecom.WorkersCompensationSegment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Workers Compensation Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getDateOfInjury <em>Date Of Injury</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getEmployerName <em>Employer Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getEmployerStreetAddress <em>Employer Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getEmployerCityAddress <em>Employer City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getEmployerStateprovinceAddress <em>Employer Stateprovince Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getEmployerZippostalZone <em>Employer Zippostal Zone</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getEmployerPhoneNumber <em>Employer Phone Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getEmployerContactName <em>Employer Contact Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getCarrierId <em>Carrier Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getClaimreferenceId <em>Claimreference Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getBillingEntityTypeIndicator <em>Billing Entity Type Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getPayToQualifier <em>Pay To Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getPayToId <em>Pay To Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getPayToName <em>Pay To Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getPayToStreetAddress <em>Pay To Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getPayToCityAddress <em>Pay To City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getPayToStateprovinceAddress <em>Pay To Stateprovince Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getPayToZippostalZone <em>Pay To Zippostal Zone</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getGenericEquivalentProductIdQualifier <em>Generic Equivalent Product Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl#getGenericEquivalentProductId <em>Generic Equivalent Product Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class WorkersCompensationSegmentImpl extends EObjectImpl implements WorkersCompensationSegment {
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
	 * The cached value of the '{@link #getDateOfInjury() <em>Date Of Injury</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfInjury()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> dateOfInjury;

	/**
	 * The cached value of the '{@link #getEmployerName() <em>Employer Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployerName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> employerName;

	/**
	 * The cached value of the '{@link #getEmployerStreetAddress() <em>Employer Street Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployerStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> employerStreetAddress;

	/**
	 * The cached value of the '{@link #getEmployerCityAddress() <em>Employer City Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployerCityAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> employerCityAddress;

	/**
	 * The cached value of the '{@link #getEmployerStateprovinceAddress() <em>Employer Stateprovince Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployerStateprovinceAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> employerStateprovinceAddress;

	/**
	 * The cached value of the '{@link #getEmployerZippostalZone() <em>Employer Zippostal Zone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployerZippostalZone()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> employerZippostalZone;

	/**
	 * The cached value of the '{@link #getEmployerPhoneNumber() <em>Employer Phone Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployerPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> employerPhoneNumber;

	/**
	 * The cached value of the '{@link #getEmployerContactName() <em>Employer Contact Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmployerContactName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> employerContactName;

	/**
	 * The cached value of the '{@link #getCarrierId() <em>Carrier Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCarrierId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> carrierId;

	/**
	 * The cached value of the '{@link #getClaimreferenceId() <em>Claimreference Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimreferenceId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> claimreferenceId;

	/**
	 * The cached value of the '{@link #getBillingEntityTypeIndicator() <em>Billing Entity Type Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBillingEntityTypeIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> billingEntityTypeIndicator;

	/**
	 * The cached value of the '{@link #getPayToQualifier() <em>Pay To Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayToQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> payToQualifier;

	/**
	 * The cached value of the '{@link #getPayToId() <em>Pay To Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayToId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> payToId;

	/**
	 * The cached value of the '{@link #getPayToName() <em>Pay To Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayToName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> payToName;

	/**
	 * The cached value of the '{@link #getPayToStreetAddress() <em>Pay To Street Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayToStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> payToStreetAddress;

	/**
	 * The cached value of the '{@link #getPayToCityAddress() <em>Pay To City Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayToCityAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> payToCityAddress;

	/**
	 * The cached value of the '{@link #getPayToStateprovinceAddress() <em>Pay To Stateprovince Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayToStateprovinceAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> payToStateprovinceAddress;

	/**
	 * The cached value of the '{@link #getPayToZippostalZone() <em>Pay To Zippostal Zone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPayToZippostalZone()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> payToZippostalZone;

	/**
	 * The cached value of the '{@link #getGenericEquivalentProductIdQualifier() <em>Generic Equivalent Product Id Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericEquivalentProductIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> genericEquivalentProductIdQualifier;

	/**
	 * The cached value of the '{@link #getGenericEquivalentProductId() <em>Generic Equivalent Product Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGenericEquivalentProductId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> genericEquivalentProductId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected WorkersCompensationSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.WORKERS_COMPENSATION_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDateOfInjury() {
		if (dateOfInjury == null) {
			dateOfInjury = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__DATE_OF_INJURY);
		}
		return dateOfInjury;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getEmployerName() {
		if (employerName == null) {
			employerName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_NAME);
		}
		return employerName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getEmployerStreetAddress() {
		if (employerStreetAddress == null) {
			employerStreetAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STREET_ADDRESS);
		}
		return employerStreetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getEmployerCityAddress() {
		if (employerCityAddress == null) {
			employerCityAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CITY_ADDRESS);
		}
		return employerCityAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getEmployerStateprovinceAddress() {
		if (employerStateprovinceAddress == null) {
			employerStateprovinceAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STATEPROVINCE_ADDRESS);
		}
		return employerStateprovinceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getEmployerZippostalZone() {
		if (employerZippostalZone == null) {
			employerZippostalZone = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_ZIPPOSTAL_ZONE);
		}
		return employerZippostalZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getEmployerPhoneNumber() {
		if (employerPhoneNumber == null) {
			employerPhoneNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_PHONE_NUMBER);
		}
		return employerPhoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getEmployerContactName() {
		if (employerContactName == null) {
			employerContactName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CONTACT_NAME);
		}
		return employerContactName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCarrierId() {
		if (carrierId == null) {
			carrierId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CARRIER_ID);
		}
		return carrierId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getClaimreferenceId() {
		if (claimreferenceId == null) {
			claimreferenceId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CLAIMREFERENCE_ID);
		}
		return claimreferenceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getBillingEntityTypeIndicator() {
		if (billingEntityTypeIndicator == null) {
			billingEntityTypeIndicator = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__BILLING_ENTITY_TYPE_INDICATOR);
		}
		return billingEntityTypeIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPayToQualifier() {
		if (payToQualifier == null) {
			payToQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_QUALIFIER);
		}
		return payToQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPayToId() {
		if (payToId == null) {
			payToId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ID);
		}
		return payToId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPayToName() {
		if (payToName == null) {
			payToName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_NAME);
		}
		return payToName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPayToStreetAddress() {
		if (payToStreetAddress == null) {
			payToStreetAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STREET_ADDRESS);
		}
		return payToStreetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPayToCityAddress() {
		if (payToCityAddress == null) {
			payToCityAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_CITY_ADDRESS);
		}
		return payToCityAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPayToStateprovinceAddress() {
		if (payToStateprovinceAddress == null) {
			payToStateprovinceAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STATEPROVINCE_ADDRESS);
		}
		return payToStateprovinceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPayToZippostalZone() {
		if (payToZippostalZone == null) {
			payToZippostalZone = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ZIPPOSTAL_ZONE);
		}
		return payToZippostalZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getGenericEquivalentProductIdQualifier() {
		if (genericEquivalentProductIdQualifier == null) {
			genericEquivalentProductIdQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID_QUALIFIER);
		}
		return genericEquivalentProductIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getGenericEquivalentProductId() {
		if (genericEquivalentProductId == null) {
			genericEquivalentProductId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID);
		}
		return genericEquivalentProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__DATE_OF_INJURY:
				return ((InternalEList<?>)getDateOfInjury()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_NAME:
				return ((InternalEList<?>)getEmployerName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STREET_ADDRESS:
				return ((InternalEList<?>)getEmployerStreetAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CITY_ADDRESS:
				return ((InternalEList<?>)getEmployerCityAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STATEPROVINCE_ADDRESS:
				return ((InternalEList<?>)getEmployerStateprovinceAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_ZIPPOSTAL_ZONE:
				return ((InternalEList<?>)getEmployerZippostalZone()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_PHONE_NUMBER:
				return ((InternalEList<?>)getEmployerPhoneNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CONTACT_NAME:
				return ((InternalEList<?>)getEmployerContactName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CARRIER_ID:
				return ((InternalEList<?>)getCarrierId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CLAIMREFERENCE_ID:
				return ((InternalEList<?>)getClaimreferenceId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__BILLING_ENTITY_TYPE_INDICATOR:
				return ((InternalEList<?>)getBillingEntityTypeIndicator()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_QUALIFIER:
				return ((InternalEList<?>)getPayToQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ID:
				return ((InternalEList<?>)getPayToId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_NAME:
				return ((InternalEList<?>)getPayToName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STREET_ADDRESS:
				return ((InternalEList<?>)getPayToStreetAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_CITY_ADDRESS:
				return ((InternalEList<?>)getPayToCityAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STATEPROVINCE_ADDRESS:
				return ((InternalEList<?>)getPayToStateprovinceAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ZIPPOSTAL_ZONE:
				return ((InternalEList<?>)getPayToZippostalZone()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID_QUALIFIER:
				return ((InternalEList<?>)getGenericEquivalentProductIdQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID:
				return ((InternalEList<?>)getGenericEquivalentProductId()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__DATE_OF_INJURY:
				return getDateOfInjury();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_NAME:
				return getEmployerName();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STREET_ADDRESS:
				return getEmployerStreetAddress();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CITY_ADDRESS:
				return getEmployerCityAddress();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STATEPROVINCE_ADDRESS:
				return getEmployerStateprovinceAddress();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_ZIPPOSTAL_ZONE:
				return getEmployerZippostalZone();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_PHONE_NUMBER:
				return getEmployerPhoneNumber();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CONTACT_NAME:
				return getEmployerContactName();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CARRIER_ID:
				return getCarrierId();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CLAIMREFERENCE_ID:
				return getClaimreferenceId();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__BILLING_ENTITY_TYPE_INDICATOR:
				return getBillingEntityTypeIndicator();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_QUALIFIER:
				return getPayToQualifier();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ID:
				return getPayToId();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_NAME:
				return getPayToName();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STREET_ADDRESS:
				return getPayToStreetAddress();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_CITY_ADDRESS:
				return getPayToCityAddress();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STATEPROVINCE_ADDRESS:
				return getPayToStateprovinceAddress();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ZIPPOSTAL_ZONE:
				return getPayToZippostalZone();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID_QUALIFIER:
				return getGenericEquivalentProductIdQualifier();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID:
				return getGenericEquivalentProductId();
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
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__DATE_OF_INJURY:
				getDateOfInjury().clear();
				getDateOfInjury().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_NAME:
				getEmployerName().clear();
				getEmployerName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STREET_ADDRESS:
				getEmployerStreetAddress().clear();
				getEmployerStreetAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CITY_ADDRESS:
				getEmployerCityAddress().clear();
				getEmployerCityAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STATEPROVINCE_ADDRESS:
				getEmployerStateprovinceAddress().clear();
				getEmployerStateprovinceAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_ZIPPOSTAL_ZONE:
				getEmployerZippostalZone().clear();
				getEmployerZippostalZone().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_PHONE_NUMBER:
				getEmployerPhoneNumber().clear();
				getEmployerPhoneNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CONTACT_NAME:
				getEmployerContactName().clear();
				getEmployerContactName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CARRIER_ID:
				getCarrierId().clear();
				getCarrierId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CLAIMREFERENCE_ID:
				getClaimreferenceId().clear();
				getClaimreferenceId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__BILLING_ENTITY_TYPE_INDICATOR:
				getBillingEntityTypeIndicator().clear();
				getBillingEntityTypeIndicator().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_QUALIFIER:
				getPayToQualifier().clear();
				getPayToQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ID:
				getPayToId().clear();
				getPayToId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_NAME:
				getPayToName().clear();
				getPayToName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STREET_ADDRESS:
				getPayToStreetAddress().clear();
				getPayToStreetAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_CITY_ADDRESS:
				getPayToCityAddress().clear();
				getPayToCityAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STATEPROVINCE_ADDRESS:
				getPayToStateprovinceAddress().clear();
				getPayToStateprovinceAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ZIPPOSTAL_ZONE:
				getPayToZippostalZone().clear();
				getPayToZippostalZone().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID_QUALIFIER:
				getGenericEquivalentProductIdQualifier().clear();
				getGenericEquivalentProductIdQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID:
				getGenericEquivalentProductId().clear();
				getGenericEquivalentProductId().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__DATE_OF_INJURY:
				getDateOfInjury().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_NAME:
				getEmployerName().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STREET_ADDRESS:
				getEmployerStreetAddress().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CITY_ADDRESS:
				getEmployerCityAddress().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STATEPROVINCE_ADDRESS:
				getEmployerStateprovinceAddress().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_ZIPPOSTAL_ZONE:
				getEmployerZippostalZone().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_PHONE_NUMBER:
				getEmployerPhoneNumber().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CONTACT_NAME:
				getEmployerContactName().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CARRIER_ID:
				getCarrierId().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CLAIMREFERENCE_ID:
				getClaimreferenceId().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__BILLING_ENTITY_TYPE_INDICATOR:
				getBillingEntityTypeIndicator().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_QUALIFIER:
				getPayToQualifier().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ID:
				getPayToId().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_NAME:
				getPayToName().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STREET_ADDRESS:
				getPayToStreetAddress().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_CITY_ADDRESS:
				getPayToCityAddress().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STATEPROVINCE_ADDRESS:
				getPayToStateprovinceAddress().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ZIPPOSTAL_ZONE:
				getPayToZippostalZone().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID_QUALIFIER:
				getGenericEquivalentProductIdQualifier().clear();
				return;
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID:
				getGenericEquivalentProductId().clear();
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
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__DATE_OF_INJURY:
				return dateOfInjury != null && !dateOfInjury.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_NAME:
				return employerName != null && !employerName.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STREET_ADDRESS:
				return employerStreetAddress != null && !employerStreetAddress.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CITY_ADDRESS:
				return employerCityAddress != null && !employerCityAddress.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STATEPROVINCE_ADDRESS:
				return employerStateprovinceAddress != null && !employerStateprovinceAddress.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_ZIPPOSTAL_ZONE:
				return employerZippostalZone != null && !employerZippostalZone.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_PHONE_NUMBER:
				return employerPhoneNumber != null && !employerPhoneNumber.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CONTACT_NAME:
				return employerContactName != null && !employerContactName.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CARRIER_ID:
				return carrierId != null && !carrierId.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__CLAIMREFERENCE_ID:
				return claimreferenceId != null && !claimreferenceId.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__BILLING_ENTITY_TYPE_INDICATOR:
				return billingEntityTypeIndicator != null && !billingEntityTypeIndicator.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_QUALIFIER:
				return payToQualifier != null && !payToQualifier.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ID:
				return payToId != null && !payToId.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_NAME:
				return payToName != null && !payToName.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STREET_ADDRESS:
				return payToStreetAddress != null && !payToStreetAddress.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_CITY_ADDRESS:
				return payToCityAddress != null && !payToCityAddress.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_STATEPROVINCE_ADDRESS:
				return payToStateprovinceAddress != null && !payToStateprovinceAddress.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__PAY_TO_ZIPPOSTAL_ZONE:
				return payToZippostalZone != null && !payToZippostalZone.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID_QUALIFIER:
				return genericEquivalentProductIdQualifier != null && !genericEquivalentProductIdQualifier.isEmpty();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID:
				return genericEquivalentProductId != null && !genericEquivalentProductId.isEmpty();
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

} //WorkersCompensationSegmentImpl
