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

import org.ncpdp.uml.telecom.DURPPSSegment;
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>DURPPS Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl#getDurppsCodeCounter <em>Durpps Code Counter</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl#getReasonForServiceCode <em>Reason For Service Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl#getProfessionalServiceCode <em>Professional Service Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl#getResultOfServiceCode <em>Result Of Service Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl#getDurppsLevelOfEffort <em>Durpps Level Of Effort</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl#getDurCoagentIdQualifier <em>Dur Coagent Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.DURPPSSegmentImpl#getDurCoagentId <em>Dur Coagent Id</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class DURPPSSegmentImpl extends EObjectImpl implements DURPPSSegment {
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
	 * The cached value of the '{@link #getDurppsCodeCounter() <em>Durpps Code Counter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurppsCodeCounter()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> durppsCodeCounter;

	/**
	 * The cached value of the '{@link #getReasonForServiceCode() <em>Reason For Service Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReasonForServiceCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> reasonForServiceCode;

	/**
	 * The cached value of the '{@link #getProfessionalServiceCode() <em>Professional Service Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getProfessionalServiceCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> professionalServiceCode;

	/**
	 * The cached value of the '{@link #getResultOfServiceCode() <em>Result Of Service Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResultOfServiceCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> resultOfServiceCode;

	/**
	 * The cached value of the '{@link #getDurppsLevelOfEffort() <em>Durpps Level Of Effort</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurppsLevelOfEffort()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> durppsLevelOfEffort;

	/**
	 * The cached value of the '{@link #getDurCoagentIdQualifier() <em>Dur Coagent Id Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurCoagentIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> durCoagentIdQualifier;

	/**
	 * The cached value of the '{@link #getDurCoagentId() <em>Dur Coagent Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDurCoagentId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> durCoagentId;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DURPPSSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.DURPPS_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.DURPPS_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDurppsCodeCounter() {
		if (durppsCodeCounter == null) {
			durppsCodeCounter = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.DURPPS_SEGMENT__DURPPS_CODE_COUNTER);
		}
		return durppsCodeCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getReasonForServiceCode() {
		if (reasonForServiceCode == null) {
			reasonForServiceCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE);
		}
		return reasonForServiceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getProfessionalServiceCode() {
		if (professionalServiceCode == null) {
			professionalServiceCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.DURPPS_SEGMENT__PROFESSIONAL_SERVICE_CODE);
		}
		return professionalServiceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getResultOfServiceCode() {
		if (resultOfServiceCode == null) {
			resultOfServiceCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.DURPPS_SEGMENT__RESULT_OF_SERVICE_CODE);
		}
		return resultOfServiceCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDurppsLevelOfEffort() {
		if (durppsLevelOfEffort == null) {
			durppsLevelOfEffort = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.DURPPS_SEGMENT__DURPPS_LEVEL_OF_EFFORT);
		}
		return durppsLevelOfEffort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDurCoagentIdQualifier() {
		if (durCoagentIdQualifier == null) {
			durCoagentIdQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID_QUALIFIER);
		}
		return durCoagentIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDurCoagentId() {
		if (durCoagentId == null) {
			durCoagentId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID);
		}
		return durCoagentId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.DURPPS_SEGMENT__DURPPS_CODE_COUNTER:
				return ((InternalEList<?>)getDurppsCodeCounter()).basicRemove(otherEnd, msgs);
			case TelecomPackage.DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE:
				return ((InternalEList<?>)getReasonForServiceCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.DURPPS_SEGMENT__PROFESSIONAL_SERVICE_CODE:
				return ((InternalEList<?>)getProfessionalServiceCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.DURPPS_SEGMENT__RESULT_OF_SERVICE_CODE:
				return ((InternalEList<?>)getResultOfServiceCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.DURPPS_SEGMENT__DURPPS_LEVEL_OF_EFFORT:
				return ((InternalEList<?>)getDurppsLevelOfEffort()).basicRemove(otherEnd, msgs);
			case TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID_QUALIFIER:
				return ((InternalEList<?>)getDurCoagentIdQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID:
				return ((InternalEList<?>)getDurCoagentId()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.DURPPS_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.DURPPS_SEGMENT__DURPPS_CODE_COUNTER:
				return getDurppsCodeCounter();
			case TelecomPackage.DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE:
				return getReasonForServiceCode();
			case TelecomPackage.DURPPS_SEGMENT__PROFESSIONAL_SERVICE_CODE:
				return getProfessionalServiceCode();
			case TelecomPackage.DURPPS_SEGMENT__RESULT_OF_SERVICE_CODE:
				return getResultOfServiceCode();
			case TelecomPackage.DURPPS_SEGMENT__DURPPS_LEVEL_OF_EFFORT:
				return getDurppsLevelOfEffort();
			case TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID_QUALIFIER:
				return getDurCoagentIdQualifier();
			case TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID:
				return getDurCoagentId();
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
			case TelecomPackage.DURPPS_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.DURPPS_SEGMENT__DURPPS_CODE_COUNTER:
				getDurppsCodeCounter().clear();
				getDurppsCodeCounter().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE:
				getReasonForServiceCode().clear();
				getReasonForServiceCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.DURPPS_SEGMENT__PROFESSIONAL_SERVICE_CODE:
				getProfessionalServiceCode().clear();
				getProfessionalServiceCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.DURPPS_SEGMENT__RESULT_OF_SERVICE_CODE:
				getResultOfServiceCode().clear();
				getResultOfServiceCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.DURPPS_SEGMENT__DURPPS_LEVEL_OF_EFFORT:
				getDurppsLevelOfEffort().clear();
				getDurppsLevelOfEffort().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID_QUALIFIER:
				getDurCoagentIdQualifier().clear();
				getDurCoagentIdQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID:
				getDurCoagentId().clear();
				getDurCoagentId().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.DURPPS_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.DURPPS_SEGMENT__DURPPS_CODE_COUNTER:
				getDurppsCodeCounter().clear();
				return;
			case TelecomPackage.DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE:
				getReasonForServiceCode().clear();
				return;
			case TelecomPackage.DURPPS_SEGMENT__PROFESSIONAL_SERVICE_CODE:
				getProfessionalServiceCode().clear();
				return;
			case TelecomPackage.DURPPS_SEGMENT__RESULT_OF_SERVICE_CODE:
				getResultOfServiceCode().clear();
				return;
			case TelecomPackage.DURPPS_SEGMENT__DURPPS_LEVEL_OF_EFFORT:
				getDurppsLevelOfEffort().clear();
				return;
			case TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID_QUALIFIER:
				getDurCoagentIdQualifier().clear();
				return;
			case TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID:
				getDurCoagentId().clear();
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
			case TelecomPackage.DURPPS_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.DURPPS_SEGMENT__DURPPS_CODE_COUNTER:
				return durppsCodeCounter != null && !durppsCodeCounter.isEmpty();
			case TelecomPackage.DURPPS_SEGMENT__REASON_FOR_SERVICE_CODE:
				return reasonForServiceCode != null && !reasonForServiceCode.isEmpty();
			case TelecomPackage.DURPPS_SEGMENT__PROFESSIONAL_SERVICE_CODE:
				return professionalServiceCode != null && !professionalServiceCode.isEmpty();
			case TelecomPackage.DURPPS_SEGMENT__RESULT_OF_SERVICE_CODE:
				return resultOfServiceCode != null && !resultOfServiceCode.isEmpty();
			case TelecomPackage.DURPPS_SEGMENT__DURPPS_LEVEL_OF_EFFORT:
				return durppsLevelOfEffort != null && !durppsLevelOfEffort.isEmpty();
			case TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID_QUALIFIER:
				return durCoagentIdQualifier != null && !durCoagentIdQualifier.isEmpty();
			case TelecomPackage.DURPPS_SEGMENT__DUR_COAGENT_ID:
				return durCoagentId != null && !durCoagentId.isEmpty();
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

} //DURPPSSegmentImpl
