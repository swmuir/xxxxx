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

import org.ncpdp.uml.telecom.AdditionalDocumentationSegment;
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Additional Documentation Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getAdditionalDocumentationTypeId <em>Additional Documentation Type Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getRequestPeriodBeginDate <em>Request Period Begin Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getRequestPeriodRecertrevisedDate <em>Request Period Recertrevised Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getRequestStatus <em>Request Status</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getLengthOfNeedQualifier <em>Length Of Need Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getLengthOfNeed <em>Length Of Need</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getPrescribersupplierDateSigned <em>Prescribersupplier Date Signed</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getSupportingDocumentation <em>Supporting Documentation</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getQuestionNumberletterCount <em>Question Numberletter Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getQuestionNumberletter <em>Question Numberletter</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getQuestionPercentResponse <em>Question Percent Response</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getQuestionDateResponse <em>Question Date Response</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getQuestionDollarAmountResponse <em>Question Dollar Amount Response</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getQuestionNumericResponse <em>Question Numeric Response</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl#getQuestionAlphanumericResponse <em>Question Alphanumeric Response</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class AdditionalDocumentationSegmentImpl extends EObjectImpl implements AdditionalDocumentationSegment {
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
	 * The cached value of the '{@link #getAdditionalDocumentationTypeId() <em>Additional Documentation Type Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalDocumentationTypeId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> additionalDocumentationTypeId;

	/**
	 * The cached value of the '{@link #getRequestPeriodBeginDate() <em>Request Period Begin Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestPeriodBeginDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> requestPeriodBeginDate;

	/**
	 * The cached value of the '{@link #getRequestPeriodRecertrevisedDate() <em>Request Period Recertrevised Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestPeriodRecertrevisedDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> requestPeriodRecertrevisedDate;

	/**
	 * The cached value of the '{@link #getRequestStatus() <em>Request Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRequestStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> requestStatus;

	/**
	 * The cached value of the '{@link #getLengthOfNeedQualifier() <em>Length Of Need Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthOfNeedQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> lengthOfNeedQualifier;

	/**
	 * The cached value of the '{@link #getLengthOfNeed() <em>Length Of Need</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLengthOfNeed()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> lengthOfNeed;

	/**
	 * The cached value of the '{@link #getPrescribersupplierDateSigned() <em>Prescribersupplier Date Signed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescribersupplierDateSigned()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescribersupplierDateSigned;

	/**
	 * The cached value of the '{@link #getSupportingDocumentation() <em>Supporting Documentation</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupportingDocumentation()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> supportingDocumentation;

	/**
	 * The cached value of the '{@link #getQuestionNumberletterCount() <em>Question Numberletter Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionNumberletterCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> questionNumberletterCount;

	/**
	 * The cached value of the '{@link #getQuestionNumberletter() <em>Question Numberletter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionNumberletter()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> questionNumberletter;

	/**
	 * The cached value of the '{@link #getQuestionPercentResponse() <em>Question Percent Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionPercentResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> questionPercentResponse;

	/**
	 * The cached value of the '{@link #getQuestionDateResponse() <em>Question Date Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionDateResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> questionDateResponse;

	/**
	 * The cached value of the '{@link #getQuestionDollarAmountResponse() <em>Question Dollar Amount Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionDollarAmountResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> questionDollarAmountResponse;

	/**
	 * The cached value of the '{@link #getQuestionNumericResponse() <em>Question Numeric Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionNumericResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> questionNumericResponse;

	/**
	 * The cached value of the '{@link #getQuestionAlphanumericResponse() <em>Question Alphanumeric Response</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuestionAlphanumericResponse()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> questionAlphanumericResponse;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected AdditionalDocumentationSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.ADDITIONAL_DOCUMENTATION_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAdditionalDocumentationTypeId() {
		if (additionalDocumentationTypeId == null) {
			additionalDocumentationTypeId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__ADDITIONAL_DOCUMENTATION_TYPE_ID);
		}
		return additionalDocumentationTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRequestPeriodBeginDate() {
		if (requestPeriodBeginDate == null) {
			requestPeriodBeginDate = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_BEGIN_DATE);
		}
		return requestPeriodBeginDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRequestPeriodRecertrevisedDate() {
		if (requestPeriodRecertrevisedDate == null) {
			requestPeriodRecertrevisedDate = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_RECERTREVISED_DATE);
		}
		return requestPeriodRecertrevisedDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRequestStatus() {
		if (requestStatus == null) {
			requestStatus = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_STATUS);
		}
		return requestStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getLengthOfNeedQualifier() {
		if (lengthOfNeedQualifier == null) {
			lengthOfNeedQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED_QUALIFIER);
		}
		return lengthOfNeedQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getLengthOfNeed() {
		if (lengthOfNeed == null) {
			lengthOfNeed = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED);
		}
		return lengthOfNeed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescribersupplierDateSigned() {
		if (prescribersupplierDateSigned == null) {
			prescribersupplierDateSigned = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__PRESCRIBERSUPPLIER_DATE_SIGNED);
		}
		return prescribersupplierDateSigned;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getSupportingDocumentation() {
		if (supportingDocumentation == null) {
			supportingDocumentation = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__SUPPORTING_DOCUMENTATION);
		}
		return supportingDocumentation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getQuestionNumberletterCount() {
		if (questionNumberletterCount == null) {
			questionNumberletterCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER_COUNT);
		}
		return questionNumberletterCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getQuestionNumberletter() {
		if (questionNumberletter == null) {
			questionNumberletter = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER);
		}
		return questionNumberletter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getQuestionPercentResponse() {
		if (questionPercentResponse == null) {
			questionPercentResponse = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_PERCENT_RESPONSE);
		}
		return questionPercentResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getQuestionDateResponse() {
		if (questionDateResponse == null) {
			questionDateResponse = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DATE_RESPONSE);
		}
		return questionDateResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getQuestionDollarAmountResponse() {
		if (questionDollarAmountResponse == null) {
			questionDollarAmountResponse = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DOLLAR_AMOUNT_RESPONSE);
		}
		return questionDollarAmountResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getQuestionNumericResponse() {
		if (questionNumericResponse == null) {
			questionNumericResponse = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMERIC_RESPONSE);
		}
		return questionNumericResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getQuestionAlphanumericResponse() {
		if (questionAlphanumericResponse == null) {
			questionAlphanumericResponse = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_ALPHANUMERIC_RESPONSE);
		}
		return questionAlphanumericResponse;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__ADDITIONAL_DOCUMENTATION_TYPE_ID:
				return ((InternalEList<?>)getAdditionalDocumentationTypeId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_BEGIN_DATE:
				return ((InternalEList<?>)getRequestPeriodBeginDate()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_RECERTREVISED_DATE:
				return ((InternalEList<?>)getRequestPeriodRecertrevisedDate()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_STATUS:
				return ((InternalEList<?>)getRequestStatus()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED_QUALIFIER:
				return ((InternalEList<?>)getLengthOfNeedQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED:
				return ((InternalEList<?>)getLengthOfNeed()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__PRESCRIBERSUPPLIER_DATE_SIGNED:
				return ((InternalEList<?>)getPrescribersupplierDateSigned()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__SUPPORTING_DOCUMENTATION:
				return ((InternalEList<?>)getSupportingDocumentation()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER_COUNT:
				return ((InternalEList<?>)getQuestionNumberletterCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER:
				return ((InternalEList<?>)getQuestionNumberletter()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_PERCENT_RESPONSE:
				return ((InternalEList<?>)getQuestionPercentResponse()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DATE_RESPONSE:
				return ((InternalEList<?>)getQuestionDateResponse()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DOLLAR_AMOUNT_RESPONSE:
				return ((InternalEList<?>)getQuestionDollarAmountResponse()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMERIC_RESPONSE:
				return ((InternalEList<?>)getQuestionNumericResponse()).basicRemove(otherEnd, msgs);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_ALPHANUMERIC_RESPONSE:
				return ((InternalEList<?>)getQuestionAlphanumericResponse()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__ADDITIONAL_DOCUMENTATION_TYPE_ID:
				return getAdditionalDocumentationTypeId();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_BEGIN_DATE:
				return getRequestPeriodBeginDate();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_RECERTREVISED_DATE:
				return getRequestPeriodRecertrevisedDate();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_STATUS:
				return getRequestStatus();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED_QUALIFIER:
				return getLengthOfNeedQualifier();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED:
				return getLengthOfNeed();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__PRESCRIBERSUPPLIER_DATE_SIGNED:
				return getPrescribersupplierDateSigned();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__SUPPORTING_DOCUMENTATION:
				return getSupportingDocumentation();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER_COUNT:
				return getQuestionNumberletterCount();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER:
				return getQuestionNumberletter();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_PERCENT_RESPONSE:
				return getQuestionPercentResponse();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DATE_RESPONSE:
				return getQuestionDateResponse();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DOLLAR_AMOUNT_RESPONSE:
				return getQuestionDollarAmountResponse();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMERIC_RESPONSE:
				return getQuestionNumericResponse();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_ALPHANUMERIC_RESPONSE:
				return getQuestionAlphanumericResponse();
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
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__ADDITIONAL_DOCUMENTATION_TYPE_ID:
				getAdditionalDocumentationTypeId().clear();
				getAdditionalDocumentationTypeId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_BEGIN_DATE:
				getRequestPeriodBeginDate().clear();
				getRequestPeriodBeginDate().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_RECERTREVISED_DATE:
				getRequestPeriodRecertrevisedDate().clear();
				getRequestPeriodRecertrevisedDate().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_STATUS:
				getRequestStatus().clear();
				getRequestStatus().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED_QUALIFIER:
				getLengthOfNeedQualifier().clear();
				getLengthOfNeedQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED:
				getLengthOfNeed().clear();
				getLengthOfNeed().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__PRESCRIBERSUPPLIER_DATE_SIGNED:
				getPrescribersupplierDateSigned().clear();
				getPrescribersupplierDateSigned().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__SUPPORTING_DOCUMENTATION:
				getSupportingDocumentation().clear();
				getSupportingDocumentation().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER_COUNT:
				getQuestionNumberletterCount().clear();
				getQuestionNumberletterCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER:
				getQuestionNumberletter().clear();
				getQuestionNumberletter().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_PERCENT_RESPONSE:
				getQuestionPercentResponse().clear();
				getQuestionPercentResponse().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DATE_RESPONSE:
				getQuestionDateResponse().clear();
				getQuestionDateResponse().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DOLLAR_AMOUNT_RESPONSE:
				getQuestionDollarAmountResponse().clear();
				getQuestionDollarAmountResponse().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMERIC_RESPONSE:
				getQuestionNumericResponse().clear();
				getQuestionNumericResponse().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_ALPHANUMERIC_RESPONSE:
				getQuestionAlphanumericResponse().clear();
				getQuestionAlphanumericResponse().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__ADDITIONAL_DOCUMENTATION_TYPE_ID:
				getAdditionalDocumentationTypeId().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_BEGIN_DATE:
				getRequestPeriodBeginDate().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_RECERTREVISED_DATE:
				getRequestPeriodRecertrevisedDate().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_STATUS:
				getRequestStatus().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED_QUALIFIER:
				getLengthOfNeedQualifier().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED:
				getLengthOfNeed().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__PRESCRIBERSUPPLIER_DATE_SIGNED:
				getPrescribersupplierDateSigned().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__SUPPORTING_DOCUMENTATION:
				getSupportingDocumentation().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER_COUNT:
				getQuestionNumberletterCount().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER:
				getQuestionNumberletter().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_PERCENT_RESPONSE:
				getQuestionPercentResponse().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DATE_RESPONSE:
				getQuestionDateResponse().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DOLLAR_AMOUNT_RESPONSE:
				getQuestionDollarAmountResponse().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMERIC_RESPONSE:
				getQuestionNumericResponse().clear();
				return;
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_ALPHANUMERIC_RESPONSE:
				getQuestionAlphanumericResponse().clear();
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
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__ADDITIONAL_DOCUMENTATION_TYPE_ID:
				return additionalDocumentationTypeId != null && !additionalDocumentationTypeId.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_BEGIN_DATE:
				return requestPeriodBeginDate != null && !requestPeriodBeginDate.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_RECERTREVISED_DATE:
				return requestPeriodRecertrevisedDate != null && !requestPeriodRecertrevisedDate.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_STATUS:
				return requestStatus != null && !requestStatus.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED_QUALIFIER:
				return lengthOfNeedQualifier != null && !lengthOfNeedQualifier.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED:
				return lengthOfNeed != null && !lengthOfNeed.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__PRESCRIBERSUPPLIER_DATE_SIGNED:
				return prescribersupplierDateSigned != null && !prescribersupplierDateSigned.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__SUPPORTING_DOCUMENTATION:
				return supportingDocumentation != null && !supportingDocumentation.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER_COUNT:
				return questionNumberletterCount != null && !questionNumberletterCount.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER:
				return questionNumberletter != null && !questionNumberletter.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_PERCENT_RESPONSE:
				return questionPercentResponse != null && !questionPercentResponse.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DATE_RESPONSE:
				return questionDateResponse != null && !questionDateResponse.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DOLLAR_AMOUNT_RESPONSE:
				return questionDollarAmountResponse != null && !questionDollarAmountResponse.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMERIC_RESPONSE:
				return questionNumericResponse != null && !questionNumericResponse.isEmpty();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_ALPHANUMERIC_RESPONSE:
				return questionAlphanumericResponse != null && !questionAlphanumericResponse.isEmpty();
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

} //AdditionalDocumentationSegmentImpl
