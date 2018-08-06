/**
 */
package de.dc.fx.ui.model.fxui.impl;

import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXModel;
import de.dc.fx.ui.model.fxui.FXNamedElement;
import de.dc.fx.ui.model.fxui.FXProperty;
import de.dc.fx.ui.model.fxui.FXTableView;
import de.dc.fx.ui.model.fxui.FxuiFactory;
import de.dc.fx.ui.model.fxui.FxuiPackage;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
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

		fxColumnEClass = createEClass(FX_COLUMN);
		createEReference(fxColumnEClass, FX_COLUMN__ASSOCIATED_FX_PROPERTY);
		createEAttribute(fxColumnEClass, FX_COLUMN__EDITABLE);
		createEAttribute(fxColumnEClass, FX_COLUMN__USE_CUSTOM_CELL_FACTORY);

		fxNamedElementEClass = createEClass(FX_NAMED_ELEMENT);
		createEAttribute(fxNamedElementEClass, FX_NAMED_ELEMENT__NAME);

		fxModelEClass = createEClass(FX_MODEL);
		createEReference(fxModelEClass, FX_MODEL__FX_PROPERTIES);

		fxPropertyEClass = createEClass(FX_PROPERTY);
		createEAttribute(fxPropertyEClass, FX_PROPERTY__TYPE);
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

		// Create resource
		createResource(eNS_URI);
	}

} //FxuiPackageImpl
