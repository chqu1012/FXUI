/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXReference#getReferenceTo <em>Reference To</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXReference#getUpperBound <em>Upper Bound</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXReference#getLowerBound <em>Lower Bound</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXReference()
 * @model
 * @generated
 */
public interface FXReference extends EObject {
	/**
	 * Returns the value of the '<em><b>Reference To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Reference To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Reference To</em>' reference.
	 * @see #setReferenceTo(FXModel)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXReference_ReferenceTo()
	 * @model
	 * @generated
	 */
	FXModel getReferenceTo();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXReference#getReferenceTo <em>Reference To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reference To</em>' reference.
	 * @see #getReferenceTo()
	 * @generated
	 */
	void setReferenceTo(FXModel value);

	/**
	 * Returns the value of the '<em><b>Upper Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Upper Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Upper Bound</em>' attribute.
	 * @see #setUpperBound(int)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXReference_UpperBound()
	 * @model
	 * @generated
	 */
	int getUpperBound();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXReference#getUpperBound <em>Upper Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Upper Bound</em>' attribute.
	 * @see #getUpperBound()
	 * @generated
	 */
	void setUpperBound(int value);

	/**
	 * Returns the value of the '<em><b>Lower Bound</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Lower Bound</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Lower Bound</em>' attribute.
	 * @see #setLowerBound(int)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXReference_LowerBound()
	 * @model
	 * @generated
	 */
	int getLowerBound();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXReference#getLowerBound <em>Lower Bound</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lower Bound</em>' attribute.
	 * @see #getLowerBound()
	 * @generated
	 */
	void setLowerBound(int value);

} // FXReference
