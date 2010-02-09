/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.telecom.TelecomPackage
 * @generated
 */
public interface TelecomFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	TelecomFactory eINSTANCE = org.ncpdp.uml.telecom.impl.TelecomFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>Document Root</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Document Root</em>'.
	 * @generated
	 */
	DocumentRoot createDocumentRoot();

	/**
	 * Returns a new object of class '<em>Transmission</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transmission</em>'.
	 * @generated
	 */
	Transmission createTransmission();

	/**
	 * Returns a new object of class '<em>Transaction Header Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Transaction Header Segment</em>'.
	 * @generated
	 */
	TransactionHeaderSegment createTransactionHeaderSegment();

	/**
	 * Returns a new object of class '<em>Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Field</em>'.
	 * @generated
	 */
	Field createField();

	/**
	 * Returns a new object of class '<em>Claim Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Claim Segment</em>'.
	 * @generated
	 */
	ClaimSegment createClaimSegment();

	/**
	 * Returns a new object of class '<em>Clinical Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Clinical Segment</em>'.
	 * @generated
	 */
	ClinicalSegment createClinicalSegment();

	/**
	 * Returns a new object of class '<em>Response Patient Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Patient Segment</em>'.
	 * @generated
	 */
	ResponsePatientSegment createResponsePatientSegment();

	/**
	 * Returns a new object of class '<em>Response Insurance Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Insurance Segment</em>'.
	 * @generated
	 */
	ResponseInsuranceSegment createResponseInsuranceSegment();

	/**
	 * Returns a new object of class '<em>Compound Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Compound Segment</em>'.
	 * @generated
	 */
	CompoundSegment createCompoundSegment();

	/**
	 * Returns a new object of class '<em>Workers Compensation Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Workers Compensation Segment</em>'.
	 * @generated
	 */
	WorkersCompensationSegment createWorkersCompensationSegment();

	/**
	 * Returns a new object of class '<em>Insurance Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Insurance Segment</em>'.
	 * @generated
	 */
	InsuranceSegment createInsuranceSegment();

	/**
	 * Returns a new object of class '<em>Response DURPPS Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response DURPPS Segment</em>'.
	 * @generated
	 */
	ResponseDURPPSSegment createResponseDURPPSSegment();

	/**
	 * Returns a new object of class '<em>Coordinationof Benefits Other Payments Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coordinationof Benefits Other Payments Segment</em>'.
	 * @generated
	 */
	CoordinationofBenefitsOtherPaymentsSegment createCoordinationofBenefitsOtherPaymentsSegment();

	/**
	 * Returns a new object of class '<em>Patient Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Patient Segment</em>'.
	 * @generated
	 */
	PatientSegment createPatientSegment();

	/**
	 * Returns a new object of class '<em>Pricing Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pricing Segment</em>'.
	 * @generated
	 */
	PricingSegment createPricingSegment();

	/**
	 * Returns a new object of class '<em>Prior Authorization Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prior Authorization Segment</em>'.
	 * @generated
	 */
	PriorAuthorizationSegment createPriorAuthorizationSegment();

	/**
	 * Returns a new object of class '<em>Response Status Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Status Segment</em>'.
	 * @generated
	 */
	ResponseStatusSegment createResponseStatusSegment();

	/**
	 * Returns a new object of class '<em>Additional Documentation Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Additional Documentation Segment</em>'.
	 * @generated
	 */
	AdditionalDocumentationSegment createAdditionalDocumentationSegment();

	/**
	 * Returns a new object of class '<em>Response Message Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Message Segment</em>'.
	 * @generated
	 */
	ResponseMessageSegment createResponseMessageSegment();

	/**
	 * Returns a new object of class '<em>Response Claim Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Claim Segment</em>'.
	 * @generated
	 */
	ResponseClaimSegment createResponseClaimSegment();

	/**
	 * Returns a new object of class '<em>Facility Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Facility Segment</em>'.
	 * @generated
	 */
	FacilitySegment createFacilitySegment();

	/**
	 * Returns a new object of class '<em>Coupon Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Coupon Segment</em>'.
	 * @generated
	 */
	CouponSegment createCouponSegment();

	/**
	 * Returns a new object of class '<em>Response Coordinationof Benefits Other Payers Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Coordinationof Benefits Other Payers Segment</em>'.
	 * @generated
	 */
	ResponseCoordinationofBenefitsOtherPayersSegment createResponseCoordinationofBenefitsOtherPayersSegment();

	/**
	 * Returns a new object of class '<em>DURPPS Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>DURPPS Segment</em>'.
	 * @generated
	 */
	DURPPSSegment createDURPPSSegment();

	/**
	 * Returns a new object of class '<em>Response</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response</em>'.
	 * @generated
	 */
	Response createResponse();

	/**
	 * Returns a new object of class '<em>Response Header Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Header Segment</em>'.
	 * @generated
	 */
	ResponseHeaderSegment createResponseHeaderSegment();

	/**
	 * Returns a new object of class '<em>Response Pricing Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Pricing Segment</em>'.
	 * @generated
	 */
	ResponsePricingSegment createResponsePricingSegment();

	/**
	 * Returns a new object of class '<em>Response Prior Authorization Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Response Prior Authorization Segment</em>'.
	 * @generated
	 */
	ResponsePriorAuthorizationSegment createResponsePriorAuthorizationSegment();

	/**
	 * Returns a new object of class '<em>Prescriber Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Prescriber Segment</em>'.
	 * @generated
	 */
	PrescriberSegment createPrescriberSegment();

	/**
	 * Returns a new object of class '<em>Pharmacy Provider Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Pharmacy Provider Segment</em>'.
	 * @generated
	 */
	PharmacyProviderSegment createPharmacyProviderSegment();

	/**
	 * Returns a new object of class '<em>Narrative Segment</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>Narrative Segment</em>'.
	 * @generated
	 */
	NarrativeSegment createNarrativeSegment();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	TelecomPackage getTelecomPackage();

} //TelecomFactory
