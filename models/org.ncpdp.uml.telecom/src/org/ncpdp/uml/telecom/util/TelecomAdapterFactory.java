/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import org.ncpdp.uml.telecom.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.ncpdp.uml.telecom.TelecomPackage
 * @generated
 */
public class TelecomAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static TelecomPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = TelecomPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TelecomSwitch<Adapter> modelSwitch =
		new TelecomSwitch<Adapter>() {
			@Override
			public Adapter caseDocumentRoot(DocumentRoot object) {
				return createDocumentRootAdapter();
			}
			@Override
			public Adapter caseTransmission(Transmission object) {
				return createTransmissionAdapter();
			}
			@Override
			public Adapter caseTransactionHeaderSegment(TransactionHeaderSegment object) {
				return createTransactionHeaderSegmentAdapter();
			}
			@Override
			public Adapter caseField(Field object) {
				return createFieldAdapter();
			}
			@Override
			public Adapter caseWorkersCompensationSegment(WorkersCompensationSegment object) {
				return createWorkersCompensationSegmentAdapter();
			}
			@Override
			public Adapter casePriorAuthorizationSegment(PriorAuthorizationSegment object) {
				return createPriorAuthorizationSegmentAdapter();
			}
			@Override
			public Adapter casePricingSegment(PricingSegment object) {
				return createPricingSegmentAdapter();
			}
			@Override
			public Adapter casePrescriberSegment(PrescriberSegment object) {
				return createPrescriberSegmentAdapter();
			}
			@Override
			public Adapter casePharmacyProviderSegment(PharmacyProviderSegment object) {
				return createPharmacyProviderSegmentAdapter();
			}
			@Override
			public Adapter casePatientSegment(PatientSegment object) {
				return createPatientSegmentAdapter();
			}
			@Override
			public Adapter caseNarrativeSegment(NarrativeSegment object) {
				return createNarrativeSegmentAdapter();
			}
			@Override
			public Adapter caseInsuranceSegment(InsuranceSegment object) {
				return createInsuranceSegmentAdapter();
			}
			@Override
			public Adapter caseFacilitySegment(FacilitySegment object) {
				return createFacilitySegmentAdapter();
			}
			@Override
			public Adapter caseDURPPSSegment(DURPPSSegment object) {
				return createDURPPSSegmentAdapter();
			}
			@Override
			public Adapter caseCouponSegment(CouponSegment object) {
				return createCouponSegmentAdapter();
			}
			@Override
			public Adapter caseCoordinationofBenefitsOtherPaymentsSegment(CoordinationofBenefitsOtherPaymentsSegment object) {
				return createCoordinationofBenefitsOtherPaymentsSegmentAdapter();
			}
			@Override
			public Adapter caseClinicalSegment(ClinicalSegment object) {
				return createClinicalSegmentAdapter();
			}
			@Override
			public Adapter caseClaimSegment(ClaimSegment object) {
				return createClaimSegmentAdapter();
			}
			@Override
			public Adapter caseAdditionalDocumentationSegment(AdditionalDocumentationSegment object) {
				return createAdditionalDocumentationSegmentAdapter();
			}
			@Override
			public Adapter caseCompoundSegment(CompoundSegment object) {
				return createCompoundSegmentAdapter();
			}
			@Override
			public Adapter caseResponse(Response object) {
				return createResponseAdapter();
			}
			@Override
			public Adapter caseResponseHeaderSegment(ResponseHeaderSegment object) {
				return createResponseHeaderSegmentAdapter();
			}
			@Override
			public Adapter caseResponseClaimSegment(ResponseClaimSegment object) {
				return createResponseClaimSegmentAdapter();
			}
			@Override
			public Adapter caseResponseCoordinationofBenefitsOtherPayersSegment(ResponseCoordinationofBenefitsOtherPayersSegment object) {
				return createResponseCoordinationofBenefitsOtherPayersSegmentAdapter();
			}
			@Override
			public Adapter caseResponseDURPPSSegment(ResponseDURPPSSegment object) {
				return createResponseDURPPSSegmentAdapter();
			}
			@Override
			public Adapter caseResponseInsuranceSegment(ResponseInsuranceSegment object) {
				return createResponseInsuranceSegmentAdapter();
			}
			@Override
			public Adapter caseResponseMessageSegment(ResponseMessageSegment object) {
				return createResponseMessageSegmentAdapter();
			}
			@Override
			public Adapter caseResponsePatientSegment(ResponsePatientSegment object) {
				return createResponsePatientSegmentAdapter();
			}
			@Override
			public Adapter caseResponsePricingSegment(ResponsePricingSegment object) {
				return createResponsePricingSegmentAdapter();
			}
			@Override
			public Adapter caseResponsePriorAuthorizationSegment(ResponsePriorAuthorizationSegment object) {
				return createResponsePriorAuthorizationSegmentAdapter();
			}
			@Override
			public Adapter caseResponseStatusSegment(ResponseStatusSegment object) {
				return createResponseStatusSegmentAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.DocumentRoot <em>Document Root</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.DocumentRoot
	 * @generated
	 */
	public Adapter createDocumentRootAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.Transmission <em>Transmission</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.Transmission
	 * @generated
	 */
	public Adapter createTransmissionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.TransactionHeaderSegment <em>Transaction Header Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.TransactionHeaderSegment
	 * @generated
	 */
	public Adapter createTransactionHeaderSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.Field <em>Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.Field
	 * @generated
	 */
	public Adapter createFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ClaimSegment <em>Claim Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ClaimSegment
	 * @generated
	 */
	public Adapter createClaimSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ClinicalSegment <em>Clinical Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ClinicalSegment
	 * @generated
	 */
	public Adapter createClinicalSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ResponsePatientSegment <em>Response Patient Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ResponsePatientSegment
	 * @generated
	 */
	public Adapter createResponsePatientSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ResponseInsuranceSegment <em>Response Insurance Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ResponseInsuranceSegment
	 * @generated
	 */
	public Adapter createResponseInsuranceSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.CompoundSegment <em>Compound Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.CompoundSegment
	 * @generated
	 */
	public Adapter createCompoundSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.WorkersCompensationSegment <em>Workers Compensation Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.WorkersCompensationSegment
	 * @generated
	 */
	public Adapter createWorkersCompensationSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.InsuranceSegment <em>Insurance Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.InsuranceSegment
	 * @generated
	 */
	public Adapter createInsuranceSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ResponseDURPPSSegment <em>Response DURPPS Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ResponseDURPPSSegment
	 * @generated
	 */
	public Adapter createResponseDURPPSSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment <em>Coordinationof Benefits Other Payments Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment
	 * @generated
	 */
	public Adapter createCoordinationofBenefitsOtherPaymentsSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.PatientSegment <em>Patient Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.PatientSegment
	 * @generated
	 */
	public Adapter createPatientSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.PricingSegment <em>Pricing Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.PricingSegment
	 * @generated
	 */
	public Adapter createPricingSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.PriorAuthorizationSegment <em>Prior Authorization Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.PriorAuthorizationSegment
	 * @generated
	 */
	public Adapter createPriorAuthorizationSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ResponseStatusSegment <em>Response Status Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ResponseStatusSegment
	 * @generated
	 */
	public Adapter createResponseStatusSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.AdditionalDocumentationSegment <em>Additional Documentation Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.AdditionalDocumentationSegment
	 * @generated
	 */
	public Adapter createAdditionalDocumentationSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ResponseMessageSegment <em>Response Message Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ResponseMessageSegment
	 * @generated
	 */
	public Adapter createResponseMessageSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ResponseClaimSegment <em>Response Claim Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ResponseClaimSegment
	 * @generated
	 */
	public Adapter createResponseClaimSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.FacilitySegment <em>Facility Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.FacilitySegment
	 * @generated
	 */
	public Adapter createFacilitySegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.CouponSegment <em>Coupon Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.CouponSegment
	 * @generated
	 */
	public Adapter createCouponSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment <em>Response Coordinationof Benefits Other Payers Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ResponseCoordinationofBenefitsOtherPayersSegment
	 * @generated
	 */
	public Adapter createResponseCoordinationofBenefitsOtherPayersSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.DURPPSSegment <em>DURPPS Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.DURPPSSegment
	 * @generated
	 */
	public Adapter createDURPPSSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.Response <em>Response</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.Response
	 * @generated
	 */
	public Adapter createResponseAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ResponseHeaderSegment <em>Response Header Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ResponseHeaderSegment
	 * @generated
	 */
	public Adapter createResponseHeaderSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ResponsePricingSegment <em>Response Pricing Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ResponsePricingSegment
	 * @generated
	 */
	public Adapter createResponsePricingSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment <em>Response Prior Authorization Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.ResponsePriorAuthorizationSegment
	 * @generated
	 */
	public Adapter createResponsePriorAuthorizationSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.PrescriberSegment <em>Prescriber Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.PrescriberSegment
	 * @generated
	 */
	public Adapter createPrescriberSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.PharmacyProviderSegment <em>Pharmacy Provider Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.PharmacyProviderSegment
	 * @generated
	 */
	public Adapter createPharmacyProviderSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link org.ncpdp.uml.telecom.NarrativeSegment <em>Narrative Segment</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see org.ncpdp.uml.telecom.NarrativeSegment
	 * @generated
	 */
	public Adapter createNarrativeSegmentAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //TelecomAdapterFactory
