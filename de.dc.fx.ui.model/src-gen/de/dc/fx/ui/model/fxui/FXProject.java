/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Project</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXProject#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXProject#getFxControls <em>Fx Controls</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXProject()
 * @model
 * @generated
 */
public interface FXProject extends FXNamedElement {
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
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXProject_PackagePath()
	 * @model
	 * @generated
	 */
	String getPackagePath();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXProject#getPackagePath <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Path</em>' attribute.
	 * @see #getPackagePath()
	 * @generated
	 */
	void setPackagePath(String value);

	/**
	 * Returns the value of the '<em><b>Fx Controls</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.fx.ui.model.fxui.FXControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fx Controls</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx Controls</em>' containment reference list.
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXProject_FxControls()
	 * @model containment="true"
	 * @generated
	 */
	EList<FXControl> getFxControls();

} // FXProject
