package org.ncpdp.uml.telecom.test;

import org.eclipse.emf.common.util.Diagnostic;
import org.junit.Test;
import org.ncpdp.uml.telecom.AdditionalDocumentationSegment;
import org.ncpdp.uml.telecom.ClaimSegment;
import org.ncpdp.uml.telecom.ClinicalSegment;
import org.ncpdp.uml.telecom.CompoundSegment;
import org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment;
import org.ncpdp.uml.telecom.CouponSegment;
import org.ncpdp.uml.telecom.DURPPSSegment;
import org.ncpdp.uml.telecom.FacilitySegment;
import org.ncpdp.uml.telecom.InsuranceSegment;
import org.ncpdp.uml.telecom.NarrativeSegment;
import org.ncpdp.uml.telecom.PatientSegment;
import org.ncpdp.uml.telecom.PharmacyProviderSegment;
import org.ncpdp.uml.telecom.PrescriberSegment;
import org.ncpdp.uml.telecom.PricingSegment;
import org.ncpdp.uml.telecom.PriorAuthorizationSegment;
import org.ncpdp.uml.telecom.Response;
import org.ncpdp.uml.telecom.ResponseClaimSegment;
import org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment;
import org.ncpdp.uml.telecom.ResponseDURPPSSegment;
import org.ncpdp.uml.telecom.ResponseHeaderSegment;
import org.ncpdp.uml.telecom.ResponseInsuranceSegment;
import org.ncpdp.uml.telecom.ResponseMessageSegment;
import org.ncpdp.uml.telecom.ResponsePatientSegment;
import org.ncpdp.uml.telecom.ResponsePricingSegment;
import org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment;
import org.ncpdp.uml.telecom.TelecomFactory;
import org.ncpdp.uml.telecom.TransactionHeaderSegment;
import org.ncpdp.uml.telecom.Transmission;
import org.ncpdp.uml.telecom.WorkersCompensationSegment;
import org.ncpdp.uml.telecom.util.BasicValidationHandler;
import org.ncpdp.uml.telecom.util.TelecomUtil;

public class TestPackage {

	@Test
	public void testTransmissionAnnotations() {



		Transmission transmission = TelecomFactory.eINSTANCE.createTransmission();
		
		TransactionHeaderSegment transactionHeaderSegment = TelecomFactory.eINSTANCE.createTransactionHeaderSegment();
		TelecomUtil.init(transactionHeaderSegment);
		transmission.setTransactionHeaderSegment(transactionHeaderSegment);
		ClaimSegment claimSegment = TelecomFactory.eINSTANCE.createClaimSegment();
		TelecomUtil.init(claimSegment);
		transmission.setClaimSegment(claimSegment);
		ClinicalSegment clinicalSegment = TelecomFactory.eINSTANCE.createClinicalSegment();
		TelecomUtil.init(clinicalSegment);
		transmission.setClinicalSegment(clinicalSegment);
		CompoundSegment compoundSegment = TelecomFactory.eINSTANCE.createCompoundSegment();
		TelecomUtil.init(compoundSegment);
		transmission.setCompoundSegment(compoundSegment);
		WorkersCompensationSegment workersCompensationSegment = TelecomFactory.eINSTANCE.createWorkersCompensationSegment();
		TelecomUtil.init(workersCompensationSegment);
		transmission.getWorkersCompensationSegment().add(workersCompensationSegment);
		InsuranceSegment insuranceSegment = TelecomFactory.eINSTANCE.createInsuranceSegment();
		TelecomUtil.init(insuranceSegment);
		transmission.setInsuranceSegment(insuranceSegment);
		CoordinationofBenefitsOtherPaymentsSegment coordinationofBenefitsOtherPaymentsSegment = TelecomFactory.eINSTANCE.createCoordinationofBenefitsOtherPaymentsSegment();
		TelecomUtil.init(coordinationofBenefitsOtherPaymentsSegment);
		transmission.setCoordinationofBenefitsOtherPaymentsSegment(coordinationofBenefitsOtherPaymentsSegment);
		PatientSegment patientSegment = TelecomFactory.eINSTANCE.createPatientSegment();
		TelecomUtil.init(patientSegment);
		transmission.setPatientSegment(patientSegment);
		PricingSegment pricingSegment = TelecomFactory.eINSTANCE.createPricingSegment();
		TelecomUtil.init(pricingSegment);
		transmission.setPricingSegment(pricingSegment);
		PriorAuthorizationSegment priorAuthorizationSegment = TelecomFactory.eINSTANCE.createPriorAuthorizationSegment();
		TelecomUtil.init(priorAuthorizationSegment);
		transmission.setPriorAuthorizationSegment(priorAuthorizationSegment);
		AdditionalDocumentationSegment additionalDocumentationSegment = TelecomFactory.eINSTANCE.createAdditionalDocumentationSegment();
		TelecomUtil.init(additionalDocumentationSegment);
		transmission.setAdditionalDocumentationSegment(additionalDocumentationSegment);
		FacilitySegment facilitySegment = TelecomFactory.eINSTANCE.createFacilitySegment();
		TelecomUtil.init(facilitySegment);
		transmission.setFacilitySegment(facilitySegment);
		CouponSegment couponSegment = TelecomFactory.eINSTANCE.createCouponSegment();
		TelecomUtil.init(couponSegment);
		transmission.setCouponSegment(couponSegment);
		DURPPSSegment dURPPSSegment = TelecomFactory.eINSTANCE.createDURPPSSegment();
		TelecomUtil.init(dURPPSSegment);
		transmission.setDURPPSSegment(dURPPSSegment);
		PrescriberSegment prescriberSegment = TelecomFactory.eINSTANCE.createPrescriberSegment();
		TelecomUtil.init(prescriberSegment);
		transmission.setPrescriberSegment(prescriberSegment);
		PharmacyProviderSegment pharmacyProviderSegment = TelecomFactory.eINSTANCE.createPharmacyProviderSegment();
		TelecomUtil.init(pharmacyProviderSegment);
		transmission.setPharmacyProviderSegment(pharmacyProviderSegment);
		NarrativeSegment narrativeSegment = TelecomFactory.eINSTANCE.createNarrativeSegment();
		TelecomUtil.init(narrativeSegment);
		transmission.setNarrativeSegment(narrativeSegment);
		
		try {
			TelecomUtil.save(transmission, System.out);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		
		
		TelecomUtil.validate(transmission, new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}
			@Override
			public void handleWarning(Diagnostic diagnostic) {
				System.out.println("WARNING: " + diagnostic.getMessage());
			}
			@Override
			public void handleInfo(Diagnostic diagnostic) {
				System.out.println("INFO: " + diagnostic.getMessage());
			}
		});
		
		
//		root.setTransmission(transmission);
//
//		XMLResource resource = (XMLResource) new XMLResourceFactoryImpl().createResource(URI.createURI(TelecomPackage.eNS_URI));
//		
//		
//		resource.getDefaultSaveOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
//		resource.getDefaultLoadOptions().put(XMLResource.OPTION_EXTENDED_META_DATA, Boolean.TRUE);
//
//		resource.getDefaultSaveOptions().put(XMLResource.OPTION_SCHEMA_LOCATION, Boolean.TRUE);
//
//		resource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
//		resource.getDefaultSaveOptions().put(XMLResource.OPTION_USE_ENCODED_ATTRIBUTE_STYLE, Boolean.TRUE);
//
//		resource.getDefaultLoadOptions().put(XMLResource.OPTION_USE_LEXICAL_HANDLER, Boolean.TRUE);
//		
//		
//		resource.getContents().add(root);
//		try {
//			resource.save(System.out,null);
//		} catch (IOException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
		
	}
	
	
	@Test
	public void testResponseAnnotations() {
		
		Response response = TelecomFactory.eINSTANCE.createResponse();
		TelecomUtil.init(response);

		ResponseHeaderSegment responseHeaderSegment= TelecomFactory.eINSTANCE.createResponseHeaderSegment();
		TelecomUtil.init(responseHeaderSegment);
		response.setResponseHeaderSegment(responseHeaderSegment);

		ResponseClaimSegment responseClaimSegment= TelecomFactory.eINSTANCE.createResponseClaimSegment();
		TelecomUtil.init(responseClaimSegment);
		response.setResponseClaimSegment(responseClaimSegment);

		ResponseCoordinationofBenefitsOtherPayersSegment responseCoordinationofBenefitsOtherPayersSegment= TelecomFactory.eINSTANCE.createResponseCoordinationofBenefitsOtherPayersSegment();
		TelecomUtil.init(responseCoordinationofBenefitsOtherPayersSegment);
		response.setResponseCoordinationofBenefitsOtherPayersSegment(responseCoordinationofBenefitsOtherPayersSegment);

		ResponseDURPPSSegment responseDURPPSSegment= TelecomFactory.eINSTANCE.createResponseDURPPSSegment();
		TelecomUtil.init(responseDURPPSSegment);
		response.setResponseDURPPSSegment(responseDURPPSSegment);

		ResponseInsuranceSegment responseInsuranceSegment= TelecomFactory.eINSTANCE.createResponseInsuranceSegment();
		TelecomUtil.init(responseInsuranceSegment);
		response.setResponseInsuranceSegment(responseInsuranceSegment);

		ResponseMessageSegment responseMessageSegment= TelecomFactory.eINSTANCE.createResponseMessageSegment();
		TelecomUtil.init(responseMessageSegment);
		response.setResponseMessageSegment(responseMessageSegment);

		ResponsePatientSegment responsePatientSegment= TelecomFactory.eINSTANCE.createResponsePatientSegment();
		TelecomUtil.init(responsePatientSegment);
		response.setResponsePatientSegment(responsePatientSegment);

		ResponsePricingSegment responsePricingSegment= TelecomFactory.eINSTANCE.createResponsePricingSegment();
		TelecomUtil.init(responsePricingSegment);
		response.setResponsePricingSegment(responsePricingSegment);

		ResponsePriorAuthorizationSegment responsePriorAuthorizationSegment= TelecomFactory.eINSTANCE.createResponsePriorAuthorizationSegment();
		TelecomUtil.init(responsePriorAuthorizationSegment);
		response.setResponsePriorAuthorizationSegment(responsePriorAuthorizationSegment);

		try {
			TelecomUtil.save(response, System.out);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		TelecomUtil.validate(response, new BasicValidationHandler() {
			@Override
			public void handleError(Diagnostic diagnostic) {
				System.out.println("ERROR: " + diagnostic.getMessage());
			}
			@Override
			public void handleWarning(Diagnostic diagnostic) {
				System.out.println("WARNING: " + diagnostic.getMessage());
			}
			@Override
			public void handleInfo(Diagnostic diagnostic) {
				System.out.println("INFO: " + diagnostic.getMessage());
			}
		});
		
	}

}
