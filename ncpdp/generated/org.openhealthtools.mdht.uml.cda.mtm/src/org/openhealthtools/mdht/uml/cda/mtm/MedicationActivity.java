/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mtm.MtmPackage#getMedicationActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation constraints.validation.error='mtmMedicationActivityTemplateId mtmMedicationActivityPresciber mtmMedicationActivityIndicationEntryRelationship mtmMedicationActivityInstructionsEntryRelationship MedicationActivityPrescriberAssignedPresciberAssignedPerson MedicationActivityPrescriberTemplateId MedicationActivityPrescriberTypeCode MedicationActivityPrescriberAssignedAuthor MedicationActivityIndicationEntryRelationshipTypeCode MedicationActivityIndicationEntryRelationshipIndication MedicationActivityStopReasonEntryRelationshipStopReasonClassCode MedicationActivityStopReasonEntryRelationshipStopReasonNegationInd MedicationActivityStopReasonEntryRelationshipTypeCode MedicationActivityReminderEntryRelationshipTypeCode MedicationActivityReminderEntryRelationshipReminder MedicationActivityInstructionEntryRelationshipTypeCode MedicationActivityInstructionEntryRelationshipInstructions MedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal' templateId.root='111.222.333.444.222' constraints.validation.info='mtmMedicationActivityText mtmMedicationActivityStopReasonEntryRelationship mtmMedicationActivityReminderEntryRelationship' constraints.validation.warning='mtmMedicationActivityGoalsEntryRelationship MedicationActivityPrescriberAssignedPresciberPersonName' constraints.validation.query='MedicationActivityPrescriberAssignedPresciberPersonName MedicationActivityPrescriberAssignedPresciberAssignedPerson MedicationActivityPrescriberTemplateId MedicationActivityPrescriberTypeCode MedicationActivityPrescriberAssignedAuthor MedicationActivityIndicationEntryRelationshipTypeCode MedicationActivityIndicationEntryRelationshipIndication MedicationActivityStopReasonEntryRelationshipStopReasonClassCode MedicationActivityStopReasonEntryRelationshipStopReasonNegationInd MedicationActivityStopReasonEntryRelationshipTypeCode MedicationActivityReminderEntryRelationshipTypeCode MedicationActivityReminderEntryRelationshipReminder MedicationActivityInstructionEntryRelationshipTypeCode MedicationActivityInstructionEntryRelationshipInstructions MedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriber constraints.validation.error='PrescriberTemplateId PrescriberTypeCode PrescriberAssignedAuthor' templateId.root='null' typeCode='AUT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciber constraints.validation.error='AssignedPresciberAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciberPerson constraints.validation.warning='PersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityIndicationEntryRelationship typeCode='RSON' constraints.validation.error='IndicationEntryRelationshipTypeCode IndicationEntryRelationshipIndication'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReasonEntryRelationship typeCode='RSON' constraints.validation.error='StopReasonEntryRelationshipTypeCode'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReasonEntryRelationshipStopReason classCode='ACT' constraints.validation.error='StopReasonClassCode StopReasonNegationInd' moodCode='EVN' negationInd='true'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityReminderEntryRelationship typeCode='SPRT' constraints.validation.error='ReminderEntryRelationshipTypeCode ReminderEntryRelationshipReminder'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityInstructionEntryRelationship typeCode='SUBJ' constraints.validation.error='InstructionEntryRelationshipTypeCode InstructionEntryRelationshipInstructions'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityGoalsEntryRelationship constraints.validation.error='GoalsEntryRelationshipMedicationActionPlanGoal'"
 * @generated
 */
public interface MedicationActivity extends org.openhealthtools.mdht.uml.cda.consol.MedicationActivity {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.222')
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.templateId->exists(id : datatypes::II | id.root = \'111.222.333.444.222\')'"
   * @generated
   */
	boolean validateMtmMedicationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())'"
   * @generated
   */
	boolean validateMtmMedicationActivityText(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(cda::Author))'"
   * @generated
   */
	boolean validateMtmMedicationActivityPresciber(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
	boolean validateMtmMedicationActivityIndicationEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
	boolean validateMtmMedicationActivityStopReasonEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
	boolean validateMtmMedicationActivityReminderEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
	boolean validateMtmMedicationActivityInstructionsEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.oclIsUndefined() and entryRelationship.oclIsKindOf(cda::EntryRelationship))'"
   * @generated
   */
	boolean validateMtmMedicationActivityGoalsEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null).assignedPerson->excluding(null)->reject((name->isEmpty() or name->exists(element | element.isNullFlavorUndefined())) implies (name->size() = 1))'"
   * @generated
   */
	boolean validateMedicationActivityPrescriberAssignedPresciberPersonName(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null).assignedAuthor->excluding(null)->reject(assignedPerson->one(assignedPerson : cda::Person | not assignedPerson.oclIsUndefined() and assignedPerson.oclIsKindOf(cda::Person)))'"
   * @generated
   */
	boolean validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = 'null'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject(templateId->exists(id : datatypes::II | id.root = \'null\'))'"
   * @generated
   */
	boolean validateMedicationActivityPrescriberTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject(isDefined('typeCode') and typeCode=vocab::ParticipationType::AUT)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject(isDefined(\'typeCode\') and typeCode=vocab::ParticipationType::AUT)'"
   * @generated
   */
	boolean validateMedicationActivityPrescriberTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.author->excluding(null)->reject(assignedAuthor->one(assignedAuthor : cda::AssignedAuthor | not assignedAuthor.oclIsUndefined() and assignedAuthor.oclIsKindOf(cda::AssignedAuthor)))'"
   * @generated
   */
	boolean validateMedicationActivityPrescriberAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(isDefined('typeCode'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(isDefined(\'typeCode\'))'"
   * @generated
   */
	boolean validateMedicationActivityIndicationEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)))'"
   * @generated
   */
	boolean validateMedicationActivityIndicationEntryRelationshipIndication(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).act->excluding(null)->reject(isDefined('classCode'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).act->excluding(null)->reject(isDefined(\'classCode\'))'"
   * @generated
   */
	boolean validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null).act->excluding(null)->reject(negationInd=true)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null).act->excluding(null)->reject(negationInd=true)'"
   * @generated
   */
	boolean validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(isDefined('typeCode'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(isDefined(\'typeCode\'))'"
   * @generated
   */
	boolean validateMedicationActivityStopReasonEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::SPRT)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(typeCode=vocab::x_ActRelationshipEntryRelationship::SPRT)'"
   * @generated
   */
	boolean validateMedicationActivityReminderEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::Reminder)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::Reminder)))'"
   * @generated
   */
	boolean validateMedicationActivityReminderEntryRelationshipReminder(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(isDefined('typeCode'))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(isDefined(\'typeCode\'))'"
   * @generated
   */
	boolean validateMedicationActivityInstructionEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::Instructions)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(act->one(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::Instructions)))'"
   * @generated
   */
	boolean validateMedicationActivityInstructionEntryRelationshipInstructions(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mtm::MedicationActionPlanGoal)))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->excluding(null)->reject(observation->one(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mtm::MedicationActionPlanGoal)))'"
   * @generated
   */
	boolean validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(DiagnosticChain diagnostics, Map<Object, Object> context);

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActivity init();
} // MedicationActivity
