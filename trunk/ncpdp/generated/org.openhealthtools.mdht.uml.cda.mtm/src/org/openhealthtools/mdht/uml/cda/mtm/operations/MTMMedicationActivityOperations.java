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

import org.openhealthtools.mdht.uml.cda.consol.Comment;
import org.openhealthtools.mdht.uml.cda.consol.Indication;
import org.openhealthtools.mdht.uml.cda.consol.Instructions;

import org.openhealthtools.mdht.uml.cda.consol.operations.MedicationActivityOperations;

import org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPlugin;

import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>MTM Medication Activity</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity#validateMTMMedicationActivityText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity#validateMTMMedicationActivityIndication(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Indication</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity#validateMTMMedicationActivityInstructions(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity#validateMTMMedicationActivityAuthor(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Author</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity#validateMTMMedicationActivityComment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Comment</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity#getmtmIndications() <em>Getmtm Indications</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity#getmtmInstructions() <em>Getmtm Instructions</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity#getComment() <em>Get Comment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MTMMedicationActivityOperations extends MedicationActivityOperations {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MTMMedicationActivityOperations() {
		super();
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMTMMedicationActivityText(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Text</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationActivityText(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())";

	/**
	 * The cached OCL invariant for the '{@link #validateMTMMedicationActivityText(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Text</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationActivityText(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * (self.text.oclIsUndefined() or self.text.isNullFlavorUndefined()) implies (not self.text.oclIsUndefined())
	 * @param mtmMedicationActivity The receiving '<em><b>MTM Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMTMMedicationActivityText(MTMMedicationActivity mtmMedicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MtmPackage.Literals.MTM_MEDICATION_ACTIVITY);
			try {
				VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mtmMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.WARNING,
						 MtmValidator.DIAGNOSTIC_SOURCE,
						 MtmValidator.MTM_MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_TEXT,
						 MtmPlugin.INSTANCE.getString("MTMMedicationActivityText"),
						 new Object [] { mtmMedicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMTMMedicationActivityIndication(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Indication</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationActivityIndication(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateMTMMedicationActivityIndication(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Indication</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationActivityIndication(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->exists(entryRelationship : cda::EntryRelationship | not entryRelationship.observation.oclIsUndefined() and entryRelationship.observation.oclIsKindOf(consol::Indication) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param mtmMedicationActivity The receiving '<em><b>MTM Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMTMMedicationActivityIndication(MTMMedicationActivity mtmMedicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MtmPackage.Literals.MTM_MEDICATION_ACTIVITY);
			try {
				VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_INDICATION__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mtmMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MtmValidator.DIAGNOSTIC_SOURCE,
						 MtmValidator.MTM_MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_INDICATION,
						 MtmPlugin.INSTANCE.getString("MTMMedicationActivityIndication"),
						 new Object [] { mtmMedicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMTMMedicationActivityInstructions(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationActivityInstructions(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)";

	/**
	 * The cached OCL invariant for the '{@link #validateMTMMedicationActivityInstructions(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Instructions</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationActivityInstructions(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Instructions) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::SUBJ)
	 * @param mtmMedicationActivity The receiving '<em><b>MTM Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMTMMedicationActivityInstructions(MTMMedicationActivity mtmMedicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MtmPackage.Literals.MTM_MEDICATION_ACTIVITY);
			try {
				VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_INSTRUCTIONS__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mtmMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MtmValidator.DIAGNOSTIC_SOURCE,
						 MtmValidator.MTM_MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_INSTRUCTIONS,
						 MtmPlugin.INSTANCE.getString("MTMMedicationActivityInstructions"),
						 new Object [] { mtmMedicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMTMMedicationActivityAuthor(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Author</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationActivityAuthor(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))";

	/**
	 * The cached OCL invariant for the '{@link #validateMTMMedicationActivityAuthor(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Author</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationActivityAuthor(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.author->one(author : cda::Author | not author.oclIsUndefined() and author.oclIsKindOf(rim::Participation))
	 * @param mtmMedicationActivity The receiving '<em><b>MTM Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMTMMedicationActivityAuthor(MTMMedicationActivity mtmMedicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MTM_MEDICATION_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MtmPackage.Literals.MTM_MEDICATION_ACTIVITY);
			try {
				VALIDATE_MTM_MEDICATION_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_AUTHOR__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mtmMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 MtmValidator.DIAGNOSTIC_SOURCE,
						 MtmValidator.MTM_MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_AUTHOR,
						 MtmPlugin.INSTANCE.getString("MTMMedicationActivityAuthor"),
						 new Object [] { mtmMedicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #validateMTMMedicationActivityComment(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationActivityComment(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String VALIDATE_MTM_MEDICATION_ACTIVITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)";

	/**
	 * The cached OCL invariant for the '{@link #validateMTMMedicationActivityComment(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate MTM Medication Activity Comment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #validateMTMMedicationActivityComment(MTMMedicationActivity, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	
	protected static Constraint VALIDATE_MTM_MEDICATION_ACTIVITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
	

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.entryRelationship->one(entryRelationship : cda::EntryRelationship | not entryRelationship.act.oclIsUndefined() and entryRelationship.act.oclIsKindOf(consol::Comment) and entryRelationship.typeCode = vocab::x_ActRelationshipEntryRelationship::RSON)
	 * @param mtmMedicationActivity The receiving '<em><b>MTM Medication Activity</b></em>' model object.
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  boolean validateMTMMedicationActivityComment(MTMMedicationActivity mtmMedicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (VALIDATE_MTM_MEDICATION_ACTIVITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(MtmPackage.Literals.MTM_MEDICATION_ACTIVITY);
			try {
				VALIDATE_MTM_MEDICATION_ACTIVITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_MTM_MEDICATION_ACTIVITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(VALIDATE_MTM_MEDICATION_ACTIVITY_COMMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(mtmMedicationActivity)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.INFO,
						 MtmValidator.DIAGNOSTIC_SOURCE,
						 MtmValidator.MTM_MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_COMMENT,
						 MtmPlugin.INSTANCE.getString("MTMMedicationActivityComment"),
						 new Object [] { mtmMedicationActivity }));
			}
			return false;
		}
		return true;
	}

	/**
	 * The cached OCL expression body for the '{@link #getmtmIndications(MTMMedicationActivity) <em>Getmtm Indications</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getmtmIndications(MTMMedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GETMTM_INDICATIONS__EOCL_EXP = "self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)";

	/**
	 * The cached OCL query for the '{@link #getmtmIndications(MTMMedicationActivity) <em>Getmtm Indications</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getmtmIndications(MTMMedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETMTM_INDICATIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getObservations()->select(observation : cda::Observation | not observation.oclIsUndefined() and observation.oclIsKindOf(consol::Indication)).oclAsType(consol::Indication)
	 * @param mtmMedicationActivity The receiving '<em><b>MTM Medication Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  EList<Indication> getmtmIndications(MTMMedicationActivity mtmMedicationActivity) {
		if (GETMTM_INDICATIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(MtmPackage.Literals.MTM_MEDICATION_ACTIVITY, MtmPackage.Literals.MTM_MEDICATION_ACTIVITY.getEAllOperations().get(91));
			try {
				GETMTM_INDICATIONS__EOCL_QRY = helper.createQuery(GETMTM_INDICATIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETMTM_INDICATIONS__EOCL_QRY);
		@SuppressWarnings("unchecked")
		Collection<Indication> result = (Collection<Indication>) query.evaluate(mtmMedicationActivity);
		return new BasicEList.UnmodifiableEList<Indication>(result.size(), result.toArray());
	}

	/**
	 * The cached OCL expression body for the '{@link #getmtmInstructions(MTMMedicationActivity) <em>Getmtm Instructions</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getmtmInstructions(MTMMedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GETMTM_INSTRUCTIONS__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->first().oclAsType(consol::Instructions)";

	/**
	 * The cached OCL query for the '{@link #getmtmInstructions(MTMMedicationActivity) <em>Getmtm Instructions</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getmtmInstructions(MTMMedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GETMTM_INSTRUCTIONS__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Instructions))->asSequence()->first().oclAsType(consol::Instructions)
	 * @param mtmMedicationActivity The receiving '<em><b>MTM Medication Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  Instructions getmtmInstructions(MTMMedicationActivity mtmMedicationActivity) {
		if (GETMTM_INSTRUCTIONS__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(MtmPackage.Literals.MTM_MEDICATION_ACTIVITY, MtmPackage.Literals.MTM_MEDICATION_ACTIVITY.getEAllOperations().get(92));
			try {
				GETMTM_INSTRUCTIONS__EOCL_QRY = helper.createQuery(GETMTM_INSTRUCTIONS__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GETMTM_INSTRUCTIONS__EOCL_QRY);
		return (Instructions) query.evaluate(mtmMedicationActivity);
	}

	/**
	 * The cached OCL expression body for the '{@link #getComment(MTMMedicationActivity) <em>Get Comment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment(MTMMedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static final String GET_COMMENT__EOCL_EXP = "self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Comment))->asSequence()->first().oclAsType(consol::Comment)";

	/**
	 * The cached OCL query for the '{@link #getComment(MTMMedicationActivity) <em>Get Comment</em>}' query operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComment(MTMMedicationActivity)
	 * @generated
	 * @ordered
	 */
	protected static OCLExpression<EClassifier> GET_COMMENT__EOCL_QRY;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * self.getActs()->select(act : cda::Act | not act.oclIsUndefined() and act.oclIsKindOf(consol::Comment))->asSequence()->first().oclAsType(consol::Comment)
	 * @param mtmMedicationActivity The receiving '<em><b>MTM Medication Activity</b></em>' model object.
	 * <!-- end-model-doc -->
	 * @generated
	 */
	
	public static  Comment getComment(MTMMedicationActivity mtmMedicationActivity) {
		if (GET_COMMENT__EOCL_QRY == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setOperationContext(MtmPackage.Literals.MTM_MEDICATION_ACTIVITY, MtmPackage.Literals.MTM_MEDICATION_ACTIVITY.getEAllOperations().get(93));
			try {
				GET_COMMENT__EOCL_QRY = helper.createQuery(GET_COMMENT__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		OCL.Query query = EOCL_ENV.createQuery(GET_COMMENT__EOCL_QRY);
		return (Comment) query.evaluate(mtmMedicationActivity);
	}

} // MTMMedicationActivityOperations