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
 * A representation of the model object '<em><b>Transmission1</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission1#getTransactionHeaderSegment <em>Transaction Header Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission1#getClaimSegment <em>Claim Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission1#getClinicalSegment <em>Clinical Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission1#getCompoundSegment <em>Compound Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission1#getWorkersCompensationSegment <em>Workers Compensation Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission1#getInsuranceSegment <em>Insurance Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission1#getCoordinationofBenefitsOtherPaymentsSegment <em>Coordinationof Benefits Other Payments Segment</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.Transmission1#getPatientSegment <em>Patient Segment</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission1()
 * @model
 * @generated
 */
public interface Transmission1 extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission1_TransactionHeaderSegment()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	TransactionHeaderSegment getTransactionHeaderSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission1#getTransactionHeaderSegment <em>Transaction Header Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transaction Header Segment</em>' containment reference.
	 * @see #getTransactionHeaderSegment()
	 * @generated
	 */
	void setTransactionHeaderSegment(TransactionHeaderSegment value);

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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission1_ClaimSegment()
	 * @model containment="true" required="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ClaimSegment getClaimSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission1#getClaimSegment <em>Claim Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Claim Segment</em>' containment reference.
	 * @see #getClaimSegment()
	 * @generated
	 */
	void setClaimSegment(ClaimSegment value);

	/**
	 * Returns the value of the '<em><b>Clinical Segment</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Clinical Segment</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Clinical Segment</em>' reference.
	 * @see #setClinicalSegment(ClinicalSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission1_ClinicalSegment()
	 * @model required="true" ordered="false"
	 *        extendedMetaData="name='segment' namespace='##targetNamespace'"
	 * @generated
	 */
	ClinicalSegment getClinicalSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission1#getClinicalSegment <em>Clinical Segment</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Clinical Segment</em>' reference.
	 * @see #getClinicalSegment()
	 * @generated
	 */
	void setClinicalSegment(ClinicalSegment value);

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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission1_CompoundSegment()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	CompoundSegment getCompoundSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission1#getCompoundSegment <em>Compound Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Compound Segment</em>' containment reference.
	 * @see #getCompoundSegment()
	 * @generated
	 */
	void setCompoundSegment(CompoundSegment value);

	/**
	 * Returns the value of the '<em><b>Workers Compensation Segment</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Workers Compensation Segment</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Workers Compensation Segment</em>' containment reference.
	 * @see #setWorkersCompensationSegment(WorkersCompensationSegment)
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission1_WorkersCompensationSegment()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	WorkersCompensationSegment getWorkersCompensationSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission1#getWorkersCompensationSegment <em>Workers Compensation Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Workers Compensation Segment</em>' containment reference.
	 * @see #getWorkersCompensationSegment()
	 * @generated
	 */
	void setWorkersCompensationSegment(WorkersCompensationSegment value);

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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission1_InsuranceSegment()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	InsuranceSegment getInsuranceSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission1#getInsuranceSegment <em>Insurance Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Insurance Segment</em>' containment reference.
	 * @see #getInsuranceSegment()
	 * @generated
	 */
	void setInsuranceSegment(InsuranceSegment value);

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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission1_CoordinationofBenefitsOtherPaymentsSegment()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	CoordinationofBenefitsOtherPaymentsSegment getCoordinationofBenefitsOtherPaymentsSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission1#getCoordinationofBenefitsOtherPaymentsSegment <em>Coordinationof Benefits Other Payments Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Coordinationof Benefits Other Payments Segment</em>' containment reference.
	 * @see #getCoordinationofBenefitsOtherPaymentsSegment()
	 * @generated
	 */
	void setCoordinationofBenefitsOtherPaymentsSegment(CoordinationofBenefitsOtherPaymentsSegment value);

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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getTransmission1_PatientSegment()
	 * @model containment="true" required="true" ordered="false"
	 * @generated
	 */
	PatientSegment getPatientSegment();

	/**
	 * Sets the value of the '{@link org.ncpdp.uml.telecom.Transmission1#getPatientSegment <em>Patient Segment</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Patient Segment</em>' containment reference.
	 * @see #getPatientSegment()
	 * @generated
	 */
	void setPatientSegment(PatientSegment value);

} // Transmission1
