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
 * A representation of the model object '<em><b>Response Header Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getVersionreleaseNumber <em>Versionrelease Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getTransactionCode <em>Transaction Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getTransactionCount <em>Transaction Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getHeaderResponseStatus <em>Header Response Status</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getServiceProviderIdQualifier <em>Service Provider Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getServiceProviderId <em>Service Provider Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getDateOfService <em>Date Of Service</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseHeaderSegment()
 * @model annotation="http://www.ncpdp.org/uml/telecom/annotation versionReleaseNumber.field='102-A2' transactionCode.field='103-A3' transactionCount.field='109-A9' headerResponseStatus.field='501-FI' serviceProviderIDQualifier.field='202-B2' serviceProviderID.field='201-B1' dateofService.field='401-D1'"
 * @generated
 */
public interface ResponseHeaderSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Versionrelease Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versionrelease Number</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Versionrelease Number</em>' containment reference.
	 * @see #setVersionreleaseNumber(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseHeaderSegment_VersionreleaseNumber()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	Field getVersionreleaseNumber();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getVersionreleaseNumber <em>Versionrelease Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Versionrelease Number</em>' containment reference.
	 * @see #getVersionreleaseNumber()
	 * @generated
	 */
	void setVersionreleaseNumber(Field value);

	/**
	 * Returns the value of the '<em><b>Transaction Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Code</em>' containment reference.
	 * @see #setTransactionCode(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseHeaderSegment_TransactionCode()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	Field getTransactionCode();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getTransactionCode <em>Transaction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Code</em>' containment reference.
	 * @see #getTransactionCode()
	 * @generated
	 */
	void setTransactionCode(Field value);

	/**
	 * Returns the value of the '<em><b>Transaction Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Count</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Count</em>' containment reference.
	 * @see #setTransactionCount(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseHeaderSegment_TransactionCount()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	Field getTransactionCount();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getTransactionCount <em>Transaction Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Count</em>' containment reference.
	 * @see #getTransactionCount()
	 * @generated
	 */
	void setTransactionCount(Field value);

	/**
	 * Returns the value of the '<em><b>Header Response Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Response Status</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Header Response Status</em>' containment reference.
	 * @see #setHeaderResponseStatus(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseHeaderSegment_HeaderResponseStatus()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	Field getHeaderResponseStatus();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getHeaderResponseStatus <em>Header Response Status</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Header Response Status</em>' containment reference.
	 * @see #getHeaderResponseStatus()
	 * @generated
	 */
	void setHeaderResponseStatus(Field value);

	/**
	 * Returns the value of the '<em><b>Service Provider Id Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provider Id Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provider Id Qualifier</em>' containment reference.
	 * @see #setServiceProviderIdQualifier(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseHeaderSegment_ServiceProviderIdQualifier()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	Field getServiceProviderIdQualifier();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getServiceProviderIdQualifier <em>Service Provider Id Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider Id Qualifier</em>' containment reference.
	 * @see #getServiceProviderIdQualifier()
	 * @generated
	 */
	void setServiceProviderIdQualifier(Field value);

	/**
	 * Returns the value of the '<em><b>Service Provider Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provider Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provider Id</em>' containment reference.
	 * @see #setServiceProviderId(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseHeaderSegment_ServiceProviderId()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	Field getServiceProviderId();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getServiceProviderId <em>Service Provider Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider Id</em>' containment reference.
	 * @see #getServiceProviderId()
	 * @generated
	 */
	void setServiceProviderId(Field value);

	/**
	 * Returns the value of the '<em><b>Date Of Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Service</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Service</em>' containment reference.
	 * @see #setDateOfService(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseHeaderSegment_DateOfService()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	Field getDateOfService();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getDateOfService <em>Date Of Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Service</em>' containment reference.
	 * @see #getDateOfService()
	 * @generated
	 */
	void setDateOfService(Field value);

} // ResponseHeaderSegment
