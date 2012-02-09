/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.CDAPackage;

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
public interface MtmPackage extends EPackage
{
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
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MTMImpl <em>MTM</em>}' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MTMImpl
	 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMTM()
	 * @generated
	 */
  int MTM = 0;

  /**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__REALM_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__REALM_CODE;

  /**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__TYPE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TYPE_ID;

  /**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__TEMPLATE_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TEMPLATE_ID;

  /**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__ID;

  /**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CODE;

  /**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__TITLE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__TITLE;

  /**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__EFFECTIVE_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__EFFECTIVE_TIME;

  /**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__CONFIDENTIALITY_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CONFIDENTIALITY_CODE;

  /**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__LANGUAGE_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LANGUAGE_CODE;

  /**
	 * The feature id for the '<em><b>Set Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__SET_ID = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__SET_ID;

  /**
	 * The feature id for the '<em><b>Version Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__VERSION_NUMBER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__VERSION_NUMBER;

  /**
	 * The feature id for the '<em><b>Copy Time</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__COPY_TIME = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COPY_TIME;

  /**
	 * The feature id for the '<em><b>Record Target</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__RECORD_TARGET = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RECORD_TARGET;

  /**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__AUTHOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHOR;

  /**
	 * The feature id for the '<em><b>Data Enterer</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__DATA_ENTERER = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DATA_ENTERER;

  /**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__INFORMANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMANT;

  /**
	 * The feature id for the '<em><b>Custodian</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__CUSTODIAN = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CUSTODIAN;

  /**
	 * The feature id for the '<em><b>Information Recipient</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__INFORMATION_RECIPIENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__INFORMATION_RECIPIENT;

  /**
	 * The feature id for the '<em><b>Legal Authenticator</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__LEGAL_AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__LEGAL_AUTHENTICATOR;

  /**
	 * The feature id for the '<em><b>Authenticator</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__AUTHENTICATOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHENTICATOR;

  /**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__PARTICIPANT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__PARTICIPANT;

  /**
	 * The feature id for the '<em><b>In Fulfillment Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__IN_FULFILLMENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__IN_FULFILLMENT_OF;

  /**
	 * The feature id for the '<em><b>Documentation Of</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__DOCUMENTATION_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__DOCUMENTATION_OF;

  /**
	 * The feature id for the '<em><b>Related Document</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__RELATED_DOCUMENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__RELATED_DOCUMENT;

  /**
	 * The feature id for the '<em><b>Authorization</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__AUTHORIZATION = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__AUTHORIZATION;

  /**
	 * The feature id for the '<em><b>Component Of</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__COMPONENT_OF = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT_OF;

  /**
	 * The feature id for the '<em><b>Component</b></em>' containment reference.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__COMPONENT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__COMPONENT;

  /**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__NULL_FLAVOR = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__NULL_FLAVOR;

  /**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__CLASS_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__CLASS_CODE;

  /**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM__MOOD_CODE = ConsolPackage.GENERAL_HEADER_CONSTRAINTS__MOOD_CODE;

  /**
	 * The number of structural features of the '<em>MTM</em>' class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
  int MTM_FEATURE_COUNT = ConsolPackage.GENERAL_HEADER_CONSTRAINTS_FEATURE_COUNT + 0;


  /**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MTMMedicationSectionImpl <em>MTM Medication Section</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MTMMedicationSectionImpl
	 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMTMMedicationSection()
	 * @generated
	 */
	int MTM_MEDICATION_SECTION = 1;

		/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__REALM_CODE = ConsolPackage.MEDICATIONS_SECTION__REALM_CODE;

		/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__TYPE_ID = ConsolPackage.MEDICATIONS_SECTION__TYPE_ID;

		/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__TEMPLATE_ID = ConsolPackage.MEDICATIONS_SECTION__TEMPLATE_ID;

		/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__ID = ConsolPackage.MEDICATIONS_SECTION__ID;

		/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__CODE = ConsolPackage.MEDICATIONS_SECTION__CODE;

		/**
	 * The feature id for the '<em><b>Title</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__TITLE = ConsolPackage.MEDICATIONS_SECTION__TITLE;

		/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__TEXT = ConsolPackage.MEDICATIONS_SECTION__TEXT;

		/**
	 * The feature id for the '<em><b>Confidentiality Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__CONFIDENTIALITY_CODE = ConsolPackage.MEDICATIONS_SECTION__CONFIDENTIALITY_CODE;

		/**
	 * The feature id for the '<em><b>Language Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__LANGUAGE_CODE = ConsolPackage.MEDICATIONS_SECTION__LANGUAGE_CODE;

		/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__SUBJECT = ConsolPackage.MEDICATIONS_SECTION__SUBJECT;

		/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__AUTHOR = ConsolPackage.MEDICATIONS_SECTION__AUTHOR;

		/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__INFORMANT = ConsolPackage.MEDICATIONS_SECTION__INFORMANT;

		/**
	 * The feature id for the '<em><b>Entry</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__ENTRY = ConsolPackage.MEDICATIONS_SECTION__ENTRY;

		/**
	 * The feature id for the '<em><b>Component</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__COMPONENT = ConsolPackage.MEDICATIONS_SECTION__COMPONENT;

		/**
	 * The feature id for the '<em><b>Section Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__SECTION_ID = ConsolPackage.MEDICATIONS_SECTION__SECTION_ID;

		/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__NULL_FLAVOR = ConsolPackage.MEDICATIONS_SECTION__NULL_FLAVOR;

		/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__CLASS_CODE = ConsolPackage.MEDICATIONS_SECTION__CLASS_CODE;

		/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION__MOOD_CODE = ConsolPackage.MEDICATIONS_SECTION__MOOD_CODE;

		/**
	 * The number of structural features of the '<em>MTM Medication Section</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_SECTION_FEATURE_COUNT = ConsolPackage.MEDICATIONS_SECTION_FEATURE_COUNT + 0;

		/**
	 * The meta object id for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MTMMedicationActivityImpl <em>MTM Medication Activity</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MTMMedicationActivityImpl
	 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMTMMedicationActivity()
	 * @generated
	 */
	int MTM_MEDICATION_ACTIVITY = 2;

		/**
	 * The feature id for the '<em><b>Realm Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__REALM_CODE = ConsolPackage.MEDICATION_ACTIVITY__REALM_CODE;

		/**
	 * The feature id for the '<em><b>Type Id</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__TYPE_ID = ConsolPackage.MEDICATION_ACTIVITY__TYPE_ID;

		/**
	 * The feature id for the '<em><b>Template Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__TEMPLATE_ID = ConsolPackage.MEDICATION_ACTIVITY__TEMPLATE_ID;

		/**
	 * The feature id for the '<em><b>Id</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__ID = ConsolPackage.MEDICATION_ACTIVITY__ID;

		/**
	 * The feature id for the '<em><b>Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__CODE = ConsolPackage.MEDICATION_ACTIVITY__CODE;

		/**
	 * The feature id for the '<em><b>Text</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__TEXT = ConsolPackage.MEDICATION_ACTIVITY__TEXT;

		/**
	 * The feature id for the '<em><b>Status Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__STATUS_CODE = ConsolPackage.MEDICATION_ACTIVITY__STATUS_CODE;

		/**
	 * The feature id for the '<em><b>Effective Time</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__EFFECTIVE_TIME = ConsolPackage.MEDICATION_ACTIVITY__EFFECTIVE_TIME;

		/**
	 * The feature id for the '<em><b>Priority Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__PRIORITY_CODE = ConsolPackage.MEDICATION_ACTIVITY__PRIORITY_CODE;

		/**
	 * The feature id for the '<em><b>Repeat Number</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__REPEAT_NUMBER = ConsolPackage.MEDICATION_ACTIVITY__REPEAT_NUMBER;

		/**
	 * The feature id for the '<em><b>Route Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__ROUTE_CODE = ConsolPackage.MEDICATION_ACTIVITY__ROUTE_CODE;

		/**
	 * The feature id for the '<em><b>Approach Site Code</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__APPROACH_SITE_CODE = ConsolPackage.MEDICATION_ACTIVITY__APPROACH_SITE_CODE;

		/**
	 * The feature id for the '<em><b>Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__DOSE_QUANTITY = ConsolPackage.MEDICATION_ACTIVITY__DOSE_QUANTITY;

		/**
	 * The feature id for the '<em><b>Rate Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__RATE_QUANTITY = ConsolPackage.MEDICATION_ACTIVITY__RATE_QUANTITY;

		/**
	 * The feature id for the '<em><b>Max Dose Quantity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__MAX_DOSE_QUANTITY = ConsolPackage.MEDICATION_ACTIVITY__MAX_DOSE_QUANTITY;

		/**
	 * The feature id for the '<em><b>Administration Unit Code</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__ADMINISTRATION_UNIT_CODE = ConsolPackage.MEDICATION_ACTIVITY__ADMINISTRATION_UNIT_CODE;

		/**
	 * The feature id for the '<em><b>Subject</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__SUBJECT = ConsolPackage.MEDICATION_ACTIVITY__SUBJECT;

		/**
	 * The feature id for the '<em><b>Specimen</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__SPECIMEN = ConsolPackage.MEDICATION_ACTIVITY__SPECIMEN;

		/**
	 * The feature id for the '<em><b>Consumable</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__CONSUMABLE = ConsolPackage.MEDICATION_ACTIVITY__CONSUMABLE;

		/**
	 * The feature id for the '<em><b>Performer</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__PERFORMER = ConsolPackage.MEDICATION_ACTIVITY__PERFORMER;

		/**
	 * The feature id for the '<em><b>Author</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__AUTHOR = ConsolPackage.MEDICATION_ACTIVITY__AUTHOR;

		/**
	 * The feature id for the '<em><b>Informant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__INFORMANT = ConsolPackage.MEDICATION_ACTIVITY__INFORMANT;

		/**
	 * The feature id for the '<em><b>Participant</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__PARTICIPANT = ConsolPackage.MEDICATION_ACTIVITY__PARTICIPANT;

		/**
	 * The feature id for the '<em><b>Entry Relationship</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__ENTRY_RELATIONSHIP = ConsolPackage.MEDICATION_ACTIVITY__ENTRY_RELATIONSHIP;

		/**
	 * The feature id for the '<em><b>Reference</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__REFERENCE = ConsolPackage.MEDICATION_ACTIVITY__REFERENCE;

		/**
	 * The feature id for the '<em><b>Precondition</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__PRECONDITION = ConsolPackage.MEDICATION_ACTIVITY__PRECONDITION;

		/**
	 * The feature id for the '<em><b>Null Flavor</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__NULL_FLAVOR = ConsolPackage.MEDICATION_ACTIVITY__NULL_FLAVOR;

		/**
	 * The feature id for the '<em><b>Class Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__CLASS_CODE = ConsolPackage.MEDICATION_ACTIVITY__CLASS_CODE;

		/**
	 * The feature id for the '<em><b>Mood Code</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__MOOD_CODE = ConsolPackage.MEDICATION_ACTIVITY__MOOD_CODE;

		/**
	 * The feature id for the '<em><b>Negation Ind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY__NEGATION_IND = ConsolPackage.MEDICATION_ACTIVITY__NEGATION_IND;

		/**
	 * The number of structural features of the '<em>MTM Medication Activity</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MTM_MEDICATION_ACTIVITY_FEATURE_COUNT = ConsolPackage.MEDICATION_ACTIVITY_FEATURE_COUNT + 0;


		/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.MTM <em>MTM</em>}'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTM</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.mtm.MTM
	 * @generated
	 */
  EClass getMTM();

  /**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationSection <em>MTM Medication Section</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTM Medication Section</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationSection
	 * @generated
	 */
	EClass getMTMMedicationSection();

		/**
	 * Returns the meta object for class '{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity <em>MTM Medication Activity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>MTM Medication Activity</em>'.
	 * @see org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity
	 * @generated
	 */
	EClass getMTMMedicationActivity();

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
  interface Literals
  {
    /**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MTMImpl <em>MTM</em>}' class.
		 * <!-- begin-user-doc -->
     * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MTMImpl
		 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMTM()
		 * @generated
		 */
    EClass MTM = eINSTANCE.getMTM();
				/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MTMMedicationSectionImpl <em>MTM Medication Section</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MTMMedicationSectionImpl
		 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMTMMedicationSection()
		 * @generated
		 */
		EClass MTM_MEDICATION_SECTION = eINSTANCE.getMTMMedicationSection();
				/**
		 * The meta object literal for the '{@link org.openhealthtools.mdht.uml.cda.mtm.impl.MTMMedicationActivityImpl <em>MTM Medication Activity</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MTMMedicationActivityImpl
		 * @see org.openhealthtools.mdht.uml.cda.mtm.impl.MtmPackageImpl#getMTMMedicationActivity()
		 * @generated
		 */
		EClass MTM_MEDICATION_ACTIVITY = eINSTANCE.getMTMMedicationActivity();

  }

} //MtmPackage
