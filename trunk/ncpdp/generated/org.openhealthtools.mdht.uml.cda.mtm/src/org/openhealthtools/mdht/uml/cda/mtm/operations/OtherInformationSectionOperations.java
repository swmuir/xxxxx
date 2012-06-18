/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.operations;

import java.util.Map;

import org.eclipse.emf.common.util.BasicDiagnostic;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.DiagnosticChain;

import org.eclipse.ocl.ParserException;

import org.eclipse.ocl.ecore.Constraint;
import org.eclipse.ocl.ecore.OCL;

import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPlugin;
import org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection;

import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

import org.openhealthtools.mdht.uml.cda.operations.SectionOperations;

/**
 * <!-- begin-user-doc -->
 * A static utility class that provides operations related to '<em><b>Other Information Section</b></em>' model objects.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following operations are supported:
 * <ul>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection#validateOtherInformationSectionTemplateId(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Information Section Template Id</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection#validateOtherInformationSectionText(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Information Section Text</em>}</li>
 *   <li>{@link org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection#validateOtherInformationSectionTitle(org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Information Section Title</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class OtherInformationSectionOperations extends SectionOperations
{
  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected OtherInformationSectionOperations() {
    super();
  }

  /**
   * The cached OCL expression body for the '{@link #validateOtherInformationSectionTemplateId(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Information Section Template Id</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherInformationSectionTemplateId(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OTHER_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.444')";

  /**
   * The cached OCL invariant for the '{@link #validateOtherInformationSectionTemplateId(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Information Section Template Id</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherInformationSectionTemplateId(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OTHER_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * self.templateId->exists(id : datatypes::II | id.root = '111.222.333.444.444')
   * @param otherInformationSection The receiving '<em><b>Other Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOtherInformationSectionTemplateId(OtherInformationSection otherInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OTHER_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.OTHER_INFORMATION_SECTION);
      try
      {
        VALIDATE_OTHER_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_INFORMATION_SECTION_TEMPLATE_ID__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.OTHER_INFORMATION_SECTION__OTHER_INFORMATION_SECTION_TEMPLATE_ID,
             MtmPlugin.INSTANCE.getString("OtherInformationSectionTemplateId"),
             new Object [] { otherInformationSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOtherInformationSectionText(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Information Section Text</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherInformationSectionText(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OTHER_INFORMATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "not self.text.oclIsUndefined()";

  /**
   * The cached OCL invariant for the '{@link #validateOtherInformationSectionText(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Information Section Text</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherInformationSectionText(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OTHER_INFORMATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * not self.text.oclIsUndefined()
   * @param otherInformationSection The receiving '<em><b>Other Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOtherInformationSectionText(OtherInformationSection otherInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OTHER_INFORMATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.OTHER_INFORMATION_SECTION);
      try
      {
        VALIDATE_OTHER_INFORMATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_INFORMATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_INFORMATION_SECTION_TEXT__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.OTHER_INFORMATION_SECTION__OTHER_INFORMATION_SECTION_TEXT,
             MtmPlugin.INSTANCE.getString("OtherInformationSectionText"),
             new Object [] { otherInformationSection }));
      }
       
      return false;
    }
    return true;
  }

  /**
   * The cached OCL expression body for the '{@link #validateOtherInformationSectionTitle(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Information Section Title</em>}' operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherInformationSectionTitle(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  protected static final String VALIDATE_OTHER_INFORMATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP = "(self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())";

  /**
   * The cached OCL invariant for the '{@link #validateOtherInformationSectionTitle(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map) <em>Validate Other Information Section Title</em>}' invariant operation.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @see #validateOtherInformationSectionTitle(OtherInformationSection, org.eclipse.emf.common.util.DiagnosticChain, java.util.Map)
   * @generated
   * @ordered
   */
  
  protected static Constraint VALIDATE_OTHER_INFORMATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV;
  

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * <!-- begin-model-doc -->
   * (self.title.oclIsUndefined() or self.title.isNullFlavorUndefined()) implies (not self.title.oclIsUndefined())
   * @param otherInformationSection The receiving '<em><b>Other Information Section</b></em>' model object.
   * @param diagnostics The chain of diagnostics to which problems are to be appended.
   * @param context The cache of context-specific information.
   * <!-- end-model-doc -->
   * @generated
   */
  
  public static  boolean validateOtherInformationSectionTitle(OtherInformationSection otherInformationSection, DiagnosticChain diagnostics, Map<Object, Object> context)
  {
  	  
    if (VALIDATE_OTHER_INFORMATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV == null) {
      OCL.Helper helper = EOCL_ENV.createOCLHelper();
      helper.setContext(MtmPackage.Literals.OTHER_INFORMATION_SECTION);
      try
      {
        VALIDATE_OTHER_INFORMATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV = helper.createInvariant(VALIDATE_OTHER_INFORMATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_EXP);
      }
      catch (ParserException pe)
      {
        throw new UnsupportedOperationException(pe.getLocalizedMessage());
      }
    }
    if (!EOCL_ENV.createQuery(VALIDATE_OTHER_INFORMATION_SECTION_TITLE__DIAGNOSTIC_CHAIN_MAP__EOCL_INV).check(otherInformationSection))
    {
      if (diagnostics != null)
      {
        diagnostics.add
          (new BasicDiagnostic
            (Diagnostic.ERROR,
             MtmValidator.DIAGNOSTIC_SOURCE,
             MtmValidator.OTHER_INFORMATION_SECTION__OTHER_INFORMATION_SECTION_TITLE,
             MtmPlugin.INSTANCE.getString("OtherInformationSectionTitle"),
             new Object [] { otherInformationSection }));
      }
       
      return false;
    }
    return true;
  }

} // OtherInformationSectionOperations