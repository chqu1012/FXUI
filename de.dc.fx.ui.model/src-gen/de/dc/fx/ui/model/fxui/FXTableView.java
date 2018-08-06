/**
 */
package de.dc.fx.ui.model.fxui;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FX Table View</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXTableView#getFxColumns <em>Fx Columns</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXTableView#getFxEntity <em>Fx Entity</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXTableView#isHasFilter <em>Has Filter</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.FXTableView#isHasSorter <em>Has Sorter</em>}</li>
 * </ul>
 *
 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTableView()
 * @model
 * @generated
 */
public interface FXTableView extends FXNamedElement {
	/**
	 * Returns the value of the '<em><b>Fx Columns</b></em>' containment reference list.
	 * The list contents are of type {@link de.dc.fx.ui.model.fxui.FXColumn}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fx Columns</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx Columns</em>' containment reference list.
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTableView_FxColumns()
	 * @model containment="true"
	 * @generated
	 */
	EList<FXColumn> getFxColumns();

	/**
	 * Returns the value of the '<em><b>Fx Entity</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Fx Entity</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Fx Entity</em>' containment reference.
	 * @see #setFxEntity(FXModel)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTableView_FxEntity()
	 * @model containment="true"
	 * @generated
	 */
	FXModel getFxEntity();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXTableView#getFxEntity <em>Fx Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Fx Entity</em>' containment reference.
	 * @see #getFxEntity()
	 * @generated
	 */
	void setFxEntity(FXModel value);

	/**
	 * Returns the value of the '<em><b>Has Filter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Filter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Filter</em>' attribute.
	 * @see #setHasFilter(boolean)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTableView_HasFilter()
	 * @model
	 * @generated
	 */
	boolean isHasFilter();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXTableView#isHasFilter <em>Has Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Filter</em>' attribute.
	 * @see #isHasFilter()
	 * @generated
	 */
	void setHasFilter(boolean value);

	/**
	 * Returns the value of the '<em><b>Has Sorter</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Has Sorter</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Has Sorter</em>' attribute.
	 * @see #setHasSorter(boolean)
	 * @see de.dc.fx.ui.model.fxui.FxuiPackage#getFXTableView_HasSorter()
	 * @model
	 * @generated
	 */
	boolean isHasSorter();

	/**
	 * Sets the value of the '{@link de.dc.fx.ui.model.fxui.FXTableView#isHasSorter <em>Has Sorter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Has Sorter</em>' attribute.
	 * @see #isHasSorter()
	 * @generated
	 */
	void setHasSorter(boolean value);

} // FXTableView
