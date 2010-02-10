/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prescriber Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberIdQualifier <em>Prescriber Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberId <em>Prescriber Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberLastName <em>Prescriber Last Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberPhoneNumber <em>Prescriber Phone Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrimaryCareProviderIdQualifier <em>Primary Care Provider Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrimaryCareProviderId <em>Primary Care Provider Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrimaryCareProviderLastName <em>Primary Care Provider Last Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberFirstName <em>Prescriber First Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberStreetAddress <em>Prescriber Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberCityAddress <em>Prescriber City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberStateprovinceAddress <em>Prescriber Stateprovince Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberZippostalZone <em>Prescriber Zippostal Zone</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment()
 * @model
 * @generated
 */
public interface PrescriberSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Prescriber Id Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriber Id Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriber Id Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrescriberIdQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescriberIdQualifier();

	/**
	 * Returns the value of the '<em><b>Prescriber Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriber Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriber Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrescriberId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescriberId();

	/**
	 * Returns the value of the '<em><b>Prescriber Last Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriber Last Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriber Last Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrescriberLastName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescriberLastName();

	/**
	 * Returns the value of the '<em><b>Prescriber Phone Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriber Phone Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriber Phone Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrescriberPhoneNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescriberPhoneNumber();

	/**
	 * Returns the value of the '<em><b>Primary Care Provider Id Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Care Provider Id Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Care Provider Id Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrimaryCareProviderIdQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrimaryCareProviderIdQualifier();

	/**
	 * Returns the value of the '<em><b>Primary Care Provider Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Care Provider Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Care Provider Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrimaryCareProviderId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrimaryCareProviderId();

	/**
	 * Returns the value of the '<em><b>Primary Care Provider Last Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Primary Care Provider Last Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Primary Care Provider Last Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrimaryCareProviderLastName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrimaryCareProviderLastName();

	/**
	 * Returns the value of the '<em><b>Prescriber First Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriber First Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriber First Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrescriberFirstName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescriberFirstName();

	/**
	 * Returns the value of the '<em><b>Prescriber Street Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriber Street Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriber Street Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrescriberStreetAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescriberStreetAddress();

	/**
	 * Returns the value of the '<em><b>Prescriber City Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriber City Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriber City Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrescriberCityAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescriberCityAddress();

	/**
	 * Returns the value of the '<em><b>Prescriber Stateprovince Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriber Stateprovince Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriber Stateprovince Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrescriberStateprovinceAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescriberStateprovinceAddress();

	/**
	 * Returns the value of the '<em><b>Prescriber Zippostal Zone</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriber Zippostal Zone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriber Zippostal Zone</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPrescriberSegment_PrescriberZippostalZone()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPrescriberZippostalZone();

} // PrescriberSegment
