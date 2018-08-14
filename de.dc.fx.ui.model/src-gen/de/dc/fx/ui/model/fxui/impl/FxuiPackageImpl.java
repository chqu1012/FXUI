/**
 */
package de.dc.fx.ui.model.fxui.impl;

import de.dc.fx.ui.model.fxui.FXButton;
import de.dc.fx.ui.model.fxui.FXCheckBox;
import de.dc.fx.ui.model.fxui.FXChoiceBox;
import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXComboBox;
import de.dc.fx.ui.model.fxui.FXControl;
import de.dc.fx.ui.model.fxui.FXForm;
import de.dc.fx.ui.model.fxui.FXModel;
import de.dc.fx.ui.model.fxui.FXNamedElement;
import de.dc.fx.ui.model.fxui.FXProperty;
import de.dc.fx.ui.model.fxui.FXRadioButton;
import de.dc.fx.ui.model.fxui.FXSelectedControl;
import de.dc.fx.ui.model.fxui.FXTableView;
import de.dc.fx.ui.model.fxui.FXTextField;
import de.dc.fx.ui.model.fxui.FXToggleButton;
import de.dc.fx.ui.model.fxui.FxuiFactory;
import de.dc.fx.ui.model.fxui.FxuiPackage;
import de.dc.fx.ui.model.fxui.Pos;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FxuiPackageImpl extends EPackageImpl implements FxuiPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxTableViewEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxColumnEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxNamedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxModelEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxPropertyEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxFormEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxTextFieldEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxToggleButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxCheckBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxChoiceBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxRadioButtonEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxComboBoxEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fxSelectedControlEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum posEEnum = null;

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
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private FxuiPackageImpl() {
		super(eNS_URI, FxuiFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link FxuiPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static FxuiPackage init() {
		if (isInited)
			return (FxuiPackage) EPackage.Registry.INSTANCE.getEPackage(FxuiPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredFxuiPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		FxuiPackageImpl theFxuiPackage = registeredFxuiPackage instanceof FxuiPackageImpl
				? (FxuiPackageImpl) registeredFxuiPackage
				: new FxuiPackageImpl();

		isInited = true;

		// Create package meta-data objects
		theFxuiPackage.createPackageContents();

		// Initialize created meta-data
		theFxuiPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theFxuiPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(FxuiPackage.eNS_URI, theFxuiPackage);
		return theFxuiPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXTableView() {
		return fxTableViewEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFXTableView_FxColumns() {
		return (EReference) fxTableViewEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFXTableView_FxEntity() {
		return (EReference) fxTableViewEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXTableView_HasFilter() {
		return (EAttribute) fxTableViewEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXTableView_HasSorter() {
		return (EAttribute) fxTableViewEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXTableView_PackagePath() {
		return (EAttribute) fxTableViewEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXColumn() {
		return fxColumnEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFXColumn_AssociatedFXProperty() {
		return (EReference) fxColumnEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXColumn_Editable() {
		return (EAttribute) fxColumnEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXColumn_UseCustomCellFactory() {
		return (EAttribute) fxColumnEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXColumn_Width() {
		return (EAttribute) fxColumnEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXColumn_Alignment() {
		return (EAttribute) fxColumnEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXNamedElement() {
		return fxNamedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXNamedElement_Name() {
		return (EAttribute) fxNamedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXModel() {
		return fxModelEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFXModel_FxProperties() {
		return (EReference) fxModelEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXProperty() {
		return fxPropertyEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXProperty_Type() {
		return (EAttribute) fxPropertyEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXForm() {
		return fxFormEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXForm_NumOfGrid() {
		return (EAttribute) fxFormEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getFXForm_Fxcontrols() {
		return (EReference) fxFormEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXForm_PackagePath() {
		return (EAttribute) fxFormEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXControl() {
		return fxControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXControl_ShowLabel() {
		return (EAttribute) fxControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXTextField() {
		return fxTextFieldEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXTextField_Prompt() {
		return (EAttribute) fxTextFieldEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXButton() {
		return fxButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXToggleButton() {
		return fxToggleButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXCheckBox() {
		return fxCheckBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXChoiceBox() {
		return fxChoiceBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXRadioButton() {
		return fxRadioButtonEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXComboBox() {
		return fxComboBoxEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getFXSelectedControl() {
		return fxSelectedControlEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getFXSelectedControl_Selected() {
		return (EAttribute) fxSelectedControlEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EEnum getPos() {
		return posEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxuiFactory getFxuiFactory() {
		return (FxuiFactory) getEFactoryInstance();
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
		if (isCreated)
			return;
		isCreated = true;

		// Create classes and their features
		fxTableViewEClass = createEClass(FX_TABLE_VIEW);
		createEReference(fxTableViewEClass, FX_TABLE_VIEW__FX_COLUMNS);
		createEReference(fxTableViewEClass, FX_TABLE_VIEW__FX_ENTITY);
		createEAttribute(fxTableViewEClass, FX_TABLE_VIEW__HAS_FILTER);
		createEAttribute(fxTableViewEClass, FX_TABLE_VIEW__HAS_SORTER);
		createEAttribute(fxTableViewEClass, FX_TABLE_VIEW__PACKAGE_PATH);

		fxColumnEClass = createEClass(FX_COLUMN);
		createEReference(fxColumnEClass, FX_COLUMN__ASSOCIATED_FX_PROPERTY);
		createEAttribute(fxColumnEClass, FX_COLUMN__EDITABLE);
		createEAttribute(fxColumnEClass, FX_COLUMN__USE_CUSTOM_CELL_FACTORY);
		createEAttribute(fxColumnEClass, FX_COLUMN__WIDTH);
		createEAttribute(fxColumnEClass, FX_COLUMN__ALIGNMENT);

		fxNamedElementEClass = createEClass(FX_NAMED_ELEMENT);
		createEAttribute(fxNamedElementEClass, FX_NAMED_ELEMENT__NAME);

		fxModelEClass = createEClass(FX_MODEL);
		createEReference(fxModelEClass, FX_MODEL__FX_PROPERTIES);

		fxPropertyEClass = createEClass(FX_PROPERTY);
		createEAttribute(fxPropertyEClass, FX_PROPERTY__TYPE);

		fxFormEClass = createEClass(FX_FORM);
		createEAttribute(fxFormEClass, FX_FORM__NUM_OF_GRID);
		createEReference(fxFormEClass, FX_FORM__FXCONTROLS);
		createEAttribute(fxFormEClass, FX_FORM__PACKAGE_PATH);

		fxControlEClass = createEClass(FX_CONTROL);
		createEAttribute(fxControlEClass, FX_CONTROL__SHOW_LABEL);

		fxTextFieldEClass = createEClass(FX_TEXT_FIELD);
		createEAttribute(fxTextFieldEClass, FX_TEXT_FIELD__PROMPT);

		fxButtonEClass = createEClass(FX_BUTTON);

		fxToggleButtonEClass = createEClass(FX_TOGGLE_BUTTON);

		fxCheckBoxEClass = createEClass(FX_CHECK_BOX);

		fxChoiceBoxEClass = createEClass(FX_CHOICE_BOX);

		fxRadioButtonEClass = createEClass(FX_RADIO_BUTTON);

		fxComboBoxEClass = createEClass(FX_COMBO_BOX);

		fxSelectedControlEClass = createEClass(FX_SELECTED_CONTROL);
		createEAttribute(fxSelectedControlEClass, FX_SELECTED_CONTROL__SELECTED);

		// Create enums
		posEEnum = createEEnum(POS);
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
		if (isInitialized)
			return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		fxTableViewEClass.getESuperTypes().add(this.getFXNamedElement());
		fxColumnEClass.getESuperTypes().add(this.getFXNamedElement());
		fxModelEClass.getESuperTypes().add(this.getFXNamedElement());
		fxPropertyEClass.getESuperTypes().add(this.getFXNamedElement());
		fxFormEClass.getESuperTypes().add(this.getFXNamedElement());
		fxControlEClass.getESuperTypes().add(this.getFXNamedElement());
		fxTextFieldEClass.getESuperTypes().add(this.getFXControl());
		fxButtonEClass.getESuperTypes().add(this.getFXControl());
		fxToggleButtonEClass.getESuperTypes().add(this.getFXSelectedControl());
		fxCheckBoxEClass.getESuperTypes().add(this.getFXSelectedControl());
		fxChoiceBoxEClass.getESuperTypes().add(this.getFXSelectedControl());
		fxRadioButtonEClass.getESuperTypes().add(this.getFXSelectedControl());
		fxComboBoxEClass.getESuperTypes().add(this.getFXControl());
		fxSelectedControlEClass.getESuperTypes().add(this.getFXControl());

		// Initialize classes, features, and operations; add parameters
		initEClass(fxTableViewEClass, FXTableView.class, "FXTableView", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFXTableView_FxColumns(), this.getFXColumn(), null, "fxColumns", null, 0, -1,
				FXTableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFXTableView_FxEntity(), this.getFXModel(), null, "fxEntity", null, 0, 1, FXTableView.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXTableView_HasFilter(), ecorePackage.getEBoolean(), "hasFilter", null, 0, 1,
				FXTableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXTableView_HasSorter(), ecorePackage.getEBoolean(), "hasSorter", null, 0, 1,
				FXTableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXTableView_PackagePath(), ecorePackage.getEString(), "packagePath", null, 0, 1,
				FXTableView.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		initEClass(fxColumnEClass, FXColumn.class, "FXColumn", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFXColumn_AssociatedFXProperty(), this.getFXProperty(), null, "associatedFXProperty", null, 0,
				1, FXColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXColumn_Editable(), ecorePackage.getEBoolean(), "editable", null, 0, 1, FXColumn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXColumn_UseCustomCellFactory(), ecorePackage.getEBoolean(), "useCustomCellFactory", null, 0,
				1, FXColumn.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXColumn_Width(), ecorePackage.getEDouble(), "width", "100.0", 0, 1, FXColumn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXColumn_Alignment(), this.getPos(), "alignment", "CENTER", 0, 1, FXColumn.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxNamedElementEClass, FXNamedElement.class, "FXNamedElement", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXNamedElement_Name(), ecorePackage.getEString(), "name", null, 0, 1, FXNamedElement.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxModelEClass, FXModel.class, "FXModel", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFXModel_FxProperties(), this.getFXProperty(), null, "fxProperties", null, 0, -1,
				FXModel.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES,
				!IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxPropertyEClass, FXProperty.class, "FXProperty", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXProperty_Type(), ecorePackage.getEString(), "type", null, 0, 1, FXProperty.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxFormEClass, FXForm.class, "FXForm", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXForm_NumOfGrid(), ecorePackage.getEInt(), "numOfGrid", null, 0, 1, FXForm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFXForm_Fxcontrols(), this.getFXControl(), null, "fxcontrols", null, 0, -1, FXForm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE,
				IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFXForm_PackagePath(), ecorePackage.getEString(), "packagePath", null, 0, 1, FXForm.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxControlEClass, FXControl.class, "FXControl", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXControl_ShowLabel(), ecorePackage.getEBoolean(), "showLabel", "true", 0, 1, FXControl.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxTextFieldEClass, FXTextField.class, "FXTextField", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXTextField_Prompt(), ecorePackage.getEString(), "prompt", null, 0, 1, FXTextField.class,
				!IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fxButtonEClass, FXButton.class, "FXButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxToggleButtonEClass, FXToggleButton.class, "FXToggleButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxCheckBoxEClass, FXCheckBox.class, "FXCheckBox", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxChoiceBoxEClass, FXChoiceBox.class, "FXChoiceBox", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxRadioButtonEClass, FXRadioButton.class, "FXRadioButton", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxComboBoxEClass, FXComboBox.class, "FXComboBox", !IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);

		initEClass(fxSelectedControlEClass, FXSelectedControl.class, "FXSelectedControl", IS_ABSTRACT, !IS_INTERFACE,
				IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFXSelectedControl_Selected(), ecorePackage.getEBoolean(), "selected", null, 0, 1,
				FXSelectedControl.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE,
				!IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(posEEnum, Pos.class, "Pos");
		addEEnumLiteral(posEEnum, Pos.TOP_LEFT);
		addEEnumLiteral(posEEnum, Pos.TOP_CENTER);
		addEEnumLiteral(posEEnum, Pos.TOP_RIGHT);
		addEEnumLiteral(posEEnum, Pos.CENTER_LEFT);
		addEEnumLiteral(posEEnum, Pos.CENTER);
		addEEnumLiteral(posEEnum, Pos.CENTER_RIGHT);
		addEEnumLiteral(posEEnum, Pos.BOTTOM_LEFT);
		addEEnumLiteral(posEEnum, Pos.BOTTOM_CENTER);
		addEEnumLiteral(posEEnum, Pos.BOTTOM_RIGHT);

		// Create resource
		createResource(eNS_URI);
	}

} //FxuiPackageImpl
