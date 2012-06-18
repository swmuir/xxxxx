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

import org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityObservationImpl;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanGoal;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;

import org.openhealthtools.mdht.uml.cda.mtm.operations.MedicationActionPlanGoalOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Action Plan Goal</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActionPlanGoalImpl extends PlanOfCareActivityObservationImpl implements MedicationActionPlanGoal {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicationActionPlanGoalImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return MtmPackage.Literals.MEDICATION_ACTION_PLAN_GOAL;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanGoalMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActionPlanGoalOperations.validateMedicationActionPlanGoalMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanGoalText(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActionPlanGoalOperations.validateMedicationActionPlanGoalText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePlanOfCareActivityObservationMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActionPlanGoalOperations.validatePlanOfCareActivityObservationMoodCode(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActionPlanGoal init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MedicationActionPlanGoalImpl
