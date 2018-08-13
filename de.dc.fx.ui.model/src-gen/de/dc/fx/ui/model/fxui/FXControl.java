/**
 */
package de.dc.fx.ui.model.fxui;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Control</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXControl#isShowLabel <em>Show Label</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXControl()
 * @model abstract="true"
 * @generated
 */
public interface FXControl extends FXNamedElement {
	/**
	 * Returns the value of the '<em><b>Show Label</b></em>' attribute.
	 * The default value is <code>"true"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Show Label</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Show Label</em>' attribute.
	 * @see #setShowLabel(boolean)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXControl_ShowLabel()
	 * @model default="true"
	 * @generated
	 */
	boolean isShowLabel();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXControl#isShowLabel <em>Show Label</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Show Label</em>' attribute.
	 * @see #isShowLabel()
	 * @generated
	 */
	void setShowLabel(boolean value);

} // FXControl
