/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ncpdp.uml.ECL.DURCoAgentIDQualifier;
import org.ncpdp.uml.ECL.ProfessionalServiceCode;
import org.ncpdp.uml.ECL.ReasonforServiceCode;
import org.ncpdp.uml.ECL.ResultofServiceCode;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>DURPPS Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.DURPPSSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.DURPPSSegment#getDurppsCodeCounter <em>Durpps Code Counter</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.DURPPSSegment#getReasonForServiceCode <em>Reason For Service Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.DURPPSSegment#getProfessionalServiceCode <em>Professional Service Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.DURPPSSegment#getResultOfServiceCode <em>Result Of Service Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.DURPPSSegment#getDurppsLevelOfEffort <em>Durpps Level Of Effort</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.DURPPSSegment#getDurCoagentIdQualifier <em>Dur Coagent Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.DURPPSSegment#getDurCoagentId <em>Dur Coagent Id</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getDURPPSSegment()
 * @model
 * @generated
 */
public interface DURPPSSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getDURPPSSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Durpps Code Counter</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durpps Code Counter</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durpps Code Counter</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getDURPPSSegment_DurppsCodeCounter()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDurppsCodeCounter();

	/**
	 * Returns the value of the '<em><b>Reason For Service Code</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.ReasonforServiceCode}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.ReasonforServiceCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reason For Service Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reason For Service Code</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.ReasonforServiceCode
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getDURPPSSegment_ReasonForServiceCode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ReasonforServiceCode> getReasonForServiceCode();

	/**
	 * Returns the value of the '<em><b>Professional Service Code</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.ProfessionalServiceCode}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.ProfessionalServiceCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Professional Service Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Professional Service Code</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.ProfessionalServiceCode
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getDURPPSSegment_ProfessionalServiceCode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ProfessionalServiceCode> getProfessionalServiceCode();

	/**
	 * Returns the value of the '<em><b>Result Of Service Code</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.ResultofServiceCode}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.ResultofServiceCode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Result Of Service Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Result Of Service Code</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.ResultofServiceCode
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getDURPPSSegment_ResultOfServiceCode()
	 * @model ordered="false"
	 * @generated
	 */
	EList<ResultofServiceCode> getResultOfServiceCode();

	/**
	 * Returns the value of the '<em><b>Durpps Level Of Effort</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Durpps Level Of Effort</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Durpps Level Of Effort</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getDURPPSSegment_DurppsLevelOfEffort()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDurppsLevelOfEffort();

	/**
	 * Returns the value of the '<em><b>Dur Coagent Id Qualifier</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.DURCoAgentIDQualifier}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.DURCoAgentIDQualifier}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dur Coagent Id Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dur Coagent Id Qualifier</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.DURCoAgentIDQualifier
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getDURPPSSegment_DurCoagentIdQualifier()
	 * @model ordered="false"
	 * @generated
	 */
	EList<DURCoAgentIDQualifier> getDurCoagentIdQualifier();

	/**
	 * Returns the value of the '<em><b>Dur Coagent Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Dur Coagent Id</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Dur Coagent Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getDURPPSSegment_DurCoagentId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getDurCoagentId();

} // DURPPSSegment
