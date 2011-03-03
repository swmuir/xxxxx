/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ncpdp.uml.ecl.MeasurementDimension;
import org.ncpdp.uml.ecl.MeasurementUnit;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Clinical Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.ClinicalSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClinicalSegment#getDiagnosisCodeCount <em>Diagnosis Code Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClinicalSegment#getDiagnosisCodeQualifier <em>Diagnosis Code Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClinicalSegment#getDiagnosisCode <em>Diagnosis Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClinicalSegment#getClinicalInformationCounter <em>Clinical Information Counter</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementDate <em>Measurement Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementTime <em>Measurement Time</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementDimension <em>Measurement Dimension</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementUnit <em>Measurement Unit</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getClinicalSegment()
 * @model
 * @generated
 */
public interface ClinicalSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClinicalSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Diagnosis Code Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis Code Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis Code Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClinicalSegment_DiagnosisCodeCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getDiagnosisCodeCount();

	/**
	 * Returns the value of the '<em><b>Diagnosis Code Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis Code Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis Code Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClinicalSegment_DiagnosisCodeQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getDiagnosisCodeQualifier();

	/**
	 * Returns the value of the '<em><b>Diagnosis Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Diagnosis Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Diagnosis Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClinicalSegment_DiagnosisCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getDiagnosisCode();

	/**
	 * Returns the value of the '<em><b>Clinical Information Counter</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Information Counter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Information Counter</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClinicalSegment_ClinicalInformationCounter()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getClinicalInformationCounter();

	/**
	 * Returns the value of the '<em><b>Measurement Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Date</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClinicalSegment_MeasurementDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getMeasurementDate();

	/**
	 * Returns the value of the '<em><b>Measurement Time</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Time</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Time</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClinicalSegment_MeasurementTime()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getMeasurementTime();

	/**
	 * Returns the value of the '<em><b>Measurement Dimension</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.MeasurementDimension}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.MeasurementDimension}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Dimension</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Dimension</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.MeasurementDimension
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClinicalSegment_MeasurementDimension()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MeasurementDimension> getMeasurementDimension();

	/**
	 * Returns the value of the '<em><b>Measurement Unit</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.MeasurementUnit}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.MeasurementUnit}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Unit</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Unit</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.MeasurementUnit
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClinicalSegment_MeasurementUnit()
	 * @model ordered="false"
	 * @generated
	 */
	EList<MeasurementUnit> getMeasurementUnit();

	/**
	 * Returns the value of the '<em><b>Measurement Value</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Measurement Value</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Measurement Value</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClinicalSegment_MeasurementValue()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getMeasurementValue();

} // ClinicalSegment
