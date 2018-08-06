/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see de.dc.fx.ui.model.fxui.FxuiFactory
 * @model kind="package"
 * @generated
 */
public interface FxuiPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "fxui";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.example.org/fxui";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "fxui";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FxuiPackage eINSTANCE = de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl.init();

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXNamedElementImpl <em>FX Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXNamedElementImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXNamedElement()
	 * @generated
	 */
	int FX_NAMED_ELEMENT = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>FX Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>FX Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXTableViewImpl <em>FX Table View</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXTableViewImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXTableView()
	 * @generated
	 */
	int FX_TABLE_VIEW = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__NAME = FX_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fx Columns</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__FX_COLUMNS = FX_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fx Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__FX_ENTITY = FX_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Has Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__HAS_FILTER = FX_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Has Sorter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__HAS_SORTER = FX_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>FX Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW_FEATURE_COUNT = FX_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>FX Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW_OPERATION_COUNT = FX_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXColumnImpl <em>FX Column</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXColumnImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXColumn()
	 * @generated
	 */
	int FX_COLUMN = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COLUMN__NAME = FX_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Associated FX Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COLUMN__ASSOCIATED_FX_PROPERTY = FX_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COLUMN__EDITABLE = FX_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Use Custom Cell Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COLUMN__USE_CUSTOM_CELL_FACTORY = FX_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FX Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COLUMN_FEATURE_COUNT = FX_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>FX Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COLUMN_OPERATION_COUNT = FX_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXModelImpl <em>FX Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXModelImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXModel()
	 * @generated
	 */
	int FX_MODEL = 3;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MODEL__NAME = FX_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Fx Properties</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MODEL__FX_PROPERTIES = FX_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FX Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MODEL_FEATURE_COUNT = FX_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FX Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MODEL_OPERATION_COUNT = FX_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXPropertyImpl <em>FX Property</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXPropertyImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXProperty()
	 * @generated
	 */
	int FX_PROPERTY = 4;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_PROPERTY__NAME = FX_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_PROPERTY__TYPE = FX_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FX Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_PROPERTY_FEATURE_COUNT = FX_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FX Property</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_PROPERTY_OPERATION_COUNT = FX_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXTableView <em>FX Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Table View</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXTableView
	 * @generated
	 */
	EClass getFXTableView();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.fx.ui.model.fxui.FXTableView#getFxColumns <em>Fx Columns</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fx Columns</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXTableView#getFxColumns()
	 * @see #getFXTableView()
	 * @generated
	 */
	EReference getFXTableView_FxColumns();

	/**
	 * Returns the meta object for the containment reference '{@link de.dc.fx.ui.model.fxui.FXTableView#getFxEntity <em>Fx Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fx Entity</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXTableView#getFxEntity()
	 * @see #getFXTableView()
	 * @generated
	 */
	EReference getFXTableView_FxEntity();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXTableView#isHasFilter <em>Has Filter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Filter</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXTableView#isHasFilter()
	 * @see #getFXTableView()
	 * @generated
	 */
	EAttribute getFXTableView_HasFilter();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXTableView#isHasSorter <em>Has Sorter</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Has Sorter</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXTableView#isHasSorter()
	 * @see #getFXTableView()
	 * @generated
	 */
	EAttribute getFXTableView_HasSorter();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXColumn <em>FX Column</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Column</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXColumn
	 * @generated
	 */
	EClass getFXColumn();

	/**
	 * Returns the meta object for the reference '{@link de.dc.fx.ui.model.fxui.FXColumn#getAssociatedFXProperty <em>Associated FX Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Associated FX Property</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXColumn#getAssociatedFXProperty()
	 * @see #getFXColumn()
	 * @generated
	 */
	EReference getFXColumn_AssociatedFXProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXColumn#isEditable <em>Editable</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Editable</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXColumn#isEditable()
	 * @see #getFXColumn()
	 * @generated
	 */
	EAttribute getFXColumn_Editable();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXColumn#isUseCustomCellFactory <em>Use Custom Cell Factory</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Use Custom Cell Factory</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXColumn#isUseCustomCellFactory()
	 * @see #getFXColumn()
	 * @generated
	 */
	EAttribute getFXColumn_UseCustomCellFactory();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXNamedElement <em>FX Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Named Element</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXNamedElement
	 * @generated
	 */
	EClass getFXNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXNamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXNamedElement#getName()
	 * @see #getFXNamedElement()
	 * @generated
	 */
	EAttribute getFXNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXModel <em>FX Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Model</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXModel
	 * @generated
	 */
	EClass getFXModel();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.fx.ui.model.fxui.FXModel#getFxProperties <em>Fx Properties</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fx Properties</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXModel#getFxProperties()
	 * @see #getFXModel()
	 * @generated
	 */
	EReference getFXModel_FxProperties();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXProperty <em>FX Property</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Property</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXProperty
	 * @generated
	 */
	EClass getFXProperty();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXProperty#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Type</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXProperty#getType()
	 * @see #getFXProperty()
	 * @generated
	 */
	EAttribute getFXProperty_Type();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	FxuiFactory getFxuiFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXTableViewImpl <em>FX Table View</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXTableViewImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXTableView()
		 * @generated
		 */
		EClass FX_TABLE_VIEW = eINSTANCE.getFXTableView();

		/**
		 * The meta object literal for the '<em><b>Fx Columns</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_TABLE_VIEW__FX_COLUMNS = eINSTANCE.getFXTableView_FxColumns();

		/**
		 * The meta object literal for the '<em><b>Fx Entity</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_TABLE_VIEW__FX_ENTITY = eINSTANCE.getFXTableView_FxEntity();

		/**
		 * The meta object literal for the '<em><b>Has Filter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_TABLE_VIEW__HAS_FILTER = eINSTANCE.getFXTableView_HasFilter();

		/**
		 * The meta object literal for the '<em><b>Has Sorter</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_TABLE_VIEW__HAS_SORTER = eINSTANCE.getFXTableView_HasSorter();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXColumnImpl <em>FX Column</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXColumnImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXColumn()
		 * @generated
		 */
		EClass FX_COLUMN = eINSTANCE.getFXColumn();

		/**
		 * The meta object literal for the '<em><b>Associated FX Property</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_COLUMN__ASSOCIATED_FX_PROPERTY = eINSTANCE.getFXColumn_AssociatedFXProperty();

		/**
		 * The meta object literal for the '<em><b>Editable</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_COLUMN__EDITABLE = eINSTANCE.getFXColumn_Editable();

		/**
		 * The meta object literal for the '<em><b>Use Custom Cell Factory</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_COLUMN__USE_CUSTOM_CELL_FACTORY = eINSTANCE.getFXColumn_UseCustomCellFactory();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXNamedElementImpl <em>FX Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXNamedElementImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXNamedElement()
		 * @generated
		 */
		EClass FX_NAMED_ELEMENT = eINSTANCE.getFXNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_NAMED_ELEMENT__NAME = eINSTANCE.getFXNamedElement_Name();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXModelImpl <em>FX Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXModelImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXModel()
		 * @generated
		 */
		EClass FX_MODEL = eINSTANCE.getFXModel();

		/**
		 * The meta object literal for the '<em><b>Fx Properties</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_MODEL__FX_PROPERTIES = eINSTANCE.getFXModel_FxProperties();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXPropertyImpl <em>FX Property</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXPropertyImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXProperty()
		 * @generated
		 */
		EClass FX_PROPERTY = eINSTANCE.getFXProperty();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_PROPERTY__TYPE = eINSTANCE.getFXProperty_Type();

	}

} //FxuiPackage
