/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.ncpdp.uml.telecom;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

import org.ncpdp.uml.ECL.CouponType;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Coupon Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.CouponSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CouponSegment#getCouponType <em>Coupon Type</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CouponSegment#getCouponNumber <em>Coupon Number</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CouponSegment#getCouponValueAmount <em>Coupon Value Amount</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getCouponSegment()
 * @model
 * @generated
 */
public interface CouponSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCouponSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Coupon Type</b></em>' attribute list.
	 * The list contents are of type {@link org.ncpdp.uml.ECL.CouponType}.
	 * The literals are from the enumeration {@link org.ncpdp.uml.ECL.CouponType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coupon Type</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coupon Type</em>' attribute list.
	 * @see org.ncpdp.uml.ECL.CouponType
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCouponSegment_CouponType()
	 * @model ordered="false"
	 * @generated
	 */
	EList<CouponType> getCouponType();

	/**
	 * Returns the value of the '<em><b>Coupon Number</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coupon Number</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coupon Number</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCouponSegment_CouponNumber()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCouponNumber();

	/**
	 * Returns the value of the '<em><b>Coupon Value Amount</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Coupon Value Amount</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Coupon Value Amount</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCouponSegment_CouponValueAmount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCouponValueAmount();

} // CouponSegment
