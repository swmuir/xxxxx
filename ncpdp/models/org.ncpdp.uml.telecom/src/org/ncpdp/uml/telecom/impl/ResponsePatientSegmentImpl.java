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
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.ResponsePatientSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Response Patient Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePatientSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePatientSegmentImpl#getPatientFirstName <em>Patient First Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePatientSegmentImpl#getPatientLastName <em>Patient Last Name</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ResponsePatientSegmentImpl#getDateOfBirth <em>Date Of Birth</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ResponsePatientSegmentImpl extends EObjectImpl implements ResponsePatientSegment {
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
	 * The cached value of the '{@link #getPatientFirstName() <em>Patient First Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientFirstName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientFirstName;

	/**
	 * The cached value of the '{@link #getPatientLastName() <em>Patient Last Name</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatientLastName()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> patientLastName;

	/**
	 * The cached value of the '{@link #getDateOfBirth() <em>Date Of Birth</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDateOfBirth()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> dateOfBirth;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ResponsePatientSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.RESPONSE_PATIENT_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.RESPONSE_PATIENT_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientFirstName() {
		if (patientFirstName == null) {
			patientFirstName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_FIRST_NAME);
		}
		return patientFirstName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getPatientLastName() {
		if (patientLastName == null) {
			patientLastName = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_LAST_NAME);
		}
		return patientLastName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDateOfBirth() {
		if (dateOfBirth == null) {
			dateOfBirth = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.RESPONSE_PATIENT_SEGMENT__DATE_OF_BIRTH);
		}
		return dateOfBirth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_FIRST_NAME:
				return ((InternalEList<?>)getPatientFirstName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_LAST_NAME:
				return ((InternalEList<?>)getPatientLastName()).basicRemove(otherEnd, msgs);
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__DATE_OF_BIRTH:
				return ((InternalEList<?>)getDateOfBirth()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_FIRST_NAME:
				return getPatientFirstName();
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_LAST_NAME:
				return getPatientLastName();
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__DATE_OF_BIRTH:
				return getDateOfBirth();
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
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_FIRST_NAME:
				getPatientFirstName().clear();
				getPatientFirstName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_LAST_NAME:
				getPatientLastName().clear();
				getPatientLastName().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__DATE_OF_BIRTH:
				getDateOfBirth().clear();
				getDateOfBirth().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_FIRST_NAME:
				getPatientFirstName().clear();
				return;
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_LAST_NAME:
				getPatientLastName().clear();
				return;
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__DATE_OF_BIRTH:
				getDateOfBirth().clear();
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
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_FIRST_NAME:
				return patientFirstName != null && !patientFirstName.isEmpty();
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__PATIENT_LAST_NAME:
				return patientLastName != null && !patientLastName.isEmpty();
			case TelecomPackage.RESPONSE_PATIENT_SEGMENT__DATE_OF_BIRTH:
				return dateOfBirth != null && !dateOfBirth.isEmpty();
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

} //ResponsePatientSegmentImpl
