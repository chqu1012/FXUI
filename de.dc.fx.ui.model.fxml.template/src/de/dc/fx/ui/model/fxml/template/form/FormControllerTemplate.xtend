package de.dc.fx.ui.model.fxml.template.form

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXForm

class FormControllerTemplate implements IGenerator<FXForm>{
	
	override gen(FXForm data)'''
	package «data.packagePath».form;
	
	public class «data.name»Form extends «data.name»BaseForm{
	
		@Override
		protected void initialize() {
		}
	}
	'''
	
}