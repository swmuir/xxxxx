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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EObject;

import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.Query;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPlugin;

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
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityPresciber(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Presciber</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityIndicationEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Indication Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityStopReasonEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Stop Reason Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityReminderEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Reminder Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityInstructionsEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Instructions Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMtmMedicationActivityGoalsEntryRelationship(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Goals Entry Relationship</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityPrescriberAssignedPresciberPersonName(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Assigned Presciber Person Name</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Assigned Presciber Assigned Person</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityPrescriberTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityPrescriberTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityPrescriberAssignedAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Assigned Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityIndicationEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityIndicationEntryRelationshipIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication Entry Relationship Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Stop Reason Entry Relationship Stop Reason Class Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Stop Reason Entry Relationship Stop Reason Negation Ind</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityStopReasonEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Stop Reason Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityReminderEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reminder Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityReminderEntryRelationshipReminder(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reminder Entry Relationship Reminder</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityInstructionEntryRelationshipTypeCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instruction Entry Relationship Type Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityInstructionEntryRelationshipInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instruction Entry Relationship Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity#validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Goals Entry Relationship Medication Action Plan Goal</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationActivityOperations extends org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivityOperations {
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
	
	public static  boolean validateMtmMedicationActivityTemplateId(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
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
	
	public static  boolean validateMtmMedicationActivityText(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
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
	
	public static  boolean validateMtmMedicationActivityPresciber(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
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
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityIndicationEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Indication Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityIndicationEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityIndicationEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Indication Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityIndicationEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMtmMedicationActivityIndicationEntryRelationship(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityIndicationEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityStopReasonEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Stop Reason Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityStopReasonEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityStopReasonEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Stop Reason Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityStopReasonEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMtmMedicationActivityStopReasonEntryRelationship(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityStopReasonEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityReminderEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Reminder Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityReminderEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityReminderEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Reminder Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityReminderEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMtmMedicationActivityReminderEntryRelationship(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityReminderEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityInstructionsEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Instructions Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityInstructionsEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityInstructionsEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Instructions Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityInstructionsEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMtmMedicationActivityInstructionsEntryRelationship(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_INSTRUCTIONS_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityInstructionsEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMtmMedicationActivityGoalsEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Goals Entry Relationship</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityGoalsEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))";

	/**
   * The cached OCL invariant for the '{@link #validateMtmMedicationActivityGoalsEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Mtm Medication Activity Goals Entry Relationship</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMtmMedicationActivityGoalsEntryRelationship(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMtmMedicationActivityGoalsEntryRelationship(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MtmMedicationActivityGoalsEntryRelationship", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActivity, context) }),
             new Object [] { medicationActivity }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityPrescriberAssignedPresciberPersonName(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Assigned Presciber Person Name</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityPrescriberAssignedPresciberPersonName(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityPrescriberAssignedPresciberPersonName(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Assigned Presciber Person Name</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityPrescriberAssignedPresciberPersonName(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityPrescriberAssignedPresciberPersonName(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_PERSON_NAME__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_PERSON_NAME,
             MtmPlugin.INSTANCE.getString("MedicationActivityPrescriberAssignedPresciberPersonName"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Assigned Presciber Assigned Person</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Assigned Presciber Assigned Person</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_ASSIGNED_PERSON__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_PRESCIBER_ASSIGNED_PERSON,
             MtmPlugin.INSTANCE.getString("MedicationActivityPrescriberAssignedPresciberAssignedPerson"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityPrescriberTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityPrescriberTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = 'null'))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityPrescriberTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityPrescriberTemplateId(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = 'null'))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityPrescriberTemplateId(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRESCRIBER_TEMPLATE_ID,
             MtmPlugin.INSTANCE.getString("MedicationActivityPrescriberTemplateId"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityPrescriberTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Type Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityPrescriberTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationType::AUT)";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityPrescriberTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityPrescriberTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationType::AUT)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityPrescriberTypeCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRESCRIBER_TYPE_CODE,
             MtmPlugin.INSTANCE.getString("MedicationActivityPrescriberTypeCode"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityPrescriberAssignedAuthor(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Assigned Author</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityPrescriberAssignedAuthor(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityPrescriberAssignedAuthor(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Prescriber Assigned Author</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityPrescriberAssignedAuthor(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityPrescriberAssignedAuthor(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_PRESCRIBER_ASSIGNED_AUTHOR,
             MtmPlugin.INSTANCE.getString("MedicationActivityPrescriberAssignedAuthor"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityIndicationEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication Entry Relationship Type Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityIndicationEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(isDefined('typeCode'))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityIndicationEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication Entry Relationship Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityIndicationEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(isDefined('typeCode'))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityIndicationEntryRelationshipTypeCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_TYPE_CODE,
             MtmPlugin.INSTANCE.getString("MedicationActivityIndicationEntryRelationshipTypeCode"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityIndicationEntryRelationshipIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication Entry Relationship Indication</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityIndicationEntryRelationshipIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityIndicationEntryRelationshipIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Indication Entry Relationship Indication</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityIndicationEntryRelationshipIndication(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityIndicationEntryRelationshipIndication(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INDICATION_ENTRY_RELATIONSHIP_INDICATION,
             MtmPlugin.INSTANCE.getString("MedicationActivityIndicationEntryRelationshipIndication"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Stop Reason Entry Relationship Stop Reason Class Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject(isDefined('classCode'))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Stop Reason Entry Relationship Stop Reason Class Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).act->excluding(null)->reject(isDefined('classCode'))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_CLASS_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_CLASS_CODE,
             MtmPlugin.INSTANCE.getString("MedicationActivityStopReasonEntryRelationshipStopReasonClassCode"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Stop Reason Entry Relationship Stop Reason Negation Ind</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null).act->excluding(null)->reject(negationInd=true)";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Stop Reason Entry Relationship Stop Reason Negation Ind</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).act->excluding(null)->reject(negationInd=true)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_NEGATION_IND__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_STOP_REASON_NEGATION_IND,
             MtmPlugin.INSTANCE.getString("MedicationActivityStopReasonEntryRelationshipStopReasonNegationInd"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityStopReasonEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Stop Reason Entry Relationship Type Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityStopReasonEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(isDefined('typeCode'))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityStopReasonEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Stop Reason Entry Relationship Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityStopReasonEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(isDefined('typeCode'))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityStopReasonEntryRelationshipTypeCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_STOP_REASON_ENTRY_RELATIONSHIP_TYPE_CODE,
             MtmPlugin.INSTANCE.getString("MedicationActivityStopReasonEntryRelationshipTypeCode"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityReminderEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reminder Entry Relationship Type Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityReminderEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::SPRT)";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityReminderEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reminder Entry Relationship Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityReminderEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::SPRT)
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityReminderEntryRelationshipTypeCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_TYPE_CODE,
             MtmPlugin.INSTANCE.getString("MedicationActivityReminderEntryRelationshipTypeCode"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityReminderEntryRelationshipReminder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reminder Entry Relationship Reminder</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityReminderEntryRelationshipReminder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_REMINDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::Reminder)))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityReminderEntryRelationshipReminder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Reminder Entry Relationship Reminder</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityReminderEntryRelationshipReminder(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_REMINDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::Reminder)))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityReminderEntryRelationshipReminder(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_REMINDER__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_REMINDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_REMINDER__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_REMINDER_ENTRY_RELATIONSHIP_REMINDER,
             MtmPlugin.INSTANCE.getString("MedicationActivityReminderEntryRelationshipReminder"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityInstructionEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instruction Entry Relationship Type Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityInstructionEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(isDefined('typeCode'))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityInstructionEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instruction Entry Relationship Type Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityInstructionEntryRelationshipTypeCode(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(isDefined('typeCode'))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityInstructionEntryRelationshipTypeCode(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_TYPE_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_TYPE_CODE,
             MtmPlugin.INSTANCE.getString("MedicationActivityInstructionEntryRelationshipTypeCode"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityInstructionEntryRelationshipInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instruction Entry Relationship Instructions</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityInstructionEntryRelationshipInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::Instructions)))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityInstructionEntryRelationshipInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Instruction Entry Relationship Instructions</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityInstructionEntryRelationshipInstructions(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::Instructions)))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityInstructionEntryRelationshipInstructions(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_INSTRUCTION_ENTRY_RELATIONSHIP_INSTRUCTIONS,
             MtmPlugin.INSTANCE.getString("MedicationActivityInstructionEntryRelationshipInstructions"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Goals Entry Relationship Medication Action Plan Goal</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP_MEDICATION_ACTION_PLAN_GOAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mtm::MedicationActionPlanGoal)))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Activity Goals Entry Relationship Medication Action Plan Goal</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(MedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Query<?, ?, ?> VALIDATE_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP_MEDICATION_ACTION_PLAN_GOAL__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mtm::MedicationActionPlanGoal)))
   * @param medicationActivity The receiving '<em><b>Medication Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	@SuppressWarnings("unchecked")
	public static  boolean validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(MedicationActivity medicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTIVITY);
      try
      {
        OCLExpression<EClassifier> oclExpression = helper.createQuery(VALIDATE_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP_MEDICATION_ACTION_PLAN_GOAL__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
        VALIDATE_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP_MEDICATION_ACTION_PLAN_GOAL__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY = EOCL_ENV.createQuery(oclExpression);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    
    Object oclResult = VALIDATE_MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP_MEDICATION_ACTION_PLAN_GOAL__DIAGNOSTIC_CHAIN_MAP__EOCL_QRY.evaluate(medicationActivity);		
    if (oclResult != null && oclResult instanceof Collection) {
      Collection<? extends EObject> oclResultSet = (Collection<? extends EObject>) oclResult;
  			
      if (diagnostics != null) {
        for (EObject eObject : oclResultSet) {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTIVITY__MEDICATION_ACTIVITY_GOALS_ENTRY_RELATIONSHIP_MEDICATION_ACTION_PLAN_GOAL,
             MtmPlugin.INSTANCE.getString("MedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal"),
             new Object [] { eObject }));
        }
         
      }
      return oclResultSet.isEmpty();
    }
    return true;
  }

} // MedicationActivityOperations