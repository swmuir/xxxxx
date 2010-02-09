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

import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.TelecomPackage;
import org.ncpdp.uml.telecom.TransactionHeaderSegment;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transaction Header Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl#getAssignedAuthor <em>Assigned Author</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl#getDateOfService <em>Date Of Service</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl#getSoftwareVendorcertificationId <em>Software Vendorcertification Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl#getTransactionCount <em>Transaction Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl#getServiceProviderId <em>Service Provider Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl#getProcessorControlNumber <em>Processor Control Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl#getServiceProviderIdQualifier <em>Service Provider Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl#getBinNumber <em>Bin Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl#getTransactionCode <em>Transaction Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransactionHeaderSegmentImpl extends EObjectImpl implements TransactionHeaderSegment {
	/**
	 * The cached value of the '{@link #getAssignedAuthor() <em>Assigned Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssignedAuthor()
	 * @generated
	 * @ordered
	 */
	protected Field assignedAuthor;

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
	 * The cached value of the '{@link #getSoftwareVendorcertificationId() <em>Software Vendorcertification Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSoftwareVendorcertificationId()
	 * @generated
	 * @ordered
	 */
	protected Field softwareVendorcertificationId;

	/**
	 * The cached value of the '{@link #getTransactionCount() <em>Transaction Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCount()
	 * @generated
	 * @ordered
	 */
	protected Field transactionCount;

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
	 * The cached value of the '{@link #getProcessorControlNumber() <em>Processor Control Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcessorControlNumber()
	 * @generated
	 * @ordered
	 */
	protected Field processorControlNumber;

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
	 * The cached value of the '{@link #getBinNumber() <em>Bin Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBinNumber()
	 * @generated
	 * @ordered
	 */
	protected Field binNumber;

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected Field version;

	/**
	 * The cached value of the '{@link #getTransactionCode() <em>Transaction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionCode()
	 * @generated
	 * @ordered
	 */
	protected Field transactionCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransactionHeaderSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.TRANSACTION_HEADER_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getAssignedAuthor() {
		return assignedAuthor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAssignedAuthor(Field newAssignedAuthor, NotificationChain msgs) {
		Field oldAssignedAuthor = assignedAuthor;
		assignedAuthor = newAssignedAuthor;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR, oldAssignedAuthor, newAssignedAuthor);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssignedAuthor(Field newAssignedAuthor) {
		if (newAssignedAuthor != assignedAuthor) {
			NotificationChain msgs = null;
			if (assignedAuthor != null)
				msgs = ((InternalEObject)assignedAuthor).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR, null, msgs);
			if (newAssignedAuthor != null)
				msgs = ((InternalEObject)newAssignedAuthor).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR, null, msgs);
			msgs = basicSetAssignedAuthor(newAssignedAuthor, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR, newAssignedAuthor, newAssignedAuthor));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE, oldDateOfService, newDateOfService);
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
				msgs = ((InternalEObject)dateOfService).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE, null, msgs);
			if (newDateOfService != null)
				msgs = ((InternalEObject)newDateOfService).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE, null, msgs);
			msgs = basicSetDateOfService(newDateOfService, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE, newDateOfService, newDateOfService));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getSoftwareVendorcertificationId() {
		return softwareVendorcertificationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSoftwareVendorcertificationId(Field newSoftwareVendorcertificationId, NotificationChain msgs) {
		Field oldSoftwareVendorcertificationId = softwareVendorcertificationId;
		softwareVendorcertificationId = newSoftwareVendorcertificationId;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID, oldSoftwareVendorcertificationId, newSoftwareVendorcertificationId);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSoftwareVendorcertificationId(Field newSoftwareVendorcertificationId) {
		if (newSoftwareVendorcertificationId != softwareVendorcertificationId) {
			NotificationChain msgs = null;
			if (softwareVendorcertificationId != null)
				msgs = ((InternalEObject)softwareVendorcertificationId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID, null, msgs);
			if (newSoftwareVendorcertificationId != null)
				msgs = ((InternalEObject)newSoftwareVendorcertificationId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID, null, msgs);
			msgs = basicSetSoftwareVendorcertificationId(newSoftwareVendorcertificationId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID, newSoftwareVendorcertificationId, newSoftwareVendorcertificationId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getTransactionCount() {
		return transactionCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionCount(Field newTransactionCount, NotificationChain msgs) {
		Field oldTransactionCount = transactionCount;
		transactionCount = newTransactionCount;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT, oldTransactionCount, newTransactionCount);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionCount(Field newTransactionCount) {
		if (newTransactionCount != transactionCount) {
			NotificationChain msgs = null;
			if (transactionCount != null)
				msgs = ((InternalEObject)transactionCount).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT, null, msgs);
			if (newTransactionCount != null)
				msgs = ((InternalEObject)newTransactionCount).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT, null, msgs);
			msgs = basicSetTransactionCount(newTransactionCount, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT, newTransactionCount, newTransactionCount));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID, oldServiceProviderId, newServiceProviderId);
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
				msgs = ((InternalEObject)serviceProviderId).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID, null, msgs);
			if (newServiceProviderId != null)
				msgs = ((InternalEObject)newServiceProviderId).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID, null, msgs);
			msgs = basicSetServiceProviderId(newServiceProviderId, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID, newServiceProviderId, newServiceProviderId));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getProcessorControlNumber() {
		return processorControlNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetProcessorControlNumber(Field newProcessorControlNumber, NotificationChain msgs) {
		Field oldProcessorControlNumber = processorControlNumber;
		processorControlNumber = newProcessorControlNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER, oldProcessorControlNumber, newProcessorControlNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setProcessorControlNumber(Field newProcessorControlNumber) {
		if (newProcessorControlNumber != processorControlNumber) {
			NotificationChain msgs = null;
			if (processorControlNumber != null)
				msgs = ((InternalEObject)processorControlNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER, null, msgs);
			if (newProcessorControlNumber != null)
				msgs = ((InternalEObject)newProcessorControlNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER, null, msgs);
			msgs = basicSetProcessorControlNumber(newProcessorControlNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER, newProcessorControlNumber, newProcessorControlNumber));
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
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER, oldServiceProviderIdQualifier, newServiceProviderIdQualifier);
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
				msgs = ((InternalEObject)serviceProviderIdQualifier).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER, null, msgs);
			if (newServiceProviderIdQualifier != null)
				msgs = ((InternalEObject)newServiceProviderIdQualifier).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER, null, msgs);
			msgs = basicSetServiceProviderIdQualifier(newServiceProviderIdQualifier, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER, newServiceProviderIdQualifier, newServiceProviderIdQualifier));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getBinNumber() {
		return binNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBinNumber(Field newBinNumber, NotificationChain msgs) {
		Field oldBinNumber = binNumber;
		binNumber = newBinNumber;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__BIN_NUMBER, oldBinNumber, newBinNumber);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBinNumber(Field newBinNumber) {
		if (newBinNumber != binNumber) {
			NotificationChain msgs = null;
			if (binNumber != null)
				msgs = ((InternalEObject)binNumber).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__BIN_NUMBER, null, msgs);
			if (newBinNumber != null)
				msgs = ((InternalEObject)newBinNumber).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__BIN_NUMBER, null, msgs);
			msgs = basicSetBinNumber(newBinNumber, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__BIN_NUMBER, newBinNumber, newBinNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetVersion(Field newVersion, NotificationChain msgs) {
		Field oldVersion = version;
		version = newVersion;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__VERSION, oldVersion, newVersion);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVersion(Field newVersion) {
		if (newVersion != version) {
			NotificationChain msgs = null;
			if (version != null)
				msgs = ((InternalEObject)version).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__VERSION, null, msgs);
			if (newVersion != null)
				msgs = ((InternalEObject)newVersion).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__VERSION, null, msgs);
			msgs = basicSetVersion(newVersion, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__VERSION, newVersion, newVersion));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field getTransactionCode() {
		return transactionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionCode(Field newTransactionCode, NotificationChain msgs) {
		Field oldTransactionCode = transactionCode;
		transactionCode = newTransactionCode;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE, oldTransactionCode, newTransactionCode);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionCode(Field newTransactionCode) {
		if (newTransactionCode != transactionCode) {
			NotificationChain msgs = null;
			if (transactionCode != null)
				msgs = ((InternalEObject)transactionCode).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE, null, msgs);
			if (newTransactionCode != null)
				msgs = ((InternalEObject)newTransactionCode).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE, null, msgs);
			msgs = basicSetTransactionCode(newTransactionCode, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE, newTransactionCode, newTransactionCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR:
				return basicSetAssignedAuthor(null, msgs);
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE:
				return basicSetDateOfService(null, msgs);
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID:
				return basicSetSoftwareVendorcertificationId(null, msgs);
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT:
				return basicSetTransactionCount(null, msgs);
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID:
				return basicSetServiceProviderId(null, msgs);
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER:
				return basicSetProcessorControlNumber(null, msgs);
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER:
				return basicSetServiceProviderIdQualifier(null, msgs);
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__BIN_NUMBER:
				return basicSetBinNumber(null, msgs);
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__VERSION:
				return basicSetVersion(null, msgs);
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE:
				return basicSetTransactionCode(null, msgs);
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
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR:
				return getAssignedAuthor();
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE:
				return getDateOfService();
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID:
				return getSoftwareVendorcertificationId();
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT:
				return getTransactionCount();
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID:
				return getServiceProviderId();
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER:
				return getProcessorControlNumber();
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER:
				return getServiceProviderIdQualifier();
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__BIN_NUMBER:
				return getBinNumber();
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__VERSION:
				return getVersion();
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE:
				return getTransactionCode();
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
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR:
				setAssignedAuthor((Field)newValue);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE:
				setDateOfService((Field)newValue);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID:
				setSoftwareVendorcertificationId((Field)newValue);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT:
				setTransactionCount((Field)newValue);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID:
				setServiceProviderId((Field)newValue);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER:
				setProcessorControlNumber((Field)newValue);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER:
				setServiceProviderIdQualifier((Field)newValue);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__BIN_NUMBER:
				setBinNumber((Field)newValue);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__VERSION:
				setVersion((Field)newValue);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE:
				setTransactionCode((Field)newValue);
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
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR:
				setAssignedAuthor((Field)null);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE:
				setDateOfService((Field)null);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID:
				setSoftwareVendorcertificationId((Field)null);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT:
				setTransactionCount((Field)null);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID:
				setServiceProviderId((Field)null);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER:
				setProcessorControlNumber((Field)null);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER:
				setServiceProviderIdQualifier((Field)null);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__BIN_NUMBER:
				setBinNumber((Field)null);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__VERSION:
				setVersion((Field)null);
				return;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE:
				setTransactionCode((Field)null);
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
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR:
				return assignedAuthor != null;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE:
				return dateOfService != null;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID:
				return softwareVendorcertificationId != null;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT:
				return transactionCount != null;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID:
				return serviceProviderId != null;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER:
				return processorControlNumber != null;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER:
				return serviceProviderIdQualifier != null;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__BIN_NUMBER:
				return binNumber != null;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__VERSION:
				return version != null;
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE:
				return transactionCode != null;
		}
		return super.eIsSet(featureID);
	}

} //TransactionHeaderSegmentImpl
