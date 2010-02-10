/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ncpdp.uml.ECL.BillingEntityTypeIndicator;
import org.ncpdp.uml.ECL.GenericEquivalentProductIDQualifier;
import org.ncpdp.uml.ECL.PayToQualifier;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Workers Compensation Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getDateOfInjury <em>Date Of Injury</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerName <em>Employer Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerStreetAddress <em>Employer Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerCityAddress <em>Employer City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerStateprovinceAddress <em>Employer Stateprovince Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerZippostalZone <em>Employer Zippostal Zone</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerPhoneNumber <em>Employer Phone Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerContactName <em>Employer Contact Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getCarrierId <em>Carrier Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getClaimreferenceId <em>Claimreference Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getBillingEntityTypeIndicator <em>Billing Entity Type Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToQualifier <em>Pay To Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToId <em>Pay To Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToName <em>Pay To Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToStreetAddress <em>Pay To Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToCityAddress <em>Pay To City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToStateprovinceAddress <em>Pay To Stateprovince Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToZippostalZone <em>Pay To Zippostal Zone</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getGenericEquivalentProductIdQualifier <em>Generic Equivalent Product Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getGenericEquivalentProductId <em>Generic Equivalent Product Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment()
 * @model
 * @generated
 */
public interface WorkersCompensationSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Date Of Injury</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Injury</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Injury</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_DateOfInjury()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDateOfInjury();

	/**
	 * Returns the value of the '<em><b>Employer Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employer Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_EmployerName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getEmployerName();

	/**
	 * Returns the value of the '<em><b>Employer Street Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employer Street Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer Street Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_EmployerStreetAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getEmployerStreetAddress();

	/**
	 * Returns the value of the '<em><b>Employer City Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employer City Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer City Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_EmployerCityAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getEmployerCityAddress();

	/**
	 * Returns the value of the '<em><b>Employer Stateprovince Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employer Stateprovince Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer Stateprovince Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_EmployerStateprovinceAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getEmployerStateprovinceAddress();

	/**
	 * Returns the value of the '<em><b>Employer Zippostal Zone</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employer Zippostal Zone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer Zippostal Zone</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_EmployerZippostalZone()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getEmployerZippostalZone();

	/**
	 * Returns the value of the '<em><b>Employer Phone Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employer Phone Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer Phone Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_EmployerPhoneNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getEmployerPhoneNumber();

	/**
	 * Returns the value of the '<em><b>Employer Contact Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Employer Contact Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Employer Contact Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_EmployerContactName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getEmployerContactName();

	/**
	 * Returns the value of the '<em><b>Carrier Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Carrier Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Carrier Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_CarrierId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCarrierId();

	/**
	 * Returns the value of the '<em><b>Claimreference Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claimreference Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claimreference Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_ClaimreferenceId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getClaimreferenceId();

	/**
	 * Returns the value of the '<em><b>Billing Entity Type Indicator</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.BillingEntityTypeIndicator}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.BillingEntityTypeIndicator}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Billing Entity Type Indicator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Billing Entity Type Indicator</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.BillingEntityTypeIndicator
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_BillingEntityTypeIndicator()
	 * @model ordered="false"
	 * @generated
	 */
	EList<BillingEntityTypeIndicator> getBillingEntityTypeIndicator();

	/**
	 * Returns the value of the '<em><b>Pay To Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.PayToQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.PayToQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay To Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay To Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.PayToQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_PayToQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<PayToQualifier> getPayToQualifier();

	/**
	 * Returns the value of the '<em><b>Pay To Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay To Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay To Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_PayToId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPayToId();

	/**
	 * Returns the value of the '<em><b>Pay To Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay To Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay To Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_PayToName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPayToName();

	/**
	 * Returns the value of the '<em><b>Pay To Street Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay To Street Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay To Street Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_PayToStreetAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPayToStreetAddress();

	/**
	 * Returns the value of the '<em><b>Pay To City Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay To City Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay To City Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_PayToCityAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPayToCityAddress();

	/**
	 * Returns the value of the '<em><b>Pay To Stateprovince Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay To Stateprovince Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay To Stateprovince Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_PayToStateprovinceAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPayToStateprovinceAddress();

	/**
	 * Returns the value of the '<em><b>Pay To Zippostal Zone</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pay To Zippostal Zone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pay To Zippostal Zone</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_PayToZippostalZone()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPayToZippostalZone();

	/**
	 * Returns the value of the '<em><b>Generic Equivalent Product Id Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.GenericEquivalentProductIDQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.GenericEquivalentProductIDQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Equivalent Product Id Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Equivalent Product Id Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.GenericEquivalentProductIDQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_GenericEquivalentProductIdQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<GenericEquivalentProductIDQualifier> getGenericEquivalentProductIdQualifier();

	/**
	 * Returns the value of the '<em><b>Generic Equivalent Product Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Generic Equivalent Product Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Generic Equivalent Product Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getWorkersCompensationSegment_GenericEquivalentProductId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getGenericEquivalentProductId();

} // WorkersCompensationSegment
