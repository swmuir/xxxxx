/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.ncpdp.uml.ecl.RequestType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Prior Authorization Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getRequestType <em>Request Type</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getRequestPeriodDatebegin <em>Request Period Datebegin</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getRequestPeriodDateend <em>Request Period Dateend</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getBasisOfRequest <em>Basis Of Request</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeFirstName <em>Authorized Representative First Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeLastName <em>Authorized Representative Last Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeStreetAddress <em>Authorized Representative Street Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeCityAddress <em>Authorized Representative City Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeStateprovinceAddress <em>Authorized Representative Stateprovince Address</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeZippostalZone <em>Authorized Representative Zippostal Zone</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getPriorAuthorizationNumberassigned <em>Prior Authorization Numberassigned</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizationNumber <em>Authorization Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getPriorAuthorizationSupportingDocumentation <em>Prior Authorization Supporting Documentation</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment()
 * @model
 * @generated
 */
public interface PriorAuthorizationSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Request Type</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ecl.RequestType}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ecl.RequestType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Type</em>' attribute list.
	 * @see org.ncpdp.uml.ecl.RequestType
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_RequestType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<RequestType> getRequestType();

	/**
	 * Returns the value of the '<em><b>Request Period Datebegin</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Period Datebegin</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Period Datebegin</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_RequestPeriodDatebegin()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getRequestPeriodDatebegin();

	/**
	 * Returns the value of the '<em><b>Request Period Dateend</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Request Period Dateend</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Request Period Dateend</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_RequestPeriodDateend()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getRequestPeriodDateend();

	/**
	 * Returns the value of the '<em><b>Basis Of Request</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Basis Of Request</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Basis Of Request</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_BasisOfRequest()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getBasisOfRequest();

	/**
	 * Returns the value of the '<em><b>Authorized Representative First Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorized Representative First Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorized Representative First Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_AuthorizedRepresentativeFirstName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAuthorizedRepresentativeFirstName();

	/**
	 * Returns the value of the '<em><b>Authorized Representative Last Name</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorized Representative Last Name</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorized Representative Last Name</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_AuthorizedRepresentativeLastName()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAuthorizedRepresentativeLastName();

	/**
	 * Returns the value of the '<em><b>Authorized Representative Street Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorized Representative Street Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorized Representative Street Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_AuthorizedRepresentativeStreetAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAuthorizedRepresentativeStreetAddress();

	/**
	 * Returns the value of the '<em><b>Authorized Representative City Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorized Representative City Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorized Representative City Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_AuthorizedRepresentativeCityAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAuthorizedRepresentativeCityAddress();

	/**
	 * Returns the value of the '<em><b>Authorized Representative Stateprovince Address</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorized Representative Stateprovince Address</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorized Representative Stateprovince Address</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_AuthorizedRepresentativeStateprovinceAddress()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAuthorizedRepresentativeStateprovinceAddress();

	/**
	 * Returns the value of the '<em><b>Authorized Representative Zippostal Zone</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorized Representative Zippostal Zone</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorized Representative Zippostal Zone</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_AuthorizedRepresentativeZippostalZone()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAuthorizedRepresentativeZippostalZone();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Numberassigned</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Numberassigned</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Numberassigned</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_PriorAuthorizationNumberassigned()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationNumberassigned();

	/**
	 * Returns the value of the '<em><b>Authorization Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Authorization Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Authorization Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_AuthorizationNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getAuthorizationNumber();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Supporting Documentation</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Supporting Documentation</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Supporting Documentation</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getPriorAuthorizationSegment_PriorAuthorizationSupportingDocumentation()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationSupportingDocumentation();

} // PriorAuthorizationSegment
