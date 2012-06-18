/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.openhealthtools.mdht.uml.cda.consol.MedicationsSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mtm.MtmPackage#getMedicationSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='111.222.333.444.333' constraints.validation.error='MedicationSectionTemplateId MedicationSectionMedication'"
 * @generated
 */
public interface MedicationSection extends MedicationsSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(mtm::MedicationActivity))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(mtm::MedicationActivity))'"
   * @generated
   */
  boolean validateMedicationSectionMedication(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(mtm::MedicationActivity)).oclAsType(mtm::MedicationActivity)
   * <!-- end-model-doc -->
   * @model required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(mtm::MedicationActivity)).oclAsType(mtm::MedicationActivity)'"
   * @generated
   */
  EList<MedicationActivity> getmtmMedications();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MedicationSection init();
} // MedicationSection
