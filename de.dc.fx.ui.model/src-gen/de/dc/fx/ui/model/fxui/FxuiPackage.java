/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
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
	 * The feature id for the '<em><b>Fx Entity</b></em>' containment reference list.
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
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__PACKAGE_PATH = FX_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Input</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW__INPUT = FX_NAMED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>FX Table View</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TABLE_VIEW_FEATURE_COUNT = FX_NAMED_ELEMENT_FEATURE_COUNT + 6;

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
	 * The feature id for the '<em><b>Width</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COLUMN__WIDTH = FX_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Alignment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COLUMN__ALIGNMENT = FX_NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>FX Column</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COLUMN_FEATURE_COUNT = FX_NAMED_ELEMENT_FEATURE_COUNT + 5;

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
	 * The feature id for the '<em><b>Fxreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MODEL__FXREFERENCE = FX_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>FX Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_MODEL_FEATURE_COUNT = FX_NAMED_ELEMENT_FEATURE_COUNT + 2;

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
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXFormImpl <em>FX Form</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXFormImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXForm()
	 * @generated
	 */
	int FX_FORM = 5;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FORM__NAME = FX_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Num Of Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FORM__NUM_OF_GRID = FX_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Fxcontrols</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FORM__FXCONTROLS = FX_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FORM__PACKAGE_PATH = FX_NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>FX Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FORM_FEATURE_COUNT = FX_NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>FX Form</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_FORM_OPERATION_COUNT = FX_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXControlImpl <em>FX Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXControlImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXControl()
	 * @generated
	 */
	int FX_CONTROL = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL__NAME = FX_NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Show Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL__SHOW_LABEL = FX_NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FX Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL_FEATURE_COUNT = FX_NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FX Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CONTROL_OPERATION_COUNT = FX_NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXTextFieldImpl <em>FX Text Field</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXTextFieldImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXTextField()
	 * @generated
	 */
	int FX_TEXT_FIELD = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TEXT_FIELD__NAME = FX_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Show Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TEXT_FIELD__SHOW_LABEL = FX_CONTROL__SHOW_LABEL;

	/**
	 * The feature id for the '<em><b>Prompt</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TEXT_FIELD__PROMPT = FX_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FX Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TEXT_FIELD_FEATURE_COUNT = FX_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FX Text Field</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TEXT_FIELD_OPERATION_COUNT = FX_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXButtonImpl <em>FX Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXButtonImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXButton()
	 * @generated
	 */
	int FX_BUTTON = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__NAME = FX_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Show Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON__SHOW_LABEL = FX_CONTROL__SHOW_LABEL;

	/**
	 * The number of structural features of the '<em>FX Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON_FEATURE_COUNT = FX_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_BUTTON_OPERATION_COUNT = FX_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXSelectedControlImpl <em>FX Selected Control</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXSelectedControlImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXSelectedControl()
	 * @generated
	 */
	int FX_SELECTED_CONTROL = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SELECTED_CONTROL__NAME = FX_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Show Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SELECTED_CONTROL__SHOW_LABEL = FX_CONTROL__SHOW_LABEL;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SELECTED_CONTROL__SELECTED = FX_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>FX Selected Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SELECTED_CONTROL_FEATURE_COUNT = FX_CONTROL_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>FX Selected Control</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_SELECTED_CONTROL_OPERATION_COUNT = FX_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXToggleButtonImpl <em>FX Toggle Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXToggleButtonImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXToggleButton()
	 * @generated
	 */
	int FX_TOGGLE_BUTTON = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TOGGLE_BUTTON__NAME = FX_SELECTED_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Show Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TOGGLE_BUTTON__SHOW_LABEL = FX_SELECTED_CONTROL__SHOW_LABEL;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TOGGLE_BUTTON__SELECTED = FX_SELECTED_CONTROL__SELECTED;

	/**
	 * The number of structural features of the '<em>FX Toggle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TOGGLE_BUTTON_FEATURE_COUNT = FX_SELECTED_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Toggle Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_TOGGLE_BUTTON_OPERATION_COUNT = FX_SELECTED_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXCheckBoxImpl <em>FX Check Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXCheckBoxImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXCheckBox()
	 * @generated
	 */
	int FX_CHECK_BOX = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BOX__NAME = FX_SELECTED_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Show Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BOX__SHOW_LABEL = FX_SELECTED_CONTROL__SHOW_LABEL;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BOX__SELECTED = FX_SELECTED_CONTROL__SELECTED;

	/**
	 * The number of structural features of the '<em>FX Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BOX_FEATURE_COUNT = FX_SELECTED_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Check Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHECK_BOX_OPERATION_COUNT = FX_SELECTED_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXChoiceBoxImpl <em>FX Choice Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXChoiceBoxImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXChoiceBox()
	 * @generated
	 */
	int FX_CHOICE_BOX = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHOICE_BOX__NAME = FX_SELECTED_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Show Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHOICE_BOX__SHOW_LABEL = FX_SELECTED_CONTROL__SHOW_LABEL;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHOICE_BOX__SELECTED = FX_SELECTED_CONTROL__SELECTED;

	/**
	 * The number of structural features of the '<em>FX Choice Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHOICE_BOX_FEATURE_COUNT = FX_SELECTED_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Choice Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_CHOICE_BOX_OPERATION_COUNT = FX_SELECTED_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXRadioButtonImpl <em>FX Radio Button</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXRadioButtonImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXRadioButton()
	 * @generated
	 */
	int FX_RADIO_BUTTON = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__NAME = FX_SELECTED_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Show Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__SHOW_LABEL = FX_SELECTED_CONTROL__SHOW_LABEL;

	/**
	 * The feature id for the '<em><b>Selected</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON__SELECTED = FX_SELECTED_CONTROL__SELECTED;

	/**
	 * The number of structural features of the '<em>FX Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON_FEATURE_COUNT = FX_SELECTED_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Radio Button</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_RADIO_BUTTON_OPERATION_COUNT = FX_SELECTED_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXComboBoxImpl <em>FX Combo Box</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXComboBoxImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXComboBox()
	 * @generated
	 */
	int FX_COMBO_BOX = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COMBO_BOX__NAME = FX_CONTROL__NAME;

	/**
	 * The feature id for the '<em><b>Show Label</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COMBO_BOX__SHOW_LABEL = FX_CONTROL__SHOW_LABEL;

	/**
	 * The number of structural features of the '<em>FX Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COMBO_BOX_FEATURE_COUNT = FX_CONTROL_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>FX Combo Box</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_COMBO_BOX_OPERATION_COUNT = FX_CONTROL_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.impl.FXReferenceImpl <em>FX Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.impl.FXReferenceImpl
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXReference()
	 * @generated
	 */
	int FX_REFERENCE = 15;

	/**
	 * The feature id for the '<em><b>Reference To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_REFERENCE__REFERENCE_TO = 0;

	/**
	 * The feature id for the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_REFERENCE__UPPER_BOUND = 1;

	/**
	 * The feature id for the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_REFERENCE__LOWER_BOUND = 2;

	/**
	 * The number of structural features of the '<em>FX Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_REFERENCE_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>FX Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FX_REFERENCE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link de.dc.fx.ui.model.fxui.Pos <em>Pos</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see de.dc.fx.ui.model.fxui.Pos
	 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getPos()
	 * @generated
	 */
	int POS = 16;

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
	 * Returns the meta object for the containment reference list '{@link de.dc.fx.ui.model.fxui.FXTableView#getFxEntity <em>Fx Entity</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fx Entity</em>'.
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
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXTableView#getPackagePath <em>Package Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Path</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXTableView#getPackagePath()
	 * @see #getFXTableView()
	 * @generated
	 */
	EAttribute getFXTableView_PackagePath();

	/**
	 * Returns the meta object for the reference '{@link de.dc.fx.ui.model.fxui.FXTableView#getInput <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Input</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXTableView#getInput()
	 * @see #getFXTableView()
	 * @generated
	 */
	EReference getFXTableView_Input();

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
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXColumn#getWidth <em>Width</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Width</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXColumn#getWidth()
	 * @see #getFXColumn()
	 * @generated
	 */
	EAttribute getFXColumn_Width();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXColumn#getAlignment <em>Alignment</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Alignment</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXColumn#getAlignment()
	 * @see #getFXColumn()
	 * @generated
	 */
	EAttribute getFXColumn_Alignment();

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
	 * Returns the meta object for the containment reference '{@link de.dc.fx.ui.model.fxui.FXModel#getFxreference <em>Fxreference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Fxreference</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXModel#getFxreference()
	 * @see #getFXModel()
	 * @generated
	 */
	EReference getFXModel_Fxreference();

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
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXForm <em>FX Form</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Form</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXForm
	 * @generated
	 */
	EClass getFXForm();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXForm#getNumOfGrid <em>Num Of Grid</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Num Of Grid</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXForm#getNumOfGrid()
	 * @see #getFXForm()
	 * @generated
	 */
	EAttribute getFXForm_NumOfGrid();

	/**
	 * Returns the meta object for the containment reference list '{@link de.dc.fx.ui.model.fxui.FXForm#getFxcontrols <em>Fxcontrols</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Fxcontrols</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXForm#getFxcontrols()
	 * @see #getFXForm()
	 * @generated
	 */
	EReference getFXForm_Fxcontrols();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXForm#getPackagePath <em>Package Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Package Path</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXForm#getPackagePath()
	 * @see #getFXForm()
	 * @generated
	 */
	EAttribute getFXForm_PackagePath();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXControl <em>FX Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Control</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXControl
	 * @generated
	 */
	EClass getFXControl();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXControl#isShowLabel <em>Show Label</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Show Label</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXControl#isShowLabel()
	 * @see #getFXControl()
	 * @generated
	 */
	EAttribute getFXControl_ShowLabel();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXTextField <em>FX Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Text Field</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXTextField
	 * @generated
	 */
	EClass getFXTextField();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXTextField#getPrompt <em>Prompt</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Prompt</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXTextField#getPrompt()
	 * @see #getFXTextField()
	 * @generated
	 */
	EAttribute getFXTextField_Prompt();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXButton <em>FX Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Button</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXButton
	 * @generated
	 */
	EClass getFXButton();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXToggleButton <em>FX Toggle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Toggle Button</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXToggleButton
	 * @generated
	 */
	EClass getFXToggleButton();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXCheckBox <em>FX Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Check Box</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXCheckBox
	 * @generated
	 */
	EClass getFXCheckBox();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXChoiceBox <em>FX Choice Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Choice Box</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXChoiceBox
	 * @generated
	 */
	EClass getFXChoiceBox();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXRadioButton <em>FX Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Radio Button</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXRadioButton
	 * @generated
	 */
	EClass getFXRadioButton();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXComboBox <em>FX Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Combo Box</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXComboBox
	 * @generated
	 */
	EClass getFXComboBox();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXSelectedControl <em>FX Selected Control</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Selected Control</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXSelectedControl
	 * @generated
	 */
	EClass getFXSelectedControl();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXSelectedControl#isSelected <em>Selected</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Selected</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXSelectedControl#isSelected()
	 * @see #getFXSelectedControl()
	 * @generated
	 */
	EAttribute getFXSelectedControl_Selected();

	/**
	 * Returns the meta object for class '{@link de.dc.fx.ui.model.fxui.FXReference <em>FX Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>FX Reference</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXReference
	 * @generated
	 */
	EClass getFXReference();

	/**
	 * Returns the meta object for the reference '{@link de.dc.fx.ui.model.fxui.FXReference#getReferenceTo <em>Reference To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Reference To</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXReference#getReferenceTo()
	 * @see #getFXReference()
	 * @generated
	 */
	EReference getFXReference_ReferenceTo();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXReference#getUpperBound <em>Upper Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Upper Bound</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXReference#getUpperBound()
	 * @see #getFXReference()
	 * @generated
	 */
	EAttribute getFXReference_UpperBound();

	/**
	 * Returns the meta object for the attribute '{@link de.dc.fx.ui.model.fxui.FXReference#getLowerBound <em>Lower Bound</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Lower Bound</em>'.
	 * @see de.dc.fx.ui.model.fxui.FXReference#getLowerBound()
	 * @see #getFXReference()
	 * @generated
	 */
	EAttribute getFXReference_LowerBound();

	/**
	 * Returns the meta object for enum '{@link de.dc.fx.ui.model.fxui.Pos <em>Pos</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Pos</em>'.
	 * @see de.dc.fx.ui.model.fxui.Pos
	 * @generated
	 */
	EEnum getPos();

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
		 * The meta object literal for the '<em><b>Fx Entity</b></em>' containment reference list feature.
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
		 * The meta object literal for the '<em><b>Package Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_TABLE_VIEW__PACKAGE_PATH = eINSTANCE.getFXTableView_PackagePath();

		/**
		 * The meta object literal for the '<em><b>Input</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_TABLE_VIEW__INPUT = eINSTANCE.getFXTableView_Input();

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
		 * The meta object literal for the '<em><b>Width</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_COLUMN__WIDTH = eINSTANCE.getFXColumn_Width();

		/**
		 * The meta object literal for the '<em><b>Alignment</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_COLUMN__ALIGNMENT = eINSTANCE.getFXColumn_Alignment();

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
		 * The meta object literal for the '<em><b>Fxreference</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_MODEL__FXREFERENCE = eINSTANCE.getFXModel_Fxreference();

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

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXFormImpl <em>FX Form</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXFormImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXForm()
		 * @generated
		 */
		EClass FX_FORM = eINSTANCE.getFXForm();

		/**
		 * The meta object literal for the '<em><b>Num Of Grid</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_FORM__NUM_OF_GRID = eINSTANCE.getFXForm_NumOfGrid();

		/**
		 * The meta object literal for the '<em><b>Fxcontrols</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_FORM__FXCONTROLS = eINSTANCE.getFXForm_Fxcontrols();

		/**
		 * The meta object literal for the '<em><b>Package Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_FORM__PACKAGE_PATH = eINSTANCE.getFXForm_PackagePath();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXControlImpl <em>FX Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXControlImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXControl()
		 * @generated
		 */
		EClass FX_CONTROL = eINSTANCE.getFXControl();

		/**
		 * The meta object literal for the '<em><b>Show Label</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_CONTROL__SHOW_LABEL = eINSTANCE.getFXControl_ShowLabel();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXTextFieldImpl <em>FX Text Field</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXTextFieldImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXTextField()
		 * @generated
		 */
		EClass FX_TEXT_FIELD = eINSTANCE.getFXTextField();

		/**
		 * The meta object literal for the '<em><b>Prompt</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_TEXT_FIELD__PROMPT = eINSTANCE.getFXTextField_Prompt();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXButtonImpl <em>FX Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXButtonImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXButton()
		 * @generated
		 */
		EClass FX_BUTTON = eINSTANCE.getFXButton();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXToggleButtonImpl <em>FX Toggle Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXToggleButtonImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXToggleButton()
		 * @generated
		 */
		EClass FX_TOGGLE_BUTTON = eINSTANCE.getFXToggleButton();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXCheckBoxImpl <em>FX Check Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXCheckBoxImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXCheckBox()
		 * @generated
		 */
		EClass FX_CHECK_BOX = eINSTANCE.getFXCheckBox();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXChoiceBoxImpl <em>FX Choice Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXChoiceBoxImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXChoiceBox()
		 * @generated
		 */
		EClass FX_CHOICE_BOX = eINSTANCE.getFXChoiceBox();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXRadioButtonImpl <em>FX Radio Button</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXRadioButtonImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXRadioButton()
		 * @generated
		 */
		EClass FX_RADIO_BUTTON = eINSTANCE.getFXRadioButton();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXComboBoxImpl <em>FX Combo Box</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXComboBoxImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXComboBox()
		 * @generated
		 */
		EClass FX_COMBO_BOX = eINSTANCE.getFXComboBox();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXSelectedControlImpl <em>FX Selected Control</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXSelectedControlImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXSelectedControl()
		 * @generated
		 */
		EClass FX_SELECTED_CONTROL = eINSTANCE.getFXSelectedControl();

		/**
		 * The meta object literal for the '<em><b>Selected</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_SELECTED_CONTROL__SELECTED = eINSTANCE.getFXSelectedControl_Selected();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.impl.FXReferenceImpl <em>FX Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.impl.FXReferenceImpl
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getFXReference()
		 * @generated
		 */
		EClass FX_REFERENCE = eINSTANCE.getFXReference();

		/**
		 * The meta object literal for the '<em><b>Reference To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FX_REFERENCE__REFERENCE_TO = eINSTANCE.getFXReference_ReferenceTo();

		/**
		 * The meta object literal for the '<em><b>Upper Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_REFERENCE__UPPER_BOUND = eINSTANCE.getFXReference_UpperBound();

		/**
		 * The meta object literal for the '<em><b>Lower Bound</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FX_REFERENCE__LOWER_BOUND = eINSTANCE.getFXReference_LowerBound();

		/**
		 * The meta object literal for the '{@link de.dc.fx.ui.model.fxui.Pos <em>Pos</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see de.dc.fx.ui.model.fxui.Pos
		 * @see de.dc.fx.ui.model.fxui.impl.FxuiPackageImpl#getPos()
		 * @generated
		 */
		EEnum POS = eINSTANCE.getPos();

	}

} //FxuiPackage
