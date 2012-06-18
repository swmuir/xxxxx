/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;

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
 * @see org.openhealthtools.mdht.uml.cda.mtm.MtmFactory
 * @model kind="package"
 * @generated
 */
public interface MtmPackage extends EPackage {
	/**
   * The package name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNAME = "mtm";

	/**
   * The package namespace URI.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_URI = "http://www.openhealthtools.org/mdht/uml/cda/mtm";

	/**
   * The package namespace name.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	String eNS_PREFIX = "mtm";

	/**
   * The singleton instance of the package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	MtmPackage eINSTANCE = org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl.init();

	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationTherapyManagementProgramImpl <em>Medication Therapy Management Program</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationTherapyManagementProgramImpl
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationTherapyManagementProgram()
   * @generated
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM = 0;

	/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__REALM_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

	/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__TYPE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

	/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__TEMPLATE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

	/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__ID;

	/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

	/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__TITLE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

	/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__EFFECTIVE_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

	/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__CONFIDENTIALITY_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

	/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__LANGUAGE_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

	/**
   * The feature id for the '<em><b>Set Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__SET_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

	/**
   * The feature id for the '<em><b>Version Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__VERSION_NUMBER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

	/**
   * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__COPY_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

	/**
   * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__RECORD_TARGET = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

	/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__AUTHOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

	/**
   * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__DATA_ENTERER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

	/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__INFORMANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

	/**
   * The feature id for the '<em><b>Custodian</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__CUSTODIAN = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

	/**
   * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__INFORMATION_RECIPIENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

	/**
   * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__LEGAL_AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

	/**
   * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

	/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__PARTICIPANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

	/**
   * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__IN_FULFILLMENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

	/**
   * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__DOCUMENTATION_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

	/**
   * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__RELATED_DOCUMENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

	/**
   * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__AUTHORIZATION = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

	/**
   * The feature id for the '<em><b>Component Of</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__COMPONENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

	/**
   * The feature id for the '<em><b>Component</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__COMPONENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

	/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__NULL_FLAVOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

	/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__CLASS_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

	/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__MOOD_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

	/**
   * The number of structural features of the '<em>Medication Therapy Management Program</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_THERAPY_MANAGEMENT_PROGRAM_FEATURE_COUNT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.PersonalMedicationListSectionImpl <em>Personal Medication List Section</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.PersonalMedicationListSectionImpl
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getPersonalMedicationListSection()
   * @generated
   */
	int PERSONAL_MEDICATION_LIST_SECTION = 1;

	/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__REALM_CODE = ConsolPackage.MEDICATIONS_SECTION__REALM_CODE;

	/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__TYPE_ID = ConsolPackage.MEDICATIONS_SECTION__TYPE_ID;

	/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__TEMPLATE_ID = ConsolPackage.MEDICATIONS_SECTION__TEMPLATE_ID;

	/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__ID = ConsolPackage.MEDICATIONS_SECTION__ID;

	/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__CODE = ConsolPackage.MEDICATIONS_SECTION__CODE;

	/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__TITLE = ConsolPackage.MEDICATIONS_SECTION__TITLE;

	/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__TEXT = ConsolPackage.MEDICATIONS_SECTION__TEXT;

	/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__CONFIDENTIALITY_CODE = ConsolPackage.MEDICATIONS_SECTION__CONFIDENTIALITY_CODE;

	/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__LANGUAGE_CODE = ConsolPackage.MEDICATIONS_SECTION__LANGUAGE_CODE;

	/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__SUBJECT = ConsolPackage.MEDICATIONS_SECTION__SUBJECT;

	/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__AUTHOR = ConsolPackage.MEDICATIONS_SECTION__AUTHOR;

	/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__INFORMANT = ConsolPackage.MEDICATIONS_SECTION__INFORMANT;

	/**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__ENTRY = ConsolPackage.MEDICATIONS_SECTION__ENTRY;

	/**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__COMPONENT = ConsolPackage.MEDICATIONS_SECTION__COMPONENT;

	/**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__SECTION_ID = ConsolPackage.MEDICATIONS_SECTION__SECTION_ID;

	/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__NULL_FLAVOR = ConsolPackage.MEDICATIONS_SECTION__NULL_FLAVOR;

	/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__CLASS_CODE = ConsolPackage.MEDICATIONS_SECTION__CLASS_CODE;

	/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION__MOOD_CODE = ConsolPackage.MEDICATIONS_SECTION__MOOD_CODE;

	/**
   * The number of structural features of the '<em>Personal Medication List Section</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int PERSONAL_MEDICATION_LIST_SECTION_FEATURE_COUNT = ConsolPackage.MEDICATIONS_SECTION_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActivityImpl <em>Medication Activity</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActivityImpl
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActivity()
   * @generated
   */
	int MEDICATION_ACTIVITY = 2;

	/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__REALM_CODE = ConsolPackage.MEDICATION_ACTIVITY__REALM_CODE;

	/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__TYPE_ID = ConsolPackage.MEDICATION_ACTIVITY__TYPE_ID;

	/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__TEMPLATE_ID = ConsolPackage.MEDICATION_ACTIVITY__TEMPLATE_ID;

	/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__ID = ConsolPackage.MEDICATION_ACTIVITY__ID;

	/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__CODE = ConsolPackage.MEDICATION_ACTIVITY__CODE;

	/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__TEXT = ConsolPackage.MEDICATION_ACTIVITY__TEXT;

	/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__STATUS_CODE = ConsolPackage.MEDICATION_ACTIVITY__STATUS_CODE;

	/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__EFFECTIVE_TIME = ConsolPackage.MEDICATION_ACTIVITY__EFFECTIVE_TIME;

	/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__PRIORITY_CODE = ConsolPackage.MEDICATION_ACTIVITY__PRIORITY_CODE;

	/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__REPEAT_NUMBER = ConsolPackage.MEDICATION_ACTIVITY__REPEAT_NUMBER;

	/**
   * The feature id for the '<em><b>Route Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__ROUTE_CODE = ConsolPackage.MEDICATION_ACTIVITY__ROUTE_CODE;

	/**
   * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__APPROACH_SITE_CODE = ConsolPackage.MEDICATION_ACTIVITY__APPROACH_SITE_CODE;

	/**
   * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__DOSE_QUANTITY = ConsolPackage.MEDICATION_ACTIVITY__DOSE_QUANTITY;

	/**
   * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__RATE_QUANTITY = ConsolPackage.MEDICATION_ACTIVITY__RATE_QUANTITY;

	/**
   * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__MAX_DOSE_QUANTITY = ConsolPackage.MEDICATION_ACTIVITY__MAX_DOSE_QUANTITY;

	/**
   * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__ADMINISTRATION_UNIT_CODE = ConsolPackage.MEDICATION_ACTIVITY__ADMINISTRATION_UNIT_CODE;

	/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__SUBJECT = ConsolPackage.MEDICATION_ACTIVITY__SUBJECT;

	/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__SPECIMEN = ConsolPackage.MEDICATION_ACTIVITY__SPECIMEN;

	/**
   * The feature id for the '<em><b>Consumable</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__CONSUMABLE = ConsolPackage.MEDICATION_ACTIVITY__CONSUMABLE;

	/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__PERFORMER = ConsolPackage.MEDICATION_ACTIVITY__PERFORMER;

	/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__AUTHOR = ConsolPackage.MEDICATION_ACTIVITY__AUTHOR;

	/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__INFORMANT = ConsolPackage.MEDICATION_ACTIVITY__INFORMANT;

	/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__PARTICIPANT = ConsolPackage.MEDICATION_ACTIVITY__PARTICIPANT;

	/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__ENTRY_RELATIONSHIP = ConsolPackage.MEDICATION_ACTIVITY__ENTRY_RELATIONSHIP;

	/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__REFERENCE = ConsolPackage.MEDICATION_ACTIVITY__REFERENCE;

	/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__PRECONDITION = ConsolPackage.MEDICATION_ACTIVITY__PRECONDITION;

	/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__NULL_FLAVOR = ConsolPackage.MEDICATION_ACTIVITY__NULL_FLAVOR;

	/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__CLASS_CODE = ConsolPackage.MEDICATION_ACTIVITY__CLASS_CODE;

	/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__MOOD_CODE = ConsolPackage.MEDICATION_ACTIVITY__MOOD_CODE;

	/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY__NEGATION_IND = ConsolPackage.MEDICATION_ACTIVITY__NEGATION_IND;

	/**
   * The number of structural features of the '<em>Medication Activity</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTIVITY_FEATURE_COUNT = ConsolPackage.MEDICATION_ACTIVITY_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.OtherInformationSectionImpl <em>Other Information Section</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.OtherInformationSectionImpl
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getOtherInformationSection()
   * @generated
   */
	int OTHER_INFORMATION_SECTION = 3;

	/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__REALM_CODE = CDAPackage.SECTION__REALM_CODE;

	/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__TYPE_ID = CDAPackage.SECTION__TYPE_ID;

	/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__TEMPLATE_ID = CDAPackage.SECTION__TEMPLATE_ID;

	/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__ID = CDAPackage.SECTION__ID;

	/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__CODE = CDAPackage.SECTION__CODE;

	/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__TITLE = CDAPackage.SECTION__TITLE;

	/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__TEXT = CDAPackage.SECTION__TEXT;

	/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__CONFIDENTIALITY_CODE = CDAPackage.SECTION__CONFIDENTIALITY_CODE;

	/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__LANGUAGE_CODE = CDAPackage.SECTION__LANGUAGE_CODE;

	/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__SUBJECT = CDAPackage.SECTION__SUBJECT;

	/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__AUTHOR = CDAPackage.SECTION__AUTHOR;

	/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__INFORMANT = CDAPackage.SECTION__INFORMANT;

	/**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__ENTRY = CDAPackage.SECTION__ENTRY;

	/**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__COMPONENT = CDAPackage.SECTION__COMPONENT;

	/**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__SECTION_ID = CDAPackage.SECTION__SECTION_ID;

	/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__NULL_FLAVOR = CDAPackage.SECTION__NULL_FLAVOR;

	/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__CLASS_CODE = CDAPackage.SECTION__CLASS_CODE;

	/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION__MOOD_CODE = CDAPackage.SECTION__MOOD_CODE;

	/**
   * The number of structural features of the '<em>Other Information Section</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int OTHER_INFORMATION_SECTION_FEATURE_COUNT = CDAPackage.SECTION_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanSectionImpl <em>Medication Action Plan Section</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanSectionImpl
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActionPlanSection()
   * @generated
   */
	int MEDICATION_ACTION_PLAN_SECTION = 4;

	/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__REALM_CODE = ConsolPackage.PLAN_OF_CARE_SECTION__REALM_CODE;

	/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__TYPE_ID = ConsolPackage.PLAN_OF_CARE_SECTION__TYPE_ID;

	/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__TEMPLATE_ID = ConsolPackage.PLAN_OF_CARE_SECTION__TEMPLATE_ID;

	/**
   * The feature id for the '<em><b>Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__ID = ConsolPackage.PLAN_OF_CARE_SECTION__ID;

	/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__CODE = ConsolPackage.PLAN_OF_CARE_SECTION__CODE;

	/**
   * The feature id for the '<em><b>Title</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__TITLE = ConsolPackage.PLAN_OF_CARE_SECTION__TITLE;

	/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__TEXT = ConsolPackage.PLAN_OF_CARE_SECTION__TEXT;

	/**
   * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__CONFIDENTIALITY_CODE = ConsolPackage.PLAN_OF_CARE_SECTION__CONFIDENTIALITY_CODE;

	/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__LANGUAGE_CODE = ConsolPackage.PLAN_OF_CARE_SECTION__LANGUAGE_CODE;

	/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__SUBJECT = ConsolPackage.PLAN_OF_CARE_SECTION__SUBJECT;

	/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__AUTHOR = ConsolPackage.PLAN_OF_CARE_SECTION__AUTHOR;

	/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__INFORMANT = ConsolPackage.PLAN_OF_CARE_SECTION__INFORMANT;

	/**
   * The feature id for the '<em><b>Entry</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__ENTRY = ConsolPackage.PLAN_OF_CARE_SECTION__ENTRY;

	/**
   * The feature id for the '<em><b>Component</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__COMPONENT = ConsolPackage.PLAN_OF_CARE_SECTION__COMPONENT;

	/**
   * The feature id for the '<em><b>Section Id</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__SECTION_ID = ConsolPackage.PLAN_OF_CARE_SECTION__SECTION_ID;

	/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__NULL_FLAVOR = ConsolPackage.PLAN_OF_CARE_SECTION__NULL_FLAVOR;

	/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__CLASS_CODE = ConsolPackage.PLAN_OF_CARE_SECTION__CLASS_CODE;

	/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION__MOOD_CODE = ConsolPackage.PLAN_OF_CARE_SECTION__MOOD_CODE;

	/**
   * The number of structural features of the '<em>Medication Action Plan Section</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_SECTION_FEATURE_COUNT = ConsolPackage.PLAN_OF_CARE_SECTION_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanEncounterImpl <em>Medication Action Plan Encounter</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanEncounterImpl
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActionPlanEncounter()
   * @generated
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER = 5;

	/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__REALM_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__REALM_CODE;

	/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__TYPE_ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__TYPE_ID;

	/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__TEMPLATE_ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__TEMPLATE_ID;

	/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__ID;

	/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__CODE;

	/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__TEXT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__TEXT;

	/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__STATUS_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__STATUS_CODE;

	/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__EFFECTIVE_TIME = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__EFFECTIVE_TIME;

	/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__PRIORITY_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PRIORITY_CODE;

	/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__SUBJECT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__SUBJECT;

	/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__SPECIMEN = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__SPECIMEN;

	/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__PERFORMER = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PERFORMER;

	/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__AUTHOR = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__AUTHOR;

	/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__INFORMANT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__INFORMANT;

	/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__PARTICIPANT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PARTICIPANT;

	/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__ENTRY_RELATIONSHIP = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__ENTRY_RELATIONSHIP;

	/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__REFERENCE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__REFERENCE;

	/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__PRECONDITION = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__PRECONDITION;

	/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__NULL_FLAVOR = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__NULL_FLAVOR;

	/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__CLASS_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__CLASS_CODE;

	/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER__MOOD_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER__MOOD_CODE;

	/**
   * The number of structural features of the '<em>Medication Action Plan Encounter</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ENCOUNTER_FEATURE_COUNT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ENCOUNTER_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanActivityImpl <em>Medication Action Plan Activity</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanActivityImpl
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActionPlanActivity()
   * @generated
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY = 6;

	/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__REALM_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__REALM_CODE;

	/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__TYPE_ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__TYPE_ID;

	/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__TEMPLATE_ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__TEMPLATE_ID;

	/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__ID;

	/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__CODE;

	/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__TEXT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__TEXT;

	/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__STATUS_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__STATUS_CODE;

	/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__EFFECTIVE_TIME = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__EFFECTIVE_TIME;

	/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__PRIORITY_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__PRIORITY_CODE;

	/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__LANGUAGE_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__LANGUAGE_CODE;

	/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__SUBJECT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__SUBJECT;

	/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__SPECIMEN = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__SPECIMEN;

	/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__PERFORMER = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__PERFORMER;

	/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__AUTHOR = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__AUTHOR;

	/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__INFORMANT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__INFORMANT;

	/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__PARTICIPANT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__PARTICIPANT;

	/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__ENTRY_RELATIONSHIP = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__ENTRY_RELATIONSHIP;

	/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__REFERENCE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__REFERENCE;

	/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__PRECONDITION = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__PRECONDITION;

	/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__NULL_FLAVOR = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__NULL_FLAVOR;

	/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__CLASS_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__CLASS_CODE;

	/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__MOOD_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__MOOD_CODE;

	/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY__NEGATION_IND = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT__NEGATION_IND;

	/**
   * The number of structural features of the '<em>Medication Action Plan Activity</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_ACTIVITY_FEATURE_COUNT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_ACT_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanObservationImpl <em>Medication Action Plan Observation</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanObservationImpl
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActionPlanObservation()
   * @generated
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION = 7;

	/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__REALM_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__REALM_CODE;

	/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__TYPE_ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__TYPE_ID;

	/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__TEMPLATE_ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__TEMPLATE_ID;

	/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__ID;

	/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__CODE;

	/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__DERIVATION_EXPR = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__DERIVATION_EXPR;

	/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__TEXT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__TEXT;

	/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__STATUS_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__STATUS_CODE;

	/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__EFFECTIVE_TIME = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__EFFECTIVE_TIME;

	/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__PRIORITY_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__PRIORITY_CODE;

	/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__REPEAT_NUMBER = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__REPEAT_NUMBER;

	/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__LANGUAGE_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__LANGUAGE_CODE;

	/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__VALUE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__VALUE;

	/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__INTERPRETATION_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__INTERPRETATION_CODE;

	/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__METHOD_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__METHOD_CODE;

	/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__TARGET_SITE_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__TARGET_SITE_CODE;

	/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__SUBJECT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__SUBJECT;

	/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__SPECIMEN = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__SPECIMEN;

	/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__PERFORMER = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__PERFORMER;

	/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__AUTHOR = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__AUTHOR;

	/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__INFORMANT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__INFORMANT;

	/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__PARTICIPANT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__PARTICIPANT;

	/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__ENTRY_RELATIONSHIP = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__REFERENCE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__REFERENCE;

	/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__PRECONDITION = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__PRECONDITION;

	/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__REFERENCE_RANGE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__REFERENCE_RANGE;

	/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__NULL_FLAVOR = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__NULL_FLAVOR;

	/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__CLASS_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__CLASS_CODE;

	/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__MOOD_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__MOOD_CODE;

	/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION__NEGATION_IND = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__NEGATION_IND;

	/**
   * The number of structural features of the '<em>Medication Action Plan Observation</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_OBSERVATION_FEATURE_COUNT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION_FEATURE_COUNT + 0;

	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanGoalImpl <em>Medication Action Plan Goal</em>}' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanGoalImpl
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActionPlanGoal()
   * @generated
   */
	int MEDICATION_ACTION_PLAN_GOAL = 8;

	/**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__REALM_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__REALM_CODE;

	/**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__TYPE_ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__TYPE_ID;

	/**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__TEMPLATE_ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__TEMPLATE_ID;

	/**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__ID = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__ID;

	/**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__CODE;

	/**
   * The feature id for the '<em><b>Derivation Expr</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__DERIVATION_EXPR = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__DERIVATION_EXPR;

	/**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__TEXT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__TEXT;

	/**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__STATUS_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__STATUS_CODE;

	/**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__EFFECTIVE_TIME = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__EFFECTIVE_TIME;

	/**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__PRIORITY_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__PRIORITY_CODE;

	/**
   * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__REPEAT_NUMBER = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__REPEAT_NUMBER;

	/**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__LANGUAGE_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__LANGUAGE_CODE;

	/**
   * The feature id for the '<em><b>Value</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__VALUE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__VALUE;

	/**
   * The feature id for the '<em><b>Interpretation Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__INTERPRETATION_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__INTERPRETATION_CODE;

	/**
   * The feature id for the '<em><b>Method Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__METHOD_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__METHOD_CODE;

	/**
   * The feature id for the '<em><b>Target Site Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__TARGET_SITE_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__TARGET_SITE_CODE;

	/**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__SUBJECT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__SUBJECT;

	/**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__SPECIMEN = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__SPECIMEN;

	/**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__PERFORMER = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__PERFORMER;

	/**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__AUTHOR = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__AUTHOR;

	/**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__INFORMANT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__INFORMANT;

	/**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__PARTICIPANT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__PARTICIPANT;

	/**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__ENTRY_RELATIONSHIP = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__ENTRY_RELATIONSHIP;

	/**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__REFERENCE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__REFERENCE;

	/**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__PRECONDITION = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__PRECONDITION;

	/**
   * The feature id for the '<em><b>Reference Range</b></em>' containment reference list.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__REFERENCE_RANGE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__REFERENCE_RANGE;

	/**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__NULL_FLAVOR = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__NULL_FLAVOR;

	/**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__CLASS_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__CLASS_CODE;

	/**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__MOOD_CODE = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__MOOD_CODE;

	/**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL__NEGATION_IND = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION__NEGATION_IND;

	/**
   * The number of structural features of the '<em>Medication Action Plan Goal</em>' class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
	int MEDICATION_ACTION_PLAN_GOAL_FEATURE_COUNT = ConsolPackage.PLAN_OF_CARE_ACTIVITY_OBSERVATION_FEATURE_COUNT + 0;


	/**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.ReminderImpl <em>Reminder</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.ReminderImpl
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getReminder()
   * @generated
   */
  int REMINDER = 9;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__REALM_CODE = ConsolPackage.INSTRUCTIONS__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__TYPE_ID = ConsolPackage.INSTRUCTIONS__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__TEMPLATE_ID = ConsolPackage.INSTRUCTIONS__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__ID = ConsolPackage.INSTRUCTIONS__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__CODE = ConsolPackage.INSTRUCTIONS__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__TEXT = ConsolPackage.INSTRUCTIONS__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__STATUS_CODE = ConsolPackage.INSTRUCTIONS__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__EFFECTIVE_TIME = ConsolPackage.INSTRUCTIONS__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__PRIORITY_CODE = ConsolPackage.INSTRUCTIONS__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__LANGUAGE_CODE = ConsolPackage.INSTRUCTIONS__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__SUBJECT = ConsolPackage.INSTRUCTIONS__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__SPECIMEN = ConsolPackage.INSTRUCTIONS__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__PERFORMER = ConsolPackage.INSTRUCTIONS__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__AUTHOR = ConsolPackage.INSTRUCTIONS__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__INFORMANT = ConsolPackage.INSTRUCTIONS__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__PARTICIPANT = ConsolPackage.INSTRUCTIONS__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__ENTRY_RELATIONSHIP = ConsolPackage.INSTRUCTIONS__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__REFERENCE = ConsolPackage.INSTRUCTIONS__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__PRECONDITION = ConsolPackage.INSTRUCTIONS__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__NULL_FLAVOR = ConsolPackage.INSTRUCTIONS__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__CLASS_CODE = ConsolPackage.INSTRUCTIONS__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__MOOD_CODE = ConsolPackage.INSTRUCTIONS__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER__NEGATION_IND = ConsolPackage.INSTRUCTIONS__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Reminder</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int REMINDER_FEATURE_COUNT = ConsolPackage.INSTRUCTIONS_FEATURE_COUNT + 0;


  /**
   * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.InstructionsImpl <em>Instructions</em>}' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.InstructionsImpl
   * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getInstructions()
   * @generated
   */
  int INSTRUCTIONS = 10;

  /**
   * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__REALM_CODE = ConsolPackage.INSTRUCTIONS__REALM_CODE;

  /**
   * The feature id for the '<em><b>Type Id</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__TYPE_ID = ConsolPackage.INSTRUCTIONS__TYPE_ID;

  /**
   * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__TEMPLATE_ID = ConsolPackage.INSTRUCTIONS__TEMPLATE_ID;

  /**
   * The feature id for the '<em><b>Id</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__ID = ConsolPackage.INSTRUCTIONS__ID;

  /**
   * The feature id for the '<em><b>Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__CODE = ConsolPackage.INSTRUCTIONS__CODE;

  /**
   * The feature id for the '<em><b>Text</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__TEXT = ConsolPackage.INSTRUCTIONS__TEXT;

  /**
   * The feature id for the '<em><b>Status Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__STATUS_CODE = ConsolPackage.INSTRUCTIONS__STATUS_CODE;

  /**
   * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__EFFECTIVE_TIME = ConsolPackage.INSTRUCTIONS__EFFECTIVE_TIME;

  /**
   * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__PRIORITY_CODE = ConsolPackage.INSTRUCTIONS__PRIORITY_CODE;

  /**
   * The feature id for the '<em><b>Language Code</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__LANGUAGE_CODE = ConsolPackage.INSTRUCTIONS__LANGUAGE_CODE;

  /**
   * The feature id for the '<em><b>Subject</b></em>' containment reference.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__SUBJECT = ConsolPackage.INSTRUCTIONS__SUBJECT;

  /**
   * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__SPECIMEN = ConsolPackage.INSTRUCTIONS__SPECIMEN;

  /**
   * The feature id for the '<em><b>Performer</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__PERFORMER = ConsolPackage.INSTRUCTIONS__PERFORMER;

  /**
   * The feature id for the '<em><b>Author</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__AUTHOR = ConsolPackage.INSTRUCTIONS__AUTHOR;

  /**
   * The feature id for the '<em><b>Informant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__INFORMANT = ConsolPackage.INSTRUCTIONS__INFORMANT;

  /**
   * The feature id for the '<em><b>Participant</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__PARTICIPANT = ConsolPackage.INSTRUCTIONS__PARTICIPANT;

  /**
   * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__ENTRY_RELATIONSHIP = ConsolPackage.INSTRUCTIONS__ENTRY_RELATIONSHIP;

  /**
   * The feature id for the '<em><b>Reference</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__REFERENCE = ConsolPackage.INSTRUCTIONS__REFERENCE;

  /**
   * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__PRECONDITION = ConsolPackage.INSTRUCTIONS__PRECONDITION;

  /**
   * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__NULL_FLAVOR = ConsolPackage.INSTRUCTIONS__NULL_FLAVOR;

  /**
   * The feature id for the '<em><b>Class Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__CLASS_CODE = ConsolPackage.INSTRUCTIONS__CLASS_CODE;

  /**
   * The feature id for the '<em><b>Mood Code</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__MOOD_CODE = ConsolPackage.INSTRUCTIONS__MOOD_CODE;

  /**
   * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS__NEGATION_IND = ConsolPackage.INSTRUCTIONS__NEGATION_IND;

  /**
   * The number of structural features of the '<em>Instructions</em>' class.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   * @ordered
   */
  int INSTRUCTIONS_FEATURE_COUNT = ConsolPackage.INSTRUCTIONS_FEATURE_COUNT + 0;


  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram <em>Medication Therapy Management Program</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medication Therapy Management Program</em>'.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram
   * @generated
   */
	EClass getMedicationTherapyManagementProgram();

	/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationListSection <em>Personal Medication List Section</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Personal Medication List Section</em>'.
   * @see org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationListSection
   * @generated
   */
	EClass getPersonalMedicationListSection();

	/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity <em>Medication Activity</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medication Activity</em>'.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity
   * @generated
   */
	EClass getMedicationActivity();

	/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection <em>Other Information Section</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Other Information Section</em>'.
   * @see org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection
   * @generated
   */
	EClass getOtherInformationSection();

	/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection <em>Medication Action Plan Section</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medication Action Plan Section</em>'.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection
   * @generated
   */
	EClass getMedicationActionPlanSection();

	/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter <em>Medication Action Plan Encounter</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medication Action Plan Encounter</em>'.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter
   * @generated
   */
	EClass getMedicationActionPlanEncounter();

	/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity <em>Medication Action Plan Activity</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medication Action Plan Activity</em>'.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity
   * @generated
   */
	EClass getMedicationActionPlanActivity();

	/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanObservation <em>Medication Action Plan Observation</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medication Action Plan Observation</em>'.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanObservation
   * @generated
   */
	EClass getMedicationActionPlanObservation();

	/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanGoal <em>Medication Action Plan Goal</em>}'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the meta object for class '<em>Medication Action Plan Goal</em>'.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanGoal
   * @generated
   */
	EClass getMedicationActionPlanGoal();

	/**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.Reminder <em>Reminder</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Reminder</em>'.
   * @see org.openhealthtools.mdht.uml.cda.mtm.Reminder
   * @generated
   */
  EClass getReminder();

  /**
   * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.Instructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the meta object for class '<em>Instructions</em>'.
   * @see org.openhealthtools.mdht.uml.cda.mtm.Instructions
   * @generated
   */
  EClass getInstructions();

  /**
   * Returns the factory that creates the instances of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the factory that creates the instances of the model.
   * @generated
   */
	MtmFactory getMtmFactory();

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
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationTherapyManagementProgramImpl <em>Medication Therapy Management Program</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationTherapyManagementProgramImpl
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationTherapyManagementProgram()
     * @generated
     */
		EClass MEDICATION_THERAPY_MANAGEMENT_PROGRAM = eINSTANCE.getMedicationTherapyManagementProgram();

		/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.PersonalMedicationListSectionImpl <em>Personal Medication List Section</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.PersonalMedicationListSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getPersonalMedicationListSection()
     * @generated
     */
		EClass PERSONAL_MEDICATION_LIST_SECTION = eINSTANCE.getPersonalMedicationListSection();

		/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActivityImpl <em>Medication Activity</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActivityImpl
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActivity()
     * @generated
     */
		EClass MEDICATION_ACTIVITY = eINSTANCE.getMedicationActivity();

		/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.OtherInformationSectionImpl <em>Other Information Section</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.OtherInformationSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getOtherInformationSection()
     * @generated
     */
		EClass OTHER_INFORMATION_SECTION = eINSTANCE.getOtherInformationSection();

		/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanSectionImpl <em>Medication Action Plan Section</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanSectionImpl
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActionPlanSection()
     * @generated
     */
		EClass MEDICATION_ACTION_PLAN_SECTION = eINSTANCE.getMedicationActionPlanSection();

		/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanEncounterImpl <em>Medication Action Plan Encounter</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanEncounterImpl
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActionPlanEncounter()
     * @generated
     */
		EClass MEDICATION_ACTION_PLAN_ENCOUNTER = eINSTANCE.getMedicationActionPlanEncounter();

		/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanActivityImpl <em>Medication Action Plan Activity</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanActivityImpl
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActionPlanActivity()
     * @generated
     */
		EClass MEDICATION_ACTION_PLAN_ACTIVITY = eINSTANCE.getMedicationActionPlanActivity();

		/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanObservationImpl <em>Medication Action Plan Observation</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanObservationImpl
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActionPlanObservation()
     * @generated
     */
		EClass MEDICATION_ACTION_PLAN_OBSERVATION = eINSTANCE.getMedicationActionPlanObservation();

		/**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanGoalImpl <em>Medication Action Plan Goal</em>}' class.
     * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MedicationActionPlanGoalImpl
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMedicationActionPlanGoal()
     * @generated
     */
		EClass MEDICATION_ACTION_PLAN_GOAL = eINSTANCE.getMedicationActionPlanGoal();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.ReminderImpl <em>Reminder</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.ReminderImpl
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getReminder()
     * @generated
     */
    EClass REMINDER = eINSTANCE.getReminder();

    /**
     * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.InstructionsImpl <em>Instructions</em>}' class.
     * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.InstructionsImpl
     * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getInstructions()
     * @generated
     */
    EClass INSTRUCTIONS = eINSTANCE.getInstructions();

	}

} //MtmPackage
