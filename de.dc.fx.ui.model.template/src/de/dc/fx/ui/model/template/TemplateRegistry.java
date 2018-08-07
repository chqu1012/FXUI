package de.dc.fx.ui.model.template;

import de.dc.fx.ui.model.fxui.FXColumn;
import de.dc.fx.ui.model.fxui.util.FxuiSwitch;

public class TemplateRegistry extends FxuiSwitch<String>{

	private TableCellFactoryTemplate cellFactoryTemplate = new TableCellFactoryTemplate();
	
	@Override
	public String caseFXColumn(FXColumn object) {
		return cellFactoryTemplate.gen(object);	}
}
