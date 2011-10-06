/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.ecl.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ncpdp.uml.ecl.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalCodeListFactoryImpl extends EFactoryImpl implements ExternalCodeListFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExternalCodeListFactory init() {
		try {
			ExternalCodeListFactory theExternalCodeListFactory = (ExternalCodeListFactory)EPackage.Registry.INSTANCE.getEFactory("http://www.ncpdp.org/uml/ecl"); 
			if (theExternalCodeListFactory != null) {
				return theExternalCodeListFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new ExternalCodeListFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalCodeListFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case ExternalCodeListPackage.ACCUMULATOR_MONTH:
				return createAccumulatorMonthFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ADDITIONAL_DOCUMENTATION_TYPE_ID:
				return createAdditionalDocumentationTypeIDFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY:
				return createAdditionalMessageInformationContinuityFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ADDITIONAL_MESSAGE_INFORMATION_QUALIFIER:
				return createAdditionalMessageInformationQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ADDRESS_QUALIFIER:
				return createAddressQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ADJUDICATOR_ID_QUALIFIER:
				return createAdjudicatorIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ADJUSTMENT_TYPE:
				return createAdjustmentTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ADMINISTRATION_TIMING_CODE_QUALIFIER_SIG_SEGMENT:
				return createAdministrationTimingCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ADMINISTRATIVE_FEE_EFFECT_INDICATOR:
				return createAdministrativeFeeEffectIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER:
				return createAmountAttributedToProductSelectionQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.APPROVED_MESSAGE_CODE:
				return createApprovedMessageCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ASSOCIATED_PRESCRIPTION_SERVICE_PROVIDER_ID_QUALIFIER:
				return createAssociatedPrescriptionServiceProviderIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER:
				return createAssociatedPrescriptionServiceReferenceNumberQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.AUTHORIZED_REPRESENTATIVE_STATE_PROVINCE_ADDRESS:
				return createAuthorizedRepresentativeStateProvinceAddressFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BASELINE_QUALIFIER:
				return createBaselineQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BASE_PRICE_TYPE:
				return createBasePriceTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BASIS_OF_CALCULATION_COINSURANCE:
				return createBasisOfCalculationCoinsuranceFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BASIS_OF_CALCULATION_COPAY:
				return createBasisOfCalculationCopayFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BASIS_OF_CALCULATION_DISPENSING_FEE:
				return createBasisOfCalculationDispensingFeeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BASIS_OF_CALCULATION_FLAT_SALES_TAX:
				return createBasisOfCalculationFlatSalesTaxFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BASIS_OF_CALCULATION_PERCENTAGE_SALES_TAX:
				return createBasisOfCalculationPercentageSalesTaxFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BASIS_OF_COST_DETERMINATION:
				return createBasisOfCostDeterminationFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BASIS_OF_REIMBURSEMENT_DETERMINATION:
				return createBasisOfReimbursementDeterminationFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BASIS_OF_REQUEST:
				return createBasisOfRequestFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BENEFIT_AMOUNT_TIME_PERIOD:
				return createBenefitAmountTimePeriodFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BENEFIT_AMOUNT_TYPE:
				return createBenefitAmountTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BENEFIT_STAGE_QUALIFIER:
				return createBenefitStageQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BENEFIT_TYPE:
				return createBenefitTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BILLING_ENTITY_TYPE_INDICATOR:
				return createBillingEntityTypeIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BODY_METRIC_QUALIFIER_SIG_SEGMENT:
				return createBodyMetricQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BRAND_GENERIC_INDICATOR:
				return createBrandGenericIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.BRANDED_GENERIC_COPAY_CONFIDENTIAL:
				return createBrandedGenericCopayConfidentialFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CALCULATED_DOSE_UNITOF_MEASURE_CODE_QUALIFIER_SIG_SEGMENT:
				return createCalculatedDoseUnitofMeasureCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CARRIER_LOCATION_STATE:
				return createCarrierLocationStateFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CHANGE_IDENTIFIER:
				return createChangeIdentifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CHANGEOF_PRESCRIPTION_STATUS_FLAG:
				return createChangeofPrescriptionStatusFlagFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CLAIM_MEDIA_TYPE:
				return createClaimMediaTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CLAIM_ORIGINATION:
				return createClaimOriginationFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CLIENT_FORMULARY_FLAG:
				return createClientFormularyFlagFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CLIENT_PRICING_BASIS_OF_COST:
				return createClientPricingBasisOfCostFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CLINICAL_INFORMATION_QUALIFIER:
				return createClinicalInformationQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CLINICAL_SIGNIFICANCE_CODE:
				return createClinicalSignificanceCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CMS_PART_DDEFINED_QUALIFIED_FACILITY:
				return createCMSPartDDefinedQualifiedFacilityFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COB_PRIMARY_CLAIM_TYPE:
				return createCOBPrimaryClaimTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CODE_LIST_QUALIFIER_DIAGNOSIS_CODE_QUALIFIER_PRIMARY_DRU_SEGMENT:
				return createCodeListQualifierDiagnosisCodeQualifierPrimaryDRUSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CODE_LIST_QUALIFIER_REJECT_CODE_STS_SEGMENT:
				return createCodeListQualifierRejectCodeSTSSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CODE_LIST_QUALIFIER_RESPONSE_CODE_RES_SEGMENT:
				return createCodeListQualifierResponseCodeRESSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COMMUNICATION_TYPE_INDICATOR:
				return createCommunicationTypeIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COMPOUND_CODE:
				return createCompoundCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COMPOUND_DISPENSING_UNIT_FORM_INDICATOR:
				return createCompoundDispensingUnitFormIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COMPOUND_DOSAGE_FORM_DESCRIPTION_CODE:
				return createCompoundDosageFormDescriptionCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COMPOUND_INDICATOR:
				return createCompoundIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COMPOUND_INGREDIENT_BASISOF_COST_DETERMINATION:
				return createCompoundIngredientBasisofCostDeterminationFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COMPOUND_PRODUCT_ID_QUALIFIER:
				return createCompoundProductIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COMPOUND_ROUTEOF_ADMINISTRATION:
				return createCompoundRouteofAdministrationFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COMPOUND_TYPE:
				return createCompoundTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CONDITION_RESPONSECODED_PATIENT_CONSENT_INDICATOR:
				return createConditionResponsecodedPatientConsentIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.CONTRACTING_ORGANIZATION_PMOID_QUALIFIER:
				return createContractingOrganizationPMOIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COPAY_COINSURANCE_OVERRIDE_TYPE:
				return createCopayCoinsuranceOverrideTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COPAY_LIST_TYPE:
				return createCopayListTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COUNTRY_SUBENTITY_IDENTIFICATION:
				return createCountrySubentityIdentificationFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COUPON_TYPE:
				return createCouponTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.COVERAGE_LIST_TYPE:
				return createCoverageListTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DATABASE_INDICATOR:
				return createDatabaseIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DATA_LEVEL:
				return createDataLevelFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DATA_PROVIDER_ID_QUALIFIER:
				return createDataProviderIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DEA_SCHEDULE:
				return createDEAScheduleFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DELAY_REASON_CODE:
				return createDelayReasonCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DIAGNOSIS_CODE_QUALIFIER:
				return createDiagnosisCodeQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DISCONTINUE_DATE_QUALIFIER:
				return createDiscontinueDateQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DISPENSE_AS_WRITTEN_DAW_PRODUCT_SELECTION_CODE:
				return createDispenseAsWrittenDAWProductSelectionCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DISPENSE_AS_WRITTEN_DAW_DIFFERENCE:
				return createDispenseAsWrittenDAWDifferenceFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DISPENSING_STATUS:
				return createDispensingStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DO_NOT_FILL_PROFILE_FLAG:
				return createDoNotFillProfileFlagFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DOSAGE_FORM_ID_CODE:
				return createDosageFormIDCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DOSE_BASIS_RANGE_MODIFIER_SIG_SEGMENT:
				return createDoseBasisRangeModifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT:
				return createDoseCompositeIndicatorSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DOSE_DELIVERY_METHOD_CODE_QUALIFIER_SIG_SEGMENT:
				return createDoseDeliveryMethodCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DOSE_DELIVERY_METHOD_MODIFIER_CODE_QUALIFIER_SIG_SEGMENT:
				return createDoseDeliveryMethodModifierCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DOSE_FORM_CODE_QUALIFIER_SIG_SEGMENT:
				return createDoseFormCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DOSE_RANGE_MODIFIER_SIG_SEGMENT:
				return createDoseRangeModifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DOSING_BASIS_UNITOF_MEASURE_CODE_QUALIFIER_SIG_SEGMENT:
				return createDosingBasisUnitofMeasureCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DRUG_COVERAGE_STATUS_CODE:
				return createDrugCoverageStatusCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DRUG_QUALIFIER_STEP_DRUG:
				return createDrugQualifierStepDrugFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DRUG_REFERENCE_QUALIFIER:
				return createDrugReferenceQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DRUG_REFERENCE_QUALIFIER_ALTERNATIVE:
				return createDrugReferenceQualifierAlternativeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DRUG_REFERENCE_QUALIFIER_SOURCE:
				return createDrugReferenceQualifierSourceFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DRUG_REFERENCE_QUALIFIER_STEP_DRUG:
				return createDrugReferenceQualifierStepDrugFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DRUG_TYPE:
				return createDrugTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DUE_CLINICAL_SIGNIFICANCE_CODE:
				return createDUEClinicalSignificanceCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DUE_CO_AGENT_ID_QUALIFIER:
				return createDUECoAgentIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DUE_PROFESSIONAL_SERVICE_CODE:
				return createDUEProfessionalServiceCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DUE_REASON_FOR_SERVICE_CODE:
				return createDUEReasonForServiceCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DUE_RESULT_OF_SERVICE_CODE:
				return createDUEResultOfServiceCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DURPPS_LEVEL_OF_EFFORT:
				return createDURPPSLevelOfEffortFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DURATION_TEXT_CODE_QUALIFIER_SIG_SEGMENT:
				return createDurationTextCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.DUR_CO_AGENT_ID_QUALIFIER:
				return createDURCoAgentIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.EASY_OPEN_CAP_INDICATOR:
				return createEasyOpenCapIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ELIGIBILITY_PATIENT_RELATIONSHIP_CODE:
				return createEligibilityPatientRelationshipCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ELIGIBILITY_CLARIFICATION_CODE:
				return createEligibilityClarificationCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ELIGIBILITY_COB_INDICATOR:
				return createEligibilityCOBIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ELIGIBLE_COVERAGE_CODE:
				return createEligibleCoverageCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ELIGIBLE_PLAN:
				return createEligiblePlanFromString(eDataType, initialValue);
			case ExternalCodeListPackage.EMPLOYER_STATE_PROVINCE_ADDRESS:
				return createEmployerStateProvinceAddressFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ENTITY_STATE:
				return createEntityStateFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FACILITY_STATE_PROVINCE_ADDRESS:
				return createFacilityStateProvinceAddressFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FDA_DRUG_EFFICACY_CODE:
				return createFDADrugEfficacyCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FEDERAL_DEA_SCHEDULE:
				return createFederalDEAScheduleFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FEDERAL_UPPER_LIMIT_INDICATOR:
				return createFederalUpperLimitIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FF_PRESCRIBER_ID_QUALIFIER:
				return createFFPrescriberIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FILE_STRUCTURE_TYPE:
				return createFileStructureTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FILE_TYPE:
				return createFileTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FILL_NUMBER:
				return createFillNumberFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FILL_NUMBER_CALCULATED:
				return createFillNumberCalculatedFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FINAL_COMPOUND_PHARMACEUTICAL_DOSAGE_FORM:
				return createFinalCompoundPharmaceuticalDosageFormFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FIRST_COPAY_TERM:
				return createFirstCopayTermFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FORMULARY_BENEFIT_DESIGN_TYPE:
				return createFormularyBenefitDesignTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL:
				return createFormularyNonFormularyCoPayConfidentialFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FORMULARY_PRODUCT_CO_PAY_CONFIDENTIAL:
				return createFormularyProductCoPayConfidentialFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FORMULARY_STATUS:
				return createFormularyStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.FREQUENCY_UNITS_CODE_QUALIFIER_SIG_SEGMENT:
				return createFrequencyUnitsCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.GENDER_CODE:
				return createGenderCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.GENERIC_AVAILABLE:
				return createGenericAvailableFromString(eDataType, initialValue);
			case ExternalCodeListPackage.GENERIC_EQUIVALENT_PRODUCT_ID_QUALIFIER:
				return createGenericEquivalentProductIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.HEADER_RESPONSE_STATUS:
				return createHeaderResponseStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.HELP_DESK_PHONE_NUMBER_QUALIFIER:
				return createHelpDeskPhoneNumberQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.INACTIVE_PRESCRIPTION_INDICATOR:
				return createInactivePrescriptionIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.INDICATION_PRECURSOR_CODE_QUALIFIER_SIG_SEGMENT:
				return createIndicationPrecursorCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.INDICATION_TEXT_CODE_QUALIFIER_SIG_SEGMENT:
				return createIndicationTextCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.INDICATION_VALUE_UNITOF_MEASURE_CODE_QUALIFIER_SIG_SEGMENT:
				return createIndicationValueUnitofMeasureCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.INDICATION_VARIABLE_MODIFIER_SIG_SEGMENT:
				return createIndicationVariableModifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.INDIVIDUAL_RELATIONSHIPCODED:
				return createIndividualRelationshipcodedFromString(eDataType, initialValue);
			case ExternalCodeListPackage.IN_NETWORK_INDICATOR:
				return createInNetworkIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.INTERMEDIARY_AUTHORIZATION_TYPE_ID:
				return createIntermediaryAuthorizationTypeIDFromString(eDataType, initialValue);
			case ExternalCodeListPackage.INTERVAL_UNITS_CODE_QUALIFIER_SIG_SEGMENT:
				return createIntervalUnitsCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.INVOICE_TYPE1:
				return createInvoiceType1FromString(eDataType, initialValue);
			case ExternalCodeListPackage.INVOICE_TYPE2:
				return createInvoiceType2FromString(eDataType, initialValue);
			case ExternalCodeListPackage.INVOICE_TYPE3:
				return createInvoiceType3FromString(eDataType, initialValue);
			case ExternalCodeListPackage.INVOICE_TYPE4:
				return createInvoiceType4FromString(eDataType, initialValue);
			case ExternalCodeListPackage.INVOICE_TYPE5:
				return createInvoiceType5FromString(eDataType, initialValue);
			case ExternalCodeListPackage.ITEM_FORM_CODE:
				return createItemFormCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ITEM_STRENGTH_CODE:
				return createItemStrengthCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.JURISDICTIONAL_STATE:
				return createJurisdictionalStateFromString(eDataType, initialValue);
			case ExternalCodeListPackage.LENGTHOF_NEED_QUALIFIER:
				return createLengthofNeedQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.LEVELOF_SERVICE:
				return createLevelofServiceFromString(eDataType, initialValue);
			case ExternalCodeListPackage.LIST_ACTION:
				return createListActionFromString(eDataType, initialValue);
			case ExternalCodeListPackage.LOAD_STATUS:
				return createLoadStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MAC_REDUCED_INDICATOR:
				return createMACReducedIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MAIL_ORDER_ID_QUALIFIER:
				return createMailOrderIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MAINTENANCE_DRUG_INDICATOR:
				return createMaintenanceDrugIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MANUFACTURER_PICOID_QUALIFIER:
				return createManufacturerPICOIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MAXIMUM_AGE_QUALIFIER:
				return createMaximumAgeQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MAXIMUM_AMOUNT_QUALIFIER:
				return createMaximumAmountQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MAXIMUM_AMOUNT_TIME_PERIOD:
				return createMaximumAmountTimePeriodFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MAXIMUM_DOSE_RESTRICTION_CODE_QUALIFIER_SIG_SEGMENT:
				return createMaximumDoseRestrictionCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MAXIMUM_DOSE_RESTRICTION_VARIABLE_DURATION_MODIFIER_SIG_SEGMENT:
				return createMaximumDoseRestrictionVariableDurationModifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MAXIMUM_DOSE_RESTRICTION_VARIABLE_UNITS_CODE_QUALIFIER_SIG_SEGMENT:
				return createMaximumDoseRestrictionVariableUnitsCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEASUREMENT_DATA_QUALIFIER:
				return createMeasurementDataQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEASUREMENT_DIMENSION:
				return createMeasurementDimensionFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEASUREMENT_UNIT:
				return createMeasurementUnitFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEASUREMENT_UNIT_CODE:
				return createMeasurementUnitCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEDICAID_INDICATOR:
				return createMedicaidIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEDICARE_PART_DCOVERAGE_CODE:
				return createMedicarePartDCoverageCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEDICARE_PLAN_CODE:
				return createMedicarePlanCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEDICARE_RECOVERY_DISPENSING_INDICATOR:
				return createMedicareRecoveryDispensingIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEDICARE_RECOVERY_INDICATOR:
				return createMedicareRecoveryIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEMBERSHIP_COUNT_QUALIFIER:
				return createMembershipCountQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEMBERSHIP_PERIOD_QUALIFIER:
				return createMembershipPeriodQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEMBERSHIP_TYPE_QUALIFIER:
				return createMembershipTypeQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MEMBER_SUBMITTED_CLAIM_PROGRAM_CODE:
				return createMemberSubmittedClaimProgramCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MESSAGE_FUNCTIONCODED:
				return createMessageFunctioncodedFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MINIMUM_AGE_QUALIFIER:
				return createMinimumAgeQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MULTIPLE_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT:
				return createMultipleAdministrationTimingModifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MULTIPLE_ROUTEOF_ADMINISTRATION_MODIFIER:
				return createMultipleRouteofAdministrationModifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MULTIPLE_SIG_MODIFIER_SIG_SEGMENT:
				return createMultipleSigModifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT:
				return createMultipleSiteofAdministrationTimingModifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.MULTIPLE_VEHICLE_MODIFIER_SIG_SEGMENT:
				return createMultipleVehicleModifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.NO_KNOWN_ALLERGIES:
				return createNoKnownAllergiesFromString(eDataType, initialValue);
			case ExternalCodeListPackage.NON_LISTED_BRAND_OVER_THE_COUNTER_FORMULARY_STATUS:
				return createNonListedBrandOverTheCounterFormularyStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.NON_LISTED_GENERIC_OVER_THE_COUNTER_FORMULARY_STATUS:
				return createNonListedGenericOverTheCounterFormularyStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.NON_LISTED_PRESCRIPTION_BRAND_FORMULARY_STATUS:
				return createNonListedPrescriptionBrandFormularyStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.NON_LISTED_PRESCRIPTION_GENERIC_FORMULARY_STATUS:
				return createNonListedPrescriptionGenericFormularyStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.NON_LISTED_SUPPLIES_FORMULARY_STATUS:
				return createNonListedSuppliesFormularyStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.NON_POS_CLAIM_OVERRIDE_CODE:
				return createNonPOSClaimOverrideCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.NUMBEROF_REFILLS_AUTHORIZED:
				return createNumberofRefillsAuthorizedFromString(eDataType, initialValue);
			case ExternalCodeListPackage.NUMERATOR_INDICATOR:
				return createNumeratorIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ORIGINALLY_PRESCRIBED_PRODUCT_SERVICE_ID_QUALIFIER:
				return createOriginallyPrescribedProductServiceIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.OTHER_AMOUNT_CLAIMED_SUBMITTED_QUALIFIER:
				return createOtherAmountClaimedSubmittedQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.OTHER_AMOUNT_PAID_QUALIFIER:
				return createOtherAmountPaidQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.OTHER_COVERAGE_CODE:
				return createOtherCoverageCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.OTHER_PAYER_AMOUNT_PAID_QUALIFIER:
				return createOtherPayerAmountPaidQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.OTHER_PAYER_COVERAGE_TYPE:
				return createOtherPayerCoverageTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.OTHER_PAYER_ID_QUALIFIER:
				return createOtherPayerIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.OTHER_PAYER_PATIENT_RELATIONSHIP_CODE:
				return createOtherPayerPatientRelationshipCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.OTHER_PAYER_PATIENT_RESPONSIBILITY_AMOUNT_QUALIFIER:
				return createOtherPayerPatientResponsibilityAmountQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.OTHER_PHARMACY_INDICATOR:
				return createOtherPharmacyIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.OTHER_PRESCRIBER_INDICATOR:
				return createOtherPrescriberIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PATIENT_ASSIGNMENT_INDICATOR_DIRECT_MEMBER_REIMBURSEMENT_INDICATOR:
				return createPatientAssignmentIndicatorDirectMemberReimbursementIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PATIENT_GENDER_CODE:
				return createPatientGenderCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PATIENT_ID_ASSOCIATED_STATE_PROVINCE_ADDRESS:
				return createPatientIDAssociatedStateProvinceAddressFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PATIENT_ID_QUALIFIER:
				return createPatientIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PATIENT_LOCATION:
				return createPatientLocationFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PATIENT_RELATIONSHIP_CODE:
				return createPatientRelationshipCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PATIENT_RESIDENCE:
				return createPatientResidenceFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PATIENT_STATE_PROVINCE_ADDRESS:
				return createPatientStateProvinceAddressFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PAYER_ID_QUALIFIER:
				return createPayerIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PAYROLL_CLASS:
				return createPayrollClassFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PAY_TO_QUALIFIER:
				return createPayToQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PAY_TO_STATE_PROVINCE_ADDRESS:
				return createPayToStateProvinceAddressFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PERCENTAGE_SALES_TAX_BASIS_PAID:
				return createPercentageSalesTaxBasisPaidFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PERCENTAGE_SALES_TAX_BASIS_SUBMITTED:
				return createPercentageSalesTaxBasisSubmittedFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PERFORMANCE_QUALIFIER:
				return createPerformanceQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PHARMACY_CLASS_CODE_QUALIFIER:
				return createPharmacyClassCodeQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PHARMACY_DISPENSER_TYPE_QUALIFIER:
				return createPharmacyDispenserTypeQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PHARMACY_ID_QUALIFIER:
				return createPharmacyIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PHARMACY_LOCATION_STATE:
				return createPharmacyLocationStateFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PHARMACY_SERVICE_TYPE:
				return createPharmacyServiceTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PHARMACY_TYPE:
				return createPharmacyTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PLACEOF_SERVICE:
				return createPlaceofServiceFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PLAN_AFFILIATION_PARENT_PLAN_ID_QUALIFIER:
				return createPlanAffiliationParentPlanIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PLAN_CUTBACK_REASON_CODE:
				return createPlanCutbackReasonCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PLAN_DEGREE_MANAGED:
				return createPlanDegreeManagedFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PLAN_ID_QUALIFIER:
				return createPlanIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PLAN_TYPE:
				return createPlanTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.POTENCY_UNIT_CODE:
				return createPotencyUnitCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PREFERENCE_LEVEL:
				return createPreferenceLevelFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PREFERRED_PRODUCT_ID_QUALIFIER:
				return createPreferredProductIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PREGNANCY_INDICATOR:
				return createPregnancyIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIBER_ALTERNATE_ID_ASSOCIATED_STATE_PROVINCE_ADDRESS:
				return createPrescriberAlternateIDAssociatedStateProvinceAddressFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIBER_ALTERNATE_ID_QUALIFIER:
				return createPrescriberAlternateIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIBER_CERTIFICATION_STATUS:
				return createPrescriberCertificationStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIBER_ID_ASSOCIATED_STATE_PROVINCE_ADDRESS:
				return createPrescriberIDAssociatedStateProvinceAddressFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIBER_ID_QUALIFIER:
				return createPrescriberIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIBER_OVERRIDE_TYPE:
				return createPrescriberOverrideTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIBER_SPECIALTY:
				return createPrescriberSpecialtyFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIBER_STATE_PROVINCE_ADDRESS:
				return createPrescriberStateProvinceAddressFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIBER_TAXONOMY_CODE:
				return createPrescriberTaxonomyCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER:
				return createPrescriptionServiceReferenceNumberQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIPTION_DELIVERY_METHOD:
				return createPrescriptionDeliveryMethodFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIPTION_ORIGIN_CODE:
				return createPrescriptionOriginCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIPTION_OVER_THE_COUNTER_INDICATOR:
				return createPrescriptionOverTheCounterIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRESCRIPTION_TYPE:
				return createPrescriptionTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRIMARY_CARE_PROVIDER_ID_QUALIFIER:
				return createPrimaryCareProviderIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_APPLICABILITY:
				return createPriorAuthorizationApplicabilityFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_COMPARISON_TYPE:
				return createPriorAuthorizationComparisonTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER:
				return createPriorAuthorizationQuestionCodeQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_REASON_CODE:
				return createPriorAuthorizationReasonCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_REQUIRED_QUESTION:
				return createPriorAuthorizationRequiredQuestionFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_RESPONSE_TYPE:
				return createPriorAuthorizationResponseTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_STATUS:
				return createPriorAuthorizationStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_TYPE_CODE:
				return createPriorAuthorizationTypeCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PROCESSOR_DEFINED_PRIOR_AUTHORIZATION_REASON_CODE:
				return createProcessorDefinedPriorAuthorizationReasonCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PROCESSOR_LOCATION_STATE:
				return createProcessorLocationStateFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PROCESSOR_PAYMENT_CLARIFICATION_CODE:
				return createProcessorPaymentClarificationCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRODUCT_SERVICE_ID_QUALIFIER:
				return createProductServiceIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRODUCT_SERVICE_ID_QUALIFIER_ALTERNATIVE:
				return createProductServiceIDQualifierAlternativeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRODUCT_SERVICE_ID_QUALIFIER_SOURCE:
				return createProductServiceIDQualifierSourceFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRODUCT_SERVICE_ID_QUALIFIER_STEP_DRUG:
				return createProductServiceIDQualifierStepDrugFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRODUCT_CODE_QUALIFIER:
				return createProductCodeQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRODUCT_FORMULARY_STATUS_CODE:
				return createProductFormularyStatusCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PRODUCT_TYPE:
				return createProductTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PROFESSIONAL_SERVICE_CODE:
				return createProfessionalServiceCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR:
				return createProviderAcceptAssignmentIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PROVIDER_ID_QUALIFIER:
				return createProviderIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PROVIDER_SPECIALTYCODEREPLACING4707_PROVIDER_SPECIALTYCODED_X12DE1222:
				return createProviderSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222FromString(eDataType, initialValue);
			case ExternalCodeListPackage.PURCHASER_ADDRESS_STATE_PROVINCE_CODE:
				return createPurchaserAddressStateProvinceCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PURCHASER_COUNTRY_CODE:
				return createPurchaserCountryCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PURCHASER_GENDER_CODE:
				return createPurchaserGenderCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PURCHASER_ID_ASSOCIATED_STATE_PROVINCE_CODE:
				return createPurchaserIDAssociatedStateProvinceCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PURCHASER_ID_QUALIFIER:
				return createPurchaserIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.PURCHASER_RELATIONSHIP_CODE:
				return createPurchaserRelationshipCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.RATE_UNITOF_MEASURE_CODE_QUALIFIER_SIG_SEGMENT:
				return createRateUnitofMeasureCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.REASON_CODE_REQ_SEGMENT:
				return createReasonCodeREQSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.REASONFOR_SERVICE_CODE:
				return createReasonforServiceCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.REBATE_TYPE:
				return createRebateTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.REBATE_TYPE_DESCRIPTION:
				return createRebateTypeDescriptionFromString(eDataType, initialValue);
			case ExternalCodeListPackage.REBATE_VERSION_RELEASE_NUMBER:
				return createRebateVersionReleaseNumberFromString(eDataType, initialValue);
			case ExternalCodeListPackage.RECONCILIATION_REASON_CODE:
				return createReconciliationReasonCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.RECONCILIATION_STATUS_CODE:
				return createReconciliationStatusCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.RECORD_INDICATOR:
				return createRecordIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.RECORD_PURPOSE_INDICATOR:
				return createRecordPurposeIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.RECORD_STATUS_CODE:
				return createRecordStatusCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.RECORD_TYPE:
				return createRecordTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.REFERENCE_QUALIFIER_GENERIC_DATABASE_PRIOR_AUTHORIZATION_DRU_SEGMENT:
				return createReferenceQualifierGenericDatabasePriorAuthorizationDRUSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.REIMBURSEMENT_QUALIFIER:
				return createReimbursementQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.REJECT_CODE:
				return createRejectCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.REJECT_OVERRIDE_CODE:
				return createRejectOverrideCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.REQUEST_STATUS:
				return createRequestStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.REQUEST_TYPE:
				return createRequestTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.RESOURCE_LINK_TYPE:
				return createResourceLinkTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.RESULTOF_SERVICE_CODE:
				return createResultofServiceCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ROUTE_OF_ADMINISTRATION:
				return createRouteOfAdministrationFromString(eDataType, initialValue);
			case ExternalCodeListPackage.ROUTEOF_ADMINISTRATION_CODE_QUALIFIER:
				return createRouteofAdministrationCodeQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SEGMENT_IDENTIFICATION:
				return createSegmentIdentificationFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SEGMENT_IDENTIFIER:
				return createSegmentIdentifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER1:
				return createSegmentQualifier1FromString(eDataType, initialValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER2:
				return createSegmentQualifier2FromString(eDataType, initialValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER3:
				return createSegmentQualifier3FromString(eDataType, initialValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER4:
				return createSegmentQualifier4FromString(eDataType, initialValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER5:
				return createSegmentQualifier5FromString(eDataType, initialValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER6:
				return createSegmentQualifier6FromString(eDataType, initialValue);
			case ExternalCodeListPackage.SELLER_ID_QUALIFIER:
				return createSellerIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SERVICE_PROVIDER_ID_QUALIFIER:
				return createServiceProviderIDQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SERVICE_PROVIDER_OVERRIDE_TYPE:
				return createServiceProviderOverrideTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SERVICE_PROVIDER_STATE_PROVINCE_CODE_ADDRESS:
				return createServiceProviderStateProvinceCodeAddressFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT:
				return createSigFreeTextStringIndicatorSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SITEOF_ADMINISTRATION_CODE_QUALIFIER_SIG_SEGMENT:
				return createSiteofAdministrationCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SMOKER_NON_SMOKER_CODE:
				return createSmokerNonSmokerCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SOURCE_CODE_LIST:
				return createSourceCodeListFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SOURCEOF_INFORMATION:
				return createSourceofInformationFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SPECIAL_PACKAGING_INDICATOR:
				return createSpecialPackagingIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.STATE:
				return createStateFromString(eDataType, initialValue);
			case ExternalCodeListPackage.STATUS_TYPECODED:
				return createStatusTypecodedFromString(eDataType, initialValue);
			case ExternalCodeListPackage.STEP_ORDER:
				return createStepOrderFromString(eDataType, initialValue);
			case ExternalCodeListPackage.STOP_INDICATOR_SIG_SEGMENT:
				return createStopIndicatorSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SUBMISSION_CLARIFICATION_CODE:
				return createSubmissionClarificationCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SUBMISSION_NUMBER:
				return createSubmissionNumberFromString(eDataType, initialValue);
			case ExternalCodeListPackage.SUBMIT_CODE:
				return createSubmitCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.TAX_EXEMPT_INDICATOR:
				return createTaxExemptIndicatorFromString(eDataType, initialValue);
			case ExternalCodeListPackage.TELEPHONE_NUMBER:
				return createTelephoneNumberFromString(eDataType, initialValue);
			case ExternalCodeListPackage.THERAPEUTIC_CLASS_CODE_QUALIFIER:
				return createTherapeuticClassCodeQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.TIME_PERIOD_BASIS_CODE_QUALIFIER_SIG_SEGMENT:
				return createTimePeriodBasisCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.TRANSACTION_CODE:
				return createTransactionCodeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.TRANSACTION_COUNT:
				return createTransactionCountFromString(eDataType, initialValue);
			case ExternalCodeListPackage.TRANSACTION_RESPONSE_STATUS:
				return createTransactionResponseStatusFromString(eDataType, initialValue);
			case ExternalCodeListPackage.TRANSFER_FLAG:
				return createTransferFlagFromString(eDataType, initialValue);
			case ExternalCodeListPackage.TRANSFER_TYPE:
				return createTransferTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.TRANSMISSION_ACTION:
				return createTransmissionActionFromString(eDataType, initialValue);
			case ExternalCodeListPackage.TRANSMISSION_FILE_TYPE:
				return createTransmissionFileTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.TRANSMISSION_TYPE:
				return createTransmissionTypeFromString(eDataType, initialValue);
			case ExternalCodeListPackage.UNIQUE_RECORD_IDENTIFIER_QUALIFIER:
				return createUniqueRecordIdentifierQualifierFromString(eDataType, initialValue);
			case ExternalCodeListPackage.UNITOF_MEASURE:
				return createUnitofMeasureFromString(eDataType, initialValue);
			case ExternalCodeListPackage.VARIABLE_FREQUENCY_MODIFIER_SIG_SEGMENT:
				return createVariableFrequencyModifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.VARIABLE_INTERVAL_MODIFIER_SIG_SEGMENT:
				return createVariableIntervalModifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.VEHICLE_NAME_CODE_QUALIFIER_SIG_SEGMENT:
				return createVehicleNameCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.VEHICLE_UNITOF_MEASURE_CODE_QUALIFIER_SIG_SEGMENT:
				return createVehicleUnitofMeasureCodeQualifierSIGSegmentFromString(eDataType, initialValue);
			case ExternalCodeListPackage.VERSION_RELEASE_NUMBER:
				return createVersionReleaseNumberFromString(eDataType, initialValue);
			case ExternalCodeListPackage.WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR:
				return createWorkersCompensationPropertyAndCasualtyIndicatorFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case ExternalCodeListPackage.ACCUMULATOR_MONTH:
				return convertAccumulatorMonthToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ADDITIONAL_DOCUMENTATION_TYPE_ID:
				return convertAdditionalDocumentationTypeIDToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY:
				return convertAdditionalMessageInformationContinuityToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ADDITIONAL_MESSAGE_INFORMATION_QUALIFIER:
				return convertAdditionalMessageInformationQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ADDRESS_QUALIFIER:
				return convertAddressQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ADJUDICATOR_ID_QUALIFIER:
				return convertAdjudicatorIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ADJUSTMENT_TYPE:
				return convertAdjustmentTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ADMINISTRATION_TIMING_CODE_QUALIFIER_SIG_SEGMENT:
				return convertAdministrationTimingCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ADMINISTRATIVE_FEE_EFFECT_INDICATOR:
				return convertAdministrativeFeeEffectIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTION_QUALIFIER:
				return convertAmountAttributedToProductSelectionQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.APPROVED_MESSAGE_CODE:
				return convertApprovedMessageCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ASSOCIATED_PRESCRIPTION_SERVICE_PROVIDER_ID_QUALIFIER:
				return convertAssociatedPrescriptionServiceProviderIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ASSOCIATED_PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER:
				return convertAssociatedPrescriptionServiceReferenceNumberQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.AUTHORIZED_REPRESENTATIVE_STATE_PROVINCE_ADDRESS:
				return convertAuthorizedRepresentativeStateProvinceAddressToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BASELINE_QUALIFIER:
				return convertBaselineQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BASE_PRICE_TYPE:
				return convertBasePriceTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BASIS_OF_CALCULATION_COINSURANCE:
				return convertBasisOfCalculationCoinsuranceToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BASIS_OF_CALCULATION_COPAY:
				return convertBasisOfCalculationCopayToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BASIS_OF_CALCULATION_DISPENSING_FEE:
				return convertBasisOfCalculationDispensingFeeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BASIS_OF_CALCULATION_FLAT_SALES_TAX:
				return convertBasisOfCalculationFlatSalesTaxToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BASIS_OF_CALCULATION_PERCENTAGE_SALES_TAX:
				return convertBasisOfCalculationPercentageSalesTaxToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BASIS_OF_COST_DETERMINATION:
				return convertBasisOfCostDeterminationToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BASIS_OF_REIMBURSEMENT_DETERMINATION:
				return convertBasisOfReimbursementDeterminationToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BASIS_OF_REQUEST:
				return convertBasisOfRequestToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BENEFIT_AMOUNT_TIME_PERIOD:
				return convertBenefitAmountTimePeriodToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BENEFIT_AMOUNT_TYPE:
				return convertBenefitAmountTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BENEFIT_STAGE_QUALIFIER:
				return convertBenefitStageQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BENEFIT_TYPE:
				return convertBenefitTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BILLING_ENTITY_TYPE_INDICATOR:
				return convertBillingEntityTypeIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BODY_METRIC_QUALIFIER_SIG_SEGMENT:
				return convertBodyMetricQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BRAND_GENERIC_INDICATOR:
				return convertBrandGenericIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.BRANDED_GENERIC_COPAY_CONFIDENTIAL:
				return convertBrandedGenericCopayConfidentialToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CALCULATED_DOSE_UNITOF_MEASURE_CODE_QUALIFIER_SIG_SEGMENT:
				return convertCalculatedDoseUnitofMeasureCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CARRIER_LOCATION_STATE:
				return convertCarrierLocationStateToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CHANGE_IDENTIFIER:
				return convertChangeIdentifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CHANGEOF_PRESCRIPTION_STATUS_FLAG:
				return convertChangeofPrescriptionStatusFlagToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CLAIM_MEDIA_TYPE:
				return convertClaimMediaTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CLAIM_ORIGINATION:
				return convertClaimOriginationToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CLIENT_FORMULARY_FLAG:
				return convertClientFormularyFlagToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CLIENT_PRICING_BASIS_OF_COST:
				return convertClientPricingBasisOfCostToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CLINICAL_INFORMATION_QUALIFIER:
				return convertClinicalInformationQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CLINICAL_SIGNIFICANCE_CODE:
				return convertClinicalSignificanceCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CMS_PART_DDEFINED_QUALIFIED_FACILITY:
				return convertCMSPartDDefinedQualifiedFacilityToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COB_PRIMARY_CLAIM_TYPE:
				return convertCOBPrimaryClaimTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CODE_LIST_QUALIFIER_DIAGNOSIS_CODE_QUALIFIER_PRIMARY_DRU_SEGMENT:
				return convertCodeListQualifierDiagnosisCodeQualifierPrimaryDRUSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CODE_LIST_QUALIFIER_REJECT_CODE_STS_SEGMENT:
				return convertCodeListQualifierRejectCodeSTSSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CODE_LIST_QUALIFIER_RESPONSE_CODE_RES_SEGMENT:
				return convertCodeListQualifierResponseCodeRESSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COMMUNICATION_TYPE_INDICATOR:
				return convertCommunicationTypeIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COMPOUND_CODE:
				return convertCompoundCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COMPOUND_DISPENSING_UNIT_FORM_INDICATOR:
				return convertCompoundDispensingUnitFormIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COMPOUND_DOSAGE_FORM_DESCRIPTION_CODE:
				return convertCompoundDosageFormDescriptionCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COMPOUND_INDICATOR:
				return convertCompoundIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COMPOUND_INGREDIENT_BASISOF_COST_DETERMINATION:
				return convertCompoundIngredientBasisofCostDeterminationToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COMPOUND_PRODUCT_ID_QUALIFIER:
				return convertCompoundProductIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COMPOUND_ROUTEOF_ADMINISTRATION:
				return convertCompoundRouteofAdministrationToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COMPOUND_TYPE:
				return convertCompoundTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CONDITION_RESPONSECODED_PATIENT_CONSENT_INDICATOR:
				return convertConditionResponsecodedPatientConsentIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.CONTRACTING_ORGANIZATION_PMOID_QUALIFIER:
				return convertContractingOrganizationPMOIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COPAY_COINSURANCE_OVERRIDE_TYPE:
				return convertCopayCoinsuranceOverrideTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COPAY_LIST_TYPE:
				return convertCopayListTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COUNTRY_SUBENTITY_IDENTIFICATION:
				return convertCountrySubentityIdentificationToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COUPON_TYPE:
				return convertCouponTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.COVERAGE_LIST_TYPE:
				return convertCoverageListTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DATABASE_INDICATOR:
				return convertDatabaseIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DATA_LEVEL:
				return convertDataLevelToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DATA_PROVIDER_ID_QUALIFIER:
				return convertDataProviderIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DEA_SCHEDULE:
				return convertDEAScheduleToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DELAY_REASON_CODE:
				return convertDelayReasonCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DIAGNOSIS_CODE_QUALIFIER:
				return convertDiagnosisCodeQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DISCONTINUE_DATE_QUALIFIER:
				return convertDiscontinueDateQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DISPENSE_AS_WRITTEN_DAW_PRODUCT_SELECTION_CODE:
				return convertDispenseAsWrittenDAWProductSelectionCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DISPENSE_AS_WRITTEN_DAW_DIFFERENCE:
				return convertDispenseAsWrittenDAWDifferenceToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DISPENSING_STATUS:
				return convertDispensingStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DO_NOT_FILL_PROFILE_FLAG:
				return convertDoNotFillProfileFlagToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DOSAGE_FORM_ID_CODE:
				return convertDosageFormIDCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DOSE_BASIS_RANGE_MODIFIER_SIG_SEGMENT:
				return convertDoseBasisRangeModifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DOSE_COMPOSITE_INDICATOR_SIG_SEGMENT:
				return convertDoseCompositeIndicatorSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DOSE_DELIVERY_METHOD_CODE_QUALIFIER_SIG_SEGMENT:
				return convertDoseDeliveryMethodCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DOSE_DELIVERY_METHOD_MODIFIER_CODE_QUALIFIER_SIG_SEGMENT:
				return convertDoseDeliveryMethodModifierCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DOSE_FORM_CODE_QUALIFIER_SIG_SEGMENT:
				return convertDoseFormCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DOSE_RANGE_MODIFIER_SIG_SEGMENT:
				return convertDoseRangeModifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DOSING_BASIS_UNITOF_MEASURE_CODE_QUALIFIER_SIG_SEGMENT:
				return convertDosingBasisUnitofMeasureCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DRUG_COVERAGE_STATUS_CODE:
				return convertDrugCoverageStatusCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DRUG_QUALIFIER_STEP_DRUG:
				return convertDrugQualifierStepDrugToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DRUG_REFERENCE_QUALIFIER:
				return convertDrugReferenceQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DRUG_REFERENCE_QUALIFIER_ALTERNATIVE:
				return convertDrugReferenceQualifierAlternativeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DRUG_REFERENCE_QUALIFIER_SOURCE:
				return convertDrugReferenceQualifierSourceToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DRUG_REFERENCE_QUALIFIER_STEP_DRUG:
				return convertDrugReferenceQualifierStepDrugToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DRUG_TYPE:
				return convertDrugTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DUE_CLINICAL_SIGNIFICANCE_CODE:
				return convertDUEClinicalSignificanceCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DUE_CO_AGENT_ID_QUALIFIER:
				return convertDUECoAgentIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DUE_PROFESSIONAL_SERVICE_CODE:
				return convertDUEProfessionalServiceCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DUE_REASON_FOR_SERVICE_CODE:
				return convertDUEReasonForServiceCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DUE_RESULT_OF_SERVICE_CODE:
				return convertDUEResultOfServiceCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DURPPS_LEVEL_OF_EFFORT:
				return convertDURPPSLevelOfEffortToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DURATION_TEXT_CODE_QUALIFIER_SIG_SEGMENT:
				return convertDurationTextCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.DUR_CO_AGENT_ID_QUALIFIER:
				return convertDURCoAgentIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.EASY_OPEN_CAP_INDICATOR:
				return convertEasyOpenCapIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ELIGIBILITY_PATIENT_RELATIONSHIP_CODE:
				return convertEligibilityPatientRelationshipCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ELIGIBILITY_CLARIFICATION_CODE:
				return convertEligibilityClarificationCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ELIGIBILITY_COB_INDICATOR:
				return convertEligibilityCOBIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ELIGIBLE_COVERAGE_CODE:
				return convertEligibleCoverageCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ELIGIBLE_PLAN:
				return convertEligiblePlanToString(eDataType, instanceValue);
			case ExternalCodeListPackage.EMPLOYER_STATE_PROVINCE_ADDRESS:
				return convertEmployerStateProvinceAddressToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ENTITY_STATE:
				return convertEntityStateToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FACILITY_STATE_PROVINCE_ADDRESS:
				return convertFacilityStateProvinceAddressToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FDA_DRUG_EFFICACY_CODE:
				return convertFDADrugEfficacyCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FEDERAL_DEA_SCHEDULE:
				return convertFederalDEAScheduleToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FEDERAL_UPPER_LIMIT_INDICATOR:
				return convertFederalUpperLimitIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FF_PRESCRIBER_ID_QUALIFIER:
				return convertFFPrescriberIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FILE_STRUCTURE_TYPE:
				return convertFileStructureTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FILE_TYPE:
				return convertFileTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FILL_NUMBER:
				return convertFillNumberToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FILL_NUMBER_CALCULATED:
				return convertFillNumberCalculatedToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FINAL_COMPOUND_PHARMACEUTICAL_DOSAGE_FORM:
				return convertFinalCompoundPharmaceuticalDosageFormToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FIRST_COPAY_TERM:
				return convertFirstCopayTermToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FORMULARY_BENEFIT_DESIGN_TYPE:
				return convertFormularyBenefitDesignTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FORMULARY_NON_FORMULARY_CO_PAY_CONFIDENTIAL:
				return convertFormularyNonFormularyCoPayConfidentialToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FORMULARY_PRODUCT_CO_PAY_CONFIDENTIAL:
				return convertFormularyProductCoPayConfidentialToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FORMULARY_STATUS:
				return convertFormularyStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.FREQUENCY_UNITS_CODE_QUALIFIER_SIG_SEGMENT:
				return convertFrequencyUnitsCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.GENDER_CODE:
				return convertGenderCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.GENERIC_AVAILABLE:
				return convertGenericAvailableToString(eDataType, instanceValue);
			case ExternalCodeListPackage.GENERIC_EQUIVALENT_PRODUCT_ID_QUALIFIER:
				return convertGenericEquivalentProductIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.HEADER_RESPONSE_STATUS:
				return convertHeaderResponseStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.HELP_DESK_PHONE_NUMBER_QUALIFIER:
				return convertHelpDeskPhoneNumberQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INACTIVE_PRESCRIPTION_INDICATOR:
				return convertInactivePrescriptionIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INDICATION_PRECURSOR_CODE_QUALIFIER_SIG_SEGMENT:
				return convertIndicationPrecursorCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INDICATION_TEXT_CODE_QUALIFIER_SIG_SEGMENT:
				return convertIndicationTextCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INDICATION_VALUE_UNITOF_MEASURE_CODE_QUALIFIER_SIG_SEGMENT:
				return convertIndicationValueUnitofMeasureCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INDICATION_VARIABLE_MODIFIER_SIG_SEGMENT:
				return convertIndicationVariableModifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INDIVIDUAL_RELATIONSHIPCODED:
				return convertIndividualRelationshipcodedToString(eDataType, instanceValue);
			case ExternalCodeListPackage.IN_NETWORK_INDICATOR:
				return convertInNetworkIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INTERMEDIARY_AUTHORIZATION_TYPE_ID:
				return convertIntermediaryAuthorizationTypeIDToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INTERVAL_UNITS_CODE_QUALIFIER_SIG_SEGMENT:
				return convertIntervalUnitsCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INVOICE_TYPE1:
				return convertInvoiceType1ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INVOICE_TYPE2:
				return convertInvoiceType2ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INVOICE_TYPE3:
				return convertInvoiceType3ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INVOICE_TYPE4:
				return convertInvoiceType4ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.INVOICE_TYPE5:
				return convertInvoiceType5ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ITEM_FORM_CODE:
				return convertItemFormCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ITEM_STRENGTH_CODE:
				return convertItemStrengthCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.JURISDICTIONAL_STATE:
				return convertJurisdictionalStateToString(eDataType, instanceValue);
			case ExternalCodeListPackage.LENGTHOF_NEED_QUALIFIER:
				return convertLengthofNeedQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.LEVELOF_SERVICE:
				return convertLevelofServiceToString(eDataType, instanceValue);
			case ExternalCodeListPackage.LIST_ACTION:
				return convertListActionToString(eDataType, instanceValue);
			case ExternalCodeListPackage.LOAD_STATUS:
				return convertLoadStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MAC_REDUCED_INDICATOR:
				return convertMACReducedIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MAIL_ORDER_ID_QUALIFIER:
				return convertMailOrderIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MAINTENANCE_DRUG_INDICATOR:
				return convertMaintenanceDrugIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MANUFACTURER_PICOID_QUALIFIER:
				return convertManufacturerPICOIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MAXIMUM_AGE_QUALIFIER:
				return convertMaximumAgeQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MAXIMUM_AMOUNT_QUALIFIER:
				return convertMaximumAmountQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MAXIMUM_AMOUNT_TIME_PERIOD:
				return convertMaximumAmountTimePeriodToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MAXIMUM_DOSE_RESTRICTION_CODE_QUALIFIER_SIG_SEGMENT:
				return convertMaximumDoseRestrictionCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MAXIMUM_DOSE_RESTRICTION_VARIABLE_DURATION_MODIFIER_SIG_SEGMENT:
				return convertMaximumDoseRestrictionVariableDurationModifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MAXIMUM_DOSE_RESTRICTION_VARIABLE_UNITS_CODE_QUALIFIER_SIG_SEGMENT:
				return convertMaximumDoseRestrictionVariableUnitsCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEASUREMENT_DATA_QUALIFIER:
				return convertMeasurementDataQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEASUREMENT_DIMENSION:
				return convertMeasurementDimensionToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEASUREMENT_UNIT:
				return convertMeasurementUnitToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEASUREMENT_UNIT_CODE:
				return convertMeasurementUnitCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEDICAID_INDICATOR:
				return convertMedicaidIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEDICARE_PART_DCOVERAGE_CODE:
				return convertMedicarePartDCoverageCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEDICARE_PLAN_CODE:
				return convertMedicarePlanCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEDICARE_RECOVERY_DISPENSING_INDICATOR:
				return convertMedicareRecoveryDispensingIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEDICARE_RECOVERY_INDICATOR:
				return convertMedicareRecoveryIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEMBERSHIP_COUNT_QUALIFIER:
				return convertMembershipCountQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEMBERSHIP_PERIOD_QUALIFIER:
				return convertMembershipPeriodQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEMBERSHIP_TYPE_QUALIFIER:
				return convertMembershipTypeQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MEMBER_SUBMITTED_CLAIM_PROGRAM_CODE:
				return convertMemberSubmittedClaimProgramCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MESSAGE_FUNCTIONCODED:
				return convertMessageFunctioncodedToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MINIMUM_AGE_QUALIFIER:
				return convertMinimumAgeQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MULTIPLE_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT:
				return convertMultipleAdministrationTimingModifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MULTIPLE_ROUTEOF_ADMINISTRATION_MODIFIER:
				return convertMultipleRouteofAdministrationModifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MULTIPLE_SIG_MODIFIER_SIG_SEGMENT:
				return convertMultipleSigModifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MULTIPLE_SITEOF_ADMINISTRATION_TIMING_MODIFIER_SIG_SEGMENT:
				return convertMultipleSiteofAdministrationTimingModifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.MULTIPLE_VEHICLE_MODIFIER_SIG_SEGMENT:
				return convertMultipleVehicleModifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.NO_KNOWN_ALLERGIES:
				return convertNoKnownAllergiesToString(eDataType, instanceValue);
			case ExternalCodeListPackage.NON_LISTED_BRAND_OVER_THE_COUNTER_FORMULARY_STATUS:
				return convertNonListedBrandOverTheCounterFormularyStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.NON_LISTED_GENERIC_OVER_THE_COUNTER_FORMULARY_STATUS:
				return convertNonListedGenericOverTheCounterFormularyStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.NON_LISTED_PRESCRIPTION_BRAND_FORMULARY_STATUS:
				return convertNonListedPrescriptionBrandFormularyStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.NON_LISTED_PRESCRIPTION_GENERIC_FORMULARY_STATUS:
				return convertNonListedPrescriptionGenericFormularyStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.NON_LISTED_SUPPLIES_FORMULARY_STATUS:
				return convertNonListedSuppliesFormularyStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.NON_POS_CLAIM_OVERRIDE_CODE:
				return convertNonPOSClaimOverrideCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.NUMBEROF_REFILLS_AUTHORIZED:
				return convertNumberofRefillsAuthorizedToString(eDataType, instanceValue);
			case ExternalCodeListPackage.NUMERATOR_INDICATOR:
				return convertNumeratorIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ORIGINALLY_PRESCRIBED_PRODUCT_SERVICE_ID_QUALIFIER:
				return convertOriginallyPrescribedProductServiceIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.OTHER_AMOUNT_CLAIMED_SUBMITTED_QUALIFIER:
				return convertOtherAmountClaimedSubmittedQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.OTHER_AMOUNT_PAID_QUALIFIER:
				return convertOtherAmountPaidQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.OTHER_COVERAGE_CODE:
				return convertOtherCoverageCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.OTHER_PAYER_AMOUNT_PAID_QUALIFIER:
				return convertOtherPayerAmountPaidQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.OTHER_PAYER_COVERAGE_TYPE:
				return convertOtherPayerCoverageTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.OTHER_PAYER_ID_QUALIFIER:
				return convertOtherPayerIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.OTHER_PAYER_PATIENT_RELATIONSHIP_CODE:
				return convertOtherPayerPatientRelationshipCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.OTHER_PAYER_PATIENT_RESPONSIBILITY_AMOUNT_QUALIFIER:
				return convertOtherPayerPatientResponsibilityAmountQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.OTHER_PHARMACY_INDICATOR:
				return convertOtherPharmacyIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.OTHER_PRESCRIBER_INDICATOR:
				return convertOtherPrescriberIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PATIENT_ASSIGNMENT_INDICATOR_DIRECT_MEMBER_REIMBURSEMENT_INDICATOR:
				return convertPatientAssignmentIndicatorDirectMemberReimbursementIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PATIENT_GENDER_CODE:
				return convertPatientGenderCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PATIENT_ID_ASSOCIATED_STATE_PROVINCE_ADDRESS:
				return convertPatientIDAssociatedStateProvinceAddressToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PATIENT_ID_QUALIFIER:
				return convertPatientIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PATIENT_LOCATION:
				return convertPatientLocationToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PATIENT_RELATIONSHIP_CODE:
				return convertPatientRelationshipCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PATIENT_RESIDENCE:
				return convertPatientResidenceToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PATIENT_STATE_PROVINCE_ADDRESS:
				return convertPatientStateProvinceAddressToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PAYER_ID_QUALIFIER:
				return convertPayerIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PAYROLL_CLASS:
				return convertPayrollClassToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PAY_TO_QUALIFIER:
				return convertPayToQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PAY_TO_STATE_PROVINCE_ADDRESS:
				return convertPayToStateProvinceAddressToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PERCENTAGE_SALES_TAX_BASIS_PAID:
				return convertPercentageSalesTaxBasisPaidToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PERCENTAGE_SALES_TAX_BASIS_SUBMITTED:
				return convertPercentageSalesTaxBasisSubmittedToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PERFORMANCE_QUALIFIER:
				return convertPerformanceQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PHARMACY_CLASS_CODE_QUALIFIER:
				return convertPharmacyClassCodeQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PHARMACY_DISPENSER_TYPE_QUALIFIER:
				return convertPharmacyDispenserTypeQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PHARMACY_ID_QUALIFIER:
				return convertPharmacyIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PHARMACY_LOCATION_STATE:
				return convertPharmacyLocationStateToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PHARMACY_SERVICE_TYPE:
				return convertPharmacyServiceTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PHARMACY_TYPE:
				return convertPharmacyTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PLACEOF_SERVICE:
				return convertPlaceofServiceToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PLAN_AFFILIATION_PARENT_PLAN_ID_QUALIFIER:
				return convertPlanAffiliationParentPlanIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PLAN_CUTBACK_REASON_CODE:
				return convertPlanCutbackReasonCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PLAN_DEGREE_MANAGED:
				return convertPlanDegreeManagedToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PLAN_ID_QUALIFIER:
				return convertPlanIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PLAN_TYPE:
				return convertPlanTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.POTENCY_UNIT_CODE:
				return convertPotencyUnitCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PREFERENCE_LEVEL:
				return convertPreferenceLevelToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PREFERRED_PRODUCT_ID_QUALIFIER:
				return convertPreferredProductIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PREGNANCY_INDICATOR:
				return convertPregnancyIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIBER_ALTERNATE_ID_ASSOCIATED_STATE_PROVINCE_ADDRESS:
				return convertPrescriberAlternateIDAssociatedStateProvinceAddressToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIBER_ALTERNATE_ID_QUALIFIER:
				return convertPrescriberAlternateIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIBER_CERTIFICATION_STATUS:
				return convertPrescriberCertificationStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIBER_ID_ASSOCIATED_STATE_PROVINCE_ADDRESS:
				return convertPrescriberIDAssociatedStateProvinceAddressToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIBER_ID_QUALIFIER:
				return convertPrescriberIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIBER_OVERRIDE_TYPE:
				return convertPrescriberOverrideTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIBER_SPECIALTY:
				return convertPrescriberSpecialtyToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIBER_STATE_PROVINCE_ADDRESS:
				return convertPrescriberStateProvinceAddressToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIBER_TAXONOMY_CODE:
				return convertPrescriberTaxonomyCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIPTION_SERVICE_REFERENCE_NUMBER_QUALIFIER:
				return convertPrescriptionServiceReferenceNumberQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIPTION_DELIVERY_METHOD:
				return convertPrescriptionDeliveryMethodToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIPTION_ORIGIN_CODE:
				return convertPrescriptionOriginCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIPTION_OVER_THE_COUNTER_INDICATOR:
				return convertPrescriptionOverTheCounterIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRESCRIPTION_TYPE:
				return convertPrescriptionTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRIMARY_CARE_PROVIDER_ID_QUALIFIER:
				return convertPrimaryCareProviderIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_APPLICABILITY:
				return convertPriorAuthorizationApplicabilityToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_COMPARISON_TYPE:
				return convertPriorAuthorizationComparisonTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_QUESTION_CODE_QUALIFIER:
				return convertPriorAuthorizationQuestionCodeQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_REASON_CODE:
				return convertPriorAuthorizationReasonCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_REQUIRED_QUESTION:
				return convertPriorAuthorizationRequiredQuestionToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_RESPONSE_TYPE:
				return convertPriorAuthorizationResponseTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_STATUS:
				return convertPriorAuthorizationStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRIOR_AUTHORIZATION_TYPE_CODE:
				return convertPriorAuthorizationTypeCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PROCESSOR_DEFINED_PRIOR_AUTHORIZATION_REASON_CODE:
				return convertProcessorDefinedPriorAuthorizationReasonCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PROCESSOR_LOCATION_STATE:
				return convertProcessorLocationStateToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PROCESSOR_PAYMENT_CLARIFICATION_CODE:
				return convertProcessorPaymentClarificationCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRODUCT_SERVICE_ID_QUALIFIER:
				return convertProductServiceIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRODUCT_SERVICE_ID_QUALIFIER_ALTERNATIVE:
				return convertProductServiceIDQualifierAlternativeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRODUCT_SERVICE_ID_QUALIFIER_SOURCE:
				return convertProductServiceIDQualifierSourceToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRODUCT_SERVICE_ID_QUALIFIER_STEP_DRUG:
				return convertProductServiceIDQualifierStepDrugToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRODUCT_CODE_QUALIFIER:
				return convertProductCodeQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRODUCT_FORMULARY_STATUS_CODE:
				return convertProductFormularyStatusCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PRODUCT_TYPE:
				return convertProductTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PROFESSIONAL_SERVICE_CODE:
				return convertProfessionalServiceCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR:
				return convertProviderAcceptAssignmentIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PROVIDER_ID_QUALIFIER:
				return convertProviderIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PROVIDER_SPECIALTYCODEREPLACING4707_PROVIDER_SPECIALTYCODED_X12DE1222:
				return convertProviderSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PURCHASER_ADDRESS_STATE_PROVINCE_CODE:
				return convertPurchaserAddressStateProvinceCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PURCHASER_COUNTRY_CODE:
				return convertPurchaserCountryCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PURCHASER_GENDER_CODE:
				return convertPurchaserGenderCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PURCHASER_ID_ASSOCIATED_STATE_PROVINCE_CODE:
				return convertPurchaserIDAssociatedStateProvinceCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PURCHASER_ID_QUALIFIER:
				return convertPurchaserIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.PURCHASER_RELATIONSHIP_CODE:
				return convertPurchaserRelationshipCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.RATE_UNITOF_MEASURE_CODE_QUALIFIER_SIG_SEGMENT:
				return convertRateUnitofMeasureCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.REASON_CODE_REQ_SEGMENT:
				return convertReasonCodeREQSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.REASONFOR_SERVICE_CODE:
				return convertReasonforServiceCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.REBATE_TYPE:
				return convertRebateTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.REBATE_TYPE_DESCRIPTION:
				return convertRebateTypeDescriptionToString(eDataType, instanceValue);
			case ExternalCodeListPackage.REBATE_VERSION_RELEASE_NUMBER:
				return convertRebateVersionReleaseNumberToString(eDataType, instanceValue);
			case ExternalCodeListPackage.RECONCILIATION_REASON_CODE:
				return convertReconciliationReasonCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.RECONCILIATION_STATUS_CODE:
				return convertReconciliationStatusCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.RECORD_INDICATOR:
				return convertRecordIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.RECORD_PURPOSE_INDICATOR:
				return convertRecordPurposeIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.RECORD_STATUS_CODE:
				return convertRecordStatusCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.RECORD_TYPE:
				return convertRecordTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.REFERENCE_QUALIFIER_GENERIC_DATABASE_PRIOR_AUTHORIZATION_DRU_SEGMENT:
				return convertReferenceQualifierGenericDatabasePriorAuthorizationDRUSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.REIMBURSEMENT_QUALIFIER:
				return convertReimbursementQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.REJECT_CODE:
				return convertRejectCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.REJECT_OVERRIDE_CODE:
				return convertRejectOverrideCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.REQUEST_STATUS:
				return convertRequestStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.REQUEST_TYPE:
				return convertRequestTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.RESOURCE_LINK_TYPE:
				return convertResourceLinkTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.RESULTOF_SERVICE_CODE:
				return convertResultofServiceCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ROUTE_OF_ADMINISTRATION:
				return convertRouteOfAdministrationToString(eDataType, instanceValue);
			case ExternalCodeListPackage.ROUTEOF_ADMINISTRATION_CODE_QUALIFIER:
				return convertRouteofAdministrationCodeQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SEGMENT_IDENTIFICATION:
				return convertSegmentIdentificationToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SEGMENT_IDENTIFIER:
				return convertSegmentIdentifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER1:
				return convertSegmentQualifier1ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER2:
				return convertSegmentQualifier2ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER3:
				return convertSegmentQualifier3ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER4:
				return convertSegmentQualifier4ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER5:
				return convertSegmentQualifier5ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SEGMENT_QUALIFIER6:
				return convertSegmentQualifier6ToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SELLER_ID_QUALIFIER:
				return convertSellerIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SERVICE_PROVIDER_ID_QUALIFIER:
				return convertServiceProviderIDQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SERVICE_PROVIDER_OVERRIDE_TYPE:
				return convertServiceProviderOverrideTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SERVICE_PROVIDER_STATE_PROVINCE_CODE_ADDRESS:
				return convertServiceProviderStateProvinceCodeAddressToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SIG_FREE_TEXT_STRING_INDICATOR_SIG_SEGMENT:
				return convertSigFreeTextStringIndicatorSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SITEOF_ADMINISTRATION_CODE_QUALIFIER_SIG_SEGMENT:
				return convertSiteofAdministrationCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SMOKER_NON_SMOKER_CODE:
				return convertSmokerNonSmokerCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SOURCE_CODE_LIST:
				return convertSourceCodeListToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SOURCEOF_INFORMATION:
				return convertSourceofInformationToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SPECIAL_PACKAGING_INDICATOR:
				return convertSpecialPackagingIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.STATE:
				return convertStateToString(eDataType, instanceValue);
			case ExternalCodeListPackage.STATUS_TYPECODED:
				return convertStatusTypecodedToString(eDataType, instanceValue);
			case ExternalCodeListPackage.STEP_ORDER:
				return convertStepOrderToString(eDataType, instanceValue);
			case ExternalCodeListPackage.STOP_INDICATOR_SIG_SEGMENT:
				return convertStopIndicatorSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SUBMISSION_CLARIFICATION_CODE:
				return convertSubmissionClarificationCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SUBMISSION_NUMBER:
				return convertSubmissionNumberToString(eDataType, instanceValue);
			case ExternalCodeListPackage.SUBMIT_CODE:
				return convertSubmitCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.TAX_EXEMPT_INDICATOR:
				return convertTaxExemptIndicatorToString(eDataType, instanceValue);
			case ExternalCodeListPackage.TELEPHONE_NUMBER:
				return convertTelephoneNumberToString(eDataType, instanceValue);
			case ExternalCodeListPackage.THERAPEUTIC_CLASS_CODE_QUALIFIER:
				return convertTherapeuticClassCodeQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.TIME_PERIOD_BASIS_CODE_QUALIFIER_SIG_SEGMENT:
				return convertTimePeriodBasisCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.TRANSACTION_CODE:
				return convertTransactionCodeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.TRANSACTION_COUNT:
				return convertTransactionCountToString(eDataType, instanceValue);
			case ExternalCodeListPackage.TRANSACTION_RESPONSE_STATUS:
				return convertTransactionResponseStatusToString(eDataType, instanceValue);
			case ExternalCodeListPackage.TRANSFER_FLAG:
				return convertTransferFlagToString(eDataType, instanceValue);
			case ExternalCodeListPackage.TRANSFER_TYPE:
				return convertTransferTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.TRANSMISSION_ACTION:
				return convertTransmissionActionToString(eDataType, instanceValue);
			case ExternalCodeListPackage.TRANSMISSION_FILE_TYPE:
				return convertTransmissionFileTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.TRANSMISSION_TYPE:
				return convertTransmissionTypeToString(eDataType, instanceValue);
			case ExternalCodeListPackage.UNIQUE_RECORD_IDENTIFIER_QUALIFIER:
				return convertUniqueRecordIdentifierQualifierToString(eDataType, instanceValue);
			case ExternalCodeListPackage.UNITOF_MEASURE:
				return convertUnitofMeasureToString(eDataType, instanceValue);
			case ExternalCodeListPackage.VARIABLE_FREQUENCY_MODIFIER_SIG_SEGMENT:
				return convertVariableFrequencyModifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.VARIABLE_INTERVAL_MODIFIER_SIG_SEGMENT:
				return convertVariableIntervalModifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.VEHICLE_NAME_CODE_QUALIFIER_SIG_SEGMENT:
				return convertVehicleNameCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.VEHICLE_UNITOF_MEASURE_CODE_QUALIFIER_SIG_SEGMENT:
				return convertVehicleUnitofMeasureCodeQualifierSIGSegmentToString(eDataType, instanceValue);
			case ExternalCodeListPackage.VERSION_RELEASE_NUMBER:
				return convertVersionReleaseNumberToString(eDataType, instanceValue);
			case ExternalCodeListPackage.WORKERS_COMPENSATION_PROPERTY_AND_CASUALTY_INDICATOR:
				return convertWorkersCompensationPropertyAndCasualtyIndicatorToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AccumulatorMonth createAccumulatorMonthFromString(EDataType eDataType, String initialValue) {
		AccumulatorMonth result = AccumulatorMonth.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAccumulatorMonthToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalDocumentationTypeID createAdditionalDocumentationTypeIDFromString(EDataType eDataType, String initialValue) {
		AdditionalDocumentationTypeID result = AdditionalDocumentationTypeID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditionalDocumentationTypeIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalMessageInformationContinuity createAdditionalMessageInformationContinuityFromString(EDataType eDataType, String initialValue) {
		AdditionalMessageInformationContinuity result = AdditionalMessageInformationContinuity.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditionalMessageInformationContinuityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalMessageInformationQualifier createAdditionalMessageInformationQualifierFromString(EDataType eDataType, String initialValue) {
		AdditionalMessageInformationQualifier result = AdditionalMessageInformationQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdditionalMessageInformationQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AddressQualifier createAddressQualifierFromString(EDataType eDataType, String initialValue) {
		AddressQualifier result = AddressQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAddressQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjudicatorIDQualifier createAdjudicatorIDQualifierFromString(EDataType eDataType, String initialValue) {
		AdjudicatorIDQualifier result = AdjudicatorIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjudicatorIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdjustmentType createAdjustmentTypeFromString(EDataType eDataType, String initialValue) {
		AdjustmentType result = AdjustmentType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdjustmentTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrationTimingCodeQualifierSIGSegment createAdministrationTimingCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		AdministrationTimingCodeQualifierSIGSegment result = AdministrationTimingCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrationTimingCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdministrativeFeeEffectIndicator createAdministrativeFeeEffectIndicatorFromString(EDataType eDataType, String initialValue) {
		AdministrativeFeeEffectIndicator result = AdministrativeFeeEffectIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAdministrativeFeeEffectIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AmountAttributedToProductSelectionQualifier createAmountAttributedToProductSelectionQualifierFromString(EDataType eDataType, String initialValue) {
		AmountAttributedToProductSelectionQualifier result = AmountAttributedToProductSelectionQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAmountAttributedToProductSelectionQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ApprovedMessageCode createApprovedMessageCodeFromString(EDataType eDataType, String initialValue) {
		ApprovedMessageCode result = ApprovedMessageCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertApprovedMessageCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociatedPrescriptionServiceProviderIDQualifier createAssociatedPrescriptionServiceProviderIDQualifierFromString(EDataType eDataType, String initialValue) {
		AssociatedPrescriptionServiceProviderIDQualifier result = AssociatedPrescriptionServiceProviderIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociatedPrescriptionServiceProviderIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AssociatedPrescriptionServiceReferenceNumberQualifier createAssociatedPrescriptionServiceReferenceNumberQualifierFromString(EDataType eDataType, String initialValue) {
		AssociatedPrescriptionServiceReferenceNumberQualifier result = AssociatedPrescriptionServiceReferenceNumberQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAssociatedPrescriptionServiceReferenceNumberQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AuthorizedRepresentativeStateProvinceAddress createAuthorizedRepresentativeStateProvinceAddressFromString(EDataType eDataType, String initialValue) {
		AuthorizedRepresentativeStateProvinceAddress result = AuthorizedRepresentativeStateProvinceAddress.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAuthorizedRepresentativeStateProvinceAddressToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaselineQualifier createBaselineQualifierFromString(EDataType eDataType, String initialValue) {
		BaselineQualifier result = BaselineQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBaselineQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasePriceType createBasePriceTypeFromString(EDataType eDataType, String initialValue) {
		BasePriceType result = BasePriceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasePriceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisOfCalculationCoinsurance createBasisOfCalculationCoinsuranceFromString(EDataType eDataType, String initialValue) {
		BasisOfCalculationCoinsurance result = BasisOfCalculationCoinsurance.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasisOfCalculationCoinsuranceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisOfCalculationCopay createBasisOfCalculationCopayFromString(EDataType eDataType, String initialValue) {
		BasisOfCalculationCopay result = BasisOfCalculationCopay.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasisOfCalculationCopayToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisOfCalculationDispensingFee createBasisOfCalculationDispensingFeeFromString(EDataType eDataType, String initialValue) {
		BasisOfCalculationDispensingFee result = BasisOfCalculationDispensingFee.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasisOfCalculationDispensingFeeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisOfCalculationFlatSalesTax createBasisOfCalculationFlatSalesTaxFromString(EDataType eDataType, String initialValue) {
		BasisOfCalculationFlatSalesTax result = BasisOfCalculationFlatSalesTax.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasisOfCalculationFlatSalesTaxToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisOfCalculationPercentageSalesTax createBasisOfCalculationPercentageSalesTaxFromString(EDataType eDataType, String initialValue) {
		BasisOfCalculationPercentageSalesTax result = BasisOfCalculationPercentageSalesTax.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasisOfCalculationPercentageSalesTaxToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisOfCostDetermination createBasisOfCostDeterminationFromString(EDataType eDataType, String initialValue) {
		BasisOfCostDetermination result = BasisOfCostDetermination.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasisOfCostDeterminationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisOfReimbursementDetermination createBasisOfReimbursementDeterminationFromString(EDataType eDataType, String initialValue) {
		BasisOfReimbursementDetermination result = BasisOfReimbursementDetermination.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasisOfReimbursementDeterminationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BasisOfRequest createBasisOfRequestFromString(EDataType eDataType, String initialValue) {
		BasisOfRequest result = BasisOfRequest.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBasisOfRequestToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitAmountTimePeriod createBenefitAmountTimePeriodFromString(EDataType eDataType, String initialValue) {
		BenefitAmountTimePeriod result = BenefitAmountTimePeriod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitAmountTimePeriodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitAmountType createBenefitAmountTypeFromString(EDataType eDataType, String initialValue) {
		BenefitAmountType result = BenefitAmountType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitAmountTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitStageQualifier createBenefitStageQualifierFromString(EDataType eDataType, String initialValue) {
		BenefitStageQualifier result = BenefitStageQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitStageQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BenefitType createBenefitTypeFromString(EDataType eDataType, String initialValue) {
		BenefitType result = BenefitType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBenefitTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BillingEntityTypeIndicator createBillingEntityTypeIndicatorFromString(EDataType eDataType, String initialValue) {
		BillingEntityTypeIndicator result = BillingEntityTypeIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBillingEntityTypeIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BodyMetricQualifierSIGSegment createBodyMetricQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		BodyMetricQualifierSIGSegment result = BodyMetricQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBodyMetricQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrandGenericIndicator createBrandGenericIndicatorFromString(EDataType eDataType, String initialValue) {
		BrandGenericIndicator result = BrandGenericIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBrandGenericIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BrandedGenericCopayConfidential createBrandedGenericCopayConfidentialFromString(EDataType eDataType, String initialValue) {
		BrandedGenericCopayConfidential result = BrandedGenericCopayConfidential.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBrandedGenericCopayConfidentialToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CalculatedDoseUnitofMeasureCodeQualifierSIGSegment createCalculatedDoseUnitofMeasureCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		CalculatedDoseUnitofMeasureCodeQualifierSIGSegment result = CalculatedDoseUnitofMeasureCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCalculatedDoseUnitofMeasureCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CarrierLocationState createCarrierLocationStateFromString(EDataType eDataType, String initialValue) {
		CarrierLocationState result = CarrierLocationState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCarrierLocationStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeIdentifier createChangeIdentifierFromString(EDataType eDataType, String initialValue) {
		ChangeIdentifier result = ChangeIdentifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeIdentifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ChangeofPrescriptionStatusFlag createChangeofPrescriptionStatusFlagFromString(EDataType eDataType, String initialValue) {
		ChangeofPrescriptionStatusFlag result = ChangeofPrescriptionStatusFlag.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertChangeofPrescriptionStatusFlagToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimMediaType createClaimMediaTypeFromString(EDataType eDataType, String initialValue) {
		ClaimMediaType result = ClaimMediaType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimMediaTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimOrigination createClaimOriginationFromString(EDataType eDataType, String initialValue) {
		ClaimOrigination result = ClaimOrigination.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClaimOriginationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientFormularyFlag createClientFormularyFlagFromString(EDataType eDataType, String initialValue) {
		ClientFormularyFlag result = ClientFormularyFlag.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClientFormularyFlagToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClientPricingBasisOfCost createClientPricingBasisOfCostFromString(EDataType eDataType, String initialValue) {
		ClientPricingBasisOfCost result = ClientPricingBasisOfCost.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClientPricingBasisOfCostToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalInformationQualifier createClinicalInformationQualifierFromString(EDataType eDataType, String initialValue) {
		ClinicalInformationQualifier result = ClinicalInformationQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalInformationQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalSignificanceCode createClinicalSignificanceCodeFromString(EDataType eDataType, String initialValue) {
		ClinicalSignificanceCode result = ClinicalSignificanceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertClinicalSignificanceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CMSPartDDefinedQualifiedFacility createCMSPartDDefinedQualifiedFacilityFromString(EDataType eDataType, String initialValue) {
		CMSPartDDefinedQualifiedFacility result = CMSPartDDefinedQualifiedFacility.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCMSPartDDefinedQualifiedFacilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public COBPrimaryClaimType createCOBPrimaryClaimTypeFromString(EDataType eDataType, String initialValue) {
		COBPrimaryClaimType result = COBPrimaryClaimType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCOBPrimaryClaimTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeListQualifierDiagnosisCodeQualifierPrimaryDRUSegment createCodeListQualifierDiagnosisCodeQualifierPrimaryDRUSegmentFromString(EDataType eDataType, String initialValue) {
		CodeListQualifierDiagnosisCodeQualifierPrimaryDRUSegment result = CodeListQualifierDiagnosisCodeQualifierPrimaryDRUSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeListQualifierDiagnosisCodeQualifierPrimaryDRUSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeListQualifierRejectCodeSTSSegment createCodeListQualifierRejectCodeSTSSegmentFromString(EDataType eDataType, String initialValue) {
		CodeListQualifierRejectCodeSTSSegment result = CodeListQualifierRejectCodeSTSSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeListQualifierRejectCodeSTSSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CodeListQualifierResponseCodeRESSegment createCodeListQualifierResponseCodeRESSegmentFromString(EDataType eDataType, String initialValue) {
		CodeListQualifierResponseCodeRESSegment result = CodeListQualifierResponseCodeRESSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCodeListQualifierResponseCodeRESSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CommunicationTypeIndicator createCommunicationTypeIndicatorFromString(EDataType eDataType, String initialValue) {
		CommunicationTypeIndicator result = CommunicationTypeIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCommunicationTypeIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundCode createCompoundCodeFromString(EDataType eDataType, String initialValue) {
		CompoundCode result = CompoundCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompoundCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundDispensingUnitFormIndicator createCompoundDispensingUnitFormIndicatorFromString(EDataType eDataType, String initialValue) {
		CompoundDispensingUnitFormIndicator result = CompoundDispensingUnitFormIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompoundDispensingUnitFormIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundDosageFormDescriptionCode createCompoundDosageFormDescriptionCodeFromString(EDataType eDataType, String initialValue) {
		CompoundDosageFormDescriptionCode result = CompoundDosageFormDescriptionCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompoundDosageFormDescriptionCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundIndicator createCompoundIndicatorFromString(EDataType eDataType, String initialValue) {
		CompoundIndicator result = CompoundIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompoundIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundIngredientBasisofCostDetermination createCompoundIngredientBasisofCostDeterminationFromString(EDataType eDataType, String initialValue) {
		CompoundIngredientBasisofCostDetermination result = CompoundIngredientBasisofCostDetermination.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompoundIngredientBasisofCostDeterminationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundProductIDQualifier createCompoundProductIDQualifierFromString(EDataType eDataType, String initialValue) {
		CompoundProductIDQualifier result = CompoundProductIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompoundProductIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundRouteofAdministration createCompoundRouteofAdministrationFromString(EDataType eDataType, String initialValue) {
		CompoundRouteofAdministration result = CompoundRouteofAdministration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompoundRouteofAdministrationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundType createCompoundTypeFromString(EDataType eDataType, String initialValue) {
		CompoundType result = CompoundType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCompoundTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionResponsecodedPatientConsentIndicator createConditionResponsecodedPatientConsentIndicatorFromString(EDataType eDataType, String initialValue) {
		ConditionResponsecodedPatientConsentIndicator result = ConditionResponsecodedPatientConsentIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConditionResponsecodedPatientConsentIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContractingOrganizationPMOIDQualifier createContractingOrganizationPMOIDQualifierFromString(EDataType eDataType, String initialValue) {
		ContractingOrganizationPMOIDQualifier result = ContractingOrganizationPMOIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertContractingOrganizationPMOIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopayCoinsuranceOverrideType createCopayCoinsuranceOverrideTypeFromString(EDataType eDataType, String initialValue) {
		CopayCoinsuranceOverrideType result = CopayCoinsuranceOverrideType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCopayCoinsuranceOverrideTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CopayListType createCopayListTypeFromString(EDataType eDataType, String initialValue) {
		CopayListType result = CopayListType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCopayListTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CountrySubentityIdentification createCountrySubentityIdentificationFromString(EDataType eDataType, String initialValue) {
		CountrySubentityIdentification result = CountrySubentityIdentification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCountrySubentityIdentificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CouponType createCouponTypeFromString(EDataType eDataType, String initialValue) {
		CouponType result = CouponType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCouponTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoverageListType createCoverageListTypeFromString(EDataType eDataType, String initialValue) {
		CoverageListType result = CoverageListType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertCoverageListTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DatabaseIndicator createDatabaseIndicatorFromString(EDataType eDataType, String initialValue) {
		DatabaseIndicator result = DatabaseIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDatabaseIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataLevel createDataLevelFromString(EDataType eDataType, String initialValue) {
		DataLevel result = DataLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DataProviderIDQualifier createDataProviderIDQualifierFromString(EDataType eDataType, String initialValue) {
		DataProviderIDQualifier result = DataProviderIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDataProviderIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DEASchedule createDEAScheduleFromString(EDataType eDataType, String initialValue) {
		DEASchedule result = DEASchedule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDEAScheduleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DelayReasonCode createDelayReasonCodeFromString(EDataType eDataType, String initialValue) {
		DelayReasonCode result = DelayReasonCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDelayReasonCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiagnosisCodeQualifier createDiagnosisCodeQualifierFromString(EDataType eDataType, String initialValue) {
		DiagnosisCodeQualifier result = DiagnosisCodeQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiagnosisCodeQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DiscontinueDateQualifier createDiscontinueDateQualifierFromString(EDataType eDataType, String initialValue) {
		DiscontinueDateQualifier result = DiscontinueDateQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDiscontinueDateQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispenseAsWrittenDAWProductSelectionCode createDispenseAsWrittenDAWProductSelectionCodeFromString(EDataType eDataType, String initialValue) {
		DispenseAsWrittenDAWProductSelectionCode result = DispenseAsWrittenDAWProductSelectionCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDispenseAsWrittenDAWProductSelectionCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispenseAsWrittenDAWDifference createDispenseAsWrittenDAWDifferenceFromString(EDataType eDataType, String initialValue) {
		DispenseAsWrittenDAWDifference result = DispenseAsWrittenDAWDifference.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDispenseAsWrittenDAWDifferenceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DispensingStatus createDispensingStatusFromString(EDataType eDataType, String initialValue) {
		DispensingStatus result = DispensingStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDispensingStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoNotFillProfileFlag createDoNotFillProfileFlagFromString(EDataType eDataType, String initialValue) {
		DoNotFillProfileFlag result = DoNotFillProfileFlag.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoNotFillProfileFlagToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DosageFormIDCode createDosageFormIDCodeFromString(EDataType eDataType, String initialValue) {
		DosageFormIDCode result = DosageFormIDCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDosageFormIDCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoseBasisRangeModifierSIGSegment createDoseBasisRangeModifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		DoseBasisRangeModifierSIGSegment result = DoseBasisRangeModifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoseBasisRangeModifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoseCompositeIndicatorSIGSegment createDoseCompositeIndicatorSIGSegmentFromString(EDataType eDataType, String initialValue) {
		DoseCompositeIndicatorSIGSegment result = DoseCompositeIndicatorSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoseCompositeIndicatorSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoseDeliveryMethodCodeQualifierSIGSegment createDoseDeliveryMethodCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		DoseDeliveryMethodCodeQualifierSIGSegment result = DoseDeliveryMethodCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoseDeliveryMethodCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoseDeliveryMethodModifierCodeQualifierSIGSegment createDoseDeliveryMethodModifierCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		DoseDeliveryMethodModifierCodeQualifierSIGSegment result = DoseDeliveryMethodModifierCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoseDeliveryMethodModifierCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoseFormCodeQualifierSIGSegment createDoseFormCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		DoseFormCodeQualifierSIGSegment result = DoseFormCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoseFormCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DoseRangeModifierSIGSegment createDoseRangeModifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		DoseRangeModifierSIGSegment result = DoseRangeModifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDoseRangeModifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DosingBasisUnitofMeasureCodeQualifierSIGSegment createDosingBasisUnitofMeasureCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		DosingBasisUnitofMeasureCodeQualifierSIGSegment result = DosingBasisUnitofMeasureCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDosingBasisUnitofMeasureCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugCoverageStatusCode createDrugCoverageStatusCodeFromString(EDataType eDataType, String initialValue) {
		DrugCoverageStatusCode result = DrugCoverageStatusCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrugCoverageStatusCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugQualifierStepDrug createDrugQualifierStepDrugFromString(EDataType eDataType, String initialValue) {
		DrugQualifierStepDrug result = DrugQualifierStepDrug.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrugQualifierStepDrugToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugReferenceQualifier createDrugReferenceQualifierFromString(EDataType eDataType, String initialValue) {
		DrugReferenceQualifier result = DrugReferenceQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrugReferenceQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugReferenceQualifierAlternative createDrugReferenceQualifierAlternativeFromString(EDataType eDataType, String initialValue) {
		DrugReferenceQualifierAlternative result = DrugReferenceQualifierAlternative.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrugReferenceQualifierAlternativeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugReferenceQualifierSource createDrugReferenceQualifierSourceFromString(EDataType eDataType, String initialValue) {
		DrugReferenceQualifierSource result = DrugReferenceQualifierSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrugReferenceQualifierSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugReferenceQualifierStepDrug createDrugReferenceQualifierStepDrugFromString(EDataType eDataType, String initialValue) {
		DrugReferenceQualifierStepDrug result = DrugReferenceQualifierStepDrug.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrugReferenceQualifierStepDrugToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DrugType createDrugTypeFromString(EDataType eDataType, String initialValue) {
		DrugType result = DrugType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDrugTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DUEClinicalSignificanceCode createDUEClinicalSignificanceCodeFromString(EDataType eDataType, String initialValue) {
		DUEClinicalSignificanceCode result = DUEClinicalSignificanceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDUEClinicalSignificanceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DUECoAgentIDQualifier createDUECoAgentIDQualifierFromString(EDataType eDataType, String initialValue) {
		DUECoAgentIDQualifier result = DUECoAgentIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDUECoAgentIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DUEProfessionalServiceCode createDUEProfessionalServiceCodeFromString(EDataType eDataType, String initialValue) {
		DUEProfessionalServiceCode result = DUEProfessionalServiceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDUEProfessionalServiceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DUEReasonForServiceCode createDUEReasonForServiceCodeFromString(EDataType eDataType, String initialValue) {
		DUEReasonForServiceCode result = DUEReasonForServiceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDUEReasonForServiceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DUEResultOfServiceCode createDUEResultOfServiceCodeFromString(EDataType eDataType, String initialValue) {
		DUEResultOfServiceCode result = DUEResultOfServiceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDUEResultOfServiceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DURPPSLevelOfEffort createDURPPSLevelOfEffortFromString(EDataType eDataType, String initialValue) {
		DURPPSLevelOfEffort result = DURPPSLevelOfEffort.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDURPPSLevelOfEffortToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DurationTextCodeQualifierSIGSegment createDurationTextCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		DurationTextCodeQualifierSIGSegment result = DurationTextCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDurationTextCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DURCoAgentIDQualifier createDURCoAgentIDQualifierFromString(EDataType eDataType, String initialValue) {
		DURCoAgentIDQualifier result = DURCoAgentIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDURCoAgentIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EasyOpenCapIndicator createEasyOpenCapIndicatorFromString(EDataType eDataType, String initialValue) {
		EasyOpenCapIndicator result = EasyOpenCapIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEasyOpenCapIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityPatientRelationshipCode createEligibilityPatientRelationshipCodeFromString(EDataType eDataType, String initialValue) {
		EligibilityPatientRelationshipCode result = EligibilityPatientRelationshipCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityPatientRelationshipCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityClarificationCode createEligibilityClarificationCodeFromString(EDataType eDataType, String initialValue) {
		EligibilityClarificationCode result = EligibilityClarificationCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityClarificationCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibilityCOBIndicator createEligibilityCOBIndicatorFromString(EDataType eDataType, String initialValue) {
		EligibilityCOBIndicator result = EligibilityCOBIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibilityCOBIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligibleCoverageCode createEligibleCoverageCodeFromString(EDataType eDataType, String initialValue) {
		EligibleCoverageCode result = EligibleCoverageCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligibleCoverageCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EligiblePlan createEligiblePlanFromString(EDataType eDataType, String initialValue) {
		EligiblePlan result = EligiblePlan.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEligiblePlanToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EmployerStateProvinceAddress createEmployerStateProvinceAddressFromString(EDataType eDataType, String initialValue) {
		EmployerStateProvinceAddress result = EmployerStateProvinceAddress.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEmployerStateProvinceAddressToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EntityState createEntityStateFromString(EDataType eDataType, String initialValue) {
		EntityState result = EntityState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertEntityStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilityStateProvinceAddress createFacilityStateProvinceAddressFromString(EDataType eDataType, String initialValue) {
		FacilityStateProvinceAddress result = FacilityStateProvinceAddress.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFacilityStateProvinceAddressToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FDADrugEfficacyCode createFDADrugEfficacyCodeFromString(EDataType eDataType, String initialValue) {
		FDADrugEfficacyCode result = FDADrugEfficacyCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFDADrugEfficacyCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederalDEASchedule createFederalDEAScheduleFromString(EDataType eDataType, String initialValue) {
		FederalDEASchedule result = FederalDEASchedule.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFederalDEAScheduleToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FederalUpperLimitIndicator createFederalUpperLimitIndicatorFromString(EDataType eDataType, String initialValue) {
		FederalUpperLimitIndicator result = FederalUpperLimitIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFederalUpperLimitIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FFPrescriberIDQualifier createFFPrescriberIDQualifierFromString(EDataType eDataType, String initialValue) {
		FFPrescriberIDQualifier result = FFPrescriberIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFFPrescriberIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileStructureType createFileStructureTypeFromString(EDataType eDataType, String initialValue) {
		FileStructureType result = FileStructureType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileStructureTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FileType createFileTypeFromString(EDataType eDataType, String initialValue) {
		FileType result = FileType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFileTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillNumber createFillNumberFromString(EDataType eDataType, String initialValue) {
		FillNumber result = FillNumber.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FillNumberCalculated createFillNumberCalculatedFromString(EDataType eDataType, String initialValue) {
		FillNumberCalculated result = FillNumberCalculated.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFillNumberCalculatedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FinalCompoundPharmaceuticalDosageForm createFinalCompoundPharmaceuticalDosageFormFromString(EDataType eDataType, String initialValue) {
		FinalCompoundPharmaceuticalDosageForm result = FinalCompoundPharmaceuticalDosageForm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFinalCompoundPharmaceuticalDosageFormToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FirstCopayTerm createFirstCopayTermFromString(EDataType eDataType, String initialValue) {
		FirstCopayTerm result = FirstCopayTerm.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFirstCopayTermToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormularyBenefitDesignType createFormularyBenefitDesignTypeFromString(EDataType eDataType, String initialValue) {
		FormularyBenefitDesignType result = FormularyBenefitDesignType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormularyBenefitDesignTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormularyNonFormularyCoPayConfidential createFormularyNonFormularyCoPayConfidentialFromString(EDataType eDataType, String initialValue) {
		FormularyNonFormularyCoPayConfidential result = FormularyNonFormularyCoPayConfidential.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormularyNonFormularyCoPayConfidentialToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormularyProductCoPayConfidential createFormularyProductCoPayConfidentialFromString(EDataType eDataType, String initialValue) {
		FormularyProductCoPayConfidential result = FormularyProductCoPayConfidential.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormularyProductCoPayConfidentialToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FormularyStatus createFormularyStatusFromString(EDataType eDataType, String initialValue) {
		FormularyStatus result = FormularyStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFormularyStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FrequencyUnitsCodeQualifierSIGSegment createFrequencyUnitsCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		FrequencyUnitsCodeQualifierSIGSegment result = FrequencyUnitsCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFrequencyUnitsCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenderCode createGenderCodeFromString(EDataType eDataType, String initialValue) {
		GenderCode result = GenderCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenderCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericAvailable createGenericAvailableFromString(EDataType eDataType, String initialValue) {
		GenericAvailable result = GenericAvailable.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericAvailableToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public GenericEquivalentProductIDQualifier createGenericEquivalentProductIDQualifierFromString(EDataType eDataType, String initialValue) {
		GenericEquivalentProductIDQualifier result = GenericEquivalentProductIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertGenericEquivalentProductIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HeaderResponseStatus createHeaderResponseStatusFromString(EDataType eDataType, String initialValue) {
		HeaderResponseStatus result = HeaderResponseStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHeaderResponseStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public HelpDeskPhoneNumberQualifier createHelpDeskPhoneNumberQualifierFromString(EDataType eDataType, String initialValue) {
		HelpDeskPhoneNumberQualifier result = HelpDeskPhoneNumberQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertHelpDeskPhoneNumberQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InactivePrescriptionIndicator createInactivePrescriptionIndicatorFromString(EDataType eDataType, String initialValue) {
		InactivePrescriptionIndicator result = InactivePrescriptionIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInactivePrescriptionIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicationPrecursorCodeQualifierSIGSegment createIndicationPrecursorCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		IndicationPrecursorCodeQualifierSIGSegment result = IndicationPrecursorCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicationPrecursorCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicationTextCodeQualifierSIGSegment createIndicationTextCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		IndicationTextCodeQualifierSIGSegment result = IndicationTextCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicationTextCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicationValueUnitofMeasureCodeQualifierSIGSegment createIndicationValueUnitofMeasureCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		IndicationValueUnitofMeasureCodeQualifierSIGSegment result = IndicationValueUnitofMeasureCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicationValueUnitofMeasureCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndicationVariableModifierSIGSegment createIndicationVariableModifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		IndicationVariableModifierSIGSegment result = IndicationVariableModifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndicationVariableModifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IndividualRelationshipcoded createIndividualRelationshipcodedFromString(EDataType eDataType, String initialValue) {
		IndividualRelationshipcoded result = IndividualRelationshipcoded.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIndividualRelationshipcodedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InNetworkIndicator createInNetworkIndicatorFromString(EDataType eDataType, String initialValue) {
		InNetworkIndicator result = InNetworkIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInNetworkIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntermediaryAuthorizationTypeID createIntermediaryAuthorizationTypeIDFromString(EDataType eDataType, String initialValue) {
		IntermediaryAuthorizationTypeID result = IntermediaryAuthorizationTypeID.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntermediaryAuthorizationTypeIDToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IntervalUnitsCodeQualifierSIGSegment createIntervalUnitsCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		IntervalUnitsCodeQualifierSIGSegment result = IntervalUnitsCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIntervalUnitsCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceType1 createInvoiceType1FromString(EDataType eDataType, String initialValue) {
		InvoiceType1 result = InvoiceType1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceType1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceType2 createInvoiceType2FromString(EDataType eDataType, String initialValue) {
		InvoiceType2 result = InvoiceType2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceType2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceType3 createInvoiceType3FromString(EDataType eDataType, String initialValue) {
		InvoiceType3 result = InvoiceType3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceType3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceType4 createInvoiceType4FromString(EDataType eDataType, String initialValue) {
		InvoiceType4 result = InvoiceType4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceType4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InvoiceType5 createInvoiceType5FromString(EDataType eDataType, String initialValue) {
		InvoiceType5 result = InvoiceType5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertInvoiceType5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemFormCode createItemFormCodeFromString(EDataType eDataType, String initialValue) {
		ItemFormCode result = ItemFormCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemFormCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ItemStrengthCode createItemStrengthCodeFromString(EDataType eDataType, String initialValue) {
		ItemStrengthCode result = ItemStrengthCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertItemStrengthCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public JurisdictionalState createJurisdictionalStateFromString(EDataType eDataType, String initialValue) {
		JurisdictionalState result = JurisdictionalState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertJurisdictionalStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LengthofNeedQualifier createLengthofNeedQualifierFromString(EDataType eDataType, String initialValue) {
		LengthofNeedQualifier result = LengthofNeedQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLengthofNeedQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LevelofService createLevelofServiceFromString(EDataType eDataType, String initialValue) {
		LevelofService result = LevelofService.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLevelofServiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ListAction createListActionFromString(EDataType eDataType, String initialValue) {
		ListAction result = ListAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertListActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LoadStatus createLoadStatusFromString(EDataType eDataType, String initialValue) {
		LoadStatus result = LoadStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertLoadStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MACReducedIndicator createMACReducedIndicatorFromString(EDataType eDataType, String initialValue) {
		MACReducedIndicator result = MACReducedIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMACReducedIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MailOrderIDQualifier createMailOrderIDQualifierFromString(EDataType eDataType, String initialValue) {
		MailOrderIDQualifier result = MailOrderIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMailOrderIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaintenanceDrugIndicator createMaintenanceDrugIndicatorFromString(EDataType eDataType, String initialValue) {
		MaintenanceDrugIndicator result = MaintenanceDrugIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaintenanceDrugIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ManufacturerPICOIDQualifier createManufacturerPICOIDQualifierFromString(EDataType eDataType, String initialValue) {
		ManufacturerPICOIDQualifier result = ManufacturerPICOIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertManufacturerPICOIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximumAgeQualifier createMaximumAgeQualifierFromString(EDataType eDataType, String initialValue) {
		MaximumAgeQualifier result = MaximumAgeQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaximumAgeQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximumAmountQualifier createMaximumAmountQualifierFromString(EDataType eDataType, String initialValue) {
		MaximumAmountQualifier result = MaximumAmountQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaximumAmountQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximumAmountTimePeriod createMaximumAmountTimePeriodFromString(EDataType eDataType, String initialValue) {
		MaximumAmountTimePeriod result = MaximumAmountTimePeriod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaximumAmountTimePeriodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximumDoseRestrictionCodeQualifierSIGSegment createMaximumDoseRestrictionCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		MaximumDoseRestrictionCodeQualifierSIGSegment result = MaximumDoseRestrictionCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaximumDoseRestrictionCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximumDoseRestrictionVariableDurationModifierSIGSegment createMaximumDoseRestrictionVariableDurationModifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		MaximumDoseRestrictionVariableDurationModifierSIGSegment result = MaximumDoseRestrictionVariableDurationModifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaximumDoseRestrictionVariableDurationModifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MaximumDoseRestrictionVariableUnitsCodeQualifierSIGSegment createMaximumDoseRestrictionVariableUnitsCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		MaximumDoseRestrictionVariableUnitsCodeQualifierSIGSegment result = MaximumDoseRestrictionVariableUnitsCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMaximumDoseRestrictionVariableUnitsCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementDataQualifier createMeasurementDataQualifierFromString(EDataType eDataType, String initialValue) {
		MeasurementDataQualifier result = MeasurementDataQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementDataQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementDimension createMeasurementDimensionFromString(EDataType eDataType, String initialValue) {
		MeasurementDimension result = MeasurementDimension.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementDimensionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnit createMeasurementUnitFromString(EDataType eDataType, String initialValue) {
		MeasurementUnit result = MeasurementUnit.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementUnitToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MeasurementUnitCode createMeasurementUnitCodeFromString(EDataType eDataType, String initialValue) {
		MeasurementUnitCode result = MeasurementUnitCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMeasurementUnitCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicaidIndicator createMedicaidIndicatorFromString(EDataType eDataType, String initialValue) {
		MedicaidIndicator result = MedicaidIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicaidIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicarePartDCoverageCode createMedicarePartDCoverageCodeFromString(EDataType eDataType, String initialValue) {
		MedicarePartDCoverageCode result = MedicarePartDCoverageCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicarePartDCoverageCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicarePlanCode createMedicarePlanCodeFromString(EDataType eDataType, String initialValue) {
		MedicarePlanCode result = MedicarePlanCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicarePlanCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicareRecoveryDispensingIndicator createMedicareRecoveryDispensingIndicatorFromString(EDataType eDataType, String initialValue) {
		MedicareRecoveryDispensingIndicator result = MedicareRecoveryDispensingIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicareRecoveryDispensingIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MedicareRecoveryIndicator createMedicareRecoveryIndicatorFromString(EDataType eDataType, String initialValue) {
		MedicareRecoveryIndicator result = MedicareRecoveryIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMedicareRecoveryIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembershipCountQualifier createMembershipCountQualifierFromString(EDataType eDataType, String initialValue) {
		MembershipCountQualifier result = MembershipCountQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMembershipCountQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembershipPeriodQualifier createMembershipPeriodQualifierFromString(EDataType eDataType, String initialValue) {
		MembershipPeriodQualifier result = MembershipPeriodQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMembershipPeriodQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MembershipTypeQualifier createMembershipTypeQualifierFromString(EDataType eDataType, String initialValue) {
		MembershipTypeQualifier result = MembershipTypeQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMembershipTypeQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MemberSubmittedClaimProgramCode createMemberSubmittedClaimProgramCodeFromString(EDataType eDataType, String initialValue) {
		MemberSubmittedClaimProgramCode result = MemberSubmittedClaimProgramCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMemberSubmittedClaimProgramCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MessageFunctioncoded createMessageFunctioncodedFromString(EDataType eDataType, String initialValue) {
		MessageFunctioncoded result = MessageFunctioncoded.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMessageFunctioncodedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MinimumAgeQualifier createMinimumAgeQualifierFromString(EDataType eDataType, String initialValue) {
		MinimumAgeQualifier result = MinimumAgeQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMinimumAgeQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleAdministrationTimingModifierSIGSegment createMultipleAdministrationTimingModifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		MultipleAdministrationTimingModifierSIGSegment result = MultipleAdministrationTimingModifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleAdministrationTimingModifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleRouteofAdministrationModifier createMultipleRouteofAdministrationModifierFromString(EDataType eDataType, String initialValue) {
		MultipleRouteofAdministrationModifier result = MultipleRouteofAdministrationModifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleRouteofAdministrationModifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSigModifierSIGSegment createMultipleSigModifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		MultipleSigModifierSIGSegment result = MultipleSigModifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleSigModifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleSiteofAdministrationTimingModifierSIGSegment createMultipleSiteofAdministrationTimingModifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		MultipleSiteofAdministrationTimingModifierSIGSegment result = MultipleSiteofAdministrationTimingModifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleSiteofAdministrationTimingModifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public MultipleVehicleModifierSIGSegment createMultipleVehicleModifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		MultipleVehicleModifierSIGSegment result = MultipleVehicleModifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertMultipleVehicleModifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NoKnownAllergies createNoKnownAllergiesFromString(EDataType eDataType, String initialValue) {
		NoKnownAllergies result = NoKnownAllergies.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNoKnownAllergiesToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonListedBrandOverTheCounterFormularyStatus createNonListedBrandOverTheCounterFormularyStatusFromString(EDataType eDataType, String initialValue) {
		NonListedBrandOverTheCounterFormularyStatus result = NonListedBrandOverTheCounterFormularyStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonListedBrandOverTheCounterFormularyStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonListedGenericOverTheCounterFormularyStatus createNonListedGenericOverTheCounterFormularyStatusFromString(EDataType eDataType, String initialValue) {
		NonListedGenericOverTheCounterFormularyStatus result = NonListedGenericOverTheCounterFormularyStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonListedGenericOverTheCounterFormularyStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonListedPrescriptionBrandFormularyStatus createNonListedPrescriptionBrandFormularyStatusFromString(EDataType eDataType, String initialValue) {
		NonListedPrescriptionBrandFormularyStatus result = NonListedPrescriptionBrandFormularyStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonListedPrescriptionBrandFormularyStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonListedPrescriptionGenericFormularyStatus createNonListedPrescriptionGenericFormularyStatusFromString(EDataType eDataType, String initialValue) {
		NonListedPrescriptionGenericFormularyStatus result = NonListedPrescriptionGenericFormularyStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonListedPrescriptionGenericFormularyStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonListedSuppliesFormularyStatus createNonListedSuppliesFormularyStatusFromString(EDataType eDataType, String initialValue) {
		NonListedSuppliesFormularyStatus result = NonListedSuppliesFormularyStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonListedSuppliesFormularyStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NonPOSClaimOverrideCode createNonPOSClaimOverrideCodeFromString(EDataType eDataType, String initialValue) {
		NonPOSClaimOverrideCode result = NonPOSClaimOverrideCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNonPOSClaimOverrideCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumberofRefillsAuthorized createNumberofRefillsAuthorizedFromString(EDataType eDataType, String initialValue) {
		NumberofRefillsAuthorized result = NumberofRefillsAuthorized.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumberofRefillsAuthorizedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NumeratorIndicator createNumeratorIndicatorFromString(EDataType eDataType, String initialValue) {
		NumeratorIndicator result = NumeratorIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNumeratorIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OriginallyPrescribedProductServiceIDQualifier createOriginallyPrescribedProductServiceIDQualifierFromString(EDataType eDataType, String initialValue) {
		OriginallyPrescribedProductServiceIDQualifier result = OriginallyPrescribedProductServiceIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOriginallyPrescribedProductServiceIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherAmountClaimedSubmittedQualifier createOtherAmountClaimedSubmittedQualifierFromString(EDataType eDataType, String initialValue) {
		OtherAmountClaimedSubmittedQualifier result = OtherAmountClaimedSubmittedQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherAmountClaimedSubmittedQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherAmountPaidQualifier createOtherAmountPaidQualifierFromString(EDataType eDataType, String initialValue) {
		OtherAmountPaidQualifier result = OtherAmountPaidQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherAmountPaidQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherCoverageCode createOtherCoverageCodeFromString(EDataType eDataType, String initialValue) {
		OtherCoverageCode result = OtherCoverageCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherCoverageCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherPayerAmountPaidQualifier createOtherPayerAmountPaidQualifierFromString(EDataType eDataType, String initialValue) {
		OtherPayerAmountPaidQualifier result = OtherPayerAmountPaidQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherPayerAmountPaidQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherPayerCoverageType createOtherPayerCoverageTypeFromString(EDataType eDataType, String initialValue) {
		OtherPayerCoverageType result = OtherPayerCoverageType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherPayerCoverageTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherPayerIDQualifier createOtherPayerIDQualifierFromString(EDataType eDataType, String initialValue) {
		OtherPayerIDQualifier result = OtherPayerIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherPayerIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherPayerPatientRelationshipCode createOtherPayerPatientRelationshipCodeFromString(EDataType eDataType, String initialValue) {
		OtherPayerPatientRelationshipCode result = OtherPayerPatientRelationshipCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherPayerPatientRelationshipCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherPayerPatientResponsibilityAmountQualifier createOtherPayerPatientResponsibilityAmountQualifierFromString(EDataType eDataType, String initialValue) {
		OtherPayerPatientResponsibilityAmountQualifier result = OtherPayerPatientResponsibilityAmountQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherPayerPatientResponsibilityAmountQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherPharmacyIndicator createOtherPharmacyIndicatorFromString(EDataType eDataType, String initialValue) {
		OtherPharmacyIndicator result = OtherPharmacyIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherPharmacyIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OtherPrescriberIndicator createOtherPrescriberIndicatorFromString(EDataType eDataType, String initialValue) {
		OtherPrescriberIndicator result = OtherPrescriberIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOtherPrescriberIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientAssignmentIndicatorDirectMemberReimbursementIndicator createPatientAssignmentIndicatorDirectMemberReimbursementIndicatorFromString(EDataType eDataType, String initialValue) {
		PatientAssignmentIndicatorDirectMemberReimbursementIndicator result = PatientAssignmentIndicatorDirectMemberReimbursementIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientAssignmentIndicatorDirectMemberReimbursementIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientGenderCode createPatientGenderCodeFromString(EDataType eDataType, String initialValue) {
		PatientGenderCode result = PatientGenderCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientGenderCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientIDAssociatedStateProvinceAddress createPatientIDAssociatedStateProvinceAddressFromString(EDataType eDataType, String initialValue) {
		PatientIDAssociatedStateProvinceAddress result = PatientIDAssociatedStateProvinceAddress.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientIDAssociatedStateProvinceAddressToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientIDQualifier createPatientIDQualifierFromString(EDataType eDataType, String initialValue) {
		PatientIDQualifier result = PatientIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientLocation createPatientLocationFromString(EDataType eDataType, String initialValue) {
		PatientLocation result = PatientLocation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientLocationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientRelationshipCode createPatientRelationshipCodeFromString(EDataType eDataType, String initialValue) {
		PatientRelationshipCode result = PatientRelationshipCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientRelationshipCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientResidence createPatientResidenceFromString(EDataType eDataType, String initialValue) {
		PatientResidence result = PatientResidence.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientResidenceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientStateProvinceAddress createPatientStateProvinceAddressFromString(EDataType eDataType, String initialValue) {
		PatientStateProvinceAddress result = PatientStateProvinceAddress.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPatientStateProvinceAddressToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayerIDQualifier createPayerIDQualifierFromString(EDataType eDataType, String initialValue) {
		PayerIDQualifier result = PayerIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayerIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayrollClass createPayrollClassFromString(EDataType eDataType, String initialValue) {
		PayrollClass result = PayrollClass.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayrollClassToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayToQualifier createPayToQualifierFromString(EDataType eDataType, String initialValue) {
		PayToQualifier result = PayToQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayToQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PayToStateProvinceAddress createPayToStateProvinceAddressFromString(EDataType eDataType, String initialValue) {
		PayToStateProvinceAddress result = PayToStateProvinceAddress.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPayToStateProvinceAddressToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageSalesTaxBasisPaid createPercentageSalesTaxBasisPaidFromString(EDataType eDataType, String initialValue) {
		PercentageSalesTaxBasisPaid result = PercentageSalesTaxBasisPaid.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentageSalesTaxBasisPaidToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PercentageSalesTaxBasisSubmitted createPercentageSalesTaxBasisSubmittedFromString(EDataType eDataType, String initialValue) {
		PercentageSalesTaxBasisSubmitted result = PercentageSalesTaxBasisSubmitted.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPercentageSalesTaxBasisSubmittedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PerformanceQualifier createPerformanceQualifierFromString(EDataType eDataType, String initialValue) {
		PerformanceQualifier result = PerformanceQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPerformanceQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PharmacyClassCodeQualifier createPharmacyClassCodeQualifierFromString(EDataType eDataType, String initialValue) {
		PharmacyClassCodeQualifier result = PharmacyClassCodeQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPharmacyClassCodeQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PharmacyDispenserTypeQualifier createPharmacyDispenserTypeQualifierFromString(EDataType eDataType, String initialValue) {
		PharmacyDispenserTypeQualifier result = PharmacyDispenserTypeQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPharmacyDispenserTypeQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PharmacyIDQualifier createPharmacyIDQualifierFromString(EDataType eDataType, String initialValue) {
		PharmacyIDQualifier result = PharmacyIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPharmacyIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PharmacyLocationState createPharmacyLocationStateFromString(EDataType eDataType, String initialValue) {
		PharmacyLocationState result = PharmacyLocationState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPharmacyLocationStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PharmacyServiceType createPharmacyServiceTypeFromString(EDataType eDataType, String initialValue) {
		PharmacyServiceType result = PharmacyServiceType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPharmacyServiceTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PharmacyType createPharmacyTypeFromString(EDataType eDataType, String initialValue) {
		PharmacyType result = PharmacyType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPharmacyTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlaceofService createPlaceofServiceFromString(EDataType eDataType, String initialValue) {
		PlaceofService result = PlaceofService.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlaceofServiceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanAffiliationParentPlanIDQualifier createPlanAffiliationParentPlanIDQualifierFromString(EDataType eDataType, String initialValue) {
		PlanAffiliationParentPlanIDQualifier result = PlanAffiliationParentPlanIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanAffiliationParentPlanIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanCutbackReasonCode createPlanCutbackReasonCodeFromString(EDataType eDataType, String initialValue) {
		PlanCutbackReasonCode result = PlanCutbackReasonCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanCutbackReasonCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanDegreeManaged createPlanDegreeManagedFromString(EDataType eDataType, String initialValue) {
		PlanDegreeManaged result = PlanDegreeManaged.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanDegreeManagedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanIDQualifier createPlanIDQualifierFromString(EDataType eDataType, String initialValue) {
		PlanIDQualifier result = PlanIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PlanType createPlanTypeFromString(EDataType eDataType, String initialValue) {
		PlanType result = PlanType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPlanTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PotencyUnitCode createPotencyUnitCodeFromString(EDataType eDataType, String initialValue) {
		PotencyUnitCode result = PotencyUnitCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPotencyUnitCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferenceLevel createPreferenceLevelFromString(EDataType eDataType, String initialValue) {
		PreferenceLevel result = PreferenceLevel.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreferenceLevelToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PreferredProductIDQualifier createPreferredProductIDQualifierFromString(EDataType eDataType, String initialValue) {
		PreferredProductIDQualifier result = PreferredProductIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPreferredProductIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PregnancyIndicator createPregnancyIndicatorFromString(EDataType eDataType, String initialValue) {
		PregnancyIndicator result = PregnancyIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPregnancyIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriberAlternateIDAssociatedStateProvinceAddress createPrescriberAlternateIDAssociatedStateProvinceAddressFromString(EDataType eDataType, String initialValue) {
		PrescriberAlternateIDAssociatedStateProvinceAddress result = PrescriberAlternateIDAssociatedStateProvinceAddress.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriberAlternateIDAssociatedStateProvinceAddressToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriberAlternateIDQualifier createPrescriberAlternateIDQualifierFromString(EDataType eDataType, String initialValue) {
		PrescriberAlternateIDQualifier result = PrescriberAlternateIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriberAlternateIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriberCertificationStatus createPrescriberCertificationStatusFromString(EDataType eDataType, String initialValue) {
		PrescriberCertificationStatus result = PrescriberCertificationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriberCertificationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriberIDAssociatedStateProvinceAddress createPrescriberIDAssociatedStateProvinceAddressFromString(EDataType eDataType, String initialValue) {
		PrescriberIDAssociatedStateProvinceAddress result = PrescriberIDAssociatedStateProvinceAddress.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriberIDAssociatedStateProvinceAddressToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriberIDQualifier createPrescriberIDQualifierFromString(EDataType eDataType, String initialValue) {
		PrescriberIDQualifier result = PrescriberIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriberIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriberOverrideType createPrescriberOverrideTypeFromString(EDataType eDataType, String initialValue) {
		PrescriberOverrideType result = PrescriberOverrideType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriberOverrideTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriberSpecialty createPrescriberSpecialtyFromString(EDataType eDataType, String initialValue) {
		PrescriberSpecialty result = PrescriberSpecialty.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriberSpecialtyToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriberStateProvinceAddress createPrescriberStateProvinceAddressFromString(EDataType eDataType, String initialValue) {
		PrescriberStateProvinceAddress result = PrescriberStateProvinceAddress.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriberStateProvinceAddressToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriberTaxonomyCode createPrescriberTaxonomyCodeFromString(EDataType eDataType, String initialValue) {
		PrescriberTaxonomyCode result = PrescriberTaxonomyCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriberTaxonomyCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptionServiceReferenceNumberQualifier createPrescriptionServiceReferenceNumberQualifierFromString(EDataType eDataType, String initialValue) {
		PrescriptionServiceReferenceNumberQualifier result = PrescriptionServiceReferenceNumberQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriptionServiceReferenceNumberQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptionDeliveryMethod createPrescriptionDeliveryMethodFromString(EDataType eDataType, String initialValue) {
		PrescriptionDeliveryMethod result = PrescriptionDeliveryMethod.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriptionDeliveryMethodToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptionOriginCode createPrescriptionOriginCodeFromString(EDataType eDataType, String initialValue) {
		PrescriptionOriginCode result = PrescriptionOriginCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriptionOriginCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptionOverTheCounterIndicator createPrescriptionOverTheCounterIndicatorFromString(EDataType eDataType, String initialValue) {
		PrescriptionOverTheCounterIndicator result = PrescriptionOverTheCounterIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriptionOverTheCounterIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriptionType createPrescriptionTypeFromString(EDataType eDataType, String initialValue) {
		PrescriptionType result = PrescriptionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrescriptionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrimaryCareProviderIDQualifier createPrimaryCareProviderIDQualifierFromString(EDataType eDataType, String initialValue) {
		PrimaryCareProviderIDQualifier result = PrimaryCareProviderIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPrimaryCareProviderIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAuthorizationApplicability createPriorAuthorizationApplicabilityFromString(EDataType eDataType, String initialValue) {
		PriorAuthorizationApplicability result = PriorAuthorizationApplicability.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorAuthorizationApplicabilityToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAuthorizationComparisonType createPriorAuthorizationComparisonTypeFromString(EDataType eDataType, String initialValue) {
		PriorAuthorizationComparisonType result = PriorAuthorizationComparisonType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorAuthorizationComparisonTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAuthorizationQuestionCodeQualifier createPriorAuthorizationQuestionCodeQualifierFromString(EDataType eDataType, String initialValue) {
		PriorAuthorizationQuestionCodeQualifier result = PriorAuthorizationQuestionCodeQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorAuthorizationQuestionCodeQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAuthorizationReasonCode createPriorAuthorizationReasonCodeFromString(EDataType eDataType, String initialValue) {
		PriorAuthorizationReasonCode result = PriorAuthorizationReasonCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorAuthorizationReasonCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAuthorizationRequiredQuestion createPriorAuthorizationRequiredQuestionFromString(EDataType eDataType, String initialValue) {
		PriorAuthorizationRequiredQuestion result = PriorAuthorizationRequiredQuestion.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorAuthorizationRequiredQuestionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAuthorizationResponseType createPriorAuthorizationResponseTypeFromString(EDataType eDataType, String initialValue) {
		PriorAuthorizationResponseType result = PriorAuthorizationResponseType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorAuthorizationResponseTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAuthorizationStatus createPriorAuthorizationStatusFromString(EDataType eDataType, String initialValue) {
		PriorAuthorizationStatus result = PriorAuthorizationStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorAuthorizationStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAuthorizationTypeCode createPriorAuthorizationTypeCodeFromString(EDataType eDataType, String initialValue) {
		PriorAuthorizationTypeCode result = PriorAuthorizationTypeCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPriorAuthorizationTypeCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorDefinedPriorAuthorizationReasonCode createProcessorDefinedPriorAuthorizationReasonCodeFromString(EDataType eDataType, String initialValue) {
		ProcessorDefinedPriorAuthorizationReasonCode result = ProcessorDefinedPriorAuthorizationReasonCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessorDefinedPriorAuthorizationReasonCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorLocationState createProcessorLocationStateFromString(EDataType eDataType, String initialValue) {
		ProcessorLocationState result = ProcessorLocationState.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessorLocationStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProcessorPaymentClarificationCode createProcessorPaymentClarificationCodeFromString(EDataType eDataType, String initialValue) {
		ProcessorPaymentClarificationCode result = ProcessorPaymentClarificationCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProcessorPaymentClarificationCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductServiceIDQualifier createProductServiceIDQualifierFromString(EDataType eDataType, String initialValue) {
		ProductServiceIDQualifier result = ProductServiceIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductServiceIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductServiceIDQualifierAlternative createProductServiceIDQualifierAlternativeFromString(EDataType eDataType, String initialValue) {
		ProductServiceIDQualifierAlternative result = ProductServiceIDQualifierAlternative.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductServiceIDQualifierAlternativeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductServiceIDQualifierSource createProductServiceIDQualifierSourceFromString(EDataType eDataType, String initialValue) {
		ProductServiceIDQualifierSource result = ProductServiceIDQualifierSource.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductServiceIDQualifierSourceToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductServiceIDQualifierStepDrug createProductServiceIDQualifierStepDrugFromString(EDataType eDataType, String initialValue) {
		ProductServiceIDQualifierStepDrug result = ProductServiceIDQualifierStepDrug.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductServiceIDQualifierStepDrugToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductCodeQualifier createProductCodeQualifierFromString(EDataType eDataType, String initialValue) {
		ProductCodeQualifier result = ProductCodeQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductCodeQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductFormularyStatusCode createProductFormularyStatusCodeFromString(EDataType eDataType, String initialValue) {
		ProductFormularyStatusCode result = ProductFormularyStatusCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductFormularyStatusCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProductType createProductTypeFromString(EDataType eDataType, String initialValue) {
		ProductType result = ProductType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProductTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProfessionalServiceCode createProfessionalServiceCodeFromString(EDataType eDataType, String initialValue) {
		ProfessionalServiceCode result = ProfessionalServiceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProfessionalServiceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderAcceptAssignmentIndicator createProviderAcceptAssignmentIndicatorFromString(EDataType eDataType, String initialValue) {
		ProviderAcceptAssignmentIndicator result = ProviderAcceptAssignmentIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderAcceptAssignmentIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderIDQualifier createProviderIDQualifierFromString(EDataType eDataType, String initialValue) {
		ProviderIDQualifier result = ProviderIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ProviderSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222 createProviderSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222FromString(EDataType eDataType, String initialValue) {
		ProviderSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222 result = ProviderSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertProviderSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaserAddressStateProvinceCode createPurchaserAddressStateProvinceCodeFromString(EDataType eDataType, String initialValue) {
		PurchaserAddressStateProvinceCode result = PurchaserAddressStateProvinceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPurchaserAddressStateProvinceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaserCountryCode createPurchaserCountryCodeFromString(EDataType eDataType, String initialValue) {
		PurchaserCountryCode result = PurchaserCountryCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPurchaserCountryCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaserGenderCode createPurchaserGenderCodeFromString(EDataType eDataType, String initialValue) {
		PurchaserGenderCode result = PurchaserGenderCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPurchaserGenderCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaserIDAssociatedStateProvinceCode createPurchaserIDAssociatedStateProvinceCodeFromString(EDataType eDataType, String initialValue) {
		PurchaserIDAssociatedStateProvinceCode result = PurchaserIDAssociatedStateProvinceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPurchaserIDAssociatedStateProvinceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaserIDQualifier createPurchaserIDQualifierFromString(EDataType eDataType, String initialValue) {
		PurchaserIDQualifier result = PurchaserIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPurchaserIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PurchaserRelationshipCode createPurchaserRelationshipCodeFromString(EDataType eDataType, String initialValue) {
		PurchaserRelationshipCode result = PurchaserRelationshipCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPurchaserRelationshipCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RateUnitofMeasureCodeQualifierSIGSegment createRateUnitofMeasureCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		RateUnitofMeasureCodeQualifierSIGSegment result = RateUnitofMeasureCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRateUnitofMeasureCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonCodeREQSegment createReasonCodeREQSegmentFromString(EDataType eDataType, String initialValue) {
		ReasonCodeREQSegment result = ReasonCodeREQSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonCodeREQSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReasonforServiceCode createReasonforServiceCodeFromString(EDataType eDataType, String initialValue) {
		ReasonforServiceCode result = ReasonforServiceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReasonforServiceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RebateType createRebateTypeFromString(EDataType eDataType, String initialValue) {
		RebateType result = RebateType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRebateTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RebateTypeDescription createRebateTypeDescriptionFromString(EDataType eDataType, String initialValue) {
		RebateTypeDescription result = RebateTypeDescription.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRebateTypeDescriptionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RebateVersionReleaseNumber createRebateVersionReleaseNumberFromString(EDataType eDataType, String initialValue) {
		RebateVersionReleaseNumber result = RebateVersionReleaseNumber.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRebateVersionReleaseNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconciliationReasonCode createReconciliationReasonCodeFromString(EDataType eDataType, String initialValue) {
		ReconciliationReasonCode result = ReconciliationReasonCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReconciliationReasonCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReconciliationStatusCode createReconciliationStatusCodeFromString(EDataType eDataType, String initialValue) {
		ReconciliationStatusCode result = ReconciliationStatusCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReconciliationStatusCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordIndicator createRecordIndicatorFromString(EDataType eDataType, String initialValue) {
		RecordIndicator result = RecordIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecordIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordPurposeIndicator createRecordPurposeIndicatorFromString(EDataType eDataType, String initialValue) {
		RecordPurposeIndicator result = RecordPurposeIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecordPurposeIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordStatusCode createRecordStatusCodeFromString(EDataType eDataType, String initialValue) {
		RecordStatusCode result = RecordStatusCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecordStatusCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RecordType createRecordTypeFromString(EDataType eDataType, String initialValue) {
		RecordType result = RecordType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRecordTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReferenceQualifierGenericDatabasePriorAuthorizationDRUSegment createReferenceQualifierGenericDatabasePriorAuthorizationDRUSegmentFromString(EDataType eDataType, String initialValue) {
		ReferenceQualifierGenericDatabasePriorAuthorizationDRUSegment result = ReferenceQualifierGenericDatabasePriorAuthorizationDRUSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReferenceQualifierGenericDatabasePriorAuthorizationDRUSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ReimbursementQualifier createReimbursementQualifierFromString(EDataType eDataType, String initialValue) {
		ReimbursementQualifier result = ReimbursementQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertReimbursementQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RejectCode createRejectCodeFromString(EDataType eDataType, String initialValue) {
		RejectCode result = RejectCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRejectCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RejectOverrideCode createRejectOverrideCodeFromString(EDataType eDataType, String initialValue) {
		RejectOverrideCode result = RejectOverrideCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRejectOverrideCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestStatus createRequestStatusFromString(EDataType eDataType, String initialValue) {
		RequestStatus result = RequestStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RequestType createRequestTypeFromString(EDataType eDataType, String initialValue) {
		RequestType result = RequestType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRequestTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResourceLinkType createResourceLinkTypeFromString(EDataType eDataType, String initialValue) {
		ResourceLinkType result = ResourceLinkType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResourceLinkTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResultofServiceCode createResultofServiceCodeFromString(EDataType eDataType, String initialValue) {
		ResultofServiceCode result = ResultofServiceCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertResultofServiceCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteOfAdministration createRouteOfAdministrationFromString(EDataType eDataType, String initialValue) {
		RouteOfAdministration result = RouteOfAdministration.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRouteOfAdministrationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public RouteofAdministrationCodeQualifier createRouteofAdministrationCodeQualifierFromString(EDataType eDataType, String initialValue) {
		RouteofAdministrationCodeQualifier result = RouteofAdministrationCodeQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertRouteofAdministrationCodeQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentIdentification createSegmentIdentificationFromString(EDataType eDataType, String initialValue) {
		SegmentIdentification result = SegmentIdentification.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSegmentIdentificationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentIdentifier createSegmentIdentifierFromString(EDataType eDataType, String initialValue) {
		SegmentIdentifier result = SegmentIdentifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSegmentIdentifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentQualifier1 createSegmentQualifier1FromString(EDataType eDataType, String initialValue) {
		SegmentQualifier1 result = SegmentQualifier1.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSegmentQualifier1ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentQualifier2 createSegmentQualifier2FromString(EDataType eDataType, String initialValue) {
		SegmentQualifier2 result = SegmentQualifier2.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSegmentQualifier2ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentQualifier3 createSegmentQualifier3FromString(EDataType eDataType, String initialValue) {
		SegmentQualifier3 result = SegmentQualifier3.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSegmentQualifier3ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentQualifier4 createSegmentQualifier4FromString(EDataType eDataType, String initialValue) {
		SegmentQualifier4 result = SegmentQualifier4.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSegmentQualifier4ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentQualifier5 createSegmentQualifier5FromString(EDataType eDataType, String initialValue) {
		SegmentQualifier5 result = SegmentQualifier5.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSegmentQualifier5ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SegmentQualifier6 createSegmentQualifier6FromString(EDataType eDataType, String initialValue) {
		SegmentQualifier6 result = SegmentQualifier6.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSegmentQualifier6ToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SellerIDQualifier createSellerIDQualifierFromString(EDataType eDataType, String initialValue) {
		SellerIDQualifier result = SellerIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSellerIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProviderIDQualifier createServiceProviderIDQualifierFromString(EDataType eDataType, String initialValue) {
		ServiceProviderIDQualifier result = ServiceProviderIDQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceProviderIDQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProviderOverrideType createServiceProviderOverrideTypeFromString(EDataType eDataType, String initialValue) {
		ServiceProviderOverrideType result = ServiceProviderOverrideType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceProviderOverrideTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ServiceProviderStateProvinceCodeAddress createServiceProviderStateProvinceCodeAddressFromString(EDataType eDataType, String initialValue) {
		ServiceProviderStateProvinceCodeAddress result = ServiceProviderStateProvinceCodeAddress.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertServiceProviderStateProvinceCodeAddressToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SigFreeTextStringIndicatorSIGSegment createSigFreeTextStringIndicatorSIGSegmentFromString(EDataType eDataType, String initialValue) {
		SigFreeTextStringIndicatorSIGSegment result = SigFreeTextStringIndicatorSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSigFreeTextStringIndicatorSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SiteofAdministrationCodeQualifierSIGSegment createSiteofAdministrationCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		SiteofAdministrationCodeQualifierSIGSegment result = SiteofAdministrationCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSiteofAdministrationCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SmokerNonSmokerCode createSmokerNonSmokerCodeFromString(EDataType eDataType, String initialValue) {
		SmokerNonSmokerCode result = SmokerNonSmokerCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSmokerNonSmokerCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceCodeList createSourceCodeListFromString(EDataType eDataType, String initialValue) {
		SourceCodeList result = SourceCodeList.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceCodeListToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SourceofInformation createSourceofInformationFromString(EDataType eDataType, String initialValue) {
		SourceofInformation result = SourceofInformation.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSourceofInformationToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpecialPackagingIndicator createSpecialPackagingIndicatorFromString(EDataType eDataType, String initialValue) {
		SpecialPackagingIndicator result = SpecialPackagingIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpecialPackagingIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createStateFromString(EDataType eDataType, String initialValue) {
		State result = State.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStateToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StatusTypecoded createStatusTypecodedFromString(EDataType eDataType, String initialValue) {
		StatusTypecoded result = StatusTypecoded.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStatusTypecodedToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StepOrder createStepOrderFromString(EDataType eDataType, String initialValue) {
		StepOrder result = StepOrder.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStepOrderToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public StopIndicatorSIGSegment createStopIndicatorSIGSegmentFromString(EDataType eDataType, String initialValue) {
		StopIndicatorSIGSegment result = StopIndicatorSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertStopIndicatorSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmissionClarificationCode createSubmissionClarificationCodeFromString(EDataType eDataType, String initialValue) {
		SubmissionClarificationCode result = SubmissionClarificationCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubmissionClarificationCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmissionNumber createSubmissionNumberFromString(EDataType eDataType, String initialValue) {
		SubmissionNumber result = SubmissionNumber.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubmissionNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubmitCode createSubmitCodeFromString(EDataType eDataType, String initialValue) {
		SubmitCode result = SubmitCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSubmitCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TaxExemptIndicator createTaxExemptIndicatorFromString(EDataType eDataType, String initialValue) {
		TaxExemptIndicator result = TaxExemptIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTaxExemptIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelephoneNumber createTelephoneNumberFromString(EDataType eDataType, String initialValue) {
		TelephoneNumber result = TelephoneNumber.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTelephoneNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TherapeuticClassCodeQualifier createTherapeuticClassCodeQualifierFromString(EDataType eDataType, String initialValue) {
		TherapeuticClassCodeQualifier result = TherapeuticClassCodeQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTherapeuticClassCodeQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimePeriodBasisCodeQualifierSIGSegment createTimePeriodBasisCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		TimePeriodBasisCodeQualifierSIGSegment result = TimePeriodBasisCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTimePeriodBasisCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionCode createTransactionCodeFromString(EDataType eDataType, String initialValue) {
		TransactionCode result = TransactionCode.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionCodeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionCount createTransactionCountFromString(EDataType eDataType, String initialValue) {
		TransactionCount result = TransactionCount.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionCountToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionResponseStatus createTransactionResponseStatusFromString(EDataType eDataType, String initialValue) {
		TransactionResponseStatus result = TransactionResponseStatus.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransactionResponseStatusToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferFlag createTransferFlagFromString(EDataType eDataType, String initialValue) {
		TransferFlag result = TransferFlag.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransferFlagToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransferType createTransferTypeFromString(EDataType eDataType, String initialValue) {
		TransferType result = TransferType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransferTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionAction createTransmissionActionFromString(EDataType eDataType, String initialValue) {
		TransmissionAction result = TransmissionAction.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransmissionActionToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionFileType createTransmissionFileTypeFromString(EDataType eDataType, String initialValue) {
		TransmissionFileType result = TransmissionFileType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransmissionFileTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransmissionType createTransmissionTypeFromString(EDataType eDataType, String initialValue) {
		TransmissionType result = TransmissionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTransmissionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UniqueRecordIdentifierQualifier createUniqueRecordIdentifierQualifierFromString(EDataType eDataType, String initialValue) {
		UniqueRecordIdentifierQualifier result = UniqueRecordIdentifierQualifier.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUniqueRecordIdentifierQualifierToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public UnitofMeasure createUnitofMeasureFromString(EDataType eDataType, String initialValue) {
		UnitofMeasure result = UnitofMeasure.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertUnitofMeasureToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableFrequencyModifierSIGSegment createVariableFrequencyModifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		VariableFrequencyModifierSIGSegment result = VariableFrequencyModifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableFrequencyModifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VariableIntervalModifierSIGSegment createVariableIntervalModifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		VariableIntervalModifierSIGSegment result = VariableIntervalModifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVariableIntervalModifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleNameCodeQualifierSIGSegment createVehicleNameCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		VehicleNameCodeQualifierSIGSegment result = VehicleNameCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVehicleNameCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VehicleUnitofMeasureCodeQualifierSIGSegment createVehicleUnitofMeasureCodeQualifierSIGSegmentFromString(EDataType eDataType, String initialValue) {
		VehicleUnitofMeasureCodeQualifierSIGSegment result = VehicleUnitofMeasureCodeQualifierSIGSegment.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVehicleUnitofMeasureCodeQualifierSIGSegmentToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public VersionReleaseNumber createVersionReleaseNumberFromString(EDataType eDataType, String initialValue) {
		VersionReleaseNumber result = VersionReleaseNumber.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertVersionReleaseNumberToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkersCompensationPropertyAndCasualtyIndicator createWorkersCompensationPropertyAndCasualtyIndicatorFromString(EDataType eDataType, String initialValue) {
		WorkersCompensationPropertyAndCasualtyIndicator result = WorkersCompensationPropertyAndCasualtyIndicator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertWorkersCompensationPropertyAndCasualtyIndicatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalCodeListPackage getExternalCodeListPackage() {
		return (ExternalCodeListPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static ExternalCodeListPackage getPackage() {
		return ExternalCodeListPackage.eINSTANCE;
	}

} //ExternalCodeListFactoryImpl
