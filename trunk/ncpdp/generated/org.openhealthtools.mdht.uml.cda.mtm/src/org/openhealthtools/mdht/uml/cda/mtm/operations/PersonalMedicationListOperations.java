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

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsSectionOperations;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPlugin;
import org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationList;

import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Personal Medication List</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationList#validatePersonalMedicationListMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Medication List Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationList#getmtmMedications() <em>Getmtm Medications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationList#validateMedicationsSectionEntriesOptionalTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PersonalMedicationListOperations extends MedicationsSectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonalMedicationListOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validatePersonalMedicationListMedication(PersonalMedicationList, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Medication List Medication</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePersonalMedicationListMedication(PersonalMedicationList, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_PERSONAL_MEDICATION_LIST_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(mtm::MedicationActivity))";

  /**
   * The cached OCL invariant for the '{@link #validatePersonalMedicationListMedication(PersonalMedicationList, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Personal Medication List Medication</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validatePersonalMedicationListMedication(PersonalMedicationList, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_PERSONAL_MEDICATION_LIST_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(mtm::MedicationActivity))
   * @param personalMedicationList The receiving '<em><b>Personal Medication List</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validatePersonalMedicationListMedication(PersonalMedicationList personalMedicationList, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_PERSONAL_MEDICATION_LIST_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.PERSONAL_MEDICATION_LIST);
      try
      {
        VALIDATE_PERSONAL_MEDICATION_LIST_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_PERSONAL_MEDICATION_LIST_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_PERSONAL_MEDICATION_LIST_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personalMedicationList))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.PERSONAL_MEDICATION_LIST__PERSONAL_MEDICATION_LIST_MEDICATION,
             MtmPlugin.INSTANCE.getString("PersonalMedicationListMedication"),
             new Object [] { personalMedicationList }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #getmtmMedications(PersonalMedicationList) <em>Getmtm Medications</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getmtmMedications(PersonalMedicationList)
   * @generated
   * @ordered
   */
  protected static final String GETMTM_MEDICATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(mtm::MedicationActivity)).oclAsType(mtm::MedicationActivity)";

  /**
   * The cached OCL query for the '{@link #getmtmMedications(PersonalMedicationList) <em>Getmtm Medications</em>}' query operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #getmtmMedications(PersonalMedicationList)
   * @generated
   * @ordered
   */
  protected static OCLExpression<EClassifier> GETMTM_MEDICATIONS__EOCL_QRY;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(mtm::MedicationActivity)).oclAsType(mtm::MedicationActivity)
   * @param personalMedicationList The receiving '<em><b>Personal Medication List</b></em>' model object.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  EList<MedicationActivity> getmtmMedications(PersonalMedicationList personalMedicationList)
  {
    if (GETMTM_MEDICATIONS__EOCL_QRY == null)
    {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setOperationContext(MtmPackage.Literals.PERSONAL_MEDICATION_LIST, MtmPackage.Literals.PERSONAL_MEDICATION_LIST.getEAllOperations().get(66));
      try
      {
        GETMTM_MEDICATIONS__EOCL_QRY = helper.createQuery(GETMTM_MEDICATIONS__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    OCL.Query query = EOCL_ENV.createQuery(GETMTM_MEDICATIONS__EOCL_QRY);
    @SuppressWarnings("unchecked")
    Collection<MedicationActivity> result = (Collection<MedicationActivity>) query.evaluate(personalMedicationList);
    return new BasicEList.UnmodifiableEList<MedicationActivity>(result.size(), result.toArray());
  }

  /**
   * The cached OCL expression body for the '{@link #validateMedicationsSectionEntriesOptionalTemplateId(PersonalMedicationList, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicationsSectionEntriesOptionalTemplateId(PersonalMedicationList, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.333')";

  /**
   * The cached OCL invariant for the '{@link #validateMedicationsSectionEntriesOptionalTemplateId(PersonalMedicationList, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Medications Section Entries Optional Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateMedicationsSectionEntriesOptionalTemplateId(PersonalMedicationList, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.333')
   * @param personalMedicationList The receiving '<em><b>Personal Medication List</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateMedicationsSectionEntriesOptionalTemplateId(PersonalMedicationList personalMedicationList, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.PERSONAL_MEDICATION_LIST);
      try
      {
        VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(personalMedicationList))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.PERSONAL_MEDICATION_LIST__MEDICATIONS_SECTION_ENTRIES_OPTIONAL_TEMPLATE_ID,
             org.eclipse.emf.ecore.plugin.EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "MedicationsSectionEntriesOptionalTemplateId", org.eclipse.emf.ecore.util.EObjectValidator.getObjectLabel(personalMedicationList, context) }),
             new Object [] { personalMedicationList }));
      }
       
      return false;
    }
    return true;
  }

} // PersonalMedicationListOperations