/**
 */
package de.dc.fx.ui.model.fxui.impl;

import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.FXProperty;
import de.dc.fx.ui.model.fxui.FxuiPackage;
import de.dc.fx.ui.model.fxui.Pos;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FX Column</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXColumnImpl#getAssociatedFXProperty <em>Associated FX Property</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXColumnImpl#isEditable <em>Editable</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXColumnImpl#isUseCustomCellFactory <em>Use Custom Cell Factory</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXColumnImpl#getWidth <em>Width</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXColumnImpl#getAlignment <em>Alignment</em>}</li>
 *   <li>{@link de.dc.fx.ui.model.fxui.impl.FXColumnImpl#isFilterCriteria <em>Filter Criteria</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FXColumnImpl extends FXNamedElementImpl implements FXColumn {
	/**
	 * The cached value of the '{@link #getAssociatedFXProperty() <em>Associated FX Property</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAssociatedFXProperty()
	 * @generated
	 * @ordered
	 */
	protected FXProperty associatedFXProperty;

	/**
	 * The default value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected static final boolean EDITABLE_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isEditable() <em>Editable</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isEditable()
	 * @generated
	 * @ordered
	 */
	protected boolean editable = EDITABLE_EDEFAULT;

	/**
	 * The default value of the '{@link #isUseCustomCellFactory() <em>Use Custom Cell Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCustomCellFactory()
	 * @generated
	 * @ordered
	 */
	protected static final boolean USE_CUSTOM_CELL_FACTORY_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isUseCustomCellFactory() <em>Use Custom Cell Factory</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isUseCustomCellFactory()
	 * @generated
	 * @ordered
	 */
	protected boolean useCustomCellFactory = USE_CUSTOM_CELL_FACTORY_EDEFAULT;

	/**
	 * The default value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected static final double WIDTH_EDEFAULT = 100.0;

	/**
	 * The cached value of the '{@link #getWidth() <em>Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWidth()
	 * @generated
	 * @ordered
	 */
	protected double width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected static final Pos ALIGNMENT_EDEFAULT = Pos.CENTER;

	/**
	 * The cached value of the '{@link #getAlignment() <em>Alignment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAlignment()
	 * @generated
	 * @ordered
	 */
	protected Pos alignment = ALIGNMENT_EDEFAULT;

	/**
	 * The default value of the '{@link #isFilterCriteria() <em>Filter Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterCriteria()
	 * @generated
	 * @ordered
	 */
	protected static final boolean FILTER_CRITERIA_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isFilterCriteria() <em>Filter Criteria</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isFilterCriteria()
	 * @generated
	 * @ordered
	 */
	protected boolean filterCriteria = FILTER_CRITERIA_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXColumnImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return FxuiPackage.Literals.FX_COLUMN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXProperty getAssociatedFXProperty() {
		if (associatedFXProperty != null && associatedFXProperty.eIsProxy()) {
			InternalEObject oldAssociatedFXProperty = (InternalEObject) associatedFXProperty;
			associatedFXProperty = (FXProperty) eResolveProxy(oldAssociatedFXProperty);
			if (associatedFXProperty != oldAssociatedFXProperty) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE,
							FxuiPackage.FX_COLUMN__ASSOCIATED_FX_PROPERTY, oldAssociatedFXProperty,
							associatedFXProperty));
			}
		}
		return associatedFXProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXProperty basicGetAssociatedFXProperty() {
		return associatedFXProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAssociatedFXProperty(FXProperty newAssociatedFXProperty) {
		FXProperty oldAssociatedFXProperty = associatedFXProperty;
		associatedFXProperty = newAssociatedFXProperty;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_COLUMN__ASSOCIATED_FX_PROPERTY,
					oldAssociatedFXProperty, associatedFXProperty));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isEditable() {
		return editable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEditable(boolean newEditable) {
		boolean oldEditable = editable;
		editable = newEditable;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_COLUMN__EDITABLE, oldEditable,
					editable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isUseCustomCellFactory() {
		return useCustomCellFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUseCustomCellFactory(boolean newUseCustomCellFactory) {
		boolean oldUseCustomCellFactory = useCustomCellFactory;
		useCustomCellFactory = newUseCustomCellFactory;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_COLUMN__USE_CUSTOM_CELL_FACTORY,
					oldUseCustomCellFactory, useCustomCellFactory));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public double getWidth() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWidth(double newWidth) {
		double oldWidth = width;
		width = newWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_COLUMN__WIDTH, oldWidth, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Pos getAlignment() {
		return alignment;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAlignment(Pos newAlignment) {
		Pos oldAlignment = alignment;
		alignment = newAlignment == null ? ALIGNMENT_EDEFAULT : newAlignment;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_COLUMN__ALIGNMENT, oldAlignment,
					alignment));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isFilterCriteria() {
		return filterCriteria;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFilterCriteria(boolean newFilterCriteria) {
		boolean oldFilterCriteria = filterCriteria;
		filterCriteria = newFilterCriteria;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, FxuiPackage.FX_COLUMN__FILTER_CRITERIA,
					oldFilterCriteria, filterCriteria));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
		case FxuiPackage.FX_COLUMN__ASSOCIATED_FX_PROPERTY:
			if (resolve)
				return getAssociatedFXProperty();
			return basicGetAssociatedFXProperty();
		case FxuiPackage.FX_COLUMN__EDITABLE:
			return isEditable();
		case FxuiPackage.FX_COLUMN__USE_CUSTOM_CELL_FACTORY:
			return isUseCustomCellFactory();
		case FxuiPackage.FX_COLUMN__WIDTH:
			return getWidth();
		case FxuiPackage.FX_COLUMN__ALIGNMENT:
			return getAlignment();
		case FxuiPackage.FX_COLUMN__FILTER_CRITERIA:
			return isFilterCriteria();
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
		case FxuiPackage.FX_COLUMN__ASSOCIATED_FX_PROPERTY:
			setAssociatedFXProperty((FXProperty) newValue);
			return;
		case FxuiPackage.FX_COLUMN__EDITABLE:
			setEditable((Boolean) newValue);
			return;
		case FxuiPackage.FX_COLUMN__USE_CUSTOM_CELL_FACTORY:
			setUseCustomCellFactory((Boolean) newValue);
			return;
		case FxuiPackage.FX_COLUMN__WIDTH:
			setWidth((Double) newValue);
			return;
		case FxuiPackage.FX_COLUMN__ALIGNMENT:
			setAlignment((Pos) newValue);
			return;
		case FxuiPackage.FX_COLUMN__FILTER_CRITERIA:
			setFilterCriteria((Boolean) newValue);
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
		case FxuiPackage.FX_COLUMN__ASSOCIATED_FX_PROPERTY:
			setAssociatedFXProperty((FXProperty) null);
			return;
		case FxuiPackage.FX_COLUMN__EDITABLE:
			setEditable(EDITABLE_EDEFAULT);
			return;
		case FxuiPackage.FX_COLUMN__USE_CUSTOM_CELL_FACTORY:
			setUseCustomCellFactory(USE_CUSTOM_CELL_FACTORY_EDEFAULT);
			return;
		case FxuiPackage.FX_COLUMN__WIDTH:
			setWidth(WIDTH_EDEFAULT);
			return;
		case FxuiPackage.FX_COLUMN__ALIGNMENT:
			setAlignment(ALIGNMENT_EDEFAULT);
			return;
		case FxuiPackage.FX_COLUMN__FILTER_CRITERIA:
			setFilterCriteria(FILTER_CRITERIA_EDEFAULT);
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
		case FxuiPackage.FX_COLUMN__ASSOCIATED_FX_PROPERTY:
			return associatedFXProperty != null;
		case FxuiPackage.FX_COLUMN__EDITABLE:
			return editable != EDITABLE_EDEFAULT;
		case FxuiPackage.FX_COLUMN__USE_CUSTOM_CELL_FACTORY:
			return useCustomCellFactory != USE_CUSTOM_CELL_FACTORY_EDEFAULT;
		case FxuiPackage.FX_COLUMN__WIDTH:
			return width != WIDTH_EDEFAULT;
		case FxuiPackage.FX_COLUMN__ALIGNMENT:
			return alignment != ALIGNMENT_EDEFAULT;
		case FxuiPackage.FX_COLUMN__FILTER_CRITERIA:
			return filterCriteria != FILTER_CRITERIA_EDEFAULT;
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
		result.append(" (editable: ");
		result.append(editable);
		result.append(", useCustomCellFactory: ");
		result.append(useCustomCellFactory);
		result.append(", width: ");
		result.append(width);
		result.append(", alignment: ");
		result.append(alignment);
		result.append(", filterCriteria: ");
		result.append(filterCriteria);
		result.append(')');
		return result.toString();
	}

} //FXColumnImpl
