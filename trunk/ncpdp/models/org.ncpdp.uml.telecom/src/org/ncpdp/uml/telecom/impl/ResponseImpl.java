/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom.impl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
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
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseImpl#getResponseHeaderSegment <em>Response Header Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseImpl#getResponseClaimSegment <em>Response Claim Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseImpl#getResponseCoordinationofBenefitsOtherPayersSegment <em>Response Coordinationof Benefits Other Payers Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseImpl#getResponseDURPPSSegment <em>Response DURPPS Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseImpl#getResponseInsuranceSegment <em>Response Insurance Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseImpl#getResponseMessageSegment <em>Response Message Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseImpl#getResponsePatientSegment <em>Response Patient Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseImpl#getResponsePricingSegment <em>Response Pricing Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponseImpl#getResponsePriorAuthorizationSegment <em>Response Prior Authorization Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponseImpl extends EObjectImpl implements Response {
	/**
	 * The cached value of the '{@link #getResponseHeaderSegment() <em>Response Header Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseHeaderSegment()
	 * @generated
	 * @ordered
	 */
	protected ResponseHeaderSegment responseHeaderSegment;

	/**
	 * The cached value of the '{@link #getResponseClaimSegment() <em>Response Claim Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseClaimSegment()
	 * @generated
	 * @ordered
	 */
	protected ResponseClaimSegment responseClaimSegment;

	/**
	 * The cached value of the '{@link #getResponseCoordinationofBenefitsOtherPayersSegment() <em>Response Coordinationof Benefits Other Payers Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseCoordinationofBenefitsOtherPayersSegment()
	 * @generated
	 * @ordered
	 */
	protected ResponseCoordinationofBenefitsOtherPayersSegment responseCoordinationofBenefitsOtherPayersSegment;

	/**
	 * The cached value of the '{@link #getResponseDURPPSSegment() <em>Response DURPPS Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseDURPPSSegment()
	 * @generated
	 * @ordered
	 */
	protected ResponseDURPPSSegment responseDURPPSSegment;

	/**
	 * The cached value of the '{@link #getResponseInsuranceSegment() <em>Response Insurance Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseInsuranceSegment()
	 * @generated
	 * @ordered
	 */
	protected ResponseInsuranceSegment responseInsuranceSegment;

	/**
	 * The cached value of the '{@link #getResponseMessageSegment() <em>Response Message Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponseMessageSegment()
	 * @generated
	 * @ordered
	 */
	protected ResponseMessageSegment responseMessageSegment;

	/**
	 * The cached value of the '{@link #getResponsePatientSegment() <em>Response Patient Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsePatientSegment()
	 * @generated
	 * @ordered
	 */
	protected ResponsePatientSegment responsePatientSegment;

	/**
	 * The cached value of the '{@link #getResponsePricingSegment() <em>Response Pricing Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsePricingSegment()
	 * @generated
	 * @ordered
	 */
	protected ResponsePricingSegment responsePricingSegment;

	/**
	 * The cached value of the '{@link #getResponsePriorAuthorizationSegment() <em>Response Prior Authorization Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResponsePriorAuthorizationSegment()
	 * @generated
	 * @ordered
	 */
	protected ResponsePriorAuthorizationSegment responsePriorAuthorizationSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponseImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.RESPONSE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseHeaderSegment getResponseHeaderSegment() {
		return responseHeaderSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseHeaderSegment(ResponseHeaderSegment newResponseHeaderSegment, NotificationChain msgs) {
		ResponseHeaderSegment oldResponseHeaderSegment = responseHeaderSegment;
		responseHeaderSegment = newResponseHeaderSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_HEADER_SEGMENT, oldResponseHeaderSegment, newResponseHeaderSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseHeaderSegment(ResponseHeaderSegment newResponseHeaderSegment) {
		if (newResponseHeaderSegment != responseHeaderSegment) {
			NotificationChain msgs = null;
			if (responseHeaderSegment != null)
				msgs = ((InternalEObject)responseHeaderSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_HEADER_SEGMENT, null, msgs);
			if (newResponseHeaderSegment != null)
				msgs = ((InternalEObject)newResponseHeaderSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_HEADER_SEGMENT, null, msgs);
			msgs = basicSetResponseHeaderSegment(newResponseHeaderSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_HEADER_SEGMENT, newResponseHeaderSegment, newResponseHeaderSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseClaimSegment getResponseClaimSegment() {
		return responseClaimSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseClaimSegment(ResponseClaimSegment newResponseClaimSegment, NotificationChain msgs) {
		ResponseClaimSegment oldResponseClaimSegment = responseClaimSegment;
		responseClaimSegment = newResponseClaimSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_CLAIM_SEGMENT, oldResponseClaimSegment, newResponseClaimSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseClaimSegment(ResponseClaimSegment newResponseClaimSegment) {
		if (newResponseClaimSegment != responseClaimSegment) {
			NotificationChain msgs = null;
			if (responseClaimSegment != null)
				msgs = ((InternalEObject)responseClaimSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_CLAIM_SEGMENT, null, msgs);
			if (newResponseClaimSegment != null)
				msgs = ((InternalEObject)newResponseClaimSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_CLAIM_SEGMENT, null, msgs);
			msgs = basicSetResponseClaimSegment(newResponseClaimSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_CLAIM_SEGMENT, newResponseClaimSegment, newResponseClaimSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseCoordinationofBenefitsOtherPayersSegment getResponseCoordinationofBenefitsOtherPayersSegment() {
		return responseCoordinationofBenefitsOtherPayersSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseCoordinationofBenefitsOtherPayersSegment(ResponseCoordinationofBenefitsOtherPayersSegment newResponseCoordinationofBenefitsOtherPayersSegment, NotificationChain msgs) {
		ResponseCoordinationofBenefitsOtherPayersSegment oldResponseCoordinationofBenefitsOtherPayersSegment = responseCoordinationofBenefitsOtherPayersSegment;
		responseCoordinationofBenefitsOtherPayersSegment = newResponseCoordinationofBenefitsOtherPayersSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT, oldResponseCoordinationofBenefitsOtherPayersSegment, newResponseCoordinationofBenefitsOtherPayersSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseCoordinationofBenefitsOtherPayersSegment(ResponseCoordinationofBenefitsOtherPayersSegment newResponseCoordinationofBenefitsOtherPayersSegment) {
		if (newResponseCoordinationofBenefitsOtherPayersSegment != responseCoordinationofBenefitsOtherPayersSegment) {
			NotificationChain msgs = null;
			if (responseCoordinationofBenefitsOtherPayersSegment != null)
				msgs = ((InternalEObject)responseCoordinationofBenefitsOtherPayersSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT, null, msgs);
			if (newResponseCoordinationofBenefitsOtherPayersSegment != null)
				msgs = ((InternalEObject)newResponseCoordinationofBenefitsOtherPayersSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT, null, msgs);
			msgs = basicSetResponseCoordinationofBenefitsOtherPayersSegment(newResponseCoordinationofBenefitsOtherPayersSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT, newResponseCoordinationofBenefitsOtherPayersSegment, newResponseCoordinationofBenefitsOtherPayersSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseDURPPSSegment getResponseDURPPSSegment() {
		return responseDURPPSSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseDURPPSSegment(ResponseDURPPSSegment newResponseDURPPSSegment, NotificationChain msgs) {
		ResponseDURPPSSegment oldResponseDURPPSSegment = responseDURPPSSegment;
		responseDURPPSSegment = newResponseDURPPSSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_DURPPS_SEGMENT, oldResponseDURPPSSegment, newResponseDURPPSSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseDURPPSSegment(ResponseDURPPSSegment newResponseDURPPSSegment) {
		if (newResponseDURPPSSegment != responseDURPPSSegment) {
			NotificationChain msgs = null;
			if (responseDURPPSSegment != null)
				msgs = ((InternalEObject)responseDURPPSSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_DURPPS_SEGMENT, null, msgs);
			if (newResponseDURPPSSegment != null)
				msgs = ((InternalEObject)newResponseDURPPSSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_DURPPS_SEGMENT, null, msgs);
			msgs = basicSetResponseDURPPSSegment(newResponseDURPPSSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_DURPPS_SEGMENT, newResponseDURPPSSegment, newResponseDURPPSSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseInsuranceSegment getResponseInsuranceSegment() {
		return responseInsuranceSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseInsuranceSegment(ResponseInsuranceSegment newResponseInsuranceSegment, NotificationChain msgs) {
		ResponseInsuranceSegment oldResponseInsuranceSegment = responseInsuranceSegment;
		responseInsuranceSegment = newResponseInsuranceSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_INSURANCE_SEGMENT, oldResponseInsuranceSegment, newResponseInsuranceSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseInsuranceSegment(ResponseInsuranceSegment newResponseInsuranceSegment) {
		if (newResponseInsuranceSegment != responseInsuranceSegment) {
			NotificationChain msgs = null;
			if (responseInsuranceSegment != null)
				msgs = ((InternalEObject)responseInsuranceSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_INSURANCE_SEGMENT, null, msgs);
			if (newResponseInsuranceSegment != null)
				msgs = ((InternalEObject)newResponseInsuranceSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_INSURANCE_SEGMENT, null, msgs);
			msgs = basicSetResponseInsuranceSegment(newResponseInsuranceSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_INSURANCE_SEGMENT, newResponseInsuranceSegment, newResponseInsuranceSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponseMessageSegment getResponseMessageSegment() {
		return responseMessageSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponseMessageSegment(ResponseMessageSegment newResponseMessageSegment, NotificationChain msgs) {
		ResponseMessageSegment oldResponseMessageSegment = responseMessageSegment;
		responseMessageSegment = newResponseMessageSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_MESSAGE_SEGMENT, oldResponseMessageSegment, newResponseMessageSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponseMessageSegment(ResponseMessageSegment newResponseMessageSegment) {
		if (newResponseMessageSegment != responseMessageSegment) {
			NotificationChain msgs = null;
			if (responseMessageSegment != null)
				msgs = ((InternalEObject)responseMessageSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_MESSAGE_SEGMENT, null, msgs);
			if (newResponseMessageSegment != null)
				msgs = ((InternalEObject)newResponseMessageSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_MESSAGE_SEGMENT, null, msgs);
			msgs = basicSetResponseMessageSegment(newResponseMessageSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_MESSAGE_SEGMENT, newResponseMessageSegment, newResponseMessageSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsePatientSegment getResponsePatientSegment() {
		return responsePatientSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsePatientSegment(ResponsePatientSegment newResponsePatientSegment, NotificationChain msgs) {
		ResponsePatientSegment oldResponsePatientSegment = responsePatientSegment;
		responsePatientSegment = newResponsePatientSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_PATIENT_SEGMENT, oldResponsePatientSegment, newResponsePatientSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsePatientSegment(ResponsePatientSegment newResponsePatientSegment) {
		if (newResponsePatientSegment != responsePatientSegment) {
			NotificationChain msgs = null;
			if (responsePatientSegment != null)
				msgs = ((InternalEObject)responsePatientSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_PATIENT_SEGMENT, null, msgs);
			if (newResponsePatientSegment != null)
				msgs = ((InternalEObject)newResponsePatientSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_PATIENT_SEGMENT, null, msgs);
			msgs = basicSetResponsePatientSegment(newResponsePatientSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_PATIENT_SEGMENT, newResponsePatientSegment, newResponsePatientSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsePricingSegment getResponsePricingSegment() {
		return responsePricingSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsePricingSegment(ResponsePricingSegment newResponsePricingSegment, NotificationChain msgs) {
		ResponsePricingSegment oldResponsePricingSegment = responsePricingSegment;
		responsePricingSegment = newResponsePricingSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_PRICING_SEGMENT, oldResponsePricingSegment, newResponsePricingSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsePricingSegment(ResponsePricingSegment newResponsePricingSegment) {
		if (newResponsePricingSegment != responsePricingSegment) {
			NotificationChain msgs = null;
			if (responsePricingSegment != null)
				msgs = ((InternalEObject)responsePricingSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_PRICING_SEGMENT, null, msgs);
			if (newResponsePricingSegment != null)
				msgs = ((InternalEObject)newResponsePricingSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_PRICING_SEGMENT, null, msgs);
			msgs = basicSetResponsePricingSegment(newResponsePricingSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_PRICING_SEGMENT, newResponsePricingSegment, newResponsePricingSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ResponsePriorAuthorizationSegment getResponsePriorAuthorizationSegment() {
		return responsePriorAuthorizationSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetResponsePriorAuthorizationSegment(ResponsePriorAuthorizationSegment newResponsePriorAuthorizationSegment, NotificationChain msgs) {
		ResponsePriorAuthorizationSegment oldResponsePriorAuthorizationSegment = responsePriorAuthorizationSegment;
		responsePriorAuthorizationSegment = newResponsePriorAuthorizationSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT, oldResponsePriorAuthorizationSegment, newResponsePriorAuthorizationSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResponsePriorAuthorizationSegment(ResponsePriorAuthorizationSegment newResponsePriorAuthorizationSegment) {
		if (newResponsePriorAuthorizationSegment != responsePriorAuthorizationSegment) {
			NotificationChain msgs = null;
			if (responsePriorAuthorizationSegment != null)
				msgs = ((InternalEObject)responsePriorAuthorizationSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT, null, msgs);
			if (newResponsePriorAuthorizationSegment != null)
				msgs = ((InternalEObject)newResponsePriorAuthorizationSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT, null, msgs);
			msgs = basicSetResponsePriorAuthorizationSegment(newResponsePriorAuthorizationSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT, newResponsePriorAuthorizationSegment, newResponsePriorAuthorizationSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.RESPONSE__RESPONSE_HEADER_SEGMENT:
				return basicSetResponseHeaderSegment(null, msgs);
			case TelecomPackage.RESPONSE__RESPONSE_CLAIM_SEGMENT:
				return basicSetResponseClaimSegment(null, msgs);
			case TelecomPackage.RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT:
				return basicSetResponseCoordinationofBenefitsOtherPayersSegment(null, msgs);
			case TelecomPackage.RESPONSE__RESPONSE_DURPPS_SEGMENT:
				return basicSetResponseDURPPSSegment(null, msgs);
			case TelecomPackage.RESPONSE__RESPONSE_INSURANCE_SEGMENT:
				return basicSetResponseInsuranceSegment(null, msgs);
			case TelecomPackage.RESPONSE__RESPONSE_MESSAGE_SEGMENT:
				return basicSetResponseMessageSegment(null, msgs);
			case TelecomPackage.RESPONSE__RESPONSE_PATIENT_SEGMENT:
				return basicSetResponsePatientSegment(null, msgs);
			case TelecomPackage.RESPONSE__RESPONSE_PRICING_SEGMENT:
				return basicSetResponsePricingSegment(null, msgs);
			case TelecomPackage.RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT:
				return basicSetResponsePriorAuthorizationSegment(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case TelecomPackage.RESPONSE__RESPONSE_HEADER_SEGMENT:
				return getResponseHeaderSegment();
			case TelecomPackage.RESPONSE__RESPONSE_CLAIM_SEGMENT:
				return getResponseClaimSegment();
			case TelecomPackage.RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT:
				return getResponseCoordinationofBenefitsOtherPayersSegment();
			case TelecomPackage.RESPONSE__RESPONSE_DURPPS_SEGMENT:
				return getResponseDURPPSSegment();
			case TelecomPackage.RESPONSE__RESPONSE_INSURANCE_SEGMENT:
				return getResponseInsuranceSegment();
			case TelecomPackage.RESPONSE__RESPONSE_MESSAGE_SEGMENT:
				return getResponseMessageSegment();
			case TelecomPackage.RESPONSE__RESPONSE_PATIENT_SEGMENT:
				return getResponsePatientSegment();
			case TelecomPackage.RESPONSE__RESPONSE_PRICING_SEGMENT:
				return getResponsePricingSegment();
			case TelecomPackage.RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT:
				return getResponsePriorAuthorizationSegment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelecomPackage.RESPONSE__RESPONSE_HEADER_SEGMENT:
				setResponseHeaderSegment((ResponseHeaderSegment)newValue);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_CLAIM_SEGMENT:
				setResponseClaimSegment((ResponseClaimSegment)newValue);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT:
				setResponseCoordinationofBenefitsOtherPayersSegment((ResponseCoordinationofBenefitsOtherPayersSegment)newValue);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_DURPPS_SEGMENT:
				setResponseDURPPSSegment((ResponseDURPPSSegment)newValue);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_INSURANCE_SEGMENT:
				setResponseInsuranceSegment((ResponseInsuranceSegment)newValue);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_MESSAGE_SEGMENT:
				setResponseMessageSegment((ResponseMessageSegment)newValue);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_PATIENT_SEGMENT:
				setResponsePatientSegment((ResponsePatientSegment)newValue);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_PRICING_SEGMENT:
				setResponsePricingSegment((ResponsePricingSegment)newValue);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT:
				setResponsePriorAuthorizationSegment((ResponsePriorAuthorizationSegment)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case TelecomPackage.RESPONSE__RESPONSE_HEADER_SEGMENT:
				setResponseHeaderSegment((ResponseHeaderSegment)null);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_CLAIM_SEGMENT:
				setResponseClaimSegment((ResponseClaimSegment)null);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT:
				setResponseCoordinationofBenefitsOtherPayersSegment((ResponseCoordinationofBenefitsOtherPayersSegment)null);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_DURPPS_SEGMENT:
				setResponseDURPPSSegment((ResponseDURPPSSegment)null);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_INSURANCE_SEGMENT:
				setResponseInsuranceSegment((ResponseInsuranceSegment)null);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_MESSAGE_SEGMENT:
				setResponseMessageSegment((ResponseMessageSegment)null);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_PATIENT_SEGMENT:
				setResponsePatientSegment((ResponsePatientSegment)null);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_PRICING_SEGMENT:
				setResponsePricingSegment((ResponsePricingSegment)null);
				return;
			case TelecomPackage.RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT:
				setResponsePriorAuthorizationSegment((ResponsePriorAuthorizationSegment)null);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case TelecomPackage.RESPONSE__RESPONSE_HEADER_SEGMENT:
				return responseHeaderSegment != null;
			case TelecomPackage.RESPONSE__RESPONSE_CLAIM_SEGMENT:
				return responseClaimSegment != null;
			case TelecomPackage.RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT:
				return responseCoordinationofBenefitsOtherPayersSegment != null;
			case TelecomPackage.RESPONSE__RESPONSE_DURPPS_SEGMENT:
				return responseDURPPSSegment != null;
			case TelecomPackage.RESPONSE__RESPONSE_INSURANCE_SEGMENT:
				return responseInsuranceSegment != null;
			case TelecomPackage.RESPONSE__RESPONSE_MESSAGE_SEGMENT:
				return responseMessageSegment != null;
			case TelecomPackage.RESPONSE__RESPONSE_PATIENT_SEGMENT:
				return responsePatientSegment != null;
			case TelecomPackage.RESPONSE__RESPONSE_PRICING_SEGMENT:
				return responsePricingSegment != null;
			case TelecomPackage.RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT:
				return responsePriorAuthorizationSegment != null;
		}
		return super.eIsSet(featureID);
	}

} //ResponseImpl
