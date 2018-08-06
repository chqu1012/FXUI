/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Entity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXEntity#getFxProperties <em>Fx Properties</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXEntity()
 * @model
 * @generated
 */
public interface FXEntity extends FXNamedElement {
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
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXEntity_FxProperties()
	 * @model containment="true"
	 * @generated
	 */
	EList<FXProperty> getFxProperties();

} // FXEntity
