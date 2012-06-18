/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.operations.GeneralHeaderConstraintsOperations;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPlugin;
import org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection;
import org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationListSection;

import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Medication Therapy Management Program</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram#validateMedicationTherapyManagementProgramAllergiesSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram#validateMedicationTherapyManagementProgramPersonalMedicationListSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Personal Medication List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram#validateMedicationTherapyManagementProgramOtherInformationSection(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Other Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram#validateMedicationTherapyManagementProgramMedicationActionPlan(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Medication Action Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram#getAllergiesSection() <em>Get Allergies Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram#getPersonalMedicationListSection() <em>Get Personal Medication List Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram#getOtherInformationSection() <em>Get Other Information Section</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram#getMedicationActionPlan() <em>Get Medication Action Plan</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram#validateGeneralHeaderConstraintsTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MedicationTherapyManagementProgramOperations extends GeneralHeaderConstraintsOperations {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicationTherapyManagementProgramOperations() {
    super();
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationTherapyManagementProgramAllergiesSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Allergies Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationTherapyManagementProgramAllergiesSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationTherapyManagementProgramAllergiesSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Allergies Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationTherapyManagementProgramAllergiesSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))
   * @param medicationTherapyManagementProgram The receiving '<em><b>Medication Therapy Management Program</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationTherapyManagementProgramAllergiesSection(MedicationTherapyManagementProgram medicationTherapyManagementProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM);
      try
      {
        VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_ALLERGIES_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationTherapyManagementProgram))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_THERAPY_MANAGEMENT_PROGRAM__MEDICATION_THERAPY_MANAGEMENT_PROGRAM_ALLERGIES_SECTION,
             MtmPlugin.INSTANCE.getString("MedicationTherapyManagementProgramAllergiesSection"),
             new Object [] { medicationTherapyManagementProgram }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationTherapyManagementProgramPersonalMedicationListSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Personal Medication List Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationTherapyManagementProgramPersonalMedicationListSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_PERSONAL_MEDICATION_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::PersonalMedicationListSection))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationTherapyManagementProgramPersonalMedicationListSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Personal Medication List Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationTherapyManagementProgramPersonalMedicationListSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_PERSONAL_MEDICATION_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::PersonalMedicationListSection))
   * @param medicationTherapyManagementProgram The receiving '<em><b>Medication Therapy Management Program</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationTherapyManagementProgramPersonalMedicationListSection(MedicationTherapyManagementProgram medicationTherapyManagementProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_PERSONAL_MEDICATION_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM);
      try
      {
        VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_PERSONAL_MEDICATION_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_PERSONAL_MEDICATION_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_PERSONAL_MEDICATION_LIST_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationTherapyManagementProgram))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_THERAPY_MANAGEMENT_PROGRAM__MEDICATION_THERAPY_MANAGEMENT_PROGRAM_PERSONAL_MEDICATION_LIST_SECTION,
             MtmPlugin.INSTANCE.getString("MedicationTherapyManagementProgramPersonalMedicationListSection"),
             new Object [] { medicationTherapyManagementProgram }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationTherapyManagementProgramOtherInformationSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Other Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationTherapyManagementProgramOtherInformationSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_OTHER_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::OtherInformationSection))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationTherapyManagementProgramOtherInformationSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Other Information Section</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationTherapyManagementProgramOtherInformationSection(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_OTHER_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::OtherInformationSection))
   * @param medicationTherapyManagementProgram The receiving '<em><b>Medication Therapy Management Program</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationTherapyManagementProgramOtherInformationSection(MedicationTherapyManagementProgram medicationTherapyManagementProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_OTHER_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM);
      try
      {
        VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_OTHER_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_OTHER_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_OTHER_INFORMATION_SECTION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationTherapyManagementProgram))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.INFO,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_THERAPY_MANAGEMENT_PROGRAM__MEDICATION_THERAPY_MANAGEMENT_PROGRAM_OTHER_INFORMATION_SECTION,
             MtmPlugin.INSTANCE.getString("MedicationTherapyManagementProgramOtherInformationSection"),
             new Object [] { medicationTherapyManagementProgram }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #validateMedicationTherapyManagementProgramMedicationActionPlan(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Medication Action Plan</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationTherapyManagementProgramMedicationActionPlan(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_MEDICATION_ACTION_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::MedicationActionPlanSection))";

	/**
   * The cached OCL invariant for the '{@link #validateMedicationTherapyManagementProgramMedicationActionPlan(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medication Therapy Management Program Medication Action Plan</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateMedicationTherapyManagementProgramMedicationActionPlan(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_MEDICATION_ACTION_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->one(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::MedicationActionPlanSection))
   * @param medicationTherapyManagementProgram The receiving '<em><b>Medication Therapy Management Program</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateMedicationTherapyManagementProgramMedicationActionPlan(MedicationTherapyManagementProgram medicationTherapyManagementProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_MEDICATION_ACTION_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM);
      try
      {
        VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_MEDICATION_ACTION_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_MEDICATION_ACTION_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATION_THERAPY_MANAGEMENT_PROGRAM_MEDICATION_ACTION_PLAN__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationTherapyManagementProgram))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_THERAPY_MANAGEMENT_PROGRAM__MEDICATION_THERAPY_MANAGEMENT_PROGRAM_MEDICATION_ACTION_PLAN,
             MtmPlugin.INSTANCE.getString("MedicationTherapyManagementProgramMedicationActionPlan"),
             new Object [] { medicationTherapyManagementProgram }));
      }
       
      return false;
    }
    return true;
  }

	/**
   * The cached OCL expression body for the '{@link #getAllergiesSection(MedicationTherapyManagementProgram) <em>Get Allergies Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAllergiesSection(MedicationTherapyManagementProgram)
   * @generated
   * @ordered
   */
	protected static final String GET_ALLERGIES_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)";

	/**
   * The cached OCL query for the '{@link #getAllergiesSection(MedicationTherapyManagementProgram) <em>Get Allergies Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getAllergiesSection(MedicationTherapyManagementProgram)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_ALLERGIES_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(consol::AllergiesSectionEntriesOptional))->asSequence()->first().oclAsType(consol::AllergiesSectionEntriesOptional)
   * @param medicationTherapyManagementProgram The receiving '<em><b>Medication Therapy Management Program</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  AllergiesSectionEntriesOptional getAllergiesSection(MedicationTherapyManagementProgram medicationTherapyManagementProgram) {
    if (GET_ALLERGIES_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM, MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM.getEAllOperations().get(164));
      try
      {
        GET_ALLERGIES_SECTION__EOCL_QRY = helper.createQuery(GET_ALLERGIES_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_ALLERGIES_SECTION__EOCL_QRY);
    return (AllergiesSectionEntriesOptional) query.evaluate(medicationTherapyManagementProgram);
  }

	/**
   * The cached OCL expression body for the '{@link #getPersonalMedicationListSection(MedicationTherapyManagementProgram) <em>Get Personal Medication List Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPersonalMedicationListSection(MedicationTherapyManagementProgram)
   * @generated
   * @ordered
   */
	protected static final String GET_PERSONAL_MEDICATION_LIST_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::PersonalMedicationListSection))->asSequence()->first().oclAsType(mtm::PersonalMedicationListSection)";

	/**
   * The cached OCL query for the '{@link #getPersonalMedicationListSection(MedicationTherapyManagementProgram) <em>Get Personal Medication List Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getPersonalMedicationListSection(MedicationTherapyManagementProgram)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_PERSONAL_MEDICATION_LIST_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::PersonalMedicationListSection))->asSequence()->first().oclAsType(mtm::PersonalMedicationListSection)
   * @param medicationTherapyManagementProgram The receiving '<em><b>Medication Therapy Management Program</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  PersonalMedicationListSection getPersonalMedicationListSection(MedicationTherapyManagementProgram medicationTherapyManagementProgram) {
    if (GET_PERSONAL_MEDICATION_LIST_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM, MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM.getEAllOperations().get(165));
      try
      {
        GET_PERSONAL_MEDICATION_LIST_SECTION__EOCL_QRY = helper.createQuery(GET_PERSONAL_MEDICATION_LIST_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_PERSONAL_MEDICATION_LIST_SECTION__EOCL_QRY);
    return (PersonalMedicationListSection) query.evaluate(medicationTherapyManagementProgram);
  }

	/**
   * The cached OCL expression body for the '{@link #getOtherInformationSection(MedicationTherapyManagementProgram) <em>Get Other Information Section</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOtherInformationSection(MedicationTherapyManagementProgram)
   * @generated
   * @ordered
   */
	protected static final String GET_OTHER_INFORMATION_SECTION__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::OtherInformationSection))->asSequence()->first().oclAsType(mtm::OtherInformationSection)";

	/**
   * The cached OCL query for the '{@link #getOtherInformationSection(MedicationTherapyManagementProgram) <em>Get Other Information Section</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getOtherInformationSection(MedicationTherapyManagementProgram)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_OTHER_INFORMATION_SECTION__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::OtherInformationSection))->asSequence()->first().oclAsType(mtm::OtherInformationSection)
   * @param medicationTherapyManagementProgram The receiving '<em><b>Medication Therapy Management Program</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  OtherInformationSection getOtherInformationSection(MedicationTherapyManagementProgram medicationTherapyManagementProgram) {
    if (GET_OTHER_INFORMATION_SECTION__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM, MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM.getEAllOperations().get(166));
      try
      {
        GET_OTHER_INFORMATION_SECTION__EOCL_QRY = helper.createQuery(GET_OTHER_INFORMATION_SECTION__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_OTHER_INFORMATION_SECTION__EOCL_QRY);
    return (OtherInformationSection) query.evaluate(medicationTherapyManagementProgram);
  }

	/**
   * The cached OCL expression body for the '{@link #getMedicationActionPlan(MedicationTherapyManagementProgram) <em>Get Medication Action Plan</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationActionPlan(MedicationTherapyManagementProgram)
   * @generated
   * @ordered
   */
	protected static final String GET_MEDICATION_ACTION_PLAN__EOCL_EXP = "self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::MedicationActionPlanSection))->asSequence()->first().oclAsType(mtm::MedicationActionPlanSection)";

	/**
   * The cached OCL query for the '{@link #getMedicationActionPlan(MedicationTherapyManagementProgram) <em>Get Medication Action Plan</em>}' query operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #getMedicationActionPlan(MedicationTherapyManagementProgram)
   * @generated
   * @ordered
   */
	protected static OCLExpression<EClassifier> GET_MEDICATION_ACTION_PLAN__EOCL_QRY;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getAllSections()->select(section : cda::Section | not section.oclIsUndefined() and section.oclIsKindOf(mtm::MedicationActionPlanSection))->asSequence()->first().oclAsType(mtm::MedicationActionPlanSection)
   * @param medicationTherapyManagementProgram The receiving '<em><b>Medication Therapy Management Program</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  MedicationActionPlanSection getMedicationActionPlan(MedicationTherapyManagementProgram medicationTherapyManagementProgram) {
    if (GET_MEDICATION_ACTION_PLAN__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM, MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM.getEAllOperations().get(167));
      try
      {
        GET_MEDICATION_ACTION_PLAN__EOCL_QRY = helper.createQuery(GET_MEDICATION_ACTION_PLAN__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GET_MEDICATION_ACTION_PLAN__EOCL_QRY);
    return (MedicationActionPlanSection) query.evaluate(medicationTherapyManagementProgram);
  }

	/**
   * The cached OCL expression body for the '{@link #validateGeneralHeaderConstraintsTemplateId(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeneralHeaderConstraintsTemplateId(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	protected static final String VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.111')";

	/**
   * The cached OCL invariant for the '{@link #validateGeneralHeaderConstraintsTemplateId(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate General Header Constraints Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @see #validateGeneralHeaderConstraintsTemplateId(MedicationTherapyManagementProgram, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
	
	protected static Constraint VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.111')
   * @param medicationTherapyManagementProgram The receiving '<em><b>Medication Therapy Management Program</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
	
	public static  boolean validateGeneralHeaderConstraintsTemplateId(MedicationTherapyManagementProgram medicationTherapyManagementProgram, DiagnosticChain diagnostics, Map<Object, Object> context) {
  	  
    if (VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM);
      try
      {
        VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(medicationTherapyManagementProgram))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.MEDICATION_THERAPY_MANAGEMENT_PROGRAM__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "GeneralHeaderConstraintsTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(medicationTherapyManagementProgram, context) }),
             new Object [] { medicationTherapyManagementProgram }));
      }
       
      return false;
    }
    return true;
  }

} // MedicationTherapyManagementProgramOperations