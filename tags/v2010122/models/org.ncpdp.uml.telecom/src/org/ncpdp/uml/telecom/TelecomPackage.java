/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * <!-- begin-model-doc -->
 * <p>
 *     NCPDP
 * </p>
 * <!-- end-model-doc -->
 * @see org.ncpdp.uml.telecom.TelecomFactory
 * @model kind="package"
 * @generated
 */
public interface TelecomPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "telecom";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "www.ncpdp.telecom";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "telecom";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TelecomPackage eINSTANCE = org.ncpdp.uml.telecom.impl.TelecomPackageImpl.init();

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.DocumentRootImpl <em>Document Root</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.DocumentRootImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getDocumentRoot()
	 * @generated
	 */
	int DOCUMENT_ROOT = 0;

	/**
	 * The feature id for the '<em><b>Mixed</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__MIXED = 0;

	/**
	 * The feature id for the '<em><b>XMLNS Prefix Map</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XMLNS_PREFIX_MAP = 1;

	/**
	 * The feature id for the '<em><b>XSI Schema Location</b></em>' map.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = 2;

	/**
	 * The feature id for the '<em><b>Transmission</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__TRANSMISSION = 3;

	/**
	 * The feature id for the '<em><b>Response</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT__RESPONSE = 4;

	/**
	 * The number of structural features of the '<em>Document Root</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DOCUMENT_ROOT_FEATURE_COUNT = 5;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.TransmissionImpl <em>Transmission</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.TransmissionImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getTransmission()
	 * @generated
	 */
	int TRANSMISSION = 1;

	/**
	 * The feature id for the '<em><b>Transaction Header Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__TRANSACTION_HEADER_SEGMENT = 0;

	/**
	 * The feature id for the '<em><b>Workers Compensation Segment</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__WORKERS_COMPENSATION_SEGMENT = 1;

	/**
	 * The feature id for the '<em><b>Prior Authorization Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT = 2;

	/**
	 * The feature id for the '<em><b>Pricing Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__PRICING_SEGMENT = 3;

	/**
	 * The feature id for the '<em><b>Prescriber Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__PRESCRIBER_SEGMENT = 4;

	/**
	 * The feature id for the '<em><b>Pharmacy Provider Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__PHARMACY_PROVIDER_SEGMENT = 5;

	/**
	 * The feature id for the '<em><b>Patient Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__PATIENT_SEGMENT = 6;

	/**
	 * The feature id for the '<em><b>Narrative Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__NARRATIVE_SEGMENT = 7;

	/**
	 * The feature id for the '<em><b>Insurance Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__INSURANCE_SEGMENT = 8;

	/**
	 * The feature id for the '<em><b>Facility Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__FACILITY_SEGMENT = 9;

	/**
	 * The feature id for the '<em><b>DURPPS Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__DURPPS_SEGMENT = 10;

	/**
	 * The feature id for the '<em><b>Coupon Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__COUPON_SEGMENT = 11;

	/**
	 * The feature id for the '<em><b>Coordinationof Benefits Other Payments Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT = 12;

	/**
	 * The feature id for the '<em><b>Clinical Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__CLINICAL_SEGMENT = 13;

	/**
	 * The feature id for the '<em><b>Claim Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__CLAIM_SEGMENT = 14;

	/**
	 * The feature id for the '<em><b>Additional Documentation Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT = 15;

	/**
	 * The feature id for the '<em><b>Compound Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION__COMPOUND_SEGMENT = 16;

	/**
	 * The number of structural features of the '<em>Transmission</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSMISSION_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl <em>Transaction Header Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getTransactionHeaderSegment()
	 * @generated
	 */
	int TRANSACTION_HEADER_SEGMENT = 2;

	/**
	 * The feature id for the '<em><b>Assigned Author</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR = 0;

	/**
	 * The feature id for the '<em><b>Date Of Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE = 1;

	/**
	 * The feature id for the '<em><b>Software Vendorcertification Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID = 2;

	/**
	 * The feature id for the '<em><b>Transaction Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Service Provider Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID = 4;

	/**
	 * The feature id for the '<em><b>Processor Control Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Service Provider Id Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER = 6;

	/**
	 * The feature id for the '<em><b>Bin Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_HEADER_SEGMENT__BIN_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Version</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_HEADER_SEGMENT__VERSION = 8;

	/**
	 * The feature id for the '<em><b>Transaction Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE = 9;

	/**
	 * The number of structural features of the '<em>Transaction Header Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSACTION_HEADER_SEGMENT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.FieldImpl <em>Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.FieldImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getField()
	 * @generated
	 */
	int FIELD = 3;

	/**
	 * The feature id for the '<em><b>Field</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__FIELD = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FIELD_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl <em>Workers Compensation Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getWorkersCompensationSegment()
	 * @generated
	 */
	int WORKERS_COMPENSATION_SEGMENT = 4;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Date Of Injury</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__DATE_OF_INJURY = 1;

	/**
	 * The feature id for the '<em><b>Employer Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__EMPLOYER_NAME = 2;

	/**
	 * The feature id for the '<em><b>Employer Street Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STREET_ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Employer City Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CITY_ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Employer Stateprovince Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STATEPROVINCE_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Employer Zippostal Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__EMPLOYER_ZIPPOSTAL_ZONE = 6;

	/**
	 * The feature id for the '<em><b>Employer Phone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__EMPLOYER_PHONE_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Employer Contact Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CONTACT_NAME = 8;

	/**
	 * The feature id for the '<em><b>Carrier Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__CARRIER_ID = 9;

	/**
	 * The feature id for the '<em><b>Claimreference Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__CLAIMREFERENCE_ID = 10;

	/**
	 * The feature id for the '<em><b>Billing Entity Type Indicator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__BILLING_ENTITY_TYPE_INDICATOR = 11;

	/**
	 * The feature id for the '<em><b>Pay To Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__PAY_TO_QUALIFIER = 12;

	/**
	 * The feature id for the '<em><b>Pay To Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__PAY_TO_ID = 13;

	/**
	 * The feature id for the '<em><b>Pay To Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__PAY_TO_NAME = 14;

	/**
	 * The feature id for the '<em><b>Pay To Street Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__PAY_TO_STREET_ADDRESS = 15;

	/**
	 * The feature id for the '<em><b>Pay To City Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__PAY_TO_CITY_ADDRESS = 16;

	/**
	 * The feature id for the '<em><b>Pay To Stateprovince Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__PAY_TO_STATEPROVINCE_ADDRESS = 17;

	/**
	 * The feature id for the '<em><b>Pay To Zippostal Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__PAY_TO_ZIPPOSTAL_ZONE = 18;

	/**
	 * The feature id for the '<em><b>Generic Equivalent Product Id Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID_QUALIFIER = 19;

	/**
	 * The feature id for the '<em><b>Generic Equivalent Product Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID = 20;

	/**
	 * The number of structural features of the '<em>Workers Compensation Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int WORKERS_COMPENSATION_SEGMENT_FEATURE_COUNT = 21;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl <em>Prior Authorization Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getPriorAuthorizationSegment()
	 * @generated
	 */
	int PRIOR_AUTHORIZATION_SEGMENT = 5;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Request Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__REQUEST_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Request Period Datebegin</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEBEGIN = 2;

	/**
	 * The feature id for the '<em><b>Request Period Dateend</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEEND = 3;

	/**
	 * The feature id for the '<em><b>Basis Of Request</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__BASIS_OF_REQUEST = 4;

	/**
	 * The feature id for the '<em><b>Authorized Representative First Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_FIRST_NAME = 5;

	/**
	 * The feature id for the '<em><b>Authorized Representative Last Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_LAST_NAME = 6;

	/**
	 * The feature id for the '<em><b>Authorized Representative Street Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STREET_ADDRESS = 7;

	/**
	 * The feature id for the '<em><b>Authorized Representative City Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_CITY_ADDRESS = 8;

	/**
	 * The feature id for the '<em><b>Authorized Representative Stateprovince Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STATEPROVINCE_ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>Authorized Representative Zippostal Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_ZIPPOSTAL_ZONE = 10;

	/**
	 * The feature id for the '<em><b>Prior Authorization Numberassigned</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED = 11;

	/**
	 * The feature id for the '<em><b>Authorization Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZATION_NUMBER = 12;

	/**
	 * The feature id for the '<em><b>Prior Authorization Supporting Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_SUPPORTING_DOCUMENTATION = 13;

	/**
	 * The number of structural features of the '<em>Prior Authorization Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRIOR_AUTHORIZATION_SEGMENT_FEATURE_COUNT = 14;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl <em>Pricing Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.PricingSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getPricingSegment()
	 * @generated
	 */
	int PRICING_SEGMENT = 6;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Ingredient Cost Submitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__INGREDIENT_COST_SUBMITTED = 1;

	/**
	 * The feature id for the '<em><b>Dispensing Fee Submitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__DISPENSING_FEE_SUBMITTED = 2;

	/**
	 * The feature id for the '<em><b>Professional Service Fee Submitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_SUBMITTED = 3;

	/**
	 * The feature id for the '<em><b>Patient Paid Amount Submitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__PATIENT_PAID_AMOUNT_SUBMITTED = 4;

	/**
	 * The feature id for the '<em><b>Incentive Amount Submitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__INCENTIVE_AMOUNT_SUBMITTED = 5;

	/**
	 * The feature id for the '<em><b>Other Amount Claimed Submitted Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Other Amount Claimed Submitted Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_QUALIFIER = 7;

	/**
	 * The feature id for the '<em><b>Other Amount Claimed Submitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED = 8;

	/**
	 * The feature id for the '<em><b>Flat Sales Tax Amount Submitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_SUBMITTED = 9;

	/**
	 * The feature id for the '<em><b>Percentage Sales Tax Amount Submitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_SUBMITTED = 10;

	/**
	 * The feature id for the '<em><b>Percentage Sales Tax Rate Submitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_SUBMITTED = 11;

	/**
	 * The feature id for the '<em><b>Percentage Sales Tax Basis Submitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_SUBMITTED = 12;

	/**
	 * The feature id for the '<em><b>Usual And Customary Charge</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__USUAL_AND_CUSTOMARY_CHARGE = 13;

	/**
	 * The feature id for the '<em><b>Gross Amount Due</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__GROSS_AMOUNT_DUE = 14;

	/**
	 * The feature id for the '<em><b>Basis Of Cost Determination</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__BASIS_OF_COST_DETERMINATION = 15;

	/**
	 * The feature id for the '<em><b>Medicaid Paid Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT__MEDICAID_PAID_AMOUNT = 16;

	/**
	 * The number of structural features of the '<em>Pricing Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRICING_SEGMENT_FEATURE_COUNT = 17;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl <em>Prescriber Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getPrescriberSegment()
	 * @generated
	 */
	int PRESCRIBER_SEGMENT = 7;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Prescriber Id Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRESCRIBER_ID_QUALIFIER = 1;

	/**
	 * The feature id for the '<em><b>Prescriber Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRESCRIBER_ID = 2;

	/**
	 * The feature id for the '<em><b>Prescriber Last Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRESCRIBER_LAST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Prescriber Phone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRESCRIBER_PHONE_NUMBER = 4;

	/**
	 * The feature id for the '<em><b>Primary Care Provider Id Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID_QUALIFIER = 5;

	/**
	 * The feature id for the '<em><b>Primary Care Provider Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID = 6;

	/**
	 * The feature id for the '<em><b>Primary Care Provider Last Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_LAST_NAME = 7;

	/**
	 * The feature id for the '<em><b>Prescriber First Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRESCRIBER_FIRST_NAME = 8;

	/**
	 * The feature id for the '<em><b>Prescriber Street Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRESCRIBER_STREET_ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>Prescriber City Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRESCRIBER_CITY_ADDRESS = 10;

	/**
	 * The feature id for the '<em><b>Prescriber Stateprovince Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRESCRIBER_STATEPROVINCE_ADDRESS = 11;

	/**
	 * The feature id for the '<em><b>Prescriber Zippostal Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT__PRESCRIBER_ZIPPOSTAL_ZONE = 12;

	/**
	 * The number of structural features of the '<em>Prescriber Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PRESCRIBER_SEGMENT_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.PharmacyProviderSegmentImpl <em>Pharmacy Provider Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.PharmacyProviderSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getPharmacyProviderSegment()
	 * @generated
	 */
	int PHARMACY_PROVIDER_SEGMENT = 8;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY_PROVIDER_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Provider Id Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID_QUALIFIER = 1;

	/**
	 * The feature id for the '<em><b>Provider Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID = 2;

	/**
	 * The number of structural features of the '<em>Pharmacy Provider Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PHARMACY_PROVIDER_SEGMENT_FEATURE_COUNT = 3;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl <em>Patient Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.PatientSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getPatientSegment()
	 * @generated
	 */
	int PATIENT_SEGMENT = 9;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Patient Id Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_ID_QUALIFIER = 1;

	/**
	 * The feature id for the '<em><b>Patient Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_ID = 2;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__DATE_OF_BIRTH = 3;

	/**
	 * The feature id for the '<em><b>Patient Gender Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_GENDER_CODE = 4;

	/**
	 * The feature id for the '<em><b>Patient First Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_FIRST_NAME = 5;

	/**
	 * The feature id for the '<em><b>Patient Last Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_LAST_NAME = 6;

	/**
	 * The feature id for the '<em><b>Patient Street Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_STREET_ADDRESS = 7;

	/**
	 * The feature id for the '<em><b>Patient City Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_CITY_ADDRESS = 8;

	/**
	 * The feature id for the '<em><b>Patient State Province Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_STATE_PROVINCE_ADDRESS = 9;

	/**
	 * The feature id for the '<em><b>Patient Zippostal Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_ZIPPOSTAL_ZONE = 10;

	/**
	 * The feature id for the '<em><b>Patient Phone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_PHONE_NUMBER = 11;

	/**
	 * The feature id for the '<em><b>Place Of Service</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PLACE_OF_SERVICE = 12;

	/**
	 * The feature id for the '<em><b>Employer Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__EMPLOYER_ID = 13;

	/**
	 * The feature id for the '<em><b>Smoker Nonsmoker Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__SMOKER_NONSMOKER_CODE = 14;

	/**
	 * The feature id for the '<em><b>Pregnancy Indicator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PREGNANCY_INDICATOR = 15;

	/**
	 * The feature id for the '<em><b>Patient Email Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_EMAIL_ADDRESS = 16;

	/**
	 * The feature id for the '<em><b>Patient Residence</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT__PATIENT_RESIDENCE = 17;

	/**
	 * The number of structural features of the '<em>Patient Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PATIENT_SEGMENT_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.NarrativeSegmentImpl <em>Narrative Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.NarrativeSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getNarrativeSegment()
	 * @generated
	 */
	int NARRATIVE_SEGMENT = 10;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Narrative Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_SEGMENT__NARRATIVE_MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Narrative Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NARRATIVE_SEGMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl <em>Insurance Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getInsuranceSegment()
	 * @generated
	 */
	int INSURANCE_SEGMENT = 11;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Cardholder Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__CARDHOLDER_ID = 1;

	/**
	 * The feature id for the '<em><b>Cardholder First Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__CARDHOLDER_FIRST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Cardholder Last Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__CARDHOLDER_LAST_NAME = 3;

	/**
	 * The feature id for the '<em><b>Home Plan</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__HOME_PLAN = 4;

	/**
	 * The feature id for the '<em><b>Plan Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__PLAN_ID = 5;

	/**
	 * The feature id for the '<em><b>Eligibility Clarification Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__ELIGIBILITY_CLARIFICATION_CODE = 6;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__GROUP_ID = 7;

	/**
	 * The feature id for the '<em><b>Person Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__PERSON_CODE = 8;

	/**
	 * The feature id for the '<em><b>Patient Relationship Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__PATIENT_RELATIONSHIP_CODE = 9;

	/**
	 * The feature id for the '<em><b>Other Payer Bin Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__OTHER_PAYER_BIN_NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Other Payer Processor Control Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER = 11;

	/**
	 * The feature id for the '<em><b>Other Payer Cardholder Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__OTHER_PAYER_CARDHOLDER_ID = 12;

	/**
	 * The feature id for the '<em><b>Other Payer Group Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__OTHER_PAYER_GROUP_ID = 13;

	/**
	 * The feature id for the '<em><b>Medigap Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__MEDIGAP_ID = 14;

	/**
	 * The feature id for the '<em><b>Medicaid Indicator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__MEDICAID_INDICATOR = 15;

	/**
	 * The feature id for the '<em><b>Provider Accept Assignment Indicator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR = 16;

	/**
	 * The feature id for the '<em><b>Cms Part DDefined Qualified Facility</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__CMS_PART_DDEFINED_QUALIFIED_FACILITY = 17;

	/**
	 * The feature id for the '<em><b>Medicaid Id Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__MEDICAID_ID_NUMBER = 18;

	/**
	 * The feature id for the '<em><b>Medicaid Agency Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER = 19;

	/**
	 * The number of structural features of the '<em>Insurance Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INSURANCE_SEGMENT_FEATURE_COUNT = 20;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.FacilitySegmentImpl <em>Facility Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.FacilitySegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getFacilitySegment()
	 * @generated
	 */
	int FACILITY_SEGMENT = 12;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Facility Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_SEGMENT__FACILITY_ID = 1;

	/**
	 * The feature id for the '<em><b>Facility Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_SEGMENT__FACILITY_NAME = 2;

	/**
	 * The feature id for the '<em><b>Facility Street Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_SEGMENT__FACILITY_STREET_ADDRESS = 3;

	/**
	 * The feature id for the '<em><b>Facility City Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_SEGMENT__FACILITY_CITY_ADDRESS = 4;

	/**
	 * The feature id for the '<em><b>Facility Stateprovince Address</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_SEGMENT__FACILITY_STATEPROVINCE_ADDRESS = 5;

	/**
	 * The feature id for the '<em><b>Facility Zippostal Zone</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_SEGMENT__FACILITY_ZIPPOSTAL_ZONE = 6;

	/**
	 * The number of structural features of the '<em>Facility Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FACILITY_SEGMENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl <em>DURPPS Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getDURPPSSegment()
	 * @generated
	 */
	int DURPPS_SEGMENT = 13;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURPPS_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Durpps Code Counter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURPPS_SEGMENT__DURPPS_CODE_COUNTER = 1;

	/**
	 * The feature id for the '<em><b>Reason For Service Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE = 2;

	/**
	 * The feature id for the '<em><b>Professional Service Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURPPS_SEGMENT__PROFESSIONAL_SERVICE_CODE = 3;

	/**
	 * The feature id for the '<em><b>Result Of Service Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURPPS_SEGMENT__RESULT_OF_SERVICE_CODE = 4;

	/**
	 * The feature id for the '<em><b>Durpps Level Of Effort</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURPPS_SEGMENT__DURPPS_LEVEL_OF_EFFORT = 5;

	/**
	 * The feature id for the '<em><b>Dur Coagent Id Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURPPS_SEGMENT__DUR_COAGENT_ID_QUALIFIER = 6;

	/**
	 * The feature id for the '<em><b>Dur Coagent Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURPPS_SEGMENT__DUR_COAGENT_ID = 7;

	/**
	 * The number of structural features of the '<em>DURPPS Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DURPPS_SEGMENT_FEATURE_COUNT = 8;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.CouponSegmentImpl <em>Coupon Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.CouponSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getCouponSegment()
	 * @generated
	 */
	int COUPON_SEGMENT = 14;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPON_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Coupon Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPON_SEGMENT__COUPON_TYPE = 1;

	/**
	 * The feature id for the '<em><b>Coupon Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPON_SEGMENT__COUPON_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Coupon Value Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPON_SEGMENT__COUPON_VALUE_AMOUNT = 3;

	/**
	 * The number of structural features of the '<em>Coupon Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COUPON_SEGMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl <em>Coordinationof Benefits Other Payments Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT = 15;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Coordination Of Benefitsother Payments Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__COORDINATION_OF_BENEFITSOTHER_PAYMENTS_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Other Payer Coverage Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Other Payer Id Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID_QUALIFIER = 3;

	/**
	 * The feature id for the '<em><b>Other Payer Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID = 4;

	/**
	 * The feature id for the '<em><b>Other Payer Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_DATE = 5;

	/**
	 * The feature id for the '<em><b>Internal Control Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__INTERNAL_CONTROL_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Other Payer Amount Paid Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Other Payer Amount Paid Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_QUALIFIER = 8;

	/**
	 * The feature id for the '<em><b>Other Payer Amount Paid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID = 9;

	/**
	 * The feature id for the '<em><b>Other Payer Reject Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_COUNT = 10;

	/**
	 * The feature id for the '<em><b>Other Payer Reject Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_CODE = 11;

	/**
	 * The feature id for the '<em><b>Other Payerpatient Responsibility Amount Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_COUNT = 12;

	/**
	 * The feature id for the '<em><b>Other Payerpatient Responsibility Amount Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_QUALIFIER = 13;

	/**
	 * The feature id for the '<em><b>Other Payerpatient Responsibility Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT = 14;

	/**
	 * The feature id for the '<em><b>Benefit Stage Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_COUNT = 15;

	/**
	 * The feature id for the '<em><b>Benefit Stage Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_QUALIFIER = 16;

	/**
	 * The feature id for the '<em><b>Benefit Stage Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_AMOUNT = 17;

	/**
	 * The number of structural features of the '<em>Coordinationof Benefits Other Payments Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT_FEATURE_COUNT = 18;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl <em>Clinical Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getClinicalSegment()
	 * @generated
	 */
	int CLINICAL_SEGMENT = 16;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Diagnosis Code Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_SEGMENT__DIAGNOSIS_CODE_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Diagnosis Code Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_SEGMENT__DIAGNOSIS_CODE_QUALIFIER = 2;

	/**
	 * The feature id for the '<em><b>Diagnosis Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_SEGMENT__DIAGNOSIS_CODE = 3;

	/**
	 * The feature id for the '<em><b>Clinical Information Counter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_SEGMENT__CLINICAL_INFORMATION_COUNTER = 4;

	/**
	 * The feature id for the '<em><b>Measurement Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_SEGMENT__MEASUREMENT_DATE = 5;

	/**
	 * The feature id for the '<em><b>Measurement Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_SEGMENT__MEASUREMENT_TIME = 6;

	/**
	 * The feature id for the '<em><b>Measurement Dimension</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_SEGMENT__MEASUREMENT_DIMENSION = 7;

	/**
	 * The feature id for the '<em><b>Measurement Unit</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_SEGMENT__MEASUREMENT_UNIT = 8;

	/**
	 * The feature id for the '<em><b>Measurement Value</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_SEGMENT__MEASUREMENT_VALUE = 9;

	/**
	 * The number of structural features of the '<em>Clinical Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLINICAL_SEGMENT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl <em>Claim Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ClaimSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getClaimSegment()
	 * @generated
	 */
	int CLAIM_SEGMENT = 17;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Prescriptionservice Reference Number Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER = 1;

	/**
	 * The feature id for the '<em><b>Prescriptionservice Reference Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Productservice Id Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__PRODUCTSERVICE_ID_QUALIFIER = 3;

	/**
	 * The feature id for the '<em><b>Productservice Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__PRODUCTSERVICE_ID = 4;

	/**
	 * The feature id for the '<em><b>Associated Prescriptionservice Reference Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_REFERENCE_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Associated Prescriptionservice Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_DATE = 6;

	/**
	 * The feature id for the '<em><b>Procedure Modifier Code Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE_COUNT = 7;

	/**
	 * The feature id for the '<em><b>Procedure Modifier Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE = 8;

	/**
	 * The feature id for the '<em><b>Quantity Dispensed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__QUANTITY_DISPENSED = 9;

	/**
	 * The feature id for the '<em><b>Fill Number</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__FILL_NUMBER = 10;

	/**
	 * The feature id for the '<em><b>Days Supply</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__DAYS_SUPPLY = 11;

	/**
	 * The feature id for the '<em><b>Compound Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__COMPOUND_CODE = 12;

	/**
	 * The feature id for the '<em><b>Dispense As Writtendawproduct Selection Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__DISPENSE_AS_WRITTENDAWPRODUCT_SELECTION_CODE = 13;

	/**
	 * The feature id for the '<em><b>Date Prescription Written</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__DATE_PRESCRIPTION_WRITTEN = 14;

	/**
	 * The feature id for the '<em><b>Number Of Refills Authorized</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__NUMBER_OF_REFILLS_AUTHORIZED = 15;

	/**
	 * The feature id for the '<em><b>Prescription Origin Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__PRESCRIPTION_ORIGIN_CODE = 16;

	/**
	 * The feature id for the '<em><b>Submission Clarification Code Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE_COUNT = 17;

	/**
	 * The feature id for the '<em><b>Submission Clarification Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE = 18;

	/**
	 * The feature id for the '<em><b>Quantity Prescribed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__QUANTITY_PRESCRIBED = 19;

	/**
	 * The feature id for the '<em><b>Other Coverage Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__OTHER_COVERAGE_CODE = 20;

	/**
	 * The feature id for the '<em><b>Special Packaging Indicator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__SPECIAL_PACKAGING_INDICATOR = 21;

	/**
	 * The feature id for the '<em><b>Originally Prescribed Productservice Id Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_ID_QUALIFIER = 22;

	/**
	 * The feature id for the '<em><b>Originally Prescribed Productservice Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_CODE = 23;

	/**
	 * The feature id for the '<em><b>Originally Prescribed Quantity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_QUANTITY = 24;

	/**
	 * The feature id for the '<em><b>Alternate Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__ALTERNATE_ID = 25;

	/**
	 * The feature id for the '<em><b>Scheduled Prescription Id Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__SCHEDULED_PRESCRIPTION_ID_NUMBER = 26;

	/**
	 * The feature id for the '<em><b>Unit Of Measure</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__UNIT_OF_MEASURE = 27;

	/**
	 * The feature id for the '<em><b>Level Of Service</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__LEVEL_OF_SERVICE = 28;

	/**
	 * The feature id for the '<em><b>Prior Authorization Type Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__PRIOR_AUTHORIZATION_TYPE_CODE = 29;

	/**
	 * The feature id for the '<em><b>Prior Authorization Number Submitted</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_SUBMITTED = 30;

	/**
	 * The feature id for the '<em><b>Intermediary Authorization Type Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_TYPE_ID = 31;

	/**
	 * The feature id for the '<em><b>Intermediary Authorization Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_ID = 32;

	/**
	 * The feature id for the '<em><b>Dispensing Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__DISPENSING_STATUS = 33;

	/**
	 * The feature id for the '<em><b>Quantity Intended To Be Dispensed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__QUANTITY_INTENDED_TO_BE_DISPENSED = 34;

	/**
	 * The feature id for the '<em><b>Days Supply Intended To Be Dispensed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__DAYS_SUPPLY_INTENDED_TO_BE_DISPENSED = 35;

	/**
	 * The feature id for the '<em><b>Delay Reason Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__DELAY_REASON_CODE = 36;

	/**
	 * The feature id for the '<em><b>Transaction Reference Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__TRANSACTION_REFERENCE_NUMBER = 37;

	/**
	 * The feature id for the '<em><b>Patient Assignment Indicatordirect Member Reimbursement Indicator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__PATIENT_ASSIGNMENT_INDICATORDIRECT_MEMBER_REIMBURSEMENT_INDICATOR = 38;

	/**
	 * The feature id for the '<em><b>Route Of Administration</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__ROUTE_OF_ADMINISTRATION = 39;

	/**
	 * The feature id for the '<em><b>Compound Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__COMPOUND_TYPE = 40;

	/**
	 * The feature id for the '<em><b>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN = 41;

	/**
	 * The feature id for the '<em><b>Pharmacy Service Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT__PHARMACY_SERVICE_TYPE = 42;

	/**
	 * The number of structural features of the '<em>Claim Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CLAIM_SEGMENT_FEATURE_COUNT = 43;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl <em>Additional Documentation Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getAdditionalDocumentationSegment()
	 * @generated
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT = 18;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Additional Documentation Type Id</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__ADDITIONAL_DOCUMENTATION_TYPE_ID = 1;

	/**
	 * The feature id for the '<em><b>Request Period Begin Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_BEGIN_DATE = 2;

	/**
	 * The feature id for the '<em><b>Request Period Recertrevised Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_RECERTREVISED_DATE = 3;

	/**
	 * The feature id for the '<em><b>Request Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_STATUS = 4;

	/**
	 * The feature id for the '<em><b>Length Of Need Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED_QUALIFIER = 5;

	/**
	 * The feature id for the '<em><b>Length Of Need</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED = 6;

	/**
	 * The feature id for the '<em><b>Prescribersupplier Date Signed</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__PRESCRIBERSUPPLIER_DATE_SIGNED = 7;

	/**
	 * The feature id for the '<em><b>Supporting Documentation</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__SUPPORTING_DOCUMENTATION = 8;

	/**
	 * The feature id for the '<em><b>Question Numberletter Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Question Numberletter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER = 10;

	/**
	 * The feature id for the '<em><b>Question Percent Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_PERCENT_RESPONSE = 11;

	/**
	 * The feature id for the '<em><b>Question Date Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DATE_RESPONSE = 12;

	/**
	 * The feature id for the '<em><b>Question Dollar Amount Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DOLLAR_AMOUNT_RESPONSE = 13;

	/**
	 * The feature id for the '<em><b>Question Numeric Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMERIC_RESPONSE = 14;

	/**
	 * The feature id for the '<em><b>Question Alphanumeric Response</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_ALPHANUMERIC_RESPONSE = 15;

	/**
	 * The number of structural features of the '<em>Additional Documentation Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ADDITIONAL_DOCUMENTATION_SEGMENT_FEATURE_COUNT = 16;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl <em>Compound Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.CompoundSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getCompoundSegment()
	 * @generated
	 */
	int COMPOUND_SEGMENT = 19;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Compound Dosage Form Description Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT__COMPOUND_DOSAGE_FORM_DESCRIPTION_CODE = 1;

	/**
	 * The feature id for the '<em><b>Compound Dispensing Unit Form Indicator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT__COMPOUND_DISPENSING_UNIT_FORM_INDICATOR = 2;

	/**
	 * The feature id for the '<em><b>Compound Ingredient Component Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT__COMPOUND_INGREDIENT_COMPONENT_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Compound Product Id Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID_QUALIFIER = 4;

	/**
	 * The feature id for the '<em><b>Compound Product Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID = 5;

	/**
	 * The feature id for the '<em><b>Compound Ingredient Quantity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT__COMPOUND_INGREDIENT_QUANTITY = 6;

	/**
	 * The feature id for the '<em><b>Compound Ingredient Drug Cost</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT__COMPOUND_INGREDIENT_DRUG_COST = 7;

	/**
	 * The feature id for the '<em><b>Compound Ingredient Basis Of Cost Determination</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT__COMPOUND_INGREDIENT_BASIS_OF_COST_DETERMINATION = 8;

	/**
	 * The feature id for the '<em><b>Compound Ingredient Modifier Code Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE_COUNT = 9;

	/**
	 * The feature id for the '<em><b>Compound Ingredient Modifier Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE = 10;

	/**
	 * The number of structural features of the '<em>Compound Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOUND_SEGMENT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ResponseImpl <em>Response</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ResponseImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponse()
	 * @generated
	 */
	int RESPONSE = 20;

	/**
	 * The feature id for the '<em><b>Response Header Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_HEADER_SEGMENT = 0;

	/**
	 * The feature id for the '<em><b>Response Claim Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_CLAIM_SEGMENT = 1;

	/**
	 * The feature id for the '<em><b>Response Coordinationof Benefits Other Payers Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT = 2;

	/**
	 * The feature id for the '<em><b>Response DURPPS Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_DURPPS_SEGMENT = 3;

	/**
	 * The feature id for the '<em><b>Response Insurance Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_INSURANCE_SEGMENT = 4;

	/**
	 * The feature id for the '<em><b>Response Message Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_MESSAGE_SEGMENT = 5;

	/**
	 * The feature id for the '<em><b>Response Patient Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_PATIENT_SEGMENT = 6;

	/**
	 * The feature id for the '<em><b>Response Pricing Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_PRICING_SEGMENT = 7;

	/**
	 * The feature id for the '<em><b>Response Prior Authorization Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT = 8;

	/**
	 * The number of structural features of the '<em>Response</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ResponseHeaderSegmentImpl <em>Response Header Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ResponseHeaderSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseHeaderSegment()
	 * @generated
	 */
	int RESPONSE_HEADER_SEGMENT = 21;

	/**
	 * The feature id for the '<em><b>Versionrelease Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER = 0;

	/**
	 * The feature id for the '<em><b>Transaction Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_HEADER_SEGMENT__TRANSACTION_CODE = 1;

	/**
	 * The feature id for the '<em><b>Transaction Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_HEADER_SEGMENT__TRANSACTION_COUNT = 2;

	/**
	 * The feature id for the '<em><b>Header Response Status</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS = 3;

	/**
	 * The feature id for the '<em><b>Service Provider Id Qualifier</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER = 4;

	/**
	 * The feature id for the '<em><b>Service Provider Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID = 5;

	/**
	 * The feature id for the '<em><b>Date Of Service</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE = 6;

	/**
	 * The number of structural features of the '<em>Response Header Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_HEADER_SEGMENT_FEATURE_COUNT = 7;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl <em>Response Claim Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseClaimSegment()
	 * @generated
	 */
	int RESPONSE_CLAIM_SEGMENT = 22;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CLAIM_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Prescriptionservice Reference Number Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER = 1;

	/**
	 * The feature id for the '<em><b>Prescriptionservice Reference Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Preferred Product Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Preferred Product Id Qualifier</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID_QUALIFIER = 4;

	/**
	 * The feature id for the '<em><b>Preferred Product Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID = 5;

	/**
	 * The feature id for the '<em><b>Preferred Product Incentive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_INCENTIVE = 6;

	/**
	 * The feature id for the '<em><b>Preferred Product Cost Share Incentive</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COST_SHARE_INCENTIVE = 7;

	/**
	 * The feature id for the '<em><b>Preferred Product Description</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_DESCRIPTION = 8;

	/**
	 * The feature id for the '<em><b>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN = 9;

	/**
	 * The number of structural features of the '<em>Response Claim Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_CLAIM_SEGMENT_FEATURE_COUNT = 10;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl <em>Response Coordinationof Benefits Other Payers Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT = 23;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Other Payer Id Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_COUNT = 1;

	/**
	 * The feature id for the '<em><b>Other Payer Coverage Type</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE = 2;

	/**
	 * The feature id for the '<em><b>Other Payer Id Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_QUALIFIER = 3;

	/**
	 * The feature id for the '<em><b>Other Payer Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID = 4;

	/**
	 * The feature id for the '<em><b>Other Payer Processor Control Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER = 5;

	/**
	 * The feature id for the '<em><b>Other Payer Cardholder Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_CARDHOLDER_ID = 6;

	/**
	 * The feature id for the '<em><b>Other Payer Group Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_GROUP_ID = 7;

	/**
	 * The feature id for the '<em><b>Other Payer Person Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PERSON_CODE = 8;

	/**
	 * The feature id for the '<em><b>Other Payer Help Desk Phone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_HELP_DESK_PHONE_NUMBER = 9;

	/**
	 * The feature id for the '<em><b>Other Payer Patient Relationship Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PATIENT_RELATIONSHIP_CODE = 10;

	/**
	 * The feature id for the '<em><b>Other Payer Benefit Effective Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_EFFECTIVE_DATE = 11;

	/**
	 * The feature id for the '<em><b>Other Payer Benefit Termination Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_TERMINATION_DATE = 12;

	/**
	 * The number of structural features of the '<em>Response Coordinationof Benefits Other Payers Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT_FEATURE_COUNT = 13;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl <em>Response DURPPS Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseDURPPSSegment()
	 * @generated
	 */
	int RESPONSE_DURPPS_SEGMENT = 24;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Durpps Response Code Counter</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT__DURPPS_RESPONSE_CODE_COUNTER = 1;

	/**
	 * The feature id for the '<em><b>Reason For Service Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE = 2;

	/**
	 * The feature id for the '<em><b>Clinical Significance Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT__CLINICAL_SIGNIFICANCE_CODE = 3;

	/**
	 * The feature id for the '<em><b>Other Pharmacy Indicator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT__OTHER_PHARMACY_INDICATOR = 4;

	/**
	 * The feature id for the '<em><b>Previous Date Of Fill</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT__PREVIOUS_DATE_OF_FILL = 5;

	/**
	 * The feature id for the '<em><b>Quantity Of Previous Fill</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT__QUANTITY_OF_PREVIOUS_FILL = 6;

	/**
	 * The feature id for the '<em><b>Database Indicator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT__DATABASE_INDICATOR = 7;

	/**
	 * The feature id for the '<em><b>Other Prescriber Indicator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT__OTHER_PRESCRIBER_INDICATOR = 8;

	/**
	 * The feature id for the '<em><b>Dur Free Text Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT__DUR_FREE_TEXT_MESSAGE = 9;

	/**
	 * The feature id for the '<em><b>Dur Additional Text</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT__DUR_ADDITIONAL_TEXT = 10;

	/**
	 * The number of structural features of the '<em>Response DURPPS Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_DURPPS_SEGMENT_FEATURE_COUNT = 11;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl <em>Response Insurance Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseInsuranceSegment()
	 * @generated
	 */
	int RESPONSE_INSURANCE_SEGMENT = 25;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Group Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_INSURANCE_SEGMENT__GROUP_ID = 1;

	/**
	 * The feature id for the '<em><b>Plan Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_INSURANCE_SEGMENT__PLAN_ID = 2;

	/**
	 * The feature id for the '<em><b>Network Reimbursement Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_INSURANCE_SEGMENT__NETWORK_REIMBURSEMENT_ID = 3;

	/**
	 * The feature id for the '<em><b>Payer Id Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_INSURANCE_SEGMENT__PAYER_ID_QUALIFIER = 4;

	/**
	 * The feature id for the '<em><b>Payer Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_INSURANCE_SEGMENT__PAYER_ID = 5;

	/**
	 * The feature id for the '<em><b>Medicaid Id Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_INSURANCE_SEGMENT__MEDICAID_ID_NUMBER = 6;

	/**
	 * The feature id for the '<em><b>Medicaid Agency Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER = 7;

	/**
	 * The feature id for the '<em><b>Cardholder Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_INSURANCE_SEGMENT__CARDHOLDER_ID = 8;

	/**
	 * The number of structural features of the '<em>Response Insurance Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_INSURANCE_SEGMENT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ResponseMessageSegmentImpl <em>Response Message Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ResponseMessageSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseMessageSegment()
	 * @generated
	 */
	int RESPONSE_MESSAGE_SEGMENT = 26;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MESSAGE_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Message</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MESSAGE_SEGMENT__MESSAGE = 1;

	/**
	 * The number of structural features of the '<em>Response Message Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_MESSAGE_SEGMENT_FEATURE_COUNT = 2;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ResponsePatientSegmentImpl <em>Response Patient Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ResponsePatientSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponsePatientSegment()
	 * @generated
	 */
	int RESPONSE_PATIENT_SEGMENT = 27;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PATIENT_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Patient First Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PATIENT_SEGMENT__PATIENT_FIRST_NAME = 1;

	/**
	 * The feature id for the '<em><b>Patient Last Name</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PATIENT_SEGMENT__PATIENT_LAST_NAME = 2;

	/**
	 * The feature id for the '<em><b>Date Of Birth</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PATIENT_SEGMENT__DATE_OF_BIRTH = 3;

	/**
	 * The number of structural features of the '<em>Response Patient Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PATIENT_SEGMENT_FEATURE_COUNT = 4;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl <em>Response Pricing Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponsePricingSegment()
	 * @generated
	 */
	int RESPONSE_PRICING_SEGMENT = 28;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Patient Pay Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__PATIENT_PAY_AMOUNT = 1;

	/**
	 * The feature id for the '<em><b>Ingredient Cost Paid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_PAID = 2;

	/**
	 * The feature id for the '<em><b>Dispensing Fee Paid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_PAID = 3;

	/**
	 * The feature id for the '<em><b>Tax Exempt Indicator</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__TAX_EXEMPT_INDICATOR = 4;

	/**
	 * The feature id for the '<em><b>Flat Sales Tax Amount Paid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_PAID = 5;

	/**
	 * The feature id for the '<em><b>Percentage Sales Tax Amount Paid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_PAID = 6;

	/**
	 * The feature id for the '<em><b>Percentage Sales Tax Rate Paid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_PAID = 7;

	/**
	 * The feature id for the '<em><b>Percentage Sales Tax Basis Paid</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_PAID = 8;

	/**
	 * The feature id for the '<em><b>Incentive Amount Paid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__INCENTIVE_AMOUNT_PAID = 9;

	/**
	 * The feature id for the '<em><b>Professional Service Fee Paid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_PAID = 10;

	/**
	 * The feature id for the '<em><b>Other Amount Paid Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_COUNT = 11;

	/**
	 * The feature id for the '<em><b>Other Amount Paid Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_QUALIFIER = 12;

	/**
	 * The feature id for the '<em><b>Other Amount Paid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID = 13;

	/**
	 * The feature id for the '<em><b>Other Payer Amount Recognized</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__OTHER_PAYER_AMOUNT_RECOGNIZED = 14;

	/**
	 * The feature id for the '<em><b>Total Amount Paid</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__TOTAL_AMOUNT_PAID = 15;

	/**
	 * The feature id for the '<em><b>Basis Of Reimbursement Determination</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__BASIS_OF_REIMBURSEMENT_DETERMINATION = 16;

	/**
	 * The feature id for the '<em><b>Amount Attributed To Sales Tax</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_SALES_TAX = 17;

	/**
	 * The feature id for the '<em><b>Accumulated Deductible Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__ACCUMULATED_DEDUCTIBLE_AMOUNT = 18;

	/**
	 * The feature id for the '<em><b>Remaining Deductible Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__REMAINING_DEDUCTIBLE_AMOUNT = 19;

	/**
	 * The feature id for the '<em><b>Remaining Benefit Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__REMAINING_BENEFIT_AMOUNT = 20;

	/**
	 * The feature id for the '<em><b>Amount Applied To Periodic Deductible</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__AMOUNT_APPLIED_TO_PERIODIC_DEDUCTIBLE = 21;

	/**
	 * The feature id for the '<em><b>Amount Of Copay</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COPAY = 22;

	/**
	 * The feature id for the '<em><b>Amount Exceeding Periodic Benefit Maximum</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__AMOUNT_EXCEEDING_PERIODIC_BENEFIT_MAXIMUM = 23;

	/**
	 * The feature id for the '<em><b>Basis Of Calculationdispensing Fee</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONDISPENSING_FEE = 24;

	/**
	 * The feature id for the '<em><b>Basis Of Calculationcopay</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOPAY = 25;

	/**
	 * The feature id for the '<em><b>Basis Of Calculationflat Sales Tax</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONFLAT_SALES_TAX = 26;

	/**
	 * The feature id for the '<em><b>Basis Of Calculationpercentage Sales Tax</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONPERCENTAGE_SALES_TAX = 27;

	/**
	 * The feature id for the '<em><b>Amount Attributed To Processor Fee</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROCESSOR_FEE = 28;

	/**
	 * The feature id for the '<em><b>Patient Sales Tax Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__PATIENT_SALES_TAX_AMOUNT = 29;

	/**
	 * The feature id for the '<em><b>Plan Sales Tax Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__PLAN_SALES_TAX_AMOUNT = 30;

	/**
	 * The feature id for the '<em><b>Amount Of Coinsurance</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COINSURANCE = 31;

	/**
	 * The feature id for the '<em><b>Basis Of Calculationcoinsurance</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOINSURANCE = 32;

	/**
	 * The feature id for the '<em><b>Benefit Stage Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_COUNT = 33;

	/**
	 * The feature id for the '<em><b>Benefit Stage Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_QUALIFIER = 34;

	/**
	 * The feature id for the '<em><b>Benefit Stage Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_AMOUNT = 35;

	/**
	 * The feature id for the '<em><b>Estimated Generic Savings</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__ESTIMATED_GENERIC_SAVINGS = 36;

	/**
	 * The feature id for the '<em><b>Spending Account Amount Remaining</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__SPENDING_ACCOUNT_AMOUNT_REMAINING = 37;

	/**
	 * The feature id for the '<em><b>Health Planfunded Assistance Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__HEALTH_PLANFUNDED_ASSISTANCE_AMOUNT = 38;

	/**
	 * The feature id for the '<em><b>Amount Attributed To Provider Network Selection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROVIDER_NETWORK_SELECTION = 39;

	/**
	 * The feature id for the '<em><b>Amount Attributed To Product Selectionbrand Drug</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_DRUG = 40;

	/**
	 * The feature id for the '<em><b>Amount Attributed To Product Selectionnonpreferred Formulary Selection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONNONPREFERRED_FORMULARY_SELECTION = 41;

	/**
	 * The feature id for the '<em><b>Amount Attributed To Product Selectionbrand Nonpreferred Formulary Selection</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_NONPREFERRED_FORMULARY_SELECTION = 42;

	/**
	 * The feature id for the '<em><b>Amount Attributed To Coverage Gap</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_COVERAGE_GAP = 43;

	/**
	 * The feature id for the '<em><b>Ingredient Cost Contractedreimbursable Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_CONTRACTEDREIMBURSABLE_AMOUNT = 44;

	/**
	 * The feature id for the '<em><b>Dispensing Fee Contractedreimbursable Amount</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_CONTRACTEDREIMBURSABLE_AMOUNT = 45;

	/**
	 * The number of structural features of the '<em>Response Pricing Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRICING_SEGMENT_FEATURE_COUNT = 46;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl <em>Response Prior Authorization Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponsePriorAuthorizationSegment()
	 * @generated
	 */
	int RESPONSE_PRIOR_AUTHORIZATION_SEGMENT = 29;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Prior Authorization Processed Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_PROCESSED_DATE = 1;

	/**
	 * The feature id for the '<em><b>Prior Authorization Effective Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EFFECTIVE_DATE = 2;

	/**
	 * The feature id for the '<em><b>Prior Authorization Expiration Date</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EXPIRATION_DATE = 3;

	/**
	 * The feature id for the '<em><b>Prior Authorization Quantity</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY = 4;

	/**
	 * The feature id for the '<em><b>Prior Authorization Dollars Authorized</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_DOLLARS_AUTHORIZED = 5;

	/**
	 * The feature id for the '<em><b>Prior Authorization Number Of Refills Authorized</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_OF_REFILLS_AUTHORIZED = 6;

	/**
	 * The feature id for the '<em><b>Prior Authorization Quantity Accumulated</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY_ACCUMULATED = 7;

	/**
	 * The feature id for the '<em><b>Prior Authorization Numberassigned</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED = 8;

	/**
	 * The number of structural features of the '<em>Response Prior Authorization Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_PRIOR_AUTHORIZATION_SEGMENT_FEATURE_COUNT = 9;

	/**
	 * The meta object id for the '{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl <em>Response Status Segment</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl
	 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseStatusSegment()
	 * @generated
	 */
	int RESPONSE_STATUS_SEGMENT = 30;

	/**
	 * The feature id for the '<em><b>Segment Identification</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__SEGMENT_IDENTIFICATION = 0;

	/**
	 * The feature id for the '<em><b>Transaction Response Status</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__TRANSACTION_RESPONSE_STATUS = 1;

	/**
	 * The feature id for the '<em><b>Authorization Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__AUTHORIZATION_NUMBER = 2;

	/**
	 * The feature id for the '<em><b>Reject Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__REJECT_COUNT = 3;

	/**
	 * The feature id for the '<em><b>Reject Code</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__REJECT_CODE = 4;

	/**
	 * The feature id for the '<em><b>Reject Field Occurrence Indicator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__REJECT_FIELD_OCCURRENCE_INDICATOR = 5;

	/**
	 * The feature id for the '<em><b>Approved Message Code Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE_COUNT = 6;

	/**
	 * The feature id for the '<em><b>Approved Message Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE = 7;

	/**
	 * The feature id for the '<em><b>Additional Message Information Count</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_COUNT = 8;

	/**
	 * The feature id for the '<em><b>Additional Message Information Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_QUALIFIER = 9;

	/**
	 * The feature id for the '<em><b>Additional Message Information</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION = 10;

	/**
	 * The feature id for the '<em><b>Additional Message Information Continuity</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY = 11;

	/**
	 * The feature id for the '<em><b>Help Desk Phone Number Qualifier</b></em>' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER_QUALIFIER = 12;

	/**
	 * The feature id for the '<em><b>Help Desk Phone Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER = 13;

	/**
	 * The feature id for the '<em><b>Transaction Reference Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__TRANSACTION_REFERENCE_NUMBER = 14;

	/**
	 * The feature id for the '<em><b>Internal Control Number</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__INTERNAL_CONTROL_NUMBER = 15;

	/**
	 * The feature id for the '<em><b>Url</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT__URL = 16;

	/**
	 * The number of structural features of the '<em>Response Status Segment</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int RESPONSE_STATUS_SEGMENT_FEATURE_COUNT = 17;


	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Document Root</em>'.
	 * @see org.ncpdp.uml.telecom.DocumentRoot
	 * @generated
	 */
	EClass getDocumentRoot();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.DocumentRoot#getMixed <em>Mixed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Mixed</em>'.
	 * @see org.ncpdp.uml.telecom.DocumentRoot#getMixed()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EAttribute getDocumentRoot_Mixed();

	/**
	 * Returns the meta object for the map '{@link org.ncpdp.uml.telecom.DocumentRoot#getXMLNSPrefixMap <em>XMLNS Prefix Map</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XMLNS Prefix Map</em>'.
	 * @see org.ncpdp.uml.telecom.DocumentRoot#getXMLNSPrefixMap()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XMLNSPrefixMap();

	/**
	 * Returns the meta object for the map '{@link org.ncpdp.uml.telecom.DocumentRoot#getXSISchemaLocation <em>XSI Schema Location</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the map '<em>XSI Schema Location</em>'.
	 * @see org.ncpdp.uml.telecom.DocumentRoot#getXSISchemaLocation()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_XSISchemaLocation();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.DocumentRoot#getTransmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transmission</em>'.
	 * @see org.ncpdp.uml.telecom.DocumentRoot#getTransmission()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Transmission();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.DocumentRoot#getResponse <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response</em>'.
	 * @see org.ncpdp.uml.telecom.DocumentRoot#getResponse()
	 * @see #getDocumentRoot()
	 * @generated
	 */
	EReference getDocumentRoot_Response();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.Transmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transmission</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission
	 * @generated
	 */
	EClass getTransmission();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getTransactionHeaderSegment <em>Transaction Header Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Transaction Header Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getTransactionHeaderSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_TransactionHeaderSegment();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.Transmission#getWorkersCompensationSegment <em>Workers Compensation Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Workers Compensation Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getWorkersCompensationSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_WorkersCompensationSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getPriorAuthorizationSegment <em>Prior Authorization Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prior Authorization Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getPriorAuthorizationSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_PriorAuthorizationSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getPricingSegment <em>Pricing Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pricing Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getPricingSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_PricingSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getPrescriberSegment <em>Prescriber Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Prescriber Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getPrescriberSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_PrescriberSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getPharmacyProviderSegment <em>Pharmacy Provider Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Pharmacy Provider Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getPharmacyProviderSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_PharmacyProviderSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getPatientSegment <em>Patient Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Patient Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getPatientSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_PatientSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getNarrativeSegment <em>Narrative Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Narrative Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getNarrativeSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_NarrativeSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getInsuranceSegment <em>Insurance Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Insurance Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getInsuranceSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_InsuranceSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getFacilitySegment <em>Facility Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Facility Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getFacilitySegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_FacilitySegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getDURPPSSegment <em>DURPPS Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>DURPPS Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getDURPPSSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_DURPPSSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getCouponSegment <em>Coupon Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coupon Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getCouponSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_CouponSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getCoordinationofBenefitsOtherPaymentsSegment <em>Coordinationof Benefits Other Payments Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Coordinationof Benefits Other Payments Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getCoordinationofBenefitsOtherPaymentsSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_CoordinationofBenefitsOtherPaymentsSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getClinicalSegment <em>Clinical Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Clinical Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getClinicalSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_ClinicalSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getClaimSegment <em>Claim Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Claim Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getClaimSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_ClaimSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getAdditionalDocumentationSegment <em>Additional Documentation Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Additional Documentation Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getAdditionalDocumentationSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_AdditionalDocumentationSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Transmission#getCompoundSegment <em>Compound Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Compound Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Transmission#getCompoundSegment()
	 * @see #getTransmission()
	 * @generated
	 */
	EReference getTransmission_CompoundSegment();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment <em>Transaction Header Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transaction Header Segment</em>'.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment
	 * @generated
	 */
	EClass getTransactionHeaderSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getAssignedAuthor <em>Assigned Author</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Assigned Author</em>'.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment#getAssignedAuthor()
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	EReference getTransactionHeaderSegment_AssignedAuthor();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getDateOfService <em>Date Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Of Service</em>'.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment#getDateOfService()
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	EReference getTransactionHeaderSegment_DateOfService();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getSoftwareVendorcertificationId <em>Software Vendorcertification Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Software Vendorcertification Id</em>'.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment#getSoftwareVendorcertificationId()
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	EReference getTransactionHeaderSegment_SoftwareVendorcertificationId();

	/**
	 * Returns the meta object for the attribute '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getTransactionCount <em>Transaction Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Count</em>'.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment#getTransactionCount()
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	EAttribute getTransactionHeaderSegment_TransactionCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getServiceProviderId <em>Service Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Provider Id</em>'.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment#getServiceProviderId()
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	EReference getTransactionHeaderSegment_ServiceProviderId();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getProcessorControlNumber <em>Processor Control Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Processor Control Number</em>'.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment#getProcessorControlNumber()
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	EReference getTransactionHeaderSegment_ProcessorControlNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getServiceProviderIdQualifier <em>Service Provider Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Provider Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment#getServiceProviderIdQualifier()
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	EReference getTransactionHeaderSegment_ServiceProviderIdQualifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getBinNumber <em>Bin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Bin Number</em>'.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment#getBinNumber()
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	EReference getTransactionHeaderSegment_BinNumber();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Version</em>'.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment#getVersion()
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	EReference getTransactionHeaderSegment_Version();

	/**
	 * Returns the meta object for the attribute '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment#getTransactionCode <em>Transaction Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Code</em>'.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment#getTransactionCode()
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	EAttribute getTransactionHeaderSegment_TransactionCode();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Field</em>'.
	 * @see org.ncpdp.uml.telecom.Field
	 * @generated
	 */
	EClass getField();

	/**
	 * Returns the meta object for the attribute '{@link org.ncpdp.uml.telecom.Field#getField <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Field</em>'.
	 * @see org.ncpdp.uml.telecom.Field#getField()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Field();

	/**
	 * Returns the meta object for the attribute '{@link org.ncpdp.uml.telecom.Field#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see org.ncpdp.uml.telecom.Field#getValue()
	 * @see #getField()
	 * @generated
	 */
	EAttribute getField_Value();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment <em>Workers Compensation Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Workers Compensation Segment</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment
	 * @generated
	 */
	EClass getWorkersCompensationSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getSegmentIdentification()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EAttribute getWorkersCompensationSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getDateOfInjury <em>Date Of Injury</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Of Injury</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getDateOfInjury()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_DateOfInjury();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerName <em>Employer Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employer Name</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerName()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_EmployerName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerStreetAddress <em>Employer Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employer Street Address</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerStreetAddress()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_EmployerStreetAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerCityAddress <em>Employer City Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employer City Address</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerCityAddress()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_EmployerCityAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerStateprovinceAddress <em>Employer Stateprovince Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employer Stateprovince Address</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerStateprovinceAddress()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_EmployerStateprovinceAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerZippostalZone <em>Employer Zippostal Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employer Zippostal Zone</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerZippostalZone()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_EmployerZippostalZone();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerPhoneNumber <em>Employer Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employer Phone Number</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerPhoneNumber()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_EmployerPhoneNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerContactName <em>Employer Contact Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employer Contact Name</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getEmployerContactName()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_EmployerContactName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getCarrierId <em>Carrier Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Carrier Id</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getCarrierId()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_CarrierId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getClaimreferenceId <em>Claimreference Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Claimreference Id</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getClaimreferenceId()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_ClaimreferenceId();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getBillingEntityTypeIndicator <em>Billing Entity Type Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Billing Entity Type Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getBillingEntityTypeIndicator()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EAttribute getWorkersCompensationSegment_BillingEntityTypeIndicator();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToQualifier <em>Pay To Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pay To Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToQualifier()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EAttribute getWorkersCompensationSegment_PayToQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToId <em>Pay To Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pay To Id</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToId()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_PayToId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToName <em>Pay To Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pay To Name</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToName()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_PayToName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToStreetAddress <em>Pay To Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pay To Street Address</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToStreetAddress()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_PayToStreetAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToCityAddress <em>Pay To City Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pay To City Address</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToCityAddress()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_PayToCityAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToStateprovinceAddress <em>Pay To Stateprovince Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pay To Stateprovince Address</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToStateprovinceAddress()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_PayToStateprovinceAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToZippostalZone <em>Pay To Zippostal Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Pay To Zippostal Zone</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getPayToZippostalZone()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_PayToZippostalZone();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getGenericEquivalentProductIdQualifier <em>Generic Equivalent Product Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Generic Equivalent Product Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getGenericEquivalentProductIdQualifier()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EAttribute getWorkersCompensationSegment_GenericEquivalentProductIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment#getGenericEquivalentProductId <em>Generic Equivalent Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Generic Equivalent Product Id</em>'.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment#getGenericEquivalentProductId()
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	EReference getWorkersCompensationSegment_GenericEquivalentProductId();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment <em>Prior Authorization Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prior Authorization Segment</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment
	 * @generated
	 */
	EClass getPriorAuthorizationSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getSegmentIdentification()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EAttribute getPriorAuthorizationSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getRequestType <em>Request Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Request Type</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getRequestType()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EAttribute getPriorAuthorizationSegment_RequestType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getRequestPeriodDatebegin <em>Request Period Datebegin</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Period Datebegin</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getRequestPeriodDatebegin()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_RequestPeriodDatebegin();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getRequestPeriodDateend <em>Request Period Dateend</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Period Dateend</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getRequestPeriodDateend()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_RequestPeriodDateend();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getBasisOfRequest <em>Basis Of Request</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Basis Of Request</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getBasisOfRequest()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_BasisOfRequest();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeFirstName <em>Authorized Representative First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorized Representative First Name</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeFirstName()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_AuthorizedRepresentativeFirstName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeLastName <em>Authorized Representative Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorized Representative Last Name</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeLastName()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_AuthorizedRepresentativeLastName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeStreetAddress <em>Authorized Representative Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorized Representative Street Address</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeStreetAddress()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_AuthorizedRepresentativeStreetAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeCityAddress <em>Authorized Representative City Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorized Representative City Address</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeCityAddress()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_AuthorizedRepresentativeCityAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeStateprovinceAddress <em>Authorized Representative Stateprovince Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorized Representative Stateprovince Address</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeStateprovinceAddress()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_AuthorizedRepresentativeStateprovinceAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeZippostalZone <em>Authorized Representative Zippostal Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorized Representative Zippostal Zone</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizedRepresentativeZippostalZone()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_AuthorizedRepresentativeZippostalZone();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getPriorAuthorizationNumberassigned <em>Prior Authorization Numberassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Authorization Numberassigned</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getPriorAuthorizationNumberassigned()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_PriorAuthorizationNumberassigned();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizationNumber <em>Authorization Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorization Number</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getAuthorizationNumber()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_AuthorizationNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment#getPriorAuthorizationSupportingDocumentation <em>Prior Authorization Supporting Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Authorization Supporting Documentation</em>'.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment#getPriorAuthorizationSupportingDocumentation()
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	EReference getPriorAuthorizationSegment_PriorAuthorizationSupportingDocumentation();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.PricingSegment <em>Pricing Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pricing Segment</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment
	 * @generated
	 */
	EClass getPricingSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PricingSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getSegmentIdentification()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EAttribute getPricingSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getIngredientCostSubmitted <em>Ingredient Cost Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredient Cost Submitted</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getIngredientCostSubmitted()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_IngredientCostSubmitted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getDispensingFeeSubmitted <em>Dispensing Fee Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dispensing Fee Submitted</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getDispensingFeeSubmitted()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_DispensingFeeSubmitted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getProfessionalServiceFeeSubmitted <em>Professional Service Fee Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Professional Service Fee Submitted</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getProfessionalServiceFeeSubmitted()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_ProfessionalServiceFeeSubmitted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getPatientPaidAmountSubmitted <em>Patient Paid Amount Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient Paid Amount Submitted</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getPatientPaidAmountSubmitted()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_PatientPaidAmountSubmitted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getIncentiveAmountSubmitted <em>Incentive Amount Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incentive Amount Submitted</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getIncentiveAmountSubmitted()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_IncentiveAmountSubmitted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getOtherAmountClaimedSubmittedCount <em>Other Amount Claimed Submitted Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Amount Claimed Submitted Count</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getOtherAmountClaimedSubmittedCount()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_OtherAmountClaimedSubmittedCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getOtherAmountClaimedSubmittedQualifier <em>Other Amount Claimed Submitted Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Amount Claimed Submitted Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getOtherAmountClaimedSubmittedQualifier()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_OtherAmountClaimedSubmittedQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getOtherAmountClaimedSubmitted <em>Other Amount Claimed Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Amount Claimed Submitted</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getOtherAmountClaimedSubmitted()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_OtherAmountClaimedSubmitted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getFlatSalesTaxAmountSubmitted <em>Flat Sales Tax Amount Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flat Sales Tax Amount Submitted</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getFlatSalesTaxAmountSubmitted()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_FlatSalesTaxAmountSubmitted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getPercentageSalesTaxAmountSubmitted <em>Percentage Sales Tax Amount Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Percentage Sales Tax Amount Submitted</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getPercentageSalesTaxAmountSubmitted()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_PercentageSalesTaxAmountSubmitted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getPercentageSalesTaxRateSubmitted <em>Percentage Sales Tax Rate Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Percentage Sales Tax Rate Submitted</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getPercentageSalesTaxRateSubmitted()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_PercentageSalesTaxRateSubmitted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getPercentageSalesTaxBasisSubmitted <em>Percentage Sales Tax Basis Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Percentage Sales Tax Basis Submitted</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getPercentageSalesTaxBasisSubmitted()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_PercentageSalesTaxBasisSubmitted();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getUsualAndCustomaryCharge <em>Usual And Customary Charge</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Usual And Customary Charge</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getUsualAndCustomaryCharge()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_UsualAndCustomaryCharge();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getGrossAmountDue <em>Gross Amount Due</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Gross Amount Due</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getGrossAmountDue()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_GrossAmountDue();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PricingSegment#getBasisOfCostDetermination <em>Basis Of Cost Determination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Basis Of Cost Determination</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getBasisOfCostDetermination()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EAttribute getPricingSegment_BasisOfCostDetermination();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PricingSegment#getMedicaidPaidAmount <em>Medicaid Paid Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medicaid Paid Amount</em>'.
	 * @see org.ncpdp.uml.telecom.PricingSegment#getMedicaidPaidAmount()
	 * @see #getPricingSegment()
	 * @generated
	 */
	EReference getPricingSegment_MedicaidPaidAmount();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.PrescriberSegment <em>Prescriber Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Prescriber Segment</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment
	 * @generated
	 */
	EClass getPrescriberSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getSegmentIdentification()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EAttribute getPrescriberSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberIdQualifier <em>Prescriber Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriber Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberIdQualifier()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrescriberIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberId <em>Prescriber Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriber Id</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberId()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrescriberId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberLastName <em>Prescriber Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriber Last Name</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberLastName()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrescriberLastName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberPhoneNumber <em>Prescriber Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriber Phone Number</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberPhoneNumber()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrescriberPhoneNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrimaryCareProviderIdQualifier <em>Primary Care Provider Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Care Provider Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrimaryCareProviderIdQualifier()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrimaryCareProviderIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrimaryCareProviderId <em>Primary Care Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Care Provider Id</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrimaryCareProviderId()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrimaryCareProviderId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrimaryCareProviderLastName <em>Primary Care Provider Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Primary Care Provider Last Name</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrimaryCareProviderLastName()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrimaryCareProviderLastName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberFirstName <em>Prescriber First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriber First Name</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberFirstName()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrescriberFirstName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberStreetAddress <em>Prescriber Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriber Street Address</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberStreetAddress()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrescriberStreetAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberCityAddress <em>Prescriber City Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriber City Address</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberCityAddress()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrescriberCityAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberStateprovinceAddress <em>Prescriber Stateprovince Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriber Stateprovince Address</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberStateprovinceAddress()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrescriberStateprovinceAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberZippostalZone <em>Prescriber Zippostal Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriber Zippostal Zone</em>'.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment#getPrescriberZippostalZone()
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	EReference getPrescriberSegment_PrescriberZippostalZone();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.PharmacyProviderSegment <em>Pharmacy Provider Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Pharmacy Provider Segment</em>'.
	 * @see org.ncpdp.uml.telecom.PharmacyProviderSegment
	 * @generated
	 */
	EClass getPharmacyProviderSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PharmacyProviderSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.PharmacyProviderSegment#getSegmentIdentification()
	 * @see #getPharmacyProviderSegment()
	 * @generated
	 */
	EAttribute getPharmacyProviderSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PharmacyProviderSegment#getProviderIdQualifier <em>Provider Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provider Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.PharmacyProviderSegment#getProviderIdQualifier()
	 * @see #getPharmacyProviderSegment()
	 * @generated
	 */
	EReference getPharmacyProviderSegment_ProviderIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PharmacyProviderSegment#getProviderId <em>Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Provider Id</em>'.
	 * @see org.ncpdp.uml.telecom.PharmacyProviderSegment#getProviderId()
	 * @see #getPharmacyProviderSegment()
	 * @generated
	 */
	EReference getPharmacyProviderSegment_ProviderId();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.PatientSegment <em>Patient Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Patient Segment</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment
	 * @generated
	 */
	EClass getPatientSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PatientSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getSegmentIdentification()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EAttribute getPatientSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientIdQualifier <em>Patient Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Patient Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientIdQualifier()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EAttribute getPatientSegment_PatientIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientId <em>Patient Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient Id</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientId()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_PatientId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Of Birth</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getDateOfBirth()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_DateOfBirth();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientGenderCode <em>Patient Gender Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Patient Gender Code</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientGenderCode()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EAttribute getPatientSegment_PatientGenderCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientFirstName <em>Patient First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient First Name</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientFirstName()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_PatientFirstName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientLastName <em>Patient Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient Last Name</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientLastName()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_PatientLastName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientStreetAddress <em>Patient Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient Street Address</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientStreetAddress()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_PatientStreetAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientCityAddress <em>Patient City Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient City Address</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientCityAddress()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_PatientCityAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientStateProvinceAddress <em>Patient State Province Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient State Province Address</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientStateProvinceAddress()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_PatientStateProvinceAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientZippostalZone <em>Patient Zippostal Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient Zippostal Zone</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientZippostalZone()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_PatientZippostalZone();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientPhoneNumber <em>Patient Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient Phone Number</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientPhoneNumber()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_PatientPhoneNumber();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PatientSegment#getPlaceOfService <em>Place Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Place Of Service</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPlaceOfService()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EAttribute getPatientSegment_PlaceOfService();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getEmployerId <em>Employer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Employer Id</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getEmployerId()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_EmployerId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getSmokerNonsmokerCode <em>Smoker Nonsmoker Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Smoker Nonsmoker Code</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getSmokerNonsmokerCode()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_SmokerNonsmokerCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PatientSegment#getPregnancyIndicator <em>Pregnancy Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pregnancy Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPregnancyIndicator()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EAttribute getPatientSegment_PregnancyIndicator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientEmailAddress <em>Patient Email Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient Email Address</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientEmailAddress()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EReference getPatientSegment_PatientEmailAddress();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.PatientSegment#getPatientResidence <em>Patient Residence</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Patient Residence</em>'.
	 * @see org.ncpdp.uml.telecom.PatientSegment#getPatientResidence()
	 * @see #getPatientSegment()
	 * @generated
	 */
	EAttribute getPatientSegment_PatientResidence();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.NarrativeSegment <em>Narrative Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Narrative Segment</em>'.
	 * @see org.ncpdp.uml.telecom.NarrativeSegment
	 * @generated
	 */
	EClass getNarrativeSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.NarrativeSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.NarrativeSegment#getSegmentIdentification()
	 * @see #getNarrativeSegment()
	 * @generated
	 */
	EAttribute getNarrativeSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.NarrativeSegment#getNarrativeMessage <em>Narrative Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Narrative Message</em>'.
	 * @see org.ncpdp.uml.telecom.NarrativeSegment#getNarrativeMessage()
	 * @see #getNarrativeSegment()
	 * @generated
	 */
	EReference getNarrativeSegment_NarrativeMessage();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.InsuranceSegment <em>Insurance Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Insurance Segment</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment
	 * @generated
	 */
	EClass getInsuranceSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getSegmentIdentification()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EAttribute getInsuranceSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getCardholderId <em>Cardholder Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cardholder Id</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getCardholderId()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_CardholderId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getCardholderFirstName <em>Cardholder First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cardholder First Name</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getCardholderFirstName()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_CardholderFirstName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getCardholderLastName <em>Cardholder Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cardholder Last Name</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getCardholderLastName()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_CardholderLastName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getHomePlan <em>Home Plan</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Home Plan</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getHomePlan()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_HomePlan();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getPlanId <em>Plan Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan Id</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getPlanId()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_PlanId();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getEligibilityClarificationCode <em>Eligibility Clarification Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Eligibility Clarification Code</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getEligibilityClarificationCode()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EAttribute getInsuranceSegment_EligibilityClarificationCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Id</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getGroupId()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_GroupId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getPersonCode <em>Person Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Person Code</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getPersonCode()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_PersonCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getPatientRelationshipCode <em>Patient Relationship Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Patient Relationship Code</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getPatientRelationshipCode()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EAttribute getInsuranceSegment_PatientRelationshipCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerBinNumber <em>Other Payer Bin Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Bin Number</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerBinNumber()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_OtherPayerBinNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerProcessorControlNumber <em>Other Payer Processor Control Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Processor Control Number</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerProcessorControlNumber()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_OtherPayerProcessorControlNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerCardholderId <em>Other Payer Cardholder Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Cardholder Id</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerCardholderId()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_OtherPayerCardholderId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerGroupId <em>Other Payer Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Group Id</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getOtherPayerGroupId()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_OtherPayerGroupId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getMedigapId <em>Medigap Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medigap Id</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getMedigapId()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_MedigapId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getMedicaidIndicator <em>Medicaid Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medicaid Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getMedicaidIndicator()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_MedicaidIndicator();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getProviderAcceptAssignmentIndicator <em>Provider Accept Assignment Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Provider Accept Assignment Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getProviderAcceptAssignmentIndicator()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EAttribute getInsuranceSegment_ProviderAcceptAssignmentIndicator();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getCmsPartDDefinedQualifiedFacility <em>Cms Part DDefined Qualified Facility</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Cms Part DDefined Qualified Facility</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getCmsPartDDefinedQualifiedFacility()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EAttribute getInsuranceSegment_CmsPartDDefinedQualifiedFacility();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getMedicaidIdNumber <em>Medicaid Id Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medicaid Id Number</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getMedicaidIdNumber()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_MedicaidIdNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.InsuranceSegment#getMedicaidAgencyNumber <em>Medicaid Agency Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medicaid Agency Number</em>'.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment#getMedicaidAgencyNumber()
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	EReference getInsuranceSegment_MedicaidAgencyNumber();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.FacilitySegment <em>Facility Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Facility Segment</em>'.
	 * @see org.ncpdp.uml.telecom.FacilitySegment
	 * @generated
	 */
	EClass getFacilitySegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.FacilitySegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.FacilitySegment#getSegmentIdentification()
	 * @see #getFacilitySegment()
	 * @generated
	 */
	EAttribute getFacilitySegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityId <em>Facility Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facility Id</em>'.
	 * @see org.ncpdp.uml.telecom.FacilitySegment#getFacilityId()
	 * @see #getFacilitySegment()
	 * @generated
	 */
	EReference getFacilitySegment_FacilityId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityName <em>Facility Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facility Name</em>'.
	 * @see org.ncpdp.uml.telecom.FacilitySegment#getFacilityName()
	 * @see #getFacilitySegment()
	 * @generated
	 */
	EReference getFacilitySegment_FacilityName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityStreetAddress <em>Facility Street Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facility Street Address</em>'.
	 * @see org.ncpdp.uml.telecom.FacilitySegment#getFacilityStreetAddress()
	 * @see #getFacilitySegment()
	 * @generated
	 */
	EReference getFacilitySegment_FacilityStreetAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityCityAddress <em>Facility City Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facility City Address</em>'.
	 * @see org.ncpdp.uml.telecom.FacilitySegment#getFacilityCityAddress()
	 * @see #getFacilitySegment()
	 * @generated
	 */
	EReference getFacilitySegment_FacilityCityAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityStateprovinceAddress <em>Facility Stateprovince Address</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facility Stateprovince Address</em>'.
	 * @see org.ncpdp.uml.telecom.FacilitySegment#getFacilityStateprovinceAddress()
	 * @see #getFacilitySegment()
	 * @generated
	 */
	EReference getFacilitySegment_FacilityStateprovinceAddress();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.FacilitySegment#getFacilityZippostalZone <em>Facility Zippostal Zone</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Facility Zippostal Zone</em>'.
	 * @see org.ncpdp.uml.telecom.FacilitySegment#getFacilityZippostalZone()
	 * @see #getFacilitySegment()
	 * @generated
	 */
	EReference getFacilitySegment_FacilityZippostalZone();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.DURPPSSegment <em>DURPPS Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>DURPPS Segment</em>'.
	 * @see org.ncpdp.uml.telecom.DURPPSSegment
	 * @generated
	 */
	EClass getDURPPSSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.DURPPSSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.DURPPSSegment#getSegmentIdentification()
	 * @see #getDURPPSSegment()
	 * @generated
	 */
	EAttribute getDURPPSSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.DURPPSSegment#getDurppsCodeCounter <em>Durpps Code Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Durpps Code Counter</em>'.
	 * @see org.ncpdp.uml.telecom.DURPPSSegment#getDurppsCodeCounter()
	 * @see #getDURPPSSegment()
	 * @generated
	 */
	EReference getDURPPSSegment_DurppsCodeCounter();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.DURPPSSegment#getReasonForServiceCode <em>Reason For Service Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reason For Service Code</em>'.
	 * @see org.ncpdp.uml.telecom.DURPPSSegment#getReasonForServiceCode()
	 * @see #getDURPPSSegment()
	 * @generated
	 */
	EAttribute getDURPPSSegment_ReasonForServiceCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.DURPPSSegment#getProfessionalServiceCode <em>Professional Service Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Professional Service Code</em>'.
	 * @see org.ncpdp.uml.telecom.DURPPSSegment#getProfessionalServiceCode()
	 * @see #getDURPPSSegment()
	 * @generated
	 */
	EAttribute getDURPPSSegment_ProfessionalServiceCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.DURPPSSegment#getResultOfServiceCode <em>Result Of Service Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Result Of Service Code</em>'.
	 * @see org.ncpdp.uml.telecom.DURPPSSegment#getResultOfServiceCode()
	 * @see #getDURPPSSegment()
	 * @generated
	 */
	EAttribute getDURPPSSegment_ResultOfServiceCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.DURPPSSegment#getDurppsLevelOfEffort <em>Durpps Level Of Effort</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Durpps Level Of Effort</em>'.
	 * @see org.ncpdp.uml.telecom.DURPPSSegment#getDurppsLevelOfEffort()
	 * @see #getDURPPSSegment()
	 * @generated
	 */
	EReference getDURPPSSegment_DurppsLevelOfEffort();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.DURPPSSegment#getDurCoagentIdQualifier <em>Dur Coagent Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dur Coagent Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.DURPPSSegment#getDurCoagentIdQualifier()
	 * @see #getDURPPSSegment()
	 * @generated
	 */
	EAttribute getDURPPSSegment_DurCoagentIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.DURPPSSegment#getDurCoagentId <em>Dur Coagent Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dur Coagent Id</em>'.
	 * @see org.ncpdp.uml.telecom.DURPPSSegment#getDurCoagentId()
	 * @see #getDURPPSSegment()
	 * @generated
	 */
	EReference getDURPPSSegment_DurCoagentId();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.CouponSegment <em>Coupon Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coupon Segment</em>'.
	 * @see org.ncpdp.uml.telecom.CouponSegment
	 * @generated
	 */
	EClass getCouponSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CouponSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.CouponSegment#getSegmentIdentification()
	 * @see #getCouponSegment()
	 * @generated
	 */
	EAttribute getCouponSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CouponSegment#getCouponType <em>Coupon Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Coupon Type</em>'.
	 * @see org.ncpdp.uml.telecom.CouponSegment#getCouponType()
	 * @see #getCouponSegment()
	 * @generated
	 */
	EAttribute getCouponSegment_CouponType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CouponSegment#getCouponNumber <em>Coupon Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coupon Number</em>'.
	 * @see org.ncpdp.uml.telecom.CouponSegment#getCouponNumber()
	 * @see #getCouponSegment()
	 * @generated
	 */
	EReference getCouponSegment_CouponNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CouponSegment#getCouponValueAmount <em>Coupon Value Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coupon Value Amount</em>'.
	 * @see org.ncpdp.uml.telecom.CouponSegment#getCouponValueAmount()
	 * @see #getCouponSegment()
	 * @generated
	 */
	EReference getCouponSegment_CouponValueAmount();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment <em>Coordinationof Benefits Other Payments Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Coordinationof Benefits Other Payments Segment</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment
	 * @generated
	 */
	EClass getCoordinationofBenefitsOtherPaymentsSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getSegmentIdentification()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EAttribute getCoordinationofBenefitsOtherPaymentsSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getCoordinationOfBenefitsotherPaymentsCount <em>Coordination Of Benefitsother Payments Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Coordination Of Benefitsother Payments Count</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getCoordinationOfBenefitsotherPaymentsCount()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_CoordinationOfBenefitsotherPaymentsCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerCoverageType <em>Other Payer Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Payer Coverage Type</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerCoverageType()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EAttribute getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerCoverageType();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerIdQualifier <em>Other Payer Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Payer Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerIdQualifier()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EAttribute getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerId <em>Other Payer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Id</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerId()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerDate <em>Other Payer Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Date</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerDate()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getInternalControlNumber <em>Internal Control Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Control Number</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getInternalControlNumber()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_InternalControlNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerAmountPaidCount <em>Other Payer Amount Paid Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Amount Paid Count</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerAmountPaidCount()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerAmountPaidQualifier <em>Other Payer Amount Paid Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Payer Amount Paid Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerAmountPaidQualifier()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EAttribute getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerAmountPaid <em>Other Payer Amount Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Amount Paid</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerAmountPaid()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerRejectCount <em>Other Payer Reject Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Reject Count</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerRejectCount()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerRejectCode <em>Other Payer Reject Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Reject Code</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerRejectCode()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerpatientResponsibilityAmountCount <em>Other Payerpatient Responsibility Amount Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payerpatient Responsibility Amount Count</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerpatientResponsibilityAmountCount()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerpatientResponsibilityAmountQualifier <em>Other Payerpatient Responsibility Amount Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Payerpatient Responsibility Amount Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerpatientResponsibilityAmountQualifier()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EAttribute getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerpatientResponsibilityAmount <em>Other Payerpatient Responsibility Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payerpatient Responsibility Amount</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getOtherPayerpatientResponsibilityAmount()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getBenefitStageCount <em>Benefit Stage Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Benefit Stage Count</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getBenefitStageCount()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getBenefitStageQualifier <em>Benefit Stage Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Benefit Stage Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getBenefitStageQualifier()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EAttribute getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getBenefitStageAmount <em>Benefit Stage Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Benefit Stage Amount</em>'.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment#getBenefitStageAmount()
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	EReference getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageAmount();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ClinicalSegment <em>Clinical Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Clinical Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment
	 * @generated
	 */
	EClass getClinicalSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClinicalSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment#getSegmentIdentification()
	 * @see #getClinicalSegment()
	 * @generated
	 */
	EAttribute getClinicalSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClinicalSegment#getDiagnosisCodeCount <em>Diagnosis Code Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagnosis Code Count</em>'.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment#getDiagnosisCodeCount()
	 * @see #getClinicalSegment()
	 * @generated
	 */
	EReference getClinicalSegment_DiagnosisCodeCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClinicalSegment#getDiagnosisCodeQualifier <em>Diagnosis Code Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagnosis Code Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment#getDiagnosisCodeQualifier()
	 * @see #getClinicalSegment()
	 * @generated
	 */
	EReference getClinicalSegment_DiagnosisCodeQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClinicalSegment#getDiagnosisCode <em>Diagnosis Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Diagnosis Code</em>'.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment#getDiagnosisCode()
	 * @see #getClinicalSegment()
	 * @generated
	 */
	EReference getClinicalSegment_DiagnosisCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClinicalSegment#getClinicalInformationCounter <em>Clinical Information Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clinical Information Counter</em>'.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment#getClinicalInformationCounter()
	 * @see #getClinicalSegment()
	 * @generated
	 */
	EReference getClinicalSegment_ClinicalInformationCounter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementDate <em>Measurement Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement Date</em>'.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementDate()
	 * @see #getClinicalSegment()
	 * @generated
	 */
	EReference getClinicalSegment_MeasurementDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementTime <em>Measurement Time</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement Time</em>'.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementTime()
	 * @see #getClinicalSegment()
	 * @generated
	 */
	EReference getClinicalSegment_MeasurementTime();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementDimension <em>Measurement Dimension</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Measurement Dimension</em>'.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementDimension()
	 * @see #getClinicalSegment()
	 * @generated
	 */
	EAttribute getClinicalSegment_MeasurementDimension();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementUnit <em>Measurement Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Measurement Unit</em>'.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementUnit()
	 * @see #getClinicalSegment()
	 * @generated
	 */
	EAttribute getClinicalSegment_MeasurementUnit();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementValue <em>Measurement Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Measurement Value</em>'.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment#getMeasurementValue()
	 * @see #getClinicalSegment()
	 * @generated
	 */
	EReference getClinicalSegment_MeasurementValue();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ClaimSegment <em>Claim Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Claim Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment
	 * @generated
	 */
	EClass getClaimSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getSegmentIdentification()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getPrescriptionserviceReferenceNumberQualifier <em>Prescriptionservice Reference Number Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriptionservice Reference Number Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getPrescriptionserviceReferenceNumberQualifier()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_PrescriptionserviceReferenceNumberQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getPrescriptionserviceReferenceNumber <em>Prescriptionservice Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriptionservice Reference Number</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getPrescriptionserviceReferenceNumber()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_PrescriptionserviceReferenceNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getProductserviceIdQualifier <em>Productservice Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productservice Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getProductserviceIdQualifier()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_ProductserviceIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getProductserviceId <em>Productservice Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Productservice Id</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getProductserviceId()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_ProductserviceId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getAssociatedPrescriptionserviceReferenceNumber <em>Associated Prescriptionservice Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associated Prescriptionservice Reference Number</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getAssociatedPrescriptionserviceReferenceNumber()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_AssociatedPrescriptionserviceReferenceNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getAssociatedPrescriptionserviceDate <em>Associated Prescriptionservice Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Associated Prescriptionservice Date</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getAssociatedPrescriptionserviceDate()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_AssociatedPrescriptionserviceDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getProcedureModifierCodeCount <em>Procedure Modifier Code Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedure Modifier Code Count</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getProcedureModifierCodeCount()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_ProcedureModifierCodeCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getProcedureModifierCode <em>Procedure Modifier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Procedure Modifier Code</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getProcedureModifierCode()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_ProcedureModifierCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getQuantityDispensed <em>Quantity Dispensed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantity Dispensed</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getQuantityDispensed()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_QuantityDispensed();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getFillNumber <em>Fill Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Fill Number</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getFillNumber()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_FillNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getDaysSupply <em>Days Supply</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days Supply</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getDaysSupply()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_DaysSupply();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getCompoundCode <em>Compound Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compound Code</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getCompoundCode()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_CompoundCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getDispenseAsWrittendawproductSelectionCode <em>Dispense As Writtendawproduct Selection Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dispense As Writtendawproduct Selection Code</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getDispenseAsWrittendawproductSelectionCode()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_DispenseAsWrittendawproductSelectionCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getDatePrescriptionWritten <em>Date Prescription Written</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Prescription Written</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getDatePrescriptionWritten()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_DatePrescriptionWritten();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getNumberOfRefillsAuthorized <em>Number Of Refills Authorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Number Of Refills Authorized</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getNumberOfRefillsAuthorized()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_NumberOfRefillsAuthorized();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getPrescriptionOriginCode <em>Prescription Origin Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prescription Origin Code</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getPrescriptionOriginCode()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_PrescriptionOriginCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getSubmissionClarificationCodeCount <em>Submission Clarification Code Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Submission Clarification Code Count</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getSubmissionClarificationCodeCount()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_SubmissionClarificationCodeCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getSubmissionClarificationCode <em>Submission Clarification Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Submission Clarification Code</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getSubmissionClarificationCode()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_SubmissionClarificationCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getQuantityPrescribed <em>Quantity Prescribed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantity Prescribed</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getQuantityPrescribed()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_QuantityPrescribed();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getOtherCoverageCode <em>Other Coverage Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Coverage Code</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getOtherCoverageCode()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_OtherCoverageCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getSpecialPackagingIndicator <em>Special Packaging Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Special Packaging Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getSpecialPackagingIndicator()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_SpecialPackagingIndicator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getOriginallyPrescribedProductserviceIdQualifier <em>Originally Prescribed Productservice Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Originally Prescribed Productservice Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getOriginallyPrescribedProductserviceIdQualifier()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_OriginallyPrescribedProductserviceIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getOriginallyPrescribedProductserviceCode <em>Originally Prescribed Productservice Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Originally Prescribed Productservice Code</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getOriginallyPrescribedProductserviceCode()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_OriginallyPrescribedProductserviceCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getOriginallyPrescribedQuantity <em>Originally Prescribed Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Originally Prescribed Quantity</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getOriginallyPrescribedQuantity()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_OriginallyPrescribedQuantity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getAlternateId <em>Alternate Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Alternate Id</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getAlternateId()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_AlternateId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getScheduledPrescriptionIdNumber <em>Scheduled Prescription Id Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Scheduled Prescription Id Number</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getScheduledPrescriptionIdNumber()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_ScheduledPrescriptionIdNumber();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getUnitOfMeasure <em>Unit Of Measure</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Unit Of Measure</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getUnitOfMeasure()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_UnitOfMeasure();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getLevelOfService <em>Level Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Level Of Service</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getLevelOfService()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_LevelOfService();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getPriorAuthorizationTypeCode <em>Prior Authorization Type Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Prior Authorization Type Code</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getPriorAuthorizationTypeCode()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_PriorAuthorizationTypeCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getPriorAuthorizationNumberSubmitted <em>Prior Authorization Number Submitted</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Authorization Number Submitted</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getPriorAuthorizationNumberSubmitted()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_PriorAuthorizationNumberSubmitted();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getIntermediaryAuthorizationTypeId <em>Intermediary Authorization Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Intermediary Authorization Type Id</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getIntermediaryAuthorizationTypeId()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_IntermediaryAuthorizationTypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getIntermediaryAuthorizationId <em>Intermediary Authorization Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Intermediary Authorization Id</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getIntermediaryAuthorizationId()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_IntermediaryAuthorizationId();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getDispensingStatus <em>Dispensing Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Dispensing Status</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getDispensingStatus()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_DispensingStatus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getQuantityIntendedToBeDispensed <em>Quantity Intended To Be Dispensed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantity Intended To Be Dispensed</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getQuantityIntendedToBeDispensed()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_QuantityIntendedToBeDispensed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getDaysSupplyIntendedToBeDispensed <em>Days Supply Intended To Be Dispensed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Days Supply Intended To Be Dispensed</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getDaysSupplyIntendedToBeDispensed()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_DaysSupplyIntendedToBeDispensed();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getDelayReasonCode <em>Delay Reason Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Delay Reason Code</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getDelayReasonCode()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_DelayReasonCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getTransactionReferenceNumber <em>Transaction Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transaction Reference Number</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getTransactionReferenceNumber()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_TransactionReferenceNumber();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getPatientAssignmentIndicatordirectMemberReimbursementIndicator <em>Patient Assignment Indicatordirect Member Reimbursement Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Patient Assignment Indicatordirect Member Reimbursement Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getPatientAssignmentIndicatordirectMemberReimbursementIndicator()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_PatientAssignmentIndicatordirectMemberReimbursementIndicator();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getRouteOfAdministration <em>Route Of Administration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Route Of Administration</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getRouteOfAdministration()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_RouteOfAdministration();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getCompoundType <em>Compound Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Compound Type</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getCompoundType()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_CompoundType();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ClaimSegment#getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn <em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EReference getClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ClaimSegment#getPharmacyServiceType <em>Pharmacy Service Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Pharmacy Service Type</em>'.
	 * @see org.ncpdp.uml.telecom.ClaimSegment#getPharmacyServiceType()
	 * @see #getClaimSegment()
	 * @generated
	 */
	EAttribute getClaimSegment_PharmacyServiceType();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment <em>Additional Documentation Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Additional Documentation Segment</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment
	 * @generated
	 */
	EClass getAdditionalDocumentationSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getSegmentIdentification()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EAttribute getAdditionalDocumentationSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getAdditionalDocumentationTypeId <em>Additional Documentation Type Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Additional Documentation Type Id</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getAdditionalDocumentationTypeId()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EAttribute getAdditionalDocumentationSegment_AdditionalDocumentationTypeId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getRequestPeriodBeginDate <em>Request Period Begin Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Period Begin Date</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getRequestPeriodBeginDate()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_RequestPeriodBeginDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getRequestPeriodRecertrevisedDate <em>Request Period Recertrevised Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Request Period Recertrevised Date</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getRequestPeriodRecertrevisedDate()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_RequestPeriodRecertrevisedDate();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getRequestStatus <em>Request Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Request Status</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getRequestStatus()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EAttribute getAdditionalDocumentationSegment_RequestStatus();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getLengthOfNeedQualifier <em>Length Of Need Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Length Of Need Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getLengthOfNeedQualifier()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EAttribute getAdditionalDocumentationSegment_LengthOfNeedQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getLengthOfNeed <em>Length Of Need</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Length Of Need</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getLengthOfNeed()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_LengthOfNeed();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getPrescribersupplierDateSigned <em>Prescribersupplier Date Signed</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescribersupplier Date Signed</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getPrescribersupplierDateSigned()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_PrescribersupplierDateSigned();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getSupportingDocumentation <em>Supporting Documentation</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Supporting Documentation</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getSupportingDocumentation()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_SupportingDocumentation();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionNumberletterCount <em>Question Numberletter Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Numberletter Count</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionNumberletterCount()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_QuestionNumberletterCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionNumberletter <em>Question Numberletter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Numberletter</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionNumberletter()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_QuestionNumberletter();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionPercentResponse <em>Question Percent Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Percent Response</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionPercentResponse()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_QuestionPercentResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionDateResponse <em>Question Date Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Date Response</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionDateResponse()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_QuestionDateResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionDollarAmountResponse <em>Question Dollar Amount Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Dollar Amount Response</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionDollarAmountResponse()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_QuestionDollarAmountResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionNumericResponse <em>Question Numeric Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Numeric Response</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionNumericResponse()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_QuestionNumericResponse();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionAlphanumericResponse <em>Question Alphanumeric Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Question Alphanumeric Response</em>'.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment#getQuestionAlphanumericResponse()
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	EReference getAdditionalDocumentationSegment_QuestionAlphanumericResponse();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.CompoundSegment <em>Compound Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Compound Segment</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment
	 * @generated
	 */
	EClass getCompoundSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CompoundSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment#getSegmentIdentification()
	 * @see #getCompoundSegment()
	 * @generated
	 */
	EAttribute getCompoundSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundDosageFormDescriptionCode <em>Compound Dosage Form Description Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Compound Dosage Form Description Code</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment#getCompoundDosageFormDescriptionCode()
	 * @see #getCompoundSegment()
	 * @generated
	 */
	EAttribute getCompoundSegment_CompoundDosageFormDescriptionCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundDispensingUnitFormIndicator <em>Compound Dispensing Unit Form Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Compound Dispensing Unit Form Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment#getCompoundDispensingUnitFormIndicator()
	 * @see #getCompoundSegment()
	 * @generated
	 */
	EAttribute getCompoundSegment_CompoundDispensingUnitFormIndicator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientComponentCount <em>Compound Ingredient Component Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compound Ingredient Component Count</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientComponentCount()
	 * @see #getCompoundSegment()
	 * @generated
	 */
	EReference getCompoundSegment_CompoundIngredientComponentCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundProductIdQualifier <em>Compound Product Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Compound Product Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment#getCompoundProductIdQualifier()
	 * @see #getCompoundSegment()
	 * @generated
	 */
	EAttribute getCompoundSegment_CompoundProductIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundProductId <em>Compound Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compound Product Id</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment#getCompoundProductId()
	 * @see #getCompoundSegment()
	 * @generated
	 */
	EReference getCompoundSegment_CompoundProductId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientQuantity <em>Compound Ingredient Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compound Ingredient Quantity</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientQuantity()
	 * @see #getCompoundSegment()
	 * @generated
	 */
	EReference getCompoundSegment_CompoundIngredientQuantity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientDrugCost <em>Compound Ingredient Drug Cost</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compound Ingredient Drug Cost</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientDrugCost()
	 * @see #getCompoundSegment()
	 * @generated
	 */
	EReference getCompoundSegment_CompoundIngredientDrugCost();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientBasisOfCostDetermination <em>Compound Ingredient Basis Of Cost Determination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compound Ingredient Basis Of Cost Determination</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientBasisOfCostDetermination()
	 * @see #getCompoundSegment()
	 * @generated
	 */
	EReference getCompoundSegment_CompoundIngredientBasisOfCostDetermination();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientModifierCodeCount <em>Compound Ingredient Modifier Code Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compound Ingredient Modifier Code Count</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientModifierCodeCount()
	 * @see #getCompoundSegment()
	 * @generated
	 */
	EReference getCompoundSegment_CompoundIngredientModifierCodeCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientModifierCode <em>Compound Ingredient Modifier Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Compound Ingredient Modifier Code</em>'.
	 * @see org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientModifierCode()
	 * @see #getCompoundSegment()
	 * @generated
	 */
	EReference getCompoundSegment_CompoundIngredientModifierCode();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response</em>'.
	 * @see org.ncpdp.uml.telecom.Response
	 * @generated
	 */
	EClass getResponse();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Response#getResponseHeaderSegment <em>Response Header Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Header Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Response#getResponseHeaderSegment()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_ResponseHeaderSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Response#getResponseClaimSegment <em>Response Claim Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Claim Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Response#getResponseClaimSegment()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_ResponseClaimSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Response#getResponseCoordinationofBenefitsOtherPayersSegment <em>Response Coordinationof Benefits Other Payers Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Coordinationof Benefits Other Payers Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Response#getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_ResponseCoordinationofBenefitsOtherPayersSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Response#getResponseDURPPSSegment <em>Response DURPPS Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response DURPPS Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Response#getResponseDURPPSSegment()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_ResponseDURPPSSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Response#getResponseInsuranceSegment <em>Response Insurance Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Insurance Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Response#getResponseInsuranceSegment()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_ResponseInsuranceSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Response#getResponseMessageSegment <em>Response Message Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Message Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Response#getResponseMessageSegment()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_ResponseMessageSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Response#getResponsePatientSegment <em>Response Patient Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Patient Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Response#getResponsePatientSegment()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_ResponsePatientSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Response#getResponsePricingSegment <em>Response Pricing Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Pricing Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Response#getResponsePricingSegment()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_ResponsePricingSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.Response#getResponsePriorAuthorizationSegment <em>Response Prior Authorization Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Response Prior Authorization Segment</em>'.
	 * @see org.ncpdp.uml.telecom.Response#getResponsePriorAuthorizationSegment()
	 * @see #getResponse()
	 * @generated
	 */
	EReference getResponse_ResponsePriorAuthorizationSegment();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment <em>Response Header Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Header Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseHeaderSegment
	 * @generated
	 */
	EClass getResponseHeaderSegment();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getVersionreleaseNumber <em>Versionrelease Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Versionrelease Number</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseHeaderSegment#getVersionreleaseNumber()
	 * @see #getResponseHeaderSegment()
	 * @generated
	 */
	EReference getResponseHeaderSegment_VersionreleaseNumber();

	/**
	 * Returns the meta object for the attribute '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getTransactionCode <em>Transaction Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Code</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseHeaderSegment#getTransactionCode()
	 * @see #getResponseHeaderSegment()
	 * @generated
	 */
	EAttribute getResponseHeaderSegment_TransactionCode();

	/**
	 * Returns the meta object for the attribute '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getTransactionCount <em>Transaction Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Transaction Count</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseHeaderSegment#getTransactionCount()
	 * @see #getResponseHeaderSegment()
	 * @generated
	 */
	EAttribute getResponseHeaderSegment_TransactionCount();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getHeaderResponseStatus <em>Header Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Header Response Status</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseHeaderSegment#getHeaderResponseStatus()
	 * @see #getResponseHeaderSegment()
	 * @generated
	 */
	EReference getResponseHeaderSegment_HeaderResponseStatus();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getServiceProviderIdQualifier <em>Service Provider Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Provider Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseHeaderSegment#getServiceProviderIdQualifier()
	 * @see #getResponseHeaderSegment()
	 * @generated
	 */
	EReference getResponseHeaderSegment_ServiceProviderIdQualifier();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getServiceProviderId <em>Service Provider Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Service Provider Id</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseHeaderSegment#getServiceProviderId()
	 * @see #getResponseHeaderSegment()
	 * @generated
	 */
	EReference getResponseHeaderSegment_ServiceProviderId();

	/**
	 * Returns the meta object for the containment reference '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment#getDateOfService <em>Date Of Service</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Date Of Service</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseHeaderSegment#getDateOfService()
	 * @see #getResponseHeaderSegment()
	 * @generated
	 */
	EReference getResponseHeaderSegment_DateOfService();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ResponseClaimSegment <em>Response Claim Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Claim Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment
	 * @generated
	 */
	EClass getResponseClaimSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment#getSegmentIdentification()
	 * @see #getResponseClaimSegment()
	 * @generated
	 */
	EAttribute getResponseClaimSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPrescriptionserviceReferenceNumberQualifier <em>Prescriptionservice Reference Number Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriptionservice Reference Number Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment#getPrescriptionserviceReferenceNumberQualifier()
	 * @see #getResponseClaimSegment()
	 * @generated
	 */
	EReference getResponseClaimSegment_PrescriptionserviceReferenceNumberQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPrescriptionserviceReferenceNumber <em>Prescriptionservice Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prescriptionservice Reference Number</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment#getPrescriptionserviceReferenceNumber()
	 * @see #getResponseClaimSegment()
	 * @generated
	 */
	EReference getResponseClaimSegment_PrescriptionserviceReferenceNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductCount <em>Preferred Product Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferred Product Count</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductCount()
	 * @see #getResponseClaimSegment()
	 * @generated
	 */
	EReference getResponseClaimSegment_PreferredProductCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductIdQualifier <em>Preferred Product Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferred Product Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductIdQualifier()
	 * @see #getResponseClaimSegment()
	 * @generated
	 */
	EReference getResponseClaimSegment_PreferredProductIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductId <em>Preferred Product Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferred Product Id</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductId()
	 * @see #getResponseClaimSegment()
	 * @generated
	 */
	EReference getResponseClaimSegment_PreferredProductId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductIncentive <em>Preferred Product Incentive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferred Product Incentive</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductIncentive()
	 * @see #getResponseClaimSegment()
	 * @generated
	 */
	EReference getResponseClaimSegment_PreferredProductIncentive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductCostShareIncentive <em>Preferred Product Cost Share Incentive</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferred Product Cost Share Incentive</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductCostShareIncentive()
	 * @see #getResponseClaimSegment()
	 * @generated
	 */
	EReference getResponseClaimSegment_PreferredProductCostShareIncentive();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductDescription <em>Preferred Product Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Preferred Product Description</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment#getPreferredProductDescription()
	 * @see #getResponseClaimSegment()
	 * @generated
	 */
	EReference getResponseClaimSegment_PreferredProductDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseClaimSegment#getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn <em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment#getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn()
	 * @see #getResponseClaimSegment()
	 * @generated
	 */
	EReference getResponseClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment <em>Response Coordinationof Benefits Other Payers Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Coordinationof Benefits Other Payers Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment
	 * @generated
	 */
	EClass getResponseCoordinationofBenefitsOtherPayersSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getSegmentIdentification()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EAttribute getResponseCoordinationofBenefitsOtherPayersSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerIdCount <em>Other Payer Id Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Id Count</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerIdCount()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerCoverageType <em>Other Payer Coverage Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Payer Coverage Type</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerCoverageType()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EAttribute getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCoverageType();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerIdQualifier <em>Other Payer Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Payer Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerIdQualifier()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EAttribute getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerId <em>Other Payer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Id</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerId()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerProcessorControlNumber <em>Other Payer Processor Control Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Processor Control Number</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerProcessorControlNumber()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerProcessorControlNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerCardholderId <em>Other Payer Cardholder Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Cardholder Id</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerCardholderId()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCardholderId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerGroupId <em>Other Payer Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Group Id</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerGroupId()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerGroupId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerPersonCode <em>Other Payer Person Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Person Code</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerPersonCode()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPersonCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerHelpDeskPhoneNumber <em>Other Payer Help Desk Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Help Desk Phone Number</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerHelpDeskPhoneNumber()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerHelpDeskPhoneNumber();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerPatientRelationshipCode <em>Other Payer Patient Relationship Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Payer Patient Relationship Code</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerPatientRelationshipCode()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EAttribute getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPatientRelationshipCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerBenefitEffectiveDate <em>Other Payer Benefit Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Benefit Effective Date</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerBenefitEffectiveDate()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitEffectiveDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerBenefitTerminationDate <em>Other Payer Benefit Termination Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Benefit Termination Date</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment#getOtherPayerBenefitTerminationDate()
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitTerminationDate();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment <em>Response DURPPS Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response DURPPS Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment
	 * @generated
	 */
	EClass getResponseDURPPSSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment#getSegmentIdentification()
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	EAttribute getResponseDURPPSSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDurppsResponseCodeCounter <em>Durpps Response Code Counter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Durpps Response Code Counter</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDurppsResponseCodeCounter()
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	EReference getResponseDURPPSSegment_DurppsResponseCodeCounter();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getReasonForServiceCode <em>Reason For Service Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reason For Service Code</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment#getReasonForServiceCode()
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	EAttribute getResponseDURPPSSegment_ReasonForServiceCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getClinicalSignificanceCode <em>Clinical Significance Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Clinical Significance Code</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment#getClinicalSignificanceCode()
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	EReference getResponseDURPPSSegment_ClinicalSignificanceCode();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getOtherPharmacyIndicator <em>Other Pharmacy Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Pharmacy Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment#getOtherPharmacyIndicator()
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	EAttribute getResponseDURPPSSegment_OtherPharmacyIndicator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getPreviousDateOfFill <em>Previous Date Of Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Previous Date Of Fill</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment#getPreviousDateOfFill()
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	EReference getResponseDURPPSSegment_PreviousDateOfFill();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getQuantityOfPreviousFill <em>Quantity Of Previous Fill</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Quantity Of Previous Fill</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment#getQuantityOfPreviousFill()
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	EReference getResponseDURPPSSegment_QuantityOfPreviousFill();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDatabaseIndicator <em>Database Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Database Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDatabaseIndicator()
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	EReference getResponseDURPPSSegment_DatabaseIndicator();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getOtherPrescriberIndicator <em>Other Prescriber Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Prescriber Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment#getOtherPrescriberIndicator()
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	EAttribute getResponseDURPPSSegment_OtherPrescriberIndicator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDurFreeTextMessage <em>Dur Free Text Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dur Free Text Message</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDurFreeTextMessage()
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	EReference getResponseDURPPSSegment_DurFreeTextMessage();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDurAdditionalText <em>Dur Additional Text</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dur Additional Text</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment#getDurAdditionalText()
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	EReference getResponseDURPPSSegment_DurAdditionalText();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment <em>Response Insurance Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Insurance Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseInsuranceSegment
	 * @generated
	 */
	EClass getResponseInsuranceSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseInsuranceSegment#getSegmentIdentification()
	 * @see #getResponseInsuranceSegment()
	 * @generated
	 */
	EAttribute getResponseInsuranceSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getGroupId <em>Group Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Group Id</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseInsuranceSegment#getGroupId()
	 * @see #getResponseInsuranceSegment()
	 * @generated
	 */
	EReference getResponseInsuranceSegment_GroupId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getPlanId <em>Plan Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan Id</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseInsuranceSegment#getPlanId()
	 * @see #getResponseInsuranceSegment()
	 * @generated
	 */
	EReference getResponseInsuranceSegment_PlanId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getNetworkReimbursementId <em>Network Reimbursement Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Network Reimbursement Id</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseInsuranceSegment#getNetworkReimbursementId()
	 * @see #getResponseInsuranceSegment()
	 * @generated
	 */
	EReference getResponseInsuranceSegment_NetworkReimbursementId();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getPayerIdQualifier <em>Payer Id Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Payer Id Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseInsuranceSegment#getPayerIdQualifier()
	 * @see #getResponseInsuranceSegment()
	 * @generated
	 */
	EAttribute getResponseInsuranceSegment_PayerIdQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getPayerId <em>Payer Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Payer Id</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseInsuranceSegment#getPayerId()
	 * @see #getResponseInsuranceSegment()
	 * @generated
	 */
	EReference getResponseInsuranceSegment_PayerId();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getMedicaidIdNumber <em>Medicaid Id Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medicaid Id Number</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseInsuranceSegment#getMedicaidIdNumber()
	 * @see #getResponseInsuranceSegment()
	 * @generated
	 */
	EReference getResponseInsuranceSegment_MedicaidIdNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getMedicaidAgencyNumber <em>Medicaid Agency Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Medicaid Agency Number</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseInsuranceSegment#getMedicaidAgencyNumber()
	 * @see #getResponseInsuranceSegment()
	 * @generated
	 */
	EReference getResponseInsuranceSegment_MedicaidAgencyNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment#getCardholderId <em>Cardholder Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Cardholder Id</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseInsuranceSegment#getCardholderId()
	 * @see #getResponseInsuranceSegment()
	 * @generated
	 */
	EReference getResponseInsuranceSegment_CardholderId();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ResponseMessageSegment <em>Response Message Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Message Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseMessageSegment
	 * @generated
	 */
	EClass getResponseMessageSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseMessageSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseMessageSegment#getSegmentIdentification()
	 * @see #getResponseMessageSegment()
	 * @generated
	 */
	EAttribute getResponseMessageSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseMessageSegment#getMessage <em>Message</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Message</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseMessageSegment#getMessage()
	 * @see #getResponseMessageSegment()
	 * @generated
	 */
	EReference getResponseMessageSegment_Message();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ResponsePatientSegment <em>Response Patient Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Patient Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePatientSegment
	 * @generated
	 */
	EClass getResponsePatientSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePatientSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePatientSegment#getSegmentIdentification()
	 * @see #getResponsePatientSegment()
	 * @generated
	 */
	EAttribute getResponsePatientSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePatientSegment#getPatientFirstName <em>Patient First Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient First Name</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePatientSegment#getPatientFirstName()
	 * @see #getResponsePatientSegment()
	 * @generated
	 */
	EReference getResponsePatientSegment_PatientFirstName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePatientSegment#getPatientLastName <em>Patient Last Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient Last Name</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePatientSegment#getPatientLastName()
	 * @see #getResponsePatientSegment()
	 * @generated
	 */
	EReference getResponsePatientSegment_PatientLastName();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePatientSegment#getDateOfBirth <em>Date Of Birth</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Date Of Birth</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePatientSegment#getDateOfBirth()
	 * @see #getResponsePatientSegment()
	 * @generated
	 */
	EReference getResponsePatientSegment_DateOfBirth();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ResponsePricingSegment <em>Response Pricing Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Pricing Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment
	 * @generated
	 */
	EClass getResponsePricingSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getSegmentIdentification()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EAttribute getResponsePricingSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPatientPayAmount <em>Patient Pay Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient Pay Amount</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getPatientPayAmount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_PatientPayAmount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getIngredientCostPaid <em>Ingredient Cost Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredient Cost Paid</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getIngredientCostPaid()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_IngredientCostPaid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getDispensingFeePaid <em>Dispensing Fee Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dispensing Fee Paid</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getDispensingFeePaid()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_DispensingFeePaid();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getTaxExemptIndicator <em>Tax Exempt Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Tax Exempt Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getTaxExemptIndicator()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EAttribute getResponsePricingSegment_TaxExemptIndicator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getFlatSalesTaxAmountPaid <em>Flat Sales Tax Amount Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Flat Sales Tax Amount Paid</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getFlatSalesTaxAmountPaid()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_FlatSalesTaxAmountPaid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPercentageSalesTaxAmountPaid <em>Percentage Sales Tax Amount Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Percentage Sales Tax Amount Paid</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getPercentageSalesTaxAmountPaid()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_PercentageSalesTaxAmountPaid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPercentageSalesTaxRatePaid <em>Percentage Sales Tax Rate Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Percentage Sales Tax Rate Paid</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getPercentageSalesTaxRatePaid()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_PercentageSalesTaxRatePaid();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPercentageSalesTaxBasisPaid <em>Percentage Sales Tax Basis Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Percentage Sales Tax Basis Paid</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getPercentageSalesTaxBasisPaid()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EAttribute getResponsePricingSegment_PercentageSalesTaxBasisPaid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getIncentiveAmountPaid <em>Incentive Amount Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Incentive Amount Paid</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getIncentiveAmountPaid()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_IncentiveAmountPaid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getProfessionalServiceFeePaid <em>Professional Service Fee Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Professional Service Fee Paid</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getProfessionalServiceFeePaid()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_ProfessionalServiceFeePaid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherAmountPaidCount <em>Other Amount Paid Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Amount Paid Count</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherAmountPaidCount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_OtherAmountPaidCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherAmountPaidQualifier <em>Other Amount Paid Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Other Amount Paid Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherAmountPaidQualifier()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EAttribute getResponsePricingSegment_OtherAmountPaidQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherAmountPaid <em>Other Amount Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Amount Paid</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherAmountPaid()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_OtherAmountPaid();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherPayerAmountRecognized <em>Other Payer Amount Recognized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Other Payer Amount Recognized</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getOtherPayerAmountRecognized()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_OtherPayerAmountRecognized();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getTotalAmountPaid <em>Total Amount Paid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Total Amount Paid</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getTotalAmountPaid()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_TotalAmountPaid();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfReimbursementDetermination <em>Basis Of Reimbursement Determination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Basis Of Reimbursement Determination</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfReimbursementDetermination()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EAttribute getResponsePricingSegment_BasisOfReimbursementDetermination();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToSalesTax <em>Amount Attributed To Sales Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Attributed To Sales Tax</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToSalesTax()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AmountAttributedToSalesTax();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAccumulatedDeductibleAmount <em>Accumulated Deductible Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Accumulated Deductible Amount</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAccumulatedDeductibleAmount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AccumulatedDeductibleAmount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getRemainingDeductibleAmount <em>Remaining Deductible Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remaining Deductible Amount</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getRemainingDeductibleAmount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_RemainingDeductibleAmount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getRemainingBenefitAmount <em>Remaining Benefit Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Remaining Benefit Amount</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getRemainingBenefitAmount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_RemainingBenefitAmount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAppliedToPeriodicDeductible <em>Amount Applied To Periodic Deductible</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Applied To Periodic Deductible</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAppliedToPeriodicDeductible()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AmountAppliedToPeriodicDeductible();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountOfCopay <em>Amount Of Copay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Of Copay</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountOfCopay()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AmountOfCopay();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountExceedingPeriodicBenefitMaximum <em>Amount Exceeding Periodic Benefit Maximum</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Exceeding Periodic Benefit Maximum</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountExceedingPeriodicBenefitMaximum()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AmountExceedingPeriodicBenefitMaximum();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationdispensingFee <em>Basis Of Calculationdispensing Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Basis Of Calculationdispensing Fee</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationdispensingFee()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EAttribute getResponsePricingSegment_BasisOfCalculationdispensingFee();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationcopay <em>Basis Of Calculationcopay</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Basis Of Calculationcopay</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationcopay()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EAttribute getResponsePricingSegment_BasisOfCalculationcopay();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationflatSalesTax <em>Basis Of Calculationflat Sales Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Basis Of Calculationflat Sales Tax</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationflatSalesTax()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EAttribute getResponsePricingSegment_BasisOfCalculationflatSalesTax();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationpercentageSalesTax <em>Basis Of Calculationpercentage Sales Tax</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Basis Of Calculationpercentage Sales Tax</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationpercentageSalesTax()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EAttribute getResponsePricingSegment_BasisOfCalculationpercentageSalesTax();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProcessorFee <em>Amount Attributed To Processor Fee</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Attributed To Processor Fee</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProcessorFee()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AmountAttributedToProcessorFee();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPatientSalesTaxAmount <em>Patient Sales Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Patient Sales Tax Amount</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getPatientSalesTaxAmount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_PatientSalesTaxAmount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getPlanSalesTaxAmount <em>Plan Sales Tax Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Plan Sales Tax Amount</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getPlanSalesTaxAmount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_PlanSalesTaxAmount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountOfCoinsurance <em>Amount Of Coinsurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Of Coinsurance</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountOfCoinsurance()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AmountOfCoinsurance();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationcoinsurance <em>Basis Of Calculationcoinsurance</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Basis Of Calculationcoinsurance</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getBasisOfCalculationcoinsurance()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EAttribute getResponsePricingSegment_BasisOfCalculationcoinsurance();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBenefitStageCount <em>Benefit Stage Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Benefit Stage Count</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getBenefitStageCount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_BenefitStageCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBenefitStageQualifier <em>Benefit Stage Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Benefit Stage Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getBenefitStageQualifier()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EAttribute getResponsePricingSegment_BenefitStageQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getBenefitStageAmount <em>Benefit Stage Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Benefit Stage Amount</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getBenefitStageAmount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_BenefitStageAmount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getEstimatedGenericSavings <em>Estimated Generic Savings</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Estimated Generic Savings</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getEstimatedGenericSavings()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_EstimatedGenericSavings();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getSpendingAccountAmountRemaining <em>Spending Account Amount Remaining</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Spending Account Amount Remaining</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getSpendingAccountAmountRemaining()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_SpendingAccountAmountRemaining();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getHealthPlanfundedAssistanceAmount <em>Health Planfunded Assistance Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Health Planfunded Assistance Amount</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getHealthPlanfundedAssistanceAmount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_HealthPlanfundedAssistanceAmount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProviderNetworkSelection <em>Amount Attributed To Provider Network Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Attributed To Provider Network Selection</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProviderNetworkSelection()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AmountAttributedToProviderNetworkSelection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProductSelectionbrandDrug <em>Amount Attributed To Product Selectionbrand Drug</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Attributed To Product Selectionbrand Drug</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProductSelectionbrandDrug()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AmountAttributedToProductSelectionbrandDrug();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProductSelectionnonpreferredFormularySelection <em>Amount Attributed To Product Selectionnonpreferred Formulary Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Attributed To Product Selectionnonpreferred Formulary Selection</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProductSelectionnonpreferredFormularySelection()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AmountAttributedToProductSelectionnonpreferredFormularySelection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection <em>Amount Attributed To Product Selectionbrand Nonpreferred Formulary Selection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Attributed To Product Selectionbrand Nonpreferred Formulary Selection</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToProductSelectionbrandNonpreferredFormularySelection()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AmountAttributedToProductSelectionbrandNonpreferredFormularySelection();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToCoverageGap <em>Amount Attributed To Coverage Gap</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Amount Attributed To Coverage Gap</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getAmountAttributedToCoverageGap()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_AmountAttributedToCoverageGap();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getIngredientCostContractedreimbursableAmount <em>Ingredient Cost Contractedreimbursable Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Ingredient Cost Contractedreimbursable Amount</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getIngredientCostContractedreimbursableAmount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_IngredientCostContractedreimbursableAmount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePricingSegment#getDispensingFeeContractedreimbursableAmount <em>Dispensing Fee Contractedreimbursable Amount</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Dispensing Fee Contractedreimbursable Amount</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment#getDispensingFeeContractedreimbursableAmount()
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	EReference getResponsePricingSegment_DispensingFeeContractedreimbursableAmount();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment <em>Response Prior Authorization Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Prior Authorization Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment
	 * @generated
	 */
	EClass getResponsePriorAuthorizationSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getSegmentIdentification()
	 * @see #getResponsePriorAuthorizationSegment()
	 * @generated
	 */
	EAttribute getResponsePriorAuthorizationSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationProcessedDate <em>Prior Authorization Processed Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Authorization Processed Date</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationProcessedDate()
	 * @see #getResponsePriorAuthorizationSegment()
	 * @generated
	 */
	EReference getResponsePriorAuthorizationSegment_PriorAuthorizationProcessedDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationEffectiveDate <em>Prior Authorization Effective Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Authorization Effective Date</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationEffectiveDate()
	 * @see #getResponsePriorAuthorizationSegment()
	 * @generated
	 */
	EReference getResponsePriorAuthorizationSegment_PriorAuthorizationEffectiveDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationExpirationDate <em>Prior Authorization Expiration Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Authorization Expiration Date</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationExpirationDate()
	 * @see #getResponsePriorAuthorizationSegment()
	 * @generated
	 */
	EReference getResponsePriorAuthorizationSegment_PriorAuthorizationExpirationDate();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationQuantity <em>Prior Authorization Quantity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Authorization Quantity</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationQuantity()
	 * @see #getResponsePriorAuthorizationSegment()
	 * @generated
	 */
	EReference getResponsePriorAuthorizationSegment_PriorAuthorizationQuantity();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationDollarsAuthorized <em>Prior Authorization Dollars Authorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Authorization Dollars Authorized</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationDollarsAuthorized()
	 * @see #getResponsePriorAuthorizationSegment()
	 * @generated
	 */
	EReference getResponsePriorAuthorizationSegment_PriorAuthorizationDollarsAuthorized();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationNumberOfRefillsAuthorized <em>Prior Authorization Number Of Refills Authorized</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Authorization Number Of Refills Authorized</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationNumberOfRefillsAuthorized()
	 * @see #getResponsePriorAuthorizationSegment()
	 * @generated
	 */
	EReference getResponsePriorAuthorizationSegment_PriorAuthorizationNumberOfRefillsAuthorized();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationQuantityAccumulated <em>Prior Authorization Quantity Accumulated</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Authorization Quantity Accumulated</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationQuantityAccumulated()
	 * @see #getResponsePriorAuthorizationSegment()
	 * @generated
	 */
	EReference getResponsePriorAuthorizationSegment_PriorAuthorizationQuantityAccumulated();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationNumberassigned <em>Prior Authorization Numberassigned</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Prior Authorization Numberassigned</em>'.
	 * @see org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment#getPriorAuthorizationNumberassigned()
	 * @see #getResponsePriorAuthorizationSegment()
	 * @generated
	 */
	EReference getResponsePriorAuthorizationSegment_PriorAuthorizationNumberassigned();

	/**
	 * Returns the meta object for class '{@link org.ncpdp.uml.telecom.ResponseStatusSegment <em>Response Status Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Response Status Segment</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment
	 * @generated
	 */
	EClass getResponseStatusSegment();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getSegmentIdentification <em>Segment Identification</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Segment Identification</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getSegmentIdentification()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EAttribute getResponseStatusSegment_SegmentIdentification();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getTransactionResponseStatus <em>Transaction Response Status</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Transaction Response Status</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getTransactionResponseStatus()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EAttribute getResponseStatusSegment_TransactionResponseStatus();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getAuthorizationNumber <em>Authorization Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Authorization Number</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getAuthorizationNumber()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EReference getResponseStatusSegment_AuthorizationNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getRejectCount <em>Reject Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reject Count</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getRejectCount()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EReference getResponseStatusSegment_RejectCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getRejectCode <em>Reject Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Reject Code</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getRejectCode()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EAttribute getResponseStatusSegment_RejectCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getRejectFieldOccurrenceIndicator <em>Reject Field Occurrence Indicator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Reject Field Occurrence Indicator</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getRejectFieldOccurrenceIndicator()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EReference getResponseStatusSegment_RejectFieldOccurrenceIndicator();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getApprovedMessageCodeCount <em>Approved Message Code Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approved Message Code Count</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getApprovedMessageCodeCount()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EReference getResponseStatusSegment_ApprovedMessageCodeCount();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getApprovedMessageCode <em>Approved Message Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Approved Message Code</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getApprovedMessageCode()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EReference getResponseStatusSegment_ApprovedMessageCode();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformationCount <em>Additional Message Information Count</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Message Information Count</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformationCount()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EReference getResponseStatusSegment_AdditionalMessageInformationCount();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformationQualifier <em>Additional Message Information Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Additional Message Information Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformationQualifier()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EAttribute getResponseStatusSegment_AdditionalMessageInformationQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformation <em>Additional Message Information</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Additional Message Information</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformation()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EReference getResponseStatusSegment_AdditionalMessageInformation();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformationContinuity <em>Additional Message Information Continuity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Additional Message Information Continuity</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getAdditionalMessageInformationContinuity()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EAttribute getResponseStatusSegment_AdditionalMessageInformationContinuity();

	/**
	 * Returns the meta object for the attribute list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getHelpDeskPhoneNumberQualifier <em>Help Desk Phone Number Qualifier</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute list '<em>Help Desk Phone Number Qualifier</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getHelpDeskPhoneNumberQualifier()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EAttribute getResponseStatusSegment_HelpDeskPhoneNumberQualifier();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getHelpDeskPhoneNumber <em>Help Desk Phone Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Help Desk Phone Number</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getHelpDeskPhoneNumber()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EReference getResponseStatusSegment_HelpDeskPhoneNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getTransactionReferenceNumber <em>Transaction Reference Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Transaction Reference Number</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getTransactionReferenceNumber()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EReference getResponseStatusSegment_TransactionReferenceNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getInternalControlNumber <em>Internal Control Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Internal Control Number</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getInternalControlNumber()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EReference getResponseStatusSegment_InternalControlNumber();

	/**
	 * Returns the meta object for the containment reference list '{@link org.ncpdp.uml.telecom.ResponseStatusSegment#getUrl <em>Url</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Url</em>'.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment#getUrl()
	 * @see #getResponseStatusSegment()
	 * @generated
	 */
	EReference getResponseStatusSegment_Url();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	TelecomFactory getTelecomFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.DocumentRootImpl <em>Document Root</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.DocumentRootImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getDocumentRoot()
		 * @generated
		 */
		EClass DOCUMENT_ROOT = eINSTANCE.getDocumentRoot();

		/**
		 * The meta object literal for the '<em><b>Mixed</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DOCUMENT_ROOT__MIXED = eINSTANCE.getDocumentRoot_Mixed();

		/**
		 * The meta object literal for the '<em><b>XMLNS Prefix Map</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XMLNS_PREFIX_MAP = eINSTANCE.getDocumentRoot_XMLNSPrefixMap();

		/**
		 * The meta object literal for the '<em><b>XSI Schema Location</b></em>' map feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__XSI_SCHEMA_LOCATION = eINSTANCE.getDocumentRoot_XSISchemaLocation();

		/**
		 * The meta object literal for the '<em><b>Transmission</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__TRANSMISSION = eINSTANCE.getDocumentRoot_Transmission();

		/**
		 * The meta object literal for the '<em><b>Response</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DOCUMENT_ROOT__RESPONSE = eINSTANCE.getDocumentRoot_Response();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.TransmissionImpl <em>Transmission</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.TransmissionImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getTransmission()
		 * @generated
		 */
		EClass TRANSMISSION = eINSTANCE.getTransmission();

		/**
		 * The meta object literal for the '<em><b>Transaction Header Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__TRANSACTION_HEADER_SEGMENT = eINSTANCE.getTransmission_TransactionHeaderSegment();

		/**
		 * The meta object literal for the '<em><b>Workers Compensation Segment</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__WORKERS_COMPENSATION_SEGMENT = eINSTANCE.getTransmission_WorkersCompensationSegment();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT = eINSTANCE.getTransmission_PriorAuthorizationSegment();

		/**
		 * The meta object literal for the '<em><b>Pricing Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__PRICING_SEGMENT = eINSTANCE.getTransmission_PricingSegment();

		/**
		 * The meta object literal for the '<em><b>Prescriber Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__PRESCRIBER_SEGMENT = eINSTANCE.getTransmission_PrescriberSegment();

		/**
		 * The meta object literal for the '<em><b>Pharmacy Provider Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__PHARMACY_PROVIDER_SEGMENT = eINSTANCE.getTransmission_PharmacyProviderSegment();

		/**
		 * The meta object literal for the '<em><b>Patient Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__PATIENT_SEGMENT = eINSTANCE.getTransmission_PatientSegment();

		/**
		 * The meta object literal for the '<em><b>Narrative Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__NARRATIVE_SEGMENT = eINSTANCE.getTransmission_NarrativeSegment();

		/**
		 * The meta object literal for the '<em><b>Insurance Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__INSURANCE_SEGMENT = eINSTANCE.getTransmission_InsuranceSegment();

		/**
		 * The meta object literal for the '<em><b>Facility Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__FACILITY_SEGMENT = eINSTANCE.getTransmission_FacilitySegment();

		/**
		 * The meta object literal for the '<em><b>DURPPS Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__DURPPS_SEGMENT = eINSTANCE.getTransmission_DURPPSSegment();

		/**
		 * The meta object literal for the '<em><b>Coupon Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__COUPON_SEGMENT = eINSTANCE.getTransmission_CouponSegment();

		/**
		 * The meta object literal for the '<em><b>Coordinationof Benefits Other Payments Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT = eINSTANCE.getTransmission_CoordinationofBenefitsOtherPaymentsSegment();

		/**
		 * The meta object literal for the '<em><b>Clinical Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__CLINICAL_SEGMENT = eINSTANCE.getTransmission_ClinicalSegment();

		/**
		 * The meta object literal for the '<em><b>Claim Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__CLAIM_SEGMENT = eINSTANCE.getTransmission_ClaimSegment();

		/**
		 * The meta object literal for the '<em><b>Additional Documentation Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT = eINSTANCE.getTransmission_AdditionalDocumentationSegment();

		/**
		 * The meta object literal for the '<em><b>Compound Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSMISSION__COMPOUND_SEGMENT = eINSTANCE.getTransmission_CompoundSegment();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl <em>Transaction Header Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.TransactionHeaderSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getTransactionHeaderSegment()
		 * @generated
		 */
		EClass TRANSACTION_HEADER_SEGMENT = eINSTANCE.getTransactionHeaderSegment();

		/**
		 * The meta object literal for the '<em><b>Assigned Author</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR = eINSTANCE.getTransactionHeaderSegment_AssignedAuthor();

		/**
		 * The meta object literal for the '<em><b>Date Of Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE = eINSTANCE.getTransactionHeaderSegment_DateOfService();

		/**
		 * The meta object literal for the '<em><b>Software Vendorcertification Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID = eINSTANCE.getTransactionHeaderSegment_SoftwareVendorcertificationId();

		/**
		 * The meta object literal for the '<em><b>Transaction Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT = eINSTANCE.getTransactionHeaderSegment_TransactionCount();

		/**
		 * The meta object literal for the '<em><b>Service Provider Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID = eINSTANCE.getTransactionHeaderSegment_ServiceProviderId();

		/**
		 * The meta object literal for the '<em><b>Processor Control Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER = eINSTANCE.getTransactionHeaderSegment_ProcessorControlNumber();

		/**
		 * The meta object literal for the '<em><b>Service Provider Id Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER = eINSTANCE.getTransactionHeaderSegment_ServiceProviderIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Bin Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_HEADER_SEGMENT__BIN_NUMBER = eINSTANCE.getTransactionHeaderSegment_BinNumber();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSACTION_HEADER_SEGMENT__VERSION = eINSTANCE.getTransactionHeaderSegment_Version();

		/**
		 * The meta object literal for the '<em><b>Transaction Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE = eINSTANCE.getTransactionHeaderSegment_TransactionCode();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.FieldImpl <em>Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.FieldImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getField()
		 * @generated
		 */
		EClass FIELD = eINSTANCE.getField();

		/**
		 * The meta object literal for the '<em><b>Field</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__FIELD = eINSTANCE.getField_Field();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FIELD__VALUE = eINSTANCE.getField_Value();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl <em>Workers Compensation Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.WorkersCompensationSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getWorkersCompensationSegment()
		 * @generated
		 */
		EClass WORKERS_COMPENSATION_SEGMENT = eINSTANCE.getWorkersCompensationSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKERS_COMPENSATION_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getWorkersCompensationSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Date Of Injury</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__DATE_OF_INJURY = eINSTANCE.getWorkersCompensationSegment_DateOfInjury();

		/**
		 * The meta object literal for the '<em><b>Employer Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__EMPLOYER_NAME = eINSTANCE.getWorkersCompensationSegment_EmployerName();

		/**
		 * The meta object literal for the '<em><b>Employer Street Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STREET_ADDRESS = eINSTANCE.getWorkersCompensationSegment_EmployerStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Employer City Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CITY_ADDRESS = eINSTANCE.getWorkersCompensationSegment_EmployerCityAddress();

		/**
		 * The meta object literal for the '<em><b>Employer Stateprovince Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STATEPROVINCE_ADDRESS = eINSTANCE.getWorkersCompensationSegment_EmployerStateprovinceAddress();

		/**
		 * The meta object literal for the '<em><b>Employer Zippostal Zone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__EMPLOYER_ZIPPOSTAL_ZONE = eINSTANCE.getWorkersCompensationSegment_EmployerZippostalZone();

		/**
		 * The meta object literal for the '<em><b>Employer Phone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__EMPLOYER_PHONE_NUMBER = eINSTANCE.getWorkersCompensationSegment_EmployerPhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Employer Contact Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CONTACT_NAME = eINSTANCE.getWorkersCompensationSegment_EmployerContactName();

		/**
		 * The meta object literal for the '<em><b>Carrier Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__CARRIER_ID = eINSTANCE.getWorkersCompensationSegment_CarrierId();

		/**
		 * The meta object literal for the '<em><b>Claimreference Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__CLAIMREFERENCE_ID = eINSTANCE.getWorkersCompensationSegment_ClaimreferenceId();

		/**
		 * The meta object literal for the '<em><b>Billing Entity Type Indicator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKERS_COMPENSATION_SEGMENT__BILLING_ENTITY_TYPE_INDICATOR = eINSTANCE.getWorkersCompensationSegment_BillingEntityTypeIndicator();

		/**
		 * The meta object literal for the '<em><b>Pay To Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKERS_COMPENSATION_SEGMENT__PAY_TO_QUALIFIER = eINSTANCE.getWorkersCompensationSegment_PayToQualifier();

		/**
		 * The meta object literal for the '<em><b>Pay To Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__PAY_TO_ID = eINSTANCE.getWorkersCompensationSegment_PayToId();

		/**
		 * The meta object literal for the '<em><b>Pay To Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__PAY_TO_NAME = eINSTANCE.getWorkersCompensationSegment_PayToName();

		/**
		 * The meta object literal for the '<em><b>Pay To Street Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__PAY_TO_STREET_ADDRESS = eINSTANCE.getWorkersCompensationSegment_PayToStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Pay To City Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__PAY_TO_CITY_ADDRESS = eINSTANCE.getWorkersCompensationSegment_PayToCityAddress();

		/**
		 * The meta object literal for the '<em><b>Pay To Stateprovince Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__PAY_TO_STATEPROVINCE_ADDRESS = eINSTANCE.getWorkersCompensationSegment_PayToStateprovinceAddress();

		/**
		 * The meta object literal for the '<em><b>Pay To Zippostal Zone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__PAY_TO_ZIPPOSTAL_ZONE = eINSTANCE.getWorkersCompensationSegment_PayToZippostalZone();

		/**
		 * The meta object literal for the '<em><b>Generic Equivalent Product Id Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID_QUALIFIER = eINSTANCE.getWorkersCompensationSegment_GenericEquivalentProductIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Generic Equivalent Product Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID = eINSTANCE.getWorkersCompensationSegment_GenericEquivalentProductId();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl <em>Prior Authorization Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.PriorAuthorizationSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getPriorAuthorizationSegment()
		 * @generated
		 */
		EClass PRIOR_AUTHORIZATION_SEGMENT = eINSTANCE.getPriorAuthorizationSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getPriorAuthorizationSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Request Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRIOR_AUTHORIZATION_SEGMENT__REQUEST_TYPE = eINSTANCE.getPriorAuthorizationSegment_RequestType();

		/**
		 * The meta object literal for the '<em><b>Request Period Datebegin</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEBEGIN = eINSTANCE.getPriorAuthorizationSegment_RequestPeriodDatebegin();

		/**
		 * The meta object literal for the '<em><b>Request Period Dateend</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEEND = eINSTANCE.getPriorAuthorizationSegment_RequestPeriodDateend();

		/**
		 * The meta object literal for the '<em><b>Basis Of Request</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__BASIS_OF_REQUEST = eINSTANCE.getPriorAuthorizationSegment_BasisOfRequest();

		/**
		 * The meta object literal for the '<em><b>Authorized Representative First Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_FIRST_NAME = eINSTANCE.getPriorAuthorizationSegment_AuthorizedRepresentativeFirstName();

		/**
		 * The meta object literal for the '<em><b>Authorized Representative Last Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_LAST_NAME = eINSTANCE.getPriorAuthorizationSegment_AuthorizedRepresentativeLastName();

		/**
		 * The meta object literal for the '<em><b>Authorized Representative Street Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STREET_ADDRESS = eINSTANCE.getPriorAuthorizationSegment_AuthorizedRepresentativeStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Authorized Representative City Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_CITY_ADDRESS = eINSTANCE.getPriorAuthorizationSegment_AuthorizedRepresentativeCityAddress();

		/**
		 * The meta object literal for the '<em><b>Authorized Representative Stateprovince Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STATEPROVINCE_ADDRESS = eINSTANCE.getPriorAuthorizationSegment_AuthorizedRepresentativeStateprovinceAddress();

		/**
		 * The meta object literal for the '<em><b>Authorized Representative Zippostal Zone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_ZIPPOSTAL_ZONE = eINSTANCE.getPriorAuthorizationSegment_AuthorizedRepresentativeZippostalZone();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Numberassigned</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED = eINSTANCE.getPriorAuthorizationSegment_PriorAuthorizationNumberassigned();

		/**
		 * The meta object literal for the '<em><b>Authorization Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZATION_NUMBER = eINSTANCE.getPriorAuthorizationSegment_AuthorizationNumber();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Supporting Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_SUPPORTING_DOCUMENTATION = eINSTANCE.getPriorAuthorizationSegment_PriorAuthorizationSupportingDocumentation();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.PricingSegmentImpl <em>Pricing Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.PricingSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getPricingSegment()
		 * @generated
		 */
		EClass PRICING_SEGMENT = eINSTANCE.getPricingSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getPricingSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Ingredient Cost Submitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__INGREDIENT_COST_SUBMITTED = eINSTANCE.getPricingSegment_IngredientCostSubmitted();

		/**
		 * The meta object literal for the '<em><b>Dispensing Fee Submitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__DISPENSING_FEE_SUBMITTED = eINSTANCE.getPricingSegment_DispensingFeeSubmitted();

		/**
		 * The meta object literal for the '<em><b>Professional Service Fee Submitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_SUBMITTED = eINSTANCE.getPricingSegment_ProfessionalServiceFeeSubmitted();

		/**
		 * The meta object literal for the '<em><b>Patient Paid Amount Submitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__PATIENT_PAID_AMOUNT_SUBMITTED = eINSTANCE.getPricingSegment_PatientPaidAmountSubmitted();

		/**
		 * The meta object literal for the '<em><b>Incentive Amount Submitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__INCENTIVE_AMOUNT_SUBMITTED = eINSTANCE.getPricingSegment_IncentiveAmountSubmitted();

		/**
		 * The meta object literal for the '<em><b>Other Amount Claimed Submitted Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_COUNT = eINSTANCE.getPricingSegment_OtherAmountClaimedSubmittedCount();

		/**
		 * The meta object literal for the '<em><b>Other Amount Claimed Submitted Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_QUALIFIER = eINSTANCE.getPricingSegment_OtherAmountClaimedSubmittedQualifier();

		/**
		 * The meta object literal for the '<em><b>Other Amount Claimed Submitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED = eINSTANCE.getPricingSegment_OtherAmountClaimedSubmitted();

		/**
		 * The meta object literal for the '<em><b>Flat Sales Tax Amount Submitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_SUBMITTED = eINSTANCE.getPricingSegment_FlatSalesTaxAmountSubmitted();

		/**
		 * The meta object literal for the '<em><b>Percentage Sales Tax Amount Submitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_SUBMITTED = eINSTANCE.getPricingSegment_PercentageSalesTaxAmountSubmitted();

		/**
		 * The meta object literal for the '<em><b>Percentage Sales Tax Rate Submitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_SUBMITTED = eINSTANCE.getPricingSegment_PercentageSalesTaxRateSubmitted();

		/**
		 * The meta object literal for the '<em><b>Percentage Sales Tax Basis Submitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_SUBMITTED = eINSTANCE.getPricingSegment_PercentageSalesTaxBasisSubmitted();

		/**
		 * The meta object literal for the '<em><b>Usual And Customary Charge</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__USUAL_AND_CUSTOMARY_CHARGE = eINSTANCE.getPricingSegment_UsualAndCustomaryCharge();

		/**
		 * The meta object literal for the '<em><b>Gross Amount Due</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__GROSS_AMOUNT_DUE = eINSTANCE.getPricingSegment_GrossAmountDue();

		/**
		 * The meta object literal for the '<em><b>Basis Of Cost Determination</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRICING_SEGMENT__BASIS_OF_COST_DETERMINATION = eINSTANCE.getPricingSegment_BasisOfCostDetermination();

		/**
		 * The meta object literal for the '<em><b>Medicaid Paid Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRICING_SEGMENT__MEDICAID_PAID_AMOUNT = eINSTANCE.getPricingSegment_MedicaidPaidAmount();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl <em>Prescriber Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.PrescriberSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getPrescriberSegment()
		 * @generated
		 */
		EClass PRESCRIBER_SEGMENT = eINSTANCE.getPrescriberSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PRESCRIBER_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getPrescriberSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Prescriber Id Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRESCRIBER_ID_QUALIFIER = eINSTANCE.getPrescriberSegment_PrescriberIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Prescriber Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRESCRIBER_ID = eINSTANCE.getPrescriberSegment_PrescriberId();

		/**
		 * The meta object literal for the '<em><b>Prescriber Last Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRESCRIBER_LAST_NAME = eINSTANCE.getPrescriberSegment_PrescriberLastName();

		/**
		 * The meta object literal for the '<em><b>Prescriber Phone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRESCRIBER_PHONE_NUMBER = eINSTANCE.getPrescriberSegment_PrescriberPhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Primary Care Provider Id Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID_QUALIFIER = eINSTANCE.getPrescriberSegment_PrimaryCareProviderIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Primary Care Provider Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID = eINSTANCE.getPrescriberSegment_PrimaryCareProviderId();

		/**
		 * The meta object literal for the '<em><b>Primary Care Provider Last Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_LAST_NAME = eINSTANCE.getPrescriberSegment_PrimaryCareProviderLastName();

		/**
		 * The meta object literal for the '<em><b>Prescriber First Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRESCRIBER_FIRST_NAME = eINSTANCE.getPrescriberSegment_PrescriberFirstName();

		/**
		 * The meta object literal for the '<em><b>Prescriber Street Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRESCRIBER_STREET_ADDRESS = eINSTANCE.getPrescriberSegment_PrescriberStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Prescriber City Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRESCRIBER_CITY_ADDRESS = eINSTANCE.getPrescriberSegment_PrescriberCityAddress();

		/**
		 * The meta object literal for the '<em><b>Prescriber Stateprovince Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRESCRIBER_STATEPROVINCE_ADDRESS = eINSTANCE.getPrescriberSegment_PrescriberStateprovinceAddress();

		/**
		 * The meta object literal for the '<em><b>Prescriber Zippostal Zone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PRESCRIBER_SEGMENT__PRESCRIBER_ZIPPOSTAL_ZONE = eINSTANCE.getPrescriberSegment_PrescriberZippostalZone();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.PharmacyProviderSegmentImpl <em>Pharmacy Provider Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.PharmacyProviderSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getPharmacyProviderSegment()
		 * @generated
		 */
		EClass PHARMACY_PROVIDER_SEGMENT = eINSTANCE.getPharmacyProviderSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PHARMACY_PROVIDER_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getPharmacyProviderSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Provider Id Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID_QUALIFIER = eINSTANCE.getPharmacyProviderSegment_ProviderIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Provider Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID = eINSTANCE.getPharmacyProviderSegment_ProviderId();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.PatientSegmentImpl <em>Patient Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.PatientSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getPatientSegment()
		 * @generated
		 */
		EClass PATIENT_SEGMENT = eINSTANCE.getPatientSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getPatientSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Patient Id Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_SEGMENT__PATIENT_ID_QUALIFIER = eINSTANCE.getPatientSegment_PatientIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Patient Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__PATIENT_ID = eINSTANCE.getPatientSegment_PatientId();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__DATE_OF_BIRTH = eINSTANCE.getPatientSegment_DateOfBirth();

		/**
		 * The meta object literal for the '<em><b>Patient Gender Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_SEGMENT__PATIENT_GENDER_CODE = eINSTANCE.getPatientSegment_PatientGenderCode();

		/**
		 * The meta object literal for the '<em><b>Patient First Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__PATIENT_FIRST_NAME = eINSTANCE.getPatientSegment_PatientFirstName();

		/**
		 * The meta object literal for the '<em><b>Patient Last Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__PATIENT_LAST_NAME = eINSTANCE.getPatientSegment_PatientLastName();

		/**
		 * The meta object literal for the '<em><b>Patient Street Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__PATIENT_STREET_ADDRESS = eINSTANCE.getPatientSegment_PatientStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Patient City Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__PATIENT_CITY_ADDRESS = eINSTANCE.getPatientSegment_PatientCityAddress();

		/**
		 * The meta object literal for the '<em><b>Patient State Province Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__PATIENT_STATE_PROVINCE_ADDRESS = eINSTANCE.getPatientSegment_PatientStateProvinceAddress();

		/**
		 * The meta object literal for the '<em><b>Patient Zippostal Zone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__PATIENT_ZIPPOSTAL_ZONE = eINSTANCE.getPatientSegment_PatientZippostalZone();

		/**
		 * The meta object literal for the '<em><b>Patient Phone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__PATIENT_PHONE_NUMBER = eINSTANCE.getPatientSegment_PatientPhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Place Of Service</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_SEGMENT__PLACE_OF_SERVICE = eINSTANCE.getPatientSegment_PlaceOfService();

		/**
		 * The meta object literal for the '<em><b>Employer Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__EMPLOYER_ID = eINSTANCE.getPatientSegment_EmployerId();

		/**
		 * The meta object literal for the '<em><b>Smoker Nonsmoker Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__SMOKER_NONSMOKER_CODE = eINSTANCE.getPatientSegment_SmokerNonsmokerCode();

		/**
		 * The meta object literal for the '<em><b>Pregnancy Indicator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_SEGMENT__PREGNANCY_INDICATOR = eINSTANCE.getPatientSegment_PregnancyIndicator();

		/**
		 * The meta object literal for the '<em><b>Patient Email Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PATIENT_SEGMENT__PATIENT_EMAIL_ADDRESS = eINSTANCE.getPatientSegment_PatientEmailAddress();

		/**
		 * The meta object literal for the '<em><b>Patient Residence</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PATIENT_SEGMENT__PATIENT_RESIDENCE = eINSTANCE.getPatientSegment_PatientResidence();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.NarrativeSegmentImpl <em>Narrative Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.NarrativeSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getNarrativeSegment()
		 * @generated
		 */
		EClass NARRATIVE_SEGMENT = eINSTANCE.getNarrativeSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NARRATIVE_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getNarrativeSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Narrative Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference NARRATIVE_SEGMENT__NARRATIVE_MESSAGE = eINSTANCE.getNarrativeSegment_NarrativeMessage();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl <em>Insurance Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.InsuranceSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getInsuranceSegment()
		 * @generated
		 */
		EClass INSURANCE_SEGMENT = eINSTANCE.getInsuranceSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getInsuranceSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Cardholder Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__CARDHOLDER_ID = eINSTANCE.getInsuranceSegment_CardholderId();

		/**
		 * The meta object literal for the '<em><b>Cardholder First Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__CARDHOLDER_FIRST_NAME = eINSTANCE.getInsuranceSegment_CardholderFirstName();

		/**
		 * The meta object literal for the '<em><b>Cardholder Last Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__CARDHOLDER_LAST_NAME = eINSTANCE.getInsuranceSegment_CardholderLastName();

		/**
		 * The meta object literal for the '<em><b>Home Plan</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__HOME_PLAN = eINSTANCE.getInsuranceSegment_HomePlan();

		/**
		 * The meta object literal for the '<em><b>Plan Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__PLAN_ID = eINSTANCE.getInsuranceSegment_PlanId();

		/**
		 * The meta object literal for the '<em><b>Eligibility Clarification Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_SEGMENT__ELIGIBILITY_CLARIFICATION_CODE = eINSTANCE.getInsuranceSegment_EligibilityClarificationCode();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__GROUP_ID = eINSTANCE.getInsuranceSegment_GroupId();

		/**
		 * The meta object literal for the '<em><b>Person Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__PERSON_CODE = eINSTANCE.getInsuranceSegment_PersonCode();

		/**
		 * The meta object literal for the '<em><b>Patient Relationship Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_SEGMENT__PATIENT_RELATIONSHIP_CODE = eINSTANCE.getInsuranceSegment_PatientRelationshipCode();

		/**
		 * The meta object literal for the '<em><b>Other Payer Bin Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__OTHER_PAYER_BIN_NUMBER = eINSTANCE.getInsuranceSegment_OtherPayerBinNumber();

		/**
		 * The meta object literal for the '<em><b>Other Payer Processor Control Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER = eINSTANCE.getInsuranceSegment_OtherPayerProcessorControlNumber();

		/**
		 * The meta object literal for the '<em><b>Other Payer Cardholder Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__OTHER_PAYER_CARDHOLDER_ID = eINSTANCE.getInsuranceSegment_OtherPayerCardholderId();

		/**
		 * The meta object literal for the '<em><b>Other Payer Group Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__OTHER_PAYER_GROUP_ID = eINSTANCE.getInsuranceSegment_OtherPayerGroupId();

		/**
		 * The meta object literal for the '<em><b>Medigap Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__MEDIGAP_ID = eINSTANCE.getInsuranceSegment_MedigapId();

		/**
		 * The meta object literal for the '<em><b>Medicaid Indicator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__MEDICAID_INDICATOR = eINSTANCE.getInsuranceSegment_MedicaidIndicator();

		/**
		 * The meta object literal for the '<em><b>Provider Accept Assignment Indicator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_SEGMENT__PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR = eINSTANCE.getInsuranceSegment_ProviderAcceptAssignmentIndicator();

		/**
		 * The meta object literal for the '<em><b>Cms Part DDefined Qualified Facility</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INSURANCE_SEGMENT__CMS_PART_DDEFINED_QUALIFIED_FACILITY = eINSTANCE.getInsuranceSegment_CmsPartDDefinedQualifiedFacility();

		/**
		 * The meta object literal for the '<em><b>Medicaid Id Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__MEDICAID_ID_NUMBER = eINSTANCE.getInsuranceSegment_MedicaidIdNumber();

		/**
		 * The meta object literal for the '<em><b>Medicaid Agency Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER = eINSTANCE.getInsuranceSegment_MedicaidAgencyNumber();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.FacilitySegmentImpl <em>Facility Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.FacilitySegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getFacilitySegment()
		 * @generated
		 */
		EClass FACILITY_SEGMENT = eINSTANCE.getFacilitySegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FACILITY_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getFacilitySegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Facility Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_SEGMENT__FACILITY_ID = eINSTANCE.getFacilitySegment_FacilityId();

		/**
		 * The meta object literal for the '<em><b>Facility Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_SEGMENT__FACILITY_NAME = eINSTANCE.getFacilitySegment_FacilityName();

		/**
		 * The meta object literal for the '<em><b>Facility Street Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_SEGMENT__FACILITY_STREET_ADDRESS = eINSTANCE.getFacilitySegment_FacilityStreetAddress();

		/**
		 * The meta object literal for the '<em><b>Facility City Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_SEGMENT__FACILITY_CITY_ADDRESS = eINSTANCE.getFacilitySegment_FacilityCityAddress();

		/**
		 * The meta object literal for the '<em><b>Facility Stateprovince Address</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_SEGMENT__FACILITY_STATEPROVINCE_ADDRESS = eINSTANCE.getFacilitySegment_FacilityStateprovinceAddress();

		/**
		 * The meta object literal for the '<em><b>Facility Zippostal Zone</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FACILITY_SEGMENT__FACILITY_ZIPPOSTAL_ZONE = eINSTANCE.getFacilitySegment_FacilityZippostalZone();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl <em>DURPPS Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getDURPPSSegment()
		 * @generated
		 */
		EClass DURPPS_SEGMENT = eINSTANCE.getDURPPSSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURPPS_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getDURPPSSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Durpps Code Counter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURPPS_SEGMENT__DURPPS_CODE_COUNTER = eINSTANCE.getDURPPSSegment_DurppsCodeCounter();

		/**
		 * The meta object literal for the '<em><b>Reason For Service Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE = eINSTANCE.getDURPPSSegment_ReasonForServiceCode();

		/**
		 * The meta object literal for the '<em><b>Professional Service Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURPPS_SEGMENT__PROFESSIONAL_SERVICE_CODE = eINSTANCE.getDURPPSSegment_ProfessionalServiceCode();

		/**
		 * The meta object literal for the '<em><b>Result Of Service Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURPPS_SEGMENT__RESULT_OF_SERVICE_CODE = eINSTANCE.getDURPPSSegment_ResultOfServiceCode();

		/**
		 * The meta object literal for the '<em><b>Durpps Level Of Effort</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURPPS_SEGMENT__DURPPS_LEVEL_OF_EFFORT = eINSTANCE.getDURPPSSegment_DurppsLevelOfEffort();

		/**
		 * The meta object literal for the '<em><b>Dur Coagent Id Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DURPPS_SEGMENT__DUR_COAGENT_ID_QUALIFIER = eINSTANCE.getDURPPSSegment_DurCoagentIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Dur Coagent Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DURPPS_SEGMENT__DUR_COAGENT_ID = eINSTANCE.getDURPPSSegment_DurCoagentId();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.CouponSegmentImpl <em>Coupon Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.CouponSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getCouponSegment()
		 * @generated
		 */
		EClass COUPON_SEGMENT = eINSTANCE.getCouponSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPON_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getCouponSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Coupon Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COUPON_SEGMENT__COUPON_TYPE = eINSTANCE.getCouponSegment_CouponType();

		/**
		 * The meta object literal for the '<em><b>Coupon Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPON_SEGMENT__COUPON_NUMBER = eINSTANCE.getCouponSegment_CouponNumber();

		/**
		 * The meta object literal for the '<em><b>Coupon Value Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COUPON_SEGMENT__COUPON_VALUE_AMOUNT = eINSTANCE.getCouponSegment_CouponValueAmount();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl <em>Coordinationof Benefits Other Payments Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.CoordinationofBenefitsOtherPaymentsSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getCoordinationofBenefitsOtherPaymentsSegment()
		 * @generated
		 */
		EClass COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Coordination Of Benefitsother Payments Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__COORDINATION_OF_BENEFITSOTHER_PAYMENTS_COUNT = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_CoordinationOfBenefitsotherPaymentsCount();

		/**
		 * The meta object literal for the '<em><b>Other Payer Coverage Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerCoverageType();

		/**
		 * The meta object literal for the '<em><b>Other Payer Id Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID_QUALIFIER = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Other Payer Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerId();

		/**
		 * The meta object literal for the '<em><b>Other Payer Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_DATE = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerDate();

		/**
		 * The meta object literal for the '<em><b>Internal Control Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__INTERNAL_CONTROL_NUMBER = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_InternalControlNumber();

		/**
		 * The meta object literal for the '<em><b>Other Payer Amount Paid Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_COUNT = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidCount();

		/**
		 * The meta object literal for the '<em><b>Other Payer Amount Paid Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_QUALIFIER = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidQualifier();

		/**
		 * The meta object literal for the '<em><b>Other Payer Amount Paid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaid();

		/**
		 * The meta object literal for the '<em><b>Other Payer Reject Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_COUNT = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCount();

		/**
		 * The meta object literal for the '<em><b>Other Payer Reject Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_CODE = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCode();

		/**
		 * The meta object literal for the '<em><b>Other Payerpatient Responsibility Amount Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_COUNT = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountCount();

		/**
		 * The meta object literal for the '<em><b>Other Payerpatient Responsibility Amount Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_QUALIFIER = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountQualifier();

		/**
		 * The meta object literal for the '<em><b>Other Payerpatient Responsibility Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmount();

		/**
		 * The meta object literal for the '<em><b>Benefit Stage Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_COUNT = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageCount();

		/**
		 * The meta object literal for the '<em><b>Benefit Stage Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_QUALIFIER = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageQualifier();

		/**
		 * The meta object literal for the '<em><b>Benefit Stage Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_AMOUNT = eINSTANCE.getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageAmount();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl <em>Clinical Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getClinicalSegment()
		 * @generated
		 */
		EClass CLINICAL_SEGMENT = eINSTANCE.getClinicalSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getClinicalSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Diagnosis Code Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLINICAL_SEGMENT__DIAGNOSIS_CODE_COUNT = eINSTANCE.getClinicalSegment_DiagnosisCodeCount();

		/**
		 * The meta object literal for the '<em><b>Diagnosis Code Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLINICAL_SEGMENT__DIAGNOSIS_CODE_QUALIFIER = eINSTANCE.getClinicalSegment_DiagnosisCodeQualifier();

		/**
		 * The meta object literal for the '<em><b>Diagnosis Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLINICAL_SEGMENT__DIAGNOSIS_CODE = eINSTANCE.getClinicalSegment_DiagnosisCode();

		/**
		 * The meta object literal for the '<em><b>Clinical Information Counter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLINICAL_SEGMENT__CLINICAL_INFORMATION_COUNTER = eINSTANCE.getClinicalSegment_ClinicalInformationCounter();

		/**
		 * The meta object literal for the '<em><b>Measurement Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLINICAL_SEGMENT__MEASUREMENT_DATE = eINSTANCE.getClinicalSegment_MeasurementDate();

		/**
		 * The meta object literal for the '<em><b>Measurement Time</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLINICAL_SEGMENT__MEASUREMENT_TIME = eINSTANCE.getClinicalSegment_MeasurementTime();

		/**
		 * The meta object literal for the '<em><b>Measurement Dimension</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_SEGMENT__MEASUREMENT_DIMENSION = eINSTANCE.getClinicalSegment_MeasurementDimension();

		/**
		 * The meta object literal for the '<em><b>Measurement Unit</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLINICAL_SEGMENT__MEASUREMENT_UNIT = eINSTANCE.getClinicalSegment_MeasurementUnit();

		/**
		 * The meta object literal for the '<em><b>Measurement Value</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLINICAL_SEGMENT__MEASUREMENT_VALUE = eINSTANCE.getClinicalSegment_MeasurementValue();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl <em>Claim Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ClaimSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getClaimSegment()
		 * @generated
		 */
		EClass CLAIM_SEGMENT = eINSTANCE.getClaimSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getClaimSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Prescriptionservice Reference Number Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER = eINSTANCE.getClaimSegment_PrescriptionserviceReferenceNumberQualifier();

		/**
		 * The meta object literal for the '<em><b>Prescriptionservice Reference Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER = eINSTANCE.getClaimSegment_PrescriptionserviceReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Productservice Id Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__PRODUCTSERVICE_ID_QUALIFIER = eINSTANCE.getClaimSegment_ProductserviceIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Productservice Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__PRODUCTSERVICE_ID = eINSTANCE.getClaimSegment_ProductserviceId();

		/**
		 * The meta object literal for the '<em><b>Associated Prescriptionservice Reference Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_REFERENCE_NUMBER = eINSTANCE.getClaimSegment_AssociatedPrescriptionserviceReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Associated Prescriptionservice Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_DATE = eINSTANCE.getClaimSegment_AssociatedPrescriptionserviceDate();

		/**
		 * The meta object literal for the '<em><b>Procedure Modifier Code Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE_COUNT = eINSTANCE.getClaimSegment_ProcedureModifierCodeCount();

		/**
		 * The meta object literal for the '<em><b>Procedure Modifier Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE = eINSTANCE.getClaimSegment_ProcedureModifierCode();

		/**
		 * The meta object literal for the '<em><b>Quantity Dispensed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__QUANTITY_DISPENSED = eINSTANCE.getClaimSegment_QuantityDispensed();

		/**
		 * The meta object literal for the '<em><b>Fill Number</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__FILL_NUMBER = eINSTANCE.getClaimSegment_FillNumber();

		/**
		 * The meta object literal for the '<em><b>Days Supply</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__DAYS_SUPPLY = eINSTANCE.getClaimSegment_DaysSupply();

		/**
		 * The meta object literal for the '<em><b>Compound Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__COMPOUND_CODE = eINSTANCE.getClaimSegment_CompoundCode();

		/**
		 * The meta object literal for the '<em><b>Dispense As Writtendawproduct Selection Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__DISPENSE_AS_WRITTENDAWPRODUCT_SELECTION_CODE = eINSTANCE.getClaimSegment_DispenseAsWrittendawproductSelectionCode();

		/**
		 * The meta object literal for the '<em><b>Date Prescription Written</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__DATE_PRESCRIPTION_WRITTEN = eINSTANCE.getClaimSegment_DatePrescriptionWritten();

		/**
		 * The meta object literal for the '<em><b>Number Of Refills Authorized</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__NUMBER_OF_REFILLS_AUTHORIZED = eINSTANCE.getClaimSegment_NumberOfRefillsAuthorized();

		/**
		 * The meta object literal for the '<em><b>Prescription Origin Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__PRESCRIPTION_ORIGIN_CODE = eINSTANCE.getClaimSegment_PrescriptionOriginCode();

		/**
		 * The meta object literal for the '<em><b>Submission Clarification Code Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE_COUNT = eINSTANCE.getClaimSegment_SubmissionClarificationCodeCount();

		/**
		 * The meta object literal for the '<em><b>Submission Clarification Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE = eINSTANCE.getClaimSegment_SubmissionClarificationCode();

		/**
		 * The meta object literal for the '<em><b>Quantity Prescribed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__QUANTITY_PRESCRIBED = eINSTANCE.getClaimSegment_QuantityPrescribed();

		/**
		 * The meta object literal for the '<em><b>Other Coverage Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__OTHER_COVERAGE_CODE = eINSTANCE.getClaimSegment_OtherCoverageCode();

		/**
		 * The meta object literal for the '<em><b>Special Packaging Indicator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__SPECIAL_PACKAGING_INDICATOR = eINSTANCE.getClaimSegment_SpecialPackagingIndicator();

		/**
		 * The meta object literal for the '<em><b>Originally Prescribed Productservice Id Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_ID_QUALIFIER = eINSTANCE.getClaimSegment_OriginallyPrescribedProductserviceIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Originally Prescribed Productservice Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_CODE = eINSTANCE.getClaimSegment_OriginallyPrescribedProductserviceCode();

		/**
		 * The meta object literal for the '<em><b>Originally Prescribed Quantity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_QUANTITY = eINSTANCE.getClaimSegment_OriginallyPrescribedQuantity();

		/**
		 * The meta object literal for the '<em><b>Alternate Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__ALTERNATE_ID = eINSTANCE.getClaimSegment_AlternateId();

		/**
		 * The meta object literal for the '<em><b>Scheduled Prescription Id Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__SCHEDULED_PRESCRIPTION_ID_NUMBER = eINSTANCE.getClaimSegment_ScheduledPrescriptionIdNumber();

		/**
		 * The meta object literal for the '<em><b>Unit Of Measure</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__UNIT_OF_MEASURE = eINSTANCE.getClaimSegment_UnitOfMeasure();

		/**
		 * The meta object literal for the '<em><b>Level Of Service</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__LEVEL_OF_SERVICE = eINSTANCE.getClaimSegment_LevelOfService();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Type Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__PRIOR_AUTHORIZATION_TYPE_CODE = eINSTANCE.getClaimSegment_PriorAuthorizationTypeCode();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Number Submitted</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_SUBMITTED = eINSTANCE.getClaimSegment_PriorAuthorizationNumberSubmitted();

		/**
		 * The meta object literal for the '<em><b>Intermediary Authorization Type Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_TYPE_ID = eINSTANCE.getClaimSegment_IntermediaryAuthorizationTypeId();

		/**
		 * The meta object literal for the '<em><b>Intermediary Authorization Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_ID = eINSTANCE.getClaimSegment_IntermediaryAuthorizationId();

		/**
		 * The meta object literal for the '<em><b>Dispensing Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__DISPENSING_STATUS = eINSTANCE.getClaimSegment_DispensingStatus();

		/**
		 * The meta object literal for the '<em><b>Quantity Intended To Be Dispensed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__QUANTITY_INTENDED_TO_BE_DISPENSED = eINSTANCE.getClaimSegment_QuantityIntendedToBeDispensed();

		/**
		 * The meta object literal for the '<em><b>Days Supply Intended To Be Dispensed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__DAYS_SUPPLY_INTENDED_TO_BE_DISPENSED = eINSTANCE.getClaimSegment_DaysSupplyIntendedToBeDispensed();

		/**
		 * The meta object literal for the '<em><b>Delay Reason Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__DELAY_REASON_CODE = eINSTANCE.getClaimSegment_DelayReasonCode();

		/**
		 * The meta object literal for the '<em><b>Transaction Reference Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__TRANSACTION_REFERENCE_NUMBER = eINSTANCE.getClaimSegment_TransactionReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Patient Assignment Indicatordirect Member Reimbursement Indicator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__PATIENT_ASSIGNMENT_INDICATORDIRECT_MEMBER_REIMBURSEMENT_INDICATOR = eINSTANCE.getClaimSegment_PatientAssignmentIndicatordirectMemberReimbursementIndicator();

		/**
		 * The meta object literal for the '<em><b>Route Of Administration</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__ROUTE_OF_ADMINISTRATION = eINSTANCE.getClaimSegment_RouteOfAdministration();

		/**
		 * The meta object literal for the '<em><b>Compound Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__COMPOUND_TYPE = eINSTANCE.getClaimSegment_CompoundType();

		/**
		 * The meta object literal for the '<em><b>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN = eINSTANCE.getClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn();

		/**
		 * The meta object literal for the '<em><b>Pharmacy Service Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CLAIM_SEGMENT__PHARMACY_SERVICE_TYPE = eINSTANCE.getClaimSegment_PharmacyServiceType();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl <em>Additional Documentation Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.AdditionalDocumentationSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getAdditionalDocumentationSegment()
		 * @generated
		 */
		EClass ADDITIONAL_DOCUMENTATION_SEGMENT = eINSTANCE.getAdditionalDocumentationSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_DOCUMENTATION_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getAdditionalDocumentationSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Additional Documentation Type Id</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_DOCUMENTATION_SEGMENT__ADDITIONAL_DOCUMENTATION_TYPE_ID = eINSTANCE.getAdditionalDocumentationSegment_AdditionalDocumentationTypeId();

		/**
		 * The meta object literal for the '<em><b>Request Period Begin Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_BEGIN_DATE = eINSTANCE.getAdditionalDocumentationSegment_RequestPeriodBeginDate();

		/**
		 * The meta object literal for the '<em><b>Request Period Recertrevised Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_RECERTREVISED_DATE = eINSTANCE.getAdditionalDocumentationSegment_RequestPeriodRecertrevisedDate();

		/**
		 * The meta object literal for the '<em><b>Request Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_STATUS = eINSTANCE.getAdditionalDocumentationSegment_RequestStatus();

		/**
		 * The meta object literal for the '<em><b>Length Of Need Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED_QUALIFIER = eINSTANCE.getAdditionalDocumentationSegment_LengthOfNeedQualifier();

		/**
		 * The meta object literal for the '<em><b>Length Of Need</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED = eINSTANCE.getAdditionalDocumentationSegment_LengthOfNeed();

		/**
		 * The meta object literal for the '<em><b>Prescribersupplier Date Signed</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__PRESCRIBERSUPPLIER_DATE_SIGNED = eINSTANCE.getAdditionalDocumentationSegment_PrescribersupplierDateSigned();

		/**
		 * The meta object literal for the '<em><b>Supporting Documentation</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__SUPPORTING_DOCUMENTATION = eINSTANCE.getAdditionalDocumentationSegment_SupportingDocumentation();

		/**
		 * The meta object literal for the '<em><b>Question Numberletter Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER_COUNT = eINSTANCE.getAdditionalDocumentationSegment_QuestionNumberletterCount();

		/**
		 * The meta object literal for the '<em><b>Question Numberletter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER = eINSTANCE.getAdditionalDocumentationSegment_QuestionNumberletter();

		/**
		 * The meta object literal for the '<em><b>Question Percent Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_PERCENT_RESPONSE = eINSTANCE.getAdditionalDocumentationSegment_QuestionPercentResponse();

		/**
		 * The meta object literal for the '<em><b>Question Date Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DATE_RESPONSE = eINSTANCE.getAdditionalDocumentationSegment_QuestionDateResponse();

		/**
		 * The meta object literal for the '<em><b>Question Dollar Amount Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DOLLAR_AMOUNT_RESPONSE = eINSTANCE.getAdditionalDocumentationSegment_QuestionDollarAmountResponse();

		/**
		 * The meta object literal for the '<em><b>Question Numeric Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMERIC_RESPONSE = eINSTANCE.getAdditionalDocumentationSegment_QuestionNumericResponse();

		/**
		 * The meta object literal for the '<em><b>Question Alphanumeric Response</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_ALPHANUMERIC_RESPONSE = eINSTANCE.getAdditionalDocumentationSegment_QuestionAlphanumericResponse();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl <em>Compound Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.CompoundSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getCompoundSegment()
		 * @generated
		 */
		EClass COMPOUND_SEGMENT = eINSTANCE.getCompoundSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getCompoundSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Compound Dosage Form Description Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_SEGMENT__COMPOUND_DOSAGE_FORM_DESCRIPTION_CODE = eINSTANCE.getCompoundSegment_CompoundDosageFormDescriptionCode();

		/**
		 * The meta object literal for the '<em><b>Compound Dispensing Unit Form Indicator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_SEGMENT__COMPOUND_DISPENSING_UNIT_FORM_INDICATOR = eINSTANCE.getCompoundSegment_CompoundDispensingUnitFormIndicator();

		/**
		 * The meta object literal for the '<em><b>Compound Ingredient Component Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_SEGMENT__COMPOUND_INGREDIENT_COMPONENT_COUNT = eINSTANCE.getCompoundSegment_CompoundIngredientComponentCount();

		/**
		 * The meta object literal for the '<em><b>Compound Product Id Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID_QUALIFIER = eINSTANCE.getCompoundSegment_CompoundProductIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Compound Product Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID = eINSTANCE.getCompoundSegment_CompoundProductId();

		/**
		 * The meta object literal for the '<em><b>Compound Ingredient Quantity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_SEGMENT__COMPOUND_INGREDIENT_QUANTITY = eINSTANCE.getCompoundSegment_CompoundIngredientQuantity();

		/**
		 * The meta object literal for the '<em><b>Compound Ingredient Drug Cost</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_SEGMENT__COMPOUND_INGREDIENT_DRUG_COST = eINSTANCE.getCompoundSegment_CompoundIngredientDrugCost();

		/**
		 * The meta object literal for the '<em><b>Compound Ingredient Basis Of Cost Determination</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_SEGMENT__COMPOUND_INGREDIENT_BASIS_OF_COST_DETERMINATION = eINSTANCE.getCompoundSegment_CompoundIngredientBasisOfCostDetermination();

		/**
		 * The meta object literal for the '<em><b>Compound Ingredient Modifier Code Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE_COUNT = eINSTANCE.getCompoundSegment_CompoundIngredientModifierCodeCount();

		/**
		 * The meta object literal for the '<em><b>Compound Ingredient Modifier Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE = eINSTANCE.getCompoundSegment_CompoundIngredientModifierCode();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ResponseImpl <em>Response</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ResponseImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponse()
		 * @generated
		 */
		EClass RESPONSE = eINSTANCE.getResponse();

		/**
		 * The meta object literal for the '<em><b>Response Header Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE_HEADER_SEGMENT = eINSTANCE.getResponse_ResponseHeaderSegment();

		/**
		 * The meta object literal for the '<em><b>Response Claim Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE_CLAIM_SEGMENT = eINSTANCE.getResponse_ResponseClaimSegment();

		/**
		 * The meta object literal for the '<em><b>Response Coordinationof Benefits Other Payers Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT = eINSTANCE.getResponse_ResponseCoordinationofBenefitsOtherPayersSegment();

		/**
		 * The meta object literal for the '<em><b>Response DURPPS Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE_DURPPS_SEGMENT = eINSTANCE.getResponse_ResponseDURPPSSegment();

		/**
		 * The meta object literal for the '<em><b>Response Insurance Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE_INSURANCE_SEGMENT = eINSTANCE.getResponse_ResponseInsuranceSegment();

		/**
		 * The meta object literal for the '<em><b>Response Message Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE_MESSAGE_SEGMENT = eINSTANCE.getResponse_ResponseMessageSegment();

		/**
		 * The meta object literal for the '<em><b>Response Patient Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE_PATIENT_SEGMENT = eINSTANCE.getResponse_ResponsePatientSegment();

		/**
		 * The meta object literal for the '<em><b>Response Pricing Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE_PRICING_SEGMENT = eINSTANCE.getResponse_ResponsePricingSegment();

		/**
		 * The meta object literal for the '<em><b>Response Prior Authorization Segment</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT = eINSTANCE.getResponse_ResponsePriorAuthorizationSegment();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ResponseHeaderSegmentImpl <em>Response Header Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ResponseHeaderSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseHeaderSegment()
		 * @generated
		 */
		EClass RESPONSE_HEADER_SEGMENT = eINSTANCE.getResponseHeaderSegment();

		/**
		 * The meta object literal for the '<em><b>Versionrelease Number</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER = eINSTANCE.getResponseHeaderSegment_VersionreleaseNumber();

		/**
		 * The meta object literal for the '<em><b>Transaction Code</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_HEADER_SEGMENT__TRANSACTION_CODE = eINSTANCE.getResponseHeaderSegment_TransactionCode();

		/**
		 * The meta object literal for the '<em><b>Transaction Count</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_HEADER_SEGMENT__TRANSACTION_COUNT = eINSTANCE.getResponseHeaderSegment_TransactionCount();

		/**
		 * The meta object literal for the '<em><b>Header Response Status</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS = eINSTANCE.getResponseHeaderSegment_HeaderResponseStatus();

		/**
		 * The meta object literal for the '<em><b>Service Provider Id Qualifier</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER = eINSTANCE.getResponseHeaderSegment_ServiceProviderIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Service Provider Id</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID = eINSTANCE.getResponseHeaderSegment_ServiceProviderId();

		/**
		 * The meta object literal for the '<em><b>Date Of Service</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE = eINSTANCE.getResponseHeaderSegment_DateOfService();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl <em>Response Claim Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ResponseClaimSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseClaimSegment()
		 * @generated
		 */
		EClass RESPONSE_CLAIM_SEGMENT = eINSTANCE.getResponseClaimSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_CLAIM_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getResponseClaimSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Prescriptionservice Reference Number Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER = eINSTANCE.getResponseClaimSegment_PrescriptionserviceReferenceNumberQualifier();

		/**
		 * The meta object literal for the '<em><b>Prescriptionservice Reference Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER = eINSTANCE.getResponseClaimSegment_PrescriptionserviceReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Preferred Product Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COUNT = eINSTANCE.getResponseClaimSegment_PreferredProductCount();

		/**
		 * The meta object literal for the '<em><b>Preferred Product Id Qualifier</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID_QUALIFIER = eINSTANCE.getResponseClaimSegment_PreferredProductIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Preferred Product Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID = eINSTANCE.getResponseClaimSegment_PreferredProductId();

		/**
		 * The meta object literal for the '<em><b>Preferred Product Incentive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_INCENTIVE = eINSTANCE.getResponseClaimSegment_PreferredProductIncentive();

		/**
		 * The meta object literal for the '<em><b>Preferred Product Cost Share Incentive</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COST_SHARE_INCENTIVE = eINSTANCE.getResponseClaimSegment_PreferredProductCostShareIncentive();

		/**
		 * The meta object literal for the '<em><b>Preferred Product Description</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_DESCRIPTION = eINSTANCE.getResponseClaimSegment_PreferredProductDescription();

		/**
		 * The meta object literal for the '<em><b>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN = eINSTANCE.getResponseClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl <em>Response Coordinationof Benefits Other Payers Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ResponseCoordinationofBenefitsOtherPayersSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseCoordinationofBenefitsOtherPayersSegment()
		 * @generated
		 */
		EClass RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Other Payer Id Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_COUNT = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdCount();

		/**
		 * The meta object literal for the '<em><b>Other Payer Coverage Type</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCoverageType();

		/**
		 * The meta object literal for the '<em><b>Other Payer Id Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_QUALIFIER = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Other Payer Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerId();

		/**
		 * The meta object literal for the '<em><b>Other Payer Processor Control Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerProcessorControlNumber();

		/**
		 * The meta object literal for the '<em><b>Other Payer Cardholder Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_CARDHOLDER_ID = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCardholderId();

		/**
		 * The meta object literal for the '<em><b>Other Payer Group Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_GROUP_ID = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerGroupId();

		/**
		 * The meta object literal for the '<em><b>Other Payer Person Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PERSON_CODE = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPersonCode();

		/**
		 * The meta object literal for the '<em><b>Other Payer Help Desk Phone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_HELP_DESK_PHONE_NUMBER = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerHelpDeskPhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Other Payer Patient Relationship Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PATIENT_RELATIONSHIP_CODE = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPatientRelationshipCode();

		/**
		 * The meta object literal for the '<em><b>Other Payer Benefit Effective Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_EFFECTIVE_DATE = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitEffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Other Payer Benefit Termination Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_TERMINATION_DATE = eINSTANCE.getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitTerminationDate();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl <em>Response DURPPS Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ResponseDURPPSSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseDURPPSSegment()
		 * @generated
		 */
		EClass RESPONSE_DURPPS_SEGMENT = eINSTANCE.getResponseDURPPSSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_DURPPS_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getResponseDURPPSSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Durpps Response Code Counter</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DURPPS_SEGMENT__DURPPS_RESPONSE_CODE_COUNTER = eINSTANCE.getResponseDURPPSSegment_DurppsResponseCodeCounter();

		/**
		 * The meta object literal for the '<em><b>Reason For Service Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE = eINSTANCE.getResponseDURPPSSegment_ReasonForServiceCode();

		/**
		 * The meta object literal for the '<em><b>Clinical Significance Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DURPPS_SEGMENT__CLINICAL_SIGNIFICANCE_CODE = eINSTANCE.getResponseDURPPSSegment_ClinicalSignificanceCode();

		/**
		 * The meta object literal for the '<em><b>Other Pharmacy Indicator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_DURPPS_SEGMENT__OTHER_PHARMACY_INDICATOR = eINSTANCE.getResponseDURPPSSegment_OtherPharmacyIndicator();

		/**
		 * The meta object literal for the '<em><b>Previous Date Of Fill</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DURPPS_SEGMENT__PREVIOUS_DATE_OF_FILL = eINSTANCE.getResponseDURPPSSegment_PreviousDateOfFill();

		/**
		 * The meta object literal for the '<em><b>Quantity Of Previous Fill</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DURPPS_SEGMENT__QUANTITY_OF_PREVIOUS_FILL = eINSTANCE.getResponseDURPPSSegment_QuantityOfPreviousFill();

		/**
		 * The meta object literal for the '<em><b>Database Indicator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DURPPS_SEGMENT__DATABASE_INDICATOR = eINSTANCE.getResponseDURPPSSegment_DatabaseIndicator();

		/**
		 * The meta object literal for the '<em><b>Other Prescriber Indicator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_DURPPS_SEGMENT__OTHER_PRESCRIBER_INDICATOR = eINSTANCE.getResponseDURPPSSegment_OtherPrescriberIndicator();

		/**
		 * The meta object literal for the '<em><b>Dur Free Text Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DURPPS_SEGMENT__DUR_FREE_TEXT_MESSAGE = eINSTANCE.getResponseDURPPSSegment_DurFreeTextMessage();

		/**
		 * The meta object literal for the '<em><b>Dur Additional Text</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_DURPPS_SEGMENT__DUR_ADDITIONAL_TEXT = eINSTANCE.getResponseDURPPSSegment_DurAdditionalText();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl <em>Response Insurance Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ResponseInsuranceSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseInsuranceSegment()
		 * @generated
		 */
		EClass RESPONSE_INSURANCE_SEGMENT = eINSTANCE.getResponseInsuranceSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getResponseInsuranceSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Group Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_INSURANCE_SEGMENT__GROUP_ID = eINSTANCE.getResponseInsuranceSegment_GroupId();

		/**
		 * The meta object literal for the '<em><b>Plan Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_INSURANCE_SEGMENT__PLAN_ID = eINSTANCE.getResponseInsuranceSegment_PlanId();

		/**
		 * The meta object literal for the '<em><b>Network Reimbursement Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_INSURANCE_SEGMENT__NETWORK_REIMBURSEMENT_ID = eINSTANCE.getResponseInsuranceSegment_NetworkReimbursementId();

		/**
		 * The meta object literal for the '<em><b>Payer Id Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_INSURANCE_SEGMENT__PAYER_ID_QUALIFIER = eINSTANCE.getResponseInsuranceSegment_PayerIdQualifier();

		/**
		 * The meta object literal for the '<em><b>Payer Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_INSURANCE_SEGMENT__PAYER_ID = eINSTANCE.getResponseInsuranceSegment_PayerId();

		/**
		 * The meta object literal for the '<em><b>Medicaid Id Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_INSURANCE_SEGMENT__MEDICAID_ID_NUMBER = eINSTANCE.getResponseInsuranceSegment_MedicaidIdNumber();

		/**
		 * The meta object literal for the '<em><b>Medicaid Agency Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER = eINSTANCE.getResponseInsuranceSegment_MedicaidAgencyNumber();

		/**
		 * The meta object literal for the '<em><b>Cardholder Id</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_INSURANCE_SEGMENT__CARDHOLDER_ID = eINSTANCE.getResponseInsuranceSegment_CardholderId();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ResponseMessageSegmentImpl <em>Response Message Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ResponseMessageSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseMessageSegment()
		 * @generated
		 */
		EClass RESPONSE_MESSAGE_SEGMENT = eINSTANCE.getResponseMessageSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_MESSAGE_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getResponseMessageSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Message</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_MESSAGE_SEGMENT__MESSAGE = eINSTANCE.getResponseMessageSegment_Message();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ResponsePatientSegmentImpl <em>Response Patient Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ResponsePatientSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponsePatientSegment()
		 * @generated
		 */
		EClass RESPONSE_PATIENT_SEGMENT = eINSTANCE.getResponsePatientSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PATIENT_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getResponsePatientSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Patient First Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PATIENT_SEGMENT__PATIENT_FIRST_NAME = eINSTANCE.getResponsePatientSegment_PatientFirstName();

		/**
		 * The meta object literal for the '<em><b>Patient Last Name</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PATIENT_SEGMENT__PATIENT_LAST_NAME = eINSTANCE.getResponsePatientSegment_PatientLastName();

		/**
		 * The meta object literal for the '<em><b>Date Of Birth</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PATIENT_SEGMENT__DATE_OF_BIRTH = eINSTANCE.getResponsePatientSegment_DateOfBirth();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl <em>Response Pricing Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ResponsePricingSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponsePricingSegment()
		 * @generated
		 */
		EClass RESPONSE_PRICING_SEGMENT = eINSTANCE.getResponsePricingSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRICING_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getResponsePricingSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Patient Pay Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__PATIENT_PAY_AMOUNT = eINSTANCE.getResponsePricingSegment_PatientPayAmount();

		/**
		 * The meta object literal for the '<em><b>Ingredient Cost Paid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_PAID = eINSTANCE.getResponsePricingSegment_IngredientCostPaid();

		/**
		 * The meta object literal for the '<em><b>Dispensing Fee Paid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_PAID = eINSTANCE.getResponsePricingSegment_DispensingFeePaid();

		/**
		 * The meta object literal for the '<em><b>Tax Exempt Indicator</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRICING_SEGMENT__TAX_EXEMPT_INDICATOR = eINSTANCE.getResponsePricingSegment_TaxExemptIndicator();

		/**
		 * The meta object literal for the '<em><b>Flat Sales Tax Amount Paid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_PAID = eINSTANCE.getResponsePricingSegment_FlatSalesTaxAmountPaid();

		/**
		 * The meta object literal for the '<em><b>Percentage Sales Tax Amount Paid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_PAID = eINSTANCE.getResponsePricingSegment_PercentageSalesTaxAmountPaid();

		/**
		 * The meta object literal for the '<em><b>Percentage Sales Tax Rate Paid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_PAID = eINSTANCE.getResponsePricingSegment_PercentageSalesTaxRatePaid();

		/**
		 * The meta object literal for the '<em><b>Percentage Sales Tax Basis Paid</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_PAID = eINSTANCE.getResponsePricingSegment_PercentageSalesTaxBasisPaid();

		/**
		 * The meta object literal for the '<em><b>Incentive Amount Paid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__INCENTIVE_AMOUNT_PAID = eINSTANCE.getResponsePricingSegment_IncentiveAmountPaid();

		/**
		 * The meta object literal for the '<em><b>Professional Service Fee Paid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_PAID = eINSTANCE.getResponsePricingSegment_ProfessionalServiceFeePaid();

		/**
		 * The meta object literal for the '<em><b>Other Amount Paid Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_COUNT = eINSTANCE.getResponsePricingSegment_OtherAmountPaidCount();

		/**
		 * The meta object literal for the '<em><b>Other Amount Paid Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_QUALIFIER = eINSTANCE.getResponsePricingSegment_OtherAmountPaidQualifier();

		/**
		 * The meta object literal for the '<em><b>Other Amount Paid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID = eINSTANCE.getResponsePricingSegment_OtherAmountPaid();

		/**
		 * The meta object literal for the '<em><b>Other Payer Amount Recognized</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__OTHER_PAYER_AMOUNT_RECOGNIZED = eINSTANCE.getResponsePricingSegment_OtherPayerAmountRecognized();

		/**
		 * The meta object literal for the '<em><b>Total Amount Paid</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__TOTAL_AMOUNT_PAID = eINSTANCE.getResponsePricingSegment_TotalAmountPaid();

		/**
		 * The meta object literal for the '<em><b>Basis Of Reimbursement Determination</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRICING_SEGMENT__BASIS_OF_REIMBURSEMENT_DETERMINATION = eINSTANCE.getResponsePricingSegment_BasisOfReimbursementDetermination();

		/**
		 * The meta object literal for the '<em><b>Amount Attributed To Sales Tax</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_SALES_TAX = eINSTANCE.getResponsePricingSegment_AmountAttributedToSalesTax();

		/**
		 * The meta object literal for the '<em><b>Accumulated Deductible Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__ACCUMULATED_DEDUCTIBLE_AMOUNT = eINSTANCE.getResponsePricingSegment_AccumulatedDeductibleAmount();

		/**
		 * The meta object literal for the '<em><b>Remaining Deductible Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__REMAINING_DEDUCTIBLE_AMOUNT = eINSTANCE.getResponsePricingSegment_RemainingDeductibleAmount();

		/**
		 * The meta object literal for the '<em><b>Remaining Benefit Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__REMAINING_BENEFIT_AMOUNT = eINSTANCE.getResponsePricingSegment_RemainingBenefitAmount();

		/**
		 * The meta object literal for the '<em><b>Amount Applied To Periodic Deductible</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__AMOUNT_APPLIED_TO_PERIODIC_DEDUCTIBLE = eINSTANCE.getResponsePricingSegment_AmountAppliedToPeriodicDeductible();

		/**
		 * The meta object literal for the '<em><b>Amount Of Copay</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COPAY = eINSTANCE.getResponsePricingSegment_AmountOfCopay();

		/**
		 * The meta object literal for the '<em><b>Amount Exceeding Periodic Benefit Maximum</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__AMOUNT_EXCEEDING_PERIODIC_BENEFIT_MAXIMUM = eINSTANCE.getResponsePricingSegment_AmountExceedingPeriodicBenefitMaximum();

		/**
		 * The meta object literal for the '<em><b>Basis Of Calculationdispensing Fee</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONDISPENSING_FEE = eINSTANCE.getResponsePricingSegment_BasisOfCalculationdispensingFee();

		/**
		 * The meta object literal for the '<em><b>Basis Of Calculationcopay</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOPAY = eINSTANCE.getResponsePricingSegment_BasisOfCalculationcopay();

		/**
		 * The meta object literal for the '<em><b>Basis Of Calculationflat Sales Tax</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONFLAT_SALES_TAX = eINSTANCE.getResponsePricingSegment_BasisOfCalculationflatSalesTax();

		/**
		 * The meta object literal for the '<em><b>Basis Of Calculationpercentage Sales Tax</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONPERCENTAGE_SALES_TAX = eINSTANCE.getResponsePricingSegment_BasisOfCalculationpercentageSalesTax();

		/**
		 * The meta object literal for the '<em><b>Amount Attributed To Processor Fee</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROCESSOR_FEE = eINSTANCE.getResponsePricingSegment_AmountAttributedToProcessorFee();

		/**
		 * The meta object literal for the '<em><b>Patient Sales Tax Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__PATIENT_SALES_TAX_AMOUNT = eINSTANCE.getResponsePricingSegment_PatientSalesTaxAmount();

		/**
		 * The meta object literal for the '<em><b>Plan Sales Tax Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__PLAN_SALES_TAX_AMOUNT = eINSTANCE.getResponsePricingSegment_PlanSalesTaxAmount();

		/**
		 * The meta object literal for the '<em><b>Amount Of Coinsurance</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COINSURANCE = eINSTANCE.getResponsePricingSegment_AmountOfCoinsurance();

		/**
		 * The meta object literal for the '<em><b>Basis Of Calculationcoinsurance</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOINSURANCE = eINSTANCE.getResponsePricingSegment_BasisOfCalculationcoinsurance();

		/**
		 * The meta object literal for the '<em><b>Benefit Stage Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_COUNT = eINSTANCE.getResponsePricingSegment_BenefitStageCount();

		/**
		 * The meta object literal for the '<em><b>Benefit Stage Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_QUALIFIER = eINSTANCE.getResponsePricingSegment_BenefitStageQualifier();

		/**
		 * The meta object literal for the '<em><b>Benefit Stage Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_AMOUNT = eINSTANCE.getResponsePricingSegment_BenefitStageAmount();

		/**
		 * The meta object literal for the '<em><b>Estimated Generic Savings</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__ESTIMATED_GENERIC_SAVINGS = eINSTANCE.getResponsePricingSegment_EstimatedGenericSavings();

		/**
		 * The meta object literal for the '<em><b>Spending Account Amount Remaining</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__SPENDING_ACCOUNT_AMOUNT_REMAINING = eINSTANCE.getResponsePricingSegment_SpendingAccountAmountRemaining();

		/**
		 * The meta object literal for the '<em><b>Health Planfunded Assistance Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__HEALTH_PLANFUNDED_ASSISTANCE_AMOUNT = eINSTANCE.getResponsePricingSegment_HealthPlanfundedAssistanceAmount();

		/**
		 * The meta object literal for the '<em><b>Amount Attributed To Provider Network Selection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROVIDER_NETWORK_SELECTION = eINSTANCE.getResponsePricingSegment_AmountAttributedToProviderNetworkSelection();

		/**
		 * The meta object literal for the '<em><b>Amount Attributed To Product Selectionbrand Drug</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_DRUG = eINSTANCE.getResponsePricingSegment_AmountAttributedToProductSelectionbrandDrug();

		/**
		 * The meta object literal for the '<em><b>Amount Attributed To Product Selectionnonpreferred Formulary Selection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONNONPREFERRED_FORMULARY_SELECTION = eINSTANCE.getResponsePricingSegment_AmountAttributedToProductSelectionnonpreferredFormularySelection();

		/**
		 * The meta object literal for the '<em><b>Amount Attributed To Product Selectionbrand Nonpreferred Formulary Selection</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_NONPREFERRED_FORMULARY_SELECTION = eINSTANCE.getResponsePricingSegment_AmountAttributedToProductSelectionbrandNonpreferredFormularySelection();

		/**
		 * The meta object literal for the '<em><b>Amount Attributed To Coverage Gap</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_COVERAGE_GAP = eINSTANCE.getResponsePricingSegment_AmountAttributedToCoverageGap();

		/**
		 * The meta object literal for the '<em><b>Ingredient Cost Contractedreimbursable Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_CONTRACTEDREIMBURSABLE_AMOUNT = eINSTANCE.getResponsePricingSegment_IngredientCostContractedreimbursableAmount();

		/**
		 * The meta object literal for the '<em><b>Dispensing Fee Contractedreimbursable Amount</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_CONTRACTEDREIMBURSABLE_AMOUNT = eINSTANCE.getResponsePricingSegment_DispensingFeeContractedreimbursableAmount();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl <em>Response Prior Authorization Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ResponsePriorAuthorizationSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponsePriorAuthorizationSegment()
		 * @generated
		 */
		EClass RESPONSE_PRIOR_AUTHORIZATION_SEGMENT = eINSTANCE.getResponsePriorAuthorizationSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getResponsePriorAuthorizationSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Processed Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_PROCESSED_DATE = eINSTANCE.getResponsePriorAuthorizationSegment_PriorAuthorizationProcessedDate();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Effective Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EFFECTIVE_DATE = eINSTANCE.getResponsePriorAuthorizationSegment_PriorAuthorizationEffectiveDate();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Expiration Date</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EXPIRATION_DATE = eINSTANCE.getResponsePriorAuthorizationSegment_PriorAuthorizationExpirationDate();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Quantity</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY = eINSTANCE.getResponsePriorAuthorizationSegment_PriorAuthorizationQuantity();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Dollars Authorized</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_DOLLARS_AUTHORIZED = eINSTANCE.getResponsePriorAuthorizationSegment_PriorAuthorizationDollarsAuthorized();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Number Of Refills Authorized</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_OF_REFILLS_AUTHORIZED = eINSTANCE.getResponsePriorAuthorizationSegment_PriorAuthorizationNumberOfRefillsAuthorized();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Quantity Accumulated</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY_ACCUMULATED = eINSTANCE.getResponsePriorAuthorizationSegment_PriorAuthorizationQuantityAccumulated();

		/**
		 * The meta object literal for the '<em><b>Prior Authorization Numberassigned</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED = eINSTANCE.getResponsePriorAuthorizationSegment_PriorAuthorizationNumberassigned();

		/**
		 * The meta object literal for the '{@link org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl <em>Response Status Segment</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.ncpdp.uml.telecom.impl.ResponseStatusSegmentImpl
		 * @see org.ncpdp.uml.telecom.impl.TelecomPackageImpl#getResponseStatusSegment()
		 * @generated
		 */
		EClass RESPONSE_STATUS_SEGMENT = eINSTANCE.getResponseStatusSegment();

		/**
		 * The meta object literal for the '<em><b>Segment Identification</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_STATUS_SEGMENT__SEGMENT_IDENTIFICATION = eINSTANCE.getResponseStatusSegment_SegmentIdentification();

		/**
		 * The meta object literal for the '<em><b>Transaction Response Status</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_STATUS_SEGMENT__TRANSACTION_RESPONSE_STATUS = eINSTANCE.getResponseStatusSegment_TransactionResponseStatus();

		/**
		 * The meta object literal for the '<em><b>Authorization Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_STATUS_SEGMENT__AUTHORIZATION_NUMBER = eINSTANCE.getResponseStatusSegment_AuthorizationNumber();

		/**
		 * The meta object literal for the '<em><b>Reject Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_STATUS_SEGMENT__REJECT_COUNT = eINSTANCE.getResponseStatusSegment_RejectCount();

		/**
		 * The meta object literal for the '<em><b>Reject Code</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_STATUS_SEGMENT__REJECT_CODE = eINSTANCE.getResponseStatusSegment_RejectCode();

		/**
		 * The meta object literal for the '<em><b>Reject Field Occurrence Indicator</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_STATUS_SEGMENT__REJECT_FIELD_OCCURRENCE_INDICATOR = eINSTANCE.getResponseStatusSegment_RejectFieldOccurrenceIndicator();

		/**
		 * The meta object literal for the '<em><b>Approved Message Code Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE_COUNT = eINSTANCE.getResponseStatusSegment_ApprovedMessageCodeCount();

		/**
		 * The meta object literal for the '<em><b>Approved Message Code</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE = eINSTANCE.getResponseStatusSegment_ApprovedMessageCode();

		/**
		 * The meta object literal for the '<em><b>Additional Message Information Count</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_COUNT = eINSTANCE.getResponseStatusSegment_AdditionalMessageInformationCount();

		/**
		 * The meta object literal for the '<em><b>Additional Message Information Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_QUALIFIER = eINSTANCE.getResponseStatusSegment_AdditionalMessageInformationQualifier();

		/**
		 * The meta object literal for the '<em><b>Additional Message Information</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION = eINSTANCE.getResponseStatusSegment_AdditionalMessageInformation();

		/**
		 * The meta object literal for the '<em><b>Additional Message Information Continuity</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY = eINSTANCE.getResponseStatusSegment_AdditionalMessageInformationContinuity();

		/**
		 * The meta object literal for the '<em><b>Help Desk Phone Number Qualifier</b></em>' attribute list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER_QUALIFIER = eINSTANCE.getResponseStatusSegment_HelpDeskPhoneNumberQualifier();

		/**
		 * The meta object literal for the '<em><b>Help Desk Phone Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER = eINSTANCE.getResponseStatusSegment_HelpDeskPhoneNumber();

		/**
		 * The meta object literal for the '<em><b>Transaction Reference Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_STATUS_SEGMENT__TRANSACTION_REFERENCE_NUMBER = eINSTANCE.getResponseStatusSegment_TransactionReferenceNumber();

		/**
		 * The meta object literal for the '<em><b>Internal Control Number</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_STATUS_SEGMENT__INTERNAL_CONTROL_NUMBER = eINSTANCE.getResponseStatusSegment_InternalControlNumber();

		/**
		 * The meta object literal for the '<em><b>Url</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference RESPONSE_STATUS_SEGMENT__URL = eINSTANCE.getResponseStatusSegment_Url();

	}

} //TelecomPackage
