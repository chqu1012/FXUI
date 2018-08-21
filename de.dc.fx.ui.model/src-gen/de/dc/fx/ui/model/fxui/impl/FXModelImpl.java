/**
 */
package de.dc.fx.ui.model.fxui.impl;

import de.dc.fx.ui.model.fxui.FXExistingModel;
import de.dc.fx.ui.model.fxui.FXModel;
import de.dc.fx.ui.model.fxui.FXProperty;
import de.dc.fx.ui.model.fxui.FXReference;
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
 * An implementation of the model object '<em><b>FX Model</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXModelImpl#getFxProperties <em>Fx Properties</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXModelImpl#getFxreference <em>Fxreference</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXModelImpl#getUseExistingModel <em>Use Existing Model</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FXModelImpl extends FXNamedElementImpl implements FXModel {
	/**
	 * The cached value of the '{@link #getFxProperties() <em>Fx Properties</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxProperties()
	 * @generated
	 * @ordered
	 */
	protected EList<FXProperty> fxProperties;

	/**
	 * The cached value of the '{@link #getFxreference() <em>Fxreference</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFxreference()
	 * @generated
	 * @ordered
	 */
	protected FXReference fxreference;

	/**
	 * The cached value of the '{@link #getUseExistingModel() <em>Use Existing Model</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUseExistingModel()
	 * @generated
	 * @ordered
	 */
	protected FXExistingModel useExistingModel;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXModelImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxuiPackage.Literals.FX_MODEL;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<FXProperty> getFxProperties() {
		if (fxProperties == null) {
			fxProperties = new EObjectContainmentEList<FXProperty>(FXProperty.class, this,
					FxuiPackage.FX_MODEL__FX_PROPERTIES);
		}
		return fxProperties;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXReference getFxreference() {
		return fxreference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetFxreference(FXReference newFxreference, NotificationChain msgs) {
		FXReference oldFxreference = fxreference;
		fxreference = newFxreference;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FxuiPackage.FX_MODEL__FXREFERENCE, oldFxreference, newFxreference);
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
	public void setFxreference(FXReference newFxreference) {
		if (newFxreference != fxreference) {
			NotificationChain msgs = null;
			if (fxreference != null)
				msgs = ((InternalEObject) fxreference).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FxuiPackage.FX_MODEL__FXREFERENCE, null, msgs);
			if (newFxreference != null)
				msgs = ((InternalEObject) newFxreference).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FxuiPackage.FX_MODEL__FXREFERENCE, null, msgs);
			msgs = basicSetFxreference(newFxreference, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_MODEL__FXREFERENCE, newFxreference,
					newFxreference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXExistingModel getUseExistingModel() {
		return useExistingModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetUseExistingModel(FXExistingModel newUseExistingModel, NotificationChain msgs) {
		FXExistingModel oldUseExistingModel = useExistingModel;
		useExistingModel = newUseExistingModel;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET,
					FxuiPackage.FX_MODEL__USE_EXISTING_MODEL, oldUseExistingModel, newUseExistingModel);
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
	public void setUseExistingModel(FXExistingModel newUseExistingModel) {
		if (newUseExistingModel != useExistingModel) {
			NotificationChain msgs = null;
			if (useExistingModel != null)
				msgs = ((InternalEObject) useExistingModel).eInverseRemove(this,
						EOPPOSITE_FEATURE_BASE - FxuiPackage.FX_MODEL__USE_EXISTING_MODEL, null, msgs);
			if (newUseExistingModel != null)
				msgs = ((InternalEObject) newUseExistingModel).eInverseAdd(this,
						EOPPOSITE_FEATURE_BASE - FxuiPackage.FX_MODEL__USE_EXISTING_MODEL, null, msgs);
			msgs = basicSetUseExistingModel(newUseExistingModel, msgs);
			if (msgs != null)
				msgs.dispatch();
		} else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_MODEL__USE_EXISTING_MODEL,
					newUseExistingModel, newUseExistingModel));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
		case FxuiPackage.FX_MODEL__FX_PROPERTIES:
			return ((InternalEList<?>) getFxProperties()).basicRemove(otherEnd, msgs);
		case FxuiPackage.FX_MODEL__FXREFERENCE:
			return basicSetFxreference(null, msgs);
		case FxuiPackage.FX_MODEL__USE_EXISTING_MODEL:
			return basicSetUseExistingModel(null, msgs);
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
		case FxuiPackage.FX_MODEL__FX_PROPERTIES:
			return getFxProperties();
		case FxuiPackage.FX_MODEL__FXREFERENCE:
			return getFxreference();
		case FxuiPackage.FX_MODEL__USE_EXISTING_MODEL:
			return getUseExistingModel();
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
		case FxuiPackage.FX_MODEL__FX_PROPERTIES:
			getFxProperties().clear();
			getFxProperties().addAll((Collection<? extends FXProperty>) newValue);
			return;
		case FxuiPackage.FX_MODEL__FXREFERENCE:
			setFxreference((FXReference) newValue);
			return;
		case FxuiPackage.FX_MODEL__USE_EXISTING_MODEL:
			setUseExistingModel((FXExistingModel) newValue);
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
		case FxuiPackage.FX_MODEL__FX_PROPERTIES:
			getFxProperties().clear();
			return;
		case FxuiPackage.FX_MODEL__FXREFERENCE:
			setFxreference((FXReference) null);
			return;
		case FxuiPackage.FX_MODEL__USE_EXISTING_MODEL:
			setUseExistingModel((FXExistingModel) null);
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
		case FxuiPackage.FX_MODEL__FX_PROPERTIES:
			return fxProperties != null && !fxProperties.isEmpty();
		case FxuiPackage.FX_MODEL__FXREFERENCE:
			return fxreference != null;
		case FxuiPackage.FX_MODEL__USE_EXISTING_MODEL:
			return useExistingModel != null;
		}
		return super.eIsSet(featureID);
	}

} //FXModelImpl
