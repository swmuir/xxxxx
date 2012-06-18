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

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;

import org.openhealthtools.mdht.uml.cda.mtm.operations.MedicationActionPlanSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Action Plan Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationActionPlanSectionImpl extends PlanOfCareSectionImpl implements MedicationActionPlanSection {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected MedicationActionPlanSectionImpl() {
    super();
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	protected EClass eStaticClass() {
    return MtmPackage.Literals.MEDICATION_ACTION_PLAN_SECTION;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActionPlanSectionOperations.validateMedicationActionPlanSectionTitle(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public boolean validateMedicationActionPlanSectionMedicationActionPlanEncounter(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActionPlanSectionOperations.validateMedicationActionPlanSectionMedicationActionPlanEncounter(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EList<MedicationActionPlanEncounter> getMedicationActionPlanEncounters() {
    return MedicationActionPlanSectionOperations.getMedicationActionPlanEncounters(this);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	@Override
	public boolean validatePlanOfCareSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context) {
    return MedicationActionPlanSectionOperations.validatePlanOfCareSectionTemplateId(this, diagnostics, context);
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MedicationActionPlanSection init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MedicationActionPlanSectionImpl
