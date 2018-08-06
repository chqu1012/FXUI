/**
 */
package de.dc.fx.ui.model.fxui;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Column</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXColumn#getAssociatedFXProperty <em>Associated FX Property</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXColumn#isEditable <em>Editable</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXColumn#isUseCustomCellFactory <em>Use Custom Cell Factory</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXColumn()
 * @model
 * @generated
 */
public interface FXColumn extends FXNamedElement {
	/**
	 * Returns the value of the '<em><b>Associated FX Property</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Associated FX Property</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Associated FX Property</em>' reference.
	 * @see #setAssociatedFXProperty(FXProperty)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXColumn_AssociatedFXProperty()
	 * @model
	 * @generated
	 */
	FXProperty getAssociatedFXProperty();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXColumn#getAssociatedFXProperty <em>Associated FX Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Associated FX Property</em>' reference.
	 * @see #getAssociatedFXProperty()
	 * @generated
	 */
	void setAssociatedFXProperty(FXProperty value);

	/**
	 * Returns the value of the '<em><b>Editable</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Editable</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Editable</em>' attribute.
	 * @see #setEditable(boolean)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXColumn_Editable()
	 * @model
	 * @generated
	 */
	boolean isEditable();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXColumn#isEditable <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Editable</em>' attribute.
	 * @see #isEditable()
	 * @generated
	 */
	void setEditable(boolean value);

	/**
	 * Returns the value of the '<em><b>Use Custom Cell Factory</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Use Custom Cell Factory</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Use Custom Cell Factory</em>' attribute.
	 * @see #setUseCustomCellFactory(boolean)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXColumn_UseCustomCellFactory()
	 * @model
	 * @generated
	 */
	boolean isUseCustomCellFactory();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXColumn#isUseCustomCellFactory <em>Use Custom Cell Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Use Custom Cell Factory</em>' attribute.
	 * @see #isUseCustomCellFactory()
	 * @generated
	 */
	void setUseCustomCellFactory(boolean value);

} // FXColumn
