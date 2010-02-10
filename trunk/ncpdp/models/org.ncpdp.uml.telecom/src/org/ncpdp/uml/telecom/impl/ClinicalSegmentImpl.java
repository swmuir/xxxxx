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
import org.ncpdp.uml.ecl.MeasurementDimension;
import org.ncpdp.uml.ecl.MeasurementUnit;
import org.ncpdp.uml.telecom.ClinicalSegment;
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Clinical Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl#getDiagnosisCodeCount <em>Diagnosis Code Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl#getDiagnosisCodeQualifier <em>Diagnosis Code Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl#getDiagnosisCode <em>Diagnosis Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl#getClinicalInformationCounter <em>Clinical Information Counter</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl#getMeasurementDate <em>Measurement Date</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl#getMeasurementTime <em>Measurement Time</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl#getMeasurementDimension <em>Measurement Dimension</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl#getMeasurementUnit <em>Measurement Unit</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.ClinicalSegmentImpl#getMeasurementValue <em>Measurement Value</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ClinicalSegmentImpl extends EObjectImpl implements ClinicalSegment {
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
	 * The cached value of the '{@link #getDiagnosisCodeCount() <em>Diagnosis Code Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisCodeCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> diagnosisCodeCount;

	/**
	 * The cached value of the '{@link #getDiagnosisCodeQualifier() <em>Diagnosis Code Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisCodeQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> diagnosisCodeQualifier;

	/**
	 * The cached value of the '{@link #getDiagnosisCode() <em>Diagnosis Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDiagnosisCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> diagnosisCode;

	/**
	 * The cached value of the '{@link #getClinicalInformationCounter() <em>Clinical Information Counter</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getClinicalInformationCounter()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> clinicalInformationCounter;

	/**
	 * The cached value of the '{@link #getMeasurementDate() <em>Measurement Date</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementDate()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> measurementDate;

	/**
	 * The cached value of the '{@link #getMeasurementTime() <em>Measurement Time</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementTime()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> measurementTime;

	/**
	 * The cached value of the '{@link #getMeasurementDimension() <em>Measurement Dimension</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementDimension()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementDimension> measurementDimension;

	/**
	 * The cached value of the '{@link #getMeasurementUnit() <em>Measurement Unit</em>}' attribute list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementUnit()
	 * @generated
	 * @ordered
	 */
	protected EList<MeasurementUnit> measurementUnit;

	/**
	 * The cached value of the '{@link #getMeasurementValue() <em>Measurement Value</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMeasurementValue()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> measurementValue;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ClinicalSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.CLINICAL_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.CLINICAL_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDiagnosisCodeCount() {
		if (diagnosisCodeCount == null) {
			diagnosisCodeCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_COUNT);
		}
		return diagnosisCodeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDiagnosisCodeQualifier() {
		if (diagnosisCodeQualifier == null) {
			diagnosisCodeQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_QUALIFIER);
		}
		return diagnosisCodeQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getDiagnosisCode() {
		if (diagnosisCode == null) {
			diagnosisCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE);
		}
		return diagnosisCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getClinicalInformationCounter() {
		if (clinicalInformationCounter == null) {
			clinicalInformationCounter = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLINICAL_SEGMENT__CLINICAL_INFORMATION_COUNTER);
		}
		return clinicalInformationCounter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getMeasurementDate() {
		if (measurementDate == null) {
			measurementDate = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_DATE);
		}
		return measurementDate;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getMeasurementTime() {
		if (measurementTime == null) {
			measurementTime = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_TIME);
		}
		return measurementTime;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementDimension> getMeasurementDimension() {
		if (measurementDimension == null) {
			measurementDimension = new EDataTypeUniqueEList<MeasurementDimension>(MeasurementDimension.class, this, TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_DIMENSION);
		}
		return measurementDimension;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<MeasurementUnit> getMeasurementUnit() {
		if (measurementUnit == null) {
			measurementUnit = new EDataTypeUniqueEList<MeasurementUnit>(MeasurementUnit.class, this, TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_UNIT);
		}
		return measurementUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getMeasurementValue() {
		if (measurementValue == null) {
			measurementValue = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_VALUE);
		}
		return measurementValue;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_COUNT:
				return ((InternalEList<?>)getDiagnosisCodeCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_QUALIFIER:
				return ((InternalEList<?>)getDiagnosisCodeQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE:
				return ((InternalEList<?>)getDiagnosisCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLINICAL_SEGMENT__CLINICAL_INFORMATION_COUNTER:
				return ((InternalEList<?>)getClinicalInformationCounter()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_DATE:
				return ((InternalEList<?>)getMeasurementDate()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_TIME:
				return ((InternalEList<?>)getMeasurementTime()).basicRemove(otherEnd, msgs);
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_VALUE:
				return ((InternalEList<?>)getMeasurementValue()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.CLINICAL_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_COUNT:
				return getDiagnosisCodeCount();
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_QUALIFIER:
				return getDiagnosisCodeQualifier();
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE:
				return getDiagnosisCode();
			case TelecomPackage.CLINICAL_SEGMENT__CLINICAL_INFORMATION_COUNTER:
				return getClinicalInformationCounter();
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_DATE:
				return getMeasurementDate();
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_TIME:
				return getMeasurementTime();
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_DIMENSION:
				return getMeasurementDimension();
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_UNIT:
				return getMeasurementUnit();
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_VALUE:
				return getMeasurementValue();
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
			case TelecomPackage.CLINICAL_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_COUNT:
				getDiagnosisCodeCount().clear();
				getDiagnosisCodeCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_QUALIFIER:
				getDiagnosisCodeQualifier().clear();
				getDiagnosisCodeQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE:
				getDiagnosisCode().clear();
				getDiagnosisCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLINICAL_SEGMENT__CLINICAL_INFORMATION_COUNTER:
				getClinicalInformationCounter().clear();
				getClinicalInformationCounter().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_DATE:
				getMeasurementDate().clear();
				getMeasurementDate().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_TIME:
				getMeasurementTime().clear();
				getMeasurementTime().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_DIMENSION:
				getMeasurementDimension().clear();
				getMeasurementDimension().addAll((Collection<? extends MeasurementDimension>)newValue);
				return;
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_UNIT:
				getMeasurementUnit().clear();
				getMeasurementUnit().addAll((Collection<? extends MeasurementUnit>)newValue);
				return;
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_VALUE:
				getMeasurementValue().clear();
				getMeasurementValue().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.CLINICAL_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_COUNT:
				getDiagnosisCodeCount().clear();
				return;
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_QUALIFIER:
				getDiagnosisCodeQualifier().clear();
				return;
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE:
				getDiagnosisCode().clear();
				return;
			case TelecomPackage.CLINICAL_SEGMENT__CLINICAL_INFORMATION_COUNTER:
				getClinicalInformationCounter().clear();
				return;
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_DATE:
				getMeasurementDate().clear();
				return;
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_TIME:
				getMeasurementTime().clear();
				return;
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_DIMENSION:
				getMeasurementDimension().clear();
				return;
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_UNIT:
				getMeasurementUnit().clear();
				return;
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_VALUE:
				getMeasurementValue().clear();
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
			case TelecomPackage.CLINICAL_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_COUNT:
				return diagnosisCodeCount != null && !diagnosisCodeCount.isEmpty();
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE_QUALIFIER:
				return diagnosisCodeQualifier != null && !diagnosisCodeQualifier.isEmpty();
			case TelecomPackage.CLINICAL_SEGMENT__DIAGNOSIS_CODE:
				return diagnosisCode != null && !diagnosisCode.isEmpty();
			case TelecomPackage.CLINICAL_SEGMENT__CLINICAL_INFORMATION_COUNTER:
				return clinicalInformationCounter != null && !clinicalInformationCounter.isEmpty();
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_DATE:
				return measurementDate != null && !measurementDate.isEmpty();
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_TIME:
				return measurementTime != null && !measurementTime.isEmpty();
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_DIMENSION:
				return measurementDimension != null && !measurementDimension.isEmpty();
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_UNIT:
				return measurementUnit != null && !measurementUnit.isEmpty();
			case TelecomPackage.CLINICAL_SEGMENT__MEASUREMENT_VALUE:
				return measurementValue != null && !measurementValue.isEmpty();
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
		result.append(", measurementDimension: ");
		result.append(measurementDimension);
		result.append(", measurementUnit: ");
		result.append(measurementUnit);
		result.append(')');
		return result.toString();
	}

} //ClinicalSegmentImpl
