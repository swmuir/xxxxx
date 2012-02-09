/**
 * <copyright>
 * </copyright>
 *
 * $Id$
 */
package org.openhealthtools.mdht.uml.cda.mtm.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EGenericType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

import org.openhealthtools.mdht.uml.cda.CDAPackage;

import org.openhealthtools.mdht.uml.cda.consol.ConsolPackage;
import org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MTMMedicationSection;
import org.openhealthtools.mdht.uml.cda.mtm.MtmFactory;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;

import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MtmPackageImpl extends EPackageImpl implements MtmPackage
{
  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private EClass mtmEClass = null;

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtmMedicationSectionEClass = null;
		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass mtmMedicationActivityEClass = null;

		/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.openhealthtools.mdht.uml.cda.mtm.MtmPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
  private MtmPackageImpl()
  {
		super(eNS_URI, MtmFactory.eINSTANCE);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private static boolean isInited = false;

  /**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link MtmPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
  public static MtmPackage init()
  {
		if (isInited) return (MtmPackage)EPackage.Registry.INSTANCE.getEPackage(MtmPackage.eNS_URI);

		// Obtain or create and register package
		MtmPackageImpl theMtmPackage = (MtmPackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof MtmPackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new MtmPackageImpl());

		isInited = true;

		// Initialize simple dependencies
		ConsolPackage.eINSTANCE.eClass();

		// Create package meta-data objects
		theMtmPackage.createPackageContents();

		// Initialize created meta-data
		theMtmPackage.initializePackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theMtmPackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return MtmValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theMtmPackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(MtmPackage.eNS_URI, theMtmPackage);
		return theMtmPackage;
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public EClass getMTM()
  {
		return mtmEClass;
	}

  /**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTMMedicationSection() {
		return mtmMedicationSectionEClass;
	}

		/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getMTMMedicationActivity() {
		return mtmMedicationActivityEClass;
	}

		/**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public MtmFactory getMtmFactory()
  {
		return (MtmFactory)getEFactoryInstance();
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isCreated = false;

  /**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void createPackageContents()
  {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		mtmEClass = createEClass(MTM);

		mtmMedicationSectionEClass = createEClass(MTM_MEDICATION_SECTION);

		mtmMedicationActivityEClass = createEClass(MTM_MEDICATION_ACTIVITY);
	}

  /**
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  private boolean isInitialized = false;

  /**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  public void initializePackageContents()
  {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		ConsolPackage theConsolPackage = (ConsolPackage)EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		mtmEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
		mtmMedicationSectionEClass.getESuperTypes().add(theConsolPackage.getMedicationsSection());
		mtmMedicationActivityEClass.getESuperTypes().add(theConsolPackage.getMedicationActivity());

		// Initialize classes and features; add operations and parameters
		initEClass(mtmEClass, org.openhealthtools.mdht.uml.cda.mtm.MTM.class, "MTM", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = addEOperation(mtmEClass, ecorePackage.getEBoolean(), "validateMTMAllergiesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		EGenericType g1 = createEGenericType(ecorePackage.getEMap());
		EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mtmEClass, ecorePackage.getEBoolean(), "validateMTMMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mtmEClass, theConsolPackage.getAllergiesSection(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(mtmEClass, this.getMTMMedicationSection(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

		initEClass(mtmMedicationSectionEClass, MTMMedicationSection.class, "MTMMedicationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(mtmMedicationSectionEClass, ecorePackage.getEBoolean(), "validateMTMMedicationSectionMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mtmMedicationSectionEClass, this.getMTMMedicationActivity(), "getmtmMedications", 1, -1, IS_UNIQUE, !IS_ORDERED);

		initEClass(mtmMedicationActivityEClass, MTMMedicationActivity.class, "MTMMedicationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		op = addEOperation(mtmMedicationActivityEClass, ecorePackage.getEBoolean(), "validateMTMMedicationActivityText", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mtmMedicationActivityEClass, ecorePackage.getEBoolean(), "validateMTMMedicationActivityIndication", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mtmMedicationActivityEClass, ecorePackage.getEBoolean(), "validateMTMMedicationActivityInstructions", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mtmMedicationActivityEClass, ecorePackage.getEBoolean(), "validateMTMMedicationActivityAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = addEOperation(mtmMedicationActivityEClass, ecorePackage.getEBoolean(), "validateMTMMedicationActivityComment", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
		g1 = createEGenericType(ecorePackage.getEMap());
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		g2 = createEGenericType(ecorePackage.getEJavaObject());
		g1.getETypeArguments().add(g2);
		addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(mtmMedicationActivityEClass, theConsolPackage.getIndication(), "getmtmIndications", 1, -1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(mtmMedicationActivityEClass, theConsolPackage.getInstructions(), "getmtmInstructions", 1, 1, IS_UNIQUE, !IS_ORDERED);

		addEOperation(mtmMedicationActivityEClass, theConsolPackage.getComment(), "getComment", 1, 1, IS_UNIQUE, !IS_ORDERED);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http://www.openhealthtools.org/mdht/uml/cda/annotation
		createAnnotationAnnotations();
		// duplicates
		createDuplicatesAnnotations();
	}

  /**
	 * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
	 * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
	 * @generated
	 */
  protected void createAnnotationAnnotations()
  {
		String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";		
		addAnnotation
		  (mtmEClass, 
		   source, 
		   new String[] {
			 "templateId.root", "",
			 "constraints.validation.error", "MTMTemplateId MTMAllergiesSection MTMMedicationsSection"
		   });															
		addAnnotation
		  (mtmMedicationSectionEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "MTMMedicationSectionMedication"
		   });								
		addAnnotation
		  (mtmMedicationActivityEClass, 
		   source, 
		   new String[] {
			 "constraints.validation.error", "MTMMedicationActivityIndication MTMMedicationActivityInstructions MTMMedicationActivityAuthor",
			 "constraints.validation.warning", "MTMMedicationActivityText",
			 "constraints.validation.info", "MTMMedicationActivityComment"
		   });																										
	}

		/**
	 * Initializes the annotations for <b>duplicates</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createDuplicatesAnnotations() {
		String source = "duplicates";			
		addAnnotation
		  (mtmEClass, 
		   source, 
		   new String[] {
		   });																																														
	}

} //MtmPackageImpl
