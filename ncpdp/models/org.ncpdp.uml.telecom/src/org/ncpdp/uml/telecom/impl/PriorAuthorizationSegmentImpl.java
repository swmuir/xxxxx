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
import org.ncpdp.uml.ecl.RequestType;
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.PriorAuthorizationSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Prior Authorization Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getRequestPeriodDatebegin <em>Request Period Datebegin</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getRequestPeriodDateend <em>Request Period Dateend</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getBasisOfRequest <em>Basis Of Request</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getAuthorizedRepresentativeFirstName <em>Authorized Representative First Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getAuthorizedRepresentativeLastName <em>Authorized Representative Last Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getAuthorizedRepresentativeStreetAddress <em>Authorized Representative Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getAuthorizedRepresentativeCityAddress <em>Authorized Representative City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getAuthorizedRepresentativeStateprovinceAddress <em>Authorized Representative Stateprovince Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getAuthorizedRepresentativeZippostalZone <em>Authorized Representative Zippostal Zone</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getPriorAuthorizationNumberassigned <em>Prior Authorization Numberassigned</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getAuthorizationNumber <em>Authorization Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl#getPriorAuthorizationSupportingDocumentation <em>Prior Authorization Supporting Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PriorAuthorizationSegmentImpl extends EObjectImpl implements PriorAuthorizationSegment {
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
	 * The cached value of the '{@link #getRequestType() <em>Request Type</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestType()
	 * @generated
	 * @ordered
	 */
	protected EList<RequestType> requestType;

	/**
	 * The cached value of the '{@link #getRequestPeriodDatebegin() <em>Request Period Datebegin</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestPeriodDatebegin()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> requestPeriodDatebegin;

	/**
	 * The cached value of the '{@link #getRequestPeriodDateend() <em>Request Period Dateend</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestPeriodDateend()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> requestPeriodDateend;

	/**
	 * The cached value of the '{@link #getBasisOfRequest() <em>Basis Of Request</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBasisOfRequest()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> basisOfRequest;

	/**
	 * The cached value of the '{@link #getAuthorizedRepresentativeFirstName() <em>Authorized Representative First Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedRepresentativeFirstName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> authorizedRepresentativeFirstName;

	/**
	 * The cached value of the '{@link #getAuthorizedRepresentativeLastName() <em>Authorized Representative Last Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedRepresentativeLastName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> authorizedRepresentativeLastName;

	/**
	 * The cached value of the '{@link #getAuthorizedRepresentativeStreetAddress() <em>Authorized Representative Street Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedRepresentativeStreetAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> authorizedRepresentativeStreetAddress;

	/**
	 * The cached value of the '{@link #getAuthorizedRepresentativeCityAddress() <em>Authorized Representative City Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedRepresentativeCityAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> authorizedRepresentativeCityAddress;

	/**
	 * The cached value of the '{@link #getAuthorizedRepresentativeStateprovinceAddress() <em>Authorized Representative Stateprovince Address</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedRepresentativeStateprovinceAddress()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> authorizedRepresentativeStateprovinceAddress;

	/**
	 * The cached value of the '{@link #getAuthorizedRepresentativeZippostalZone() <em>Authorized Representative Zippostal Zone</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizedRepresentativeZippostalZone()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> authorizedRepresentativeZippostalZone;

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
	 * The cached value of the '{@link #getAuthorizationNumber() <em>Authorization Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAuthorizationNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> authorizationNumber;

	/**
	 * The cached value of the '{@link #getPriorAuthorizationSupportingDocumentation() <em>Prior Authorization Supporting Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationSupportingDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> priorAuthorizationSupportingDocumentation;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PriorAuthorizationSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.PRIOR_AUTHORIZATION_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<RequestType> getRequestType() {
		if (requestType == null) {
			requestType = new EDataTypeUniqueEList<RequestType>(RequestType.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_TYPE);
		}
		return requestType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRequestPeriodDatebegin() {
		if (requestPeriodDatebegin == null) {
			requestPeriodDatebegin = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEBEGIN);
		}
		return requestPeriodDatebegin;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRequestPeriodDateend() {
		if (requestPeriodDateend == null) {
			requestPeriodDateend = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEEND);
		}
		return requestPeriodDateend;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getBasisOfRequest() {
		if (basisOfRequest == null) {
			basisOfRequest = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__BASIS_OF_REQUEST);
		}
		return basisOfRequest;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAuthorizedRepresentativeFirstName() {
		if (authorizedRepresentativeFirstName == null) {
			authorizedRepresentativeFirstName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_FIRST_NAME);
		}
		return authorizedRepresentativeFirstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAuthorizedRepresentativeLastName() {
		if (authorizedRepresentativeLastName == null) {
			authorizedRepresentativeLastName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_LAST_NAME);
		}
		return authorizedRepresentativeLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAuthorizedRepresentativeStreetAddress() {
		if (authorizedRepresentativeStreetAddress == null) {
			authorizedRepresentativeStreetAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STREET_ADDRESS);
		}
		return authorizedRepresentativeStreetAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAuthorizedRepresentativeCityAddress() {
		if (authorizedRepresentativeCityAddress == null) {
			authorizedRepresentativeCityAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_CITY_ADDRESS);
		}
		return authorizedRepresentativeCityAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAuthorizedRepresentativeStateprovinceAddress() {
		if (authorizedRepresentativeStateprovinceAddress == null) {
			authorizedRepresentativeStateprovinceAddress = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STATEPROVINCE_ADDRESS);
		}
		return authorizedRepresentativeStateprovinceAddress;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAuthorizedRepresentativeZippostalZone() {
		if (authorizedRepresentativeZippostalZone == null) {
			authorizedRepresentativeZippostalZone = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_ZIPPOSTAL_ZONE);
		}
		return authorizedRepresentativeZippostalZone;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationNumberassigned() {
		if (priorAuthorizationNumberassigned == null) {
			priorAuthorizationNumberassigned = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED);
		}
		return priorAuthorizationNumberassigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAuthorizationNumber() {
		if (authorizationNumber == null) {
			authorizationNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZATION_NUMBER);
		}
		return authorizationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationSupportingDocumentation() {
		if (priorAuthorizationSupportingDocumentation == null) {
			priorAuthorizationSupportingDocumentation = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_SUPPORTING_DOCUMENTATION);
		}
		return priorAuthorizationSupportingDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEBEGIN:
				return ((InternalEList<?>)getRequestPeriodDatebegin()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEEND:
				return ((InternalEList<?>)getRequestPeriodDateend()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__BASIS_OF_REQUEST:
				return ((InternalEList<?>)getBasisOfRequest()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_FIRST_NAME:
				return ((InternalEList<?>)getAuthorizedRepresentativeFirstName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_LAST_NAME:
				return ((InternalEList<?>)getAuthorizedRepresentativeLastName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STREET_ADDRESS:
				return ((InternalEList<?>)getAuthorizedRepresentativeStreetAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_CITY_ADDRESS:
				return ((InternalEList<?>)getAuthorizedRepresentativeCityAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STATEPROVINCE_ADDRESS:
				return ((InternalEList<?>)getAuthorizedRepresentativeStateprovinceAddress()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_ZIPPOSTAL_ZONE:
				return ((InternalEList<?>)getAuthorizedRepresentativeZippostalZone()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED:
				return ((InternalEList<?>)getPriorAuthorizationNumberassigned()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZATION_NUMBER:
				return ((InternalEList<?>)getAuthorizationNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_SUPPORTING_DOCUMENTATION:
				return ((InternalEList<?>)getPriorAuthorizationSupportingDocumentation()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_TYPE:
				return getRequestType();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEBEGIN:
				return getRequestPeriodDatebegin();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEEND:
				return getRequestPeriodDateend();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__BASIS_OF_REQUEST:
				return getBasisOfRequest();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_FIRST_NAME:
				return getAuthorizedRepresentativeFirstName();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_LAST_NAME:
				return getAuthorizedRepresentativeLastName();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STREET_ADDRESS:
				return getAuthorizedRepresentativeStreetAddress();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_CITY_ADDRESS:
				return getAuthorizedRepresentativeCityAddress();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STATEPROVINCE_ADDRESS:
				return getAuthorizedRepresentativeStateprovinceAddress();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_ZIPPOSTAL_ZONE:
				return getAuthorizedRepresentativeZippostalZone();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED:
				return getPriorAuthorizationNumberassigned();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZATION_NUMBER:
				return getAuthorizationNumber();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_SUPPORTING_DOCUMENTATION:
				return getPriorAuthorizationSupportingDocumentation();
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
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_TYPE:
				getRequestType().clear();
				getRequestType().addAll((Collection<? extends RequestType>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEBEGIN:
				getRequestPeriodDatebegin().clear();
				getRequestPeriodDatebegin().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEEND:
				getRequestPeriodDateend().clear();
				getRequestPeriodDateend().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__BASIS_OF_REQUEST:
				getBasisOfRequest().clear();
				getBasisOfRequest().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_FIRST_NAME:
				getAuthorizedRepresentativeFirstName().clear();
				getAuthorizedRepresentativeFirstName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_LAST_NAME:
				getAuthorizedRepresentativeLastName().clear();
				getAuthorizedRepresentativeLastName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STREET_ADDRESS:
				getAuthorizedRepresentativeStreetAddress().clear();
				getAuthorizedRepresentativeStreetAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_CITY_ADDRESS:
				getAuthorizedRepresentativeCityAddress().clear();
				getAuthorizedRepresentativeCityAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STATEPROVINCE_ADDRESS:
				getAuthorizedRepresentativeStateprovinceAddress().clear();
				getAuthorizedRepresentativeStateprovinceAddress().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_ZIPPOSTAL_ZONE:
				getAuthorizedRepresentativeZippostalZone().clear();
				getAuthorizedRepresentativeZippostalZone().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED:
				getPriorAuthorizationNumberassigned().clear();
				getPriorAuthorizationNumberassigned().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZATION_NUMBER:
				getAuthorizationNumber().clear();
				getAuthorizationNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_SUPPORTING_DOCUMENTATION:
				getPriorAuthorizationSupportingDocumentation().clear();
				getPriorAuthorizationSupportingDocumentation().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_TYPE:
				getRequestType().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEBEGIN:
				getRequestPeriodDatebegin().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEEND:
				getRequestPeriodDateend().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__BASIS_OF_REQUEST:
				getBasisOfRequest().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_FIRST_NAME:
				getAuthorizedRepresentativeFirstName().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_LAST_NAME:
				getAuthorizedRepresentativeLastName().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STREET_ADDRESS:
				getAuthorizedRepresentativeStreetAddress().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_CITY_ADDRESS:
				getAuthorizedRepresentativeCityAddress().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STATEPROVINCE_ADDRESS:
				getAuthorizedRepresentativeStateprovinceAddress().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_ZIPPOSTAL_ZONE:
				getAuthorizedRepresentativeZippostalZone().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED:
				getPriorAuthorizationNumberassigned().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZATION_NUMBER:
				getAuthorizationNumber().clear();
				return;
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_SUPPORTING_DOCUMENTATION:
				getPriorAuthorizationSupportingDocumentation().clear();
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
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_TYPE:
				return requestType != null && !requestType.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEBEGIN:
				return requestPeriodDatebegin != null && !requestPeriodDatebegin.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEEND:
				return requestPeriodDateend != null && !requestPeriodDateend.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__BASIS_OF_REQUEST:
				return basisOfRequest != null && !basisOfRequest.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_FIRST_NAME:
				return authorizedRepresentativeFirstName != null && !authorizedRepresentativeFirstName.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_LAST_NAME:
				return authorizedRepresentativeLastName != null && !authorizedRepresentativeLastName.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STREET_ADDRESS:
				return authorizedRepresentativeStreetAddress != null && !authorizedRepresentativeStreetAddress.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_CITY_ADDRESS:
				return authorizedRepresentativeCityAddress != null && !authorizedRepresentativeCityAddress.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STATEPROVINCE_ADDRESS:
				return authorizedRepresentativeStateprovinceAddress != null && !authorizedRepresentativeStateprovinceAddress.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_ZIPPOSTAL_ZONE:
				return authorizedRepresentativeZippostalZone != null && !authorizedRepresentativeZippostalZone.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED:
				return priorAuthorizationNumberassigned != null && !priorAuthorizationNumberassigned.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZATION_NUMBER:
				return authorizationNumber != null && !authorizationNumber.isEmpty();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_SUPPORTING_DOCUMENTATION:
				return priorAuthorizationSupportingDocumentation != null && !priorAuthorizationSupportingDocumentation.isEmpty();
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
		result.append(", requestType: ");
		result.append(requestType);
		result.append(')');
		return result.toString();
	}

} //PriorAuthorizationSegmentImpl
