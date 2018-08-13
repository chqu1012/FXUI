/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.ecore.EFactory;

/**
 * <!-- begin-user-doc -->
 * The <b>Factory</b> for the model.
 * It provides a create method for each non-abstract class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.fx.ui.model.fxui.FxuiPackage
 * @generated
 */
public interface FxuiFactory extends EFactory {
	/**
	 * The singleton instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	FxuiFactory eINSTANCE = de.dc.fx.ui.model.fxui.impl.FxuiFactoryImpl.init();

	/**
	 * Returns a new object of class '<em>FX Table View</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Table View</em>'.
	 * @generated
	 */
	FXTableView createFXTableView();

	/**
	 * Returns a new object of class '<em>FX Column</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Column</em>'.
	 * @generated
	 */
	FXColumn createFXColumn();

	/**
	 * Returns a new object of class '<em>FX Named Element</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Named Element</em>'.
	 * @generated
	 */
	FXNamedElement createFXNamedElement();

	/**
	 * Returns a new object of class '<em>FX Model</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Model</em>'.
	 * @generated
	 */
	FXModel createFXModel();

	/**
	 * Returns a new object of class '<em>FX Property</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Property</em>'.
	 * @generated
	 */
	FXProperty createFXProperty();

	/**
	 * Returns a new object of class '<em>FX Form</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Form</em>'.
	 * @generated
	 */
	FXForm createFXForm();

	/**
	 * Returns a new object of class '<em>FX Text Field</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Text Field</em>'.
	 * @generated
	 */
	FXTextField createFXTextField();

	/**
	 * Returns a new object of class '<em>FX Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Button</em>'.
	 * @generated
	 */
	FXButton createFXButton();

	/**
	 * Returns a new object of class '<em>FX Toggle Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Toggle Button</em>'.
	 * @generated
	 */
	FXToggleButton createFXToggleButton();

	/**
	 * Returns a new object of class '<em>FX Checkbox</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Checkbox</em>'.
	 * @generated
	 */
	FXCheckbox createFXCheckbox();

	/**
	 * Returns a new object of class '<em>FX Choice Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Choice Box</em>'.
	 * @generated
	 */
	FXChoiceBox createFXChoiceBox();

	/**
	 * Returns a new object of class '<em>FX Radio Button</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Radio Button</em>'.
	 * @generated
	 */
	FXRadioButton createFXRadioButton();

	/**
	 * Returns a new object of class '<em>FX Combo Box</em>'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return a new object of class '<em>FX Combo Box</em>'.
	 * @generated
	 */
	FXComboBox createFXComboBox();

	/**
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FxuiPackage getFxuiPackage();

} //FxuiFactory
