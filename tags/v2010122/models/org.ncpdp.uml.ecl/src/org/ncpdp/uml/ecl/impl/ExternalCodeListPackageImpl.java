/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.ecl.impl;

import java.io.IOException;

import java.net.URL;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.common.util.WrappedException;

import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.eclipse.emf.ecore.resource.Resource;

import org.eclipse.emf.ecore.xmi.impl.EcoreResourceFactoryImpl;

import org.ncpdp.uml.ecl.ExternalCodeListFactory;
import org.ncpdp.uml.ecl.ExternalCodeListPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class ExternalCodeListPackageImpl extends EPackageImpl implements ExternalCodeListPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected String packageFilename = "ecl.ecore";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum accumulatorMonthEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum additionalDocumentationTypeIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum additionalMessageInformationContinuityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum additionalMessageInformationQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum addressQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adjudicatorIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum adjustmentTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum administrationTimingCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum administrativeFeeEffectIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum amountAttributedToProductSelectionQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum approvedMessageCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum associatedPrescriptionServiceProviderIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum associatedPrescriptionServiceReferenceNumberQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum authorizedRepresentativeStateProvinceAddressEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum baselineQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basePriceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basisOfCalculationCoinsuranceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basisOfCalculationCopayEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basisOfCalculationDispensingFeeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basisOfCalculationFlatSalesTaxEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basisOfCalculationPercentageSalesTaxEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basisOfCostDeterminationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basisOfReimbursementDeterminationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum basisOfRequestEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum benefitAmountTimePeriodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum benefitAmountTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum benefitStageQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum benefitTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum billingEntityTypeIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum bodyMetricQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum brandGenericIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum brandedGenericCopayConfidentialEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum calculatedDoseUnitofMeasureCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum carrierLocationStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeIdentifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum changeofPrescriptionStatusFlagEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum claimMediaTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum claimOriginationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clientFormularyFlagEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clientPricingBasisOfCostEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clinicalInformationQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum clinicalSignificanceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cmsPartDDefinedQualifiedFacilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum cobPrimaryClaimTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codeListQualifierDiagnosisCodeQualifierPrimaryDRUSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codeListQualifierRejectCodeSTSSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum codeListQualifierResponseCodeRESSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum communicationTypeIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compoundCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compoundDispensingUnitFormIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compoundDosageFormDescriptionCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compoundIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compoundIngredientBasisofCostDeterminationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compoundProductIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compoundRouteofAdministrationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum compoundTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum conditionResponsecodedPatientConsentIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum contractingOrganizationPMOIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum copayCoinsuranceOverrideTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum copayListTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum countrySubentityIdentificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum couponTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum coverageListTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum databaseIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dataProviderIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum deaScheduleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum delayReasonCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum diagnosisCodeQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum discontinueDateQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dispenseAsWrittenDAWProductSelectionCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dispenseAsWrittenDAWDifferenceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dispensingStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doNotFillProfileFlagEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dosageFormIDCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doseBasisRangeModifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doseCompositeIndicatorSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doseDeliveryMethodCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doseDeliveryMethodModifierCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doseFormCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum doseRangeModifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dosingBasisUnitofMeasureCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum drugCoverageStatusCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum drugQualifierStepDrugEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum drugReferenceQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum drugReferenceQualifierAlternativeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum drugReferenceQualifierSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum drugReferenceQualifierStepDrugEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum drugTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dueClinicalSignificanceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dueCoAgentIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dueProfessionalServiceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dueReasonForServiceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum dueResultOfServiceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durppsLevelOfEffortEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durationTextCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum durCoAgentIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum easyOpenCapIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eligibilityPatientRelationshipCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eligibilityClarificationCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eligibilityCOBIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eligibleCoverageCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum eligiblePlanEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum employerStateProvinceAddressEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum entityStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum facilityStateProvinceAddressEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fdaDrugEfficacyCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum federalDEAScheduleEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum federalUpperLimitIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum ffPrescriberIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileStructureTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fileTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fillNumberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum fillNumberCalculatedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum finalCompoundPharmaceuticalDosageFormEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum firstCopayTermEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formularyBenefitDesignTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formularyNonFormularyCoPayConfidentialEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formularyProductCoPayConfidentialEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum formularyStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum frequencyUnitsCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genderCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genericAvailableEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum genericEquivalentProductIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum headerResponseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum helpDeskPhoneNumberQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inactivePrescriptionIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indicationPrecursorCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indicationTextCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indicationValueUnitofMeasureCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum indicationVariableModifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum individualRelationshipcodedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum inNetworkIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intermediaryAuthorizationTypeIDEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum intervalUnitsCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum invoiceType1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum invoiceType2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum invoiceType3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum invoiceType4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum invoiceType5EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum itemFormCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum itemStrengthCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum jurisdictionalStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum lengthofNeedQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum levelofServiceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum listActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum loadStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum macReducedIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum mailOrderIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maintenanceDrugIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum manufacturerPICOIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maximumAgeQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maximumAmountQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maximumAmountTimePeriodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maximumDoseRestrictionCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maximumDoseRestrictionVariableDurationModifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum maximumDoseRestrictionVariableUnitsCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurementDataQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurementDimensionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurementUnitEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum measurementUnitCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicaidIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicarePartDCoverageCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicarePlanCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicareRecoveryDispensingIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum medicareRecoveryIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum membershipCountQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum membershipPeriodQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum membershipTypeQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum memberSubmittedClaimProgramCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum messageFunctioncodedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum minimumAgeQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multipleAdministrationTimingModifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multipleRouteofAdministrationModifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multipleSigModifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multipleSiteofAdministrationTimingModifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum multipleVehicleModifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum noKnownAllergiesEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nonListedBrandOverTheCounterFormularyStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nonListedGenericOverTheCounterFormularyStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nonListedPrescriptionBrandFormularyStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nonListedPrescriptionGenericFormularyStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nonListedSuppliesFormularyStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum nonPOSClaimOverrideCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numberofRefillsAuthorizedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum numeratorIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum originallyPrescribedProductServiceIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum otherAmountClaimedSubmittedQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum otherAmountPaidQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum otherCoverageCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum otherPayerAmountPaidQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum otherPayerCoverageTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum otherPayerIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum otherPayerPatientRelationshipCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum otherPayerPatientResponsibilityAmountQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum otherPharmacyIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum otherPrescriberIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientAssignmentIndicatorDirectMemberReimbursementIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientGenderCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientIDAssociatedStateProvinceAddressEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientLocationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientRelationshipCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientResidenceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum patientStateProvinceAddressEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payerIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payrollClassEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payToQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum payToStateProvinceAddressEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum percentageSalesTaxBasisPaidEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum percentageSalesTaxBasisSubmittedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum performanceQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pharmacyClassCodeQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pharmacyDispenserTypeQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pharmacyIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pharmacyLocationStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pharmacyServiceTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pharmacyTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum placeofServiceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planAffiliationParentPlanIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planCutbackReasonCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planDegreeManagedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum planTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum potencyUnitCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum preferenceLevelEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum preferredProductIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum pregnancyIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriberAlternateIDAssociatedStateProvinceAddressEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriberAlternateIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriberCertificationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriberIDAssociatedStateProvinceAddressEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriberIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriberOverrideTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriberSpecialtyEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriberStateProvinceAddressEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriberTaxonomyCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriptionServiceReferenceNumberQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriptionDeliveryMethodEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriptionOriginCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriptionOverTheCounterIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum prescriptionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum primaryCareProviderIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorAuthorizationApplicabilityEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorAuthorizationComparisonTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorAuthorizationQuestionCodeQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorAuthorizationReasonCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorAuthorizationRequiredQuestionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorAuthorizationResponseTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorAuthorizationStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum priorAuthorizationTypeCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processorDefinedPriorAuthorizationReasonCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processorLocationStateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum processorPaymentClarificationCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productServiceIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productServiceIDQualifierAlternativeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productServiceIDQualifierSourceEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productServiceIDQualifierStepDrugEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productCodeQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productFormularyStatusCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum productTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum professionalServiceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerAcceptAssignmentIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum providerSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum purchaserAddressStateProvinceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum purchaserCountryCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum purchaserGenderCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum purchaserIDAssociatedStateProvinceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum purchaserIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum purchaserRelationshipCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rateUnitofMeasureCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reasonCodeREQSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reasonforServiceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rebateTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rebateTypeDescriptionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rebateVersionReleaseNumberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reconciliationReasonCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reconciliationStatusCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recordIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recordPurposeIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recordStatusCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum recordTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum referenceQualifierGenericDatabasePriorAuthorizationDRUSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum reimbursementQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rejectCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum rejectOverrideCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum requestTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resourceLinkTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum resultofServiceCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routeOfAdministrationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum routeofAdministrationCodeQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum segmentIdentificationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum segmentIdentifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum segmentQualifier1EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum segmentQualifier2EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum segmentQualifier3EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum segmentQualifier4EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum segmentQualifier5EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum segmentQualifier6EEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sellerIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceProviderIDQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceProviderOverrideTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum serviceProviderStateProvinceCodeAddressEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sigFreeTextStringIndicatorSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum siteofAdministrationCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum smokerNonSmokerCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceCodeListEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum sourceofInformationEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum specialPackagingIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stateEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum statusTypecodedEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stepOrderEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum stopIndicatorSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum submissionClarificationCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum submissionNumberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum submitCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum taxExemptIndicatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum telephoneNumberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum therapeuticClassCodeQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum timePeriodBasisCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionCodeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionCountEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transactionResponseStatusEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transferFlagEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transferTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transmissionActionEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transmissionFileTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum transmissionTypeEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum uniqueRecordIdentifierQualifierEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum unitofMeasureEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableFrequencyModifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum variableIntervalModifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vehicleNameCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum vehicleUnitofMeasureCodeQualifierSIGSegmentEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum versionReleaseNumberEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum workersCompensationPropertyAndCasualtyIndicatorEEnum = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ncpdp.uml.ecl.ExternalCodeListPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private ExternalCodeListPackageImpl() {
		super(eNS_URI, ExternalCodeListFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this
	 * model, and for any others upon which it depends.  Simple
	 * dependencies are satisfied by calling this method on all
	 * dependent packages before doing anything else.  This method drives
	 * initialization for interdependent packages directly, in parallel
	 * with this package, itself.
	 * <p>Of this package and its interdependencies, all packages which
	 * have not yet been registered by their URI values are first created
	 * and registered.  The packages are then initialized in two steps:
	 * meta-model objects for all of the packages are created before any
	 * are initialized, since one package's meta-model objects may refer to
	 * those of another.
	 * <p>Invocation of this method will not affect any packages that have
	 * already been initialized.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @generated
	 */
	public static ExternalCodeListPackage init() {
		if (isInited) return (ExternalCodeListPackage)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI);

		// Obtain or create and register package
		ExternalCodeListPackageImpl theExternalCodeListPackage = (ExternalCodeListPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(eNS_URI) instanceof ExternalCodeListPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(eNS_URI) : new ExternalCodeListPackageImpl());

		isInited = true;

		// Load packages
		theExternalCodeListPackage.loadPackage();

		// Fix loaded packages
		theExternalCodeListPackage.fixPackageContents();

		// Mark meta-data to indicate it can't be changed
		theExternalCodeListPackage.freeze();

		return theExternalCodeListPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAccumulatorMonth() {
		if (accumulatorMonthEEnum == null) {
			accumulatorMonthEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(0);
		}
		return accumulatorMonthEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdditionalDocumentationTypeID() {
		if (additionalDocumentationTypeIDEEnum == null) {
			additionalDocumentationTypeIDEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(1);
		}
		return additionalDocumentationTypeIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdditionalMessageInformationContinuity() {
		if (additionalMessageInformationContinuityEEnum == null) {
			additionalMessageInformationContinuityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(2);
		}
		return additionalMessageInformationContinuityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdditionalMessageInformationQualifier() {
		if (additionalMessageInformationQualifierEEnum == null) {
			additionalMessageInformationQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(3);
		}
		return additionalMessageInformationQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAddressQualifier() {
		if (addressQualifierEEnum == null) {
			addressQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(4);
		}
		return addressQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdjudicatorIDQualifier() {
		if (adjudicatorIDQualifierEEnum == null) {
			adjudicatorIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(5);
		}
		return adjudicatorIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdjustmentType() {
		if (adjustmentTypeEEnum == null) {
			adjustmentTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(6);
		}
		return adjustmentTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdministrationTimingCodeQualifierSIGSegment() {
		if (administrationTimingCodeQualifierSIGSegmentEEnum == null) {
			administrationTimingCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(7);
		}
		return administrationTimingCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAdministrativeFeeEffectIndicator() {
		if (administrativeFeeEffectIndicatorEEnum == null) {
			administrativeFeeEffectIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(8);
		}
		return administrativeFeeEffectIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAmountAttributedToProductSelectionQualifier() {
		if (amountAttributedToProductSelectionQualifierEEnum == null) {
			amountAttributedToProductSelectionQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(9);
		}
		return amountAttributedToProductSelectionQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getApprovedMessageCode() {
		if (approvedMessageCodeEEnum == null) {
			approvedMessageCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(10);
		}
		return approvedMessageCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssociatedPrescriptionServiceProviderIDQualifier() {
		if (associatedPrescriptionServiceProviderIDQualifierEEnum == null) {
			associatedPrescriptionServiceProviderIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(11);
		}
		return associatedPrescriptionServiceProviderIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAssociatedPrescriptionServiceReferenceNumberQualifier() {
		if (associatedPrescriptionServiceReferenceNumberQualifierEEnum == null) {
			associatedPrescriptionServiceReferenceNumberQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(12);
		}
		return associatedPrescriptionServiceReferenceNumberQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getAuthorizedRepresentativeStateProvinceAddress() {
		if (authorizedRepresentativeStateProvinceAddressEEnum == null) {
			authorizedRepresentativeStateProvinceAddressEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(13);
		}
		return authorizedRepresentativeStateProvinceAddressEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBaselineQualifier() {
		if (baselineQualifierEEnum == null) {
			baselineQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(14);
		}
		return baselineQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasePriceType() {
		if (basePriceTypeEEnum == null) {
			basePriceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(15);
		}
		return basePriceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasisOfCalculationCoinsurance() {
		if (basisOfCalculationCoinsuranceEEnum == null) {
			basisOfCalculationCoinsuranceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(16);
		}
		return basisOfCalculationCoinsuranceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasisOfCalculationCopay() {
		if (basisOfCalculationCopayEEnum == null) {
			basisOfCalculationCopayEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(17);
		}
		return basisOfCalculationCopayEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasisOfCalculationDispensingFee() {
		if (basisOfCalculationDispensingFeeEEnum == null) {
			basisOfCalculationDispensingFeeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(18);
		}
		return basisOfCalculationDispensingFeeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasisOfCalculationFlatSalesTax() {
		if (basisOfCalculationFlatSalesTaxEEnum == null) {
			basisOfCalculationFlatSalesTaxEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(19);
		}
		return basisOfCalculationFlatSalesTaxEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasisOfCalculationPercentageSalesTax() {
		if (basisOfCalculationPercentageSalesTaxEEnum == null) {
			basisOfCalculationPercentageSalesTaxEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(20);
		}
		return basisOfCalculationPercentageSalesTaxEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasisOfCostDetermination() {
		if (basisOfCostDeterminationEEnum == null) {
			basisOfCostDeterminationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(21);
		}
		return basisOfCostDeterminationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasisOfReimbursementDetermination() {
		if (basisOfReimbursementDeterminationEEnum == null) {
			basisOfReimbursementDeterminationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(22);
		}
		return basisOfReimbursementDeterminationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBasisOfRequest() {
		if (basisOfRequestEEnum == null) {
			basisOfRequestEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(23);
		}
		return basisOfRequestEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitAmountTimePeriod() {
		if (benefitAmountTimePeriodEEnum == null) {
			benefitAmountTimePeriodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(24);
		}
		return benefitAmountTimePeriodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitAmountType() {
		if (benefitAmountTypeEEnum == null) {
			benefitAmountTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(25);
		}
		return benefitAmountTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitStageQualifier() {
		if (benefitStageQualifierEEnum == null) {
			benefitStageQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(26);
		}
		return benefitStageQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBenefitType() {
		if (benefitTypeEEnum == null) {
			benefitTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(27);
		}
		return benefitTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBillingEntityTypeIndicator() {
		if (billingEntityTypeIndicatorEEnum == null) {
			billingEntityTypeIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(28);
		}
		return billingEntityTypeIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBodyMetricQualifierSIGSegment() {
		if (bodyMetricQualifierSIGSegmentEEnum == null) {
			bodyMetricQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(29);
		}
		return bodyMetricQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBrandGenericIndicator() {
		if (brandGenericIndicatorEEnum == null) {
			brandGenericIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(30);
		}
		return brandGenericIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getBrandedGenericCopayConfidential() {
		if (brandedGenericCopayConfidentialEEnum == null) {
			brandedGenericCopayConfidentialEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(31);
		}
		return brandedGenericCopayConfidentialEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCalculatedDoseUnitofMeasureCodeQualifierSIGSegment() {
		if (calculatedDoseUnitofMeasureCodeQualifierSIGSegmentEEnum == null) {
			calculatedDoseUnitofMeasureCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(32);
		}
		return calculatedDoseUnitofMeasureCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCarrierLocationState() {
		if (carrierLocationStateEEnum == null) {
			carrierLocationStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(33);
		}
		return carrierLocationStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeIdentifier() {
		if (changeIdentifierEEnum == null) {
			changeIdentifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(34);
		}
		return changeIdentifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getChangeofPrescriptionStatusFlag() {
		if (changeofPrescriptionStatusFlagEEnum == null) {
			changeofPrescriptionStatusFlagEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(35);
		}
		return changeofPrescriptionStatusFlagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClaimMediaType() {
		if (claimMediaTypeEEnum == null) {
			claimMediaTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(36);
		}
		return claimMediaTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClaimOrigination() {
		if (claimOriginationEEnum == null) {
			claimOriginationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(37);
		}
		return claimOriginationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClientFormularyFlag() {
		if (clientFormularyFlagEEnum == null) {
			clientFormularyFlagEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(38);
		}
		return clientFormularyFlagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClientPricingBasisOfCost() {
		if (clientPricingBasisOfCostEEnum == null) {
			clientPricingBasisOfCostEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(39);
		}
		return clientPricingBasisOfCostEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClinicalInformationQualifier() {
		if (clinicalInformationQualifierEEnum == null) {
			clinicalInformationQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(40);
		}
		return clinicalInformationQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getClinicalSignificanceCode() {
		if (clinicalSignificanceCodeEEnum == null) {
			clinicalSignificanceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(41);
		}
		return clinicalSignificanceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCMSPartDDefinedQualifiedFacility() {
		if (cmsPartDDefinedQualifiedFacilityEEnum == null) {
			cmsPartDDefinedQualifiedFacilityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(42);
		}
		return cmsPartDDefinedQualifiedFacilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCOBPrimaryClaimType() {
		if (cobPrimaryClaimTypeEEnum == null) {
			cobPrimaryClaimTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(43);
		}
		return cobPrimaryClaimTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodeListQualifierDiagnosisCodeQualifierPrimaryDRUSegment() {
		if (codeListQualifierDiagnosisCodeQualifierPrimaryDRUSegmentEEnum == null) {
			codeListQualifierDiagnosisCodeQualifierPrimaryDRUSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(44);
		}
		return codeListQualifierDiagnosisCodeQualifierPrimaryDRUSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodeListQualifierRejectCodeSTSSegment() {
		if (codeListQualifierRejectCodeSTSSegmentEEnum == null) {
			codeListQualifierRejectCodeSTSSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(45);
		}
		return codeListQualifierRejectCodeSTSSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCodeListQualifierResponseCodeRESSegment() {
		if (codeListQualifierResponseCodeRESSegmentEEnum == null) {
			codeListQualifierResponseCodeRESSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(46);
		}
		return codeListQualifierResponseCodeRESSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCommunicationTypeIndicator() {
		if (communicationTypeIndicatorEEnum == null) {
			communicationTypeIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(47);
		}
		return communicationTypeIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompoundCode() {
		if (compoundCodeEEnum == null) {
			compoundCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(48);
		}
		return compoundCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompoundDispensingUnitFormIndicator() {
		if (compoundDispensingUnitFormIndicatorEEnum == null) {
			compoundDispensingUnitFormIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(49);
		}
		return compoundDispensingUnitFormIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompoundDosageFormDescriptionCode() {
		if (compoundDosageFormDescriptionCodeEEnum == null) {
			compoundDosageFormDescriptionCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(50);
		}
		return compoundDosageFormDescriptionCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompoundIndicator() {
		if (compoundIndicatorEEnum == null) {
			compoundIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(51);
		}
		return compoundIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompoundIngredientBasisofCostDetermination() {
		if (compoundIngredientBasisofCostDeterminationEEnum == null) {
			compoundIngredientBasisofCostDeterminationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(52);
		}
		return compoundIngredientBasisofCostDeterminationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompoundProductIDQualifier() {
		if (compoundProductIDQualifierEEnum == null) {
			compoundProductIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(53);
		}
		return compoundProductIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompoundRouteofAdministration() {
		if (compoundRouteofAdministrationEEnum == null) {
			compoundRouteofAdministrationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(54);
		}
		return compoundRouteofAdministrationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCompoundType() {
		if (compoundTypeEEnum == null) {
			compoundTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(55);
		}
		return compoundTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getConditionResponsecodedPatientConsentIndicator() {
		if (conditionResponsecodedPatientConsentIndicatorEEnum == null) {
			conditionResponsecodedPatientConsentIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(56);
		}
		return conditionResponsecodedPatientConsentIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getContractingOrganizationPMOIDQualifier() {
		if (contractingOrganizationPMOIDQualifierEEnum == null) {
			contractingOrganizationPMOIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(57);
		}
		return contractingOrganizationPMOIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCopayCoinsuranceOverrideType() {
		if (copayCoinsuranceOverrideTypeEEnum == null) {
			copayCoinsuranceOverrideTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(58);
		}
		return copayCoinsuranceOverrideTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCopayListType() {
		if (copayListTypeEEnum == null) {
			copayListTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(59);
		}
		return copayListTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCountrySubentityIdentification() {
		if (countrySubentityIdentificationEEnum == null) {
			countrySubentityIdentificationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(60);
		}
		return countrySubentityIdentificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCouponType() {
		if (couponTypeEEnum == null) {
			couponTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(61);
		}
		return couponTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getCoverageListType() {
		if (coverageListTypeEEnum == null) {
			coverageListTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(62);
		}
		return coverageListTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDatabaseIndicator() {
		if (databaseIndicatorEEnum == null) {
			databaseIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(63);
		}
		return databaseIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataLevel() {
		if (dataLevelEEnum == null) {
			dataLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(64);
		}
		return dataLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDataProviderIDQualifier() {
		if (dataProviderIDQualifierEEnum == null) {
			dataProviderIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(65);
		}
		return dataProviderIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDEASchedule() {
		if (deaScheduleEEnum == null) {
			deaScheduleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(66);
		}
		return deaScheduleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDelayReasonCode() {
		if (delayReasonCodeEEnum == null) {
			delayReasonCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(67);
		}
		return delayReasonCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiagnosisCodeQualifier() {
		if (diagnosisCodeQualifierEEnum == null) {
			diagnosisCodeQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(68);
		}
		return diagnosisCodeQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDiscontinueDateQualifier() {
		if (discontinueDateQualifierEEnum == null) {
			discontinueDateQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(69);
		}
		return discontinueDateQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDispenseAsWrittenDAWProductSelectionCode() {
		if (dispenseAsWrittenDAWProductSelectionCodeEEnum == null) {
			dispenseAsWrittenDAWProductSelectionCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(70);
		}
		return dispenseAsWrittenDAWProductSelectionCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDispenseAsWrittenDAWDifference() {
		if (dispenseAsWrittenDAWDifferenceEEnum == null) {
			dispenseAsWrittenDAWDifferenceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(71);
		}
		return dispenseAsWrittenDAWDifferenceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDispensingStatus() {
		if (dispensingStatusEEnum == null) {
			dispensingStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(72);
		}
		return dispensingStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoNotFillProfileFlag() {
		if (doNotFillProfileFlagEEnum == null) {
			doNotFillProfileFlagEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(73);
		}
		return doNotFillProfileFlagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDosageFormIDCode() {
		if (dosageFormIDCodeEEnum == null) {
			dosageFormIDCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(74);
		}
		return dosageFormIDCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoseBasisRangeModifierSIGSegment() {
		if (doseBasisRangeModifierSIGSegmentEEnum == null) {
			doseBasisRangeModifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(75);
		}
		return doseBasisRangeModifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoseCompositeIndicatorSIGSegment() {
		if (doseCompositeIndicatorSIGSegmentEEnum == null) {
			doseCompositeIndicatorSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(76);
		}
		return doseCompositeIndicatorSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoseDeliveryMethodCodeQualifierSIGSegment() {
		if (doseDeliveryMethodCodeQualifierSIGSegmentEEnum == null) {
			doseDeliveryMethodCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(77);
		}
		return doseDeliveryMethodCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoseDeliveryMethodModifierCodeQualifierSIGSegment() {
		if (doseDeliveryMethodModifierCodeQualifierSIGSegmentEEnum == null) {
			doseDeliveryMethodModifierCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(78);
		}
		return doseDeliveryMethodModifierCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoseFormCodeQualifierSIGSegment() {
		if (doseFormCodeQualifierSIGSegmentEEnum == null) {
			doseFormCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(79);
		}
		return doseFormCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDoseRangeModifierSIGSegment() {
		if (doseRangeModifierSIGSegmentEEnum == null) {
			doseRangeModifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(80);
		}
		return doseRangeModifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDosingBasisUnitofMeasureCodeQualifierSIGSegment() {
		if (dosingBasisUnitofMeasureCodeQualifierSIGSegmentEEnum == null) {
			dosingBasisUnitofMeasureCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(81);
		}
		return dosingBasisUnitofMeasureCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrugCoverageStatusCode() {
		if (drugCoverageStatusCodeEEnum == null) {
			drugCoverageStatusCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(82);
		}
		return drugCoverageStatusCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrugQualifierStepDrug() {
		if (drugQualifierStepDrugEEnum == null) {
			drugQualifierStepDrugEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(83);
		}
		return drugQualifierStepDrugEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrugReferenceQualifier() {
		if (drugReferenceQualifierEEnum == null) {
			drugReferenceQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(84);
		}
		return drugReferenceQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrugReferenceQualifierAlternative() {
		if (drugReferenceQualifierAlternativeEEnum == null) {
			drugReferenceQualifierAlternativeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(85);
		}
		return drugReferenceQualifierAlternativeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrugReferenceQualifierSource() {
		if (drugReferenceQualifierSourceEEnum == null) {
			drugReferenceQualifierSourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(86);
		}
		return drugReferenceQualifierSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrugReferenceQualifierStepDrug() {
		if (drugReferenceQualifierStepDrugEEnum == null) {
			drugReferenceQualifierStepDrugEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(87);
		}
		return drugReferenceQualifierStepDrugEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDrugType() {
		if (drugTypeEEnum == null) {
			drugTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(88);
		}
		return drugTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDUEClinicalSignificanceCode() {
		if (dueClinicalSignificanceCodeEEnum == null) {
			dueClinicalSignificanceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(89);
		}
		return dueClinicalSignificanceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDUECoAgentIDQualifier() {
		if (dueCoAgentIDQualifierEEnum == null) {
			dueCoAgentIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(90);
		}
		return dueCoAgentIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDUEProfessionalServiceCode() {
		if (dueProfessionalServiceCodeEEnum == null) {
			dueProfessionalServiceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(91);
		}
		return dueProfessionalServiceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDUEReasonForServiceCode() {
		if (dueReasonForServiceCodeEEnum == null) {
			dueReasonForServiceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(92);
		}
		return dueReasonForServiceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDUEResultOfServiceCode() {
		if (dueResultOfServiceCodeEEnum == null) {
			dueResultOfServiceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(93);
		}
		return dueResultOfServiceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDURPPSLevelOfEffort() {
		if (durppsLevelOfEffortEEnum == null) {
			durppsLevelOfEffortEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(94);
		}
		return durppsLevelOfEffortEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDurationTextCodeQualifierSIGSegment() {
		if (durationTextCodeQualifierSIGSegmentEEnum == null) {
			durationTextCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(95);
		}
		return durationTextCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getDURCoAgentIDQualifier() {
		if (durCoAgentIDQualifierEEnum == null) {
			durCoAgentIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(96);
		}
		return durCoAgentIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEasyOpenCapIndicator() {
		if (easyOpenCapIndicatorEEnum == null) {
			easyOpenCapIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(97);
		}
		return easyOpenCapIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEligibilityPatientRelationshipCode() {
		if (eligibilityPatientRelationshipCodeEEnum == null) {
			eligibilityPatientRelationshipCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(98);
		}
		return eligibilityPatientRelationshipCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEligibilityClarificationCode() {
		if (eligibilityClarificationCodeEEnum == null) {
			eligibilityClarificationCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(99);
		}
		return eligibilityClarificationCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEligibilityCOBIndicator() {
		if (eligibilityCOBIndicatorEEnum == null) {
			eligibilityCOBIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(100);
		}
		return eligibilityCOBIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEligibleCoverageCode() {
		if (eligibleCoverageCodeEEnum == null) {
			eligibleCoverageCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(101);
		}
		return eligibleCoverageCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEligiblePlan() {
		if (eligiblePlanEEnum == null) {
			eligiblePlanEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(102);
		}
		return eligiblePlanEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEmployerStateProvinceAddress() {
		if (employerStateProvinceAddressEEnum == null) {
			employerStateProvinceAddressEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(103);
		}
		return employerStateProvinceAddressEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getEntityState() {
		if (entityStateEEnum == null) {
			entityStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(104);
		}
		return entityStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFacilityStateProvinceAddress() {
		if (facilityStateProvinceAddressEEnum == null) {
			facilityStateProvinceAddressEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(105);
		}
		return facilityStateProvinceAddressEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFDADrugEfficacyCode() {
		if (fdaDrugEfficacyCodeEEnum == null) {
			fdaDrugEfficacyCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(106);
		}
		return fdaDrugEfficacyCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFederalDEASchedule() {
		if (federalDEAScheduleEEnum == null) {
			federalDEAScheduleEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(107);
		}
		return federalDEAScheduleEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFederalUpperLimitIndicator() {
		if (federalUpperLimitIndicatorEEnum == null) {
			federalUpperLimitIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(108);
		}
		return federalUpperLimitIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFFPrescriberIDQualifier() {
		if (ffPrescriberIDQualifierEEnum == null) {
			ffPrescriberIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(109);
		}
		return ffPrescriberIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFileStructureType() {
		if (fileStructureTypeEEnum == null) {
			fileStructureTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(110);
		}
		return fileStructureTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFileType() {
		if (fileTypeEEnum == null) {
			fileTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(111);
		}
		return fileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFillNumber() {
		if (fillNumberEEnum == null) {
			fillNumberEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(112);
		}
		return fillNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFillNumberCalculated() {
		if (fillNumberCalculatedEEnum == null) {
			fillNumberCalculatedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(113);
		}
		return fillNumberCalculatedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFinalCompoundPharmaceuticalDosageForm() {
		if (finalCompoundPharmaceuticalDosageFormEEnum == null) {
			finalCompoundPharmaceuticalDosageFormEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(114);
		}
		return finalCompoundPharmaceuticalDosageFormEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFirstCopayTerm() {
		if (firstCopayTermEEnum == null) {
			firstCopayTermEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(115);
		}
		return firstCopayTermEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormularyBenefitDesignType() {
		if (formularyBenefitDesignTypeEEnum == null) {
			formularyBenefitDesignTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(116);
		}
		return formularyBenefitDesignTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormularyNonFormularyCoPayConfidential() {
		if (formularyNonFormularyCoPayConfidentialEEnum == null) {
			formularyNonFormularyCoPayConfidentialEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(117);
		}
		return formularyNonFormularyCoPayConfidentialEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormularyProductCoPayConfidential() {
		if (formularyProductCoPayConfidentialEEnum == null) {
			formularyProductCoPayConfidentialEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(118);
		}
		return formularyProductCoPayConfidentialEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFormularyStatus() {
		if (formularyStatusEEnum == null) {
			formularyStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(119);
		}
		return formularyStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getFrequencyUnitsCodeQualifierSIGSegment() {
		if (frequencyUnitsCodeQualifierSIGSegmentEEnum == null) {
			frequencyUnitsCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(120);
		}
		return frequencyUnitsCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenderCode() {
		if (genderCodeEEnum == null) {
			genderCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(121);
		}
		return genderCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenericAvailable() {
		if (genericAvailableEEnum == null) {
			genericAvailableEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(122);
		}
		return genericAvailableEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getGenericEquivalentProductIDQualifier() {
		if (genericEquivalentProductIDQualifierEEnum == null) {
			genericEquivalentProductIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(123);
		}
		return genericEquivalentProductIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHeaderResponseStatus() {
		if (headerResponseStatusEEnum == null) {
			headerResponseStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(124);
		}
		return headerResponseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getHelpDeskPhoneNumberQualifier() {
		if (helpDeskPhoneNumberQualifierEEnum == null) {
			helpDeskPhoneNumberQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(125);
		}
		return helpDeskPhoneNumberQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInactivePrescriptionIndicator() {
		if (inactivePrescriptionIndicatorEEnum == null) {
			inactivePrescriptionIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(126);
		}
		return inactivePrescriptionIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndicationPrecursorCodeQualifierSIGSegment() {
		if (indicationPrecursorCodeQualifierSIGSegmentEEnum == null) {
			indicationPrecursorCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(127);
		}
		return indicationPrecursorCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndicationTextCodeQualifierSIGSegment() {
		if (indicationTextCodeQualifierSIGSegmentEEnum == null) {
			indicationTextCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(128);
		}
		return indicationTextCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndicationValueUnitofMeasureCodeQualifierSIGSegment() {
		if (indicationValueUnitofMeasureCodeQualifierSIGSegmentEEnum == null) {
			indicationValueUnitofMeasureCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(129);
		}
		return indicationValueUnitofMeasureCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndicationVariableModifierSIGSegment() {
		if (indicationVariableModifierSIGSegmentEEnum == null) {
			indicationVariableModifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(130);
		}
		return indicationVariableModifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIndividualRelationshipcoded() {
		if (individualRelationshipcodedEEnum == null) {
			individualRelationshipcodedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(131);
		}
		return individualRelationshipcodedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInNetworkIndicator() {
		if (inNetworkIndicatorEEnum == null) {
			inNetworkIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(132);
		}
		return inNetworkIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntermediaryAuthorizationTypeID() {
		if (intermediaryAuthorizationTypeIDEEnum == null) {
			intermediaryAuthorizationTypeIDEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(133);
		}
		return intermediaryAuthorizationTypeIDEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getIntervalUnitsCodeQualifierSIGSegment() {
		if (intervalUnitsCodeQualifierSIGSegmentEEnum == null) {
			intervalUnitsCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(134);
		}
		return intervalUnitsCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvoiceType1() {
		if (invoiceType1EEnum == null) {
			invoiceType1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(135);
		}
		return invoiceType1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvoiceType2() {
		if (invoiceType2EEnum == null) {
			invoiceType2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(136);
		}
		return invoiceType2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvoiceType3() {
		if (invoiceType3EEnum == null) {
			invoiceType3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(137);
		}
		return invoiceType3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvoiceType4() {
		if (invoiceType4EEnum == null) {
			invoiceType4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(138);
		}
		return invoiceType4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getInvoiceType5() {
		if (invoiceType5EEnum == null) {
			invoiceType5EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(139);
		}
		return invoiceType5EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getItemFormCode() {
		if (itemFormCodeEEnum == null) {
			itemFormCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(140);
		}
		return itemFormCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getItemStrengthCode() {
		if (itemStrengthCodeEEnum == null) {
			itemStrengthCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(141);
		}
		return itemStrengthCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getJurisdictionalState() {
		if (jurisdictionalStateEEnum == null) {
			jurisdictionalStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(142);
		}
		return jurisdictionalStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLengthofNeedQualifier() {
		if (lengthofNeedQualifierEEnum == null) {
			lengthofNeedQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(143);
		}
		return lengthofNeedQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLevelofService() {
		if (levelofServiceEEnum == null) {
			levelofServiceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(144);
		}
		return levelofServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getListAction() {
		if (listActionEEnum == null) {
			listActionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(145);
		}
		return listActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getLoadStatus() {
		if (loadStatusEEnum == null) {
			loadStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(146);
		}
		return loadStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMACReducedIndicator() {
		if (macReducedIndicatorEEnum == null) {
			macReducedIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(147);
		}
		return macReducedIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMailOrderIDQualifier() {
		if (mailOrderIDQualifierEEnum == null) {
			mailOrderIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(148);
		}
		return mailOrderIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaintenanceDrugIndicator() {
		if (maintenanceDrugIndicatorEEnum == null) {
			maintenanceDrugIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(149);
		}
		return maintenanceDrugIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getManufacturerPICOIDQualifier() {
		if (manufacturerPICOIDQualifierEEnum == null) {
			manufacturerPICOIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(150);
		}
		return manufacturerPICOIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaximumAgeQualifier() {
		if (maximumAgeQualifierEEnum == null) {
			maximumAgeQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(151);
		}
		return maximumAgeQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaximumAmountQualifier() {
		if (maximumAmountQualifierEEnum == null) {
			maximumAmountQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(152);
		}
		return maximumAmountQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaximumAmountTimePeriod() {
		if (maximumAmountTimePeriodEEnum == null) {
			maximumAmountTimePeriodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(153);
		}
		return maximumAmountTimePeriodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaximumDoseRestrictionCodeQualifierSIGSegment() {
		if (maximumDoseRestrictionCodeQualifierSIGSegmentEEnum == null) {
			maximumDoseRestrictionCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(154);
		}
		return maximumDoseRestrictionCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaximumDoseRestrictionVariableDurationModifierSIGSegment() {
		if (maximumDoseRestrictionVariableDurationModifierSIGSegmentEEnum == null) {
			maximumDoseRestrictionVariableDurationModifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(155);
		}
		return maximumDoseRestrictionVariableDurationModifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMaximumDoseRestrictionVariableUnitsCodeQualifierSIGSegment() {
		if (maximumDoseRestrictionVariableUnitsCodeQualifierSIGSegmentEEnum == null) {
			maximumDoseRestrictionVariableUnitsCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(156);
		}
		return maximumDoseRestrictionVariableUnitsCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasurementDataQualifier() {
		if (measurementDataQualifierEEnum == null) {
			measurementDataQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(157);
		}
		return measurementDataQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasurementDimension() {
		if (measurementDimensionEEnum == null) {
			measurementDimensionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(158);
		}
		return measurementDimensionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasurementUnit() {
		if (measurementUnitEEnum == null) {
			measurementUnitEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(159);
		}
		return measurementUnitEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMeasurementUnitCode() {
		if (measurementUnitCodeEEnum == null) {
			measurementUnitCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(160);
		}
		return measurementUnitCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicaidIndicator() {
		if (medicaidIndicatorEEnum == null) {
			medicaidIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(161);
		}
		return medicaidIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicarePartDCoverageCode() {
		if (medicarePartDCoverageCodeEEnum == null) {
			medicarePartDCoverageCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(162);
		}
		return medicarePartDCoverageCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicarePlanCode() {
		if (medicarePlanCodeEEnum == null) {
			medicarePlanCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(163);
		}
		return medicarePlanCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicareRecoveryDispensingIndicator() {
		if (medicareRecoveryDispensingIndicatorEEnum == null) {
			medicareRecoveryDispensingIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(164);
		}
		return medicareRecoveryDispensingIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMedicareRecoveryIndicator() {
		if (medicareRecoveryIndicatorEEnum == null) {
			medicareRecoveryIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(165);
		}
		return medicareRecoveryIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMembershipCountQualifier() {
		if (membershipCountQualifierEEnum == null) {
			membershipCountQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(166);
		}
		return membershipCountQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMembershipPeriodQualifier() {
		if (membershipPeriodQualifierEEnum == null) {
			membershipPeriodQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(167);
		}
		return membershipPeriodQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMembershipTypeQualifier() {
		if (membershipTypeQualifierEEnum == null) {
			membershipTypeQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(168);
		}
		return membershipTypeQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMemberSubmittedClaimProgramCode() {
		if (memberSubmittedClaimProgramCodeEEnum == null) {
			memberSubmittedClaimProgramCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(169);
		}
		return memberSubmittedClaimProgramCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMessageFunctioncoded() {
		if (messageFunctioncodedEEnum == null) {
			messageFunctioncodedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(170);
		}
		return messageFunctioncodedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMinimumAgeQualifier() {
		if (minimumAgeQualifierEEnum == null) {
			minimumAgeQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(171);
		}
		return minimumAgeQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultipleAdministrationTimingModifierSIGSegment() {
		if (multipleAdministrationTimingModifierSIGSegmentEEnum == null) {
			multipleAdministrationTimingModifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(172);
		}
		return multipleAdministrationTimingModifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultipleRouteofAdministrationModifier() {
		if (multipleRouteofAdministrationModifierEEnum == null) {
			multipleRouteofAdministrationModifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(173);
		}
		return multipleRouteofAdministrationModifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultipleSigModifierSIGSegment() {
		if (multipleSigModifierSIGSegmentEEnum == null) {
			multipleSigModifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(174);
		}
		return multipleSigModifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultipleSiteofAdministrationTimingModifierSIGSegment() {
		if (multipleSiteofAdministrationTimingModifierSIGSegmentEEnum == null) {
			multipleSiteofAdministrationTimingModifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(175);
		}
		return multipleSiteofAdministrationTimingModifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getMultipleVehicleModifierSIGSegment() {
		if (multipleVehicleModifierSIGSegmentEEnum == null) {
			multipleVehicleModifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(176);
		}
		return multipleVehicleModifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNoKnownAllergies() {
		if (noKnownAllergiesEEnum == null) {
			noKnownAllergiesEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(177);
		}
		return noKnownAllergiesEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNonListedBrandOverTheCounterFormularyStatus() {
		if (nonListedBrandOverTheCounterFormularyStatusEEnum == null) {
			nonListedBrandOverTheCounterFormularyStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(178);
		}
		return nonListedBrandOverTheCounterFormularyStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNonListedGenericOverTheCounterFormularyStatus() {
		if (nonListedGenericOverTheCounterFormularyStatusEEnum == null) {
			nonListedGenericOverTheCounterFormularyStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(179);
		}
		return nonListedGenericOverTheCounterFormularyStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNonListedPrescriptionBrandFormularyStatus() {
		if (nonListedPrescriptionBrandFormularyStatusEEnum == null) {
			nonListedPrescriptionBrandFormularyStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(180);
		}
		return nonListedPrescriptionBrandFormularyStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNonListedPrescriptionGenericFormularyStatus() {
		if (nonListedPrescriptionGenericFormularyStatusEEnum == null) {
			nonListedPrescriptionGenericFormularyStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(181);
		}
		return nonListedPrescriptionGenericFormularyStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNonListedSuppliesFormularyStatus() {
		if (nonListedSuppliesFormularyStatusEEnum == null) {
			nonListedSuppliesFormularyStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(182);
		}
		return nonListedSuppliesFormularyStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNonPOSClaimOverrideCode() {
		if (nonPOSClaimOverrideCodeEEnum == null) {
			nonPOSClaimOverrideCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(183);
		}
		return nonPOSClaimOverrideCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumberofRefillsAuthorized() {
		if (numberofRefillsAuthorizedEEnum == null) {
			numberofRefillsAuthorizedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(184);
		}
		return numberofRefillsAuthorizedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getNumeratorIndicator() {
		if (numeratorIndicatorEEnum == null) {
			numeratorIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(185);
		}
		return numeratorIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOriginallyPrescribedProductServiceIDQualifier() {
		if (originallyPrescribedProductServiceIDQualifierEEnum == null) {
			originallyPrescribedProductServiceIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(186);
		}
		return originallyPrescribedProductServiceIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOtherAmountClaimedSubmittedQualifier() {
		if (otherAmountClaimedSubmittedQualifierEEnum == null) {
			otherAmountClaimedSubmittedQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(187);
		}
		return otherAmountClaimedSubmittedQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOtherAmountPaidQualifier() {
		if (otherAmountPaidQualifierEEnum == null) {
			otherAmountPaidQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(188);
		}
		return otherAmountPaidQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOtherCoverageCode() {
		if (otherCoverageCodeEEnum == null) {
			otherCoverageCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(189);
		}
		return otherCoverageCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOtherPayerAmountPaidQualifier() {
		if (otherPayerAmountPaidQualifierEEnum == null) {
			otherPayerAmountPaidQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(190);
		}
		return otherPayerAmountPaidQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOtherPayerCoverageType() {
		if (otherPayerCoverageTypeEEnum == null) {
			otherPayerCoverageTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(191);
		}
		return otherPayerCoverageTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOtherPayerIDQualifier() {
		if (otherPayerIDQualifierEEnum == null) {
			otherPayerIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(192);
		}
		return otherPayerIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOtherPayerPatientRelationshipCode() {
		if (otherPayerPatientRelationshipCodeEEnum == null) {
			otherPayerPatientRelationshipCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(193);
		}
		return otherPayerPatientRelationshipCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOtherPayerPatientResponsibilityAmountQualifier() {
		if (otherPayerPatientResponsibilityAmountQualifierEEnum == null) {
			otherPayerPatientResponsibilityAmountQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(194);
		}
		return otherPayerPatientResponsibilityAmountQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOtherPharmacyIndicator() {
		if (otherPharmacyIndicatorEEnum == null) {
			otherPharmacyIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(195);
		}
		return otherPharmacyIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getOtherPrescriberIndicator() {
		if (otherPrescriberIndicatorEEnum == null) {
			otherPrescriberIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(196);
		}
		return otherPrescriberIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientAssignmentIndicatorDirectMemberReimbursementIndicator() {
		if (patientAssignmentIndicatorDirectMemberReimbursementIndicatorEEnum == null) {
			patientAssignmentIndicatorDirectMemberReimbursementIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(197);
		}
		return patientAssignmentIndicatorDirectMemberReimbursementIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientGenderCode() {
		if (patientGenderCodeEEnum == null) {
			patientGenderCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(198);
		}
		return patientGenderCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientIDAssociatedStateProvinceAddress() {
		if (patientIDAssociatedStateProvinceAddressEEnum == null) {
			patientIDAssociatedStateProvinceAddressEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(199);
		}
		return patientIDAssociatedStateProvinceAddressEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientIDQualifier() {
		if (patientIDQualifierEEnum == null) {
			patientIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(200);
		}
		return patientIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientLocation() {
		if (patientLocationEEnum == null) {
			patientLocationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(201);
		}
		return patientLocationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientRelationshipCode() {
		if (patientRelationshipCodeEEnum == null) {
			patientRelationshipCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(202);
		}
		return patientRelationshipCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientResidence() {
		if (patientResidenceEEnum == null) {
			patientResidenceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(203);
		}
		return patientResidenceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPatientStateProvinceAddress() {
		if (patientStateProvinceAddressEEnum == null) {
			patientStateProvinceAddressEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(204);
		}
		return patientStateProvinceAddressEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPayerIDQualifier() {
		if (payerIDQualifierEEnum == null) {
			payerIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(205);
		}
		return payerIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPayrollClass() {
		if (payrollClassEEnum == null) {
			payrollClassEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(206);
		}
		return payrollClassEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPayToQualifier() {
		if (payToQualifierEEnum == null) {
			payToQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(207);
		}
		return payToQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPayToStateProvinceAddress() {
		if (payToStateProvinceAddressEEnum == null) {
			payToStateProvinceAddressEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(208);
		}
		return payToStateProvinceAddressEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPercentageSalesTaxBasisPaid() {
		if (percentageSalesTaxBasisPaidEEnum == null) {
			percentageSalesTaxBasisPaidEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(209);
		}
		return percentageSalesTaxBasisPaidEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPercentageSalesTaxBasisSubmitted() {
		if (percentageSalesTaxBasisSubmittedEEnum == null) {
			percentageSalesTaxBasisSubmittedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(210);
		}
		return percentageSalesTaxBasisSubmittedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPerformanceQualifier() {
		if (performanceQualifierEEnum == null) {
			performanceQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(211);
		}
		return performanceQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPharmacyClassCodeQualifier() {
		if (pharmacyClassCodeQualifierEEnum == null) {
			pharmacyClassCodeQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(212);
		}
		return pharmacyClassCodeQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPharmacyDispenserTypeQualifier() {
		if (pharmacyDispenserTypeQualifierEEnum == null) {
			pharmacyDispenserTypeQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(213);
		}
		return pharmacyDispenserTypeQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPharmacyIDQualifier() {
		if (pharmacyIDQualifierEEnum == null) {
			pharmacyIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(214);
		}
		return pharmacyIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPharmacyLocationState() {
		if (pharmacyLocationStateEEnum == null) {
			pharmacyLocationStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(215);
		}
		return pharmacyLocationStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPharmacyServiceType() {
		if (pharmacyServiceTypeEEnum == null) {
			pharmacyServiceTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(216);
		}
		return pharmacyServiceTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPharmacyType() {
		if (pharmacyTypeEEnum == null) {
			pharmacyTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(217);
		}
		return pharmacyTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlaceofService() {
		if (placeofServiceEEnum == null) {
			placeofServiceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(218);
		}
		return placeofServiceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanAffiliationParentPlanIDQualifier() {
		if (planAffiliationParentPlanIDQualifierEEnum == null) {
			planAffiliationParentPlanIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(219);
		}
		return planAffiliationParentPlanIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanCutbackReasonCode() {
		if (planCutbackReasonCodeEEnum == null) {
			planCutbackReasonCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(220);
		}
		return planCutbackReasonCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanDegreeManaged() {
		if (planDegreeManagedEEnum == null) {
			planDegreeManagedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(221);
		}
		return planDegreeManagedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanIDQualifier() {
		if (planIDQualifierEEnum == null) {
			planIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(222);
		}
		return planIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPlanType() {
		if (planTypeEEnum == null) {
			planTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(223);
		}
		return planTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPotencyUnitCode() {
		if (potencyUnitCodeEEnum == null) {
			potencyUnitCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(224);
		}
		return potencyUnitCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPreferenceLevel() {
		if (preferenceLevelEEnum == null) {
			preferenceLevelEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(225);
		}
		return preferenceLevelEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPreferredProductIDQualifier() {
		if (preferredProductIDQualifierEEnum == null) {
			preferredProductIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(226);
		}
		return preferredProductIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPregnancyIndicator() {
		if (pregnancyIndicatorEEnum == null) {
			pregnancyIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(227);
		}
		return pregnancyIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriberAlternateIDAssociatedStateProvinceAddress() {
		if (prescriberAlternateIDAssociatedStateProvinceAddressEEnum == null) {
			prescriberAlternateIDAssociatedStateProvinceAddressEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(228);
		}
		return prescriberAlternateIDAssociatedStateProvinceAddressEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriberAlternateIDQualifier() {
		if (prescriberAlternateIDQualifierEEnum == null) {
			prescriberAlternateIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(229);
		}
		return prescriberAlternateIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriberCertificationStatus() {
		if (prescriberCertificationStatusEEnum == null) {
			prescriberCertificationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(230);
		}
		return prescriberCertificationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriberIDAssociatedStateProvinceAddress() {
		if (prescriberIDAssociatedStateProvinceAddressEEnum == null) {
			prescriberIDAssociatedStateProvinceAddressEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(231);
		}
		return prescriberIDAssociatedStateProvinceAddressEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriberIDQualifier() {
		if (prescriberIDQualifierEEnum == null) {
			prescriberIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(232);
		}
		return prescriberIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriberOverrideType() {
		if (prescriberOverrideTypeEEnum == null) {
			prescriberOverrideTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(233);
		}
		return prescriberOverrideTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriberSpecialty() {
		if (prescriberSpecialtyEEnum == null) {
			prescriberSpecialtyEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(234);
		}
		return prescriberSpecialtyEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriberStateProvinceAddress() {
		if (prescriberStateProvinceAddressEEnum == null) {
			prescriberStateProvinceAddressEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(235);
		}
		return prescriberStateProvinceAddressEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriberTaxonomyCode() {
		if (prescriberTaxonomyCodeEEnum == null) {
			prescriberTaxonomyCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(236);
		}
		return prescriberTaxonomyCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriptionServiceReferenceNumberQualifier() {
		if (prescriptionServiceReferenceNumberQualifierEEnum == null) {
			prescriptionServiceReferenceNumberQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(237);
		}
		return prescriptionServiceReferenceNumberQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriptionDeliveryMethod() {
		if (prescriptionDeliveryMethodEEnum == null) {
			prescriptionDeliveryMethodEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(238);
		}
		return prescriptionDeliveryMethodEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriptionOriginCode() {
		if (prescriptionOriginCodeEEnum == null) {
			prescriptionOriginCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(239);
		}
		return prescriptionOriginCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriptionOverTheCounterIndicator() {
		if (prescriptionOverTheCounterIndicatorEEnum == null) {
			prescriptionOverTheCounterIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(240);
		}
		return prescriptionOverTheCounterIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrescriptionType() {
		if (prescriptionTypeEEnum == null) {
			prescriptionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(241);
		}
		return prescriptionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPrimaryCareProviderIDQualifier() {
		if (primaryCareProviderIDQualifierEEnum == null) {
			primaryCareProviderIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(242);
		}
		return primaryCareProviderIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorAuthorizationApplicability() {
		if (priorAuthorizationApplicabilityEEnum == null) {
			priorAuthorizationApplicabilityEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(243);
		}
		return priorAuthorizationApplicabilityEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorAuthorizationComparisonType() {
		if (priorAuthorizationComparisonTypeEEnum == null) {
			priorAuthorizationComparisonTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(244);
		}
		return priorAuthorizationComparisonTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorAuthorizationQuestionCodeQualifier() {
		if (priorAuthorizationQuestionCodeQualifierEEnum == null) {
			priorAuthorizationQuestionCodeQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(245);
		}
		return priorAuthorizationQuestionCodeQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorAuthorizationReasonCode() {
		if (priorAuthorizationReasonCodeEEnum == null) {
			priorAuthorizationReasonCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(246);
		}
		return priorAuthorizationReasonCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorAuthorizationRequiredQuestion() {
		if (priorAuthorizationRequiredQuestionEEnum == null) {
			priorAuthorizationRequiredQuestionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(247);
		}
		return priorAuthorizationRequiredQuestionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorAuthorizationResponseType() {
		if (priorAuthorizationResponseTypeEEnum == null) {
			priorAuthorizationResponseTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(248);
		}
		return priorAuthorizationResponseTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorAuthorizationStatus() {
		if (priorAuthorizationStatusEEnum == null) {
			priorAuthorizationStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(249);
		}
		return priorAuthorizationStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPriorAuthorizationTypeCode() {
		if (priorAuthorizationTypeCodeEEnum == null) {
			priorAuthorizationTypeCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(250);
		}
		return priorAuthorizationTypeCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessorDefinedPriorAuthorizationReasonCode() {
		if (processorDefinedPriorAuthorizationReasonCodeEEnum == null) {
			processorDefinedPriorAuthorizationReasonCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(251);
		}
		return processorDefinedPriorAuthorizationReasonCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessorLocationState() {
		if (processorLocationStateEEnum == null) {
			processorLocationStateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(252);
		}
		return processorLocationStateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProcessorPaymentClarificationCode() {
		if (processorPaymentClarificationCodeEEnum == null) {
			processorPaymentClarificationCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(253);
		}
		return processorPaymentClarificationCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductServiceIDQualifier() {
		if (productServiceIDQualifierEEnum == null) {
			productServiceIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(254);
		}
		return productServiceIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductServiceIDQualifierAlternative() {
		if (productServiceIDQualifierAlternativeEEnum == null) {
			productServiceIDQualifierAlternativeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(255);
		}
		return productServiceIDQualifierAlternativeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductServiceIDQualifierSource() {
		if (productServiceIDQualifierSourceEEnum == null) {
			productServiceIDQualifierSourceEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(256);
		}
		return productServiceIDQualifierSourceEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductServiceIDQualifierStepDrug() {
		if (productServiceIDQualifierStepDrugEEnum == null) {
			productServiceIDQualifierStepDrugEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(257);
		}
		return productServiceIDQualifierStepDrugEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductCodeQualifier() {
		if (productCodeQualifierEEnum == null) {
			productCodeQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(258);
		}
		return productCodeQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductFormularyStatusCode() {
		if (productFormularyStatusCodeEEnum == null) {
			productFormularyStatusCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(259);
		}
		return productFormularyStatusCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProductType() {
		if (productTypeEEnum == null) {
			productTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(260);
		}
		return productTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProfessionalServiceCode() {
		if (professionalServiceCodeEEnum == null) {
			professionalServiceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(261);
		}
		return professionalServiceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProviderAcceptAssignmentIndicator() {
		if (providerAcceptAssignmentIndicatorEEnum == null) {
			providerAcceptAssignmentIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(262);
		}
		return providerAcceptAssignmentIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProviderIDQualifier() {
		if (providerIDQualifierEEnum == null) {
			providerIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(263);
		}
		return providerIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getProviderSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222() {
		if (providerSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222EEnum == null) {
			providerSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(264);
		}
		return providerSpecialtycodereplacing4707ProviderSpecialtycodedX12DE1222EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPurchaserAddressStateProvinceCode() {
		if (purchaserAddressStateProvinceCodeEEnum == null) {
			purchaserAddressStateProvinceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(265);
		}
		return purchaserAddressStateProvinceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPurchaserCountryCode() {
		if (purchaserCountryCodeEEnum == null) {
			purchaserCountryCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(266);
		}
		return purchaserCountryCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPurchaserGenderCode() {
		if (purchaserGenderCodeEEnum == null) {
			purchaserGenderCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(267);
		}
		return purchaserGenderCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPurchaserIDAssociatedStateProvinceCode() {
		if (purchaserIDAssociatedStateProvinceCodeEEnum == null) {
			purchaserIDAssociatedStateProvinceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(268);
		}
		return purchaserIDAssociatedStateProvinceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPurchaserIDQualifier() {
		if (purchaserIDQualifierEEnum == null) {
			purchaserIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(269);
		}
		return purchaserIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPurchaserRelationshipCode() {
		if (purchaserRelationshipCodeEEnum == null) {
			purchaserRelationshipCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(270);
		}
		return purchaserRelationshipCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRateUnitofMeasureCodeQualifierSIGSegment() {
		if (rateUnitofMeasureCodeQualifierSIGSegmentEEnum == null) {
			rateUnitofMeasureCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(271);
		}
		return rateUnitofMeasureCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReasonCodeREQSegment() {
		if (reasonCodeREQSegmentEEnum == null) {
			reasonCodeREQSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(272);
		}
		return reasonCodeREQSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReasonforServiceCode() {
		if (reasonforServiceCodeEEnum == null) {
			reasonforServiceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(273);
		}
		return reasonforServiceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRebateType() {
		if (rebateTypeEEnum == null) {
			rebateTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(274);
		}
		return rebateTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRebateTypeDescription() {
		if (rebateTypeDescriptionEEnum == null) {
			rebateTypeDescriptionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(275);
		}
		return rebateTypeDescriptionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRebateVersionReleaseNumber() {
		if (rebateVersionReleaseNumberEEnum == null) {
			rebateVersionReleaseNumberEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(276);
		}
		return rebateVersionReleaseNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReconciliationReasonCode() {
		if (reconciliationReasonCodeEEnum == null) {
			reconciliationReasonCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(277);
		}
		return reconciliationReasonCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReconciliationStatusCode() {
		if (reconciliationStatusCodeEEnum == null) {
			reconciliationStatusCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(278);
		}
		return reconciliationStatusCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecordIndicator() {
		if (recordIndicatorEEnum == null) {
			recordIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(279);
		}
		return recordIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecordPurposeIndicator() {
		if (recordPurposeIndicatorEEnum == null) {
			recordPurposeIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(280);
		}
		return recordPurposeIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecordStatusCode() {
		if (recordStatusCodeEEnum == null) {
			recordStatusCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(281);
		}
		return recordStatusCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRecordType() {
		if (recordTypeEEnum == null) {
			recordTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(282);
		}
		return recordTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReferenceQualifierGenericDatabasePriorAuthorizationDRUSegment() {
		if (referenceQualifierGenericDatabasePriorAuthorizationDRUSegmentEEnum == null) {
			referenceQualifierGenericDatabasePriorAuthorizationDRUSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(283);
		}
		return referenceQualifierGenericDatabasePriorAuthorizationDRUSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getReimbursementQualifier() {
		if (reimbursementQualifierEEnum == null) {
			reimbursementQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(284);
		}
		return reimbursementQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRejectCode() {
		if (rejectCodeEEnum == null) {
			rejectCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(285);
		}
		return rejectCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRejectOverrideCode() {
		if (rejectOverrideCodeEEnum == null) {
			rejectOverrideCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(286);
		}
		return rejectOverrideCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequestStatus() {
		if (requestStatusEEnum == null) {
			requestStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(287);
		}
		return requestStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRequestType() {
		if (requestTypeEEnum == null) {
			requestTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(288);
		}
		return requestTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResourceLinkType() {
		if (resourceLinkTypeEEnum == null) {
			resourceLinkTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(289);
		}
		return resourceLinkTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getResultofServiceCode() {
		if (resultofServiceCodeEEnum == null) {
			resultofServiceCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(290);
		}
		return resultofServiceCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRouteOfAdministration() {
		if (routeOfAdministrationEEnum == null) {
			routeOfAdministrationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(291);
		}
		return routeOfAdministrationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getRouteofAdministrationCodeQualifier() {
		if (routeofAdministrationCodeQualifierEEnum == null) {
			routeofAdministrationCodeQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(292);
		}
		return routeofAdministrationCodeQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSegmentIdentification() {
		if (segmentIdentificationEEnum == null) {
			segmentIdentificationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(293);
		}
		return segmentIdentificationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSegmentIdentifier() {
		if (segmentIdentifierEEnum == null) {
			segmentIdentifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(294);
		}
		return segmentIdentifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSegmentQualifier1() {
		if (segmentQualifier1EEnum == null) {
			segmentQualifier1EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(295);
		}
		return segmentQualifier1EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSegmentQualifier2() {
		if (segmentQualifier2EEnum == null) {
			segmentQualifier2EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(296);
		}
		return segmentQualifier2EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSegmentQualifier3() {
		if (segmentQualifier3EEnum == null) {
			segmentQualifier3EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(297);
		}
		return segmentQualifier3EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSegmentQualifier4() {
		if (segmentQualifier4EEnum == null) {
			segmentQualifier4EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(298);
		}
		return segmentQualifier4EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSegmentQualifier5() {
		if (segmentQualifier5EEnum == null) {
			segmentQualifier5EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(299);
		}
		return segmentQualifier5EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSegmentQualifier6() {
		if (segmentQualifier6EEnum == null) {
			segmentQualifier6EEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(300);
		}
		return segmentQualifier6EEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSellerIDQualifier() {
		if (sellerIDQualifierEEnum == null) {
			sellerIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(301);
		}
		return sellerIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceProviderIDQualifier() {
		if (serviceProviderIDQualifierEEnum == null) {
			serviceProviderIDQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(302);
		}
		return serviceProviderIDQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceProviderOverrideType() {
		if (serviceProviderOverrideTypeEEnum == null) {
			serviceProviderOverrideTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(303);
		}
		return serviceProviderOverrideTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getServiceProviderStateProvinceCodeAddress() {
		if (serviceProviderStateProvinceCodeAddressEEnum == null) {
			serviceProviderStateProvinceCodeAddressEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(304);
		}
		return serviceProviderStateProvinceCodeAddressEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSigFreeTextStringIndicatorSIGSegment() {
		if (sigFreeTextStringIndicatorSIGSegmentEEnum == null) {
			sigFreeTextStringIndicatorSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(305);
		}
		return sigFreeTextStringIndicatorSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSiteofAdministrationCodeQualifierSIGSegment() {
		if (siteofAdministrationCodeQualifierSIGSegmentEEnum == null) {
			siteofAdministrationCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(306);
		}
		return siteofAdministrationCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSmokerNonSmokerCode() {
		if (smokerNonSmokerCodeEEnum == null) {
			smokerNonSmokerCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(307);
		}
		return smokerNonSmokerCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceCodeList() {
		if (sourceCodeListEEnum == null) {
			sourceCodeListEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(308);
		}
		return sourceCodeListEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSourceofInformation() {
		if (sourceofInformationEEnum == null) {
			sourceofInformationEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(309);
		}
		return sourceofInformationEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSpecialPackagingIndicator() {
		if (specialPackagingIndicatorEEnum == null) {
			specialPackagingIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(310);
		}
		return specialPackagingIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getState() {
		if (stateEEnum == null) {
			stateEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(311);
		}
		return stateEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStatusTypecoded() {
		if (statusTypecodedEEnum == null) {
			statusTypecodedEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(312);
		}
		return statusTypecodedEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStepOrder() {
		if (stepOrderEEnum == null) {
			stepOrderEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(313);
		}
		return stepOrderEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getStopIndicatorSIGSegment() {
		if (stopIndicatorSIGSegmentEEnum == null) {
			stopIndicatorSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(314);
		}
		return stopIndicatorSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubmissionClarificationCode() {
		if (submissionClarificationCodeEEnum == null) {
			submissionClarificationCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(315);
		}
		return submissionClarificationCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubmissionNumber() {
		if (submissionNumberEEnum == null) {
			submissionNumberEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(316);
		}
		return submissionNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getSubmitCode() {
		if (submitCodeEEnum == null) {
			submitCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(317);
		}
		return submitCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTaxExemptIndicator() {
		if (taxExemptIndicatorEEnum == null) {
			taxExemptIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(318);
		}
		return taxExemptIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTelephoneNumber() {
		if (telephoneNumberEEnum == null) {
			telephoneNumberEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(319);
		}
		return telephoneNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTherapeuticClassCodeQualifier() {
		if (therapeuticClassCodeQualifierEEnum == null) {
			therapeuticClassCodeQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(320);
		}
		return therapeuticClassCodeQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTimePeriodBasisCodeQualifierSIGSegment() {
		if (timePeriodBasisCodeQualifierSIGSegmentEEnum == null) {
			timePeriodBasisCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(321);
		}
		return timePeriodBasisCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransactionCode() {
		if (transactionCodeEEnum == null) {
			transactionCodeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(322);
		}
		return transactionCodeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransactionCount() {
		if (transactionCountEEnum == null) {
			transactionCountEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(323);
		}
		return transactionCountEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransactionResponseStatus() {
		if (transactionResponseStatusEEnum == null) {
			transactionResponseStatusEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(324);
		}
		return transactionResponseStatusEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransferFlag() {
		if (transferFlagEEnum == null) {
			transferFlagEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(325);
		}
		return transferFlagEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransferType() {
		if (transferTypeEEnum == null) {
			transferTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(326);
		}
		return transferTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransmissionAction() {
		if (transmissionActionEEnum == null) {
			transmissionActionEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(327);
		}
		return transmissionActionEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransmissionFileType() {
		if (transmissionFileTypeEEnum == null) {
			transmissionFileTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(328);
		}
		return transmissionFileTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getTransmissionType() {
		if (transmissionTypeEEnum == null) {
			transmissionTypeEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(329);
		}
		return transmissionTypeEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUniqueRecordIdentifierQualifier() {
		if (uniqueRecordIdentifierQualifierEEnum == null) {
			uniqueRecordIdentifierQualifierEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(330);
		}
		return uniqueRecordIdentifierQualifierEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getUnitofMeasure() {
		if (unitofMeasureEEnum == null) {
			unitofMeasureEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(331);
		}
		return unitofMeasureEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableFrequencyModifierSIGSegment() {
		if (variableFrequencyModifierSIGSegmentEEnum == null) {
			variableFrequencyModifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(332);
		}
		return variableFrequencyModifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVariableIntervalModifierSIGSegment() {
		if (variableIntervalModifierSIGSegmentEEnum == null) {
			variableIntervalModifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(333);
		}
		return variableIntervalModifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVehicleNameCodeQualifierSIGSegment() {
		if (vehicleNameCodeQualifierSIGSegmentEEnum == null) {
			vehicleNameCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(334);
		}
		return vehicleNameCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVehicleUnitofMeasureCodeQualifierSIGSegment() {
		if (vehicleUnitofMeasureCodeQualifierSIGSegmentEEnum == null) {
			vehicleUnitofMeasureCodeQualifierSIGSegmentEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(335);
		}
		return vehicleUnitofMeasureCodeQualifierSIGSegmentEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getVersionReleaseNumber() {
		if (versionReleaseNumberEEnum == null) {
			versionReleaseNumberEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(336);
		}
		return versionReleaseNumberEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getWorkersCompensationPropertyAndCasualtyIndicator() {
		if (workersCompensationPropertyAndCasualtyIndicatorEEnum == null) {
			workersCompensationPropertyAndCasualtyIndicatorEEnum = (EEnum)EPackage.Registry.INSTANCE.getEPackage(ExternalCodeListPackage.eNS_URI).getEClassifiers().get(337);
		}
		return workersCompensationPropertyAndCasualtyIndicatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ExternalCodeListFactory getExternalCodeListFactory() {
		return (ExternalCodeListFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isLoaded = false;

	/**
	 * Laods the package and any sub-packages from their serialized form.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void loadPackage() {
		if (isLoaded) return;
		isLoaded = true;

		URL url = getClass().getResource(packageFilename);
		if (url == null) {
			throw new RuntimeException("Missing serialized package: " + packageFilename);
		}
		URI uri = URI.createURI(url.toString());
		Resource resource = new EcoreResourceFactoryImpl().createResource(uri);
		try {
			resource.load(null);
		}
		catch (IOException exception) {
			throw new WrappedException(exception);
		}
		initializeFromLoadedEPackage(this, (EPackage)resource.getContents().get(0));
		createResource(eNS_URI);
	}


	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isFixed = false;

	/**
	 * Fixes up the loaded package, to make it appear as if it had been programmatically built.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fixPackageContents() {
		if (isFixed) return;
		isFixed = true;
		fixEClassifiers();
	}

	/**
	 * Sets the instance class on the given classifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void fixInstanceClass(EClassifier eClassifier) {
		if (eClassifier.getInstanceClassName() == null) {
			eClassifier.setInstanceClassName("org.ncpdp.uml.ecl." + eClassifier.getName());
			setGeneratedClassName(eClassifier);
		}
	}

} //ExternalCodeListPackageImpl
