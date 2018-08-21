/**
 */
package de.dc.fx.ui.model.fxui.impl;

import de.dc.fx.ui.model.fxui.FXTreeRoot;
import de.dc.fx.ui.model.fxui.FXTreeView;
import de.dc.fx.ui.model.fxui.FxuiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Tree View</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXTreeViewImpl#getPackagePath <em>Package Path</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXTreeViewImpl#getRoot <em>Root</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FXTreeViewImpl extends MinimalEObjectImpl.Container implements FXTreeView {
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
	 * The cached value of the '{@link #getRoot() <em>Root</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRoot()
	 * @generated
	 * @ordered
	 */
	protected FXTreeRoot root;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXTreeViewImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxuiPackage.Literals.FX_TREE_VIEW;
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
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_TREE_VIEW__PACKAGE_PATH,
					oldPackagePath, packagePath));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXTreeRoot getRoot() {
		return root;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetRoot(FXTreeRoot newRoot, NotificationChain msgs) {
		FXTreeRoot oldRoot = root;
		root = newRoot;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FxuiPackage.FX_TREE_VIEW__ROOT, oldRoot, newRoot);
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
	public void setRoot(FXTreeRoot newRoot) {
		if (newRoot != root) {
			NotificationChain msgs = null;
			if (root != null)
				msgs = ((InternalEObject) root).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FxuiPackage.FX_TREE_VIEW__ROOT, null, msgs);
			if (newRoot != null)
				msgs = ((InternalEObject) newRoot).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FxuiPackage.FX_TREE_VIEW__ROOT, null, msgs);
			msgs = basicSetRoot(newRoot, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_TREE_VIEW__ROOT, newRoot, newRoot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FxuiPackage.FX_TREE_VIEW__ROOT:
			return basicSetRoot(null, msgs);
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
		case FxuiPackage.FX_TREE_VIEW__PACKAGE_PATH:
			return getPackagePath();
		case FxuiPackage.FX_TREE_VIEW__ROOT:
			return getRoot();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
		case FxuiPackage.FX_TREE_VIEW__PACKAGE_PATH:
			setPackagePath((String) newValue);
			return;
		case FxuiPackage.FX_TREE_VIEW__ROOT:
			setRoot((FXTreeRoot) newValue);
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
		case FxuiPackage.FX_TREE_VIEW__PACKAGE_PATH:
			setPackagePath(PACKAGE_PATH_EDEFAULT);
			return;
		case FxuiPackage.FX_TREE_VIEW__ROOT:
			setRoot((FXTreeRoot) null);
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
		case FxuiPackage.FX_TREE_VIEW__PACKAGE_PATH:
			return PACKAGE_PATH_EDEFAULT == null ? packagePath != null : !PACKAGE_PATH_EDEFAULT.equals(packagePath);
		case FxuiPackage.FX_TREE_VIEW__ROOT:
			return root != null;
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
		result.append(" (packagePath: ");
		result.append(packagePath);
		result.append(')');
		return result.toString();
	}

} //FXTreeViewImpl
