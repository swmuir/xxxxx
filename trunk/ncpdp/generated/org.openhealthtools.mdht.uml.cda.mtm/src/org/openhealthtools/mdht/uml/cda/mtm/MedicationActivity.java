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

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.consol.CommentActivity;
import org.openhealthtools.mdht.uml.cda.consol.Indication;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medication Activity</b></em>'.
 * <!-- end-user-doc -->
 *
 *
 * @see org.openhealthtools.mdht.uml.cda.mtm.MtmPackage#getMedicationActivity()
 * @model annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation templateId.root='111.222.333.444.222' constraints.validation.error='mtmMedicationActivityTemplateId mtmMedicationActivityIndication mtmMedicationActivityInstructions mtmMedicationActivityPresciber mtmMedicationActivityReminders' constraints.validation.warning='mtmMedicationActivityGoals' constraints.validation.info='mtmMedicationActivityText mtmMedicationActivityStopReason'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriber templateId.root='null' constraints.validation.error='PrescriberTemplateId PrescriberTypeCode PrescriberAssignedAuthor' typeCode='AUT'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciber constraints.validation.error='AssignedPresciberAssignedPerson'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciberPerson constraints.validation.warning='PersonName'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityReminder constraints.validation.error='ReminderText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityInstruction constraints.validation.error='InstructionText'"
 *        annotation="http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReason constraints.validation.error='StopReasonClassCode StopReasonMoodCode StopReasonNegationInd StopReasonText' classCode='ACT' moodCode='EVN' negationInd='true'"
 * @generated
 */
public interface MedicationActivity extends org.openhealthtools.mdht.uml.cda.consol.MedicationActivity
{
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
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)'"
   * @generated
   */
  boolean validateMtmMedicationActivityIndication(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(mtm::MedicationActivity::Instruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(mtm::MedicationActivity::Instruction) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)'"
   * @generated
   */
  boolean validateMtmMedicationActivityInstructions(DiagnosticChain diagnostics, Map<Object, Object> context);

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
   * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(mtm::MedicationActionPlanGoal))
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(mtm::MedicationActionPlanGoal))'"
   * @generated
   */
  boolean validateMtmMedicationActivityGoals(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(mtm::MedicationActivity::Reminder) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SPRT)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(mtm::MedicationActivity::Reminder) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SPRT)'"
   * @generated
   */
  boolean validateMtmMedicationActivityReminders(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(cda::Act) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(cda::Act) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)'"
   * @generated
   */
  boolean validateMtmMedicationActivityStopReason(DiagnosticChain diagnostics, Map<Object, Object> context);

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)
   * <!-- end-model-doc -->
   * @model required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)'"
   * @generated
   */
  EList<Indication> getmtmIndications();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::MedicationActivity::Instruction))->asSequence()->first().oclAsType(mtm::MedicationActivity::Instruction)
   * <!-- end-model-doc -->
   * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::MedicationActivity::Instruction))->asSequence()->first().oclAsType(mtm::MedicationActivity::Instruction)'"
   * @generated
   */
  void getmtmInstructions();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mtm::MedicationActionPlanGoal)).oclAsType(mtm::MedicationActionPlanGoal)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(mtm::MedicationActionPlanGoal)).oclAsType(mtm::MedicationActionPlanGoal)'"
   * @generated
   */
  EList<MedicationActionPlanGoal> getGoalss();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::MedicationActivity::Reminder))->asSequence()->first().oclAsType(mtm::MedicationActivity::Reminder)
   * <!-- end-model-doc -->
   * @model kind="operation"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(mtm::MedicationActivity::Reminder))->asSequence()->first().oclAsType(mtm::MedicationActivity::Reminder)'"
   * @generated
   */
  void getReminders();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cda::Act))->asSequence()->first().oclAsType(cda::Act)
   * <!-- end-model-doc -->
   * @model kind="operation" required="true" ordered="false"
   *        annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(cda::Act))->asSequence()->first().oclAsType(cda::Act)'"
   * @generated
   */
  Act getStopReason();

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MedicationActivity init();
} // MedicationActivity
