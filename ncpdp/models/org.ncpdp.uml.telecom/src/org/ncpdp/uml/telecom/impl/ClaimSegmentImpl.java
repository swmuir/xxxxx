/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom.impl;

import java.util.Collection;

import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.EObjectImpl;

import org.eclipse.emf.ecore.util.EDataTypeUniqueEList;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import org.ncpdp.uml.telecom.ClaimSegment;
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Claim Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getPrescriptionserviceReferenceNumberQualifier <em>Prescriptionservice Reference Number Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getPrescriptionserviceReferenceNumber <em>Prescriptionservice Reference Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getProductserviceIdQualifier <em>Productservice Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getProductserviceId <em>Productservice Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getAssociatedPrescriptionserviceReferenceNumber <em>Associated Prescriptionservice Reference Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getAssociatedPrescriptionserviceDate <em>Associated Prescriptionservice Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getProcedureModifierCodeCount <em>Procedure Modifier Code Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getProcedureModifierCode <em>Procedure Modifier Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getQuantityDispensed <em>Quantity Dispensed</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getFillNumber <em>Fill Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getDaysSupply <em>Days Supply</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getCompoundCode <em>Compound Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getDispenseAsWrittendawproductSelectionCode <em>Dispense As Writtendawproduct Selection Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getDatePrescriptionWritten <em>Date Prescription Written</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getNumberOfRefillsAuthorized <em>Number Of Refills Authorized</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getPrescriptionOriginCode <em>Prescription Origin Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getSubmissionClarificationCodeCount <em>Submission Clarification Code Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getSubmissionClarificationCode <em>Submission Clarification Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getQuantityPrescribed <em>Quantity Prescribed</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getOtherCoverageCode <em>Other Coverage Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getSpecialPackagingIndicator <em>Special Packaging Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getOriginallyPrescribedProductserviceIdQualifier <em>Originally Prescribed Productservice Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getOriginallyPrescribedProductserviceCode <em>Originally Prescribed Productservice Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getOriginallyPrescribedQuantity <em>Originally Prescribed Quantity</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getAlternateId <em>Alternate Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getScheduledPrescriptionIdNumber <em>Scheduled Prescription Id Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getLevelOfService <em>Level Of Service</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getPriorAuthorizationTypeCode <em>Prior Authorization Type Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getPriorAuthorizationNumberSubmitted <em>Prior Authorization Number Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getIntermediaryAuthorizationTypeId <em>Intermediary Authorization Type Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getIntermediaryAuthorizationId <em>Intermediary Authorization Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getDispensingStatus <em>Dispensing Status</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getQuantityIntendedToBeDispensed <em>Quantity Intended To Be Dispensed</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getDaysSupplyIntendedToBeDispensed <em>Days Supply Intended To Be Dispensed</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getDelayReasonCode <em>Delay Reason Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getTransactionReferenceNumber <em>Transaction Reference Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getPatientAssignmentIndicatordirectMemberReimbursementIndicator <em>Patient Assignment Indicatordirect Member Reimbursement Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getRouteOfAdministration <em>Route Of Administration</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getCompoundType <em>Compound Type</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn <em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClaimSegmentImpl#getPharmacyServiceType <em>Pharmacy Service Type</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClaimSegmentImpl extends EObjectImpl implements ClaimSegment {
	/**
	 * The cached value of the '{@link #getSegmentIdentification() <em>Segment Identification</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSegmentIdentification()
	 * @generated
	 * @ordered
	 */
	protected EList<String> segmentIdentification;

	/**
	 * The cached value of the '{@link #getPrescriptionserviceReferenceNumberQualifier() <em>Prescriptionservice Reference Number Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionserviceReferenceNumberQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriptionserviceReferenceNumberQualifier;

	/**
	 * The cached value of the '{@link #getPrescriptionserviceReferenceNumber() <em>Prescriptionservice Reference Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionserviceReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriptionserviceReferenceNumber;

	/**
	 * The cached value of the '{@link #getProductserviceIdQualifier() <em>Productservice Id Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductserviceIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> productserviceIdQualifier;

	/**
	 * The cached value of the '{@link #getProductserviceId() <em>Productservice Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProductserviceId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> productserviceId;

	/**
	 * The cached value of the '{@link #getAssociatedPrescriptionserviceReferenceNumber() <em>Associated Prescriptionservice Reference Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedPrescriptionserviceReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> associatedPrescriptionserviceReferenceNumber;

	/**
	 * The cached value of the '{@link #getAssociatedPrescriptionserviceDate() <em>Associated Prescriptionservice Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedPrescriptionserviceDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> associatedPrescriptionserviceDate;

	/**
	 * The cached value of the '{@link #getProcedureModifierCodeCount() <em>Procedure Modifier Code Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureModifierCodeCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> procedureModifierCodeCount;

	/**
	 * The cached value of the '{@link #getProcedureModifierCode() <em>Procedure Modifier Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProcedureModifierCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> procedureModifierCode;

	/**
	 * The cached value of the '{@link #getQuantityDispensed() <em>Quantity Dispensed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityDispensed()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> quantityDispensed;

	/**
	 * The cached value of the '{@link #getFillNumber() <em>Fill Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFillNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> fillNumber;

	/**
	 * The cached value of the '{@link #getDaysSupply() <em>Days Supply</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysSupply()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> daysSupply;

	/**
	 * The cached value of the '{@link #getCompoundCode() <em>Compound Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundCode;

	/**
	 * The cached value of the '{@link #getDispenseAsWrittendawproductSelectionCode() <em>Dispense As Writtendawproduct Selection Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispenseAsWrittendawproductSelectionCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> dispenseAsWrittendawproductSelectionCode;

	/**
	 * The cached value of the '{@link #getDatePrescriptionWritten() <em>Date Prescription Written</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDatePrescriptionWritten()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> datePrescriptionWritten;

	/**
	 * The cached value of the '{@link #getNumberOfRefillsAuthorized() <em>Number Of Refills Authorized</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumberOfRefillsAuthorized()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> numberOfRefillsAuthorized;

	/**
	 * The cached value of the '{@link #getPrescriptionOriginCode() <em>Prescription Origin Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrescriptionOriginCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> prescriptionOriginCode;

	/**
	 * The cached value of the '{@link #getSubmissionClarificationCodeCount() <em>Submission Clarification Code Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmissionClarificationCodeCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> submissionClarificationCodeCount;

	/**
	 * The cached value of the '{@link #getSubmissionClarificationCode() <em>Submission Clarification Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubmissionClarificationCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> submissionClarificationCode;

	/**
	 * The cached value of the '{@link #getQuantityPrescribed() <em>Quantity Prescribed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityPrescribed()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> quantityPrescribed;

	/**
	 * The cached value of the '{@link #getOtherCoverageCode() <em>Other Coverage Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOtherCoverageCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> otherCoverageCode;

	/**
	 * The cached value of the '{@link #getSpecialPackagingIndicator() <em>Special Packaging Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpecialPackagingIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> specialPackagingIndicator;

	/**
	 * The cached value of the '{@link #getOriginallyPrescribedProductserviceIdQualifier() <em>Originally Prescribed Productservice Id Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginallyPrescribedProductserviceIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> originallyPrescribedProductserviceIdQualifier;

	/**
	 * The cached value of the '{@link #getOriginallyPrescribedProductserviceCode() <em>Originally Prescribed Productservice Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginallyPrescribedProductserviceCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> originallyPrescribedProductserviceCode;

	/**
	 * The cached value of the '{@link #getOriginallyPrescribedQuantity() <em>Originally Prescribed Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOriginallyPrescribedQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> originallyPrescribedQuantity;

	/**
	 * The cached value of the '{@link #getAlternateId() <em>Alternate Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlternateId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> alternateId;

	/**
	 * The cached value of the '{@link #getScheduledPrescriptionIdNumber() <em>Scheduled Prescription Id Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScheduledPrescriptionIdNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> scheduledPrescriptionIdNumber;

	/**
	 * The cached value of the '{@link #getUnitOfMeasure() <em>Unit Of Measure</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUnitOfMeasure()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> unitOfMeasure;

	/**
	 * The cached value of the '{@link #getLevelOfService() <em>Level Of Service</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLevelOfService()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> levelOfService;

	/**
	 * The cached value of the '{@link #getPriorAuthorizationTypeCode() <em>Prior Authorization Type Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationTypeCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> priorAuthorizationTypeCode;

	/**
	 * The cached value of the '{@link #getPriorAuthorizationNumberSubmitted() <em>Prior Authorization Number Submitted</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPriorAuthorizationNumberSubmitted()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> priorAuthorizationNumberSubmitted;

	/**
	 * The cached value of the '{@link #getIntermediaryAuthorizationTypeId() <em>Intermediary Authorization Type Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediaryAuthorizationTypeId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> intermediaryAuthorizationTypeId;

	/**
	 * The cached value of the '{@link #getIntermediaryAuthorizationId() <em>Intermediary Authorization Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIntermediaryAuthorizationId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> intermediaryAuthorizationId;

	/**
	 * The cached value of the '{@link #getDispensingStatus() <em>Dispensing Status</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDispensingStatus()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> dispensingStatus;

	/**
	 * The cached value of the '{@link #getQuantityIntendedToBeDispensed() <em>Quantity Intended To Be Dispensed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQuantityIntendedToBeDispensed()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> quantityIntendedToBeDispensed;

	/**
	 * The cached value of the '{@link #getDaysSupplyIntendedToBeDispensed() <em>Days Supply Intended To Be Dispensed</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDaysSupplyIntendedToBeDispensed()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> daysSupplyIntendedToBeDispensed;

	/**
	 * The cached value of the '{@link #getDelayReasonCode() <em>Delay Reason Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDelayReasonCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> delayReasonCode;

	/**
	 * The cached value of the '{@link #getTransactionReferenceNumber() <em>Transaction Reference Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTransactionReferenceNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> transactionReferenceNumber;

	/**
	 * The cached value of the '{@link #getPatientAssignmentIndicatordirectMemberReimbursementIndicator() <em>Patient Assignment Indicatordirect Member Reimbursement Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientAssignmentIndicatordirectMemberReimbursementIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientAssignmentIndicatordirectMemberReimbursementIndicator;

	/**
	 * The cached value of the '{@link #getRouteOfAdministration() <em>Route Of Administration</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRouteOfAdministration()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> routeOfAdministration;

	/**
	 * The cached value of the '{@link #getCompoundType() <em>Compound Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundType()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundType;

	/**
	 * The cached value of the '{@link #getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn() <em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn;

	/**
	 * The cached value of the '{@link #getPharmacyServiceType() <em>Pharmacy Service Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPharmacyServiceType()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> pharmacyServiceType;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClaimSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.CLAIM_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.CLAIM_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriptionserviceReferenceNumberQualifier() {
		if (prescriptionserviceReferenceNumberQualifier == null) {
			prescriptionserviceReferenceNumberQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER);
		}
		return prescriptionserviceReferenceNumberQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriptionserviceReferenceNumber() {
		if (prescriptionserviceReferenceNumber == null) {
			prescriptionserviceReferenceNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER);
		}
		return prescriptionserviceReferenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getProductserviceIdQualifier() {
		if (productserviceIdQualifier == null) {
			productserviceIdQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID_QUALIFIER);
		}
		return productserviceIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getProductserviceId() {
		if (productserviceId == null) {
			productserviceId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID);
		}
		return productserviceId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAssociatedPrescriptionserviceReferenceNumber() {
		if (associatedPrescriptionserviceReferenceNumber == null) {
			associatedPrescriptionserviceReferenceNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_REFERENCE_NUMBER);
		}
		return associatedPrescriptionserviceReferenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAssociatedPrescriptionserviceDate() {
		if (associatedPrescriptionserviceDate == null) {
			associatedPrescriptionserviceDate = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_DATE);
		}
		return associatedPrescriptionserviceDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getProcedureModifierCodeCount() {
		if (procedureModifierCodeCount == null) {
			procedureModifierCodeCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE_COUNT);
		}
		return procedureModifierCodeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getProcedureModifierCode() {
		if (procedureModifierCode == null) {
			procedureModifierCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE);
		}
		return procedureModifierCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getQuantityDispensed() {
		if (quantityDispensed == null) {
			quantityDispensed = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__QUANTITY_DISPENSED);
		}
		return quantityDispensed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getFillNumber() {
		if (fillNumber == null) {
			fillNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__FILL_NUMBER);
		}
		return fillNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDaysSupply() {
		if (daysSupply == null) {
			daysSupply = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY);
		}
		return daysSupply;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundCode() {
		if (compoundCode == null) {
			compoundCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__COMPOUND_CODE);
		}
		return compoundCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDispenseAsWrittendawproductSelectionCode() {
		if (dispenseAsWrittendawproductSelectionCode == null) {
			dispenseAsWrittendawproductSelectionCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__DISPENSE_AS_WRITTENDAWPRODUCT_SELECTION_CODE);
		}
		return dispenseAsWrittendawproductSelectionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDatePrescriptionWritten() {
		if (datePrescriptionWritten == null) {
			datePrescriptionWritten = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__DATE_PRESCRIPTION_WRITTEN);
		}
		return datePrescriptionWritten;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getNumberOfRefillsAuthorized() {
		if (numberOfRefillsAuthorized == null) {
			numberOfRefillsAuthorized = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__NUMBER_OF_REFILLS_AUTHORIZED);
		}
		return numberOfRefillsAuthorized;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPrescriptionOriginCode() {
		if (prescriptionOriginCode == null) {
			prescriptionOriginCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__PRESCRIPTION_ORIGIN_CODE);
		}
		return prescriptionOriginCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getSubmissionClarificationCodeCount() {
		if (submissionClarificationCodeCount == null) {
			submissionClarificationCodeCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE_COUNT);
		}
		return submissionClarificationCodeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getSubmissionClarificationCode() {
		if (submissionClarificationCode == null) {
			submissionClarificationCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE);
		}
		return submissionClarificationCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getQuantityPrescribed() {
		if (quantityPrescribed == null) {
			quantityPrescribed = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__QUANTITY_PRESCRIBED);
		}
		return quantityPrescribed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOtherCoverageCode() {
		if (otherCoverageCode == null) {
			otherCoverageCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__OTHER_COVERAGE_CODE);
		}
		return otherCoverageCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getSpecialPackagingIndicator() {
		if (specialPackagingIndicator == null) {
			specialPackagingIndicator = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__SPECIAL_PACKAGING_INDICATOR);
		}
		return specialPackagingIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOriginallyPrescribedProductserviceIdQualifier() {
		if (originallyPrescribedProductserviceIdQualifier == null) {
			originallyPrescribedProductserviceIdQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_ID_QUALIFIER);
		}
		return originallyPrescribedProductserviceIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOriginallyPrescribedProductserviceCode() {
		if (originallyPrescribedProductserviceCode == null) {
			originallyPrescribedProductserviceCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_CODE);
		}
		return originallyPrescribedProductserviceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getOriginallyPrescribedQuantity() {
		if (originallyPrescribedQuantity == null) {
			originallyPrescribedQuantity = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_QUANTITY);
		}
		return originallyPrescribedQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getAlternateId() {
		if (alternateId == null) {
			alternateId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__ALTERNATE_ID);
		}
		return alternateId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getScheduledPrescriptionIdNumber() {
		if (scheduledPrescriptionIdNumber == null) {
			scheduledPrescriptionIdNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__SCHEDULED_PRESCRIPTION_ID_NUMBER);
		}
		return scheduledPrescriptionIdNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getUnitOfMeasure() {
		if (unitOfMeasure == null) {
			unitOfMeasure = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__UNIT_OF_MEASURE);
		}
		return unitOfMeasure;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getLevelOfService() {
		if (levelOfService == null) {
			levelOfService = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__LEVEL_OF_SERVICE);
		}
		return levelOfService;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationTypeCode() {
		if (priorAuthorizationTypeCode == null) {
			priorAuthorizationTypeCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_TYPE_CODE);
		}
		return priorAuthorizationTypeCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPriorAuthorizationNumberSubmitted() {
		if (priorAuthorizationNumberSubmitted == null) {
			priorAuthorizationNumberSubmitted = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_SUBMITTED);
		}
		return priorAuthorizationNumberSubmitted;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getIntermediaryAuthorizationTypeId() {
		if (intermediaryAuthorizationTypeId == null) {
			intermediaryAuthorizationTypeId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_TYPE_ID);
		}
		return intermediaryAuthorizationTypeId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getIntermediaryAuthorizationId() {
		if (intermediaryAuthorizationId == null) {
			intermediaryAuthorizationId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_ID);
		}
		return intermediaryAuthorizationId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDispensingStatus() {
		if (dispensingStatus == null) {
			dispensingStatus = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__DISPENSING_STATUS);
		}
		return dispensingStatus;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getQuantityIntendedToBeDispensed() {
		if (quantityIntendedToBeDispensed == null) {
			quantityIntendedToBeDispensed = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__QUANTITY_INTENDED_TO_BE_DISPENSED);
		}
		return quantityIntendedToBeDispensed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDaysSupplyIntendedToBeDispensed() {
		if (daysSupplyIntendedToBeDispensed == null) {
			daysSupplyIntendedToBeDispensed = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY_INTENDED_TO_BE_DISPENSED);
		}
		return daysSupplyIntendedToBeDispensed;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDelayReasonCode() {
		if (delayReasonCode == null) {
			delayReasonCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__DELAY_REASON_CODE);
		}
		return delayReasonCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getTransactionReferenceNumber() {
		if (transactionReferenceNumber == null) {
			transactionReferenceNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__TRANSACTION_REFERENCE_NUMBER);
		}
		return transactionReferenceNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientAssignmentIndicatordirectMemberReimbursementIndicator() {
		if (patientAssignmentIndicatordirectMemberReimbursementIndicator == null) {
			patientAssignmentIndicatordirectMemberReimbursementIndicator = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__PATIENT_ASSIGNMENT_INDICATORDIRECT_MEMBER_REIMBURSEMENT_INDICATOR);
		}
		return patientAssignmentIndicatordirectMemberReimbursementIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getRouteOfAdministration() {
		if (routeOfAdministration == null) {
			routeOfAdministration = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__ROUTE_OF_ADMINISTRATION);
		}
		return routeOfAdministration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundType() {
		if (compoundType == null) {
			compoundType = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__COMPOUND_TYPE);
		}
		return compoundType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn() {
		if (medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn == null) {
			medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN);
		}
		return medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPharmacyServiceType() {
		if (pharmacyServiceType == null) {
			pharmacyServiceType = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLAIM_SEGMENT__PHARMACY_SERVICE_TYPE);
		}
		return pharmacyServiceType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER:
				return ((InternalEList<?>)getPrescriptionserviceReferenceNumberQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				return ((InternalEList<?>)getPrescriptionserviceReferenceNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID_QUALIFIER:
				return ((InternalEList<?>)getProductserviceIdQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID:
				return ((InternalEList<?>)getProductserviceId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				return ((InternalEList<?>)getAssociatedPrescriptionserviceReferenceNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_DATE:
				return ((InternalEList<?>)getAssociatedPrescriptionserviceDate()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE_COUNT:
				return ((InternalEList<?>)getProcedureModifierCodeCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE:
				return ((InternalEList<?>)getProcedureModifierCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_DISPENSED:
				return ((InternalEList<?>)getQuantityDispensed()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__FILL_NUMBER:
				return ((InternalEList<?>)getFillNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY:
				return ((InternalEList<?>)getDaysSupply()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__COMPOUND_CODE:
				return ((InternalEList<?>)getCompoundCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__DISPENSE_AS_WRITTENDAWPRODUCT_SELECTION_CODE:
				return ((InternalEList<?>)getDispenseAsWrittendawproductSelectionCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__DATE_PRESCRIPTION_WRITTEN:
				return ((InternalEList<?>)getDatePrescriptionWritten()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__NUMBER_OF_REFILLS_AUTHORIZED:
				return ((InternalEList<?>)getNumberOfRefillsAuthorized()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTION_ORIGIN_CODE:
				return ((InternalEList<?>)getPrescriptionOriginCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE_COUNT:
				return ((InternalEList<?>)getSubmissionClarificationCodeCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE:
				return ((InternalEList<?>)getSubmissionClarificationCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_PRESCRIBED:
				return ((InternalEList<?>)getQuantityPrescribed()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__OTHER_COVERAGE_CODE:
				return ((InternalEList<?>)getOtherCoverageCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__SPECIAL_PACKAGING_INDICATOR:
				return ((InternalEList<?>)getSpecialPackagingIndicator()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_ID_QUALIFIER:
				return ((InternalEList<?>)getOriginallyPrescribedProductserviceIdQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_CODE:
				return ((InternalEList<?>)getOriginallyPrescribedProductserviceCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_QUANTITY:
				return ((InternalEList<?>)getOriginallyPrescribedQuantity()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__ALTERNATE_ID:
				return ((InternalEList<?>)getAlternateId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__SCHEDULED_PRESCRIPTION_ID_NUMBER:
				return ((InternalEList<?>)getScheduledPrescriptionIdNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__UNIT_OF_MEASURE:
				return ((InternalEList<?>)getUnitOfMeasure()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__LEVEL_OF_SERVICE:
				return ((InternalEList<?>)getLevelOfService()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_TYPE_CODE:
				return ((InternalEList<?>)getPriorAuthorizationTypeCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_SUBMITTED:
				return ((InternalEList<?>)getPriorAuthorizationNumberSubmitted()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_TYPE_ID:
				return ((InternalEList<?>)getIntermediaryAuthorizationTypeId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_ID:
				return ((InternalEList<?>)getIntermediaryAuthorizationId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__DISPENSING_STATUS:
				return ((InternalEList<?>)getDispensingStatus()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_INTENDED_TO_BE_DISPENSED:
				return ((InternalEList<?>)getQuantityIntendedToBeDispensed()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY_INTENDED_TO_BE_DISPENSED:
				return ((InternalEList<?>)getDaysSupplyIntendedToBeDispensed()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__DELAY_REASON_CODE:
				return ((InternalEList<?>)getDelayReasonCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__TRANSACTION_REFERENCE_NUMBER:
				return ((InternalEList<?>)getTransactionReferenceNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__PATIENT_ASSIGNMENT_INDICATORDIRECT_MEMBER_REIMBURSEMENT_INDICATOR:
				return ((InternalEList<?>)getPatientAssignmentIndicatordirectMemberReimbursementIndicator()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__ROUTE_OF_ADMINISTRATION:
				return ((InternalEList<?>)getRouteOfAdministration()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__COMPOUND_TYPE:
				return ((InternalEList<?>)getCompoundType()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN:
				return ((InternalEList<?>)getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLAIM_SEGMENT__PHARMACY_SERVICE_TYPE:
				return ((InternalEList<?>)getPharmacyServiceType()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.CLAIM_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER:
				return getPrescriptionserviceReferenceNumberQualifier();
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				return getPrescriptionserviceReferenceNumber();
			case TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID_QUALIFIER:
				return getProductserviceIdQualifier();
			case TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID:
				return getProductserviceId();
			case TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				return getAssociatedPrescriptionserviceReferenceNumber();
			case TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_DATE:
				return getAssociatedPrescriptionserviceDate();
			case TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE_COUNT:
				return getProcedureModifierCodeCount();
			case TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE:
				return getProcedureModifierCode();
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_DISPENSED:
				return getQuantityDispensed();
			case TelecomPackage.CLAIM_SEGMENT__FILL_NUMBER:
				return getFillNumber();
			case TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY:
				return getDaysSupply();
			case TelecomPackage.CLAIM_SEGMENT__COMPOUND_CODE:
				return getCompoundCode();
			case TelecomPackage.CLAIM_SEGMENT__DISPENSE_AS_WRITTENDAWPRODUCT_SELECTION_CODE:
				return getDispenseAsWrittendawproductSelectionCode();
			case TelecomPackage.CLAIM_SEGMENT__DATE_PRESCRIPTION_WRITTEN:
				return getDatePrescriptionWritten();
			case TelecomPackage.CLAIM_SEGMENT__NUMBER_OF_REFILLS_AUTHORIZED:
				return getNumberOfRefillsAuthorized();
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTION_ORIGIN_CODE:
				return getPrescriptionOriginCode();
			case TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE_COUNT:
				return getSubmissionClarificationCodeCount();
			case TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE:
				return getSubmissionClarificationCode();
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_PRESCRIBED:
				return getQuantityPrescribed();
			case TelecomPackage.CLAIM_SEGMENT__OTHER_COVERAGE_CODE:
				return getOtherCoverageCode();
			case TelecomPackage.CLAIM_SEGMENT__SPECIAL_PACKAGING_INDICATOR:
				return getSpecialPackagingIndicator();
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_ID_QUALIFIER:
				return getOriginallyPrescribedProductserviceIdQualifier();
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_CODE:
				return getOriginallyPrescribedProductserviceCode();
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_QUANTITY:
				return getOriginallyPrescribedQuantity();
			case TelecomPackage.CLAIM_SEGMENT__ALTERNATE_ID:
				return getAlternateId();
			case TelecomPackage.CLAIM_SEGMENT__SCHEDULED_PRESCRIPTION_ID_NUMBER:
				return getScheduledPrescriptionIdNumber();
			case TelecomPackage.CLAIM_SEGMENT__UNIT_OF_MEASURE:
				return getUnitOfMeasure();
			case TelecomPackage.CLAIM_SEGMENT__LEVEL_OF_SERVICE:
				return getLevelOfService();
			case TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_TYPE_CODE:
				return getPriorAuthorizationTypeCode();
			case TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_SUBMITTED:
				return getPriorAuthorizationNumberSubmitted();
			case TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_TYPE_ID:
				return getIntermediaryAuthorizationTypeId();
			case TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_ID:
				return getIntermediaryAuthorizationId();
			case TelecomPackage.CLAIM_SEGMENT__DISPENSING_STATUS:
				return getDispensingStatus();
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_INTENDED_TO_BE_DISPENSED:
				return getQuantityIntendedToBeDispensed();
			case TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY_INTENDED_TO_BE_DISPENSED:
				return getDaysSupplyIntendedToBeDispensed();
			case TelecomPackage.CLAIM_SEGMENT__DELAY_REASON_CODE:
				return getDelayReasonCode();
			case TelecomPackage.CLAIM_SEGMENT__TRANSACTION_REFERENCE_NUMBER:
				return getTransactionReferenceNumber();
			case TelecomPackage.CLAIM_SEGMENT__PATIENT_ASSIGNMENT_INDICATORDIRECT_MEMBER_REIMBURSEMENT_INDICATOR:
				return getPatientAssignmentIndicatordirectMemberReimbursementIndicator();
			case TelecomPackage.CLAIM_SEGMENT__ROUTE_OF_ADMINISTRATION:
				return getRouteOfAdministration();
			case TelecomPackage.CLAIM_SEGMENT__COMPOUND_TYPE:
				return getCompoundType();
			case TelecomPackage.CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN:
				return getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn();
			case TelecomPackage.CLAIM_SEGMENT__PHARMACY_SERVICE_TYPE:
				return getPharmacyServiceType();
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
			case TelecomPackage.CLAIM_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER:
				getPrescriptionserviceReferenceNumberQualifier().clear();
				getPrescriptionserviceReferenceNumberQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				getPrescriptionserviceReferenceNumber().clear();
				getPrescriptionserviceReferenceNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID_QUALIFIER:
				getProductserviceIdQualifier().clear();
				getProductserviceIdQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID:
				getProductserviceId().clear();
				getProductserviceId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				getAssociatedPrescriptionserviceReferenceNumber().clear();
				getAssociatedPrescriptionserviceReferenceNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_DATE:
				getAssociatedPrescriptionserviceDate().clear();
				getAssociatedPrescriptionserviceDate().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE_COUNT:
				getProcedureModifierCodeCount().clear();
				getProcedureModifierCodeCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE:
				getProcedureModifierCode().clear();
				getProcedureModifierCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_DISPENSED:
				getQuantityDispensed().clear();
				getQuantityDispensed().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__FILL_NUMBER:
				getFillNumber().clear();
				getFillNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY:
				getDaysSupply().clear();
				getDaysSupply().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__COMPOUND_CODE:
				getCompoundCode().clear();
				getCompoundCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__DISPENSE_AS_WRITTENDAWPRODUCT_SELECTION_CODE:
				getDispenseAsWrittendawproductSelectionCode().clear();
				getDispenseAsWrittendawproductSelectionCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__DATE_PRESCRIPTION_WRITTEN:
				getDatePrescriptionWritten().clear();
				getDatePrescriptionWritten().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__NUMBER_OF_REFILLS_AUTHORIZED:
				getNumberOfRefillsAuthorized().clear();
				getNumberOfRefillsAuthorized().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTION_ORIGIN_CODE:
				getPrescriptionOriginCode().clear();
				getPrescriptionOriginCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE_COUNT:
				getSubmissionClarificationCodeCount().clear();
				getSubmissionClarificationCodeCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE:
				getSubmissionClarificationCode().clear();
				getSubmissionClarificationCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_PRESCRIBED:
				getQuantityPrescribed().clear();
				getQuantityPrescribed().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__OTHER_COVERAGE_CODE:
				getOtherCoverageCode().clear();
				getOtherCoverageCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__SPECIAL_PACKAGING_INDICATOR:
				getSpecialPackagingIndicator().clear();
				getSpecialPackagingIndicator().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_ID_QUALIFIER:
				getOriginallyPrescribedProductserviceIdQualifier().clear();
				getOriginallyPrescribedProductserviceIdQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_CODE:
				getOriginallyPrescribedProductserviceCode().clear();
				getOriginallyPrescribedProductserviceCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_QUANTITY:
				getOriginallyPrescribedQuantity().clear();
				getOriginallyPrescribedQuantity().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__ALTERNATE_ID:
				getAlternateId().clear();
				getAlternateId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__SCHEDULED_PRESCRIPTION_ID_NUMBER:
				getScheduledPrescriptionIdNumber().clear();
				getScheduledPrescriptionIdNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__UNIT_OF_MEASURE:
				getUnitOfMeasure().clear();
				getUnitOfMeasure().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__LEVEL_OF_SERVICE:
				getLevelOfService().clear();
				getLevelOfService().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_TYPE_CODE:
				getPriorAuthorizationTypeCode().clear();
				getPriorAuthorizationTypeCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_SUBMITTED:
				getPriorAuthorizationNumberSubmitted().clear();
				getPriorAuthorizationNumberSubmitted().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_TYPE_ID:
				getIntermediaryAuthorizationTypeId().clear();
				getIntermediaryAuthorizationTypeId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_ID:
				getIntermediaryAuthorizationId().clear();
				getIntermediaryAuthorizationId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__DISPENSING_STATUS:
				getDispensingStatus().clear();
				getDispensingStatus().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_INTENDED_TO_BE_DISPENSED:
				getQuantityIntendedToBeDispensed().clear();
				getQuantityIntendedToBeDispensed().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY_INTENDED_TO_BE_DISPENSED:
				getDaysSupplyIntendedToBeDispensed().clear();
				getDaysSupplyIntendedToBeDispensed().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__DELAY_REASON_CODE:
				getDelayReasonCode().clear();
				getDelayReasonCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__TRANSACTION_REFERENCE_NUMBER:
				getTransactionReferenceNumber().clear();
				getTransactionReferenceNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__PATIENT_ASSIGNMENT_INDICATORDIRECT_MEMBER_REIMBURSEMENT_INDICATOR:
				getPatientAssignmentIndicatordirectMemberReimbursementIndicator().clear();
				getPatientAssignmentIndicatordirectMemberReimbursementIndicator().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__ROUTE_OF_ADMINISTRATION:
				getRouteOfAdministration().clear();
				getRouteOfAdministration().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__COMPOUND_TYPE:
				getCompoundType().clear();
				getCompoundType().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN:
				getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn().clear();
				getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLAIM_SEGMENT__PHARMACY_SERVICE_TYPE:
				getPharmacyServiceType().clear();
				getPharmacyServiceType().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.CLAIM_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER:
				getPrescriptionserviceReferenceNumberQualifier().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				getPrescriptionserviceReferenceNumber().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID_QUALIFIER:
				getProductserviceIdQualifier().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID:
				getProductserviceId().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				getAssociatedPrescriptionserviceReferenceNumber().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_DATE:
				getAssociatedPrescriptionserviceDate().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE_COUNT:
				getProcedureModifierCodeCount().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE:
				getProcedureModifierCode().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_DISPENSED:
				getQuantityDispensed().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__FILL_NUMBER:
				getFillNumber().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY:
				getDaysSupply().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__COMPOUND_CODE:
				getCompoundCode().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__DISPENSE_AS_WRITTENDAWPRODUCT_SELECTION_CODE:
				getDispenseAsWrittendawproductSelectionCode().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__DATE_PRESCRIPTION_WRITTEN:
				getDatePrescriptionWritten().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__NUMBER_OF_REFILLS_AUTHORIZED:
				getNumberOfRefillsAuthorized().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTION_ORIGIN_CODE:
				getPrescriptionOriginCode().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE_COUNT:
				getSubmissionClarificationCodeCount().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE:
				getSubmissionClarificationCode().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_PRESCRIBED:
				getQuantityPrescribed().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__OTHER_COVERAGE_CODE:
				getOtherCoverageCode().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__SPECIAL_PACKAGING_INDICATOR:
				getSpecialPackagingIndicator().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_ID_QUALIFIER:
				getOriginallyPrescribedProductserviceIdQualifier().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_CODE:
				getOriginallyPrescribedProductserviceCode().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_QUANTITY:
				getOriginallyPrescribedQuantity().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__ALTERNATE_ID:
				getAlternateId().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__SCHEDULED_PRESCRIPTION_ID_NUMBER:
				getScheduledPrescriptionIdNumber().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__UNIT_OF_MEASURE:
				getUnitOfMeasure().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__LEVEL_OF_SERVICE:
				getLevelOfService().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_TYPE_CODE:
				getPriorAuthorizationTypeCode().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_SUBMITTED:
				getPriorAuthorizationNumberSubmitted().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_TYPE_ID:
				getIntermediaryAuthorizationTypeId().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_ID:
				getIntermediaryAuthorizationId().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__DISPENSING_STATUS:
				getDispensingStatus().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_INTENDED_TO_BE_DISPENSED:
				getQuantityIntendedToBeDispensed().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY_INTENDED_TO_BE_DISPENSED:
				getDaysSupplyIntendedToBeDispensed().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__DELAY_REASON_CODE:
				getDelayReasonCode().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__TRANSACTION_REFERENCE_NUMBER:
				getTransactionReferenceNumber().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__PATIENT_ASSIGNMENT_INDICATORDIRECT_MEMBER_REIMBURSEMENT_INDICATOR:
				getPatientAssignmentIndicatordirectMemberReimbursementIndicator().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__ROUTE_OF_ADMINISTRATION:
				getRouteOfAdministration().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__COMPOUND_TYPE:
				getCompoundType().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN:
				getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn().clear();
				return;
			case TelecomPackage.CLAIM_SEGMENT__PHARMACY_SERVICE_TYPE:
				getPharmacyServiceType().clear();
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
			case TelecomPackage.CLAIM_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER_QUALIFIER:
				return prescriptionserviceReferenceNumberQualifier != null && !prescriptionserviceReferenceNumberQualifier.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				return prescriptionserviceReferenceNumber != null && !prescriptionserviceReferenceNumber.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID_QUALIFIER:
				return productserviceIdQualifier != null && !productserviceIdQualifier.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__PRODUCTSERVICE_ID:
				return productserviceId != null && !productserviceId.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_REFERENCE_NUMBER:
				return associatedPrescriptionserviceReferenceNumber != null && !associatedPrescriptionserviceReferenceNumber.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__ASSOCIATED_PRESCRIPTIONSERVICE_DATE:
				return associatedPrescriptionserviceDate != null && !associatedPrescriptionserviceDate.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE_COUNT:
				return procedureModifierCodeCount != null && !procedureModifierCodeCount.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__PROCEDURE_MODIFIER_CODE:
				return procedureModifierCode != null && !procedureModifierCode.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_DISPENSED:
				return quantityDispensed != null && !quantityDispensed.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__FILL_NUMBER:
				return fillNumber != null && !fillNumber.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY:
				return daysSupply != null && !daysSupply.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__COMPOUND_CODE:
				return compoundCode != null && !compoundCode.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__DISPENSE_AS_WRITTENDAWPRODUCT_SELECTION_CODE:
				return dispenseAsWrittendawproductSelectionCode != null && !dispenseAsWrittendawproductSelectionCode.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__DATE_PRESCRIPTION_WRITTEN:
				return datePrescriptionWritten != null && !datePrescriptionWritten.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__NUMBER_OF_REFILLS_AUTHORIZED:
				return numberOfRefillsAuthorized != null && !numberOfRefillsAuthorized.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__PRESCRIPTION_ORIGIN_CODE:
				return prescriptionOriginCode != null && !prescriptionOriginCode.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE_COUNT:
				return submissionClarificationCodeCount != null && !submissionClarificationCodeCount.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__SUBMISSION_CLARIFICATION_CODE:
				return submissionClarificationCode != null && !submissionClarificationCode.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_PRESCRIBED:
				return quantityPrescribed != null && !quantityPrescribed.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__OTHER_COVERAGE_CODE:
				return otherCoverageCode != null && !otherCoverageCode.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__SPECIAL_PACKAGING_INDICATOR:
				return specialPackagingIndicator != null && !specialPackagingIndicator.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_ID_QUALIFIER:
				return originallyPrescribedProductserviceIdQualifier != null && !originallyPrescribedProductserviceIdQualifier.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_PRODUCTSERVICE_CODE:
				return originallyPrescribedProductserviceCode != null && !originallyPrescribedProductserviceCode.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__ORIGINALLY_PRESCRIBED_QUANTITY:
				return originallyPrescribedQuantity != null && !originallyPrescribedQuantity.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__ALTERNATE_ID:
				return alternateId != null && !alternateId.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__SCHEDULED_PRESCRIPTION_ID_NUMBER:
				return scheduledPrescriptionIdNumber != null && !scheduledPrescriptionIdNumber.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__UNIT_OF_MEASURE:
				return unitOfMeasure != null && !unitOfMeasure.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__LEVEL_OF_SERVICE:
				return levelOfService != null && !levelOfService.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_TYPE_CODE:
				return priorAuthorizationTypeCode != null && !priorAuthorizationTypeCode.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__PRIOR_AUTHORIZATION_NUMBER_SUBMITTED:
				return priorAuthorizationNumberSubmitted != null && !priorAuthorizationNumberSubmitted.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_TYPE_ID:
				return intermediaryAuthorizationTypeId != null && !intermediaryAuthorizationTypeId.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__INTERMEDIARY_AUTHORIZATION_ID:
				return intermediaryAuthorizationId != null && !intermediaryAuthorizationId.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__DISPENSING_STATUS:
				return dispensingStatus != null && !dispensingStatus.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__QUANTITY_INTENDED_TO_BE_DISPENSED:
				return quantityIntendedToBeDispensed != null && !quantityIntendedToBeDispensed.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__DAYS_SUPPLY_INTENDED_TO_BE_DISPENSED:
				return daysSupplyIntendedToBeDispensed != null && !daysSupplyIntendedToBeDispensed.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__DELAY_REASON_CODE:
				return delayReasonCode != null && !delayReasonCode.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__TRANSACTION_REFERENCE_NUMBER:
				return transactionReferenceNumber != null && !transactionReferenceNumber.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__PATIENT_ASSIGNMENT_INDICATORDIRECT_MEMBER_REIMBURSEMENT_INDICATOR:
				return patientAssignmentIndicatordirectMemberReimbursementIndicator != null && !patientAssignmentIndicatordirectMemberReimbursementIndicator.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__ROUTE_OF_ADMINISTRATION:
				return routeOfAdministration != null && !routeOfAdministration.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__COMPOUND_TYPE:
				return compoundType != null && !compoundType.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__MEDICAID_SUBROGATION_INTERNAL_CONTROL_NUMBERTRANSACTION_CONTROL_NUMBERICNTCN:
				return medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn != null && !medicaidSubrogationInternalControlNumbertransactionControlNumbericntcn.isEmpty();
			case TelecomPackage.CLAIM_SEGMENT__PHARMACY_SERVICE_TYPE:
				return pharmacyServiceType != null && !pharmacyServiceType.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (segmentIdentification: ");
		result.append(segmentIdentification);
		result.append(')');
		return result.toString();
	}

} //ClaimSegmentImpl
