/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.operations;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClassifier;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.eclipse.ocl.expressions.OCLExpression;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationsSectionOperations;

import org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationSection;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPlugin;

import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>MTM Medication Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationSection#validateMTMMedicationSectionMedication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Section Medication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationSection#getmtmMedications() <em>Getmtm Medications</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MTMMedicationSectionOperations extends MedicationsSectionOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTMMedicationSectionOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMTMMedicationSectionMedication(MTMMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Section Medication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationSectionMedication(MTMMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MTM_MEDICATION_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(mtm::MTMMedicationActivity))";

	/**
	 * The cached OCL invariant for the '{@link #validateMTMMedicationSectionMedication(MTMMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Section Medication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationSectionMedication(MTMMedicationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MTM_MEDICATION_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entry->exists(entry : cda::Entry | not entry.substanceAdministration.oclIsUndefined() and entry.substanceAdministration.oclIsKindOf(mtm::MTMMedicationActivity))
	 * @param mtmMedicationSection The receiving '<em><b>MTM Medication Section</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMTMMedicationSectionMedication(MTMMedicationSection mtmMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MTM_MEDICATION_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MtmPackage.Literals.MTM_MEDICATION_SECTION);
			try {
				VALIDATE_MTM_MEDICATION_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_SECTION_MEDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mtmMedicationSection)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MtmValidator.DIAGNOSTIC_SOURCE,
						 MtmValidator.MTM_MEDICATION_SECTION__MTM_MEDICATION_SECTION_MEDICATION,
						 MtmPlugin.INSTANCE.getString("MTMMedicationSectionMedication"),
						 new Object [] { mtmMedicationSection }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getmtmMedications(MTMMedicationSection) <em>Getmtm Medications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getmtmMedications(MTMMedicationSection)
	 * @generated
	 * @ordered
	 */
	protected static final String GETMTM_MEDICATIONS__EOCL_EXP = "self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(mtm::MTMMedicationActivity)).oclAsType(mtm::MTMMedicationActivity)";

	/**
	 * The cached OCL query for the '{@link #getmtmMedications(MTMMedicationSection) <em>Getmtm Medications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getmtmMedications(MTMMedicationSection)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETMTM_MEDICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getSubstanceAdministrations()->select(substanceAdministration : cda::SubstanceAdministration | not substanceAdministration.oclIsUndefined() and substanceAdministration.oclIsKindOf(mtm::MTMMedicationActivity)).oclAsType(mtm::MTMMedicationActivity)
	 * @param mtmMedicationSection The receiving '<em><b>MTM Medication Section</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<MTMMedicationActivity> getmtmMedications(MTMMedicationSection mtmMedicationSection) {
		if (GETMTM_MEDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(MtmPackage.Literals.MTM_MEDICATION_SECTION, MtmPackage.Literals.MTM_MEDICATION_SECTION.getEAllOperations().get(66));
			try {
				GETMTM_MEDICATIONS__EOCL_QRY = helper.createQuery(GETMTM_MEDICATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETMTM_MEDICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<MTMMedicationActivity> result = (Collection<MTMMedicationActivity>) query.evaluate(mtmMedicationSection);
		return new BasicEList.UnmodifiableEList<MTMMedicationActivity>(result.size(), result.toArray());
	}

} // MTMMedicationSectionOperations