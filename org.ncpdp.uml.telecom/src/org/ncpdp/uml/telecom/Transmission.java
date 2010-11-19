/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Transmission</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getTransactionHeaderSegment <em>Transaction Header Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getWorkersCompensationSegment <em>Workers Compensation Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getPriorAuthorizationSegment <em>Prior Authorization Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getPricingSegment <em>Pricing Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getPrescriberSegment <em>Prescriber Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getPharmacyProviderSegment <em>Pharmacy Provider Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getPatientSegment <em>Patient Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getNarrativeSegment <em>Narrative Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getInsuranceSegment <em>Insurance Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getFacilitySegment <em>Facility Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getDURPPSSegment <em>DURPPS Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getCouponSegment <em>Coupon Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getCoordinationofBenefitsOtherPaymentsSegment <em>Coordinationof Benefits Other Payments Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getClinicalSegment <em>Clinical Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getClaimSegment <em>Claim Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getAdditionalDocumentationSegment <em>Additional Documentation Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission#getCompoundSegment <em>Compound Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission()
 * @model
 * @generated
 */
public interface Transmission extends EObject {
	/**
	 * Returns the value of the '<em><b>Transaction Header Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Header Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Header Segment</em>' containment reference.
	 * @see #setTransactionHeaderSegment(TransactionHeaderSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_TransactionHeaderSegment()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionHeaderSegment getTransactionHeaderSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getTransactionHeaderSegment <em>Transaction Header Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Header Segment</em>' containment reference.
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	void setTransactionHeaderSegment(TransactionHeaderSegment value);

	/**
	 * Returns the value of the '<em><b>Workers Compensation Segment</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.WorkersCompensationSegment}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workers Compensation Segment</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workers Compensation Segment</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_WorkersCompensationSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<WorkersCompensationSegment> getWorkersCompensationSegment();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Segment</em>' containment reference.
	 * @see #setPriorAuthorizationSegment(PriorAuthorizationSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_PriorAuthorizationSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	PriorAuthorizationSegment getPriorAuthorizationSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getPriorAuthorizationSegment <em>Prior Authorization Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prior Authorization Segment</em>' containment reference.
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 */
	void setPriorAuthorizationSegment(PriorAuthorizationSegment value);

	/**
	 * Returns the value of the '<em><b>Pricing Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pricing Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pricing Segment</em>' containment reference.
	 * @see #setPricingSegment(PricingSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_PricingSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	PricingSegment getPricingSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getPricingSegment <em>Pricing Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pricing Segment</em>' containment reference.
	 * @see #getPricingSegment()
	 * @generated
	 */
	void setPricingSegment(PricingSegment value);

	/**
	 * Returns the value of the '<em><b>Prescriber Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriber Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriber Segment</em>' containment reference.
	 * @see #setPrescriberSegment(PrescriberSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_PrescriberSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	PrescriberSegment getPrescriberSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getPrescriberSegment <em>Prescriber Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prescriber Segment</em>' containment reference.
	 * @see #getPrescriberSegment()
	 * @generated
	 */
	void setPrescriberSegment(PrescriberSegment value);

	/**
	 * Returns the value of the '<em><b>Pharmacy Provider Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pharmacy Provider Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pharmacy Provider Segment</em>' containment reference.
	 * @see #setPharmacyProviderSegment(PharmacyProviderSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_PharmacyProviderSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	PharmacyProviderSegment getPharmacyProviderSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getPharmacyProviderSegment <em>Pharmacy Provider Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pharmacy Provider Segment</em>' containment reference.
	 * @see #getPharmacyProviderSegment()
	 * @generated
	 */
	void setPharmacyProviderSegment(PharmacyProviderSegment value);

	/**
	 * Returns the value of the '<em><b>Patient Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Segment</em>' containment reference.
	 * @see #setPatientSegment(PatientSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_PatientSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	PatientSegment getPatientSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getPatientSegment <em>Patient Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Segment</em>' containment reference.
	 * @see #getPatientSegment()
	 * @generated
	 */
	void setPatientSegment(PatientSegment value);

	/**
	 * Returns the value of the '<em><b>Narrative Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Narrative Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Narrative Segment</em>' containment reference.
	 * @see #setNarrativeSegment(NarrativeSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_NarrativeSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	NarrativeSegment getNarrativeSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getNarrativeSegment <em>Narrative Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Narrative Segment</em>' containment reference.
	 * @see #getNarrativeSegment()
	 * @generated
	 */
	void setNarrativeSegment(NarrativeSegment value);

	/**
	 * Returns the value of the '<em><b>Insurance Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Insurance Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Insurance Segment</em>' containment reference.
	 * @see #setInsuranceSegment(InsuranceSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_InsuranceSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	InsuranceSegment getInsuranceSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getInsuranceSegment <em>Insurance Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Segment</em>' containment reference.
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	void setInsuranceSegment(InsuranceSegment value);

	/**
	 * Returns the value of the '<em><b>Facility Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Facility Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Facility Segment</em>' containment reference.
	 * @see #setFacilitySegment(FacilitySegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_FacilitySegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	FacilitySegment getFacilitySegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getFacilitySegment <em>Facility Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Facility Segment</em>' containment reference.
	 * @see #getFacilitySegment()
	 * @generated
	 */
	void setFacilitySegment(FacilitySegment value);

	/**
	 * Returns the value of the '<em><b>DURPPS Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>DURPPS Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>DURPPS Segment</em>' containment reference.
	 * @see #setDURPPSSegment(DURPPSSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_DURPPSSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	DURPPSSegment getDURPPSSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getDURPPSSegment <em>DURPPS Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DURPPS Segment</em>' containment reference.
	 * @see #getDURPPSSegment()
	 * @generated
	 */
	void setDURPPSSegment(DURPPSSegment value);

	/**
	 * Returns the value of the '<em><b>Coupon Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coupon Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coupon Segment</em>' containment reference.
	 * @see #setCouponSegment(CouponSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_CouponSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	CouponSegment getCouponSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getCouponSegment <em>Coupon Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coupon Segment</em>' containment reference.
	 * @see #getCouponSegment()
	 * @generated
	 */
	void setCouponSegment(CouponSegment value);

	/**
	 * Returns the value of the '<em><b>Coordinationof Benefits Other Payments Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coordinationof Benefits Other Payments Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coordinationof Benefits Other Payments Segment</em>' containment reference.
	 * @see #setCoordinationofBenefitsOtherPaymentsSegment(CoordinationofBenefitsOtherPaymentsSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_CoordinationofBenefitsOtherPaymentsSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	CoordinationofBenefitsOtherPaymentsSegment getCoordinationofBenefitsOtherPaymentsSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getCoordinationofBenefitsOtherPaymentsSegment <em>Coordinationof Benefits Other Payments Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinationof Benefits Other Payments Segment</em>' containment reference.
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	void setCoordinationofBenefitsOtherPaymentsSegment(CoordinationofBenefitsOtherPaymentsSegment value);

	/**
	 * Returns the value of the '<em><b>Clinical Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Segment</em>' containment reference.
	 * @see #setClinicalSegment(ClinicalSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_ClinicalSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalSegment getClinicalSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getClinicalSegment <em>Clinical Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Segment</em>' containment reference.
	 * @see #getClinicalSegment()
	 * @generated
	 */
	void setClinicalSegment(ClinicalSegment value);

	/**
	 * Returns the value of the '<em><b>Claim Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Claim Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Claim Segment</em>' containment reference.
	 * @see #setClaimSegment(ClaimSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_ClaimSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimSegment getClaimSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getClaimSegment <em>Claim Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Segment</em>' containment reference.
	 * @see #getClaimSegment()
	 * @generated
	 */
	void setClaimSegment(ClaimSegment value);

	/**
	 * Returns the value of the '<em><b>Additional Documentation Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Additional Documentation Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Additional Documentation Segment</em>' containment reference.
	 * @see #setAdditionalDocumentationSegment(AdditionalDocumentationSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_AdditionalDocumentationSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	AdditionalDocumentationSegment getAdditionalDocumentationSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getAdditionalDocumentationSegment <em>Additional Documentation Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Additional Documentation Segment</em>' containment reference.
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 */
	void setAdditionalDocumentationSegment(AdditionalDocumentationSegment value);

	/**
	 * Returns the value of the '<em><b>Compound Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Segment</em>' containment reference.
	 * @see #setCompoundSegment(CompoundSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission_CompoundSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	CompoundSegment getCompoundSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission#getCompoundSegment <em>Compound Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Segment</em>' containment reference.
	 * @see #getCompoundSegment()
	 * @generated
	 */
	void setCompoundSegment(CompoundSegment value);

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * not self.transactionHeaderSegment.oclIsUndefined()
	 * @param diagnostics The chain of diagnostics to which problems are to be appended.
	 * @param context The cache of context-specific information.
	 * <!-- end-model-doc -->
	 * @model annotation="http://www.eclipse.org/uml2/1.1.0/GenModel body='not self.transactionHeaderSegment.oclIsUndefined()'"
	 * @generated
	 */
	boolean TransmissionTransactionHeaderSegment(DiagnosticChain diagnostics, Map<Object, Object> context);

} // Transmission
