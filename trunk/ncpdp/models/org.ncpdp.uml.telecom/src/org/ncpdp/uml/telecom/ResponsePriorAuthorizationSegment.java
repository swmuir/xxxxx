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
 * A representation of the model object '<em><b>Response Prior Authorization Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationProcessedDate <em>Prior Authorization Processed Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationEffectiveDate <em>Prior Authorization Effective Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationExpirationDate <em>Prior Authorization Expiration Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationQuantity <em>Prior Authorization Quantity</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationDollarsAuthorized <em>Prior Authorization Dollars Authorized</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationNumberOfRefillsAuthorized <em>Prior Authorization Number Of Refills Authorized</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationQuantityAccumulated <em>Prior Authorization Quantity Accumulated</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationNumberassigned <em>Prior Authorization Numberassigned</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePriorAuthorizationSegment()
 * @model
 * @generated
 */
public interface ResponsePriorAuthorizationSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePriorAuthorizationSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Processed Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Processed Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Processed Date</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePriorAuthorizationSegment_PriorAuthorizationProcessedDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationProcessedDate();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Effective Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Effective Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Effective Date</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePriorAuthorizationSegment_PriorAuthorizationEffectiveDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationEffectiveDate();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Expiration Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Expiration Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Expiration Date</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePriorAuthorizationSegment_PriorAuthorizationExpirationDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationExpirationDate();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Quantity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Quantity</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePriorAuthorizationSegment_PriorAuthorizationQuantity()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationQuantity();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Dollars Authorized</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Dollars Authorized</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Dollars Authorized</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePriorAuthorizationSegment_PriorAuthorizationDollarsAuthorized()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationDollarsAuthorized();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Number Of Refills Authorized</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Number Of Refills Authorized</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Number Of Refills Authorized</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePriorAuthorizationSegment_PriorAuthorizationNumberOfRefillsAuthorized()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationNumberOfRefillsAuthorized();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Quantity Accumulated</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Quantity Accumulated</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Quantity Accumulated</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePriorAuthorizationSegment_PriorAuthorizationQuantityAccumulated()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationQuantityAccumulated();

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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponsePriorAuthorizationSegment_PriorAuthorizationNumberassigned()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationNumberassigned();

} // ResponsePriorAuthorizationSegment
