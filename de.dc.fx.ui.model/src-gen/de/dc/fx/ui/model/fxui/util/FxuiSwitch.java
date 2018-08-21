/**
 */
package de.dc.fx.ui.model.fxui.util;

import de.dc.fx.ui.model.fxui.*;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see de.dc.fx.ui.model.fxui.FxuiPackage
 * @generated
 */
public class FxuiSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FxuiPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxuiSwitch() {
		if (modelPackage == null) {
			modelPackage = FxuiPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
		case FxuiPackage.FX_TABLE_VIEW: {
			FXTableView fxTableView = (FXTableView) theEObject;
			T result = caseFXTableView(fxTableView);
			if (result == null)
				result = caseFXNamedElement(fxTableView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_COLUMN: {
			FXColumn fxColumn = (FXColumn) theEObject;
			T result = caseFXColumn(fxColumn);
			if (result == null)
				result = caseFXNamedElement(fxColumn);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_NAMED_ELEMENT: {
			FXNamedElement fxNamedElement = (FXNamedElement) theEObject;
			T result = caseFXNamedElement(fxNamedElement);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_MODEL: {
			FXModel fxModel = (FXModel) theEObject;
			T result = caseFXModel(fxModel);
			if (result == null)
				result = caseFXNamedElement(fxModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_PROPERTY: {
			FXProperty fxProperty = (FXProperty) theEObject;
			T result = caseFXProperty(fxProperty);
			if (result == null)
				result = caseFXNamedElement(fxProperty);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_FORM: {
			FXForm fxForm = (FXForm) theEObject;
			T result = caseFXForm(fxForm);
			if (result == null)
				result = caseFXNamedElement(fxForm);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_CONTROL: {
			FXControl fxControl = (FXControl) theEObject;
			T result = caseFXControl(fxControl);
			if (result == null)
				result = caseFXNamedElement(fxControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_TEXT_FIELD: {
			FXTextField fxTextField = (FXTextField) theEObject;
			T result = caseFXTextField(fxTextField);
			if (result == null)
				result = caseFXControl(fxTextField);
			if (result == null)
				result = caseFXNamedElement(fxTextField);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_BUTTON: {
			FXButton fxButton = (FXButton) theEObject;
			T result = caseFXButton(fxButton);
			if (result == null)
				result = caseFXControl(fxButton);
			if (result == null)
				result = caseFXNamedElement(fxButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_TOGGLE_BUTTON: {
			FXToggleButton fxToggleButton = (FXToggleButton) theEObject;
			T result = caseFXToggleButton(fxToggleButton);
			if (result == null)
				result = caseFXSelectedControl(fxToggleButton);
			if (result == null)
				result = caseFXControl(fxToggleButton);
			if (result == null)
				result = caseFXNamedElement(fxToggleButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_CHECK_BOX: {
			FXCheckBox fxCheckBox = (FXCheckBox) theEObject;
			T result = caseFXCheckBox(fxCheckBox);
			if (result == null)
				result = caseFXSelectedControl(fxCheckBox);
			if (result == null)
				result = caseFXControl(fxCheckBox);
			if (result == null)
				result = caseFXNamedElement(fxCheckBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_CHOICE_BOX: {
			FXChoiceBox fxChoiceBox = (FXChoiceBox) theEObject;
			T result = caseFXChoiceBox(fxChoiceBox);
			if (result == null)
				result = caseFXSelectedControl(fxChoiceBox);
			if (result == null)
				result = caseFXControl(fxChoiceBox);
			if (result == null)
				result = caseFXNamedElement(fxChoiceBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_RADIO_BUTTON: {
			FXRadioButton fxRadioButton = (FXRadioButton) theEObject;
			T result = caseFXRadioButton(fxRadioButton);
			if (result == null)
				result = caseFXSelectedControl(fxRadioButton);
			if (result == null)
				result = caseFXControl(fxRadioButton);
			if (result == null)
				result = caseFXNamedElement(fxRadioButton);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_COMBO_BOX: {
			FXComboBox fxComboBox = (FXComboBox) theEObject;
			T result = caseFXComboBox(fxComboBox);
			if (result == null)
				result = caseFXControl(fxComboBox);
			if (result == null)
				result = caseFXNamedElement(fxComboBox);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_SELECTED_CONTROL: {
			FXSelectedControl fxSelectedControl = (FXSelectedControl) theEObject;
			T result = caseFXSelectedControl(fxSelectedControl);
			if (result == null)
				result = caseFXControl(fxSelectedControl);
			if (result == null)
				result = caseFXNamedElement(fxSelectedControl);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_REFERENCE: {
			FXReference fxReference = (FXReference) theEObject;
			T result = caseFXReference(fxReference);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_EXISTING_MODEL: {
			FXExistingModel fxExistingModel = (FXExistingModel) theEObject;
			T result = caseFXExistingModel(fxExistingModel);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_TREE_VIEW: {
			FXTreeView fxTreeView = (FXTreeView) theEObject;
			T result = caseFXTreeView(fxTreeView);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_TREE_ROOT: {
			FXTreeRoot fxTreeRoot = (FXTreeRoot) theEObject;
			T result = caseFXTreeRoot(fxTreeRoot);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		case FxuiPackage.FX_NODE: {
			FXNode fxNode = (FXNode) theEObject;
			T result = caseFXNode(fxNode);
			if (result == null)
				result = defaultCase(theEObject);
			return result;
		}
		default:
			return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Table View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Table View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXTableView(FXTableView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Column</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Column</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXColumn(FXColumn object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Named Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXNamedElement(FXNamedElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXModel(FXModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Property</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Property</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXProperty(FXProperty object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Form</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Form</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXForm(FXForm object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXControl(FXControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Text Field</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXTextField(FXTextField object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXButton(FXButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Toggle Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Toggle Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXToggleButton(FXToggleButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Check Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Check Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXCheckBox(FXCheckBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Choice Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Choice Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXChoiceBox(FXChoiceBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Radio Button</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXRadioButton(FXRadioButton object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Combo Box</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXComboBox(FXComboBox object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Selected Control</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Selected Control</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXSelectedControl(FXSelectedControl object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXReference(FXReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Existing Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Existing Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXExistingModel(FXExistingModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Tree View</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Tree View</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXTreeView(FXTreeView object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Tree Root</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Tree Root</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXTreeRoot(FXTreeRoot object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>FX Node</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>FX Node</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFXNode(FXNode object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //FxuiSwitch
