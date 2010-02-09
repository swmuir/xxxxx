/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom.impl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.EcorePackage;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.ncpdp.uml.telecom.AdditionalDocumentationSegment;
import org.ncpdp.uml.telecom.ClaimSegment;
import org.ncpdp.uml.telecom.ClinicalSegment;
import org.ncpdp.uml.telecom.CompoundSegment;
import org.ncpdp.uml.telecom.CoordinationofBenefitsOtherPaymentsSegment;
import org.ncpdp.uml.telecom.CouponSegment;
import org.ncpdp.uml.telecom.DURPPSSegment;
import org.ncpdp.uml.telecom.DocumentRoot;
import org.ncpdp.uml.telecom.FacilitySegment;
import org.ncpdp.uml.telecom.Field;
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
import org.ncpdp.uml.telecom.ResponseStatusSegment;
import org.ncpdp.uml.telecom.TelecomFactory;
import org.ncpdp.uml.telecom.TelecomPackage;
import org.ncpdp.uml.telecom.TransactionHeaderSegment;
import org.ncpdp.uml.telecom.Transmission;
import org.ncpdp.uml.telecom.WorkersCompensationSegment;

import org.ncpdp.uml.telecom.util.TelecomValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class TelecomPackageImpl extends EPackageImpl implements TelecomPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass documentRootEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transmissionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass transactionHeaderSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass workersCompensationSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass priorAuthorizationSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pricingSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass prescriberSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass pharmacyProviderSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass patientSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass narrativeSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass insuranceSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass facilitySegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass durppsSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass couponSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass coordinationofBenefitsOtherPaymentsSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass clinicalSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass claimSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass additionalDocumentationSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass compoundSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseHeaderSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseClaimSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseCoordinationofBenefitsOtherPayersSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseDURPPSSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseInsuranceSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseMessageSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsePatientSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsePricingSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responsePriorAuthorizationSegmentEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass responseStatusSegmentEClass = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.ncpdp.uml.telecom.TelecomPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private TelecomPackageImpl() {
		super(eNS_URI, TelecomFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link TelecomPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static TelecomPackage init() {
		if (isInited) return (TelecomPackage)EPackage.Registry.INSTANCE.getEPackage(TelecomPackage.eNS_URI);

		// Obtain or create and register package
		TelecomPackageImpl theTelecomPackage = (TelecomPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof TelecomPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new TelecomPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		EcorePackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theTelecomPackage.createPackageContents();

		// Initialize created meta-data
		theTelecomPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theTelecomPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return TelecomValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theTelecomPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(TelecomPackage.eNS_URI, theTelecomPackage);
		return theTelecomPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDocumentRoot() {
		return documentRootEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDocumentRoot_Mixed() {
		return (EAttribute)documentRootEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XMLNSPrefixMap() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_XSISchemaLocation() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Transmission() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDocumentRoot_Response() {
		return (EReference)documentRootEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransmission() {
		return transmissionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_TransactionHeaderSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_WorkersCompensationSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_PriorAuthorizationSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_PricingSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_PrescriberSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_PharmacyProviderSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_PatientSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_NarrativeSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_InsuranceSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_FacilitySegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_DURPPSSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_CouponSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_CoordinationofBenefitsOtherPaymentsSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_ClinicalSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_ClaimSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_AdditionalDocumentationSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransmission_CompoundSegment() {
		return (EReference)transmissionEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTransactionHeaderSegment() {
		return transactionHeaderSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionHeaderSegment_AssignedAuthor() {
		return (EReference)transactionHeaderSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionHeaderSegment_DateOfService() {
		return (EReference)transactionHeaderSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionHeaderSegment_SoftwareVendorcertificationId() {
		return (EReference)transactionHeaderSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionHeaderSegment_TransactionCount() {
		return (EReference)transactionHeaderSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionHeaderSegment_ServiceProviderId() {
		return (EReference)transactionHeaderSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionHeaderSegment_ProcessorControlNumber() {
		return (EReference)transactionHeaderSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionHeaderSegment_ServiceProviderIdQualifier() {
		return (EReference)transactionHeaderSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionHeaderSegment_BinNumber() {
		return (EReference)transactionHeaderSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionHeaderSegment_Version() {
		return (EReference)transactionHeaderSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getTransactionHeaderSegment_TransactionCode() {
		return (EReference)transactionHeaderSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getField() {
		return fieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Field() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getField_Value() {
		return (EAttribute)fieldEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getWorkersCompensationSegment() {
		return workersCompensationSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getWorkersCompensationSegment_SegmentIdentification() {
		return (EAttribute)workersCompensationSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_DateOfInjury() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_EmployerName() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_EmployerStreetAddress() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_EmployerCityAddress() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_EmployerStateprovinceAddress() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_EmployerZippostalZone() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_EmployerPhoneNumber() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_EmployerContactName() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_CarrierId() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_ClaimreferenceId() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_BillingEntityTypeIndicator() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_PayToQualifier() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_PayToId() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_PayToName() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_PayToStreetAddress() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_PayToCityAddress() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_PayToStateprovinceAddress() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_PayToZippostalZone() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_GenericEquivalentProductIdQualifier() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getWorkersCompensationSegment_GenericEquivalentProductId() {
		return (EReference)workersCompensationSegmentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPriorAuthorizationSegment() {
		return priorAuthorizationSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPriorAuthorizationSegment_SegmentIdentification() {
		return (EAttribute)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_RequestType() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_RequestPeriodDatebegin() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_RequestPeriodDateend() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_BasisOfRequest() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_AuthorizedRepresentativeFirstName() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_AuthorizedRepresentativeLastName() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_AuthorizedRepresentativeStreetAddress() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_AuthorizedRepresentativeCityAddress() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_AuthorizedRepresentativeStateprovinceAddress() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_AuthorizedRepresentativeZippostalZone() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_PriorAuthorizationNumberassigned() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_AuthorizationNumber() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPriorAuthorizationSegment_PriorAuthorizationSupportingDocumentation() {
		return (EReference)priorAuthorizationSegmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPricingSegment() {
		return pricingSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPricingSegment_SegmentIdentification() {
		return (EAttribute)pricingSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_IngredientCostSubmitted() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_DispensingFeeSubmitted() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_ProfessionalServiceFeeSubmitted() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_PatientPaidAmountSubmitted() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_IncentiveAmountSubmitted() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_OtherAmountClaimedSubmittedCount() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_OtherAmountClaimedSubmittedQualifier() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_OtherAmountClaimedSubmitted() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_FlatSalesTaxAmountSubmitted() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_PercentageSalesTaxAmountSubmitted() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_PercentageSalesTaxRateSubmitted() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_PercentageSalesTaxBasisSubmitted() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_UsualAndCustomaryCharge() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_GrossAmountDue() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_BasisOfCostDetermination() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPricingSegment_MedicaidPaidAmount() {
		return (EReference)pricingSegmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPrescriberSegment() {
		return prescriberSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPrescriberSegment_SegmentIdentification() {
		return (EAttribute)prescriberSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrescriberIdQualifier() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrescriberId() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrescriberLastName() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrescriberPhoneNumber() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrimaryCareProviderIdQualifier() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrimaryCareProviderId() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrimaryCareProviderLastName() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrescriberFirstName() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrescriberStreetAddress() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrescriberCityAddress() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrescriberStateprovinceAddress() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPrescriberSegment_PrescriberZippostalZone() {
		return (EReference)prescriberSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPharmacyProviderSegment() {
		return pharmacyProviderSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPharmacyProviderSegment_SegmentIdentification() {
		return (EAttribute)pharmacyProviderSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPharmacyProviderSegment_ProviderIdQualifier() {
		return (EReference)pharmacyProviderSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPharmacyProviderSegment_ProviderId() {
		return (EReference)pharmacyProviderSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getPatientSegment() {
		return patientSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getPatientSegment_SegmentIdentification() {
		return (EAttribute)patientSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientIdQualifier() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientId() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_DateOfBirth() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientGenderCode() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientFirstName() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientLastName() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientStreetAddress() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientCityAddress() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientStateProvinceAddress() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientZippostalZone() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientPhoneNumber() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PlaceOfService() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_EmployerId() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_SmokerNonsmokerCode() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PregnancyIndicator() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientEmailAddress() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getPatientSegment_PatientResidence() {
		return (EReference)patientSegmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getNarrativeSegment() {
		return narrativeSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getNarrativeSegment_SegmentIdentification() {
		return (EAttribute)narrativeSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getNarrativeSegment_NarrativeMessage() {
		return (EReference)narrativeSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getInsuranceSegment() {
		return insuranceSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getInsuranceSegment_SegmentIdentification() {
		return (EAttribute)insuranceSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_CardholderId() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_CardholderFirstName() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_CardholderLastName() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_HomePlan() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_PlanId() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_EligibilityClarificationCode() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_GroupId() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_PersonCode() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_PatientRelationshipCode() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_OtherPayerBinNumber() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_OtherPayerProcessorControlNumber() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_OtherPayerCardholderId() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_OtherPayerGroupId() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_MedigapId() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_MedicaidIndicator() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_ProviderAcceptAssignmentIndicator() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_CmsPartDDefinedQualifiedFacility() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_MedicaidIdNumber() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getInsuranceSegment_MedicaidAgencyNumber() {
		return (EReference)insuranceSegmentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFacilitySegment() {
		return facilitySegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFacilitySegment_SegmentIdentification() {
		return (EAttribute)facilitySegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySegment_FacilityId() {
		return (EReference)facilitySegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySegment_FacilityName() {
		return (EReference)facilitySegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySegment_FacilityStreetAddress() {
		return (EReference)facilitySegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySegment_FacilityCityAddress() {
		return (EReference)facilitySegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySegment_FacilityStateprovinceAddress() {
		return (EReference)facilitySegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFacilitySegment_FacilityZippostalZone() {
		return (EReference)facilitySegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getDURPPSSegment() {
		return durppsSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getDURPPSSegment_SegmentIdentification() {
		return (EAttribute)durppsSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDURPPSSegment_DurppsCodeCounter() {
		return (EReference)durppsSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDURPPSSegment_ReasonForServiceCode() {
		return (EReference)durppsSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDURPPSSegment_ProfessionalServiceCode() {
		return (EReference)durppsSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDURPPSSegment_ResultOfServiceCode() {
		return (EReference)durppsSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDURPPSSegment_DurppsLevelOfEffort() {
		return (EReference)durppsSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDURPPSSegment_DurCoagentIdQualifier() {
		return (EReference)durppsSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getDURPPSSegment_DurCoagentId() {
		return (EReference)durppsSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCouponSegment() {
		return couponSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCouponSegment_SegmentIdentification() {
		return (EAttribute)couponSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCouponSegment_CouponType() {
		return (EReference)couponSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCouponSegment_CouponNumber() {
		return (EReference)couponSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCouponSegment_CouponValueAmount() {
		return (EReference)couponSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCoordinationofBenefitsOtherPaymentsSegment() {
		return coordinationofBenefitsOtherPaymentsSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCoordinationofBenefitsOtherPaymentsSegment_SegmentIdentification() {
		return (EAttribute)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_CoordinationOfBenefitsotherPaymentsCount() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerCoverageType() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerIdQualifier() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerId() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerDate() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_InternalControlNumber() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidCount() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidQualifier() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaid() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCount() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCode() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountCount() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountQualifier() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmount() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageCount() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageQualifier() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageAmount() {
		return (EReference)coordinationofBenefitsOtherPaymentsSegmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClinicalSegment() {
		return clinicalSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClinicalSegment_SegmentIdentification() {
		return (EAttribute)clinicalSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalSegment_DiagnosisCodeCount() {
		return (EReference)clinicalSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalSegment_DiagnosisCodeQualifier() {
		return (EReference)clinicalSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalSegment_DiagnosisCode() {
		return (EReference)clinicalSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalSegment_ClinicalInformationCounter() {
		return (EReference)clinicalSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalSegment_MeasurementDate() {
		return (EReference)clinicalSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalSegment_MeasurementTime() {
		return (EReference)clinicalSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalSegment_MeasurementDimension() {
		return (EReference)clinicalSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalSegment_MeasurementUnit() {
		return (EReference)clinicalSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClinicalSegment_MeasurementValue() {
		return (EReference)clinicalSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getClaimSegment() {
		return claimSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getClaimSegment_SegmentIdentification() {
		return (EAttribute)claimSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_PrescriptionserviceReferenceNumberQualifier() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_PrescriptionserviceReferenceNumber() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_ProductserviceIdQualifier() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_ProductserviceId() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_AssociatedPrescriptionserviceReferenceNumber() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_AssociatedPrescriptionserviceDate() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_ProcedureModifierCodeCount() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_ProcedureModifierCode() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_QuantityDispensed() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_FillNumber() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_DaysSupply() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_CompoundCode() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_DispenseAsWrittendawproductSelectionCode() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_DatePrescriptionWritten() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_NumberOfRefillsAuthorized() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_PrescriptionOriginCode() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_SubmissionClarificationCodeCount() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_SubmissionClarificationCode() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_QuantityPrescribed() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_OtherCoverageCode() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_SpecialPackagingIndicator() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_OriginallyPrescribedProductserviceIdQualifier() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_OriginallyPrescribedProductserviceCode() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_OriginallyPrescribedQuantity() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_AlternateId() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_ScheduledPrescriptionIdNumber() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_UnitOfMeasure() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_LevelOfService() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_PriorAuthorizationTypeCode() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_PriorAuthorizationNumberSubmitted() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_IntermediaryAuthorizationTypeId() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_IntermediaryAuthorizationId() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_DispensingStatus() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_QuantityIntendedToBeDispensed() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_DaysSupplyIntendedToBeDispensed() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_DelayReasonCode() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_TransactionReferenceNumber() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_PatientAssignmentIndicatordirectMemberReimbursementIndicator() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_RouteOfAdministration() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_CompoundType() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getClaimSegment_PharmacyServiceType() {
		return (EReference)claimSegmentEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAdditionalDocumentationSegment() {
		return additionalDocumentationSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getAdditionalDocumentationSegment_SegmentIdentification() {
		return (EAttribute)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_AdditionalDocumentationTypeId() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_RequestPeriodBeginDate() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_RequestPeriodRecertrevisedDate() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_RequestStatus() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_LengthOfNeedQualifier() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_LengthOfNeed() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_PrescribersupplierDateSigned() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_SupportingDocumentation() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_QuestionNumberletterCount() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_QuestionNumberletter() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_QuestionPercentResponse() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_QuestionDateResponse() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_QuestionDollarAmountResponse() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_QuestionNumericResponse() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAdditionalDocumentationSegment_QuestionAlphanumericResponse() {
		return (EReference)additionalDocumentationSegmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getCompoundSegment() {
		return compoundSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getCompoundSegment_SegmentIdentification() {
		return (EAttribute)compoundSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSegment_CompoundDosageFormDescriptionCode() {
		return (EReference)compoundSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSegment_CompoundDispensingUnitFormIndicator() {
		return (EReference)compoundSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSegment_CompoundIngredientComponentCount() {
		return (EReference)compoundSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSegment_CompoundProductIdQualifier() {
		return (EReference)compoundSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSegment_CompoundProductId() {
		return (EReference)compoundSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSegment_CompoundIngredientQuantity() {
		return (EReference)compoundSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSegment_CompoundIngredientDrugCost() {
		return (EReference)compoundSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSegment_CompoundIngredientBasisOfCostDetermination() {
		return (EReference)compoundSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSegment_CompoundIngredientModifierCodeCount() {
		return (EReference)compoundSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getCompoundSegment_CompoundIngredientModifierCode() {
		return (EReference)compoundSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponse() {
		return responseEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_ResponseHeaderSegment() {
		return (EReference)responseEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_ResponseClaimSegment() {
		return (EReference)responseEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_ResponseCoordinationofBenefitsOtherPayersSegment() {
		return (EReference)responseEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_ResponseDURPPSSegment() {
		return (EReference)responseEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_ResponseInsuranceSegment() {
		return (EReference)responseEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_ResponseMessageSegment() {
		return (EReference)responseEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_ResponsePatientSegment() {
		return (EReference)responseEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_ResponsePricingSegment() {
		return (EReference)responseEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponse_ResponsePriorAuthorizationSegment() {
		return (EReference)responseEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseHeaderSegment() {
		return responseHeaderSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseHeaderSegment_VersionreleaseNumber() {
		return (EReference)responseHeaderSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseHeaderSegment_TransactionCode() {
		return (EReference)responseHeaderSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseHeaderSegment_TransactionCount() {
		return (EReference)responseHeaderSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseHeaderSegment_HeaderResponseStatus() {
		return (EReference)responseHeaderSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseHeaderSegment_ServiceProviderIdQualifier() {
		return (EReference)responseHeaderSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseHeaderSegment_ServiceProviderId() {
		return (EReference)responseHeaderSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseHeaderSegment_DateOfService() {
		return (EReference)responseHeaderSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseClaimSegment() {
		return responseClaimSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseClaimSegment_SegmentIdentification() {
		return (EAttribute)responseClaimSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseClaimSegment_PrescriptionserviceReferenceNumberQualifier() {
		return (EReference)responseClaimSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseClaimSegment_PrescriptionserviceReferenceNumber() {
		return (EReference)responseClaimSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseClaimSegment_PreferredProductCount() {
		return (EReference)responseClaimSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseClaimSegment_PreferredProductIdQualifier() {
		return (EReference)responseClaimSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseClaimSegment_PreferredProductId() {
		return (EReference)responseClaimSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseClaimSegment_PreferredProductIncentive() {
		return (EReference)responseClaimSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseClaimSegment_PreferredProductCostShareIncentive() {
		return (EReference)responseClaimSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseClaimSegment_PreferredProductDescription() {
		return (EReference)responseClaimSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn() {
		return (EReference)responseClaimSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseCoordinationofBenefitsOtherPayersSegment() {
		return responseCoordinationofBenefitsOtherPayersSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseCoordinationofBenefitsOtherPayersSegment_SegmentIdentification() {
		return (EAttribute)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdCount() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCoverageType() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdQualifier() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerId() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerProcessorControlNumber() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCardholderId() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerGroupId() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPersonCode() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerHelpDeskPhoneNumber() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPatientRelationshipCode() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitEffectiveDate() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitTerminationDate() {
		return (EReference)responseCoordinationofBenefitsOtherPayersSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseDURPPSSegment() {
		return responseDURPPSSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseDURPPSSegment_SegmentIdentification() {
		return (EAttribute)responseDURPPSSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDURPPSSegment_DurppsResponseCodeCounter() {
		return (EReference)responseDURPPSSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDURPPSSegment_ReasonForServiceCode() {
		return (EReference)responseDURPPSSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDURPPSSegment_ClinicalSignificanceCode() {
		return (EReference)responseDURPPSSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDURPPSSegment_OtherPharmacyIndicator() {
		return (EReference)responseDURPPSSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDURPPSSegment_PreviousDateOfFill() {
		return (EReference)responseDURPPSSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDURPPSSegment_QuantityOfPreviousFill() {
		return (EReference)responseDURPPSSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDURPPSSegment_DatabaseIndicator() {
		return (EReference)responseDURPPSSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDURPPSSegment_OtherPrescriberIndicator() {
		return (EReference)responseDURPPSSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDURPPSSegment_DurFreeTextMessage() {
		return (EReference)responseDURPPSSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseDURPPSSegment_DurAdditionalText() {
		return (EReference)responseDURPPSSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseInsuranceSegment() {
		return responseInsuranceSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseInsuranceSegment_SegmentIdentification() {
		return (EAttribute)responseInsuranceSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseInsuranceSegment_GroupId() {
		return (EReference)responseInsuranceSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseInsuranceSegment_PlanId() {
		return (EReference)responseInsuranceSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseInsuranceSegment_NetworkReimbursementId() {
		return (EReference)responseInsuranceSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseInsuranceSegment_PayerIdQualifier() {
		return (EReference)responseInsuranceSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseInsuranceSegment_PayerId() {
		return (EReference)responseInsuranceSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseInsuranceSegment_MedicaidIdNumber() {
		return (EReference)responseInsuranceSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseInsuranceSegment_MedicaidAgencyNumber() {
		return (EReference)responseInsuranceSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseInsuranceSegment_CardholderId() {
		return (EReference)responseInsuranceSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseMessageSegment() {
		return responseMessageSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseMessageSegment_SegmentIdentification() {
		return (EAttribute)responseMessageSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseMessageSegment_Message() {
		return (EReference)responseMessageSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsePatientSegment() {
		return responsePatientSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsePatientSegment_SegmentIdentification() {
		return (EAttribute)responsePatientSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePatientSegment_PatientFirstName() {
		return (EReference)responsePatientSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePatientSegment_PatientLastName() {
		return (EReference)responsePatientSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePatientSegment_DateOfBirth() {
		return (EReference)responsePatientSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsePricingSegment() {
		return responsePricingSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsePricingSegment_SegmentIdentification() {
		return (EAttribute)responsePricingSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_PatientPayAmount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_IngredientCostPaid() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_DispensingFeePaid() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_TaxExemptIndicator() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_FlatSalesTaxAmountPaid() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_PercentageSalesTaxAmountPaid() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_PercentageSalesTaxRatePaid() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_PercentageSalesTaxBasisPaid() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_IncentiveAmountPaid() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_ProfessionalServiceFeePaid() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_OtherAmountPaidCount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_OtherAmountPaidQualifier() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_OtherAmountPaid() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_OtherPayerAmountRecognized() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_TotalAmountPaid() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_BasisOfReimbursementDetermination() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AmountAttributedToSalesTax() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(17);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AccumulatedDeductibleAmount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(18);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_RemainingDeductibleAmount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(19);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_RemainingBenefitAmount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(20);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AmountAppliedToPeriodicDeductible() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(21);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AmountOfCopay() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(22);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AmountExceedingPeriodicBenefitMaximum() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(23);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_BasisOfCalculationdispensingFee() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(24);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_BasisOfCalculationcopay() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(25);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_BasisOfCalculationflatSalesTax() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(26);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_BasisOfCalculationpercentageSalesTax() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(27);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AmountAttributedToProcessorFee() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(28);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_PatientSalesTaxAmount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(29);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_PlanSalesTaxAmount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(30);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AmountOfCoinsurance() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(31);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_BasisOfCalculationcoinsurance() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(32);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_BenefitStageCount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(33);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_BenefitStageQualifier() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(34);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_BenefitStageAmount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(35);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_EstimatedGenericSavings() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(36);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_SpendingAccountAmountRemaining() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(37);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_HealthPlanfundedAssistanceAmount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(38);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AmountAttributedToProviderNetworkSelection() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(39);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AmountAttributedToProductSelectionbrandDrug() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(40);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AmountAttributedToProductSelectionnonpreferredFormularySelection() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(41);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AmountAttributedToProductSelectionbrandNonpreferredFormularySelection() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(42);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_AmountAttributedToCoverageGap() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(43);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_IngredientCostContractedreimbursableAmount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(44);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePricingSegment_DispensingFeeContractedreimbursableAmount() {
		return (EReference)responsePricingSegmentEClass.getEStructuralFeatures().get(45);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponsePriorAuthorizationSegment() {
		return responsePriorAuthorizationSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponsePriorAuthorizationSegment_SegmentIdentification() {
		return (EAttribute)responsePriorAuthorizationSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePriorAuthorizationSegment_PriorAuthorizationProcessedDate() {
		return (EReference)responsePriorAuthorizationSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePriorAuthorizationSegment_PriorAuthorizationEffectiveDate() {
		return (EReference)responsePriorAuthorizationSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePriorAuthorizationSegment_PriorAuthorizationExpirationDate() {
		return (EReference)responsePriorAuthorizationSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePriorAuthorizationSegment_PriorAuthorizationQuantity() {
		return (EReference)responsePriorAuthorizationSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePriorAuthorizationSegment_PriorAuthorizationDollarsAuthorized() {
		return (EReference)responsePriorAuthorizationSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePriorAuthorizationSegment_PriorAuthorizationNumberOfRefillsAuthorized() {
		return (EReference)responsePriorAuthorizationSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePriorAuthorizationSegment_PriorAuthorizationQuantityAccumulated() {
		return (EReference)responsePriorAuthorizationSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponsePriorAuthorizationSegment_PriorAuthorizationNumberassigned() {
		return (EReference)responsePriorAuthorizationSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getResponseStatusSegment() {
		return responseStatusSegmentEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getResponseStatusSegment_SegmentIdentification() {
		return (EAttribute)responseStatusSegmentEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_TransactionResponseStatus() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_AuthorizationNumber() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_RejectCount() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_RejectCode() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_RejectFieldOccurrenceIndicator() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_ApprovedMessageCodeCount() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_ApprovedMessageCode() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_AdditionalMessageInformationCount() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_AdditionalMessageInformationQualifier() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_AdditionalMessageInformation() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_AdditionalMessageInformationContinuity() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(11);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_HelpDeskPhoneNumberQualifier() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(12);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_HelpDeskPhoneNumber() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(13);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_TransactionReferenceNumber() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(14);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_InternalControlNumber() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(15);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getResponseStatusSegment_Url() {
		return (EReference)responseStatusSegmentEClass.getEStructuralFeatures().get(16);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TelecomFactory getTelecomFactory() {
		return (TelecomFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		documentRootEClass = createEClass(DOCUMENT_ROOT);
		createEAttribute(documentRootEClass, DOCUMENT_ROOT__MIXED);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XMLNS_PREFIX_MAP);
		createEReference(documentRootEClass, DOCUMENT_ROOT__XSI_SCHEMA_LOCATION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__TRANSMISSION);
		createEReference(documentRootEClass, DOCUMENT_ROOT__RESPONSE);

		transmissionEClass = createEClass(TRANSMISSION);
		createEReference(transmissionEClass, TRANSMISSION__TRANSACTION_HEADER_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__WORKERS_COMPENSATION_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__PRIOR_AUTHORIZATION_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__PRICING_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__PRESCRIBER_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__PHARMACY_PROVIDER_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__PATIENT_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__NARRATIVE_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__INSURANCE_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__FACILITY_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__DURPPS_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__COUPON_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__CLINICAL_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__CLAIM_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__ADDITIONAL_DOCUMENTATION_SEGMENT);
		createEReference(transmissionEClass, TRANSMISSION__COMPOUND_SEGMENT);

		transactionHeaderSegmentEClass = createEClass(TRANSACTION_HEADER_SEGMENT);
		createEReference(transactionHeaderSegmentEClass, TRANSACTION_HEADER_SEGMENT__ASSIGNED_AUTHOR);
		createEReference(transactionHeaderSegmentEClass, TRANSACTION_HEADER_SEGMENT__DATE_OF_SERVICE);
		createEReference(transactionHeaderSegmentEClass, TRANSACTION_HEADER_SEGMENT__SOFTWARE_VENDORCERTIFICATION_ID);
		createEReference(transactionHeaderSegmentEClass, TRANSACTION_HEADER_SEGMENT__TRANSACTION_COUNT);
		createEReference(transactionHeaderSegmentEClass, TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID);
		createEReference(transactionHeaderSegmentEClass, TRANSACTION_HEADER_SEGMENT__PROCESSOR_CONTROL_NUMBER);
		createEReference(transactionHeaderSegmentEClass, TRANSACTION_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER);
		createEReference(transactionHeaderSegmentEClass, TRANSACTION_HEADER_SEGMENT__BIN_NUMBER);
		createEReference(transactionHeaderSegmentEClass, TRANSACTION_HEADER_SEGMENT__VERSION);
		createEReference(transactionHeaderSegmentEClass, TRANSACTION_HEADER_SEGMENT__TRANSACTION_CODE);

		fieldEClass = createEClass(FIELD);
		createEAttribute(fieldEClass, FIELD__FIELD);
		createEAttribute(fieldEClass, FIELD__VALUE);

		workersCompensationSegmentEClass = createEClass(WORKERS_COMPENSATION_SEGMENT);
		createEAttribute(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__DATE_OF_INJURY);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__EMPLOYER_NAME);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STREET_ADDRESS);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CITY_ADDRESS);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__EMPLOYER_STATEPROVINCE_ADDRESS);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__EMPLOYER_ZIPPOSTAL_ZONE);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__EMPLOYER_PHONE_NUMBER);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__EMPLOYER_CONTACT_NAME);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__CARRIER_ID);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__CLAIMREFERENCE_ID);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__BILLING_ENTITY_TYPE_INDICATOR);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__PAY_TO_QUALIFIER);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__PAY_TO_ID);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__PAY_TO_NAME);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__PAY_TO_STREET_ADDRESS);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__PAY_TO_CITY_ADDRESS);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__PAY_TO_STATEPROVINCE_ADDRESS);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__PAY_TO_ZIPPOSTAL_ZONE);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID_QUALIFIER);
		createEReference(workersCompensationSegmentEClass, WORKERS_COMPENSATION_SEGMENT__GENERIC_EQUIVALENT_PRODUCT_ID);

		priorAuthorizationSegmentEClass = createEClass(PRIOR_AUTHORIZATION_SEGMENT);
		createEAttribute(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__REQUEST_TYPE);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEBEGIN);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__REQUEST_PERIOD_DATEEND);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__BASIS_OF_REQUEST);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_FIRST_NAME);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_LAST_NAME);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STREET_ADDRESS);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_CITY_ADDRESS);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_STATEPROVINCE_ADDRESS);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZED_REPRESENTATIVE_ZIPPOSTAL_ZONE);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__AUTHORIZATION_NUMBER);
		createEReference(priorAuthorizationSegmentEClass, PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_SUPPORTING_DOCUMENTATION);

		pricingSegmentEClass = createEClass(PRICING_SEGMENT);
		createEAttribute(pricingSegmentEClass, PRICING_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__INGREDIENT_COST_SUBMITTED);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__DISPENSING_FEE_SUBMITTED);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_SUBMITTED);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__PATIENT_PAID_AMOUNT_SUBMITTED);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__INCENTIVE_AMOUNT_SUBMITTED);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_COUNT);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED_QUALIFIER);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__OTHER_AMOUNT_CLAIMED_SUBMITTED);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_SUBMITTED);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_SUBMITTED);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_SUBMITTED);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_SUBMITTED);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__USUAL_AND_CUSTOMARY_CHARGE);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__GROSS_AMOUNT_DUE);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__BASIS_OF_COST_DETERMINATION);
		createEReference(pricingSegmentEClass, PRICING_SEGMENT__MEDICAID_PAID_AMOUNT);

		prescriberSegmentEClass = createEClass(PRESCRIBER_SEGMENT);
		createEAttribute(prescriberSegmentEClass, PRESCRIBER_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRESCRIBER_ID_QUALIFIER);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRESCRIBER_ID);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRESCRIBER_LAST_NAME);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRESCRIBER_PHONE_NUMBER);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID_QUALIFIER);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_ID);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRIMARY_CARE_PROVIDER_LAST_NAME);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRESCRIBER_FIRST_NAME);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRESCRIBER_STREET_ADDRESS);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRESCRIBER_CITY_ADDRESS);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRESCRIBER_STATEPROVINCE_ADDRESS);
		createEReference(prescriberSegmentEClass, PRESCRIBER_SEGMENT__PRESCRIBER_ZIPPOSTAL_ZONE);

		pharmacyProviderSegmentEClass = createEClass(PHARMACY_PROVIDER_SEGMENT);
		createEAttribute(pharmacyProviderSegmentEClass, PHARMACY_PROVIDER_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(pharmacyProviderSegmentEClass, PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID_QUALIFIER);
		createEReference(pharmacyProviderSegmentEClass, PHARMACY_PROVIDER_SEGMENT__PROVIDER_ID);

		patientSegmentEClass = createEClass(PATIENT_SEGMENT);
		createEAttribute(patientSegmentEClass, PATIENT_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_ID_QUALIFIER);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_ID);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__DATE_OF_BIRTH);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_GENDER_CODE);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_FIRST_NAME);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_LAST_NAME);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_STREET_ADDRESS);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_CITY_ADDRESS);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_STATE_PROVINCE_ADDRESS);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_ZIPPOSTAL_ZONE);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_PHONE_NUMBER);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PLACE_OF_SERVICE);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__EMPLOYER_ID);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__SMOKER_NONSMOKER_CODE);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PREGNANCY_INDICATOR);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_EMAIL_ADDRESS);
		createEReference(patientSegmentEClass, PATIENT_SEGMENT__PATIENT_RESIDENCE);

		narrativeSegmentEClass = createEClass(NARRATIVE_SEGMENT);
		createEAttribute(narrativeSegmentEClass, NARRATIVE_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(narrativeSegmentEClass, NARRATIVE_SEGMENT__NARRATIVE_MESSAGE);

		insuranceSegmentEClass = createEClass(INSURANCE_SEGMENT);
		createEAttribute(insuranceSegmentEClass, INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__CARDHOLDER_ID);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__CARDHOLDER_FIRST_NAME);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__CARDHOLDER_LAST_NAME);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__HOME_PLAN);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__PLAN_ID);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__ELIGIBILITY_CLARIFICATION_CODE);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__GROUP_ID);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__PERSON_CODE);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__PATIENT_RELATIONSHIP_CODE);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__OTHER_PAYER_BIN_NUMBER);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__OTHER_PAYER_CARDHOLDER_ID);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__OTHER_PAYER_GROUP_ID);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__MEDIGAP_ID);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__MEDICAID_INDICATOR);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__PROVIDER_ACCEPT_ASSIGNMENT_INDICATOR);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__CMS_PART_DDEFINED_QUALIFIED_FACILITY);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__MEDICAID_ID_NUMBER);
		createEReference(insuranceSegmentEClass, INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER);

		facilitySegmentEClass = createEClass(FACILITY_SEGMENT);
		createEAttribute(facilitySegmentEClass, FACILITY_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(facilitySegmentEClass, FACILITY_SEGMENT__FACILITY_ID);
		createEReference(facilitySegmentEClass, FACILITY_SEGMENT__FACILITY_NAME);
		createEReference(facilitySegmentEClass, FACILITY_SEGMENT__FACILITY_STREET_ADDRESS);
		createEReference(facilitySegmentEClass, FACILITY_SEGMENT__FACILITY_CITY_ADDRESS);
		createEReference(facilitySegmentEClass, FACILITY_SEGMENT__FACILITY_STATEPROVINCE_ADDRESS);
		createEReference(facilitySegmentEClass, FACILITY_SEGMENT__FACILITY_ZIPPOSTAL_ZONE);

		durppsSegmentEClass = createEClass(DURPPS_SEGMENT);
		createEAttribute(durppsSegmentEClass, DURPPS_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(durppsSegmentEClass, DURPPS_SEGMENT__DURPPS_CODE_COUNTER);
		createEReference(durppsSegmentEClass, DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE);
		createEReference(durppsSegmentEClass, DURPPS_SEGMENT__PROFESSIONAL_SERVICE_CODE);
		createEReference(durppsSegmentEClass, DURPPS_SEGMENT__RESULT_OF_SERVICE_CODE);
		createEReference(durppsSegmentEClass, DURPPS_SEGMENT__DURPPS_LEVEL_OF_EFFORT);
		createEReference(durppsSegmentEClass, DURPPS_SEGMENT__DUR_COAGENT_ID_QUALIFIER);
		createEReference(durppsSegmentEClass, DURPPS_SEGMENT__DUR_COAGENT_ID);

		couponSegmentEClass = createEClass(COUPON_SEGMENT);
		createEAttribute(couponSegmentEClass, COUPON_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(couponSegmentEClass, COUPON_SEGMENT__COUPON_TYPE);
		createEReference(couponSegmentEClass, COUPON_SEGMENT__COUPON_NUMBER);
		createEReference(couponSegmentEClass, COUPON_SEGMENT__COUPON_VALUE_AMOUNT);

		coordinationofBenefitsOtherPaymentsSegmentEClass = createEClass(COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT);
		createEAttribute(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__COORDINATION_OF_BENEFITSOTHER_PAYMENTS_COUNT);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID_QUALIFIER);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_ID);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_DATE);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__INTERNAL_CONTROL_NUMBER);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_COUNT);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID_QUALIFIER);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_AMOUNT_PAID);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_COUNT);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYER_REJECT_CODE);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_COUNT);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT_QUALIFIER);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__OTHER_PAYERPATIENT_RESPONSIBILITY_AMOUNT);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_COUNT);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_QUALIFIER);
		createEReference(coordinationofBenefitsOtherPaymentsSegmentEClass, COORDINATIONOF_BENEFITS_OTHER_PAYMENTS_SEGMENT__BENEFIT_STAGE_AMOUNT);

		clinicalSegmentEClass = createEClass(CLINICAL_SEGMENT);
		createEAttribute(clinicalSegmentEClass, CLINICAL_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(clinicalSegmentEClass, CLINICAL_SEGMENT__DIAGNOSIS_CODE_COUNT);
		createEReference(clinicalSegmentEClass, CLINICAL_SEGMENT__DIAGNOSIS_CODE_QUALIFIER);
		createEReference(clinicalSegmentEClass, CLINICAL_SEGMENT__DIAGNOSIS_CODE);
		createEReference(clinicalSegmentEClass, CLINICAL_SEGMENT__CLINICAL_INFORMATION_COUNTER);
		createEReference(clinicalSegmentEClass, CLINICAL_SEGMENT__MEASUREMENT_DATE);
		createEReference(clinicalSegmentEClass, CLINICAL_SEGMENT__MEASUREMENT_TIME);
		createEReference(clinicalSegmentEClass, CLINICAL_SEGMENT__MEASUREMENT_DIMENSION);
		createEReference(clinicalSegmentEClass, CLINICAL_SEGMENT__MEASUREMENT_UNIT);
		createEReference(clinicalSegmentEClass, CLINICAL_SEGMENT__MEASUREMENT_VALUE);

		claimSegmentEClass = createEClass(CLAIM_SEGMENT);
		createEAttribute(claimSegmentEClass, CLAIM_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__PRODUCTSERVICE_ID_QUALIFIER);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__PRODUCTSERVICE_ID);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_REFERENCE_NUMBER);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_DATE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE_COUNT);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__QUANTITY_DISPENSED);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__FILL_NUMBER);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__DAYS_SUPPLY);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__COMPOUND_CODE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__DISPENSE_AS_WRITTENDAWPRODUCT_SELECTION_CODE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__DATE_PRESCRIPTION_WRITTEN);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__NUMBER_OF_REFILLS_AUTHORIZED);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__PRESCRIPTION_ORIGIN_CODE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE_COUNT);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__QUANTITY_PRESCRIBED);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__OTHER_COVERAGE_CODE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__SPECIAL_PACKAGING_INDICATOR);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_ID_QUALIFIER);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_CODE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_QUANTITY);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__ALTERNATE_ID);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__SCHEDULED_PRESCRIPTION_ID_NUMBER);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__UNIT_OF_MEASURE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__LEVEL_OF_SERVICE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__PRIOR_AUTHORIZATION_TYPE_CODE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_SUBMITTED);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_TYPE_ID);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_ID);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__DISPENSING_STATUS);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__QUANTITY_INTENDED_TO_BE_DISPENSED);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__DAYS_SUPPLY_INTENDED_TO_BE_DISPENSED);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__DELAY_REASON_CODE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__TRANSACTION_REFERENCE_NUMBER);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__PATIENT_ASSIGNMENT_INDICATORDIRECT_MEMBER_REIMBURSEMENT_INDICATOR);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__ROUTE_OF_ADMINISTRATION);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__COMPOUND_TYPE);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN);
		createEReference(claimSegmentEClass, CLAIM_SEGMENT__PHARMACY_SERVICE_TYPE);

		additionalDocumentationSegmentEClass = createEClass(ADDITIONAL_DOCUMENTATION_SEGMENT);
		createEAttribute(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__ADDITIONAL_DOCUMENTATION_TYPE_ID);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_BEGIN_DATE);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_PERIOD_RECERTREVISED_DATE);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__REQUEST_STATUS);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED_QUALIFIER);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__LENGTH_OF_NEED);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__PRESCRIBERSUPPLIER_DATE_SIGNED);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__SUPPORTING_DOCUMENTATION);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER_COUNT);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMBERLETTER);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_PERCENT_RESPONSE);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DATE_RESPONSE);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_DOLLAR_AMOUNT_RESPONSE);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_NUMERIC_RESPONSE);
		createEReference(additionalDocumentationSegmentEClass, ADDITIONAL_DOCUMENTATION_SEGMENT__QUESTION_ALPHANUMERIC_RESPONSE);

		compoundSegmentEClass = createEClass(COMPOUND_SEGMENT);
		createEAttribute(compoundSegmentEClass, COMPOUND_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(compoundSegmentEClass, COMPOUND_SEGMENT__COMPOUND_DOSAGE_FORM_DESCRIPTION_CODE);
		createEReference(compoundSegmentEClass, COMPOUND_SEGMENT__COMPOUND_DISPENSING_UNIT_FORM_INDICATOR);
		createEReference(compoundSegmentEClass, COMPOUND_SEGMENT__COMPOUND_INGREDIENT_COMPONENT_COUNT);
		createEReference(compoundSegmentEClass, COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID_QUALIFIER);
		createEReference(compoundSegmentEClass, COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID);
		createEReference(compoundSegmentEClass, COMPOUND_SEGMENT__COMPOUND_INGREDIENT_QUANTITY);
		createEReference(compoundSegmentEClass, COMPOUND_SEGMENT__COMPOUND_INGREDIENT_DRUG_COST);
		createEReference(compoundSegmentEClass, COMPOUND_SEGMENT__COMPOUND_INGREDIENT_BASIS_OF_COST_DETERMINATION);
		createEReference(compoundSegmentEClass, COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE_COUNT);
		createEReference(compoundSegmentEClass, COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE);

		responseEClass = createEClass(RESPONSE);
		createEReference(responseEClass, RESPONSE__RESPONSE_HEADER_SEGMENT);
		createEReference(responseEClass, RESPONSE__RESPONSE_CLAIM_SEGMENT);
		createEReference(responseEClass, RESPONSE__RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT);
		createEReference(responseEClass, RESPONSE__RESPONSE_DURPPS_SEGMENT);
		createEReference(responseEClass, RESPONSE__RESPONSE_INSURANCE_SEGMENT);
		createEReference(responseEClass, RESPONSE__RESPONSE_MESSAGE_SEGMENT);
		createEReference(responseEClass, RESPONSE__RESPONSE_PATIENT_SEGMENT);
		createEReference(responseEClass, RESPONSE__RESPONSE_PRICING_SEGMENT);
		createEReference(responseEClass, RESPONSE__RESPONSE_PRIOR_AUTHORIZATION_SEGMENT);

		responseHeaderSegmentEClass = createEClass(RESPONSE_HEADER_SEGMENT);
		createEReference(responseHeaderSegmentEClass, RESPONSE_HEADER_SEGMENT__VERSIONRELEASE_NUMBER);
		createEReference(responseHeaderSegmentEClass, RESPONSE_HEADER_SEGMENT__TRANSACTION_CODE);
		createEReference(responseHeaderSegmentEClass, RESPONSE_HEADER_SEGMENT__TRANSACTION_COUNT);
		createEReference(responseHeaderSegmentEClass, RESPONSE_HEADER_SEGMENT__HEADER_RESPONSE_STATUS);
		createEReference(responseHeaderSegmentEClass, RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID_QUALIFIER);
		createEReference(responseHeaderSegmentEClass, RESPONSE_HEADER_SEGMENT__SERVICE_PROVIDER_ID);
		createEReference(responseHeaderSegmentEClass, RESPONSE_HEADER_SEGMENT__DATE_OF_SERVICE);

		responseClaimSegmentEClass = createEClass(RESPONSE_CLAIM_SEGMENT);
		createEAttribute(responseClaimSegmentEClass, RESPONSE_CLAIM_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(responseClaimSegmentEClass, RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER);
		createEReference(responseClaimSegmentEClass, RESPONSE_CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER);
		createEReference(responseClaimSegmentEClass, RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COUNT);
		createEReference(responseClaimSegmentEClass, RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID_QUALIFIER);
		createEReference(responseClaimSegmentEClass, RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_ID);
		createEReference(responseClaimSegmentEClass, RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_INCENTIVE);
		createEReference(responseClaimSegmentEClass, RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_COST_SHARE_INCENTIVE);
		createEReference(responseClaimSegmentEClass, RESPONSE_CLAIM_SEGMENT__PREFERRED_PRODUCT_DESCRIPTION);
		createEReference(responseClaimSegmentEClass, RESPONSE_CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN);

		responseCoordinationofBenefitsOtherPayersSegmentEClass = createEClass(RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT);
		createEAttribute(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_COUNT);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_COVERAGE_TYPE);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID_QUALIFIER);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_ID);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PROCESSOR_CONTROL_NUMBER);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_CARDHOLDER_ID);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_GROUP_ID);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PERSON_CODE);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_HELP_DESK_PHONE_NUMBER);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_PATIENT_RELATIONSHIP_CODE);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_EFFECTIVE_DATE);
		createEReference(responseCoordinationofBenefitsOtherPayersSegmentEClass, RESPONSE_COORDINATIONOF_BENEFITS_OTHER_PAYERS_SEGMENT__OTHER_PAYER_BENEFIT_TERMINATION_DATE);

		responseDURPPSSegmentEClass = createEClass(RESPONSE_DURPPS_SEGMENT);
		createEAttribute(responseDURPPSSegmentEClass, RESPONSE_DURPPS_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(responseDURPPSSegmentEClass, RESPONSE_DURPPS_SEGMENT__DURPPS_RESPONSE_CODE_COUNTER);
		createEReference(responseDURPPSSegmentEClass, RESPONSE_DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE);
		createEReference(responseDURPPSSegmentEClass, RESPONSE_DURPPS_SEGMENT__CLINICAL_SIGNIFICANCE_CODE);
		createEReference(responseDURPPSSegmentEClass, RESPONSE_DURPPS_SEGMENT__OTHER_PHARMACY_INDICATOR);
		createEReference(responseDURPPSSegmentEClass, RESPONSE_DURPPS_SEGMENT__PREVIOUS_DATE_OF_FILL);
		createEReference(responseDURPPSSegmentEClass, RESPONSE_DURPPS_SEGMENT__QUANTITY_OF_PREVIOUS_FILL);
		createEReference(responseDURPPSSegmentEClass, RESPONSE_DURPPS_SEGMENT__DATABASE_INDICATOR);
		createEReference(responseDURPPSSegmentEClass, RESPONSE_DURPPS_SEGMENT__OTHER_PRESCRIBER_INDICATOR);
		createEReference(responseDURPPSSegmentEClass, RESPONSE_DURPPS_SEGMENT__DUR_FREE_TEXT_MESSAGE);
		createEReference(responseDURPPSSegmentEClass, RESPONSE_DURPPS_SEGMENT__DUR_ADDITIONAL_TEXT);

		responseInsuranceSegmentEClass = createEClass(RESPONSE_INSURANCE_SEGMENT);
		createEAttribute(responseInsuranceSegmentEClass, RESPONSE_INSURANCE_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(responseInsuranceSegmentEClass, RESPONSE_INSURANCE_SEGMENT__GROUP_ID);
		createEReference(responseInsuranceSegmentEClass, RESPONSE_INSURANCE_SEGMENT__PLAN_ID);
		createEReference(responseInsuranceSegmentEClass, RESPONSE_INSURANCE_SEGMENT__NETWORK_REIMBURSEMENT_ID);
		createEReference(responseInsuranceSegmentEClass, RESPONSE_INSURANCE_SEGMENT__PAYER_ID_QUALIFIER);
		createEReference(responseInsuranceSegmentEClass, RESPONSE_INSURANCE_SEGMENT__PAYER_ID);
		createEReference(responseInsuranceSegmentEClass, RESPONSE_INSURANCE_SEGMENT__MEDICAID_ID_NUMBER);
		createEReference(responseInsuranceSegmentEClass, RESPONSE_INSURANCE_SEGMENT__MEDICAID_AGENCY_NUMBER);
		createEReference(responseInsuranceSegmentEClass, RESPONSE_INSURANCE_SEGMENT__CARDHOLDER_ID);

		responseMessageSegmentEClass = createEClass(RESPONSE_MESSAGE_SEGMENT);
		createEAttribute(responseMessageSegmentEClass, RESPONSE_MESSAGE_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(responseMessageSegmentEClass, RESPONSE_MESSAGE_SEGMENT__MESSAGE);

		responsePatientSegmentEClass = createEClass(RESPONSE_PATIENT_SEGMENT);
		createEAttribute(responsePatientSegmentEClass, RESPONSE_PATIENT_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(responsePatientSegmentEClass, RESPONSE_PATIENT_SEGMENT__PATIENT_FIRST_NAME);
		createEReference(responsePatientSegmentEClass, RESPONSE_PATIENT_SEGMENT__PATIENT_LAST_NAME);
		createEReference(responsePatientSegmentEClass, RESPONSE_PATIENT_SEGMENT__DATE_OF_BIRTH);

		responsePricingSegmentEClass = createEClass(RESPONSE_PRICING_SEGMENT);
		createEAttribute(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__PATIENT_PAY_AMOUNT);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_PAID);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_PAID);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__TAX_EXEMPT_INDICATOR);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__FLAT_SALES_TAX_AMOUNT_PAID);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_AMOUNT_PAID);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_RATE_PAID);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__PERCENTAGE_SALES_TAX_BASIS_PAID);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__INCENTIVE_AMOUNT_PAID);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__PROFESSIONAL_SERVICE_FEE_PAID);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_COUNT);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID_QUALIFIER);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__OTHER_AMOUNT_PAID);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__OTHER_PAYER_AMOUNT_RECOGNIZED);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__TOTAL_AMOUNT_PAID);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__BASIS_OF_REIMBURSEMENT_DETERMINATION);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_SALES_TAX);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__ACCUMULATED_DEDUCTIBLE_AMOUNT);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__REMAINING_DEDUCTIBLE_AMOUNT);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__REMAINING_BENEFIT_AMOUNT);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__AMOUNT_APPLIED_TO_PERIODIC_DEDUCTIBLE);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COPAY);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__AMOUNT_EXCEEDING_PERIODIC_BENEFIT_MAXIMUM);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONDISPENSING_FEE);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOPAY);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONFLAT_SALES_TAX);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONPERCENTAGE_SALES_TAX);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROCESSOR_FEE);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__PATIENT_SALES_TAX_AMOUNT);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__PLAN_SALES_TAX_AMOUNT);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__AMOUNT_OF_COINSURANCE);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__BASIS_OF_CALCULATIONCOINSURANCE);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_COUNT);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_QUALIFIER);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__BENEFIT_STAGE_AMOUNT);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__ESTIMATED_GENERIC_SAVINGS);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__SPENDING_ACCOUNT_AMOUNT_REMAINING);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__HEALTH_PLANFUNDED_ASSISTANCE_AMOUNT);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PROVIDER_NETWORK_SELECTION);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_DRUG);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONNONPREFERRED_FORMULARY_SELECTION);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_PRODUCT_SELECTIONBRAND_NONPREFERRED_FORMULARY_SELECTION);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__AMOUNT_ATTRIBUTED_TO_COVERAGE_GAP);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__INGREDIENT_COST_CONTRACTEDREIMBURSABLE_AMOUNT);
		createEReference(responsePricingSegmentEClass, RESPONSE_PRICING_SEGMENT__DISPENSING_FEE_CONTRACTEDREIMBURSABLE_AMOUNT);

		responsePriorAuthorizationSegmentEClass = createEClass(RESPONSE_PRIOR_AUTHORIZATION_SEGMENT);
		createEAttribute(responsePriorAuthorizationSegmentEClass, RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(responsePriorAuthorizationSegmentEClass, RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_PROCESSED_DATE);
		createEReference(responsePriorAuthorizationSegmentEClass, RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EFFECTIVE_DATE);
		createEReference(responsePriorAuthorizationSegmentEClass, RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_EXPIRATION_DATE);
		createEReference(responsePriorAuthorizationSegmentEClass, RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY);
		createEReference(responsePriorAuthorizationSegmentEClass, RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_DOLLARS_AUTHORIZED);
		createEReference(responsePriorAuthorizationSegmentEClass, RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_OF_REFILLS_AUTHORIZED);
		createEReference(responsePriorAuthorizationSegmentEClass, RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_QUANTITY_ACCUMULATED);
		createEReference(responsePriorAuthorizationSegmentEClass, RESPONSE_PRIOR_AUTHORIZATION_SEGMENT__PRIOR_AUTHORIZATION_NUMBERASSIGNED);

		responseStatusSegmentEClass = createEClass(RESPONSE_STATUS_SEGMENT);
		createEAttribute(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__SEGMENT_IDENTIFICATION);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__TRANSACTION_RESPONSE_STATUS);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__AUTHORIZATION_NUMBER);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__REJECT_COUNT);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__REJECT_CODE);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__REJECT_FIELD_OCCURRENCE_INDICATOR);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE_COUNT);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__APPROVED_MESSAGE_CODE);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_COUNT);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_QUALIFIER);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__ADDITIONAL_MESSAGE_INFORMATION_CONTINUITY);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER_QUALIFIER);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__HELP_DESK_PHONE_NUMBER);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__TRANSACTION_REFERENCE_NUMBER);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__INTERNAL_CONTROL_NUMBER);
		createEReference(responseStatusSegmentEClass, RESPONSE_STATUS_SEGMENT__URL);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		EcorePackage theEcorePackage = (EcorePackage)EPackage.Registry.INSTANCE.getEPackage(EcorePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes

		// Initialize classes and features; add operations and parameters
		initEClass(documentRootEClass, DocumentRoot.class, "DocumentRoot", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDocumentRoot_Mixed(), ecorePackage.getEFeatureMapEntry(), "mixed", null, 0, -1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, !IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XMLNSPrefixMap(), theEcorePackage.getEStringToStringMapEntry(), null, "xMLNSPrefixMap", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_XSISchemaLocation(), theEcorePackage.getEStringToStringMapEntry(), null, "xSISchemaLocation", null, 0, -1, null, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getDocumentRoot_Transmission(), this.getTransmission(), null, "transmission", null, 1, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDocumentRoot_Response(), this.getResponse(), null, "response", null, 1, 1, null, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(transmissionEClass, Transmission.class, "Transmission", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransmission_TransactionHeaderSegment(), this.getTransactionHeaderSegment(), null, "transactionHeaderSegment", null, 1, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_WorkersCompensationSegment(), this.getWorkersCompensationSegment(), null, "workersCompensationSegment", null, 0, -1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_PriorAuthorizationSegment(), this.getPriorAuthorizationSegment(), null, "priorAuthorizationSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_PricingSegment(), this.getPricingSegment(), null, "pricingSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_PrescriberSegment(), this.getPrescriberSegment(), null, "prescriberSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_PharmacyProviderSegment(), this.getPharmacyProviderSegment(), null, "pharmacyProviderSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_PatientSegment(), this.getPatientSegment(), null, "patientSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_NarrativeSegment(), this.getNarrativeSegment(), null, "narrativeSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_InsuranceSegment(), this.getInsuranceSegment(), null, "insuranceSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_FacilitySegment(), this.getFacilitySegment(), null, "facilitySegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_DURPPSSegment(), this.getDURPPSSegment(), null, "dURPPSSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_CouponSegment(), this.getCouponSegment(), null, "couponSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_CoordinationofBenefitsOtherPaymentsSegment(), this.getCoordinationofBenefitsOtherPaymentsSegment(), null, "coordinationofBenefitsOtherPaymentsSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_ClinicalSegment(), this.getClinicalSegment(), null, "clinicalSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_ClaimSegment(), this.getClaimSegment(), null, "claimSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_AdditionalDocumentationSegment(), this.getAdditionalDocumentationSegment(), null, "additionalDocumentationSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransmission_CompoundSegment(), this.getCompoundSegment(), null, "compoundSegment", null, 0, 1, Transmission.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		EOperation op = addEOperation(transmissionEClass, ecorePackage.getEBoolean(), "TransmissionTransactionHeaderSegment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(transactionHeaderSegmentEClass, TransactionHeaderSegment.class, "TransactionHeaderSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getTransactionHeaderSegment_AssignedAuthor(), this.getField(), null, "assignedAuthor", null, 1, 1, TransactionHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransactionHeaderSegment_DateOfService(), this.getField(), null, "dateOfService", null, 1, 1, TransactionHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransactionHeaderSegment_SoftwareVendorcertificationId(), this.getField(), null, "softwareVendorcertificationId", null, 1, 1, TransactionHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransactionHeaderSegment_TransactionCount(), this.getField(), null, "transactionCount", null, 1, 1, TransactionHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransactionHeaderSegment_ServiceProviderId(), this.getField(), null, "serviceProviderId", null, 1, 1, TransactionHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransactionHeaderSegment_ProcessorControlNumber(), this.getField(), null, "processorControlNumber", null, 1, 1, TransactionHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransactionHeaderSegment_ServiceProviderIdQualifier(), this.getField(), null, "serviceProviderIdQualifier", null, 1, 1, TransactionHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransactionHeaderSegment_BinNumber(), this.getField(), null, "binNumber", null, 1, 1, TransactionHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransactionHeaderSegment_Version(), this.getField(), null, "version", null, 1, 1, TransactionHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getTransactionHeaderSegment_TransactionCode(), this.getField(), null, "transactionCode", null, 1, 1, TransactionHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(fieldEClass, Field.class, "Field", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getField_Field(), ecorePackage.getEString(), "field", null, 1, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEAttribute(getField_Value(), ecorePackage.getEString(), "value", null, 0, 1, Field.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(workersCompensationSegmentEClass, WorkersCompensationSegment.class, "WorkersCompensationSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getWorkersCompensationSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_DateOfInjury(), this.getField(), null, "dateOfInjury", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_EmployerName(), this.getField(), null, "employerName", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_EmployerStreetAddress(), this.getField(), null, "employerStreetAddress", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_EmployerCityAddress(), this.getField(), null, "employerCityAddress", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_EmployerStateprovinceAddress(), this.getField(), null, "employerStateprovinceAddress", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_EmployerZippostalZone(), this.getField(), null, "employerZippostalZone", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_EmployerPhoneNumber(), this.getField(), null, "employerPhoneNumber", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_EmployerContactName(), this.getField(), null, "employerContactName", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_CarrierId(), this.getField(), null, "carrierId", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_ClaimreferenceId(), this.getField(), null, "claimreferenceId", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_BillingEntityTypeIndicator(), this.getField(), null, "billingEntityTypeIndicator", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_PayToQualifier(), this.getField(), null, "payToQualifier", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_PayToId(), this.getField(), null, "payToId", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_PayToName(), this.getField(), null, "payToName", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_PayToStreetAddress(), this.getField(), null, "payToStreetAddress", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_PayToCityAddress(), this.getField(), null, "payToCityAddress", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_PayToStateprovinceAddress(), this.getField(), null, "payToStateprovinceAddress", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_PayToZippostalZone(), this.getField(), null, "payToZippostalZone", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_GenericEquivalentProductIdQualifier(), this.getField(), null, "genericEquivalentProductIdQualifier", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getWorkersCompensationSegment_GenericEquivalentProductId(), this.getField(), null, "genericEquivalentProductId", null, 0, -1, WorkersCompensationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(priorAuthorizationSegmentEClass, PriorAuthorizationSegment.class, "PriorAuthorizationSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPriorAuthorizationSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_RequestType(), this.getField(), null, "requestType", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_RequestPeriodDatebegin(), this.getField(), null, "requestPeriodDatebegin", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_RequestPeriodDateend(), this.getField(), null, "requestPeriodDateend", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_BasisOfRequest(), this.getField(), null, "basisOfRequest", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_AuthorizedRepresentativeFirstName(), this.getField(), null, "authorizedRepresentativeFirstName", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_AuthorizedRepresentativeLastName(), this.getField(), null, "authorizedRepresentativeLastName", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_AuthorizedRepresentativeStreetAddress(), this.getField(), null, "authorizedRepresentativeStreetAddress", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_AuthorizedRepresentativeCityAddress(), this.getField(), null, "authorizedRepresentativeCityAddress", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_AuthorizedRepresentativeStateprovinceAddress(), this.getField(), null, "authorizedRepresentativeStateprovinceAddress", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_AuthorizedRepresentativeZippostalZone(), this.getField(), null, "authorizedRepresentativeZippostalZone", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_PriorAuthorizationNumberassigned(), this.getField(), null, "priorAuthorizationNumberassigned", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_AuthorizationNumber(), this.getField(), null, "authorizationNumber", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPriorAuthorizationSegment_PriorAuthorizationSupportingDocumentation(), this.getField(), null, "priorAuthorizationSupportingDocumentation", null, 0, -1, PriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pricingSegmentEClass, PricingSegment.class, "PricingSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPricingSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_IngredientCostSubmitted(), this.getField(), null, "ingredientCostSubmitted", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_DispensingFeeSubmitted(), this.getField(), null, "dispensingFeeSubmitted", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_ProfessionalServiceFeeSubmitted(), this.getField(), null, "professionalServiceFeeSubmitted", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_PatientPaidAmountSubmitted(), this.getField(), null, "patientPaidAmountSubmitted", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_IncentiveAmountSubmitted(), this.getField(), null, "incentiveAmountSubmitted", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_OtherAmountClaimedSubmittedCount(), this.getField(), null, "otherAmountClaimedSubmittedCount", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_OtherAmountClaimedSubmittedQualifier(), this.getField(), null, "otherAmountClaimedSubmittedQualifier", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_OtherAmountClaimedSubmitted(), this.getField(), null, "otherAmountClaimedSubmitted", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_FlatSalesTaxAmountSubmitted(), this.getField(), null, "flatSalesTaxAmountSubmitted", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_PercentageSalesTaxAmountSubmitted(), this.getField(), null, "percentageSalesTaxAmountSubmitted", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_PercentageSalesTaxRateSubmitted(), this.getField(), null, "percentageSalesTaxRateSubmitted", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_PercentageSalesTaxBasisSubmitted(), this.getField(), null, "percentageSalesTaxBasisSubmitted", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_UsualAndCustomaryCharge(), this.getField(), null, "usualAndCustomaryCharge", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_GrossAmountDue(), this.getField(), null, "grossAmountDue", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_BasisOfCostDetermination(), this.getField(), null, "basisOfCostDetermination", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPricingSegment_MedicaidPaidAmount(), this.getField(), null, "medicaidPaidAmount", null, 0, -1, PricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(prescriberSegmentEClass, PrescriberSegment.class, "PrescriberSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPrescriberSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrescriberIdQualifier(), this.getField(), null, "prescriberIdQualifier", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrescriberId(), this.getField(), null, "prescriberId", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrescriberLastName(), this.getField(), null, "prescriberLastName", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrescriberPhoneNumber(), this.getField(), null, "prescriberPhoneNumber", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrimaryCareProviderIdQualifier(), this.getField(), null, "primaryCareProviderIdQualifier", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrimaryCareProviderId(), this.getField(), null, "primaryCareProviderId", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrimaryCareProviderLastName(), this.getField(), null, "primaryCareProviderLastName", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrescriberFirstName(), this.getField(), null, "prescriberFirstName", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrescriberStreetAddress(), this.getField(), null, "prescriberStreetAddress", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrescriberCityAddress(), this.getField(), null, "prescriberCityAddress", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrescriberStateprovinceAddress(), this.getField(), null, "prescriberStateprovinceAddress", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPrescriberSegment_PrescriberZippostalZone(), this.getField(), null, "prescriberZippostalZone", null, 0, -1, PrescriberSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(pharmacyProviderSegmentEClass, PharmacyProviderSegment.class, "PharmacyProviderSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPharmacyProviderSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, PharmacyProviderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPharmacyProviderSegment_ProviderIdQualifier(), this.getField(), null, "providerIdQualifier", null, 0, -1, PharmacyProviderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPharmacyProviderSegment_ProviderId(), this.getField(), null, "providerId", null, 0, -1, PharmacyProviderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(patientSegmentEClass, PatientSegment.class, "PatientSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getPatientSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientIdQualifier(), this.getField(), null, "patientIdQualifier", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientId(), this.getField(), null, "patientId", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_DateOfBirth(), this.getField(), null, "dateOfBirth", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientGenderCode(), this.getField(), null, "patientGenderCode", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientFirstName(), this.getField(), null, "patientFirstName", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientLastName(), this.getField(), null, "patientLastName", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientStreetAddress(), this.getField(), null, "patientStreetAddress", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientCityAddress(), this.getField(), null, "patientCityAddress", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientStateProvinceAddress(), this.getField(), null, "patientStateProvinceAddress", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientZippostalZone(), this.getField(), null, "patientZippostalZone", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientPhoneNumber(), this.getField(), null, "patientPhoneNumber", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PlaceOfService(), this.getField(), null, "placeOfService", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_EmployerId(), this.getField(), null, "employerId", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_SmokerNonsmokerCode(), this.getField(), null, "smokerNonsmokerCode", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PregnancyIndicator(), this.getField(), null, "pregnancyIndicator", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientEmailAddress(), this.getField(), null, "patientEmailAddress", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getPatientSegment_PatientResidence(), this.getField(), null, "patientResidence", null, 0, -1, PatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(narrativeSegmentEClass, NarrativeSegment.class, "NarrativeSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNarrativeSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, NarrativeSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getNarrativeSegment_NarrativeMessage(), this.getField(), null, "narrativeMessage", null, 0, -1, NarrativeSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(insuranceSegmentEClass, InsuranceSegment.class, "InsuranceSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInsuranceSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_CardholderId(), this.getField(), null, "cardholderId", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_CardholderFirstName(), this.getField(), null, "cardholderFirstName", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_CardholderLastName(), this.getField(), null, "cardholderLastName", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_HomePlan(), this.getField(), null, "homePlan", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_PlanId(), this.getField(), null, "planId", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_EligibilityClarificationCode(), this.getField(), null, "eligibilityClarificationCode", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_GroupId(), this.getField(), null, "groupId", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_PersonCode(), this.getField(), null, "personCode", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_PatientRelationshipCode(), this.getField(), null, "patientRelationshipCode", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_OtherPayerBinNumber(), this.getField(), null, "otherPayerBinNumber", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_OtherPayerProcessorControlNumber(), this.getField(), null, "otherPayerProcessorControlNumber", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_OtherPayerCardholderId(), this.getField(), null, "otherPayerCardholderId", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_OtherPayerGroupId(), this.getField(), null, "otherPayerGroupId", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_MedigapId(), this.getField(), null, "medigapId", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_MedicaidIndicator(), this.getField(), null, "medicaidIndicator", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_ProviderAcceptAssignmentIndicator(), this.getField(), null, "providerAcceptAssignmentIndicator", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_CmsPartDDefinedQualifiedFacility(), this.getField(), null, "cmsPartDDefinedQualifiedFacility", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_MedicaidIdNumber(), this.getField(), null, "medicaidIdNumber", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getInsuranceSegment_MedicaidAgencyNumber(), this.getField(), null, "medicaidAgencyNumber", null, 0, -1, InsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(facilitySegmentEClass, FacilitySegment.class, "FacilitySegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFacilitySegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, FacilitySegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFacilitySegment_FacilityId(), this.getField(), null, "facilityId", null, 0, -1, FacilitySegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFacilitySegment_FacilityName(), this.getField(), null, "facilityName", null, 0, -1, FacilitySegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFacilitySegment_FacilityStreetAddress(), this.getField(), null, "facilityStreetAddress", null, 0, -1, FacilitySegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFacilitySegment_FacilityCityAddress(), this.getField(), null, "facilityCityAddress", null, 0, -1, FacilitySegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFacilitySegment_FacilityStateprovinceAddress(), this.getField(), null, "facilityStateprovinceAddress", null, 0, -1, FacilitySegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getFacilitySegment_FacilityZippostalZone(), this.getField(), null, "facilityZippostalZone", null, 0, -1, FacilitySegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(durppsSegmentEClass, DURPPSSegment.class, "DURPPSSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getDURPPSSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, DURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDURPPSSegment_DurppsCodeCounter(), this.getField(), null, "durppsCodeCounter", null, 0, -1, DURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDURPPSSegment_ReasonForServiceCode(), this.getField(), null, "reasonForServiceCode", null, 0, -1, DURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDURPPSSegment_ProfessionalServiceCode(), this.getField(), null, "professionalServiceCode", null, 0, -1, DURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDURPPSSegment_ResultOfServiceCode(), this.getField(), null, "resultOfServiceCode", null, 0, -1, DURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDURPPSSegment_DurppsLevelOfEffort(), this.getField(), null, "durppsLevelOfEffort", null, 0, -1, DURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDURPPSSegment_DurCoagentIdQualifier(), this.getField(), null, "durCoagentIdQualifier", null, 0, -1, DURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getDURPPSSegment_DurCoagentId(), this.getField(), null, "durCoagentId", null, 0, -1, DURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(couponSegmentEClass, CouponSegment.class, "CouponSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCouponSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, CouponSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCouponSegment_CouponType(), this.getField(), null, "couponType", null, 0, -1, CouponSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCouponSegment_CouponNumber(), this.getField(), null, "couponNumber", null, 0, -1, CouponSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCouponSegment_CouponValueAmount(), this.getField(), null, "couponValueAmount", null, 0, -1, CouponSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(coordinationofBenefitsOtherPaymentsSegmentEClass, CoordinationofBenefitsOtherPaymentsSegment.class, "CoordinationofBenefitsOtherPaymentsSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCoordinationofBenefitsOtherPaymentsSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_CoordinationOfBenefitsotherPaymentsCount(), this.getField(), null, "coordinationOfBenefitsotherPaymentsCount", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerCoverageType(), this.getField(), null, "otherPayerCoverageType", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerIdQualifier(), this.getField(), null, "otherPayerIdQualifier", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerId(), this.getField(), null, "otherPayerId", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerDate(), this.getField(), null, "otherPayerDate", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_InternalControlNumber(), this.getField(), null, "internalControlNumber", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidCount(), this.getField(), null, "otherPayerAmountPaidCount", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidQualifier(), this.getField(), null, "otherPayerAmountPaidQualifier", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaid(), this.getField(), null, "otherPayerAmountPaid", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCount(), this.getField(), null, "otherPayerRejectCount", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCode(), this.getField(), null, "otherPayerRejectCode", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountCount(), this.getField(), null, "otherPayerpatientResponsibilityAmountCount", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountQualifier(), this.getField(), null, "otherPayerpatientResponsibilityAmountQualifier", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmount(), this.getField(), null, "otherPayerpatientResponsibilityAmount", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageCount(), this.getField(), null, "benefitStageCount", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageQualifier(), this.getField(), null, "benefitStageQualifier", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageAmount(), this.getField(), null, "benefitStageAmount", null, 0, -1, CoordinationofBenefitsOtherPaymentsSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(clinicalSegmentEClass, ClinicalSegment.class, "ClinicalSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClinicalSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, ClinicalSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClinicalSegment_DiagnosisCodeCount(), this.getField(), null, "diagnosisCodeCount", null, 0, -1, ClinicalSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClinicalSegment_DiagnosisCodeQualifier(), this.getField(), null, "diagnosisCodeQualifier", null, 0, -1, ClinicalSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClinicalSegment_DiagnosisCode(), this.getField(), null, "diagnosisCode", null, 0, -1, ClinicalSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClinicalSegment_ClinicalInformationCounter(), this.getField(), null, "clinicalInformationCounter", null, 0, -1, ClinicalSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClinicalSegment_MeasurementDate(), this.getField(), null, "measurementDate", null, 0, -1, ClinicalSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClinicalSegment_MeasurementTime(), this.getField(), null, "measurementTime", null, 0, -1, ClinicalSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClinicalSegment_MeasurementDimension(), this.getField(), null, "measurementDimension", null, 0, -1, ClinicalSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClinicalSegment_MeasurementUnit(), this.getField(), null, "measurementUnit", null, 0, -1, ClinicalSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClinicalSegment_MeasurementValue(), this.getField(), null, "measurementValue", null, 0, -1, ClinicalSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(claimSegmentEClass, ClaimSegment.class, "ClaimSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getClaimSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_PrescriptionserviceReferenceNumberQualifier(), this.getField(), null, "prescriptionserviceReferenceNumberQualifier", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_PrescriptionserviceReferenceNumber(), this.getField(), null, "prescriptionserviceReferenceNumber", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_ProductserviceIdQualifier(), this.getField(), null, "productserviceIdQualifier", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_ProductserviceId(), this.getField(), null, "productserviceId", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_AssociatedPrescriptionserviceReferenceNumber(), this.getField(), null, "associatedPrescriptionserviceReferenceNumber", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_AssociatedPrescriptionserviceDate(), this.getField(), null, "associatedPrescriptionserviceDate", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_ProcedureModifierCodeCount(), this.getField(), null, "procedureModifierCodeCount", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_ProcedureModifierCode(), this.getField(), null, "procedureModifierCode", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_QuantityDispensed(), this.getField(), null, "quantityDispensed", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_FillNumber(), this.getField(), null, "fillNumber", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_DaysSupply(), this.getField(), null, "daysSupply", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_CompoundCode(), this.getField(), null, "compoundCode", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_DispenseAsWrittendawproductSelectionCode(), this.getField(), null, "dispenseAsWrittendawproductSelectionCode", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_DatePrescriptionWritten(), this.getField(), null, "datePrescriptionWritten", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_NumberOfRefillsAuthorized(), this.getField(), null, "numberOfRefillsAuthorized", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_PrescriptionOriginCode(), this.getField(), null, "prescriptionOriginCode", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_SubmissionClarificationCodeCount(), this.getField(), null, "submissionClarificationCodeCount", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_SubmissionClarificationCode(), this.getField(), null, "submissionClarificationCode", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_QuantityPrescribed(), this.getField(), null, "quantityPrescribed", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_OtherCoverageCode(), this.getField(), null, "otherCoverageCode", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_SpecialPackagingIndicator(), this.getField(), null, "specialPackagingIndicator", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_OriginallyPrescribedProductserviceIdQualifier(), this.getField(), null, "originallyPrescribedProductserviceIdQualifier", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_OriginallyPrescribedProductserviceCode(), this.getField(), null, "originallyPrescribedProductserviceCode", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_OriginallyPrescribedQuantity(), this.getField(), null, "originallyPrescribedQuantity", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_AlternateId(), this.getField(), null, "alternateId", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_ScheduledPrescriptionIdNumber(), this.getField(), null, "scheduledPrescriptionIdNumber", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_UnitOfMeasure(), this.getField(), null, "unitOfMeasure", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_LevelOfService(), this.getField(), null, "levelOfService", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_PriorAuthorizationTypeCode(), this.getField(), null, "priorAuthorizationTypeCode", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_PriorAuthorizationNumberSubmitted(), this.getField(), null, "priorAuthorizationNumberSubmitted", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_IntermediaryAuthorizationTypeId(), this.getField(), null, "intermediaryAuthorizationTypeId", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_IntermediaryAuthorizationId(), this.getField(), null, "intermediaryAuthorizationId", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_DispensingStatus(), this.getField(), null, "dispensingStatus", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_QuantityIntendedToBeDispensed(), this.getField(), null, "quantityIntendedToBeDispensed", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_DaysSupplyIntendedToBeDispensed(), this.getField(), null, "daysSupplyIntendedToBeDispensed", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_DelayReasonCode(), this.getField(), null, "delayReasonCode", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_TransactionReferenceNumber(), this.getField(), null, "transactionReferenceNumber", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_PatientAssignmentIndicatordirectMemberReimbursementIndicator(), this.getField(), null, "patientAssignmentIndicatordirectMemberReimbursementIndicator", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_RouteOfAdministration(), this.getField(), null, "routeOfAdministration", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_CompoundType(), this.getField(), null, "compoundType", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn(), this.getField(), null, "medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getClaimSegment_PharmacyServiceType(), this.getField(), null, "pharmacyServiceType", null, 0, -1, ClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(additionalDocumentationSegmentEClass, AdditionalDocumentationSegment.class, "AdditionalDocumentationSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAdditionalDocumentationSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_AdditionalDocumentationTypeId(), this.getField(), null, "additionalDocumentationTypeId", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_RequestPeriodBeginDate(), this.getField(), null, "requestPeriodBeginDate", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_RequestPeriodRecertrevisedDate(), this.getField(), null, "requestPeriodRecertrevisedDate", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_RequestStatus(), this.getField(), null, "requestStatus", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_LengthOfNeedQualifier(), this.getField(), null, "lengthOfNeedQualifier", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_LengthOfNeed(), this.getField(), null, "lengthOfNeed", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_PrescribersupplierDateSigned(), this.getField(), null, "prescribersupplierDateSigned", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_SupportingDocumentation(), this.getField(), null, "supportingDocumentation", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_QuestionNumberletterCount(), this.getField(), null, "questionNumberletterCount", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_QuestionNumberletter(), this.getField(), null, "questionNumberletter", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_QuestionPercentResponse(), this.getField(), null, "questionPercentResponse", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_QuestionDateResponse(), this.getField(), null, "questionDateResponse", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_QuestionDollarAmountResponse(), this.getField(), null, "questionDollarAmountResponse", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_QuestionNumericResponse(), this.getField(), null, "questionNumericResponse", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getAdditionalDocumentationSegment_QuestionAlphanumericResponse(), this.getField(), null, "questionAlphanumericResponse", null, 0, -1, AdditionalDocumentationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(compoundSegmentEClass, CompoundSegment.class, "CompoundSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCompoundSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, CompoundSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompoundSegment_CompoundDosageFormDescriptionCode(), this.getField(), null, "compoundDosageFormDescriptionCode", null, 0, -1, CompoundSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompoundSegment_CompoundDispensingUnitFormIndicator(), this.getField(), null, "compoundDispensingUnitFormIndicator", null, 0, -1, CompoundSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompoundSegment_CompoundIngredientComponentCount(), this.getField(), null, "compoundIngredientComponentCount", null, 0, -1, CompoundSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompoundSegment_CompoundProductIdQualifier(), this.getField(), null, "compoundProductIdQualifier", null, 0, -1, CompoundSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompoundSegment_CompoundProductId(), this.getField(), null, "compoundProductId", null, 0, -1, CompoundSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompoundSegment_CompoundIngredientQuantity(), this.getField(), null, "compoundIngredientQuantity", null, 0, -1, CompoundSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompoundSegment_CompoundIngredientDrugCost(), this.getField(), null, "compoundIngredientDrugCost", null, 0, -1, CompoundSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompoundSegment_CompoundIngredientBasisOfCostDetermination(), this.getField(), null, "compoundIngredientBasisOfCostDetermination", null, 0, -1, CompoundSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompoundSegment_CompoundIngredientModifierCodeCount(), this.getField(), null, "compoundIngredientModifierCodeCount", null, 0, -1, CompoundSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getCompoundSegment_CompoundIngredientModifierCode(), this.getField(), null, "compoundIngredientModifierCode", null, 0, -1, CompoundSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responseEClass, Response.class, "Response", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponse_ResponseHeaderSegment(), this.getResponseHeaderSegment(), null, "responseHeaderSegment", null, 1, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponse_ResponseClaimSegment(), this.getResponseClaimSegment(), null, "responseClaimSegment", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponse_ResponseCoordinationofBenefitsOtherPayersSegment(), this.getResponseCoordinationofBenefitsOtherPayersSegment(), null, "responseCoordinationofBenefitsOtherPayersSegment", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponse_ResponseDURPPSSegment(), this.getResponseDURPPSSegment(), null, "responseDURPPSSegment", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponse_ResponseInsuranceSegment(), this.getResponseInsuranceSegment(), null, "responseInsuranceSegment", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponse_ResponseMessageSegment(), this.getResponseMessageSegment(), null, "responseMessageSegment", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponse_ResponsePatientSegment(), this.getResponsePatientSegment(), null, "responsePatientSegment", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponse_ResponsePricingSegment(), this.getResponsePricingSegment(), null, "responsePricingSegment", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponse_ResponsePriorAuthorizationSegment(), this.getResponsePriorAuthorizationSegment(), null, "responsePriorAuthorizationSegment", null, 0, 1, Response.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responseHeaderSegmentEClass, ResponseHeaderSegment.class, "ResponseHeaderSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getResponseHeaderSegment_VersionreleaseNumber(), this.getField(), null, "versionreleaseNumber", null, 1, 1, ResponseHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseHeaderSegment_TransactionCode(), this.getField(), null, "transactionCode", null, 1, 1, ResponseHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseHeaderSegment_TransactionCount(), this.getField(), null, "transactionCount", null, 1, 1, ResponseHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseHeaderSegment_HeaderResponseStatus(), this.getField(), null, "headerResponseStatus", null, 1, 1, ResponseHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseHeaderSegment_ServiceProviderIdQualifier(), this.getField(), null, "serviceProviderIdQualifier", null, 1, 1, ResponseHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseHeaderSegment_ServiceProviderId(), this.getField(), null, "serviceProviderId", null, 1, 1, ResponseHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseHeaderSegment_DateOfService(), this.getField(), null, "dateOfService", null, 1, 1, ResponseHeaderSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responseClaimSegmentEClass, ResponseClaimSegment.class, "ResponseClaimSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseClaimSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, ResponseClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseClaimSegment_PrescriptionserviceReferenceNumberQualifier(), this.getField(), null, "prescriptionserviceReferenceNumberQualifier", null, 0, -1, ResponseClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseClaimSegment_PrescriptionserviceReferenceNumber(), this.getField(), null, "prescriptionserviceReferenceNumber", null, 0, -1, ResponseClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseClaimSegment_PreferredProductCount(), this.getField(), null, "preferredProductCount", null, 0, -1, ResponseClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseClaimSegment_PreferredProductIdQualifier(), this.getField(), null, "preferredProductIdQualifier", null, 0, -1, ResponseClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseClaimSegment_PreferredProductId(), this.getField(), null, "preferredProductId", null, 0, -1, ResponseClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseClaimSegment_PreferredProductIncentive(), this.getField(), null, "preferredProductIncentive", null, 0, -1, ResponseClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseClaimSegment_PreferredProductCostShareIncentive(), this.getField(), null, "preferredProductCostShareIncentive", null, 0, -1, ResponseClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseClaimSegment_PreferredProductDescription(), this.getField(), null, "preferredProductDescription", null, 0, -1, ResponseClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn(), this.getField(), null, "medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn", null, 0, -1, ResponseClaimSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responseCoordinationofBenefitsOtherPayersSegmentEClass, ResponseCoordinationofBenefitsOtherPayersSegment.class, "ResponseCoordinationofBenefitsOtherPayersSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseCoordinationofBenefitsOtherPayersSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdCount(), this.getField(), null, "otherPayerIdCount", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCoverageType(), this.getField(), null, "otherPayerCoverageType", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdQualifier(), this.getField(), null, "otherPayerIdQualifier", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerId(), this.getField(), null, "otherPayerId", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerProcessorControlNumber(), this.getField(), null, "otherPayerProcessorControlNumber", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCardholderId(), this.getField(), null, "otherPayerCardholderId", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerGroupId(), this.getField(), null, "otherPayerGroupId", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPersonCode(), this.getField(), null, "otherPayerPersonCode", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerHelpDeskPhoneNumber(), this.getField(), null, "otherPayerHelpDeskPhoneNumber", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPatientRelationshipCode(), this.getField(), null, "otherPayerPatientRelationshipCode", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitEffectiveDate(), this.getField(), null, "otherPayerBenefitEffectiveDate", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitTerminationDate(), this.getField(), null, "otherPayerBenefitTerminationDate", null, 0, -1, ResponseCoordinationofBenefitsOtherPayersSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responseDURPPSSegmentEClass, ResponseDURPPSSegment.class, "ResponseDURPPSSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseDURPPSSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, ResponseDURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseDURPPSSegment_DurppsResponseCodeCounter(), this.getField(), null, "durppsResponseCodeCounter", null, 0, -1, ResponseDURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseDURPPSSegment_ReasonForServiceCode(), this.getField(), null, "reasonForServiceCode", null, 0, -1, ResponseDURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseDURPPSSegment_ClinicalSignificanceCode(), this.getField(), null, "clinicalSignificanceCode", null, 0, -1, ResponseDURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseDURPPSSegment_OtherPharmacyIndicator(), this.getField(), null, "otherPharmacyIndicator", null, 0, -1, ResponseDURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseDURPPSSegment_PreviousDateOfFill(), this.getField(), null, "previousDateOfFill", null, 0, -1, ResponseDURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseDURPPSSegment_QuantityOfPreviousFill(), this.getField(), null, "quantityOfPreviousFill", null, 0, -1, ResponseDURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseDURPPSSegment_DatabaseIndicator(), this.getField(), null, "databaseIndicator", null, 0, -1, ResponseDURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseDURPPSSegment_OtherPrescriberIndicator(), this.getField(), null, "otherPrescriberIndicator", null, 0, -1, ResponseDURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseDURPPSSegment_DurFreeTextMessage(), this.getField(), null, "durFreeTextMessage", null, 0, -1, ResponseDURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseDURPPSSegment_DurAdditionalText(), this.getField(), null, "durAdditionalText", null, 0, -1, ResponseDURPPSSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responseInsuranceSegmentEClass, ResponseInsuranceSegment.class, "ResponseInsuranceSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseInsuranceSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, ResponseInsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseInsuranceSegment_GroupId(), this.getField(), null, "groupId", null, 0, -1, ResponseInsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseInsuranceSegment_PlanId(), this.getField(), null, "planId", null, 0, -1, ResponseInsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseInsuranceSegment_NetworkReimbursementId(), this.getField(), null, "networkReimbursementId", null, 0, -1, ResponseInsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseInsuranceSegment_PayerIdQualifier(), this.getField(), null, "payerIdQualifier", null, 0, -1, ResponseInsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseInsuranceSegment_PayerId(), this.getField(), null, "payerId", null, 0, -1, ResponseInsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseInsuranceSegment_MedicaidIdNumber(), this.getField(), null, "medicaidIdNumber", null, 0, -1, ResponseInsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseInsuranceSegment_MedicaidAgencyNumber(), this.getField(), null, "medicaidAgencyNumber", null, 0, -1, ResponseInsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseInsuranceSegment_CardholderId(), this.getField(), null, "cardholderId", null, 0, -1, ResponseInsuranceSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responseMessageSegmentEClass, ResponseMessageSegment.class, "ResponseMessageSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseMessageSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, ResponseMessageSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseMessageSegment_Message(), this.getField(), null, "message", null, 0, -1, ResponseMessageSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responsePatientSegmentEClass, ResponsePatientSegment.class, "ResponsePatientSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponsePatientSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, ResponsePatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePatientSegment_PatientFirstName(), this.getField(), null, "patientFirstName", null, 0, -1, ResponsePatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePatientSegment_PatientLastName(), this.getField(), null, "patientLastName", null, 0, -1, ResponsePatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePatientSegment_DateOfBirth(), this.getField(), null, "dateOfBirth", null, 0, -1, ResponsePatientSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responsePricingSegmentEClass, ResponsePricingSegment.class, "ResponsePricingSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponsePricingSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_PatientPayAmount(), this.getField(), null, "patientPayAmount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_IngredientCostPaid(), this.getField(), null, "ingredientCostPaid", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_DispensingFeePaid(), this.getField(), null, "dispensingFeePaid", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_TaxExemptIndicator(), this.getField(), null, "taxExemptIndicator", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_FlatSalesTaxAmountPaid(), this.getField(), null, "flatSalesTaxAmountPaid", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_PercentageSalesTaxAmountPaid(), this.getField(), null, "percentageSalesTaxAmountPaid", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_PercentageSalesTaxRatePaid(), this.getField(), null, "percentageSalesTaxRatePaid", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_PercentageSalesTaxBasisPaid(), this.getField(), null, "percentageSalesTaxBasisPaid", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_IncentiveAmountPaid(), this.getField(), null, "incentiveAmountPaid", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_ProfessionalServiceFeePaid(), this.getField(), null, "professionalServiceFeePaid", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_OtherAmountPaidCount(), this.getField(), null, "otherAmountPaidCount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_OtherAmountPaidQualifier(), this.getField(), null, "otherAmountPaidQualifier", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_OtherAmountPaid(), this.getField(), null, "otherAmountPaid", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_OtherPayerAmountRecognized(), this.getField(), null, "otherPayerAmountRecognized", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_TotalAmountPaid(), this.getField(), null, "totalAmountPaid", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_BasisOfReimbursementDetermination(), this.getField(), null, "basisOfReimbursementDetermination", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AmountAttributedToSalesTax(), this.getField(), null, "amountAttributedToSalesTax", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AccumulatedDeductibleAmount(), this.getField(), null, "accumulatedDeductibleAmount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_RemainingDeductibleAmount(), this.getField(), null, "remainingDeductibleAmount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_RemainingBenefitAmount(), this.getField(), null, "remainingBenefitAmount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AmountAppliedToPeriodicDeductible(), this.getField(), null, "amountAppliedToPeriodicDeductible", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AmountOfCopay(), this.getField(), null, "amountOfCopay", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AmountExceedingPeriodicBenefitMaximum(), this.getField(), null, "amountExceedingPeriodicBenefitMaximum", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_BasisOfCalculationdispensingFee(), this.getField(), null, "basisOfCalculationdispensingFee", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_BasisOfCalculationcopay(), this.getField(), null, "basisOfCalculationcopay", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_BasisOfCalculationflatSalesTax(), this.getField(), null, "basisOfCalculationflatSalesTax", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_BasisOfCalculationpercentageSalesTax(), this.getField(), null, "basisOfCalculationpercentageSalesTax", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AmountAttributedToProcessorFee(), this.getField(), null, "amountAttributedToProcessorFee", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_PatientSalesTaxAmount(), this.getField(), null, "patientSalesTaxAmount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_PlanSalesTaxAmount(), this.getField(), null, "planSalesTaxAmount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AmountOfCoinsurance(), this.getField(), null, "amountOfCoinsurance", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_BasisOfCalculationcoinsurance(), this.getField(), null, "basisOfCalculationcoinsurance", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_BenefitStageCount(), this.getField(), null, "benefitStageCount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_BenefitStageQualifier(), this.getField(), null, "benefitStageQualifier", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_BenefitStageAmount(), this.getField(), null, "benefitStageAmount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_EstimatedGenericSavings(), this.getField(), null, "estimatedGenericSavings", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_SpendingAccountAmountRemaining(), this.getField(), null, "spendingAccountAmountRemaining", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_HealthPlanfundedAssistanceAmount(), this.getField(), null, "healthPlanfundedAssistanceAmount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AmountAttributedToProviderNetworkSelection(), this.getField(), null, "amountAttributedToProviderNetworkSelection", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AmountAttributedToProductSelectionbrandDrug(), this.getField(), null, "amountAttributedToProductSelectionbrandDrug", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AmountAttributedToProductSelectionnonpreferredFormularySelection(), this.getField(), null, "amountAttributedToProductSelectionnonpreferredFormularySelection", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AmountAttributedToProductSelectionbrandNonpreferredFormularySelection(), this.getField(), null, "amountAttributedToProductSelectionbrandNonpreferredFormularySelection", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_AmountAttributedToCoverageGap(), this.getField(), null, "amountAttributedToCoverageGap", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_IngredientCostContractedreimbursableAmount(), this.getField(), null, "ingredientCostContractedreimbursableAmount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePricingSegment_DispensingFeeContractedreimbursableAmount(), this.getField(), null, "dispensingFeeContractedreimbursableAmount", null, 0, -1, ResponsePricingSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responsePriorAuthorizationSegmentEClass, ResponsePriorAuthorizationSegment.class, "ResponsePriorAuthorizationSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponsePriorAuthorizationSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, ResponsePriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePriorAuthorizationSegment_PriorAuthorizationProcessedDate(), this.getField(), null, "priorAuthorizationProcessedDate", null, 0, -1, ResponsePriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePriorAuthorizationSegment_PriorAuthorizationEffectiveDate(), this.getField(), null, "priorAuthorizationEffectiveDate", null, 0, -1, ResponsePriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePriorAuthorizationSegment_PriorAuthorizationExpirationDate(), this.getField(), null, "priorAuthorizationExpirationDate", null, 0, -1, ResponsePriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePriorAuthorizationSegment_PriorAuthorizationQuantity(), this.getField(), null, "priorAuthorizationQuantity", null, 0, -1, ResponsePriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePriorAuthorizationSegment_PriorAuthorizationDollarsAuthorized(), this.getField(), null, "priorAuthorizationDollarsAuthorized", null, 0, -1, ResponsePriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePriorAuthorizationSegment_PriorAuthorizationNumberOfRefillsAuthorized(), this.getField(), null, "priorAuthorizationNumberOfRefillsAuthorized", null, 0, -1, ResponsePriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePriorAuthorizationSegment_PriorAuthorizationQuantityAccumulated(), this.getField(), null, "priorAuthorizationQuantityAccumulated", null, 0, -1, ResponsePriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponsePriorAuthorizationSegment_PriorAuthorizationNumberassigned(), this.getField(), null, "priorAuthorizationNumberassigned", null, 0, -1, ResponsePriorAuthorizationSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		initEClass(responseStatusSegmentEClass, ResponseStatusSegment.class, "ResponseStatusSegment", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getResponseStatusSegment_SegmentIdentification(), ecorePackage.getEString(), "segmentIdentification", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_TransactionResponseStatus(), this.getField(), null, "transactionResponseStatus", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_AuthorizationNumber(), this.getField(), null, "authorizationNumber", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_RejectCount(), this.getField(), null, "rejectCount", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_RejectCode(), this.getField(), null, "rejectCode", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_RejectFieldOccurrenceIndicator(), this.getField(), null, "rejectFieldOccurrenceIndicator", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_ApprovedMessageCodeCount(), this.getField(), null, "approvedMessageCodeCount", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_ApprovedMessageCode(), this.getField(), null, "approvedMessageCode", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_AdditionalMessageInformationCount(), this.getField(), null, "additionalMessageInformationCount", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_AdditionalMessageInformationQualifier(), this.getField(), null, "additionalMessageInformationQualifier", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_AdditionalMessageInformation(), this.getField(), null, "additionalMessageInformation", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_AdditionalMessageInformationContinuity(), this.getField(), null, "additionalMessageInformationContinuity", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_HelpDeskPhoneNumberQualifier(), this.getField(), null, "helpDeskPhoneNumberQualifier", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_HelpDeskPhoneNumber(), this.getField(), null, "helpDeskPhoneNumber", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_TransactionReferenceNumber(), this.getField(), null, "transactionReferenceNumber", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_InternalControlNumber(), this.getField(), null, "internalControlNumber", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);
		initEReference(getResponseStatusSegment_Url(), this.getField(), null, "url", null, 0, -1, ResponseStatusSegment.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
		// http://www.ncpdp.org/uml/telecom/annotation
		createAnnotationAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";				
		addAnnotation
		  (documentRootEClass, 
		   source, 
		   new String[] {
			 "kind", "mixed",
			 "name", ""
		   });		
		addAnnotation
		  (getDocumentRoot_Mixed(), 
		   source, 
		   new String[] {
			 "name", ":mixed",
			 "kind", "elementWildcard"
		   });		
		addAnnotation
		  (getDocumentRoot_XMLNSPrefixMap(), 
		   source, 
		   new String[] {
			 "name", "xmlns:prefix",
			 "kind", "attribute"
		   });		
		addAnnotation
		  (getDocumentRoot_XSISchemaLocation(), 
		   source, 
		   new String[] {
			 "name", "xsi:schemaLocation",
			 "kind", "attribute"
		   });		
		addAnnotation
		  (getDocumentRoot_Transmission(), 
		   source, 
		   new String[] {
			 "name", "",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getDocumentRoot_Response(), 
		   source, 
		   new String[] {
			 "name", "",
			 "namespace", "##targetNamespace"
		   });						
		addAnnotation
		  (getTransmission_TransactionHeaderSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_WorkersCompensationSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_PriorAuthorizationSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_PricingSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_PrescriberSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_PharmacyProviderSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_PatientSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_NarrativeSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_InsuranceSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_FacilitySegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_DURPPSSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_CouponSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_CoordinationofBenefitsOtherPaymentsSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_ClinicalSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_ClaimSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_AdditionalDocumentationSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransmission_CompoundSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionHeaderSegment_AssignedAuthor(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionHeaderSegment_DateOfService(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionHeaderSegment_SoftwareVendorcertificationId(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionHeaderSegment_TransactionCount(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionHeaderSegment_ServiceProviderId(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionHeaderSegment_ProcessorControlNumber(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionHeaderSegment_ServiceProviderIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionHeaderSegment_BinNumber(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionHeaderSegment_Version(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getTransactionHeaderSegment_TransactionCode(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getWorkersCompensationSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_DateOfInjury(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_EmployerName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_EmployerStreetAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_EmployerCityAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_EmployerStateprovinceAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_EmployerZippostalZone(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_EmployerPhoneNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_EmployerContactName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_CarrierId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_ClaimreferenceId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_BillingEntityTypeIndicator(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_PayToQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_PayToId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_PayToName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_PayToStreetAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_PayToCityAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_PayToStateprovinceAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_PayToZippostalZone(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_GenericEquivalentProductIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getWorkersCompensationSegment_GenericEquivalentProductId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getPriorAuthorizationSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_RequestType(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_RequestPeriodDatebegin(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_RequestPeriodDateend(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_BasisOfRequest(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_AuthorizedRepresentativeFirstName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_AuthorizedRepresentativeLastName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_AuthorizedRepresentativeStreetAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_AuthorizedRepresentativeCityAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_AuthorizedRepresentativeStateprovinceAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_AuthorizedRepresentativeZippostalZone(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_PriorAuthorizationNumberassigned(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_AuthorizationNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPriorAuthorizationSegment_PriorAuthorizationSupportingDocumentation(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getPricingSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getPricingSegment_IngredientCostSubmitted(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_DispensingFeeSubmitted(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_ProfessionalServiceFeeSubmitted(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_PatientPaidAmountSubmitted(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_IncentiveAmountSubmitted(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_OtherAmountClaimedSubmittedCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_OtherAmountClaimedSubmittedQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_OtherAmountClaimedSubmitted(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_FlatSalesTaxAmountSubmitted(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_PercentageSalesTaxAmountSubmitted(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_PercentageSalesTaxRateSubmitted(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_PercentageSalesTaxBasisSubmitted(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_UsualAndCustomaryCharge(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_GrossAmountDue(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_BasisOfCostDetermination(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPricingSegment_MedicaidPaidAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getPrescriberSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrescriberIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrescriberId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrescriberLastName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrescriberPhoneNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrimaryCareProviderIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrimaryCareProviderId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrimaryCareProviderLastName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrescriberFirstName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrescriberStreetAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrescriberCityAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrescriberStateprovinceAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPrescriberSegment_PrescriberZippostalZone(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getPharmacyProviderSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getPharmacyProviderSegment_ProviderIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPharmacyProviderSegment_ProviderId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getPatientSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getPatientSegment_PatientIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PatientId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_DateOfBirth(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PatientGenderCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PatientFirstName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PatientLastName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PatientStreetAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PatientCityAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PatientStateProvinceAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PatientZippostalZone(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PatientPhoneNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PlaceOfService(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_EmployerId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_SmokerNonsmokerCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PregnancyIndicator(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PatientEmailAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getPatientSegment_PatientResidence(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getNarrativeSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getNarrativeSegment_NarrativeMessage(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getInsuranceSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getInsuranceSegment_CardholderId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_CardholderFirstName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_CardholderLastName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_HomePlan(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_PlanId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_EligibilityClarificationCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_GroupId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_PersonCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_PatientRelationshipCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_OtherPayerBinNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_OtherPayerProcessorControlNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_OtherPayerCardholderId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_OtherPayerGroupId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_MedigapId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_MedicaidIndicator(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_ProviderAcceptAssignmentIndicator(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_CmsPartDDefinedQualifiedFacility(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_MedicaidIdNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getInsuranceSegment_MedicaidAgencyNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getFacilitySegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getFacilitySegment_FacilityId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getFacilitySegment_FacilityName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getFacilitySegment_FacilityStreetAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getFacilitySegment_FacilityCityAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getFacilitySegment_FacilityStateprovinceAddress(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getFacilitySegment_FacilityZippostalZone(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getDURPPSSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getDURPPSSegment_DurppsCodeCounter(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getDURPPSSegment_ReasonForServiceCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getDURPPSSegment_ProfessionalServiceCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getDURPPSSegment_ResultOfServiceCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getDURPPSSegment_DurppsLevelOfEffort(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getDURPPSSegment_DurCoagentIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getDURPPSSegment_DurCoagentId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getCouponSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getCouponSegment_CouponType(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCouponSegment_CouponNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCouponSegment_CouponValueAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_CoordinationOfBenefitsotherPaymentsCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerCoverageType(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerDate(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_InternalControlNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaidQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerAmountPaid(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerRejectCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmountQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_OtherPayerpatientResponsibilityAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCoordinationofBenefitsOtherPaymentsSegment_BenefitStageAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getClinicalSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getClinicalSegment_DiagnosisCodeCount(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClinicalSegment_DiagnosisCodeQualifier(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClinicalSegment_DiagnosisCode(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClinicalSegment_ClinicalInformationCounter(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClinicalSegment_MeasurementDate(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClinicalSegment_MeasurementTime(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClinicalSegment_MeasurementDimension(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClinicalSegment_MeasurementUnit(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClinicalSegment_MeasurementValue(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getClaimSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getClaimSegment_PrescriptionserviceReferenceNumberQualifier(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_PrescriptionserviceReferenceNumber(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_ProductserviceIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_ProductserviceId(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_AssociatedPrescriptionserviceReferenceNumber(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_AssociatedPrescriptionserviceDate(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_ProcedureModifierCodeCount(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_ProcedureModifierCode(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_QuantityDispensed(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_FillNumber(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_DaysSupply(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_CompoundCode(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_DispenseAsWrittendawproductSelectionCode(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_DatePrescriptionWritten(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_NumberOfRefillsAuthorized(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_PrescriptionOriginCode(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_SubmissionClarificationCodeCount(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_SubmissionClarificationCode(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_QuantityPrescribed(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_OtherCoverageCode(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_SpecialPackagingIndicator(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_OriginallyPrescribedProductserviceIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_OriginallyPrescribedProductserviceCode(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_OriginallyPrescribedQuantity(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_AlternateId(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_ScheduledPrescriptionIdNumber(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_UnitOfMeasure(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_LevelOfService(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_PriorAuthorizationTypeCode(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_PriorAuthorizationNumberSubmitted(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_IntermediaryAuthorizationTypeId(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_IntermediaryAuthorizationId(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_DispensingStatus(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_QuantityIntendedToBeDispensed(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_DaysSupplyIntendedToBeDispensed(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_DelayReasonCode(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_TransactionReferenceNumber(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_PatientAssignmentIndicatordirectMemberReimbursementIndicator(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_RouteOfAdministration(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_CompoundType(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getClaimSegment_PharmacyServiceType(), 
		   source, 
		   new String[] {
			 "name", "element",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getAdditionalDocumentationSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_AdditionalDocumentationTypeId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_RequestPeriodBeginDate(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_RequestPeriodRecertrevisedDate(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_RequestStatus(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_LengthOfNeedQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_LengthOfNeed(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_PrescribersupplierDateSigned(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_SupportingDocumentation(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_QuestionNumberletterCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_QuestionNumberletter(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_QuestionPercentResponse(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_QuestionDateResponse(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_QuestionDollarAmountResponse(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_QuestionNumericResponse(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getAdditionalDocumentationSegment_QuestionAlphanumericResponse(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getCompoundSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getCompoundSegment_CompoundDosageFormDescriptionCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCompoundSegment_CompoundDispensingUnitFormIndicator(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCompoundSegment_CompoundIngredientComponentCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCompoundSegment_CompoundProductIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCompoundSegment_CompoundProductId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCompoundSegment_CompoundIngredientQuantity(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCompoundSegment_CompoundIngredientDrugCost(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCompoundSegment_CompoundIngredientBasisOfCostDetermination(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCompoundSegment_CompoundIngredientModifierCodeCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getCompoundSegment_CompoundIngredientModifierCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponse_ResponseHeaderSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResponse_ResponseClaimSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResponse_ResponseCoordinationofBenefitsOtherPayersSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResponse_ResponseDURPPSSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResponse_ResponseInsuranceSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResponse_ResponseMessageSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResponse_ResponsePatientSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResponse_ResponsePricingSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });		
		addAnnotation
		  (getResponse_ResponsePriorAuthorizationSegment(), 
		   source, 
		   new String[] {
			 "name", "segment",
			 "namespace", "##targetNamespace"
		   });			
		addAnnotation
		  (getResponseHeaderSegment_VersionreleaseNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseHeaderSegment_TransactionCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseHeaderSegment_TransactionCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseHeaderSegment_HeaderResponseStatus(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseHeaderSegment_ServiceProviderIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseHeaderSegment_ServiceProviderId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseHeaderSegment_DateOfService(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getResponseClaimSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getResponseClaimSegment_PrescriptionserviceReferenceNumberQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseClaimSegment_PrescriptionserviceReferenceNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseClaimSegment_PreferredProductCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseClaimSegment_PreferredProductIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseClaimSegment_PreferredProductId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseClaimSegment_PreferredProductIncentive(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseClaimSegment_PreferredProductCostShareIncentive(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseClaimSegment_PreferredProductDescription(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCoverageType(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerProcessorControlNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerCardholderId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerGroupId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPersonCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerHelpDeskPhoneNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerPatientRelationshipCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitEffectiveDate(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseCoordinationofBenefitsOtherPayersSegment_OtherPayerBenefitTerminationDate(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getResponseDURPPSSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getResponseDURPPSSegment_DurppsResponseCodeCounter(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseDURPPSSegment_ReasonForServiceCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseDURPPSSegment_ClinicalSignificanceCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseDURPPSSegment_OtherPharmacyIndicator(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseDURPPSSegment_PreviousDateOfFill(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseDURPPSSegment_QuantityOfPreviousFill(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseDURPPSSegment_DatabaseIndicator(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseDURPPSSegment_OtherPrescriberIndicator(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseDURPPSSegment_DurFreeTextMessage(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseDURPPSSegment_DurAdditionalText(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getResponseInsuranceSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getResponseInsuranceSegment_GroupId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseInsuranceSegment_PlanId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseInsuranceSegment_NetworkReimbursementId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseInsuranceSegment_PayerIdQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseInsuranceSegment_PayerId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseInsuranceSegment_MedicaidIdNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseInsuranceSegment_MedicaidAgencyNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseInsuranceSegment_CardholderId(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getResponseMessageSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getResponseMessageSegment_Message(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getResponsePatientSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getResponsePatientSegment_PatientFirstName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePatientSegment_PatientLastName(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePatientSegment_DateOfBirth(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getResponsePricingSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getResponsePricingSegment_PatientPayAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_IngredientCostPaid(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_DispensingFeePaid(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_TaxExemptIndicator(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_FlatSalesTaxAmountPaid(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_PercentageSalesTaxAmountPaid(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_PercentageSalesTaxRatePaid(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_PercentageSalesTaxBasisPaid(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_IncentiveAmountPaid(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_ProfessionalServiceFeePaid(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_OtherAmountPaidCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_OtherAmountPaidQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_OtherAmountPaid(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_OtherPayerAmountRecognized(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_TotalAmountPaid(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_BasisOfReimbursementDetermination(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AmountAttributedToSalesTax(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AccumulatedDeductibleAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_RemainingDeductibleAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_RemainingBenefitAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AmountAppliedToPeriodicDeductible(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AmountOfCopay(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AmountExceedingPeriodicBenefitMaximum(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_BasisOfCalculationdispensingFee(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_BasisOfCalculationcopay(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_BasisOfCalculationflatSalesTax(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_BasisOfCalculationpercentageSalesTax(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AmountAttributedToProcessorFee(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_PatientSalesTaxAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_PlanSalesTaxAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AmountOfCoinsurance(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_BasisOfCalculationcoinsurance(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_BenefitStageCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_BenefitStageQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_BenefitStageAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_EstimatedGenericSavings(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_SpendingAccountAmountRemaining(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_HealthPlanfundedAssistanceAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AmountAttributedToProviderNetworkSelection(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AmountAttributedToProductSelectionbrandDrug(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AmountAttributedToProductSelectionnonpreferredFormularySelection(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AmountAttributedToProductSelectionbrandNonpreferredFormularySelection(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_AmountAttributedToCoverageGap(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_IngredientCostContractedreimbursableAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePricingSegment_DispensingFeeContractedreimbursableAmount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getResponsePriorAuthorizationSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getResponsePriorAuthorizationSegment_PriorAuthorizationProcessedDate(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePriorAuthorizationSegment_PriorAuthorizationEffectiveDate(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePriorAuthorizationSegment_PriorAuthorizationExpirationDate(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePriorAuthorizationSegment_PriorAuthorizationQuantity(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePriorAuthorizationSegment_PriorAuthorizationDollarsAuthorized(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePriorAuthorizationSegment_PriorAuthorizationNumberOfRefillsAuthorized(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePriorAuthorizationSegment_PriorAuthorizationQuantityAccumulated(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponsePriorAuthorizationSegment_PriorAuthorizationNumberassigned(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });			
		addAnnotation
		  (getResponseStatusSegment_SegmentIdentification(), 
		   source, 
		   new String[] {
			 "name", "Id"
		   });		
		addAnnotation
		  (getResponseStatusSegment_TransactionResponseStatus(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_AuthorizationNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_RejectCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_RejectCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_RejectFieldOccurrenceIndicator(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_ApprovedMessageCodeCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_ApprovedMessageCode(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_AdditionalMessageInformationCount(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_AdditionalMessageInformationQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_AdditionalMessageInformation(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_AdditionalMessageInformationContinuity(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_HelpDeskPhoneNumberQualifier(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_HelpDeskPhoneNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_TransactionReferenceNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_InternalControlNumber(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });		
		addAnnotation
		  (getResponseStatusSegment_Url(), 
		   source, 
		   new String[] {
			 "name", "element"
		   });
	}

	/**
	 * Initializes the annotations for <b>http://www.ncpdp.org/uml/telecom/annotation</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createAnnotationAnnotations() {
		String source = "http://www.ncpdp.org/uml/telecom/annotation";																																									
		addAnnotation
		  (workersCompensationSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "dateOfInjury.field", "434-DY",
			 "employerName.field", "315-CF",
			 "employerStreetAddress.field", "316-CG",
			 "employerCityAddress.field", "317-CH",
			 "employerStateprovinceAddress.field", "318-CI",
			 "employerZippostalZone.field", "319-CJ",
			 "employerPhoneNumber.field", "320-CK",
			 "employerContactName.field", "321-CL",
			 "carrierId.field", "327-CR",
			 "claimreferenceId.field", "435-DZ",
			 "billingEntityTypeIndicator.field", "117-TR",
			 "payToQualifier.field", "118-TS",
			 "payToId.field", "119-TT",
			 "payToName.field", "120-TU",
			 "payToStreetAddress.field", "121-TV",
			 "payToCityAddress.field", "122-TW",
			 "payToStateprovinceAddress.field", "123-TX",
			 "payToZippostalZone.field", "124-TY",
			 "genericEquivalentProductIdQualifier.field", "125-TZ",
			 "genericEquivalentProductId.field", "126-UA"
		   });																							
		addAnnotation
		  (priorAuthorizationSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "requestType.field", "498-PA",
			 "requestPeriodDate-begin.field", "498-PB",
			 "requestPeriodDate-end.field", "498-PC",
			 "basisOfRequest.field", "498-PD",
			 "authorizedRepresentativeFirstName.field", "498-PE",
			 "authorizedRepresentativeLastName.field", "498-PF",
			 "authorizedRepresentativeStreetAddress.field", "498-PG",
			 "authorizedRepresentativeCityAddress.field", "498-PH",
			 "authorizedRepresentativeStateprovinceAddress.field", "498-PJ",
			 "authorizedRepresentativeZippostalZone.field", "498-PK",
			 "priorAuthorizationNumber-assigned.field", "498-PY",
			 "authorizationNumber.field", "503-F3",
			 "priorAuthorizationSupportingDocumentation.field", "498-PP"
		   });																
		addAnnotation
		  (pricingSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "ingredientCostSubmitted.field", "409-D9",
			 "dispensingFeeSubmitted.field", "412-DC",
			 "professionalServiceFeeSubmitted.field", "477-BE",
			 "patientPaidAmountSubmitted.field", "433-DX",
			 "incentiveAmountSubmitted.field", "438-E3",
			 "otherAmountClaimedSubmittedCount.field", "478-H7",
			 "otherAmountClaimedSubmittedQualifier.field", "479-H8 ",
			 "otherAmountClaimedSubmitted.field", "480-H9",
			 "flatSalesTaxAmountSubmitted.field", "481-HA",
			 "percentageSalesTaxAmountSubmitted.field", "482-GE",
			 "percentageSalesTaxRateSubmitted.field", "483-HE",
			 "percentageSalesTaxBasisSubmitted.field", "484-JE ",
			 "usualAndCustomaryCharge.field", "426-DQ",
			 "grossAmountDue.field", "430-DU",
			 "basisOfCostDetermination.field", "423-DN",
			 "medicaidPaidAmount.field", "113-N3"
		   });																			
		addAnnotation
		  (prescriberSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "prescriberIdQualifier.field", "466-EZ ",
			 "prescriberId.field", "411-DB",
			 "prescriberLastName.field", "427-DR",
			 "prescriberPhoneNumber.field", "498-PM",
			 "primaryCareProviderIdQualifier.field", "468-2E ",
			 "primaryCareProviderId.field", "421-DL",
			 "primaryCareProviderLastName.field", "470-4E",
			 "prescriberFirstName.field", "364-2J",
			 "prescriberStreetAddress.field", "365-2K",
			 "prescriberCityAddress.field", "366-2M",
			 "prescriberStateprovinceAddress.field", "367-2N",
			 "prescriberZippostalZone.field", "368-2P"
		   });															
		addAnnotation
		  (pharmacyProviderSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "providerIdQualifier.field", "465-EY ",
			 "providerId.field", "444-E9"
		   });					
		addAnnotation
		  (patientSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "patientIdQualifier.field", "331-CX",
			 "patientId.field", "332-CY",
			 "dateOfBirth.field", "304-C4",
			 "patientGenderCode.field", "305-C5",
			 "patientFirstName.field", "310-CA",
			 "patientLastName.field", "311-CB",
			 "patientStreetAddress.field", "322-CM",
			 "patientCityAddress.field", "323-CN",
			 "patientStateProvinceAddress.field", "324-CO",
			 "patientZippostalZone.field", "325-CP",
			 "patientPhoneNumber.field", "326-CQ",
			 "placeOfService.field", "307-C7",
			 "employerId.field", "333-CZ",
			 "smokerNon-smokerCode.field", "334-1C",
			 "pregnancyIndicator.field", "335-2C",
			 "patientE-mailAddress.field", "350-HN",
			 "patientResidence.field", "384-4X"
		   });																				
		addAnnotation
		  (narrativeSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "narrativeMessage.field", "390-BM"
		   });				
		addAnnotation
		  (insuranceSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "cardholderId.field", "302-C2",
			 "cardholderFirstName.field", "312-CC",
			 "cardholderLastName.field", "313-CD",
			 "homePlan.field", "314-CE",
			 "planId.field", "524-FO",
			 "eligibilityClarificationCode.field", "309-C9",
			 "groupId.field", "301-C1",
			 "personCode.field", "303-C3",
			 "patientRelationshipCode.field", "306-C6",
			 "otherPayerBinNumber.field", "990-MG ",
			 "otherPayerProcessorControlNumber.field", "991-MH ",
			 "otherPayerCardholderId.field", "356-NU",
			 "otherPayerGroupId.field", "992-MJ ",
			 "medigapId.field", "359-2A",
			 "medicaidIndicator.field", "360-2B",
			 "providerAcceptAssignmentIndicator.field", "361-2D",
			 "cmsPartDDefinedQualifiedFacility.field", "997-G2",
			 "medicaidIdNumber.field", "115-N5",
			 "medicaidAgencyNumber.field", "116-N6"
		   });																						
		addAnnotation
		  (facilitySegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "facilityId.field", "336-8C",
			 "facilityName.field", "385-3Q",
			 "facilityStreetAddress.field", "386-3U",
			 "facilityCityAddress.field", "388-5J",
			 "facilityStateprovinceAddress.field", "387-3V",
			 "facilityZippostalZone.field", "389-6D"
		   });									
		addAnnotation
		  (durppsSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "durppsCodeCounter.field", "473-7E",
			 "reasonForServiceCode.field", "439-E4",
			 "professionalServiceCode.field", "440-E5",
			 "resultOfServiceCode.field", "441-E6",
			 "durppsLevelOfEffort.field", "474-8E",
			 "durCo-agentIdQualifier.field", "475-J9",
			 "durCo-agentId.field", "476-H6"
		   });										
		addAnnotation
		  (couponSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "couponType.field", "485-KE",
			 "couponNumber.field", "486-ME",
			 "couponValueAmount.field", "487-NE"
		   });						
		addAnnotation
		  (coordinationofBenefitsOtherPaymentsSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "coordinationOfBenefitsotherPaymentsCount.field", "337-4C",
			 "otherPayerCoverageType.field", "338-5C",
			 "otherPayerIdQualifier.field", "339-6C",
			 "otherPayerId.field", "340-7C",
			 "otherPayerDate.field", "443-E8",
			 "internalControlNumber.field", "993-A7",
			 "otherPayerAmountPaidCount.field", "341-HB",
			 "otherPayerAmountPaidQualifier.field", "342-HC",
			 "otherPayerAmountPaid.field", "431-DV",
			 "otherPayerRejectCount.field", "471-5E",
			 "otherPayerRejectCode.field", "472-6E",
			 "otherPayer-patientResponsibilityAmountCount.field", "353-NR",
			 "otherPayer-patientResponsibilityAmountQualifier.field", "351-NP",
			 "otherPayer-patientResponsibilityAmount.field", "352-NQ",
			 "benefitStageCount.field", "392-MU",
			 "benefitStageQualifier.field", "393-MV",
			 "benefitStageAmount.field", "394-MW"
		   });																				
		addAnnotation
		  (clinicalSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "diagnosisCodeCount.field", "491-VE",
			 "diagnosisCodeQualifier.field", "492-WE",
			 "diagnosisCode.field", "424-DO",
			 "clinicalInformationCounter.field", "493-XE",
			 "measurementDate.field", "494-ZE",
			 "measurementTime.field", "495-H1",
			 "measurementDimension.field", "496-H2",
			 "measurementUnit.field", "497-H3",
			 "measurementValue.field", "499-H4"
		   });												
		addAnnotation
		  (claimSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "prescriptionserviceReferenceNumberQualifier.field", "455-EM",
			 "prescriptionserviceReferenceNumber.field", "402-D2",
			 "productserviceIdQualifier.field", "436-E1 ",
			 "productserviceId.field", "407-D7",
			 "associatedPrescriptionserviceReferenceNumber.field", "456-EN",
			 "associatedPrescriptionserviceDate.field", "457-EP",
			 "procedureModifierCodeCount.field", "458-SE",
			 "procedureModifierCode.field", "459-ER",
			 "quantityDispensed.field", "442-E7",
			 "fillNumber.field", "403-D3",
			 "daysSupply.field", "405-D5",
			 "compoundCode.field", "406-D6",
			 "dispenseAsWritten(daw)productSelectionCode.field", "408-D8",
			 "datePrescriptionWritten.field", "414-DE",
			 "numberOfRefillsAuthorized.field", "415-DF",
			 "prescriptionOriginCode.field", "419-DJ",
			 "submissionClarificationCodeCount.field", "354-NX",
			 "submissionClarificationCode.field", "420-DK",
			 "quantityPrescribed.field", "46 -ET",
			 "otherCoverageCode.field", "308-C8",
			 "specialPackagingIndicator.field", "429-DT",
			 "originallyPrescribedProductserviceIdQualifier.field", "453-EJ",
			 "originallyPrescribedProductserviceCode.field", "445-EA",
			 "originallyPrescribedQuantity.field", "446-EB",
			 "alternateId.field", "330-CW",
			 "scheduledPrescriptionIdNumber.field", "454-EK",
			 "unitOfMeasure.field", "600-28",
			 "levelOfService.field", "418-DI",
			 "priorAuthorizationTypeCode.field", "461-EU",
			 "priorAuthorizationNumberSubmitted.field", "462-EV",
			 "intermediaryAuthorizationTypeId.field", "463-EW",
			 "intermediaryAuthorizationId.field", "464-EX",
			 "dispensingStatus.field", "343-HD",
			 "quantityIntendedToBeDispensed.field", "344-HF",
			 "daysSupplyIntendedToBeDispensed.field", "345-HG",
			 "delayReasonCode.field", "357-NV",
			 "transactionReferenceNumber.field", "880-K5",
			 "patientAssignmentIndicator(directMemberReimbursementIndicator).field", "391-MT",
			 "routeOfAdministration.field", "995-E2",
			 "compoundType.field", "996-G1",
			 "medicaidSubrogationInternalControlNumbertransactionControlNumber(icntcn).field", "114-N4",
			 "pharmacyServiceType.field", "147-U7"
		   });																																													
		addAnnotation
		  (additionalDocumentationSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "additionalDocumentationTypeId.field", "369-2Q",
			 "requestPeriodBeginDate.field", "374-2V",
			 "requestPeriodRecertrevisedDate.field", "375-2W",
			 "requestStatus.field", "373-2U",
			 "lengthOfNeedQualifier.field", "371-2S",
			 "lengthOfNeed.field", "370-2R",
			 "prescribersupplierDateSigned.field", "372-2T",
			 "supportingDocumentation.field", "376-2X",
			 "questionNumberletterCount.field", "377-2Z",
			 "questionNumberletter.field", "378-4B",
			 "questionPercentResponse.field", "379-4D",
			 "questionDateResponse.field", "380-4G",
			 "questionDollarAmountResponse.field", "381-4H",
			 "questionNumericResponse.field", "382-4J",
			 "questionAlphanumericResponse.field", "383-4K"
		   });																		
		addAnnotation
		  (compoundSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "compoundDosageFormDescriptionCode.field", "450-EF",
			 "compoundDispensingUnitFormIndicator.field", "451-EG",
			 "compoundIngredientComponentCount.field", "447-EC ",
			 "compoundProductIdQualifier.field", "488-RE",
			 "compoundProductId.field", "489-TE",
			 "compoundIngredientQuantity.field", "448-ED ",
			 "compoundIngredientDrugCost.field", "449-EE",
			 "compoundIngredientBasisOfCostDetermination.field", "490-UE",
			 "compoundIngredientModifierCodeCount.field", "362-2G",
			 "compoundIngredientModifierCode.field", "363-2H"
		   });																						
		addAnnotation
		  (responseHeaderSegmentEClass, 
		   source, 
		   new String[] {
			 "versionReleaseNumber.field", "102-A2",
			 "transactionCode.field", "103-A3",
			 "transactionCount.field", "109-A9",
			 "headerResponseStatus.field", "501-FI",
			 "serviceProviderIDQualifier.field", "202-B2",
			 "serviceProviderID.field", "201-B1",
			 "dateofService.field", "401-D1"
		   });									
		addAnnotation
		  (responseClaimSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "prescriptionserviceReferenceNumberQualifier.field", "455-EM",
			 "prescriptionserviceReferenceNumber.field", "402-D2",
			 "preferredProductCount.field", "551-9F",
			 "preferredProductIDQualifier.field", "552-AP",
			 "preferredProductID.field", "553-AR",
			 "preferredProductIncentive.field", "554-AS",
			 "preferredProductCostShareIncentive.field", "555-AT",
			 "preferredProductDescription.field", "551-9F",
			 "medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn.field", "114-N4"
		   });												
		addAnnotation
		  (responseCoordinationofBenefitsOtherPayersSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "otherPayerIDCount.field", "355-NT",
			 "otherPayerCoverageType.field", "338-5C",
			 "otherPayerIDQualifier.field", "339-6C",
			 "otherPayerID.field", "340-7C",
			 "otherPayerProcessorControlNumber.field", "991-MH",
			 "otherPayerCardholderID.field", "356-NU",
			 "otherPayerGroupID.field", "992-MJ",
			 "otherPayerPersonCode.field", "142-UV",
			 "otherPayerHelpDeskPhoneNumber.field", "127-UB",
			 "otherPayerPatientRelationshipCode.field", "143-UW",
			 "otherPayerBenefitEffectiveDate.field", "144-UX",
			 "otherPayerBenefitTerminationDate.field", "145-UY"
		   });															
		addAnnotation
		  (responseDURPPSSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "dURPPSResponseCodeCounter.field", "567-J6",
			 "reasonforServiceCode.field", "439-E4",
			 "clinicalSignificanceCode.field", "528-FS",
			 "otherPharmacyIndicator.field", "529-FT",
			 "quantityofPreviousFill.field", "531-FV",
			 "previousDateofFill.field", "530-FU",
			 "databaseIndicator.field", "532-FW",
			 "otherPrescriberIndicator.field", "533-FX",
			 "dURFreeTextMessage.field", "544-FY",
			 "dURAdditionalText.field", "570-NS"
		   });													
		addAnnotation
		  (responseInsuranceSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "groupID.field", "301-C1",
			 "planID.field", "524-FO",
			 "networkReimbursementID.field", "545-2F",
			 "payerIDQualifier.field", "568-J7",
			 "payerID.field", "569-J8",
			 "medicaidIDNumber.field", "115-N5",
			 "medicaidAgencyNumber.field", "116-N6",
			 "cardholderID.field", "302-C2"
		   });											
		addAnnotation
		  (responseMessageSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "message.field", "504-F4"
		   });				
		addAnnotation
		  (responsePatientSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "patientFirstName.field", "310-CA",
			 "patientLastName.field", "311-CB",
			 "dateOfBirth.field", "304-C4"
		   });						
		addAnnotation
		  (responsePricingSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "patientPayAmount.field", "505-F5",
			 "ingredientCostPaid.field", "506-F6",
			 "dispensingFeePaid.field", "507-F7",
			 "taxExemptIndicator.field", "557-AV",
			 "flatSalesTaxAmountPaid.field", "558-AW",
			 "percentageSalesTaxAmountPaid.field", "559-AX",
			 "percentageSalesTaxRatePaid.field", "560-AY",
			 "percentageSalesTaxBasisPaid.field", "561-AZ",
			 "incentiveAmountPaid.field", "521-FL",
			 "professionalServiceFeePaid.field", "562-J1",
			 "otherAmountPaidCount.field", "563-J2",
			 "otherAmountPaidQualifier.field", "564-J3",
			 "otherAmountPaid.field", "565-J4",
			 "otherPayerAmountRecognized.field", "566-J5",
			 "totalAmountPaid.field", "509-F9",
			 "basisofReimbursementDetermination.field", "522-FM",
			 "amountAttributedtoSalesTax.field", "523-FN",
			 "accumulatedDeductibleAmount.field", "512-FC",
			 "remainingDeductibleAmount.field", "513-FD",
			 "remainingBenefitAmount.field", "514-FE",
			 "amountAppliedtoPeriodicDeductible.field", "517-FH",
			 "amountofCopay.field", "518-F1",
			 "amountExceedingPeriodicBenefitMaximum.field", "520-FK",
			 "basisofCalculationDispensingFee.field", "346-HH",
			 "basisofCalculationCopay.field", "347-HJ",
			 "basisofCalculationFlatSalesTax.field", "348-HK",
			 "basisofCalculationPercentageSalesTax.field", "349-HM",
			 "amountAttributedtoProcessorFee.field", "571-NZ",
			 "patientSalesTaxAmount.field", "575-EQ",
			 "planSalesTaxAmount.field", "574-2Y",
			 "amountofCoinsurance.field", "572-4U",
			 "basisofCalculation-Coinsurance.field", "573-4V",
			 "benefitStageCount.field", "392-MU",
			 "benefitStageQualifier.field", "393-MV",
			 "benefitStageAmount.field", "394-MW",
			 "estimatedGenericSavings.field", "577-G3",
			 "spendingAccountAmountRemaining.field", "128-UC",
			 "healthPlan-FundedAssistanceAmount.field", "129-UD",
			 "amountAttributedtoProviderNetworkSelection.field", "133-UJ",
			 "amountAttributedtoProductSelectionBrandDrug.field", "134-UK",
			 "amountAttributedtoProductSelectionNon-PreferredFormularySelection.field", "135-UM",
			 "amountAttributedtoProductSelectionBrandNon-PreferredFormularySelection.field", "136-UN",
			 "amountAttributedtoCoverageGap.field", "137-UP",
			 "ingredientCostContractedReimbursableAmount.field", "148-U8",
			 "dispensingFeeContractedReimbursableAmount.field", "149-U9"
		   });																																																
		addAnnotation
		  (responsePriorAuthorizationSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "priorAuthorizationProcessedDate.field", "498-PR",
			 "priorAuthorizationEffectiveDate.field", "498-PS",
			 "priorAuthorizationExpirationDate.field", "498-PT",
			 "priorAuthorizationQuantity.field", "498-RA",
			 "priorAuthorizationDollarsAuthorized.field", "498-RB",
			 "priorAuthorizationNumberofRefillsAuthorized.field", "498-PW",
			 "priorAuthorizationQuantityAccumulated.field", "498-PX",
			 "priorAuthorizationNumber-Assigned.field", "498-PY"
		   });											
		addAnnotation
		  (responseStatusSegmentEClass, 
		   source, 
		   new String[] {
			 "segmentIdentification", "111-AM",
			 "transactionResponseStatus.field", "112-AN",
			 "authorizationNumber.field", "503-F3",
			 "rejectCount.field", "510-FA",
			 "rejectCode.field", "511-FB",
			 "rejectFieldOccurrenceIndicator.field", "546-4F",
			 "approvedMessageCodeCount.field", "547-5F",
			 "approvedMessageCode.field", "548-6F",
			 "additionalMessageInformationCount.field", "130-UF",
			 "additionalMessageInformationQualifier.field", "132-UH",
			 "additionalMessageInformation.field", "526-FQ",
			 "additionalMessageInformationContinuity.field", "131-UG",
			 "helpDeskPhoneNumberQualifier.field", "549-7F",
			 "helpDeskPhoneNumber.field", "550-8F",
			 "transactionReferenceNumber.field", "880-K5",
			 "internalControlNumber.field", "993-A7",
			 "url.field", "987-MA"
		   });																	
	}

} //TelecomPackageImpl
