/**
 */
package de.dc.fx.ui.model.fxui.impl;

import de.dc.fx.ui.model.fxui.FXExistingModel;
import de.dc.fx.ui.model.fxui.FxuiPackage;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Existing Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXExistingModelImpl#getImportUri <em>Import Uri</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FXExistingModelImpl extends MinimalEObjectImpl.Container implements FXExistingModel {
	/**
	 * The default value of the '{@link #getImportUri() <em>Import Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportUri()
	 * @generated
	 * @ordered
	 */
	protected static final String IMPORT_URI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getImportUri() <em>Import Uri</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getImportUri()
	 * @generated
	 * @ordered
	 */
	protected String importUri = IMPORT_URI_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXExistingModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxuiPackage.Literals.FX_EXISTING_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getImportUri() {
		return importUri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setImportUri(String newImportUri) {
		String oldImportUri = importUri;
		importUri = newImportUri;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_EXISTING_MODEL__IMPORT_URI,
					oldImportUri, importUri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FxuiPackage.FX_EXISTING_MODEL__IMPORT_URI:
			return getImportUri();
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
		case FxuiPackage.FX_EXISTING_MODEL__IMPORT_URI:
			setImportUri((String) newValue);
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
		case FxuiPackage.FX_EXISTING_MODEL__IMPORT_URI:
			setImportUri(IMPORT_URI_EDEFAULT);
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
		case FxuiPackage.FX_EXISTING_MODEL__IMPORT_URI:
			return IMPORT_URI_EDEFAULT == null ? importUri != null : !IMPORT_URI_EDEFAULT.equals(importUri);
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
		result.append(" (importUri: ");
		result.append(importUri);
		result.append(')');
		return result.toString();
	}

} //FXExistingModelImpl
