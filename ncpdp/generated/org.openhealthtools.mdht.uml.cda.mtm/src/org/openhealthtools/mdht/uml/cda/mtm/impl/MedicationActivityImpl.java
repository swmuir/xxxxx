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

import org.openhealthtools.mdht.uml.cda.Act;
import org.openhealthtools.mdht.uml.cda.consol.CommentActivity;
import org.openhealthtools.mdht.uml.cda.consol.Indication;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanGoal;
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
public class MedicationActivityImpl extends org.openhealthtools.mdht.uml.cda.consol.impl.MedicationActivityImpl implements MedicationActivity
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MedicationActivityImpl()
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
    return MtmPackage.Literals.MEDICATION_ACTIVITY;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMtmMedicationActivityTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActivityOperations.validateMtmMedicationActivityTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMtmMedicationActivityText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActivityOperations.validateMtmMedicationActivityText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMtmMedicationActivityIndication(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActivityOperations.validateMtmMedicationActivityIndication(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMtmMedicationActivityInstructions(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActivityOperations.validateMtmMedicationActivityInstructions(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMtmMedicationActivityPresciber(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActivityOperations.validateMtmMedicationActivityPresciber(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMtmMedicationActivityGoals(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActivityOperations.validateMtmMedicationActivityGoals(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMtmMedicationActivityReminders(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActivityOperations.validateMtmMedicationActivityReminders(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMtmMedicationActivityStopReason(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActivityOperations.validateMtmMedicationActivityStopReason(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<Indication> getmtmIndications()
  {
    return MedicationActivityOperations.getmtmIndications(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getmtmInstructions()
  {
    MedicationActivityOperations.getmtmInstructions(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MedicationActionPlanGoal> getGoalss()
  {
    return MedicationActivityOperations.getGoalss(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public void getReminders()
  {
    MedicationActivityOperations.getReminders(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public Act getStopReason()
  {
    return MedicationActivityOperations.getStopReason(this);
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
