/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Form</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXForm#getNumOfGrid <em>Num Of Grid</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXForm#getFxcontrols <em>Fxcontrols</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXForm#getPackagePath <em>Package Path</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXForm()
 * @model
 * @generated
 */
public interface FXForm extends FXNamedElement {
	/**
	 * Returns the value of the '<em><b>Num Of Grid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Num Of Grid</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Num Of Grid</em>' attribute.
	 * @see #setNumOfGrid(int)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXForm_NumOfGrid()
	 * @model
	 * @generated
	 */
	int getNumOfGrid();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXForm#getNumOfGrid <em>Num Of Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Of Grid</em>' attribute.
	 * @see #getNumOfGrid()
	 * @generated
	 */
	void setNumOfGrid(int value);

	/**
	 * Returns the value of the '<em><b>Fxcontrols</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.fx.ui.model.fxui.FXControl}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fxcontrols</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fxcontrols</em>' containment reference list.
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXForm_Fxcontrols()
	 * @model containment="true"
	 * @generated
	 */
	EList<FXControl> getFxcontrols();

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
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXForm_PackagePath()
	 * @model
	 * @generated
	 */
	String getPackagePath();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXForm#getPackagePath <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Package Path</em>' attribute.
	 * @see #getPackagePath()
	 * @generated
	 */
	void setPackagePath(String value);

} // FXForm
