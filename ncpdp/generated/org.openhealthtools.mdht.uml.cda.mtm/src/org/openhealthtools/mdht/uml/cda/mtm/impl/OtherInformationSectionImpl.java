/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.impl;

import java.util.Map;

import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.emf.ecore.EClass;

import org.openhealthtools.mdht.uml.cda.impl.SectionImpl;

import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection;

import org.openhealthtools.mdht.uml.cda.mtm.operations.OtherInformationSectionOperations;

import org.openhealthtools.mdht.uml.cda.util.CDAUtil;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Other Information Section</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * </p>
 *
 * @generated
 */
public class OtherInformationSectionImpl extends SectionImpl implements OtherInformationSection
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OtherInformationSectionImpl()
  {
    super();
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  @Override
  protected EClass eStaticClass()
  {
    return MtmPackage.Literals.OTHER_INFORMATION_SECTION;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherInformationSectionTemplateId(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherInformationSectionOperations.validateOtherInformationSectionTemplateId(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherInformationSectionText(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherInformationSectionOperations.validateOtherInformationSectionText(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public boolean validateOtherInformationSectionTitle(DiagnosticChain diagnostics, Map<Object, Object> context)
  {
    return OtherInformationSectionOperations.validateOtherInformationSectionTitle(this, diagnostics, context);
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public OtherInformationSection init() {
    	CDAUtil.init(this);
    	return this;
  }
} //OtherInformationSectionImpl
