/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import org.ncpdp.uml.telecom.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TelecomFactoryImpl extends EFactoryImpl implements TelecomFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static TelecomFactory init() {
		try {
			TelecomFactory theTelecomFactory = (TelecomFactory)EPackage.Registry.INSTANCE.getEFactory("www.ncpdp.telecom"); 
			if (theTelecomFactory != null) {
				return theTelecomFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new TelecomFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomFactoryImpl() {
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
			case TelecomPackage.DOCUMENT_ROOT: return createDocumentRoot();
			case TelecomPackage.TRANSMISSION: return createTransmission();
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT: return createTransactionHeaderSegment();
			case TelecomPackage.FIELD: return createField();
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT: return createWorkersCompensationSegment();
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT: return createPriorAuthorizationSegment();
			case TelecomPackage.PRICING_SEGMENT: return createPricingSegment();
			case TelecomPackage.PRESCRIBER_SEGMENT: return createPrescriberSegment();
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT: return createPharmacyProviderSegment();
			case TelecomPackage.PATIENT_SEGMENT: return createPatientSegment();
			case TelecomPackage.NARRATIVE_SEGMENT: return createNarrativeSegment();
			case TelecomPackage.INSURANCE_SEGMENT: return createInsuranceSegment();
			case TelecomPackage.FACILITY_SEGMENT: return createFacilitySegment();
			case TelecomPackage.DURPPS_SEGMENT: return createDURPPSSegment();
			case TelecomPackage.COUPON_SEGMENT: return createCouponSegment();
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT: return createCoordinationofBenefitsOtherPaymentsSegment();
			case TelecomPackage.CLINICAL_SEGMENT: return createClinicalSegment();
			case TelecomPackage.CLAIM_SEGMENT: return createClaimSegment();
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT: return createAdditionalDocumentationSegment();
			case TelecomPackage.COMPOUND_SEGMENT: return createCompoundSegment();
			case TelecomPackage.RESPONSE: return createResponse();
			case TelecomPackage.RESPONSE_HEADER_SEGMENT: return createResponseHeaderSegment();
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT: return createResponseClaimSegment();
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT: return createResponseCoordinationofBenefitsOtherPayersSegment();
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT: return createResponseDURPPSSegment();
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT: return createResponseInsuranceSegment();
			case TelecomPackage.RESPONSE_MESSAGE_SEGMENT: return createResponseMessageSegment();
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT: return createResponsePatientSegment();
			case TelecomPackage.RESPONSE_PRICING_SEGMENT: return createResponsePricingSegment();
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT: return createResponsePriorAuthorizationSegment();
			case TelecomPackage.RESPONSE_STATUS_SEGMENT: return createResponseStatusSegment();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DocumentRoot createDocumentRoot() {
		DocumentRootImpl documentRoot = new DocumentRootImpl();
		return documentRoot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transmission createTransmission() {
		TransmissionImpl transmission = new TransmissionImpl();
		return transmission;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionHeaderSegment createTransactionHeaderSegment() {
		TransactionHeaderSegmentImpl transactionHeaderSegment = new TransactionHeaderSegmentImpl();
		return transactionHeaderSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Field createField() {
		FieldImpl field = new FieldImpl();
		return field;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public WorkersCompensationSegment createWorkersCompensationSegment() {
		WorkersCompensationSegmentImpl workersCompensationSegment = new WorkersCompensationSegmentImpl();
		return workersCompensationSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAuthorizationSegment createPriorAuthorizationSegment() {
		PriorAuthorizationSegmentImpl priorAuthorizationSegment = new PriorAuthorizationSegmentImpl();
		return priorAuthorizationSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingSegment createPricingSegment() {
		PricingSegmentImpl pricingSegment = new PricingSegmentImpl();
		return pricingSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriberSegment createPrescriberSegment() {
		PrescriberSegmentImpl prescriberSegment = new PrescriberSegmentImpl();
		return prescriberSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PharmacyProviderSegment createPharmacyProviderSegment() {
		PharmacyProviderSegmentImpl pharmacyProviderSegment = new PharmacyProviderSegmentImpl();
		return pharmacyProviderSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientSegment createPatientSegment() {
		PatientSegmentImpl patientSegment = new PatientSegmentImpl();
		return patientSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeSegment createNarrativeSegment() {
		NarrativeSegmentImpl narrativeSegment = new NarrativeSegmentImpl();
		return narrativeSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceSegment createInsuranceSegment() {
		InsuranceSegmentImpl insuranceSegment = new InsuranceSegmentImpl();
		return insuranceSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitySegment createFacilitySegment() {
		FacilitySegmentImpl facilitySegment = new FacilitySegmentImpl();
		return facilitySegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DURPPSSegment createDURPPSSegment() {
		DURPPSSegmentImpl durppsSegment = new DURPPSSegmentImpl();
		return durppsSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CouponSegment createCouponSegment() {
		CouponSegmentImpl couponSegment = new CouponSegmentImpl();
		return couponSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationofBenefitsOtherPaymentsSegment createCoordinationofBenefitsOtherPaymentsSegment() {
		CoordinationofBenefitsOtherPaymentsSegmentImpl coordinationofBenefitsOtherPaymentsSegment = new CoordinationofBenefitsOtherPaymentsSegmentImpl();
		return coordinationofBenefitsOtherPaymentsSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalSegment createClinicalSegment() {
		ClinicalSegmentImpl clinicalSegment = new ClinicalSegmentImpl();
		return clinicalSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSegment createClaimSegment() {
		ClaimSegmentImpl claimSegment = new ClaimSegmentImpl();
		return claimSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalDocumentationSegment createAdditionalDocumentationSegment() {
		AdditionalDocumentationSegmentImpl additionalDocumentationSegment = new AdditionalDocumentationSegmentImpl();
		return additionalDocumentationSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundSegment createCompoundSegment() {
		CompoundSegmentImpl compoundSegment = new CompoundSegmentImpl();
		return compoundSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Response createResponse() {
		ResponseImpl response = new ResponseImpl();
		return response;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseHeaderSegment createResponseHeaderSegment() {
		ResponseHeaderSegmentImpl responseHeaderSegment = new ResponseHeaderSegmentImpl();
		return responseHeaderSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseClaimSegment createResponseClaimSegment() {
		ResponseClaimSegmentImpl responseClaimSegment = new ResponseClaimSegmentImpl();
		return responseClaimSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseCoordinationofBenefitsOtherPayersSegment createResponseCoordinationofBenefitsOtherPayersSegment() {
		ResponseCoordinationofBenefitsOtherPayersSegmentImpl responseCoordinationofBenefitsOtherPayersSegment = new ResponseCoordinationofBenefitsOtherPayersSegmentImpl();
		return responseCoordinationofBenefitsOtherPayersSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDURPPSSegment createResponseDURPPSSegment() {
		ResponseDURPPSSegmentImpl responseDURPPSSegment = new ResponseDURPPSSegmentImpl();
		return responseDURPPSSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseInsuranceSegment createResponseInsuranceSegment() {
		ResponseInsuranceSegmentImpl responseInsuranceSegment = new ResponseInsuranceSegmentImpl();
		return responseInsuranceSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseMessageSegment createResponseMessageSegment() {
		ResponseMessageSegmentImpl responseMessageSegment = new ResponseMessageSegmentImpl();
		return responseMessageSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsePatientSegment createResponsePatientSegment() {
		ResponsePatientSegmentImpl responsePatientSegment = new ResponsePatientSegmentImpl();
		return responsePatientSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsePricingSegment createResponsePricingSegment() {
		ResponsePricingSegmentImpl responsePricingSegment = new ResponsePricingSegmentImpl();
		return responsePricingSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsePriorAuthorizationSegment createResponsePriorAuthorizationSegment() {
		ResponsePriorAuthorizationSegmentImpl responsePriorAuthorizationSegment = new ResponsePriorAuthorizationSegmentImpl();
		return responsePriorAuthorizationSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseStatusSegment createResponseStatusSegment() {
		ResponseStatusSegmentImpl responseStatusSegment = new ResponseStatusSegmentImpl();
		return responseStatusSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomPackage getTelecomPackage() {
		return (TelecomPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static TelecomPackage getPackage() {
		return TelecomPackage.eINSTANCE;
	}

} //TelecomFactoryImpl
