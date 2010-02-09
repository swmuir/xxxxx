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
 * A representation of the model object '<em><b>Compound Segment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.CompoundSegment#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundDosageFormDescriptionCode <em>Compound Dosage Form Description Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundDispensingUnitFormIndicator <em>Compound Dispensing Unit Form Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientComponentCount <em>Compound Ingredient Component Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundProductIdQualifier <em>Compound Product Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundProductId <em>Compound Product Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientQuantity <em>Compound Ingredient Quantity</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientDrugCost <em>Compound Ingredient Drug Cost</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientBasisOfCostDetermination <em>Compound Ingredient Basis Of Cost Determination</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientModifierCodeCount <em>Compound Ingredient Modifier Code Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.CompoundSegment#getCompoundIngredientModifierCode <em>Compound Ingredient Modifier Code</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment()
 * @model annotation="http://www.ncpdp.org/uml/telecom/annotation segmentIdentification='111-AM' compoundDosageFormDescriptionCode.field='450-EF' compoundDispensingUnitFormIndicator.field='451-EG' compoundIngredientComponentCount.field='447-EC ' compoundProductIdQualifier.field='488-RE' compoundProductId.field='489-TE' compoundIngredientQuantity.field='448-ED ' compoundIngredientDrugCost.field='449-EE' compoundIngredientBasisOfCostDetermination.field='490-UE' compoundIngredientModifierCodeCount.field='362-2G' compoundIngredientModifierCode.field='363-2H'"
 * @generated
 */
public interface CompoundSegment extends EObject {
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
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment_SegmentIdentification()
	 * @model ordered="false"
	 *        extendedMetaData="name='Id'"
	 * @generated
	 */
	EList<String> getSegmentIdentification();

	/**
	 * Returns the value of the '<em><b>Compound Dosage Form Description Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Dosage Form Description Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Dosage Form Description Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment_CompoundDosageFormDescriptionCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCompoundDosageFormDescriptionCode();

	/**
	 * Returns the value of the '<em><b>Compound Dispensing Unit Form Indicator</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Dispensing Unit Form Indicator</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Dispensing Unit Form Indicator</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment_CompoundDispensingUnitFormIndicator()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCompoundDispensingUnitFormIndicator();

	/**
	 * Returns the value of the '<em><b>Compound Ingredient Component Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Ingredient Component Count</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Ingredient Component Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment_CompoundIngredientComponentCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCompoundIngredientComponentCount();

	/**
	 * Returns the value of the '<em><b>Compound Product Id Qualifier</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Product Id Qualifier</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Product Id Qualifier</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment_CompoundProductIdQualifier()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCompoundProductIdQualifier();

	/**
	 * Returns the value of the '<em><b>Compound Product Id</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Product Id</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Product Id</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment_CompoundProductId()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCompoundProductId();

	/**
	 * Returns the value of the '<em><b>Compound Ingredient Quantity</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Ingredient Quantity</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Ingredient Quantity</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment_CompoundIngredientQuantity()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCompoundIngredientQuantity();

	/**
	 * Returns the value of the '<em><b>Compound Ingredient Drug Cost</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Ingredient Drug Cost</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Ingredient Drug Cost</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment_CompoundIngredientDrugCost()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCompoundIngredientDrugCost();

	/**
	 * Returns the value of the '<em><b>Compound Ingredient Basis Of Cost Determination</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Ingredient Basis Of Cost Determination</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Ingredient Basis Of Cost Determination</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment_CompoundIngredientBasisOfCostDetermination()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCompoundIngredientBasisOfCostDetermination();

	/**
	 * Returns the value of the '<em><b>Compound Ingredient Modifier Code Count</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Ingredient Modifier Code Count</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Ingredient Modifier Code Count</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment_CompoundIngredientModifierCodeCount()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCompoundIngredientModifierCodeCount();

	/**
	 * Returns the value of the '<em><b>Compound Ingredient Modifier Code</b></em>' containment reference list.
	 * The list contents are of type {@link org.ncpdp.uml.telecom.Field}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Compound Ingredient Modifier Code</em>' attribute list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Compound Ingredient Modifier Code</em>' containment reference list.
	 * @see org.ncpdp.uml.telecom.TelecomPackage#getCompoundSegment_CompoundIngredientModifierCode()
	 * @model containment="true" ordered="false"
	 *        extendedMetaData="name='element'"
	 * @generated
	 */
	EList<Field> getCompoundIngredientModifierCode();

} // CompoundSegment
