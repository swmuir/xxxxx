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

import org.openhealthtools.mdht.uml.cda.consol.impl.MedicationsSectionImpl;

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationList;

import org.openhealthtools.mdht.uml.cda.mtm.operations.PersonalMedicationListOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Personal Medication List</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class PersonalMedicationListImpl extends MedicationsSectionImpl implements PersonalMedicationList
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected PersonalMedicationListImpl()
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
    return MtmPackage.Literals.PERSONAL_MEDICATION_LIST;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validatePersonalMedicationListMedication(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PersonalMedicationListOperations.validatePersonalMedicationListMedication(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EList<MedicationActivity> getmtmMedications()
  {
    return PersonalMedicationListOperations.getmtmMedications(this);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  public boolean validateMedicationsSectionEntriesOptionalTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return PersonalMedicationListOperations.validateMedicationsSectionEntriesOptionalTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public PersonalMedicationList init() {
    	CDAUtil.init(this);
    	return this;
  }
} //PersonalMedicationListImpl
