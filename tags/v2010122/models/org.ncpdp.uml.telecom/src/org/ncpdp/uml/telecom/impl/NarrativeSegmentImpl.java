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
import org.ncpdp.uml.telecom.NarrativeSegment;
import org.ncpdp.uml.telecom.TelecomPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Narrative Segment</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.ncpdp.uml.telecom.impl.NarrativeSegmentImpl#getSegmentIdentification <em>Segment Identification</em>}</li>
 *   <li>{@link org.ncpdp.uml.telecom.impl.NarrativeSegmentImpl#getNarrativeMessage <em>Narrative Message</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class NarrativeSegmentImpl extends EObjectImpl implements NarrativeSegment {
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
	 * The cached value of the '{@link #getNarrativeMessage() <em>Narrative Message</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNarrativeMessage()
	 * @generated
	 * @ordered
	 */
	protected EList<Field> narrativeMessage;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected NarrativeSegmentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return TelecomPackage.Literals.NARRATIVE_SEGMENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<String> getSegmentIdentification() {
		if (segmentIdentification == null) {
			segmentIdentification = new EDataTypeUniqueEList<String>(String.class, this, TelecomPackage.NARRATIVE_SEGMENT__SEGMENT_IDENTIFICATION);
		}
		return segmentIdentification;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Field> getNarrativeMessage() {
		if (narrativeMessage == null) {
			narrativeMessage = new EObjectContainmentEList<Field>(Field.class, this, TelecomPackage.NARRATIVE_SEGMENT__NARRATIVE_MESSAGE);
		}
		return narrativeMessage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case TelecomPackage.NARRATIVE_SEGMENT__NARRATIVE_MESSAGE:
				return ((InternalEList<?>)getNarrativeMessage()).basicRemove(otherEnd, msgs);
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
			case TelecomPackage.NARRATIVE_SEGMENT__SEGMENT_IDENTIFICATION:
				return getSegmentIdentification();
			case TelecomPackage.NARRATIVE_SEGMENT__NARRATIVE_MESSAGE:
				return getNarrativeMessage();
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
			case TelecomPackage.NARRATIVE_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				getSegmentIdentification().addAll((Collection<? extends String>)newValue);
				return;
			case TelecomPackage.NARRATIVE_SEGMENT__NARRATIVE_MESSAGE:
				getNarrativeMessage().clear();
				getNarrativeMessage().addAll((Collection<? extends Field>)newValue);
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
			case TelecomPackage.NARRATIVE_SEGMENT__SEGMENT_IDENTIFICATION:
				getSegmentIdentification().clear();
				return;
			case TelecomPackage.NARRATIVE_SEGMENT__NARRATIVE_MESSAGE:
				getNarrativeMessage().clear();
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
			case TelecomPackage.NARRATIVE_SEGMENT__SEGMENT_IDENTIFICATION:
				return segmentIdentification != null && !segmentIdentification.isEmpty();
			case TelecomPackage.NARRATIVE_SEGMENT__NARRATIVE_MESSAGE:
				return narrativeMessage != null && !narrativeMessage.isEmpty();
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

} //NarrativeSegmentImpl
