/**
 */
package de.dc.fx.ui.model.fxui.impl;

import de.dc.fx.ui.model.fxui.FXControl;
import de.dc.fx.ui.model.fxui.FXForm;
import de.dc.fx.ui.model.fxui.FxuiPackage;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Form</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXFormImpl#getNumOfGrid <em>Num Of Grid</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXFormImpl#getFxcontrols <em>Fxcontrols</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXFormImpl#getPackagePath <em>Package Path</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FXFormImpl extends FXNamedElementImpl implements FXForm {
	/**
	 * The default value of the '{@link #getNumOfGrid() <em>Num Of Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfGrid()
	 * @generated
	 * @ordered
	 */
	protected static final int NUM_OF_GRID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getNumOfGrid() <em>Num Of Grid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumOfGrid()
	 * @generated
	 * @ordered
	 */
	protected int numOfGrid = NUM_OF_GRID_EDEFAULT;

	/**
	 * The cached value of the '{@link #getFxcontrols() <em>Fxcontrols</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxcontrols()
	 * @generated
	 * @ordered
	 */
	protected EList<FXControl> fxcontrols;

	/**
	 * The default value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePath()
	 * @generated
	 * @ordered
	 */
	protected static final String PACKAGE_PATH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPackagePath() <em>Package Path</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPackagePath()
	 * @generated
	 * @ordered
	 */
	protected String packagePath = PACKAGE_PATH_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXFormImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxuiPackage.Literals.FX_FORM;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getNumOfGrid() {
		return numOfGrid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumOfGrid(int newNumOfGrid) {
		int oldNumOfGrid = numOfGrid;
		numOfGrid = newNumOfGrid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_FORM__NUM_OF_GRID, oldNumOfGrid,
					numOfGrid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FXControl> getFxcontrols() {
		if (fxcontrols == null) {
			fxcontrols = new EObjectContainmentEList<FXControl>(FXControl.class, this, FxuiPackage.FX_FORM__FXCONTROLS);
		}
		return fxcontrols;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getPackagePath() {
		return packagePath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPackagePath(String newPackagePath) {
		String oldPackagePath = packagePath;
		packagePath = newPackagePath;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_FORM__PACKAGE_PATH, oldPackagePath,
					packagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FxuiPackage.FX_FORM__FXCONTROLS:
			return ((InternalEList<?>) getFxcontrols()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FxuiPackage.FX_FORM__NUM_OF_GRID:
			return getNumOfGrid();
		case FxuiPackage.FX_FORM__FXCONTROLS:
			return getFxcontrols();
		case FxuiPackage.FX_FORM__PACKAGE_PATH:
			return getPackagePath();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FxuiPackage.FX_FORM__NUM_OF_GRID:
			setNumOfGrid((Integer) newValue);
			return;
		case FxuiPackage.FX_FORM__FXCONTROLS:
			getFxcontrols().clear();
			getFxcontrols().addAll((Collection<? extends FXControl>) newValue);
			return;
		case FxuiPackage.FX_FORM__PACKAGE_PATH:
			setPackagePath((String) newValue);
			return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
		case FxuiPackage.FX_FORM__NUM_OF_GRID:
			setNumOfGrid(NUM_OF_GRID_EDEFAULT);
			return;
		case FxuiPackage.FX_FORM__FXCONTROLS:
			getFxcontrols().clear();
			return;
		case FxuiPackage.FX_FORM__PACKAGE_PATH:
			setPackagePath(PACKAGE_PATH_EDEFAULT);
			return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
		case FxuiPackage.FX_FORM__NUM_OF_GRID:
			return numOfGrid != NUM_OF_GRID_EDEFAULT;
		case FxuiPackage.FX_FORM__FXCONTROLS:
			return fxcontrols != null && !fxcontrols.isEmpty();
		case FxuiPackage.FX_FORM__PACKAGE_PATH:
			return PACKAGE_PATH_EDEFAULT == null ? packagePath != null : !PACKAGE_PATH_EDEFAULT.equals(packagePath);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy())
			return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (numOfGrid: ");
		result.append(numOfGrid);
		result.append(", packagePath: ");
		result.append(packagePath);
		result.append(')');
		return result.toString();
	}

} //FXFormImpl
