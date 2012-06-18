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

import org.openhealthtools.mdht.uml.cda.consol.PlanOfCareSection;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Action Plan Section</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mtm.MtmPackage#getMedicationActionPlanSection()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='111.222.333.444.555' constraints.validation.error='MedicationActionPlanSectionTemplateId MedicationActionPlanSectionTitle MedicationActionPlanSectionMedicationActionPlanEncounter'"
 * @generated
 */
public interface MedicationActionPlanSection extends PlanOfCareSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())'"
   * @generated
   */
	boolean validateMedicationActionPlanSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entry->exists(entry : cda::Entry | not entry.encounter.oclIsUndefined() and entry.encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter))'"
   * @generated
   */
	boolean validateMedicationActionPlanSectionMedicationActionPlanEncounter(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter)).oclAsType(mtm::MedicationActionPlanEncounter)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getEncounters()->select(encounter : cda::Encounter | not encounter.oclIsUndefined() and encounter.oclIsKindOf(mtm::MedicationActionPlanEncounter)).oclAsType(mtm::MedicationActionPlanEncounter)'"
   * @generated
   */
	EList<MedicationActionPlanEncounter> getMedicationActionPlanEncounters();

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActionPlanSection init();
} // MedicationActionPlanSection
