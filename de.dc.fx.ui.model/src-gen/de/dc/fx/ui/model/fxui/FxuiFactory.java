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
	 * Returns the package supported by this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the package supported by this factory.
	 * @generated
	 */
	FxuiPackage getFxuiPackage();

} //FxuiFactory
