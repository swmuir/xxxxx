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

import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlan;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanEncounter;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanGoal;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActionPlanObservation;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationActivity;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationSection;
import org.openhealthtools.mdht.uml.cda.mtm.MedicationTherapyManagementProgram;
import org.openhealthtools.mdht.uml.cda.mtm.MtmFactory;
import org.openhealthtools.mdht.uml.cda.mtm.MtmPackage;
import org.openhealthtools.mdht.uml.cda.mtm.OtherInformationSection;

import org.openhealthtools.mdht.uml.cda.mtm.PersonalMedicationList;
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
  private EClass medicationTherapyManagementProgramEClass = null;

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  private EClass personalMedicationListEClass = null;

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
  private EClass medicationActionPlanGoalEClass = null;

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
  private EClass medicationActionPlanEClass = null;

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
  public EClass getMedicationTherapyManagementProgram()
  {
    return medicationTherapyManagementProgramEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getPersonalMedicationList()
  {
    return personalMedicationListEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMedicationActivity()
  {
    return medicationActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMedicationActionPlanGoal()
  {
    return medicationActionPlanGoalEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getOtherInformationSection()
  {
    return otherInformationSectionEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMedicationActionPlan()
  {
    return medicationActionPlanEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMedicationActionPlanEncounter()
  {
    return medicationActionPlanEncounterEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMedicationActionPlanActivity()
  {
    return medicationActionPlanActivityEClass;
  }

  /**
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  public EClass getMedicationActionPlanObservation()
  {
    return medicationActionPlanObservationEClass;
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
    medicationTherapyManagementProgramEClass = createEClass(MEDICATION_THERAPY_MANAGEMENT_PROGRAM);

    personalMedicationListEClass = createEClass(PERSONAL_MEDICATION_LIST);

    medicationActivityEClass = createEClass(MEDICATION_ACTIVITY);

    medicationActionPlanGoalEClass = createEClass(MEDICATION_ACTION_PLAN_GOAL);

    otherInformationSectionEClass = createEClass(OTHER_INFORMATION_SECTION);

    medicationActionPlanEClass = createEClass(MEDICATION_ACTION_PLAN);

    medicationActionPlanEncounterEClass = createEClass(MEDICATION_ACTION_PLAN_ENCOUNTER);

    medicationActionPlanActivityEClass = createEClass(MEDICATION_ACTION_PLAN_ACTIVITY);

    medicationActionPlanObservationEClass = createEClass(MEDICATION_ACTION_PLAN_OBSERVATION);
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
    CDAPackage theCDAPackage = (CDAPackage)EPackage.Registry.INSTANCE.getEPackage(CDAPackage.eNS_URI);

    // Create type parameters

    // Set bounds for type parameters

    // Add supertypes to classes
    medicationTherapyManagementProgramEClass.getESuperTypes().add(theConsolPackage.getGeneralHeaderConstraints());
    personalMedicationListEClass.getESuperTypes().add(theConsolPackage.getMedicationsSection());
    medicationActivityEClass.getESuperTypes().add(theConsolPackage.getMedicationActivity());
    medicationActionPlanGoalEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityObservation());
    otherInformationSectionEClass.getESuperTypes().add(theCDAPackage.getSection());
    medicationActionPlanEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareSection());
    medicationActionPlanEncounterEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityEncounter());
    medicationActionPlanActivityEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityAct());
    medicationActionPlanObservationEClass.getESuperTypes().add(theConsolPackage.getPlanOfCareActivityObservation());

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

    op = addEOperation(medicationTherapyManagementProgramEClass, ecorePackage.getEBoolean(), "validateMedicationTherapyManagementProgramMedicationsSection", 0, 1, IS_UNIQUE, IS_ORDERED);
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

    op = addEOperation(medicationTherapyManagementProgramEClass, ecorePackage.getEBoolean(), "validateMedicationTherapyManagementProgramAuthor", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(medicationTherapyManagementProgramEClass, theConsolPackage.getAllergiesSectionEntriesOptional(), "getAllergiesSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationTherapyManagementProgramEClass, this.getPersonalMedicationList(), "getMedicationsSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationTherapyManagementProgramEClass, this.getOtherInformationSection(), "getOtherInformationSection", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationTherapyManagementProgramEClass, this.getMedicationActionPlan(), "getMedicationActionPlan", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(personalMedicationListEClass, PersonalMedicationList.class, "PersonalMedicationList", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(personalMedicationListEClass, ecorePackage.getEBoolean(), "validatePersonalMedicationListMedication", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(personalMedicationListEClass, this.getMedicationActivity(), "getmtmMedications", 1, -1, IS_UNIQUE, !IS_ORDERED);

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

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityIndication", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityInstructions", 0, 1, IS_UNIQUE, IS_ORDERED);
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

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityGoals", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityReminders", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActivityEClass, ecorePackage.getEBoolean(), "validateMtmMedicationActivityStopReason", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(medicationActivityEClass, theConsolPackage.getIndication(), "getmtmIndications", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationActivityEClass, null, "getmtmInstructions", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationActivityEClass, this.getMedicationActionPlanGoal(), "getGoalss", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationActivityEClass, null, "getReminders", 1, 1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationActivityEClass, theCDAPackage.getAct(), "getStopReason", 1, 1, IS_UNIQUE, !IS_ORDERED);

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

    initEClass(medicationActionPlanEClass, MedicationActionPlan.class, "MedicationActionPlan", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(medicationActionPlanEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanMedicationActionPlanEncounter", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(medicationActionPlanEClass, this.getMedicationActionPlanEncounter(), "getMedicationActionPlanEncounters", 1, -1, IS_UNIQUE, !IS_ORDERED);

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

    op = addEOperation(medicationActionPlanEncounterEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanEncounterCodeP", 0, 1, IS_UNIQUE, IS_ORDERED);
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

    addEOperation(medicationActionPlanEncounterEClass, this.getMedicationActionPlanObservation(), "getMedicationActionPlanObservations", 1, -1, IS_UNIQUE, !IS_ORDERED);

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

    op = addEOperation(medicationActionPlanActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanActivityMedicationActionPlanGoal", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    op = addEOperation(medicationActionPlanActivityEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanActivityMedicationActionPlanObservation", 0, 1, IS_UNIQUE, IS_ORDERED);
    addEParameter(op, ecorePackage.getEDiagnosticChain(), "diagnostics", 0, 1, IS_UNIQUE, IS_ORDERED);
    g1 = createEGenericType(ecorePackage.getEMap());
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    g2 = createEGenericType(ecorePackage.getEJavaObject());
    g1.getETypeArguments().add(g2);
    addEParameter(op, g1, "context", 0, 1, IS_UNIQUE, IS_ORDERED);

    addEOperation(medicationActionPlanActivityEClass, this.getMedicationActionPlanGoal(), "getMedicationActionPlanGoals", 1, -1, IS_UNIQUE, !IS_ORDERED);

    addEOperation(medicationActionPlanActivityEClass, this.getMedicationActionPlanObservation(), "getMedicationActionPlanObservation", 1, 1, IS_UNIQUE, !IS_ORDERED);

    initEClass(medicationActionPlanObservationEClass, MedicationActionPlanObservation.class, "MedicationActionPlanObservation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

    op = addEOperation(medicationActionPlanObservationEClass, ecorePackage.getEBoolean(), "validateMedicationActionPlanObservationText", 0, 1, IS_UNIQUE, IS_ORDERED);
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
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationTherapyManagementProgramAuthor
    createMtmMedicationTherapyManagementProgramAuthorAnnotations();
    // duplicates
    createDuplicatesAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriber
    createMtmMedicationActivityPrescriberAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciber
    createMtmMedicationActivityPrescriberAssignedPresciberAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriberAssignedPresciberPerson
    createMtmMedicationActivityPrescriberAssignedPresciberPersonAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityReminder
    createMtmMedicationActivityReminderAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityInstruction
    createMtmMedicationActivityInstructionAnnotations();
    // http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReason
    createMtmMedicationActivityStopReasonAnnotations();
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
      (medicationTherapyManagementProgramEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.111",
       "constraints.validation.error", "MedicationTherapyManagementProgramTemplateId MedicationTherapyManagementProgramAllergiesSection MedicationTherapyManagementProgramMedicationsSection MedicationTherapyManagementProgramMedicationActionPlan MedicationTherapyManagementProgramAuthor",
       "constraints.validation.info", "MedicationTherapyManagementProgramOtherInformationSection"
       });																																
    addAnnotation
      (personalMedicationListEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.333",
       "constraints.validation.error", "PersonalMedicationListTemplateId PersonalMedicationListMedication"
       });									
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.222",
       "constraints.validation.error", "mtmMedicationActivityTemplateId mtmMedicationActivityIndication mtmMedicationActivityInstructions mtmMedicationActivityPresciber mtmMedicationActivityReminders",
       "constraints.validation.warning", "mtmMedicationActivityGoals",
       "constraints.validation.info", "mtmMedicationActivityText mtmMedicationActivityStopReason"
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
      (otherInformationSectionEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.444",
       "constraints.validation.error", "OtherInformationSectionTemplateId OtherInformationSectionText OtherInformationSectionTitle"
       });														
    addAnnotation
      (medicationActionPlanEClass, 
       source, 
       new String[] 
       {
       "templateId.root", "111.222.333.444.555",
       "constraints.validation.error", "MedicationActionPlanTemplateId MedicationActionPlanMedicationActionPlanEncounter"
       });									
    addAnnotation
      (medicationActionPlanEncounterEClass, 
       source, 
       new String[] 
       {
       "code.codeSystem", "2.16.840.1.113883.6.96",
       "constraints.validation.error", "MedicationActionPlanEncounterEffectiveTime MedicationActionPlanEncounterText MedicationActionPlanEncounterCode MedicationActionPlanEncounterMedicationActionPlanActivity",
       "code.codeSystemName", "SNOMEDCT",
       "constraints.validation.dependOn.MedicationActionPlanEncounterCode", "MedicationActionPlanEncounterCodeP",
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
       "constraints.validation.error", "MedicationActionPlanActivityTemplateId PlanOfCareActivityActMoodCode MedicationActionPlanActivityText MedicationActionPlanActivityCode MedicationActionPlanActivityMedicationActionPlanGoal",
       "code.codeSystemName", "SNOMEDCT",
       "constraints.validation.warning", "MedicationActionPlanActivityCodeP",
       "constraints.validation.info", "MedicationActionPlanActivityMedicationActionPlanObservation",
       "moodCode", "INT"
       });																											
    addAnnotation
      (medicationActionPlanObservationEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "MedicationActionPlanObservationText"
       });				
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationTherapyManagementProgramAuthor</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createMtmMedicationTherapyManagementProgramAuthorAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationTherapyManagementProgramAuthor";			
    addAnnotation
      (medicationTherapyManagementProgramEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "AuthorTypeCode",
       "typeCode", "AUT"
       });																																																																																																																																																																																	
  }

  /**
   * Initializes the annotations for <b>duplicates</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createDuplicatesAnnotations()
  {
    String source = "duplicates";				
    addAnnotation
      (medicationTherapyManagementProgramEClass, 
       source, 
       new String[] 
       {
       });																															
    addAnnotation
      (personalMedicationListEClass, 
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
      (medicationActionPlanEClass, 
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
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityPrescriber</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createMtmMedicationActivityPrescriberAnnotations()
  {
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
  protected void createMtmMedicationActivityPrescriberAssignedPresciberAnnotations()
  {
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
  protected void createMtmMedicationActivityPrescriberAssignedPresciberPersonAnnotations()
  {
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
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityReminder</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createMtmMedicationActivityReminderAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityReminder";																																													
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "ReminderText"
       });																																																																																																																																							
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityInstruction</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createMtmMedicationActivityInstructionAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityInstruction";																																														
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "InstructionText"
       });																																																																																																																																						
  }

  /**
   * Initializes the annotations for <b>http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReason</b>.
   * <!-- begin-user-doc -->
   * <!-- end-user-doc -->
   * @generated
   */
  protected void createMtmMedicationActivityStopReasonAnnotations()
  {
    String source = "http://www.openhealthtools.org/mdht/uml/cda/annotation/mtmMedicationActivityStopReason";																																															
    addAnnotation
      (medicationActivityEClass, 
       source, 
       new String[] 
       {
       "constraints.validation.error", "StopReasonClassCode StopReasonMoodCode StopReasonNegationInd StopReasonText",
       "classCode", "ACT",
       "moodCode", "EVN",
       "negationInd", "true"
       });																																																																																																																																					
  }

} //MtmPackageImpl
