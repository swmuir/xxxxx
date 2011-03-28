/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom.util;

import java.util.List;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;

import org.ncpdp.uml.telecom.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.telecom.TelecomPackage
 * @generated
 */
public class TelecomSwitch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TelecomPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomSwitch() {
		if (modelPackage == null) {
			modelPackage = TelecomPackage.eINSTANCE;
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	public T doSwitch(EObject theEObject) {
		return doSwitch(theEObject.eClass(), theEObject);
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(EClass theEClass, EObject theEObject) {
		if (theEClass.eContainer() == modelPackage) {
			return doSwitch(theEClass.getClassifierID(), theEObject);
		}
		else {
			List<EClass> eSuperTypes = theEClass.getESuperTypes();
			return
				eSuperTypes.isEmpty() ?
					defaultCase(theEObject) :
					doSwitch(eSuperTypes.get(0), theEObject);
		}
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case TelecomPackage.DOCUMENT_ROOT: {
				DocumentRoot documentRoot = (DocumentRoot)theEObject;
				T result = caseDocumentRoot(documentRoot);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.TRANSMISSION: {
				Transmission transmission = (Transmission)theEObject;
				T result = caseTransmission(transmission);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.TRANSACTION_HEADER_SEGMENT: {
				TransactionHeaderSegment transactionHeaderSegment = (TransactionHeaderSegment)theEObject;
				T result = caseTransactionHeaderSegment(transactionHeaderSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.FIELD: {
				Field field = (Field)theEObject;
				T result = caseField(field);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.WORKERS_COMPENSATION_SEGMENT: {
				WorkersCompensationSegment workersCompensationSegment = (WorkersCompensationSegment)theEObject;
				T result = caseWorkersCompensationSegment(workersCompensationSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.PRIOR_AUTHORIZATION_SEGMENT: {
				PriorAuthorizationSegment priorAuthorizationSegment = (PriorAuthorizationSegment)theEObject;
				T result = casePriorAuthorizationSegment(priorAuthorizationSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.PRICING_SEGMENT: {
				PricingSegment pricingSegment = (PricingSegment)theEObject;
				T result = casePricingSegment(pricingSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.PRESCRIBER_SEGMENT: {
				PrescriberSegment prescriberSegment = (PrescriberSegment)theEObject;
				T result = casePrescriberSegment(prescriberSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.PHARMACY_PROVIDER_SEGMENT: {
				PharmacyProviderSegment pharmacyProviderSegment = (PharmacyProviderSegment)theEObject;
				T result = casePharmacyProviderSegment(pharmacyProviderSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.PATIENT_SEGMENT: {
				PatientSegment patientSegment = (PatientSegment)theEObject;
				T result = casePatientSegment(patientSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.NARRATIVE_SEGMENT: {
				NarrativeSegment narrativeSegment = (NarrativeSegment)theEObject;
				T result = caseNarrativeSegment(narrativeSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.INSURANCE_SEGMENT: {
				InsuranceSegment insuranceSegment = (InsuranceSegment)theEObject;
				T result = caseInsuranceSegment(insuranceSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.FACILITY_SEGMENT: {
				FacilitySegment facilitySegment = (FacilitySegment)theEObject;
				T result = caseFacilitySegment(facilitySegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.DURPPS_SEGMENT: {
				DURPPSSegment durppsSegment = (DURPPSSegment)theEObject;
				T result = caseDURPPSSegment(durppsSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.COUPON_SEGMENT: {
				CouponSegment couponSegment = (CouponSegment)theEObject;
				T result = caseCouponSegment(couponSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT: {
				CoordinationofBenefitsOtherPaymentsSegment coordinationofBenefitsOtherPaymentsSegment = (CoordinationofBenefitsOtherPaymentsSegment)theEObject;
				T result = caseCoordinationofBenefitsOtherPaymentsSegment(coordinationofBenefitsOtherPaymentsSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.CLINICAL_SEGMENT: {
				ClinicalSegment clinicalSegment = (ClinicalSegment)theEObject;
				T result = caseClinicalSegment(clinicalSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.CLAIM_SEGMENT: {
				ClaimSegment claimSegment = (ClaimSegment)theEObject;
				T result = caseClaimSegment(claimSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.ADDITIONAL_DOCUMENTATION_SEGMENT: {
				AdditionalDocumentationSegment additionalDocumentationSegment = (AdditionalDocumentationSegment)theEObject;
				T result = caseAdditionalDocumentationSegment(additionalDocumentationSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.COMPOUND_SEGMENT: {
				CompoundSegment compoundSegment = (CompoundSegment)theEObject;
				T result = caseCompoundSegment(compoundSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.RESPONSE: {
				Response response = (Response)theEObject;
				T result = caseResponse(response);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.RESPONSE_HEADER_SEGMENT: {
				ResponseHeaderSegment responseHeaderSegment = (ResponseHeaderSegment)theEObject;
				T result = caseResponseHeaderSegment(responseHeaderSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.RESPONSE_CLAIM_SEGMENT: {
				ResponseClaimSegment responseClaimSegment = (ResponseClaimSegment)theEObject;
				T result = caseResponseClaimSegment(responseClaimSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT: {
				ResponseCoordinationofBenefitsOtherPayersSegment responseCoordinationofBenefitsOtherPayersSegment = (ResponseCoordinationofBenefitsOtherPayersSegment)theEObject;
				T result = caseResponseCoordinationofBenefitsOtherPayersSegment(responseCoordinationofBenefitsOtherPayersSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.RESPONSE_DURPPS_SEGMENT: {
				ResponseDURPPSSegment responseDURPPSSegment = (ResponseDURPPSSegment)theEObject;
				T result = caseResponseDURPPSSegment(responseDURPPSSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.RESPONSE_INSURANCE_SEGMENT: {
				ResponseInsuranceSegment responseInsuranceSegment = (ResponseInsuranceSegment)theEObject;
				T result = caseResponseInsuranceSegment(responseInsuranceSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.RESPONSE_MESSAGE_SEGMENT: {
				ResponseMessageSegment responseMessageSegment = (ResponseMessageSegment)theEObject;
				T result = caseResponseMessageSegment(responseMessageSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT: {
				ResponsePatientSegment responsePatientSegment = (ResponsePatientSegment)theEObject;
				T result = caseResponsePatientSegment(responsePatientSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.RESPONSE_PRICING_SEGMENT: {
				ResponsePricingSegment responsePricingSegment = (ResponsePricingSegment)theEObject;
				T result = caseResponsePricingSegment(responsePricingSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.RESPONSE_PRIOR_AUTHORIZATION_SEGMENT: {
				ResponsePriorAuthorizationSegment responsePriorAuthorizationSegment = (ResponsePriorAuthorizationSegment)theEObject;
				T result = caseResponsePriorAuthorizationSegment(responsePriorAuthorizationSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case TelecomPackage.RESPONSE_STATUS_SEGMENT: {
				ResponseStatusSegment responseStatusSegment = (ResponseStatusSegment)theEObject;
				T result = caseResponseStatusSegment(responseStatusSegment);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Document Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDocumentRoot(DocumentRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transmission</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransmission(Transmission object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transaction Header Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transaction Header Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransactionHeaderSegment(TransactionHeaderSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseField(Field object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Claim Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Claim Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClaimSegment(ClaimSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Clinical Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Clinical Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseClinicalSegment(ClinicalSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Patient Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Patient Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsePatientSegment(ResponsePatientSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Insurance Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Insurance Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseInsuranceSegment(ResponseInsuranceSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Compound Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Compound Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompoundSegment(CompoundSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Workers Compensation Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Workers Compensation Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseWorkersCompensationSegment(WorkersCompensationSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Insurance Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Insurance Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInsuranceSegment(InsuranceSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response DURPPS Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response DURPPS Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseDURPPSSegment(ResponseDURPPSSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coordinationof Benefits Other Payments Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coordinationof Benefits Other Payments Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCoordinationofBenefitsOtherPaymentsSegment(CoordinationofBenefitsOtherPaymentsSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Patient Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Patient Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePatientSegment(PatientSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pricing Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pricing Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePricingSegment(PricingSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prior Authorization Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prior Authorization Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePriorAuthorizationSegment(PriorAuthorizationSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Status Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Status Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseStatusSegment(ResponseStatusSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Additional Documentation Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Additional Documentation Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAdditionalDocumentationSegment(AdditionalDocumentationSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Message Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Message Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseMessageSegment(ResponseMessageSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Claim Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Claim Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseClaimSegment(ResponseClaimSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Facility Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Facility Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFacilitySegment(FacilitySegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Coupon Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Coupon Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCouponSegment(CouponSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Coordinationof Benefits Other Payers Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Coordinationof Benefits Other Payers Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseCoordinationofBenefitsOtherPayersSegment(ResponseCoordinationofBenefitsOtherPayersSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>DURPPS Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>DURPPS Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDURPPSSegment(DURPPSSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponse(Response object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Header Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Header Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponseHeaderSegment(ResponseHeaderSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Pricing Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Pricing Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsePricingSegment(ResponsePricingSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Response Prior Authorization Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Response Prior Authorization Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseResponsePriorAuthorizationSegment(ResponsePriorAuthorizationSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Prescriber Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Prescriber Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePrescriberSegment(PrescriberSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Pharmacy Provider Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Pharmacy Provider Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePharmacyProviderSegment(PharmacyProviderSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Narrative Segment</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Narrative Segment</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseNarrativeSegment(NarrativeSegment object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	public T defaultCase(EObject object) {
		return null;
	}

} //TelecomSwitch
