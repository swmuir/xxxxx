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

import org.openhealthtools.mdht.uml.cda.mtm.Instructions;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanGoal;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanObservation;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanSection;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram;
import org.openhealthtools.mdht.uml.cda.mtm.MtmFactory;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection;
import org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationListSection;

import org.openhealthtools.mdht.uml.cda.mtm.Reminder;
import org.openhealthtools.mdht.uml.cda.mtm.util.MtmValidator;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class MtmPackageImpl extends EPackageImpl implements MtmPackage {
	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass medicationTherapyManagementProgramEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass personalMedicationListSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass medicationActivityEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass otherInformationSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass medicationActionPlanSectionEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass medicationActionPlanEncounterEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass medicationActionPlanActivityEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass medicationActionPlanObservationEClass = null;

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	private EClass medicationActionPlanGoalEClass = null;

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass reminderEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass instructionsEClass = null;

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
	private MtmPackageImpl() {
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
	public static MtmPackage init() {
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
       new EValidator.Descriptor()
       {
         public EValidator getEValidator()
         {
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
	public EClass getMedicationTherapyManagementProgram() {
    return medicationTherapyManagementProgramEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getPersonalMedicationListSection() {
    return personalMedicationListSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMedicationActivity() {
    return medicationActivityEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getOtherInformationSection() {
    return otherInformationSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMedicationActionPlanSection() {
    return medicationActionPlanSectionEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMedicationActionPlanEncounter() {
    return medicationActionPlanEncounterEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMedicationActionPlanActivity() {
    return medicationActionPlanActivityEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMedicationActionPlanObservation() {
    return medicationActionPlanObservationEClass;
  }

	/**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public EClass getMedicationActionPlanGoal() {
    return medicationActionPlanGoalEClass;
  }

	/**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getReminder()
  {
    return reminderEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getInstructions()
  {
    return instructionsEClass;
  }

  /**
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	public MtmFactory getMtmFactory() {
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
	public void createPackageContents() {
    if (isCreated) return;
    isCreated = true;

    // Create classes and their features
    medicationTherapyManagementProgramEClass = createEClass(MEDICATION_THERAPY_MANAGEMENT_PROGRAM);

    personalMedicationListSectionEClass = createEClass(PERSONAL_MEDICATION_LIST_SECTION);

    medicationActivityEClass = createEClass(MEDICATION_ACTIVITY);

    otherInformationSectionEClass = createEClass(OTHER_INFORMATION_SECTION);

    medicationActionPlanSectionEClass = createEClass(MEDICATION_ACTION_PLAN_SECTION);

    medicationActionPlanEncounterEClass = createEClass(MEDICATION_ACTION_PLAN_ENCOUNTER);

    medicationActionPlanActivityEClass = createEClass(MEDICATION_ACTION_PLAN_ACTIVITY);

    medicationActionPlanObservationEClass = createEClass(MEDICATION_ACTION_PLAN_OBSERVATION);

    medicationActionPlanGoalEClass = createEClass(MEDICATION_ACTION_PLAN_GOAL);

    reminderEClass = createEClass(REMINDER);

    instructionsEClass = createEClass(INSTRUCTIONS);
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
	public void initializePackageContents() {
    if (isInitialized) return;
    isInitialized = true;

    // Initialize package
    setName(eNAME);
    setNsPrefix(eNS_PREFIX);
    setNsURI(eNS_URI);

    // Obtain other dependent packages
    ConsolPackage theConsolPackage = (ConsolPackage)EPackage.Registry.INSTANCE.getEPackage(ConsolPackage.eNS_URI);
    CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    medicationTherapyManagementProgramEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
    personalMedicationListSectionEClass.getESuperTypes().add(theConsolPackage.getMedicationsSection());
    medicationActivityEClass.getESuperTypes().add(theConsolPackage.getMedicationActivity());
    otherInformationSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    medicationActionPlanSectionEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareSection());
    medicationActionPlanEncounterEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityEncounter());
    medicationActionPlanActivityEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityAct());
    medicationActionPlanObservationEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityObservation());
    medicationActionPlanGoalEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityObservation());
    reminderEClass.getESuperTypes().add(theConsolPackage.getInstructions());
    instructionsEClass.getESuperTypes().add(theConsolPackage.getInstructions());

    // Initialize classes and features; add operations and parameters
    initEClass(medicationTherapyManagementProgramEClass, MedicationTherapyManagementProgram.class, "MedicationTherapyManagementProgram", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    EOperation op = addEOperation(medicationTherapyManagementProgramEClass, ecorePackage.getEBoolean(), "validateMedicationTherapyManagementProgramAllergiesSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    EGenericType g1 = createEGenericType(ecorePackage.getEMap());
    EGenericType g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationTherapyManagementProgramEClass, ecorePackage.getEBoolean(), "validateMedicationTherapyManagementProgramPersonalMedicationListSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationTherapyManagementProgramEClass, ecorePackage.getEBoolean(), "validateMedicationTherapyManagementProgramOtherInformationSection", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationTherapyManagementProgramEClass, ecorePackage.getEBoolean(), "validateMedicationTherapyManagementProgramMedicationActionPlan", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(medicationTherapyManagementProgramEClass, theConsolPackage.getAllergiesSectionEntriesOptional(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationTherapyManagementProgramEClass, this.getPersonalMedicationListSection(), "getPersonalMedicationListSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationTherapyManagementProgramEClass, this.getOtherInformationSection(), "getOtherInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationTherapyManagementProgramEClass, this.getMedicationActionPlanSection(), "getMedicationActionPlan", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(personalMedicationListSectionEClass, PersonalMedicationListSection.class, "PersonalMedicationListSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(personalMedicationListSectionEClass, ecorePackage.getEBoolean(), "validatePersonalMedicationListSectionMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(personalMedicationListSectionEClass, this.getMedicationActivity(), "getmtmMedications", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(medicationActivityEClass, MedicationActivity.class, "MedicationActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityPresciber", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityIndicationEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityStopReasonEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityReminderEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityInstructionsEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityGoalsEntryRelationship", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityPrescriberAssignedPresciberPersonName", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityPrescriberAssignedPresciberAssignedPerson", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityPrescriberTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityPrescriberTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityPrescriberAssignedAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityIndicationEntryRelationshipTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityIndicationEntryRelationshipIndication", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityStopReasonEntryRelationshipStopReasonClassCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityStopReasonEntryRelationshipStopReasonNegationInd", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityStopReasonEntryRelationshipTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityReminderEntryRelationshipTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityReminderEntryRelationshipReminder", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityInstructionEntryRelationshipTypeCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityInstructionEntryRelationshipInstructions", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(otherInformationSectionEClass, OtherInformationSection.class, "OtherInformationSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(otherInformationSectionEClass, ecorePackage.getEBoolean(), "validateOtherInformationSectionTemplateId", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(otherInformationSectionEClass, ecorePackage.getEBoolean(), "validateOtherInformationSectionText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(otherInformationSectionEClass, ecorePackage.getEBoolean(), "validateOtherInformationSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(medicationActionPlanSectionEClass, MedicationActionPlanSection.class, "MedicationActionPlanSection", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(medicationActionPlanSectionEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanSectionTitle", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActionPlanSectionEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanSectionMedicationActionPlanEncounter", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(medicationActionPlanSectionEClass, this.getMedicationActionPlanEncounter(), "getMedicationActionPlanEncounters", 1, -1, IS_UNIQUE, !IS_ORDERED);

    initEClass(medicationActionPlanEncounterEClass, MedicationActionPlanEncounter.class, "MedicationActionPlanEncounter", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(medicationActionPlanEncounterEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanEncounterEffectiveTime", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActionPlanEncounterEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanEncounterText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActionPlanEncounterEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanEncounterCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActionPlanEncounterEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanEncounterCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActionPlanEncounterEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanEncounterMedicationActionPlanActivity", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActionPlanEncounterEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanEncounterMedicationActionPlanObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(medicationActionPlanEncounterEClass, this.getMedicationActionPlanActivity(), "getMedicationActionPlanActivities", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationActionPlanEncounterEClass, this.getMedicationActionPlanObservation(), "getMedicationActionPlanObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(medicationActionPlanActivityEClass, MedicationActionPlanActivity.class, "MedicationActionPlanActivity", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(medicationActionPlanActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanActivityText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActionPlanActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanActivityCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActionPlanActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanActivityCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(medicationActionPlanObservationEClass, MedicationActionPlanObservation.class, "MedicationActionPlanObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(medicationActionPlanObservationEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanObservationText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(medicationActionPlanGoalEClass, MedicationActionPlanGoal.class, "MedicationActionPlanGoal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(medicationActionPlanGoalEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanGoalMoodCode", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActionPlanGoalEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanGoalText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(reminderEClass, Reminder.class, "Reminder", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(reminderEClass, ecorePackage.getEBoolean(), "validateReminderText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    initEClass(instructionsEClass, Instructions.class, "Instructions", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(instructionsEClass, ecorePackage.getEBoolean(), "validateMtmInstructionsText", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    // Create resource
    createResource(eNS_URI);

    // Create annotations
    // http://www.openhealthtools.org/mdht/uml/cda/annotation
    createAnnotationAnnotations();
    // duplicates
    createDuplicatesAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriber
    createMtmMedicationActivityPrescriberAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciber
    createMtmMedicationActivityPrescriberAssignedPresciberAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciberPerson
    createMtmMedicationActivityPrescriberAssignedPresciberPersonAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityIndicationEntryRelationship
    createMtmMedicationActivityIndicationEntryRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReasonEntryRelationship
    createMtmMedicationActivityStopReasonEntryRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReasonEntryRelationshipStopReason
    createMtmMedicationActivityStopReasonEntryRelationshipStopReasonAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityReminderEntryRelationship
    createMtmMedicationActivityReminderEntryRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityInstructionEntryRelationship
    createMtmMedicationActivityInstructionEntryRelationshipAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityGoalsEntryRelationship
    createMtmMedicationActivityGoalsEntryRelationshipAnnotations();
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createAnnotationAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation";		
    addAnnotation
      (medicationTherapyManagementProgramEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.111",
       "constraints.validation.error", "MedicationTherapyManagementProgramTemplateId MedicationTherapyManagementProgramAllergiesSection MedicationTherapyManagementProgramPersonalMedicationListSection MedicationTherapyManagementProgramMedicationActionPlan",
       "constraints.validation.info", "MedicationTherapyManagementProgramOtherInformationSection"
       });																											
    addAnnotation
      (personalMedicationListSectionEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.333",
       "constraints.validation.error", "PersonalMedicationListSectionTemplateId PersonalMedicationListSectionMedication"
       });									
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.222",
       "constraints.validation.error", "mtmMedicationActivityTemplateId mtmMedicationActivityPresciber mtmMedicationActivityIndicationEntryRelationship mtmMedicationActivityInstructionsEntryRelationship MedicationActivityPrescriberAssignedPresciberAssignedPerson MedicationActivityPrescriberTemplateId MedicationActivityPrescriberTypeCode MedicationActivityPrescriberAssignedAuthor MedicationActivityIndicationEntryRelationshipTypeCode MedicationActivityIndicationEntryRelationshipIndication MedicationActivityStopReasonEntryRelationshipStopReasonClassCode MedicationActivityStopReasonEntryRelationshipStopReasonNegationInd MedicationActivityStopReasonEntryRelationshipTypeCode MedicationActivityReminderEntryRelationshipTypeCode MedicationActivityReminderEntryRelationshipReminder MedicationActivityInstructionEntryRelationshipTypeCode MedicationActivityInstructionEntryRelationshipInstructions MedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal",
       "constraints.validation.warning", "mtmMedicationActivityGoalsEntryRelationship MedicationActivityPrescriberAssignedPresciberPersonName",
       "constraints.validation.query", "MedicationActivityPrescriberAssignedPresciberPersonName MedicationActivityPrescriberAssignedPresciberAssignedPerson MedicationActivityPrescriberTemplateId MedicationActivityPrescriberTypeCode MedicationActivityPrescriberAssignedAuthor MedicationActivityIndicationEntryRelationshipTypeCode MedicationActivityIndicationEntryRelationshipIndication MedicationActivityStopReasonEntryRelationshipStopReasonClassCode MedicationActivityStopReasonEntryRelationshipStopReasonNegationInd MedicationActivityStopReasonEntryRelationshipTypeCode MedicationActivityReminderEntryRelationshipTypeCode MedicationActivityReminderEntryRelationshipReminder MedicationActivityInstructionEntryRelationshipTypeCode MedicationActivityInstructionEntryRelationshipInstructions MedicationActivityGoalsEntryRelationshipMedicationActionPlanGoal",
       "constraints.validation.info", "mtmMedicationActivityText mtmMedicationActivityStopReasonEntryRelationship mtmMedicationActivityReminderEntryRelationship"
       });																																																																																																							
    addAnnotation
      (otherInformationSectionEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.444",
       "constraints.validation.error", "OtherInformationSectionTemplateId OtherInformationSectionText OtherInformationSectionTitle"
       });														
    addAnnotation
      (medicationActionPlanSectionEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.555",
       "constraints.validation.error", "MedicationActionPlanSectionTemplateId MedicationActionPlanSectionTitle MedicationActionPlanSectionMedicationActionPlanEncounter"
       });													
    addAnnotation
      (medicationActionPlanEncounterEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.96",
       "constraints.validation.error", "MedicationActionPlanEncounterEffectiveTime MedicationActionPlanEncounterText MedicationActionPlanEncounterCode MedicationActionPlanEncounterMedicationActionPlanActivity",
       "code.codeSystemName", "SNOMEDCT",
       "constraints.validation.warning", "MedicationActionPlanEncounterCodeP",
       "constraints.validation.info", "MedicationActionPlanEncounterMedicationActionPlanObservation"
       });																														
    addAnnotation
      (medicationActionPlanActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.dependOn.MedicationActionPlanActivityCode", "MedicationActionPlanActivityCodeP",
       "code.codeSystem", "2.16.840.1.113883.6.96",
       "templateId.root", "111.222.333.444.666",
       "constraints.validation.error", "MedicationActionPlanActivityTemplateId PlanOfCareActivityActMoodCode MedicationActionPlanActivityText MedicationActionPlanActivityCode",
       "code.codeSystemName", "SNOMEDCT",
       "constraints.validation.warning", "MedicationActionPlanActivityCodeP",
       "moodCode", "INT"
       });															
    addAnnotation
      (medicationActionPlanObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "MedicationActionPlanObservationText"
       });						
    addAnnotation
      (medicationActionPlanGoalEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "PlanOfCareActivityObservationMoodCode MedicationActionPlanGoalMoodCode MedicationActionPlanGoalText",
       "moodCode", "GOL"
       });											
    addAnnotation
      (reminderEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.222.1",
       "constraints.validation.error", "ReminderTemplateId ReminderText"
       });							
    addAnnotation
      (instructionsEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.222.2",
       "constraints.validation.error", "mtmInstructionsTemplateId mtmInstructionsText"
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
      (medicationTherapyManagementProgramEClass, 
       source, 
       new String[] 
       {
       });																											
    addAnnotation
      (personalMedicationListSectionEClass, 
       source, 
       new String[] 
       {
       });																																																																																																																												
    addAnnotation
      (medicationActionPlanSectionEClass, 
       source, 
       new String[] 
       {
       });																																										
    addAnnotation
      (medicationActionPlanActivityEClass, 
       source, 
       new String[] 
       {
       });																				
    addAnnotation
      (medicationActionPlanGoalEClass, 
       source, 
       new String[] 
       {
       });											
    addAnnotation
      (reminderEClass, 
       source, 
       new String[] 
       {
       });							
    addAnnotation
      (instructionsEClass, 
       source, 
       new String[] 
       {
       });				
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriber</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createMtmMedicationActivityPrescriberAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriber";																																					
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "null",
       "constraints.validation.error", "PrescriberTemplateId PrescriberTypeCode PrescriberAssignedAuthor",
       "typeCode", "AUT"
       });																																																																																																																																																																																																			
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciber</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createMtmMedicationActivityPrescriberAssignedPresciberAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciber";																																						
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AssignedPresciberAssignedPerson"
       });																																																																																																																																																																																																		
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciberPerson</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createMtmMedicationActivityPrescriberAssignedPresciberPersonAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciberPerson";																																							
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.warning", "PersonName"
       });																																																																																																																																																																																																	
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityIndicationEntryRelationship</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createMtmMedicationActivityIndicationEntryRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityIndicationEntryRelationship";																																								
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "IndicationEntryRelationshipTypeCode IndicationEntryRelationshipIndication",
       "typeCode", "RSON"
       });																																																																																																																																																																																																
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReasonEntryRelationship</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createMtmMedicationActivityStopReasonEntryRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReasonEntryRelationship";																																									
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "StopReasonEntryRelationshipTypeCode",
       "typeCode", "RSON"
       });																																																																																																																																																																																															
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReasonEntryRelationshipStopReason</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createMtmMedicationActivityStopReasonEntryRelationshipStopReasonAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReasonEntryRelationshipStopReason";																																										
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "StopReasonClassCode StopReasonNegationInd",
       "classCode", "ACT",
       "moodCode", "EVN",
       "negationInd", "true"
       });																																																																																																																																																																																														
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityReminderEntryRelationship</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createMtmMedicationActivityReminderEntryRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityReminderEntryRelationship";																																											
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ReminderEntryRelationshipTypeCode ReminderEntryRelationshipReminder",
       "typeCode", "SPRT"
       });																																																																																																																																																																																													
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityInstructionEntryRelationship</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createMtmMedicationActivityInstructionEntryRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityInstructionEntryRelationship";																																												
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "InstructionEntryRelationshipTypeCode InstructionEntryRelationshipInstructions",
       "typeCode", "SUBJ"
       });																																																																																																																																																																																												
  }

	/**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityGoalsEntryRelationship</b>.
   * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
   * @generated
   */
	protected void createMtmMedicationActivityGoalsEntryRelationshipAnnotations() {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityGoalsEntryRelationship";																																													
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "GoalsEntryRelationshipMedicationActionPlanGoal"
       });																																																																																																																																																																																											
  }

} //MtmPackageImpl
