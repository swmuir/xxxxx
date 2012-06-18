/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;

import org.openhealthtools.mdht.uml.cda.mtm.*;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.mtm.MtmPackage
 * @generated
 */
public class MtmValidator extends EObjectValidator {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final MtmValidator INSTANCE = new MtmValidator();

	/**
   * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see org.eclipse.emf.common.util.Diagnostic#getSource()
   * @see org.eclipse.emf.common.util.Diagnostic#getCode()
   * @generated
   */
	public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.mtm";

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Therapy Management Program Allergies Section' of 'Medication Therapy Management Program'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__MEDICATION_THERAPY_MANAGEMENT_PROGRAM_ALLERGIES_SECTION = 1;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Therapy Management Program Personal Medication List Section' of 'Medication Therapy Management Program'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__MEDICATION_THERAPY_MANAGEMENT_PROGRAM_PERSONAL_MEDICATION_LIST_SECTION = 2;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Therapy Management Program Other Information Section' of 'Medication Therapy Management Program'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__MEDICATION_THERAPY_MANAGEMENT_PROGRAM_OTHER_INFORMATION_SECTION = 3;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Therapy Management Program Medication Action Plan' of 'Medication Therapy Management Program'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__MEDICATION_THERAPY_MANAGEMENT_PROGRAM_MEDICATION_ACTION_PLAN = 4;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'Medication Therapy Management Program'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_THERAPY_MANAGEMENT_PROGRAM__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 5;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Personal Medication List Section Medication' of 'Personal Medication List Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PERSONAL_MEDICATION_LIST_SECTION__PERSONAL_MEDICATION_LIST_SECTION_MEDICATION = 6;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medications Section Entries Optional Template Id' of 'Personal Medication List Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int PERSONAL_MEDICATION_LIST_SECTION__MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID = 7;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mtm Medication Activity Template Id' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_TEMPLATE_ID = 8;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mtm Medication Activity Text' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_TEXT = 9;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mtm Medication Activity Presciber' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_PRESCIBER = 10;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mtm Medication Activity Indication Entry Relationship' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP = 11;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mtm Medication Activity Stop Reason Entry Relationship' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP = 12;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mtm Medication Activity Reminder Entry Relationship' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP = 13;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mtm Medication Activity Instructions Entry Relationship' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_INSTRUCTIONS_ENTRY_RELATIONSHIP = 14;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mtm Medication Activity Goals Entry Relationship' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP = 15;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Prescriber Assigned Presciber Person Name' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_PERSON_NAME = 16;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Prescriber Assigned Presciber Assigned Person' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_ASSIGNED_PERSON = 17;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Prescriber Template Id' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRESCRIBER_TEMPLATE_ID = 18;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Prescriber Type Code' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRESCRIBER_TYPE_CODE = 19;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Prescriber Assigned Author' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_AUTHOR = 20;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Indication Entry Relationship Type Code' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_TYPE_CODE = 21;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Indication Entry Relationship Indication' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_INDICATION = 22;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Stop Reason Entry Relationship Stop Reason Class Code' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_CLASS_CODE = 23;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Stop Reason Entry Relationship Stop Reason Negation Ind' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_NEGATION_IND = 24;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Stop Reason Entry Relationship Type Code' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_TYPE_CODE = 25;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Reminder Entry Relationship Type Code' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_TYPE_CODE = 26;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Reminder Entry Relationship Reminder' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_REMINDER = 27;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Instruction Entry Relationship Type Code' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_TYPE_CODE = 28;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Instruction Entry Relationship Instructions' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_INSTRUCTIONS = 29;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Activity Goals Entry Relationship Medication Action Plan Goal' of 'Medication Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP_MEDICATION_ACTION_PLAN_GOAL = 30;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Information Section Template Id' of 'Other Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OTHER_INFORMATION_SECTION__OTHER_INFORMATION_SECTION_TEMPLATE_ID = 31;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Information Section Text' of 'Other Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OTHER_INFORMATION_SECTION__OTHER_INFORMATION_SECTION_TEXT = 32;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Other Information Section Title' of 'Other Information Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int OTHER_INFORMATION_SECTION__OTHER_INFORMATION_SECTION_TITLE = 33;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Section Title' of 'Medication Action Plan Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_SECTION__MEDICATION_ACTION_PLAN_SECTION_TITLE = 34;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Section Medication Action Plan Encounter' of 'Medication Action Plan Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_SECTION__MEDICATION_ACTION_PLAN_SECTION_MEDICATION_ACTION_PLAN_ENCOUNTER = 35;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Section Template Id' of 'Medication Action Plan Section'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_SECTION__PLAN_OF_CARE_SECTION_TEMPLATE_ID = 36;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Encounter Effective Time' of 'Medication Action Plan Encounter'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_EFFECTIVE_TIME = 37;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Encounter Text' of 'Medication Action Plan Encounter'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_TEXT = 38;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Encounter Code' of 'Medication Action Plan Encounter'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_CODE = 39;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Encounter Code P' of 'Medication Action Plan Encounter'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_CODE_P = 40;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Encounter Medication Action Plan Activity' of 'Medication Action Plan Encounter'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_ACTIVITY = 41;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Encounter Medication Action Plan Observation' of 'Medication Action Plan Encounter'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_OBSERVATION = 42;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Activity Text' of 'Medication Action Plan Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_ACTIVITY__MEDICATION_ACTION_PLAN_ACTIVITY_TEXT = 43;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Activity Code P' of 'Medication Action Plan Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_ACTIVITY__MEDICATION_ACTION_PLAN_ACTIVITY_CODE_P = 44;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Activity Code' of 'Medication Action Plan Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_ACTIVITY__MEDICATION_ACTION_PLAN_ACTIVITY_CODE = 45;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Template Id' of 'Medication Action Plan Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_ACTIVITY__PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID = 46;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Act Mood Code' of 'Medication Action Plan Activity'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_ACTIVITY__PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE = 47;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Observation Text' of 'Medication Action Plan Observation'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_OBSERVATION__MEDICATION_ACTION_PLAN_OBSERVATION_TEXT = 48;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Goal Mood Code' of 'Medication Action Plan Goal'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_GOAL__MEDICATION_ACTION_PLAN_GOAL_MOOD_CODE = 49;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Medication Action Plan Goal Text' of 'Medication Action Plan Goal'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_GOAL__MEDICATION_ACTION_PLAN_GOAL_TEXT = 50;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Plan Of Care Activity Observation Mood Code' of 'Medication Action Plan Goal'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static final int MEDICATION_ACTION_PLAN_GOAL__PLAN_OF_CARE_ACTIVITY_OBSERVATION_MOOD_CODE = 51;

	/**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Reminder Text' of 'Reminder'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REMINDER__REMINDER_TEXT = 52;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Instructions Template Id' of 'Reminder'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int REMINDER__INSTRUCTIONS_TEMPLATE_ID = 53;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Mtm Instructions Text' of 'Instructions'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INSTRUCTIONS__MTM_INSTRUCTIONS_TEXT = 54;

  /**
   * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate Instructions Template Id' of 'Instructions'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public static final int INSTRUCTIONS__INSTRUCTIONS_TEMPLATE_ID = 55;

  /**
   * A constant with a fixed name that can be used as the base value for additional hand written constants.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 55;

	/**
   * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
   * The cached base package validator.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected CDAValidator cdaValidator;

	/**
   * The cached base package validator.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected ConsolValidator consolValidator;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MtmValidator() {
    super();
    cdaValidator = CDAValidator.INSTANCE;
    consolValidator = ConsolValidator.INSTANCE;
  }

	/**
   * Returns the package of this validator switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EPackage getEPackage() {
    return MtmPackage.eINSTANCE;
  }

	/**
   * Calls <code>validateXXX</code> for the corresponding classifier of the model.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
    switch (classifierID)
    {
      case MtmPackage.MEDICATION_THERAPY_MANAGEMENT_PROGRAM:
        return validateMedicationTherapyManagementProgram((MedicationTherapyManagementProgram)value, diagnostics, context);
      case MtmPackage.PERSONAL_MEDICATION_LIST_SECTION:
        return validatePersonalMedicationListSection((PersonalMedicationListSection)value, diagnostics, context);
      case MtmPackage.MEDICATION_ACTIVITY:
        return validateMedicationActivity((MedicationActivity)value, diagnostics, context);
      case MtmPackage.OTHER_INFORMATION_SECTION:
        return validateOtherInformationSection((OtherInformationSection)value, diagnostics, context);
      case MtmPackage.MEDICATION_ACTION_PLAN_SECTION:
        return validateMedicationActionPlanSection((MedicationActionPlanSection)value, diagnostics, context);
      case MtmPackage.MEDICATION_ACTION_PLAN_ENCOUNTER:
        return validateMedicationActionPlanEncounter((MedicationActionPlanEncounter)value, diagnostics, context);
      case MtmPackage.MEDICATION_ACTION_PLAN_ACTIVITY:
        return validateMedicationActionPlanActivity((MedicationActionPlanActivity)value, diagnostics, context);
      case MtmPackage.MEDICATION_ACTION_PLAN_OBSERVATION:
        return validateMedicationActionPlanObservation((MedicationActionPlanObservation)value, diagnostics, context);
      case MtmPackage.MEDICATION_ACTION_PLAN_GOAL:
        return validateMedicationActionPlanGoal((MedicationActionPlanGoal)value, diagnostics, context);
      case MtmPackage.REMINDER:
        return validateReminder((Reminder)value, diagnostics, context);
      case MtmPackage.INSTRUCTIONS:
        return validateInstructions((Instructions)value, diagnostics, context);
      default:
        return true;
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationTherapyManagementProgram(MedicationTherapyManagementProgram medicationTherapyManagementProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(medicationTherapyManagementProgram, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmAddress(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsUSRealmPatientName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationTherapyManagementProgram_validateGeneralHeaderConstraintsTemplateId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorPersonName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCodeP(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityPersonName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCodeP(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntity(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientPersonName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityPersonName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCodeP(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityPersonName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCodeP(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCodeP(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCodeP(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianPersonName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCodeP(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientAdministrativeGenderCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCodeP(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPersonName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPersonName(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCodeP(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPerson(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationTherapyManagementProgram_validateMedicationTherapyManagementProgramAllergiesSection(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationTherapyManagementProgram_validateMedicationTherapyManagementProgramPersonalMedicationListSection(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationTherapyManagementProgram_validateMedicationTherapyManagementProgramOtherInformationSection(medicationTherapyManagementProgram, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationTherapyManagementProgram_validateMedicationTherapyManagementProgramMedicationActionPlan(medicationTherapyManagementProgram, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateMedicationTherapyManagementProgramAllergiesSection constraint of '<em>Medication Therapy Management Program</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationTherapyManagementProgram_validateMedicationTherapyManagementProgramAllergiesSection(MedicationTherapyManagementProgram medicationTherapyManagementProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationTherapyManagementProgram.validateMedicationTherapyManagementProgramAllergiesSection(diagnostics, context);
  }

	/**
   * Validates the validateMedicationTherapyManagementProgramPersonalMedicationListSection constraint of '<em>Medication Therapy Management Program</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationTherapyManagementProgram_validateMedicationTherapyManagementProgramPersonalMedicationListSection(MedicationTherapyManagementProgram medicationTherapyManagementProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationTherapyManagementProgram.validateMedicationTherapyManagementProgramPersonalMedicationListSection(diagnostics, context);
  }

	/**
   * Validates the validateMedicationTherapyManagementProgramOtherInformationSection constraint of '<em>Medication Therapy Management Program</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationTherapyManagementProgram_validateMedicationTherapyManagementProgramOtherInformationSection(MedicationTherapyManagementProgram medicationTherapyManagementProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationTherapyManagementProgram.validateMedicationTherapyManagementProgramOtherInformationSection(diagnostics, context);
  }

	/**
   * Validates the validateMedicationTherapyManagementProgramMedicationActionPlan constraint of '<em>Medication Therapy Management Program</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationTherapyManagementProgram_validateMedicationTherapyManagementProgramMedicationActionPlan(MedicationTherapyManagementProgram medicationTherapyManagementProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationTherapyManagementProgram.validateMedicationTherapyManagementProgramMedicationActionPlan(diagnostics, context);
  }

	/**
   * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>Medication Therapy Management Program</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationTherapyManagementProgram_validateGeneralHeaderConstraintsTemplateId(MedicationTherapyManagementProgram medicationTherapyManagementProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationTherapyManagementProgram.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePersonalMedicationListSection(PersonalMedicationListSection personalMedicationListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(personalMedicationListSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePersonalMedicationListSection_validateMedicationsSectionEntriesOptionalTemplateId(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationsSection_validateMedicationsSectionEntriesOptionalCode(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationsSectionEntriesOptional_validateMedicationsSectionEntriesOptionalTitle(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationsSectionEntriesOptional_validateMedicationsSectionEntriesOptionalText(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationsSectionEntriesOptional_validateMedicationsSectionEntriesOptionalMedicationActivity(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationsSection_validateMedicationsSectionTitle(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationsSection_validateMedicationsSectionText(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationsSection_validateMedicationsSectionMedication(personalMedicationListSection, diagnostics, context);
    if (result || diagnostics != null) result &= validatePersonalMedicationListSection_validatePersonalMedicationListSectionMedication(personalMedicationListSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validatePersonalMedicationListSectionMedication constraint of '<em>Personal Medication List Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePersonalMedicationListSection_validatePersonalMedicationListSectionMedication(PersonalMedicationListSection personalMedicationListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return personalMedicationListSection.validatePersonalMedicationListSectionMedication(diagnostics, context);
  }

	/**
   * Validates the validateMedicationsSectionEntriesOptionalTemplateId constraint of '<em>Personal Medication List Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validatePersonalMedicationListSection_validateMedicationsSectionEntriesOptionalTemplateId(PersonalMedicationListSection personalMedicationListSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return personalMedicationListSection.validateMedicationsSectionEntriesOptionalTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(medicationActivity, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityDoseQuantityorrateQuantity(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityTextReference(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityEffectiveTimeIVLTS(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityEffectiveTimePIVLTS(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityDoseQuantityUnit(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityDrugVehicleTypeCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityInstructionsInversionInd(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityPreconditionSubstanceAdmTypeCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityTemplateId(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityClassCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityMoodCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityId(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityStatusCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityRouteCodeP(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityRouteCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityApproachSiteCodeP(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityApproachSiteCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityAdministrationUnitCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityText(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityRepeatNumber(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityMedicationSupplyOrder(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityPerformer(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityInstructions(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityIndication(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityMedicationDispense(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityPrecondition(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityDrugVehicle(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityConsumable(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMtmMedicationActivityTemplateId(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMtmMedicationActivityText(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMtmMedicationActivityPresciber(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMtmMedicationActivityIndicationEntryRelationship(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMtmMedicationActivityStopReasonEntryRelationship(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMtmMedicationActivityReminderEntryRelationship(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMtmMedicationActivityInstructionsEntryRelationship(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMtmMedicationActivityGoalsEntryRelationship(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityPrescriberAssignedPresciberPersonName(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityPrescriberTemplateId(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityPrescriberTypeCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityPrescriberAssignedAuthor(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityIndicationEntryRelationshipTypeCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityIndicationEntryRelationshipIndication(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityStopReasonEntryRelationshipTypeCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityReminderEntryRelationshipTypeCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityReminderEntryRelationshipReminder(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityInstructionEntryRelationshipTypeCode(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityInstructionEntryRelationshipInstructions(medicationActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActivity_validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(medicationActivity, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateMtmMedicationActivityTemplateId constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMtmMedicationActivityTemplateId(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMtmMedicationActivityTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateMtmMedicationActivityText constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMtmMedicationActivityText(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMtmMedicationActivityText(diagnostics, context);
  }

	/**
   * Validates the validateMtmMedicationActivityPresciber constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMtmMedicationActivityPresciber(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMtmMedicationActivityPresciber(diagnostics, context);
  }

	/**
   * Validates the validateMtmMedicationActivityIndicationEntryRelationship constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMtmMedicationActivityIndicationEntryRelationship(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMtmMedicationActivityIndicationEntryRelationship(diagnostics, context);
  }

	/**
   * Validates the validateMtmMedicationActivityStopReasonEntryRelationship constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMtmMedicationActivityStopReasonEntryRelationship(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMtmMedicationActivityStopReasonEntryRelationship(diagnostics, context);
  }

	/**
   * Validates the validateMtmMedicationActivityReminderEntryRelationship constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMtmMedicationActivityReminderEntryRelationship(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMtmMedicationActivityReminderEntryRelationship(diagnostics, context);
  }

	/**
   * Validates the validateMtmMedicationActivityInstructionsEntryRelationship constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMtmMedicationActivityInstructionsEntryRelationship(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMtmMedicationActivityInstructionsEntryRelationship(diagnostics, context);
  }

	/**
   * Validates the validateMtmMedicationActivityGoalsEntryRelationship constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMtmMedicationActivityGoalsEntryRelationship(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMtmMedicationActivityGoalsEntryRelationship(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityPrescriberAssignedPresciberPersonName constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityPrescriberAssignedPresciberPersonName(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityPrescriberAssignedPresciberPersonName(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityPrescriberAssignedPresciberAssignedPerson constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityPrescriberTemplateId constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityPrescriberTemplateId(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityPrescriberTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityPrescriberTypeCode constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityPrescriberTypeCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityPrescriberTypeCode(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityPrescriberAssignedAuthor constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityPrescriberAssignedAuthor(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityPrescriberAssignedAuthor(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityIndicationEntryRelationshipTypeCode constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityIndicationEntryRelationshipTypeCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityIndicationEntryRelationshipTypeCode(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityIndicationEntryRelationshipIndication constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityIndicationEntryRelationshipIndication(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityIndicationEntryRelationshipIndication(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityStopReasonEntryRelationshipTypeCode constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityStopReasonEntryRelationshipTypeCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityStopReasonEntryRelationshipTypeCode(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityReminderEntryRelationshipTypeCode constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityReminderEntryRelationshipTypeCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityReminderEntryRelationshipTypeCode(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityReminderEntryRelationshipReminder constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityReminderEntryRelationshipReminder(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityReminderEntryRelationshipReminder(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityInstructionEntryRelationshipTypeCode constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityInstructionEntryRelationshipTypeCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityInstructionEntryRelationshipTypeCode(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityInstructionEntryRelationshipInstructions constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityInstructionEntryRelationshipInstructions(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityInstructionEntryRelationshipInstructions(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal constraint of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivity_validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActivity.validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOtherInformationSection(OtherInformationSection otherInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(otherInformationSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(otherInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(otherInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(otherInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(otherInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(otherInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(otherInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(otherInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(otherInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(otherInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateOtherInformationSection_validateOtherInformationSectionTemplateId(otherInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateOtherInformationSection_validateOtherInformationSectionText(otherInformationSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateOtherInformationSection_validateOtherInformationSectionTitle(otherInformationSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateOtherInformationSectionTemplateId constraint of '<em>Other Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOtherInformationSection_validateOtherInformationSectionTemplateId(OtherInformationSection otherInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return otherInformationSection.validateOtherInformationSectionTemplateId(diagnostics, context);
  }

	/**
   * Validates the validateOtherInformationSectionText constraint of '<em>Other Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOtherInformationSection_validateOtherInformationSectionText(OtherInformationSection otherInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return otherInformationSection.validateOtherInformationSectionText(diagnostics, context);
  }

	/**
   * Validates the validateOtherInformationSectionTitle constraint of '<em>Other Information Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateOtherInformationSection_validateOtherInformationSectionTitle(OtherInformationSection otherInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return otherInformationSection.validateOtherInformationSectionTitle(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanSection(MedicationActionPlanSection medicationActionPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(medicationActionPlanSection, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanSection_validatePlanOfCareSectionTemplateId(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionCode(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionText(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityAct(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityEncounter(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityObservation(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivityProcedure(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySubstanceAdministration(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareSection_validatePlanOfCareSectionPlanOfCareActivitySupply(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanSection_validateMedicationActionPlanSectionTitle(medicationActionPlanSection, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanSection_validateMedicationActionPlanSectionMedicationActionPlanEncounter(medicationActionPlanSection, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateMedicationActionPlanSectionTitle constraint of '<em>Medication Action Plan Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanSection_validateMedicationActionPlanSectionTitle(MedicationActionPlanSection medicationActionPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanSection.validateMedicationActionPlanSectionTitle(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActionPlanSectionMedicationActionPlanEncounter constraint of '<em>Medication Action Plan Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanSection_validateMedicationActionPlanSectionMedicationActionPlanEncounter(MedicationActionPlanSection medicationActionPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanSection.validateMedicationActionPlanSectionMedicationActionPlanEncounter(diagnostics, context);
  }

	/**
   * Validates the validatePlanOfCareSectionTemplateId constraint of '<em>Medication Action Plan Section</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanSection_validatePlanOfCareSectionTemplateId(MedicationActionPlanSection medicationActionPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanSection.validatePlanOfCareSectionTemplateId(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanEncounter(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(medicationActionPlanEncounter, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterTemplateId(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterClassCode(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterMoodCode(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityEncounter_validatePlanOfCareActivityEncounterId(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterEffectiveTime(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterText(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterCode(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterCodeP(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterMedicationActionPlanActivity(medicationActionPlanEncounter, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterMedicationActionPlanObservation(medicationActionPlanEncounter, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateMedicationActionPlanEncounterEffectiveTime constraint of '<em>Medication Action Plan Encounter</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterEffectiveTime(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanEncounter.validateMedicationActionPlanEncounterEffectiveTime(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActionPlanEncounterText constraint of '<em>Medication Action Plan Encounter</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterText(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanEncounter.validateMedicationActionPlanEncounterText(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActionPlanEncounterCode constraint of '<em>Medication Action Plan Encounter</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterCode(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanEncounter.validateMedicationActionPlanEncounterCode(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActionPlanEncounterCodeP constraint of '<em>Medication Action Plan Encounter</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterCodeP(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanEncounter.validateMedicationActionPlanEncounterCodeP(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActionPlanEncounterMedicationActionPlanActivity constraint of '<em>Medication Action Plan Encounter</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterMedicationActionPlanActivity(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanEncounter.validateMedicationActionPlanEncounterMedicationActionPlanActivity(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActionPlanEncounterMedicationActionPlanObservation constraint of '<em>Medication Action Plan Encounter</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanEncounter_validateMedicationActionPlanEncounterMedicationActionPlanObservation(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanEncounter.validateMedicationActionPlanEncounterMedicationActionPlanObservation(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanActivity(MedicationActionPlanActivity medicationActionPlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(medicationActionPlanActivity, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanActivity_validatePlanOfCareActivityActTemplateId(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityAct_validatePlanOfCareActivityActClassCode(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanActivity_validatePlanOfCareActivityActMoodCode(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityAct_validatePlanOfCareActivityActId(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanActivity_validateMedicationActionPlanActivityText(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanActivity_validateMedicationActionPlanActivityCodeP(medicationActionPlanActivity, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanActivity_validateMedicationActionPlanActivityCode(medicationActionPlanActivity, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateMedicationActionPlanActivityText constraint of '<em>Medication Action Plan Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanActivity_validateMedicationActionPlanActivityText(MedicationActionPlanActivity medicationActionPlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanActivity.validateMedicationActionPlanActivityText(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActionPlanActivityCodeP constraint of '<em>Medication Action Plan Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanActivity_validateMedicationActionPlanActivityCodeP(MedicationActionPlanActivity medicationActionPlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanActivity.validateMedicationActionPlanActivityCodeP(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActionPlanActivityCode constraint of '<em>Medication Action Plan Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanActivity_validateMedicationActionPlanActivityCode(MedicationActionPlanActivity medicationActionPlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanActivity.validateMedicationActionPlanActivityCode(diagnostics, context);
  }

	/**
   * Validates the validatePlanOfCareActivityActTemplateId constraint of '<em>Medication Action Plan Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanActivity_validatePlanOfCareActivityActTemplateId(MedicationActionPlanActivity medicationActionPlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanActivity.validatePlanOfCareActivityActTemplateId(diagnostics, context);
  }

	/**
   * Validates the validatePlanOfCareActivityActMoodCode constraint of '<em>Medication Action Plan Activity</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanActivity_validatePlanOfCareActivityActMoodCode(MedicationActionPlanActivity medicationActionPlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanActivity.validatePlanOfCareActivityActMoodCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanObservation(MedicationActionPlanObservation medicationActionPlanObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(medicationActionPlanObservation, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(medicationActionPlanObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationActionPlanObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationActionPlanObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationActionPlanObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(medicationActionPlanObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationActionPlanObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationActionPlanObservation, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationTemplateId(medicationActionPlanObservation, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationClassCode(medicationActionPlanObservation, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationMoodCode(medicationActionPlanObservation, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationId(medicationActionPlanObservation, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanObservation_validateMedicationActionPlanObservationText(medicationActionPlanObservation, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateMedicationActionPlanObservationText constraint of '<em>Medication Action Plan Observation</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanObservation_validateMedicationActionPlanObservationText(MedicationActionPlanObservation medicationActionPlanObservation, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanObservation.validateMedicationActionPlanObservationText(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanGoal(MedicationActionPlanGoal medicationActionPlanGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
    if (!validate_NoCircularContainment(medicationActionPlanGoal, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationTemplateId(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationClassCode(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanGoal_validatePlanOfCareActivityObservationMoodCode(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validatePlanOfCareActivityObservation_validatePlanOfCareActivityObservationId(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanGoal_validateMedicationActionPlanGoalMoodCode(medicationActionPlanGoal, diagnostics, context);
    if (result || diagnostics != null) result &= validateMedicationActionPlanGoal_validateMedicationActionPlanGoalText(medicationActionPlanGoal, diagnostics, context);
    return result;
  }

	/**
   * Validates the validateMedicationActionPlanGoalMoodCode constraint of '<em>Medication Action Plan Goal</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanGoal_validateMedicationActionPlanGoalMoodCode(MedicationActionPlanGoal medicationActionPlanGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanGoal.validateMedicationActionPlanGoalMoodCode(diagnostics, context);
  }

	/**
   * Validates the validateMedicationActionPlanGoalText constraint of '<em>Medication Action Plan Goal</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanGoal_validateMedicationActionPlanGoalText(MedicationActionPlanGoal medicationActionPlanGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanGoal.validateMedicationActionPlanGoalText(diagnostics, context);
  }

	/**
   * Validates the validatePlanOfCareActivityObservationMoodCode constraint of '<em>Medication Action Plan Goal</em>'.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanGoal_validatePlanOfCareActivityObservationMoodCode(MedicationActionPlanGoal medicationActionPlanGoal, DiagnosticChain diagnostics, Map<Object, Object> context) {
    return medicationActionPlanGoal.validatePlanOfCareActivityObservationMoodCode(diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReminder(Reminder reminder, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(reminder, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsTextReference(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsTextReferenceValue(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= validateReminder_validateInstructionsTemplateId(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsClassCode(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsMoodCode(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsCode(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsText(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsStatusCode(reminder, diagnostics, context);
    if (result || diagnostics != null) result &= validateReminder_validateReminderText(reminder, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateReminderText constraint of '<em>Reminder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReminder_validateReminderText(Reminder reminder, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reminder.validateReminderText(diagnostics, context);
  }

  /**
   * Validates the validateInstructionsTemplateId constraint of '<em>Reminder</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateReminder_validateInstructionsTemplateId(Reminder reminder, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return reminder.validateInstructionsTemplateId(diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInstructions(Instructions instructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    if (!validate_NoCircularContainment(instructions, diagnostics, context)) return false;
    boolean result = validate_EveryMultiplicityConforms(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryDataValueConforms(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryProxyResolves(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_UniqueID(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryKeyUnique(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsTextReference(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsTextReferenceValue(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= validateInstructions_validateInstructionsTemplateId(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsClassCode(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsMoodCode(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsCode(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsText(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= consolValidator.validateInstructions_validateInstructionsStatusCode(instructions, diagnostics, context);
    if (result || diagnostics != null) result &= validateInstructions_validateMtmInstructionsText(instructions, diagnostics, context);
    return result;
  }

  /**
   * Validates the validateMtmInstructionsText constraint of '<em>Instructions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInstructions_validateMtmInstructionsText(Instructions instructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return instructions.validateMtmInstructionsText(diagnostics, context);
  }

  /**
   * Validates the validateInstructionsTemplateId constraint of '<em>Instructions</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateInstructions_validateInstructionsTemplateId(Instructions instructions, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return instructions.validateInstructionsTemplateId(diagnostics, context);
  }

  /**
   * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public ResourceLocator getResourceLocator() {
    return MtmPlugin.INSTANCE;
  }

} //MtmValidator
