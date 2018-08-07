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
	 * The cached value of the '{@link #getFxEntity() <em>Fx Entity</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxEntity()
	 * @generated
	 * @ordered
	 */
	protected FXModel fxEntity;

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
	public FXModel getFxEntity() {
		return fxEntity;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFxEntity(FXModel newFxEntity, NotificationChain msgs) {
		FXModel oldFxEntity = fxEntity;
		fxEntity = newFxEntity;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FxuiPackage.FX_TABLE_VIEW__FX_ENTITY, oldFxEntity, newFxEntity);
			if (msgs == null)
				msgs = notification;
			else
				msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFxEntity(FXModel newFxEntity) {
		if (newFxEntity != fxEntity) {
			NotificationChain msgs = null;
			if (fxEntity != null)
				msgs = ((InternalEObject) fxEntity).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FxuiPackage.FX_TABLE_VIEW__FX_ENTITY, null, msgs);
			if (newFxEntity != null)
				msgs = ((InternalEObject) newFxEntity).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FxuiPackage.FX_TABLE_VIEW__FX_ENTITY, null, msgs);
			msgs = basicSetFxEntity(newFxEntity, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_TABLE_VIEW__FX_ENTITY, newFxEntity,
					newFxEntity));
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
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FxuiPackage.FX_TABLE_VIEW__FX_COLUMNS:
			return ((InternalEList<?>) getFxColumns()).basicRemove(otherEnd, msgs);
		case FxuiPackage.FX_TABLE_VIEW__FX_ENTITY:
			return basicSetFxEntity(null, msgs);
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
			setFxEntity((FXModel) newValue);
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
			setFxEntity((FXModel) null);
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
			return fxEntity != null;
		case FxuiPackage.FX_TABLE_VIEW__HAS_FILTER:
			return hasFilter != HAS_FILTER_EDEFAULT;
		case FxuiPackage.FX_TABLE_VIEW__HAS_SORTER:
			return hasSorter != HAS_SORTER_EDEFAULT;
		case FxuiPackage.FX_TABLE_VIEW__PACKAGE_PATH:
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
