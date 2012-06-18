/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.mtm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MtmFactoryImpl extends EFactoryImpl implements MtmFactory {
	/**
   * Creates the default factory implementation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public static MtmFactory init() {
    try
    {
      MtmFactory theMtmFactory = (MtmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/mtm"); 
      if (theMtmFactory != null)
      {
        return theMtmFactory;
      }
    }
    catch (Exception exception)
    {
      EcorePlugin.INSTANCE.log(exception);
    }
    return new MtmFactoryImpl();
  }

	/**
   * Creates an instance of the factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MtmFactoryImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public EObject create(EClass eClass) {
    switch (eClass.getClassifierID())
    {
      case MtmPackage.MEDICATION_THERAPY_MANAGEMENT_PROGRAM: return createMedicationTherapyManagementProgram();
      case MtmPackage.PERSONAL_MEDICATION_LIST_SECTION: return createPersonalMedicationListSection();
      case MtmPackage.MEDICATION_ACTIVITY: return createMedicationActivity();
      case MtmPackage.OTHER_INFORMATION_SECTION: return createOtherInformationSection();
      case MtmPackage.MEDICATION_ACTION_PLAN_SECTION: return createMedicationActionPlanSection();
      case MtmPackage.MEDICATION_ACTION_PLAN_ENCOUNTER: return createMedicationActionPlanEncounter();
      case MtmPackage.MEDICATION_ACTION_PLAN_ACTIVITY: return createMedicationActionPlanActivity();
      case MtmPackage.MEDICATION_ACTION_PLAN_OBSERVATION: return createMedicationActionPlanObservation();
      case MtmPackage.MEDICATION_ACTION_PLAN_GOAL: return createMedicationActionPlanGoal();
      case MtmPackage.REMINDER: return createReminder();
      case MtmPackage.INSTRUCTIONS: return createInstructions();
      default:
        throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
    }
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationTherapyManagementProgram createMedicationTherapyManagementProgram() {
    MedicationTherapyManagementProgramImpl medicationTherapyManagementProgram = new MedicationTherapyManagementProgramImpl();
    return medicationTherapyManagementProgram;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public PersonalMedicationListSection createPersonalMedicationListSection() {
    PersonalMedicationListSectionImpl personalMedicationListSection = new PersonalMedicationListSectionImpl();
    return personalMedicationListSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActivity createMedicationActivity() {
    MedicationActivityImpl medicationActivity = new MedicationActivityImpl();
    return medicationActivity;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public OtherInformationSection createOtherInformationSection() {
    OtherInformationSectionImpl otherInformationSection = new OtherInformationSectionImpl();
    return otherInformationSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActionPlanSection createMedicationActionPlanSection() {
    MedicationActionPlanSectionImpl medicationActionPlanSection = new MedicationActionPlanSectionImpl();
    return medicationActionPlanSection;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActionPlanEncounter createMedicationActionPlanEncounter() {
    MedicationActionPlanEncounterImpl medicationActionPlanEncounter = new MedicationActionPlanEncounterImpl();
    return medicationActionPlanEncounter;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActionPlanActivity createMedicationActionPlanActivity() {
    MedicationActionPlanActivityImpl medicationActionPlanActivity = new MedicationActionPlanActivityImpl();
    return medicationActionPlanActivity;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActionPlanObservation createMedicationActionPlanObservation() {
    MedicationActionPlanObservationImpl medicationActionPlanObservation = new MedicationActionPlanObservationImpl();
    return medicationActionPlanObservation;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActionPlanGoal createMedicationActionPlanGoal() {
    MedicationActionPlanGoalImpl medicationActionPlanGoal = new MedicationActionPlanGoalImpl();
    return medicationActionPlanGoal;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Reminder createReminder()
  {
    ReminderImpl reminder = new ReminderImpl();
    return reminder;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Instructions createInstructions()
  {
    InstructionsImpl instructions = new InstructionsImpl();
    return instructions;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MtmPackage getMtmPackage() {
    return (MtmPackage)getEPackage();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @deprecated
   * @generated
   */
	@Deprecated
	public static MtmPackage getPackage() {
    return MtmPackage.eINSTANCE;
  }

} //MtmFactoryImpl
