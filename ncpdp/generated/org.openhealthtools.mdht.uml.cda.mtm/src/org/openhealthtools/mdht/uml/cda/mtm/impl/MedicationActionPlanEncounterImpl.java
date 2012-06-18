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

import org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareActivityEncounterImpl;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanObservation;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;

import org.openhealthtools.mdht.uml.cda.mtm.operations.MedicationActionPlanEncounterOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Action Plan Encounter</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActionPlanEncounterImpl extends PlanOfCareActivityEncounterImpl implements MedicationActionPlanEncounter
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MedicationActionPlanEncounterImpl()
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
    return MtmPackage.Literals.MEDICATION_ACTION_PLAN_ENCOUNTER;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanEncounterEffectiveTime(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanEncounterOperations.validateMedicationActionPlanEncounterEffectiveTime(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanEncounterText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanEncounterOperations.validateMedicationActionPlanEncounterText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanEncounterCodeP(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanEncounterOperations.validateMedicationActionPlanEncounterCodeP(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanEncounterCode(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanEncounterOperations.validateMedicationActionPlanEncounterCode(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanEncounterMedicationActionPlanActivity(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanEncounterOperations.validateMedicationActionPlanEncounterMedicationActionPlanActivity(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanEncounterMedicationActionPlanObservation(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanEncounterOperations.validateMedicationActionPlanEncounterMedicationActionPlanObservation(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MedicationActionPlanActivity> getMedicationActionPlanActivities()
  {
    return MedicationActionPlanEncounterOperations.getMedicationActionPlanActivities(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MedicationActionPlanObservation> getMedicationActionPlanObservations()
  {
    return MedicationActionPlanEncounterOperations.getMedicationActionPlanObservations(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MedicationActionPlanEncounter init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MedicationActionPlanEncounterImpl
