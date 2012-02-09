/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.openhealthtools.mdht.uml.cda.consol.util.ConsolValidator;
import org.openhealthtools.mdht.uml.cda.mtm.*;

import org.openhealthtools.mdht.uml.cda.util.CDAValidator;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.openhealthtools.mdht.uml.cda.mtm.MtmPackage
 * @generated
 */
public class MtmValidator extends EObjectValidator
{
  /**
	 * The cached model package
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final MtmValidator INSTANCE = new MtmValidator();

  /**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
  public static final String DIAGNOSTIC_SOURCE = "org.openhealthtools.mdht.uml.cda.mtm";

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate MTM Allergies Section' of 'MTM'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public static final int MTM__MTM_ALLERGIES_SECTION = 1;

  /**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate MTM Medications Section' of 'MTM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MTM__MTM_MEDICATIONS_SECTION = 2;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate General Header Constraints Template Id' of 'MTM'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MTM__GENERAL_HEADER_CONSTRAINTS_TEMPLATE_ID = 3;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate MTM Medication Section Medication' of 'MTM Medication Section'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MTM_MEDICATION_SECTION__MTM_MEDICATION_SECTION_MEDICATION = 4;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate MTM Medication Activity Text' of 'MTM Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MTM_MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_TEXT = 5;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate MTM Medication Activity Indication' of 'MTM Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MTM_MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_INDICATION = 6;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate MTM Medication Activity Instructions' of 'MTM Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MTM_MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_INSTRUCTIONS = 7;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate MTM Medication Activity Author' of 'MTM Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MTM_MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_AUTHOR = 8;

		/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Validate MTM Medication Activity Comment' of 'MTM Medication Activity'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int MTM_MEDICATION_ACTIVITY__MTM_MEDICATION_ACTIVITY_COMMENT = 9;

		/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 9;

  /**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

  /**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected CDAValidator cdaValidator;

  /**
	 * The cached base package validator.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ConsolValidator consolValidator;

		/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MtmValidator()
  {
		super();
		cdaValidator = CDAValidator.INSTANCE;
		consolValidator = ConsolValidator.INSTANCE;
	}

  /**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected EPackage getEPackage()
  {
	  return MtmPackage.eINSTANCE;
	}

  /**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		switch (classifierID) {
			case MtmPackage.MTM:
				return validateMTM((MTM)value, diagnostics, context);
			case MtmPackage.MTM_MEDICATION_SECTION:
				return validateMTMMedicationSection((MTMMedicationSection)value, diagnostics, context);
			case MtmPackage.MTM_MEDICATION_ACTIVITY:
				return validateMTMMedicationActivity((MTMMedicationActivity)value, diagnostics, context);
			default:
				return true;
		}
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateMTM(MTM mtm, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		if (!validate_NoCircularContainment(mtm, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateClassCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateClinicalDocument_validateMoodCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= validateMTM_validateGeneralHeaderConstraintsTemplateId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRealmCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTypeId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsTitle(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsEffectiveTime(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsConfidentialityCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLanguageCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSetId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsVersionNumber(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthor(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEnterer(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodian(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipient(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticator(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticator(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTarget(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOf(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformant(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsSupportParticipant(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOf(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceManufacturerModelName(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAuthoringDeviceSoftwareName(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasAssignedPersonOrAssignedAuthoringDevice(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorHasNationalProviderIdentifier(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorAddr(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthorTelecom(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthorAssignedAuthor(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityHasNationalProviderIdentifier(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAddr(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityTelecom(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsDataEntererAssignedEntityAssignedPerson(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationHasNationalProviderIdentifier(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationAddr(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationName(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianCustodianOrganizationTelecom(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodianRepresentedCustodianOrganization(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsCustodianAssignedCustodian(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientOrganizationName(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientInformationRecipient(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipientRecievedOrganization(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformationRecipientIntendedRecipient(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityHasNationalProviderIdentifier(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAddr(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityTelecom(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorAssignedEntityAssignedPerson(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorTime(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsLegalAuthenticatorSignatureCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityHasNationalProviderIdentifier(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityAddr(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntityTelecom(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorTime(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorSignatureCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsAuthenticatorAssignedEntity(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationHasNationalProviderIdentifier(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationAddr(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationName(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleProviderOrganizationTelecom(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationLanguageCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationPreferenceInd(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationProficiencyLevelCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunicationModeCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlaceAddr(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplacePlace(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianAddr(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianTelecom(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardianGuardianPerson(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToYear(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTimePreciseToDay(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthTime(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientEthnicGroupCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientMaritalStatusCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientName(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientRaceCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientReligiousAffiliationCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientGuardian(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientBirthplace(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatientLanguageCommunication(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleAddr(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRoleTelecom(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRolePatient(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsRecordTargetPatientRole(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterEffectiveTime(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounterId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsComponentOfEncompassingEncounter(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityAddr(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantRelatedEntityPerson(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityHasNationalProviderIdentifier(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityAddr(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityCode(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantAssignedEntityPerson(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInformantHasAssignedEntityOrRelatedEntity(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportAssociatedEntityHasAssociatedPersonOrScopingOrganization(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsParticipantSupportTime(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrderId(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateGeneralHeaderConstraints_validateGeneralHeaderConstraintsInFulfillmentOfOrder(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= validateMTM_validateMTMAllergiesSection(mtm, diagnostics, context);
		if (result || diagnostics != null) result &= validateMTM_validateMTMMedicationsSection(mtm, diagnostics, context);
		return result;
	}

  /**
	 * Validates the validateMTMAllergiesSection constraint of '<em>MTM</em>'.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public boolean validateMTM_validateMTMAllergiesSection(MTM mtm, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
		return mtm.validateMTMAllergiesSection(diagnostics, context);
	}

  /**
	 * Validates the validateMTMMedicationsSection constraint of '<em>MTM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTM_validateMTMMedicationsSection(MTM mtm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mtm.validateMTMMedicationsSection(diagnostics, context);
	}

		/**
	 * Validates the validateGeneralHeaderConstraintsTemplateId constraint of '<em>MTM</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTM_validateGeneralHeaderConstraintsTemplateId(MTM mtm, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mtm.validateGeneralHeaderConstraintsTemplateId(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationSection(MTMMedicationSection mtmMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mtmMedicationSection, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateClassCode(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSection_validateMoodCode(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsSection_validateMedicationsSectionEntriesOptionalTemplateId(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsSection_validateMedicationsSectionEntriesOptionalCode(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsSectionEntriesOptional_validateMedicationsSectionEntriesOptionalTitle(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsSectionEntriesOptional_validateMedicationsSectionEntriesOptionalText(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsSectionEntriesOptional_validateMedicationsSectionEntriesOptionalMedicationActivity(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsSection_validateMedicationsSectionTitle(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsSection_validateMedicationsSectionText(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationsSection_validateMedicationsSectionMedication(mtmMedicationSection, diagnostics, context);
		if (result || diagnostics != null) result &= validateMTMMedicationSection_validateMTMMedicationSectionMedication(mtmMedicationSection, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateMTMMedicationSectionMedication constraint of '<em>MTM Medication Section</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationSection_validateMTMMedicationSectionMedication(MTMMedicationSection mtmMedicationSection, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mtmMedicationSection.validateMTMMedicationSectionMedication(diagnostics, context);
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationActivity(MTMMedicationActivity mtmMedicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (!validate_NoCircularContainment(mtmMedicationActivity, diagnostics, context)) return false;
		boolean result = validate_EveryMultiplicityConforms(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= cdaValidator.validateSubstanceAdministration_validateClassCode(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityDoseQuantityorrateQuantity(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityTextReference(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityEffectiveTimeIVLTS(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityEffectiveTimePIVLTS(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityDoseQuantityUnit(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityDrugVehicleTypeCode(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityInstructionsInversionInd(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityPreconditionSubstanceAdmTypeCode(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityTemplateId(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityClassCode(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityId(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityCode(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityStatusCode(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityRouteCode(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityApproachSiteCode(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityDoseQuantity(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityRateQuantity(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityMaxDoseQuantity(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityAdministrationUnitCode(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityText(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityRepeatNumber(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityMedicationSupplyOrder(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityReactionObservation(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityPerformer(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityInstructions(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityIndication(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityMedicationDispense(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityPrecondition(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityDrugVehicle(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= consolValidator.validateMedicationActivity_validateMedicationActivityConsumable(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMTMMedicationActivity_validateMTMMedicationActivityText(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMTMMedicationActivity_validateMTMMedicationActivityIndication(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMTMMedicationActivity_validateMTMMedicationActivityInstructions(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMTMMedicationActivity_validateMTMMedicationActivityAuthor(mtmMedicationActivity, diagnostics, context);
		if (result || diagnostics != null) result &= validateMTMMedicationActivity_validateMTMMedicationActivityComment(mtmMedicationActivity, diagnostics, context);
		return result;
	}

		/**
	 * Validates the validateMTMMedicationActivityText constraint of '<em>MTM Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationActivity_validateMTMMedicationActivityText(MTMMedicationActivity mtmMedicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mtmMedicationActivity.validateMTMMedicationActivityText(diagnostics, context);
	}

		/**
	 * Validates the validateMTMMedicationActivityIndication constraint of '<em>MTM Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationActivity_validateMTMMedicationActivityIndication(MTMMedicationActivity mtmMedicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mtmMedicationActivity.validateMTMMedicationActivityIndication(diagnostics, context);
	}

		/**
	 * Validates the validateMTMMedicationActivityInstructions constraint of '<em>MTM Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationActivity_validateMTMMedicationActivityInstructions(MTMMedicationActivity mtmMedicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mtmMedicationActivity.validateMTMMedicationActivityInstructions(diagnostics, context);
	}

		/**
	 * Validates the validateMTMMedicationActivityAuthor constraint of '<em>MTM Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationActivity_validateMTMMedicationActivityAuthor(MTMMedicationActivity mtmMedicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mtmMedicationActivity.validateMTMMedicationActivityAuthor(diagnostics, context);
	}

		/**
	 * Validates the validateMTMMedicationActivityComment constraint of '<em>MTM Medication Activity</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateMTMMedicationActivity_validateMTMMedicationActivityComment(MTMMedicationActivity mtmMedicationActivity, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return mtmMedicationActivity.validateMTMMedicationActivityComment(diagnostics, context);
	}

		/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  @Override
  public ResourceLocator getResourceLocator()
  {
		return MtmPlugin.INSTANCE;
	}

} //MtmValidator
