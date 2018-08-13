/**
 */
package de.dc.fx.ui.model.fxui.provider;

import de.dc.fx.ui.model.fxui.FXForm;
import de.dc.fx.ui.model.fxui.FxuiFactory;
import de.dc.fx.ui.model.fxui.FxuiPackage;

import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

/**
 * This is the item provider adapter for a {@link de.dc.fx.ui.model.fxui.FXForm} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FXFormItemProvider extends FXNamedElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXFormItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addNumOfGridPropertyDescriptor(object);
			addFxcontrolsPropertyDescriptor(object);
			addPackagePathPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Num Of Grid feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addNumOfGridPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXForm_numOfGrid_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXForm_numOfGrid_feature",
								"_UI_FXForm_type"),
						FxuiPackage.Literals.FX_FORM__NUM_OF_GRID, true, false, false,
						ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE, null, null));
	}

	/**
	 * This adds a property descriptor for the Fxcontrols feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addFxcontrolsPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXForm_fxcontrols_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXForm_fxcontrols_feature",
								"_UI_FXForm_type"),
						FxuiPackage.Literals.FX_FORM__FXCONTROLS, true, false, true, null, null, null));
	}

	/**
	 * This adds a property descriptor for the Package Path feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addPackagePathPropertyDescriptor(Object object) {
		itemPropertyDescriptors
				.add(createItemPropertyDescriptor(((ComposeableAdapterFactory) adapterFactory).getRootAdapterFactory(),
						getResourceLocator(), getString("_UI_FXForm_packagePath_feature"),
						getString("_UI_PropertyDescriptor_description", "_UI_FXForm_packagePath_feature",
								"_UI_FXForm_type"),
						FxuiPackage.Literals.FX_FORM__PACKAGE_PATH, true, false, false,
						ItemPropertyDescriptor.GENERIC_VALUE_IMAGE, null, null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(FxuiPackage.Literals.FX_FORM__FXCONTROLS);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns FXForm.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/FXForm"));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected boolean shouldComposeCreationImage() {
		return true;
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getText(Object object) {
		String label = ((FXForm) object).getName();
		return label == null || label.length() == 0 ? getString("_UI_FXForm_type")
				: getString("_UI_FXForm_type") + " " + label;
	}

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(FXForm.class)) {
		case FxuiPackage.FX_FORM__NUM_OF_GRID:
		case FxuiPackage.FX_FORM__PACKAGE_PATH:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
			return;
		case FxuiPackage.FX_FORM__FXCONTROLS:
			fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
			return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add(createChildParameter(FxuiPackage.Literals.FX_FORM__FXCONTROLS,
				FxuiFactory.eINSTANCE.createFXTextField()));

		newChildDescriptors.add(
				createChildParameter(FxuiPackage.Literals.FX_FORM__FXCONTROLS, FxuiFactory.eINSTANCE.createFXButton()));

		newChildDescriptors.add(createChildParameter(FxuiPackage.Literals.FX_FORM__FXCONTROLS,
				FxuiFactory.eINSTANCE.createFXToggleButton()));

		newChildDescriptors.add(createChildParameter(FxuiPackage.Literals.FX_FORM__FXCONTROLS,
				FxuiFactory.eINSTANCE.createFXCheckbox()));

		newChildDescriptors.add(createChildParameter(FxuiPackage.Literals.FX_FORM__FXCONTROLS,
				FxuiFactory.eINSTANCE.createFXChoiceBox()));

		newChildDescriptors.add(createChildParameter(FxuiPackage.Literals.FX_FORM__FXCONTROLS,
				FxuiFactory.eINSTANCE.createFXRadioButton()));

		newChildDescriptors.add(createChildParameter(FxuiPackage.Literals.FX_FORM__FXCONTROLS,
				FxuiFactory.eINSTANCE.createFXComboBox()));
	}

}
