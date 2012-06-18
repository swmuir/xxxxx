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

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.consol.operations.PlanOfCareActivityActOperations;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPlugin;

import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Action Plan Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity#validateMedicationActionPlanActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity#validateMedicationActionPlanActivityCodeP(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Activity Code P</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity#validateMedicationActionPlanActivityCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Activity Code</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity#validatePlanOfCareActivityActTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity#validatePlanOfCareActivityActMoodCode(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationActionPlanActivityOperations extends PlanOfCareActivityActOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicationActionPlanActivityOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanActivityText(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Activity Text</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanActivityText(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanActivityText(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Activity Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanActivityText(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
   * @param medicationActionPlanActivity The receiving '<em><b>Medication Action Plan Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationActionPlanActivityText(MedicationActionPlanActivity medicationActionPlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ACTIVITY);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_ACTIVITY__MEDICATION_ACTION_PLAN_ACTIVITY_TEXT,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanActivityText"),
             new Object [] { medicationActionPlanActivity }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanActivityCodeP(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Activity Code P</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanActivityCodeP(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanActivityCodeP(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Activity Code P</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanActivityCodeP(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined())
   * @param medicationActionPlanActivity The receiving '<em><b>Medication Action Plan Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationActionPlanActivityCodeP(MedicationActionPlanActivity medicationActionPlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ACTIVITY);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE_P__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.WARNING,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_ACTIVITY__MEDICATION_ACTION_PLAN_ACTIVITY_CODE_P,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanActivityCodeP"),
             new Object [] { medicationActionPlanActivity }));
      }
      
      if (context != null) {
        // generate a pass token for my dependent constraints to short-circuit or filter results
        @SuppressWarnings("unchecked")
        Collection<Object> passToken = (Collection<Object>) context.get("org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivityCodeP");
        if (passToken == null) {
          // anticipate a reasonably healthy model
          passToken = new java.util.ArrayList<Object>(3);
          context.put("org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivityCodeP", passToken);
        }
        passToken.add(medicationActionPlanActivity);
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationActionPlanActivityCode(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Activity Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanActivityCode(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and "+
"let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in "+
"value.codeSystem = '2.16.840.1.113883.6.96')";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationActionPlanActivityCode(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Action Plan Activity Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationActionPlanActivityCode(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.code.oclIsUndefined() or self.code.isNullFlavorUndefined()) implies (not self.code.oclIsUndefined() and self.code.oclIsKindOf(datatypes::CD) and 
   * let value : datatypes::CD = self.code.oclAsType(datatypes::CD) in 
   * value.codeSystem = '2.16.840.1.113883.6.96')
   * @param medicationActionPlanActivity The receiving '<em><b>Medication Action Plan Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationActionPlanActivityCode(MedicationActionPlanActivity medicationActionPlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    Object passToken = (context == null) ? null : context.get("org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivityCodeP");
    if ((passToken instanceof Collection<?>) && ((Collection<?>) passToken).contains(medicationActionPlanActivity)) {
      // I have a free pass to short-circuit
      return true;
    }
  	  
    if (VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ACTIVITY);
      try
      {
        VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_ACTION_PLAN_ACTIVITY_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_ACTIVITY__MEDICATION_ACTION_PLAN_ACTIVITY_CODE,
             MtmPlugin.INSTANCE.getString("MedicationActionPlanActivityCode"),
             new Object [] { medicationActionPlanActivity }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePlanOfCareActivityActTemplateId(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlanOfCareActivityActTemplateId(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.666')";

	/**
   * The cached OCL invariant for the '{@link #validatePlanOfCareActivityActTemplateId(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlanOfCareActivityActTemplateId(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.666')
   * @param medicationActionPlanActivity The receiving '<em><b>Medication Action Plan Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePlanOfCareActivityActTemplateId(MedicationActionPlanActivity medicationActionPlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ACTIVITY);
      try
      {
        VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_ACTIVITY__PLAN_OF_CARE_ACTIVITY_ACT_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "PlanOfCareActivityActTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationActionPlanActivity, context) }),
             new Object [] { medicationActionPlanActivity }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validatePlanOfCareActivityActMoodCode(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlanOfCareActivityActMoodCode(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentActMood)";

	/**
   * The cached OCL invariant for the '{@link #validatePlanOfCareActivityActMoodCode(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Plan Of Care Activity Act Mood Code</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validatePlanOfCareActivityActMoodCode(MedicationActionPlanActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.moodCode.oclIsUndefined() and self.moodCode.oclIsKindOf(vocab::x_DocumentActMood)
   * @param medicationActionPlanActivity The receiving '<em><b>Medication Action Plan Activity</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validatePlanOfCareActivityActMoodCode(MedicationActionPlanActivity medicationActionPlanActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_ACTION_PLAN_ACTIVITY);
      try
      {
        VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationActionPlanActivity))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_ACTION_PLAN_ACTIVITY__PLAN_OF_CARE_ACTIVITY_ACT_MOOD_CODE,
             MtmPlugin.INSTANCE.getString("PlanOfCareActivityActMoodCode"),
             new Object [] { medicationActionPlanActivity }));
      }
       
      return false;
    }
    return true;
  }

} // MedicationActionPlanActivityOperations