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

import org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationSection;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;

import org.openhealthtools.mdht.uml.cda.mtm.operations.MTMMedicationSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MTM Medication Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MTMMedicationSectionImpl extends MedicationsSectionImpl implements MTMMedicationSection {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTMMedicationSectionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtmPackage.Literals.MTM_MEDICATION_SECTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationSectionMedication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MTMMedicationSectionOperations.validateMTMMedicationSectionMedication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MTMMedicationActivity> getmtmMedications() {
		return MTMMedicationSectionOperations.getmtmMedications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTMMedicationSection init() {
    	CDAUtil.init(this);
    	return this;
	}
} //MTMMedicationSectionImpl
