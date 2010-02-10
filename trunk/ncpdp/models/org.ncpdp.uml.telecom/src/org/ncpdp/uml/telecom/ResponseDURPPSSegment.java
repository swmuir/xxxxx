/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ncpdp.uml.ECL.OtherPharmacyIndicator;
import org.ncpdp.uml.ECL.OtherPrescriberIndicator;
import org.ncpdp.uml.ECL.ReasonforServiceCode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response DURPPS Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDurppsResponseCodeCounter <em>Durpps Response Code Counter</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getReasonForServiceCode <em>Reason For Service Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getClinicalSignificanceCode <em>Clinical Significance Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getOtherPharmacyIndicator <em>Other Pharmacy Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getPreviousDateOfFill <em>Previous Date Of Fill</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getQuantityOfPreviousFill <em>Quantity Of Previous Fill</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDatabaseIndicator <em>Database Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getOtherPrescriberIndicator <em>Other Prescriber Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDurFreeTextMessage <em>Dur Free Text Message</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDurAdditionalText <em>Dur Additional Text</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment()
 * @model
 * @generated
 */
public interface ResponseDURPPSSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Segment Identification</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Identification</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Identification</em>' attribute list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Durpps Response Code Counter</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durpps Response Code Counter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durpps Response Code Counter</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment_DurppsResponseCodeCounter()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDurppsResponseCodeCounter();

	/**
	 * Returns the value of the '<em><b>Reason For Service Code</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.ReasonforServiceCode}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.ReasonforServiceCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason For Service Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason For Service Code</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.ReasonforServiceCode
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment_ReasonForServiceCode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ReasonforServiceCode> getReasonForServiceCode();

	/**
	 * Returns the value of the '<em><b>Clinical Significance Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Significance Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Significance Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment_ClinicalSignificanceCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getClinicalSignificanceCode();

	/**
	 * Returns the value of the '<em><b>Other Pharmacy Indicator</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.OtherPharmacyIndicator}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.OtherPharmacyIndicator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Pharmacy Indicator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Pharmacy Indicator</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.OtherPharmacyIndicator
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment_OtherPharmacyIndicator()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OtherPharmacyIndicator> getOtherPharmacyIndicator();

	/**
	 * Returns the value of the '<em><b>Previous Date Of Fill</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Previous Date Of Fill</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Previous Date Of Fill</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment_PreviousDateOfFill()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPreviousDateOfFill();

	/**
	 * Returns the value of the '<em><b>Quantity Of Previous Fill</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Of Previous Fill</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Of Previous Fill</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment_QuantityOfPreviousFill()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getQuantityOfPreviousFill();

	/**
	 * Returns the value of the '<em><b>Database Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Database Indicator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Database Indicator</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment_DatabaseIndicator()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDatabaseIndicator();

	/**
	 * Returns the value of the '<em><b>Other Prescriber Indicator</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.OtherPrescriberIndicator}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.OtherPrescriberIndicator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Prescriber Indicator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Prescriber Indicator</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.OtherPrescriberIndicator
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment_OtherPrescriberIndicator()
	 * @model ordered="false"
	 * @generated
	 */
	EList<OtherPrescriberIndicator> getOtherPrescriberIndicator();

	/**
	 * Returns the value of the '<em><b>Dur Free Text Message</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dur Free Text Message</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dur Free Text Message</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment_DurFreeTextMessage()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDurFreeTextMessage();

	/**
	 * Returns the value of the '<em><b>Dur Additional Text</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dur Additional Text</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dur Additional Text</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseDURPPSSegment_DurAdditionalText()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDurAdditionalText();

} // ResponseDURPPSSegment
