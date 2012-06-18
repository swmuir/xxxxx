/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

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
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.mtm.MtmPackage
 * @generated
 */
public class MtmAdapterFactory extends AdapterFactoryImpl {
	/**
   * The cached model package.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected static MtmPackage modelPackage;

	/**
   * Creates an instance of the adapter factory.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MtmAdapterFactory() {
    if (modelPackage == null)
    {
      modelPackage = MtmPackage.eINSTANCE;
    }
  }

	/**
   * Returns whether this factory is applicable for the type of the object.
   * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
   * @return whether this factory is applicable for the type of the object.
   * @generated
   */
	@Override
	public boolean isFactoryForType(Object object) {
    if (object == modelPackage)
    {
      return true;
    }
    if (object instanceof EObject)
    {
      return ((EObject)object).eClass().getEPackage() == modelPackage;
    }
    return false;
  }

	/**
   * The switch that delegates to the <code>createXXX</code> methods.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MtmSwitch<Adapter> modelSwitch =
		new MtmSwitch<Adapter>()
    {
      @Override
      public Adapter caseMedicationTherapyManagementProgram(MedicationTherapyManagementProgram object)
      {
        return createMedicationTherapyManagementProgramAdapter();
      }
      @Override
      public Adapter casePersonalMedicationListSection(PersonalMedicationListSection object)
      {
        return createPersonalMedicationListSectionAdapter();
      }
      @Override
      public Adapter caseMedicationActivity(MedicationActivity object)
      {
        return createMedicationActivityAdapter();
      }
      @Override
      public Adapter caseOtherInformationSection(OtherInformationSection object)
      {
        return createOtherInformationSectionAdapter();
      }
      @Override
      public Adapter caseMedicationActionPlanSection(MedicationActionPlanSection object)
      {
        return createMedicationActionPlanSectionAdapter();
      }
      @Override
      public Adapter caseMedicationActionPlanEncounter(MedicationActionPlanEncounter object)
      {
        return createMedicationActionPlanEncounterAdapter();
      }
      @Override
      public Adapter caseMedicationActionPlanActivity(MedicationActionPlanActivity object)
      {
        return createMedicationActionPlanActivityAdapter();
      }
      @Override
      public Adapter caseMedicationActionPlanObservation(MedicationActionPlanObservation object)
      {
        return createMedicationActionPlanObservationAdapter();
      }
      @Override
      public Adapter caseMedicationActionPlanGoal(MedicationActionPlanGoal object)
      {
        return createMedicationActionPlanGoalAdapter();
      }
      @Override
      public Adapter caseReminder(Reminder object)
      {
        return createReminderAdapter();
      }
      @Override
      public Adapter caseInstructions(Instructions object)
      {
        return createInstructionsAdapter();
      }
      @Override
      public Adapter caseInfrastructureRoot(InfrastructureRoot object)
      {
        return createInfrastructureRootAdapter();
      }
      @Override
      public Adapter caseAct(Act object)
      {
        return createActAdapter();
      }
      @Override
      public Adapter caseClinicalDocument(ClinicalDocument object)
      {
        return createClinicalDocumentAdapter();
      }
      @Override
      public Adapter caseGeneralHeaderConstraints(GeneralHeaderConstraints object)
      {
        return createGeneralHeaderConstraintsAdapter();
      }
      @Override
      public Adapter caseSection(Section object)
      {
        return createSectionAdapter();
      }
      @Override
      public Adapter caseMedicationsSectionEntriesOptional(MedicationsSectionEntriesOptional object)
      {
        return createMedicationsSectionEntriesOptionalAdapter();
      }
      @Override
      public Adapter caseMedicationsSection(MedicationsSection object)
      {
        return createMedicationsSectionAdapter();
      }
      @Override
      public Adapter caseClinicalStatement(ClinicalStatement object)
      {
        return createClinicalStatementAdapter();
      }
      @Override
      public Adapter caseSubstanceAdministration(SubstanceAdministration object)
      {
        return createSubstanceAdministrationAdapter();
      }
      @Override
      public Adapter caseConsol_MedicationActivity(org.openhealthtools.mdht.uml.cda.consol.MedicationActivity object)
      {
        return createConsol_MedicationActivityAdapter();
      }
      @Override
      public Adapter casePlanOfCareSection(PlanOfCareSection object)
      {
        return createPlanOfCareSectionAdapter();
      }
      @Override
      public Adapter caseEncounter(Encounter object)
      {
        return createEncounterAdapter();
      }
      @Override
      public Adapter casePlanOfCareActivityEncounter(PlanOfCareActivityEncounter object)
      {
        return createPlanOfCareActivityEncounterAdapter();
      }
      @Override
      public Adapter caseCDA_Act(org.openhealthtools.mdht.uml.cda.Act object)
      {
        return createCDA_ActAdapter();
      }
      @Override
      public Adapter casePlanOfCareActivityAct(PlanOfCareActivityAct object)
      {
        return createPlanOfCareActivityActAdapter();
      }
      @Override
      public Adapter caseObservation(Observation object)
      {
        return createObservationAdapter();
      }
      @Override
      public Adapter casePlanOfCareActivityObservation(PlanOfCareActivityObservation object)
      {
        return createPlanOfCareActivityObservationAdapter();
      }
      @Override
      public Adapter caseConsol_Instructions(org.openhealthtools.mdht.uml.cda.consol.Instructions object)
      {
        return createConsol_InstructionsAdapter();
      }
      @Override
      public Adapter defaultCase(EObject object)
      {
        return createEObjectAdapter();
      }
    };

	/**
   * Creates an adapter for the <code>target</code>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @param target the object to adapt.
   * @return the adapter for the <code>target</code>.
   * @generated
   */
	@Override
	public Adapter createAdapter(Notifier target) {
    return modelSwitch.doSwitch((EObject)target);
  }


	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram <em>Medication Therapy Management Program</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram
   * @generated
   */
	public Adapter createMedicationTherapyManagementProgramAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationListSection <em>Personal Medication List Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationListSection
   * @generated
   */
	public Adapter createPersonalMedicationListSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity <em>Medication Activity</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity
   * @generated
   */
	public Adapter createMedicationActivityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection <em>Other Information Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection
   * @generated
   */
	public Adapter createOtherInformationSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection <em>Medication Action Plan Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection
   * @generated
   */
	public Adapter createMedicationActionPlanSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter <em>Medication Action Plan Encounter</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter
   * @generated
   */
	public Adapter createMedicationActionPlanEncounterAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity <em>Medication Action Plan Activity</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity
   * @generated
   */
	public Adapter createMedicationActionPlanActivityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanObservation <em>Medication Action Plan Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanObservation
   * @generated
   */
	public Adapter createMedicationActionPlanObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanGoal <em>Medication Action Plan Goal</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanGoal
   * @generated
   */
	public Adapter createMedicationActionPlanGoalAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mtm.Reminder <em>Reminder</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.mtm.Reminder
   * @generated
   */
  public Adapter createReminderAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot <em>Infrastructure Root</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.InfrastructureRoot
   * @generated
   */
	public Adapter createInfrastructureRootAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.hl7.rim.Act <em>Act</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.hl7.rim.Act
   * @generated
   */
	public Adapter createActAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalDocument <em>Clinical Document</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ClinicalDocument
   * @generated
   */
	public Adapter createClinicalDocumentAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints <em>General Header Constraints</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.consol.GeneralHeaderConstraints
   * @generated
   */
	public Adapter createGeneralHeaderConstraintsAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Section <em>Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Section
   * @generated
   */
	public Adapter createSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional <em>Medications Section Entries Optional</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsSectionEntriesOptional
   * @generated
   */
	public Adapter createMedicationsSectionEntriesOptionalAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationsSection <em>Medications Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.consol.MedicationsSection
   * @generated
   */
	public Adapter createMedicationsSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.ClinicalStatement <em>Clinical Statement</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.ClinicalStatement
   * @generated
   */
	public Adapter createClinicalStatementAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.SubstanceAdministration <em>Substance Administration</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.SubstanceAdministration
   * @generated
   */
	public Adapter createSubstanceAdministrationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.MedicationActivity <em>Medication Activity</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.consol.MedicationActivity
   * @generated
   */
	public Adapter createConsol_MedicationActivityAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection <em>Plan Of Care Section</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection
   * @generated
   */
	public Adapter createPlanOfCareSectionAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Encounter <em>Encounter</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Encounter
   * @generated
   */
	public Adapter createEncounterAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter <em>Plan Of Care Activity Encounter</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityEncounter
   * @generated
   */
	public Adapter createPlanOfCareActivityEncounterAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Act <em>Act</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Act
   * @generated
   */
	public Adapter createCDA_ActAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct <em>Plan Of Care Activity Act</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityAct
   * @generated
   */
	public Adapter createPlanOfCareActivityActAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.Observation <em>Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.Observation
   * @generated
   */
	public Adapter createObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation <em>Plan Of Care Activity Observation</em>}'.
   * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.consol.PlanOfCareActivityObservation
   * @generated
   */
	public Adapter createPlanOfCareActivityObservationAdapter() {
    return null;
  }

	/**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.consol.Instructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.consol.Instructions
   * @generated
   */
  public Adapter createConsol_InstructionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for an object of class '{@link org.openhealthtools.mdht.uml.cda.mtm.Instructions <em>Instructions</em>}'.
   * <!-- begin-user-doc -->
   * This default implementation returns null so that we can easily ignore cases;
   * it's useful to ignore a case when inheritance will catch all the cases anyway.
   * <!-- end-user-doc -->
   * @return the new adapter.
   * @see org.openhealthtools.mdht.uml.cda.mtm.Instructions
   * @generated
   */
  public Adapter createInstructionsAdapter()
  {
    return null;
  }

  /**
   * Creates a new adapter for the default case.
   * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
   * @return the new adapter.
   * @generated
   */
	public Adapter createEObjectAdapter() {
    return null;
  }

} //MtmAdapterFactory
