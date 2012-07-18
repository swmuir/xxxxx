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

import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivityEncounterOperations;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanObservation;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPlugin;

import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Action Plan Encounter</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter#validateMedicationActionPlanEncounterEffectiveTime(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Effective Time</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter#validateMedicationActionPlanEncounterText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter#validateMedicationActionPlanEncounterCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter#validateMedicationActionPlanEncounterCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter#validateMedicationActionPlanEncounterMedicationActionPlanActivity(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Medication Action Plan Activity</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter#validateMedicationActionPlanEncounterMedicationActionPlanObservation(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Medication Action Plan Observation</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter#getMedicationActionPlanActivities() <em>Get Medication Action Plan Activities</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter#getMedicationActionPlanObservation() <em>Get Medication Action Plan Observation</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationActionPlanEncounterOperations extends PlanOfCareActivityEncounterOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicationActionPlanEncounterOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanEncounterEffectiveTime(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Effective Time</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterEffectiveTime(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanEncounterEffectiveTime(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Effective Time</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterEffectiveTime(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.effectiveTime.oclIsUndefined() or self.effectiveTime.isNullFlavorUndefined()) implies (not self.effectiveTime.oclIsUndefined())
   * @param medicationActionPlanEncounter The receiving '<em><b>Medication Action Plan Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationActionPlanEncounterEffectiveTime(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ENCOUNTER);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_EFFECTIVE_TIME__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_EFFECTIVE_TIME,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanEncounterEffectiveTime"),
             new Object [] { medicationActionPlanEncounter }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanEncounterText(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterText(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanEncounterText(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterText(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
   * @param medicationActionPlanEncounter The receiving '<em><b>Medication Action Plan Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationActionPlanEncounterText(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ENCOUNTER);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_TEXT,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanEncounterText"),
             new Object [] { medicationActionPlanEncounter }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanEncounterCode(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterCode(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanEncounterCode(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterCode(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.6.96')
   * @param medicationActionPlanEncounter The receiving '<em><b>Medication Action Plan Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationActionPlanEncounterCode(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ENCOUNTER);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_CODE,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanEncounterCode"),
             new Object [] { medicationActionPlanEncounter }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanEncounterCodeP(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterCodeP(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanEncounterCodeP(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterCodeP(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param medicationActionPlanEncounter The receiving '<em><b>Medication Action Plan Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationActionPlanEncounterCodeP(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ENCOUNTER);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_CODE_P,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanEncounterCodeP"),
             new Object [] { medicationActionPlanEncounter }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanEncounterMedicationActionPlanActivity(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Medication Action Plan Activity</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterMedicationActionPlanActivity(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(mtm::MedicationActionPlanActivity))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanEncounterMedicationActionPlanActivity(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Medication Action Plan Activity</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterMedicationActionPlanActivity(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(mtm::MedicationActionPlanActivity))
   * @param medicationActionPlanEncounter The receiving '<em><b>Medication Action Plan Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationActionPlanEncounterMedicationActionPlanActivity(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ENCOUNTER);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_ACTIVITY__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_ACTIVITY,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanEncounterMedicationActionPlanActivity"),
             new Object [] { medicationActionPlanEncounter }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanEncounterMedicationActionPlanObservation(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Medication Action Plan Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterMedicationActionPlanObservation(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(mtm::MedicationActionPlanObservation))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanEncounterMedicationActionPlanObservation(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Encounter Medication Action Plan Observation</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanEncounterMedicationActionPlanObservation(MedicationActionPlanEncounter, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(mtm::MedicationActionPlanObservation))
   * @param medicationActionPlanEncounter The receiving '<em><b>Medication Action Plan Encounter</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationActionPlanEncounterMedicationActionPlanObservation(MedicationActionPlanEncounter medicationActionPlanEncounter, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ENCOUNTER);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_OBSERVATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanEncounter))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_ENCOUNTER__MEDICATION_ACTION_PLAN_ENCOUNTER_MEDICATION_ACTION_PLAN_OBSERVATION,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanEncounterMedicationActionPlanObservation"),
             new Object [] { medicationActionPlanEncounter }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getMedicationActionPlanActivities(MedicationActionPlanEncounter) <em>Get Medication Action Plan Activities</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationActionPlanActivities(MedicationActionPlanEncounter)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATION_ACTION_PLAN_ACTIVITIES__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::MedicationActionPlanActivity)).oclAsType(mtm::MedicationActionPlanActivity)";

	/**
   * The cached OCL query for the '{@link #getMedicationActionPlanActivities(MedicationActionPlanEncounter) <em>Get Medication Action Plan Activities</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationActionPlanActivities(MedicationActionPlanEncounter)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTION_PLAN_ACTIVITIES__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::MedicationActionPlanActivity)).oclAsType(mtm::MedicationActionPlanActivity)
   * @param medicationActionPlanEncounter The receiving '<em><b>Medication Action Plan Encounter</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  EList<MedicationActionPlanActivity> getMedicationActionPlanActivities(MedicationActionPlanEncounter medicationActionPlanEncounter) {
    if (GET_MEDICATION_ACTION_PLAN_ACTIVITIES__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ENCOUNTER, MtmPackage.Literals.MEDICATION_ACTION_PLAN_ENCOUNTER.getEAllOperations().get(61));
      try
      {
        GET_MEDICATION_ACTION_PLAN_ACTIVITIES__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTION_PLAN_ACTIVITIES__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTION_PLAN_ACTIVITIES__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<MedicationActionPlanActivity> result = (Collection<MedicationActionPlanActivity>) query.evaluate(medicationActionPlanEncounter);
    return new BasicEList.UnmodifiableEList<MedicationActionPlanActivity>(result.size(), result.toArray());
  }

	/**
   * The cached OCL expression body for the '{@link #getMedicationActionPlanObservation(MedicationActionPlanEncounter) <em>Get Medication Action Plan Observation</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationActionPlanObservation(MedicationActionPlanEncounter)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATION_ACTION_PLAN_OBSERVATION__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mtm::MedicationActionPlanObservation))->asSequence()->any(true).oclAsType(mtm::MedicationActionPlanObservation)";

	/**
   * The cached OCL query for the '{@link #getMedicationActionPlanObservation(MedicationActionPlanEncounter) <em>Get Medication Action Plan Observation</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationActionPlanObservation(MedicationActionPlanEncounter)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTION_PLAN_OBSERVATION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mtm::MedicationActionPlanObservation))->asSequence()->any(true).oclAsType(mtm::MedicationActionPlanObservation)
   * @param medicationActionPlanEncounter The receiving '<em><b>Medication Action Plan Encounter</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  MedicationActionPlanObservation getMedicationActionPlanObservation(MedicationActionPlanEncounter medicationActionPlanEncounter) {
    if (GET_MEDICATION_ACTION_PLAN_OBSERVATION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ENCOUNTER, MtmPackage.Literals.MEDICATION_ACTION_PLAN_ENCOUNTER.getEAllOperations().get(62));
      try
      {
        GET_MEDICATION_ACTION_PLAN_OBSERVATION__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTION_PLAN_OBSERVATION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTION_PLAN_OBSERVATION__EOCL_QRY);
    return (MedicationActionPlanObservation) query.evaluate(medicationActionPlanEncounter);
  }

} // MedicationActionPlanEncounterOperations