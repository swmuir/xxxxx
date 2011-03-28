/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom.util;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.ResourceLocator;

import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.EObjectValidator;

import org.ncpdp.uml.telecom.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Validator</b> for the model.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.telecom.TelecomPackage
 * @generated
 */
public class TelecomValidator extends EObjectValidator {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final TelecomValidator INSTANCE = new TelecomValidator();

	/**
	 * A constant for the {@link org.eclipse.emf.common.util.Diagnostic#getSource() source} of diagnostic {@link org.eclipse.emf.common.util.Diagnostic#getCode() codes} from this package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.common.util.Diagnostic#getSource()
	 * @see org.eclipse.emf.common.util.Diagnostic#getCode()
	 * @generated
	 */
	public static final String DIAGNOSTIC_SOURCE = "org.ncpdp.uml.telecom";

	/**
	 * The {@link org.eclipse.emf.common.util.Diagnostic#getCode() code} for constraint 'Transmission Transaction Header Segment' of 'Transmission'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final int TRANSMISSION__TRANSMISSION_TRANSACTION_HEADER_SEGMENT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final int GENERATED_DIAGNOSTIC_CODE_COUNT = 1;

	/**
	 * A constant with a fixed name that can be used as the base value for additional hand written constants in a derived class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static final int DIAGNOSTIC_CODE_COUNT = GENERATED_DIAGNOSTIC_CODE_COUNT;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomValidator() {
		super();
	}

	/**
	 * Returns the package of this validator switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EPackage getEPackage() {
	  return TelecomPackage.eINSTANCE;
	}

	/**
	 * Calls <code>validateXXX</code> for the corresponding classifier of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean validate(int classifierID, Object value, DiagnosticChain diagnostics, Map<Object, Object> context) {
		switch (classifierID) {
			case TelecomPackage.DOCUMENT_ROOT:
				return validateDocumentRoot((DocumentRoot)value, diagnostics, context);
			case TelecomPackage.TRANSMISSION:
				return validateTransmission((Transmission)value, diagnostics, context);
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT:
				return validateTransactionHeaderSegment((TransactionHeaderSegment)value, diagnostics, context);
			case TelecomPackage.FIELD:
				return validateField((Field)value, diagnostics, context);
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT:
				return validateWorkersCompensationSegment((WorkersCompensationSegment)value, diagnostics, context);
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT:
				return validatePriorAuthorizationSegment((PriorAuthorizationSegment)value, diagnostics, context);
			case TelecomPackage.PRICING_SEGMENT:
				return validatePricingSegment((PricingSegment)value, diagnostics, context);
			case TelecomPackage.PRESCRIBER_SEGMENT:
				return validatePrescriberSegment((PrescriberSegment)value, diagnostics, context);
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT:
				return validatePharmacyProviderSegment((PharmacyProviderSegment)value, diagnostics, context);
			case TelecomPackage.PATIENT_SEGMENT:
				return validatePatientSegment((PatientSegment)value, diagnostics, context);
			case TelecomPackage.NARRATIVE_SEGMENT:
				return validateNarrativeSegment((NarrativeSegment)value, diagnostics, context);
			case TelecomPackage.INSURANCE_SEGMENT:
				return validateInsuranceSegment((InsuranceSegment)value, diagnostics, context);
			case TelecomPackage.FACILITY_SEGMENT:
				return validateFacilitySegment((FacilitySegment)value, diagnostics, context);
			case TelecomPackage.DURPPS_SEGMENT:
				return validateDURPPSSegment((DURPPSSegment)value, diagnostics, context);
			case TelecomPackage.COUPON_SEGMENT:
				return validateCouponSegment((CouponSegment)value, diagnostics, context);
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT:
				return validateCoordinationofBenefitsOtherPaymentsSegment((CoordinationofBenefitsOtherPaymentsSegment)value, diagnostics, context);
			case TelecomPackage.CLINICAL_SEGMENT:
				return validateClinicalSegment((ClinicalSegment)value, diagnostics, context);
			case TelecomPackage.CLAIM_SEGMENT:
				return validateClaimSegment((ClaimSegment)value, diagnostics, context);
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT:
				return validateAdditionalDocumentationSegment((AdditionalDocumentationSegment)value, diagnostics, context);
			case TelecomPackage.COMPOUND_SEGMENT:
				return validateCompoundSegment((CompoundSegment)value, diagnostics, context);
			case TelecomPackage.RESPONSE:
				return validateResponse((Response)value, diagnostics, context);
			case TelecomPackage.RESPONSE_HEADER_SEGMENT:
				return validateResponseHeaderSegment((ResponseHeaderSegment)value, diagnostics, context);
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT:
				return validateResponseClaimSegment((ResponseClaimSegment)value, diagnostics, context);
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT:
				return validateResponseCoordinationofBenefitsOtherPayersSegment((ResponseCoordinationofBenefitsOtherPayersSegment)value, diagnostics, context);
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT:
				return validateResponseDURPPSSegment((ResponseDURPPSSegment)value, diagnostics, context);
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT:
				return validateResponseInsuranceSegment((ResponseInsuranceSegment)value, diagnostics, context);
			case TelecomPackage.RESPONSE_MESSAGE_SEGMENT:
				return validateResponseMessageSegment((ResponseMessageSegment)value, diagnostics, context);
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT:
				return validateResponsePatientSegment((ResponsePatientSegment)value, diagnostics, context);
			case TelecomPackage.RESPONSE_PRICING_SEGMENT:
				return validateResponsePricingSegment((ResponsePricingSegment)value, diagnostics, context);
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT:
				return validateResponsePriorAuthorizationSegment((ResponsePriorAuthorizationSegment)value, diagnostics, context);
			case TelecomPackage.RESPONSE_STATUS_SEGMENT:
				return validateResponseStatusSegment((ResponseStatusSegment)value, diagnostics, context);
			default:
				return true;
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDocumentRoot(DocumentRoot documentRoot, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(documentRoot, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransactionHeaderSegment(TransactionHeaderSegment transactionHeaderSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(transactionHeaderSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateField(Field field, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(field, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClaimSegment(ClaimSegment claimSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(claimSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateClinicalSegment(ClinicalSegment clinicalSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(clinicalSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCompoundSegment(CompoundSegment compoundSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(compoundSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateWorkersCompensationSegment(WorkersCompensationSegment workersCompensationSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(workersCompensationSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateInsuranceSegment(InsuranceSegment insuranceSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(insuranceSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCoordinationofBenefitsOtherPaymentsSegment(CoordinationofBenefitsOtherPaymentsSegment coordinationofBenefitsOtherPaymentsSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(coordinationofBenefitsOtherPaymentsSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePatientSegment(PatientSegment patientSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(patientSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsePatientSegment(ResponsePatientSegment responsePatientSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsePatientSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseInsuranceSegment(ResponseInsuranceSegment responseInsuranceSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseInsuranceSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseDURPPSSegment(ResponseDURPPSSegment responseDURPPSSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseDURPPSSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePricingSegment(PricingSegment pricingSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pricingSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePriorAuthorizationSegment(PriorAuthorizationSegment priorAuthorizationSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(priorAuthorizationSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseStatusSegment(ResponseStatusSegment responseStatusSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseStatusSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateAdditionalDocumentationSegment(AdditionalDocumentationSegment additionalDocumentationSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(additionalDocumentationSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseMessageSegment(ResponseMessageSegment responseMessageSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseMessageSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseClaimSegment(ResponseClaimSegment responseClaimSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseClaimSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateFacilitySegment(FacilitySegment facilitySegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(facilitySegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateCouponSegment(CouponSegment couponSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(couponSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseCoordinationofBenefitsOtherPayersSegment(ResponseCoordinationofBenefitsOtherPayersSegment responseCoordinationofBenefitsOtherPayersSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseCoordinationofBenefitsOtherPayersSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateDURPPSSegment(DURPPSSegment durppsSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(durppsSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponse(Response response, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(response, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponseHeaderSegment(ResponseHeaderSegment responseHeaderSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responseHeaderSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsePricingSegment(ResponsePricingSegment responsePricingSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsePricingSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateResponsePriorAuthorizationSegment(ResponsePriorAuthorizationSegment responsePriorAuthorizationSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(responsePriorAuthorizationSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePrescriberSegment(PrescriberSegment prescriberSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(prescriberSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validatePharmacyProviderSegment(PharmacyProviderSegment pharmacyProviderSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(pharmacyProviderSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateNarrativeSegment(NarrativeSegment narrativeSegment, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return validate_EveryDefaultConstraint(narrativeSegment, diagnostics, context);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmission(Transmission transmission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		boolean result = validate_EveryMultiplicityConforms(transmission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryDataValueConforms(transmission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryReferenceIsContained(transmission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryProxyResolves(transmission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_UniqueID(transmission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryKeyUnique(transmission, diagnostics, context);
		if (result || diagnostics != null) result &= validate_EveryMapEntryUnique(transmission, diagnostics, context);
		if (result || diagnostics != null) result &= validateTransmission_TransmissionTransactionHeaderSegment(transmission, diagnostics, context);
		return result;
	}

	/**
	 * Validates the TransmissionTransactionHeaderSegment constraint of '<em>Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean validateTransmission_TransmissionTransactionHeaderSegment(Transmission transmission, DiagnosticChain diagnostics, Map<Object, Object> context) {
		return transmission.TransmissionTransactionHeaderSegment(diagnostics, context);
	}

	/**
	 * Returns the resource locator that will be used to fetch messages for this validator's diagnostics.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ResourceLocator getResourceLocator() {
		// TODO
		// Specialize this to return a resource locator for messages specific to this validator.
		// Ensure that you remove @generated or mark it @generated NOT
		return super.getResourceLocator();
	}

} //TelecomValidator
