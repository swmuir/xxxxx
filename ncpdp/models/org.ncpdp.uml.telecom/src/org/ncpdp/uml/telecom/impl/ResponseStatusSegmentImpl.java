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
import org.ncpdp.uml.telecom.ResponseStatusSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Status Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getTransactionResponseStatus <em>Transaction Response Status</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getAuthorizationNumber <em>Authorization Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getRejectCount <em>Reject Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getRejectCode <em>Reject Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getRejectFieldOccurrenceIndicator <em>Reject Field Occurrence Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getApprovedMessageCodeCount <em>Approved Message Code Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getApprovedMessageCode <em>Approved Message Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getAdditionalMessageInformationCount <em>Additional Message Information Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getAdditionalMessageInformationQualifier <em>Additional Message Information Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getAdditionalMessageInformation <em>Additional Message Information</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getAdditionalMessageInformationContinuity <em>Additional Message Information Continuity</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getHelpDeskPhoneNumberQualifier <em>Help Desk Phone Number Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getHelpDeskPhoneNumber <em>Help Desk Phone Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getTransactionReferenceNumber <em>Transaction Reference Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getInternalControlNumber <em>Internal Control Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl#getUrl <em>Url</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseStatusSegmentImpl extends EObjectImpl implements ResponseStatusSegment {
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
	 * The cached value of the '{@link #getTransactionResponseStatus() <em>Transaction Response Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionResponseStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> transactionResponseStatus;

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
	 * The cached value of the '{@link #getRejectCount() <em>Reject Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> rejectCount;

	/**
	 * The cached value of the '{@link #getRejectCode() <em>Reject Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> rejectCode;

	/**
	 * The cached value of the '{@link #getRejectFieldOccurrenceIndicator() <em>Reject Field Occurrence Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRejectFieldOccurrenceIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> rejectFieldOccurrenceIndicator;

	/**
	 * The cached value of the '{@link #getApprovedMessageCodeCount() <em>Approved Message Code Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedMessageCodeCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> approvedMessageCodeCount;

	/**
	 * The cached value of the '{@link #getApprovedMessageCode() <em>Approved Message Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getApprovedMessageCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> approvedMessageCode;

	/**
	 * The cached value of the '{@link #getAdditionalMessageInformationCount() <em>Additional Message Information Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMessageInformationCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> additionalMessageInformationCount;

	/**
	 * The cached value of the '{@link #getAdditionalMessageInformationQualifier() <em>Additional Message Information Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMessageInformationQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> additionalMessageInformationQualifier;

	/**
	 * The cached value of the '{@link #getAdditionalMessageInformation() <em>Additional Message Information</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMessageInformation()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> additionalMessageInformation;

	/**
	 * The cached value of the '{@link #getAdditionalMessageInformationContinuity() <em>Additional Message Information Continuity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalMessageInformationContinuity()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> additionalMessageInformationContinuity;

	/**
	 * The cached value of the '{@link #getHelpDeskPhoneNumberQualifier() <em>Help Desk Phone Number Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpDeskPhoneNumberQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> helpDeskPhoneNumberQualifier;

	/**
	 * The cached value of the '{@link #getHelpDeskPhoneNumber() <em>Help Desk Phone Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHelpDeskPhoneNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> helpDeskPhoneNumber;

	/**
	 * The cached value of the '{@link #getTransactionReferenceNumber() <em>Transaction Reference Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> transactionReferenceNumber;

	/**
	 * The cached value of the '{@link #getInternalControlNumber() <em>Internal Control Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInternalControlNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> internalControlNumber;

	/**
	 * The cached value of the '{@link #getUrl() <em>Url</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUrl()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> url;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseStatusSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.RESPONSE_STATUS_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getTransactionResponseStatus() {
		if (transactionResponseStatus == null) {
			transactionResponseStatus = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_RESPONSE_STATUS);
		}
		return transactionResponseStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAuthorizationNumber() {
		if (authorizationNumber == null) {
			authorizationNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__AUTHORIZATION_NUMBER);
		}
		return authorizationNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRejectCount() {
		if (rejectCount == null) {
			rejectCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_COUNT);
		}
		return rejectCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRejectCode() {
		if (rejectCode == null) {
			rejectCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_CODE);
		}
		return rejectCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRejectFieldOccurrenceIndicator() {
		if (rejectFieldOccurrenceIndicator == null) {
			rejectFieldOccurrenceIndicator = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_FIELD_OCCURRENCE_INDICATOR);
		}
		return rejectFieldOccurrenceIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getApprovedMessageCodeCount() {
		if (approvedMessageCodeCount == null) {
			approvedMessageCodeCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE_COUNT);
		}
		return approvedMessageCodeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getApprovedMessageCode() {
		if (approvedMessageCode == null) {
			approvedMessageCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE);
		}
		return approvedMessageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAdditionalMessageInformationCount() {
		if (additionalMessageInformationCount == null) {
			additionalMessageInformationCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_COUNT);
		}
		return additionalMessageInformationCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAdditionalMessageInformationQualifier() {
		if (additionalMessageInformationQualifier == null) {
			additionalMessageInformationQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_QUALIFIER);
		}
		return additionalMessageInformationQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAdditionalMessageInformation() {
		if (additionalMessageInformation == null) {
			additionalMessageInformation = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION);
		}
		return additionalMessageInformation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAdditionalMessageInformationContinuity() {
		if (additionalMessageInformationContinuity == null) {
			additionalMessageInformationContinuity = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY);
		}
		return additionalMessageInformationContinuity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getHelpDeskPhoneNumberQualifier() {
		if (helpDeskPhoneNumberQualifier == null) {
			helpDeskPhoneNumberQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER_QUALIFIER);
		}
		return helpDeskPhoneNumberQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getHelpDeskPhoneNumber() {
		if (helpDeskPhoneNumber == null) {
			helpDeskPhoneNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER);
		}
		return helpDeskPhoneNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getTransactionReferenceNumber() {
		if (transactionReferenceNumber == null) {
			transactionReferenceNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_REFERENCE_NUMBER);
		}
		return transactionReferenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getInternalControlNumber() {
		if (internalControlNumber == null) {
			internalControlNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__INTERNAL_CONTROL_NUMBER);
		}
		return internalControlNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getUrl() {
		if (url == null) {
			url = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_STATUS_SEGMENT__URL);
		}
		return url;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_RESPONSE_STATUS:
				return ((InternalEList<?>)getTransactionResponseStatus()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__AUTHORIZATION_NUMBER:
				return ((InternalEList<?>)getAuthorizationNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_COUNT:
				return ((InternalEList<?>)getRejectCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_CODE:
				return ((InternalEList<?>)getRejectCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_FIELD_OCCURRENCE_INDICATOR:
				return ((InternalEList<?>)getRejectFieldOccurrenceIndicator()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE_COUNT:
				return ((InternalEList<?>)getApprovedMessageCodeCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE:
				return ((InternalEList<?>)getApprovedMessageCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_COUNT:
				return ((InternalEList<?>)getAdditionalMessageInformationCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_QUALIFIER:
				return ((InternalEList<?>)getAdditionalMessageInformationQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION:
				return ((InternalEList<?>)getAdditionalMessageInformation()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY:
				return ((InternalEList<?>)getAdditionalMessageInformationContinuity()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER_QUALIFIER:
				return ((InternalEList<?>)getHelpDeskPhoneNumberQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER:
				return ((InternalEList<?>)getHelpDeskPhoneNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_REFERENCE_NUMBER:
				return ((InternalEList<?>)getTransactionReferenceNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__INTERNAL_CONTROL_NUMBER:
				return ((InternalEList<?>)getInternalControlNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__URL:
				return ((InternalEList<?>)getUrl()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_RESPONSE_STATUS:
				return getTransactionResponseStatus();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__AUTHORIZATION_NUMBER:
				return getAuthorizationNumber();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_COUNT:
				return getRejectCount();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_CODE:
				return getRejectCode();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_FIELD_OCCURRENCE_INDICATOR:
				return getRejectFieldOccurrenceIndicator();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE_COUNT:
				return getApprovedMessageCodeCount();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE:
				return getApprovedMessageCode();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_COUNT:
				return getAdditionalMessageInformationCount();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_QUALIFIER:
				return getAdditionalMessageInformationQualifier();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION:
				return getAdditionalMessageInformation();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY:
				return getAdditionalMessageInformationContinuity();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER_QUALIFIER:
				return getHelpDeskPhoneNumberQualifier();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER:
				return getHelpDeskPhoneNumber();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_REFERENCE_NUMBER:
				return getTransactionReferenceNumber();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__INTERNAL_CONTROL_NUMBER:
				return getInternalControlNumber();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__URL:
				return getUrl();
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
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_RESPONSE_STATUS:
				getTransactionResponseStatus().clear();
				getTransactionResponseStatus().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__AUTHORIZATION_NUMBER:
				getAuthorizationNumber().clear();
				getAuthorizationNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_COUNT:
				getRejectCount().clear();
				getRejectCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_CODE:
				getRejectCode().clear();
				getRejectCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_FIELD_OCCURRENCE_INDICATOR:
				getRejectFieldOccurrenceIndicator().clear();
				getRejectFieldOccurrenceIndicator().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE_COUNT:
				getApprovedMessageCodeCount().clear();
				getApprovedMessageCodeCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE:
				getApprovedMessageCode().clear();
				getApprovedMessageCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_COUNT:
				getAdditionalMessageInformationCount().clear();
				getAdditionalMessageInformationCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_QUALIFIER:
				getAdditionalMessageInformationQualifier().clear();
				getAdditionalMessageInformationQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION:
				getAdditionalMessageInformation().clear();
				getAdditionalMessageInformation().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY:
				getAdditionalMessageInformationContinuity().clear();
				getAdditionalMessageInformationContinuity().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER_QUALIFIER:
				getHelpDeskPhoneNumberQualifier().clear();
				getHelpDeskPhoneNumberQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER:
				getHelpDeskPhoneNumber().clear();
				getHelpDeskPhoneNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_REFERENCE_NUMBER:
				getTransactionReferenceNumber().clear();
				getTransactionReferenceNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__INTERNAL_CONTROL_NUMBER:
				getInternalControlNumber().clear();
				getInternalControlNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__URL:
				getUrl().clear();
				getUrl().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_RESPONSE_STATUS:
				getTransactionResponseStatus().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__AUTHORIZATION_NUMBER:
				getAuthorizationNumber().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_COUNT:
				getRejectCount().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_CODE:
				getRejectCode().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_FIELD_OCCURRENCE_INDICATOR:
				getRejectFieldOccurrenceIndicator().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE_COUNT:
				getApprovedMessageCodeCount().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE:
				getApprovedMessageCode().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_COUNT:
				getAdditionalMessageInformationCount().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_QUALIFIER:
				getAdditionalMessageInformationQualifier().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION:
				getAdditionalMessageInformation().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY:
				getAdditionalMessageInformationContinuity().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER_QUALIFIER:
				getHelpDeskPhoneNumberQualifier().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER:
				getHelpDeskPhoneNumber().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_REFERENCE_NUMBER:
				getTransactionReferenceNumber().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__INTERNAL_CONTROL_NUMBER:
				getInternalControlNumber().clear();
				return;
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__URL:
				getUrl().clear();
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
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_RESPONSE_STATUS:
				return transactionResponseStatus != null && !transactionResponseStatus.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__AUTHORIZATION_NUMBER:
				return authorizationNumber != null && !authorizationNumber.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_COUNT:
				return rejectCount != null && !rejectCount.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_CODE:
				return rejectCode != null && !rejectCode.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__REJECT_FIELD_OCCURRENCE_INDICATOR:
				return rejectFieldOccurrenceIndicator != null && !rejectFieldOccurrenceIndicator.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE_COUNT:
				return approvedMessageCodeCount != null && !approvedMessageCodeCount.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE:
				return approvedMessageCode != null && !approvedMessageCode.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_COUNT:
				return additionalMessageInformationCount != null && !additionalMessageInformationCount.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_QUALIFIER:
				return additionalMessageInformationQualifier != null && !additionalMessageInformationQualifier.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION:
				return additionalMessageInformation != null && !additionalMessageInformation.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY:
				return additionalMessageInformationContinuity != null && !additionalMessageInformationContinuity.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER_QUALIFIER:
				return helpDeskPhoneNumberQualifier != null && !helpDeskPhoneNumberQualifier.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER:
				return helpDeskPhoneNumber != null && !helpDeskPhoneNumber.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__TRANSACTION_REFERENCE_NUMBER:
				return transactionReferenceNumber != null && !transactionReferenceNumber.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__INTERNAL_CONTROL_NUMBER:
				return internalControlNumber != null && !internalControlNumber.isEmpty();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT__URL:
				return url != null && !url.isEmpty();
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

} //ResponseStatusSegmentImpl
