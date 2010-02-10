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

import org.ncpdp.uml.ECL.OtherPharmacyIndicator;
import org.ncpdp.uml.ECL.OtherPrescriberIndicator;
import org.ncpdp.uml.ECL.ReasonforServiceCode;

import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.ResponseDURPPSSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response DURPPS Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl#getDurppsResponseCodeCounter <em>Durpps Response Code Counter</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl#getReasonForServiceCode <em>Reason For Service Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl#getClinicalSignificanceCode <em>Clinical Significance Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl#getOtherPharmacyIndicator <em>Other Pharmacy Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl#getPreviousDateOfFill <em>Previous Date Of Fill</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl#getQuantityOfPreviousFill <em>Quantity Of Previous Fill</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl#getDatabaseIndicator <em>Database Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl#getOtherPrescriberIndicator <em>Other Prescriber Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl#getDurFreeTextMessage <em>Dur Free Text Message</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl#getDurAdditionalText <em>Dur Additional Text</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseDURPPSSegmentImpl extends EObjectImpl implements ResponseDURPPSSegment {
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
	 * The cached value of the '{@link #getDurppsResponseCodeCounter() <em>Durpps Response Code Counter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurppsResponseCodeCounter()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> durppsResponseCodeCounter;

	/**
	 * The cached value of the '{@link #getReasonForServiceCode() <em>Reason For Service Code</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForServiceCode()
	 * @generated
	 * @ordered
	 */
	protected EList<ReasonforServiceCode> reasonForServiceCode;

	/**
	 * The cached value of the '{@link #getClinicalSignificanceCode() <em>Clinical Significance Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalSignificanceCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> clinicalSignificanceCode;

	/**
	 * The cached value of the '{@link #getOtherPharmacyIndicator() <em>Other Pharmacy Indicator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPharmacyIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherPharmacyIndicator> otherPharmacyIndicator;

	/**
	 * The cached value of the '{@link #getPreviousDateOfFill() <em>Previous Date Of Fill</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPreviousDateOfFill()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> previousDateOfFill;

	/**
	 * The cached value of the '{@link #getQuantityOfPreviousFill() <em>Quantity Of Previous Fill</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityOfPreviousFill()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> quantityOfPreviousFill;

	/**
	 * The cached value of the '{@link #getDatabaseIndicator() <em>Database Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatabaseIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> databaseIndicator;

	/**
	 * The cached value of the '{@link #getOtherPrescriberIndicator() <em>Other Prescriber Indicator</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherPrescriberIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<OtherPrescriberIndicator> otherPrescriberIndicator;

	/**
	 * The cached value of the '{@link #getDurFreeTextMessage() <em>Dur Free Text Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurFreeTextMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> durFreeTextMessage;

	/**
	 * The cached value of the '{@link #getDurAdditionalText() <em>Dur Additional Text</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurAdditionalText()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> durAdditionalText;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseDURPPSSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.RESPONSE_DURPPS_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.RESPONSE_DURPPS_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDurppsResponseCodeCounter() {
		if (durppsResponseCodeCounter == null) {
			durppsResponseCodeCounter = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_DURPPS_SEGMENT__DURPPS_RESPONSE_CODE_COUNTER);
		}
		return durppsResponseCodeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ReasonforServiceCode> getReasonForServiceCode() {
		if (reasonForServiceCode == null) {
			reasonForServiceCode = new EDataTypeUniqueEList<ReasonforServiceCode>(ReasonforServiceCode.class, this, TelecomPackage.RESPONSE_DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE);
		}
		return reasonForServiceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getClinicalSignificanceCode() {
		if (clinicalSignificanceCode == null) {
			clinicalSignificanceCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_DURPPS_SEGMENT__CLINICAL_SIGNIFICANCE_CODE);
		}
		return clinicalSignificanceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherPharmacyIndicator> getOtherPharmacyIndicator() {
		if (otherPharmacyIndicator == null) {
			otherPharmacyIndicator = new EDataTypeUniqueEList<OtherPharmacyIndicator>(OtherPharmacyIndicator.class, this, TelecomPackage.RESPONSE_DURPPS_SEGMENT__OTHER_PHARMACY_INDICATOR);
		}
		return otherPharmacyIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPreviousDateOfFill() {
		if (previousDateOfFill == null) {
			previousDateOfFill = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_DURPPS_SEGMENT__PREVIOUS_DATE_OF_FILL);
		}
		return previousDateOfFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getQuantityOfPreviousFill() {
		if (quantityOfPreviousFill == null) {
			quantityOfPreviousFill = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_DURPPS_SEGMENT__QUANTITY_OF_PREVIOUS_FILL);
		}
		return quantityOfPreviousFill;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDatabaseIndicator() {
		if (databaseIndicator == null) {
			databaseIndicator = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_DURPPS_SEGMENT__DATABASE_INDICATOR);
		}
		return databaseIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<OtherPrescriberIndicator> getOtherPrescriberIndicator() {
		if (otherPrescriberIndicator == null) {
			otherPrescriberIndicator = new EDataTypeUniqueEList<OtherPrescriberIndicator>(OtherPrescriberIndicator.class, this, TelecomPackage.RESPONSE_DURPPS_SEGMENT__OTHER_PRESCRIBER_INDICATOR);
		}
		return otherPrescriberIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDurFreeTextMessage() {
		if (durFreeTextMessage == null) {
			durFreeTextMessage = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_FREE_TEXT_MESSAGE);
		}
		return durFreeTextMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDurAdditionalText() {
		if (durAdditionalText == null) {
			durAdditionalText = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_ADDITIONAL_TEXT);
		}
		return durAdditionalText;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DURPPS_RESPONSE_CODE_COUNTER:
				return ((InternalEList<?>)getDurppsResponseCodeCounter()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__CLINICAL_SIGNIFICANCE_CODE:
				return ((InternalEList<?>)getClinicalSignificanceCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__PREVIOUS_DATE_OF_FILL:
				return ((InternalEList<?>)getPreviousDateOfFill()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__QUANTITY_OF_PREVIOUS_FILL:
				return ((InternalEList<?>)getQuantityOfPreviousFill()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DATABASE_INDICATOR:
				return ((InternalEList<?>)getDatabaseIndicator()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_FREE_TEXT_MESSAGE:
				return ((InternalEList<?>)getDurFreeTextMessage()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_ADDITIONAL_TEXT:
				return ((InternalEList<?>)getDurAdditionalText()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DURPPS_RESPONSE_CODE_COUNTER:
				return getDurppsResponseCodeCounter();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE:
				return getReasonForServiceCode();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__CLINICAL_SIGNIFICANCE_CODE:
				return getClinicalSignificanceCode();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__OTHER_PHARMACY_INDICATOR:
				return getOtherPharmacyIndicator();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__PREVIOUS_DATE_OF_FILL:
				return getPreviousDateOfFill();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__QUANTITY_OF_PREVIOUS_FILL:
				return getQuantityOfPreviousFill();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DATABASE_INDICATOR:
				return getDatabaseIndicator();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__OTHER_PRESCRIBER_INDICATOR:
				return getOtherPrescriberIndicator();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_FREE_TEXT_MESSAGE:
				return getDurFreeTextMessage();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_ADDITIONAL_TEXT:
				return getDurAdditionalText();
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
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DURPPS_RESPONSE_CODE_COUNTER:
				getDurppsResponseCodeCounter().clear();
				getDurppsResponseCodeCounter().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE:
				getReasonForServiceCode().clear();
				getReasonForServiceCode().addAll((Collection<? extends ReasonforServiceCode>)newValue);
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__CLINICAL_SIGNIFICANCE_CODE:
				getClinicalSignificanceCode().clear();
				getClinicalSignificanceCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__OTHER_PHARMACY_INDICATOR:
				getOtherPharmacyIndicator().clear();
				getOtherPharmacyIndicator().addAll((Collection<? extends OtherPharmacyIndicator>)newValue);
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__PREVIOUS_DATE_OF_FILL:
				getPreviousDateOfFill().clear();
				getPreviousDateOfFill().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__QUANTITY_OF_PREVIOUS_FILL:
				getQuantityOfPreviousFill().clear();
				getQuantityOfPreviousFill().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DATABASE_INDICATOR:
				getDatabaseIndicator().clear();
				getDatabaseIndicator().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__OTHER_PRESCRIBER_INDICATOR:
				getOtherPrescriberIndicator().clear();
				getOtherPrescriberIndicator().addAll((Collection<? extends OtherPrescriberIndicator>)newValue);
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_FREE_TEXT_MESSAGE:
				getDurFreeTextMessage().clear();
				getDurFreeTextMessage().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_ADDITIONAL_TEXT:
				getDurAdditionalText().clear();
				getDurAdditionalText().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DURPPS_RESPONSE_CODE_COUNTER:
				getDurppsResponseCodeCounter().clear();
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE:
				getReasonForServiceCode().clear();
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__CLINICAL_SIGNIFICANCE_CODE:
				getClinicalSignificanceCode().clear();
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__OTHER_PHARMACY_INDICATOR:
				getOtherPharmacyIndicator().clear();
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__PREVIOUS_DATE_OF_FILL:
				getPreviousDateOfFill().clear();
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__QUANTITY_OF_PREVIOUS_FILL:
				getQuantityOfPreviousFill().clear();
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DATABASE_INDICATOR:
				getDatabaseIndicator().clear();
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__OTHER_PRESCRIBER_INDICATOR:
				getOtherPrescriberIndicator().clear();
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_FREE_TEXT_MESSAGE:
				getDurFreeTextMessage().clear();
				return;
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_ADDITIONAL_TEXT:
				getDurAdditionalText().clear();
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
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DURPPS_RESPONSE_CODE_COUNTER:
				return durppsResponseCodeCounter != null && !durppsResponseCodeCounter.isEmpty();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE:
				return reasonForServiceCode != null && !reasonForServiceCode.isEmpty();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__CLINICAL_SIGNIFICANCE_CODE:
				return clinicalSignificanceCode != null && !clinicalSignificanceCode.isEmpty();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__OTHER_PHARMACY_INDICATOR:
				return otherPharmacyIndicator != null && !otherPharmacyIndicator.isEmpty();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__PREVIOUS_DATE_OF_FILL:
				return previousDateOfFill != null && !previousDateOfFill.isEmpty();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__QUANTITY_OF_PREVIOUS_FILL:
				return quantityOfPreviousFill != null && !quantityOfPreviousFill.isEmpty();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DATABASE_INDICATOR:
				return databaseIndicator != null && !databaseIndicator.isEmpty();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__OTHER_PRESCRIBER_INDICATOR:
				return otherPrescriberIndicator != null && !otherPrescriberIndicator.isEmpty();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_FREE_TEXT_MESSAGE:
				return durFreeTextMessage != null && !durFreeTextMessage.isEmpty();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT__DUR_ADDITIONAL_TEXT:
				return durAdditionalText != null && !durAdditionalText.isEmpty();
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
		result.append(", reasonForServiceCode: ");
		result.append(reasonForServiceCode);
		result.append(", otherPharmacyIndicator: ");
		result.append(otherPharmacyIndicator);
		result.append(", otherPrescriberIndicator: ");
		result.append(otherPrescriberIndicator);
		result.append(')');
		return result.toString();
	}

} //ResponseDURPPSSegmentImpl
