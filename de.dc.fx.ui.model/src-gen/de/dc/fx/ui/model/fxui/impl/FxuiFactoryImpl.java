/**
 */
package de.dc.fx.ui.model.fxui.impl;

import de.dc.fx.ui.model.fxui.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FxuiFactoryImpl extends EFactoryImpl implements FxuiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FxuiFactory init() {
		try {
			FxuiFactory theFxuiFactory = (FxuiFactory) EPackage.Registry.INSTANCE.getEFactory(FxuiPackage.eNS_URI);
			if (theFxuiFactory != null) {
				return theFxuiFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FxuiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxuiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FxuiPackage.FX_TABLE_VIEW:
			return createFXTableView();
		case FxuiPackage.FX_COLUMN:
			return createFXColumn();
		case FxuiPackage.FX_NAMED_ELEMENT:
			return createFXNamedElement();
		case FxuiPackage.FX_MODEL:
			return createFXModel();
		case FxuiPackage.FX_PROPERTY:
			return createFXProperty();
		case FxuiPackage.FX_FORM:
			return createFXForm();
		case FxuiPackage.FX_TEXT_FIELD:
			return createFXTextField();
		case FxuiPackage.FX_BUTTON:
			return createFXButton();
		case FxuiPackage.FX_TOGGLE_BUTTON:
			return createFXToggleButton();
		case FxuiPackage.FX_CHECK_BOX:
			return createFXCheckBox();
		case FxuiPackage.FX_CHOICE_BOX:
			return createFXChoiceBox();
		case FxuiPackage.FX_RADIO_BUTTON:
			return createFXRadioButton();
		case FxuiPackage.FX_COMBO_BOX:
			return createFXComboBox();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
		case FxuiPackage.POS:
			return createPosFromString(eDataType, initialValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
		case FxuiPackage.POS:
			return convertPosToString(eDataType, instanceValue);
		default:
			throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXTableView createFXTableView() {
		FXTableViewImpl fxTableView = new FXTableViewImpl();
		return fxTableView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXColumn createFXColumn() {
		FXColumnImpl fxColumn = new FXColumnImpl();
		return fxColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXNamedElement createFXNamedElement() {
		FXNamedElementImpl fxNamedElement = new FXNamedElementImpl();
		return fxNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXModel createFXModel() {
		FXModelImpl fxModel = new FXModelImpl();
		return fxModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXProperty createFXProperty() {
		FXPropertyImpl fxProperty = new FXPropertyImpl();
		return fxProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXForm createFXForm() {
		FXFormImpl fxForm = new FXFormImpl();
		return fxForm;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXTextField createFXTextField() {
		FXTextFieldImpl fxTextField = new FXTextFieldImpl();
		return fxTextField;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXButton createFXButton() {
		FXButtonImpl fxButton = new FXButtonImpl();
		return fxButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXToggleButton createFXToggleButton() {
		FXToggleButtonImpl fxToggleButton = new FXToggleButtonImpl();
		return fxToggleButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXCheckBox createFXCheckBox() {
		FXCheckBoxImpl fxCheckBox = new FXCheckBoxImpl();
		return fxCheckBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXChoiceBox createFXChoiceBox() {
		FXChoiceBoxImpl fxChoiceBox = new FXChoiceBoxImpl();
		return fxChoiceBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXRadioButton createFXRadioButton() {
		FXRadioButtonImpl fxRadioButton = new FXRadioButtonImpl();
		return fxRadioButton;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXComboBox createFXComboBox() {
		FXComboBoxImpl fxComboBox = new FXComboBoxImpl();
		return fxComboBox;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pos createPosFromString(EDataType eDataType, String initialValue) {
		Pos result = Pos.get(initialValue);
		if (result == null)
			throw new IllegalArgumentException(
					"The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertPosToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxuiPackage getFxuiPackage() {
		return (FxuiPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FxuiPackage getPackage() {
		return FxuiPackage.eINSTANCE;
	}

} //FxuiFactoryImpl
