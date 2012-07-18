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

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanObservation;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;

import org.openhealthtools.mdht.uml.cda.mtm.operations.MedicationActionPlanObservationOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Action Plan Observation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActionPlanObservationImpl extends PlanOfCareActivityObservationImpl implements MedicationActionPlanObservation {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicationActionPlanObservationImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return MtmPackage.Literals.MEDICATION_ACTION_PLAN_OBSERVATION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanObservationText(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActionPlanObservationOperations.validateMedicationActionPlanObservationText(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanObservationEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanObservationOperations.validateMedicationActionPlanObservationEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActionPlanObservation init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MedicationActionPlanObservationImpl
