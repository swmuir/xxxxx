/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transaction Header Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getAssignedAuthor <em>Assigned Author</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getDateOfService <em>Date Of Service</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getSoftwareVendorcertificationId <em>Software Vendorcertification Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getTransactionCount <em>Transaction Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getServiceProviderId <em>Service Provider Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getProcessorControlNumber <em>Processor Control Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getServiceProviderIdQualifier <em>Service Provider Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getBinNumber <em>Bin Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getVersion <em>Version</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getTransactionCode <em>Transaction Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransactionHeaderSegment()
 * @model
 * @generated
 */
public interface TransactionHeaderSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Assigned Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Assigned Author</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Assigned Author</em>' containment reference.
	 * @see #setAssignedAuthor(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransactionHeaderSegment_AssignedAuthor()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Field getAssignedAuthor();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getAssignedAuthor <em>Assigned Author</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Assigned Author</em>' containment reference.
	 * @see #getAssignedAuthor()
	 * @generated
	 */
	void setAssignedAuthor(Field value);

	/**
	 * Returns the value of the '<em><b>Date Of Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Of Service</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Of Service</em>' containment reference.
	 * @see #setDateOfService(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransactionHeaderSegment_DateOfService()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Field getDateOfService();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getDateOfService <em>Date Of Service</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Date Of Service</em>' containment reference.
	 * @see #getDateOfService()
	 * @generated
	 */
	void setDateOfService(Field value);

	/**
	 * Returns the value of the '<em><b>Software Vendorcertification Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Software Vendorcertification Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Software Vendorcertification Id</em>' containment reference.
	 * @see #setSoftwareVendorcertificationId(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransactionHeaderSegment_SoftwareVendorcertificationId()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Field getSoftwareVendorcertificationId();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getSoftwareVendorcertificationId <em>Software Vendorcertification Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Software Vendorcertification Id</em>' containment reference.
	 * @see #getSoftwareVendorcertificationId()
	 * @generated
	 */
	void setSoftwareVendorcertificationId(Field value);

	/**
	 * Returns the value of the '<em><b>Transaction Count</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Count</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Count</em>' containment reference.
	 * @see #setTransactionCount(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransactionHeaderSegment_TransactionCount()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Field getTransactionCount();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getTransactionCount <em>Transaction Count</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Count</em>' containment reference.
	 * @see #getTransactionCount()
	 * @generated
	 */
	void setTransactionCount(Field value);

	/**
	 * Returns the value of the '<em><b>Service Provider Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provider Id</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provider Id</em>' containment reference.
	 * @see #setServiceProviderId(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransactionHeaderSegment_ServiceProviderId()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Field getServiceProviderId();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getServiceProviderId <em>Service Provider Id</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider Id</em>' containment reference.
	 * @see #getServiceProviderId()
	 * @generated
	 */
	void setServiceProviderId(Field value);

	/**
	 * Returns the value of the '<em><b>Processor Control Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Processor Control Number</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Processor Control Number</em>' containment reference.
	 * @see #setProcessorControlNumber(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransactionHeaderSegment_ProcessorControlNumber()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Field getProcessorControlNumber();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getProcessorControlNumber <em>Processor Control Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Processor Control Number</em>' containment reference.
	 * @see #getProcessorControlNumber()
	 * @generated
	 */
	void setProcessorControlNumber(Field value);

	/**
	 * Returns the value of the '<em><b>Service Provider Id Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Service Provider Id Qualifier</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Service Provider Id Qualifier</em>' containment reference.
	 * @see #setServiceProviderIdQualifier(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransactionHeaderSegment_ServiceProviderIdQualifier()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Field getServiceProviderIdQualifier();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getServiceProviderIdQualifier <em>Service Provider Id Qualifier</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Service Provider Id Qualifier</em>' containment reference.
	 * @see #getServiceProviderIdQualifier()
	 * @generated
	 */
	void setServiceProviderIdQualifier(Field value);

	/**
	 * Returns the value of the '<em><b>Bin Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Bin Number</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Bin Number</em>' containment reference.
	 * @see #setBinNumber(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransactionHeaderSegment_BinNumber()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Field getBinNumber();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getBinNumber <em>Bin Number</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Bin Number</em>' containment reference.
	 * @see #getBinNumber()
	 * @generated
	 */
	void setBinNumber(Field value);

	/**
	 * Returns the value of the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Version</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Version</em>' containment reference.
	 * @see #setVersion(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransactionHeaderSegment_Version()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Field getVersion();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getVersion <em>Version</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Version</em>' containment reference.
	 * @see #getVersion()
	 * @generated
	 */
	void setVersion(Field value);

	/**
	 * Returns the value of the '<em><b>Transaction Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Code</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Code</em>' containment reference.
	 * @see #setTransactionCode(Field)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransactionHeaderSegment_TransactionCode()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	Field getTransactionCode();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getTransactionCode <em>Transaction Code</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Code</em>' containment reference.
	 * @see #getTransactionCode()
	 * @generated
	 */
	void setTransactionCode(Field value);

} // TransactionHeaderSegment
