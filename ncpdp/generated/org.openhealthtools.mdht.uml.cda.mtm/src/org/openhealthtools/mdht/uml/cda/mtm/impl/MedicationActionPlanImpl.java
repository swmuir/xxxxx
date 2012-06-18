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

import org.openhealthtools.mdht.uml.cda.consol.impl.PlanOfCareSectionImpl;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlan;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;

import org.openhealthtools.mdht.uml.cda.mtm.operations.MedicationActionPlanOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Action Plan</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActionPlanImpl extends PlanOfCareSectionImpl implements MedicationActionPlan
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MedicationActionPlanImpl()
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
    return MtmPackage.Literals.MEDICATION_ACTION_PLAN;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationActionPlanMedicationActionPlanEncounter(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanOperations.validateMedicationActionPlanMedicationActionPlanEncounter(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MedicationActionPlanEncounter> getMedicationActionPlanEncounters()
  {
    return MedicationActionPlanOperations.getMedicationActionPlanEncounters(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validatePlanOfCareSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationActionPlanOperations.validatePlanOfCareSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MedicationActionPlan init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MedicationActionPlanImpl
