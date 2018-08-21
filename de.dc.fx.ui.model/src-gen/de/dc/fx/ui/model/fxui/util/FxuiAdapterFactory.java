/**
 */
package de.dc.fx.ui.model.fxui.util;

import de.dc.fx.ui.model.fxui.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see de.dc.fx.ui.model.fxui.FxuiPackage
 * @generated
 */
public class FxuiAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static FxuiPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxuiAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = FxuiPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject) object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FxuiSwitch<Adapter> modelSwitch = new FxuiSwitch<Adapter>() {
		@Override
		public Adapter caseFXTableView(FXTableView object) {
			return createFXTableViewAdapter();
		}

		@Override
		public Adapter caseFXColumn(FXColumn object) {
			return createFXColumnAdapter();
		}

		@Override
		public Adapter caseFXNamedElement(FXNamedElement object) {
			return createFXNamedElementAdapter();
		}

		@Override
		public Adapter caseFXModel(FXModel object) {
			return createFXModelAdapter();
		}

		@Override
		public Adapter caseFXProperty(FXProperty object) {
			return createFXPropertyAdapter();
		}

		@Override
		public Adapter caseFXForm(FXForm object) {
			return createFXFormAdapter();
		}

		@Override
		public Adapter caseFXControl(FXControl object) {
			return createFXControlAdapter();
		}

		@Override
		public Adapter caseFXTextField(FXTextField object) {
			return createFXTextFieldAdapter();
		}

		@Override
		public Adapter caseFXButton(FXButton object) {
			return createFXButtonAdapter();
		}

		@Override
		public Adapter caseFXToggleButton(FXToggleButton object) {
			return createFXToggleButtonAdapter();
		}

		@Override
		public Adapter caseFXCheckBox(FXCheckBox object) {
			return createFXCheckBoxAdapter();
		}

		@Override
		public Adapter caseFXChoiceBox(FXChoiceBox object) {
			return createFXChoiceBoxAdapter();
		}

		@Override
		public Adapter caseFXRadioButton(FXRadioButton object) {
			return createFXRadioButtonAdapter();
		}

		@Override
		public Adapter caseFXComboBox(FXComboBox object) {
			return createFXComboBoxAdapter();
		}

		@Override
		public Adapter caseFXSelectedControl(FXSelectedControl object) {
			return createFXSelectedControlAdapter();
		}

		@Override
		public Adapter caseFXReference(FXReference object) {
			return createFXReferenceAdapter();
		}

		@Override
		public Adapter defaultCase(EObject object) {
			return createEObjectAdapter();
		}
	};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject) target);
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXTableView <em>FX Table View</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXTableView
	 * @generated
	 */
	public Adapter createFXTableViewAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXColumn <em>FX Column</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXColumn
	 * @generated
	 */
	public Adapter createFXColumnAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXNamedElement <em>FX Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXNamedElement
	 * @generated
	 */
	public Adapter createFXNamedElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXModel <em>FX Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXModel
	 * @generated
	 */
	public Adapter createFXModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXProperty <em>FX Property</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXProperty
	 * @generated
	 */
	public Adapter createFXPropertyAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXForm <em>FX Form</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXForm
	 * @generated
	 */
	public Adapter createFXFormAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXControl <em>FX Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXControl
	 * @generated
	 */
	public Adapter createFXControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXTextField <em>FX Text Field</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXTextField
	 * @generated
	 */
	public Adapter createFXTextFieldAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXButton <em>FX Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXButton
	 * @generated
	 */
	public Adapter createFXButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXToggleButton <em>FX Toggle Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXToggleButton
	 * @generated
	 */
	public Adapter createFXToggleButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXCheckBox <em>FX Check Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXCheckBox
	 * @generated
	 */
	public Adapter createFXCheckBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXChoiceBox <em>FX Choice Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXChoiceBox
	 * @generated
	 */
	public Adapter createFXChoiceBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXRadioButton <em>FX Radio Button</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXRadioButton
	 * @generated
	 */
	public Adapter createFXRadioButtonAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXComboBox <em>FX Combo Box</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXComboBox
	 * @generated
	 */
	public Adapter createFXComboBoxAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXSelectedControl <em>FX Selected Control</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXSelectedControl
	 * @generated
	 */
	public Adapter createFXSelectedControlAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link de.dc.fx.ui.model.fxui.FXReference <em>FX Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see de.dc.fx.ui.model.fxui.FXReference
	 * @generated
	 */
	public Adapter createFXReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //FxuiAdapterFactory
