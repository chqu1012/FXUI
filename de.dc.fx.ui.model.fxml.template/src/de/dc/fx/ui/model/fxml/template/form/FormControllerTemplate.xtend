package de.dc.fx.ui.model.fxml.template.form

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXForm

class FormControllerTemplate implements IGenerator<FXForm>{
	
	override gen(FXForm data)'''
	package «data.packagePath».form.controller;
	
	public class «data.name»FormController extends «data.name»BaseFormController{
	
		@Override
		protected void initialize() {
		}
	}
	'''
	
}