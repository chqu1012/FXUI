/*
 * generated by Xtext 2.14.0
 */
package de.dc.fx.ui.model.ui.tests;

import com.google.inject.Injector;
import de.dc.fx.ui.model.fxdsl.ui.internal.FxdslActivator;
import org.eclipse.xtext.testing.IInjectorProvider;

public class FXDslUiInjectorProvider implements IInjectorProvider {

	@Override
	public Injector getInjector() {
		return FxdslActivator.getInstance().getInjector("de.dc.fx.ui.model.FXDsl");
	}

}
