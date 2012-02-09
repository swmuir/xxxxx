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

import org.openhealthtools.mdht.uml.cda.consol.Comment;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;

import org.openhealthtools.mdht.uml.cda.consol.impl.MedicationActivityImpl;

import org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;

import org.openhealthtools.mdht.uml.cda.mtm.operations.MTMMedicationActivityOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MTM Medication Activity</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class MTMMedicationActivityImpl extends MedicationActivityImpl implements MTMMedicationActivity {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTMMedicationActivityImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return MtmPackage.Literals.MTM_MEDICATION_ACTIVITY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationActivityText(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MTMMedicationActivityOperations.validateMTMMedicationActivityText(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationActivityIndication(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MTMMedicationActivityOperations.validateMTMMedicationActivityIndication(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationActivityInstructions(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MTMMedicationActivityOperations.validateMTMMedicationActivityInstructions(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationActivityAuthor(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MTMMedicationActivityOperations.validateMTMMedicationActivityAuthor(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationActivityComment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		return MTMMedicationActivityOperations.validateMTMMedicationActivityComment(this, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Indication> getmtmIndications() {
		return MTMMedicationActivityOperations.getmtmIndications(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Instructions getmtmInstructions() {
		return MTMMedicationActivityOperations.getmtmInstructions(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Comment getComment() {
		return MTMMedicationActivityOperations.getComment(this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MTMMedicationActivity init() {
    	CDAUtil.init(this);
    	return this;
	}
} //MTMMedicationActivityImpl
