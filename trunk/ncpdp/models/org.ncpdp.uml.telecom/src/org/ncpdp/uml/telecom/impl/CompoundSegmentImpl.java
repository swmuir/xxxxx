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

import org.ncpdp.uml.telecom.CompoundSegment;
import org.ncpdp.uml.telecom.Field;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Compound Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl#getCompoundDosageFormDescriptionCode <em>Compound Dosage Form Description Code</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl#getCompoundDispensingUnitFormIndicator <em>Compound Dispensing Unit Form Indicator</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl#getCompoundIngredientComponentCount <em>Compound Ingredient Component Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl#getCompoundProductIdQualifier <em>Compound Product Id Qualifier</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl#getCompoundProductId <em>Compound Product Id</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl#getCompoundIngredientQuantity <em>Compound Ingredient Quantity</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl#getCompoundIngredientDrugCost <em>Compound Ingredient Drug Cost</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl#getCompoundIngredientBasisOfCostDetermination <em>Compound Ingredient Basis Of Cost Determination</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl#getCompoundIngredientModifierCodeCount <em>Compound Ingredient Modifier Code Count</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.CompoundSegmentImpl#getCompoundIngredientModifierCode <em>Compound Ingredient Modifier Code</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class CompoundSegmentImpl extends EObjectImpl implements CompoundSegment {
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
	 * The cached value of the '{@link #getCompoundDosageFormDescriptionCode() <em>Compound Dosage Form Description Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundDosageFormDescriptionCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundDosageFormDescriptionCode;

	/**
	 * The cached value of the '{@link #getCompoundDispensingUnitFormIndicator() <em>Compound Dispensing Unit Form Indicator</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundDispensingUnitFormIndicator()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundDispensingUnitFormIndicator;

	/**
	 * The cached value of the '{@link #getCompoundIngredientComponentCount() <em>Compound Ingredient Component Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundIngredientComponentCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundIngredientComponentCount;

	/**
	 * The cached value of the '{@link #getCompoundProductIdQualifier() <em>Compound Product Id Qualifier</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundProductIdQualifier()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundProductIdQualifier;

	/**
	 * The cached value of the '{@link #getCompoundProductId() <em>Compound Product Id</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundProductId()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundProductId;

	/**
	 * The cached value of the '{@link #getCompoundIngredientQuantity() <em>Compound Ingredient Quantity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundIngredientQuantity()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundIngredientQuantity;

	/**
	 * The cached value of the '{@link #getCompoundIngredientDrugCost() <em>Compound Ingredient Drug Cost</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundIngredientDrugCost()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundIngredientDrugCost;

	/**
	 * The cached value of the '{@link #getCompoundIngredientBasisOfCostDetermination() <em>Compound Ingredient Basis Of Cost Determination</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundIngredientBasisOfCostDetermination()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundIngredientBasisOfCostDetermination;

	/**
	 * The cached value of the '{@link #getCompoundIngredientModifierCodeCount() <em>Compound Ingredient Modifier Code Count</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundIngredientModifierCodeCount()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundIngredientModifierCodeCount;

	/**
	 * The cached value of the '{@link #getCompoundIngredientModifierCode() <em>Compound Ingredient Modifier Code</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCompoundIngredientModifierCode()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> compoundIngredientModifierCode;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CompoundSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.COMPOUND_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.COMPOUND_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundDosageFormDescriptionCode() {
		if (compoundDosageFormDescriptionCode == null) {
			compoundDosageFormDescriptionCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DOSAGE_FORM_DESCRIPTION_CODE);
		}
		return compoundDosageFormDescriptionCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundDispensingUnitFormIndicator() {
		if (compoundDispensingUnitFormIndicator == null) {
			compoundDispensingUnitFormIndicator = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DISPENSING_UNIT_FORM_INDICATOR);
		}
		return compoundDispensingUnitFormIndicator;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundIngredientComponentCount() {
		if (compoundIngredientComponentCount == null) {
			compoundIngredientComponentCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_COMPONENT_COUNT);
		}
		return compoundIngredientComponentCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundProductIdQualifier() {
		if (compoundProductIdQualifier == null) {
			compoundProductIdQualifier = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID_QUALIFIER);
		}
		return compoundProductIdQualifier;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundProductId() {
		if (compoundProductId == null) {
			compoundProductId = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID);
		}
		return compoundProductId;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundIngredientQuantity() {
		if (compoundIngredientQuantity == null) {
			compoundIngredientQuantity = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_QUANTITY);
		}
		return compoundIngredientQuantity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundIngredientDrugCost() {
		if (compoundIngredientDrugCost == null) {
			compoundIngredientDrugCost = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_DRUG_COST);
		}
		return compoundIngredientDrugCost;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundIngredientBasisOfCostDetermination() {
		if (compoundIngredientBasisOfCostDetermination == null) {
			compoundIngredientBasisOfCostDetermination = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_BASIS_OF_COST_DETERMINATION);
		}
		return compoundIngredientBasisOfCostDetermination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundIngredientModifierCodeCount() {
		if (compoundIngredientModifierCodeCount == null) {
			compoundIngredientModifierCodeCount = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE_COUNT);
		}
		return compoundIngredientModifierCodeCount;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getCompoundIngredientModifierCode() {
		if (compoundIngredientModifierCode == null) {
			compoundIngredientModifierCode = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE);
		}
		return compoundIngredientModifierCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DOSAGE_FORM_DESCRIPTION_CODE:
				return ((InternalEList<?>)getCompoundDosageFormDescriptionCode()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DISPENSING_UNIT_FORM_INDICATOR:
				return ((InternalEList<?>)getCompoundDispensingUnitFormIndicator()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_COMPONENT_COUNT:
				return ((InternalEList<?>)getCompoundIngredientComponentCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID_QUALIFIER:
				return ((InternalEList<?>)getCompoundProductIdQualifier()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID:
				return ((InternalEList<?>)getCompoundProductId()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_QUANTITY:
				return ((InternalEList<?>)getCompoundIngredientQuantity()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_DRUG_COST:
				return ((InternalEList<?>)getCompoundIngredientDrugCost()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_BASIS_OF_COST_DETERMINATION:
				return ((InternalEList<?>)getCompoundIngredientBasisOfCostDetermination()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE_COUNT:
				return ((InternalEList<?>)getCompoundIngredientModifierCodeCount()).basicRemove(otherEnd, msgs);
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE:
				return ((InternalEList<?>)getCompoundIngredientModifierCode()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.COMPOUND_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DOSAGE_FORM_DESCRIPTION_CODE:
				return getCompoundDosageFormDescriptionCode();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DISPENSING_UNIT_FORM_INDICATOR:
				return getCompoundDispensingUnitFormIndicator();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_COMPONENT_COUNT:
				return getCompoundIngredientComponentCount();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID_QUALIFIER:
				return getCompoundProductIdQualifier();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID:
				return getCompoundProductId();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_QUANTITY:
				return getCompoundIngredientQuantity();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_DRUG_COST:
				return getCompoundIngredientDrugCost();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_BASIS_OF_COST_DETERMINATION:
				return getCompoundIngredientBasisOfCostDetermination();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE_COUNT:
				return getCompoundIngredientModifierCodeCount();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE:
				return getCompoundIngredientModifierCode();
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
			case TelecomPackage.COMPOUND_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DOSAGE_FORM_DESCRIPTION_CODE:
				getCompoundDosageFormDescriptionCode().clear();
				getCompoundDosageFormDescriptionCode().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DISPENSING_UNIT_FORM_INDICATOR:
				getCompoundDispensingUnitFormIndicator().clear();
				getCompoundDispensingUnitFormIndicator().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_COMPONENT_COUNT:
				getCompoundIngredientComponentCount().clear();
				getCompoundIngredientComponentCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID_QUALIFIER:
				getCompoundProductIdQualifier().clear();
				getCompoundProductIdQualifier().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID:
				getCompoundProductId().clear();
				getCompoundProductId().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_QUANTITY:
				getCompoundIngredientQuantity().clear();
				getCompoundIngredientQuantity().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_DRUG_COST:
				getCompoundIngredientDrugCost().clear();
				getCompoundIngredientDrugCost().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_BASIS_OF_COST_DETERMINATION:
				getCompoundIngredientBasisOfCostDetermination().clear();
				getCompoundIngredientBasisOfCostDetermination().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE_COUNT:
				getCompoundIngredientModifierCodeCount().clear();
				getCompoundIngredientModifierCodeCount().addAll((Collection<? extends Field>)newValue);
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE:
				getCompoundIngredientModifierCode().clear();
				getCompoundIngredientModifierCode().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.COMPOUND_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DOSAGE_FORM_DESCRIPTION_CODE:
				getCompoundDosageFormDescriptionCode().clear();
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DISPENSING_UNIT_FORM_INDICATOR:
				getCompoundDispensingUnitFormIndicator().clear();
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_COMPONENT_COUNT:
				getCompoundIngredientComponentCount().clear();
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID_QUALIFIER:
				getCompoundProductIdQualifier().clear();
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID:
				getCompoundProductId().clear();
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_QUANTITY:
				getCompoundIngredientQuantity().clear();
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_DRUG_COST:
				getCompoundIngredientDrugCost().clear();
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_BASIS_OF_COST_DETERMINATION:
				getCompoundIngredientBasisOfCostDetermination().clear();
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE_COUNT:
				getCompoundIngredientModifierCodeCount().clear();
				return;
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE:
				getCompoundIngredientModifierCode().clear();
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
			case TelecomPackage.COMPOUND_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DOSAGE_FORM_DESCRIPTION_CODE:
				return compoundDosageFormDescriptionCode != null && !compoundDosageFormDescriptionCode.isEmpty();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_DISPENSING_UNIT_FORM_INDICATOR:
				return compoundDispensingUnitFormIndicator != null && !compoundDispensingUnitFormIndicator.isEmpty();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_COMPONENT_COUNT:
				return compoundIngredientComponentCount != null && !compoundIngredientComponentCount.isEmpty();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID_QUALIFIER:
				return compoundProductIdQualifier != null && !compoundProductIdQualifier.isEmpty();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_PRODUCT_ID:
				return compoundProductId != null && !compoundProductId.isEmpty();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_QUANTITY:
				return compoundIngredientQuantity != null && !compoundIngredientQuantity.isEmpty();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_DRUG_COST:
				return compoundIngredientDrugCost != null && !compoundIngredientDrugCost.isEmpty();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_BASIS_OF_COST_DETERMINATION:
				return compoundIngredientBasisOfCostDetermination != null && !compoundIngredientBasisOfCostDetermination.isEmpty();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE_COUNT:
				return compoundIngredientModifierCodeCount != null && !compoundIngredientModifierCodeCount.isEmpty();
			case TelecomPackage.COMPOUND_SEGMENT__COMPOUND_INGREDIENT_MODIFIER_CODE:
				return compoundIngredientModifierCode != null && !compoundIngredientModifierCode.isEmpty();
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

} //CompoundSegmentImpl
