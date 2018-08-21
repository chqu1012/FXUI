/**
 */
package de.dc.fx.ui.model.fxui.impl;

import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXModel;
import de.dc.fx.ui.model.fxui.FXTableView;
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
 * An implementation of the model object '<em><b>FX Table View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXTableViewImpl#getFxColumns <em>Fx Columns</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXTableViewImpl#getFxEntity <em>Fx Entity</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXTableViewImpl#isHasFilter <em>Has Filter</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXTableViewImpl#isHasSorter <em>Has Sorter</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXTableViewImpl#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXTableViewImpl#getInput <em>Input</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FXTableViewImpl extends FXNamedElementImpl implements FXTableView {
	/**
	 * The cached value of the '{@link #getFxColumns() <em>Fx Columns</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxColumns()
	 * @generated
	 * @ordered
	 */
	protected EList<FXColumn> fxColumns;

	/**
	 * The cached value of the '{@link #getFxEntity() <em>Fx Entity</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxEntity()
	 * @generated
	 * @ordered
	 */
	protected EList<FXModel> fxEntity;

	/**
	 * The default value of the '{@link #isHasFilter() <em>Has Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasFilter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_FILTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasFilter() <em>Has Filter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasFilter()
	 * @generated
	 * @ordered
	 */
	protected boolean hasFilter = HAS_FILTER_EDEFAULT;

	/**
	 * The default value of the '{@link #isHasSorter() <em>Has Sorter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSorter()
	 * @generated
	 * @ordered
	 */
	protected static final boolean HAS_SORTER_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isHasSorter() <em>Has Sorter</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isHasSorter()
	 * @generated
	 * @ordered
	 */
	protected boolean hasSorter = HAS_SORTER_EDEFAULT;

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
	 * The cached value of the '{@link #getInput() <em>Input</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getInput()
	 * @generated
	 * @ordered
	 */
	protected FXModel input;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXTableViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxuiPackage.Literals.FX_TABLE_VIEW;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FXColumn> getFxColumns() {
		if (fxColumns == null) {
			fxColumns = new EObjectContainmentEList<FXColumn>(FXColumn.class, this,
					FxuiPackage.FX_TABLE_VIEW__FX_COLUMNS);
		}
		return fxColumns;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FXModel> getFxEntity() {
		if (fxEntity == null) {
			fxEntity = new EObjectContainmentEList<FXModel>(FXModel.class, this, FxuiPackage.FX_TABLE_VIEW__FX_ENTITY);
		}
		return fxEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasFilter() {
		return hasFilter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasFilter(boolean newHasFilter) {
		boolean oldHasFilter = hasFilter;
		hasFilter = newHasFilter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_TABLE_VIEW__HAS_FILTER, oldHasFilter,
					hasFilter));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isHasSorter() {
		return hasSorter;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHasSorter(boolean newHasSorter) {
		boolean oldHasSorter = hasSorter;
		hasSorter = newHasSorter;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_TABLE_VIEW__HAS_SORTER, oldHasSorter,
					hasSorter));
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_TABLE_VIEW__PACKAGE_PATH,
					oldPackagePath, packagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXModel getInput() {
		if (input != null && input.eIsProxy()) {
			InternalEObject oldInput = (InternalEObject) input;
			input = (FXModel) eResolveProxy(oldInput);
			if (input != oldInput) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, FxuiPackage.FX_TABLE_VIEW__INPUT,
							oldInput, input));
			}
		}
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXModel basicGetInput() {
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setInput(FXModel newInput) {
		FXModel oldInput = input;
		input = newInput;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_TABLE_VIEW__INPUT, oldInput, input));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FxuiPackage.FX_TABLE_VIEW__FX_COLUMNS:
			return ((InternalEList<?>) getFxColumns()).basicRemove(otherEnd, msgs);
		case FxuiPackage.FX_TABLE_VIEW__FX_ENTITY:
			return ((InternalEList<?>) getFxEntity()).basicRemove(otherEnd, msgs);
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
		case FxuiPackage.FX_TABLE_VIEW__FX_COLUMNS:
			return getFxColumns();
		case FxuiPackage.FX_TABLE_VIEW__FX_ENTITY:
			return getFxEntity();
		case FxuiPackage.FX_TABLE_VIEW__HAS_FILTER:
			return isHasFilter();
		case FxuiPackage.FX_TABLE_VIEW__HAS_SORTER:
			return isHasSorter();
		case FxuiPackage.FX_TABLE_VIEW__PACKAGE_PATH:
			return getPackagePath();
		case FxuiPackage.FX_TABLE_VIEW__INPUT:
			if (resolve)
				return getInput();
			return basicGetInput();
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
		case FxuiPackage.FX_TABLE_VIEW__FX_COLUMNS:
			getFxColumns().clear();
			getFxColumns().addAll((Collection<? extends FXColumn>) newValue);
			return;
		case FxuiPackage.FX_TABLE_VIEW__FX_ENTITY:
			getFxEntity().clear();
			getFxEntity().addAll((Collection<? extends FXModel>) newValue);
			return;
		case FxuiPackage.FX_TABLE_VIEW__HAS_FILTER:
			setHasFilter((Boolean) newValue);
			return;
		case FxuiPackage.FX_TABLE_VIEW__HAS_SORTER:
			setHasSorter((Boolean) newValue);
			return;
		case FxuiPackage.FX_TABLE_VIEW__PACKAGE_PATH:
			setPackagePath((String) newValue);
			return;
		case FxuiPackage.FX_TABLE_VIEW__INPUT:
			setInput((FXModel) newValue);
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
		case FxuiPackage.FX_TABLE_VIEW__FX_COLUMNS:
			getFxColumns().clear();
			return;
		case FxuiPackage.FX_TABLE_VIEW__FX_ENTITY:
			getFxEntity().clear();
			return;
		case FxuiPackage.FX_TABLE_VIEW__HAS_FILTER:
			setHasFilter(HAS_FILTER_EDEFAULT);
			return;
		case FxuiPackage.FX_TABLE_VIEW__HAS_SORTER:
			setHasSorter(HAS_SORTER_EDEFAULT);
			return;
		case FxuiPackage.FX_TABLE_VIEW__PACKAGE_PATH:
			setPackagePath(PACKAGE_PATH_EDEFAULT);
			return;
		case FxuiPackage.FX_TABLE_VIEW__INPUT:
			setInput((FXModel) null);
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
		case FxuiPackage.FX_TABLE_VIEW__FX_COLUMNS:
			return fxColumns != null && !fxColumns.isEmpty();
		case FxuiPackage.FX_TABLE_VIEW__FX_ENTITY:
			return fxEntity != null && !fxEntity.isEmpty();
		case FxuiPackage.FX_TABLE_VIEW__HAS_FILTER:
			return hasFilter != HAS_FILTER_EDEFAULT;
		case FxuiPackage.FX_TABLE_VIEW__HAS_SORTER:
			return hasSorter != HAS_SORTER_EDEFAULT;
		case FxuiPackage.FX_TABLE_VIEW__PACKAGE_PATH:
			return PACKAGE_PATH_EDEFAULT == null ? packagePath != null : !PACKAGE_PATH_EDEFAULT.equals(packagePath);
		case FxuiPackage.FX_TABLE_VIEW__INPUT:
			return input != null;
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
		result.append(" (hasFilter: ");
		result.append(hasFilter);
		result.append(", hasSorter: ");
		result.append(hasSorter);
		result.append(", packagePath: ");
		result.append(packagePath);
		result.append(')');
		return result.toString();
	}

} //FXTableViewImpl
