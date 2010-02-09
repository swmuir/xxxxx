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

import org.ncpdp.uml.telecom.CouponSegment;
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Coupon Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CouponSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CouponSegmentImpl#getCouponType <em>Coupon Type</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CouponSegmentImpl#getCouponNumber <em>Coupon Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CouponSegmentImpl#getCouponValueAmount <em>Coupon Value Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CouponSegmentImpl extends EObjectImpl implements CouponSegment {
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
	 * The cached value of the '{@link #getCouponType() <em>Coupon Type</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouponType()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> couponType;

	/**
	 * The cached value of the '{@link #getCouponNumber() <em>Coupon Number</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouponNumber()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> couponNumber;

	/**
	 * The cached value of the '{@link #getCouponValueAmount() <em>Coupon Value Amount</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCouponValueAmount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> couponValueAmount;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CouponSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.COUPON_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.COUPON_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCouponType() {
		if (couponType == null) {
			couponType = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COUPON_SEGMENT__COUPON_TYPE);
		}
		return couponType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCouponNumber() {
		if (couponNumber == null) {
			couponNumber = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COUPON_SEGMENT__COUPON_NUMBER);
		}
		return couponNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCouponValueAmount() {
		if (couponValueAmount == null) {
			couponValueAmount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COUPON_SEGMENT__COUPON_VALUE_AMOUNT);
		}
		return couponValueAmount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.COUPON_SEGMENT__COUPON_TYPE:
				return ((InternalEList<?>)getCouponType()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COUPON_SEGMENT__COUPON_NUMBER:
				return ((InternalEList<?>)getCouponNumber()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COUPON_SEGMENT__COUPON_VALUE_AMOUNT:
				return ((InternalEList<?>)getCouponValueAmount()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.COUPON_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.COUPON_SEGMENT__COUPON_TYPE:
				return getCouponType();
			case TelecomPackage.COUPON_SEGMENT__COUPON_NUMBER:
				return getCouponNumber();
			case TelecomPackage.COUPON_SEGMENT__COUPON_VALUE_AMOUNT:
				return getCouponValueAmount();
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
			case TelecomPackage.COUPON_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.COUPON_SEGMENT__COUPON_TYPE:
				getCouponType().clear();
				getCouponType().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COUPON_SEGMENT__COUPON_NUMBER:
				getCouponNumber().clear();
				getCouponNumber().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COUPON_SEGMENT__COUPON_VALUE_AMOUNT:
				getCouponValueAmount().clear();
				getCouponValueAmount().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.COUPON_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.COUPON_SEGMENT__COUPON_TYPE:
				getCouponType().clear();
				return;
			case TelecomPackage.COUPON_SEGMENT__COUPON_NUMBER:
				getCouponNumber().clear();
				return;
			case TelecomPackage.COUPON_SEGMENT__COUPON_VALUE_AMOUNT:
				getCouponValueAmount().clear();
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
			case TelecomPackage.COUPON_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.COUPON_SEGMENT__COUPON_TYPE:
				return couponType != null && !couponType.isEmpty();
			case TelecomPackage.COUPON_SEGMENT__COUPON_NUMBER:
				return couponNumber != null && !couponNumber.isEmpty();
			case TelecomPackage.COUPON_SEGMENT__COUPON_VALUE_AMOUNT:
				return couponValueAmount != null && !couponValueAmount.isEmpty();
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

} //CouponSegmentImpl
