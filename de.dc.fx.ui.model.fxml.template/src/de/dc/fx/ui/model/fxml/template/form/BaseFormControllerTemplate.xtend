package de.dc.fx.ui.model.fxml.template.form

import de.dc.fx.ui.model.fxml.template.IGenerator
import de.dc.fx.ui.model.fxui.FXForm

class BaseFormControllerTemplate implements IGenerator<FXForm>{
	
	override gen(FXForm data)'''
	package «data.packagePath».form.controller;
	
	import javafx.fxml.*;
	import javafx.scene.control.*;
	import javafx.scene.layout.*;
	
	public abstract class «data.name»BaseFormController extends GridPane{
		
		«FOR c : data.fxcontrols SEPARATOR '\n'»
		@FXML «val controlName = c.class.simpleName.replaceFirst("FX", "").replace("Impl", "")»
		protected «controlName» «c.name.toFirstLower.replace(" ", "")»«controlName»;
	    «ENDFOR»
	    
	    protected abstract void initialize();
	}
	'''
	
}