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

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPlugin;

import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Action Plan Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection#validateMedicationActionPlanSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Section Title</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection#validateMedicationActionPlanSectionMedicationActionPlanEncounter(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Section Medication Action Plan Encounter</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection#getMedicationActionPlanEncounters() <em>Get Medication Action Plan Encounters</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection#validatePlanOfCareSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationActionPlanSectionOperations extends PlanOfCareSectionOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicationActionPlanSectionOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanSectionTitle(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Section Title</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanSectionTitle(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTION_PLAN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanSectionTitle(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanSectionTitle(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
   * @param medicationActionPlanSection The receiving '<em><b>Medication Action Plan Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationActionPlanSectionTitle(MedicationActionPlanSection medicationActionPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_SECTION);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_SECTION__MEDICATION_ACTION_PLAN_SECTION_TITLE,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanSectionTitle"),
             new Object [] { medicationActionPlanSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanSectionMedicationActionPlanEncounter(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Section Medication Action Plan Encounter</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanSectionMedicationActionPlanEncounter(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTION_PLAN_SECTION_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanSectionMedicationActionPlanEncounter(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Section Medication Action Plan Encounter</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanSectionMedicationActionPlanEncounter(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_SECTION_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter))
   * @param medicationActionPlanSection The receiving '<em><b>Medication Action Plan Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationActionPlanSectionMedicationActionPlanEncounter(MedicationActionPlanSection medicationActionPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_SECTION_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_SECTION);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_SECTION_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_SECTION_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_SECTION_MEDICATION_ACTION_PLAN_ENCOUNTER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_SECTION__MEDICATION_ACTION_PLAN_SECTION_MEDICATION_ACTION_PLAN_ENCOUNTER,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanSectionMedicationActionPlanEncounter"),
             new Object [] { medicationActionPlanSection }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getMedicationActionPlanEncounters(MedicationActionPlanSection) <em>Get Medication Action Plan Encounters</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationActionPlanEncounters(MedicationActionPlanSection)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATION_ACTION_PLAN_ENCOUNTERS__EOCL_EXP = "self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter)).oclAsType(mtm::MedicationActionPlanEncounter)";

	/**
   * The cached OCL query for the '{@link #getMedicationActionPlanEncounters(MedicationActionPlanSection) <em>Get Medication Action Plan Encounters</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationActionPlanEncounters(MedicationActionPlanSection)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTION_PLAN_ENCOUNTERS__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter)).oclAsType(mtm::MedicationActionPlanEncounter)
   * @param medicationActionPlanSection The receiving '<em><b>Medication Action Plan Section</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  EList<MedicationActionPlanEncounter> getMedicationActionPlanEncounters(MedicationActionPlanSection medicationActionPlanSection) {
    if (GET_MEDICATION_ACTION_PLAN_ENCOUNTERS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_SECTION, MtmPackage.Literals.MEDICATION_ACTION_PLAN_SECTION.getEAllOperations().get(72));
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
    Collection<MedicationActionPlanEncounter> result = (Collection<MedicationActionPlanEncounter>) query.evaluate(medicationActionPlanSection);
    return new BasicEList.UnmodifiableEList<MedicationActionPlanEncounter>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #validatePlanOfCareSectionTemplateId(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlanOfCareSectionTemplateId(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.555')";

	/**
   * The cached OCL invariant for the '{@link #validatePlanOfCareSectionTemplateId(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlanOfCareSectionTemplateId(MedicationActionPlanSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.555')
   * @param medicationActionPlanSection The receiving '<em><b>Medication Action Plan Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePlanOfCareSectionTemplateId(MedicationActionPlanSection medicationActionPlanSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_SECTION);
      try
      {
        VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_SECTION__PLAN_OF_CARE_SECTION_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlanOfCareSectionTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActionPlanSection, context) }),
             new Object [] { medicationActionPlanSection }));
      }
       
      return false;
    }
    return true;
  }

} // MedicationActionPlanSectionOperations