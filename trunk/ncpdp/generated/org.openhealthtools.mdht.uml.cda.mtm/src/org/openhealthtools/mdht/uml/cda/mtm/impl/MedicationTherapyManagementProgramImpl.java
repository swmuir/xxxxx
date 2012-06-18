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

import org.openhealthtools.mdht.uml.cda.consol.AllergiesSectionEntriesOptional;

import org.openhealthtools.mdht.uml.cda.consol.impl.GeneralHeaderConstraintsImpl;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlan;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationSection;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection;

import org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationList;
import org.openhealthtools.mdht.uml.cda.mtm.operations.MedicationTherapyManagementProgramOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medication Therapy Management Program</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MedicationTherapyManagementProgramImpl extends GeneralHeaderConstraintsImpl implements MedicationTherapyManagementProgram
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected MedicationTherapyManagementProgramImpl()
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
    return MtmPackage.Literals.MEDICATION_THERAPY_MANAGEMENT_PROGRAM;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationTherapyManagementProgramAllergiesSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationTherapyManagementProgramOperations.validateMedicationTherapyManagementProgramAllergiesSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationTherapyManagementProgramMedicationsSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationTherapyManagementProgramOperations.validateMedicationTherapyManagementProgramMedicationsSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationTherapyManagementProgramOtherInformationSection(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationTherapyManagementProgramOperations.validateMedicationTherapyManagementProgramOtherInformationSection(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationTherapyManagementProgramMedicationActionPlan(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationTherapyManagementProgramOperations.validateMedicationTherapyManagementProgramMedicationActionPlan(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateMedicationTherapyManagementProgramAuthor(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationTherapyManagementProgramOperations.validateMedicationTherapyManagementProgramAuthor(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public AllergiesSectionEntriesOptional getAllergiesSection()
  {
    return MedicationTherapyManagementProgramOperations.getAllergiesSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersonalMedicationList getMedicationsSection()
  {
    return MedicationTherapyManagementProgramOperations.getMedicationsSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherInformationSection getOtherInformationSection()
  {
    return MedicationTherapyManagementProgramOperations.getOtherInformationSection(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MedicationActionPlan getMedicationActionPlan()
  {
    return MedicationTherapyManagementProgramOperations.getMedicationActionPlan(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateGeneralHeaderConstraintsTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return MedicationTherapyManagementProgramOperations.validateGeneralHeaderConstraintsTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public MedicationTherapyManagementProgram init() {
    	CDAUtil.init(this);
    	return this;
  }
} //MedicationTherapyManagementProgramImpl
