/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom.impl;

import java.util.Collection;
import java.util.Map;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.EObjectImpl;
import org.eclipse.emf.ecore.plugin.EcorePlugin;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.EObjectValidator;
import org.eclipse.emf.ecore.util.InternalEList;
import org.eclipse.ocl.ParserException;
import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;
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
import org.ncpdp.uml.telecom.TelecomPackage;
import org.ncpdp.uml.telecom.TransactionHeaderSegment;
import org.ncpdp.uml.telecom.Transmission;
import org.ncpdp.uml.telecom.WorkersCompensationSegment;
import org.ncpdp.uml.telecom.util.TelecomValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transmission</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getTransactionHeaderSegment <em>Transaction Header Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getWorkersCompensationSegment <em>Workers Compensation Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getPriorAuthorizationSegment <em>Prior Authorization Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getPricingSegment <em>Pricing Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getPrescriberSegment <em>Prescriber Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getPharmacyProviderSegment <em>Pharmacy Provider Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getPatientSegment <em>Patient Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getNarrativeSegment <em>Narrative Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getInsuranceSegment <em>Insurance Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getFacilitySegment <em>Facility Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getDURPPSSegment <em>DURPPS Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getCouponSegment <em>Coupon Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getCoordinationofBenefitsOtherPaymentsSegment <em>Coordinationof Benefits Other Payments Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getClinicalSegment <em>Clinical Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getClaimSegment <em>Claim Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getAdditionalDocumentationSegment <em>Additional Documentation Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.TransmissionImpl#getCompoundSegment <em>Compound Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TransmissionImpl extends EObjectImpl implements Transmission {
	/**
	 * The cached value of the '{@link #getTransactionHeaderSegment() <em>Transaction Header Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 * @ordered
	 */
	protected TransactionHeaderSegment transactionHeaderSegment;

	/**
	 * The cached value of the '{@link #getWorkersCompensationSegment() <em>Workers Compensation Segment</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 * @ordered
	 */
	protected EList<WorkersCompensationSegment> workersCompensationSegment;

	/**
	 * The cached value of the '{@link #getPriorAuthorizationSegment() <em>Prior Authorization Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationSegment()
	 * @generated
	 * @ordered
	 */
	protected PriorAuthorizationSegment priorAuthorizationSegment;

	/**
	 * The cached value of the '{@link #getPricingSegment() <em>Pricing Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPricingSegment()
	 * @generated
	 * @ordered
	 */
	protected PricingSegment pricingSegment;

	/**
	 * The cached value of the '{@link #getPrescriberSegment() <em>Prescriber Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriberSegment()
	 * @generated
	 * @ordered
	 */
	protected PrescriberSegment prescriberSegment;

	/**
	 * The cached value of the '{@link #getPharmacyProviderSegment() <em>Pharmacy Provider Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmacyProviderSegment()
	 * @generated
	 * @ordered
	 */
	protected PharmacyProviderSegment pharmacyProviderSegment;

	/**
	 * The cached value of the '{@link #getPatientSegment() <em>Patient Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientSegment()
	 * @generated
	 * @ordered
	 */
	protected PatientSegment patientSegment;

	/**
	 * The cached value of the '{@link #getNarrativeSegment() <em>Narrative Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarrativeSegment()
	 * @generated
	 * @ordered
	 */
	protected NarrativeSegment narrativeSegment;

	/**
	 * The cached value of the '{@link #getInsuranceSegment() <em>Insurance Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInsuranceSegment()
	 * @generated
	 * @ordered
	 */
	protected InsuranceSegment insuranceSegment;

	/**
	 * The cached value of the '{@link #getFacilitySegment() <em>Facility Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFacilitySegment()
	 * @generated
	 * @ordered
	 */
	protected FacilitySegment facilitySegment;

	/**
	 * The cached value of the '{@link #getDURPPSSegment() <em>DURPPS Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDURPPSSegment()
	 * @generated
	 * @ordered
	 */
	protected DURPPSSegment dURPPSSegment;

	/**
	 * The cached value of the '{@link #getCouponSegment() <em>Coupon Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouponSegment()
	 * @generated
	 * @ordered
	 */
	protected CouponSegment couponSegment;

	/**
	 * The cached value of the '{@link #getCoordinationofBenefitsOtherPaymentsSegment() <em>Coordinationof Benefits Other Payments Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 * @ordered
	 */
	protected CoordinationofBenefitsOtherPaymentsSegment coordinationofBenefitsOtherPaymentsSegment;

	/**
	 * The cached value of the '{@link #getClinicalSegment() <em>Clinical Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalSegment()
	 * @generated
	 * @ordered
	 */
	protected ClinicalSegment clinicalSegment;

	/**
	 * The cached value of the '{@link #getClaimSegment() <em>Claim Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClaimSegment()
	 * @generated
	 * @ordered
	 */
	protected ClaimSegment claimSegment;

	/**
	 * The cached value of the '{@link #getAdditionalDocumentationSegment() <em>Additional Documentation Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAdditionalDocumentationSegment()
	 * @generated
	 * @ordered
	 */
	protected AdditionalDocumentationSegment additionalDocumentationSegment;

	/**
	 * The cached value of the '{@link #getCompoundSegment() <em>Compound Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundSegment()
	 * @generated
	 * @ordered
	 */
	protected CompoundSegment compoundSegment;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransmissionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.TRANSMISSION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransactionHeaderSegment getTransactionHeaderSegment() {
		return transactionHeaderSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransactionHeaderSegment(TransactionHeaderSegment newTransactionHeaderSegment, NotificationChain msgs) {
		TransactionHeaderSegment oldTransactionHeaderSegment = transactionHeaderSegment;
		transactionHeaderSegment = newTransactionHeaderSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__TRANSACTION_HEADER_SEGMENT, oldTransactionHeaderSegment, newTransactionHeaderSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransactionHeaderSegment(TransactionHeaderSegment newTransactionHeaderSegment) {
		if (newTransactionHeaderSegment != transactionHeaderSegment) {
			NotificationChain msgs = null;
			if (transactionHeaderSegment != null)
				msgs = ((InternalEObject)transactionHeaderSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__TRANSACTION_HEADER_SEGMENT, null, msgs);
			if (newTransactionHeaderSegment != null)
				msgs = ((InternalEObject)newTransactionHeaderSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__TRANSACTION_HEADER_SEGMENT, null, msgs);
			msgs = basicSetTransactionHeaderSegment(newTransactionHeaderSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__TRANSACTION_HEADER_SEGMENT, newTransactionHeaderSegment, newTransactionHeaderSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<WorkersCompensationSegment> getWorkersCompensationSegment() {
		if (workersCompensationSegment == null) {
			workersCompensationSegment = new EObjectContainmentEList<WorkersCompensationSegment>(WorkersCompensationSegment.class, this, TelecomPackage.TRANSMISSION__WORKERS_COMPENSATION_SEGMENT);
		}
		return workersCompensationSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PriorAuthorizationSegment getPriorAuthorizationSegment() {
		return priorAuthorizationSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPriorAuthorizationSegment(PriorAuthorizationSegment newPriorAuthorizationSegment, NotificationChain msgs) {
		PriorAuthorizationSegment oldPriorAuthorizationSegment = priorAuthorizationSegment;
		priorAuthorizationSegment = newPriorAuthorizationSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT, oldPriorAuthorizationSegment, newPriorAuthorizationSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPriorAuthorizationSegment(PriorAuthorizationSegment newPriorAuthorizationSegment) {
		if (newPriorAuthorizationSegment != priorAuthorizationSegment) {
			NotificationChain msgs = null;
			if (priorAuthorizationSegment != null)
				msgs = ((InternalEObject)priorAuthorizationSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT, null, msgs);
			if (newPriorAuthorizationSegment != null)
				msgs = ((InternalEObject)newPriorAuthorizationSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT, null, msgs);
			msgs = basicSetPriorAuthorizationSegment(newPriorAuthorizationSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT, newPriorAuthorizationSegment, newPriorAuthorizationSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PricingSegment getPricingSegment() {
		return pricingSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPricingSegment(PricingSegment newPricingSegment, NotificationChain msgs) {
		PricingSegment oldPricingSegment = pricingSegment;
		pricingSegment = newPricingSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__PRICING_SEGMENT, oldPricingSegment, newPricingSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPricingSegment(PricingSegment newPricingSegment) {
		if (newPricingSegment != pricingSegment) {
			NotificationChain msgs = null;
			if (pricingSegment != null)
				msgs = ((InternalEObject)pricingSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__PRICING_SEGMENT, null, msgs);
			if (newPricingSegment != null)
				msgs = ((InternalEObject)newPricingSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__PRICING_SEGMENT, null, msgs);
			msgs = basicSetPricingSegment(newPricingSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__PRICING_SEGMENT, newPricingSegment, newPricingSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PrescriberSegment getPrescriberSegment() {
		return prescriberSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPrescriberSegment(PrescriberSegment newPrescriberSegment, NotificationChain msgs) {
		PrescriberSegment oldPrescriberSegment = prescriberSegment;
		prescriberSegment = newPrescriberSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__PRESCRIBER_SEGMENT, oldPrescriberSegment, newPrescriberSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrescriberSegment(PrescriberSegment newPrescriberSegment) {
		if (newPrescriberSegment != prescriberSegment) {
			NotificationChain msgs = null;
			if (prescriberSegment != null)
				msgs = ((InternalEObject)prescriberSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__PRESCRIBER_SEGMENT, null, msgs);
			if (newPrescriberSegment != null)
				msgs = ((InternalEObject)newPrescriberSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__PRESCRIBER_SEGMENT, null, msgs);
			msgs = basicSetPrescriberSegment(newPrescriberSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__PRESCRIBER_SEGMENT, newPrescriberSegment, newPrescriberSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PharmacyProviderSegment getPharmacyProviderSegment() {
		return pharmacyProviderSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPharmacyProviderSegment(PharmacyProviderSegment newPharmacyProviderSegment, NotificationChain msgs) {
		PharmacyProviderSegment oldPharmacyProviderSegment = pharmacyProviderSegment;
		pharmacyProviderSegment = newPharmacyProviderSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__PHARMACY_PROVIDER_SEGMENT, oldPharmacyProviderSegment, newPharmacyProviderSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPharmacyProviderSegment(PharmacyProviderSegment newPharmacyProviderSegment) {
		if (newPharmacyProviderSegment != pharmacyProviderSegment) {
			NotificationChain msgs = null;
			if (pharmacyProviderSegment != null)
				msgs = ((InternalEObject)pharmacyProviderSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__PHARMACY_PROVIDER_SEGMENT, null, msgs);
			if (newPharmacyProviderSegment != null)
				msgs = ((InternalEObject)newPharmacyProviderSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__PHARMACY_PROVIDER_SEGMENT, null, msgs);
			msgs = basicSetPharmacyProviderSegment(newPharmacyProviderSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__PHARMACY_PROVIDER_SEGMENT, newPharmacyProviderSegment, newPharmacyProviderSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PatientSegment getPatientSegment() {
		return patientSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPatientSegment(PatientSegment newPatientSegment, NotificationChain msgs) {
		PatientSegment oldPatientSegment = patientSegment;
		patientSegment = newPatientSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__PATIENT_SEGMENT, oldPatientSegment, newPatientSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatientSegment(PatientSegment newPatientSegment) {
		if (newPatientSegment != patientSegment) {
			NotificationChain msgs = null;
			if (patientSegment != null)
				msgs = ((InternalEObject)patientSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__PATIENT_SEGMENT, null, msgs);
			if (newPatientSegment != null)
				msgs = ((InternalEObject)newPatientSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__PATIENT_SEGMENT, null, msgs);
			msgs = basicSetPatientSegment(newPatientSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__PATIENT_SEGMENT, newPatientSegment, newPatientSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NarrativeSegment getNarrativeSegment() {
		return narrativeSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetNarrativeSegment(NarrativeSegment newNarrativeSegment, NotificationChain msgs) {
		NarrativeSegment oldNarrativeSegment = narrativeSegment;
		narrativeSegment = newNarrativeSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__NARRATIVE_SEGMENT, oldNarrativeSegment, newNarrativeSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNarrativeSegment(NarrativeSegment newNarrativeSegment) {
		if (newNarrativeSegment != narrativeSegment) {
			NotificationChain msgs = null;
			if (narrativeSegment != null)
				msgs = ((InternalEObject)narrativeSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__NARRATIVE_SEGMENT, null, msgs);
			if (newNarrativeSegment != null)
				msgs = ((InternalEObject)newNarrativeSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__NARRATIVE_SEGMENT, null, msgs);
			msgs = basicSetNarrativeSegment(newNarrativeSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__NARRATIVE_SEGMENT, newNarrativeSegment, newNarrativeSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InsuranceSegment getInsuranceSegment() {
		return insuranceSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetInsuranceSegment(InsuranceSegment newInsuranceSegment, NotificationChain msgs) {
		InsuranceSegment oldInsuranceSegment = insuranceSegment;
		insuranceSegment = newInsuranceSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__INSURANCE_SEGMENT, oldInsuranceSegment, newInsuranceSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInsuranceSegment(InsuranceSegment newInsuranceSegment) {
		if (newInsuranceSegment != insuranceSegment) {
			NotificationChain msgs = null;
			if (insuranceSegment != null)
				msgs = ((InternalEObject)insuranceSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__INSURANCE_SEGMENT, null, msgs);
			if (newInsuranceSegment != null)
				msgs = ((InternalEObject)newInsuranceSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__INSURANCE_SEGMENT, null, msgs);
			msgs = basicSetInsuranceSegment(newInsuranceSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__INSURANCE_SEGMENT, newInsuranceSegment, newInsuranceSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FacilitySegment getFacilitySegment() {
		return facilitySegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFacilitySegment(FacilitySegment newFacilitySegment, NotificationChain msgs) {
		FacilitySegment oldFacilitySegment = facilitySegment;
		facilitySegment = newFacilitySegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__FACILITY_SEGMENT, oldFacilitySegment, newFacilitySegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFacilitySegment(FacilitySegment newFacilitySegment) {
		if (newFacilitySegment != facilitySegment) {
			NotificationChain msgs = null;
			if (facilitySegment != null)
				msgs = ((InternalEObject)facilitySegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__FACILITY_SEGMENT, null, msgs);
			if (newFacilitySegment != null)
				msgs = ((InternalEObject)newFacilitySegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__FACILITY_SEGMENT, null, msgs);
			msgs = basicSetFacilitySegment(newFacilitySegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__FACILITY_SEGMENT, newFacilitySegment, newFacilitySegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DURPPSSegment getDURPPSSegment() {
		return dURPPSSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDURPPSSegment(DURPPSSegment newDURPPSSegment, NotificationChain msgs) {
		DURPPSSegment oldDURPPSSegment = dURPPSSegment;
		dURPPSSegment = newDURPPSSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__DURPPS_SEGMENT, oldDURPPSSegment, newDURPPSSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDURPPSSegment(DURPPSSegment newDURPPSSegment) {
		if (newDURPPSSegment != dURPPSSegment) {
			NotificationChain msgs = null;
			if (dURPPSSegment != null)
				msgs = ((InternalEObject)dURPPSSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__DURPPS_SEGMENT, null, msgs);
			if (newDURPPSSegment != null)
				msgs = ((InternalEObject)newDURPPSSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__DURPPS_SEGMENT, null, msgs);
			msgs = basicSetDURPPSSegment(newDURPPSSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__DURPPS_SEGMENT, newDURPPSSegment, newDURPPSSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CouponSegment getCouponSegment() {
		return couponSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCouponSegment(CouponSegment newCouponSegment, NotificationChain msgs) {
		CouponSegment oldCouponSegment = couponSegment;
		couponSegment = newCouponSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__COUPON_SEGMENT, oldCouponSegment, newCouponSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCouponSegment(CouponSegment newCouponSegment) {
		if (newCouponSegment != couponSegment) {
			NotificationChain msgs = null;
			if (couponSegment != null)
				msgs = ((InternalEObject)couponSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__COUPON_SEGMENT, null, msgs);
			if (newCouponSegment != null)
				msgs = ((InternalEObject)newCouponSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__COUPON_SEGMENT, null, msgs);
			msgs = basicSetCouponSegment(newCouponSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__COUPON_SEGMENT, newCouponSegment, newCouponSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CoordinationofBenefitsOtherPaymentsSegment getCoordinationofBenefitsOtherPaymentsSegment() {
		return coordinationofBenefitsOtherPaymentsSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCoordinationofBenefitsOtherPaymentsSegment(CoordinationofBenefitsOtherPaymentsSegment newCoordinationofBenefitsOtherPaymentsSegment, NotificationChain msgs) {
		CoordinationofBenefitsOtherPaymentsSegment oldCoordinationofBenefitsOtherPaymentsSegment = coordinationofBenefitsOtherPaymentsSegment;
		coordinationofBenefitsOtherPaymentsSegment = newCoordinationofBenefitsOtherPaymentsSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT, oldCoordinationofBenefitsOtherPaymentsSegment, newCoordinationofBenefitsOtherPaymentsSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCoordinationofBenefitsOtherPaymentsSegment(CoordinationofBenefitsOtherPaymentsSegment newCoordinationofBenefitsOtherPaymentsSegment) {
		if (newCoordinationofBenefitsOtherPaymentsSegment != coordinationofBenefitsOtherPaymentsSegment) {
			NotificationChain msgs = null;
			if (coordinationofBenefitsOtherPaymentsSegment != null)
				msgs = ((InternalEObject)coordinationofBenefitsOtherPaymentsSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT, null, msgs);
			if (newCoordinationofBenefitsOtherPaymentsSegment != null)
				msgs = ((InternalEObject)newCoordinationofBenefitsOtherPaymentsSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT, null, msgs);
			msgs = basicSetCoordinationofBenefitsOtherPaymentsSegment(newCoordinationofBenefitsOtherPaymentsSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT, newCoordinationofBenefitsOtherPaymentsSegment, newCoordinationofBenefitsOtherPaymentsSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClinicalSegment getClinicalSegment() {
		return clinicalSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClinicalSegment(ClinicalSegment newClinicalSegment, NotificationChain msgs) {
		ClinicalSegment oldClinicalSegment = clinicalSegment;
		clinicalSegment = newClinicalSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__CLINICAL_SEGMENT, oldClinicalSegment, newClinicalSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClinicalSegment(ClinicalSegment newClinicalSegment) {
		if (newClinicalSegment != clinicalSegment) {
			NotificationChain msgs = null;
			if (clinicalSegment != null)
				msgs = ((InternalEObject)clinicalSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__CLINICAL_SEGMENT, null, msgs);
			if (newClinicalSegment != null)
				msgs = ((InternalEObject)newClinicalSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__CLINICAL_SEGMENT, null, msgs);
			msgs = basicSetClinicalSegment(newClinicalSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__CLINICAL_SEGMENT, newClinicalSegment, newClinicalSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ClaimSegment getClaimSegment() {
		return claimSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetClaimSegment(ClaimSegment newClaimSegment, NotificationChain msgs) {
		ClaimSegment oldClaimSegment = claimSegment;
		claimSegment = newClaimSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__CLAIM_SEGMENT, oldClaimSegment, newClaimSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setClaimSegment(ClaimSegment newClaimSegment) {
		if (newClaimSegment != claimSegment) {
			NotificationChain msgs = null;
			if (claimSegment != null)
				msgs = ((InternalEObject)claimSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__CLAIM_SEGMENT, null, msgs);
			if (newClaimSegment != null)
				msgs = ((InternalEObject)newClaimSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__CLAIM_SEGMENT, null, msgs);
			msgs = basicSetClaimSegment(newClaimSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__CLAIM_SEGMENT, newClaimSegment, newClaimSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public AdditionalDocumentationSegment getAdditionalDocumentationSegment() {
		return additionalDocumentationSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetAdditionalDocumentationSegment(AdditionalDocumentationSegment newAdditionalDocumentationSegment, NotificationChain msgs) {
		AdditionalDocumentationSegment oldAdditionalDocumentationSegment = additionalDocumentationSegment;
		additionalDocumentationSegment = newAdditionalDocumentationSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT, oldAdditionalDocumentationSegment, newAdditionalDocumentationSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAdditionalDocumentationSegment(AdditionalDocumentationSegment newAdditionalDocumentationSegment) {
		if (newAdditionalDocumentationSegment != additionalDocumentationSegment) {
			NotificationChain msgs = null;
			if (additionalDocumentationSegment != null)
				msgs = ((InternalEObject)additionalDocumentationSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT, null, msgs);
			if (newAdditionalDocumentationSegment != null)
				msgs = ((InternalEObject)newAdditionalDocumentationSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT, null, msgs);
			msgs = basicSetAdditionalDocumentationSegment(newAdditionalDocumentationSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT, newAdditionalDocumentationSegment, newAdditionalDocumentationSegment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public CompoundSegment getCompoundSegment() {
		return compoundSegment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetCompoundSegment(CompoundSegment newCompoundSegment, NotificationChain msgs) {
		CompoundSegment oldCompoundSegment = compoundSegment;
		compoundSegment = newCompoundSegment;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__COMPOUND_SEGMENT, oldCompoundSegment, newCompoundSegment);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCompoundSegment(CompoundSegment newCompoundSegment) {
		if (newCompoundSegment != compoundSegment) {
			NotificationChain msgs = null;
			if (compoundSegment != null)
				msgs = ((InternalEObject)compoundSegment).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__COMPOUND_SEGMENT, null, msgs);
			if (newCompoundSegment != null)
				msgs = ((InternalEObject)newCompoundSegment).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - TelecomPackage.TRANSMISSION__COMPOUND_SEGMENT, null, msgs);
			msgs = basicSetCompoundSegment(newCompoundSegment, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, TelecomPackage.TRANSMISSION__COMPOUND_SEGMENT, newCompoundSegment, newCompoundSegment));
	}

	/**
	 * The cached OCL expression body for the '{@link #TransmissionTransactionHeaderSegment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Transmission Transaction Header Segment</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TransmissionTransactionHeaderSegment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static final String TRANSMISSION_TRANSACTION_HEADER_SEGMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.transactionHeaderSegment.oclIsUndefined()";

	/**
	 * The cached OCL invariant for the '{@link #TransmissionTransactionHeaderSegment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Transmission Transaction Header Segment</em>}' invariant operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #TransmissionTransactionHeaderSegment(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
	 * @generated
	 * @ordered
	 */
	protected static Constraint TRANSMISSION_TRANSACTION_HEADER_SEGMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean TransmissionTransactionHeaderSegment(DiagnosticChain diagnostics, Map<Object, Object> context) {
		if (TRANSMISSION_TRANSACTION_HEADER_SEGMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
			OCL.Helper helper = EOCL_ENV.createOCLHelper();
			helper.setContext(TelecomPackage.Literals.TRANSMISSION);
			try {
				TRANSMISSION_TRANSACTION_HEADER_SEGMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(TRANSMISSION_TRANSACTION_HEADER_SEGMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
			}
			catch (ParserException pe) {
				throw new UnsupportedOperationException(pe.getLocalizedMessage());
			}
		}
		if (!EOCL_ENV.createQuery(TRANSMISSION_TRANSACTION_HEADER_SEGMENT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(this)) {
			if (diagnostics != null) {
				diagnostics.add
					(new BasicDiagnostic
						(Diagnostic.ERROR,
						 TelecomValidator.DIAGNOSTIC_SOURCE,
						 TelecomValidator.TRANSMISSION__TRANSMISSION_TRANSACTION_HEADER_SEGMENT,
						 EcorePlugin.INSTANCE.getString("_UI_GenericInvariant_diagnostic", new Object[] { "TransmissionTransactionHeaderSegment", EObjectValidator.getObjectLabel(this, context) }),
						 new Object [] { this }));
			}
			return false;
		}
		return true;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.TRANSMISSION__TRANSACTION_HEADER_SEGMENT:
				return basicSetTransactionHeaderSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__WORKERS_COMPENSATION_SEGMENT:
				return ((InternalEList<?>)getWorkersCompensationSegment()).basicRemove(otherEnd, msgs);
			case TelecomPackage.TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT:
				return basicSetPriorAuthorizationSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__PRICING_SEGMENT:
				return basicSetPricingSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__PRESCRIBER_SEGMENT:
				return basicSetPrescriberSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__PHARMACY_PROVIDER_SEGMENT:
				return basicSetPharmacyProviderSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__PATIENT_SEGMENT:
				return basicSetPatientSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__NARRATIVE_SEGMENT:
				return basicSetNarrativeSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__INSURANCE_SEGMENT:
				return basicSetInsuranceSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__FACILITY_SEGMENT:
				return basicSetFacilitySegment(null, msgs);
			case TelecomPackage.TRANSMISSION__DURPPS_SEGMENT:
				return basicSetDURPPSSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__COUPON_SEGMENT:
				return basicSetCouponSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT:
				return basicSetCoordinationofBenefitsOtherPaymentsSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__CLINICAL_SEGMENT:
				return basicSetClinicalSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__CLAIM_SEGMENT:
				return basicSetClaimSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT:
				return basicSetAdditionalDocumentationSegment(null, msgs);
			case TelecomPackage.TRANSMISSION__COMPOUND_SEGMENT:
				return basicSetCompoundSegment(null, msgs);
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
			case TelecomPackage.TRANSMISSION__TRANSACTION_HEADER_SEGMENT:
				return getTransactionHeaderSegment();
			case TelecomPackage.TRANSMISSION__WORKERS_COMPENSATION_SEGMENT:
				return getWorkersCompensationSegment();
			case TelecomPackage.TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT:
				return getPriorAuthorizationSegment();
			case TelecomPackage.TRANSMISSION__PRICING_SEGMENT:
				return getPricingSegment();
			case TelecomPackage.TRANSMISSION__PRESCRIBER_SEGMENT:
				return getPrescriberSegment();
			case TelecomPackage.TRANSMISSION__PHARMACY_PROVIDER_SEGMENT:
				return getPharmacyProviderSegment();
			case TelecomPackage.TRANSMISSION__PATIENT_SEGMENT:
				return getPatientSegment();
			case TelecomPackage.TRANSMISSION__NARRATIVE_SEGMENT:
				return getNarrativeSegment();
			case TelecomPackage.TRANSMISSION__INSURANCE_SEGMENT:
				return getInsuranceSegment();
			case TelecomPackage.TRANSMISSION__FACILITY_SEGMENT:
				return getFacilitySegment();
			case TelecomPackage.TRANSMISSION__DURPPS_SEGMENT:
				return getDURPPSSegment();
			case TelecomPackage.TRANSMISSION__COUPON_SEGMENT:
				return getCouponSegment();
			case TelecomPackage.TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT:
				return getCoordinationofBenefitsOtherPaymentsSegment();
			case TelecomPackage.TRANSMISSION__CLINICAL_SEGMENT:
				return getClinicalSegment();
			case TelecomPackage.TRANSMISSION__CLAIM_SEGMENT:
				return getClaimSegment();
			case TelecomPackage.TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT:
				return getAdditionalDocumentationSegment();
			case TelecomPackage.TRANSMISSION__COMPOUND_SEGMENT:
				return getCompoundSegment();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case TelecomPackage.TRANSMISSION__TRANSACTION_HEADER_SEGMENT:
				setTransactionHeaderSegment((TransactionHeaderSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__WORKERS_COMPENSATION_SEGMENT:
				getWorkersCompensationSegment().clear();
				getWorkersCompensationSegment().addAll((Collection<? extends WorkersCompensationSegment>)newValue);
				return;
			case TelecomPackage.TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT:
				setPriorAuthorizationSegment((PriorAuthorizationSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__PRICING_SEGMENT:
				setPricingSegment((PricingSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__PRESCRIBER_SEGMENT:
				setPrescriberSegment((PrescriberSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__PHARMACY_PROVIDER_SEGMENT:
				setPharmacyProviderSegment((PharmacyProviderSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__PATIENT_SEGMENT:
				setPatientSegment((PatientSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__NARRATIVE_SEGMENT:
				setNarrativeSegment((NarrativeSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__INSURANCE_SEGMENT:
				setInsuranceSegment((InsuranceSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__FACILITY_SEGMENT:
				setFacilitySegment((FacilitySegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__DURPPS_SEGMENT:
				setDURPPSSegment((DURPPSSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__COUPON_SEGMENT:
				setCouponSegment((CouponSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT:
				setCoordinationofBenefitsOtherPaymentsSegment((CoordinationofBenefitsOtherPaymentsSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__CLINICAL_SEGMENT:
				setClinicalSegment((ClinicalSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__CLAIM_SEGMENT:
				setClaimSegment((ClaimSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT:
				setAdditionalDocumentationSegment((AdditionalDocumentationSegment)newValue);
				return;
			case TelecomPackage.TRANSMISSION__COMPOUND_SEGMENT:
				setCompoundSegment((CompoundSegment)newValue);
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
			case TelecomPackage.TRANSMISSION__TRANSACTION_HEADER_SEGMENT:
				setTransactionHeaderSegment((TransactionHeaderSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__WORKERS_COMPENSATION_SEGMENT:
				getWorkersCompensationSegment().clear();
				return;
			case TelecomPackage.TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT:
				setPriorAuthorizationSegment((PriorAuthorizationSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__PRICING_SEGMENT:
				setPricingSegment((PricingSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__PRESCRIBER_SEGMENT:
				setPrescriberSegment((PrescriberSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__PHARMACY_PROVIDER_SEGMENT:
				setPharmacyProviderSegment((PharmacyProviderSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__PATIENT_SEGMENT:
				setPatientSegment((PatientSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__NARRATIVE_SEGMENT:
				setNarrativeSegment((NarrativeSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__INSURANCE_SEGMENT:
				setInsuranceSegment((InsuranceSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__FACILITY_SEGMENT:
				setFacilitySegment((FacilitySegment)null);
				return;
			case TelecomPackage.TRANSMISSION__DURPPS_SEGMENT:
				setDURPPSSegment((DURPPSSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__COUPON_SEGMENT:
				setCouponSegment((CouponSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT:
				setCoordinationofBenefitsOtherPaymentsSegment((CoordinationofBenefitsOtherPaymentsSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__CLINICAL_SEGMENT:
				setClinicalSegment((ClinicalSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__CLAIM_SEGMENT:
				setClaimSegment((ClaimSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT:
				setAdditionalDocumentationSegment((AdditionalDocumentationSegment)null);
				return;
			case TelecomPackage.TRANSMISSION__COMPOUND_SEGMENT:
				setCompoundSegment((CompoundSegment)null);
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
			case TelecomPackage.TRANSMISSION__TRANSACTION_HEADER_SEGMENT:
				return transactionHeaderSegment != null;
			case TelecomPackage.TRANSMISSION__WORKERS_COMPENSATION_SEGMENT:
				return workersCompensationSegment != null && !workersCompensationSegment.isEmpty();
			case TelecomPackage.TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT:
				return priorAuthorizationSegment != null;
			case TelecomPackage.TRANSMISSION__PRICING_SEGMENT:
				return pricingSegment != null;
			case TelecomPackage.TRANSMISSION__PRESCRIBER_SEGMENT:
				return prescriberSegment != null;
			case TelecomPackage.TRANSMISSION__PHARMACY_PROVIDER_SEGMENT:
				return pharmacyProviderSegment != null;
			case TelecomPackage.TRANSMISSION__PATIENT_SEGMENT:
				return patientSegment != null;
			case TelecomPackage.TRANSMISSION__NARRATIVE_SEGMENT:
				return narrativeSegment != null;
			case TelecomPackage.TRANSMISSION__INSURANCE_SEGMENT:
				return insuranceSegment != null;
			case TelecomPackage.TRANSMISSION__FACILITY_SEGMENT:
				return facilitySegment != null;
			case TelecomPackage.TRANSMISSION__DURPPS_SEGMENT:
				return dURPPSSegment != null;
			case TelecomPackage.TRANSMISSION__COUPON_SEGMENT:
				return couponSegment != null;
			case TelecomPackage.TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT:
				return coordinationofBenefitsOtherPaymentsSegment != null;
			case TelecomPackage.TRANSMISSION__CLINICAL_SEGMENT:
				return clinicalSegment != null;
			case TelecomPackage.TRANSMISSION__CLAIM_SEGMENT:
				return claimSegment != null;
			case TelecomPackage.TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT:
				return additionalDocumentationSegment != null;
			case TelecomPackage.TRANSMISSION__COMPOUND_SEGMENT:
				return compoundSegment != null;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * The cached environment for evaluating OCL expressions.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	protected static final OCL EOCL_ENV = OCL.newInstance();

} //TransmissionImpl
