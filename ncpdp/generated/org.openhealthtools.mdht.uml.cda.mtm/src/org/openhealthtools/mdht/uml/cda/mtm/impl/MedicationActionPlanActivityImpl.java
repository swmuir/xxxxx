/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityActImpl;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanGoal;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanObservation;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;

import org.openhealthtools.mdht.uml.cda.mtm.operations.MedicationActionPlanActivityOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Action Plan Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActionPlanActivityImpl extends PlanOfCareActivityActImpl implements MedicationActionPlanActivity
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MedicationActionPlanActivityImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MtmPackage.Literals.MEDICATION_ACTION_PLAN_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanActivityText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanActivityOperations.validateMedicationActionPlanActivityText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanActivityCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanActivityOperations.validateMedicationActionPlanActivityCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanActivityCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanActivityOperations.validateMedicationActionPlanActivityCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanActivityMedicationActionPlanGoal(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanActivityOperations.validateMedicationActionPlanActivityMedicationActionPlanGoal(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanActivityMedicationActionPlanObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanActivityOperations.validateMedicationActionPlanActivityMedicationActionPlanObservation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MedicationActionPlanGoal> getMedicationActionPlanGoals()
  {
    return MedicationActionPlanActivityOperations.getMedicationActionPlanGoals(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MedicationActionPlanObservation getMedicationActionPlanObservation()
  {
    return MedicationActionPlanActivityOperations.getMedicationActionPlanObservation(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validatePlanOfCareActivityActTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanActivityOperations.validatePlanOfCareActivityActTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validatePlanOfCareActivityActMoodCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanActivityOperations.validatePlanOfCareActivityActMoodCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MedicationActionPlanActivity init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MedicationActionPlanActivityImpl
