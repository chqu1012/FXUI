/*
 * generated by Xtext 2.14.0
 */
package de.dc.fx.ui.model.parser.antlr;

import java.io.InputStream;
import org.eclipse.xtext.parser.antlr.IAntlrTokenFileProvider;

public class FXDslAntlrTokenFileProvider implements IAntlrTokenFileProvider {

	@Override
	public InputStream getAntlrTokenFile() {
		ClassLoader classLoader = getClass().getClassLoader();
		return classLoader.getResourceAsStream("de/dc/fx/ui/model/parser/antlr/internal/InternalFXDsl.tokens");
	}
}
