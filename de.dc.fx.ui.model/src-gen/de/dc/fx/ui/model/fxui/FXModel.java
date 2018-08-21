/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Model</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXModel#getFxProperties <em>Fx Properties</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXModel#getFxreference <em>Fxreference</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXModel#getUseExistingModel <em>Use Existing Model</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXModel()
 * @model
 * @generated
 */
public interface FXModel extends FXNamedElement {
	/**
	 * Returns the value of the '<em><b>Fx Properties</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.fx.ui.model.fxui.FXProperty}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fx Properties</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx Properties</em>' containment reference list.
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXModel_FxProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<FXProperty> getFxProperties();

	/**
	 * Returns the value of the '<em><b>Fxreference</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fxreference</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fxreference</em>' containment reference.
	 * @see #setFxreference(FXReference)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXModel_Fxreference()
	 * @model containment="true"
	 * @generated
	 */
	FXReference getFxreference();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXModel#getFxreference <em>Fxreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fxreference</em>' containment reference.
	 * @see #getFxreference()
	 * @generated
	 */
	void setFxreference(FXReference value);

	/**
	 * Returns the value of the '<em><b>Use Existing Model</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Existing Model</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Existing Model</em>' containment reference.
	 * @see #setUseExistingModel(FXExistingModel)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXModel_UseExistingModel()
	 * @model containment="true"
	 * @generated
	 */
	FXExistingModel getUseExistingModel();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXModel#getUseExistingModel <em>Use Existing Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Existing Model</em>' containment reference.
	 * @see #getUseExistingModel()
	 * @generated
	 */
	void setUseExistingModel(FXExistingModel value);

} // FXModel
