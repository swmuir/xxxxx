/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;

import org.openhealthtools.mdht.uml.cda.mtm.operations.MedicationActivityOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActivityImpl extends org.openhealthtools.mdht.uml.cda.consol.impl.MedicationActivityImpl implements MedicationActivity {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicationActivityImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return MtmPackage.Literals.MEDICATION_ACTIVITY;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMtmMedicationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMtmMedicationActivityTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMtmMedicationActivityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMtmMedicationActivityText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMtmMedicationActivityPresciber(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMtmMedicationActivityPresciber(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMtmMedicationActivityIndicationEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMtmMedicationActivityIndicationEntryRelationship(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMtmMedicationActivityStopReasonEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMtmMedicationActivityStopReasonEntryRelationship(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMtmMedicationActivityReminderEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMtmMedicationActivityReminderEntryRelationship(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMtmMedicationActivityInstructionsEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMtmMedicationActivityInstructionsEntryRelationship(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMtmMedicationActivityGoalsEntryRelationship(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMtmMedicationActivityGoalsEntryRelationship(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityPrescriberAssignedPresciberPersonName(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityPrescriberAssignedPresciberPersonName(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityPrescriberAssignedPresciberAssignedPerson(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityPrescriberTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityPrescriberTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityPrescriberTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityPrescriberTypeCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityPrescriberAssignedAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityPrescriberAssignedAuthor(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityIndicationEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityIndicationEntryRelationshipTypeCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityIndicationEntryRelationshipIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityIndicationEntryRelationshipIndication(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityStopReasonEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityStopReasonEntryRelationshipTypeCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityReminderEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityReminderEntryRelationshipTypeCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityReminderEntryRelationshipReminder(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityReminderEntryRelationshipReminder(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityInstructionEntryRelationshipTypeCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityInstructionEntryRelationshipTypeCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityInstructionEntryRelationshipInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityInstructionEntryRelationshipInstructions(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActivityOperations.validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActivity init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MedicationActivityImpl
