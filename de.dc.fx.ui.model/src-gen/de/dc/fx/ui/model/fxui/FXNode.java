/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Node</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXNode#getParent <em>Parent</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXNode#getInstanceType <em>Instance Type</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXNode#getName <em>Name</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXNode()
 * @model
 * @generated
 */
public interface FXNode extends EObject {
	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(FXTreeRoot)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXNode_Parent()
	 * @model
	 * @generated
	 */
	FXTreeRoot getParent();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXNode#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(FXTreeRoot value);

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
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXNode_InstanceType()
	 * @model
	 * @generated
	 */
	String getInstanceType();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXNode#getInstanceType <em>Instance Type</em>}' attribute.
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
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXNode_Name()
	 * @model
	 * @generated
	 */
	String getName();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXNode#getName <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Name</em>' attribute.
	 * @see #getName()
	 * @generated
	 */
	void setName(String value);

} // FXNode
