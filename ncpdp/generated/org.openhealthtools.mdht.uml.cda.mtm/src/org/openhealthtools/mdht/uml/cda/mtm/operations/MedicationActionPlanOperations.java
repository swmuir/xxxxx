/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareSectionOperations;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlan;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPlugin;

import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Action Plan</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlan#validateMedicationActionPlanMedicationActionPlanEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Medication Action Plan Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlan#getMedicationActionPlanEncounters() <em>Get Medication Action Plan Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlan#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationActionPlanOperations extends PlanOfCareSectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MedicationActionPlanOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanMedicationActionPlanEncounter(MedicationActionPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Medication Action Plan Encounter</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanMedicationActionPlanEncounter(MedicationActionPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICATION_ACTION_PLAN_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter))";

  /**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanMedicationActionPlanEncounter(MedicationActionPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Medication Action Plan Encounter</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanMedicationActionPlanEncounter(MedicationActionPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter))
   * @param medicationActionPlan The receiving '<em><b>Medication Action Plan</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicationActionPlanMedicationActionPlanEncounter(MedicationActionPlan medicationActionPlan, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlan))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN__MEDICATION_ACTION_PLAN_MEDICATION_ACTION_PLAN_ENCOUNTER,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanMedicationActionPlanEncounter"),
             new Object [] { medicationActionPlan }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getMedicationActionPlanEncounters(MedicationActionPlan) <em>Get Medication Action Plan Encounters</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedicationActionPlanEncounters(MedicationActionPlan)
   * @generated
   * @ordered
   */
  protected static final String GET_MEDICATION_ACTION_PLAN_ENCOUNTERS__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter)).oclAsType(mtm::MedicationActionPlanEncounter)";

  /**
   * The cached OCL query for the '{@link #getMedicationActionPlanEncounters(MedicationActionPlan) <em>Get Medication Action Plan Encounters</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getMedicationActionPlanEncounters(MedicationActionPlan)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_MEDICATION_ACTION_PLAN_ENCOUNTERS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter)).oclAsType(mtm::MedicationActionPlanEncounter)
   * @param medicationActionPlan The receiving '<em><b>Medication Action Plan</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<MedicationActionPlanEncounter> getMedicationActionPlanEncounters(MedicationActionPlan medicationActionPlan)
  {
    if (GET_MEDICATION_ACTION_PLAN_ENCOUNTERS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN, MtmPackage.Literals.MEDICATION_ACTION_PLAN.getEAllOperations().get(71));
      try
      {
        GET_MEDICATION_ACTION_PLAN_ENCOUNTERS__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTION_PLAN_ENCOUNTERS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTION_PLAN_ENCOUNTERS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<MedicationActionPlanEncounter> result = (Collection<MedicationActionPlanEncounter>) query.evaluate(medicationActionPlan);
    return new BasicEList.UnmodifiableEList<MedicationActionPlanEncounter>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #validatePlanOfCareSectionTemplateId(MedicationActionPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePlanOfCareSectionTemplateId(MedicationActionPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.555')";

  /**
   * The cached OCL invariant for the '{@link #validatePlanOfCareSectionTemplateId(MedicationActionPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePlanOfCareSectionTemplateId(MedicationActionPlan, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.555')
   * @param medicationActionPlan The receiving '<em><b>Medication Action Plan</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePlanOfCareSectionTemplateId(MedicationActionPlan medicationActionPlan, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN);
      try
      {
        VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlan))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN__PLAN_OF_CARE_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlanOfCareSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActionPlan, context) }),
             new Object [] { medicationActionPlan }));
      }
       
      return false;
    }
    return true;
  }

} // MedicationActionPlanOperations