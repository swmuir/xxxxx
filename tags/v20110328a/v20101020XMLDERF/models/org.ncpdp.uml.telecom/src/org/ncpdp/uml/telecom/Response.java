/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.Response#getResponseHeaderSegment <em>Response Header Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Response#getResponseClaimSegment <em>Response Claim Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Response#getResponseCoordinationofBenefitsOtherPayersSegment <em>Response Coordinationof Benefits Other Payers Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Response#getResponseDURPPSSegment <em>Response DURPPS Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Response#getResponseInsuranceSegment <em>Response Insurance Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Response#getResponseMessageSegment <em>Response Message Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Response#getResponsePatientSegment <em>Response Patient Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Response#getResponsePricingSegment <em>Response Pricing Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Response#getResponsePriorAuthorizationSegment <em>Response Prior Authorization Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponse()
 * @model
 * @generated
 */
public interface Response extends EObject {
	/**
	 * Returns the value of the '<em><b>Response Header Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Header Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Header Segment</em>' containment reference.
	 * @see #setResponseHeaderSegment(ResponseHeaderSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponse_ResponseHeaderSegment()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseHeaderSegment getResponseHeaderSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Response#getResponseHeaderSegment <em>Response Header Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Header Segment</em>' containment reference.
	 * @see #getResponseHeaderSegment()
	 * @generated
	 */
	void setResponseHeaderSegment(ResponseHeaderSegment value);

	/**
	 * Returns the value of the '<em><b>Response Claim Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Claim Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Claim Segment</em>' containment reference.
	 * @see #setResponseClaimSegment(ResponseClaimSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponse_ResponseClaimSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseClaimSegment getResponseClaimSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Response#getResponseClaimSegment <em>Response Claim Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Claim Segment</em>' containment reference.
	 * @see #getResponseClaimSegment()
	 * @generated
	 */
	void setResponseClaimSegment(ResponseClaimSegment value);

	/**
	 * Returns the value of the '<em><b>Response Coordinationof Benefits Other Payers Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Coordinationof Benefits Other Payers Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Coordinationof Benefits Other Payers Segment</em>' containment reference.
	 * @see #setResponseCoordinationofBenefitsOtherPayersSegment(ResponseCoordinationofBenefitsOtherPayersSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponse_ResponseCoordinationofBenefitsOtherPayersSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseCoordinationofBenefitsOtherPayersSegment getResponseCoordinationofBenefitsOtherPayersSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Response#getResponseCoordinationofBenefitsOtherPayersSegment <em>Response Coordinationof Benefits Other Payers Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Coordinationof Benefits Other Payers Segment</em>' containment reference.
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 */
	void setResponseCoordinationofBenefitsOtherPayersSegment(ResponseCoordinationofBenefitsOtherPayersSegment value);

	/**
	 * Returns the value of the '<em><b>Response DURPPS Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response DURPPS Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response DURPPS Segment</em>' containment reference.
	 * @see #setResponseDURPPSSegment(ResponseDURPPSSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponse_ResponseDURPPSSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseDURPPSSegment getResponseDURPPSSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Response#getResponseDURPPSSegment <em>Response DURPPS Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response DURPPS Segment</em>' containment reference.
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 */
	void setResponseDURPPSSegment(ResponseDURPPSSegment value);

	/**
	 * Returns the value of the '<em><b>Response Insurance Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Insurance Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Insurance Segment</em>' containment reference.
	 * @see #setResponseInsuranceSegment(ResponseInsuranceSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponse_ResponseInsuranceSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseInsuranceSegment getResponseInsuranceSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Response#getResponseInsuranceSegment <em>Response Insurance Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Insurance Segment</em>' containment reference.
	 * @see #getResponseInsuranceSegment()
	 * @generated
	 */
	void setResponseInsuranceSegment(ResponseInsuranceSegment value);

	/**
	 * Returns the value of the '<em><b>Response Message Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Message Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Message Segment</em>' containment reference.
	 * @see #setResponseMessageSegment(ResponseMessageSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponse_ResponseMessageSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponseMessageSegment getResponseMessageSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Response#getResponseMessageSegment <em>Response Message Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Message Segment</em>' containment reference.
	 * @see #getResponseMessageSegment()
	 * @generated
	 */
	void setResponseMessageSegment(ResponseMessageSegment value);

	/**
	 * Returns the value of the '<em><b>Response Patient Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Patient Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Patient Segment</em>' containment reference.
	 * @see #setResponsePatientSegment(ResponsePatientSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponse_ResponsePatientSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponsePatientSegment getResponsePatientSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Response#getResponsePatientSegment <em>Response Patient Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Patient Segment</em>' containment reference.
	 * @see #getResponsePatientSegment()
	 * @generated
	 */
	void setResponsePatientSegment(ResponsePatientSegment value);

	/**
	 * Returns the value of the '<em><b>Response Pricing Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Pricing Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Pricing Segment</em>' containment reference.
	 * @see #setResponsePricingSegment(ResponsePricingSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponse_ResponsePricingSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponsePricingSegment getResponsePricingSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Response#getResponsePricingSegment <em>Response Pricing Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Pricing Segment</em>' containment reference.
	 * @see #getResponsePricingSegment()
	 * @generated
	 */
	void setResponsePricingSegment(ResponsePricingSegment value);

	/**
	 * Returns the value of the '<em><b>Response Prior Authorization Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Response Prior Authorization Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Response Prior Authorization Segment</em>' containment reference.
	 * @see #setResponsePriorAuthorizationSegment(ResponsePriorAuthorizationSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getResponse_ResponsePriorAuthorizationSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ResponsePriorAuthorizationSegment getResponsePriorAuthorizationSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Response#getResponsePriorAuthorizationSegment <em>Response Prior Authorization Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Response Prior Authorization Segment</em>' containment reference.
	 * @see #getResponsePriorAuthorizationSegment()
	 * @generated
	 */
	void setResponsePriorAuthorizationSegment(ResponsePriorAuthorizationSegment value);

} // Response
