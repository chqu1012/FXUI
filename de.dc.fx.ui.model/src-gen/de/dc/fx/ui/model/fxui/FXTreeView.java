/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Tree View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXTreeView#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXTreeView#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTreeView()
 * @model
 * @generated
 */
public interface FXTreeView extends EObject {
	/**
	 * Returns the value of the '<em><b>Package Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Package Path</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Package Path</em>' attribute.
	 * @see #setPackagePath(String)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTreeView_PackagePath()
	 * @model
	 * @generated
	 */
	String getPackagePath();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXTreeView#getPackagePath <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Path</em>' attribute.
	 * @see #getPackagePath()
	 * @generated
	 */
	void setPackagePath(String value);

	/**
	 * Returns the value of the '<em><b>Root</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Root</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Root</em>' containment reference.
	 * @see #setRoot(FXTreeRoot)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTreeView_Root()
	 * @model containment="true"
	 * @generated
	 */
	FXTreeRoot getRoot();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXTreeView#getRoot <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Root</em>' containment reference.
	 * @see #getRoot()
	 * @generated
	 */
	void setRoot(FXTreeRoot value);

} // FXTreeView
