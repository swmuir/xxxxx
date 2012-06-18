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

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.consol.CommentActivity;
import org.openhealthtools.mdht.uml.cda.consol.Indication;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanGoal;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;

import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityPresciber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Presciber</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityGoals(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Goals</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityReminders(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Reminders</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityStopReason(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Stop Reason</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#getmtmIndications() <em>Getmtm Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#getmtmInstructions() <em>Getmtm Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#getGoalss() <em>Get Goalss</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#getReminders() <em>Get Reminders</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#getStopReason() <em>Get Stop Reason</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationActivityOperations extends org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivityOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MedicationActivityOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.222')";

  /**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.222')
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMtmMedicationActivityTemplateId(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityText(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMtmMedicationActivityText(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_TEXT,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityText", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Indication</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

  /**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Indication</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMtmMedicationActivityIndication(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_INDICATION,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityIndication", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Instructions</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(mtm::MedicationActivity::Instruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

  /**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Instructions</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(mtm::MedicationActivity::Instruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMtmMedicationActivityInstructions(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_INSTRUCTIONS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityInstructions", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityPresciber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Presciber</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityPresciber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_PRESCIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))";

  /**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityPresciber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Presciber</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityPresciber(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_PRESCIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMtmMedicationActivityPresciber(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_PRESCIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_PRESCIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_PRESCIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_PRESCIBER__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_PRESCIBER,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityPresciber", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityGoals(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Goals</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityGoals(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(mtm::MedicationActionPlanGoal))";

  /**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityGoals(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Goals</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityGoals(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(mtm::MedicationActionPlanGoal))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMtmMedicationActivityGoals(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_GOALS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityGoals", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityReminders(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Reminders</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityReminders(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(mtm::MedicationActivity::Reminder) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SPRT)";

  /**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityReminders(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Reminders</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityReminders(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(mtm::MedicationActivity::Reminder) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SPRT)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMtmMedicationActivityReminders(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDERS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_REMINDERS,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityReminders", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityStopReason(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Stop Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityStopReason(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(cda::Act) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

  /**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityStopReason(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Stop Reason</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityStopReason(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(cda::Act) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMtmMedicationActivityStopReason(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_STOP_REASON,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityStopReason", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getmtmIndications(MedicationActivity) <em>Getmtm Indications</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getmtmIndications(MedicationActivity)
   * @generated
   * @ordered
   */
  protected static final String GETMTM_INDICATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)";

  /**
   * The cached OCL query for the '{@link #getmtmIndications(MedicationActivity) <em>Getmtm Indications</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getmtmIndications(MedicationActivity)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GETMTM_INDICATIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<Indication> getmtmIndications(MedicationActivity medicationActivity)
  {
    if (GETMTM_INDICATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_ACTIVITY, MtmPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(99));
      try
      {
        GETMTM_INDICATIONS__EOCL_QRY = helper.createQuery(GETMTM_INDICATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GETMTM_INDICATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<Indication> result = (Collection<Indication>) query.evaluate(medicationActivity);
    return new BasicEList.UnmodifiableEList<Indication>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getmtmInstructions(MedicationActivity) <em>Getmtm Instructions</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getmtmInstructions(MedicationActivity)
   * @generated
   * @ordered
   */
  protected static final String GETMTM_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::MedicationActivity::Instruction))->asSequence()->first().oclAsType(mtm::MedicationActivity::Instruction)";

  /**
   * The cached OCL query for the '{@link #getmtmInstructions(MedicationActivity) <em>Getmtm Instructions</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getmtmInstructions(MedicationActivity)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GETMTM_INSTRUCTIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::MedicationActivity::Instruction))->asSequence()->first().oclAsType(mtm::MedicationActivity::Instruction)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated not
   */
  
  public static  void getmtmInstructions(MedicationActivity medicationActivity)
  {
    if (GETMTM_INSTRUCTIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_ACTIVITY, MtmPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(100));
      try
      {
        GETMTM_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GETMTM_INSTRUCTIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GETMTM_INSTRUCTIONS__EOCL_QRY);
//    return (void) query.evaluate(medicationActivity);
  }

  /**
   * The cached OCL expression body for the '{@link #getGoalss(MedicationActivity) <em>Get Goalss</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoalss(MedicationActivity)
   * @generated
   * @ordered
   */
  protected static final String GET_GOALSS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mtm::MedicationActionPlanGoal)).oclAsType(mtm::MedicationActionPlanGoal)";

  /**
   * The cached OCL query for the '{@link #getGoalss(MedicationActivity) <em>Get Goalss</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getGoalss(MedicationActivity)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_GOALSS__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mtm::MedicationActionPlanGoal)).oclAsType(mtm::MedicationActionPlanGoal)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<MedicationActionPlanGoal> getGoalss(MedicationActivity medicationActivity)
  {
    if (GET_GOALSS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_ACTIVITY, MtmPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(101));
      try
      {
        GET_GOALSS__EOCL_QRY = helper.createQuery(GET_GOALSS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_GOALSS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<MedicationActionPlanGoal> result = (Collection<MedicationActionPlanGoal>) query.evaluate(medicationActivity);
    return new BasicEList.UnmodifiableEList<MedicationActionPlanGoal>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #getReminders(MedicationActivity) <em>Get Reminders</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReminders(MedicationActivity)
   * @generated
   * @ordered
   */
  protected static final String GET_REMINDERS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::MedicationActivity::Reminder))->asSequence()->first().oclAsType(mtm::MedicationActivity::Reminder)";

  /**
   * The cached OCL query for the '{@link #getReminders(MedicationActivity) <em>Get Reminders</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getReminders(MedicationActivity)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_REMINDERS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::MedicationActivity::Reminder))->asSequence()->first().oclAsType(mtm::MedicationActivity::Reminder)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated not
   */
  
  public static  void getReminders(MedicationActivity medicationActivity)
  {
    if (GET_REMINDERS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_ACTIVITY, MtmPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(102));
      try
      {
        GET_REMINDERS__EOCL_QRY = helper.createQuery(GET_REMINDERS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_REMINDERS__EOCL_QRY);
//    return (void) query.evaluate(medicationActivity);
  }

  /**
   * The cached OCL expression body for the '{@link #getStopReason(MedicationActivity) <em>Get Stop Reason</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopReason(MedicationActivity)
   * @generated
   * @ordered
   */
  protected static final String GET_STOP_REASON__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cda::Act))->asSequence()->first().oclAsType(cda::Act)";

  /**
   * The cached OCL query for the '{@link #getStopReason(MedicationActivity) <em>Get Stop Reason</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getStopReason(MedicationActivity)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GET_STOP_REASON__EOCL_QRY;


  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cda::Act))->asSequence()->first().oclAsType(cda::Act)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  Act getStopReason(MedicationActivity medicationActivity)
  {
    if (GET_STOP_REASON__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_ACTIVITY, MtmPackage.Literals.MEDICATION_ACTIVITY.getEAllOperations().get(103));
      try
      {
        GET_STOP_REASON__EOCL_QRY = helper.createQuery(GET_STOP_REASON__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_STOP_REASON__EOCL_QRY);
    return (Act) query.evaluate(medicationActivity);
  }

} // MedicationActivityOperations