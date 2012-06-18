/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.mtm.MtmPackage
 * @generated
 */
public interface MtmFactory extends EFactory
{
  /**
   * The singleton instance of the factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  MtmFactory eINSTANCE = org.openhealthtools.mdht.uml.cda.mtm.impl.MtmFactoryImpl.init();

  /**
   * Returns a new object of class '<em>Medication Therapy Management Program</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Medication Therapy Management Program</em>'.
   * @generated
   */
  MedicationTherapyManagementProgram createMedicationTherapyManagementProgram();

  /**
   * Returns a new object of class '<em>Personal Medication List</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Personal Medication List</em>'.
   * @generated
   */
  PersonalMedicationList createPersonalMedicationList();

  /**
   * Returns a new object of class '<em>Medication Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Medication Activity</em>'.
   * @generated
   */
  MedicationActivity createMedicationActivity();

  /**
   * Returns a new object of class '<em>Medication Action Plan Goal</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Medication Action Plan Goal</em>'.
   * @generated
   */
  MedicationActionPlanGoal createMedicationActionPlanGoal();

  /**
   * Returns a new object of class '<em>Other Information Section</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Other Information Section</em>'.
   * @generated
   */
  OtherInformationSection createOtherInformationSection();

  /**
   * Returns a new object of class '<em>Medication Action Plan</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Medication Action Plan</em>'.
   * @generated
   */
  MedicationActionPlan createMedicationActionPlan();

  /**
   * Returns a new object of class '<em>Medication Action Plan Encounter</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Medication Action Plan Encounter</em>'.
   * @generated
   */
  MedicationActionPlanEncounter createMedicationActionPlanEncounter();

  /**
   * Returns a new object of class '<em>Medication Action Plan Activity</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Medication Action Plan Activity</em>'.
   * @generated
   */
  MedicationActionPlanActivity createMedicationActionPlanActivity();

  /**
   * Returns a new object of class '<em>Medication Action Plan Observation</em>'.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return a new object of class '<em>Medication Action Plan Observation</em>'.
   * @generated
   */
  MedicationActionPlanObservation createMedicationActionPlanObservation();

  /**
   * Returns the package supported by this factory.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @return the package supported by this factory.
   * @generated
   */
  MtmPackage getMtmPackage();

} //MtmFactory
