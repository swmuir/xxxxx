/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.openhealthtools.mdht.uml.cda.mtm.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MtmFactoryImpl extends EFactoryImpl implements MtmFactory
{
  /**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static MtmFactory init()
  {
		try {
			MtmFactory theMtmFactory = (MtmFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.openhealthtools.org/mdht/uml/cda/mtm"); 
			if (theMtmFactory != null) {
				return theMtmFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new MtmFactoryImpl();
	}

  /**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MtmFactoryImpl()
  {
		super();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public EObject create(EClass eClass)
  {
		switch (eClass.getClassifierID()) {
			case MtmPackage.MTM: return createMTM();
			case MtmPackage.MTM_MEDICATION_SECTION: return createMTMMedicationSection();
			case MtmPackage.MTM_MEDICATION_ACTIVITY: return createMTMMedicationActivity();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MTM createMTM()
  {
		MTMImpl mtm = new MTMImpl();
		return mtm;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTMMedicationSection createMTMMedicationSection() {
		MTMMedicationSectionImpl mtmMedicationSection = new MTMMedicationSectionImpl();
		return mtmMedicationSection;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTMMedicationActivity createMTMMedicationActivity() {
		MTMMedicationActivityImpl mtmMedicationActivity = new MTMMedicationActivityImpl();
		return mtmMedicationActivity;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MtmPackage getMtmPackage()
  {
		return (MtmPackage)getEPackage();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
  @Deprecated
  public static MtmPackage getPackage()
  {
		return MtmPackage.eINSTANCE;
	}

} //MtmFactoryImpl
