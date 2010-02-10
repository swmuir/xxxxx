/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.ncpdp.uml.ecl.TransactionCode;
import org.ncpdp.uml.ecl.TransactionCount;
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.ResponseHeaderSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Header Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseHeaderSegmentImpl#getVersionreleaseNumber <em>Versionrelease Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseHeaderSegmentImpl#getTransactionCode <em>Transaction Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseHeaderSegmentImpl#getTransactionCount <em>Transaction Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseHeaderSegmentImpl#getHeaderResponseStatus <em>Header Response Status</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseHeaderSegmentImpl#getServiceProviderIdQualifier <em>Service Provider Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseHeaderSegmentImpl#getServiceProviderId <em>Service Provider Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseHeaderSegmentImpl#getDateOfService <em>Date Of Service</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseHeaderSegmentImpl extends EObjectImpl implements ResponseHeaderSegment {
	/**
	 * The cached value of the '{@link #getVersionreleaseNumber() <em>Versionrelease Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersionreleaseNumber()
	 * @generated
	 * @ordered
	 */
	protected Field versionreleaseNumber;

	/**
	 * The default value of the '{@link #getTransactionCode() <em>Transaction Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCode()
	 * @generated
	 * @ordered
	 */
	protected static final TransactionCode TRANSACTION_CODE_EDEFAULT = TransactionCode.TRANSACTION_CODE_B1;

	/**
	 * The cached value of the '{@link #getTransactionCode() <em>Transaction Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCode()
	 * @generated
	 * @ordered
	 */
	protected TransactionCode transactionCode = TRANSACTION_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTransactionCount() <em>Transaction Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCount()
	 * @generated
	 * @ordered
	 */
	protected static final TransactionCount TRANSACTION_COUNT_EDEFAULT = TransactionCount.TRANSACTION_COUNT_BLANK;

	/**
	 * The cached value of the '{@link #getTransactionCount() <em>Transaction Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCount()
	 * @generated
	 * @ordered
	 */
	protected TransactionCount transactionCount = TRANSACTION_COUNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getHeaderResponseStatus() <em>Header Response Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHeaderResponseStatus()
	 * @generated
	 * @ordered
	 */
	protected Field headerResponseStatus;

	/**
	 * The cached value of the '{@link #getServiceProviderIdQualifier() <em>Service Provider Id Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProviderIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected Field serviceProviderIdQualifier;

	/**
	 * The cached value of the '{@link #getServiceProviderId() <em>Service Provider Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getServiceProviderId()
	 * @generated
	 * @ordered
	 */
	protected Field serviceProviderId;

	/**
	 * The cached value of the '{@link #getDateOfService() <em>Date Of Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfService()
	 * @generated
	 * @ordered
	 */
	protected Field dateOfService;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseHeaderSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.RESPONSE_HEADER_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getVersionreleaseNumber() {
		return versionreleaseNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersionreleaseNumber(Field newVersionreleaseNumber, NotificationChain msgs) {
		Field oldVersionreleaseNumber = versionreleaseNumber;
		versionreleaseNumber = newVersionreleaseNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER, oldVersionreleaseNumber, newVersionreleaseNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersionreleaseNumber(Field newVersionreleaseNumber) {
		if (newVersionreleaseNumber != versionreleaseNumber) {
			NotificationChain msgs = null;
			if (versionreleaseNumber != null)
				msgs = ((InternalEObject)versionreleaseNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER, null, msgs);
			if (newVersionreleaseNumber != null)
				msgs = ((InternalEObject)newVersionreleaseNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER, null, msgs);
			msgs = basicSetVersionreleaseNumber(newVersionreleaseNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER, newVersionreleaseNumber, newVersionreleaseNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionCode getTransactionCode() {
		return transactionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionCode(TransactionCode newTransactionCode) {
		TransactionCode oldTransactionCode = transactionCode;
		transactionCode = newTransactionCode == null ? TRANSACTION_CODE_EDEFAULT : newTransactionCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__TRANSACTION_CODE, oldTransactionCode, transactionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionCount getTransactionCount() {
		return transactionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionCount(TransactionCount newTransactionCount) {
		TransactionCount oldTransactionCount = transactionCount;
		transactionCount = newTransactionCount == null ? TRANSACTION_COUNT_EDEFAULT : newTransactionCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__TRANSACTION_COUNT, oldTransactionCount, transactionCount));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getHeaderResponseStatus() {
		return headerResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetHeaderResponseStatus(Field newHeaderResponseStatus, NotificationChain msgs) {
		Field oldHeaderResponseStatus = headerResponseStatus;
		headerResponseStatus = newHeaderResponseStatus;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS, oldHeaderResponseStatus, newHeaderResponseStatus);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHeaderResponseStatus(Field newHeaderResponseStatus) {
		if (newHeaderResponseStatus != headerResponseStatus) {
			NotificationChain msgs = null;
			if (headerResponseStatus != null)
				msgs = ((InternalEObject)headerResponseStatus).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS, null, msgs);
			if (newHeaderResponseStatus != null)
				msgs = ((InternalEObject)newHeaderResponseStatus).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS, null, msgs);
			msgs = basicSetHeaderResponseStatus(newHeaderResponseStatus, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS, newHeaderResponseStatus, newHeaderResponseStatus));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getServiceProviderIdQualifier() {
		return serviceProviderIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceProviderIdQualifier(Field newServiceProviderIdQualifier, NotificationChain msgs) {
		Field oldServiceProviderIdQualifier = serviceProviderIdQualifier;
		serviceProviderIdQualifier = newServiceProviderIdQualifier;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER, oldServiceProviderIdQualifier, newServiceProviderIdQualifier);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProviderIdQualifier(Field newServiceProviderIdQualifier) {
		if (newServiceProviderIdQualifier != serviceProviderIdQualifier) {
			NotificationChain msgs = null;
			if (serviceProviderIdQualifier != null)
				msgs = ((InternalEObject)serviceProviderIdQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER, null, msgs);
			if (newServiceProviderIdQualifier != null)
				msgs = ((InternalEObject)newServiceProviderIdQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER, null, msgs);
			msgs = basicSetServiceProviderIdQualifier(newServiceProviderIdQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER, newServiceProviderIdQualifier, newServiceProviderIdQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getServiceProviderId() {
		return serviceProviderId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetServiceProviderId(Field newServiceProviderId, NotificationChain msgs) {
		Field oldServiceProviderId = serviceProviderId;
		serviceProviderId = newServiceProviderId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID, oldServiceProviderId, newServiceProviderId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setServiceProviderId(Field newServiceProviderId) {
		if (newServiceProviderId != serviceProviderId) {
			NotificationChain msgs = null;
			if (serviceProviderId != null)
				msgs = ((InternalEObject)serviceProviderId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID, null, msgs);
			if (newServiceProviderId != null)
				msgs = ((InternalEObject)newServiceProviderId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID, null, msgs);
			msgs = basicSetServiceProviderId(newServiceProviderId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID, newServiceProviderId, newServiceProviderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getDateOfService() {
		return dateOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDateOfService(Field newDateOfService, NotificationChain msgs) {
		Field oldDateOfService = dateOfService;
		dateOfService = newDateOfService;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE, oldDateOfService, newDateOfService);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDateOfService(Field newDateOfService) {
		if (newDateOfService != dateOfService) {
			NotificationChain msgs = null;
			if (dateOfService != null)
				msgs = ((InternalEObject)dateOfService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE, null, msgs);
			if (newDateOfService != null)
				msgs = ((InternalEObject)newDateOfService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE, null, msgs);
			msgs = basicSetDateOfService(newDateOfService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE, newDateOfService, newDateOfService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER:
				return basicSetVersionreleaseNumber(null, msgs);
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS:
				return basicSetHeaderResponseStatus(null, msgs);
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER:
				return basicSetServiceProviderIdQualifier(null, msgs);
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID:
				return basicSetServiceProviderId(null, msgs);
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE:
				return basicSetDateOfService(null, msgs);
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
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER:
				return getVersionreleaseNumber();
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__TRANSACTION_CODE:
				return getTransactionCode();
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__TRANSACTION_COUNT:
				return getTransactionCount();
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS:
				return getHeaderResponseStatus();
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER:
				return getServiceProviderIdQualifier();
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID:
				return getServiceProviderId();
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE:
				return getDateOfService();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER:
				setVersionreleaseNumber((Field)newValue);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__TRANSACTION_CODE:
				setTransactionCode((TransactionCode)newValue);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__TRANSACTION_COUNT:
				setTransactionCount((TransactionCount)newValue);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS:
				setHeaderResponseStatus((Field)newValue);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER:
				setServiceProviderIdQualifier((Field)newValue);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID:
				setServiceProviderId((Field)newValue);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE:
				setDateOfService((Field)newValue);
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
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER:
				setVersionreleaseNumber((Field)null);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__TRANSACTION_CODE:
				setTransactionCode(TRANSACTION_CODE_EDEFAULT);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__TRANSACTION_COUNT:
				setTransactionCount(TRANSACTION_COUNT_EDEFAULT);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS:
				setHeaderResponseStatus((Field)null);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER:
				setServiceProviderIdQualifier((Field)null);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID:
				setServiceProviderId((Field)null);
				return;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE:
				setDateOfService((Field)null);
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
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER:
				return versionreleaseNumber != null;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__TRANSACTION_CODE:
				return transactionCode != TRANSACTION_CODE_EDEFAULT;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__TRANSACTION_COUNT:
				return transactionCount != TRANSACTION_COUNT_EDEFAULT;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS:
				return headerResponseStatus != null;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER:
				return serviceProviderIdQualifier != null;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID:
				return serviceProviderId != null;
			case TelecomPackage.RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE:
				return dateOfService != null;
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
		result.append(" (transactionCode: ");
		result.append(transactionCode);
		result.append(", transactionCount: ");
		result.append(transactionCount);
		result.append(')');
		return result.toString();
	}

} //ResponseHeaderSegmentImpl
