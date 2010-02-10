/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.ecore.EObject;

import org.ncpdp.uml.ECL.TransactionCode;
import org.ncpdp.uml.ECL.TransactionCount;

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
 * @model
 * @generated
 */
public interface ResponseHeaderSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Versionrelease Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Versionrelease Number</em>' containment reference isn't clear,
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
	 * Returns the value of the '<em><b>Transaction Code</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.TransactionCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Code</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Code</em>' attribute.
	 * @see org.ncpdp.uml.ECL.TransactionCode
	 * @see #setTransactionCode(TransactionCode)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseHeaderSegment_TransactionCode()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransactionCode getTransactionCode();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getTransactionCode <em>Transaction Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Code</em>' attribute.
	 * @see org.ncpdp.uml.ECL.TransactionCode
	 * @see #getTransactionCode()
	 * @generated
	 */
	void setTransactionCode(TransactionCode value);

	/**
	 * Returns the value of the '<em><b>Transaction Count</b></em>' attribute.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.TransactionCount}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Count</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Count</em>' attribute.
	 * @see org.ncpdp.uml.ECL.TransactionCount
	 * @see #setTransactionCount(TransactionCount)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponseHeaderSegment_TransactionCount()
	 * @model required="true" ordered="false"
	 * @generated
	 */
	TransactionCount getTransactionCount();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getTransactionCount <em>Transaction Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Count</em>' attribute.
	 * @see org.ncpdp.uml.ECL.TransactionCount
	 * @see #getTransactionCount()
	 * @generated
	 */
	void setTransactionCount(TransactionCount value);

	/**
	 * Returns the value of the '<em><b>Header Response Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Header Response Status</em>' containment reference isn't clear,
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
	 * If the meaning of the '<em>Service Provider Id Qualifier</em>' containment reference isn't clear,
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
	 * If the meaning of the '<em>Service Provider Id</em>' containment reference isn't clear,
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
	 * If the meaning of the '<em>Date Of Service</em>' containment reference isn't clear,
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
