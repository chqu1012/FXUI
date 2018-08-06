/**
 */
package de.dc.fx.ui.model.fxui.impl;

import de.dc.fx.ui.model.fxui.*;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class FxuiFactoryImpl extends EFactoryImpl implements FxuiFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FxuiFactory init() {
		try {
			FxuiFactory theFxuiFactory = (FxuiFactory) EPackage.Registry.INSTANCE.getEFactory(FxuiPackage.eNS_URI);
			if (theFxuiFactory != null) {
				return theFxuiFactory;
			}
		} catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new FxuiFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxuiFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
		case FxuiPackage.FX_TABLE_VIEW:
			return createFXTableView();
		case FxuiPackage.FX_COLUMN:
			return createFXColumn();
		case FxuiPackage.FX_NAMED_ELEMENT:
			return createFXNamedElement();
		case FxuiPackage.FX_MODEL:
			return createFXModel();
		case FxuiPackage.FX_PROPERTY:
			return createFXProperty();
		default:
			throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXTableView createFXTableView() {
		FXTableViewImpl fxTableView = new FXTableViewImpl();
		return fxTableView;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXColumn createFXColumn() {
		FXColumnImpl fxColumn = new FXColumnImpl();
		return fxColumn;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXNamedElement createFXNamedElement() {
		FXNamedElementImpl fxNamedElement = new FXNamedElementImpl();
		return fxNamedElement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXModel createFXModel() {
		FXModelImpl fxModel = new FXModelImpl();
		return fxModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FXProperty createFXProperty() {
		FXPropertyImpl fxProperty = new FXPropertyImpl();
		return fxProperty;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FxuiPackage getFxuiPackage() {
		return (FxuiPackage) getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static FxuiPackage getPackage() {
		return FxuiPackage.eINSTANCE;
	}

} //FxuiFactoryImpl
