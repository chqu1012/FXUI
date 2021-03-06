/**
 */
package de.dc.fx.ui.model.fxui.provider;

import de.dc.fx.ui.model.fxui.util.FxuiAdapterFactory;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.edit.provider.ChangeNotifier;
import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IChangeNotifier;
import org.eclipse.emf.edit.provider.IDisposable;
import org.eclipse.emf.edit.provider.IEditingDomainItemProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertySource;
import org.eclipse.emf.edit.provider.INotifyChangedListener;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

/**
 * This is the factory that is used to provide the interfaces needed to support Viewers.
 * The adapters generated by this factory convert EMF adapter notifications into calls to {@link #fireNotifyChanged fireNotifyChanged}.
 * The adapters also support Eclipse property sheets.
 * Note that most of the adapters are shared among multiple instances.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class FxuiItemProviderAdapterFactory extends FxuiAdapterFactory
		implements ComposeableAdapterFactory, IChangeNotifier, IDisposable {
	/**
	 * This keeps track of the root adapter factory that delegates to this adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ComposedAdapterFactory parentAdapterFactory;

	/**
	 * This is used to implement {@link org.eclipse.emf.edit.provider.IChangeNotifier}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IChangeNotifier changeNotifier = new ChangeNotifier();

	/**
	 * This keeps track of all the supported types checked by {@link #isFactoryForType isFactoryForType}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();

	/**
	 * This constructs an instance.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxuiItemProviderAdapterFactory() {
		supportedTypes.add(IEditingDomainItemProvider.class);
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
		supportedTypes.add(IItemPropertySource.class);
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXTableView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXTableViewItemProvider fxTableViewItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXTableView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXTableViewAdapter() {
		if (fxTableViewItemProvider == null) {
			fxTableViewItemProvider = new FXTableViewItemProvider(this);
		}

		return fxTableViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXColumn} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXColumnItemProvider fxColumnItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXColumn}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXColumnAdapter() {
		if (fxColumnItemProvider == null) {
			fxColumnItemProvider = new FXColumnItemProvider(this);
		}

		return fxColumnItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXNamedElement} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXNamedElementItemProvider fxNamedElementItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXNamedElement}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXNamedElementAdapter() {
		if (fxNamedElementItemProvider == null) {
			fxNamedElementItemProvider = new FXNamedElementItemProvider(this);
		}

		return fxNamedElementItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXModelItemProvider fxModelItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXModelAdapter() {
		if (fxModelItemProvider == null) {
			fxModelItemProvider = new FXModelItemProvider(this);
		}

		return fxModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXProperty} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXPropertyItemProvider fxPropertyItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXProperty}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXPropertyAdapter() {
		if (fxPropertyItemProvider == null) {
			fxPropertyItemProvider = new FXPropertyItemProvider(this);
		}

		return fxPropertyItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXForm} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXFormItemProvider fxFormItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXForm}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXFormAdapter() {
		if (fxFormItemProvider == null) {
			fxFormItemProvider = new FXFormItemProvider(this);
		}

		return fxFormItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXTextField} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXTextFieldItemProvider fxTextFieldItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXTextField}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXTextFieldAdapter() {
		if (fxTextFieldItemProvider == null) {
			fxTextFieldItemProvider = new FXTextFieldItemProvider(this);
		}

		return fxTextFieldItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXButton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXButtonItemProvider fxButtonItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXButtonAdapter() {
		if (fxButtonItemProvider == null) {
			fxButtonItemProvider = new FXButtonItemProvider(this);
		}

		return fxButtonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXToggleButton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXToggleButtonItemProvider fxToggleButtonItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXToggleButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXToggleButtonAdapter() {
		if (fxToggleButtonItemProvider == null) {
			fxToggleButtonItemProvider = new FXToggleButtonItemProvider(this);
		}

		return fxToggleButtonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXCheckBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXCheckBoxItemProvider fxCheckBoxItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXCheckBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXCheckBoxAdapter() {
		if (fxCheckBoxItemProvider == null) {
			fxCheckBoxItemProvider = new FXCheckBoxItemProvider(this);
		}

		return fxCheckBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXChoiceBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXChoiceBoxItemProvider fxChoiceBoxItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXChoiceBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXChoiceBoxAdapter() {
		if (fxChoiceBoxItemProvider == null) {
			fxChoiceBoxItemProvider = new FXChoiceBoxItemProvider(this);
		}

		return fxChoiceBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXRadioButton} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXRadioButtonItemProvider fxRadioButtonItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXRadioButton}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXRadioButtonAdapter() {
		if (fxRadioButtonItemProvider == null) {
			fxRadioButtonItemProvider = new FXRadioButtonItemProvider(this);
		}

		return fxRadioButtonItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXComboBox} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXComboBoxItemProvider fxComboBoxItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXComboBox}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXComboBoxAdapter() {
		if (fxComboBoxItemProvider == null) {
			fxComboBoxItemProvider = new FXComboBoxItemProvider(this);
		}

		return fxComboBoxItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXReference} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXReferenceItemProvider fxReferenceItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXReference}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXReferenceAdapter() {
		if (fxReferenceItemProvider == null) {
			fxReferenceItemProvider = new FXReferenceItemProvider(this);
		}

		return fxReferenceItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXExistingModel} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXExistingModelItemProvider fxExistingModelItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXExistingModel}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXExistingModelAdapter() {
		if (fxExistingModelItemProvider == null) {
			fxExistingModelItemProvider = new FXExistingModelItemProvider(this);
		}

		return fxExistingModelItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXTreeView} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXTreeViewItemProvider fxTreeViewItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXTreeView}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXTreeViewAdapter() {
		if (fxTreeViewItemProvider == null) {
			fxTreeViewItemProvider = new FXTreeViewItemProvider(this);
		}

		return fxTreeViewItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXTreeRoot} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXTreeRootItemProvider fxTreeRootItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXTreeRoot}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXTreeRootAdapter() {
		if (fxTreeRootItemProvider == null) {
			fxTreeRootItemProvider = new FXTreeRootItemProvider(this);
		}

		return fxTreeRootItemProvider;
	}

	/**
	 * This keeps track of the one adapter used for all {@link de.dc.fx.ui.model.fxui.FXNode} instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FXNodeItemProvider fxNodeItemProvider;

	/**
	 * This creates an adapter for a {@link de.dc.fx.ui.model.fxui.FXNode}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter createFXNodeAdapter() {
		if (fxNodeItemProvider == null) {
			fxNodeItemProvider = new FXNodeItemProvider(this);
		}

		return fxNodeItemProvider;
	}

	/**
	 * This returns the root adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ComposeableAdapterFactory getRootAdapterFactory() {
		return parentAdapterFactory == null ? this : parentAdapterFactory.getRootAdapterFactory();
	}

	/**
	 * This sets the composed adapter factory that contains this factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParentAdapterFactory(ComposedAdapterFactory parentAdapterFactory) {
		this.parentAdapterFactory = parentAdapterFactory;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type) || super.isFactoryForType(type);
	}

	/**
	 * This implementation substitutes the factory itself as the key for the adapter.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Adapter adapt(Notifier notifier, Object type) {
		return super.adapt(notifier, this);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object adapt(Object object, Object type) {
		if (isFactoryForType(type)) {
			Object adapter = super.adapt(object, type);
			if (!(type instanceof Class<?>) || (((Class<?>) type).isInstance(adapter))) {
				return adapter;
			}
		}

		return null;
	}

	/**
	 * This adds a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void addListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.addListener(notifyChangedListener);
	}

	/**
	 * This removes a listener.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void removeListener(INotifyChangedListener notifyChangedListener) {
		changeNotifier.removeListener(notifyChangedListener);
	}

	/**
	 * This delegates to {@link #changeNotifier} and to {@link #parentAdapterFactory}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void fireNotifyChanged(Notification notification) {
		changeNotifier.fireNotifyChanged(notification);

		if (parentAdapterFactory != null) {
			parentAdapterFactory.fireNotifyChanged(notification);
		}
	}

	/**
	 * This disposes all of the item providers created by this factory. 
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void dispose() {
		if (fxTableViewItemProvider != null)
			fxTableViewItemProvider.dispose();
		if (fxColumnItemProvider != null)
			fxColumnItemProvider.dispose();
		if (fxNamedElementItemProvider != null)
			fxNamedElementItemProvider.dispose();
		if (fxModelItemProvider != null)
			fxModelItemProvider.dispose();
		if (fxPropertyItemProvider != null)
			fxPropertyItemProvider.dispose();
		if (fxFormItemProvider != null)
			fxFormItemProvider.dispose();
		if (fxTextFieldItemProvider != null)
			fxTextFieldItemProvider.dispose();
		if (fxButtonItemProvider != null)
			fxButtonItemProvider.dispose();
		if (fxToggleButtonItemProvider != null)
			fxToggleButtonItemProvider.dispose();
		if (fxCheckBoxItemProvider != null)
			fxCheckBoxItemProvider.dispose();
		if (fxChoiceBoxItemProvider != null)
			fxChoiceBoxItemProvider.dispose();
		if (fxRadioButtonItemProvider != null)
			fxRadioButtonItemProvider.dispose();
		if (fxComboBoxItemProvider != null)
			fxComboBoxItemProvider.dispose();
		if (fxReferenceItemProvider != null)
			fxReferenceItemProvider.dispose();
		if (fxExistingModelItemProvider != null)
			fxExistingModelItemProvider.dispose();
		if (fxTreeViewItemProvider != null)
			fxTreeViewItemProvider.dispose();
		if (fxTreeRootItemProvider != null)
			fxTreeRootItemProvider.dispose();
		if (fxNodeItemProvider != null)
			fxNodeItemProvider.dispose();
	}

}
