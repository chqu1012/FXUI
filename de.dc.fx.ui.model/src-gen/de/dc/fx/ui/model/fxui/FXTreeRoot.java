/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Tree Root</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXTreeRoot#getChildren <em>Children</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXTreeRoot#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXTreeRoot#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTreeRoot()
 * @model
 * @generated
 */
public interface FXTreeRoot extends EObject {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.fx.ui.model.fxui.FXNode}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTreeRoot_Children()
	 * @model containment="true"
	 * @generated
	 */
	EList<FXNode> getChildren();

	/**
	 * Returns the value of the '<em><b>Instance Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Instance Type</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Instance Type</em>' attribute.
	 * @see #setInstanceType(String)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTreeRoot_InstanceType()
	 * @model
	 * @generated
	 */
	String getInstanceType();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXTreeRoot#getInstanceType <em>Instance Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Instance Type</em>' attribute.
	 * @see #getInstanceType()
	 * @generated
	 */
	void setInstanceType(String value);

	/**
	 * Returns the value of the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Name</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Name</em>' attribute.
	 * @see #setName(String)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTreeRoot_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXTreeRoot#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FXTreeRoot
