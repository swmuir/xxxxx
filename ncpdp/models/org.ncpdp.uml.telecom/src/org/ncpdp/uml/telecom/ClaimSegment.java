/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Claim Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getPrescriptionserviceReferenceNumberQualifier <em>Prescriptionservice Reference Number Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getPrescriptionserviceReferenceNumber <em>Prescriptionservice Reference Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getProductserviceIdQualifier <em>Productservice Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getProductserviceId <em>Productservice Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getAssociatedPrescriptionserviceReferenceNumber <em>Associated Prescriptionservice Reference Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getAssociatedPrescriptionserviceDate <em>Associated Prescriptionservice Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getProcedureModifierCodeCount <em>Procedure Modifier Code Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getProcedureModifierCode <em>Procedure Modifier Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getQuantityDispensed <em>Quantity Dispensed</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getFillNumber <em>Fill Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getDaysSupply <em>Days Supply</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getCompoundCode <em>Compound Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getDispenseAsWrittendawproductSelectionCode <em>Dispense As Writtendawproduct Selection Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getDatePrescriptionWritten <em>Date Prescription Written</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getNumberOfRefillsAuthorized <em>Number Of Refills Authorized</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getPrescriptionOriginCode <em>Prescription Origin Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getSubmissionClarificationCodeCount <em>Submission Clarification Code Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getSubmissionClarificationCode <em>Submission Clarification Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getQuantityPrescribed <em>Quantity Prescribed</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getOtherCoverageCode <em>Other Coverage Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getSpecialPackagingIndicator <em>Special Packaging Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getOriginallyPrescribedProductserviceIdQualifier <em>Originally Prescribed Productservice Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getOriginallyPrescribedProductserviceCode <em>Originally Prescribed Productservice Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getOriginallyPrescribedQuantity <em>Originally Prescribed Quantity</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getAlternateId <em>Alternate Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getScheduledPrescriptionIdNumber <em>Scheduled Prescription Id Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getUnitOfMeasure <em>Unit Of Measure</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getLevelOfService <em>Level Of Service</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getPriorAuthorizationTypeCode <em>Prior Authorization Type Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getPriorAuthorizationNumberSubmitted <em>Prior Authorization Number Submitted</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getIntermediaryAuthorizationTypeId <em>Intermediary Authorization Type Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getIntermediaryAuthorizationId <em>Intermediary Authorization Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getDispensingStatus <em>Dispensing Status</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getQuantityIntendedToBeDispensed <em>Quantity Intended To Be Dispensed</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getDaysSupplyIntendedToBeDispensed <em>Days Supply Intended To Be Dispensed</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getDelayReasonCode <em>Delay Reason Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getTransactionReferenceNumber <em>Transaction Reference Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getPatientAssignmentIndicatordirectMemberReimbursementIndicator <em>Patient Assignment Indicatordirect Member Reimbursement Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getRouteOfAdministration <em>Route Of Administration</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getCompoundType <em>Compound Type</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn <em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.ClaimSegment#getPharmacyServiceType <em>Pharmacy Service Type</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment()
 * @model annotation="http://www.ncpdp.org/uml/telecom/annotation segmentIdentification='111-AM' prescriptionserviceReferenceNumberQualifier.field='455-EM' prescriptionserviceReferenceNumber.field='402-D2' productserviceIdQualifier.field='436-E1 ' productserviceId.field='407-D7' associatedPrescriptionserviceReferenceNumber.field='456-EN' associatedPrescriptionserviceDate.field='457-EP' procedureModifierCodeCount.field='458-SE' procedureModifierCode.field='459-ER' quantityDispensed.field='442-E7' fillNumber.field='403-D3' daysSupply.field='405-D5' compoundCode.field='406-D6' dispenseAsWritten(daw)productSelectionCode.field='408-D8' datePrescriptionWritten.field='414-DE' numberOfRefillsAuthorized.field='415-DF' prescriptionOriginCode.field='419-DJ' submissionClarificationCodeCount.field='354-NX' submissionClarificationCode.field='420-DK' quantityPrescribed.field='46 -ET' otherCoverageCode.field='308-C8' specialPackagingIndicator.field='429-DT' originallyPrescribedProductserviceIdQualifier.field='453-EJ' originallyPrescribedProductserviceCode.field='445-EA' originallyPrescribedQuantity.field='446-EB' alternateId.field='330-CW' scheduledPrescriptionIdNumber.field='454-EK' unitOfMeasure.field='600-28' levelOfService.field='418-DI' priorAuthorizationTypeCode.field='461-EU' priorAuthorizationNumberSubmitted.field='462-EV' intermediaryAuthorizationTypeId.field='463-EW' intermediaryAuthorizationId.field='464-EX' dispensingStatus.field='343-HD' quantityIntendedToBeDispensed.field='344-HF' daysSupplyIntendedToBeDispensed.field='345-HG' delayReasonCode.field='357-NV' transactionReferenceNumber.field='880-K5' patientAssignmentIndicator(directMemberReimbursementIndicator).field='391-MT' routeOfAdministration.field='995-E2' compoundType.field='996-G1' medicaidSubrogationInternalControlNumbertransactionControlNumber(icntcn).field='114-N4' pharmacyServiceType.field='147-U7'"
 * @generated
 */
public interface ClaimSegment extends EObject {
	/**
	 * Returns the value of the '<em><b>Segment Identification</b></em>' attribute list.
	 * The list contents are of type {@link java.lang.String}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Segment Identification</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Segment Identification</em>' attribute list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Prescriptionservice Reference Number Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptionservice Reference Number Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptionservice Reference Number Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_PrescriptionserviceReferenceNumberQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getPrescriptionserviceReferenceNumberQualifier();

	/**
	 * Returns the value of the '<em><b>Prescriptionservice Reference Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescriptionservice Reference Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescriptionservice Reference Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_PrescriptionserviceReferenceNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getPrescriptionserviceReferenceNumber();

	/**
	 * Returns the value of the '<em><b>Productservice Id Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productservice Id Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productservice Id Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_ProductserviceIdQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getProductserviceIdQualifier();

	/**
	 * Returns the value of the '<em><b>Productservice Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Productservice Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Productservice Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_ProductserviceId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getProductserviceId();

	/**
	 * Returns the value of the '<em><b>Associated Prescriptionservice Reference Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Prescriptionservice Reference Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Prescriptionservice Reference Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_AssociatedPrescriptionserviceReferenceNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getAssociatedPrescriptionserviceReferenceNumber();

	/**
	 * Returns the value of the '<em><b>Associated Prescriptionservice Date</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated Prescriptionservice Date</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated Prescriptionservice Date</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_AssociatedPrescriptionserviceDate()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getAssociatedPrescriptionserviceDate();

	/**
	 * Returns the value of the '<em><b>Procedure Modifier Code Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Modifier Code Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Modifier Code Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_ProcedureModifierCodeCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getProcedureModifierCodeCount();

	/**
	 * Returns the value of the '<em><b>Procedure Modifier Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Procedure Modifier Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Procedure Modifier Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_ProcedureModifierCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getProcedureModifierCode();

	/**
	 * Returns the value of the '<em><b>Quantity Dispensed</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Dispensed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Dispensed</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_QuantityDispensed()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getQuantityDispensed();

	/**
	 * Returns the value of the '<em><b>Fill Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fill Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fill Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_FillNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getFillNumber();

	/**
	 * Returns the value of the '<em><b>Days Supply</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days Supply</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days Supply</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_DaysSupply()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getDaysSupply();

	/**
	 * Returns the value of the '<em><b>Compound Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_CompoundCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getCompoundCode();

	/**
	 * Returns the value of the '<em><b>Dispense As Writtendawproduct Selection Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispense As Writtendawproduct Selection Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispense As Writtendawproduct Selection Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_DispenseAsWrittendawproductSelectionCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getDispenseAsWrittendawproductSelectionCode();

	/**
	 * Returns the value of the '<em><b>Date Prescription Written</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Date Prescription Written</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Date Prescription Written</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_DatePrescriptionWritten()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getDatePrescriptionWritten();

	/**
	 * Returns the value of the '<em><b>Number Of Refills Authorized</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Number Of Refills Authorized</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Number Of Refills Authorized</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_NumberOfRefillsAuthorized()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getNumberOfRefillsAuthorized();

	/**
	 * Returns the value of the '<em><b>Prescription Origin Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prescription Origin Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prescription Origin Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_PrescriptionOriginCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getPrescriptionOriginCode();

	/**
	 * Returns the value of the '<em><b>Submission Clarification Code Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submission Clarification Code Count</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submission Clarification Code Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_SubmissionClarificationCodeCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getSubmissionClarificationCodeCount();

	/**
	 * Returns the value of the '<em><b>Submission Clarification Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Submission Clarification Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Submission Clarification Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_SubmissionClarificationCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getSubmissionClarificationCode();

	/**
	 * Returns the value of the '<em><b>Quantity Prescribed</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Prescribed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Prescribed</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_QuantityPrescribed()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getQuantityPrescribed();

	/**
	 * Returns the value of the '<em><b>Other Coverage Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Other Coverage Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Other Coverage Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_OtherCoverageCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getOtherCoverageCode();

	/**
	 * Returns the value of the '<em><b>Special Packaging Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Special Packaging Indicator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Special Packaging Indicator</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_SpecialPackagingIndicator()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getSpecialPackagingIndicator();

	/**
	 * Returns the value of the '<em><b>Originally Prescribed Productservice Id Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originally Prescribed Productservice Id Qualifier</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originally Prescribed Productservice Id Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_OriginallyPrescribedProductserviceIdQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getOriginallyPrescribedProductserviceIdQualifier();

	/**
	 * Returns the value of the '<em><b>Originally Prescribed Productservice Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originally Prescribed Productservice Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originally Prescribed Productservice Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_OriginallyPrescribedProductserviceCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getOriginallyPrescribedProductserviceCode();

	/**
	 * Returns the value of the '<em><b>Originally Prescribed Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Originally Prescribed Quantity</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Originally Prescribed Quantity</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_OriginallyPrescribedQuantity()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getOriginallyPrescribedQuantity();

	/**
	 * Returns the value of the '<em><b>Alternate Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Alternate Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Alternate Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_AlternateId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getAlternateId();

	/**
	 * Returns the value of the '<em><b>Scheduled Prescription Id Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Scheduled Prescription Id Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Scheduled Prescription Id Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_ScheduledPrescriptionIdNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getScheduledPrescriptionIdNumber();

	/**
	 * Returns the value of the '<em><b>Unit Of Measure</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Unit Of Measure</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Unit Of Measure</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_UnitOfMeasure()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getUnitOfMeasure();

	/**
	 * Returns the value of the '<em><b>Level Of Service</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Level Of Service</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Level Of Service</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_LevelOfService()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getLevelOfService();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Type Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Type Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Type Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_PriorAuthorizationTypeCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationTypeCode();

	/**
	 * Returns the value of the '<em><b>Prior Authorization Number Submitted</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Prior Authorization Number Submitted</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Prior Authorization Number Submitted</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_PriorAuthorizationNumberSubmitted()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getPriorAuthorizationNumberSubmitted();

	/**
	 * Returns the value of the '<em><b>Intermediary Authorization Type Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediary Authorization Type Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediary Authorization Type Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_IntermediaryAuthorizationTypeId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getIntermediaryAuthorizationTypeId();

	/**
	 * Returns the value of the '<em><b>Intermediary Authorization Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Intermediary Authorization Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Intermediary Authorization Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_IntermediaryAuthorizationId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getIntermediaryAuthorizationId();

	/**
	 * Returns the value of the '<em><b>Dispensing Status</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dispensing Status</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dispensing Status</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_DispensingStatus()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getDispensingStatus();

	/**
	 * Returns the value of the '<em><b>Quantity Intended To Be Dispensed</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Quantity Intended To Be Dispensed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Quantity Intended To Be Dispensed</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_QuantityIntendedToBeDispensed()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getQuantityIntendedToBeDispensed();

	/**
	 * Returns the value of the '<em><b>Days Supply Intended To Be Dispensed</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Days Supply Intended To Be Dispensed</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Days Supply Intended To Be Dispensed</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_DaysSupplyIntendedToBeDispensed()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getDaysSupplyIntendedToBeDispensed();

	/**
	 * Returns the value of the '<em><b>Delay Reason Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Delay Reason Code</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Delay Reason Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_DelayReasonCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getDelayReasonCode();

	/**
	 * Returns the value of the '<em><b>Transaction Reference Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transaction Reference Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transaction Reference Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_TransactionReferenceNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getTransactionReferenceNumber();

	/**
	 * Returns the value of the '<em><b>Patient Assignment Indicatordirect Member Reimbursement Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Patient Assignment Indicatordirect Member Reimbursement Indicator</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Patient Assignment Indicatordirect Member Reimbursement Indicator</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_PatientAssignmentIndicatordirectMemberReimbursementIndicator()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getPatientAssignmentIndicatordirectMemberReimbursementIndicator();

	/**
	 * Returns the value of the '<em><b>Route Of Administration</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Route Of Administration</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Route Of Administration</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_RouteOfAdministration()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getRouteOfAdministration();

	/**
	 * Returns the value of the '<em><b>Compound Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Type</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_CompoundType()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getCompoundType();

	/**
	 * Returns the value of the '<em><b>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Medicaid Subrogation Internal Control Numbertransaction Control Numbericntcn</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_MedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getMedicaidSubrogationInternalControlNumbertransactionControlNumbericntcn();

	/**
	 * Returns the value of the '<em><b>Pharmacy Service Type</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Pharmacy Service Type</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Pharmacy Service Type</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getClaimSegment_PharmacyServiceType()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element' namespace='##targetNamespace'"
	 * @generated
	 */
	EList<Field> getPharmacyServiceType();

} // ClaimSegment
