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
	 * Returns a new object of class '<em>MTM</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return a new object of class '<em>MTM</em>'.
	 * @generated
	 */
  MTM createMTM();

  /**
	 * Returns a new object of class '<em>MTM Medication Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MTM Medication Section</em>'.
	 * @generated
	 */
	MTMMedicationSection createMTMMedicationSection();

		/**
	 * Returns a new object of class '<em>MTM Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>MTM Medication Activity</em>'.
	 * @generated
	 */
	MTMMedicationActivity createMTMMedicationActivity();

		/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
  MtmPackage getMtmPackage();

} //MtmFactory
