/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.openhealthtools.mdht.uml.cda.ClinicalDocument;
import org.openhealthtools.mdht.uml.cda.ClinicalStatement;
import org.openhealthtools.mdht.uml.cda.Encounter;
import org.openhealthtools.mdht.uml.cda.Observation;
import org.openhealthtools.mdht.uml.cda.Section;
import org.openhealthtools.mdht.uml.cda.SubstanceAdministration;

import org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;
import org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation;
import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;

import org.openhealthtools.mdht.uml.cda.mtm.*;

import org.openhealthtools.mdht.uml.hl7.rim.Act;
import org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.mtm.MtmPackage
 * @generated
 */
public class MtmSwitch<T> {
	/**
   * The cached model package
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static MtmPackage modelPackage;

	/**
   * Creates an instance of the switch.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MtmSwitch() {
    if (modelPackage == null)
    {
      modelPackage = MtmPackage.eINSTANCE;
    }
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	public T doSwitch(EObject theEObject) {
    return doSwitch(theEObject.eClass(), theEObject);
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
    if (theEClass.eContainer() == modelPackage)
    {
      return doSwitch(theEClass.getClassifierID(), theEObject);
    }
    else
    {
      List<EClass> eSuperTypes = theEClass.getESuperTypes();
      return
        eSuperTypes.isEmpty() ?
          defaultCase(theEObject) :
          doSwitch(eSuperTypes.get(0), theEObject);
    }
  }

	/**
   * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @return the first non-null result returned by a <code>caseXXX</code> call.
   * @generated
   */
	protected T doSwitch(int classifierID, EObject theEObject) {
    switch (classifierID)
    {
      case MtmPackage.MEDICATION_THERAPY_MANAGEMENT_PROGRAM:
      {
        MedicationTherapyManagementProgram medicationTherapyManagementProgram = (MedicationTherapyManagementProgram)theEObject;
        T result = caseMedicationTherapyManagementProgram(medicationTherapyManagementProgram);
        if (result == null) result = caseGeneralHeaderConstraints(medicationTherapyManagementProgram);
        if (result == null) result = caseClinicalDocument(medicationTherapyManagementProgram);
        if (result == null) result = caseAct(medicationTherapyManagementProgram);
        if (result == null) result = caseInfrastructureRoot(medicationTherapyManagementProgram);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MtmPackage.PERSONAL_MEDICATION_LIST_SECTION:
      {
        PersonalMedicationListSection personalMedicationListSection = (PersonalMedicationListSection)theEObject;
        T result = casePersonalMedicationListSection(personalMedicationListSection);
        if (result == null) result = caseMedicationsSection(personalMedicationListSection);
        if (result == null) result = caseMedicationsSectionEntriesOptional(personalMedicationListSection);
        if (result == null) result = caseSection(personalMedicationListSection);
        if (result == null) result = caseAct(personalMedicationListSection);
        if (result == null) result = caseInfrastructureRoot(personalMedicationListSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MtmPackage.MEDICATION_ACTIVITY:
      {
        MedicationActivity medicationActivity = (MedicationActivity)theEObject;
        T result = caseMedicationActivity(medicationActivity);
        if (result == null) result = caseConsol_MedicationActivity(medicationActivity);
        if (result == null) result = caseSubstanceAdministration(medicationActivity);
        if (result == null) result = caseClinicalStatement(medicationActivity);
        if (result == null) result = caseAct(medicationActivity);
        if (result == null) result = caseInfrastructureRoot(medicationActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MtmPackage.OTHER_INFORMATION_SECTION:
      {
        OtherInformationSection otherInformationSection = (OtherInformationSection)theEObject;
        T result = caseOtherInformationSection(otherInformationSection);
        if (result == null) result = caseSection(otherInformationSection);
        if (result == null) result = caseAct(otherInformationSection);
        if (result == null) result = caseInfrastructureRoot(otherInformationSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MtmPackage.MEDICATION_ACTION_PLAN_SECTION:
      {
        MedicationActionPlanSection medicationActionPlanSection = (MedicationActionPlanSection)theEObject;
        T result = caseMedicationActionPlanSection(medicationActionPlanSection);
        if (result == null) result = casePlanOfCareSection(medicationActionPlanSection);
        if (result == null) result = caseSection(medicationActionPlanSection);
        if (result == null) result = caseAct(medicationActionPlanSection);
        if (result == null) result = caseInfrastructureRoot(medicationActionPlanSection);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MtmPackage.MEDICATION_ACTION_PLAN_ENCOUNTER:
      {
        MedicationActionPlanEncounter medicationActionPlanEncounter = (MedicationActionPlanEncounter)theEObject;
        T result = caseMedicationActionPlanEncounter(medicationActionPlanEncounter);
        if (result == null) result = casePlanOfCareActivityEncounter(medicationActionPlanEncounter);
        if (result == null) result = caseEncounter(medicationActionPlanEncounter);
        if (result == null) result = caseClinicalStatement(medicationActionPlanEncounter);
        if (result == null) result = caseAct(medicationActionPlanEncounter);
        if (result == null) result = caseInfrastructureRoot(medicationActionPlanEncounter);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MtmPackage.MEDICATION_ACTION_PLAN_ACTIVITY:
      {
        MedicationActionPlanActivity medicationActionPlanActivity = (MedicationActionPlanActivity)theEObject;
        T result = caseMedicationActionPlanActivity(medicationActionPlanActivity);
        if (result == null) result = casePlanOfCareActivityAct(medicationActionPlanActivity);
        if (result == null) result = caseCDA_Act(medicationActionPlanActivity);
        if (result == null) result = caseClinicalStatement(medicationActionPlanActivity);
        if (result == null) result = caseAct(medicationActionPlanActivity);
        if (result == null) result = caseInfrastructureRoot(medicationActionPlanActivity);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MtmPackage.MEDICATION_ACTION_PLAN_OBSERVATION:
      {
        MedicationActionPlanObservation medicationActionPlanObservation = (MedicationActionPlanObservation)theEObject;
        T result = caseMedicationActionPlanObservation(medicationActionPlanObservation);
        if (result == null) result = casePlanOfCareActivityObservation(medicationActionPlanObservation);
        if (result == null) result = caseObservation(medicationActionPlanObservation);
        if (result == null) result = caseClinicalStatement(medicationActionPlanObservation);
        if (result == null) result = caseAct(medicationActionPlanObservation);
        if (result == null) result = caseInfrastructureRoot(medicationActionPlanObservation);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MtmPackage.MEDICATION_ACTION_PLAN_GOAL:
      {
        MedicationActionPlanGoal medicationActionPlanGoal = (MedicationActionPlanGoal)theEObject;
        T result = caseMedicationActionPlanGoal(medicationActionPlanGoal);
        if (result == null) result = casePlanOfCareActivityObservation(medicationActionPlanGoal);
        if (result == null) result = caseObservation(medicationActionPlanGoal);
        if (result == null) result = caseClinicalStatement(medicationActionPlanGoal);
        if (result == null) result = caseAct(medicationActionPlanGoal);
        if (result == null) result = caseInfrastructureRoot(medicationActionPlanGoal);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MtmPackage.REMINDER:
      {
        Reminder reminder = (Reminder)theEObject;
        T result = caseReminder(reminder);
        if (result == null) result = caseConsol_Instructions(reminder);
        if (result == null) result = caseCDA_Act(reminder);
        if (result == null) result = caseClinicalStatement(reminder);
        if (result == null) result = caseAct(reminder);
        if (result == null) result = caseInfrastructureRoot(reminder);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      case MtmPackage.INSTRUCTIONS:
      {
        Instructions instructions = (Instructions)theEObject;
        T result = caseInstructions(instructions);
        if (result == null) result = caseConsol_Instructions(instructions);
        if (result == null) result = caseCDA_Act(instructions);
        if (result == null) result = caseClinicalStatement(instructions);
        if (result == null) result = caseAct(instructions);
        if (result == null) result = caseInfrastructureRoot(instructions);
        if (result == null) result = defaultCase(theEObject);
        return result;
      }
      default: return defaultCase(theEObject);
    }
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medication Therapy Management Program</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medication Therapy Management Program</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicationTherapyManagementProgram(MedicationTherapyManagementProgram object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Personal Medication List Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Personal Medication List Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePersonalMedicationListSection(PersonalMedicationListSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicationActivity(MedicationActivity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Other Information Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Other Information Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseOtherInformationSection(OtherInformationSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medication Action Plan Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medication Action Plan Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicationActionPlanSection(MedicationActionPlanSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medication Action Plan Encounter</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medication Action Plan Encounter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicationActionPlanEncounter(MedicationActionPlanEncounter object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medication Action Plan Activity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medication Action Plan Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicationActionPlanActivity(MedicationActionPlanActivity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medication Action Plan Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medication Action Plan Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicationActionPlanObservation(MedicationActionPlanObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medication Action Plan Goal</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medication Action Plan Goal</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicationActionPlanGoal(MedicationActionPlanGoal object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Reminder</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Reminder</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseReminder(Reminder object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Infrastructure Root</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseInfrastructureRoot(InfrastructureRoot object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseAct(Act object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Document</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClinicalDocument(ClinicalDocument object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>General Header Constraints</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseGeneralHeaderConstraints(GeneralHeaderConstraints object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSection(Section object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medications Section Entries Optional</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medications Section Entries Optional</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medications Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medications Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseMedicationsSection(MedicationsSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Clinical Statement</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseClinicalStatement(ClinicalStatement object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Substance Administration</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseSubstanceAdministration(SubstanceAdministration object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Medication Activity</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseConsol_MedicationActivity(org.openhealthtools.mdht.uml.cda.consol.MedicationActivity object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plan Of Care Section</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePlanOfCareSection(PlanOfCareSection object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Encounter</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Encounter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseEncounter(Encounter object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Encounter</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Encounter</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePlanOfCareActivityEncounter(PlanOfCareActivityEncounter object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Act</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePlanOfCareActivityAct(PlanOfCareActivityAct object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T caseObservation(Observation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Plan Of Care Activity Observation</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Plan Of Care Activity Observation</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
	public T casePlanOfCareActivityObservation(PlanOfCareActivityObservation object) {
    return null;
  }

	/**
   * Returns the result of interpreting the object as an instance of '<em>Instructions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instructions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseConsol_Instructions(org.openhealthtools.mdht.uml.cda.consol.Instructions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>Instructions</em>'.
   * <!-- begin-user-doc -->
   * This implementation returns null;
   * returning a non-null result will terminate the switch.
   * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>Instructions</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
   * @generated
   */
  public T caseInstructions(Instructions object)
  {
    return null;
  }

  /**
   * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
   * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
   * @param object the target of the switch.
   * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
   * @see #doSwitch(org.eclipse.emf.ecore.EObject)
   * @generated
   */
	public T defaultCase(EObject object) {
    return null;
  }

} //MtmSwitch
